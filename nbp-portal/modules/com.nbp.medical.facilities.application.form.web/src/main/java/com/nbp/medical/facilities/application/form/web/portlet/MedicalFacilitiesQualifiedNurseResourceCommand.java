package com.nbp.medical.facilities.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesQNurse;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesQNurseLocalServiceUtil;
import com.nbp.medical.facilities.application.form.web.constants.MedicalFacilitiesApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + MedicalFacilitiesApplicationFormPortletKeys.MEDICALFACILITIESAPPLICATIONFORM,
		"mvc.command.name=medical/facilities/practitioner/qualified/nurse/detail" }, service = MVCResourceCommand.class)
public class MedicalFacilitiesQualifiedNurseResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		long medicalApplicationId = ParamUtil.getLong(resourceRequest, "medicalApplicationId");
		String patientCareUnderSuperintence = ParamUtil.getString(resourceRequest, "patientCareUnderSuperintence");
		String superintendenceNurseName = ParamUtil.getString(resourceRequest, "superintendenceNurseName");
		String superintendenceNurseQualifications = ParamUtil.getString(resourceRequest, "superintendenceNurseQualifications");
		String medicalPractitionerName = ParamUtil.getString(resourceRequest, "medicalPractitionerName");
		String medicalPractitionerQualifications = ParamUtil.getString(resourceRequest, "medicalPractitionerQualifications");
		String medicalPractitionerQualifiesNurseRatio = ParamUtil.getString(resourceRequest, "medicalPractitionerQualifiesNurseRatio");		
		String qualifiedNurse = ParamUtil.getString(resourceRequest, "qualifiedNurse");
		MedicalFacilitiesQNurse medicalFacilitiesQNurse=null;
		try {
			medicalFacilitiesQNurse=MedicalFacilitiesQNurseLocalServiceUtil.getMedicalFacilitiesQNurse(medicalApplicationId);
		} catch (Exception e) {
		}
		if(Validator.isNull(medicalFacilitiesQNurse)) {
			medicalFacilitiesQNurse = MedicalFacilitiesQNurseLocalServiceUtil
					.createMedicalFacilitiesQNurse(CounterLocalServiceUtil.increment(MedicalFacilitiesQualifiedNurseResourceCommand.class.getName()));
		}
		medicalFacilitiesQNurse.setName(superintendenceNurseName);
		medicalFacilitiesQNurse.setQualification(superintendenceNurseQualifications);
		medicalFacilitiesQNurse.setCheckQualifiedNurse(qualifiedNurse);
		medicalFacilitiesQNurse.setQNurseName(medicalPractitionerName);
		medicalFacilitiesQNurse.setQNurseQualification(medicalPractitionerQualifications);
		medicalFacilitiesQNurse.setRatioOfQNurses(medicalPractitionerQualifiesNurseRatio);
		medicalFacilitiesQNurse.setNursingStaffCategory(patientCareUnderSuperintence);
		medicalFacilitiesQNurse.setMedicalFacilitiesAppId(medicalApplicationId);
		MedicalFacilitiesQNurseLocalServiceUtil.updateMedicalFacilitiesQNurse(medicalFacilitiesQNurse);
		return false;
	}

}
