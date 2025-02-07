/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.model.impl;

import com.agriculture.application.form.service.model.AgricultureApiculture;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AgricultureApiculture in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AgricultureApicultureCacheModel
	implements CacheModel<AgricultureApiculture>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AgricultureApicultureCacheModel)) {
			return false;
		}

		AgricultureApicultureCacheModel agricultureApicultureCacheModel =
			(AgricultureApicultureCacheModel)object;

		if (agricultureApicultureId ==
				agricultureApicultureCacheModel.agricultureApicultureId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, agricultureApicultureId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{agricultureApicultureId=");
		sb.append(agricultureApicultureId);
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
		sb.append(", apicultureType=");
		sb.append(apicultureType);
		sb.append(", numberOfColonies=");
		sb.append(numberOfColonies);
		sb.append(", averageAnnualProduction=");
		sb.append(averageAnnualProduction);
		sb.append(", marketLocal=");
		sb.append(marketLocal);
		sb.append(", marketForeign=");
		sb.append(marketForeign);
		sb.append(", valueOfSale=");
		sb.append(valueOfSale);
		sb.append(", apicultureCounter=");
		sb.append(apicultureCounter);
		sb.append(", agricultureApplicationId=");
		sb.append(agricultureApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AgricultureApiculture toEntityModel() {
		AgricultureApicultureImpl agricultureApicultureImpl =
			new AgricultureApicultureImpl();

		agricultureApicultureImpl.setAgricultureApicultureId(
			agricultureApicultureId);
		agricultureApicultureImpl.setGroupId(groupId);
		agricultureApicultureImpl.setCompanyId(companyId);
		agricultureApicultureImpl.setUserId(userId);

		if (userName == null) {
			agricultureApicultureImpl.setUserName("");
		}
		else {
			agricultureApicultureImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			agricultureApicultureImpl.setCreateDate(null);
		}
		else {
			agricultureApicultureImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			agricultureApicultureImpl.setModifiedDate(null);
		}
		else {
			agricultureApicultureImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (apicultureType == null) {
			agricultureApicultureImpl.setApicultureType("");
		}
		else {
			agricultureApicultureImpl.setApicultureType(apicultureType);
		}

		if (numberOfColonies == null) {
			agricultureApicultureImpl.setNumberOfColonies("");
		}
		else {
			agricultureApicultureImpl.setNumberOfColonies(numberOfColonies);
		}

		if (averageAnnualProduction == null) {
			agricultureApicultureImpl.setAverageAnnualProduction("");
		}
		else {
			agricultureApicultureImpl.setAverageAnnualProduction(
				averageAnnualProduction);
		}

		if (marketLocal == null) {
			agricultureApicultureImpl.setMarketLocal("");
		}
		else {
			agricultureApicultureImpl.setMarketLocal(marketLocal);
		}

		if (marketForeign == null) {
			agricultureApicultureImpl.setMarketForeign("");
		}
		else {
			agricultureApicultureImpl.setMarketForeign(marketForeign);
		}

		if (valueOfSale == null) {
			agricultureApicultureImpl.setValueOfSale("");
		}
		else {
			agricultureApicultureImpl.setValueOfSale(valueOfSale);
		}

		if (apicultureCounter == null) {
			agricultureApicultureImpl.setApicultureCounter("");
		}
		else {
			agricultureApicultureImpl.setApicultureCounter(apicultureCounter);
		}

		agricultureApicultureImpl.setAgricultureApplicationId(
			agricultureApplicationId);

		agricultureApicultureImpl.resetOriginalValues();

		return agricultureApicultureImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		agricultureApicultureId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		apicultureType = objectInput.readUTF();
		numberOfColonies = objectInput.readUTF();
		averageAnnualProduction = objectInput.readUTF();
		marketLocal = objectInput.readUTF();
		marketForeign = objectInput.readUTF();
		valueOfSale = objectInput.readUTF();
		apicultureCounter = objectInput.readUTF();

		agricultureApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(agricultureApicultureId);

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

		if (apicultureType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(apicultureType);
		}

		if (numberOfColonies == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numberOfColonies);
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

		if (apicultureCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(apicultureCounter);
		}

		objectOutput.writeLong(agricultureApplicationId);
	}

	public long agricultureApicultureId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String apicultureType;
	public String numberOfColonies;
	public String averageAnnualProduction;
	public String marketLocal;
	public String marketForeign;
	public String valueOfSale;
	public String apicultureCounter;
	public long agricultureApplicationId;

}