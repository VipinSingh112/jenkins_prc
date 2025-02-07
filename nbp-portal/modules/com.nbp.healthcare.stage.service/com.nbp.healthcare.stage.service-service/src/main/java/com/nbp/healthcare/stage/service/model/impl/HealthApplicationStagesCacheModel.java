/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.healthcare.stage.service.model.HealthApplicationStages;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing HealthApplicationStages in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HealthApplicationStagesCacheModel
	implements CacheModel<HealthApplicationStages>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof HealthApplicationStagesCacheModel)) {
			return false;
		}

		HealthApplicationStagesCacheModel healthApplicationStagesCacheModel =
			(HealthApplicationStagesCacheModel)object;

		if (healthApplicationStagesId ==
				healthApplicationStagesCacheModel.healthApplicationStagesId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, healthApplicationStagesId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", healthApplicationStagesId=");
		sb.append(healthApplicationStagesId);
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
		sb.append(", healthApplicationId=");
		sb.append(healthApplicationId);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", updatedBySource=");
		sb.append(updatedBySource);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public HealthApplicationStages toEntityModel() {
		HealthApplicationStagesImpl healthApplicationStagesImpl =
			new HealthApplicationStagesImpl();

		if (uuid == null) {
			healthApplicationStagesImpl.setUuid("");
		}
		else {
			healthApplicationStagesImpl.setUuid(uuid);
		}

		healthApplicationStagesImpl.setHealthApplicationStagesId(
			healthApplicationStagesId);
		healthApplicationStagesImpl.setGroupId(groupId);
		healthApplicationStagesImpl.setCompanyId(companyId);
		healthApplicationStagesImpl.setUserId(userId);

		if (userName == null) {
			healthApplicationStagesImpl.setUserName("");
		}
		else {
			healthApplicationStagesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			healthApplicationStagesImpl.setCreateDate(null);
		}
		else {
			healthApplicationStagesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			healthApplicationStagesImpl.setModifiedDate(null);
		}
		else {
			healthApplicationStagesImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (stageName == null) {
			healthApplicationStagesImpl.setStageName("");
		}
		else {
			healthApplicationStagesImpl.setStageName(stageName);
		}

		if (duration == null) {
			healthApplicationStagesImpl.setDuration("");
		}
		else {
			healthApplicationStagesImpl.setDuration(duration);
		}

		if (stageStatus == null) {
			healthApplicationStagesImpl.setStageStatus("");
		}
		else {
			healthApplicationStagesImpl.setStageStatus(stageStatus);
		}

		if (stageStartDate == Long.MIN_VALUE) {
			healthApplicationStagesImpl.setStageStartDate(null);
		}
		else {
			healthApplicationStagesImpl.setStageStartDate(
				new Date(stageStartDate));
		}

		if (stageEndDate == Long.MIN_VALUE) {
			healthApplicationStagesImpl.setStageEndDate(null);
		}
		else {
			healthApplicationStagesImpl.setStageEndDate(new Date(stageEndDate));
		}

		healthApplicationStagesImpl.setHealthApplicationId(healthApplicationId);

		if (caseId == null) {
			healthApplicationStagesImpl.setCaseId("");
		}
		else {
			healthApplicationStagesImpl.setCaseId(caseId);
		}

		if (updatedBySource == null) {
			healthApplicationStagesImpl.setUpdatedBySource("");
		}
		else {
			healthApplicationStagesImpl.setUpdatedBySource(updatedBySource);
		}

		healthApplicationStagesImpl.resetOriginalValues();

		return healthApplicationStagesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		healthApplicationStagesId = objectInput.readLong();

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

		healthApplicationId = objectInput.readLong();
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

		objectOutput.writeLong(healthApplicationStagesId);

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

		objectOutput.writeLong(healthApplicationId);

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
	public long healthApplicationStagesId;
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
	public long healthApplicationId;
	public String caseId;
	public String updatedBySource;

}