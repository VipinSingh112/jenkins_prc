/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.HsraApplicationCurrentStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing HsraApplicationCurrentStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HsraApplicationCurrentStageCacheModel
	implements CacheModel<HsraApplicationCurrentStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof HsraApplicationCurrentStageCacheModel)) {
			return false;
		}

		HsraApplicationCurrentStageCacheModel
			hsraApplicationCurrentStageCacheModel =
				(HsraApplicationCurrentStageCacheModel)object;

		if (hsraApplicationCurrentStageId ==
				hsraApplicationCurrentStageCacheModel.
					hsraApplicationCurrentStageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, hsraApplicationCurrentStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{hsraApplicationCurrentStageId=");
		sb.append(hsraApplicationCurrentStageId);
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
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public HsraApplicationCurrentStage toEntityModel() {
		HsraApplicationCurrentStageImpl hsraApplicationCurrentStageImpl =
			new HsraApplicationCurrentStageImpl();

		hsraApplicationCurrentStageImpl.setHsraApplicationCurrentStageId(
			hsraApplicationCurrentStageId);
		hsraApplicationCurrentStageImpl.setGroupId(groupId);
		hsraApplicationCurrentStageImpl.setCompanyId(companyId);
		hsraApplicationCurrentStageImpl.setUserId(userId);

		if (userName == null) {
			hsraApplicationCurrentStageImpl.setUserName("");
		}
		else {
			hsraApplicationCurrentStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			hsraApplicationCurrentStageImpl.setCreateDate(null);
		}
		else {
			hsraApplicationCurrentStageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			hsraApplicationCurrentStageImpl.setModifiedDate(null);
		}
		else {
			hsraApplicationCurrentStageImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (currentStage == null) {
			hsraApplicationCurrentStageImpl.setCurrentStage("");
		}
		else {
			hsraApplicationCurrentStageImpl.setCurrentStage(currentStage);
		}

		if (lastFormStep == null) {
			hsraApplicationCurrentStageImpl.setLastFormStep("");
		}
		else {
			hsraApplicationCurrentStageImpl.setLastFormStep(lastFormStep);
		}

		hsraApplicationCurrentStageImpl.setHsraApplicationId(hsraApplicationId);

		hsraApplicationCurrentStageImpl.resetOriginalValues();

		return hsraApplicationCurrentStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		hsraApplicationCurrentStageId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		currentStage = objectInput.readUTF();
		lastFormStep = objectInput.readUTF();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(hsraApplicationCurrentStageId);

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

		objectOutput.writeLong(hsraApplicationId);
	}

	public long hsraApplicationCurrentStageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String currentStage;
	public String lastFormStep;
	public long hsraApplicationId;

}