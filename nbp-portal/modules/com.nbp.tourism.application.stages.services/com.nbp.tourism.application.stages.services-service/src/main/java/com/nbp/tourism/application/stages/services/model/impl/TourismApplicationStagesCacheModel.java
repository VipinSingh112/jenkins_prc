/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.stages.services.model.TourismApplicationStages;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismApplicationStages in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismApplicationStagesCacheModel
	implements CacheModel<TourismApplicationStages>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismApplicationStagesCacheModel)) {
			return false;
		}

		TourismApplicationStagesCacheModel tourismApplicationStagesCacheModel =
			(TourismApplicationStagesCacheModel)object;

		if (tourismApplicationStagesId ==
				tourismApplicationStagesCacheModel.tourismApplicationStagesId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismApplicationStagesId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", tourismApplicationStagesId=");
		sb.append(tourismApplicationStagesId);
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
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", updatedBySource=");
		sb.append(updatedBySource);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismApplicationStages toEntityModel() {
		TourismApplicationStagesImpl tourismApplicationStagesImpl =
			new TourismApplicationStagesImpl();

		if (uuid == null) {
			tourismApplicationStagesImpl.setUuid("");
		}
		else {
			tourismApplicationStagesImpl.setUuid(uuid);
		}

		tourismApplicationStagesImpl.setTourismApplicationStagesId(
			tourismApplicationStagesId);
		tourismApplicationStagesImpl.setGroupId(groupId);
		tourismApplicationStagesImpl.setCompanyId(companyId);
		tourismApplicationStagesImpl.setUserId(userId);

		if (userName == null) {
			tourismApplicationStagesImpl.setUserName("");
		}
		else {
			tourismApplicationStagesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismApplicationStagesImpl.setCreateDate(null);
		}
		else {
			tourismApplicationStagesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismApplicationStagesImpl.setModifiedDate(null);
		}
		else {
			tourismApplicationStagesImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (stageName == null) {
			tourismApplicationStagesImpl.setStageName("");
		}
		else {
			tourismApplicationStagesImpl.setStageName(stageName);
		}

		if (duration == null) {
			tourismApplicationStagesImpl.setDuration("");
		}
		else {
			tourismApplicationStagesImpl.setDuration(duration);
		}

		if (stageStatus == null) {
			tourismApplicationStagesImpl.setStageStatus("");
		}
		else {
			tourismApplicationStagesImpl.setStageStatus(stageStatus);
		}

		if (stageStartDate == Long.MIN_VALUE) {
			tourismApplicationStagesImpl.setStageStartDate(null);
		}
		else {
			tourismApplicationStagesImpl.setStageStartDate(
				new Date(stageStartDate));
		}

		if (stageEndDate == Long.MIN_VALUE) {
			tourismApplicationStagesImpl.setStageEndDate(null);
		}
		else {
			tourismApplicationStagesImpl.setStageEndDate(
				new Date(stageEndDate));
		}

		tourismApplicationStagesImpl.setTourismApplicationId(
			tourismApplicationId);

		if (caseId == null) {
			tourismApplicationStagesImpl.setCaseId("");
		}
		else {
			tourismApplicationStagesImpl.setCaseId(caseId);
		}

		if (updatedBySource == null) {
			tourismApplicationStagesImpl.setUpdatedBySource("");
		}
		else {
			tourismApplicationStagesImpl.setUpdatedBySource(updatedBySource);
		}

		tourismApplicationStagesImpl.resetOriginalValues();

		return tourismApplicationStagesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		tourismApplicationStagesId = objectInput.readLong();

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

		tourismApplicationId = objectInput.readLong();
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

		objectOutput.writeLong(tourismApplicationStagesId);

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

		objectOutput.writeLong(tourismApplicationId);

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
	public long tourismApplicationStagesId;
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
	public long tourismApplicationId;
	public String caseId;
	public String updatedBySource;

}