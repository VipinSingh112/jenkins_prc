package com.nbp.ogt.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.ogt.application.form.services.model.OgtClaimToSpouse;
import com.nbp.ogt.application.form.services.service.OgtClaimToSpouseLocalServiceUtil;
import com.nbp.ogt.application.form.web.constants.OgtApplicationFormWebPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + OgtApplicationFormWebPortletKeys.OGTAPPLICATIONFORMWEB,
		"mvc.command.name=add/spouse/toClaim/formC" }, service = MVCResourceCommand.class)

public class OgtClaimToSpouseResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String bankruptcyDateSpouse = ParamUtil.getString(resourceRequest, "bankruptcyDateSpouse");
		String claimSpouseDescription = ParamUtil.getString(resourceRequest, "claimSpouseDescription");
		String completingFormAct = ParamUtil.getString(resourceRequest, "completingFormAct");
		String datePerson = ParamUtil.getString(resourceRequest, "datePerson");
		String completingPersonAddress = ParamUtil.getString(resourceRequest, "completingPersonAddress");
		String justicePeace = ParamUtil.getString(resourceRequest, "justicePeace");
		String justicePeaceParish = ParamUtil.getString(resourceRequest, "justicePeaceParish");
		String amountClaim = ParamUtil.getString(resourceRequest, "amountClaim");
		String votingClaimed = ParamUtil.getString(resourceRequest, "votingClaimed");
		String amountAdmitted = ParamUtil.getString(resourceRequest, "amountAdmitted");
		String dateVoting = ParamUtil.getString(resourceRequest, "dateVoting");
		String amountPayment = ParamUtil.getString(resourceRequest, "amountPayment");
		String dateAdmitted = ParamUtil.getString(resourceRequest, "dateAdmitted");
		long ogtApplicationId = ParamUtil.getLong(resourceRequest, "ogtApplicationId");
		OgtClaimToSpouse formC = null;
		try {
			formC = OgtClaimToSpouseLocalServiceUtil.getOgtById(ogtApplicationId);
		} catch (Exception e) {
		}

		if (formC == null) {
			formC = OgtClaimToSpouseLocalServiceUtil.createOgtClaimToSpouse(CounterLocalServiceUtil.increment());
		}
		try {
			if (Validator.isNotNull(bankruptcyDateSpouse)) {
				formC.setSpouseDate(new SimpleDateFormat("yyyy-MM-dd").parse(bankruptcyDateSpouse));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (Validator.isNotNull(datePerson)) {
				formC.setNameCompletionDate(new SimpleDateFormat("yyyy-MM-dd").parse(datePerson));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (Validator.isNotNull(dateVoting)) {
				formC.setOfficialAmtVotingDate(new SimpleDateFormat("yyyy-MM-dd").parse(dateVoting));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (Validator.isNotNull(dateAdmitted)) {
				formC.setOfficialPaymentDate(new SimpleDateFormat("yyyy-MM-dd").parse(dateAdmitted));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		formC.setClaimSpouseDesc(claimSpouseDescription);
		formC.setNameCompletionForm(completingFormAct);
		formC.setNameJusticeOfPeace(justicePeace);
		formC.setJusticePeaceParish(justicePeaceParish);
		formC.setCompPersonAddress(completingPersonAddress);
		formC.setOfficialAmtClaim(amountClaim);
		formC.setOfficialSection(votingClaimed);
		formC.setOfficialAmtVoting(amountAdmitted);
		formC.setOfficialPayment(amountPayment);
		formC.setOgtApplicationId(ogtApplicationId);
		OgtClaimToSpouseLocalServiceUtil.updateOgtClaimToSpouse(formC);
		return false;
	}

}
