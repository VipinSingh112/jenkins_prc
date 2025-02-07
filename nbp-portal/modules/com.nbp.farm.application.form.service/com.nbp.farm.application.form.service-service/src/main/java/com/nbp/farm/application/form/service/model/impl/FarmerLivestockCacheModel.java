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

import com.nbp.farm.application.form.service.model.FarmerLivestock;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FarmerLivestock in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FarmerLivestockCacheModel
	implements CacheModel<FarmerLivestock>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FarmerLivestockCacheModel)) {
			return false;
		}

		FarmerLivestockCacheModel farmerLivestockCacheModel =
			(FarmerLivestockCacheModel)object;

		if (farmerLiveStockId == farmerLivestockCacheModel.farmerLiveStockId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, farmerLiveStockId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{farmerLiveStockId=");
		sb.append(farmerLiveStockId);
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
		sb.append(", livestockBreed=");
		sb.append(livestockBreed);
		sb.append(", stageOflife=");
		sb.append(stageOflife);
		sb.append(", count=");
		sb.append(count);
		sb.append(", colonies=");
		sb.append(colonies);
		sb.append(", capacity=");
		sb.append(capacity);
		sb.append(", majorMarket=");
		sb.append(majorMarket);
		sb.append(", majorMarketSold=");
		sb.append(majorMarketSold);
		sb.append(", minorMarket=");
		sb.append(minorMarket);
		sb.append(", minorMarketSold=");
		sb.append(minorMarketSold);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", livestockCounter=");
		sb.append(livestockCounter);
		sb.append(", farmerApplicationId=");
		sb.append(farmerApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FarmerLivestock toEntityModel() {
		FarmerLivestockImpl farmerLivestockImpl = new FarmerLivestockImpl();

		farmerLivestockImpl.setFarmerLiveStockId(farmerLiveStockId);
		farmerLivestockImpl.setGroupId(groupId);
		farmerLivestockImpl.setCompanyId(companyId);
		farmerLivestockImpl.setUserId(userId);

		if (userName == null) {
			farmerLivestockImpl.setUserName("");
		}
		else {
			farmerLivestockImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			farmerLivestockImpl.setCreateDate(null);
		}
		else {
			farmerLivestockImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			farmerLivestockImpl.setModifiedDate(null);
		}
		else {
			farmerLivestockImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (livestockBreed == null) {
			farmerLivestockImpl.setLivestockBreed("");
		}
		else {
			farmerLivestockImpl.setLivestockBreed(livestockBreed);
		}

		if (stageOflife == null) {
			farmerLivestockImpl.setStageOflife("");
		}
		else {
			farmerLivestockImpl.setStageOflife(stageOflife);
		}

		if (count == null) {
			farmerLivestockImpl.setCount("");
		}
		else {
			farmerLivestockImpl.setCount(count);
		}

		if (colonies == null) {
			farmerLivestockImpl.setColonies("");
		}
		else {
			farmerLivestockImpl.setColonies(colonies);
		}

		if (capacity == null) {
			farmerLivestockImpl.setCapacity("");
		}
		else {
			farmerLivestockImpl.setCapacity(capacity);
		}

		if (majorMarket == null) {
			farmerLivestockImpl.setMajorMarket("");
		}
		else {
			farmerLivestockImpl.setMajorMarket(majorMarket);
		}

		if (majorMarketSold == null) {
			farmerLivestockImpl.setMajorMarketSold("");
		}
		else {
			farmerLivestockImpl.setMajorMarketSold(majorMarketSold);
		}

		if (minorMarket == null) {
			farmerLivestockImpl.setMinorMarket("");
		}
		else {
			farmerLivestockImpl.setMinorMarket(minorMarket);
		}

		if (minorMarketSold == null) {
			farmerLivestockImpl.setMinorMarketSold("");
		}
		else {
			farmerLivestockImpl.setMinorMarketSold(minorMarketSold);
		}

		if (remarks == null) {
			farmerLivestockImpl.setRemarks("");
		}
		else {
			farmerLivestockImpl.setRemarks(remarks);
		}

		if (livestockCounter == null) {
			farmerLivestockImpl.setLivestockCounter("");
		}
		else {
			farmerLivestockImpl.setLivestockCounter(livestockCounter);
		}

		farmerLivestockImpl.setFarmerApplicationId(farmerApplicationId);

		farmerLivestockImpl.resetOriginalValues();

		return farmerLivestockImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		farmerLiveStockId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		livestockBreed = objectInput.readUTF();
		stageOflife = objectInput.readUTF();
		count = objectInput.readUTF();
		colonies = objectInput.readUTF();
		capacity = objectInput.readUTF();
		majorMarket = objectInput.readUTF();
		majorMarketSold = objectInput.readUTF();
		minorMarket = objectInput.readUTF();
		minorMarketSold = objectInput.readUTF();
		remarks = objectInput.readUTF();
		livestockCounter = objectInput.readUTF();

		farmerApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(farmerLiveStockId);

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

		if (livestockBreed == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(livestockBreed);
		}

		if (stageOflife == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(stageOflife);
		}

		if (count == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(count);
		}

		if (colonies == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(colonies);
		}

		if (capacity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(capacity);
		}

		if (majorMarket == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(majorMarket);
		}

		if (majorMarketSold == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(majorMarketSold);
		}

		if (minorMarket == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(minorMarket);
		}

		if (minorMarketSold == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(minorMarketSold);
		}

		if (remarks == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		if (livestockCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(livestockCounter);
		}

		objectOutput.writeLong(farmerApplicationId);
	}

	public long farmerLiveStockId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String livestockBreed;
	public String stageOflife;
	public String count;
	public String colonies;
	public String capacity;
	public String majorMarket;
	public String majorMarketSold;
	public String minorMarket;
	public String minorMarketSold;
	public String remarks;
	public String livestockCounter;
	public long farmerApplicationId;

}