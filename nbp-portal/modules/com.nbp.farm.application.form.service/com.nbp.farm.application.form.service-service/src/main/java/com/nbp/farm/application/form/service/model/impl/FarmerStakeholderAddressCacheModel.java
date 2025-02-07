/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.farm.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.farm.application.form.service.model.FarmerStakeholderAddress;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FarmerStakeholderAddress in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FarmerStakeholderAddressCacheModel
	implements CacheModel<FarmerStakeholderAddress>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FarmerStakeholderAddressCacheModel)) {
			return false;
		}

		FarmerStakeholderAddressCacheModel farmerStakeholderAddressCacheModel =
			(FarmerStakeholderAddressCacheModel)object;

		if (farmerStakeholderAddressId ==
				farmerStakeholderAddressCacheModel.farmerStakeholderAddressId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, farmerStakeholderAddressId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{farmerStakeholderAddressId=");
		sb.append(farmerStakeholderAddressId);
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
		sb.append(", streetName=");
		sb.append(streetName);
		sb.append(", district=");
		sb.append(district);
		sb.append(", postoffice=");
		sb.append(postoffice);
		sb.append(", parish=");
		sb.append(parish);
		sb.append(", telephoneNumber=");
		sb.append(telephoneNumber);
		sb.append(", applicationNumber=");
		sb.append(applicationNumber);
		sb.append(", farmerApplicationId=");
		sb.append(farmerApplicationId);
		sb.append(", stakeholderAddressId=");
		sb.append(stakeholderAddressId);
		sb.append(", farmerStakeholderInfoId=");
		sb.append(farmerStakeholderInfoId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FarmerStakeholderAddress toEntityModel() {
		FarmerStakeholderAddressImpl farmerStakeholderAddressImpl =
			new FarmerStakeholderAddressImpl();

		farmerStakeholderAddressImpl.setFarmerStakeholderAddressId(
			farmerStakeholderAddressId);
		farmerStakeholderAddressImpl.setGroupId(groupId);
		farmerStakeholderAddressImpl.setCompanyId(companyId);
		farmerStakeholderAddressImpl.setUserId(userId);

		if (userName == null) {
			farmerStakeholderAddressImpl.setUserName("");
		}
		else {
			farmerStakeholderAddressImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			farmerStakeholderAddressImpl.setCreateDate(null);
		}
		else {
			farmerStakeholderAddressImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			farmerStakeholderAddressImpl.setModifiedDate(null);
		}
		else {
			farmerStakeholderAddressImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (addressType == null) {
			farmerStakeholderAddressImpl.setAddressType("");
		}
		else {
			farmerStakeholderAddressImpl.setAddressType(addressType);
		}

		if (streetName == null) {
			farmerStakeholderAddressImpl.setStreetName("");
		}
		else {
			farmerStakeholderAddressImpl.setStreetName(streetName);
		}

		if (district == null) {
			farmerStakeholderAddressImpl.setDistrict("");
		}
		else {
			farmerStakeholderAddressImpl.setDistrict(district);
		}

		if (postoffice == null) {
			farmerStakeholderAddressImpl.setPostoffice("");
		}
		else {
			farmerStakeholderAddressImpl.setPostoffice(postoffice);
		}

		if (parish == null) {
			farmerStakeholderAddressImpl.setParish("");
		}
		else {
			farmerStakeholderAddressImpl.setParish(parish);
		}

		if (telephoneNumber == null) {
			farmerStakeholderAddressImpl.setTelephoneNumber("");
		}
		else {
			farmerStakeholderAddressImpl.setTelephoneNumber(telephoneNumber);
		}

		if (applicationNumber == null) {
			farmerStakeholderAddressImpl.setApplicationNumber("");
		}
		else {
			farmerStakeholderAddressImpl.setApplicationNumber(
				applicationNumber);
		}

		farmerStakeholderAddressImpl.setFarmerApplicationId(
			farmerApplicationId);
		farmerStakeholderAddressImpl.setStakeholderAddressId(
			stakeholderAddressId);
		farmerStakeholderAddressImpl.setFarmerStakeholderInfoId(
			farmerStakeholderInfoId);

		farmerStakeholderAddressImpl.resetOriginalValues();

		return farmerStakeholderAddressImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		farmerStakeholderAddressId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		addressType = objectInput.readUTF();
		streetName = objectInput.readUTF();
		district = objectInput.readUTF();
		postoffice = objectInput.readUTF();
		parish = objectInput.readUTF();
		telephoneNumber = objectInput.readUTF();
		applicationNumber = objectInput.readUTF();

		farmerApplicationId = objectInput.readLong();

		stakeholderAddressId = objectInput.readLong();

		farmerStakeholderInfoId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(farmerStakeholderAddressId);

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

		if (streetName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(streetName);
		}

		if (district == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(district);
		}

		if (postoffice == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(postoffice);
		}

		if (parish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(parish);
		}

		if (telephoneNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telephoneNumber);
		}

		if (applicationNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicationNumber);
		}

		objectOutput.writeLong(farmerApplicationId);

		objectOutput.writeLong(stakeholderAddressId);

		objectOutput.writeLong(farmerStakeholderInfoId);
	}

	public long farmerStakeholderAddressId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String addressType;
	public String streetName;
	public String district;
	public String postoffice;
	public String parish;
	public String telephoneNumber;
	public String applicationNumber;
	public long farmerApplicationId;
	public long stakeholderAddressId;
	public long farmerStakeholderInfoId;

}