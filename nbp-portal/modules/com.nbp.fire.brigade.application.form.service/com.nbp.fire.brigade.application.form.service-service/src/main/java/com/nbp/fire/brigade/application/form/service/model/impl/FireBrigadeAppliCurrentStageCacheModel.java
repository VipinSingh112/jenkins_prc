/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.fire.brigade.application.form.service.model.FireBrigadeAppliCurrentStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FireBrigadeAppliCurrentStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FireBrigadeAppliCurrentStageCacheModel
	implements CacheModel<FireBrigadeAppliCurrentStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FireBrigadeAppliCurrentStageCacheModel)) {
			return false;
		}

		FireBrigadeAppliCurrentStageCacheModel
			fireBrigadeAppliCurrentStageCacheModel =
				(FireBrigadeAppliCurrentStageCacheModel)object;

		if (fireBrigadeAppliCurrentStageId ==
				fireBrigadeAppliCurrentStageCacheModel.
					fireBrigadeAppliCurrentStageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fireBrigadeAppliCurrentStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{fireBrigadeAppliCurrentStageId=");
		sb.append(fireBrigadeAppliCurrentStageId);
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
		sb.append(", fireBrigadeApplicationId=");
		sb.append(fireBrigadeApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FireBrigadeAppliCurrentStage toEntityModel() {
		FireBrigadeAppliCurrentStageImpl fireBrigadeAppliCurrentStageImpl =
			new FireBrigadeAppliCurrentStageImpl();

		fireBrigadeAppliCurrentStageImpl.setFireBrigadeAppliCurrentStageId(
			fireBrigadeAppliCurrentStageId);
		fireBrigadeAppliCurrentStageImpl.setGroupId(groupId);
		fireBrigadeAppliCurrentStageImpl.setCompanyId(companyId);
		fireBrigadeAppliCurrentStageImpl.setUserId(userId);

		if (userName == null) {
			fireBrigadeAppliCurrentStageImpl.setUserName("");
		}
		else {
			fireBrigadeAppliCurrentStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			fireBrigadeAppliCurrentStageImpl.setCreateDate(null);
		}
		else {
			fireBrigadeAppliCurrentStageImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			fireBrigadeAppliCurrentStageImpl.setModifiedDate(null);
		}
		else {
			fireBrigadeAppliCurrentStageImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (currentStage == null) {
			fireBrigadeAppliCurrentStageImpl.setCurrentStage("");
		}
		else {
			fireBrigadeAppliCurrentStageImpl.setCurrentStage(currentStage);
		}

		if (lastFormStep == null) {
			fireBrigadeAppliCurrentStageImpl.setLastFormStep("");
		}
		else {
			fireBrigadeAppliCurrentStageImpl.setLastFormStep(lastFormStep);
		}

		fireBrigadeAppliCurrentStageImpl.setFireBrigadeApplicationId(
			fireBrigadeApplicationId);

		fireBrigadeAppliCurrentStageImpl.resetOriginalValues();

		return fireBrigadeAppliCurrentStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fireBrigadeAppliCurrentStageId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		currentStage = objectInput.readUTF();
		lastFormStep = objectInput.readUTF();

		fireBrigadeApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(fireBrigadeAppliCurrentStageId);

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

		objectOutput.writeLong(fireBrigadeApplicationId);
	}

	public long fireBrigadeAppliCurrentStageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String currentStage;
	public String lastFormStep;
	public long fireBrigadeApplicationId;

}