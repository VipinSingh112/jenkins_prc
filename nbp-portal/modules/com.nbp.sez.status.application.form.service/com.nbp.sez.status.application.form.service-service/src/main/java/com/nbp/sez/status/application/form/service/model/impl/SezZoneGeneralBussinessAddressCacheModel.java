/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezZoneGeneralBussinessAddress;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezZoneGeneralBussinessAddress in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezZoneGeneralBussinessAddressCacheModel
	implements CacheModel<SezZoneGeneralBussinessAddress>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezZoneGeneralBussinessAddressCacheModel)) {
			return false;
		}

		SezZoneGeneralBussinessAddressCacheModel
			sezZoneGeneralBussinessAddressCacheModel =
				(SezZoneGeneralBussinessAddressCacheModel)object;

		if (sezZoneGenBussAddressId ==
				sezZoneGeneralBussinessAddressCacheModel.
					sezZoneGenBussAddressId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezZoneGenBussAddressId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{sezZoneGenBussAddressId=");
		sb.append(sezZoneGenBussAddressId);
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
		sb.append(", zoneName=");
		sb.append(zoneName);
		sb.append(", zoneStreetAddress=");
		sb.append(zoneStreetAddress);
		sb.append(", zoneTown=");
		sb.append(zoneTown);
		sb.append(", zoneParish=");
		sb.append(zoneParish);
		sb.append(", zoneCountry=");
		sb.append(zoneCountry);
		sb.append(", addresstype=");
		sb.append(addresstype);
		sb.append(", sezZoneGeneralBusinessInfoId=");
		sb.append(sezZoneGeneralBusinessInfoId);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezZoneGeneralBussinessAddress toEntityModel() {
		SezZoneGeneralBussinessAddressImpl sezZoneGeneralBussinessAddressImpl =
			new SezZoneGeneralBussinessAddressImpl();

		sezZoneGeneralBussinessAddressImpl.setSezZoneGenBussAddressId(
			sezZoneGenBussAddressId);
		sezZoneGeneralBussinessAddressImpl.setGroupId(groupId);
		sezZoneGeneralBussinessAddressImpl.setCompanyId(companyId);
		sezZoneGeneralBussinessAddressImpl.setUserId(userId);

		if (userName == null) {
			sezZoneGeneralBussinessAddressImpl.setUserName("");
		}
		else {
			sezZoneGeneralBussinessAddressImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezZoneGeneralBussinessAddressImpl.setCreateDate(null);
		}
		else {
			sezZoneGeneralBussinessAddressImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezZoneGeneralBussinessAddressImpl.setModifiedDate(null);
		}
		else {
			sezZoneGeneralBussinessAddressImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (zoneName == null) {
			sezZoneGeneralBussinessAddressImpl.setZoneName("");
		}
		else {
			sezZoneGeneralBussinessAddressImpl.setZoneName(zoneName);
		}

		if (zoneStreetAddress == null) {
			sezZoneGeneralBussinessAddressImpl.setZoneStreetAddress("");
		}
		else {
			sezZoneGeneralBussinessAddressImpl.setZoneStreetAddress(
				zoneStreetAddress);
		}

		if (zoneTown == null) {
			sezZoneGeneralBussinessAddressImpl.setZoneTown("");
		}
		else {
			sezZoneGeneralBussinessAddressImpl.setZoneTown(zoneTown);
		}

		if (zoneParish == null) {
			sezZoneGeneralBussinessAddressImpl.setZoneParish("");
		}
		else {
			sezZoneGeneralBussinessAddressImpl.setZoneParish(zoneParish);
		}

		if (zoneCountry == null) {
			sezZoneGeneralBussinessAddressImpl.setZoneCountry("");
		}
		else {
			sezZoneGeneralBussinessAddressImpl.setZoneCountry(zoneCountry);
		}

		if (addresstype == null) {
			sezZoneGeneralBussinessAddressImpl.setAddresstype("");
		}
		else {
			sezZoneGeneralBussinessAddressImpl.setAddresstype(addresstype);
		}

		sezZoneGeneralBussinessAddressImpl.setSezZoneGeneralBusinessInfoId(
			sezZoneGeneralBusinessInfoId);
		sezZoneGeneralBussinessAddressImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezZoneGeneralBussinessAddressImpl.resetOriginalValues();

		return sezZoneGeneralBussinessAddressImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezZoneGenBussAddressId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		zoneName = objectInput.readUTF();
		zoneStreetAddress = objectInput.readUTF();
		zoneTown = objectInput.readUTF();
		zoneParish = objectInput.readUTF();
		zoneCountry = objectInput.readUTF();
		addresstype = objectInput.readUTF();

		sezZoneGeneralBusinessInfoId = objectInput.readLong();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezZoneGenBussAddressId);

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

		if (zoneName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(zoneName);
		}

		if (zoneStreetAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(zoneStreetAddress);
		}

		if (zoneTown == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(zoneTown);
		}

		if (zoneParish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(zoneParish);
		}

		if (zoneCountry == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(zoneCountry);
		}

		if (addresstype == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(addresstype);
		}

		objectOutput.writeLong(sezZoneGeneralBusinessInfoId);

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezZoneGenBussAddressId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String zoneName;
	public String zoneStreetAddress;
	public String zoneTown;
	public String zoneParish;
	public String zoneCountry;
	public String addresstype;
	public long sezZoneGeneralBusinessInfoId;
	public long sezStatusApplicationId;

}