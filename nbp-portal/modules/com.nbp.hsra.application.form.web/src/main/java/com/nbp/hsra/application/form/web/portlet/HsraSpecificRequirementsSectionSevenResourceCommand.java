package com.nbp.hsra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationFormPortletKeys;
import com.nbp.hsra.application.service.model.SpecificReqPropLicActivity;
import com.nbp.hsra.application.service.service.SpecificReqPropLicActivityLocalServiceUtil;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
		"mvc.command.name=/hsra/specific/requirements" }, service = MVCResourceCommand.class)

public class HsraSpecificRequirementsSectionSevenResourceCommand implements MVCResourceCommand {

	private static Log _log = LogFactoryUtil
			.getLog(HsraSpecificRequirementsSectionSevenResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------------inside hsra specific requiremments------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		String administrationTreatment = ParamUtil.getString(resourceRequest, "administrationTreatment");
		String qualityProgramme = ParamUtil.getString(resourceRequest, "qualityProgramme");
		String instructionsCaregivers = ParamUtil.getString(resourceRequest, "instructionsCaregivers");
		String instructionsPatients = ParamUtil.getString(resourceRequest, "instructionsPatients");
		String patientsRelease = ParamUtil.getString(resourceRequest, "patientsRelease");
		String treatmentRooms = ParamUtil.getString(resourceRequest, "treatmentRooms");
		String medicalEmergencies = ParamUtil.getString(resourceRequest, "medicalEmergencies");
		String nuclearMedicine = ParamUtil.getString(resourceRequest, "nuclearMedicine");
		String diagnosticStudies = ParamUtil.getString(resourceRequest, "diagnosticStudies");
		String biomedicalResearch = ParamUtil.getString(resourceRequest, "biomedicalResearch");
		String researchReview = ParamUtil.getString(resourceRequest, "researchReview");
		String emergencyOperating = ParamUtil.getString(resourceRequest, "emergencyOperating");
		String certificatePackages = ParamUtil.getString(resourceRequest, "certificatePackages");
		String exposureDevices = ParamUtil.getString(resourceRequest, "exposureDevices");
		String equipmentSafety = ParamUtil.getString(resourceRequest, "equipmentSafety");
		String transportPlan = ParamUtil.getString(resourceRequest, "transportPlan");
		String animalsTreatment = ParamUtil.getString(resourceRequest, "animalsTreatment");
		String animalHousing = ParamUtil.getString(resourceRequest, "animalHousing");
		String disposalWaste = ParamUtil.getString(resourceRequest, "disposalWaste");
		String monitoringAnimalHousing = ParamUtil.getString(resourceRequest, "monitoringAnimalHousing");
		String releaseAnimals = ParamUtil.getString(resourceRequest, "releaseAnimals");
		String proceduresApp = ParamUtil.getString(resourceRequest, "proceduresApp");
		String disposalsApp = ParamUtil.getString(resourceRequest, "disposalsApp");
		String monitoringMaterialNu = ParamUtil.getString(resourceRequest, "monitoringMaterialNu");
		String handlingProcedures = ParamUtil.getString(resourceRequest, "handlingProcedures");
		String hoppersEntry = ParamUtil.getString(resourceRequest, "hoppersEntry");
		String operatingConditions = ParamUtil.getString(resourceRequest, "operatingConditions");
		String insertionType = ParamUtil.getString(resourceRequest, "insertionType");
		String installationFixed = ParamUtil.getString(resourceRequest, "installationFixed");
		String transportPlanGauge = ParamUtil.getString(resourceRequest, "transportPlanGauge");
		String emergencyAddition = ParamUtil.getString(resourceRequest, "emergencyAddition");
		String nuclearEnviroment = ParamUtil.getString(resourceRequest, "nuclearEnviroment");
		String fishingTool = ParamUtil.getString(resourceRequest, "fishingTool");
		String sealedSources = ParamUtil.getString(resourceRequest, "sealedSources");
		String abandonmentZone = ParamUtil.getString(resourceRequest, "abandonmentZone");
		String servicingCopy = ParamUtil.getString(resourceRequest, "servicingCopy");
		String manufacturingDevelopment = ParamUtil.getString(resourceRequest, "manufacturingDevelopment");

		SpecificReqPropLicActivity specificRquirements = null;
		try {
			specificRquirements = SpecificReqPropLicActivityLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(specificRquirements)) {
			specificRquirements = SpecificReqPropLicActivityLocalServiceUtil
					.createSpecificReqPropLicActivity(CounterLocalServiceUtil.increment());
		}
		specificRquirements.setAdminTreatment(administrationTreatment);
		specificRquirements.setQualityProgramme(qualityProgramme);
		specificRquirements.setInstructionsCaregivers(instructionsCaregivers);
		specificRquirements.setInstructionsPatients(instructionsPatients);
		specificRquirements.setPatientsRelease(patientsRelease);
		specificRquirements.setTreatmentRooms(treatmentRooms);
		specificRquirements.setMedicalEmergencies(medicalEmergencies);
		specificRquirements.setNuclearMedicine(nuclearMedicine);
		specificRquirements.setDiagnosticStudies(diagnosticStudies);
		specificRquirements.setBiomedicalResearch(biomedicalResearch);
		specificRquirements.setResearchReview(researchReview);
		specificRquirements.setEmergencyOperating(emergencyOperating);
		
		specificRquirements.setCertificatePackages(certificatePackages);
		specificRquirements.setExposureDevices(exposureDevices);
		specificRquirements.setEquipmentSafety(equipmentSafety);
		specificRquirements.setTransportPlan(transportPlan);
		specificRquirements.setAnimalsTreatment(animalsTreatment);
		specificRquirements.setAnimalHousing(animalHousing);
		specificRquirements.setDisposalWaste(disposalWaste);
		specificRquirements.setMonitoringAnimalHousing(monitoringAnimalHousing);
		specificRquirements.setReleaseAnimals(releaseAnimals);
		specificRquirements.setProceduresApp(proceduresApp);
		specificRquirements.setDisposalsApp(disposalsApp);
		specificRquirements.setMonitoringMaterialNu(monitoringMaterialNu);
		
		specificRquirements.setHandlingProcedures(handlingProcedures);
		specificRquirements.setHoppersEntry(hoppersEntry);
		specificRquirements.setOperatingConditions(operatingConditions);
		specificRquirements.setInsertionType(insertionType);
		specificRquirements.setInstallationFixed(installationFixed);
		specificRquirements.setTransportPlanGauge(transportPlanGauge);
		specificRquirements.setEmergencyAddition(emergencyAddition);
		specificRquirements.setNuclearEnviroment(nuclearEnviroment);
		specificRquirements.setFishingTool(fishingTool);
		specificRquirements.setSealedSources(sealedSources);
		specificRquirements.setAbandonmentZone(abandonmentZone);
		specificRquirements.setServicingCopy(servicingCopy);
		specificRquirements.setManufacturingDevelopment(manufacturingDevelopment);
		specificRquirements.setHsraApplicationId(hsraApplicationId);
		SpecificReqPropLicActivityLocalServiceUtil.updateSpecificReqPropLicActivity(specificRquirements);
		jsonOBJ.put("hsraApplicationId", specificRquirements.getHsraApplicationId());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}
}
