/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.factories.registration.application.form.services.model.FactoriesRegstCurrentStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FactoriesRegstCurrentStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FactoriesRegstCurrentStageCacheModel
	implements CacheModel<FactoriesRegstCurrentStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FactoriesRegstCurrentStageCacheModel)) {
			return false;
		}

		FactoriesRegstCurrentStageCacheModel
			factoriesRegstCurrentStageCacheModel =
				(FactoriesRegstCurrentStageCacheModel)object;

		if (factoriesCurrentStageId ==
				factoriesRegstCurrentStageCacheModel.factoriesCurrentStageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, factoriesCurrentStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", factoriesCurrentStageId=");
		sb.append(factoriesCurrentStageId);
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
		sb.append(", factoriesApplicationId=");
		sb.append(factoriesApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FactoriesRegstCurrentStage toEntityModel() {
		FactoriesRegstCurrentStageImpl factoriesRegstCurrentStageImpl =
			new FactoriesRegstCurrentStageImpl();

		if (uuid == null) {
			factoriesRegstCurrentStageImpl.setUuid("");
		}
		else {
			factoriesRegstCurrentStageImpl.setUuid(uuid);
		}

		factoriesRegstCurrentStageImpl.setFactoriesCurrentStageId(
			factoriesCurrentStageId);
		factoriesRegstCurrentStageImpl.setGroupId(groupId);
		factoriesRegstCurrentStageImpl.setCompanyId(companyId);
		factoriesRegstCurrentStageImpl.setUserId(userId);

		if (userName == null) {
			factoriesRegstCurrentStageImpl.setUserName("");
		}
		else {
			factoriesRegstCurrentStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			factoriesRegstCurrentStageImpl.setCreateDate(null);
		}
		else {
			factoriesRegstCurrentStageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			factoriesRegstCurrentStageImpl.setModifiedDate(null);
		}
		else {
			factoriesRegstCurrentStageImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (currentStage == null) {
			factoriesRegstCurrentStageImpl.setCurrentStage("");
		}
		else {
			factoriesRegstCurrentStageImpl.setCurrentStage(currentStage);
		}

		if (lastFormStep == null) {
			factoriesRegstCurrentStageImpl.setLastFormStep("");
		}
		else {
			factoriesRegstCurrentStageImpl.setLastFormStep(lastFormStep);
		}

		factoriesRegstCurrentStageImpl.setFactoriesApplicationId(
			factoriesApplicationId);

		factoriesRegstCurrentStageImpl.resetOriginalValues();

		return factoriesRegstCurrentStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		factoriesCurrentStageId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		currentStage = objectInput.readUTF();
		lastFormStep = objectInput.readUTF();

		factoriesApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(factoriesCurrentStageId);

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

		objectOutput.writeLong(factoriesApplicationId);
	}

	public String uuid;
	public long factoriesCurrentStageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String currentStage;
	public String lastFormStep;
	public long factoriesApplicationId;

}