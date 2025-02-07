/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.model.impl;

import com.agriculture.application.form.service.model.AgricultureLivestock;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AgricultureLivestock in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AgricultureLivestockCacheModel
	implements CacheModel<AgricultureLivestock>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AgricultureLivestockCacheModel)) {
			return false;
		}

		AgricultureLivestockCacheModel agricultureLivestockCacheModel =
			(AgricultureLivestockCacheModel)object;

		if (agricultureLivestockId ==
				agricultureLivestockCacheModel.agricultureLivestockId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, agricultureLivestockId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{agricultureLivestockId=");
		sb.append(agricultureLivestockId);
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
		sb.append(", livestockType=");
		sb.append(livestockType);
		sb.append(", numberOFAnimalsByCategory=");
		sb.append(numberOFAnimalsByCategory);
		sb.append(", averageAnnualProduction=");
		sb.append(averageAnnualProduction);
		sb.append(", livestockMarketlocal=");
		sb.append(livestockMarketlocal);
		sb.append(", livestockMarketForeign=");
		sb.append(livestockMarketForeign);
		sb.append(", valueOfSale=");
		sb.append(valueOfSale);
		sb.append(", Livestockcounter=");
		sb.append(Livestockcounter);
		sb.append(", agricultureApplicationId=");
		sb.append(agricultureApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AgricultureLivestock toEntityModel() {
		AgricultureLivestockImpl agricultureLivestockImpl =
			new AgricultureLivestockImpl();

		agricultureLivestockImpl.setAgricultureLivestockId(
			agricultureLivestockId);
		agricultureLivestockImpl.setGroupId(groupId);
		agricultureLivestockImpl.setCompanyId(companyId);
		agricultureLivestockImpl.setUserId(userId);

		if (userName == null) {
			agricultureLivestockImpl.setUserName("");
		}
		else {
			agricultureLivestockImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			agricultureLivestockImpl.setCreateDate(null);
		}
		else {
			agricultureLivestockImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			agricultureLivestockImpl.setModifiedDate(null);
		}
		else {
			agricultureLivestockImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (livestockType == null) {
			agricultureLivestockImpl.setLivestockType("");
		}
		else {
			agricultureLivestockImpl.setLivestockType(livestockType);
		}

		if (numberOFAnimalsByCategory == null) {
			agricultureLivestockImpl.setNumberOFAnimalsByCategory("");
		}
		else {
			agricultureLivestockImpl.setNumberOFAnimalsByCategory(
				numberOFAnimalsByCategory);
		}

		if (averageAnnualProduction == null) {
			agricultureLivestockImpl.setAverageAnnualProduction("");
		}
		else {
			agricultureLivestockImpl.setAverageAnnualProduction(
				averageAnnualProduction);
		}

		if (livestockMarketlocal == null) {
			agricultureLivestockImpl.setLivestockMarketlocal("");
		}
		else {
			agricultureLivestockImpl.setLivestockMarketlocal(
				livestockMarketlocal);
		}

		if (livestockMarketForeign == null) {
			agricultureLivestockImpl.setLivestockMarketForeign("");
		}
		else {
			agricultureLivestockImpl.setLivestockMarketForeign(
				livestockMarketForeign);
		}

		if (valueOfSale == null) {
			agricultureLivestockImpl.setValueOfSale("");
		}
		else {
			agricultureLivestockImpl.setValueOfSale(valueOfSale);
		}

		if (Livestockcounter == null) {
			agricultureLivestockImpl.setLivestockcounter("");
		}
		else {
			agricultureLivestockImpl.setLivestockcounter(Livestockcounter);
		}

		agricultureLivestockImpl.setAgricultureApplicationId(
			agricultureApplicationId);

		agricultureLivestockImpl.resetOriginalValues();

		return agricultureLivestockImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		agricultureLivestockId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		livestockType = objectInput.readUTF();
		numberOFAnimalsByCategory = objectInput.readUTF();
		averageAnnualProduction = objectInput.readUTF();
		livestockMarketlocal = objectInput.readUTF();
		livestockMarketForeign = objectInput.readUTF();
		valueOfSale = objectInput.readUTF();
		Livestockcounter = objectInput.readUTF();

		agricultureApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(agricultureLivestockId);

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

		if (livestockType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(livestockType);
		}

		if (numberOFAnimalsByCategory == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numberOFAnimalsByCategory);
		}

		if (averageAnnualProduction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(averageAnnualProduction);
		}

		if (livestockMarketlocal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(livestockMarketlocal);
		}

		if (livestockMarketForeign == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(livestockMarketForeign);
		}

		if (valueOfSale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(valueOfSale);
		}

		if (Livestockcounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Livestockcounter);
		}

		objectOutput.writeLong(agricultureApplicationId);
	}

	public long agricultureLivestockId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String livestockType;
	public String numberOFAnimalsByCategory;
	public String averageAnnualProduction;
	public String livestockMarketlocal;
	public String livestockMarketForeign;
	public String valueOfSale;
	public String Livestockcounter;
	public long agricultureApplicationId;

}