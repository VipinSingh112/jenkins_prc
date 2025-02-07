package com.nbp.medical.facilities.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.medical.facilities.application.form.service.model.MedicalNurseStaffPremises;
import com.nbp.medical.facilities.application.form.service.service.MedicalNurseStaffPremisesLocalServiceUtil;
import com.nbp.medical.facilities.application.form.web.constants.MedicalFacilitiesApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + MedicalFacilitiesApplicationFormPortletKeys.MEDICALFACILITIESAPPLICATIONFORM,
		"mvc.command.name=medical/facilities/nurse/premises" }, service = MVCResourceCommand.class)
public class MedicalFacilitiesNurseStaffPremisesResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		long medicalApplicationId = ParamUtil.getLong(resourceRequest, "medicalApplicationId");
		String nursingStaffCategory = ParamUtil.getString(resourceRequest, "nursingStaffCategory");
		MedicalNurseStaffPremises medStaffPremises=null;
		try {
			medStaffPremises=MedicalNurseStaffPremisesLocalServiceUtil.getMedicalFacilities_ByAppId(medicalApplicationId);
		} catch (Exception e) {
		}
		if(Validator.isNull(medStaffPremises)) {
			medStaffPremises = MedicalNurseStaffPremisesLocalServiceUtil
					.createMedicalNurseStaffPremises(CounterLocalServiceUtil.increment(MedicalFacilitiesNurseStaffPremisesResourceCommand.class.getName()));
		}
		medStaffPremises.setNursingStaffCategory(nursingStaffCategory);
		medStaffPremises.setMedicalFacilitiesAppId(medicalApplicationId);
		MedicalNurseStaffPremisesLocalServiceUtil.updateMedicalNurseStaffPremises(medStaffPremises);
		return false;
	}
}
