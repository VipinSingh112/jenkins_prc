/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AccCerBodyMngReqTwo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyMngReqTwo
 * @generated
 */
public class AccCerBodyMngReqTwoWrapper
	extends BaseModelWrapper<AccCerBodyMngReqTwo>
	implements AccCerBodyMngReqTwo, ModelWrapper<AccCerBodyMngReqTwo> {

	public AccCerBodyMngReqTwoWrapper(AccCerBodyMngReqTwo accCerBodyMngReqTwo) {
		super(accCerBodyMngReqTwo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("accCerBodyMngReqTwoId", getAccCerBodyMngReqTwoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("optionFollow", getOptionFollow());
		attributes.put("certiAgreement", getCertiAgreement());
		attributes.put("qMRefCertiAgreement", getQMRefCertiAgreement());
		attributes.put("riskAssessment", getRiskAssessment());
		attributes.put("qMRefRisk", getQMRefRisk());
		attributes.put("confidentiality", getConfidentiality());
		attributes.put("qMRefConfidentiality", getQMRefConfidentiality());
		attributes.put("security", getSecurity());
		attributes.put("qMRefSecurity", getQMRefSecurity());
		attributes.put("certificationScheme", getCertificationScheme());
		attributes.put("qMRefCertifiScheme", getQMRefCertifiScheme());
		attributes.put("validCertification", getValidCertification());
		attributes.put("qMRefValidCertification", getQMRefValidCertification());
		attributes.put("preRequisites", getPreRequisites());
		attributes.put("qMRefPrerequisites", getQMRefPrerequisites());
		attributes.put("infoProvided", getInfoProvided());
		attributes.put("qMRefInfoProvided", getQMRefInfoProvided());
		attributes.put("handlingAppeals", getHandlingAppeals());
		attributes.put("qMRefHandlingAppeals", getQMRefHandlingAppeals());
		attributes.put("handlingComplaints", getHandlingComplaints());
		attributes.put("qMRefHandlingComplaint", getQMRefHandlingComplaint());
		attributes.put("orgStructure", getOrgStructure());
		attributes.put("qMRefOrgStructure", getQMRefOrgStructure());
		attributes.put("formalRules", getFormalRules());
		attributes.put("qMRefFormalRules", getQMRefFormalRules());
		attributes.put("safeguardingMechanism", getSafeguardingMechanism());
		attributes.put("qMRefSafeguarding", getQMRefSafeguarding());
		attributes.put("managementProc", getManagementProc());
		attributes.put("qMRefManagementProc", getQMRefManagementProc());
		attributes.put("contractExaminer", getContractExaminer());
		attributes.put("qMRefExaminer", getQMRefExaminer());
		attributes.put("contractBody", getContractBody());
		attributes.put("qMRefContractBody", getQMRefContractBody());
		attributes.put("docPolicies", getDocPolicies());
		attributes.put("qMRefDocPolicies", getQMRefDocPolicies());
		attributes.put("specifiedStandard", getSpecifiedStandard());
		attributes.put("qMRefSpecified", getQMRefSpecified());
		attributes.put("applicationForm", getApplicationForm());
		attributes.put("qMRefAppliForm", getQMRefAppliForm());
		attributes.put("applicationReview", getApplicationReview());
		attributes.put("qMRefAppliReview", getQMRefAppliReview());
		attributes.put("assessmentPlan", getAssessmentPlan());
		attributes.put("qMRefAssessmentPlan", getQMRefAssessmentPlan());
		attributes.put("examinationProcess", getExaminationProcess());
		attributes.put("qMRefExamProcess", getQMRefExamProcess());
		attributes.put("certificationDecision", getCertificationDecision());
		attributes.put("qMRefCertiDecision", getQMRefCertiDecision());
		attributes.put("certificationDoc", getCertificationDoc());
		attributes.put("qMRefCertiDoc", getQMRefCertiDoc());
		attributes.put("useOfCertificates", getUseOfCertificates());
		attributes.put("qMRefUseOfCertificate", getQMRefUseOfCertificate());
		attributes.put("suspension", getSuspension());
		attributes.put("qMRefSuspension", getQMRefSuspension());
		attributes.put("processToReceive", getProcessToReceive());
		attributes.put("qMRefReceiveProcess", getQMRefReceiveProcess());
		attributes.put("generalManage", getGeneralManage());
		attributes.put("qMRefGeneral", getQMRefGeneral());
		attributes.put("docControl", getDocControl());
		attributes.put("qMRefDocControl", getQMRefDocControl());
		attributes.put("recordControl", getRecordControl());
		attributes.put("qMRefRecControl", getQMRefRecControl());
		attributes.put("manageReview", getManageReview());
		attributes.put("qMRefManageReview", getQMRefManageReview());
		attributes.put("internalAudit", getInternalAudit());
		attributes.put("qMRefInternal", getQMRefInternal());
		attributes.put("correctiveAction", getCorrectiveAction());
		attributes.put("qMRefCorrective", getQMRefCorrective());
		attributes.put("preventiveAction", getPreventiveAction());
		attributes.put("qMRefPreventive", getQMRefPreventive());
		attributes.put("docInKeeping", getDocInKeeping());
		attributes.put("qMRefDocInKeeping", getQMRefDocInKeeping());
		attributes.put("janaacApplicationId", getJanaacApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long accCerBodyMngReqTwoId = (Long)attributes.get(
			"accCerBodyMngReqTwoId");

		if (accCerBodyMngReqTwoId != null) {
			setAccCerBodyMngReqTwoId(accCerBodyMngReqTwoId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String optionFollow = (String)attributes.get("optionFollow");

		if (optionFollow != null) {
			setOptionFollow(optionFollow);
		}

		String certiAgreement = (String)attributes.get("certiAgreement");

		if (certiAgreement != null) {
			setCertiAgreement(certiAgreement);
		}

		String qMRefCertiAgreement = (String)attributes.get(
			"qMRefCertiAgreement");

		if (qMRefCertiAgreement != null) {
			setQMRefCertiAgreement(qMRefCertiAgreement);
		}

		String riskAssessment = (String)attributes.get("riskAssessment");

		if (riskAssessment != null) {
			setRiskAssessment(riskAssessment);
		}

		String qMRefRisk = (String)attributes.get("qMRefRisk");

		if (qMRefRisk != null) {
			setQMRefRisk(qMRefRisk);
		}

		String confidentiality = (String)attributes.get("confidentiality");

		if (confidentiality != null) {
			setConfidentiality(confidentiality);
		}

		String qMRefConfidentiality = (String)attributes.get(
			"qMRefConfidentiality");

		if (qMRefConfidentiality != null) {
			setQMRefConfidentiality(qMRefConfidentiality);
		}

		String security = (String)attributes.get("security");

		if (security != null) {
			setSecurity(security);
		}

		String qMRefSecurity = (String)attributes.get("qMRefSecurity");

		if (qMRefSecurity != null) {
			setQMRefSecurity(qMRefSecurity);
		}

		String certificationScheme = (String)attributes.get(
			"certificationScheme");

		if (certificationScheme != null) {
			setCertificationScheme(certificationScheme);
		}

		String qMRefCertifiScheme = (String)attributes.get(
			"qMRefCertifiScheme");

		if (qMRefCertifiScheme != null) {
			setQMRefCertifiScheme(qMRefCertifiScheme);
		}

		String validCertification = (String)attributes.get(
			"validCertification");

		if (validCertification != null) {
			setValidCertification(validCertification);
		}

		String qMRefValidCertification = (String)attributes.get(
			"qMRefValidCertification");

		if (qMRefValidCertification != null) {
			setQMRefValidCertification(qMRefValidCertification);
		}

		String preRequisites = (String)attributes.get("preRequisites");

		if (preRequisites != null) {
			setPreRequisites(preRequisites);
		}

		String qMRefPrerequisites = (String)attributes.get(
			"qMRefPrerequisites");

		if (qMRefPrerequisites != null) {
			setQMRefPrerequisites(qMRefPrerequisites);
		}

		String infoProvided = (String)attributes.get("infoProvided");

		if (infoProvided != null) {
			setInfoProvided(infoProvided);
		}

		String qMRefInfoProvided = (String)attributes.get("qMRefInfoProvided");

		if (qMRefInfoProvided != null) {
			setQMRefInfoProvided(qMRefInfoProvided);
		}

		String handlingAppeals = (String)attributes.get("handlingAppeals");

		if (handlingAppeals != null) {
			setHandlingAppeals(handlingAppeals);
		}

		String qMRefHandlingAppeals = (String)attributes.get(
			"qMRefHandlingAppeals");

		if (qMRefHandlingAppeals != null) {
			setQMRefHandlingAppeals(qMRefHandlingAppeals);
		}

		String handlingComplaints = (String)attributes.get(
			"handlingComplaints");

		if (handlingComplaints != null) {
			setHandlingComplaints(handlingComplaints);
		}

		String qMRefHandlingComplaint = (String)attributes.get(
			"qMRefHandlingComplaint");

		if (qMRefHandlingComplaint != null) {
			setQMRefHandlingComplaint(qMRefHandlingComplaint);
		}

		String orgStructure = (String)attributes.get("orgStructure");

		if (orgStructure != null) {
			setOrgStructure(orgStructure);
		}

		String qMRefOrgStructure = (String)attributes.get("qMRefOrgStructure");

		if (qMRefOrgStructure != null) {
			setQMRefOrgStructure(qMRefOrgStructure);
		}

		String formalRules = (String)attributes.get("formalRules");

		if (formalRules != null) {
			setFormalRules(formalRules);
		}

		String qMRefFormalRules = (String)attributes.get("qMRefFormalRules");

		if (qMRefFormalRules != null) {
			setQMRefFormalRules(qMRefFormalRules);
		}

		String safeguardingMechanism = (String)attributes.get(
			"safeguardingMechanism");

		if (safeguardingMechanism != null) {
			setSafeguardingMechanism(safeguardingMechanism);
		}

		String qMRefSafeguarding = (String)attributes.get("qMRefSafeguarding");

		if (qMRefSafeguarding != null) {
			setQMRefSafeguarding(qMRefSafeguarding);
		}

		String managementProc = (String)attributes.get("managementProc");

		if (managementProc != null) {
			setManagementProc(managementProc);
		}

		String qMRefManagementProc = (String)attributes.get(
			"qMRefManagementProc");

		if (qMRefManagementProc != null) {
			setQMRefManagementProc(qMRefManagementProc);
		}

		String contractExaminer = (String)attributes.get("contractExaminer");

		if (contractExaminer != null) {
			setContractExaminer(contractExaminer);
		}

		String qMRefExaminer = (String)attributes.get("qMRefExaminer");

		if (qMRefExaminer != null) {
			setQMRefExaminer(qMRefExaminer);
		}

		String contractBody = (String)attributes.get("contractBody");

		if (contractBody != null) {
			setContractBody(contractBody);
		}

		String qMRefContractBody = (String)attributes.get("qMRefContractBody");

		if (qMRefContractBody != null) {
			setQMRefContractBody(qMRefContractBody);
		}

		String docPolicies = (String)attributes.get("docPolicies");

		if (docPolicies != null) {
			setDocPolicies(docPolicies);
		}

		String qMRefDocPolicies = (String)attributes.get("qMRefDocPolicies");

		if (qMRefDocPolicies != null) {
			setQMRefDocPolicies(qMRefDocPolicies);
		}

		String specifiedStandard = (String)attributes.get("specifiedStandard");

		if (specifiedStandard != null) {
			setSpecifiedStandard(specifiedStandard);
		}

		String qMRefSpecified = (String)attributes.get("qMRefSpecified");

		if (qMRefSpecified != null) {
			setQMRefSpecified(qMRefSpecified);
		}

		String applicationForm = (String)attributes.get("applicationForm");

		if (applicationForm != null) {
			setApplicationForm(applicationForm);
		}

		String qMRefAppliForm = (String)attributes.get("qMRefAppliForm");

		if (qMRefAppliForm != null) {
			setQMRefAppliForm(qMRefAppliForm);
		}

		String applicationReview = (String)attributes.get("applicationReview");

		if (applicationReview != null) {
			setApplicationReview(applicationReview);
		}

		String qMRefAppliReview = (String)attributes.get("qMRefAppliReview");

		if (qMRefAppliReview != null) {
			setQMRefAppliReview(qMRefAppliReview);
		}

		String assessmentPlan = (String)attributes.get("assessmentPlan");

		if (assessmentPlan != null) {
			setAssessmentPlan(assessmentPlan);
		}

		String qMRefAssessmentPlan = (String)attributes.get(
			"qMRefAssessmentPlan");

		if (qMRefAssessmentPlan != null) {
			setQMRefAssessmentPlan(qMRefAssessmentPlan);
		}

		String examinationProcess = (String)attributes.get(
			"examinationProcess");

		if (examinationProcess != null) {
			setExaminationProcess(examinationProcess);
		}

		String qMRefExamProcess = (String)attributes.get("qMRefExamProcess");

		if (qMRefExamProcess != null) {
			setQMRefExamProcess(qMRefExamProcess);
		}

		String certificationDecision = (String)attributes.get(
			"certificationDecision");

		if (certificationDecision != null) {
			setCertificationDecision(certificationDecision);
		}

		String qMRefCertiDecision = (String)attributes.get(
			"qMRefCertiDecision");

		if (qMRefCertiDecision != null) {
			setQMRefCertiDecision(qMRefCertiDecision);
		}

		String certificationDoc = (String)attributes.get("certificationDoc");

		if (certificationDoc != null) {
			setCertificationDoc(certificationDoc);
		}

		String qMRefCertiDoc = (String)attributes.get("qMRefCertiDoc");

		if (qMRefCertiDoc != null) {
			setQMRefCertiDoc(qMRefCertiDoc);
		}

		String useOfCertificates = (String)attributes.get("useOfCertificates");

		if (useOfCertificates != null) {
			setUseOfCertificates(useOfCertificates);
		}

		String qMRefUseOfCertificate = (String)attributes.get(
			"qMRefUseOfCertificate");

		if (qMRefUseOfCertificate != null) {
			setQMRefUseOfCertificate(qMRefUseOfCertificate);
		}

		String suspension = (String)attributes.get("suspension");

		if (suspension != null) {
			setSuspension(suspension);
		}

		String qMRefSuspension = (String)attributes.get("qMRefSuspension");

		if (qMRefSuspension != null) {
			setQMRefSuspension(qMRefSuspension);
		}

		String processToReceive = (String)attributes.get("processToReceive");

		if (processToReceive != null) {
			setProcessToReceive(processToReceive);
		}

		String qMRefReceiveProcess = (String)attributes.get(
			"qMRefReceiveProcess");

		if (qMRefReceiveProcess != null) {
			setQMRefReceiveProcess(qMRefReceiveProcess);
		}

		String generalManage = (String)attributes.get("generalManage");

		if (generalManage != null) {
			setGeneralManage(generalManage);
		}

		String qMRefGeneral = (String)attributes.get("qMRefGeneral");

		if (qMRefGeneral != null) {
			setQMRefGeneral(qMRefGeneral);
		}

		String docControl = (String)attributes.get("docControl");

		if (docControl != null) {
			setDocControl(docControl);
		}

		String qMRefDocControl = (String)attributes.get("qMRefDocControl");

		if (qMRefDocControl != null) {
			setQMRefDocControl(qMRefDocControl);
		}

		String recordControl = (String)attributes.get("recordControl");

		if (recordControl != null) {
			setRecordControl(recordControl);
		}

		String qMRefRecControl = (String)attributes.get("qMRefRecControl");

		if (qMRefRecControl != null) {
			setQMRefRecControl(qMRefRecControl);
		}

		String manageReview = (String)attributes.get("manageReview");

		if (manageReview != null) {
			setManageReview(manageReview);
		}

		String qMRefManageReview = (String)attributes.get("qMRefManageReview");

		if (qMRefManageReview != null) {
			setQMRefManageReview(qMRefManageReview);
		}

		String internalAudit = (String)attributes.get("internalAudit");

		if (internalAudit != null) {
			setInternalAudit(internalAudit);
		}

		String qMRefInternal = (String)attributes.get("qMRefInternal");

		if (qMRefInternal != null) {
			setQMRefInternal(qMRefInternal);
		}

		String correctiveAction = (String)attributes.get("correctiveAction");

		if (correctiveAction != null) {
			setCorrectiveAction(correctiveAction);
		}

		String qMRefCorrective = (String)attributes.get("qMRefCorrective");

		if (qMRefCorrective != null) {
			setQMRefCorrective(qMRefCorrective);
		}

		String preventiveAction = (String)attributes.get("preventiveAction");

		if (preventiveAction != null) {
			setPreventiveAction(preventiveAction);
		}

		String qMRefPreventive = (String)attributes.get("qMRefPreventive");

		if (qMRefPreventive != null) {
			setQMRefPreventive(qMRefPreventive);
		}

		String docInKeeping = (String)attributes.get("docInKeeping");

		if (docInKeeping != null) {
			setDocInKeeping(docInKeeping);
		}

		String qMRefDocInKeeping = (String)attributes.get("qMRefDocInKeeping");

		if (qMRefDocInKeeping != null) {
			setQMRefDocInKeeping(qMRefDocInKeeping);
		}

		Long janaacApplicationId = (Long)attributes.get("janaacApplicationId");

		if (janaacApplicationId != null) {
			setJanaacApplicationId(janaacApplicationId);
		}
	}

	@Override
	public AccCerBodyMngReqTwo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acc cer body mng req two ID of this acc cer body mng req two.
	 *
	 * @return the acc cer body mng req two ID of this acc cer body mng req two
	 */
	@Override
	public long getAccCerBodyMngReqTwoId() {
		return model.getAccCerBodyMngReqTwoId();
	}

	/**
	 * Returns the application form of this acc cer body mng req two.
	 *
	 * @return the application form of this acc cer body mng req two
	 */
	@Override
	public String getApplicationForm() {
		return model.getApplicationForm();
	}

	/**
	 * Returns the application review of this acc cer body mng req two.
	 *
	 * @return the application review of this acc cer body mng req two
	 */
	@Override
	public String getApplicationReview() {
		return model.getApplicationReview();
	}

	/**
	 * Returns the assessment plan of this acc cer body mng req two.
	 *
	 * @return the assessment plan of this acc cer body mng req two
	 */
	@Override
	public String getAssessmentPlan() {
		return model.getAssessmentPlan();
	}

	/**
	 * Returns the certi agreement of this acc cer body mng req two.
	 *
	 * @return the certi agreement of this acc cer body mng req two
	 */
	@Override
	public String getCertiAgreement() {
		return model.getCertiAgreement();
	}

	/**
	 * Returns the certification decision of this acc cer body mng req two.
	 *
	 * @return the certification decision of this acc cer body mng req two
	 */
	@Override
	public String getCertificationDecision() {
		return model.getCertificationDecision();
	}

	/**
	 * Returns the certification doc of this acc cer body mng req two.
	 *
	 * @return the certification doc of this acc cer body mng req two
	 */
	@Override
	public String getCertificationDoc() {
		return model.getCertificationDoc();
	}

	/**
	 * Returns the certification scheme of this acc cer body mng req two.
	 *
	 * @return the certification scheme of this acc cer body mng req two
	 */
	@Override
	public String getCertificationScheme() {
		return model.getCertificationScheme();
	}

	/**
	 * Returns the company ID of this acc cer body mng req two.
	 *
	 * @return the company ID of this acc cer body mng req two
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the confidentiality of this acc cer body mng req two.
	 *
	 * @return the confidentiality of this acc cer body mng req two
	 */
	@Override
	public String getConfidentiality() {
		return model.getConfidentiality();
	}

	/**
	 * Returns the contract body of this acc cer body mng req two.
	 *
	 * @return the contract body of this acc cer body mng req two
	 */
	@Override
	public String getContractBody() {
		return model.getContractBody();
	}

	/**
	 * Returns the contract examiner of this acc cer body mng req two.
	 *
	 * @return the contract examiner of this acc cer body mng req two
	 */
	@Override
	public String getContractExaminer() {
		return model.getContractExaminer();
	}

	/**
	 * Returns the corrective action of this acc cer body mng req two.
	 *
	 * @return the corrective action of this acc cer body mng req two
	 */
	@Override
	public String getCorrectiveAction() {
		return model.getCorrectiveAction();
	}

	/**
	 * Returns the create date of this acc cer body mng req two.
	 *
	 * @return the create date of this acc cer body mng req two
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the doc control of this acc cer body mng req two.
	 *
	 * @return the doc control of this acc cer body mng req two
	 */
	@Override
	public String getDocControl() {
		return model.getDocControl();
	}

	/**
	 * Returns the doc in keeping of this acc cer body mng req two.
	 *
	 * @return the doc in keeping of this acc cer body mng req two
	 */
	@Override
	public String getDocInKeeping() {
		return model.getDocInKeeping();
	}

	/**
	 * Returns the doc policies of this acc cer body mng req two.
	 *
	 * @return the doc policies of this acc cer body mng req two
	 */
	@Override
	public String getDocPolicies() {
		return model.getDocPolicies();
	}

	/**
	 * Returns the examination process of this acc cer body mng req two.
	 *
	 * @return the examination process of this acc cer body mng req two
	 */
	@Override
	public String getExaminationProcess() {
		return model.getExaminationProcess();
	}

	/**
	 * Returns the formal rules of this acc cer body mng req two.
	 *
	 * @return the formal rules of this acc cer body mng req two
	 */
	@Override
	public String getFormalRules() {
		return model.getFormalRules();
	}

	/**
	 * Returns the general manage of this acc cer body mng req two.
	 *
	 * @return the general manage of this acc cer body mng req two
	 */
	@Override
	public String getGeneralManage() {
		return model.getGeneralManage();
	}

	/**
	 * Returns the group ID of this acc cer body mng req two.
	 *
	 * @return the group ID of this acc cer body mng req two
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the handling appeals of this acc cer body mng req two.
	 *
	 * @return the handling appeals of this acc cer body mng req two
	 */
	@Override
	public String getHandlingAppeals() {
		return model.getHandlingAppeals();
	}

	/**
	 * Returns the handling complaints of this acc cer body mng req two.
	 *
	 * @return the handling complaints of this acc cer body mng req two
	 */
	@Override
	public String getHandlingComplaints() {
		return model.getHandlingComplaints();
	}

	/**
	 * Returns the info provided of this acc cer body mng req two.
	 *
	 * @return the info provided of this acc cer body mng req two
	 */
	@Override
	public String getInfoProvided() {
		return model.getInfoProvided();
	}

	/**
	 * Returns the internal audit of this acc cer body mng req two.
	 *
	 * @return the internal audit of this acc cer body mng req two
	 */
	@Override
	public String getInternalAudit() {
		return model.getInternalAudit();
	}

	/**
	 * Returns the janaac application ID of this acc cer body mng req two.
	 *
	 * @return the janaac application ID of this acc cer body mng req two
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the management proc of this acc cer body mng req two.
	 *
	 * @return the management proc of this acc cer body mng req two
	 */
	@Override
	public String getManagementProc() {
		return model.getManagementProc();
	}

	/**
	 * Returns the manage review of this acc cer body mng req two.
	 *
	 * @return the manage review of this acc cer body mng req two
	 */
	@Override
	public String getManageReview() {
		return model.getManageReview();
	}

	/**
	 * Returns the modified date of this acc cer body mng req two.
	 *
	 * @return the modified date of this acc cer body mng req two
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the option follow of this acc cer body mng req two.
	 *
	 * @return the option follow of this acc cer body mng req two
	 */
	@Override
	public String getOptionFollow() {
		return model.getOptionFollow();
	}

	/**
	 * Returns the org structure of this acc cer body mng req two.
	 *
	 * @return the org structure of this acc cer body mng req two
	 */
	@Override
	public String getOrgStructure() {
		return model.getOrgStructure();
	}

	/**
	 * Returns the pre requisites of this acc cer body mng req two.
	 *
	 * @return the pre requisites of this acc cer body mng req two
	 */
	@Override
	public String getPreRequisites() {
		return model.getPreRequisites();
	}

	/**
	 * Returns the preventive action of this acc cer body mng req two.
	 *
	 * @return the preventive action of this acc cer body mng req two
	 */
	@Override
	public String getPreventiveAction() {
		return model.getPreventiveAction();
	}

	/**
	 * Returns the primary key of this acc cer body mng req two.
	 *
	 * @return the primary key of this acc cer body mng req two
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the process to receive of this acc cer body mng req two.
	 *
	 * @return the process to receive of this acc cer body mng req two
	 */
	@Override
	public String getProcessToReceive() {
		return model.getProcessToReceive();
	}

	/**
	 * Returns the q m ref appli form of this acc cer body mng req two.
	 *
	 * @return the q m ref appli form of this acc cer body mng req two
	 */
	@Override
	public String getQMRefAppliForm() {
		return model.getQMRefAppliForm();
	}

	/**
	 * Returns the q m ref appli review of this acc cer body mng req two.
	 *
	 * @return the q m ref appli review of this acc cer body mng req two
	 */
	@Override
	public String getQMRefAppliReview() {
		return model.getQMRefAppliReview();
	}

	/**
	 * Returns the q m ref assessment plan of this acc cer body mng req two.
	 *
	 * @return the q m ref assessment plan of this acc cer body mng req two
	 */
	@Override
	public String getQMRefAssessmentPlan() {
		return model.getQMRefAssessmentPlan();
	}

	/**
	 * Returns the q m ref certi agreement of this acc cer body mng req two.
	 *
	 * @return the q m ref certi agreement of this acc cer body mng req two
	 */
	@Override
	public String getQMRefCertiAgreement() {
		return model.getQMRefCertiAgreement();
	}

	/**
	 * Returns the q m ref certi decision of this acc cer body mng req two.
	 *
	 * @return the q m ref certi decision of this acc cer body mng req two
	 */
	@Override
	public String getQMRefCertiDecision() {
		return model.getQMRefCertiDecision();
	}

	/**
	 * Returns the q m ref certi doc of this acc cer body mng req two.
	 *
	 * @return the q m ref certi doc of this acc cer body mng req two
	 */
	@Override
	public String getQMRefCertiDoc() {
		return model.getQMRefCertiDoc();
	}

	/**
	 * Returns the q m ref certifi scheme of this acc cer body mng req two.
	 *
	 * @return the q m ref certifi scheme of this acc cer body mng req two
	 */
	@Override
	public String getQMRefCertifiScheme() {
		return model.getQMRefCertifiScheme();
	}

	/**
	 * Returns the q m ref confidentiality of this acc cer body mng req two.
	 *
	 * @return the q m ref confidentiality of this acc cer body mng req two
	 */
	@Override
	public String getQMRefConfidentiality() {
		return model.getQMRefConfidentiality();
	}

	/**
	 * Returns the q m ref contract body of this acc cer body mng req two.
	 *
	 * @return the q m ref contract body of this acc cer body mng req two
	 */
	@Override
	public String getQMRefContractBody() {
		return model.getQMRefContractBody();
	}

	/**
	 * Returns the q m ref corrective of this acc cer body mng req two.
	 *
	 * @return the q m ref corrective of this acc cer body mng req two
	 */
	@Override
	public String getQMRefCorrective() {
		return model.getQMRefCorrective();
	}

	/**
	 * Returns the q m ref doc control of this acc cer body mng req two.
	 *
	 * @return the q m ref doc control of this acc cer body mng req two
	 */
	@Override
	public String getQMRefDocControl() {
		return model.getQMRefDocControl();
	}

	/**
	 * Returns the q m ref doc in keeping of this acc cer body mng req two.
	 *
	 * @return the q m ref doc in keeping of this acc cer body mng req two
	 */
	@Override
	public String getQMRefDocInKeeping() {
		return model.getQMRefDocInKeeping();
	}

	/**
	 * Returns the q m ref doc policies of this acc cer body mng req two.
	 *
	 * @return the q m ref doc policies of this acc cer body mng req two
	 */
	@Override
	public String getQMRefDocPolicies() {
		return model.getQMRefDocPolicies();
	}

	/**
	 * Returns the q m ref examiner of this acc cer body mng req two.
	 *
	 * @return the q m ref examiner of this acc cer body mng req two
	 */
	@Override
	public String getQMRefExaminer() {
		return model.getQMRefExaminer();
	}

	/**
	 * Returns the q m ref exam process of this acc cer body mng req two.
	 *
	 * @return the q m ref exam process of this acc cer body mng req two
	 */
	@Override
	public String getQMRefExamProcess() {
		return model.getQMRefExamProcess();
	}

	/**
	 * Returns the q m ref formal rules of this acc cer body mng req two.
	 *
	 * @return the q m ref formal rules of this acc cer body mng req two
	 */
	@Override
	public String getQMRefFormalRules() {
		return model.getQMRefFormalRules();
	}

	/**
	 * Returns the q m ref general of this acc cer body mng req two.
	 *
	 * @return the q m ref general of this acc cer body mng req two
	 */
	@Override
	public String getQMRefGeneral() {
		return model.getQMRefGeneral();
	}

	/**
	 * Returns the q m ref handling appeals of this acc cer body mng req two.
	 *
	 * @return the q m ref handling appeals of this acc cer body mng req two
	 */
	@Override
	public String getQMRefHandlingAppeals() {
		return model.getQMRefHandlingAppeals();
	}

	/**
	 * Returns the q m ref handling complaint of this acc cer body mng req two.
	 *
	 * @return the q m ref handling complaint of this acc cer body mng req two
	 */
	@Override
	public String getQMRefHandlingComplaint() {
		return model.getQMRefHandlingComplaint();
	}

	/**
	 * Returns the q m ref info provided of this acc cer body mng req two.
	 *
	 * @return the q m ref info provided of this acc cer body mng req two
	 */
	@Override
	public String getQMRefInfoProvided() {
		return model.getQMRefInfoProvided();
	}

	/**
	 * Returns the q m ref internal of this acc cer body mng req two.
	 *
	 * @return the q m ref internal of this acc cer body mng req two
	 */
	@Override
	public String getQMRefInternal() {
		return model.getQMRefInternal();
	}

	/**
	 * Returns the q m ref management proc of this acc cer body mng req two.
	 *
	 * @return the q m ref management proc of this acc cer body mng req two
	 */
	@Override
	public String getQMRefManagementProc() {
		return model.getQMRefManagementProc();
	}

	/**
	 * Returns the q m ref manage review of this acc cer body mng req two.
	 *
	 * @return the q m ref manage review of this acc cer body mng req two
	 */
	@Override
	public String getQMRefManageReview() {
		return model.getQMRefManageReview();
	}

	/**
	 * Returns the q m ref org structure of this acc cer body mng req two.
	 *
	 * @return the q m ref org structure of this acc cer body mng req two
	 */
	@Override
	public String getQMRefOrgStructure() {
		return model.getQMRefOrgStructure();
	}

	/**
	 * Returns the q m ref prerequisites of this acc cer body mng req two.
	 *
	 * @return the q m ref prerequisites of this acc cer body mng req two
	 */
	@Override
	public String getQMRefPrerequisites() {
		return model.getQMRefPrerequisites();
	}

	/**
	 * Returns the q m ref preventive of this acc cer body mng req two.
	 *
	 * @return the q m ref preventive of this acc cer body mng req two
	 */
	@Override
	public String getQMRefPreventive() {
		return model.getQMRefPreventive();
	}

	/**
	 * Returns the q m ref rec control of this acc cer body mng req two.
	 *
	 * @return the q m ref rec control of this acc cer body mng req two
	 */
	@Override
	public String getQMRefRecControl() {
		return model.getQMRefRecControl();
	}

	/**
	 * Returns the q m ref receive process of this acc cer body mng req two.
	 *
	 * @return the q m ref receive process of this acc cer body mng req two
	 */
	@Override
	public String getQMRefReceiveProcess() {
		return model.getQMRefReceiveProcess();
	}

	/**
	 * Returns the q m ref risk of this acc cer body mng req two.
	 *
	 * @return the q m ref risk of this acc cer body mng req two
	 */
	@Override
	public String getQMRefRisk() {
		return model.getQMRefRisk();
	}

	/**
	 * Returns the q m ref safeguarding of this acc cer body mng req two.
	 *
	 * @return the q m ref safeguarding of this acc cer body mng req two
	 */
	@Override
	public String getQMRefSafeguarding() {
		return model.getQMRefSafeguarding();
	}

	/**
	 * Returns the q m ref security of this acc cer body mng req two.
	 *
	 * @return the q m ref security of this acc cer body mng req two
	 */
	@Override
	public String getQMRefSecurity() {
		return model.getQMRefSecurity();
	}

	/**
	 * Returns the q m ref specified of this acc cer body mng req two.
	 *
	 * @return the q m ref specified of this acc cer body mng req two
	 */
	@Override
	public String getQMRefSpecified() {
		return model.getQMRefSpecified();
	}

	/**
	 * Returns the q m ref suspension of this acc cer body mng req two.
	 *
	 * @return the q m ref suspension of this acc cer body mng req two
	 */
	@Override
	public String getQMRefSuspension() {
		return model.getQMRefSuspension();
	}

	/**
	 * Returns the q m ref use of certificate of this acc cer body mng req two.
	 *
	 * @return the q m ref use of certificate of this acc cer body mng req two
	 */
	@Override
	public String getQMRefUseOfCertificate() {
		return model.getQMRefUseOfCertificate();
	}

	/**
	 * Returns the q m ref valid certification of this acc cer body mng req two.
	 *
	 * @return the q m ref valid certification of this acc cer body mng req two
	 */
	@Override
	public String getQMRefValidCertification() {
		return model.getQMRefValidCertification();
	}

	/**
	 * Returns the record control of this acc cer body mng req two.
	 *
	 * @return the record control of this acc cer body mng req two
	 */
	@Override
	public String getRecordControl() {
		return model.getRecordControl();
	}

	/**
	 * Returns the risk assessment of this acc cer body mng req two.
	 *
	 * @return the risk assessment of this acc cer body mng req two
	 */
	@Override
	public String getRiskAssessment() {
		return model.getRiskAssessment();
	}

	/**
	 * Returns the safeguarding mechanism of this acc cer body mng req two.
	 *
	 * @return the safeguarding mechanism of this acc cer body mng req two
	 */
	@Override
	public String getSafeguardingMechanism() {
		return model.getSafeguardingMechanism();
	}

	/**
	 * Returns the security of this acc cer body mng req two.
	 *
	 * @return the security of this acc cer body mng req two
	 */
	@Override
	public String getSecurity() {
		return model.getSecurity();
	}

	/**
	 * Returns the specified standard of this acc cer body mng req two.
	 *
	 * @return the specified standard of this acc cer body mng req two
	 */
	@Override
	public String getSpecifiedStandard() {
		return model.getSpecifiedStandard();
	}

	/**
	 * Returns the suspension of this acc cer body mng req two.
	 *
	 * @return the suspension of this acc cer body mng req two
	 */
	@Override
	public String getSuspension() {
		return model.getSuspension();
	}

	/**
	 * Returns the use of certificates of this acc cer body mng req two.
	 *
	 * @return the use of certificates of this acc cer body mng req two
	 */
	@Override
	public String getUseOfCertificates() {
		return model.getUseOfCertificates();
	}

	/**
	 * Returns the user ID of this acc cer body mng req two.
	 *
	 * @return the user ID of this acc cer body mng req two
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acc cer body mng req two.
	 *
	 * @return the user name of this acc cer body mng req two
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acc cer body mng req two.
	 *
	 * @return the user uuid of this acc cer body mng req two
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this acc cer body mng req two.
	 *
	 * @return the uuid of this acc cer body mng req two
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the valid certification of this acc cer body mng req two.
	 *
	 * @return the valid certification of this acc cer body mng req two
	 */
	@Override
	public String getValidCertification() {
		return model.getValidCertification();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the acc cer body mng req two ID of this acc cer body mng req two.
	 *
	 * @param accCerBodyMngReqTwoId the acc cer body mng req two ID of this acc cer body mng req two
	 */
	@Override
	public void setAccCerBodyMngReqTwoId(long accCerBodyMngReqTwoId) {
		model.setAccCerBodyMngReqTwoId(accCerBodyMngReqTwoId);
	}

	/**
	 * Sets the application form of this acc cer body mng req two.
	 *
	 * @param applicationForm the application form of this acc cer body mng req two
	 */
	@Override
	public void setApplicationForm(String applicationForm) {
		model.setApplicationForm(applicationForm);
	}

	/**
	 * Sets the application review of this acc cer body mng req two.
	 *
	 * @param applicationReview the application review of this acc cer body mng req two
	 */
	@Override
	public void setApplicationReview(String applicationReview) {
		model.setApplicationReview(applicationReview);
	}

	/**
	 * Sets the assessment plan of this acc cer body mng req two.
	 *
	 * @param assessmentPlan the assessment plan of this acc cer body mng req two
	 */
	@Override
	public void setAssessmentPlan(String assessmentPlan) {
		model.setAssessmentPlan(assessmentPlan);
	}

	/**
	 * Sets the certi agreement of this acc cer body mng req two.
	 *
	 * @param certiAgreement the certi agreement of this acc cer body mng req two
	 */
	@Override
	public void setCertiAgreement(String certiAgreement) {
		model.setCertiAgreement(certiAgreement);
	}

	/**
	 * Sets the certification decision of this acc cer body mng req two.
	 *
	 * @param certificationDecision the certification decision of this acc cer body mng req two
	 */
	@Override
	public void setCertificationDecision(String certificationDecision) {
		model.setCertificationDecision(certificationDecision);
	}

	/**
	 * Sets the certification doc of this acc cer body mng req two.
	 *
	 * @param certificationDoc the certification doc of this acc cer body mng req two
	 */
	@Override
	public void setCertificationDoc(String certificationDoc) {
		model.setCertificationDoc(certificationDoc);
	}

	/**
	 * Sets the certification scheme of this acc cer body mng req two.
	 *
	 * @param certificationScheme the certification scheme of this acc cer body mng req two
	 */
	@Override
	public void setCertificationScheme(String certificationScheme) {
		model.setCertificationScheme(certificationScheme);
	}

	/**
	 * Sets the company ID of this acc cer body mng req two.
	 *
	 * @param companyId the company ID of this acc cer body mng req two
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the confidentiality of this acc cer body mng req two.
	 *
	 * @param confidentiality the confidentiality of this acc cer body mng req two
	 */
	@Override
	public void setConfidentiality(String confidentiality) {
		model.setConfidentiality(confidentiality);
	}

	/**
	 * Sets the contract body of this acc cer body mng req two.
	 *
	 * @param contractBody the contract body of this acc cer body mng req two
	 */
	@Override
	public void setContractBody(String contractBody) {
		model.setContractBody(contractBody);
	}

	/**
	 * Sets the contract examiner of this acc cer body mng req two.
	 *
	 * @param contractExaminer the contract examiner of this acc cer body mng req two
	 */
	@Override
	public void setContractExaminer(String contractExaminer) {
		model.setContractExaminer(contractExaminer);
	}

	/**
	 * Sets the corrective action of this acc cer body mng req two.
	 *
	 * @param correctiveAction the corrective action of this acc cer body mng req two
	 */
	@Override
	public void setCorrectiveAction(String correctiveAction) {
		model.setCorrectiveAction(correctiveAction);
	}

	/**
	 * Sets the create date of this acc cer body mng req two.
	 *
	 * @param createDate the create date of this acc cer body mng req two
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the doc control of this acc cer body mng req two.
	 *
	 * @param docControl the doc control of this acc cer body mng req two
	 */
	@Override
	public void setDocControl(String docControl) {
		model.setDocControl(docControl);
	}

	/**
	 * Sets the doc in keeping of this acc cer body mng req two.
	 *
	 * @param docInKeeping the doc in keeping of this acc cer body mng req two
	 */
	@Override
	public void setDocInKeeping(String docInKeeping) {
		model.setDocInKeeping(docInKeeping);
	}

	/**
	 * Sets the doc policies of this acc cer body mng req two.
	 *
	 * @param docPolicies the doc policies of this acc cer body mng req two
	 */
	@Override
	public void setDocPolicies(String docPolicies) {
		model.setDocPolicies(docPolicies);
	}

	/**
	 * Sets the examination process of this acc cer body mng req two.
	 *
	 * @param examinationProcess the examination process of this acc cer body mng req two
	 */
	@Override
	public void setExaminationProcess(String examinationProcess) {
		model.setExaminationProcess(examinationProcess);
	}

	/**
	 * Sets the formal rules of this acc cer body mng req two.
	 *
	 * @param formalRules the formal rules of this acc cer body mng req two
	 */
	@Override
	public void setFormalRules(String formalRules) {
		model.setFormalRules(formalRules);
	}

	/**
	 * Sets the general manage of this acc cer body mng req two.
	 *
	 * @param generalManage the general manage of this acc cer body mng req two
	 */
	@Override
	public void setGeneralManage(String generalManage) {
		model.setGeneralManage(generalManage);
	}

	/**
	 * Sets the group ID of this acc cer body mng req two.
	 *
	 * @param groupId the group ID of this acc cer body mng req two
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the handling appeals of this acc cer body mng req two.
	 *
	 * @param handlingAppeals the handling appeals of this acc cer body mng req two
	 */
	@Override
	public void setHandlingAppeals(String handlingAppeals) {
		model.setHandlingAppeals(handlingAppeals);
	}

	/**
	 * Sets the handling complaints of this acc cer body mng req two.
	 *
	 * @param handlingComplaints the handling complaints of this acc cer body mng req two
	 */
	@Override
	public void setHandlingComplaints(String handlingComplaints) {
		model.setHandlingComplaints(handlingComplaints);
	}

	/**
	 * Sets the info provided of this acc cer body mng req two.
	 *
	 * @param infoProvided the info provided of this acc cer body mng req two
	 */
	@Override
	public void setInfoProvided(String infoProvided) {
		model.setInfoProvided(infoProvided);
	}

	/**
	 * Sets the internal audit of this acc cer body mng req two.
	 *
	 * @param internalAudit the internal audit of this acc cer body mng req two
	 */
	@Override
	public void setInternalAudit(String internalAudit) {
		model.setInternalAudit(internalAudit);
	}

	/**
	 * Sets the janaac application ID of this acc cer body mng req two.
	 *
	 * @param janaacApplicationId the janaac application ID of this acc cer body mng req two
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the management proc of this acc cer body mng req two.
	 *
	 * @param managementProc the management proc of this acc cer body mng req two
	 */
	@Override
	public void setManagementProc(String managementProc) {
		model.setManagementProc(managementProc);
	}

	/**
	 * Sets the manage review of this acc cer body mng req two.
	 *
	 * @param manageReview the manage review of this acc cer body mng req two
	 */
	@Override
	public void setManageReview(String manageReview) {
		model.setManageReview(manageReview);
	}

	/**
	 * Sets the modified date of this acc cer body mng req two.
	 *
	 * @param modifiedDate the modified date of this acc cer body mng req two
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the option follow of this acc cer body mng req two.
	 *
	 * @param optionFollow the option follow of this acc cer body mng req two
	 */
	@Override
	public void setOptionFollow(String optionFollow) {
		model.setOptionFollow(optionFollow);
	}

	/**
	 * Sets the org structure of this acc cer body mng req two.
	 *
	 * @param orgStructure the org structure of this acc cer body mng req two
	 */
	@Override
	public void setOrgStructure(String orgStructure) {
		model.setOrgStructure(orgStructure);
	}

	/**
	 * Sets the pre requisites of this acc cer body mng req two.
	 *
	 * @param preRequisites the pre requisites of this acc cer body mng req two
	 */
	@Override
	public void setPreRequisites(String preRequisites) {
		model.setPreRequisites(preRequisites);
	}

	/**
	 * Sets the preventive action of this acc cer body mng req two.
	 *
	 * @param preventiveAction the preventive action of this acc cer body mng req two
	 */
	@Override
	public void setPreventiveAction(String preventiveAction) {
		model.setPreventiveAction(preventiveAction);
	}

	/**
	 * Sets the primary key of this acc cer body mng req two.
	 *
	 * @param primaryKey the primary key of this acc cer body mng req two
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the process to receive of this acc cer body mng req two.
	 *
	 * @param processToReceive the process to receive of this acc cer body mng req two
	 */
	@Override
	public void setProcessToReceive(String processToReceive) {
		model.setProcessToReceive(processToReceive);
	}

	/**
	 * Sets the q m ref appli form of this acc cer body mng req two.
	 *
	 * @param qMRefAppliForm the q m ref appli form of this acc cer body mng req two
	 */
	@Override
	public void setQMRefAppliForm(String qMRefAppliForm) {
		model.setQMRefAppliForm(qMRefAppliForm);
	}

	/**
	 * Sets the q m ref appli review of this acc cer body mng req two.
	 *
	 * @param qMRefAppliReview the q m ref appli review of this acc cer body mng req two
	 */
	@Override
	public void setQMRefAppliReview(String qMRefAppliReview) {
		model.setQMRefAppliReview(qMRefAppliReview);
	}

	/**
	 * Sets the q m ref assessment plan of this acc cer body mng req two.
	 *
	 * @param qMRefAssessmentPlan the q m ref assessment plan of this acc cer body mng req two
	 */
	@Override
	public void setQMRefAssessmentPlan(String qMRefAssessmentPlan) {
		model.setQMRefAssessmentPlan(qMRefAssessmentPlan);
	}

	/**
	 * Sets the q m ref certi agreement of this acc cer body mng req two.
	 *
	 * @param qMRefCertiAgreement the q m ref certi agreement of this acc cer body mng req two
	 */
	@Override
	public void setQMRefCertiAgreement(String qMRefCertiAgreement) {
		model.setQMRefCertiAgreement(qMRefCertiAgreement);
	}

	/**
	 * Sets the q m ref certi decision of this acc cer body mng req two.
	 *
	 * @param qMRefCertiDecision the q m ref certi decision of this acc cer body mng req two
	 */
	@Override
	public void setQMRefCertiDecision(String qMRefCertiDecision) {
		model.setQMRefCertiDecision(qMRefCertiDecision);
	}

	/**
	 * Sets the q m ref certi doc of this acc cer body mng req two.
	 *
	 * @param qMRefCertiDoc the q m ref certi doc of this acc cer body mng req two
	 */
	@Override
	public void setQMRefCertiDoc(String qMRefCertiDoc) {
		model.setQMRefCertiDoc(qMRefCertiDoc);
	}

	/**
	 * Sets the q m ref certifi scheme of this acc cer body mng req two.
	 *
	 * @param qMRefCertifiScheme the q m ref certifi scheme of this acc cer body mng req two
	 */
	@Override
	public void setQMRefCertifiScheme(String qMRefCertifiScheme) {
		model.setQMRefCertifiScheme(qMRefCertifiScheme);
	}

	/**
	 * Sets the q m ref confidentiality of this acc cer body mng req two.
	 *
	 * @param qMRefConfidentiality the q m ref confidentiality of this acc cer body mng req two
	 */
	@Override
	public void setQMRefConfidentiality(String qMRefConfidentiality) {
		model.setQMRefConfidentiality(qMRefConfidentiality);
	}

	/**
	 * Sets the q m ref contract body of this acc cer body mng req two.
	 *
	 * @param qMRefContractBody the q m ref contract body of this acc cer body mng req two
	 */
	@Override
	public void setQMRefContractBody(String qMRefContractBody) {
		model.setQMRefContractBody(qMRefContractBody);
	}

	/**
	 * Sets the q m ref corrective of this acc cer body mng req two.
	 *
	 * @param qMRefCorrective the q m ref corrective of this acc cer body mng req two
	 */
	@Override
	public void setQMRefCorrective(String qMRefCorrective) {
		model.setQMRefCorrective(qMRefCorrective);
	}

	/**
	 * Sets the q m ref doc control of this acc cer body mng req two.
	 *
	 * @param qMRefDocControl the q m ref doc control of this acc cer body mng req two
	 */
	@Override
	public void setQMRefDocControl(String qMRefDocControl) {
		model.setQMRefDocControl(qMRefDocControl);
	}

	/**
	 * Sets the q m ref doc in keeping of this acc cer body mng req two.
	 *
	 * @param qMRefDocInKeeping the q m ref doc in keeping of this acc cer body mng req two
	 */
	@Override
	public void setQMRefDocInKeeping(String qMRefDocInKeeping) {
		model.setQMRefDocInKeeping(qMRefDocInKeeping);
	}

	/**
	 * Sets the q m ref doc policies of this acc cer body mng req two.
	 *
	 * @param qMRefDocPolicies the q m ref doc policies of this acc cer body mng req two
	 */
	@Override
	public void setQMRefDocPolicies(String qMRefDocPolicies) {
		model.setQMRefDocPolicies(qMRefDocPolicies);
	}

	/**
	 * Sets the q m ref examiner of this acc cer body mng req two.
	 *
	 * @param qMRefExaminer the q m ref examiner of this acc cer body mng req two
	 */
	@Override
	public void setQMRefExaminer(String qMRefExaminer) {
		model.setQMRefExaminer(qMRefExaminer);
	}

	/**
	 * Sets the q m ref exam process of this acc cer body mng req two.
	 *
	 * @param qMRefExamProcess the q m ref exam process of this acc cer body mng req two
	 */
	@Override
	public void setQMRefExamProcess(String qMRefExamProcess) {
		model.setQMRefExamProcess(qMRefExamProcess);
	}

	/**
	 * Sets the q m ref formal rules of this acc cer body mng req two.
	 *
	 * @param qMRefFormalRules the q m ref formal rules of this acc cer body mng req two
	 */
	@Override
	public void setQMRefFormalRules(String qMRefFormalRules) {
		model.setQMRefFormalRules(qMRefFormalRules);
	}

	/**
	 * Sets the q m ref general of this acc cer body mng req two.
	 *
	 * @param qMRefGeneral the q m ref general of this acc cer body mng req two
	 */
	@Override
	public void setQMRefGeneral(String qMRefGeneral) {
		model.setQMRefGeneral(qMRefGeneral);
	}

	/**
	 * Sets the q m ref handling appeals of this acc cer body mng req two.
	 *
	 * @param qMRefHandlingAppeals the q m ref handling appeals of this acc cer body mng req two
	 */
	@Override
	public void setQMRefHandlingAppeals(String qMRefHandlingAppeals) {
		model.setQMRefHandlingAppeals(qMRefHandlingAppeals);
	}

	/**
	 * Sets the q m ref handling complaint of this acc cer body mng req two.
	 *
	 * @param qMRefHandlingComplaint the q m ref handling complaint of this acc cer body mng req two
	 */
	@Override
	public void setQMRefHandlingComplaint(String qMRefHandlingComplaint) {
		model.setQMRefHandlingComplaint(qMRefHandlingComplaint);
	}

	/**
	 * Sets the q m ref info provided of this acc cer body mng req two.
	 *
	 * @param qMRefInfoProvided the q m ref info provided of this acc cer body mng req two
	 */
	@Override
	public void setQMRefInfoProvided(String qMRefInfoProvided) {
		model.setQMRefInfoProvided(qMRefInfoProvided);
	}

	/**
	 * Sets the q m ref internal of this acc cer body mng req two.
	 *
	 * @param qMRefInternal the q m ref internal of this acc cer body mng req two
	 */
	@Override
	public void setQMRefInternal(String qMRefInternal) {
		model.setQMRefInternal(qMRefInternal);
	}

	/**
	 * Sets the q m ref management proc of this acc cer body mng req two.
	 *
	 * @param qMRefManagementProc the q m ref management proc of this acc cer body mng req two
	 */
	@Override
	public void setQMRefManagementProc(String qMRefManagementProc) {
		model.setQMRefManagementProc(qMRefManagementProc);
	}

	/**
	 * Sets the q m ref manage review of this acc cer body mng req two.
	 *
	 * @param qMRefManageReview the q m ref manage review of this acc cer body mng req two
	 */
	@Override
	public void setQMRefManageReview(String qMRefManageReview) {
		model.setQMRefManageReview(qMRefManageReview);
	}

	/**
	 * Sets the q m ref org structure of this acc cer body mng req two.
	 *
	 * @param qMRefOrgStructure the q m ref org structure of this acc cer body mng req two
	 */
	@Override
	public void setQMRefOrgStructure(String qMRefOrgStructure) {
		model.setQMRefOrgStructure(qMRefOrgStructure);
	}

	/**
	 * Sets the q m ref prerequisites of this acc cer body mng req two.
	 *
	 * @param qMRefPrerequisites the q m ref prerequisites of this acc cer body mng req two
	 */
	@Override
	public void setQMRefPrerequisites(String qMRefPrerequisites) {
		model.setQMRefPrerequisites(qMRefPrerequisites);
	}

	/**
	 * Sets the q m ref preventive of this acc cer body mng req two.
	 *
	 * @param qMRefPreventive the q m ref preventive of this acc cer body mng req two
	 */
	@Override
	public void setQMRefPreventive(String qMRefPreventive) {
		model.setQMRefPreventive(qMRefPreventive);
	}

	/**
	 * Sets the q m ref rec control of this acc cer body mng req two.
	 *
	 * @param qMRefRecControl the q m ref rec control of this acc cer body mng req two
	 */
	@Override
	public void setQMRefRecControl(String qMRefRecControl) {
		model.setQMRefRecControl(qMRefRecControl);
	}

	/**
	 * Sets the q m ref receive process of this acc cer body mng req two.
	 *
	 * @param qMRefReceiveProcess the q m ref receive process of this acc cer body mng req two
	 */
	@Override
	public void setQMRefReceiveProcess(String qMRefReceiveProcess) {
		model.setQMRefReceiveProcess(qMRefReceiveProcess);
	}

	/**
	 * Sets the q m ref risk of this acc cer body mng req two.
	 *
	 * @param qMRefRisk the q m ref risk of this acc cer body mng req two
	 */
	@Override
	public void setQMRefRisk(String qMRefRisk) {
		model.setQMRefRisk(qMRefRisk);
	}

	/**
	 * Sets the q m ref safeguarding of this acc cer body mng req two.
	 *
	 * @param qMRefSafeguarding the q m ref safeguarding of this acc cer body mng req two
	 */
	@Override
	public void setQMRefSafeguarding(String qMRefSafeguarding) {
		model.setQMRefSafeguarding(qMRefSafeguarding);
	}

	/**
	 * Sets the q m ref security of this acc cer body mng req two.
	 *
	 * @param qMRefSecurity the q m ref security of this acc cer body mng req two
	 */
	@Override
	public void setQMRefSecurity(String qMRefSecurity) {
		model.setQMRefSecurity(qMRefSecurity);
	}

	/**
	 * Sets the q m ref specified of this acc cer body mng req two.
	 *
	 * @param qMRefSpecified the q m ref specified of this acc cer body mng req two
	 */
	@Override
	public void setQMRefSpecified(String qMRefSpecified) {
		model.setQMRefSpecified(qMRefSpecified);
	}

	/**
	 * Sets the q m ref suspension of this acc cer body mng req two.
	 *
	 * @param qMRefSuspension the q m ref suspension of this acc cer body mng req two
	 */
	@Override
	public void setQMRefSuspension(String qMRefSuspension) {
		model.setQMRefSuspension(qMRefSuspension);
	}

	/**
	 * Sets the q m ref use of certificate of this acc cer body mng req two.
	 *
	 * @param qMRefUseOfCertificate the q m ref use of certificate of this acc cer body mng req two
	 */
	@Override
	public void setQMRefUseOfCertificate(String qMRefUseOfCertificate) {
		model.setQMRefUseOfCertificate(qMRefUseOfCertificate);
	}

	/**
	 * Sets the q m ref valid certification of this acc cer body mng req two.
	 *
	 * @param qMRefValidCertification the q m ref valid certification of this acc cer body mng req two
	 */
	@Override
	public void setQMRefValidCertification(String qMRefValidCertification) {
		model.setQMRefValidCertification(qMRefValidCertification);
	}

	/**
	 * Sets the record control of this acc cer body mng req two.
	 *
	 * @param recordControl the record control of this acc cer body mng req two
	 */
	@Override
	public void setRecordControl(String recordControl) {
		model.setRecordControl(recordControl);
	}

	/**
	 * Sets the risk assessment of this acc cer body mng req two.
	 *
	 * @param riskAssessment the risk assessment of this acc cer body mng req two
	 */
	@Override
	public void setRiskAssessment(String riskAssessment) {
		model.setRiskAssessment(riskAssessment);
	}

	/**
	 * Sets the safeguarding mechanism of this acc cer body mng req two.
	 *
	 * @param safeguardingMechanism the safeguarding mechanism of this acc cer body mng req two
	 */
	@Override
	public void setSafeguardingMechanism(String safeguardingMechanism) {
		model.setSafeguardingMechanism(safeguardingMechanism);
	}

	/**
	 * Sets the security of this acc cer body mng req two.
	 *
	 * @param security the security of this acc cer body mng req two
	 */
	@Override
	public void setSecurity(String security) {
		model.setSecurity(security);
	}

	/**
	 * Sets the specified standard of this acc cer body mng req two.
	 *
	 * @param specifiedStandard the specified standard of this acc cer body mng req two
	 */
	@Override
	public void setSpecifiedStandard(String specifiedStandard) {
		model.setSpecifiedStandard(specifiedStandard);
	}

	/**
	 * Sets the suspension of this acc cer body mng req two.
	 *
	 * @param suspension the suspension of this acc cer body mng req two
	 */
	@Override
	public void setSuspension(String suspension) {
		model.setSuspension(suspension);
	}

	/**
	 * Sets the use of certificates of this acc cer body mng req two.
	 *
	 * @param useOfCertificates the use of certificates of this acc cer body mng req two
	 */
	@Override
	public void setUseOfCertificates(String useOfCertificates) {
		model.setUseOfCertificates(useOfCertificates);
	}

	/**
	 * Sets the user ID of this acc cer body mng req two.
	 *
	 * @param userId the user ID of this acc cer body mng req two
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acc cer body mng req two.
	 *
	 * @param userName the user name of this acc cer body mng req two
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acc cer body mng req two.
	 *
	 * @param userUuid the user uuid of this acc cer body mng req two
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this acc cer body mng req two.
	 *
	 * @param uuid the uuid of this acc cer body mng req two
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the valid certification of this acc cer body mng req two.
	 *
	 * @param validCertification the valid certification of this acc cer body mng req two
	 */
	@Override
	public void setValidCertification(String validCertification) {
		model.setValidCertification(validCertification);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected AccCerBodyMngReqTwoWrapper wrap(
		AccCerBodyMngReqTwo accCerBodyMngReqTwo) {

		return new AccCerBodyMngReqTwoWrapper(accCerBodyMngReqTwo);
	}

}