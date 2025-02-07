/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.stage.services.model.SezStatusWFHApplicationStages;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezStatusWFHApplicationStages in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezStatusWFHApplicationStagesCacheModel
	implements CacheModel<SezStatusWFHApplicationStages>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezStatusWFHApplicationStagesCacheModel)) {
			return false;
		}

		SezStatusWFHApplicationStagesCacheModel
			sezStatusWFHApplicationStagesCacheModel =
				(SezStatusWFHApplicationStagesCacheModel)object;

		if (sezWFHAppStagesId ==
				sezStatusWFHApplicationStagesCacheModel.sezWFHAppStagesId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezWFHAppStagesId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{sezWFHAppStagesId=");
		sb.append(sezWFHAppStagesId);
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
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", updatedBySource=");
		sb.append(updatedBySource);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezStatusWFHApplicationStages toEntityModel() {
		SezStatusWFHApplicationStagesImpl sezStatusWFHApplicationStagesImpl =
			new SezStatusWFHApplicationStagesImpl();

		sezStatusWFHApplicationStagesImpl.setSezWFHAppStagesId(
			sezWFHAppStagesId);
		sezStatusWFHApplicationStagesImpl.setGroupId(groupId);
		sezStatusWFHApplicationStagesImpl.setCompanyId(companyId);
		sezStatusWFHApplicationStagesImpl.setUserId(userId);

		if (userName == null) {
			sezStatusWFHApplicationStagesImpl.setUserName("");
		}
		else {
			sezStatusWFHApplicationStagesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezStatusWFHApplicationStagesImpl.setCreateDate(null);
		}
		else {
			sezStatusWFHApplicationStagesImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezStatusWFHApplicationStagesImpl.setModifiedDate(null);
		}
		else {
			sezStatusWFHApplicationStagesImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (stageName == null) {
			sezStatusWFHApplicationStagesImpl.setStageName("");
		}
		else {
			sezStatusWFHApplicationStagesImpl.setStageName(stageName);
		}

		if (duration == null) {
			sezStatusWFHApplicationStagesImpl.setDuration("");
		}
		else {
			sezStatusWFHApplicationStagesImpl.setDuration(duration);
		}

		if (stageStatus == null) {
			sezStatusWFHApplicationStagesImpl.setStageStatus("");
		}
		else {
			sezStatusWFHApplicationStagesImpl.setStageStatus(stageStatus);
		}

		if (stageStartDate == Long.MIN_VALUE) {
			sezStatusWFHApplicationStagesImpl.setStageStartDate(null);
		}
		else {
			sezStatusWFHApplicationStagesImpl.setStageStartDate(
				new Date(stageStartDate));
		}

		if (stageEndDate == Long.MIN_VALUE) {
			sezStatusWFHApplicationStagesImpl.setStageEndDate(null);
		}
		else {
			sezStatusWFHApplicationStagesImpl.setStageEndDate(
				new Date(stageEndDate));
		}

		sezStatusWFHApplicationStagesImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		if (caseId == null) {
			sezStatusWFHApplicationStagesImpl.setCaseId("");
		}
		else {
			sezStatusWFHApplicationStagesImpl.setCaseId(caseId);
		}

		if (updatedBySource == null) {
			sezStatusWFHApplicationStagesImpl.setUpdatedBySource("");
		}
		else {
			sezStatusWFHApplicationStagesImpl.setUpdatedBySource(
				updatedBySource);
		}

		sezStatusWFHApplicationStagesImpl.resetOriginalValues();

		return sezStatusWFHApplicationStagesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezWFHAppStagesId = objectInput.readLong();

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

		sezStatusApplicationId = objectInput.readLong();
		caseId = objectInput.readUTF();
		updatedBySource = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezWFHAppStagesId);

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

		objectOutput.writeLong(sezStatusApplicationId);

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

	public long sezWFHAppStagesId;
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
	public long sezStatusApplicationId;
	public String caseId;
	public String updatedBySource;

}