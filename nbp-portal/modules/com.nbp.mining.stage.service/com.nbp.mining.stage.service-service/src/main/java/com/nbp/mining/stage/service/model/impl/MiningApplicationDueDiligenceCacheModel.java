/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.mining.stage.service.model.MiningApplicationDueDiligence;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MiningApplicationDueDiligence in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MiningApplicationDueDiligenceCacheModel
	implements CacheModel<MiningApplicationDueDiligence>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MiningApplicationDueDiligenceCacheModel)) {
			return false;
		}

		MiningApplicationDueDiligenceCacheModel
			miningApplicationDueDiligenceCacheModel =
				(MiningApplicationDueDiligenceCacheModel)object;

		if (miningDueDiliId ==
				miningApplicationDueDiligenceCacheModel.miningDueDiliId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, miningDueDiliId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", miningDueDiliId=");
		sb.append(miningDueDiliId);
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
		sb.append(", agencyName=");
		sb.append(agencyName);
		sb.append(", feedbackReceived=");
		sb.append(feedbackReceived);
		sb.append(", status=");
		sb.append(status);
		sb.append(", isSubToAgency=");
		sb.append(isSubToAgency);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MiningApplicationDueDiligence toEntityModel() {
		MiningApplicationDueDiligenceImpl miningApplicationDueDiligenceImpl =
			new MiningApplicationDueDiligenceImpl();

		if (uuid == null) {
			miningApplicationDueDiligenceImpl.setUuid("");
		}
		else {
			miningApplicationDueDiligenceImpl.setUuid(uuid);
		}

		miningApplicationDueDiligenceImpl.setMiningDueDiliId(miningDueDiliId);
		miningApplicationDueDiligenceImpl.setGroupId(groupId);
		miningApplicationDueDiligenceImpl.setCompanyId(companyId);
		miningApplicationDueDiligenceImpl.setUserId(userId);

		if (userName == null) {
			miningApplicationDueDiligenceImpl.setUserName("");
		}
		else {
			miningApplicationDueDiligenceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			miningApplicationDueDiligenceImpl.setCreateDate(null);
		}
		else {
			miningApplicationDueDiligenceImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			miningApplicationDueDiligenceImpl.setModifiedDate(null);
		}
		else {
			miningApplicationDueDiligenceImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (caseId == null) {
			miningApplicationDueDiligenceImpl.setCaseId("");
		}
		else {
			miningApplicationDueDiligenceImpl.setCaseId(caseId);
		}

		if (agencyName == null) {
			miningApplicationDueDiligenceImpl.setAgencyName("");
		}
		else {
			miningApplicationDueDiligenceImpl.setAgencyName(agencyName);
		}

		if (feedbackReceived == null) {
			miningApplicationDueDiligenceImpl.setFeedbackReceived("");
		}
		else {
			miningApplicationDueDiligenceImpl.setFeedbackReceived(
				feedbackReceived);
		}

		if (status == null) {
			miningApplicationDueDiligenceImpl.setStatus("");
		}
		else {
			miningApplicationDueDiligenceImpl.setStatus(status);
		}

		if (isSubToAgency == null) {
			miningApplicationDueDiligenceImpl.setIsSubToAgency("");
		}
		else {
			miningApplicationDueDiligenceImpl.setIsSubToAgency(isSubToAgency);
		}

		miningApplicationDueDiligenceImpl.resetOriginalValues();

		return miningApplicationDueDiligenceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		miningDueDiliId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		agencyName = objectInput.readUTF();
		feedbackReceived = objectInput.readUTF();
		status = objectInput.readUTF();
		isSubToAgency = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(miningDueDiliId);

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

		if (agencyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(agencyName);
		}

		if (feedbackReceived == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(feedbackReceived);
		}

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}

		if (isSubToAgency == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(isSubToAgency);
		}
	}

	public String uuid;
	public long miningDueDiliId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public String agencyName;
	public String feedbackReceived;
	public String status;
	public String isSubToAgency;

}