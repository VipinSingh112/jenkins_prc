/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationStages;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PharmaApplicationStages in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PharmaApplicationStagesCacheModel
	implements CacheModel<PharmaApplicationStages>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PharmaApplicationStagesCacheModel)) {
			return false;
		}

		PharmaApplicationStagesCacheModel pharmaApplicationStagesCacheModel =
			(PharmaApplicationStagesCacheModel)object;

		if (pharmaApplicationstageId ==
				pharmaApplicationStagesCacheModel.pharmaApplicationstageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, pharmaApplicationstageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{pharmaApplicationstageId=");
		sb.append(pharmaApplicationstageId);
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
		sb.append(", pharmaApplicationId=");
		sb.append(pharmaApplicationId);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", updatedBySource=");
		sb.append(updatedBySource);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PharmaApplicationStages toEntityModel() {
		PharmaApplicationStagesImpl pharmaApplicationStagesImpl =
			new PharmaApplicationStagesImpl();

		pharmaApplicationStagesImpl.setPharmaApplicationstageId(
			pharmaApplicationstageId);
		pharmaApplicationStagesImpl.setGroupId(groupId);
		pharmaApplicationStagesImpl.setCompanyId(companyId);
		pharmaApplicationStagesImpl.setUserId(userId);

		if (userName == null) {
			pharmaApplicationStagesImpl.setUserName("");
		}
		else {
			pharmaApplicationStagesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			pharmaApplicationStagesImpl.setCreateDate(null);
		}
		else {
			pharmaApplicationStagesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			pharmaApplicationStagesImpl.setModifiedDate(null);
		}
		else {
			pharmaApplicationStagesImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (stageName == null) {
			pharmaApplicationStagesImpl.setStageName("");
		}
		else {
			pharmaApplicationStagesImpl.setStageName(stageName);
		}

		if (duration == null) {
			pharmaApplicationStagesImpl.setDuration("");
		}
		else {
			pharmaApplicationStagesImpl.setDuration(duration);
		}

		if (stageStatus == null) {
			pharmaApplicationStagesImpl.setStageStatus("");
		}
		else {
			pharmaApplicationStagesImpl.setStageStatus(stageStatus);
		}

		if (stageStartDate == Long.MIN_VALUE) {
			pharmaApplicationStagesImpl.setStageStartDate(null);
		}
		else {
			pharmaApplicationStagesImpl.setStageStartDate(
				new Date(stageStartDate));
		}

		if (stageEndDate == Long.MIN_VALUE) {
			pharmaApplicationStagesImpl.setStageEndDate(null);
		}
		else {
			pharmaApplicationStagesImpl.setStageEndDate(new Date(stageEndDate));
		}

		pharmaApplicationStagesImpl.setPharmaApplicationId(pharmaApplicationId);

		if (caseId == null) {
			pharmaApplicationStagesImpl.setCaseId("");
		}
		else {
			pharmaApplicationStagesImpl.setCaseId(caseId);
		}

		if (updatedBySource == null) {
			pharmaApplicationStagesImpl.setUpdatedBySource("");
		}
		else {
			pharmaApplicationStagesImpl.setUpdatedBySource(updatedBySource);
		}

		pharmaApplicationStagesImpl.resetOriginalValues();

		return pharmaApplicationStagesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		pharmaApplicationstageId = objectInput.readLong();

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

		pharmaApplicationId = objectInput.readLong();
		caseId = objectInput.readUTF();
		updatedBySource = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(pharmaApplicationstageId);

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

		objectOutput.writeLong(pharmaApplicationId);

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

	public long pharmaApplicationstageId;
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
	public long pharmaApplicationId;
	public String caseId;
	public String updatedBySource;

}