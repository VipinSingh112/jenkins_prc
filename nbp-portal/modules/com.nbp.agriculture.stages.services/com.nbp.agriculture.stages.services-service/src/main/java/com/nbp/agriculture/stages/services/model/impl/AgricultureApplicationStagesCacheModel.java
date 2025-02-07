/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.agriculture.stages.services.model.AgricultureApplicationStages;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AgricultureApplicationStages in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AgricultureApplicationStagesCacheModel
	implements CacheModel<AgricultureApplicationStages>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AgricultureApplicationStagesCacheModel)) {
			return false;
		}

		AgricultureApplicationStagesCacheModel
			agricultureApplicationStagesCacheModel =
				(AgricultureApplicationStagesCacheModel)object;

		if (agricultureApplicationstageId ==
				agricultureApplicationStagesCacheModel.
					agricultureApplicationstageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, agricultureApplicationstageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{agricultureApplicationstageId=");
		sb.append(agricultureApplicationstageId);
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
		sb.append(", agricultureApplicationId=");
		sb.append(agricultureApplicationId);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", updatedBySource=");
		sb.append(updatedBySource);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AgricultureApplicationStages toEntityModel() {
		AgricultureApplicationStagesImpl agricultureApplicationStagesImpl =
			new AgricultureApplicationStagesImpl();

		agricultureApplicationStagesImpl.setAgricultureApplicationstageId(
			agricultureApplicationstageId);
		agricultureApplicationStagesImpl.setGroupId(groupId);
		agricultureApplicationStagesImpl.setCompanyId(companyId);
		agricultureApplicationStagesImpl.setUserId(userId);

		if (userName == null) {
			agricultureApplicationStagesImpl.setUserName("");
		}
		else {
			agricultureApplicationStagesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			agricultureApplicationStagesImpl.setCreateDate(null);
		}
		else {
			agricultureApplicationStagesImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			agricultureApplicationStagesImpl.setModifiedDate(null);
		}
		else {
			agricultureApplicationStagesImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (stageName == null) {
			agricultureApplicationStagesImpl.setStageName("");
		}
		else {
			agricultureApplicationStagesImpl.setStageName(stageName);
		}

		if (duration == null) {
			agricultureApplicationStagesImpl.setDuration("");
		}
		else {
			agricultureApplicationStagesImpl.setDuration(duration);
		}

		if (stageStatus == null) {
			agricultureApplicationStagesImpl.setStageStatus("");
		}
		else {
			agricultureApplicationStagesImpl.setStageStatus(stageStatus);
		}

		if (stageStartDate == Long.MIN_VALUE) {
			agricultureApplicationStagesImpl.setStageStartDate(null);
		}
		else {
			agricultureApplicationStagesImpl.setStageStartDate(
				new Date(stageStartDate));
		}

		if (stageEndDate == Long.MIN_VALUE) {
			agricultureApplicationStagesImpl.setStageEndDate(null);
		}
		else {
			agricultureApplicationStagesImpl.setStageEndDate(
				new Date(stageEndDate));
		}

		agricultureApplicationStagesImpl.setAgricultureApplicationId(
			agricultureApplicationId);

		if (caseId == null) {
			agricultureApplicationStagesImpl.setCaseId("");
		}
		else {
			agricultureApplicationStagesImpl.setCaseId(caseId);
		}

		if (updatedBySource == null) {
			agricultureApplicationStagesImpl.setUpdatedBySource("");
		}
		else {
			agricultureApplicationStagesImpl.setUpdatedBySource(
				updatedBySource);
		}

		agricultureApplicationStagesImpl.resetOriginalValues();

		return agricultureApplicationStagesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		agricultureApplicationstageId = objectInput.readLong();

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

		agricultureApplicationId = objectInput.readLong();
		caseId = objectInput.readUTF();
		updatedBySource = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(agricultureApplicationstageId);

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

		objectOutput.writeLong(agricultureApplicationId);

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

	public long agricultureApplicationstageId;
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
	public long agricultureApplicationId;
	public String caseId;
	public String updatedBySource;

}