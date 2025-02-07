/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncbj.stages.services.model.NcbjApplicationStages;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcbjApplicationStages in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcbjApplicationStagesCacheModel
	implements CacheModel<NcbjApplicationStages>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcbjApplicationStagesCacheModel)) {
			return false;
		}

		NcbjApplicationStagesCacheModel ncbjApplicationStagesCacheModel =
			(NcbjApplicationStagesCacheModel)object;

		if (ncbjStagesApplicationId ==
				ncbjApplicationStagesCacheModel.ncbjStagesApplicationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncbjStagesApplicationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", ncbjStagesApplicationId=");
		sb.append(ncbjStagesApplicationId);
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
		sb.append(", duration=");
		sb.append(duration);
		sb.append(", stageStatus=");
		sb.append(stageStatus);
		sb.append(", stageStartDate=");
		sb.append(stageStartDate);
		sb.append(", stageEndDate=");
		sb.append(stageEndDate);
		sb.append(", ncbjApplicationId=");
		sb.append(ncbjApplicationId);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", updateBySource=");
		sb.append(updateBySource);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcbjApplicationStages toEntityModel() {
		NcbjApplicationStagesImpl ncbjApplicationStagesImpl =
			new NcbjApplicationStagesImpl();

		if (uuid == null) {
			ncbjApplicationStagesImpl.setUuid("");
		}
		else {
			ncbjApplicationStagesImpl.setUuid(uuid);
		}

		ncbjApplicationStagesImpl.setNcbjStagesApplicationId(
			ncbjStagesApplicationId);
		ncbjApplicationStagesImpl.setGroupId(groupId);
		ncbjApplicationStagesImpl.setCompanyId(companyId);
		ncbjApplicationStagesImpl.setUserId(userId);

		if (userName == null) {
			ncbjApplicationStagesImpl.setUserName("");
		}
		else {
			ncbjApplicationStagesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncbjApplicationStagesImpl.setCreateDate(null);
		}
		else {
			ncbjApplicationStagesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncbjApplicationStagesImpl.setModifiedDate(null);
		}
		else {
			ncbjApplicationStagesImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (stageName == null) {
			ncbjApplicationStagesImpl.setStageName("");
		}
		else {
			ncbjApplicationStagesImpl.setStageName(stageName);
		}

		if (duration == null) {
			ncbjApplicationStagesImpl.setDuration("");
		}
		else {
			ncbjApplicationStagesImpl.setDuration(duration);
		}

		if (stageStatus == null) {
			ncbjApplicationStagesImpl.setStageStatus("");
		}
		else {
			ncbjApplicationStagesImpl.setStageStatus(stageStatus);
		}

		if (stageStartDate == Long.MIN_VALUE) {
			ncbjApplicationStagesImpl.setStageStartDate(null);
		}
		else {
			ncbjApplicationStagesImpl.setStageStartDate(
				new Date(stageStartDate));
		}

		if (stageEndDate == Long.MIN_VALUE) {
			ncbjApplicationStagesImpl.setStageEndDate(null);
		}
		else {
			ncbjApplicationStagesImpl.setStageEndDate(new Date(stageEndDate));
		}

		ncbjApplicationStagesImpl.setNcbjApplicationId(ncbjApplicationId);

		if (caseId == null) {
			ncbjApplicationStagesImpl.setCaseId("");
		}
		else {
			ncbjApplicationStagesImpl.setCaseId(caseId);
		}

		if (updateBySource == null) {
			ncbjApplicationStagesImpl.setUpdateBySource("");
		}
		else {
			ncbjApplicationStagesImpl.setUpdateBySource(updateBySource);
		}

		ncbjApplicationStagesImpl.resetOriginalValues();

		return ncbjApplicationStagesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		ncbjStagesApplicationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		stageName = objectInput.readUTF();
		duration = objectInput.readUTF();
		stageStatus = objectInput.readUTF();
		stageStartDate = objectInput.readLong();
		stageEndDate = objectInput.readLong();

		ncbjApplicationId = objectInput.readLong();
		caseId = objectInput.readUTF();
		updateBySource = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(ncbjStagesApplicationId);

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

		objectOutput.writeLong(stageStartDate);
		objectOutput.writeLong(stageEndDate);

		objectOutput.writeLong(ncbjApplicationId);

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		if (updateBySource == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(updateBySource);
		}
	}

	public String uuid;
	public long ncbjStagesApplicationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String stageName;
	public String duration;
	public String stageStatus;
	public long stageStartDate;
	public long stageEndDate;
	public long ncbjApplicationId;
	public String caseId;
	public String updateBySource;

}