/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.medical.stages.service.model.MedicalApplicationStages;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MedicalApplicationStages in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MedicalApplicationStagesCacheModel
	implements CacheModel<MedicalApplicationStages>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MedicalApplicationStagesCacheModel)) {
			return false;
		}

		MedicalApplicationStagesCacheModel medicalApplicationStagesCacheModel =
			(MedicalApplicationStagesCacheModel)object;

		if (medicalStagesId ==
				medicalApplicationStagesCacheModel.medicalStagesId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, medicalStagesId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", medicalStagesId=");
		sb.append(medicalStagesId);
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
		sb.append(", medicalApplicationId=");
		sb.append(medicalApplicationId);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", updateBySource=");
		sb.append(updateBySource);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MedicalApplicationStages toEntityModel() {
		MedicalApplicationStagesImpl medicalApplicationStagesImpl =
			new MedicalApplicationStagesImpl();

		if (uuid == null) {
			medicalApplicationStagesImpl.setUuid("");
		}
		else {
			medicalApplicationStagesImpl.setUuid(uuid);
		}

		medicalApplicationStagesImpl.setMedicalStagesId(medicalStagesId);
		medicalApplicationStagesImpl.setGroupId(groupId);
		medicalApplicationStagesImpl.setCompanyId(companyId);
		medicalApplicationStagesImpl.setUserId(userId);

		if (userName == null) {
			medicalApplicationStagesImpl.setUserName("");
		}
		else {
			medicalApplicationStagesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			medicalApplicationStagesImpl.setCreateDate(null);
		}
		else {
			medicalApplicationStagesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			medicalApplicationStagesImpl.setModifiedDate(null);
		}
		else {
			medicalApplicationStagesImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (stageName == null) {
			medicalApplicationStagesImpl.setStageName("");
		}
		else {
			medicalApplicationStagesImpl.setStageName(stageName);
		}

		if (duration == null) {
			medicalApplicationStagesImpl.setDuration("");
		}
		else {
			medicalApplicationStagesImpl.setDuration(duration);
		}

		if (stageStatus == null) {
			medicalApplicationStagesImpl.setStageStatus("");
		}
		else {
			medicalApplicationStagesImpl.setStageStatus(stageStatus);
		}

		if (stageStartDate == Long.MIN_VALUE) {
			medicalApplicationStagesImpl.setStageStartDate(null);
		}
		else {
			medicalApplicationStagesImpl.setStageStartDate(
				new Date(stageStartDate));
		}

		if (stageEndDate == Long.MIN_VALUE) {
			medicalApplicationStagesImpl.setStageEndDate(null);
		}
		else {
			medicalApplicationStagesImpl.setStageEndDate(
				new Date(stageEndDate));
		}

		medicalApplicationStagesImpl.setMedicalApplicationId(
			medicalApplicationId);

		if (caseId == null) {
			medicalApplicationStagesImpl.setCaseId("");
		}
		else {
			medicalApplicationStagesImpl.setCaseId(caseId);
		}

		if (updateBySource == null) {
			medicalApplicationStagesImpl.setUpdateBySource("");
		}
		else {
			medicalApplicationStagesImpl.setUpdateBySource(updateBySource);
		}

		medicalApplicationStagesImpl.resetOriginalValues();

		return medicalApplicationStagesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		medicalStagesId = objectInput.readLong();

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

		medicalApplicationId = objectInput.readLong();
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

		objectOutput.writeLong(medicalStagesId);

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

		objectOutput.writeLong(medicalApplicationId);

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
	public long medicalStagesId;
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
	public long medicalApplicationId;
	public String caseId;
	public String updateBySource;

}