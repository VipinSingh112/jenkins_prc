/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDeviceInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcraVerifyWeighingDeviceInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcraVerifyWeighingDeviceInfoCacheModel
	implements CacheModel<NcraVerifyWeighingDeviceInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcraVerifyWeighingDeviceInfoCacheModel)) {
			return false;
		}

		NcraVerifyWeighingDeviceInfoCacheModel
			ncraVerifyWeighingDeviceInfoCacheModel =
				(NcraVerifyWeighingDeviceInfoCacheModel)object;

		if (ncraVerifyWeighingDeviceInfoId ==
				ncraVerifyWeighingDeviceInfoCacheModel.
					ncraVerifyWeighingDeviceInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncraVerifyWeighingDeviceInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{ncraVerifyWeighingDeviceInfoId=");
		sb.append(ncraVerifyWeighingDeviceInfoId);
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
		sb.append(", typeofDevice=");
		sb.append(typeofDevice);
		sb.append(", manufacturer=");
		sb.append(manufacturer);
		sb.append(", serialNumber=");
		sb.append(serialNumber);
		sb.append(", quantity=");
		sb.append(quantity);
		sb.append(", maximumCapacity=");
		sb.append(maximumCapacity);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", ncraApplicationId=");
		sb.append(ncraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcraVerifyWeighingDeviceInfo toEntityModel() {
		NcraVerifyWeighingDeviceInfoImpl ncraVerifyWeighingDeviceInfoImpl =
			new NcraVerifyWeighingDeviceInfoImpl();

		ncraVerifyWeighingDeviceInfoImpl.setNcraVerifyWeighingDeviceInfoId(
			ncraVerifyWeighingDeviceInfoId);
		ncraVerifyWeighingDeviceInfoImpl.setGroupId(groupId);
		ncraVerifyWeighingDeviceInfoImpl.setCompanyId(companyId);
		ncraVerifyWeighingDeviceInfoImpl.setUserId(userId);

		if (userName == null) {
			ncraVerifyWeighingDeviceInfoImpl.setUserName("");
		}
		else {
			ncraVerifyWeighingDeviceInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncraVerifyWeighingDeviceInfoImpl.setCreateDate(null);
		}
		else {
			ncraVerifyWeighingDeviceInfoImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncraVerifyWeighingDeviceInfoImpl.setModifiedDate(null);
		}
		else {
			ncraVerifyWeighingDeviceInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (typeofDevice == null) {
			ncraVerifyWeighingDeviceInfoImpl.setTypeofDevice("");
		}
		else {
			ncraVerifyWeighingDeviceInfoImpl.setTypeofDevice(typeofDevice);
		}

		if (manufacturer == null) {
			ncraVerifyWeighingDeviceInfoImpl.setManufacturer("");
		}
		else {
			ncraVerifyWeighingDeviceInfoImpl.setManufacturer(manufacturer);
		}

		if (serialNumber == null) {
			ncraVerifyWeighingDeviceInfoImpl.setSerialNumber("");
		}
		else {
			ncraVerifyWeighingDeviceInfoImpl.setSerialNumber(serialNumber);
		}

		if (quantity == null) {
			ncraVerifyWeighingDeviceInfoImpl.setQuantity("");
		}
		else {
			ncraVerifyWeighingDeviceInfoImpl.setQuantity(quantity);
		}

		if (maximumCapacity == null) {
			ncraVerifyWeighingDeviceInfoImpl.setMaximumCapacity("");
		}
		else {
			ncraVerifyWeighingDeviceInfoImpl.setMaximumCapacity(
				maximumCapacity);
		}

		if (counter == null) {
			ncraVerifyWeighingDeviceInfoImpl.setCounter("");
		}
		else {
			ncraVerifyWeighingDeviceInfoImpl.setCounter(counter);
		}

		ncraVerifyWeighingDeviceInfoImpl.setNcraApplicationId(
			ncraApplicationId);

		ncraVerifyWeighingDeviceInfoImpl.resetOriginalValues();

		return ncraVerifyWeighingDeviceInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncraVerifyWeighingDeviceInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		typeofDevice = objectInput.readUTF();
		manufacturer = objectInput.readUTF();
		serialNumber = objectInput.readUTF();
		quantity = objectInput.readUTF();
		maximumCapacity = objectInput.readUTF();
		counter = objectInput.readUTF();

		ncraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ncraVerifyWeighingDeviceInfoId);

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

		if (typeofDevice == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeofDevice);
		}

		if (manufacturer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manufacturer);
		}

		if (serialNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(serialNumber);
		}

		if (quantity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(quantity);
		}

		if (maximumCapacity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(maximumCapacity);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(ncraApplicationId);
	}

	public long ncraVerifyWeighingDeviceInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String typeofDevice;
	public String manufacturer;
	public String serialNumber;
	public String quantity;
	public String maximumCapacity;
	public String counter;
	public long ncraApplicationId;

}