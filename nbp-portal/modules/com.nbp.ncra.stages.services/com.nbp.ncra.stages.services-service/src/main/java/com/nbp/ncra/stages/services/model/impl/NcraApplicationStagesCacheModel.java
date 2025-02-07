/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncra.stages.services.model.NcraApplicationStages;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcraApplicationStages in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcraApplicationStagesCacheModel
	implements CacheModel<NcraApplicationStages>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcraApplicationStagesCacheModel)) {
			return false;
		}

		NcraApplicationStagesCacheModel ncraApplicationStagesCacheModel =
			(NcraApplicationStagesCacheModel)object;

		if (ncraApplciationStage ==
				ncraApplicationStagesCacheModel.ncraApplciationStage) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncraApplciationStage);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", ncraApplciationStage=");
		sb.append(ncraApplciationStage);
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
		sb.append(", stageName=");
		sb.append(stageName);
		sb.append(", stageEndDate=");
		sb.append(stageEndDate);
		sb.append(", stageStartDate=");
		sb.append(stageStartDate);
		sb.append(", duration=");
		sb.append(duration);
		sb.append(", stageStatus=");
		sb.append(stageStatus);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", updatedBySource=");
		sb.append(updatedBySource);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcraApplicationStages toEntityModel() {
		NcraApplicationStagesImpl ncraApplicationStagesImpl =
			new NcraApplicationStagesImpl();

		if (uuid == null) {
			ncraApplicationStagesImpl.setUuid("");
		}
		else {
			ncraApplicationStagesImpl.setUuid(uuid);
		}

		ncraApplicationStagesImpl.setNcraApplciationStage(ncraApplciationStage);
		ncraApplicationStagesImpl.setGroupId(groupId);
		ncraApplicationStagesImpl.setCompanyId(companyId);
		ncraApplicationStagesImpl.setUserId(userId);

		if (userName == null) {
			ncraApplicationStagesImpl.setUserName("");
		}
		else {
			ncraApplicationStagesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncraApplicationStagesImpl.setCreateDate(null);
		}
		else {
			ncraApplicationStagesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncraApplicationStagesImpl.setModifiedDate(null);
		}
		else {
			ncraApplicationStagesImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (stageName == null) {
			ncraApplicationStagesImpl.setStageName("");
		}
		else {
			ncraApplicationStagesImpl.setStageName(stageName);
		}

		if (stageEndDate == Long.MIN_VALUE) {
			ncraApplicationStagesImpl.setStageEndDate(null);
		}
		else {
			ncraApplicationStagesImpl.setStageEndDate(new Date(stageEndDate));
		}

		if (stageStartDate == Long.MIN_VALUE) {
			ncraApplicationStagesImpl.setStageStartDate(null);
		}
		else {
			ncraApplicationStagesImpl.setStageStartDate(
				new Date(stageStartDate));
		}

		if (duration == null) {
			ncraApplicationStagesImpl.setDuration("");
		}
		else {
			ncraApplicationStagesImpl.setDuration(duration);
		}

		if (stageStatus == null) {
			ncraApplicationStagesImpl.setStageStatus("");
		}
		else {
			ncraApplicationStagesImpl.setStageStatus(stageStatus);
		}

		if (caseId == null) {
			ncraApplicationStagesImpl.setCaseId("");
		}
		else {
			ncraApplicationStagesImpl.setCaseId(caseId);
		}

		if (updatedBySource == null) {
			ncraApplicationStagesImpl.setUpdatedBySource("");
		}
		else {
			ncraApplicationStagesImpl.setUpdatedBySource(updatedBySource);
		}

		ncraApplicationStagesImpl.resetOriginalValues();

		return ncraApplicationStagesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		ncraApplciationStage = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		stageName = objectInput.readUTF();
		stageEndDate = objectInput.readLong();
		stageStartDate = objectInput.readLong();
		duration = objectInput.readUTF();
		stageStatus = objectInput.readUTF();
		caseId = objectInput.readUTF();
		updatedBySource = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(ncraApplciationStage);

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

		if (stageName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(stageName);
		}

		objectOutput.writeLong(stageEndDate);
		objectOutput.writeLong(stageStartDate);

		if (duration == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(duration);
		}

		if (stageStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(stageStatus);
		}

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		if (updatedBySource == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(updatedBySource);
		}
	}

	public String uuid;
	public long ncraApplciationStage;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String stageName;
	public long stageEndDate;
	public long stageStartDate;
	public String duration;
	public String stageStatus;
	public String caseId;
	public String updatedBySource;

}