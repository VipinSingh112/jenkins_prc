/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AccInsBodiesManageSys;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccInsBodiesManageSys in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccInsBodiesManageSysCacheModel
	implements CacheModel<AccInsBodiesManageSys>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccInsBodiesManageSysCacheModel)) {
			return false;
		}

		AccInsBodiesManageSysCacheModel accInsBodiesManageSysCacheModel =
			(AccInsBodiesManageSysCacheModel)object;

		if (accInsBodiesManageSysId ==
				accInsBodiesManageSysCacheModel.accInsBodiesManageSysId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accInsBodiesManageSysId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(97);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", accInsBodiesManageSysId=");
		sb.append(accInsBodiesManageSysId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", optionFollow=");
		sb.append(optionFollow);
		sb.append(", manualApproval=");
		sb.append(manualApproval);
		sb.append(", qMRefManual=");
		sb.append(qMRefManual);
		sb.append(", relevantPolicies=");
		sb.append(relevantPolicies);
		sb.append(", qMRefRelevant=");
		sb.append(qMRefRelevant);
		sb.append(", overallObj=");
		sb.append(overallObj);
		sb.append(", qMRefOverallObj=");
		sb.append(qMRefOverallObj);
		sb.append(", supportingProcedure=");
		sb.append(supportingProcedure);
		sb.append(", qMRefSupporting=");
		sb.append(qMRefSupporting);
		sb.append(", technicalMangmnt=");
		sb.append(technicalMangmnt);
		sb.append(", qMRefTechnical=");
		sb.append(qMRefTechnical);
		sb.append(", documentation=");
		sb.append(documentation);
		sb.append(", qMRefDocumentation=");
		sb.append(qMRefDocumentation);
		sb.append(", docContolProc=");
		sb.append(docContolProc);
		sb.append(", qMRefDocControl=");
		sb.append(qMRefDocControl);
		sb.append(", documntChanges=");
		sb.append(documntChanges);
		sb.append(", qMRefDocumntChanges=");
		sb.append(qMRefDocumntChanges);
		sb.append(", controlOfQuality=");
		sb.append(controlOfQuality);
		sb.append(", qMRefControl=");
		sb.append(qMRefControl);
		sb.append(", managementReview=");
		sb.append(managementReview);
		sb.append(", qMRefManage=");
		sb.append(qMRefManage);
		sb.append(", insInternalAudits=");
		sb.append(insInternalAudits);
		sb.append(", qMRefInternalAudit=");
		sb.append(qMRefInternalAudit);
		sb.append(", insCorrectiveAction=");
		sb.append(insCorrectiveAction);
		sb.append(", qMRefCorrect=");
		sb.append(qMRefCorrect);
		sb.append(", insPreventiveAction=");
		sb.append(insPreventiveAction);
		sb.append(", qMRefPreventive=");
		sb.append(qMRefPreventive);
		sb.append(", personnel=");
		sb.append(personnel);
		sb.append(", qMRefPersonnel=");
		sb.append(qMRefPersonnel);
		sb.append(", equipment=");
		sb.append(equipment);
		sb.append(", qMRefEquip=");
		sb.append(qMRefEquip);
		sb.append(", inspection=");
		sb.append(inspection);
		sb.append(", qMRefInspection=");
		sb.append(qMRefInspection);
		sb.append(", contractualArrange=");
		sb.append(contractualArrange);
		sb.append(", qMRefContractual=");
		sb.append(qMRefContractual);
		sb.append(", handlingInsItem=");
		sb.append(handlingInsItem);
		sb.append(", qMRefHandling=");
		sb.append(qMRefHandling);
		sb.append(", complaintsAppeals=");
		sb.append(complaintsAppeals);
		sb.append(", qMRefComplaints=");
		sb.append(qMRefComplaints);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AccInsBodiesManageSys toEntityModel() {
		AccInsBodiesManageSysImpl accInsBodiesManageSysImpl =
			new AccInsBodiesManageSysImpl();

		if (uuid == null) {
			accInsBodiesManageSysImpl.setUuid("");
		}
		else {
			accInsBodiesManageSysImpl.setUuid(uuid);
		}

		accInsBodiesManageSysImpl.setAccInsBodiesManageSysId(
			accInsBodiesManageSysId);
		accInsBodiesManageSysImpl.setGroupId(groupId);
		accInsBodiesManageSysImpl.setCompanyId(companyId);
		accInsBodiesManageSysImpl.setUserId(userId);

		if (userName == null) {
			accInsBodiesManageSysImpl.setUserName("");
		}
		else {
			accInsBodiesManageSysImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accInsBodiesManageSysImpl.setCreateDate(null);
		}
		else {
			accInsBodiesManageSysImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accInsBodiesManageSysImpl.setModifiedDate(null);
		}
		else {
			accInsBodiesManageSysImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (optionFollow == null) {
			accInsBodiesManageSysImpl.setOptionFollow("");
		}
		else {
			accInsBodiesManageSysImpl.setOptionFollow(optionFollow);
		}

		if (manualApproval == null) {
			accInsBodiesManageSysImpl.setManualApproval("");
		}
		else {
			accInsBodiesManageSysImpl.setManualApproval(manualApproval);
		}

		if (qMRefManual == null) {
			accInsBodiesManageSysImpl.setQMRefManual("");
		}
		else {
			accInsBodiesManageSysImpl.setQMRefManual(qMRefManual);
		}

		if (relevantPolicies == null) {
			accInsBodiesManageSysImpl.setRelevantPolicies("");
		}
		else {
			accInsBodiesManageSysImpl.setRelevantPolicies(relevantPolicies);
		}

		if (qMRefRelevant == null) {
			accInsBodiesManageSysImpl.setQMRefRelevant("");
		}
		else {
			accInsBodiesManageSysImpl.setQMRefRelevant(qMRefRelevant);
		}

		if (overallObj == null) {
			accInsBodiesManageSysImpl.setOverallObj("");
		}
		else {
			accInsBodiesManageSysImpl.setOverallObj(overallObj);
		}

		if (qMRefOverallObj == null) {
			accInsBodiesManageSysImpl.setQMRefOverallObj("");
		}
		else {
			accInsBodiesManageSysImpl.setQMRefOverallObj(qMRefOverallObj);
		}

		if (supportingProcedure == null) {
			accInsBodiesManageSysImpl.setSupportingProcedure("");
		}
		else {
			accInsBodiesManageSysImpl.setSupportingProcedure(
				supportingProcedure);
		}

		if (qMRefSupporting == null) {
			accInsBodiesManageSysImpl.setQMRefSupporting("");
		}
		else {
			accInsBodiesManageSysImpl.setQMRefSupporting(qMRefSupporting);
		}

		if (technicalMangmnt == null) {
			accInsBodiesManageSysImpl.setTechnicalMangmnt("");
		}
		else {
			accInsBodiesManageSysImpl.setTechnicalMangmnt(technicalMangmnt);
		}

		if (qMRefTechnical == null) {
			accInsBodiesManageSysImpl.setQMRefTechnical("");
		}
		else {
			accInsBodiesManageSysImpl.setQMRefTechnical(qMRefTechnical);
		}

		if (documentation == null) {
			accInsBodiesManageSysImpl.setDocumentation("");
		}
		else {
			accInsBodiesManageSysImpl.setDocumentation(documentation);
		}

		if (qMRefDocumentation == null) {
			accInsBodiesManageSysImpl.setQMRefDocumentation("");
		}
		else {
			accInsBodiesManageSysImpl.setQMRefDocumentation(qMRefDocumentation);
		}

		if (docContolProc == null) {
			accInsBodiesManageSysImpl.setDocContolProc("");
		}
		else {
			accInsBodiesManageSysImpl.setDocContolProc(docContolProc);
		}

		if (qMRefDocControl == null) {
			accInsBodiesManageSysImpl.setQMRefDocControl("");
		}
		else {
			accInsBodiesManageSysImpl.setQMRefDocControl(qMRefDocControl);
		}

		if (documntChanges == null) {
			accInsBodiesManageSysImpl.setDocumntChanges("");
		}
		else {
			accInsBodiesManageSysImpl.setDocumntChanges(documntChanges);
		}

		if (qMRefDocumntChanges == null) {
			accInsBodiesManageSysImpl.setQMRefDocumntChanges("");
		}
		else {
			accInsBodiesManageSysImpl.setQMRefDocumntChanges(
				qMRefDocumntChanges);
		}

		if (controlOfQuality == null) {
			accInsBodiesManageSysImpl.setControlOfQuality("");
		}
		else {
			accInsBodiesManageSysImpl.setControlOfQuality(controlOfQuality);
		}

		if (qMRefControl == null) {
			accInsBodiesManageSysImpl.setQMRefControl("");
		}
		else {
			accInsBodiesManageSysImpl.setQMRefControl(qMRefControl);
		}

		if (managementReview == null) {
			accInsBodiesManageSysImpl.setManagementReview("");
		}
		else {
			accInsBodiesManageSysImpl.setManagementReview(managementReview);
		}

		if (qMRefManage == null) {
			accInsBodiesManageSysImpl.setQMRefManage("");
		}
		else {
			accInsBodiesManageSysImpl.setQMRefManage(qMRefManage);
		}

		if (insInternalAudits == null) {
			accInsBodiesManageSysImpl.setInsInternalAudits("");
		}
		else {
			accInsBodiesManageSysImpl.setInsInternalAudits(insInternalAudits);
		}

		if (qMRefInternalAudit == null) {
			accInsBodiesManageSysImpl.setQMRefInternalAudit("");
		}
		else {
			accInsBodiesManageSysImpl.setQMRefInternalAudit(qMRefInternalAudit);
		}

		if (insCorrectiveAction == null) {
			accInsBodiesManageSysImpl.setInsCorrectiveAction("");
		}
		else {
			accInsBodiesManageSysImpl.setInsCorrectiveAction(
				insCorrectiveAction);
		}

		if (qMRefCorrect == null) {
			accInsBodiesManageSysImpl.setQMRefCorrect("");
		}
		else {
			accInsBodiesManageSysImpl.setQMRefCorrect(qMRefCorrect);
		}

		if (insPreventiveAction == null) {
			accInsBodiesManageSysImpl.setInsPreventiveAction("");
		}
		else {
			accInsBodiesManageSysImpl.setInsPreventiveAction(
				insPreventiveAction);
		}

		if (qMRefPreventive == null) {
			accInsBodiesManageSysImpl.setQMRefPreventive("");
		}
		else {
			accInsBodiesManageSysImpl.setQMRefPreventive(qMRefPreventive);
		}

		if (personnel == null) {
			accInsBodiesManageSysImpl.setPersonnel("");
		}
		else {
			accInsBodiesManageSysImpl.setPersonnel(personnel);
		}

		if (qMRefPersonnel == null) {
			accInsBodiesManageSysImpl.setQMRefPersonnel("");
		}
		else {
			accInsBodiesManageSysImpl.setQMRefPersonnel(qMRefPersonnel);
		}

		if (equipment == null) {
			accInsBodiesManageSysImpl.setEquipment("");
		}
		else {
			accInsBodiesManageSysImpl.setEquipment(equipment);
		}

		if (qMRefEquip == null) {
			accInsBodiesManageSysImpl.setQMRefEquip("");
		}
		else {
			accInsBodiesManageSysImpl.setQMRefEquip(qMRefEquip);
		}

		if (inspection == null) {
			accInsBodiesManageSysImpl.setInspection("");
		}
		else {
			accInsBodiesManageSysImpl.setInspection(inspection);
		}

		if (qMRefInspection == null) {
			accInsBodiesManageSysImpl.setQMRefInspection("");
		}
		else {
			accInsBodiesManageSysImpl.setQMRefInspection(qMRefInspection);
		}

		if (contractualArrange == null) {
			accInsBodiesManageSysImpl.setContractualArrange("");
		}
		else {
			accInsBodiesManageSysImpl.setContractualArrange(contractualArrange);
		}

		if (qMRefContractual == null) {
			accInsBodiesManageSysImpl.setQMRefContractual("");
		}
		else {
			accInsBodiesManageSysImpl.setQMRefContractual(qMRefContractual);
		}

		if (handlingInsItem == null) {
			accInsBodiesManageSysImpl.setHandlingInsItem("");
		}
		else {
			accInsBodiesManageSysImpl.setHandlingInsItem(handlingInsItem);
		}

		if (qMRefHandling == null) {
			accInsBodiesManageSysImpl.setQMRefHandling("");
		}
		else {
			accInsBodiesManageSysImpl.setQMRefHandling(qMRefHandling);
		}

		if (complaintsAppeals == null) {
			accInsBodiesManageSysImpl.setComplaintsAppeals("");
		}
		else {
			accInsBodiesManageSysImpl.setComplaintsAppeals(complaintsAppeals);
		}

		if (qMRefComplaints == null) {
			accInsBodiesManageSysImpl.setQMRefComplaints("");
		}
		else {
			accInsBodiesManageSysImpl.setQMRefComplaints(qMRefComplaints);
		}

		accInsBodiesManageSysImpl.setJanaacApplicationId(janaacApplicationId);

		accInsBodiesManageSysImpl.resetOriginalValues();

		return accInsBodiesManageSysImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		accInsBodiesManageSysId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		optionFollow = objectInput.readUTF();
		manualApproval = objectInput.readUTF();
		qMRefManual = objectInput.readUTF();
		relevantPolicies = objectInput.readUTF();
		qMRefRelevant = objectInput.readUTF();
		overallObj = objectInput.readUTF();
		qMRefOverallObj = objectInput.readUTF();
		supportingProcedure = objectInput.readUTF();
		qMRefSupporting = objectInput.readUTF();
		technicalMangmnt = objectInput.readUTF();
		qMRefTechnical = objectInput.readUTF();
		documentation = objectInput.readUTF();
		qMRefDocumentation = objectInput.readUTF();
		docContolProc = objectInput.readUTF();
		qMRefDocControl = objectInput.readUTF();
		documntChanges = objectInput.readUTF();
		qMRefDocumntChanges = objectInput.readUTF();
		controlOfQuality = objectInput.readUTF();
		qMRefControl = objectInput.readUTF();
		managementReview = objectInput.readUTF();
		qMRefManage = objectInput.readUTF();
		insInternalAudits = objectInput.readUTF();
		qMRefInternalAudit = objectInput.readUTF();
		insCorrectiveAction = objectInput.readUTF();
		qMRefCorrect = objectInput.readUTF();
		insPreventiveAction = objectInput.readUTF();
		qMRefPreventive = objectInput.readUTF();
		personnel = objectInput.readUTF();
		qMRefPersonnel = objectInput.readUTF();
		equipment = objectInput.readUTF();
		qMRefEquip = objectInput.readUTF();
		inspection = objectInput.readUTF();
		qMRefInspection = objectInput.readUTF();
		contractualArrange = objectInput.readUTF();
		qMRefContractual = objectInput.readUTF();
		handlingInsItem = objectInput.readUTF();
		qMRefHandling = objectInput.readUTF();
		complaintsAppeals = objectInput.readUTF();
		qMRefComplaints = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(accInsBodiesManageSysId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (optionFollow == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(optionFollow);
		}

		if (manualApproval == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manualApproval);
		}

		if (qMRefManual == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefManual);
		}

		if (relevantPolicies == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(relevantPolicies);
		}

		if (qMRefRelevant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefRelevant);
		}

		if (overallObj == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(overallObj);
		}

		if (qMRefOverallObj == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefOverallObj);
		}

		if (supportingProcedure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(supportingProcedure);
		}

		if (qMRefSupporting == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefSupporting);
		}

		if (technicalMangmnt == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(technicalMangmnt);
		}

		if (qMRefTechnical == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefTechnical);
		}

		if (documentation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(documentation);
		}

		if (qMRefDocumentation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefDocumentation);
		}

		if (docContolProc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(docContolProc);
		}

		if (qMRefDocControl == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefDocControl);
		}

		if (documntChanges == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(documntChanges);
		}

		if (qMRefDocumntChanges == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefDocumntChanges);
		}

		if (controlOfQuality == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(controlOfQuality);
		}

		if (qMRefControl == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefControl);
		}

		if (managementReview == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(managementReview);
		}

		if (qMRefManage == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefManage);
		}

		if (insInternalAudits == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insInternalAudits);
		}

		if (qMRefInternalAudit == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefInternalAudit);
		}

		if (insCorrectiveAction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insCorrectiveAction);
		}

		if (qMRefCorrect == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefCorrect);
		}

		if (insPreventiveAction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insPreventiveAction);
		}

		if (qMRefPreventive == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefPreventive);
		}

		if (personnel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(personnel);
		}

		if (qMRefPersonnel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefPersonnel);
		}

		if (equipment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipment);
		}

		if (qMRefEquip == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefEquip);
		}

		if (inspection == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(inspection);
		}

		if (qMRefInspection == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefInspection);
		}

		if (contractualArrange == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contractualArrange);
		}

		if (qMRefContractual == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefContractual);
		}

		if (handlingInsItem == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(handlingInsItem);
		}

		if (qMRefHandling == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefHandling);
		}

		if (complaintsAppeals == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(complaintsAppeals);
		}

		if (qMRefComplaints == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefComplaints);
		}

		objectOutput.writeLong(janaacApplicationId);
	}

	public String uuid;
	public long accInsBodiesManageSysId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String optionFollow;
	public String manualApproval;
	public String qMRefManual;
	public String relevantPolicies;
	public String qMRefRelevant;
	public String overallObj;
	public String qMRefOverallObj;
	public String supportingProcedure;
	public String qMRefSupporting;
	public String technicalMangmnt;
	public String qMRefTechnical;
	public String documentation;
	public String qMRefDocumentation;
	public String docContolProc;
	public String qMRefDocControl;
	public String documntChanges;
	public String qMRefDocumntChanges;
	public String controlOfQuality;
	public String qMRefControl;
	public String managementReview;
	public String qMRefManage;
	public String insInternalAudits;
	public String qMRefInternalAudit;
	public String insCorrectiveAction;
	public String qMRefCorrect;
	public String insPreventiveAction;
	public String qMRefPreventive;
	public String personnel;
	public String qMRefPersonnel;
	public String equipment;
	public String qMRefEquip;
	public String inspection;
	public String qMRefInspection;
	public String contractualArrange;
	public String qMRefContractual;
	public String handlingInsItem;
	public String qMRefHandling;
	public String complaintsAppeals;
	public String qMRefComplaints;
	public long janaacApplicationId;

}