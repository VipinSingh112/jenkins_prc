/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismBonaWaterSportsFormFirstAddress;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismBonaWaterSportsFormFirstAddress in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismBonaWaterSportsFormFirstAddressCacheModel
	implements CacheModel<TourismBonaWaterSportsFormFirstAddress>,
			   Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof
				TourismBonaWaterSportsFormFirstAddressCacheModel)) {

			return false;
		}

		TourismBonaWaterSportsFormFirstAddressCacheModel
			tourismBonaWaterSportsFormFirstAddressCacheModel =
				(TourismBonaWaterSportsFormFirstAddressCacheModel)object;

		if (tourismBonaWaterSportsFFAId ==
				tourismBonaWaterSportsFormFirstAddressCacheModel.
					tourismBonaWaterSportsFFAId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismBonaWaterSportsFFAId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{tourismBonaWaterSportsFFAId=");
		sb.append(tourismBonaWaterSportsFFAId);
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
		sb.append(", bonaWaterAddress=");
		sb.append(bonaWaterAddress);
		sb.append(", bonaWaterTeleNo=");
		sb.append(bonaWaterTeleNo);
		sb.append(", bonaWaterFaxNo=");
		sb.append(bonaWaterFaxNo);
		sb.append(", bonaWaterEmail=");
		sb.append(bonaWaterEmail);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append(", tourismBonaWaterSFFirstId=");
		sb.append(tourismBonaWaterSFFirstId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismBonaWaterSportsFormFirstAddress toEntityModel() {
		TourismBonaWaterSportsFormFirstAddressImpl
			tourismBonaWaterSportsFormFirstAddressImpl =
				new TourismBonaWaterSportsFormFirstAddressImpl();

		tourismBonaWaterSportsFormFirstAddressImpl.
			setTourismBonaWaterSportsFFAId(tourismBonaWaterSportsFFAId);
		tourismBonaWaterSportsFormFirstAddressImpl.setGroupId(groupId);
		tourismBonaWaterSportsFormFirstAddressImpl.setCompanyId(companyId);
		tourismBonaWaterSportsFormFirstAddressImpl.setUserId(userId);

		if (userName == null) {
			tourismBonaWaterSportsFormFirstAddressImpl.setUserName("");
		}
		else {
			tourismBonaWaterSportsFormFirstAddressImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismBonaWaterSportsFormFirstAddressImpl.setCreateDate(null);
		}
		else {
			tourismBonaWaterSportsFormFirstAddressImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismBonaWaterSportsFormFirstAddressImpl.setModifiedDate(null);
		}
		else {
			tourismBonaWaterSportsFormFirstAddressImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (addressType == null) {
			tourismBonaWaterSportsFormFirstAddressImpl.setAddressType("");
		}
		else {
			tourismBonaWaterSportsFormFirstAddressImpl.setAddressType(
				addressType);
		}

		if (bonaWaterAddress == null) {
			tourismBonaWaterSportsFormFirstAddressImpl.setBonaWaterAddress("");
		}
		else {
			tourismBonaWaterSportsFormFirstAddressImpl.setBonaWaterAddress(
				bonaWaterAddress);
		}

		if (bonaWaterTeleNo == null) {
			tourismBonaWaterSportsFormFirstAddressImpl.setBonaWaterTeleNo("");
		}
		else {
			tourismBonaWaterSportsFormFirstAddressImpl.setBonaWaterTeleNo(
				bonaWaterTeleNo);
		}

		if (bonaWaterFaxNo == null) {
			tourismBonaWaterSportsFormFirstAddressImpl.setBonaWaterFaxNo("");
		}
		else {
			tourismBonaWaterSportsFormFirstAddressImpl.setBonaWaterFaxNo(
				bonaWaterFaxNo);
		}

		if (bonaWaterEmail == null) {
			tourismBonaWaterSportsFormFirstAddressImpl.setBonaWaterEmail("");
		}
		else {
			tourismBonaWaterSportsFormFirstAddressImpl.setBonaWaterEmail(
				bonaWaterEmail);
		}

		tourismBonaWaterSportsFormFirstAddressImpl.setTourismApplicationId(
			tourismApplicationId);
		tourismBonaWaterSportsFormFirstAddressImpl.setTourismBonaWaterSFFirstId(
			tourismBonaWaterSFFirstId);

		tourismBonaWaterSportsFormFirstAddressImpl.resetOriginalValues();

		return tourismBonaWaterSportsFormFirstAddressImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismBonaWaterSportsFFAId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		addressType = objectInput.readUTF();
		bonaWaterAddress = objectInput.readUTF();
		bonaWaterTeleNo = objectInput.readUTF();
		bonaWaterFaxNo = objectInput.readUTF();
		bonaWaterEmail = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();

		tourismBonaWaterSFFirstId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismBonaWaterSportsFFAId);

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

		if (bonaWaterAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaWaterAddress);
		}

		if (bonaWaterTeleNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaWaterTeleNo);
		}

		if (bonaWaterFaxNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaWaterFaxNo);
		}

		if (bonaWaterEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaWaterEmail);
		}

		objectOutput.writeLong(tourismApplicationId);

		objectOutput.writeLong(tourismBonaWaterSFFirstId);
	}

	public long tourismBonaWaterSportsFFAId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String addressType;
	public String bonaWaterAddress;
	public String bonaWaterTeleNo;
	public String bonaWaterFaxNo;
	public String bonaWaterEmail;
	public long tourismApplicationId;
	public long tourismBonaWaterSFFirstId;

}