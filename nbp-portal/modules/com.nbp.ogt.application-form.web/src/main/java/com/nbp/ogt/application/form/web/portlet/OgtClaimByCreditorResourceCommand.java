package com.nbp.ogt.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.ogt.application.form.services.model.OgtProofOfClaim;
import com.nbp.ogt.application.form.services.service.OgtProofOfClaimLocalServiceUtil;
import com.nbp.ogt.application.form.web.constants.OgtApplicationFormWebPortletKeys;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component
(immediate = true, 
property = {
	"javax.portlet.name=" + OgtApplicationFormWebPortletKeys.OGTAPPLICATIONFORMWEB,
	"mvc.command.name=add/creditor/toClaim/formA" }, service = MVCResourceCommand.class)

public class OgtClaimByCreditorResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String claimProofMatter=ParamUtil.getString(resourceRequest, "claimProofMatter");
		String debtorName=ParamUtil.getString(resourceRequest, "debtorName");
		String claimantName=ParamUtil.getString(resourceRequest, "claimantName");
		String claimAddress=ParamUtil.getString(resourceRequest, "claimAddress");
		String claimPhone=ParamUtil.getString(resourceRequest, "claimPhone");
		String claimName=ParamUtil.getString(resourceRequest, "claimName");
		String faxClaim=ParamUtil.getString(resourceRequest, "faxClaim");
		String emailAddressClaim=ParamUtil.getString(resourceRequest, "emailAddressClaim");
		String completingForm=ParamUtil.getString(resourceRequest, "completingForm");
		String claimCertifyCheck=ParamUtil.getString(resourceRequest, "claimCertifyCheck");
		String positionCompletingForm=ParamUtil.getString(resourceRequest, "positionCompletingForm");
		String claimedDebtor=ParamUtil.getString(resourceRequest, "claimedDebtor");
		String applicationDateCa=ParamUtil.getString(resourceRequest, "applicationDateCa");
		String valueOfClaim=ParamUtil.getString(resourceRequest, "valueOfClaim");
		String specificClaimed=ParamUtil.getString(resourceRequest, "specificClaimed");
		String statementOfAccount=ParamUtil.getString(resourceRequest, "statementOfAccount");
		String unsecuredClaimOne=ParamUtil.getString(resourceRequest, "unsecuredClaimOne");
		String regardingAmountOne=ParamUtil.getString(resourceRequest, "regardingAmountOne");
		String categoryOneClaimed=ParamUtil.getString(resourceRequest, "categoryOneClaimed");
		String categoryTwoClaimed=ParamUtil.getString(resourceRequest, "categoryTwoClaimed");
		String categoryThreeClaimed=ParamUtil.getString(resourceRequest, "categoryThreeClaimed");
		String categoryFourClaimed=ParamUtil.getString(resourceRequest, "categoryFourClaimed");
		String otherPleaseSpecify=ParamUtil.getString(resourceRequest, "otherPleaseSpecify");
		String securedClaimOne=ParamUtil.getString(resourceRequest, "securedClaim");
		String securedClaim=ParamUtil.getString(resourceRequest, "securedClaim");
		String descriptionsClaim=ParamUtil.getString(resourceRequest, "descriptionsClaim");
		String knowledgeCred=ParamUtil.getString(resourceRequest, "knowledgeCred");
		String paymentDetailDescription=ParamUtil.getString(resourceRequest, "paymentDetailDescription");
		String bankruptIndividual=ParamUtil.getString(resourceRequest, "bankruptIndividual");
		long ogtApplicationId=ParamUtil.getLong(resourceRequest, "ogtApplicationId");
		OgtProofOfClaim creditorClaim=null;
		
		try {
			creditorClaim=OgtProofOfClaimLocalServiceUtil.getOgtById(ogtApplicationId);
		}catch(Exception e) {}
			
		if(creditorClaim==null)  {
			creditorClaim=OgtProofOfClaimLocalServiceUtil.createOgtProofOfClaim(CounterLocalServiceUtil.increment());
		}
		creditorClaim.setClaimProofMatter(claimProofMatter);
		creditorClaim.setClaimDebtorName(debtorName);
		creditorClaim.setClaimantName(claimantName);
		creditorClaim.setClaimSentAddress(claimAddress);
		creditorClaim.setClaimName(claimName);
		creditorClaim.setClaimSentPhoneNum(claimPhone);
		creditorClaim.setClaimSentFaxNo(faxClaim);
		creditorClaim.setClaimSentEmailAddr(emailAddressClaim);
		creditorClaim.setClaimCompName(completingForm);
		creditorClaim.setClaimCertifyCheck(claimCertifyCheck);
		creditorClaim.setClaimCompPosition(positionCompletingForm);
		creditorClaim.setClaimByCredDebtor(claimedDebtor);
		try {
			if(Validator.isNotNull(applicationDateCa)) {
			creditorClaim.setClaimDateAppli(new SimpleDateFormat("yyyy-MM-dd").parse(applicationDateCa));
		}
		}
		catch(ParseException e){
			e.printStackTrace();
		}
		creditorClaim.setClaimByDebtTotalVal(valueOfClaim);
		creditorClaim.setClaimByDebtStatement(statementOfAccount);
		creditorClaim.setClaimCategory(specificClaimed);
		creditorClaim.setClaimUnsecured(unsecuredClaimOne);
		creditorClaim.setClaimRegardingAmt(regardingAmountOne);
		creditorClaim.setIndicateCategoryOne(categoryOneClaimed);
		creditorClaim.setIndicateCategoryTwo(categoryTwoClaimed);
		creditorClaim.setIndicateCategoryThree(categoryThreeClaimed);
		creditorClaim.setIndicateCategoryFour(categoryFourClaimed);
		creditorClaim.setOtherPleaseSpecify(otherPleaseSpecify);
		creditorClaim.setClaimSecuredOne(securedClaimOne);
		creditorClaim.setClaimSecured(securedClaim);
		creditorClaim.setClaimDesc(descriptionsClaim);
		creditorClaim.setAboveNamedCreditor(knowledgeCred);
		creditorClaim.setPaymentDetailDesc(paymentDetailDescription);
		creditorClaim.setInCaseOfBankruptcy(bankruptIndividual);
		
		creditorClaim.setOgtApplicationId(ogtApplicationId);
		OgtProofOfClaimLocalServiceUtil.updateOgtProofOfClaim(creditorClaim);
		/*
		 * jsonOBJ.put("detailApplicantInfoId",claimantDetail.get);
		 * jsonFeed.put("APP_DATA", jsonOBJ);
		 * resourceResponse.setContentType("application/json");
		 */
		/*
		 * try { resourceResponse.getWriter().write(jsonFeed.toString()); } catch
		 * (IOException e) { e.printStackTrace(); }
		 */
		// TODO Auto-generated method stub
		return false;
	}

}
