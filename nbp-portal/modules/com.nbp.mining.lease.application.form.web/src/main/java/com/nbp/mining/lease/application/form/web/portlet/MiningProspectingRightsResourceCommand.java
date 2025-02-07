package com.nbp.mining.lease.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.mining.lease.application.form.web.constants.MiningLeaseApplicationFormPortletKeys;
import com.nbp.mining.lease.application.service.model.MiningProspectingRights;
import com.nbp.mining.lease.application.service.service.MiningProspectingRightsLocalServiceUtil;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + MiningLeaseApplicationFormPortletKeys.MININGLEASEAPPLICATIONFORM,
		"mvc.command.name=prospesctive/form/info" }, service = MVCResourceCommand.class)

public class MiningProspectingRightsResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		long miningLeaseApplicationId = ParamUtil.getLong(resourceRequest, "miningLeaseApplicationId");
		String applicantName = ParamUtil.getString(resourceRequest, "applicantName");
		String trnNumber = ParamUtil.getString(resourceRequest, "trnNumber");
		String applicantNationality = ParamUtil.getString(resourceRequest, "applicantNationality");
		String applicantAge = ParamUtil.getString(resourceRequest, "applicantAge");
		String applicantTelephone = ParamUtil.getString(resourceRequest, "applicantTelephone");
		String applicantEmail = ParamUtil.getString(resourceRequest, "applicantEmail");
		String applicantAddress = ParamUtil.getString(resourceRequest, "applicantAddress");
		String applicantProspectAccount = ParamUtil.getString(resourceRequest, "applicantProspectAccount");
		String otherPersonEmployName = ParamUtil.getString(resourceRequest, "otherPersonEmployName");
		String otherPersonEmployAddress = ParamUtil.getString(resourceRequest, "otherPersonEmployAddress");
		String applicantProspectingLicence = ParamUtil.getString(resourceRequest, "applicantProspectingLicence");
		String applicantOffenceConvicted = ParamUtil.getString(resourceRequest, "applicantOffenceConvicted");
		String validProspectionRight = ParamUtil.getString(resourceRequest, "validProspectionRight");
		String surrenderProspectingRightNo = ParamUtil.getString(resourceRequest, "surrenderProspectingRightNo");
		String prospectRightsFeeCheck = ParamUtil.getString(resourceRequest, "prospectRightsFeeCheck");

		MiningProspectingRights miningProspRights = null;

		try {
			miningProspRights = MiningProspectingRightsLocalServiceUtil.getMiningById(miningLeaseApplicationId);
		} catch (Exception e) {
		}
		if (miningProspRights == null) {
			miningProspRights = MiningProspectingRightsLocalServiceUtil
					.createMiningProspectingRights(CounterLocalServiceUtil.increment());
		}
		miningProspRights.setNameOfApplicant(applicantName);
		miningProspRights.setTrnNum(trnNumber);
		miningProspRights.setNationalityOfApplicant(applicantNationality);
		miningProspRights.setAgeOfApplicant(applicantAge);
		miningProspRights.setTelephoneNum(applicantTelephone);
		miningProspRights.setEmailAddr(applicantEmail);
		miningProspRights.setAddressInJamaica(applicantAddress);
		miningProspRights.setApplicantProspectAcc(applicantProspectAccount);
		miningProspRights.setOtherPersonName(otherPersonEmployName);
		miningProspRights.setOtherPersonAddr(otherPersonEmployAddress);
		miningProspRights.setPrevApplication(applicantProspectingLicence);
		miningProspRights.setOffenceMiningAct(applicantOffenceConvicted);
		miningProspRights.setValidProspectRight(validProspectionRight);
		miningProspRights.setSurrenderProspectRight(surrenderProspectingRightNo);
		miningProspRights.setProspectRightsFeeCheck(prospectRightsFeeCheck);
		miningProspRights.setMiningLeaseApplicationId(miningLeaseApplicationId);
		MiningProspectingRightsLocalServiceUtil.updateMiningProspectingRights(miningProspRights);

		return false;
	}

}
