/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.wra.stage.service.model.WraApplicationStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing WraApplicationStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class WraApplicationStageCacheModel
	implements CacheModel<WraApplicationStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof WraApplicationStageCacheModel)) {
			return false;
		}

		WraApplicationStageCacheModel wraApplicationStageCacheModel =
			(WraApplicationStageCacheModel)object;

		if (wraApplicationStageId ==
				wraApplicationStageCacheModel.wraApplicationStageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, wraApplicationStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", wraApplicationStageId=");
		sb.append(wraApplicationStageId);
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
		sb.append(", wraApplicationId=");
		sb.append(wraApplicationId);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", updateBySource=");
		sb.append(updateBySource);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public WraApplicationStage toEntityModel() {
		WraApplicationStageImpl wraApplicationStageImpl =
			new WraApplicationStageImpl();

		if (uuid == null) {
			wraApplicationStageImpl.setUuid("");
		}
		else {
			wraApplicationStageImpl.setUuid(uuid);
		}

		wraApplicationStageImpl.setWraApplicationStageId(wraApplicationStageId);
		wraApplicationStageImpl.setGroupId(groupId);
		wraApplicationStageImpl.setCompanyId(companyId);
		wraApplicationStageImpl.setUserId(userId);

		if (userName == null) {
			wraApplicationStageImpl.setUserName("");
		}
		else {
			wraApplicationStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			wraApplicationStageImpl.setCreateDate(null);
		}
		else {
			wraApplicationStageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			wraApplicationStageImpl.setModifiedDate(null);
		}
		else {
			wraApplicationStageImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (stageName == null) {
			wraApplicationStageImpl.setStageName("");
		}
		else {
			wraApplicationStageImpl.setStageName(stageName);
		}

		if (duration == null) {
			wraApplicationStageImpl.setDuration("");
		}
		else {
			wraApplicationStageImpl.setDuration(duration);
		}

		if (stageStatus == null) {
			wraApplicationStageImpl.setStageStatus("");
		}
		else {
			wraApplicationStageImpl.setStageStatus(stageStatus);
		}

		if (stageStartDate == Long.MIN_VALUE) {
			wraApplicationStageImpl.setStageStartDate(null);
		}
		else {
			wraApplicationStageImpl.setStageStartDate(new Date(stageStartDate));
		}

		if (stageEndDate == Long.MIN_VALUE) {
			wraApplicationStageImpl.setStageEndDate(null);
		}
		else {
			wraApplicationStageImpl.setStageEndDate(new Date(stageEndDate));
		}

		wraApplicationStageImpl.setWraApplicationId(wraApplicationId);

		if (caseId == null) {
			wraApplicationStageImpl.setCaseId("");
		}
		else {
			wraApplicationStageImpl.setCaseId(caseId);
		}

		if (updateBySource == null) {
			wraApplicationStageImpl.setUpdateBySource("");
		}
		else {
			wraApplicationStageImpl.setUpdateBySource(updateBySource);
		}

		wraApplicationStageImpl.resetOriginalValues();

		return wraApplicationStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		wraApplicationStageId = objectInput.readLong();

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

		wraApplicationId = objectInput.readLong();
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

		objectOutput.writeLong(wraApplicationStageId);

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

		objectOutput.writeLong(wraApplicationId);

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
	public long wraApplicationStageId;
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
	public long wraApplicationId;
	public String caseId;
	public String updateBySource;

}