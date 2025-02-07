/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jadsc.stage.services.model.JadscApplicationStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JadscApplicationStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JadscApplicationStageCacheModel
	implements CacheModel<JadscApplicationStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JadscApplicationStageCacheModel)) {
			return false;
		}

		JadscApplicationStageCacheModel jadscApplicationStageCacheModel =
			(JadscApplicationStageCacheModel)object;

		if (jadscAppStageId ==
				jadscApplicationStageCacheModel.jadscAppStageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jadscAppStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", jadscAppStageId=");
		sb.append(jadscAppStageId);
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
		sb.append(", jadscApplicationId=");
		sb.append(jadscApplicationId);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", updateBySource=");
		sb.append(updateBySource);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JadscApplicationStage toEntityModel() {
		JadscApplicationStageImpl jadscApplicationStageImpl =
			new JadscApplicationStageImpl();

		if (uuid == null) {
			jadscApplicationStageImpl.setUuid("");
		}
		else {
			jadscApplicationStageImpl.setUuid(uuid);
		}

		jadscApplicationStageImpl.setJadscAppStageId(jadscAppStageId);
		jadscApplicationStageImpl.setGroupId(groupId);
		jadscApplicationStageImpl.setCompanyId(companyId);
		jadscApplicationStageImpl.setUserId(userId);

		if (userName == null) {
			jadscApplicationStageImpl.setUserName("");
		}
		else {
			jadscApplicationStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jadscApplicationStageImpl.setCreateDate(null);
		}
		else {
			jadscApplicationStageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jadscApplicationStageImpl.setModifiedDate(null);
		}
		else {
			jadscApplicationStageImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (stageName == null) {
			jadscApplicationStageImpl.setStageName("");
		}
		else {
			jadscApplicationStageImpl.setStageName(stageName);
		}

		if (duration == null) {
			jadscApplicationStageImpl.setDuration("");
		}
		else {
			jadscApplicationStageImpl.setDuration(duration);
		}

		if (stageStatus == null) {
			jadscApplicationStageImpl.setStageStatus("");
		}
		else {
			jadscApplicationStageImpl.setStageStatus(stageStatus);
		}

		if (stageStartDate == Long.MIN_VALUE) {
			jadscApplicationStageImpl.setStageStartDate(null);
		}
		else {
			jadscApplicationStageImpl.setStageStartDate(
				new Date(stageStartDate));
		}

		if (stageEndDate == Long.MIN_VALUE) {
			jadscApplicationStageImpl.setStageEndDate(null);
		}
		else {
			jadscApplicationStageImpl.setStageEndDate(new Date(stageEndDate));
		}

		jadscApplicationStageImpl.setJadscApplicationId(jadscApplicationId);

		if (caseId == null) {
			jadscApplicationStageImpl.setCaseId("");
		}
		else {
			jadscApplicationStageImpl.setCaseId(caseId);
		}

		if (updateBySource == null) {
			jadscApplicationStageImpl.setUpdateBySource("");
		}
		else {
			jadscApplicationStageImpl.setUpdateBySource(updateBySource);
		}

		jadscApplicationStageImpl.resetOriginalValues();

		return jadscApplicationStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		jadscAppStageId = objectInput.readLong();

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

		jadscApplicationId = objectInput.readLong();
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

		objectOutput.writeLong(jadscAppStageId);

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

		objectOutput.writeLong(jadscApplicationId);

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
	public long jadscAppStageId;
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
	public long jadscApplicationId;
	public String caseId;
	public String updateBySource;

}