/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.healthcare.application.form.service.model.HealthCareCurrentStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing HealthCareCurrentStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HealthCareCurrentStageCacheModel
	implements CacheModel<HealthCareCurrentStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof HealthCareCurrentStageCacheModel)) {
			return false;
		}

		HealthCareCurrentStageCacheModel healthCareCurrentStageCacheModel =
			(HealthCareCurrentStageCacheModel)object;

		if (HealthCareCurrentStageId ==
				healthCareCurrentStageCacheModel.HealthCareCurrentStageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, HealthCareCurrentStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{HealthCareCurrentStageId=");
		sb.append(HealthCareCurrentStageId);
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
		sb.append(", lastFormStage=");
		sb.append(lastFormStage);
		sb.append(", healthCareApplicationId=");
		sb.append(healthCareApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public HealthCareCurrentStage toEntityModel() {
		HealthCareCurrentStageImpl healthCareCurrentStageImpl =
			new HealthCareCurrentStageImpl();

		healthCareCurrentStageImpl.setHealthCareCurrentStageId(
			HealthCareCurrentStageId);
		healthCareCurrentStageImpl.setGroupId(groupId);
		healthCareCurrentStageImpl.setCompanyId(companyId);
		healthCareCurrentStageImpl.setUserId(userId);

		if (userName == null) {
			healthCareCurrentStageImpl.setUserName("");
		}
		else {
			healthCareCurrentStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			healthCareCurrentStageImpl.setCreateDate(null);
		}
		else {
			healthCareCurrentStageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			healthCareCurrentStageImpl.setModifiedDate(null);
		}
		else {
			healthCareCurrentStageImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (currentStage == null) {
			healthCareCurrentStageImpl.setCurrentStage("");
		}
		else {
			healthCareCurrentStageImpl.setCurrentStage(currentStage);
		}

		if (lastFormStage == null) {
			healthCareCurrentStageImpl.setLastFormStage("");
		}
		else {
			healthCareCurrentStageImpl.setLastFormStage(lastFormStage);
		}

		healthCareCurrentStageImpl.setHealthCareApplicationId(
			healthCareApplicationId);

		healthCareCurrentStageImpl.resetOriginalValues();

		return healthCareCurrentStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		HealthCareCurrentStageId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		currentStage = objectInput.readUTF();
		lastFormStage = objectInput.readUTF();

		healthCareApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(HealthCareCurrentStageId);

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

		if (lastFormStage == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastFormStage);
		}

		objectOutput.writeLong(healthCareApplicationId);
	}

	public long HealthCareCurrentStageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String currentStage;
	public String lastFormStage;
	public long healthCareApplicationId;

}