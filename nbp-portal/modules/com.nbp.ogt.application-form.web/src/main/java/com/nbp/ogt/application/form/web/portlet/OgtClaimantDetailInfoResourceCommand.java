package com.nbp.ogt.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.ogt.application.form.services.model.OgtClaimantDetail;
import com.nbp.ogt.application.form.services.service.OgtClaimantDetailLocalServiceUtil;
import com.nbp.ogt.application.form.web.constants.OgtApplicationFormWebPortletKeys;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + OgtApplicationFormWebPortletKeys.OGTAPPLICATIONFORMWEB,
		"mvc.command.name=add/claimant/detail/info" }, service = MVCResourceCommand.class)

public class OgtClaimantDetailInfoResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String applicantClaimant = ParamUtil.getString(resourceRequest, "applicantClaimant");
		String indiFirstName = ParamUtil.getString(resourceRequest, "indiFirstName");
		String indiLastName = ParamUtil.getString(resourceRequest, "indiLastName");
		String companyName = ParamUtil.getString(resourceRequest, "companyName");
		String address = ParamUtil.getString(resourceRequest, "address");
		String emailAddress = ParamUtil.getString(resourceRequest, "emailAddress");
		String telephone = ParamUtil.getString(resourceRequest, "telephone");
		String faxNo = ParamUtil.getString(resourceRequest, "faxNo");
		String applicationDate = ParamUtil.getString(resourceRequest, "applicationDate");
		String trnNumber = ParamUtil.getString(resourceRequest, "trnNumber");
		String claimBankrupt = ParamUtil.getString(resourceRequest, "claimBankrupt");
		long ogtApplicationId = ParamUtil.getLong(resourceRequest, "ogtApplicationId");
		OgtClaimantDetail claimantDetail = null;
		try {
			claimantDetail = OgtClaimantDetailLocalServiceUtil.getOgtById(ogtApplicationId);
		} catch (Exception e) {
		}
		if (claimantDetail == null) {
			claimantDetail = OgtClaimantDetailLocalServiceUtil
					.createOgtClaimantDetail(CounterLocalServiceUtil.increment());
		}

		try {
			claimantDetail.setClaimantDate(new SimpleDateFormat("yyyy-MM-dd").parse(applicationDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		claimantDetail.setClaimantName(applicantClaimant);
		claimantDetail.setClaimantFirstName(indiFirstName);
		claimantDetail.setClaimantLastName(indiLastName);
		claimantDetail.setClaimantCompanyName(companyName);
		claimantDetail.setClaimantAddress(address);
		claimantDetail.setClaimantEmailAddr(emailAddress);
		claimantDetail.setClaimantTeleNum(telephone);
		claimantDetail.setClaimantFaxNo(faxNo);
		claimantDetail.setClaimantTrn(trnNumber);
		claimantDetail.setClaimantRelative(claimBankrupt);
		claimantDetail.setOgtApplicationId(ogtApplicationId);
		OgtClaimantDetailLocalServiceUtil.updateOgtClaimantDetail(claimantDetail);
		return false;
	}

}
