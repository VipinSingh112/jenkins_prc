package com.nbp.ncra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.ncra.application.form.service.model.NcraApplicantDetailInfo;
import com.nbp.ncra.application.form.service.service.NcraApplicantDetailInfoLocalServiceUtil;
import com.nbp.ncra.application.form.web.constants.NCRAApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		property = { 
		"javax.portlet.name="+ NCRAApplicationFormPortletKeys.NCRAAPPLICATIONFORM,
		"mvc.command.name=/petrolInfo" 
		}, service = MVCResourceCommand.class)
public class NCRAImportedApplicantDetailInfoResourceCommand implements MVCResourceCommand{
			
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
				System.out.println("called------- Petrol");
		String applicantBusinessName = ParamUtil.getString(resourceRequest, "applicantBusinessName");
		String applicantAddress = ParamUtil.getString(resourceRequest, "applicantAddress");
		String applicantContact = ParamUtil.getString(resourceRequest, "applicantContact");
		String applicantTeleNum = ParamUtil.getString(resourceRequest, "applicantTeleNum");
		String applicantFaxNo = ParamUtil.getString(resourceRequest, "applicantFaxNo");
		String applicantEmailAddr = ParamUtil.getString(resourceRequest, "applicantEmailAddr");
		String applicantLocation = ParamUtil.getString(resourceRequest, "applicantLocation");
		long ncraApplicationId = ParamUtil.getLong(resourceRequest, "ncraApplicationId");
		
		NcraApplicantDetailInfo applicantDetail=null;
		try {
			applicantDetail= NcraApplicantDetailInfoLocalServiceUtil.getNcraDetail_By_App_Id(ncraApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if(applicantDetail==null) {
			applicantDetail=NcraApplicantDetailInfoLocalServiceUtil.createNcraApplicantDetailInfo(CounterLocalServiceUtil.increment());
			System.out.println("called-------created");
		}
		applicantDetail.setApplicantLocation(applicantLocation);
		applicantDetail.setApplicantEmailAddr(applicantEmailAddr);
		applicantDetail.setApplicantFaxNo(applicantFaxNo);
		applicantDetail.setApplicantTeleNum(applicantTeleNum);
		applicantDetail.setApplicantContact(applicantContact);
		applicantDetail.setApplicantAddress(applicantAddress);
		applicantDetail.setApplicantBusinessName(applicantBusinessName);
		applicantDetail.setNcraApplicationId(ncraApplicationId);
		NcraApplicantDetailInfoLocalServiceUtil.updateNcraApplicantDetailInfo(applicantDetail);
		System.out.println("called-------end");
		return false;
	}

}
