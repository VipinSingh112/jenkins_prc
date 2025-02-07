/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.creative.application.form.service.model.CreativeCompanyDetailsAddress;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CreativeCompanyDetailsAddress in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CreativeCompanyDetailsAddressCacheModel
	implements CacheModel<CreativeCompanyDetailsAddress>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CreativeCompanyDetailsAddressCacheModel)) {
			return false;
		}

		CreativeCompanyDetailsAddressCacheModel
			creativeCompanyDetailsAddressCacheModel =
				(CreativeCompanyDetailsAddressCacheModel)object;

		if (creativeComDetailsAddressId ==
				creativeCompanyDetailsAddressCacheModel.
					creativeComDetailsAddressId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, creativeComDetailsAddressId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{creativeComDetailsAddressId=");
		sb.append(creativeComDetailsAddressId);
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
		sb.append(", addressType=");
		sb.append(addressType);
		sb.append(", streetAddress=");
		sb.append(streetAddress);
		sb.append(", streetAddressLineTwo=");
		sb.append(streetAddressLineTwo);
		sb.append(", city=");
		sb.append(city);
		sb.append(", country=");
		sb.append(country);
		sb.append(", CreativeApplicationId=");
		sb.append(CreativeApplicationId);
		sb.append(", creativeCompanyDetailsId=");
		sb.append(creativeCompanyDetailsId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CreativeCompanyDetailsAddress toEntityModel() {
		CreativeCompanyDetailsAddressImpl creativeCompanyDetailsAddressImpl =
			new CreativeCompanyDetailsAddressImpl();

		creativeCompanyDetailsAddressImpl.setCreativeComDetailsAddressId(
			creativeComDetailsAddressId);
		creativeCompanyDetailsAddressImpl.setGroupId(groupId);
		creativeCompanyDetailsAddressImpl.setCompanyId(companyId);
		creativeCompanyDetailsAddressImpl.setUserId(userId);

		if (userName == null) {
			creativeCompanyDetailsAddressImpl.setUserName("");
		}
		else {
			creativeCompanyDetailsAddressImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			creativeCompanyDetailsAddressImpl.setCreateDate(null);
		}
		else {
			creativeCompanyDetailsAddressImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			creativeCompanyDetailsAddressImpl.setModifiedDate(null);
		}
		else {
			creativeCompanyDetailsAddressImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (addressType == null) {
			creativeCompanyDetailsAddressImpl.setAddressType("");
		}
		else {
			creativeCompanyDetailsAddressImpl.setAddressType(addressType);
		}

		if (streetAddress == null) {
			creativeCompanyDetailsAddressImpl.setStreetAddress("");
		}
		else {
			creativeCompanyDetailsAddressImpl.setStreetAddress(streetAddress);
		}

		if (streetAddressLineTwo == null) {
			creativeCompanyDetailsAddressImpl.setStreetAddressLineTwo("");
		}
		else {
			creativeCompanyDetailsAddressImpl.setStreetAddressLineTwo(
				streetAddressLineTwo);
		}

		if (city == null) {
			creativeCompanyDetailsAddressImpl.setCity("");
		}
		else {
			creativeCompanyDetailsAddressImpl.setCity(city);
		}

		if (country == null) {
			creativeCompanyDetailsAddressImpl.setCountry("");
		}
		else {
			creativeCompanyDetailsAddressImpl.setCountry(country);
		}

		creativeCompanyDetailsAddressImpl.setCreativeApplicationId(
			CreativeApplicationId);
		creativeCompanyDetailsAddressImpl.setCreativeCompanyDetailsId(
			creativeCompanyDetailsId);

		creativeCompanyDetailsAddressImpl.resetOriginalValues();

		return creativeCompanyDetailsAddressImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		creativeComDetailsAddressId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		addressType = objectInput.readUTF();
		streetAddress = objectInput.readUTF();
		streetAddressLineTwo = objectInput.readUTF();
		city = objectInput.readUTF();
		country = objectInput.readUTF();

		CreativeApplicationId = objectInput.readLong();

		creativeCompanyDetailsId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(creativeComDetailsAddressId);

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

		if (addressType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(addressType);
		}

		if (streetAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(streetAddress);
		}

		if (streetAddressLineTwo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(streetAddressLineTwo);
		}

		if (city == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(city);
		}

		if (country == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(country);
		}

		objectOutput.writeLong(CreativeApplicationId);

		objectOutput.writeLong(creativeCompanyDetailsId);
	}

	public long creativeComDetailsAddressId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String addressType;
	public String streetAddress;
	public String streetAddressLineTwo;
	public String city;
	public String country;
	public long CreativeApplicationId;
	public long creativeCompanyDetailsId;

}