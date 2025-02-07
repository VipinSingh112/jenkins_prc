package com.nbp.ncbj.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.ncbj.application.form.service.model.NcbjSectionDetailAdd;
import com.nbp.ncbj.application.form.service.service.NcbjSectionDetailAddLocalServiceUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;


@Component(immediate = true, property = {
		"javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
		"mvc.command.name=/hazard/analysis/detail/additional/info" 
		},service = MVCResourceCommand.class)

public class NcbjAddHazardAnalysisDetailResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(NcbjAddHazardAnalysisDetailResourceCommand.class.getName());
	
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("calling HAZARD ANALYSIS Resource Command");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long ncbjApplicationId = ParamUtil.getLong(resourceRequest, "ncbjApplicationId");
		long hazardAnalysisDetailId = ParamUtil.getLong(resourceRequest, "hazardAnalysisDetailId");
	    String hazardAnalysis = ParamUtil.getString(resourceRequest, "hazardAnalysis");

		String counter = ParamUtil.getString(resourceRequest, "counter");
		String deleteKey = ParamUtil.getString(resourceRequest, "deleteKey");
		if(deleteKey.contains("deleteApplicant")) {
			try {
				NcbjSectionDetailAddLocalServiceUtil.deleteNcbjSectionDetailAdd(hazardAnalysisDetailId);
			} catch (PortalException e) {
			}
		}else {
		NcbjSectionDetailAdd analysisDetail = null;
		
			try {
				analysisDetail = NcbjSectionDetailAddLocalServiceUtil.getNcbjSectionDetailAdd(hazardAnalysisDetailId);
			} catch (PortalException e) {}
		if(analysisDetail==null) {
			analysisDetail = NcbjSectionDetailAddLocalServiceUtil.createNcbjSectionDetailAdd(
					CounterLocalServiceUtil.increment());
			analysisDetail.setCounter(counter);
		}
        analysisDetail.setAddHazard(hazardAnalysis);
		analysisDetail.setNcbjApplicationId(ncbjApplicationId);
		NcbjSectionDetailAddLocalServiceUtil.updateNcbjSectionDetailAdd(analysisDetail);
		jsonOBJ.put("hazardAnalysisDetailId", analysisDetail.getNcbjSectionDetailAddId());
		jsonOBJ.put("counter", counter);
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			_log.error("An Error Has Occured", e);
		 }
		}
		return false;
	}

}
