/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.quarry.stage.service.model.QuarryApplicationStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QuarryApplicationStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class QuarryApplicationStageCacheModel
	implements CacheModel<QuarryApplicationStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof QuarryApplicationStageCacheModel)) {
			return false;
		}

		QuarryApplicationStageCacheModel quarryApplicationStageCacheModel =
			(QuarryApplicationStageCacheModel)object;

		if (quarryAppStagesId ==
				quarryApplicationStageCacheModel.quarryAppStagesId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, quarryAppStagesId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", quarryAppStagesId=");
		sb.append(quarryAppStagesId);
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
		sb.append(", quarryApplicationId=");
		sb.append(quarryApplicationId);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", updateBySource=");
		sb.append(updateBySource);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QuarryApplicationStage toEntityModel() {
		QuarryApplicationStageImpl quarryApplicationStageImpl =
			new QuarryApplicationStageImpl();

		if (uuid == null) {
			quarryApplicationStageImpl.setUuid("");
		}
		else {
			quarryApplicationStageImpl.setUuid(uuid);
		}

		quarryApplicationStageImpl.setQuarryAppStagesId(quarryAppStagesId);
		quarryApplicationStageImpl.setGroupId(groupId);
		quarryApplicationStageImpl.setCompanyId(companyId);
		quarryApplicationStageImpl.setUserId(userId);

		if (userName == null) {
			quarryApplicationStageImpl.setUserName("");
		}
		else {
			quarryApplicationStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			quarryApplicationStageImpl.setCreateDate(null);
		}
		else {
			quarryApplicationStageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			quarryApplicationStageImpl.setModifiedDate(null);
		}
		else {
			quarryApplicationStageImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (stageName == null) {
			quarryApplicationStageImpl.setStageName("");
		}
		else {
			quarryApplicationStageImpl.setStageName(stageName);
		}

		if (duration == null) {
			quarryApplicationStageImpl.setDuration("");
		}
		else {
			quarryApplicationStageImpl.setDuration(duration);
		}

		if (stageStatus == null) {
			quarryApplicationStageImpl.setStageStatus("");
		}
		else {
			quarryApplicationStageImpl.setStageStatus(stageStatus);
		}

		if (stageStartDate == Long.MIN_VALUE) {
			quarryApplicationStageImpl.setStageStartDate(null);
		}
		else {
			quarryApplicationStageImpl.setStageStartDate(
				new Date(stageStartDate));
		}

		if (stageEndDate == Long.MIN_VALUE) {
			quarryApplicationStageImpl.setStageEndDate(null);
		}
		else {
			quarryApplicationStageImpl.setStageEndDate(new Date(stageEndDate));
		}

		quarryApplicationStageImpl.setQuarryApplicationId(quarryApplicationId);

		if (caseId == null) {
			quarryApplicationStageImpl.setCaseId("");
		}
		else {
			quarryApplicationStageImpl.setCaseId(caseId);
		}

		if (updateBySource == null) {
			quarryApplicationStageImpl.setUpdateBySource("");
		}
		else {
			quarryApplicationStageImpl.setUpdateBySource(updateBySource);
		}

		quarryApplicationStageImpl.resetOriginalValues();

		return quarryApplicationStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		quarryAppStagesId = objectInput.readLong();

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

		quarryApplicationId = objectInput.readLong();
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

		objectOutput.writeLong(quarryAppStagesId);

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

		objectOutput.writeLong(quarryApplicationId);

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
	public long quarryAppStagesId;
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
	public long quarryApplicationId;
	public String caseId;
	public String updateBySource;

}