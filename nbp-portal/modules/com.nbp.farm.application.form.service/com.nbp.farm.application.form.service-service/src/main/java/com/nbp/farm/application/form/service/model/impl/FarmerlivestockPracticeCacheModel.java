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

import com.nbp.farm.application.form.service.model.FarmerlivestockPractice;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FarmerlivestockPractice in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FarmerlivestockPracticeCacheModel
	implements CacheModel<FarmerlivestockPractice>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FarmerlivestockPracticeCacheModel)) {
			return false;
		}

		FarmerlivestockPracticeCacheModel farmerlivestockPracticeCacheModel =
			(FarmerlivestockPracticeCacheModel)object;

		if (farmerLivestockPracticeId ==
				farmerlivestockPracticeCacheModel.farmerLivestockPracticeId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, farmerLivestockPracticeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{farmerLivestockPracticeId=");
		sb.append(farmerLivestockPracticeId);
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
		sb.append(", husbandry=");
		sb.append(husbandry);
		sb.append(", liveStockCare=");
		sb.append(liveStockCare);
		sb.append(", nutrient=");
		sb.append(nutrient);
		sb.append(", water=");
		sb.append(water);
		sb.append(", postHarvest=");
		sb.append(postHarvest);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", livestockPracticeCounter=");
		sb.append(livestockPracticeCounter);
		sb.append(", farmerApplicationId=");
		sb.append(farmerApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FarmerlivestockPractice toEntityModel() {
		FarmerlivestockPracticeImpl farmerlivestockPracticeImpl =
			new FarmerlivestockPracticeImpl();

		farmerlivestockPracticeImpl.setFarmerLivestockPracticeId(
			farmerLivestockPracticeId);
		farmerlivestockPracticeImpl.setGroupId(groupId);
		farmerlivestockPracticeImpl.setCompanyId(companyId);
		farmerlivestockPracticeImpl.setUserId(userId);

		if (userName == null) {
			farmerlivestockPracticeImpl.setUserName("");
		}
		else {
			farmerlivestockPracticeImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			farmerlivestockPracticeImpl.setCreateDate(null);
		}
		else {
			farmerlivestockPracticeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			farmerlivestockPracticeImpl.setModifiedDate(null);
		}
		else {
			farmerlivestockPracticeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (husbandry == null) {
			farmerlivestockPracticeImpl.setHusbandry("");
		}
		else {
			farmerlivestockPracticeImpl.setHusbandry(husbandry);
		}

		if (liveStockCare == null) {
			farmerlivestockPracticeImpl.setLiveStockCare("");
		}
		else {
			farmerlivestockPracticeImpl.setLiveStockCare(liveStockCare);
		}

		if (nutrient == null) {
			farmerlivestockPracticeImpl.setNutrient("");
		}
		else {
			farmerlivestockPracticeImpl.setNutrient(nutrient);
		}

		if (water == null) {
			farmerlivestockPracticeImpl.setWater("");
		}
		else {
			farmerlivestockPracticeImpl.setWater(water);
		}

		if (postHarvest == null) {
			farmerlivestockPracticeImpl.setPostHarvest("");
		}
		else {
			farmerlivestockPracticeImpl.setPostHarvest(postHarvest);
		}

		if (remarks == null) {
			farmerlivestockPracticeImpl.setRemarks("");
		}
		else {
			farmerlivestockPracticeImpl.setRemarks(remarks);
		}

		if (livestockPracticeCounter == null) {
			farmerlivestockPracticeImpl.setLivestockPracticeCounter("");
		}
		else {
			farmerlivestockPracticeImpl.setLivestockPracticeCounter(
				livestockPracticeCounter);
		}

		farmerlivestockPracticeImpl.setFarmerApplicationId(farmerApplicationId);

		farmerlivestockPracticeImpl.resetOriginalValues();

		return farmerlivestockPracticeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		farmerLivestockPracticeId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		husbandry = objectInput.readUTF();
		liveStockCare = objectInput.readUTF();
		nutrient = objectInput.readUTF();
		water = objectInput.readUTF();
		postHarvest = objectInput.readUTF();
		remarks = objectInput.readUTF();
		livestockPracticeCounter = objectInput.readUTF();

		farmerApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(farmerLivestockPracticeId);

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

		if (husbandry == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(husbandry);
		}

		if (liveStockCare == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(liveStockCare);
		}

		if (nutrient == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nutrient);
		}

		if (water == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(water);
		}

		if (postHarvest == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(postHarvest);
		}

		if (remarks == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		if (livestockPracticeCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(livestockPracticeCounter);
		}

		objectOutput.writeLong(farmerApplicationId);
	}

	public long farmerLivestockPracticeId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String husbandry;
	public String liveStockCare;
	public String nutrient;
	public String water;
	public String postHarvest;
	public String remarks;
	public String livestockPracticeCounter;
	public long farmerApplicationId;

}