package com.nbp.medical.facilities.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesSignInfo;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesSignInfoLocalServiceUtil;
import com.nbp.medical.facilities.application.form.web.constants.MedicalFacilitiesApplicationFormPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + MedicalFacilitiesApplicationFormPortletKeys.MEDICALFACILITIESAPPLICATIONFORM,
		"mvc.command.name=medical/facilities/signature" }, service = MVCResourceCommand.class)
public class MedicalFacilitiesSignatureResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		long medicalApplicationId = ParamUtil.getLong(resourceRequest, "medicalApplicationId");
		String empConnectionNum = ParamUtil.getString(resourceRequest, "empConnectionNum");
		String empConnectionParticulars = ParamUtil.getString(resourceRequest, "empConnectionParticulars");
		String patientFee = ParamUtil.getString(resourceRequest, "patientFee");
		String applicantInterestAddress = ParamUtil.getString(resourceRequest, "applicantInterestAddress");		
		String  signatureDate =ParamUtil.getString(resourceRequest, "signatureDate");
		MedicalFacilitiesSignInfo medicalFacilitiesSignInfo=null;
		try {
			medicalFacilitiesSignInfo=MedicalFacilitiesSignInfoLocalServiceUtil.getMedicalFacilitiesSignInfo(medicalApplicationId);
		} catch (Exception e) {
		}
		if(Validator.isNull(medicalFacilitiesSignInfo)) {
			medicalFacilitiesSignInfo = MedicalFacilitiesSignInfoLocalServiceUtil
					.createMedicalFacilitiesSignInfo(CounterLocalServiceUtil.increment(MedicalFacilitiesSignatureResourceCommand.class.getName()));
		}
		medicalFacilitiesSignInfo.setNumber(empConnectionNum);
		medicalFacilitiesSignInfo.setParticulars(empConnectionParticulars);
		medicalFacilitiesSignInfo.setChargedFees(patientFee);
		medicalFacilitiesSignInfo.setAddressOfOtherNHome(applicantInterestAddress);
		
		if (Validator.isNotNull(signatureDate)) {
			try {
				medicalFacilitiesSignInfo.setEnteredDate(new SimpleDateFormat("yyyy-MM-dd").parse(signatureDate));
			} catch (Exception e) {
			}
		}
		medicalFacilitiesSignInfo.setMedicalFacilitiesAppId(medicalApplicationId);
		MedicalFacilitiesSignInfoLocalServiceUtil.updateMedicalFacilitiesSignInfo(medicalFacilitiesSignInfo);
		return false;
	}
}
