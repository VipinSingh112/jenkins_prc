/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.cannabis.application.form.services.model.CannabisApplicationIndividualAddress;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CannabisApplicationIndividualAddress in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CannabisApplicationIndividualAddressCacheModel
	implements CacheModel<CannabisApplicationIndividualAddress>,
			   Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof
				CannabisApplicationIndividualAddressCacheModel)) {

			return false;
		}

		CannabisApplicationIndividualAddressCacheModel
			cannabisApplicationIndividualAddressCacheModel =
				(CannabisApplicationIndividualAddressCacheModel)object;

		if (IndividualAddressId ==
				cannabisApplicationIndividualAddressCacheModel.
					IndividualAddressId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, IndividualAddressId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", IndividualAddressId=");
		sb.append(IndividualAddressId);
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
		sb.append(", individualInformationId=");
		sb.append(individualInformationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CannabisApplicationIndividualAddress toEntityModel() {
		CannabisApplicationIndividualAddressImpl
			cannabisApplicationIndividualAddressImpl =
				new CannabisApplicationIndividualAddressImpl();

		if (uuid == null) {
			cannabisApplicationIndividualAddressImpl.setUuid("");
		}
		else {
			cannabisApplicationIndividualAddressImpl.setUuid(uuid);
		}

		cannabisApplicationIndividualAddressImpl.setIndividualAddressId(
			IndividualAddressId);
		cannabisApplicationIndividualAddressImpl.setGroupId(groupId);
		cannabisApplicationIndividualAddressImpl.setCompanyId(companyId);
		cannabisApplicationIndividualAddressImpl.setUserId(userId);

		if (userName == null) {
			cannabisApplicationIndividualAddressImpl.setUserName("");
		}
		else {
			cannabisApplicationIndividualAddressImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			cannabisApplicationIndividualAddressImpl.setCreateDate(null);
		}
		else {
			cannabisApplicationIndividualAddressImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cannabisApplicationIndividualAddressImpl.setModifiedDate(null);
		}
		else {
			cannabisApplicationIndividualAddressImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (addressType == null) {
			cannabisApplicationIndividualAddressImpl.setAddressType("");
		}
		else {
			cannabisApplicationIndividualAddressImpl.setAddressType(
				addressType);
		}

		if (streetName == null) {
			cannabisApplicationIndividualAddressImpl.setStreetName("");
		}
		else {
			cannabisApplicationIndividualAddressImpl.setStreetName(streetName);
		}

		if (town == null) {
			cannabisApplicationIndividualAddressImpl.setTown("");
		}
		else {
			cannabisApplicationIndividualAddressImpl.setTown(town);
		}

		if (parish == null) {
			cannabisApplicationIndividualAddressImpl.setParish("");
		}
		else {
			cannabisApplicationIndividualAddressImpl.setParish(parish);
		}

		if (applicationNumber == null) {
			cannabisApplicationIndividualAddressImpl.setApplicationNumber("");
		}
		else {
			cannabisApplicationIndividualAddressImpl.setApplicationNumber(
				applicationNumber);
		}

		cannabisApplicationIndividualAddressImpl.setCannabisApplicationId(
			cannabisApplicationId);
		cannabisApplicationIndividualAddressImpl.setIndividualInformationId(
			individualInformationId);

		cannabisApplicationIndividualAddressImpl.resetOriginalValues();

		return cannabisApplicationIndividualAddressImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		IndividualAddressId = objectInput.readLong();

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

		individualInformationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(IndividualAddressId);

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

		objectOutput.writeLong(individualInformationId);
	}

	public String uuid;
	public long IndividualAddressId;
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
	public long individualInformationId;

}