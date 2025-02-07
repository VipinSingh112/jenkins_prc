/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.stage.services.model.SezStatusApplicationStages;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezStatusApplicationStages in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezStatusApplicationStagesCacheModel
	implements CacheModel<SezStatusApplicationStages>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezStatusApplicationStagesCacheModel)) {
			return false;
		}

		SezStatusApplicationStagesCacheModel
			sezStatusApplicationStagesCacheModel =
				(SezStatusApplicationStagesCacheModel)object;

		if (SezStatusApplicationStagesId ==
				sezStatusApplicationStagesCacheModel.
					SezStatusApplicationStagesId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, SezStatusApplicationStagesId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", SezStatusApplicationStagesId=");
		sb.append(SezStatusApplicationStagesId);
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
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", updatedBySource=");
		sb.append(updatedBySource);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezStatusApplicationStages toEntityModel() {
		SezStatusApplicationStagesImpl sezStatusApplicationStagesImpl =
			new SezStatusApplicationStagesImpl();

		if (uuid == null) {
			sezStatusApplicationStagesImpl.setUuid("");
		}
		else {
			sezStatusApplicationStagesImpl.setUuid(uuid);
		}

		sezStatusApplicationStagesImpl.setSezStatusApplicationStagesId(
			SezStatusApplicationStagesId);
		sezStatusApplicationStagesImpl.setGroupId(groupId);
		sezStatusApplicationStagesImpl.setCompanyId(companyId);
		sezStatusApplicationStagesImpl.setUserId(userId);

		if (userName == null) {
			sezStatusApplicationStagesImpl.setUserName("");
		}
		else {
			sezStatusApplicationStagesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezStatusApplicationStagesImpl.setCreateDate(null);
		}
		else {
			sezStatusApplicationStagesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezStatusApplicationStagesImpl.setModifiedDate(null);
		}
		else {
			sezStatusApplicationStagesImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (stageName == null) {
			sezStatusApplicationStagesImpl.setStageName("");
		}
		else {
			sezStatusApplicationStagesImpl.setStageName(stageName);
		}

		if (duration == null) {
			sezStatusApplicationStagesImpl.setDuration("");
		}
		else {
			sezStatusApplicationStagesImpl.setDuration(duration);
		}

		if (stageStatus == null) {
			sezStatusApplicationStagesImpl.setStageStatus("");
		}
		else {
			sezStatusApplicationStagesImpl.setStageStatus(stageStatus);
		}

		if (stageStartDate == Long.MIN_VALUE) {
			sezStatusApplicationStagesImpl.setStageStartDate(null);
		}
		else {
			sezStatusApplicationStagesImpl.setStageStartDate(
				new Date(stageStartDate));
		}

		if (stageEndDate == Long.MIN_VALUE) {
			sezStatusApplicationStagesImpl.setStageEndDate(null);
		}
		else {
			sezStatusApplicationStagesImpl.setStageEndDate(
				new Date(stageEndDate));
		}

		sezStatusApplicationStagesImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		if (caseId == null) {
			sezStatusApplicationStagesImpl.setCaseId("");
		}
		else {
			sezStatusApplicationStagesImpl.setCaseId(caseId);
		}

		if (updatedBySource == null) {
			sezStatusApplicationStagesImpl.setUpdatedBySource("");
		}
		else {
			sezStatusApplicationStagesImpl.setUpdatedBySource(updatedBySource);
		}

		sezStatusApplicationStagesImpl.resetOriginalValues();

		return sezStatusApplicationStagesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		SezStatusApplicationStagesId = objectInput.readLong();

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

		sezStatusApplicationId = objectInput.readLong();
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

		objectOutput.writeLong(SezStatusApplicationStagesId);

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

		objectOutput.writeLong(sezStatusApplicationId);

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
	public long SezStatusApplicationStagesId;
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
	public long sezStatusApplicationId;
	public String caseId;
	public String updatedBySource;

}