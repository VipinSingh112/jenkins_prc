/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.healthcare.stage.service.model.HealthCareDueDiligence;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing HealthCareDueDiligence in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HealthCareDueDiligenceCacheModel
	implements CacheModel<HealthCareDueDiligence>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof HealthCareDueDiligenceCacheModel)) {
			return false;
		}

		HealthCareDueDiligenceCacheModel healthCareDueDiligenceCacheModel =
			(HealthCareDueDiligenceCacheModel)object;

		if (healthDDId == healthCareDueDiligenceCacheModel.healthDDId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, healthDDId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{healthDDId=");
		sb.append(healthDDId);
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
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", dateSubmittedAgency =");
		sb.append(dateSubmittedAgency);
		sb.append(", nameofAgency=");
		sb.append(nameofAgency);
		sb.append(", agencyDecision=");
		sb.append(agencyDecision);
		sb.append(", reasonForObejction=");
		sb.append(reasonForObejction);
		sb.append(", durationOfPeriod=");
		sb.append(durationOfPeriod);
		sb.append(", date=");
		sb.append(date);
		sb.append(", feedbackReceived=");
		sb.append(feedbackReceived);
		sb.append(", Status=");
		sb.append(Status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public HealthCareDueDiligence toEntityModel() {
		HealthCareDueDiligenceImpl healthCareDueDiligenceImpl =
			new HealthCareDueDiligenceImpl();

		healthCareDueDiligenceImpl.setHealthDDId(healthDDId);
		healthCareDueDiligenceImpl.setGroupId(groupId);
		healthCareDueDiligenceImpl.setCompanyId(companyId);
		healthCareDueDiligenceImpl.setUserId(userId);

		if (userName == null) {
			healthCareDueDiligenceImpl.setUserName("");
		}
		else {
			healthCareDueDiligenceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			healthCareDueDiligenceImpl.setCreateDate(null);
		}
		else {
			healthCareDueDiligenceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			healthCareDueDiligenceImpl.setModifiedDate(null);
		}
		else {
			healthCareDueDiligenceImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			healthCareDueDiligenceImpl.setCaseId("");
		}
		else {
			healthCareDueDiligenceImpl.setCaseId(caseId);
		}

		if (dateSubmittedAgency == Long.MIN_VALUE) {
			healthCareDueDiligenceImpl.setDateSubmittedAgency(null);
		}
		else {
			healthCareDueDiligenceImpl.setDateSubmittedAgency(
				new Date(dateSubmittedAgency));
		}

		if (nameofAgency == null) {
			healthCareDueDiligenceImpl.setNameofAgency("");
		}
		else {
			healthCareDueDiligenceImpl.setNameofAgency(nameofAgency);
		}

		if (agencyDecision == null) {
			healthCareDueDiligenceImpl.setAgencyDecision("");
		}
		else {
			healthCareDueDiligenceImpl.setAgencyDecision(agencyDecision);
		}

		if (reasonForObejction == null) {
			healthCareDueDiligenceImpl.setReasonForObejction("");
		}
		else {
			healthCareDueDiligenceImpl.setReasonForObejction(
				reasonForObejction);
		}

		if (durationOfPeriod == null) {
			healthCareDueDiligenceImpl.setDurationOfPeriod("");
		}
		else {
			healthCareDueDiligenceImpl.setDurationOfPeriod(durationOfPeriod);
		}

		if (date == Long.MIN_VALUE) {
			healthCareDueDiligenceImpl.setDate(null);
		}
		else {
			healthCareDueDiligenceImpl.setDate(new Date(date));
		}

		if (feedbackReceived == Long.MIN_VALUE) {
			healthCareDueDiligenceImpl.setFeedbackReceived(null);
		}
		else {
			healthCareDueDiligenceImpl.setFeedbackReceived(
				new Date(feedbackReceived));
		}

		if (Status == null) {
			healthCareDueDiligenceImpl.setStatus("");
		}
		else {
			healthCareDueDiligenceImpl.setStatus(Status);
		}

		healthCareDueDiligenceImpl.resetOriginalValues();

		return healthCareDueDiligenceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		healthDDId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		dateSubmittedAgency = objectInput.readLong();
		nameofAgency = objectInput.readUTF();
		agencyDecision = objectInput.readUTF();
		reasonForObejction = objectInput.readUTF();
		durationOfPeriod = objectInput.readUTF();
		date = objectInput.readLong();
		feedbackReceived = objectInput.readLong();
		Status = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(healthDDId);

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

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		objectOutput.writeLong(dateSubmittedAgency);

		if (nameofAgency == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameofAgency);
		}

		if (agencyDecision == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(agencyDecision);
		}

		if (reasonForObejction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(reasonForObejction);
		}

		if (durationOfPeriod == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(durationOfPeriod);
		}

		objectOutput.writeLong(date);
		objectOutput.writeLong(feedbackReceived);

		if (Status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Status);
		}
	}

	public long healthDDId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public long dateSubmittedAgency;
	public String nameofAgency;
	public String agencyDecision;
	public String reasonForObejction;
	public String durationOfPeriod;
	public long date;
	public long feedbackReceived;
	public String Status;

}