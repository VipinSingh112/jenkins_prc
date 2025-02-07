/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezOccupantGeneralBussinessAddress;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezOccupantGeneralBussinessAddress in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezOccupantGeneralBussinessAddressCacheModel
	implements CacheModel<SezOccupantGeneralBussinessAddress>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezOccupantGeneralBussinessAddressCacheModel)) {
			return false;
		}

		SezOccupantGeneralBussinessAddressCacheModel
			sezOccupantGeneralBussinessAddressCacheModel =
				(SezOccupantGeneralBussinessAddressCacheModel)object;

		if (sezOccGenBussAddressId ==
				sezOccupantGeneralBussinessAddressCacheModel.
					sezOccGenBussAddressId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezOccGenBussAddressId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{sezOccGenBussAddressId=");
		sb.append(sezOccGenBussAddressId);
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
		sb.append(", occName=");
		sb.append(occName);
		sb.append(", occStreetAddress=");
		sb.append(occStreetAddress);
		sb.append(", occTown=");
		sb.append(occTown);
		sb.append(", occParish=");
		sb.append(occParish);
		sb.append(", occCountry=");
		sb.append(occCountry);
		sb.append(", addresstype=");
		sb.append(addresstype);
		sb.append(", sezOccGenBussId=");
		sb.append(sezOccGenBussId);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezOccupantGeneralBussinessAddress toEntityModel() {
		SezOccupantGeneralBussinessAddressImpl
			sezOccupantGeneralBussinessAddressImpl =
				new SezOccupantGeneralBussinessAddressImpl();

		sezOccupantGeneralBussinessAddressImpl.setSezOccGenBussAddressId(
			sezOccGenBussAddressId);
		sezOccupantGeneralBussinessAddressImpl.setGroupId(groupId);
		sezOccupantGeneralBussinessAddressImpl.setCompanyId(companyId);
		sezOccupantGeneralBussinessAddressImpl.setUserId(userId);

		if (userName == null) {
			sezOccupantGeneralBussinessAddressImpl.setUserName("");
		}
		else {
			sezOccupantGeneralBussinessAddressImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezOccupantGeneralBussinessAddressImpl.setCreateDate(null);
		}
		else {
			sezOccupantGeneralBussinessAddressImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezOccupantGeneralBussinessAddressImpl.setModifiedDate(null);
		}
		else {
			sezOccupantGeneralBussinessAddressImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (occName == null) {
			sezOccupantGeneralBussinessAddressImpl.setOccName("");
		}
		else {
			sezOccupantGeneralBussinessAddressImpl.setOccName(occName);
		}

		if (occStreetAddress == null) {
			sezOccupantGeneralBussinessAddressImpl.setOccStreetAddress("");
		}
		else {
			sezOccupantGeneralBussinessAddressImpl.setOccStreetAddress(
				occStreetAddress);
		}

		if (occTown == null) {
			sezOccupantGeneralBussinessAddressImpl.setOccTown("");
		}
		else {
			sezOccupantGeneralBussinessAddressImpl.setOccTown(occTown);
		}

		if (occParish == null) {
			sezOccupantGeneralBussinessAddressImpl.setOccParish("");
		}
		else {
			sezOccupantGeneralBussinessAddressImpl.setOccParish(occParish);
		}

		if (occCountry == null) {
			sezOccupantGeneralBussinessAddressImpl.setOccCountry("");
		}
		else {
			sezOccupantGeneralBussinessAddressImpl.setOccCountry(occCountry);
		}

		if (addresstype == null) {
			sezOccupantGeneralBussinessAddressImpl.setAddresstype("");
		}
		else {
			sezOccupantGeneralBussinessAddressImpl.setAddresstype(addresstype);
		}

		sezOccupantGeneralBussinessAddressImpl.setSezOccGenBussId(
			sezOccGenBussId);
		sezOccupantGeneralBussinessAddressImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezOccupantGeneralBussinessAddressImpl.resetOriginalValues();

		return sezOccupantGeneralBussinessAddressImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezOccGenBussAddressId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		occName = objectInput.readUTF();
		occStreetAddress = objectInput.readUTF();
		occTown = objectInput.readUTF();
		occParish = objectInput.readUTF();
		occCountry = objectInput.readUTF();
		addresstype = objectInput.readUTF();

		sezOccGenBussId = objectInput.readLong();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezOccGenBussAddressId);

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

		if (occName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occName);
		}

		if (occStreetAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occStreetAddress);
		}

		if (occTown == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occTown);
		}

		if (occParish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occParish);
		}

		if (occCountry == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occCountry);
		}

		if (addresstype == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(addresstype);
		}

		objectOutput.writeLong(sezOccGenBussId);

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezOccGenBussAddressId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String occName;
	public String occStreetAddress;
	public String occTown;
	public String occParish;
	public String occCountry;
	public String addresstype;
	public long sezOccGenBussId;
	public long sezStatusApplicationId;

}