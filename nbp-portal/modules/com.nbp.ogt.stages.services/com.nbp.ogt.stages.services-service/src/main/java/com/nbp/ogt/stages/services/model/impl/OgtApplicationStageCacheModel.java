/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ogt.stages.services.model.OgtApplicationStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OgtApplicationStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OgtApplicationStageCacheModel
	implements CacheModel<OgtApplicationStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OgtApplicationStageCacheModel)) {
			return false;
		}

		OgtApplicationStageCacheModel ogtApplicationStageCacheModel =
			(OgtApplicationStageCacheModel)object;

		if (ogtStagesId == ogtApplicationStageCacheModel.ogtStagesId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ogtStagesId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", ogtStagesId=");
		sb.append(ogtStagesId);
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
		sb.append(", ogtApplicationId=");
		sb.append(ogtApplicationId);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", updateBySource=");
		sb.append(updateBySource);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OgtApplicationStage toEntityModel() {
		OgtApplicationStageImpl ogtApplicationStageImpl =
			new OgtApplicationStageImpl();

		if (uuid == null) {
			ogtApplicationStageImpl.setUuid("");
		}
		else {
			ogtApplicationStageImpl.setUuid(uuid);
		}

		ogtApplicationStageImpl.setOgtStagesId(ogtStagesId);
		ogtApplicationStageImpl.setGroupId(groupId);
		ogtApplicationStageImpl.setCompanyId(companyId);
		ogtApplicationStageImpl.setUserId(userId);

		if (userName == null) {
			ogtApplicationStageImpl.setUserName("");
		}
		else {
			ogtApplicationStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ogtApplicationStageImpl.setCreateDate(null);
		}
		else {
			ogtApplicationStageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ogtApplicationStageImpl.setModifiedDate(null);
		}
		else {
			ogtApplicationStageImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (stageName == null) {
			ogtApplicationStageImpl.setStageName("");
		}
		else {
			ogtApplicationStageImpl.setStageName(stageName);
		}

		if (duration == null) {
			ogtApplicationStageImpl.setDuration("");
		}
		else {
			ogtApplicationStageImpl.setDuration(duration);
		}

		if (stageStatus == null) {
			ogtApplicationStageImpl.setStageStatus("");
		}
		else {
			ogtApplicationStageImpl.setStageStatus(stageStatus);
		}

		if (stageStartDate == Long.MIN_VALUE) {
			ogtApplicationStageImpl.setStageStartDate(null);
		}
		else {
			ogtApplicationStageImpl.setStageStartDate(new Date(stageStartDate));
		}

		if (stageEndDate == Long.MIN_VALUE) {
			ogtApplicationStageImpl.setStageEndDate(null);
		}
		else {
			ogtApplicationStageImpl.setStageEndDate(new Date(stageEndDate));
		}

		ogtApplicationStageImpl.setOgtApplicationId(ogtApplicationId);

		if (caseId == null) {
			ogtApplicationStageImpl.setCaseId("");
		}
		else {
			ogtApplicationStageImpl.setCaseId(caseId);
		}

		if (updateBySource == null) {
			ogtApplicationStageImpl.setUpdateBySource("");
		}
		else {
			ogtApplicationStageImpl.setUpdateBySource(updateBySource);
		}

		ogtApplicationStageImpl.resetOriginalValues();

		return ogtApplicationStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		ogtStagesId = objectInput.readLong();

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

		ogtApplicationId = objectInput.readLong();
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

		objectOutput.writeLong(ogtStagesId);

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

		objectOutput.writeLong(ogtApplicationId);

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
	public long ogtStagesId;
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
	public long ogtApplicationId;
	public String caseId;
	public String updateBySource;

}