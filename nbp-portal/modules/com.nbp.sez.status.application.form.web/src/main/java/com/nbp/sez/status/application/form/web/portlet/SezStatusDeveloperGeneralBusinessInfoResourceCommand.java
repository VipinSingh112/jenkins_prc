package com.nbp.sez.status.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.sez.status.application.form.service.model.SezDevGeneralBusinessIfo;
import com.nbp.sez.status.application.form.service.service.SezDevGeneralBusinessIfoLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/developer/general/business/info" }, service = MVCResourceCommand.class)
public class SezStatusDeveloperGeneralBusinessInfoResourceCommand implements MVCResourceCommand {
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String devAppDate = ParamUtil.getString(resourceRequest, "devAppDate");
		String devAppName = ParamUtil.getString(resourceRequest, "devAppName");
		String devCompanyName = ParamUtil.getString(resourceRequest, "devCompanyName");
		String devCompanyStreetAddress = ParamUtil.getString(resourceRequest, "devCompanyStreetAddress");
		String devCompanyTown = ParamUtil.getString(resourceRequest, "devCompanyTown");
		String devCompanyZipCode = ParamUtil.getString(resourceRequest, "devCompanyZipCode");
		String devCountry = ParamUtil.getString(resourceRequest, "devCountry");
		String devTelephone = ParamUtil.getString(resourceRequest, "devTelephone");
		String devFax = ParamUtil.getString(resourceRequest, "devFax");
		String devEmail = ParamUtil.getString(resourceRequest, "devEmail");
		String devWebsite = ParamUtil.getString(resourceRequest, "devWebsite");
		String devLocalStreetAddress = ParamUtil.getString(resourceRequest, "devLocalStreetAddress");
		String devLocalTown = ParamUtil.getString(resourceRequest, "devLocalTown");
		String devLocalZipCode = ParamUtil.getString(resourceRequest, "devLocalZipCode");
		String devRepName = ParamUtil.getString(resourceRequest, "devRepName");
		String devRepStreetAddress = ParamUtil.getString(resourceRequest, "devRepStreetAddress");
		String devRepTown = ParamUtil.getString(resourceRequest, "devRepTown");
		String devRepZipCode = ParamUtil.getString(resourceRequest, "devRepZipCode");
		String devRepCountry = ParamUtil.getString(resourceRequest, "devRepCountry");
		String devRepTelephone = ParamUtil.getString(resourceRequest, "devRepTelephone");
		String devRepFax = ParamUtil.getString(resourceRequest, "devRepFax");
		String devRepEmail = ParamUtil.getString(resourceRequest, "devRepEmail");
		String devJointVenture = ParamUtil.getString(resourceRequest, "devJointVenture");
		String devExistingCom = ParamUtil.getString(resourceRequest, "devExistingCom");
		String devFormArticle = ParamUtil.getString(resourceRequest, "devFormArticle");
		String devFormArticleOther = ParamUtil.getString(resourceRequest, "devFormArticleOther");
		String devCompanyClassified = ParamUtil.getString(resourceRequest, "devCompanyClassified");
		String devTRN = ParamUtil.getString(resourceRequest, "devTRN");
		String devGCT = ParamUtil.getString(resourceRequest, "devGCT");
		String devTCC = ParamUtil.getString(resourceRequest, "devTCC");
		long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		SezDevGeneralBusinessIfo sezDevGeneralBusinessInfo = null;
		try {
			sezDevGeneralBusinessInfo = SezDevGeneralBusinessIfoLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
		}
		if(sezDevGeneralBusinessInfo==null) {
			sezDevGeneralBusinessInfo = SezDevGeneralBusinessIfoLocalServiceUtil
					.createSezDevGeneralBusinessIfo(CounterLocalServiceUtil.increment());
		}
		try {
			if (Validator.isNotNull(devAppDate)) {
				sezDevGeneralBusinessInfo.setApplicationDate(new SimpleDateFormat("yyyy-MM-dd").parse(devAppDate));
			}
		} catch (ParseException e) {
		}
		
		sezDevGeneralBusinessInfo.setApplicantName(devAppName);
		sezDevGeneralBusinessInfo.setCompanyName(devCompanyName);
		sezDevGeneralBusinessInfo.setBuildingNum(devCompanyStreetAddress);
		sezDevGeneralBusinessInfo.setTownCity(devCompanyTown);
		sezDevGeneralBusinessInfo.setParish(devCompanyZipCode);
		sezDevGeneralBusinessInfo.setCountry(devCountry);
		sezDevGeneralBusinessInfo.setTelephoneNum(devTelephone);
		sezDevGeneralBusinessInfo.setFaxNum(devFax);
		sezDevGeneralBusinessInfo.setEmailAddress(devEmail);
		sezDevGeneralBusinessInfo.setWebsite(devWebsite);
		sezDevGeneralBusinessInfo.setHeadOfficeBuildingNum(devLocalStreetAddress);
		sezDevGeneralBusinessInfo.setHeadOfficeTown(devLocalTown);
		sezDevGeneralBusinessInfo.setHeadOfficeParish(devLocalZipCode);
		sezDevGeneralBusinessInfo.setAuthRepName(devRepName);
		sezDevGeneralBusinessInfo.setAuthRepBuildingNum(devRepStreetAddress);
		sezDevGeneralBusinessInfo.setAuthRepTown(devRepTown);
		sezDevGeneralBusinessInfo.setAuthRepParish(devRepZipCode);
		sezDevGeneralBusinessInfo.setAuthRepCountry(devRepCountry);
		sezDevGeneralBusinessInfo.setAuthReptelephoneNum(devRepTelephone);
		sezDevGeneralBusinessInfo.setAuthRepFaxNum(devRepFax);
		sezDevGeneralBusinessInfo.setAutheEmailAddress(devRepEmail);
		sezDevGeneralBusinessInfo.setJoinVenture(devJointVenture);
		sezDevGeneralBusinessInfo.setExistingJamicanCom(devExistingCom);
		sezDevGeneralBusinessInfo.setArticleOfIncorporation(devFormArticle);
		sezDevGeneralBusinessInfo.setPleaseSpecify(devFormArticleOther);
		sezDevGeneralBusinessInfo.setCompanyClassified(devCompanyClassified);
		sezDevGeneralBusinessInfo.setTaxRegisNum(devTRN);
		sezDevGeneralBusinessInfo.setGenConsumptionNum(devGCT);
		sezDevGeneralBusinessInfo.setTaxComplianceCertificateNum(devTCC);
		sezDevGeneralBusinessInfo.setSezStatusApplicationId(sezStatusApplicationId);
		SezDevGeneralBusinessIfoLocalServiceUtil.updateSezDevGeneralBusinessIfo(sezDevGeneralBusinessInfo);
		return false;
	}
}