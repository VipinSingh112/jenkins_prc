/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.model.impl;

import com.agriculture.application.form.service.model.AgricultureFarm;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AgricultureFarm in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AgricultureFarmCacheModel
	implements CacheModel<AgricultureFarm>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AgricultureFarmCacheModel)) {
			return false;
		}

		AgricultureFarmCacheModel agricultureFarmCacheModel =
			(AgricultureFarmCacheModel)object;

		if (agricultureFarmId == agricultureFarmCacheModel.agricultureFarmId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, agricultureFarmId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{agricultureFarmId=");
		sb.append(agricultureFarmId);
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
		sb.append(", locationOfFarm=");
		sb.append(locationOfFarm);
		sb.append(", landTenure=");
		sb.append(landTenure);
		sb.append(", numberOfHectares=");
		sb.append(numberOfHectares);
		sb.append(", numberOfYears=");
		sb.append(numberOfYears);
		sb.append(", numberOfParcels=");
		sb.append(numberOfParcels);
		sb.append(", sizeOfParcel=");
		sb.append(sizeOfParcel);
		sb.append(", topography=");
		sb.append(topography);
		sb.append(", numberOF=");
		sb.append(numberOF);
		sb.append(", farmCounter=");
		sb.append(farmCounter);
		sb.append(", agricultureApplicationId=");
		sb.append(agricultureApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AgricultureFarm toEntityModel() {
		AgricultureFarmImpl agricultureFarmImpl = new AgricultureFarmImpl();

		agricultureFarmImpl.setAgricultureFarmId(agricultureFarmId);
		agricultureFarmImpl.setGroupId(groupId);
		agricultureFarmImpl.setCompanyId(companyId);
		agricultureFarmImpl.setUserId(userId);

		if (userName == null) {
			agricultureFarmImpl.setUserName("");
		}
		else {
			agricultureFarmImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			agricultureFarmImpl.setCreateDate(null);
		}
		else {
			agricultureFarmImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			agricultureFarmImpl.setModifiedDate(null);
		}
		else {
			agricultureFarmImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (locationOfFarm == null) {
			agricultureFarmImpl.setLocationOfFarm("");
		}
		else {
			agricultureFarmImpl.setLocationOfFarm(locationOfFarm);
		}

		if (landTenure == null) {
			agricultureFarmImpl.setLandTenure("");
		}
		else {
			agricultureFarmImpl.setLandTenure(landTenure);
		}

		if (numberOfHectares == null) {
			agricultureFarmImpl.setNumberOfHectares("");
		}
		else {
			agricultureFarmImpl.setNumberOfHectares(numberOfHectares);
		}

		if (numberOfYears == null) {
			agricultureFarmImpl.setNumberOfYears("");
		}
		else {
			agricultureFarmImpl.setNumberOfYears(numberOfYears);
		}

		if (numberOfParcels == null) {
			agricultureFarmImpl.setNumberOfParcels("");
		}
		else {
			agricultureFarmImpl.setNumberOfParcels(numberOfParcels);
		}

		if (sizeOfParcel == null) {
			agricultureFarmImpl.setSizeOfParcel("");
		}
		else {
			agricultureFarmImpl.setSizeOfParcel(sizeOfParcel);
		}

		if (topography == null) {
			agricultureFarmImpl.setTopography("");
		}
		else {
			agricultureFarmImpl.setTopography(topography);
		}

		if (numberOF == null) {
			agricultureFarmImpl.setNumberOF("");
		}
		else {
			agricultureFarmImpl.setNumberOF(numberOF);
		}

		if (farmCounter == null) {
			agricultureFarmImpl.setFarmCounter("");
		}
		else {
			agricultureFarmImpl.setFarmCounter(farmCounter);
		}

		agricultureFarmImpl.setAgricultureApplicationId(
			agricultureApplicationId);

		agricultureFarmImpl.resetOriginalValues();

		return agricultureFarmImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		agricultureFarmId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		locationOfFarm = objectInput.readUTF();
		landTenure = objectInput.readUTF();
		numberOfHectares = objectInput.readUTF();
		numberOfYears = objectInput.readUTF();
		numberOfParcels = objectInput.readUTF();
		sizeOfParcel = objectInput.readUTF();
		topography = objectInput.readUTF();
		numberOF = objectInput.readUTF();
		farmCounter = objectInput.readUTF();

		agricultureApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(agricultureFarmId);

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

		if (locationOfFarm == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(locationOfFarm);
		}

		if (landTenure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landTenure);
		}

		if (numberOfHectares == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numberOfHectares);
		}

		if (numberOfYears == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numberOfYears);
		}

		if (numberOfParcels == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numberOfParcels);
		}

		if (sizeOfParcel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sizeOfParcel);
		}

		if (topography == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(topography);
		}

		if (numberOF == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numberOF);
		}

		if (farmCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(farmCounter);
		}

		objectOutput.writeLong(agricultureApplicationId);
	}

	public long agricultureFarmId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String locationOfFarm;
	public String landTenure;
	public String numberOfHectares;
	public String numberOfYears;
	public String numberOfParcels;
	public String sizeOfParcel;
	public String topography;
	public String numberOF;
	public String farmCounter;
	public long agricultureApplicationId;

}