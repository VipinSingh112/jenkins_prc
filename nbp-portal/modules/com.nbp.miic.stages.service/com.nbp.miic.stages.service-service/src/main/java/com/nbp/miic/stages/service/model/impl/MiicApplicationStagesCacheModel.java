/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.stages.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.miic.stages.service.model.MiicApplicationStages;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MiicApplicationStages in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MiicApplicationStagesCacheModel
	implements CacheModel<MiicApplicationStages>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MiicApplicationStagesCacheModel)) {
			return false;
		}

		MiicApplicationStagesCacheModel miicApplicationStagesCacheModel =
			(MiicApplicationStagesCacheModel)object;

		if (miicApplicationStagesId ==
				miicApplicationStagesCacheModel.miicApplicationStagesId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, miicApplicationStagesId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", miicApplicationStagesId=");
		sb.append(miicApplicationStagesId);
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
		sb.append(", miicApplicationId=");
		sb.append(miicApplicationId);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", updatedBySource=");
		sb.append(updatedBySource);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MiicApplicationStages toEntityModel() {
		MiicApplicationStagesImpl miicApplicationStagesImpl =
			new MiicApplicationStagesImpl();

		if (uuid == null) {
			miicApplicationStagesImpl.setUuid("");
		}
		else {
			miicApplicationStagesImpl.setUuid(uuid);
		}

		miicApplicationStagesImpl.setMiicApplicationStagesId(
			miicApplicationStagesId);
		miicApplicationStagesImpl.setGroupId(groupId);
		miicApplicationStagesImpl.setCompanyId(companyId);
		miicApplicationStagesImpl.setUserId(userId);

		if (userName == null) {
			miicApplicationStagesImpl.setUserName("");
		}
		else {
			miicApplicationStagesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			miicApplicationStagesImpl.setCreateDate(null);
		}
		else {
			miicApplicationStagesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			miicApplicationStagesImpl.setModifiedDate(null);
		}
		else {
			miicApplicationStagesImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (stageName == null) {
			miicApplicationStagesImpl.setStageName("");
		}
		else {
			miicApplicationStagesImpl.setStageName(stageName);
		}

		if (duration == null) {
			miicApplicationStagesImpl.setDuration("");
		}
		else {
			miicApplicationStagesImpl.setDuration(duration);
		}

		if (stageStatus == null) {
			miicApplicationStagesImpl.setStageStatus("");
		}
		else {
			miicApplicationStagesImpl.setStageStatus(stageStatus);
		}

		if (stageStartDate == Long.MIN_VALUE) {
			miicApplicationStagesImpl.setStageStartDate(null);
		}
		else {
			miicApplicationStagesImpl.setStageStartDate(
				new Date(stageStartDate));
		}

		if (stageEndDate == Long.MIN_VALUE) {
			miicApplicationStagesImpl.setStageEndDate(null);
		}
		else {
			miicApplicationStagesImpl.setStageEndDate(new Date(stageEndDate));
		}

		miicApplicationStagesImpl.setMiicApplicationId(miicApplicationId);

		if (caseId == null) {
			miicApplicationStagesImpl.setCaseId("");
		}
		else {
			miicApplicationStagesImpl.setCaseId(caseId);
		}

		if (updatedBySource == null) {
			miicApplicationStagesImpl.setUpdatedBySource("");
		}
		else {
			miicApplicationStagesImpl.setUpdatedBySource(updatedBySource);
		}

		miicApplicationStagesImpl.resetOriginalValues();

		return miicApplicationStagesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		miicApplicationStagesId = objectInput.readLong();

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

		miicApplicationId = objectInput.readLong();
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

		objectOutput.writeLong(miicApplicationStagesId);

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

		objectOutput.writeLong(miicApplicationId);

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
	public long miicApplicationStagesId;
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
	public long miicApplicationId;
	public String caseId;
	public String updatedBySource;

}