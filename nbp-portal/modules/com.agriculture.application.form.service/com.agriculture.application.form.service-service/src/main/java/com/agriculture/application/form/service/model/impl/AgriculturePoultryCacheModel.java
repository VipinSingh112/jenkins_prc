/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.model.impl;

import com.agriculture.application.form.service.model.AgriculturePoultry;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AgriculturePoultry in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AgriculturePoultryCacheModel
	implements CacheModel<AgriculturePoultry>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AgriculturePoultryCacheModel)) {
			return false;
		}

		AgriculturePoultryCacheModel agriculturePoultryCacheModel =
			(AgriculturePoultryCacheModel)object;

		if (agriculturePoultryId ==
				agriculturePoultryCacheModel.agriculturePoultryId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, agriculturePoultryId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{agriculturePoultryId=");
		sb.append(agriculturePoultryId);
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
		sb.append(", poultryType=");
		sb.append(poultryType);
		sb.append(", numberOFBirdsByCategory=");
		sb.append(numberOFBirdsByCategory);
		sb.append(", averageAnnualProduction=");
		sb.append(averageAnnualProduction);
		sb.append(", poultryMarketLocal=");
		sb.append(poultryMarketLocal);
		sb.append(", poultryMarketForeign=");
		sb.append(poultryMarketForeign);
		sb.append(", valueOfSale=");
		sb.append(valueOfSale);
		sb.append(", poultryCounter=");
		sb.append(poultryCounter);
		sb.append(", agricultureApplicationId=");
		sb.append(agricultureApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AgriculturePoultry toEntityModel() {
		AgriculturePoultryImpl agriculturePoultryImpl =
			new AgriculturePoultryImpl();

		agriculturePoultryImpl.setAgriculturePoultryId(agriculturePoultryId);
		agriculturePoultryImpl.setGroupId(groupId);
		agriculturePoultryImpl.setCompanyId(companyId);
		agriculturePoultryImpl.setUserId(userId);

		if (userName == null) {
			agriculturePoultryImpl.setUserName("");
		}
		else {
			agriculturePoultryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			agriculturePoultryImpl.setCreateDate(null);
		}
		else {
			agriculturePoultryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			agriculturePoultryImpl.setModifiedDate(null);
		}
		else {
			agriculturePoultryImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (poultryType == null) {
			agriculturePoultryImpl.setPoultryType("");
		}
		else {
			agriculturePoultryImpl.setPoultryType(poultryType);
		}

		if (numberOFBirdsByCategory == null) {
			agriculturePoultryImpl.setNumberOFBirdsByCategory("");
		}
		else {
			agriculturePoultryImpl.setNumberOFBirdsByCategory(
				numberOFBirdsByCategory);
		}

		if (averageAnnualProduction == null) {
			agriculturePoultryImpl.setAverageAnnualProduction("");
		}
		else {
			agriculturePoultryImpl.setAverageAnnualProduction(
				averageAnnualProduction);
		}

		if (poultryMarketLocal == null) {
			agriculturePoultryImpl.setPoultryMarketLocal("");
		}
		else {
			agriculturePoultryImpl.setPoultryMarketLocal(poultryMarketLocal);
		}

		if (poultryMarketForeign == null) {
			agriculturePoultryImpl.setPoultryMarketForeign("");
		}
		else {
			agriculturePoultryImpl.setPoultryMarketForeign(
				poultryMarketForeign);
		}

		if (valueOfSale == null) {
			agriculturePoultryImpl.setValueOfSale("");
		}
		else {
			agriculturePoultryImpl.setValueOfSale(valueOfSale);
		}

		if (poultryCounter == null) {
			agriculturePoultryImpl.setPoultryCounter("");
		}
		else {
			agriculturePoultryImpl.setPoultryCounter(poultryCounter);
		}

		agriculturePoultryImpl.setAgricultureApplicationId(
			agricultureApplicationId);

		agriculturePoultryImpl.resetOriginalValues();

		return agriculturePoultryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		agriculturePoultryId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		poultryType = objectInput.readUTF();
		numberOFBirdsByCategory = objectInput.readUTF();
		averageAnnualProduction = objectInput.readUTF();
		poultryMarketLocal = objectInput.readUTF();
		poultryMarketForeign = objectInput.readUTF();
		valueOfSale = objectInput.readUTF();
		poultryCounter = objectInput.readUTF();

		agricultureApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(agriculturePoultryId);

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

		if (poultryType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(poultryType);
		}

		if (numberOFBirdsByCategory == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numberOFBirdsByCategory);
		}

		if (averageAnnualProduction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(averageAnnualProduction);
		}

		if (poultryMarketLocal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(poultryMarketLocal);
		}

		if (poultryMarketForeign == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(poultryMarketForeign);
		}

		if (valueOfSale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(valueOfSale);
		}

		if (poultryCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(poultryCounter);
		}

		objectOutput.writeLong(agricultureApplicationId);
	}

	public long agriculturePoultryId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String poultryType;
	public String numberOFBirdsByCategory;
	public String averageAnnualProduction;
	public String poultryMarketLocal;
	public String poultryMarketForeign;
	public String valueOfSale;
	public String poultryCounter;
	public long agricultureApplicationId;

}