/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncra.application.form.service.model.NcraCurrentStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcraCurrentStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcraCurrentStageCacheModel
	implements CacheModel<NcraCurrentStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcraCurrentStageCacheModel)) {
			return false;
		}

		NcraCurrentStageCacheModel ncraCurrentStageCacheModel =
			(NcraCurrentStageCacheModel)object;

		if (ncraCurrentStageId ==
				ncraCurrentStageCacheModel.ncraCurrentStageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncraCurrentStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{ncraCurrentStageId=");
		sb.append(ncraCurrentStageId);
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
		sb.append(", lastFormStepDetails=");
		sb.append(lastFormStepDetails);
		sb.append(", ncraApplicationId=");
		sb.append(ncraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcraCurrentStage toEntityModel() {
		NcraCurrentStageImpl ncraCurrentStageImpl = new NcraCurrentStageImpl();

		ncraCurrentStageImpl.setNcraCurrentStageId(ncraCurrentStageId);
		ncraCurrentStageImpl.setGroupId(groupId);
		ncraCurrentStageImpl.setCompanyId(companyId);
		ncraCurrentStageImpl.setUserId(userId);

		if (userName == null) {
			ncraCurrentStageImpl.setUserName("");
		}
		else {
			ncraCurrentStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncraCurrentStageImpl.setCreateDate(null);
		}
		else {
			ncraCurrentStageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncraCurrentStageImpl.setModifiedDate(null);
		}
		else {
			ncraCurrentStageImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (currentStage == null) {
			ncraCurrentStageImpl.setCurrentStage("");
		}
		else {
			ncraCurrentStageImpl.setCurrentStage(currentStage);
		}

		if (lastFormStepDetails == null) {
			ncraCurrentStageImpl.setLastFormStepDetails("");
		}
		else {
			ncraCurrentStageImpl.setLastFormStepDetails(lastFormStepDetails);
		}

		ncraCurrentStageImpl.setNcraApplicationId(ncraApplicationId);

		ncraCurrentStageImpl.resetOriginalValues();

		return ncraCurrentStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncraCurrentStageId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		currentStage = objectInput.readUTF();
		lastFormStepDetails = objectInput.readUTF();

		ncraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ncraCurrentStageId);

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

		if (lastFormStepDetails == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastFormStepDetails);
		}

		objectOutput.writeLong(ncraApplicationId);
	}

	public long ncraCurrentStageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String currentStage;
	public String lastFormStepDetails;
	public long ncraApplicationId;

}