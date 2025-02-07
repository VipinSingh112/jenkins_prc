/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.wra.stage.service.model.WRAApplicationDueDiligence;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing WRAApplicationDueDiligence in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class WRAApplicationDueDiligenceCacheModel
	implements CacheModel<WRAApplicationDueDiligence>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof WRAApplicationDueDiligenceCacheModel)) {
			return false;
		}

		WRAApplicationDueDiligenceCacheModel
			wraApplicationDueDiligenceCacheModel =
				(WRAApplicationDueDiligenceCacheModel)object;

		if (wRAApplicationDueDiligenceId ==
				wraApplicationDueDiligenceCacheModel.
					wRAApplicationDueDiligenceId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, wRAApplicationDueDiligenceId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{wRAApplicationDueDiligenceId=");
		sb.append(wRAApplicationDueDiligenceId);
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
		sb.append(", wraApplicationId=");
		sb.append(wraApplicationId);
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
	public WRAApplicationDueDiligence toEntityModel() {
		WRAApplicationDueDiligenceImpl wraApplicationDueDiligenceImpl =
			new WRAApplicationDueDiligenceImpl();

		wraApplicationDueDiligenceImpl.setWRAApplicationDueDiligenceId(
			wRAApplicationDueDiligenceId);
		wraApplicationDueDiligenceImpl.setGroupId(groupId);
		wraApplicationDueDiligenceImpl.setCompanyId(companyId);
		wraApplicationDueDiligenceImpl.setUserId(userId);

		if (userName == null) {
			wraApplicationDueDiligenceImpl.setUserName("");
		}
		else {
			wraApplicationDueDiligenceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			wraApplicationDueDiligenceImpl.setCreateDate(null);
		}
		else {
			wraApplicationDueDiligenceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			wraApplicationDueDiligenceImpl.setModifiedDate(null);
		}
		else {
			wraApplicationDueDiligenceImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (transactionNumber == null) {
			wraApplicationDueDiligenceImpl.setTransactionNumber("");
		}
		else {
			wraApplicationDueDiligenceImpl.setTransactionNumber(
				transactionNumber);
		}

		if (entityName == null) {
			wraApplicationDueDiligenceImpl.setEntityName("");
		}
		else {
			wraApplicationDueDiligenceImpl.setEntityName(entityName);
		}

		if (dateOfApplication == Long.MIN_VALUE) {
			wraApplicationDueDiligenceImpl.setDateOfApplication(null);
		}
		else {
			wraApplicationDueDiligenceImpl.setDateOfApplication(
				new Date(dateOfApplication));
		}

		if (agencyContactName == null) {
			wraApplicationDueDiligenceImpl.setAgencyContactName("");
		}
		else {
			wraApplicationDueDiligenceImpl.setAgencyContactName(
				agencyContactName);
		}

		if (agencyEmailAddress == null) {
			wraApplicationDueDiligenceImpl.setAgencyEmailAddress("");
		}
		else {
			wraApplicationDueDiligenceImpl.setAgencyEmailAddress(
				agencyEmailAddress);
		}

		if (licenseNumber == null) {
			wraApplicationDueDiligenceImpl.setLicenseNumber("");
		}
		else {
			wraApplicationDueDiligenceImpl.setLicenseNumber(licenseNumber);
		}

		if (agencyName == null) {
			wraApplicationDueDiligenceImpl.setAgencyName("");
		}
		else {
			wraApplicationDueDiligenceImpl.setAgencyName(agencyName);
		}

		if (submittedToAgencyDate == Long.MIN_VALUE) {
			wraApplicationDueDiligenceImpl.setSubmittedToAgencyDate(null);
		}
		else {
			wraApplicationDueDiligenceImpl.setSubmittedToAgencyDate(
				new Date(submittedToAgencyDate));
		}

		if (feedbackReceivedDate == Long.MIN_VALUE) {
			wraApplicationDueDiligenceImpl.setFeedbackReceivedDate(null);
		}
		else {
			wraApplicationDueDiligenceImpl.setFeedbackReceivedDate(
				new Date(feedbackReceivedDate));
		}

		if (feedbackReceived == null) {
			wraApplicationDueDiligenceImpl.setFeedbackReceived("");
		}
		else {
			wraApplicationDueDiligenceImpl.setFeedbackReceived(
				feedbackReceived);
		}

		if (deadlineDate == Long.MIN_VALUE) {
			wraApplicationDueDiligenceImpl.setDeadlineDate(null);
		}
		else {
			wraApplicationDueDiligenceImpl.setDeadlineDate(
				new Date(deadlineDate));
		}

		wraApplicationDueDiligenceImpl.setWraApplicationId(wraApplicationId);

		if (updatedBySource == null) {
			wraApplicationDueDiligenceImpl.setUpdatedBySource("");
		}
		else {
			wraApplicationDueDiligenceImpl.setUpdatedBySource(updatedBySource);
		}

		if (durationOfTimeSpent == null) {
			wraApplicationDueDiligenceImpl.setDurationOfTimeSpent("");
		}
		else {
			wraApplicationDueDiligenceImpl.setDurationOfTimeSpent(
				durationOfTimeSpent);
		}

		if (agencyDecision == null) {
			wraApplicationDueDiligenceImpl.setAgencyDecision("");
		}
		else {
			wraApplicationDueDiligenceImpl.setAgencyDecision(agencyDecision);
		}

		if (status == null) {
			wraApplicationDueDiligenceImpl.setStatus("");
		}
		else {
			wraApplicationDueDiligenceImpl.setStatus(status);
		}

		if (caseId == null) {
			wraApplicationDueDiligenceImpl.setCaseId("");
		}
		else {
			wraApplicationDueDiligenceImpl.setCaseId(caseId);
		}

		wraApplicationDueDiligenceImpl.resetOriginalValues();

		return wraApplicationDueDiligenceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		wRAApplicationDueDiligenceId = objectInput.readLong();

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

		wraApplicationId = objectInput.readLong();
		updatedBySource = objectInput.readUTF();
		durationOfTimeSpent = objectInput.readUTF();
		agencyDecision = objectInput.readUTF();
		status = objectInput.readUTF();
		caseId = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(wRAApplicationDueDiligenceId);

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

		objectOutput.writeLong(wraApplicationId);

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

	public long wRAApplicationDueDiligenceId;
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
	public long wraApplicationId;
	public String updatedBySource;
	public String durationOfTimeSpent;
	public String agencyDecision;
	public String status;
	public String caseId;

}