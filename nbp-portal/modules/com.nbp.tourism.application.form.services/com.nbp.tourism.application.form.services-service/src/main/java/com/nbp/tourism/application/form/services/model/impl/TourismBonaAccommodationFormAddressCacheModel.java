/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismBonaAccommodationFormAddress;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismBonaAccommodationFormAddress in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismBonaAccommodationFormAddressCacheModel
	implements CacheModel<TourismBonaAccommodationFormAddress>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof
				TourismBonaAccommodationFormAddressCacheModel)) {

			return false;
		}

		TourismBonaAccommodationFormAddressCacheModel
			tourismBonaAccommodationFormAddressCacheModel =
				(TourismBonaAccommodationFormAddressCacheModel)object;

		if (tourismBonaAccommodationFAOOId ==
				tourismBonaAccommodationFormAddressCacheModel.
					tourismBonaAccommodationFAOOId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismBonaAccommodationFAOOId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{tourismBonaAccommodationFAOOId=");
		sb.append(tourismBonaAccommodationFAOOId);
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
		sb.append(", bonaAccoAddress=");
		sb.append(bonaAccoAddress);
		sb.append(", bonaAccoTelephoneNumber=");
		sb.append(bonaAccoTelephoneNumber);
		sb.append(", bonaAccoFaxNumber=");
		sb.append(bonaAccoFaxNumber);
		sb.append(", bonaAccoEmail=");
		sb.append(bonaAccoEmail);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append(", tourismBonaAFId=");
		sb.append(tourismBonaAFId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismBonaAccommodationFormAddress toEntityModel() {
		TourismBonaAccommodationFormAddressImpl
			tourismBonaAccommodationFormAddressImpl =
				new TourismBonaAccommodationFormAddressImpl();

		tourismBonaAccommodationFormAddressImpl.
			setTourismBonaAccommodationFAOOId(tourismBonaAccommodationFAOOId);
		tourismBonaAccommodationFormAddressImpl.setGroupId(groupId);
		tourismBonaAccommodationFormAddressImpl.setCompanyId(companyId);
		tourismBonaAccommodationFormAddressImpl.setUserId(userId);

		if (userName == null) {
			tourismBonaAccommodationFormAddressImpl.setUserName("");
		}
		else {
			tourismBonaAccommodationFormAddressImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismBonaAccommodationFormAddressImpl.setCreateDate(null);
		}
		else {
			tourismBonaAccommodationFormAddressImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismBonaAccommodationFormAddressImpl.setModifiedDate(null);
		}
		else {
			tourismBonaAccommodationFormAddressImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (addressType == null) {
			tourismBonaAccommodationFormAddressImpl.setAddressType("");
		}
		else {
			tourismBonaAccommodationFormAddressImpl.setAddressType(addressType);
		}

		if (bonaAccoAddress == null) {
			tourismBonaAccommodationFormAddressImpl.setBonaAccoAddress("");
		}
		else {
			tourismBonaAccommodationFormAddressImpl.setBonaAccoAddress(
				bonaAccoAddress);
		}

		if (bonaAccoTelephoneNumber == null) {
			tourismBonaAccommodationFormAddressImpl.setBonaAccoTelephoneNumber(
				"");
		}
		else {
			tourismBonaAccommodationFormAddressImpl.setBonaAccoTelephoneNumber(
				bonaAccoTelephoneNumber);
		}

		if (bonaAccoFaxNumber == null) {
			tourismBonaAccommodationFormAddressImpl.setBonaAccoFaxNumber("");
		}
		else {
			tourismBonaAccommodationFormAddressImpl.setBonaAccoFaxNumber(
				bonaAccoFaxNumber);
		}

		if (bonaAccoEmail == null) {
			tourismBonaAccommodationFormAddressImpl.setBonaAccoEmail("");
		}
		else {
			tourismBonaAccommodationFormAddressImpl.setBonaAccoEmail(
				bonaAccoEmail);
		}

		tourismBonaAccommodationFormAddressImpl.setTourismApplicationId(
			tourismApplicationId);
		tourismBonaAccommodationFormAddressImpl.setTourismBonaAFId(
			tourismBonaAFId);

		tourismBonaAccommodationFormAddressImpl.resetOriginalValues();

		return tourismBonaAccommodationFormAddressImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismBonaAccommodationFAOOId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		addressType = objectInput.readUTF();
		bonaAccoAddress = objectInput.readUTF();
		bonaAccoTelephoneNumber = objectInput.readUTF();
		bonaAccoFaxNumber = objectInput.readUTF();
		bonaAccoEmail = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();

		tourismBonaAFId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismBonaAccommodationFAOOId);

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

		if (bonaAccoAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAccoAddress);
		}

		if (bonaAccoTelephoneNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAccoTelephoneNumber);
		}

		if (bonaAccoFaxNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAccoFaxNumber);
		}

		if (bonaAccoEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAccoEmail);
		}

		objectOutput.writeLong(tourismApplicationId);

		objectOutput.writeLong(tourismBonaAFId);
	}

	public long tourismBonaAccommodationFAOOId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String addressType;
	public String bonaAccoAddress;
	public String bonaAccoTelephoneNumber;
	public String bonaAccoFaxNumber;
	public String bonaAccoEmail;
	public long tourismApplicationId;
	public long tourismBonaAFId;

}