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

import com.nbp.farm.application.form.service.model.FarmerCropPractice;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FarmerCropPractice in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FarmerCropPracticeCacheModel
	implements CacheModel<FarmerCropPractice>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FarmerCropPracticeCacheModel)) {
			return false;
		}

		FarmerCropPracticeCacheModel farmerCropPracticeCacheModel =
			(FarmerCropPracticeCacheModel)object;

		if (farmerCropPracticeId ==
				farmerCropPracticeCacheModel.farmerCropPracticeId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, farmerCropPracticeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{farmerCropPracticeId=");
		sb.append(farmerCropPracticeId);
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
		sb.append(", crop1landPrepration=");
		sb.append(crop1landPrepration);
		sb.append(", crop1CropCare=");
		sb.append(crop1CropCare);
		sb.append(", crop1water=");
		sb.append(crop1water);
		sb.append(", crop1postHarvest=");
		sb.append(crop1postHarvest);
		sb.append(", crop02=");
		sb.append(crop02);
		sb.append(", crop03=");
		sb.append(crop03);
		sb.append(", cropPracticeCounter=");
		sb.append(cropPracticeCounter);
		sb.append(", farmerApplicationId=");
		sb.append(farmerApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FarmerCropPractice toEntityModel() {
		FarmerCropPracticeImpl farmerCropPracticeImpl =
			new FarmerCropPracticeImpl();

		farmerCropPracticeImpl.setFarmerCropPracticeId(farmerCropPracticeId);
		farmerCropPracticeImpl.setGroupId(groupId);
		farmerCropPracticeImpl.setCompanyId(companyId);
		farmerCropPracticeImpl.setUserId(userId);

		if (userName == null) {
			farmerCropPracticeImpl.setUserName("");
		}
		else {
			farmerCropPracticeImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			farmerCropPracticeImpl.setCreateDate(null);
		}
		else {
			farmerCropPracticeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			farmerCropPracticeImpl.setModifiedDate(null);
		}
		else {
			farmerCropPracticeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (crop1landPrepration == null) {
			farmerCropPracticeImpl.setCrop1landPrepration("");
		}
		else {
			farmerCropPracticeImpl.setCrop1landPrepration(crop1landPrepration);
		}

		if (crop1CropCare == null) {
			farmerCropPracticeImpl.setCrop1CropCare("");
		}
		else {
			farmerCropPracticeImpl.setCrop1CropCare(crop1CropCare);
		}

		if (crop1water == null) {
			farmerCropPracticeImpl.setCrop1water("");
		}
		else {
			farmerCropPracticeImpl.setCrop1water(crop1water);
		}

		if (crop1postHarvest == null) {
			farmerCropPracticeImpl.setCrop1postHarvest("");
		}
		else {
			farmerCropPracticeImpl.setCrop1postHarvest(crop1postHarvest);
		}

		if (crop02 == null) {
			farmerCropPracticeImpl.setCrop02("");
		}
		else {
			farmerCropPracticeImpl.setCrop02(crop02);
		}

		if (crop03 == null) {
			farmerCropPracticeImpl.setCrop03("");
		}
		else {
			farmerCropPracticeImpl.setCrop03(crop03);
		}

		if (cropPracticeCounter == null) {
			farmerCropPracticeImpl.setCropPracticeCounter("");
		}
		else {
			farmerCropPracticeImpl.setCropPracticeCounter(cropPracticeCounter);
		}

		farmerCropPracticeImpl.setFarmerApplicationId(farmerApplicationId);

		farmerCropPracticeImpl.resetOriginalValues();

		return farmerCropPracticeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		farmerCropPracticeId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		crop1landPrepration = objectInput.readUTF();
		crop1CropCare = objectInput.readUTF();
		crop1water = objectInput.readUTF();
		crop1postHarvest = objectInput.readUTF();
		crop02 = objectInput.readUTF();
		crop03 = objectInput.readUTF();
		cropPracticeCounter = objectInput.readUTF();

		farmerApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(farmerCropPracticeId);

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

		if (crop1landPrepration == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(crop1landPrepration);
		}

		if (crop1CropCare == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(crop1CropCare);
		}

		if (crop1water == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(crop1water);
		}

		if (crop1postHarvest == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(crop1postHarvest);
		}

		if (crop02 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(crop02);
		}

		if (crop03 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(crop03);
		}

		if (cropPracticeCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cropPracticeCounter);
		}

		objectOutput.writeLong(farmerApplicationId);
	}

	public long farmerCropPracticeId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String crop1landPrepration;
	public String crop1CropCare;
	public String crop1water;
	public String crop1postHarvest;
	public String crop02;
	public String crop03;
	public String cropPracticeCounter;
	public long farmerApplicationId;

}