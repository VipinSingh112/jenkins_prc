package com.nbp.ncbj.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailGen;
import com.nbp.ncbj.application.form.service.service.NcbjCompanyDetailGenLocalServiceUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
			"mvc.command.name=/company/detail/information/gen"
		},
		service = MVCResourceCommand.class
	)

public class NcbjCompanyDetailGenInfoResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		Log _log=LogFactoryUtil.getLog(NcbjCompanyDetailGenInfoResourceCommand.class.getName());
		_log.info("[ISO 22000-2018 Certification-COMPANY DETAIL--- SAVE STARTED]");
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
		long ncbjApplicationId=ParamUtil.getLong(resourceRequest, "ncbjApplicationId");
		NcbjCompanyDetailGen companyDetail=null;
		try {
			companyDetail= NcbjCompanyDetailGenLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
		} catch (Exception e) {
		}
		if(companyDetail==null) {
			companyDetail=NcbjCompanyDetailGenLocalServiceUtil.createNcbjCompanyDetailGen(CounterLocalServiceUtil.increment());
		}
		_log.info("[SAVE STARTED--COMPANY DETAIL 22000]");
		companyDetail.setCompanyName(companyName);
        companyDetail.setCompanyAddress(companyAddress);
        companyDetail.setHeadOfCompany(headOfCompany);
        companyDetail.setJobTitleOne(jobTitleOne);
        companyDetail.setCompanyEmailOne(companyEmailOne);
        companyDetail.setCompanyNumOne(companyNumOne);
        companyDetail.setContactName(contactName);
        companyDetail.setJobTitleTwo(jobTitleTwo);
        companyDetail.setCompanyEmailTwo(companyEmailTwo);
        companyDetail.setCompanyNumTwo(companyNumTwo);
	
		_log.info("[SAVE STARTED]");
		companyDetail.setNcbjApplicationId(ncbjApplicationId);
		NcbjCompanyDetailGenLocalServiceUtil.updateNcbjCompanyDetailGen(companyDetail);
		// TODO Auto-generated method stub
		return false;
	}

}
