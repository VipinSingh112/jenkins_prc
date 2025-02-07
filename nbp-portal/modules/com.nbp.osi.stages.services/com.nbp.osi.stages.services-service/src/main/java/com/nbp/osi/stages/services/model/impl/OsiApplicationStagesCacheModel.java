/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.stages.services.model.OsiApplicationStages;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiApplicationStages in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiApplicationStagesCacheModel
	implements CacheModel<OsiApplicationStages>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OsiApplicationStagesCacheModel)) {
			return false;
		}

		OsiApplicationStagesCacheModel osiApplicationStagesCacheModel =
			(OsiApplicationStagesCacheModel)object;

		if (OsiApplicationStagesId ==
				osiApplicationStagesCacheModel.OsiApplicationStagesId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, OsiApplicationStagesId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", OsiApplicationStagesId=");
		sb.append(OsiApplicationStagesId);
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
		sb.append(", osiApplicationId=");
		sb.append(osiApplicationId);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", updatedBySource=");
		sb.append(updatedBySource);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OsiApplicationStages toEntityModel() {
		OsiApplicationStagesImpl osiApplicationStagesImpl =
			new OsiApplicationStagesImpl();

		if (uuid == null) {
			osiApplicationStagesImpl.setUuid("");
		}
		else {
			osiApplicationStagesImpl.setUuid(uuid);
		}

		osiApplicationStagesImpl.setOsiApplicationStagesId(
			OsiApplicationStagesId);
		osiApplicationStagesImpl.setGroupId(groupId);
		osiApplicationStagesImpl.setCompanyId(companyId);
		osiApplicationStagesImpl.setUserId(userId);

		if (userName == null) {
			osiApplicationStagesImpl.setUserName("");
		}
		else {
			osiApplicationStagesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiApplicationStagesImpl.setCreateDate(null);
		}
		else {
			osiApplicationStagesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiApplicationStagesImpl.setModifiedDate(null);
		}
		else {
			osiApplicationStagesImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (stageName == null) {
			osiApplicationStagesImpl.setStageName("");
		}
		else {
			osiApplicationStagesImpl.setStageName(stageName);
		}

		if (duration == null) {
			osiApplicationStagesImpl.setDuration("");
		}
		else {
			osiApplicationStagesImpl.setDuration(duration);
		}

		if (stageStatus == null) {
			osiApplicationStagesImpl.setStageStatus("");
		}
		else {
			osiApplicationStagesImpl.setStageStatus(stageStatus);
		}

		if (stageStartDate == Long.MIN_VALUE) {
			osiApplicationStagesImpl.setStageStartDate(null);
		}
		else {
			osiApplicationStagesImpl.setStageStartDate(
				new Date(stageStartDate));
		}

		if (stageEndDate == Long.MIN_VALUE) {
			osiApplicationStagesImpl.setStageEndDate(null);
		}
		else {
			osiApplicationStagesImpl.setStageEndDate(new Date(stageEndDate));
		}

		osiApplicationStagesImpl.setOsiApplicationId(osiApplicationId);

		if (caseId == null) {
			osiApplicationStagesImpl.setCaseId("");
		}
		else {
			osiApplicationStagesImpl.setCaseId(caseId);
		}

		if (updatedBySource == null) {
			osiApplicationStagesImpl.setUpdatedBySource("");
		}
		else {
			osiApplicationStagesImpl.setUpdatedBySource(updatedBySource);
		}

		osiApplicationStagesImpl.resetOriginalValues();

		return osiApplicationStagesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		OsiApplicationStagesId = objectInput.readLong();

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

		osiApplicationId = objectInput.readLong();
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

		objectOutput.writeLong(OsiApplicationStagesId);

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

		objectOutput.writeLong(osiApplicationId);

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
	public long OsiApplicationStagesId;
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
	public long osiApplicationId;
	public String caseId;
	public String updatedBySource;

}