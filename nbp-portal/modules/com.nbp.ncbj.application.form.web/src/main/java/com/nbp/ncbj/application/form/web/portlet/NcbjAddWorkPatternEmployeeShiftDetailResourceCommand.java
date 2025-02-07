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
		"mvc.command.name=/work/pattern/emp/shift/info" 
		},service = MVCResourceCommand.class)

public class NcbjAddWorkPatternEmployeeShiftDetailResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(NcbjAddWorkPatternEmployeeShiftDetailResourceCommand.class.getName());
	
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("calling WORK PATTERN EMPLOYEE SHIFT Resource Command");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long ncbjApplicationId = ParamUtil.getLong(resourceRequest, "ncbjApplicationId");
		long workPatternDetailId = ParamUtil.getLong(resourceRequest, "workPatternDetailId");
	    String employeesShift = ParamUtil.getString(resourceRequest, "employeesShift");

		String counter = ParamUtil.getString(resourceRequest, "counter");
		NcbjSectionDetailAdd workPattern = null;
			try {
				workPattern = NcbjSectionDetailAddLocalServiceUtil.getNcbjSectionDetailAdd(workPatternDetailId);
			} catch (PortalException e) {}
		if(workPattern==null) {
			workPattern = NcbjSectionDetailAddLocalServiceUtil.createNcbjSectionDetailAdd(
					CounterLocalServiceUtil.increment());
			workPattern.setCounter(counter);
		}
        workPattern.setAddDetails(employeesShift);
		workPattern.setNcbjApplicationId(ncbjApplicationId);
		NcbjSectionDetailAddLocalServiceUtil.updateNcbjSectionDetailAdd(workPattern);
		jsonOBJ.put("workPatternDetailId", workPattern.getNcbjSectionDetailAddId());
		jsonOBJ.put("counter", counter);
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			_log.error("An Error Has Occured", e);
		 }
		
		return false;
	}

}
