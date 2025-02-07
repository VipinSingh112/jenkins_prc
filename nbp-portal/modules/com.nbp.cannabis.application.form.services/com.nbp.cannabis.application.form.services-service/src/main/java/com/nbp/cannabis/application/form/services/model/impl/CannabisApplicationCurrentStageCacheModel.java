/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.cannabis.application.form.services.model.CannabisApplicationCurrentStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CannabisApplicationCurrentStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CannabisApplicationCurrentStageCacheModel
	implements CacheModel<CannabisApplicationCurrentStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CannabisApplicationCurrentStageCacheModel)) {
			return false;
		}

		CannabisApplicationCurrentStageCacheModel
			cannabisApplicationCurrentStageCacheModel =
				(CannabisApplicationCurrentStageCacheModel)object;

		if (cannabisStageId ==
				cannabisApplicationCurrentStageCacheModel.cannabisStageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cannabisStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", cannabisStageId=");
		sb.append(cannabisStageId);
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
		sb.append(", cannabisApplicationId=");
		sb.append(cannabisApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CannabisApplicationCurrentStage toEntityModel() {
		CannabisApplicationCurrentStageImpl
			cannabisApplicationCurrentStageImpl =
				new CannabisApplicationCurrentStageImpl();

		if (uuid == null) {
			cannabisApplicationCurrentStageImpl.setUuid("");
		}
		else {
			cannabisApplicationCurrentStageImpl.setUuid(uuid);
		}

		cannabisApplicationCurrentStageImpl.setCannabisStageId(cannabisStageId);
		cannabisApplicationCurrentStageImpl.setGroupId(groupId);
		cannabisApplicationCurrentStageImpl.setCompanyId(companyId);
		cannabisApplicationCurrentStageImpl.setUserId(userId);

		if (userName == null) {
			cannabisApplicationCurrentStageImpl.setUserName("");
		}
		else {
			cannabisApplicationCurrentStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			cannabisApplicationCurrentStageImpl.setCreateDate(null);
		}
		else {
			cannabisApplicationCurrentStageImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cannabisApplicationCurrentStageImpl.setModifiedDate(null);
		}
		else {
			cannabisApplicationCurrentStageImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (currentStage == null) {
			cannabisApplicationCurrentStageImpl.setCurrentStage("");
		}
		else {
			cannabisApplicationCurrentStageImpl.setCurrentStage(currentStage);
		}

		if (lastFormStep == null) {
			cannabisApplicationCurrentStageImpl.setLastFormStep("");
		}
		else {
			cannabisApplicationCurrentStageImpl.setLastFormStep(lastFormStep);
		}

		cannabisApplicationCurrentStageImpl.setCannabisApplicationId(
			cannabisApplicationId);

		cannabisApplicationCurrentStageImpl.resetOriginalValues();

		return cannabisApplicationCurrentStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		cannabisStageId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		currentStage = objectInput.readUTF();
		lastFormStep = objectInput.readUTF();

		cannabisApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(cannabisStageId);

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

		objectOutput.writeLong(cannabisApplicationId);
	}

	public String uuid;
	public long cannabisStageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String currentStage;
	public String lastFormStep;
	public long cannabisApplicationId;

}