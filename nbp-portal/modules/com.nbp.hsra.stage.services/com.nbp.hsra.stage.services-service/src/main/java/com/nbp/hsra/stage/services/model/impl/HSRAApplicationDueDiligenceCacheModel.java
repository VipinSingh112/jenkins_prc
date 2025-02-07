/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.stage.services.model.HSRAApplicationDueDiligence;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing HSRAApplicationDueDiligence in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HSRAApplicationDueDiligenceCacheModel
	implements CacheModel<HSRAApplicationDueDiligence>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof HSRAApplicationDueDiligenceCacheModel)) {
			return false;
		}

		HSRAApplicationDueDiligenceCacheModel
			hsraApplicationDueDiligenceCacheModel =
				(HSRAApplicationDueDiligenceCacheModel)object;

		if (hsraAppDDId == hsraApplicationDueDiligenceCacheModel.hsraAppDDId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, hsraAppDDId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{hsraAppDDId=");
		sb.append(hsraAppDDId);
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
		sb.append(", feedbackReceived=");
		sb.append(feedbackReceived);
		sb.append(", deadlineDate=");
		sb.append(deadlineDate);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
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
	public HSRAApplicationDueDiligence toEntityModel() {
		HSRAApplicationDueDiligenceImpl hsraApplicationDueDiligenceImpl =
			new HSRAApplicationDueDiligenceImpl();

		hsraApplicationDueDiligenceImpl.setHsraAppDDId(hsraAppDDId);
		hsraApplicationDueDiligenceImpl.setGroupId(groupId);
		hsraApplicationDueDiligenceImpl.setCompanyId(companyId);
		hsraApplicationDueDiligenceImpl.setUserId(userId);

		if (userName == null) {
			hsraApplicationDueDiligenceImpl.setUserName("");
		}
		else {
			hsraApplicationDueDiligenceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			hsraApplicationDueDiligenceImpl.setCreateDate(null);
		}
		else {
			hsraApplicationDueDiligenceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			hsraApplicationDueDiligenceImpl.setModifiedDate(null);
		}
		else {
			hsraApplicationDueDiligenceImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (transactionNumber == null) {
			hsraApplicationDueDiligenceImpl.setTransactionNumber("");
		}
		else {
			hsraApplicationDueDiligenceImpl.setTransactionNumber(
				transactionNumber);
		}

		if (entityName == null) {
			hsraApplicationDueDiligenceImpl.setEntityName("");
		}
		else {
			hsraApplicationDueDiligenceImpl.setEntityName(entityName);
		}

		if (dateOfApplication == Long.MIN_VALUE) {
			hsraApplicationDueDiligenceImpl.setDateOfApplication(null);
		}
		else {
			hsraApplicationDueDiligenceImpl.setDateOfApplication(
				new Date(dateOfApplication));
		}

		if (agencyContactName == null) {
			hsraApplicationDueDiligenceImpl.setAgencyContactName("");
		}
		else {
			hsraApplicationDueDiligenceImpl.setAgencyContactName(
				agencyContactName);
		}

		if (agencyEmailAddress == null) {
			hsraApplicationDueDiligenceImpl.setAgencyEmailAddress("");
		}
		else {
			hsraApplicationDueDiligenceImpl.setAgencyEmailAddress(
				agencyEmailAddress);
		}

		if (licenseNumber == null) {
			hsraApplicationDueDiligenceImpl.setLicenseNumber("");
		}
		else {
			hsraApplicationDueDiligenceImpl.setLicenseNumber(licenseNumber);
		}

		if (agencyName == null) {
			hsraApplicationDueDiligenceImpl.setAgencyName("");
		}
		else {
			hsraApplicationDueDiligenceImpl.setAgencyName(agencyName);
		}

		if (submittedToAgencyDate == Long.MIN_VALUE) {
			hsraApplicationDueDiligenceImpl.setSubmittedToAgencyDate(null);
		}
		else {
			hsraApplicationDueDiligenceImpl.setSubmittedToAgencyDate(
				new Date(submittedToAgencyDate));
		}

		if (feedbackReceivedDate == Long.MIN_VALUE) {
			hsraApplicationDueDiligenceImpl.setFeedbackReceivedDate(null);
		}
		else {
			hsraApplicationDueDiligenceImpl.setFeedbackReceivedDate(
				new Date(feedbackReceivedDate));
		}

		if (feedbackReceived == null) {
			hsraApplicationDueDiligenceImpl.setFeedbackReceived("");
		}
		else {
			hsraApplicationDueDiligenceImpl.setFeedbackReceived(
				feedbackReceived);
		}

		if (deadlineDate == Long.MIN_VALUE) {
			hsraApplicationDueDiligenceImpl.setDeadlineDate(null);
		}
		else {
			hsraApplicationDueDiligenceImpl.setDeadlineDate(
				new Date(deadlineDate));
		}

		hsraApplicationDueDiligenceImpl.setHsraApplicationId(hsraApplicationId);

		if (updatedBySource == null) {
			hsraApplicationDueDiligenceImpl.setUpdatedBySource("");
		}
		else {
			hsraApplicationDueDiligenceImpl.setUpdatedBySource(updatedBySource);
		}

		if (durationOfTimeSpent == null) {
			hsraApplicationDueDiligenceImpl.setDurationOfTimeSpent("");
		}
		else {
			hsraApplicationDueDiligenceImpl.setDurationOfTimeSpent(
				durationOfTimeSpent);
		}

		if (agencyDecision == null) {
			hsraApplicationDueDiligenceImpl.setAgencyDecision("");
		}
		else {
			hsraApplicationDueDiligenceImpl.setAgencyDecision(agencyDecision);
		}

		if (status == null) {
			hsraApplicationDueDiligenceImpl.setStatus("");
		}
		else {
			hsraApplicationDueDiligenceImpl.setStatus(status);
		}

		if (caseId == null) {
			hsraApplicationDueDiligenceImpl.setCaseId("");
		}
		else {
			hsraApplicationDueDiligenceImpl.setCaseId(caseId);
		}

		hsraApplicationDueDiligenceImpl.resetOriginalValues();

		return hsraApplicationDueDiligenceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		hsraAppDDId = objectInput.readLong();

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
		feedbackReceived = objectInput.readUTF();
		deadlineDate = objectInput.readLong();

		hsraApplicationId = objectInput.readLong();
		updatedBySource = objectInput.readUTF();
		durationOfTimeSpent = objectInput.readUTF();
		agencyDecision = objectInput.readUTF();
		status = objectInput.readUTF();
		caseId = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(hsraAppDDId);

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

		if (feedbackReceived == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(feedbackReceived);
		}

		objectOutput.writeLong(deadlineDate);

		objectOutput.writeLong(hsraApplicationId);

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

	public long hsraAppDDId;
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
	public String feedbackReceived;
	public long deadlineDate;
	public long hsraApplicationId;
	public String updatedBySource;
	public String durationOfTimeSpent;
	public String agencyDecision;
	public String status;
	public String caseId;

}