/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.acquire.stages.service.model.AcquireApplicationStages;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AcquireApplicationStages in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AcquireApplicationStagesCacheModel
	implements CacheModel<AcquireApplicationStages>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AcquireApplicationStagesCacheModel)) {
			return false;
		}

		AcquireApplicationStagesCacheModel acquireApplicationStagesCacheModel =
			(AcquireApplicationStagesCacheModel)object;

		if (acquireApplicationStagesId ==
				acquireApplicationStagesCacheModel.acquireApplicationStagesId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, acquireApplicationStagesId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{acquireApplicationStagesId=");
		sb.append(acquireApplicationStagesId);
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
		sb.append(", acquireApplicationId=");
		sb.append(acquireApplicationId);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", updatedBySource=");
		sb.append(updatedBySource);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AcquireApplicationStages toEntityModel() {
		AcquireApplicationStagesImpl acquireApplicationStagesImpl =
			new AcquireApplicationStagesImpl();

		acquireApplicationStagesImpl.setAcquireApplicationStagesId(
			acquireApplicationStagesId);
		acquireApplicationStagesImpl.setGroupId(groupId);
		acquireApplicationStagesImpl.setCompanyId(companyId);
		acquireApplicationStagesImpl.setUserId(userId);

		if (userName == null) {
			acquireApplicationStagesImpl.setUserName("");
		}
		else {
			acquireApplicationStagesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			acquireApplicationStagesImpl.setCreateDate(null);
		}
		else {
			acquireApplicationStagesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			acquireApplicationStagesImpl.setModifiedDate(null);
		}
		else {
			acquireApplicationStagesImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (stageName == null) {
			acquireApplicationStagesImpl.setStageName("");
		}
		else {
			acquireApplicationStagesImpl.setStageName(stageName);
		}

		if (duration == null) {
			acquireApplicationStagesImpl.setDuration("");
		}
		else {
			acquireApplicationStagesImpl.setDuration(duration);
		}

		if (stageStatus == null) {
			acquireApplicationStagesImpl.setStageStatus("");
		}
		else {
			acquireApplicationStagesImpl.setStageStatus(stageStatus);
		}

		if (stageStartDate == Long.MIN_VALUE) {
			acquireApplicationStagesImpl.setStageStartDate(null);
		}
		else {
			acquireApplicationStagesImpl.setStageStartDate(
				new Date(stageStartDate));
		}

		if (stageEndDate == Long.MIN_VALUE) {
			acquireApplicationStagesImpl.setStageEndDate(null);
		}
		else {
			acquireApplicationStagesImpl.setStageEndDate(
				new Date(stageEndDate));
		}

		acquireApplicationStagesImpl.setAcquireApplicationId(
			acquireApplicationId);

		if (caseId == null) {
			acquireApplicationStagesImpl.setCaseId("");
		}
		else {
			acquireApplicationStagesImpl.setCaseId(caseId);
		}

		if (updatedBySource == null) {
			acquireApplicationStagesImpl.setUpdatedBySource("");
		}
		else {
			acquireApplicationStagesImpl.setUpdatedBySource(updatedBySource);
		}

		acquireApplicationStagesImpl.resetOriginalValues();

		return acquireApplicationStagesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		acquireApplicationStagesId = objectInput.readLong();

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

		acquireApplicationId = objectInput.readLong();
		caseId = objectInput.readUTF();
		updatedBySource = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(acquireApplicationStagesId);

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

		objectOutput.writeLong(acquireApplicationId);

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

	public long acquireApplicationStagesId;
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
	public long acquireApplicationId;
	public String caseId;
	public String updatedBySource;

}