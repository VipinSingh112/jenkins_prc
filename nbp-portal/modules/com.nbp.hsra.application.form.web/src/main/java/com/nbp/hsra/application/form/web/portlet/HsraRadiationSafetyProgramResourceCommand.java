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
import com.nbp.hsra.application.service.model.RadiationSafetyProgram;
import com.nbp.hsra.application.service.service.RadiationSafetyProgramLocalServiceUtil;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
		"mvc.command.name=/hsra/radiation/safety/program" }, service = MVCResourceCommand.class)

public class HsraRadiationSafetyProgramResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil
			.getLog(HsraSpecificRequirementsSectionSevenResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("***********Radiation Safety Program******");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		String nuclearRsoName = ParamUtil.getString(resourceRequest, "nuclearRsoName");
		String nuclearRsoTitle = ParamUtil.getString(resourceRequest, "nuclearRsoTitle");
		String nuclearRsoTeleNo = ParamUtil.getString(resourceRequest, "nuclearRsoTeleNo");
		String nuclearRsoExt = ParamUtil.getString(resourceRequest, "nuclearRsoExt");
		String nuclearRsoFax = ParamUtil.getString(resourceRequest, "nuclearRsoFax");
		String nuclearRsoEmail = ParamUtil.getString(resourceRequest, "nuclearRsoEmail");
		String rsoDetails = ParamUtil.getString(resourceRequest, "rsoDetails");
		String qualifiedExpertName = ParamUtil.getString(resourceRequest, "qualifiedExpertName");
		String qualifiedExpertTitle = ParamUtil.getString(resourceRequest, "qualifiedExpertTitle");
		String qualifiedExpertTele = ParamUtil.getString(resourceRequest, "qualifiedExpertTele");
		String qualifiedExpertExt = ParamUtil.getString(resourceRequest, "qualifiedExpertExt");
		String qualifiedExpertFax = ParamUtil.getString(resourceRequest, "qualifiedExpertFax");
		String qualifiedExpertEmail = ParamUtil.getString(resourceRequest, "qualifiedExpertEmail");
		String qualifiedExpertRegistrationNo = ParamUtil.getString(resourceRequest, "qualifiedExpertRegistrationNo");
		String qualifiedExpertDate = ParamUtil.getString(resourceRequest, "qualifiedExpertDate");
		String qualifiedDetails = ParamUtil.getString(resourceRequest, "qualifiedDetails");
		String applicantName = ParamUtil.getString(resourceRequest, "applicantName");
		String applicantTitle = ParamUtil.getString(resourceRequest, "applicantTitle");
		String otherLimitationAuth = ParamUtil.getString(resourceRequest, "otherLimitationAuth");
		String otherDate = ParamUtil.getString(resourceRequest, "otherDate");
		String classificationWorkersList = ParamUtil.getString(resourceRequest, "classificationWorkersList");
		String respiPleaseSpecify = ParamUtil.getString(resourceRequest, "respiPleaseSpecify");
		String tongsPleaseSpecify = ParamUtil.getString(resourceRequest, "tongsPleaseSpecify");
		String scopeOfActivities = ParamUtil.getString(resourceRequest, "scopeOfActivities");
		String managementSystem = ParamUtil.getString(resourceRequest, "managementSystem");
		String workerRecordings = ParamUtil.getString(resourceRequest, "workerRecordings");
		String categoriesLicence = ParamUtil.getString(resourceRequest, "categoriesLicence");
		String renewalsSummary = ParamUtil.getString(resourceRequest, "renewalsSummary");
		String constraintsLimits = ParamUtil.getString(resourceRequest, "constraintsLimits");
		String equipmentMonitoring = ParamUtil.getString(resourceRequest, "equipmentMonitoring");
		String areasControl = ParamUtil.getString(resourceRequest, "areasControl");
		String radioactiveSources = ParamUtil.getString(resourceRequest, "radioactiveSources");
		String radiationiInstruments = ParamUtil.getString(resourceRequest, "radiationiInstruments");
		String healthWorkers = ParamUtil.getString(resourceRequest, "healthWorkers");
		String investigationLevel = ParamUtil.getString(resourceRequest, "investigationLevel");
		String policyDetails = ParamUtil.getString(resourceRequest, "policyDetails");
		String securityAccess = ParamUtil.getString(resourceRequest, "securityAccess");
		String raditionSources = ParamUtil.getString(resourceRequest, "raditionSources");
		String workerTraining = ParamUtil.getString(resourceRequest, "workerTraining");
		String publicControl = ParamUtil.getString(resourceRequest, "publicControl");
		String managementSources = ParamUtil.getString(resourceRequest, "managementSources");
		String emergencyProcedure = ParamUtil.getString(resourceRequest, "emergencyProcedure");
		String licenceLocation = ParamUtil.getString(resourceRequest, "licenceLocation");
		String achievableProgram = ParamUtil.getString(resourceRequest, "achievableProgram");
		String leakedTestingSources = ParamUtil.getString(resourceRequest, "leakedTestingSources");
		String transferSources = ParamUtil.getString(resourceRequest, "transferSources");
		String nuclearMaterials = ParamUtil.getString(resourceRequest, "nuclearMaterials");
		String transportPackaging = ParamUtil.getString(resourceRequest, "transportPackaging");
		String internalReview = ParamUtil.getString(resourceRequest, "internalReview");
		String sourcesActivities = ParamUtil.getString(resourceRequest, "sourcesActivities");
		String individualProtectiveEquipment = ParamUtil.getString(resourceRequest, "individualProtectiveEquipment");
		String RespiratoryProtectionPleaseSpecify = ParamUtil.getString(resourceRequest, "RespiratoryProtectionPleaseSpecify");

		RadiationSafetyProgram radiationSafetyProgram = null;
		try {
			radiationSafetyProgram = RadiationSafetyProgramLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {
		}
		if (radiationSafetyProgram == null) {
			radiationSafetyProgram = RadiationSafetyProgramLocalServiceUtil
					.createRadiationSafetyProgram(CounterLocalServiceUtil.increment());
		}
		radiationSafetyProgram.setNuclearRsoName(nuclearRsoName);
		radiationSafetyProgram.setNuclearRsoTitle(nuclearRsoTitle);
		radiationSafetyProgram.setNuclearRsoTeleNo(nuclearRsoTeleNo);
		radiationSafetyProgram.setNuclearRsoExt(nuclearRsoExt);
		radiationSafetyProgram.setNuclearRsoFax(nuclearRsoFax);
		radiationSafetyProgram.setNuclearRsoEmail(nuclearRsoEmail);
		radiationSafetyProgram.setRsoDetails(rsoDetails);
		radiationSafetyProgram.setQualifiedExpertName(qualifiedExpertName);
		radiationSafetyProgram.setQualifiedExpertTitle(qualifiedExpertTitle);
		radiationSafetyProgram.setQualifiedExpertTele(qualifiedExpertTele);
		radiationSafetyProgram.setQualifiedExpertExt(qualifiedExpertExt);
		radiationSafetyProgram.setQualifiedExpertFax(qualifiedExpertFax);
		radiationSafetyProgram.setQualifiedExpertEmail(qualifiedExpertEmail);
		radiationSafetyProgram.setQualifiedExpertRegstNo(qualifiedExpertRegistrationNo);

		try {
			if (Validator.isNotNull(qualifiedExpertDate)) {
				radiationSafetyProgram
						.setQualifiedExpertDate(new SimpleDateFormat("yyyy-MM-dd").parse(qualifiedExpertDate));
			}
		} catch (Exception e) {
		}

		radiationSafetyProgram.setQualifiedDetails(qualifiedDetails);
		radiationSafetyProgram.setApplicantName(applicantName);
		radiationSafetyProgram.setApplicantTitle(applicantTitle);
		radiationSafetyProgram.setOtherLimitationAuth(otherLimitationAuth);

		try {
			if (Validator.isNotNull(otherDate)) {
				radiationSafetyProgram.setOtherDate(new SimpleDateFormat("yyyy-MM-dd").parse(otherDate));
			}
		} catch (Exception e) {
		}

		radiationSafetyProgram.setClassifiWorkersList(classificationWorkersList);
		radiationSafetyProgram.setRespiPleaseSpecify(respiPleaseSpecify);
		radiationSafetyProgram.setTongsPleaseSpecify(tongsPleaseSpecify);
		radiationSafetyProgram.setScopeOfActivities(scopeOfActivities);
		radiationSafetyProgram.setManagementSystem(managementSystem);
		radiationSafetyProgram.setWorkerRecordings(workerRecordings);
		radiationSafetyProgram.setCategoriesLicence(categoriesLicence);
		radiationSafetyProgram.setRenewalsSummary(renewalsSummary);
		radiationSafetyProgram.setConstraintsLimits(constraintsLimits);
		radiationSafetyProgram.setEquipmentMonitoring(equipmentMonitoring);
		radiationSafetyProgram.setAreasControl(areasControl);
		radiationSafetyProgram.setRadioactiveSources(radioactiveSources);
		radiationSafetyProgram.setRadiationiInstruments(radiationiInstruments);
		radiationSafetyProgram.setHealthWorkers(healthWorkers);
		radiationSafetyProgram.setInvestigationLevel(investigationLevel);
		radiationSafetyProgram.setPolicyDetails(policyDetails);
		radiationSafetyProgram.setSecurityAccess(securityAccess);
		radiationSafetyProgram.setRaditionSources(raditionSources);
		radiationSafetyProgram.setWorkerTraining(workerTraining);
		radiationSafetyProgram.setPublicControl(publicControl);
		radiationSafetyProgram.setManagementSources(managementSources);
		radiationSafetyProgram.setEmergencyProcedure(emergencyProcedure);
		radiationSafetyProgram.setLicenceLocation(licenceLocation);
		radiationSafetyProgram.setAchievableProgram(achievableProgram);
		radiationSafetyProgram.setLeakedTestingSources(leakedTestingSources);
		radiationSafetyProgram.setTransferSources(transferSources);
		radiationSafetyProgram.setNuclearMaterials(nuclearMaterials);
		radiationSafetyProgram.setTransportPackaging(transportPackaging);
		radiationSafetyProgram.setInternalReview(internalReview);
		radiationSafetyProgram.setSourcesActivities(sourcesActivities);
		radiationSafetyProgram.setIndividualProtectiveEquipment(individualProtectiveEquipment);
		radiationSafetyProgram.setResProPleaseSpecify(RespiratoryProtectionPleaseSpecify);
		
		radiationSafetyProgram.setHsraApplicationId(hsraApplicationId);
		RadiationSafetyProgramLocalServiceUtil.updateRadiationSafetyProgram(radiationSafetyProgram);
		jsonOBJ.put("hsraApplicationId", radiationSafetyProgram.getHsraApplicationId());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}

}
