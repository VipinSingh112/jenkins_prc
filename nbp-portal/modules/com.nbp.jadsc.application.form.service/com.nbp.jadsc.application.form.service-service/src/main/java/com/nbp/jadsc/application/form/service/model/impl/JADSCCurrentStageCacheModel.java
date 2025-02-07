/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jadsc.application.form.service.model.JADSCCurrentStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JADSCCurrentStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JADSCCurrentStageCacheModel
	implements CacheModel<JADSCCurrentStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JADSCCurrentStageCacheModel)) {
			return false;
		}

		JADSCCurrentStageCacheModel jadscCurrentStageCacheModel =
			(JADSCCurrentStageCacheModel)object;

		if (jadscCurrentStageId ==
				jadscCurrentStageCacheModel.jadscCurrentStageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jadscCurrentStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", jadscCurrentStageId=");
		sb.append(jadscCurrentStageId);
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
		sb.append(", jadscApplicationId=");
		sb.append(jadscApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JADSCCurrentStage toEntityModel() {
		JADSCCurrentStageImpl jadscCurrentStageImpl =
			new JADSCCurrentStageImpl();

		if (uuid == null) {
			jadscCurrentStageImpl.setUuid("");
		}
		else {
			jadscCurrentStageImpl.setUuid(uuid);
		}

		jadscCurrentStageImpl.setJadscCurrentStageId(jadscCurrentStageId);
		jadscCurrentStageImpl.setGroupId(groupId);
		jadscCurrentStageImpl.setCompanyId(companyId);
		jadscCurrentStageImpl.setUserId(userId);

		if (userName == null) {
			jadscCurrentStageImpl.setUserName("");
		}
		else {
			jadscCurrentStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jadscCurrentStageImpl.setCreateDate(null);
		}
		else {
			jadscCurrentStageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jadscCurrentStageImpl.setModifiedDate(null);
		}
		else {
			jadscCurrentStageImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (currentStage == null) {
			jadscCurrentStageImpl.setCurrentStage("");
		}
		else {
			jadscCurrentStageImpl.setCurrentStage(currentStage);
		}

		if (lastFormStep == null) {
			jadscCurrentStageImpl.setLastFormStep("");
		}
		else {
			jadscCurrentStageImpl.setLastFormStep(lastFormStep);
		}

		jadscCurrentStageImpl.setJadscApplicationId(jadscApplicationId);

		jadscCurrentStageImpl.resetOriginalValues();

		return jadscCurrentStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		jadscCurrentStageId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		currentStage = objectInput.readUTF();
		lastFormStep = objectInput.readUTF();

		jadscApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(jadscCurrentStageId);

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

		objectOutput.writeLong(jadscApplicationId);
	}

	public String uuid;
	public long jadscCurrentStageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String currentStage;
	public String lastFormStep;
	public long jadscApplicationId;

}