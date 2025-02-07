/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezStatusApplicationCurrentStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezStatusApplicationCurrentStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezStatusApplicationCurrentStageCacheModel
	implements CacheModel<SezStatusApplicationCurrentStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezStatusApplicationCurrentStageCacheModel)) {
			return false;
		}

		SezStatusApplicationCurrentStageCacheModel
			sezStatusApplicationCurrentStageCacheModel =
				(SezStatusApplicationCurrentStageCacheModel)object;

		if (sezStageId ==
				sezStatusApplicationCurrentStageCacheModel.sezStageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", sezStageId=");
		sb.append(sezStageId);
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
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezStatusApplicationCurrentStage toEntityModel() {
		SezStatusApplicationCurrentStageImpl
			sezStatusApplicationCurrentStageImpl =
				new SezStatusApplicationCurrentStageImpl();

		if (uuid == null) {
			sezStatusApplicationCurrentStageImpl.setUuid("");
		}
		else {
			sezStatusApplicationCurrentStageImpl.setUuid(uuid);
		}

		sezStatusApplicationCurrentStageImpl.setSezStageId(sezStageId);
		sezStatusApplicationCurrentStageImpl.setGroupId(groupId);
		sezStatusApplicationCurrentStageImpl.setCompanyId(companyId);
		sezStatusApplicationCurrentStageImpl.setUserId(userId);

		if (userName == null) {
			sezStatusApplicationCurrentStageImpl.setUserName("");
		}
		else {
			sezStatusApplicationCurrentStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezStatusApplicationCurrentStageImpl.setCreateDate(null);
		}
		else {
			sezStatusApplicationCurrentStageImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezStatusApplicationCurrentStageImpl.setModifiedDate(null);
		}
		else {
			sezStatusApplicationCurrentStageImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (currentStage == null) {
			sezStatusApplicationCurrentStageImpl.setCurrentStage("");
		}
		else {
			sezStatusApplicationCurrentStageImpl.setCurrentStage(currentStage);
		}

		if (lastFormStep == null) {
			sezStatusApplicationCurrentStageImpl.setLastFormStep("");
		}
		else {
			sezStatusApplicationCurrentStageImpl.setLastFormStep(lastFormStep);
		}

		sezStatusApplicationCurrentStageImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezStatusApplicationCurrentStageImpl.resetOriginalValues();

		return sezStatusApplicationCurrentStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		sezStageId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		currentStage = objectInput.readUTF();
		lastFormStep = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(sezStageId);

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

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public String uuid;
	public long sezStageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String currentStage;
	public String lastFormStep;
	public long sezStatusApplicationId;

}