/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.creative.stages.services.model.CreativeApplicationStages;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CreativeApplicationStages in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CreativeApplicationStagesCacheModel
	implements CacheModel<CreativeApplicationStages>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CreativeApplicationStagesCacheModel)) {
			return false;
		}

		CreativeApplicationStagesCacheModel
			creativeApplicationStagesCacheModel =
				(CreativeApplicationStagesCacheModel)object;

		if (creativeApplicationStagesId ==
				creativeApplicationStagesCacheModel.
					creativeApplicationStagesId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, creativeApplicationStagesId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", creativeApplicationStagesId=");
		sb.append(creativeApplicationStagesId);
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
		sb.append(", creativeApplicationId=");
		sb.append(creativeApplicationId);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", updatedBySource=");
		sb.append(updatedBySource);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CreativeApplicationStages toEntityModel() {
		CreativeApplicationStagesImpl creativeApplicationStagesImpl =
			new CreativeApplicationStagesImpl();

		if (uuid == null) {
			creativeApplicationStagesImpl.setUuid("");
		}
		else {
			creativeApplicationStagesImpl.setUuid(uuid);
		}

		creativeApplicationStagesImpl.setCreativeApplicationStagesId(
			creativeApplicationStagesId);
		creativeApplicationStagesImpl.setGroupId(groupId);
		creativeApplicationStagesImpl.setCompanyId(companyId);
		creativeApplicationStagesImpl.setUserId(userId);

		if (userName == null) {
			creativeApplicationStagesImpl.setUserName("");
		}
		else {
			creativeApplicationStagesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			creativeApplicationStagesImpl.setCreateDate(null);
		}
		else {
			creativeApplicationStagesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			creativeApplicationStagesImpl.setModifiedDate(null);
		}
		else {
			creativeApplicationStagesImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (stageName == null) {
			creativeApplicationStagesImpl.setStageName("");
		}
		else {
			creativeApplicationStagesImpl.setStageName(stageName);
		}

		if (duration == null) {
			creativeApplicationStagesImpl.setDuration("");
		}
		else {
			creativeApplicationStagesImpl.setDuration(duration);
		}

		if (stageStatus == null) {
			creativeApplicationStagesImpl.setStageStatus("");
		}
		else {
			creativeApplicationStagesImpl.setStageStatus(stageStatus);
		}

		if (stageStartDate == Long.MIN_VALUE) {
			creativeApplicationStagesImpl.setStageStartDate(null);
		}
		else {
			creativeApplicationStagesImpl.setStageStartDate(
				new Date(stageStartDate));
		}

		if (stageEndDate == Long.MIN_VALUE) {
			creativeApplicationStagesImpl.setStageEndDate(null);
		}
		else {
			creativeApplicationStagesImpl.setStageEndDate(
				new Date(stageEndDate));
		}

		creativeApplicationStagesImpl.setCreativeApplicationId(
			creativeApplicationId);

		if (caseId == null) {
			creativeApplicationStagesImpl.setCaseId("");
		}
		else {
			creativeApplicationStagesImpl.setCaseId(caseId);
		}

		if (updatedBySource == null) {
			creativeApplicationStagesImpl.setUpdatedBySource("");
		}
		else {
			creativeApplicationStagesImpl.setUpdatedBySource(updatedBySource);
		}

		creativeApplicationStagesImpl.resetOriginalValues();

		return creativeApplicationStagesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		creativeApplicationStagesId = objectInput.readLong();

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

		creativeApplicationId = objectInput.readLong();
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

		objectOutput.writeLong(creativeApplicationStagesId);

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

		objectOutput.writeLong(creativeApplicationId);

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
	public long creativeApplicationStagesId;
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
	public long creativeApplicationId;
	public String caseId;
	public String updatedBySource;

}