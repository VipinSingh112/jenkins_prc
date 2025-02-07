/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.services.stages.service.model.OSIServicesStages;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OSIServicesStages in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OSIServicesStagesCacheModel
	implements CacheModel<OSIServicesStages>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OSIServicesStagesCacheModel)) {
			return false;
		}

		OSIServicesStagesCacheModel osiServicesStagesCacheModel =
			(OSIServicesStagesCacheModel)object;

		if (osiServicesStagesId ==
				osiServicesStagesCacheModel.osiServicesStagesId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiServicesStagesId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", osiServicesStagesId=");
		sb.append(osiServicesStagesId);
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
		sb.append(", osiServciesApplicationId=");
		sb.append(osiServciesApplicationId);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", updatedBySource=");
		sb.append(updatedBySource);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OSIServicesStages toEntityModel() {
		OSIServicesStagesImpl osiServicesStagesImpl =
			new OSIServicesStagesImpl();

		if (uuid == null) {
			osiServicesStagesImpl.setUuid("");
		}
		else {
			osiServicesStagesImpl.setUuid(uuid);
		}

		osiServicesStagesImpl.setOsiServicesStagesId(osiServicesStagesId);
		osiServicesStagesImpl.setGroupId(groupId);
		osiServicesStagesImpl.setCompanyId(companyId);
		osiServicesStagesImpl.setUserId(userId);

		if (userName == null) {
			osiServicesStagesImpl.setUserName("");
		}
		else {
			osiServicesStagesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiServicesStagesImpl.setCreateDate(null);
		}
		else {
			osiServicesStagesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiServicesStagesImpl.setModifiedDate(null);
		}
		else {
			osiServicesStagesImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (stageName == null) {
			osiServicesStagesImpl.setStageName("");
		}
		else {
			osiServicesStagesImpl.setStageName(stageName);
		}

		if (duration == null) {
			osiServicesStagesImpl.setDuration("");
		}
		else {
			osiServicesStagesImpl.setDuration(duration);
		}

		if (stageStatus == null) {
			osiServicesStagesImpl.setStageStatus("");
		}
		else {
			osiServicesStagesImpl.setStageStatus(stageStatus);
		}

		if (stageStartDate == Long.MIN_VALUE) {
			osiServicesStagesImpl.setStageStartDate(null);
		}
		else {
			osiServicesStagesImpl.setStageStartDate(new Date(stageStartDate));
		}

		if (stageEndDate == Long.MIN_VALUE) {
			osiServicesStagesImpl.setStageEndDate(null);
		}
		else {
			osiServicesStagesImpl.setStageEndDate(new Date(stageEndDate));
		}

		osiServicesStagesImpl.setOsiServciesApplicationId(
			osiServciesApplicationId);

		if (caseId == null) {
			osiServicesStagesImpl.setCaseId("");
		}
		else {
			osiServicesStagesImpl.setCaseId(caseId);
		}

		if (updatedBySource == null) {
			osiServicesStagesImpl.setUpdatedBySource("");
		}
		else {
			osiServicesStagesImpl.setUpdatedBySource(updatedBySource);
		}

		osiServicesStagesImpl.resetOriginalValues();

		return osiServicesStagesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		osiServicesStagesId = objectInput.readLong();

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

		osiServciesApplicationId = objectInput.readLong();
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

		objectOutput.writeLong(osiServicesStagesId);

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

		objectOutput.writeLong(osiServciesApplicationId);

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
	public long osiServicesStagesId;
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
	public long osiServciesApplicationId;
	public String caseId;
	public String updatedBySource;

}