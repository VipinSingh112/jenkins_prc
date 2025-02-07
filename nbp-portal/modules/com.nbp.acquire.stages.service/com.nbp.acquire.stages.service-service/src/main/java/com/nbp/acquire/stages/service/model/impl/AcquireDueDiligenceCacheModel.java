/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.acquire.stages.service.model.AcquireDueDiligence;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AcquireDueDiligence in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AcquireDueDiligenceCacheModel
	implements CacheModel<AcquireDueDiligence>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AcquireDueDiligenceCacheModel)) {
			return false;
		}

		AcquireDueDiligenceCacheModel acquireDueDiligenceCacheModel =
			(AcquireDueDiligenceCacheModel)object;

		if (sampleId == acquireDueDiligenceCacheModel.sampleId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sampleId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{sampleId=");
		sb.append(sampleId);
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
		sb.append(", siteVisitRequired=");
		sb.append(siteVisitRequired);
		sb.append(", preferredSitVisitDate=");
		sb.append(preferredSitVisitDate);
		sb.append(", agencySubmissionStatus=");
		sb.append(agencySubmissionStatus);
		sb.append(", nameOfAgency=");
		sb.append(nameOfAgency);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", dateSubmittedToAgency=");
		sb.append(dateSubmittedToAgency);
		sb.append(", agencyRecommendations=");
		sb.append(agencyRecommendations);
		sb.append(", dateFeedbackReceived=");
		sb.append(dateFeedbackReceived);
		sb.append(", acquireApplicationId=");
		sb.append(acquireApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AcquireDueDiligence toEntityModel() {
		AcquireDueDiligenceImpl acquireDueDiligenceImpl =
			new AcquireDueDiligenceImpl();

		acquireDueDiligenceImpl.setSampleId(sampleId);
		acquireDueDiligenceImpl.setGroupId(groupId);
		acquireDueDiligenceImpl.setCompanyId(companyId);
		acquireDueDiligenceImpl.setUserId(userId);

		if (userName == null) {
			acquireDueDiligenceImpl.setUserName("");
		}
		else {
			acquireDueDiligenceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			acquireDueDiligenceImpl.setCreateDate(null);
		}
		else {
			acquireDueDiligenceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			acquireDueDiligenceImpl.setModifiedDate(null);
		}
		else {
			acquireDueDiligenceImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (siteVisitRequired == null) {
			acquireDueDiligenceImpl.setSiteVisitRequired("");
		}
		else {
			acquireDueDiligenceImpl.setSiteVisitRequired(siteVisitRequired);
		}

		if (preferredSitVisitDate == Long.MIN_VALUE) {
			acquireDueDiligenceImpl.setPreferredSitVisitDate(null);
		}
		else {
			acquireDueDiligenceImpl.setPreferredSitVisitDate(
				new Date(preferredSitVisitDate));
		}

		if (agencySubmissionStatus == null) {
			acquireDueDiligenceImpl.setAgencySubmissionStatus("");
		}
		else {
			acquireDueDiligenceImpl.setAgencySubmissionStatus(
				agencySubmissionStatus);
		}

		if (nameOfAgency == null) {
			acquireDueDiligenceImpl.setNameOfAgency("");
		}
		else {
			acquireDueDiligenceImpl.setNameOfAgency(nameOfAgency);
		}

		if (caseId == null) {
			acquireDueDiligenceImpl.setCaseId("");
		}
		else {
			acquireDueDiligenceImpl.setCaseId(caseId);
		}

		if (dateSubmittedToAgency == Long.MIN_VALUE) {
			acquireDueDiligenceImpl.setDateSubmittedToAgency(null);
		}
		else {
			acquireDueDiligenceImpl.setDateSubmittedToAgency(
				new Date(dateSubmittedToAgency));
		}

		if (agencyRecommendations == null) {
			acquireDueDiligenceImpl.setAgencyRecommendations("");
		}
		else {
			acquireDueDiligenceImpl.setAgencyRecommendations(
				agencyRecommendations);
		}

		if (dateFeedbackReceived == Long.MIN_VALUE) {
			acquireDueDiligenceImpl.setDateFeedbackReceived(null);
		}
		else {
			acquireDueDiligenceImpl.setDateFeedbackReceived(
				new Date(dateFeedbackReceived));
		}

		acquireDueDiligenceImpl.setAcquireApplicationId(acquireApplicationId);

		acquireDueDiligenceImpl.resetOriginalValues();

		return acquireDueDiligenceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sampleId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		siteVisitRequired = objectInput.readUTF();
		preferredSitVisitDate = objectInput.readLong();
		agencySubmissionStatus = objectInput.readUTF();
		nameOfAgency = objectInput.readUTF();
		caseId = objectInput.readUTF();
		dateSubmittedToAgency = objectInput.readLong();
		agencyRecommendations = objectInput.readUTF();
		dateFeedbackReceived = objectInput.readLong();

		acquireApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sampleId);

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

		if (siteVisitRequired == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(siteVisitRequired);
		}

		objectOutput.writeLong(preferredSitVisitDate);

		if (agencySubmissionStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(agencySubmissionStatus);
		}

		if (nameOfAgency == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfAgency);
		}

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		objectOutput.writeLong(dateSubmittedToAgency);

		if (agencyRecommendations == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(agencyRecommendations);
		}

		objectOutput.writeLong(dateFeedbackReceived);

		objectOutput.writeLong(acquireApplicationId);
	}

	public long sampleId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String siteVisitRequired;
	public long preferredSitVisitDate;
	public String agencySubmissionStatus;
	public String nameOfAgency;
	public String caseId;
	public long dateSubmittedToAgency;
	public String agencyRecommendations;
	public long dateFeedbackReceived;
	public long acquireApplicationId;

}