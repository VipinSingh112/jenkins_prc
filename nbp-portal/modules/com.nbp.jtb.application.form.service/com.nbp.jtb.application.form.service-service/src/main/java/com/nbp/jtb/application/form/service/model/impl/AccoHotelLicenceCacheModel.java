/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.AccoHotelLicence;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccoHotelLicence in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccoHotelLicenceCacheModel
	implements CacheModel<AccoHotelLicence>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccoHotelLicenceCacheModel)) {
			return false;
		}

		AccoHotelLicenceCacheModel accoHotelLicenceCacheModel =
			(AccoHotelLicenceCacheModel)object;

		if (accoHotelLicenceId ==
				accoHotelLicenceCacheModel.accoHotelLicenceId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accoHotelLicenceId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", accoHotelLicenceId=");
		sb.append(accoHotelLicenceId);
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
		sb.append(", nameOfOwner=");
		sb.append(nameOfOwner);
		sb.append(", nameOfHotel=");
		sb.append(nameOfHotel);
		sb.append(", telephoneNo=");
		sb.append(telephoneNo);
		sb.append(", faxNo=");
		sb.append(faxNo);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", parish=");
		sb.append(parish);
		sb.append(", address=");
		sb.append(address);
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AccoHotelLicence toEntityModel() {
		AccoHotelLicenceImpl accoHotelLicenceImpl = new AccoHotelLicenceImpl();

		if (uuid == null) {
			accoHotelLicenceImpl.setUuid("");
		}
		else {
			accoHotelLicenceImpl.setUuid(uuid);
		}

		accoHotelLicenceImpl.setAccoHotelLicenceId(accoHotelLicenceId);
		accoHotelLicenceImpl.setGroupId(groupId);
		accoHotelLicenceImpl.setCompanyId(companyId);
		accoHotelLicenceImpl.setUserId(userId);

		if (userName == null) {
			accoHotelLicenceImpl.setUserName("");
		}
		else {
			accoHotelLicenceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accoHotelLicenceImpl.setCreateDate(null);
		}
		else {
			accoHotelLicenceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accoHotelLicenceImpl.setModifiedDate(null);
		}
		else {
			accoHotelLicenceImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (nameOfOwner == null) {
			accoHotelLicenceImpl.setNameOfOwner("");
		}
		else {
			accoHotelLicenceImpl.setNameOfOwner(nameOfOwner);
		}

		if (nameOfHotel == null) {
			accoHotelLicenceImpl.setNameOfHotel("");
		}
		else {
			accoHotelLicenceImpl.setNameOfHotel(nameOfHotel);
		}

		if (telephoneNo == null) {
			accoHotelLicenceImpl.setTelephoneNo("");
		}
		else {
			accoHotelLicenceImpl.setTelephoneNo(telephoneNo);
		}

		if (faxNo == null) {
			accoHotelLicenceImpl.setFaxNo("");
		}
		else {
			accoHotelLicenceImpl.setFaxNo(faxNo);
		}

		if (emailAddress == null) {
			accoHotelLicenceImpl.setEmailAddress("");
		}
		else {
			accoHotelLicenceImpl.setEmailAddress(emailAddress);
		}

		if (parish == null) {
			accoHotelLicenceImpl.setParish("");
		}
		else {
			accoHotelLicenceImpl.setParish(parish);
		}

		if (address == null) {
			accoHotelLicenceImpl.setAddress("");
		}
		else {
			accoHotelLicenceImpl.setAddress(address);
		}

		accoHotelLicenceImpl.setJtbApplicationId(jtbApplicationId);

		accoHotelLicenceImpl.resetOriginalValues();

		return accoHotelLicenceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		accoHotelLicenceId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nameOfOwner = objectInput.readUTF();
		nameOfHotel = objectInput.readUTF();
		telephoneNo = objectInput.readUTF();
		faxNo = objectInput.readUTF();
		emailAddress = objectInput.readUTF();
		parish = objectInput.readUTF();
		address = objectInput.readUTF();

		jtbApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(accoHotelLicenceId);

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

		if (nameOfOwner == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfOwner);
		}

		if (nameOfHotel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfHotel);
		}

		if (telephoneNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telephoneNo);
		}

		if (faxNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(faxNo);
		}

		if (emailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailAddress);
		}

		if (parish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(parish);
		}

		if (address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address);
		}

		objectOutput.writeLong(jtbApplicationId);
	}

	public String uuid;
	public long accoHotelLicenceId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nameOfOwner;
	public String nameOfHotel;
	public String telephoneNo;
	public String faxNo;
	public String emailAddress;
	public String parish;
	public String address;
	public long jtbApplicationId;

}