package com.nbp.ncbj.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.ncbj.application.form.service.model.NCBJCompanyNew;
import com.nbp.ncbj.application.form.service.service.NCBJCompanyNewLocalServiceUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
			"mvc.command.name=/new/company/Detail/Url"
		},
		service = MVCResourceCommand.class
	)


public class NewCompanyDetailResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		
		String companyNameNew=ParamUtil.getString(resourceRequest, "companyNameNew");
		String companyAddressNew=ParamUtil.getString(resourceRequest, "companyAddressNew");
		String headOfCompanyNew=ParamUtil.getString(resourceRequest, "headOfCompanyNew");
		String jobTitleOneNew=ParamUtil.getString(resourceRequest, "companyNumOneNew");
		String companyEmailOneNew=ParamUtil.getString(resourceRequest, "companyNumOneNew");
		String companyNumOneNew=ParamUtil.getString(resourceRequest, "companyNumOneNew");
		String contactNameNew=ParamUtil.getString(resourceRequest, "contactNameNew");
		String jobTitleTwoNew=ParamUtil.getString(resourceRequest, "jobTitleTwoNew");
		String companyEmailTwoNew=ParamUtil.getString(resourceRequest, "companyEmailTwoNew");
		String companyNumTwoNew=ParamUtil.getString(resourceRequest, "companyNumTwoNew");
		long ncbjApplicationId=ParamUtil.getLong(resourceRequest, "ncbjApplicationId");
		
		NCBJCompanyNew newCompany=null;
		try {
			newCompany= NCBJCompanyNewLocalServiceUtil.getNCBJById(ncbjApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		  if(newCompany==null) {
			  newCompany=NCBJCompanyNewLocalServiceUtil.createNCBJCompanyNew(CounterLocalServiceUtil.increment());
		  }
		  newCompany.setCompanyName(companyNameNew);
		  newCompany.setCompanyAddress(companyAddressNew);
		  newCompany.setHeadOfCompany(headOfCompanyNew);
		  newCompany.setJobTitleOne(jobTitleOneNew);
		  newCompany.setCompanyEmailOne(companyEmailOneNew);
		  newCompany.setCompanyNumOne(companyNumOneNew);
		  newCompany.setJobTitleTwo(jobTitleTwoNew);
		  newCompany.setContactName(contactNameNew);
		  newCompany.setCompanyEmailTwo(companyEmailTwoNew);
		  newCompany.setCompanyNumTwo(companyNumTwoNew);
		  newCompany.setNcbjApplicationId(ncbjApplicationId);
		  NCBJCompanyNewLocalServiceUtil.updateNCBJCompanyNew(newCompany);
		 
		// TODO Auto-generated method stub
		return false;
	}

}
