/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.factories.registration.stage.services.model.FactoriesApplicationStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FactoriesApplicationStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FactoriesApplicationStageCacheModel
	implements CacheModel<FactoriesApplicationStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FactoriesApplicationStageCacheModel)) {
			return false;
		}

		FactoriesApplicationStageCacheModel
			factoriesApplicationStageCacheModel =
				(FactoriesApplicationStageCacheModel)object;

		if (factoriesApplicationStageId ==
				factoriesApplicationStageCacheModel.
					factoriesApplicationStageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, factoriesApplicationStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", factoriesApplicationStageId=");
		sb.append(factoriesApplicationStageId);
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
		sb.append(", factoriesApplicationId=");
		sb.append(factoriesApplicationId);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", updatedBySource=");
		sb.append(updatedBySource);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FactoriesApplicationStage toEntityModel() {
		FactoriesApplicationStageImpl factoriesApplicationStageImpl =
			new FactoriesApplicationStageImpl();

		if (uuid == null) {
			factoriesApplicationStageImpl.setUuid("");
		}
		else {
			factoriesApplicationStageImpl.setUuid(uuid);
		}

		factoriesApplicationStageImpl.setFactoriesApplicationStageId(
			factoriesApplicationStageId);
		factoriesApplicationStageImpl.setGroupId(groupId);
		factoriesApplicationStageImpl.setCompanyId(companyId);
		factoriesApplicationStageImpl.setUserId(userId);

		if (userName == null) {
			factoriesApplicationStageImpl.setUserName("");
		}
		else {
			factoriesApplicationStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			factoriesApplicationStageImpl.setCreateDate(null);
		}
		else {
			factoriesApplicationStageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			factoriesApplicationStageImpl.setModifiedDate(null);
		}
		else {
			factoriesApplicationStageImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (stageName == null) {
			factoriesApplicationStageImpl.setStageName("");
		}
		else {
			factoriesApplicationStageImpl.setStageName(stageName);
		}

		if (duration == null) {
			factoriesApplicationStageImpl.setDuration("");
		}
		else {
			factoriesApplicationStageImpl.setDuration(duration);
		}

		if (stageStatus == null) {
			factoriesApplicationStageImpl.setStageStatus("");
		}
		else {
			factoriesApplicationStageImpl.setStageStatus(stageStatus);
		}

		if (stageStartDate == Long.MIN_VALUE) {
			factoriesApplicationStageImpl.setStageStartDate(null);
		}
		else {
			factoriesApplicationStageImpl.setStageStartDate(
				new Date(stageStartDate));
		}

		if (stageEndDate == Long.MIN_VALUE) {
			factoriesApplicationStageImpl.setStageEndDate(null);
		}
		else {
			factoriesApplicationStageImpl.setStageEndDate(
				new Date(stageEndDate));
		}

		factoriesApplicationStageImpl.setFactoriesApplicationId(
			factoriesApplicationId);

		if (caseId == null) {
			factoriesApplicationStageImpl.setCaseId("");
		}
		else {
			factoriesApplicationStageImpl.setCaseId(caseId);
		}

		if (updatedBySource == null) {
			factoriesApplicationStageImpl.setUpdatedBySource("");
		}
		else {
			factoriesApplicationStageImpl.setUpdatedBySource(updatedBySource);
		}

		factoriesApplicationStageImpl.resetOriginalValues();

		return factoriesApplicationStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		factoriesApplicationStageId = objectInput.readLong();

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

		factoriesApplicationId = objectInput.readLong();
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

		objectOutput.writeLong(factoriesApplicationStageId);

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

		objectOutput.writeLong(factoriesApplicationId);

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
	public long factoriesApplicationStageId;
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
	public long factoriesApplicationId;
	public String caseId;
	public String updatedBySource;

}