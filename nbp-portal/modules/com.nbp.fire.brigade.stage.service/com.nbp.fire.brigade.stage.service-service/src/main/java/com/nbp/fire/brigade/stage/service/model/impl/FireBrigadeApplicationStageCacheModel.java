/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FireBrigadeApplicationStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FireBrigadeApplicationStageCacheModel
	implements CacheModel<FireBrigadeApplicationStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FireBrigadeApplicationStageCacheModel)) {
			return false;
		}

		FireBrigadeApplicationStageCacheModel
			fireBrigadeApplicationStageCacheModel =
				(FireBrigadeApplicationStageCacheModel)object;

		if (fireBrigadeAppStageId ==
				fireBrigadeApplicationStageCacheModel.fireBrigadeAppStageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fireBrigadeAppStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", fireBrigadeAppStageId=");
		sb.append(fireBrigadeAppStageId);
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
	public FireBrigadeApplicationStage toEntityModel() {
		FireBrigadeApplicationStageImpl fireBrigadeApplicationStageImpl =
			new FireBrigadeApplicationStageImpl();

		if (uuid == null) {
			fireBrigadeApplicationStageImpl.setUuid("");
		}
		else {
			fireBrigadeApplicationStageImpl.setUuid(uuid);
		}

		fireBrigadeApplicationStageImpl.setFireBrigadeAppStageId(
			fireBrigadeAppStageId);
		fireBrigadeApplicationStageImpl.setGroupId(groupId);
		fireBrigadeApplicationStageImpl.setCompanyId(companyId);
		fireBrigadeApplicationStageImpl.setUserId(userId);

		if (userName == null) {
			fireBrigadeApplicationStageImpl.setUserName("");
		}
		else {
			fireBrigadeApplicationStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			fireBrigadeApplicationStageImpl.setCreateDate(null);
		}
		else {
			fireBrigadeApplicationStageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			fireBrigadeApplicationStageImpl.setModifiedDate(null);
		}
		else {
			fireBrigadeApplicationStageImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (stageName == null) {
			fireBrigadeApplicationStageImpl.setStageName("");
		}
		else {
			fireBrigadeApplicationStageImpl.setStageName(stageName);
		}

		if (stageEndDate == Long.MIN_VALUE) {
			fireBrigadeApplicationStageImpl.setStageEndDate(null);
		}
		else {
			fireBrigadeApplicationStageImpl.setStageEndDate(
				new Date(stageEndDate));
		}

		if (stageStartDate == Long.MIN_VALUE) {
			fireBrigadeApplicationStageImpl.setStageStartDate(null);
		}
		else {
			fireBrigadeApplicationStageImpl.setStageStartDate(
				new Date(stageStartDate));
		}

		if (duration == null) {
			fireBrigadeApplicationStageImpl.setDuration("");
		}
		else {
			fireBrigadeApplicationStageImpl.setDuration(duration);
		}

		if (stageStatus == null) {
			fireBrigadeApplicationStageImpl.setStageStatus("");
		}
		else {
			fireBrigadeApplicationStageImpl.setStageStatus(stageStatus);
		}

		if (caseId == null) {
			fireBrigadeApplicationStageImpl.setCaseId("");
		}
		else {
			fireBrigadeApplicationStageImpl.setCaseId(caseId);
		}

		if (updatedBySource == null) {
			fireBrigadeApplicationStageImpl.setUpdatedBySource("");
		}
		else {
			fireBrigadeApplicationStageImpl.setUpdatedBySource(updatedBySource);
		}

		fireBrigadeApplicationStageImpl.resetOriginalValues();

		return fireBrigadeApplicationStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		fireBrigadeAppStageId = objectInput.readLong();

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

		objectOutput.writeLong(fireBrigadeAppStageId);

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
	public long fireBrigadeAppStageId;
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