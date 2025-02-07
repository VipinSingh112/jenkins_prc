/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismNewAccommodationAddress;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismNewAccommodationAddress in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismNewAccommodationAddressCacheModel
	implements CacheModel<TourismNewAccommodationAddress>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismNewAccommodationAddressCacheModel)) {
			return false;
		}

		TourismNewAccommodationAddressCacheModel
			tourismNewAccommodationAddressCacheModel =
				(TourismNewAccommodationAddressCacheModel)object;

		if (tourismNewAccommodationAOOId ==
				tourismNewAccommodationAddressCacheModel.
					tourismNewAccommodationAOOId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismNewAccommodationAOOId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{tourismNewAccommodationAOOId=");
		sb.append(tourismNewAccommodationAOOId);
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
		sb.append(", accoAddress=");
		sb.append(accoAddress);
		sb.append(", accoTelephoneNumber=");
		sb.append(accoTelephoneNumber);
		sb.append(", accoFaxNumber=");
		sb.append(accoFaxNumber);
		sb.append(", accoEmail=");
		sb.append(accoEmail);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append(", tourismNewAccoFormId=");
		sb.append(tourismNewAccoFormId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismNewAccommodationAddress toEntityModel() {
		TourismNewAccommodationAddressImpl tourismNewAccommodationAddressImpl =
			new TourismNewAccommodationAddressImpl();

		tourismNewAccommodationAddressImpl.setTourismNewAccommodationAOOId(
			tourismNewAccommodationAOOId);
		tourismNewAccommodationAddressImpl.setGroupId(groupId);
		tourismNewAccommodationAddressImpl.setCompanyId(companyId);
		tourismNewAccommodationAddressImpl.setUserId(userId);

		if (userName == null) {
			tourismNewAccommodationAddressImpl.setUserName("");
		}
		else {
			tourismNewAccommodationAddressImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismNewAccommodationAddressImpl.setCreateDate(null);
		}
		else {
			tourismNewAccommodationAddressImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismNewAccommodationAddressImpl.setModifiedDate(null);
		}
		else {
			tourismNewAccommodationAddressImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (addressType == null) {
			tourismNewAccommodationAddressImpl.setAddressType("");
		}
		else {
			tourismNewAccommodationAddressImpl.setAddressType(addressType);
		}

		if (accoAddress == null) {
			tourismNewAccommodationAddressImpl.setAccoAddress("");
		}
		else {
			tourismNewAccommodationAddressImpl.setAccoAddress(accoAddress);
		}

		if (accoTelephoneNumber == null) {
			tourismNewAccommodationAddressImpl.setAccoTelephoneNumber("");
		}
		else {
			tourismNewAccommodationAddressImpl.setAccoTelephoneNumber(
				accoTelephoneNumber);
		}

		if (accoFaxNumber == null) {
			tourismNewAccommodationAddressImpl.setAccoFaxNumber("");
		}
		else {
			tourismNewAccommodationAddressImpl.setAccoFaxNumber(accoFaxNumber);
		}

		if (accoEmail == null) {
			tourismNewAccommodationAddressImpl.setAccoEmail("");
		}
		else {
			tourismNewAccommodationAddressImpl.setAccoEmail(accoEmail);
		}

		tourismNewAccommodationAddressImpl.setTourismApplicationId(
			tourismApplicationId);
		tourismNewAccommodationAddressImpl.setTourismNewAccoFormId(
			tourismNewAccoFormId);

		tourismNewAccommodationAddressImpl.resetOriginalValues();

		return tourismNewAccommodationAddressImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismNewAccommodationAOOId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		addressType = objectInput.readUTF();
		accoAddress = objectInput.readUTF();
		accoTelephoneNumber = objectInput.readUTF();
		accoFaxNumber = objectInput.readUTF();
		accoEmail = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();

		tourismNewAccoFormId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismNewAccommodationAOOId);

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

		if (accoAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accoAddress);
		}

		if (accoTelephoneNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accoTelephoneNumber);
		}

		if (accoFaxNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accoFaxNumber);
		}

		if (accoEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accoEmail);
		}

		objectOutput.writeLong(tourismApplicationId);

		objectOutput.writeLong(tourismNewAccoFormId);
	}

	public long tourismNewAccommodationAOOId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String addressType;
	public String accoAddress;
	public String accoTelephoneNumber;
	public String accoFaxNumber;
	public String accoEmail;
	public long tourismApplicationId;
	public long tourismNewAccoFormId;

}