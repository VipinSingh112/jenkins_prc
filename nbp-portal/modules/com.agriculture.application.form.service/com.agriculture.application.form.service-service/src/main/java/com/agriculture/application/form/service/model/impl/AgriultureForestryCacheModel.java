/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.model.impl;

import com.agriculture.application.form.service.model.AgriultureForestry;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AgriultureForestry in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AgriultureForestryCacheModel
	implements CacheModel<AgriultureForestry>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AgriultureForestryCacheModel)) {
			return false;
		}

		AgriultureForestryCacheModel agriultureForestryCacheModel =
			(AgriultureForestryCacheModel)object;

		if (agriultureForestryId ==
				agriultureForestryCacheModel.agriultureForestryId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, agriultureForestryId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{agriultureForestryId=");
		sb.append(agriultureForestryId);
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
		sb.append(", forestryType=");
		sb.append(forestryType);
		sb.append(", forestryHectare=");
		sb.append(forestryHectare);
		sb.append(", averageAnnulaProduction=");
		sb.append(averageAnnulaProduction);
		sb.append(", forestryMarketLocal=");
		sb.append(forestryMarketLocal);
		sb.append(", forestryMarketForeign=");
		sb.append(forestryMarketForeign);
		sb.append(", valueOfSale=");
		sb.append(valueOfSale);
		sb.append(", forestryCounter=");
		sb.append(forestryCounter);
		sb.append(", agricultureApplicationId=");
		sb.append(agricultureApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AgriultureForestry toEntityModel() {
		AgriultureForestryImpl agriultureForestryImpl =
			new AgriultureForestryImpl();

		agriultureForestryImpl.setAgriultureForestryId(agriultureForestryId);
		agriultureForestryImpl.setGroupId(groupId);
		agriultureForestryImpl.setCompanyId(companyId);
		agriultureForestryImpl.setUserId(userId);

		if (userName == null) {
			agriultureForestryImpl.setUserName("");
		}
		else {
			agriultureForestryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			agriultureForestryImpl.setCreateDate(null);
		}
		else {
			agriultureForestryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			agriultureForestryImpl.setModifiedDate(null);
		}
		else {
			agriultureForestryImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (forestryType == null) {
			agriultureForestryImpl.setForestryType("");
		}
		else {
			agriultureForestryImpl.setForestryType(forestryType);
		}

		if (forestryHectare == null) {
			agriultureForestryImpl.setForestryHectare("");
		}
		else {
			agriultureForestryImpl.setForestryHectare(forestryHectare);
		}

		if (averageAnnulaProduction == null) {
			agriultureForestryImpl.setAverageAnnulaProduction("");
		}
		else {
			agriultureForestryImpl.setAverageAnnulaProduction(
				averageAnnulaProduction);
		}

		if (forestryMarketLocal == null) {
			agriultureForestryImpl.setForestryMarketLocal("");
		}
		else {
			agriultureForestryImpl.setForestryMarketLocal(forestryMarketLocal);
		}

		if (forestryMarketForeign == null) {
			agriultureForestryImpl.setForestryMarketForeign("");
		}
		else {
			agriultureForestryImpl.setForestryMarketForeign(
				forestryMarketForeign);
		}

		if (valueOfSale == null) {
			agriultureForestryImpl.setValueOfSale("");
		}
		else {
			agriultureForestryImpl.setValueOfSale(valueOfSale);
		}

		if (forestryCounter == null) {
			agriultureForestryImpl.setForestryCounter("");
		}
		else {
			agriultureForestryImpl.setForestryCounter(forestryCounter);
		}

		agriultureForestryImpl.setAgricultureApplicationId(
			agricultureApplicationId);

		agriultureForestryImpl.resetOriginalValues();

		return agriultureForestryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		agriultureForestryId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		forestryType = objectInput.readUTF();
		forestryHectare = objectInput.readUTF();
		averageAnnulaProduction = objectInput.readUTF();
		forestryMarketLocal = objectInput.readUTF();
		forestryMarketForeign = objectInput.readUTF();
		valueOfSale = objectInput.readUTF();
		forestryCounter = objectInput.readUTF();

		agricultureApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(agriultureForestryId);

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

		if (forestryType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(forestryType);
		}

		if (forestryHectare == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(forestryHectare);
		}

		if (averageAnnulaProduction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(averageAnnulaProduction);
		}

		if (forestryMarketLocal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(forestryMarketLocal);
		}

		if (forestryMarketForeign == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(forestryMarketForeign);
		}

		if (valueOfSale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(valueOfSale);
		}

		if (forestryCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(forestryCounter);
		}

		objectOutput.writeLong(agricultureApplicationId);
	}

	public long agriultureForestryId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String forestryType;
	public String forestryHectare;
	public String averageAnnulaProduction;
	public String forestryMarketLocal;
	public String forestryMarketForeign;
	public String valueOfSale;
	public String forestryCounter;
	public long agricultureApplicationId;

}