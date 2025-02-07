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
import com.nbp.ncbj.application.form.service.model.NcbjNumberEffectiveAdd;
import com.nbp.ncbj.application.form.service.service.NcbjNumberEffectiveAddLocalServiceUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;

import java.io.IOException;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
			"mvc.command.name=add/numOf/effective/personal/info"
		},
		service = MVCResourceCommand.class
	)

public class NcbjAddEffectedPersonalInfoResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil .getLog(NcbjAddEffectedPersonalInfoResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String noOfFullTimeEmployees=ParamUtil.getString(resourceRequest, "noOfFullTimeEmployees");
		String noOfPartTimeEmployees=ParamUtil.getString(resourceRequest, "noOfPartTimeEmployees");
		String department=ParamUtil.getString(resourceRequest, "department");
		String noOfContractors=ParamUtil.getString(resourceRequest, "noOfContractors");
		String noOfContractedWorkers=ParamUtil.getString(resourceRequest, "noOfContractedWorkers");
		String count=ParamUtil.getString(resourceRequest, "count");
		long ncbjApplicationId=ParamUtil.getLong(resourceRequest, "ncbjApplicationId");
		long effectiveApplicantDetailVal=ParamUtil.getLong(resourceRequest, "effectiveApplicantDetailVal");
		
		NcbjNumberEffectiveAdd numberEffectiveAdd=null;
		if(Validator.isNotNull(effectiveApplicantDetailVal)) {
		try {
			numberEffectiveAdd= NcbjNumberEffectiveAddLocalServiceUtil.getNcbjNumberEffectiveAdd(effectiveApplicantDetailVal);
		} catch (PortalException e) {}
		}else {
			numberEffectiveAdd= NcbjNumberEffectiveAddLocalServiceUtil.createNcbjNumberEffectiveAdd(CounterLocalServiceUtil.increment());
			numberEffectiveAdd.setCounter(count);
		}
		numberEffectiveAdd.setNumberOfFullTimeEmployees(noOfFullTimeEmployees);
		numberEffectiveAdd.setNumberOfPartTimeEmployees(noOfPartTimeEmployees);
		numberEffectiveAdd.setNumberOfcontractors(noOfContractors);
		numberEffectiveAdd.setNumberOfContractedWorkers(noOfContractedWorkers);
		
		numberEffectiveAdd.setNcbjApplicationId(ncbjApplicationId);
		NcbjNumberEffectiveAddLocalServiceUtil.updateNcbjNumberEffectiveAdd(numberEffectiveAdd);
		jsonOBJ.put("effectiveApplicantDetailVal", numberEffectiveAdd.getNcbjNumberEffectiveAddId());
		jsonOBJ.put("count", count);
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			_log.error("An Error Occured", e);
		}
		// TODO Auto-generated method stub
		return false;
	}

}


