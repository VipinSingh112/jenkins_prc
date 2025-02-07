/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.explosives.competency.stages.service.model.ExplosiveApplicationStages;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ExplosiveApplicationStages in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ExplosiveApplicationStagesCacheModel
	implements CacheModel<ExplosiveApplicationStages>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ExplosiveApplicationStagesCacheModel)) {
			return false;
		}

		ExplosiveApplicationStagesCacheModel
			explosiveApplicationStagesCacheModel =
				(ExplosiveApplicationStagesCacheModel)object;

		if (expApplicationStagesId ==
				explosiveApplicationStagesCacheModel.expApplicationStagesId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, expApplicationStagesId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", expApplicationStagesId=");
		sb.append(expApplicationStagesId);
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
		sb.append(", explosiveApplicationId=");
		sb.append(explosiveApplicationId);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", updatedBySource=");
		sb.append(updatedBySource);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ExplosiveApplicationStages toEntityModel() {
		ExplosiveApplicationStagesImpl explosiveApplicationStagesImpl =
			new ExplosiveApplicationStagesImpl();

		if (uuid == null) {
			explosiveApplicationStagesImpl.setUuid("");
		}
		else {
			explosiveApplicationStagesImpl.setUuid(uuid);
		}

		explosiveApplicationStagesImpl.setExpApplicationStagesId(
			expApplicationStagesId);
		explosiveApplicationStagesImpl.setGroupId(groupId);
		explosiveApplicationStagesImpl.setCompanyId(companyId);
		explosiveApplicationStagesImpl.setUserId(userId);

		if (userName == null) {
			explosiveApplicationStagesImpl.setUserName("");
		}
		else {
			explosiveApplicationStagesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			explosiveApplicationStagesImpl.setCreateDate(null);
		}
		else {
			explosiveApplicationStagesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			explosiveApplicationStagesImpl.setModifiedDate(null);
		}
		else {
			explosiveApplicationStagesImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (stageName == null) {
			explosiveApplicationStagesImpl.setStageName("");
		}
		else {
			explosiveApplicationStagesImpl.setStageName(stageName);
		}

		if (duration == null) {
			explosiveApplicationStagesImpl.setDuration("");
		}
		else {
			explosiveApplicationStagesImpl.setDuration(duration);
		}

		if (stageStatus == null) {
			explosiveApplicationStagesImpl.setStageStatus("");
		}
		else {
			explosiveApplicationStagesImpl.setStageStatus(stageStatus);
		}

		if (stageStartDate == Long.MIN_VALUE) {
			explosiveApplicationStagesImpl.setStageStartDate(null);
		}
		else {
			explosiveApplicationStagesImpl.setStageStartDate(
				new Date(stageStartDate));
		}

		if (stageEndDate == Long.MIN_VALUE) {
			explosiveApplicationStagesImpl.setStageEndDate(null);
		}
		else {
			explosiveApplicationStagesImpl.setStageEndDate(
				new Date(stageEndDate));
		}

		explosiveApplicationStagesImpl.setExplosiveApplicationId(
			explosiveApplicationId);

		if (caseId == null) {
			explosiveApplicationStagesImpl.setCaseId("");
		}
		else {
			explosiveApplicationStagesImpl.setCaseId(caseId);
		}

		if (updatedBySource == null) {
			explosiveApplicationStagesImpl.setUpdatedBySource("");
		}
		else {
			explosiveApplicationStagesImpl.setUpdatedBySource(updatedBySource);
		}

		explosiveApplicationStagesImpl.resetOriginalValues();

		return explosiveApplicationStagesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		expApplicationStagesId = objectInput.readLong();

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

		explosiveApplicationId = objectInput.readLong();
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

		objectOutput.writeLong(expApplicationStagesId);

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

		objectOutput.writeLong(explosiveApplicationId);

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
	public long expApplicationStagesId;
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
	public long explosiveApplicationId;
	public String caseId;
	public String updatedBySource;

}