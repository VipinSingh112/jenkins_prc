/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.manufacturing.application.form.service.model.ManuApplicationCurrentStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ManuApplicationCurrentStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ManuApplicationCurrentStageCacheModel
	implements CacheModel<ManuApplicationCurrentStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ManuApplicationCurrentStageCacheModel)) {
			return false;
		}

		ManuApplicationCurrentStageCacheModel
			manuApplicationCurrentStageCacheModel =
				(ManuApplicationCurrentStageCacheModel)object;

		if (manuApplicationCuurentStageId ==
				manuApplicationCurrentStageCacheModel.
					manuApplicationCuurentStageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, manuApplicationCuurentStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{manuApplicationCuurentStageId=");
		sb.append(manuApplicationCuurentStageId);
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
		sb.append(", lastFormDetailsStep=");
		sb.append(lastFormDetailsStep);
		sb.append(", manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ManuApplicationCurrentStage toEntityModel() {
		ManuApplicationCurrentStageImpl manuApplicationCurrentStageImpl =
			new ManuApplicationCurrentStageImpl();

		manuApplicationCurrentStageImpl.setManuApplicationCuurentStageId(
			manuApplicationCuurentStageId);
		manuApplicationCurrentStageImpl.setGroupId(groupId);
		manuApplicationCurrentStageImpl.setCompanyId(companyId);
		manuApplicationCurrentStageImpl.setUserId(userId);

		if (userName == null) {
			manuApplicationCurrentStageImpl.setUserName("");
		}
		else {
			manuApplicationCurrentStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			manuApplicationCurrentStageImpl.setCreateDate(null);
		}
		else {
			manuApplicationCurrentStageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			manuApplicationCurrentStageImpl.setModifiedDate(null);
		}
		else {
			manuApplicationCurrentStageImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (currentStage == null) {
			manuApplicationCurrentStageImpl.setCurrentStage("");
		}
		else {
			manuApplicationCurrentStageImpl.setCurrentStage(currentStage);
		}

		if (lastFormDetailsStep == null) {
			manuApplicationCurrentStageImpl.setLastFormDetailsStep("");
		}
		else {
			manuApplicationCurrentStageImpl.setLastFormDetailsStep(
				lastFormDetailsStep);
		}

		manuApplicationCurrentStageImpl.setManufacturingApplicationId(
			manufacturingApplicationId);

		manuApplicationCurrentStageImpl.resetOriginalValues();

		return manuApplicationCurrentStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		manuApplicationCuurentStageId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		currentStage = objectInput.readUTF();
		lastFormDetailsStep = objectInput.readUTF();

		manufacturingApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(manuApplicationCuurentStageId);

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

		if (lastFormDetailsStep == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastFormDetailsStep);
		}

		objectOutput.writeLong(manufacturingApplicationId);
	}

	public long manuApplicationCuurentStageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String currentStage;
	public String lastFormDetailsStep;
	public long manufacturingApplicationId;

}