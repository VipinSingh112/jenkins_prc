/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.stage.services.model.HsraApplicationStages;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing HsraApplicationStages in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HsraApplicationStagesCacheModel
	implements CacheModel<HsraApplicationStages>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof HsraApplicationStagesCacheModel)) {
			return false;
		}

		HsraApplicationStagesCacheModel hsraApplicationStagesCacheModel =
			(HsraApplicationStagesCacheModel)object;

		if (hsraApplicationStagesId ==
				hsraApplicationStagesCacheModel.hsraApplicationStagesId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, hsraApplicationStagesId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", hsraApplicationStagesId=");
		sb.append(hsraApplicationStagesId);
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
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", updateBySource=");
		sb.append(updateBySource);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public HsraApplicationStages toEntityModel() {
		HsraApplicationStagesImpl hsraApplicationStagesImpl =
			new HsraApplicationStagesImpl();

		if (uuid == null) {
			hsraApplicationStagesImpl.setUuid("");
		}
		else {
			hsraApplicationStagesImpl.setUuid(uuid);
		}

		hsraApplicationStagesImpl.setHsraApplicationStagesId(
			hsraApplicationStagesId);
		hsraApplicationStagesImpl.setGroupId(groupId);
		hsraApplicationStagesImpl.setCompanyId(companyId);
		hsraApplicationStagesImpl.setUserId(userId);

		if (userName == null) {
			hsraApplicationStagesImpl.setUserName("");
		}
		else {
			hsraApplicationStagesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			hsraApplicationStagesImpl.setCreateDate(null);
		}
		else {
			hsraApplicationStagesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			hsraApplicationStagesImpl.setModifiedDate(null);
		}
		else {
			hsraApplicationStagesImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (stageName == null) {
			hsraApplicationStagesImpl.setStageName("");
		}
		else {
			hsraApplicationStagesImpl.setStageName(stageName);
		}

		if (duration == null) {
			hsraApplicationStagesImpl.setDuration("");
		}
		else {
			hsraApplicationStagesImpl.setDuration(duration);
		}

		if (stageStatus == null) {
			hsraApplicationStagesImpl.setStageStatus("");
		}
		else {
			hsraApplicationStagesImpl.setStageStatus(stageStatus);
		}

		if (stageStartDate == Long.MIN_VALUE) {
			hsraApplicationStagesImpl.setStageStartDate(null);
		}
		else {
			hsraApplicationStagesImpl.setStageStartDate(
				new Date(stageStartDate));
		}

		if (stageEndDate == Long.MIN_VALUE) {
			hsraApplicationStagesImpl.setStageEndDate(null);
		}
		else {
			hsraApplicationStagesImpl.setStageEndDate(new Date(stageEndDate));
		}

		hsraApplicationStagesImpl.setHsraApplicationId(hsraApplicationId);

		if (caseId == null) {
			hsraApplicationStagesImpl.setCaseId("");
		}
		else {
			hsraApplicationStagesImpl.setCaseId(caseId);
		}

		if (updateBySource == null) {
			hsraApplicationStagesImpl.setUpdateBySource("");
		}
		else {
			hsraApplicationStagesImpl.setUpdateBySource(updateBySource);
		}

		hsraApplicationStagesImpl.resetOriginalValues();

		return hsraApplicationStagesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		hsraApplicationStagesId = objectInput.readLong();

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

		hsraApplicationId = objectInput.readLong();
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

		objectOutput.writeLong(hsraApplicationStagesId);

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

		objectOutput.writeLong(hsraApplicationId);

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
	public long hsraApplicationStagesId;
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
	public long hsraApplicationId;
	public String caseId;
	public String updateBySource;

}