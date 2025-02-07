/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.farm.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.farm.application.form.service.model.FarmerCurrentStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FarmerCurrentStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FarmerCurrentStageCacheModel
	implements CacheModel<FarmerCurrentStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FarmerCurrentStageCacheModel)) {
			return false;
		}

		FarmerCurrentStageCacheModel farmerCurrentStageCacheModel =
			(FarmerCurrentStageCacheModel)object;

		if (farmerCurrentStageId ==
				farmerCurrentStageCacheModel.farmerCurrentStageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, farmerCurrentStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{farmerCurrentStageId=");
		sb.append(farmerCurrentStageId);
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
		sb.append(", farmerApplicationId=");
		sb.append(farmerApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FarmerCurrentStage toEntityModel() {
		FarmerCurrentStageImpl farmerCurrentStageImpl =
			new FarmerCurrentStageImpl();

		farmerCurrentStageImpl.setFarmerCurrentStageId(farmerCurrentStageId);
		farmerCurrentStageImpl.setGroupId(groupId);
		farmerCurrentStageImpl.setCompanyId(companyId);
		farmerCurrentStageImpl.setUserId(userId);

		if (userName == null) {
			farmerCurrentStageImpl.setUserName("");
		}
		else {
			farmerCurrentStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			farmerCurrentStageImpl.setCreateDate(null);
		}
		else {
			farmerCurrentStageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			farmerCurrentStageImpl.setModifiedDate(null);
		}
		else {
			farmerCurrentStageImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (currentStage == null) {
			farmerCurrentStageImpl.setCurrentStage("");
		}
		else {
			farmerCurrentStageImpl.setCurrentStage(currentStage);
		}

		if (lastFormStage == null) {
			farmerCurrentStageImpl.setLastFormStage("");
		}
		else {
			farmerCurrentStageImpl.setLastFormStage(lastFormStage);
		}

		farmerCurrentStageImpl.setFarmerApplicationId(farmerApplicationId);

		farmerCurrentStageImpl.resetOriginalValues();

		return farmerCurrentStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		farmerCurrentStageId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		currentStage = objectInput.readUTF();
		lastFormStage = objectInput.readUTF();

		farmerApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(farmerCurrentStageId);

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

		objectOutput.writeLong(farmerApplicationId);
	}

	public long farmerCurrentStageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String currentStage;
	public String lastFormStage;
	public long farmerApplicationId;

}