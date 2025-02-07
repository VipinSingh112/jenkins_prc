/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezDevGenBusinessInfoAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezDevGenBusinessInfoAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezDevGenBusinessInfoAddCacheModel
	implements CacheModel<SezDevGenBusinessInfoAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezDevGenBusinessInfoAddCacheModel)) {
			return false;
		}

		SezDevGenBusinessInfoAddCacheModel sezDevGenBusinessInfoAddCacheModel =
			(SezDevGenBusinessInfoAddCacheModel)object;

		if (sezDevGenBusinessInfoAddId ==
				sezDevGenBusinessInfoAddCacheModel.sezDevGenBusinessInfoAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezDevGenBusinessInfoAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{sezDevGenBusinessInfoAddId=");
		sb.append(sezDevGenBusinessInfoAddId);
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
		sb.append(", companyName=");
		sb.append(companyName);
		sb.append(", buildingNum=");
		sb.append(buildingNum);
		sb.append(", townCity=");
		sb.append(townCity);
		sb.append(", parish=");
		sb.append(parish);
		sb.append(", country=");
		sb.append(country);
		sb.append(", telephoneNum=");
		sb.append(telephoneNum);
		sb.append(", faxNum=");
		sb.append(faxNum);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezDevGenBusinessInfoAdd toEntityModel() {
		SezDevGenBusinessInfoAddImpl sezDevGenBusinessInfoAddImpl =
			new SezDevGenBusinessInfoAddImpl();

		sezDevGenBusinessInfoAddImpl.setSezDevGenBusinessInfoAddId(
			sezDevGenBusinessInfoAddId);
		sezDevGenBusinessInfoAddImpl.setGroupId(groupId);
		sezDevGenBusinessInfoAddImpl.setCompanyId(companyId);
		sezDevGenBusinessInfoAddImpl.setUserId(userId);

		if (userName == null) {
			sezDevGenBusinessInfoAddImpl.setUserName("");
		}
		else {
			sezDevGenBusinessInfoAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezDevGenBusinessInfoAddImpl.setCreateDate(null);
		}
		else {
			sezDevGenBusinessInfoAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezDevGenBusinessInfoAddImpl.setModifiedDate(null);
		}
		else {
			sezDevGenBusinessInfoAddImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (companyName == null) {
			sezDevGenBusinessInfoAddImpl.setCompanyName("");
		}
		else {
			sezDevGenBusinessInfoAddImpl.setCompanyName(companyName);
		}

		if (buildingNum == null) {
			sezDevGenBusinessInfoAddImpl.setBuildingNum("");
		}
		else {
			sezDevGenBusinessInfoAddImpl.setBuildingNum(buildingNum);
		}

		if (townCity == null) {
			sezDevGenBusinessInfoAddImpl.setTownCity("");
		}
		else {
			sezDevGenBusinessInfoAddImpl.setTownCity(townCity);
		}

		if (parish == null) {
			sezDevGenBusinessInfoAddImpl.setParish("");
		}
		else {
			sezDevGenBusinessInfoAddImpl.setParish(parish);
		}

		if (country == null) {
			sezDevGenBusinessInfoAddImpl.setCountry("");
		}
		else {
			sezDevGenBusinessInfoAddImpl.setCountry(country);
		}

		if (telephoneNum == null) {
			sezDevGenBusinessInfoAddImpl.setTelephoneNum("");
		}
		else {
			sezDevGenBusinessInfoAddImpl.setTelephoneNum(telephoneNum);
		}

		if (faxNum == null) {
			sezDevGenBusinessInfoAddImpl.setFaxNum("");
		}
		else {
			sezDevGenBusinessInfoAddImpl.setFaxNum(faxNum);
		}

		if (emailAddress == null) {
			sezDevGenBusinessInfoAddImpl.setEmailAddress("");
		}
		else {
			sezDevGenBusinessInfoAddImpl.setEmailAddress(emailAddress);
		}

		if (counter == null) {
			sezDevGenBusinessInfoAddImpl.setCounter("");
		}
		else {
			sezDevGenBusinessInfoAddImpl.setCounter(counter);
		}

		sezDevGenBusinessInfoAddImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezDevGenBusinessInfoAddImpl.resetOriginalValues();

		return sezDevGenBusinessInfoAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezDevGenBusinessInfoAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		companyName = objectInput.readUTF();
		buildingNum = objectInput.readUTF();
		townCity = objectInput.readUTF();
		parish = objectInput.readUTF();
		country = objectInput.readUTF();
		telephoneNum = objectInput.readUTF();
		faxNum = objectInput.readUTF();
		emailAddress = objectInput.readUTF();
		counter = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezDevGenBusinessInfoAddId);

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

		if (companyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyName);
		}

		if (buildingNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(buildingNum);
		}

		if (townCity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(townCity);
		}

		if (parish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(parish);
		}

		if (country == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(country);
		}

		if (telephoneNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telephoneNum);
		}

		if (faxNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(faxNum);
		}

		if (emailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailAddress);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezDevGenBusinessInfoAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String companyName;
	public String buildingNum;
	public String townCity;
	public String parish;
	public String country;
	public String telephoneNum;
	public String faxNum;
	public String emailAddress;
	public String counter;
	public long sezStatusApplicationId;

}