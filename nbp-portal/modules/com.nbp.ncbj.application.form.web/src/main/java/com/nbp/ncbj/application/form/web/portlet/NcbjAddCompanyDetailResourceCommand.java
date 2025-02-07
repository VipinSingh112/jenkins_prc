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
		"mvc.command.name=/company/form/two/info" 
		},service = MVCResourceCommand.class)
public class NcbjAddCompanyDetailResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(NcbjAddCompanyDetailResourceCommand.class.getName());
	
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long ncbjApplicationId=ParamUtil.getLong(resourceRequest, "ncbjApplicationId");
		long ncbjCompanyDetailGenId = ParamUtil.getLong(resourceRequest, "ncbjCompanyDetailGenId");
		String companyNameTwo = ParamUtil.getString(resourceRequest, "companyNameTwo");
        String companyAddressTwo = ParamUtil.getString(resourceRequest, "companyAddressTwo");
        String sectionOneCompName = ParamUtil.getString(resourceRequest, "sectionOneCompName");
        String sectionOneCompJobTitle = ParamUtil.getString(resourceRequest, "sectionOneCompJobTitle");
        String sectionOneCompEmailAddr = ParamUtil.getString(resourceRequest, "sectionOneCompEmailAddr");
        String sectionOneCompTelNum = ParamUtil.getString(resourceRequest, "sectionOneCompTelNum");
        String sectOneCompContactName = ParamUtil.getString(resourceRequest, "sectOneCompContactName");
        String sectOneCompJobTitle = ParamUtil.getString(resourceRequest, "sectOneCompJobTitle");
        String sectOneCompEmail = ParamUtil.getString(resourceRequest, "sectOneCompEmail");
        String sectOneCompTeleNumber = ParamUtil.getString(resourceRequest, "sectOneCompTeleNumber");
		String counter = ParamUtil.getString(resourceRequest, "counter");
		String deleteKey = ParamUtil.getString(resourceRequest, "deleteKey");
		if(deleteKey.contains("deleteApplicant")) {
			try {
				NcbjCompanyDetailGenLocalServiceUtil.deleteNcbjCompanyDetailGen(ncbjCompanyDetailGenId);
			} catch (PortalException e) {
			}
		}else {
		NcbjCompanyDetailGen companyDetailTwo= null;
		
		if(Validator.isNotNull(ncbjCompanyDetailGenId)) {
			try {
				companyDetailTwo=NcbjCompanyDetailGenLocalServiceUtil.getNcbjCompanyDetailGen(ncbjCompanyDetailGenId);
			} catch (Exception e) {}
		}else{
			companyDetailTwo = NcbjCompanyDetailGenLocalServiceUtil.createNcbjCompanyDetailGen(CounterLocalServiceUtil.increment());
			companyDetailTwo.setCounter(counter);
		}
		companyDetailTwo.setCompanyName(companyNameTwo);
        companyDetailTwo.setCompanyAddress(companyAddressTwo);
        companyDetailTwo.setHeadOfCompany(sectionOneCompName);
        companyDetailTwo.setJobTitleOne(sectionOneCompJobTitle);
        companyDetailTwo.setCompanyEmailOne(sectionOneCompEmailAddr);
        companyDetailTwo.setCompanyNumOne(sectionOneCompTelNum);
        companyDetailTwo.setContactName(sectOneCompContactName);
        companyDetailTwo.setJobTitleTwo(sectOneCompJobTitle);
        companyDetailTwo.setCompanyEmailTwo(sectOneCompEmail);
        companyDetailTwo.setCompanyNumTwo(sectOneCompTeleNumber);
		companyDetailTwo.setNcbjApplicationId(ncbjApplicationId);	
		NcbjCompanyDetailGenLocalServiceUtil.updateNcbjCompanyDetailGen(companyDetailTwo);
		jsonOBJ.put("ncbjCompanyDetailGenId", companyDetailTwo.getNcbjCompanyDetailGenId());
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
