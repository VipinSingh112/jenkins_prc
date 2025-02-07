package com.nbp.jtb.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.jtb.application.form.service.model.AttractDetailFormInfo;
import com.nbp.jtb.application.form.service.service.AttractDetailFormInfoLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component
(immediate = true, 
property = {
	"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
	"mvc.command.name=/attraction/applicant/detail/info" }, service = MVCResourceCommand.class)

public class AttractionApplicantDetailInfoResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String newAttractionsOwnerName=ParamUtil.getString(resourceRequest, "newAttractionsOwnerName");
		String newAttractionsLocation=ParamUtil.getString(resourceRequest, "newAttractionsLocation");
		String newAttractionsMailingEmail=ParamUtil.getString(resourceRequest, "newAttractionsMailingEmail");
		String newAttractionsTelephone=ParamUtil.getString(resourceRequest, "newAttractionsTelephone");
		String newAttractionsFaxNum=ParamUtil.getString(resourceRequest, "newAttractionsFaxNum");
		String newAttractionsEmailAddress=ParamUtil.getString(resourceRequest, "newAttractionsEmailAddress");
		String newAttractionsEmployeesNum=ParamUtil.getString(resourceRequest, "newAttractionsEmployeesNum");
		String newAttractionsParish=ParamUtil.getString(resourceRequest, "newAttractionsParish");
		String applicationDate=ParamUtil.getString(resourceRequest, "applicationDate");
		String trnNumber=ParamUtil.getString(resourceRequest, "trnNumber");
		String claimBankrupt=ParamUtil.getString(resourceRequest, "claimBankrupt");
		long jtbApplicationId=ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		AttractDetailFormInfo applicantDetail=null;
		try {
			applicantDetail=AttractDetailFormInfoLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		}catch(Exception e) {}
		if(applicantDetail==null) {
			applicantDetail=AttractDetailFormInfoLocalServiceUtil.createAttractDetailFormInfo(CounterLocalServiceUtil.increment());
		}
		
		applicantDetail.setNewAttractionsOwnerName(newAttractionsOwnerName);
		applicantDetail.setNewAttractionsLocation(newAttractionsLocation);
		applicantDetail.setNewAttractionsMailing(newAttractionsMailingEmail);
		applicantDetail.setNewAttractionsTelephone(newAttractionsTelephone);
		applicantDetail.setNewAttractionsFaxNum(newAttractionsFaxNum);
		applicantDetail.setNewAttractionsEmailAddr(newAttractionsEmailAddress);
		applicantDetail.setNewAttractionsEmpNum(newAttractionsEmployeesNum);
		applicantDetail.setNewAttractionsParish(newAttractionsParish);
		applicantDetail.setJtbApplicationId(jtbApplicationId);
		AttractDetailFormInfoLocalServiceUtil.updateAttractDetailFormInfo(applicantDetail);
		return false;
	}

}
