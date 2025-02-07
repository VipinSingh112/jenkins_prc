package com.nbp.ogt.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.ogt.application.form.services.model.OgtSectionB;
import com.nbp.ogt.application.form.services.service.OgtSectionBLocalServiceUtil;
import com.nbp.ogt.application.form.web.constants.OgtApplicationFormWebPortletKeys;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + OgtApplicationFormWebPortletKeys.OGTAPPLICATIONFORMWEB,
		"mvc.command.name=add/section/b/form" }, service = MVCResourceCommand.class)
public class OgtSectonBResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {

		String theDebtor = ParamUtil.getString(resourceRequest, "theDebtor");
		String name = ParamUtil.getString(resourceRequest, "name");
		String dateOfInsolvency = ParamUtil.getString(resourceRequest, "dateOfInsolvency");
		String valueOfClaim = ParamUtil.getString(resourceRequest, "valueOfClaim");
		String statementOfAccount = ParamUtil.getString(resourceRequest, "statementOfAccount");
		String unsecuredClaim = ParamUtil.getString(resourceRequest, "unsecuredClaim");
		String unsecuredClaimOf = ParamUtil.getString(resourceRequest, "unsecuredClaimOf");
		String regardingAmount = ParamUtil.getString(resourceRequest, "regardingAmount");
		String categoryOneValue = ParamUtil.getString(resourceRequest, "categoryOneValue");
		String categoryTwoValue = ParamUtil.getString(resourceRequest, "categoryTwoValue");
		String categoryThreeValue = ParamUtil.getString(resourceRequest, "categoryThreeValue");
		String categoryFourValue = ParamUtil.getString(resourceRequest, "categoryFourValue");
		String otherPleaseSpecify = ParamUtil.getString(resourceRequest, "otherPleaseSpecify");
		String securedClaim = ParamUtil.getString(resourceRequest, "securedClaim");
		String securedClaimOf = ParamUtil.getString(resourceRequest, "securedClaimOf");
		String description = ParamUtil.getString(resourceRequest, "description");
		String relationWithDebtor = ParamUtil.getString(resourceRequest, "relationWithDebtor");
		String paymentDetailDescription = ParamUtil.getString(resourceRequest, "paymentDetailDescription");
		String bankruptIndividual = ParamUtil.getString(resourceRequest, "bankruptIndividual");
		long ogtApplicationId = ParamUtil.getLong(resourceRequest, "ogtApplicationId");

		OgtSectionB sectionB = null;
		try {
			sectionB = OgtSectionBLocalServiceUtil.getOgtById(ogtApplicationId);
		} catch (Exception e) {
		}

		if (sectionB == null) {
			sectionB = OgtSectionBLocalServiceUtil.createOgtSectionB(CounterLocalServiceUtil.increment());
		}
		sectionB.setTheDebtor(theDebtor);
		sectionB.setName(name);
		try {
			if (Validator.isNotNull(dateOfInsolvency)) {
				sectionB.setDateOfInsolvencyOfDebtor(new SimpleDateFormat("yyyy-MM-dd").parse(dateOfInsolvency));
			}
		} catch (ParseException e) {
		}
		sectionB.setTotalValueOfClaim(valueOfClaim);
		sectionB.setStatementOfAccount(statementOfAccount);
		sectionB.setUnsecuredClaim(unsecuredClaim);
		sectionB.setUnsecuredClaimOf(unsecuredClaimOf);
		sectionB.setRegardingTheAmount(regardingAmount);
		sectionB.setCategoryOne(categoryOneValue);
		sectionB.setCategoryTwo(categoryTwoValue);
		sectionB.setCategoryThree(categoryThreeValue);
		sectionB.setCategoryFour(categoryFourValue);
		sectionB.setOtherPleaseSpecify(otherPleaseSpecify);
		sectionB.setSecuredClaim(securedClaim);
		sectionB.setSecuredClaimOf(securedClaimOf);
		sectionB.setDescription(description);
		sectionB.setRelationWithDebtor(relationWithDebtor);
		sectionB.setBankruptcyEventDescription(paymentDetailDescription);
		sectionB.setBankruptcyOfAnIndividual(bankruptIndividual);
		sectionB.setOgtApplicationId(ogtApplicationId);
		OgtSectionBLocalServiceUtil.updateOgtSectionB(sectionB);
		return false;
	}

}
