/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.cannabis.application.form.services.model.CannabisApplicationCompanyAddress;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CannabisApplicationCompanyAddress in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CannabisApplicationCompanyAddressCacheModel
	implements CacheModel<CannabisApplicationCompanyAddress>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CannabisApplicationCompanyAddressCacheModel)) {
			return false;
		}

		CannabisApplicationCompanyAddressCacheModel
			cannabisApplicationCompanyAddressCacheModel =
				(CannabisApplicationCompanyAddressCacheModel)object;

		if (companyAddressId ==
				cannabisApplicationCompanyAddressCacheModel.companyAddressId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, companyAddressId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", companyAddressId=");
		sb.append(companyAddressId);
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
		sb.append(", town=");
		sb.append(town);
		sb.append(", parish=");
		sb.append(parish);
		sb.append(", applicationNumber=");
		sb.append(applicationNumber);
		sb.append(", cannabisApplicationId=");
		sb.append(cannabisApplicationId);
		sb.append(", companyInformationId=");
		sb.append(companyInformationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CannabisApplicationCompanyAddress toEntityModel() {
		CannabisApplicationCompanyAddressImpl
			cannabisApplicationCompanyAddressImpl =
				new CannabisApplicationCompanyAddressImpl();

		if (uuid == null) {
			cannabisApplicationCompanyAddressImpl.setUuid("");
		}
		else {
			cannabisApplicationCompanyAddressImpl.setUuid(uuid);
		}

		cannabisApplicationCompanyAddressImpl.setCompanyAddressId(
			companyAddressId);
		cannabisApplicationCompanyAddressImpl.setGroupId(groupId);
		cannabisApplicationCompanyAddressImpl.setCompanyId(companyId);
		cannabisApplicationCompanyAddressImpl.setUserId(userId);

		if (userName == null) {
			cannabisApplicationCompanyAddressImpl.setUserName("");
		}
		else {
			cannabisApplicationCompanyAddressImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			cannabisApplicationCompanyAddressImpl.setCreateDate(null);
		}
		else {
			cannabisApplicationCompanyAddressImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cannabisApplicationCompanyAddressImpl.setModifiedDate(null);
		}
		else {
			cannabisApplicationCompanyAddressImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (addressType == null) {
			cannabisApplicationCompanyAddressImpl.setAddressType("");
		}
		else {
			cannabisApplicationCompanyAddressImpl.setAddressType(addressType);
		}

		if (streetName == null) {
			cannabisApplicationCompanyAddressImpl.setStreetName("");
		}
		else {
			cannabisApplicationCompanyAddressImpl.setStreetName(streetName);
		}

		if (town == null) {
			cannabisApplicationCompanyAddressImpl.setTown("");
		}
		else {
			cannabisApplicationCompanyAddressImpl.setTown(town);
		}

		if (parish == null) {
			cannabisApplicationCompanyAddressImpl.setParish("");
		}
		else {
			cannabisApplicationCompanyAddressImpl.setParish(parish);
		}

		if (applicationNumber == null) {
			cannabisApplicationCompanyAddressImpl.setApplicationNumber("");
		}
		else {
			cannabisApplicationCompanyAddressImpl.setApplicationNumber(
				applicationNumber);
		}

		cannabisApplicationCompanyAddressImpl.setCannabisApplicationId(
			cannabisApplicationId);
		cannabisApplicationCompanyAddressImpl.setCompanyInformationId(
			companyInformationId);

		cannabisApplicationCompanyAddressImpl.resetOriginalValues();

		return cannabisApplicationCompanyAddressImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		companyAddressId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		addressType = objectInput.readUTF();
		streetName = objectInput.readUTF();
		town = objectInput.readUTF();
		parish = objectInput.readUTF();
		applicationNumber = objectInput.readUTF();

		cannabisApplicationId = objectInput.readLong();

		companyInformationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(companyAddressId);

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

		if (town == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(town);
		}

		if (parish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(parish);
		}

		if (applicationNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicationNumber);
		}

		objectOutput.writeLong(cannabisApplicationId);

		objectOutput.writeLong(companyInformationId);
	}

	public String uuid;
	public long companyAddressId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String addressType;
	public String streetName;
	public String town;
	public String parish;
	public String applicationNumber;
	public long cannabisApplicationId;
	public long companyInformationId;

}