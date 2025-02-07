/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.manufacturing.application.stages.services.model.ManufacturingApplicationStages;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ManufacturingApplicationStages in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ManufacturingApplicationStagesCacheModel
	implements CacheModel<ManufacturingApplicationStages>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ManufacturingApplicationStagesCacheModel)) {
			return false;
		}

		ManufacturingApplicationStagesCacheModel
			manufacturingApplicationStagesCacheModel =
				(ManufacturingApplicationStagesCacheModel)object;

		if (manufacturingAppStagesId ==
				manufacturingApplicationStagesCacheModel.
					manufacturingAppStagesId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, manufacturingAppStagesId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{manufacturingAppStagesId=");
		sb.append(manufacturingAppStagesId);
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
		sb.append(", manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", updateBySource=");
		sb.append(updateBySource);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ManufacturingApplicationStages toEntityModel() {
		ManufacturingApplicationStagesImpl manufacturingApplicationStagesImpl =
			new ManufacturingApplicationStagesImpl();

		manufacturingApplicationStagesImpl.setManufacturingAppStagesId(
			manufacturingAppStagesId);
		manufacturingApplicationStagesImpl.setGroupId(groupId);
		manufacturingApplicationStagesImpl.setCompanyId(companyId);
		manufacturingApplicationStagesImpl.setUserId(userId);

		if (userName == null) {
			manufacturingApplicationStagesImpl.setUserName("");
		}
		else {
			manufacturingApplicationStagesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			manufacturingApplicationStagesImpl.setCreateDate(null);
		}
		else {
			manufacturingApplicationStagesImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			manufacturingApplicationStagesImpl.setModifiedDate(null);
		}
		else {
			manufacturingApplicationStagesImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (stageName == null) {
			manufacturingApplicationStagesImpl.setStageName("");
		}
		else {
			manufacturingApplicationStagesImpl.setStageName(stageName);
		}

		if (duration == null) {
			manufacturingApplicationStagesImpl.setDuration("");
		}
		else {
			manufacturingApplicationStagesImpl.setDuration(duration);
		}

		if (stageStatus == null) {
			manufacturingApplicationStagesImpl.setStageStatus("");
		}
		else {
			manufacturingApplicationStagesImpl.setStageStatus(stageStatus);
		}

		if (stageStartDate == Long.MIN_VALUE) {
			manufacturingApplicationStagesImpl.setStageStartDate(null);
		}
		else {
			manufacturingApplicationStagesImpl.setStageStartDate(
				new Date(stageStartDate));
		}

		if (stageEndDate == Long.MIN_VALUE) {
			manufacturingApplicationStagesImpl.setStageEndDate(null);
		}
		else {
			manufacturingApplicationStagesImpl.setStageEndDate(
				new Date(stageEndDate));
		}

		manufacturingApplicationStagesImpl.setManufacturingApplicationId(
			manufacturingApplicationId);

		if (caseId == null) {
			manufacturingApplicationStagesImpl.setCaseId("");
		}
		else {
			manufacturingApplicationStagesImpl.setCaseId(caseId);
		}

		if (updateBySource == null) {
			manufacturingApplicationStagesImpl.setUpdateBySource("");
		}
		else {
			manufacturingApplicationStagesImpl.setUpdateBySource(
				updateBySource);
		}

		manufacturingApplicationStagesImpl.resetOriginalValues();

		return manufacturingApplicationStagesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		manufacturingAppStagesId = objectInput.readLong();

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

		manufacturingApplicationId = objectInput.readLong();
		caseId = objectInput.readUTF();
		updateBySource = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(manufacturingAppStagesId);

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

		objectOutput.writeLong(manufacturingApplicationId);

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

	public long manufacturingAppStagesId;
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
	public long manufacturingApplicationId;
	public String caseId;
	public String updateBySource;

}