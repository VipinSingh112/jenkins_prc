/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.model.impl;

import com.agriculture.application.form.service.model.AgricultureCrop;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AgricultureCrop in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AgricultureCropCacheModel
	implements CacheModel<AgricultureCrop>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AgricultureCropCacheModel)) {
			return false;
		}

		AgricultureCropCacheModel agricultureCropCacheModel =
			(AgricultureCropCacheModel)object;

		if (agricultureCropId == agricultureCropCacheModel.agricultureCropId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, agricultureCropId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{agricultureCropId=");
		sb.append(agricultureCropId);
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
		sb.append(", cropType=");
		sb.append(cropType);
		sb.append(", cropHectare=");
		sb.append(cropHectare);
		sb.append(", averageAnnualProduction=");
		sb.append(averageAnnualProduction);
		sb.append(", cropMarketLocal=");
		sb.append(cropMarketLocal);
		sb.append(", cropMarketForeign=");
		sb.append(cropMarketForeign);
		sb.append(", valueOfSale=");
		sb.append(valueOfSale);
		sb.append(", cropCounter=");
		sb.append(cropCounter);
		sb.append(", agricultureApplicationId=");
		sb.append(agricultureApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AgricultureCrop toEntityModel() {
		AgricultureCropImpl agricultureCropImpl = new AgricultureCropImpl();

		agricultureCropImpl.setAgricultureCropId(agricultureCropId);
		agricultureCropImpl.setGroupId(groupId);
		agricultureCropImpl.setCompanyId(companyId);
		agricultureCropImpl.setUserId(userId);

		if (userName == null) {
			agricultureCropImpl.setUserName("");
		}
		else {
			agricultureCropImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			agricultureCropImpl.setCreateDate(null);
		}
		else {
			agricultureCropImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			agricultureCropImpl.setModifiedDate(null);
		}
		else {
			agricultureCropImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (cropType == null) {
			agricultureCropImpl.setCropType("");
		}
		else {
			agricultureCropImpl.setCropType(cropType);
		}

		if (cropHectare == null) {
			agricultureCropImpl.setCropHectare("");
		}
		else {
			agricultureCropImpl.setCropHectare(cropHectare);
		}

		if (averageAnnualProduction == null) {
			agricultureCropImpl.setAverageAnnualProduction("");
		}
		else {
			agricultureCropImpl.setAverageAnnualProduction(
				averageAnnualProduction);
		}

		if (cropMarketLocal == null) {
			agricultureCropImpl.setCropMarketLocal("");
		}
		else {
			agricultureCropImpl.setCropMarketLocal(cropMarketLocal);
		}

		if (cropMarketForeign == null) {
			agricultureCropImpl.setCropMarketForeign("");
		}
		else {
			agricultureCropImpl.setCropMarketForeign(cropMarketForeign);
		}

		if (valueOfSale == null) {
			agricultureCropImpl.setValueOfSale("");
		}
		else {
			agricultureCropImpl.setValueOfSale(valueOfSale);
		}

		if (cropCounter == null) {
			agricultureCropImpl.setCropCounter("");
		}
		else {
			agricultureCropImpl.setCropCounter(cropCounter);
		}

		agricultureCropImpl.setAgricultureApplicationId(
			agricultureApplicationId);

		agricultureCropImpl.resetOriginalValues();

		return agricultureCropImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		agricultureCropId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		cropType = objectInput.readUTF();
		cropHectare = objectInput.readUTF();
		averageAnnualProduction = objectInput.readUTF();
		cropMarketLocal = objectInput.readUTF();
		cropMarketForeign = objectInput.readUTF();
		valueOfSale = objectInput.readUTF();
		cropCounter = objectInput.readUTF();

		agricultureApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(agricultureCropId);

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

		if (cropType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cropType);
		}

		if (cropHectare == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cropHectare);
		}

		if (averageAnnualProduction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(averageAnnualProduction);
		}

		if (cropMarketLocal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cropMarketLocal);
		}

		if (cropMarketForeign == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cropMarketForeign);
		}

		if (valueOfSale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(valueOfSale);
		}

		if (cropCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cropCounter);
		}

		objectOutput.writeLong(agricultureApplicationId);
	}

	public long agricultureCropId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String cropType;
	public String cropHectare;
	public String averageAnnualProduction;
	public String cropMarketLocal;
	public String cropMarketForeign;
	public String valueOfSale;
	public String cropCounter;
	public long agricultureApplicationId;

}