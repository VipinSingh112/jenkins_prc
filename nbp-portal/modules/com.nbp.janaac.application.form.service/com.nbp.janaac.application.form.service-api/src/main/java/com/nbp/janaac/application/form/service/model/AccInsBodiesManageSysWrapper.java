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
 * This class is a wrapper for {@link AccInsBodiesManageSys}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccInsBodiesManageSys
 * @generated
 */
public class AccInsBodiesManageSysWrapper
	extends BaseModelWrapper<AccInsBodiesManageSys>
	implements AccInsBodiesManageSys, ModelWrapper<AccInsBodiesManageSys> {

	public AccInsBodiesManageSysWrapper(
		AccInsBodiesManageSys accInsBodiesManageSys) {

		super(accInsBodiesManageSys);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("accInsBodiesManageSysId", getAccInsBodiesManageSysId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("optionFollow", getOptionFollow());
		attributes.put("manualApproval", getManualApproval());
		attributes.put("qMRefManual", getQMRefManual());
		attributes.put("relevantPolicies", getRelevantPolicies());
		attributes.put("qMRefRelevant", getQMRefRelevant());
		attributes.put("overallObj", getOverallObj());
		attributes.put("qMRefOverallObj", getQMRefOverallObj());
		attributes.put("supportingProcedure", getSupportingProcedure());
		attributes.put("qMRefSupporting", getQMRefSupporting());
		attributes.put("technicalMangmnt", getTechnicalMangmnt());
		attributes.put("qMRefTechnical", getQMRefTechnical());
		attributes.put("documentation", getDocumentation());
		attributes.put("qMRefDocumentation", getQMRefDocumentation());
		attributes.put("docContolProc", getDocContolProc());
		attributes.put("qMRefDocControl", getQMRefDocControl());
		attributes.put("documntChanges", getDocumntChanges());
		attributes.put("qMRefDocumntChanges", getQMRefDocumntChanges());
		attributes.put("controlOfQuality", getControlOfQuality());
		attributes.put("qMRefControl", getQMRefControl());
		attributes.put("managementReview", getManagementReview());
		attributes.put("qMRefManage", getQMRefManage());
		attributes.put("insInternalAudits", getInsInternalAudits());
		attributes.put("qMRefInternalAudit", getQMRefInternalAudit());
		attributes.put("insCorrectiveAction", getInsCorrectiveAction());
		attributes.put("qMRefCorrect", getQMRefCorrect());
		attributes.put("insPreventiveAction", getInsPreventiveAction());
		attributes.put("qMRefPreventive", getQMRefPreventive());
		attributes.put("personnel", getPersonnel());
		attributes.put("qMRefPersonnel", getQMRefPersonnel());
		attributes.put("equipment", getEquipment());
		attributes.put("qMRefEquip", getQMRefEquip());
		attributes.put("inspection", getInspection());
		attributes.put("qMRefInspection", getQMRefInspection());
		attributes.put("contractualArrange", getContractualArrange());
		attributes.put("qMRefContractual", getQMRefContractual());
		attributes.put("handlingInsItem", getHandlingInsItem());
		attributes.put("qMRefHandling", getQMRefHandling());
		attributes.put("complaintsAppeals", getComplaintsAppeals());
		attributes.put("qMRefComplaints", getQMRefComplaints());
		attributes.put("janaacApplicationId", getJanaacApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long accInsBodiesManageSysId = (Long)attributes.get(
			"accInsBodiesManageSysId");

		if (accInsBodiesManageSysId != null) {
			setAccInsBodiesManageSysId(accInsBodiesManageSysId);
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

		String manualApproval = (String)attributes.get("manualApproval");

		if (manualApproval != null) {
			setManualApproval(manualApproval);
		}

		String qMRefManual = (String)attributes.get("qMRefManual");

		if (qMRefManual != null) {
			setQMRefManual(qMRefManual);
		}

		String relevantPolicies = (String)attributes.get("relevantPolicies");

		if (relevantPolicies != null) {
			setRelevantPolicies(relevantPolicies);
		}

		String qMRefRelevant = (String)attributes.get("qMRefRelevant");

		if (qMRefRelevant != null) {
			setQMRefRelevant(qMRefRelevant);
		}

		String overallObj = (String)attributes.get("overallObj");

		if (overallObj != null) {
			setOverallObj(overallObj);
		}

		String qMRefOverallObj = (String)attributes.get("qMRefOverallObj");

		if (qMRefOverallObj != null) {
			setQMRefOverallObj(qMRefOverallObj);
		}

		String supportingProcedure = (String)attributes.get(
			"supportingProcedure");

		if (supportingProcedure != null) {
			setSupportingProcedure(supportingProcedure);
		}

		String qMRefSupporting = (String)attributes.get("qMRefSupporting");

		if (qMRefSupporting != null) {
			setQMRefSupporting(qMRefSupporting);
		}

		String technicalMangmnt = (String)attributes.get("technicalMangmnt");

		if (technicalMangmnt != null) {
			setTechnicalMangmnt(technicalMangmnt);
		}

		String qMRefTechnical = (String)attributes.get("qMRefTechnical");

		if (qMRefTechnical != null) {
			setQMRefTechnical(qMRefTechnical);
		}

		String documentation = (String)attributes.get("documentation");

		if (documentation != null) {
			setDocumentation(documentation);
		}

		String qMRefDocumentation = (String)attributes.get(
			"qMRefDocumentation");

		if (qMRefDocumentation != null) {
			setQMRefDocumentation(qMRefDocumentation);
		}

		String docContolProc = (String)attributes.get("docContolProc");

		if (docContolProc != null) {
			setDocContolProc(docContolProc);
		}

		String qMRefDocControl = (String)attributes.get("qMRefDocControl");

		if (qMRefDocControl != null) {
			setQMRefDocControl(qMRefDocControl);
		}

		String documntChanges = (String)attributes.get("documntChanges");

		if (documntChanges != null) {
			setDocumntChanges(documntChanges);
		}

		String qMRefDocumntChanges = (String)attributes.get(
			"qMRefDocumntChanges");

		if (qMRefDocumntChanges != null) {
			setQMRefDocumntChanges(qMRefDocumntChanges);
		}

		String controlOfQuality = (String)attributes.get("controlOfQuality");

		if (controlOfQuality != null) {
			setControlOfQuality(controlOfQuality);
		}

		String qMRefControl = (String)attributes.get("qMRefControl");

		if (qMRefControl != null) {
			setQMRefControl(qMRefControl);
		}

		String managementReview = (String)attributes.get("managementReview");

		if (managementReview != null) {
			setManagementReview(managementReview);
		}

		String qMRefManage = (String)attributes.get("qMRefManage");

		if (qMRefManage != null) {
			setQMRefManage(qMRefManage);
		}

		String insInternalAudits = (String)attributes.get("insInternalAudits");

		if (insInternalAudits != null) {
			setInsInternalAudits(insInternalAudits);
		}

		String qMRefInternalAudit = (String)attributes.get(
			"qMRefInternalAudit");

		if (qMRefInternalAudit != null) {
			setQMRefInternalAudit(qMRefInternalAudit);
		}

		String insCorrectiveAction = (String)attributes.get(
			"insCorrectiveAction");

		if (insCorrectiveAction != null) {
			setInsCorrectiveAction(insCorrectiveAction);
		}

		String qMRefCorrect = (String)attributes.get("qMRefCorrect");

		if (qMRefCorrect != null) {
			setQMRefCorrect(qMRefCorrect);
		}

		String insPreventiveAction = (String)attributes.get(
			"insPreventiveAction");

		if (insPreventiveAction != null) {
			setInsPreventiveAction(insPreventiveAction);
		}

		String qMRefPreventive = (String)attributes.get("qMRefPreventive");

		if (qMRefPreventive != null) {
			setQMRefPreventive(qMRefPreventive);
		}

		String personnel = (String)attributes.get("personnel");

		if (personnel != null) {
			setPersonnel(personnel);
		}

		String qMRefPersonnel = (String)attributes.get("qMRefPersonnel");

		if (qMRefPersonnel != null) {
			setQMRefPersonnel(qMRefPersonnel);
		}

		String equipment = (String)attributes.get("equipment");

		if (equipment != null) {
			setEquipment(equipment);
		}

		String qMRefEquip = (String)attributes.get("qMRefEquip");

		if (qMRefEquip != null) {
			setQMRefEquip(qMRefEquip);
		}

		String inspection = (String)attributes.get("inspection");

		if (inspection != null) {
			setInspection(inspection);
		}

		String qMRefInspection = (String)attributes.get("qMRefInspection");

		if (qMRefInspection != null) {
			setQMRefInspection(qMRefInspection);
		}

		String contractualArrange = (String)attributes.get(
			"contractualArrange");

		if (contractualArrange != null) {
			setContractualArrange(contractualArrange);
		}

		String qMRefContractual = (String)attributes.get("qMRefContractual");

		if (qMRefContractual != null) {
			setQMRefContractual(qMRefContractual);
		}

		String handlingInsItem = (String)attributes.get("handlingInsItem");

		if (handlingInsItem != null) {
			setHandlingInsItem(handlingInsItem);
		}

		String qMRefHandling = (String)attributes.get("qMRefHandling");

		if (qMRefHandling != null) {
			setQMRefHandling(qMRefHandling);
		}

		String complaintsAppeals = (String)attributes.get("complaintsAppeals");

		if (complaintsAppeals != null) {
			setComplaintsAppeals(complaintsAppeals);
		}

		String qMRefComplaints = (String)attributes.get("qMRefComplaints");

		if (qMRefComplaints != null) {
			setQMRefComplaints(qMRefComplaints);
		}

		Long janaacApplicationId = (Long)attributes.get("janaacApplicationId");

		if (janaacApplicationId != null) {
			setJanaacApplicationId(janaacApplicationId);
		}
	}

	@Override
	public AccInsBodiesManageSys cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acc ins bodies manage sys ID of this acc ins bodies manage sys.
	 *
	 * @return the acc ins bodies manage sys ID of this acc ins bodies manage sys
	 */
	@Override
	public long getAccInsBodiesManageSysId() {
		return model.getAccInsBodiesManageSysId();
	}

	/**
	 * Returns the company ID of this acc ins bodies manage sys.
	 *
	 * @return the company ID of this acc ins bodies manage sys
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the complaints appeals of this acc ins bodies manage sys.
	 *
	 * @return the complaints appeals of this acc ins bodies manage sys
	 */
	@Override
	public String getComplaintsAppeals() {
		return model.getComplaintsAppeals();
	}

	/**
	 * Returns the contractual arrange of this acc ins bodies manage sys.
	 *
	 * @return the contractual arrange of this acc ins bodies manage sys
	 */
	@Override
	public String getContractualArrange() {
		return model.getContractualArrange();
	}

	/**
	 * Returns the control of quality of this acc ins bodies manage sys.
	 *
	 * @return the control of quality of this acc ins bodies manage sys
	 */
	@Override
	public String getControlOfQuality() {
		return model.getControlOfQuality();
	}

	/**
	 * Returns the create date of this acc ins bodies manage sys.
	 *
	 * @return the create date of this acc ins bodies manage sys
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the doc contol proc of this acc ins bodies manage sys.
	 *
	 * @return the doc contol proc of this acc ins bodies manage sys
	 */
	@Override
	public String getDocContolProc() {
		return model.getDocContolProc();
	}

	/**
	 * Returns the documentation of this acc ins bodies manage sys.
	 *
	 * @return the documentation of this acc ins bodies manage sys
	 */
	@Override
	public String getDocumentation() {
		return model.getDocumentation();
	}

	/**
	 * Returns the documnt changes of this acc ins bodies manage sys.
	 *
	 * @return the documnt changes of this acc ins bodies manage sys
	 */
	@Override
	public String getDocumntChanges() {
		return model.getDocumntChanges();
	}

	/**
	 * Returns the equipment of this acc ins bodies manage sys.
	 *
	 * @return the equipment of this acc ins bodies manage sys
	 */
	@Override
	public String getEquipment() {
		return model.getEquipment();
	}

	/**
	 * Returns the group ID of this acc ins bodies manage sys.
	 *
	 * @return the group ID of this acc ins bodies manage sys
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the handling ins item of this acc ins bodies manage sys.
	 *
	 * @return the handling ins item of this acc ins bodies manage sys
	 */
	@Override
	public String getHandlingInsItem() {
		return model.getHandlingInsItem();
	}

	/**
	 * Returns the ins corrective action of this acc ins bodies manage sys.
	 *
	 * @return the ins corrective action of this acc ins bodies manage sys
	 */
	@Override
	public String getInsCorrectiveAction() {
		return model.getInsCorrectiveAction();
	}

	/**
	 * Returns the ins internal audits of this acc ins bodies manage sys.
	 *
	 * @return the ins internal audits of this acc ins bodies manage sys
	 */
	@Override
	public String getInsInternalAudits() {
		return model.getInsInternalAudits();
	}

	/**
	 * Returns the inspection of this acc ins bodies manage sys.
	 *
	 * @return the inspection of this acc ins bodies manage sys
	 */
	@Override
	public String getInspection() {
		return model.getInspection();
	}

	/**
	 * Returns the ins preventive action of this acc ins bodies manage sys.
	 *
	 * @return the ins preventive action of this acc ins bodies manage sys
	 */
	@Override
	public String getInsPreventiveAction() {
		return model.getInsPreventiveAction();
	}

	/**
	 * Returns the janaac application ID of this acc ins bodies manage sys.
	 *
	 * @return the janaac application ID of this acc ins bodies manage sys
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the management review of this acc ins bodies manage sys.
	 *
	 * @return the management review of this acc ins bodies manage sys
	 */
	@Override
	public String getManagementReview() {
		return model.getManagementReview();
	}

	/**
	 * Returns the manual approval of this acc ins bodies manage sys.
	 *
	 * @return the manual approval of this acc ins bodies manage sys
	 */
	@Override
	public String getManualApproval() {
		return model.getManualApproval();
	}

	/**
	 * Returns the modified date of this acc ins bodies manage sys.
	 *
	 * @return the modified date of this acc ins bodies manage sys
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the option follow of this acc ins bodies manage sys.
	 *
	 * @return the option follow of this acc ins bodies manage sys
	 */
	@Override
	public String getOptionFollow() {
		return model.getOptionFollow();
	}

	/**
	 * Returns the overall obj of this acc ins bodies manage sys.
	 *
	 * @return the overall obj of this acc ins bodies manage sys
	 */
	@Override
	public String getOverallObj() {
		return model.getOverallObj();
	}

	/**
	 * Returns the personnel of this acc ins bodies manage sys.
	 *
	 * @return the personnel of this acc ins bodies manage sys
	 */
	@Override
	public String getPersonnel() {
		return model.getPersonnel();
	}

	/**
	 * Returns the primary key of this acc ins bodies manage sys.
	 *
	 * @return the primary key of this acc ins bodies manage sys
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the q m ref complaints of this acc ins bodies manage sys.
	 *
	 * @return the q m ref complaints of this acc ins bodies manage sys
	 */
	@Override
	public String getQMRefComplaints() {
		return model.getQMRefComplaints();
	}

	/**
	 * Returns the q m ref contractual of this acc ins bodies manage sys.
	 *
	 * @return the q m ref contractual of this acc ins bodies manage sys
	 */
	@Override
	public String getQMRefContractual() {
		return model.getQMRefContractual();
	}

	/**
	 * Returns the q m ref control of this acc ins bodies manage sys.
	 *
	 * @return the q m ref control of this acc ins bodies manage sys
	 */
	@Override
	public String getQMRefControl() {
		return model.getQMRefControl();
	}

	/**
	 * Returns the q m ref correct of this acc ins bodies manage sys.
	 *
	 * @return the q m ref correct of this acc ins bodies manage sys
	 */
	@Override
	public String getQMRefCorrect() {
		return model.getQMRefCorrect();
	}

	/**
	 * Returns the q m ref doc control of this acc ins bodies manage sys.
	 *
	 * @return the q m ref doc control of this acc ins bodies manage sys
	 */
	@Override
	public String getQMRefDocControl() {
		return model.getQMRefDocControl();
	}

	/**
	 * Returns the q m ref documentation of this acc ins bodies manage sys.
	 *
	 * @return the q m ref documentation of this acc ins bodies manage sys
	 */
	@Override
	public String getQMRefDocumentation() {
		return model.getQMRefDocumentation();
	}

	/**
	 * Returns the q m ref documnt changes of this acc ins bodies manage sys.
	 *
	 * @return the q m ref documnt changes of this acc ins bodies manage sys
	 */
	@Override
	public String getQMRefDocumntChanges() {
		return model.getQMRefDocumntChanges();
	}

	/**
	 * Returns the q m ref equip of this acc ins bodies manage sys.
	 *
	 * @return the q m ref equip of this acc ins bodies manage sys
	 */
	@Override
	public String getQMRefEquip() {
		return model.getQMRefEquip();
	}

	/**
	 * Returns the q m ref handling of this acc ins bodies manage sys.
	 *
	 * @return the q m ref handling of this acc ins bodies manage sys
	 */
	@Override
	public String getQMRefHandling() {
		return model.getQMRefHandling();
	}

	/**
	 * Returns the q m ref inspection of this acc ins bodies manage sys.
	 *
	 * @return the q m ref inspection of this acc ins bodies manage sys
	 */
	@Override
	public String getQMRefInspection() {
		return model.getQMRefInspection();
	}

	/**
	 * Returns the q m ref internal audit of this acc ins bodies manage sys.
	 *
	 * @return the q m ref internal audit of this acc ins bodies manage sys
	 */
	@Override
	public String getQMRefInternalAudit() {
		return model.getQMRefInternalAudit();
	}

	/**
	 * Returns the q m ref manage of this acc ins bodies manage sys.
	 *
	 * @return the q m ref manage of this acc ins bodies manage sys
	 */
	@Override
	public String getQMRefManage() {
		return model.getQMRefManage();
	}

	/**
	 * Returns the q m ref manual of this acc ins bodies manage sys.
	 *
	 * @return the q m ref manual of this acc ins bodies manage sys
	 */
	@Override
	public String getQMRefManual() {
		return model.getQMRefManual();
	}

	/**
	 * Returns the q m ref overall obj of this acc ins bodies manage sys.
	 *
	 * @return the q m ref overall obj of this acc ins bodies manage sys
	 */
	@Override
	public String getQMRefOverallObj() {
		return model.getQMRefOverallObj();
	}

	/**
	 * Returns the q m ref personnel of this acc ins bodies manage sys.
	 *
	 * @return the q m ref personnel of this acc ins bodies manage sys
	 */
	@Override
	public String getQMRefPersonnel() {
		return model.getQMRefPersonnel();
	}

	/**
	 * Returns the q m ref preventive of this acc ins bodies manage sys.
	 *
	 * @return the q m ref preventive of this acc ins bodies manage sys
	 */
	@Override
	public String getQMRefPreventive() {
		return model.getQMRefPreventive();
	}

	/**
	 * Returns the q m ref relevant of this acc ins bodies manage sys.
	 *
	 * @return the q m ref relevant of this acc ins bodies manage sys
	 */
	@Override
	public String getQMRefRelevant() {
		return model.getQMRefRelevant();
	}

	/**
	 * Returns the q m ref supporting of this acc ins bodies manage sys.
	 *
	 * @return the q m ref supporting of this acc ins bodies manage sys
	 */
	@Override
	public String getQMRefSupporting() {
		return model.getQMRefSupporting();
	}

	/**
	 * Returns the q m ref technical of this acc ins bodies manage sys.
	 *
	 * @return the q m ref technical of this acc ins bodies manage sys
	 */
	@Override
	public String getQMRefTechnical() {
		return model.getQMRefTechnical();
	}

	/**
	 * Returns the relevant policies of this acc ins bodies manage sys.
	 *
	 * @return the relevant policies of this acc ins bodies manage sys
	 */
	@Override
	public String getRelevantPolicies() {
		return model.getRelevantPolicies();
	}

	/**
	 * Returns the supporting procedure of this acc ins bodies manage sys.
	 *
	 * @return the supporting procedure of this acc ins bodies manage sys
	 */
	@Override
	public String getSupportingProcedure() {
		return model.getSupportingProcedure();
	}

	/**
	 * Returns the technical mangmnt of this acc ins bodies manage sys.
	 *
	 * @return the technical mangmnt of this acc ins bodies manage sys
	 */
	@Override
	public String getTechnicalMangmnt() {
		return model.getTechnicalMangmnt();
	}

	/**
	 * Returns the user ID of this acc ins bodies manage sys.
	 *
	 * @return the user ID of this acc ins bodies manage sys
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acc ins bodies manage sys.
	 *
	 * @return the user name of this acc ins bodies manage sys
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acc ins bodies manage sys.
	 *
	 * @return the user uuid of this acc ins bodies manage sys
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this acc ins bodies manage sys.
	 *
	 * @return the uuid of this acc ins bodies manage sys
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the acc ins bodies manage sys ID of this acc ins bodies manage sys.
	 *
	 * @param accInsBodiesManageSysId the acc ins bodies manage sys ID of this acc ins bodies manage sys
	 */
	@Override
	public void setAccInsBodiesManageSysId(long accInsBodiesManageSysId) {
		model.setAccInsBodiesManageSysId(accInsBodiesManageSysId);
	}

	/**
	 * Sets the company ID of this acc ins bodies manage sys.
	 *
	 * @param companyId the company ID of this acc ins bodies manage sys
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the complaints appeals of this acc ins bodies manage sys.
	 *
	 * @param complaintsAppeals the complaints appeals of this acc ins bodies manage sys
	 */
	@Override
	public void setComplaintsAppeals(String complaintsAppeals) {
		model.setComplaintsAppeals(complaintsAppeals);
	}

	/**
	 * Sets the contractual arrange of this acc ins bodies manage sys.
	 *
	 * @param contractualArrange the contractual arrange of this acc ins bodies manage sys
	 */
	@Override
	public void setContractualArrange(String contractualArrange) {
		model.setContractualArrange(contractualArrange);
	}

	/**
	 * Sets the control of quality of this acc ins bodies manage sys.
	 *
	 * @param controlOfQuality the control of quality of this acc ins bodies manage sys
	 */
	@Override
	public void setControlOfQuality(String controlOfQuality) {
		model.setControlOfQuality(controlOfQuality);
	}

	/**
	 * Sets the create date of this acc ins bodies manage sys.
	 *
	 * @param createDate the create date of this acc ins bodies manage sys
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the doc contol proc of this acc ins bodies manage sys.
	 *
	 * @param docContolProc the doc contol proc of this acc ins bodies manage sys
	 */
	@Override
	public void setDocContolProc(String docContolProc) {
		model.setDocContolProc(docContolProc);
	}

	/**
	 * Sets the documentation of this acc ins bodies manage sys.
	 *
	 * @param documentation the documentation of this acc ins bodies manage sys
	 */
	@Override
	public void setDocumentation(String documentation) {
		model.setDocumentation(documentation);
	}

	/**
	 * Sets the documnt changes of this acc ins bodies manage sys.
	 *
	 * @param documntChanges the documnt changes of this acc ins bodies manage sys
	 */
	@Override
	public void setDocumntChanges(String documntChanges) {
		model.setDocumntChanges(documntChanges);
	}

	/**
	 * Sets the equipment of this acc ins bodies manage sys.
	 *
	 * @param equipment the equipment of this acc ins bodies manage sys
	 */
	@Override
	public void setEquipment(String equipment) {
		model.setEquipment(equipment);
	}

	/**
	 * Sets the group ID of this acc ins bodies manage sys.
	 *
	 * @param groupId the group ID of this acc ins bodies manage sys
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the handling ins item of this acc ins bodies manage sys.
	 *
	 * @param handlingInsItem the handling ins item of this acc ins bodies manage sys
	 */
	@Override
	public void setHandlingInsItem(String handlingInsItem) {
		model.setHandlingInsItem(handlingInsItem);
	}

	/**
	 * Sets the ins corrective action of this acc ins bodies manage sys.
	 *
	 * @param insCorrectiveAction the ins corrective action of this acc ins bodies manage sys
	 */
	@Override
	public void setInsCorrectiveAction(String insCorrectiveAction) {
		model.setInsCorrectiveAction(insCorrectiveAction);
	}

	/**
	 * Sets the ins internal audits of this acc ins bodies manage sys.
	 *
	 * @param insInternalAudits the ins internal audits of this acc ins bodies manage sys
	 */
	@Override
	public void setInsInternalAudits(String insInternalAudits) {
		model.setInsInternalAudits(insInternalAudits);
	}

	/**
	 * Sets the inspection of this acc ins bodies manage sys.
	 *
	 * @param inspection the inspection of this acc ins bodies manage sys
	 */
	@Override
	public void setInspection(String inspection) {
		model.setInspection(inspection);
	}

	/**
	 * Sets the ins preventive action of this acc ins bodies manage sys.
	 *
	 * @param insPreventiveAction the ins preventive action of this acc ins bodies manage sys
	 */
	@Override
	public void setInsPreventiveAction(String insPreventiveAction) {
		model.setInsPreventiveAction(insPreventiveAction);
	}

	/**
	 * Sets the janaac application ID of this acc ins bodies manage sys.
	 *
	 * @param janaacApplicationId the janaac application ID of this acc ins bodies manage sys
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the management review of this acc ins bodies manage sys.
	 *
	 * @param managementReview the management review of this acc ins bodies manage sys
	 */
	@Override
	public void setManagementReview(String managementReview) {
		model.setManagementReview(managementReview);
	}

	/**
	 * Sets the manual approval of this acc ins bodies manage sys.
	 *
	 * @param manualApproval the manual approval of this acc ins bodies manage sys
	 */
	@Override
	public void setManualApproval(String manualApproval) {
		model.setManualApproval(manualApproval);
	}

	/**
	 * Sets the modified date of this acc ins bodies manage sys.
	 *
	 * @param modifiedDate the modified date of this acc ins bodies manage sys
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the option follow of this acc ins bodies manage sys.
	 *
	 * @param optionFollow the option follow of this acc ins bodies manage sys
	 */
	@Override
	public void setOptionFollow(String optionFollow) {
		model.setOptionFollow(optionFollow);
	}

	/**
	 * Sets the overall obj of this acc ins bodies manage sys.
	 *
	 * @param overallObj the overall obj of this acc ins bodies manage sys
	 */
	@Override
	public void setOverallObj(String overallObj) {
		model.setOverallObj(overallObj);
	}

	/**
	 * Sets the personnel of this acc ins bodies manage sys.
	 *
	 * @param personnel the personnel of this acc ins bodies manage sys
	 */
	@Override
	public void setPersonnel(String personnel) {
		model.setPersonnel(personnel);
	}

	/**
	 * Sets the primary key of this acc ins bodies manage sys.
	 *
	 * @param primaryKey the primary key of this acc ins bodies manage sys
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the q m ref complaints of this acc ins bodies manage sys.
	 *
	 * @param qMRefComplaints the q m ref complaints of this acc ins bodies manage sys
	 */
	@Override
	public void setQMRefComplaints(String qMRefComplaints) {
		model.setQMRefComplaints(qMRefComplaints);
	}

	/**
	 * Sets the q m ref contractual of this acc ins bodies manage sys.
	 *
	 * @param qMRefContractual the q m ref contractual of this acc ins bodies manage sys
	 */
	@Override
	public void setQMRefContractual(String qMRefContractual) {
		model.setQMRefContractual(qMRefContractual);
	}

	/**
	 * Sets the q m ref control of this acc ins bodies manage sys.
	 *
	 * @param qMRefControl the q m ref control of this acc ins bodies manage sys
	 */
	@Override
	public void setQMRefControl(String qMRefControl) {
		model.setQMRefControl(qMRefControl);
	}

	/**
	 * Sets the q m ref correct of this acc ins bodies manage sys.
	 *
	 * @param qMRefCorrect the q m ref correct of this acc ins bodies manage sys
	 */
	@Override
	public void setQMRefCorrect(String qMRefCorrect) {
		model.setQMRefCorrect(qMRefCorrect);
	}

	/**
	 * Sets the q m ref doc control of this acc ins bodies manage sys.
	 *
	 * @param qMRefDocControl the q m ref doc control of this acc ins bodies manage sys
	 */
	@Override
	public void setQMRefDocControl(String qMRefDocControl) {
		model.setQMRefDocControl(qMRefDocControl);
	}

	/**
	 * Sets the q m ref documentation of this acc ins bodies manage sys.
	 *
	 * @param qMRefDocumentation the q m ref documentation of this acc ins bodies manage sys
	 */
	@Override
	public void setQMRefDocumentation(String qMRefDocumentation) {
		model.setQMRefDocumentation(qMRefDocumentation);
	}

	/**
	 * Sets the q m ref documnt changes of this acc ins bodies manage sys.
	 *
	 * @param qMRefDocumntChanges the q m ref documnt changes of this acc ins bodies manage sys
	 */
	@Override
	public void setQMRefDocumntChanges(String qMRefDocumntChanges) {
		model.setQMRefDocumntChanges(qMRefDocumntChanges);
	}

	/**
	 * Sets the q m ref equip of this acc ins bodies manage sys.
	 *
	 * @param qMRefEquip the q m ref equip of this acc ins bodies manage sys
	 */
	@Override
	public void setQMRefEquip(String qMRefEquip) {
		model.setQMRefEquip(qMRefEquip);
	}

	/**
	 * Sets the q m ref handling of this acc ins bodies manage sys.
	 *
	 * @param qMRefHandling the q m ref handling of this acc ins bodies manage sys
	 */
	@Override
	public void setQMRefHandling(String qMRefHandling) {
		model.setQMRefHandling(qMRefHandling);
	}

	/**
	 * Sets the q m ref inspection of this acc ins bodies manage sys.
	 *
	 * @param qMRefInspection the q m ref inspection of this acc ins bodies manage sys
	 */
	@Override
	public void setQMRefInspection(String qMRefInspection) {
		model.setQMRefInspection(qMRefInspection);
	}

	/**
	 * Sets the q m ref internal audit of this acc ins bodies manage sys.
	 *
	 * @param qMRefInternalAudit the q m ref internal audit of this acc ins bodies manage sys
	 */
	@Override
	public void setQMRefInternalAudit(String qMRefInternalAudit) {
		model.setQMRefInternalAudit(qMRefInternalAudit);
	}

	/**
	 * Sets the q m ref manage of this acc ins bodies manage sys.
	 *
	 * @param qMRefManage the q m ref manage of this acc ins bodies manage sys
	 */
	@Override
	public void setQMRefManage(String qMRefManage) {
		model.setQMRefManage(qMRefManage);
	}

	/**
	 * Sets the q m ref manual of this acc ins bodies manage sys.
	 *
	 * @param qMRefManual the q m ref manual of this acc ins bodies manage sys
	 */
	@Override
	public void setQMRefManual(String qMRefManual) {
		model.setQMRefManual(qMRefManual);
	}

	/**
	 * Sets the q m ref overall obj of this acc ins bodies manage sys.
	 *
	 * @param qMRefOverallObj the q m ref overall obj of this acc ins bodies manage sys
	 */
	@Override
	public void setQMRefOverallObj(String qMRefOverallObj) {
		model.setQMRefOverallObj(qMRefOverallObj);
	}

	/**
	 * Sets the q m ref personnel of this acc ins bodies manage sys.
	 *
	 * @param qMRefPersonnel the q m ref personnel of this acc ins bodies manage sys
	 */
	@Override
	public void setQMRefPersonnel(String qMRefPersonnel) {
		model.setQMRefPersonnel(qMRefPersonnel);
	}

	/**
	 * Sets the q m ref preventive of this acc ins bodies manage sys.
	 *
	 * @param qMRefPreventive the q m ref preventive of this acc ins bodies manage sys
	 */
	@Override
	public void setQMRefPreventive(String qMRefPreventive) {
		model.setQMRefPreventive(qMRefPreventive);
	}

	/**
	 * Sets the q m ref relevant of this acc ins bodies manage sys.
	 *
	 * @param qMRefRelevant the q m ref relevant of this acc ins bodies manage sys
	 */
	@Override
	public void setQMRefRelevant(String qMRefRelevant) {
		model.setQMRefRelevant(qMRefRelevant);
	}

	/**
	 * Sets the q m ref supporting of this acc ins bodies manage sys.
	 *
	 * @param qMRefSupporting the q m ref supporting of this acc ins bodies manage sys
	 */
	@Override
	public void setQMRefSupporting(String qMRefSupporting) {
		model.setQMRefSupporting(qMRefSupporting);
	}

	/**
	 * Sets the q m ref technical of this acc ins bodies manage sys.
	 *
	 * @param qMRefTechnical the q m ref technical of this acc ins bodies manage sys
	 */
	@Override
	public void setQMRefTechnical(String qMRefTechnical) {
		model.setQMRefTechnical(qMRefTechnical);
	}

	/**
	 * Sets the relevant policies of this acc ins bodies manage sys.
	 *
	 * @param relevantPolicies the relevant policies of this acc ins bodies manage sys
	 */
	@Override
	public void setRelevantPolicies(String relevantPolicies) {
		model.setRelevantPolicies(relevantPolicies);
	}

	/**
	 * Sets the supporting procedure of this acc ins bodies manage sys.
	 *
	 * @param supportingProcedure the supporting procedure of this acc ins bodies manage sys
	 */
	@Override
	public void setSupportingProcedure(String supportingProcedure) {
		model.setSupportingProcedure(supportingProcedure);
	}

	/**
	 * Sets the technical mangmnt of this acc ins bodies manage sys.
	 *
	 * @param technicalMangmnt the technical mangmnt of this acc ins bodies manage sys
	 */
	@Override
	public void setTechnicalMangmnt(String technicalMangmnt) {
		model.setTechnicalMangmnt(technicalMangmnt);
	}

	/**
	 * Sets the user ID of this acc ins bodies manage sys.
	 *
	 * @param userId the user ID of this acc ins bodies manage sys
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acc ins bodies manage sys.
	 *
	 * @param userName the user name of this acc ins bodies manage sys
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acc ins bodies manage sys.
	 *
	 * @param userUuid the user uuid of this acc ins bodies manage sys
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this acc ins bodies manage sys.
	 *
	 * @param uuid the uuid of this acc ins bodies manage sys
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
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
	protected AccInsBodiesManageSysWrapper wrap(
		AccInsBodiesManageSys accInsBodiesManageSys) {

		return new AccInsBodiesManageSysWrapper(accInsBodiesManageSys);
	}

}