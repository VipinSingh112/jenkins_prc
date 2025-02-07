/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.npm.cannabis.application.stages.services.model.CannabisApplicationStages;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CannabisApplicationStages in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CannabisApplicationStagesCacheModel
	implements CacheModel<CannabisApplicationStages>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CannabisApplicationStagesCacheModel)) {
			return false;
		}

		CannabisApplicationStagesCacheModel
			cannabisApplicationStagesCacheModel =
				(CannabisApplicationStagesCacheModel)object;

		if (cannabisApplicationstageId ==
				cannabisApplicationStagesCacheModel.
					cannabisApplicationstageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cannabisApplicationstageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{cannabisApplicationstageId=");
		sb.append(cannabisApplicationstageId);
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
		sb.append(", cannabisApplicationId=");
		sb.append(cannabisApplicationId);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", updatedBySource=");
		sb.append(updatedBySource);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CannabisApplicationStages toEntityModel() {
		CannabisApplicationStagesImpl cannabisApplicationStagesImpl =
			new CannabisApplicationStagesImpl();

		cannabisApplicationStagesImpl.setCannabisApplicationstageId(
			cannabisApplicationstageId);
		cannabisApplicationStagesImpl.setGroupId(groupId);
		cannabisApplicationStagesImpl.setCompanyId(companyId);
		cannabisApplicationStagesImpl.setUserId(userId);

		if (userName == null) {
			cannabisApplicationStagesImpl.setUserName("");
		}
		else {
			cannabisApplicationStagesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			cannabisApplicationStagesImpl.setCreateDate(null);
		}
		else {
			cannabisApplicationStagesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cannabisApplicationStagesImpl.setModifiedDate(null);
		}
		else {
			cannabisApplicationStagesImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (stageName == null) {
			cannabisApplicationStagesImpl.setStageName("");
		}
		else {
			cannabisApplicationStagesImpl.setStageName(stageName);
		}

		if (duration == null) {
			cannabisApplicationStagesImpl.setDuration("");
		}
		else {
			cannabisApplicationStagesImpl.setDuration(duration);
		}

		if (stageStatus == null) {
			cannabisApplicationStagesImpl.setStageStatus("");
		}
		else {
			cannabisApplicationStagesImpl.setStageStatus(stageStatus);
		}

		if (stageStartDate == Long.MIN_VALUE) {
			cannabisApplicationStagesImpl.setStageStartDate(null);
		}
		else {
			cannabisApplicationStagesImpl.setStageStartDate(
				new Date(stageStartDate));
		}

		if (stageEndDate == Long.MIN_VALUE) {
			cannabisApplicationStagesImpl.setStageEndDate(null);
		}
		else {
			cannabisApplicationStagesImpl.setStageEndDate(
				new Date(stageEndDate));
		}

		cannabisApplicationStagesImpl.setCannabisApplicationId(
			cannabisApplicationId);

		if (caseId == null) {
			cannabisApplicationStagesImpl.setCaseId("");
		}
		else {
			cannabisApplicationStagesImpl.setCaseId(caseId);
		}

		if (updatedBySource == null) {
			cannabisApplicationStagesImpl.setUpdatedBySource("");
		}
		else {
			cannabisApplicationStagesImpl.setUpdatedBySource(updatedBySource);
		}

		cannabisApplicationStagesImpl.resetOriginalValues();

		return cannabisApplicationStagesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cannabisApplicationstageId = objectInput.readLong();

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

		cannabisApplicationId = objectInput.readLong();
		caseId = objectInput.readUTF();
		updatedBySource = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(cannabisApplicationstageId);

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

		objectOutput.writeLong(cannabisApplicationId);

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

	public long cannabisApplicationstageId;
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
	public long cannabisApplicationId;
	public String caseId;
	public String updatedBySource;

}