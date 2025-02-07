/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismBonaAttractionFormFirstAddress;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismBonaAttractionFormFirstAddress in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismBonaAttractionFormFirstAddressCacheModel
	implements CacheModel<TourismBonaAttractionFormFirstAddress>,
			   Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof
				TourismBonaAttractionFormFirstAddressCacheModel)) {

			return false;
		}

		TourismBonaAttractionFormFirstAddressCacheModel
			tourismBonaAttractionFormFirstAddressCacheModel =
				(TourismBonaAttractionFormFirstAddressCacheModel)object;

		if (tourismBonaAttractionFFAOOId ==
				tourismBonaAttractionFormFirstAddressCacheModel.
					tourismBonaAttractionFFAOOId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismBonaAttractionFFAOOId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{tourismBonaAttractionFFAOOId=");
		sb.append(tourismBonaAttractionFFAOOId);
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
		sb.append(", bonaAttractAddress=");
		sb.append(bonaAttractAddress);
		sb.append(", bonaAttractionTelephoneNo=");
		sb.append(bonaAttractionTelephoneNo);
		sb.append(", bonaAttractionFaxNumber=");
		sb.append(bonaAttractionFaxNumber);
		sb.append(", bonaAttractionEmail=");
		sb.append(bonaAttractionEmail);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append(", tourismBonaAttractFormFirstId=");
		sb.append(tourismBonaAttractFormFirstId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismBonaAttractionFormFirstAddress toEntityModel() {
		TourismBonaAttractionFormFirstAddressImpl
			tourismBonaAttractionFormFirstAddressImpl =
				new TourismBonaAttractionFormFirstAddressImpl();

		tourismBonaAttractionFormFirstAddressImpl.
			setTourismBonaAttractionFFAOOId(tourismBonaAttractionFFAOOId);
		tourismBonaAttractionFormFirstAddressImpl.setGroupId(groupId);
		tourismBonaAttractionFormFirstAddressImpl.setCompanyId(companyId);
		tourismBonaAttractionFormFirstAddressImpl.setUserId(userId);

		if (userName == null) {
			tourismBonaAttractionFormFirstAddressImpl.setUserName("");
		}
		else {
			tourismBonaAttractionFormFirstAddressImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismBonaAttractionFormFirstAddressImpl.setCreateDate(null);
		}
		else {
			tourismBonaAttractionFormFirstAddressImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismBonaAttractionFormFirstAddressImpl.setModifiedDate(null);
		}
		else {
			tourismBonaAttractionFormFirstAddressImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (addressType == null) {
			tourismBonaAttractionFormFirstAddressImpl.setAddressType("");
		}
		else {
			tourismBonaAttractionFormFirstAddressImpl.setAddressType(
				addressType);
		}

		if (bonaAttractAddress == null) {
			tourismBonaAttractionFormFirstAddressImpl.setBonaAttractAddress("");
		}
		else {
			tourismBonaAttractionFormFirstAddressImpl.setBonaAttractAddress(
				bonaAttractAddress);
		}

		if (bonaAttractionTelephoneNo == null) {
			tourismBonaAttractionFormFirstAddressImpl.
				setBonaAttractionTelephoneNo("");
		}
		else {
			tourismBonaAttractionFormFirstAddressImpl.
				setBonaAttractionTelephoneNo(bonaAttractionTelephoneNo);
		}

		if (bonaAttractionFaxNumber == null) {
			tourismBonaAttractionFormFirstAddressImpl.
				setBonaAttractionFaxNumber("");
		}
		else {
			tourismBonaAttractionFormFirstAddressImpl.
				setBonaAttractionFaxNumber(bonaAttractionFaxNumber);
		}

		if (bonaAttractionEmail == null) {
			tourismBonaAttractionFormFirstAddressImpl.setBonaAttractionEmail(
				"");
		}
		else {
			tourismBonaAttractionFormFirstAddressImpl.setBonaAttractionEmail(
				bonaAttractionEmail);
		}

		tourismBonaAttractionFormFirstAddressImpl.setTourismApplicationId(
			tourismApplicationId);
		tourismBonaAttractionFormFirstAddressImpl.
			setTourismBonaAttractFormFirstId(tourismBonaAttractFormFirstId);

		tourismBonaAttractionFormFirstAddressImpl.resetOriginalValues();

		return tourismBonaAttractionFormFirstAddressImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismBonaAttractionFFAOOId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		addressType = objectInput.readUTF();
		bonaAttractAddress = objectInput.readUTF();
		bonaAttractionTelephoneNo = objectInput.readUTF();
		bonaAttractionFaxNumber = objectInput.readUTF();
		bonaAttractionEmail = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();

		tourismBonaAttractFormFirstId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismBonaAttractionFFAOOId);

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

		if (bonaAttractAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAttractAddress);
		}

		if (bonaAttractionTelephoneNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAttractionTelephoneNo);
		}

		if (bonaAttractionFaxNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAttractionFaxNumber);
		}

		if (bonaAttractionEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAttractionEmail);
		}

		objectOutput.writeLong(tourismApplicationId);

		objectOutput.writeLong(tourismBonaAttractFormFirstId);
	}

	public long tourismBonaAttractionFFAOOId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String addressType;
	public String bonaAttractAddress;
	public String bonaAttractionTelephoneNo;
	public String bonaAttractionFaxNumber;
	public String bonaAttractionEmail;
	public long tourismApplicationId;
	public long tourismBonaAttractFormFirstId;

}