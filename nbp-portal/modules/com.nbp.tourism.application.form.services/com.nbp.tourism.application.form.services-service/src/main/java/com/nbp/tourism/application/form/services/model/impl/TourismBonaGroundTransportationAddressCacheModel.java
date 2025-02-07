/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransportationAddress;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismBonaGroundTransportationAddress in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismBonaGroundTransportationAddressCacheModel
	implements CacheModel<TourismBonaGroundTransportationAddress>,
			   Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof
				TourismBonaGroundTransportationAddressCacheModel)) {

			return false;
		}

		TourismBonaGroundTransportationAddressCacheModel
			tourismBonaGroundTransportationAddressCacheModel =
				(TourismBonaGroundTransportationAddressCacheModel)object;

		if (tourismBonaGroundTransAddresId ==
				tourismBonaGroundTransportationAddressCacheModel.
					tourismBonaGroundTransAddresId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismBonaGroundTransAddresId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{tourismBonaGroundTransAddresId=");
		sb.append(tourismBonaGroundTransAddresId);
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
		sb.append(", bonaGroundAddress=");
		sb.append(bonaGroundAddress);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append(", tourismBonaGroundTransportId=");
		sb.append(tourismBonaGroundTransportId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismBonaGroundTransportationAddress toEntityModel() {
		TourismBonaGroundTransportationAddressImpl
			tourismBonaGroundTransportationAddressImpl =
				new TourismBonaGroundTransportationAddressImpl();

		tourismBonaGroundTransportationAddressImpl.
			setTourismBonaGroundTransAddresId(tourismBonaGroundTransAddresId);
		tourismBonaGroundTransportationAddressImpl.setGroupId(groupId);
		tourismBonaGroundTransportationAddressImpl.setCompanyId(companyId);
		tourismBonaGroundTransportationAddressImpl.setUserId(userId);

		if (userName == null) {
			tourismBonaGroundTransportationAddressImpl.setUserName("");
		}
		else {
			tourismBonaGroundTransportationAddressImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismBonaGroundTransportationAddressImpl.setCreateDate(null);
		}
		else {
			tourismBonaGroundTransportationAddressImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismBonaGroundTransportationAddressImpl.setModifiedDate(null);
		}
		else {
			tourismBonaGroundTransportationAddressImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (addressType == null) {
			tourismBonaGroundTransportationAddressImpl.setAddressType("");
		}
		else {
			tourismBonaGroundTransportationAddressImpl.setAddressType(
				addressType);
		}

		if (bonaGroundAddress == null) {
			tourismBonaGroundTransportationAddressImpl.setBonaGroundAddress("");
		}
		else {
			tourismBonaGroundTransportationAddressImpl.setBonaGroundAddress(
				bonaGroundAddress);
		}

		tourismBonaGroundTransportationAddressImpl.setTourismApplicationId(
			tourismApplicationId);
		tourismBonaGroundTransportationAddressImpl.
			setTourismBonaGroundTransportId(tourismBonaGroundTransportId);

		tourismBonaGroundTransportationAddressImpl.resetOriginalValues();

		return tourismBonaGroundTransportationAddressImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismBonaGroundTransAddresId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		addressType = objectInput.readUTF();
		bonaGroundAddress = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();

		tourismBonaGroundTransportId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismBonaGroundTransAddresId);

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

		if (bonaGroundAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundAddress);
		}

		objectOutput.writeLong(tourismApplicationId);

		objectOutput.writeLong(tourismBonaGroundTransportId);
	}

	public long tourismBonaGroundTransAddresId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String addressType;
	public String bonaGroundAddress;
	public long tourismApplicationId;
	public long tourismBonaGroundTransportId;

}