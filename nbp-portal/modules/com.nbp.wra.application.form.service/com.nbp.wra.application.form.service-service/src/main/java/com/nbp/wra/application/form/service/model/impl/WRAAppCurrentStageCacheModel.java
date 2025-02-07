/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.wra.application.form.service.model.WRAAppCurrentStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing WRAAppCurrentStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class WRAAppCurrentStageCacheModel
	implements CacheModel<WRAAppCurrentStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof WRAAppCurrentStageCacheModel)) {
			return false;
		}

		WRAAppCurrentStageCacheModel wraAppCurrentStageCacheModel =
			(WRAAppCurrentStageCacheModel)object;

		if (wraAppCurrentStageId ==
				wraAppCurrentStageCacheModel.wraAppCurrentStageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, wraAppCurrentStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", wraAppCurrentStageId=");
		sb.append(wraAppCurrentStageId);
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
		sb.append(", wraApplicationId=");
		sb.append(wraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public WRAAppCurrentStage toEntityModel() {
		WRAAppCurrentStageImpl wraAppCurrentStageImpl =
			new WRAAppCurrentStageImpl();

		if (uuid == null) {
			wraAppCurrentStageImpl.setUuid("");
		}
		else {
			wraAppCurrentStageImpl.setUuid(uuid);
		}

		wraAppCurrentStageImpl.setWraAppCurrentStageId(wraAppCurrentStageId);
		wraAppCurrentStageImpl.setGroupId(groupId);
		wraAppCurrentStageImpl.setCompanyId(companyId);
		wraAppCurrentStageImpl.setUserId(userId);

		if (userName == null) {
			wraAppCurrentStageImpl.setUserName("");
		}
		else {
			wraAppCurrentStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			wraAppCurrentStageImpl.setCreateDate(null);
		}
		else {
			wraAppCurrentStageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			wraAppCurrentStageImpl.setModifiedDate(null);
		}
		else {
			wraAppCurrentStageImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (currentStage == null) {
			wraAppCurrentStageImpl.setCurrentStage("");
		}
		else {
			wraAppCurrentStageImpl.setCurrentStage(currentStage);
		}

		if (lastFormStep == null) {
			wraAppCurrentStageImpl.setLastFormStep("");
		}
		else {
			wraAppCurrentStageImpl.setLastFormStep(lastFormStep);
		}

		wraAppCurrentStageImpl.setWraApplicationId(wraApplicationId);

		wraAppCurrentStageImpl.resetOriginalValues();

		return wraAppCurrentStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		wraAppCurrentStageId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		currentStage = objectInput.readUTF();
		lastFormStep = objectInput.readUTF();

		wraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(wraAppCurrentStageId);

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

		objectOutput.writeLong(wraApplicationId);
	}

	public String uuid;
	public long wraAppCurrentStageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String currentStage;
	public String lastFormStep;
	public long wraApplicationId;

}