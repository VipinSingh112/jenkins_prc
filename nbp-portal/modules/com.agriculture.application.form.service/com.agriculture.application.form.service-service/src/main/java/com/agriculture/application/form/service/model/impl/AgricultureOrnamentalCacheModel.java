/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.model.impl;

import com.agriculture.application.form.service.model.AgricultureOrnamental;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AgricultureOrnamental in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AgricultureOrnamentalCacheModel
	implements CacheModel<AgricultureOrnamental>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AgricultureOrnamentalCacheModel)) {
			return false;
		}

		AgricultureOrnamentalCacheModel agricultureOrnamentalCacheModel =
			(AgricultureOrnamentalCacheModel)object;

		if (agricultureOrnamentalId ==
				agricultureOrnamentalCacheModel.agricultureOrnamentalId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, agricultureOrnamentalId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{agricultureOrnamentalId=");
		sb.append(agricultureOrnamentalId);
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
		sb.append(", ornamentalType=");
		sb.append(ornamentalType);
		sb.append(", ornamentalProduceArea=");
		sb.append(ornamentalProduceArea);
		sb.append(", averageAnnualProduction=");
		sb.append(averageAnnualProduction);
		sb.append(", ornamentalMarketLocal=");
		sb.append(ornamentalMarketLocal);
		sb.append(", ornamentalMarketForeign=");
		sb.append(ornamentalMarketForeign);
		sb.append(", valueOfSale=");
		sb.append(valueOfSale);
		sb.append(", ornamentalCounter=");
		sb.append(ornamentalCounter);
		sb.append(", agricultureApplicationId=");
		sb.append(agricultureApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AgricultureOrnamental toEntityModel() {
		AgricultureOrnamentalImpl agricultureOrnamentalImpl =
			new AgricultureOrnamentalImpl();

		agricultureOrnamentalImpl.setAgricultureOrnamentalId(
			agricultureOrnamentalId);
		agricultureOrnamentalImpl.setGroupId(groupId);
		agricultureOrnamentalImpl.setCompanyId(companyId);
		agricultureOrnamentalImpl.setUserId(userId);

		if (userName == null) {
			agricultureOrnamentalImpl.setUserName("");
		}
		else {
			agricultureOrnamentalImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			agricultureOrnamentalImpl.setCreateDate(null);
		}
		else {
			agricultureOrnamentalImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			agricultureOrnamentalImpl.setModifiedDate(null);
		}
		else {
			agricultureOrnamentalImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (ornamentalType == null) {
			agricultureOrnamentalImpl.setOrnamentalType("");
		}
		else {
			agricultureOrnamentalImpl.setOrnamentalType(ornamentalType);
		}

		if (ornamentalProduceArea == null) {
			agricultureOrnamentalImpl.setOrnamentalProduceArea("");
		}
		else {
			agricultureOrnamentalImpl.setOrnamentalProduceArea(
				ornamentalProduceArea);
		}

		if (averageAnnualProduction == null) {
			agricultureOrnamentalImpl.setAverageAnnualProduction("");
		}
		else {
			agricultureOrnamentalImpl.setAverageAnnualProduction(
				averageAnnualProduction);
		}

		if (ornamentalMarketLocal == null) {
			agricultureOrnamentalImpl.setOrnamentalMarketLocal("");
		}
		else {
			agricultureOrnamentalImpl.setOrnamentalMarketLocal(
				ornamentalMarketLocal);
		}

		if (ornamentalMarketForeign == null) {
			agricultureOrnamentalImpl.setOrnamentalMarketForeign("");
		}
		else {
			agricultureOrnamentalImpl.setOrnamentalMarketForeign(
				ornamentalMarketForeign);
		}

		if (valueOfSale == null) {
			agricultureOrnamentalImpl.setValueOfSale("");
		}
		else {
			agricultureOrnamentalImpl.setValueOfSale(valueOfSale);
		}

		if (ornamentalCounter == null) {
			agricultureOrnamentalImpl.setOrnamentalCounter("");
		}
		else {
			agricultureOrnamentalImpl.setOrnamentalCounter(ornamentalCounter);
		}

		agricultureOrnamentalImpl.setAgricultureApplicationId(
			agricultureApplicationId);

		agricultureOrnamentalImpl.resetOriginalValues();

		return agricultureOrnamentalImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		agricultureOrnamentalId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		ornamentalType = objectInput.readUTF();
		ornamentalProduceArea = objectInput.readUTF();
		averageAnnualProduction = objectInput.readUTF();
		ornamentalMarketLocal = objectInput.readUTF();
		ornamentalMarketForeign = objectInput.readUTF();
		valueOfSale = objectInput.readUTF();
		ornamentalCounter = objectInput.readUTF();

		agricultureApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(agricultureOrnamentalId);

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

		if (ornamentalType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ornamentalType);
		}

		if (ornamentalProduceArea == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ornamentalProduceArea);
		}

		if (averageAnnualProduction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(averageAnnualProduction);
		}

		if (ornamentalMarketLocal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ornamentalMarketLocal);
		}

		if (ornamentalMarketForeign == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ornamentalMarketForeign);
		}

		if (valueOfSale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(valueOfSale);
		}

		if (ornamentalCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ornamentalCounter);
		}

		objectOutput.writeLong(agricultureApplicationId);
	}

	public long agricultureOrnamentalId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String ornamentalType;
	public String ornamentalProduceArea;
	public String averageAnnualProduction;
	public String ornamentalMarketLocal;
	public String ornamentalMarketForeign;
	public String valueOfSale;
	public String ornamentalCounter;
	public long agricultureApplicationId;

}