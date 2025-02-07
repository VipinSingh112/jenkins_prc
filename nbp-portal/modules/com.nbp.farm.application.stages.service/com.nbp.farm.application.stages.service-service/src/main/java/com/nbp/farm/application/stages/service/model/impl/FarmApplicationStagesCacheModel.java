/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.farm.application.stages.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.farm.application.stages.service.model.FarmApplicationStages;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FarmApplicationStages in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FarmApplicationStagesCacheModel
	implements CacheModel<FarmApplicationStages>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FarmApplicationStagesCacheModel)) {
			return false;
		}

		FarmApplicationStagesCacheModel farmApplicationStagesCacheModel =
			(FarmApplicationStagesCacheModel)object;

		if (farmApplicationStagesId ==
				farmApplicationStagesCacheModel.farmApplicationStagesId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, farmApplicationStagesId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", farmApplicationStagesId=");
		sb.append(farmApplicationStagesId);
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
		sb.append(", farmApplicationId=");
		sb.append(farmApplicationId);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", updatedBySource=");
		sb.append(updatedBySource);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FarmApplicationStages toEntityModel() {
		FarmApplicationStagesImpl farmApplicationStagesImpl =
			new FarmApplicationStagesImpl();

		if (uuid == null) {
			farmApplicationStagesImpl.setUuid("");
		}
		else {
			farmApplicationStagesImpl.setUuid(uuid);
		}

		farmApplicationStagesImpl.setFarmApplicationStagesId(
			farmApplicationStagesId);
		farmApplicationStagesImpl.setGroupId(groupId);
		farmApplicationStagesImpl.setCompanyId(companyId);
		farmApplicationStagesImpl.setUserId(userId);

		if (userName == null) {
			farmApplicationStagesImpl.setUserName("");
		}
		else {
			farmApplicationStagesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			farmApplicationStagesImpl.setCreateDate(null);
		}
		else {
			farmApplicationStagesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			farmApplicationStagesImpl.setModifiedDate(null);
		}
		else {
			farmApplicationStagesImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (stageName == null) {
			farmApplicationStagesImpl.setStageName("");
		}
		else {
			farmApplicationStagesImpl.setStageName(stageName);
		}

		if (duration == null) {
			farmApplicationStagesImpl.setDuration("");
		}
		else {
			farmApplicationStagesImpl.setDuration(duration);
		}

		if (stageStatus == null) {
			farmApplicationStagesImpl.setStageStatus("");
		}
		else {
			farmApplicationStagesImpl.setStageStatus(stageStatus);
		}

		if (stageStartDate == Long.MIN_VALUE) {
			farmApplicationStagesImpl.setStageStartDate(null);
		}
		else {
			farmApplicationStagesImpl.setStageStartDate(
				new Date(stageStartDate));
		}

		if (stageEndDate == Long.MIN_VALUE) {
			farmApplicationStagesImpl.setStageEndDate(null);
		}
		else {
			farmApplicationStagesImpl.setStageEndDate(new Date(stageEndDate));
		}

		farmApplicationStagesImpl.setFarmApplicationId(farmApplicationId);

		if (caseId == null) {
			farmApplicationStagesImpl.setCaseId("");
		}
		else {
			farmApplicationStagesImpl.setCaseId(caseId);
		}

		if (updatedBySource == null) {
			farmApplicationStagesImpl.setUpdatedBySource("");
		}
		else {
			farmApplicationStagesImpl.setUpdatedBySource(updatedBySource);
		}

		farmApplicationStagesImpl.resetOriginalValues();

		return farmApplicationStagesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		farmApplicationStagesId = objectInput.readLong();

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

		farmApplicationId = objectInput.readLong();
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

		objectOutput.writeLong(farmApplicationStagesId);

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

		objectOutput.writeLong(farmApplicationId);

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
	public long farmApplicationStagesId;
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
	public long farmApplicationId;
	public String caseId;
	public String updatedBySource;

}