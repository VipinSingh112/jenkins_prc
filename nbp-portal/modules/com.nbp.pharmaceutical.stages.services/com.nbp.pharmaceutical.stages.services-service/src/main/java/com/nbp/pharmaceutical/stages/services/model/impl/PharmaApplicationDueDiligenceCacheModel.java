/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationDueDiligence;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PharmaApplicationDueDiligence in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PharmaApplicationDueDiligenceCacheModel
	implements CacheModel<PharmaApplicationDueDiligence>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PharmaApplicationDueDiligenceCacheModel)) {
			return false;
		}

		PharmaApplicationDueDiligenceCacheModel
			pharmaApplicationDueDiligenceCacheModel =
				(PharmaApplicationDueDiligenceCacheModel)object;

		if (pharmaAppDDId ==
				pharmaApplicationDueDiligenceCacheModel.pharmaAppDDId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, pharmaAppDDId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(47);

		sb.append("{pharmaAppDDId=");
		sb.append(pharmaAppDDId);
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
		sb.append(", transactionNumber=");
		sb.append(transactionNumber);
		sb.append(", entityName=");
		sb.append(entityName);
		sb.append(", dateOfApplication=");
		sb.append(dateOfApplication);
		sb.append(", agencyContactName=");
		sb.append(agencyContactName);
		sb.append(", agencyEmailAddress=");
		sb.append(agencyEmailAddress);
		sb.append(", licenseNumber=");
		sb.append(licenseNumber);
		sb.append(", agencyName=");
		sb.append(agencyName);
		sb.append(", submittedToAgencyDate=");
		sb.append(submittedToAgencyDate);
		sb.append(", feedbackReceivedDate=");
		sb.append(feedbackReceivedDate);
		sb.append(", deadlineDate=");
		sb.append(deadlineDate);
		sb.append(", pharmaApplicationId=");
		sb.append(pharmaApplicationId);
		sb.append(", updatedBySource=");
		sb.append(updatedBySource);
		sb.append(", durationOfTimeSpent=");
		sb.append(durationOfTimeSpent);
		sb.append(", agencyDecision=");
		sb.append(agencyDecision);
		sb.append(", status=");
		sb.append(status);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PharmaApplicationDueDiligence toEntityModel() {
		PharmaApplicationDueDiligenceImpl pharmaApplicationDueDiligenceImpl =
			new PharmaApplicationDueDiligenceImpl();

		pharmaApplicationDueDiligenceImpl.setPharmaAppDDId(pharmaAppDDId);
		pharmaApplicationDueDiligenceImpl.setGroupId(groupId);
		pharmaApplicationDueDiligenceImpl.setCompanyId(companyId);
		pharmaApplicationDueDiligenceImpl.setUserId(userId);

		if (userName == null) {
			pharmaApplicationDueDiligenceImpl.setUserName("");
		}
		else {
			pharmaApplicationDueDiligenceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			pharmaApplicationDueDiligenceImpl.setCreateDate(null);
		}
		else {
			pharmaApplicationDueDiligenceImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			pharmaApplicationDueDiligenceImpl.setModifiedDate(null);
		}
		else {
			pharmaApplicationDueDiligenceImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (transactionNumber == null) {
			pharmaApplicationDueDiligenceImpl.setTransactionNumber("");
		}
		else {
			pharmaApplicationDueDiligenceImpl.setTransactionNumber(
				transactionNumber);
		}

		if (entityName == null) {
			pharmaApplicationDueDiligenceImpl.setEntityName("");
		}
		else {
			pharmaApplicationDueDiligenceImpl.setEntityName(entityName);
		}

		if (dateOfApplication == Long.MIN_VALUE) {
			pharmaApplicationDueDiligenceImpl.setDateOfApplication(null);
		}
		else {
			pharmaApplicationDueDiligenceImpl.setDateOfApplication(
				new Date(dateOfApplication));
		}

		if (agencyContactName == null) {
			pharmaApplicationDueDiligenceImpl.setAgencyContactName("");
		}
		else {
			pharmaApplicationDueDiligenceImpl.setAgencyContactName(
				agencyContactName);
		}

		if (agencyEmailAddress == null) {
			pharmaApplicationDueDiligenceImpl.setAgencyEmailAddress("");
		}
		else {
			pharmaApplicationDueDiligenceImpl.setAgencyEmailAddress(
				agencyEmailAddress);
		}

		if (licenseNumber == null) {
			pharmaApplicationDueDiligenceImpl.setLicenseNumber("");
		}
		else {
			pharmaApplicationDueDiligenceImpl.setLicenseNumber(licenseNumber);
		}

		if (agencyName == null) {
			pharmaApplicationDueDiligenceImpl.setAgencyName("");
		}
		else {
			pharmaApplicationDueDiligenceImpl.setAgencyName(agencyName);
		}

		if (submittedToAgencyDate == Long.MIN_VALUE) {
			pharmaApplicationDueDiligenceImpl.setSubmittedToAgencyDate(null);
		}
		else {
			pharmaApplicationDueDiligenceImpl.setSubmittedToAgencyDate(
				new Date(submittedToAgencyDate));
		}

		if (feedbackReceivedDate == Long.MIN_VALUE) {
			pharmaApplicationDueDiligenceImpl.setFeedbackReceivedDate(null);
		}
		else {
			pharmaApplicationDueDiligenceImpl.setFeedbackReceivedDate(
				new Date(feedbackReceivedDate));
		}

		if (deadlineDate == Long.MIN_VALUE) {
			pharmaApplicationDueDiligenceImpl.setDeadlineDate(null);
		}
		else {
			pharmaApplicationDueDiligenceImpl.setDeadlineDate(
				new Date(deadlineDate));
		}

		pharmaApplicationDueDiligenceImpl.setPharmaApplicationId(
			pharmaApplicationId);

		if (updatedBySource == null) {
			pharmaApplicationDueDiligenceImpl.setUpdatedBySource("");
		}
		else {
			pharmaApplicationDueDiligenceImpl.setUpdatedBySource(
				updatedBySource);
		}

		if (durationOfTimeSpent == null) {
			pharmaApplicationDueDiligenceImpl.setDurationOfTimeSpent("");
		}
		else {
			pharmaApplicationDueDiligenceImpl.setDurationOfTimeSpent(
				durationOfTimeSpent);
		}

		if (agencyDecision == null) {
			pharmaApplicationDueDiligenceImpl.setAgencyDecision("");
		}
		else {
			pharmaApplicationDueDiligenceImpl.setAgencyDecision(agencyDecision);
		}

		if (status == null) {
			pharmaApplicationDueDiligenceImpl.setStatus("");
		}
		else {
			pharmaApplicationDueDiligenceImpl.setStatus(status);
		}

		if (caseId == null) {
			pharmaApplicationDueDiligenceImpl.setCaseId("");
		}
		else {
			pharmaApplicationDueDiligenceImpl.setCaseId(caseId);
		}

		pharmaApplicationDueDiligenceImpl.resetOriginalValues();

		return pharmaApplicationDueDiligenceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		pharmaAppDDId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		transactionNumber = objectInput.readUTF();
		entityName = objectInput.readUTF();
		dateOfApplication = objectInput.readLong();
		agencyContactName = objectInput.readUTF();
		agencyEmailAddress = objectInput.readUTF();
		licenseNumber = objectInput.readUTF();
		agencyName = objectInput.readUTF();
		submittedToAgencyDate = objectInput.readLong();
		feedbackReceivedDate = objectInput.readLong();
		deadlineDate = objectInput.readLong();

		pharmaApplicationId = objectInput.readLong();
		updatedBySource = objectInput.readUTF();
		durationOfTimeSpent = objectInput.readUTF();
		agencyDecision = objectInput.readUTF();
		status = objectInput.readUTF();
		caseId = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(pharmaAppDDId);

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

		if (transactionNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(transactionNumber);
		}

		if (entityName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(entityName);
		}

		objectOutput.writeLong(dateOfApplication);

		if (agencyContactName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(agencyContactName);
		}

		if (agencyEmailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(agencyEmailAddress);
		}

		if (licenseNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(licenseNumber);
		}

		if (agencyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(agencyName);
		}

		objectOutput.writeLong(submittedToAgencyDate);
		objectOutput.writeLong(feedbackReceivedDate);
		objectOutput.writeLong(deadlineDate);

		objectOutput.writeLong(pharmaApplicationId);

		if (updatedBySource == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(updatedBySource);
		}

		if (durationOfTimeSpent == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(durationOfTimeSpent);
		}

		if (agencyDecision == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(agencyDecision);
		}

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}
	}

	public long pharmaAppDDId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String transactionNumber;
	public String entityName;
	public long dateOfApplication;
	public String agencyContactName;
	public String agencyEmailAddress;
	public String licenseNumber;
	public String agencyName;
	public long submittedToAgencyDate;
	public long feedbackReceivedDate;
	public long deadlineDate;
	public long pharmaApplicationId;
	public String updatedBySource;
	public String durationOfTimeSpent;
	public String agencyDecision;
	public String status;
	public String caseId;

}