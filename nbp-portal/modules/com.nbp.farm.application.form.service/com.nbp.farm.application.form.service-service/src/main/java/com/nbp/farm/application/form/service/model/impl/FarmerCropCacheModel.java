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

import com.nbp.farm.application.form.service.model.FarmerCrop;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FarmerCrop in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FarmerCropCacheModel
	implements CacheModel<FarmerCrop>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FarmerCropCacheModel)) {
			return false;
		}

		FarmerCropCacheModel farmerCropCacheModel =
			(FarmerCropCacheModel)object;

		if (farmerCropId == farmerCropCacheModel.farmerCropId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, farmerCropId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{farmerCropId=");
		sb.append(farmerCropId);
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
		sb.append(", cropAndVariety=");
		sb.append(cropAndVariety);
		sb.append(", area=");
		sb.append(area);
		sb.append(", unit=");
		sb.append(unit);
		sb.append(", cropContent=");
		sb.append(cropContent);
		sb.append(", plantingDate=");
		sb.append(plantingDate);
		sb.append(", majorMarket=");
		sb.append(majorMarket);
		sb.append(", majorMarketPercentSold=");
		sb.append(majorMarketPercentSold);
		sb.append(", minorMarket=");
		sb.append(minorMarket);
		sb.append(", minorMarketPercentSold=");
		sb.append(minorMarketPercentSold);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", propertyId02=");
		sb.append(propertyId02);
		sb.append(", propertyId03=");
		sb.append(propertyId03);
		sb.append(", cropCounter=");
		sb.append(cropCounter);
		sb.append(", farmerApplicationId=");
		sb.append(farmerApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FarmerCrop toEntityModel() {
		FarmerCropImpl farmerCropImpl = new FarmerCropImpl();

		farmerCropImpl.setFarmerCropId(farmerCropId);
		farmerCropImpl.setGroupId(groupId);
		farmerCropImpl.setCompanyId(companyId);
		farmerCropImpl.setUserId(userId);

		if (userName == null) {
			farmerCropImpl.setUserName("");
		}
		else {
			farmerCropImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			farmerCropImpl.setCreateDate(null);
		}
		else {
			farmerCropImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			farmerCropImpl.setModifiedDate(null);
		}
		else {
			farmerCropImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (cropAndVariety == null) {
			farmerCropImpl.setCropAndVariety("");
		}
		else {
			farmerCropImpl.setCropAndVariety(cropAndVariety);
		}

		if (area == null) {
			farmerCropImpl.setArea("");
		}
		else {
			farmerCropImpl.setArea(area);
		}

		if (unit == null) {
			farmerCropImpl.setUnit("");
		}
		else {
			farmerCropImpl.setUnit(unit);
		}

		if (cropContent == null) {
			farmerCropImpl.setCropContent("");
		}
		else {
			farmerCropImpl.setCropContent(cropContent);
		}

		if (plantingDate == Long.MIN_VALUE) {
			farmerCropImpl.setPlantingDate(null);
		}
		else {
			farmerCropImpl.setPlantingDate(new Date(plantingDate));
		}

		if (majorMarket == null) {
			farmerCropImpl.setMajorMarket("");
		}
		else {
			farmerCropImpl.setMajorMarket(majorMarket);
		}

		if (majorMarketPercentSold == null) {
			farmerCropImpl.setMajorMarketPercentSold("");
		}
		else {
			farmerCropImpl.setMajorMarketPercentSold(majorMarketPercentSold);
		}

		if (minorMarket == null) {
			farmerCropImpl.setMinorMarket("");
		}
		else {
			farmerCropImpl.setMinorMarket(minorMarket);
		}

		if (minorMarketPercentSold == null) {
			farmerCropImpl.setMinorMarketPercentSold("");
		}
		else {
			farmerCropImpl.setMinorMarketPercentSold(minorMarketPercentSold);
		}

		if (remarks == null) {
			farmerCropImpl.setRemarks("");
		}
		else {
			farmerCropImpl.setRemarks(remarks);
		}

		if (propertyId02 == null) {
			farmerCropImpl.setPropertyId02("");
		}
		else {
			farmerCropImpl.setPropertyId02(propertyId02);
		}

		if (propertyId03 == null) {
			farmerCropImpl.setPropertyId03("");
		}
		else {
			farmerCropImpl.setPropertyId03(propertyId03);
		}

		if (cropCounter == null) {
			farmerCropImpl.setCropCounter("");
		}
		else {
			farmerCropImpl.setCropCounter(cropCounter);
		}

		farmerCropImpl.setFarmerApplicationId(farmerApplicationId);

		farmerCropImpl.resetOriginalValues();

		return farmerCropImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		farmerCropId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		cropAndVariety = objectInput.readUTF();
		area = objectInput.readUTF();
		unit = objectInput.readUTF();
		cropContent = objectInput.readUTF();
		plantingDate = objectInput.readLong();
		majorMarket = objectInput.readUTF();
		majorMarketPercentSold = objectInput.readUTF();
		minorMarket = objectInput.readUTF();
		minorMarketPercentSold = objectInput.readUTF();
		remarks = objectInput.readUTF();
		propertyId02 = objectInput.readUTF();
		propertyId03 = objectInput.readUTF();
		cropCounter = objectInput.readUTF();

		farmerApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(farmerCropId);

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

		if (cropAndVariety == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cropAndVariety);
		}

		if (area == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(area);
		}

		if (unit == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(unit);
		}

		if (cropContent == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cropContent);
		}

		objectOutput.writeLong(plantingDate);

		if (majorMarket == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(majorMarket);
		}

		if (majorMarketPercentSold == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(majorMarketPercentSold);
		}

		if (minorMarket == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(minorMarket);
		}

		if (minorMarketPercentSold == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(minorMarketPercentSold);
		}

		if (remarks == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		if (propertyId02 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propertyId02);
		}

		if (propertyId03 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propertyId03);
		}

		if (cropCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cropCounter);
		}

		objectOutput.writeLong(farmerApplicationId);
	}

	public long farmerCropId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String cropAndVariety;
	public String area;
	public String unit;
	public String cropContent;
	public long plantingDate;
	public String majorMarket;
	public String majorMarketPercentSold;
	public String minorMarket;
	public String minorMarketPercentSold;
	public String remarks;
	public String propertyId02;
	public String propertyId03;
	public String cropCounter;
	public long farmerApplicationId;

}