/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.model.impl;

import com.agriculture.application.form.service.model.AgricultureAquaculture;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AgricultureAquaculture in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AgricultureAquacultureCacheModel
	implements CacheModel<AgricultureAquaculture>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AgricultureAquacultureCacheModel)) {
			return false;
		}

		AgricultureAquacultureCacheModel agricultureAquacultureCacheModel =
			(AgricultureAquacultureCacheModel)object;

		if (agricultureAquacultureId ==
				agricultureAquacultureCacheModel.agricultureAquacultureId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, agricultureAquacultureId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{agricultureAquacultureId=");
		sb.append(agricultureAquacultureId);
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
		sb.append(", aquacultureType=");
		sb.append(aquacultureType);
		sb.append(", waterHectare=");
		sb.append(waterHectare);
		sb.append(", averageAnnualProduction=");
		sb.append(averageAnnualProduction);
		sb.append(", marketLocal=");
		sb.append(marketLocal);
		sb.append(", marketForeign=");
		sb.append(marketForeign);
		sb.append(", valueOfSale=");
		sb.append(valueOfSale);
		sb.append(", aquacultureCounter=");
		sb.append(aquacultureCounter);
		sb.append(", agricultureApplicationId=");
		sb.append(agricultureApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AgricultureAquaculture toEntityModel() {
		AgricultureAquacultureImpl agricultureAquacultureImpl =
			new AgricultureAquacultureImpl();

		agricultureAquacultureImpl.setAgricultureAquacultureId(
			agricultureAquacultureId);
		agricultureAquacultureImpl.setGroupId(groupId);
		agricultureAquacultureImpl.setCompanyId(companyId);
		agricultureAquacultureImpl.setUserId(userId);

		if (userName == null) {
			agricultureAquacultureImpl.setUserName("");
		}
		else {
			agricultureAquacultureImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			agricultureAquacultureImpl.setCreateDate(null);
		}
		else {
			agricultureAquacultureImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			agricultureAquacultureImpl.setModifiedDate(null);
		}
		else {
			agricultureAquacultureImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (aquacultureType == null) {
			agricultureAquacultureImpl.setAquacultureType("");
		}
		else {
			agricultureAquacultureImpl.setAquacultureType(aquacultureType);
		}

		if (waterHectare == null) {
			agricultureAquacultureImpl.setWaterHectare("");
		}
		else {
			agricultureAquacultureImpl.setWaterHectare(waterHectare);
		}

		if (averageAnnualProduction == null) {
			agricultureAquacultureImpl.setAverageAnnualProduction("");
		}
		else {
			agricultureAquacultureImpl.setAverageAnnualProduction(
				averageAnnualProduction);
		}

		if (marketLocal == null) {
			agricultureAquacultureImpl.setMarketLocal("");
		}
		else {
			agricultureAquacultureImpl.setMarketLocal(marketLocal);
		}

		if (marketForeign == null) {
			agricultureAquacultureImpl.setMarketForeign("");
		}
		else {
			agricultureAquacultureImpl.setMarketForeign(marketForeign);
		}

		if (valueOfSale == null) {
			agricultureAquacultureImpl.setValueOfSale("");
		}
		else {
			agricultureAquacultureImpl.setValueOfSale(valueOfSale);
		}

		if (aquacultureCounter == null) {
			agricultureAquacultureImpl.setAquacultureCounter("");
		}
		else {
			agricultureAquacultureImpl.setAquacultureCounter(
				aquacultureCounter);
		}

		agricultureAquacultureImpl.setAgricultureApplicationId(
			agricultureApplicationId);

		agricultureAquacultureImpl.resetOriginalValues();

		return agricultureAquacultureImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		agricultureAquacultureId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		aquacultureType = objectInput.readUTF();
		waterHectare = objectInput.readUTF();
		averageAnnualProduction = objectInput.readUTF();
		marketLocal = objectInput.readUTF();
		marketForeign = objectInput.readUTF();
		valueOfSale = objectInput.readUTF();
		aquacultureCounter = objectInput.readUTF();

		agricultureApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(agricultureAquacultureId);

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

		if (aquacultureType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(aquacultureType);
		}

		if (waterHectare == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(waterHectare);
		}

		if (averageAnnualProduction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(averageAnnualProduction);
		}

		if (marketLocal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(marketLocal);
		}

		if (marketForeign == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(marketForeign);
		}

		if (valueOfSale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(valueOfSale);
		}

		if (aquacultureCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(aquacultureCounter);
		}

		objectOutput.writeLong(agricultureApplicationId);
	}

	public long agricultureAquacultureId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String aquacultureType;
	public String waterHectare;
	public String averageAnnualProduction;
	public String marketLocal;
	public String marketForeign;
	public String valueOfSale;
	public String aquacultureCounter;
	public long agricultureApplicationId;

}