/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.mining.stage.service.model.MiningApplicationStages;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MiningApplicationStages in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MiningApplicationStagesCacheModel
	implements CacheModel<MiningApplicationStages>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MiningApplicationStagesCacheModel)) {
			return false;
		}

		MiningApplicationStagesCacheModel miningApplicationStagesCacheModel =
			(MiningApplicationStagesCacheModel)object;

		if (miningStagesId ==
				miningApplicationStagesCacheModel.miningStagesId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, miningStagesId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", miningStagesId=");
		sb.append(miningStagesId);
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
		sb.append(", miningApplicationId=");
		sb.append(miningApplicationId);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", updateBySource=");
		sb.append(updateBySource);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MiningApplicationStages toEntityModel() {
		MiningApplicationStagesImpl miningApplicationStagesImpl =
			new MiningApplicationStagesImpl();

		if (uuid == null) {
			miningApplicationStagesImpl.setUuid("");
		}
		else {
			miningApplicationStagesImpl.setUuid(uuid);
		}

		miningApplicationStagesImpl.setMiningStagesId(miningStagesId);
		miningApplicationStagesImpl.setGroupId(groupId);
		miningApplicationStagesImpl.setCompanyId(companyId);
		miningApplicationStagesImpl.setUserId(userId);

		if (userName == null) {
			miningApplicationStagesImpl.setUserName("");
		}
		else {
			miningApplicationStagesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			miningApplicationStagesImpl.setCreateDate(null);
		}
		else {
			miningApplicationStagesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			miningApplicationStagesImpl.setModifiedDate(null);
		}
		else {
			miningApplicationStagesImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (stageName == null) {
			miningApplicationStagesImpl.setStageName("");
		}
		else {
			miningApplicationStagesImpl.setStageName(stageName);
		}

		if (duration == null) {
			miningApplicationStagesImpl.setDuration("");
		}
		else {
			miningApplicationStagesImpl.setDuration(duration);
		}

		if (stageStatus == null) {
			miningApplicationStagesImpl.setStageStatus("");
		}
		else {
			miningApplicationStagesImpl.setStageStatus(stageStatus);
		}

		if (stageStartDate == Long.MIN_VALUE) {
			miningApplicationStagesImpl.setStageStartDate(null);
		}
		else {
			miningApplicationStagesImpl.setStageStartDate(
				new Date(stageStartDate));
		}

		if (stageEndDate == Long.MIN_VALUE) {
			miningApplicationStagesImpl.setStageEndDate(null);
		}
		else {
			miningApplicationStagesImpl.setStageEndDate(new Date(stageEndDate));
		}

		miningApplicationStagesImpl.setMiningApplicationId(miningApplicationId);

		if (caseId == null) {
			miningApplicationStagesImpl.setCaseId("");
		}
		else {
			miningApplicationStagesImpl.setCaseId(caseId);
		}

		if (updateBySource == null) {
			miningApplicationStagesImpl.setUpdateBySource("");
		}
		else {
			miningApplicationStagesImpl.setUpdateBySource(updateBySource);
		}

		miningApplicationStagesImpl.resetOriginalValues();

		return miningApplicationStagesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		miningStagesId = objectInput.readLong();

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

		miningApplicationId = objectInput.readLong();
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

		objectOutput.writeLong(miningStagesId);

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

		objectOutput.writeLong(miningApplicationId);

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
	public long miningStagesId;
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
	public long miningApplicationId;
	public String caseId;
	public String updateBySource;

}