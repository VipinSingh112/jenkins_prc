/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismNewAttractionFormFirstAddress;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismNewAttractionFormFirstAddress in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismNewAttractionFormFirstAddressCacheModel
	implements CacheModel<TourismNewAttractionFormFirstAddress>,
			   Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof
				TourismNewAttractionFormFirstAddressCacheModel)) {

			return false;
		}

		TourismNewAttractionFormFirstAddressCacheModel
			tourismNewAttractionFormFirstAddressCacheModel =
				(TourismNewAttractionFormFirstAddressCacheModel)object;

		if (tourismNewAttractionFormFAOOId ==
				tourismNewAttractionFormFirstAddressCacheModel.
					tourismNewAttractionFormFAOOId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismNewAttractionFormFAOOId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{tourismNewAttractionFormFAOOId=");
		sb.append(tourismNewAttractionFormFAOOId);
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
		sb.append(", attractionAddress=");
		sb.append(attractionAddress);
		sb.append(", attractionTelephoneNumber=");
		sb.append(attractionTelephoneNumber);
		sb.append(", attractionFaxNumber=");
		sb.append(attractionFaxNumber);
		sb.append(", attractionEmail=");
		sb.append(attractionEmail);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append(", tourismNewAttractFormFirstId=");
		sb.append(tourismNewAttractFormFirstId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismNewAttractionFormFirstAddress toEntityModel() {
		TourismNewAttractionFormFirstAddressImpl
			tourismNewAttractionFormFirstAddressImpl =
				new TourismNewAttractionFormFirstAddressImpl();

		tourismNewAttractionFormFirstAddressImpl.
			setTourismNewAttractionFormFAOOId(tourismNewAttractionFormFAOOId);
		tourismNewAttractionFormFirstAddressImpl.setGroupId(groupId);
		tourismNewAttractionFormFirstAddressImpl.setCompanyId(companyId);
		tourismNewAttractionFormFirstAddressImpl.setUserId(userId);

		if (userName == null) {
			tourismNewAttractionFormFirstAddressImpl.setUserName("");
		}
		else {
			tourismNewAttractionFormFirstAddressImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismNewAttractionFormFirstAddressImpl.setCreateDate(null);
		}
		else {
			tourismNewAttractionFormFirstAddressImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismNewAttractionFormFirstAddressImpl.setModifiedDate(null);
		}
		else {
			tourismNewAttractionFormFirstAddressImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (addressType == null) {
			tourismNewAttractionFormFirstAddressImpl.setAddressType("");
		}
		else {
			tourismNewAttractionFormFirstAddressImpl.setAddressType(
				addressType);
		}

		if (attractionAddress == null) {
			tourismNewAttractionFormFirstAddressImpl.setAttractionAddress("");
		}
		else {
			tourismNewAttractionFormFirstAddressImpl.setAttractionAddress(
				attractionAddress);
		}

		if (attractionTelephoneNumber == null) {
			tourismNewAttractionFormFirstAddressImpl.
				setAttractionTelephoneNumber("");
		}
		else {
			tourismNewAttractionFormFirstAddressImpl.
				setAttractionTelephoneNumber(attractionTelephoneNumber);
		}

		if (attractionFaxNumber == null) {
			tourismNewAttractionFormFirstAddressImpl.setAttractionFaxNumber("");
		}
		else {
			tourismNewAttractionFormFirstAddressImpl.setAttractionFaxNumber(
				attractionFaxNumber);
		}

		if (attractionEmail == null) {
			tourismNewAttractionFormFirstAddressImpl.setAttractionEmail("");
		}
		else {
			tourismNewAttractionFormFirstAddressImpl.setAttractionEmail(
				attractionEmail);
		}

		tourismNewAttractionFormFirstAddressImpl.setTourismApplicationId(
			tourismApplicationId);
		tourismNewAttractionFormFirstAddressImpl.
			setTourismNewAttractFormFirstId(tourismNewAttractFormFirstId);

		tourismNewAttractionFormFirstAddressImpl.resetOriginalValues();

		return tourismNewAttractionFormFirstAddressImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismNewAttractionFormFAOOId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		addressType = objectInput.readUTF();
		attractionAddress = objectInput.readUTF();
		attractionTelephoneNumber = objectInput.readUTF();
		attractionFaxNumber = objectInput.readUTF();
		attractionEmail = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();

		tourismNewAttractFormFirstId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismNewAttractionFormFAOOId);

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

		if (attractionAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(attractionAddress);
		}

		if (attractionTelephoneNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(attractionTelephoneNumber);
		}

		if (attractionFaxNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(attractionFaxNumber);
		}

		if (attractionEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(attractionEmail);
		}

		objectOutput.writeLong(tourismApplicationId);

		objectOutput.writeLong(tourismNewAttractFormFirstId);
	}

	public long tourismNewAttractionFormFAOOId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String addressType;
	public String attractionAddress;
	public String attractionTelephoneNumber;
	public String attractionFaxNumber;
	public String attractionEmail;
	public long tourismApplicationId;
	public long tourismNewAttractFormFirstId;

}