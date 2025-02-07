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
import com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailAdd;
import com.nbp.ncbj.application.form.service.service.NcbjCompanyDetailAddLocalServiceUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
			"mvc.command.name=add/more/company/detail/info"
		},
		service = MVCResourceCommand.class
	)

public class NcbjAddMoreCompanyDetailResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil .getLog(NcbjAddMoreCompanyDetailResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String headOfCompany=ParamUtil.getString(resourceRequest, "headOfCompany");
		String jobTitleOne=ParamUtil.getString(resourceRequest, "jobTitleOne");
		String companyEmailOne=ParamUtil.getString(resourceRequest, "companyEmailOne");
		String companyNumOne=ParamUtil.getString(resourceRequest, "companyNumOne");
		String contactName=ParamUtil.getString(resourceRequest, "contactName");
		String jobTitleTwo=ParamUtil.getString(resourceRequest, "jobTitleTwo");
		String companyEmailTwo=ParamUtil.getString(resourceRequest, "companyEmailTwo");
		String companyNumTwo=ParamUtil.getString(resourceRequest, "companyNumTwo");
		String count=ParamUtil.getString(resourceRequest, "count");
		long ncbjApplicationId=ParamUtil.getLong(resourceRequest, "ncbjApplicationId");
		long companyDetailVal=ParamUtil.getLong(resourceRequest, "companyDetailVal");
		
		NcbjCompanyDetailAdd addMoreCompDetail=null;
		if(Validator.isNotNull(companyDetailVal)) {
			try {
				addMoreCompDetail=NcbjCompanyDetailAddLocalServiceUtil.getNcbjCompanyDetailAdd(companyDetailVal);
			} catch (PortalException e) {
			}
		}else {
		addMoreCompDetail= NcbjCompanyDetailAddLocalServiceUtil.createNcbjCompanyDetailAdd(CounterLocalServiceUtil.increment());
		addMoreCompDetail.setCounter(count);
		}
		addMoreCompDetail.setHeadOfCompanyName(headOfCompany);
		addMoreCompDetail.setJobTitle(jobTitleOne);
		addMoreCompDetail.setEmailAddress(companyEmailOne);
		addMoreCompDetail.setTelephoneNumber(companyNumOne);
		addMoreCompDetail.setContactName(contactName);
		addMoreCompDetail.setContactNameJobTitle(jobTitleTwo);
		addMoreCompDetail.setContactNameEmailAddress(companyEmailTwo);
		addMoreCompDetail.setContactNameTelephoneNum(companyNumTwo);
		
		addMoreCompDetail.setNcbjApplicationId(ncbjApplicationId);
		NcbjCompanyDetailAddLocalServiceUtil.updateNcbjCompanyDetailAdd(addMoreCompDetail);
		jsonOBJ.put("companyDetailVal", addMoreCompDetail.getNcbjCompanyDetailAddId());
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
