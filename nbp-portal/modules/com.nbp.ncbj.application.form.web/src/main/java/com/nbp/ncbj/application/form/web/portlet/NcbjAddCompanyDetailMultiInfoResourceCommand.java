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
import com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailGen;
import com.nbp.ncbj.application.form.service.service.NcbjCompanyDetailGenLocalServiceUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;


@Component(immediate = true, property = {
		"javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
		"mvc.command.name=/company/detail/multi/info" 
		},service = MVCResourceCommand.class)

public class NcbjAddCompanyDetailMultiInfoResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(NcbjAddCompanyDetailMultiInfoResourceCommand.class.getName());
	
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("calling multi info company detail Resource Command");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long ncbjApplicationId = ParamUtil.getLong(resourceRequest, "ncbjApplicationId");
		long companyDetailValId = ParamUtil.getLong(resourceRequest, "companyDetailValId");
		String companyName = ParamUtil.getString(resourceRequest, "companyName");
        String companyAddress = ParamUtil.getString(resourceRequest, "companyAddress");
        String headOfCompany = ParamUtil.getString(resourceRequest, "headOfCompany");
        String jobTitleOne = ParamUtil.getString(resourceRequest, "jobTitleOne");
        String companyEmailOne = ParamUtil.getString(resourceRequest, "companyEmailOne");
        String companyNumOne = ParamUtil.getString(resourceRequest, "companyNumOne");
        String contactName = ParamUtil.getString(resourceRequest, "contactName");
        String jobTitleTwo = ParamUtil.getString(resourceRequest, "jobTitleTwo");
        String companyEmailTwo = ParamUtil.getString(resourceRequest, "companyEmailTwo");
        String companyNumTwo = ParamUtil.getString(resourceRequest, "companyNumTwo");

		String counter = ParamUtil.getString(resourceRequest, "counter");
		String deleteKey = ParamUtil.getString(resourceRequest, "deleteKey");
		if(deleteKey.contains("deleteApplicant")) {
			try {
				NcbjCompanyDetailGenLocalServiceUtil.deleteNcbjCompanyDetailGen(companyDetailValId);
			} catch (PortalException e) {
			}
		}else {
		NcbjCompanyDetailGen companyMultiInfo= null;
		
		if(Validator.isNotNull(companyDetailValId)) {
			try {
				companyMultiInfo=NcbjCompanyDetailGenLocalServiceUtil.getNcbjCompanyDetailGen(companyDetailValId);
			} catch (Exception e) {}
		}else{
			companyMultiInfo = NcbjCompanyDetailGenLocalServiceUtil.createNcbjCompanyDetailGen(CounterLocalServiceUtil.increment());
			companyMultiInfo.setCounter(counter);
		}
		companyMultiInfo.setCompanyName(companyName);
        companyMultiInfo.setCompanyAddress(companyAddress);
        companyMultiInfo.setHeadOfCompany(headOfCompany);
        companyMultiInfo.setJobTitleOne(jobTitleOne);
        companyMultiInfo.setCompanyEmailOne(companyEmailOne);
        companyMultiInfo.setCompanyNumOne(companyNumOne);
        companyMultiInfo.setContactName(contactName);
        companyMultiInfo.setJobTitleTwo(jobTitleTwo);
        companyMultiInfo.setCompanyEmailTwo(companyEmailTwo);
        companyMultiInfo.setCompanyNumTwo(companyNumTwo);
		companyMultiInfo.setNcbjApplicationId(ncbjApplicationId);
		NcbjCompanyDetailGenLocalServiceUtil.updateNcbjCompanyDetailGen(companyMultiInfo);
		jsonOBJ.put("companyDetailValId", companyMultiInfo.getNcbjCompanyDetailGenId());
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
