/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.manufacturing.application.form.service.model.ManuCompanyInfoAddress;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ManuCompanyInfoAddress in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ManuCompanyInfoAddressCacheModel
	implements CacheModel<ManuCompanyInfoAddress>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ManuCompanyInfoAddressCacheModel)) {
			return false;
		}

		ManuCompanyInfoAddressCacheModel manuCompanyInfoAddressCacheModel =
			(ManuCompanyInfoAddressCacheModel)object;

		if (manuCompanyInfoAddressId ==
				manuCompanyInfoAddressCacheModel.manuCompanyInfoAddressId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, manuCompanyInfoAddressId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{manuCompanyInfoAddressId=");
		sb.append(manuCompanyInfoAddressId);
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
		sb.append(", factoryAddress=");
		sb.append(factoryAddress);
		sb.append(", telephoneNumber=");
		sb.append(telephoneNumber);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", companyWebsite=");
		sb.append(companyWebsite);
		sb.append(", parish=");
		sb.append(parish);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);
		sb.append(", manuCompanyInfoId=");
		sb.append(manuCompanyInfoId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ManuCompanyInfoAddress toEntityModel() {
		ManuCompanyInfoAddressImpl manuCompanyInfoAddressImpl =
			new ManuCompanyInfoAddressImpl();

		manuCompanyInfoAddressImpl.setManuCompanyInfoAddressId(
			manuCompanyInfoAddressId);
		manuCompanyInfoAddressImpl.setGroupId(groupId);
		manuCompanyInfoAddressImpl.setCompanyId(companyId);
		manuCompanyInfoAddressImpl.setUserId(userId);

		if (userName == null) {
			manuCompanyInfoAddressImpl.setUserName("");
		}
		else {
			manuCompanyInfoAddressImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			manuCompanyInfoAddressImpl.setCreateDate(null);
		}
		else {
			manuCompanyInfoAddressImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			manuCompanyInfoAddressImpl.setModifiedDate(null);
		}
		else {
			manuCompanyInfoAddressImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (factoryAddress == null) {
			manuCompanyInfoAddressImpl.setFactoryAddress("");
		}
		else {
			manuCompanyInfoAddressImpl.setFactoryAddress(factoryAddress);
		}

		if (telephoneNumber == null) {
			manuCompanyInfoAddressImpl.setTelephoneNumber("");
		}
		else {
			manuCompanyInfoAddressImpl.setTelephoneNumber(telephoneNumber);
		}

		if (emailAddress == null) {
			manuCompanyInfoAddressImpl.setEmailAddress("");
		}
		else {
			manuCompanyInfoAddressImpl.setEmailAddress(emailAddress);
		}

		if (companyWebsite == null) {
			manuCompanyInfoAddressImpl.setCompanyWebsite("");
		}
		else {
			manuCompanyInfoAddressImpl.setCompanyWebsite(companyWebsite);
		}

		if (parish == null) {
			manuCompanyInfoAddressImpl.setParish("");
		}
		else {
			manuCompanyInfoAddressImpl.setParish(parish);
		}

		if (counter == null) {
			manuCompanyInfoAddressImpl.setCounter("");
		}
		else {
			manuCompanyInfoAddressImpl.setCounter(counter);
		}

		manuCompanyInfoAddressImpl.setManufacturingApplicationId(
			manufacturingApplicationId);
		manuCompanyInfoAddressImpl.setManuCompanyInfoId(manuCompanyInfoId);

		manuCompanyInfoAddressImpl.resetOriginalValues();

		return manuCompanyInfoAddressImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		manuCompanyInfoAddressId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		factoryAddress = objectInput.readUTF();
		telephoneNumber = objectInput.readUTF();
		emailAddress = objectInput.readUTF();
		companyWebsite = objectInput.readUTF();
		parish = objectInput.readUTF();
		counter = objectInput.readUTF();

		manufacturingApplicationId = objectInput.readLong();

		manuCompanyInfoId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(manuCompanyInfoAddressId);

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

		if (factoryAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(factoryAddress);
		}

		if (telephoneNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telephoneNumber);
		}

		if (emailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailAddress);
		}

		if (companyWebsite == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyWebsite);
		}

		if (parish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(parish);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(manufacturingApplicationId);

		objectOutput.writeLong(manuCompanyInfoId);
	}

	public long manuCompanyInfoAddressId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String factoryAddress;
	public String telephoneNumber;
	public String emailAddress;
	public String companyWebsite;
	public String parish;
	public String counter;
	public long manufacturingApplicationId;
	public long manuCompanyInfoId;

}