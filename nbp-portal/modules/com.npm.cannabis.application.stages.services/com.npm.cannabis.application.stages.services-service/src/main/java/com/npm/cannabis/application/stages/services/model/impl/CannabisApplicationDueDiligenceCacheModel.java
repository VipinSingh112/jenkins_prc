/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.npm.cannabis.application.stages.services.model.CannabisApplicationDueDiligence;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CannabisApplicationDueDiligence in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CannabisApplicationDueDiligenceCacheModel
	implements CacheModel<CannabisApplicationDueDiligence>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CannabisApplicationDueDiligenceCacheModel)) {
			return false;
		}

		CannabisApplicationDueDiligenceCacheModel
			cannabisApplicationDueDiligenceCacheModel =
				(CannabisApplicationDueDiligenceCacheModel)object;

		if (cannabisAppDDId ==
				cannabisApplicationDueDiligenceCacheModel.cannabisAppDDId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cannabisAppDDId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(47);

		sb.append("{cannabisAppDDId=");
		sb.append(cannabisAppDDId);
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
		sb.append(", cannabisApplicationId=");
		sb.append(cannabisApplicationId);
		sb.append(", updatedBySource=");
		sb.append(updatedBySource);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusOfAgencyLetter=");
		sb.append(statusOfAgencyLetter);
		sb.append(", agencyDecision=");
		sb.append(agencyDecision);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CannabisApplicationDueDiligence toEntityModel() {
		CannabisApplicationDueDiligenceImpl
			cannabisApplicationDueDiligenceImpl =
				new CannabisApplicationDueDiligenceImpl();

		cannabisApplicationDueDiligenceImpl.setCannabisAppDDId(cannabisAppDDId);
		cannabisApplicationDueDiligenceImpl.setGroupId(groupId);
		cannabisApplicationDueDiligenceImpl.setCompanyId(companyId);
		cannabisApplicationDueDiligenceImpl.setUserId(userId);

		if (userName == null) {
			cannabisApplicationDueDiligenceImpl.setUserName("");
		}
		else {
			cannabisApplicationDueDiligenceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			cannabisApplicationDueDiligenceImpl.setCreateDate(null);
		}
		else {
			cannabisApplicationDueDiligenceImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cannabisApplicationDueDiligenceImpl.setModifiedDate(null);
		}
		else {
			cannabisApplicationDueDiligenceImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (transactionNumber == null) {
			cannabisApplicationDueDiligenceImpl.setTransactionNumber("");
		}
		else {
			cannabisApplicationDueDiligenceImpl.setTransactionNumber(
				transactionNumber);
		}

		if (entityName == null) {
			cannabisApplicationDueDiligenceImpl.setEntityName("");
		}
		else {
			cannabisApplicationDueDiligenceImpl.setEntityName(entityName);
		}

		if (dateOfApplication == Long.MIN_VALUE) {
			cannabisApplicationDueDiligenceImpl.setDateOfApplication(null);
		}
		else {
			cannabisApplicationDueDiligenceImpl.setDateOfApplication(
				new Date(dateOfApplication));
		}

		if (agencyContactName == null) {
			cannabisApplicationDueDiligenceImpl.setAgencyContactName("");
		}
		else {
			cannabisApplicationDueDiligenceImpl.setAgencyContactName(
				agencyContactName);
		}

		if (agencyEmailAddress == null) {
			cannabisApplicationDueDiligenceImpl.setAgencyEmailAddress("");
		}
		else {
			cannabisApplicationDueDiligenceImpl.setAgencyEmailAddress(
				agencyEmailAddress);
		}

		if (licenseNumber == null) {
			cannabisApplicationDueDiligenceImpl.setLicenseNumber("");
		}
		else {
			cannabisApplicationDueDiligenceImpl.setLicenseNumber(licenseNumber);
		}

		if (agencyName == null) {
			cannabisApplicationDueDiligenceImpl.setAgencyName("");
		}
		else {
			cannabisApplicationDueDiligenceImpl.setAgencyName(agencyName);
		}

		if (submittedToAgencyDate == Long.MIN_VALUE) {
			cannabisApplicationDueDiligenceImpl.setSubmittedToAgencyDate(null);
		}
		else {
			cannabisApplicationDueDiligenceImpl.setSubmittedToAgencyDate(
				new Date(submittedToAgencyDate));
		}

		if (feedbackReceivedDate == Long.MIN_VALUE) {
			cannabisApplicationDueDiligenceImpl.setFeedbackReceivedDate(null);
		}
		else {
			cannabisApplicationDueDiligenceImpl.setFeedbackReceivedDate(
				new Date(feedbackReceivedDate));
		}

		if (deadlineDate == Long.MIN_VALUE) {
			cannabisApplicationDueDiligenceImpl.setDeadlineDate(null);
		}
		else {
			cannabisApplicationDueDiligenceImpl.setDeadlineDate(
				new Date(deadlineDate));
		}

		cannabisApplicationDueDiligenceImpl.setCannabisApplicationId(
			cannabisApplicationId);

		if (updatedBySource == null) {
			cannabisApplicationDueDiligenceImpl.setUpdatedBySource("");
		}
		else {
			cannabisApplicationDueDiligenceImpl.setUpdatedBySource(
				updatedBySource);
		}

		if (status == null) {
			cannabisApplicationDueDiligenceImpl.setStatus("");
		}
		else {
			cannabisApplicationDueDiligenceImpl.setStatus(status);
		}

		if (statusOfAgencyLetter == null) {
			cannabisApplicationDueDiligenceImpl.setStatusOfAgencyLetter("");
		}
		else {
			cannabisApplicationDueDiligenceImpl.setStatusOfAgencyLetter(
				statusOfAgencyLetter);
		}

		if (agencyDecision == null) {
			cannabisApplicationDueDiligenceImpl.setAgencyDecision("");
		}
		else {
			cannabisApplicationDueDiligenceImpl.setAgencyDecision(
				agencyDecision);
		}

		if (caseId == null) {
			cannabisApplicationDueDiligenceImpl.setCaseId("");
		}
		else {
			cannabisApplicationDueDiligenceImpl.setCaseId(caseId);
		}

		cannabisApplicationDueDiligenceImpl.resetOriginalValues();

		return cannabisApplicationDueDiligenceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cannabisAppDDId = objectInput.readLong();

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

		cannabisApplicationId = objectInput.readLong();
		updatedBySource = objectInput.readUTF();
		status = objectInput.readUTF();
		statusOfAgencyLetter = objectInput.readUTF();
		agencyDecision = objectInput.readUTF();
		caseId = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(cannabisAppDDId);

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

		objectOutput.writeLong(cannabisApplicationId);

		if (updatedBySource == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(updatedBySource);
		}

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}

		if (statusOfAgencyLetter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusOfAgencyLetter);
		}

		if (agencyDecision == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(agencyDecision);
		}

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}
	}

	public long cannabisAppDDId;
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
	public long cannabisApplicationId;
	public String updatedBySource;
	public String status;
	public String statusOfAgencyLetter;
	public String agencyDecision;
	public String caseId;

}