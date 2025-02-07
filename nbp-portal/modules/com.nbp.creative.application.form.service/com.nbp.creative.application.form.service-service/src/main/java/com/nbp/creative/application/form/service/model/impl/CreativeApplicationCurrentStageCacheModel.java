/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.creative.application.form.service.model.CreativeApplicationCurrentStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CreativeApplicationCurrentStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CreativeApplicationCurrentStageCacheModel
	implements CacheModel<CreativeApplicationCurrentStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CreativeApplicationCurrentStageCacheModel)) {
			return false;
		}

		CreativeApplicationCurrentStageCacheModel
			creativeApplicationCurrentStageCacheModel =
				(CreativeApplicationCurrentStageCacheModel)object;

		if (creativeAppliCurrentStageId ==
				creativeApplicationCurrentStageCacheModel.
					creativeAppliCurrentStageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, creativeAppliCurrentStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{creativeAppliCurrentStageId=");
		sb.append(creativeAppliCurrentStageId);
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
		sb.append(", CreativeApplicationId=");
		sb.append(CreativeApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CreativeApplicationCurrentStage toEntityModel() {
		CreativeApplicationCurrentStageImpl
			creativeApplicationCurrentStageImpl =
				new CreativeApplicationCurrentStageImpl();

		creativeApplicationCurrentStageImpl.setCreativeAppliCurrentStageId(
			creativeAppliCurrentStageId);
		creativeApplicationCurrentStageImpl.setGroupId(groupId);
		creativeApplicationCurrentStageImpl.setCompanyId(companyId);
		creativeApplicationCurrentStageImpl.setUserId(userId);

		if (userName == null) {
			creativeApplicationCurrentStageImpl.setUserName("");
		}
		else {
			creativeApplicationCurrentStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			creativeApplicationCurrentStageImpl.setCreateDate(null);
		}
		else {
			creativeApplicationCurrentStageImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			creativeApplicationCurrentStageImpl.setModifiedDate(null);
		}
		else {
			creativeApplicationCurrentStageImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (currentStage == null) {
			creativeApplicationCurrentStageImpl.setCurrentStage("");
		}
		else {
			creativeApplicationCurrentStageImpl.setCurrentStage(currentStage);
		}

		if (lastFormStep == null) {
			creativeApplicationCurrentStageImpl.setLastFormStep("");
		}
		else {
			creativeApplicationCurrentStageImpl.setLastFormStep(lastFormStep);
		}

		creativeApplicationCurrentStageImpl.setCreativeApplicationId(
			CreativeApplicationId);

		creativeApplicationCurrentStageImpl.resetOriginalValues();

		return creativeApplicationCurrentStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		creativeAppliCurrentStageId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		currentStage = objectInput.readUTF();
		lastFormStep = objectInput.readUTF();

		CreativeApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(creativeAppliCurrentStageId);

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

		objectOutput.writeLong(CreativeApplicationId);
	}

	public long creativeAppliCurrentStageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String currentStage;
	public String lastFormStep;
	public long CreativeApplicationId;

}