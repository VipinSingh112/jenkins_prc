/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncbj.application.form.service.model.NcbjCurrentStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcbjCurrentStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcbjCurrentStageCacheModel
	implements CacheModel<NcbjCurrentStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcbjCurrentStageCacheModel)) {
			return false;
		}

		NcbjCurrentStageCacheModel ncbjCurrentStageCacheModel =
			(NcbjCurrentStageCacheModel)object;

		if (ncbjCurrentStageId ==
				ncbjCurrentStageCacheModel.ncbjCurrentStageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncbjCurrentStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", ncbjCurrentStageId=");
		sb.append(ncbjCurrentStageId);
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
		sb.append(", currentStage=");
		sb.append(currentStage);
		sb.append(", lastFormStep=");
		sb.append(lastFormStep);
		sb.append(", ncbjApplicationId=");
		sb.append(ncbjApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcbjCurrentStage toEntityModel() {
		NcbjCurrentStageImpl ncbjCurrentStageImpl = new NcbjCurrentStageImpl();

		if (uuid == null) {
			ncbjCurrentStageImpl.setUuid("");
		}
		else {
			ncbjCurrentStageImpl.setUuid(uuid);
		}

		ncbjCurrentStageImpl.setNcbjCurrentStageId(ncbjCurrentStageId);
		ncbjCurrentStageImpl.setGroupId(groupId);
		ncbjCurrentStageImpl.setCompanyId(companyId);
		ncbjCurrentStageImpl.setUserId(userId);

		if (userName == null) {
			ncbjCurrentStageImpl.setUserName("");
		}
		else {
			ncbjCurrentStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncbjCurrentStageImpl.setCreateDate(null);
		}
		else {
			ncbjCurrentStageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncbjCurrentStageImpl.setModifiedDate(null);
		}
		else {
			ncbjCurrentStageImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (currentStage == null) {
			ncbjCurrentStageImpl.setCurrentStage("");
		}
		else {
			ncbjCurrentStageImpl.setCurrentStage(currentStage);
		}

		if (lastFormStep == null) {
			ncbjCurrentStageImpl.setLastFormStep("");
		}
		else {
			ncbjCurrentStageImpl.setLastFormStep(lastFormStep);
		}

		ncbjCurrentStageImpl.setNcbjApplicationId(ncbjApplicationId);

		ncbjCurrentStageImpl.resetOriginalValues();

		return ncbjCurrentStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		ncbjCurrentStageId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		currentStage = objectInput.readUTF();
		lastFormStep = objectInput.readUTF();

		ncbjApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(ncbjCurrentStageId);

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

		if (currentStage == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(currentStage);
		}

		if (lastFormStep == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastFormStep);
		}

		objectOutput.writeLong(ncbjApplicationId);
	}

	public String uuid;
	public long ncbjCurrentStageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String currentStage;
	public String lastFormStep;
	public long ncbjApplicationId;

}