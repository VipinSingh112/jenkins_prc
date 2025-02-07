/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.manufacturing.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.manufacturing.application.form.service.model.ManuAdditionalComapnyInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ManuAdditionalComapnyInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ManuAdditionalComapnyInfoCacheModel
	implements CacheModel<ManuAdditionalComapnyInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ManuAdditionalComapnyInfoCacheModel)) {
			return false;
		}

		ManuAdditionalComapnyInfoCacheModel
			manuAdditionalComapnyInfoCacheModel =
				(ManuAdditionalComapnyInfoCacheModel)object;

		if (manuAdditionalComapnyInfoId ==
				manuAdditionalComapnyInfoCacheModel.
					manuAdditionalComapnyInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, manuAdditionalComapnyInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{manuAdditionalComapnyInfoId=");
		sb.append(manuAdditionalComapnyInfoId);
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
		sb.append(", companyNameRepresentative=");
		sb.append(companyNameRepresentative);
		sb.append(", companySignatureRepresentative=");
		sb.append(companySignatureRepresentative);
		sb.append(", signatureDate=");
		sb.append(signatureDate);
		sb.append(", customBrokerName=");
		sb.append(customBrokerName);
		sb.append(", customBrokerAddress=");
		sb.append(customBrokerAddress);
		sb.append(", telephoneNumber=");
		sb.append(telephoneNumber);
		sb.append(", brokerId=");
		sb.append(brokerId);
		sb.append(", manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ManuAdditionalComapnyInfo toEntityModel() {
		ManuAdditionalComapnyInfoImpl manuAdditionalComapnyInfoImpl =
			new ManuAdditionalComapnyInfoImpl();

		manuAdditionalComapnyInfoImpl.setManuAdditionalComapnyInfoId(
			manuAdditionalComapnyInfoId);
		manuAdditionalComapnyInfoImpl.setGroupId(groupId);
		manuAdditionalComapnyInfoImpl.setCompanyId(companyId);
		manuAdditionalComapnyInfoImpl.setUserId(userId);

		if (userName == null) {
			manuAdditionalComapnyInfoImpl.setUserName("");
		}
		else {
			manuAdditionalComapnyInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			manuAdditionalComapnyInfoImpl.setCreateDate(null);
		}
		else {
			manuAdditionalComapnyInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			manuAdditionalComapnyInfoImpl.setModifiedDate(null);
		}
		else {
			manuAdditionalComapnyInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (companyNameRepresentative == null) {
			manuAdditionalComapnyInfoImpl.setCompanyNameRepresentative("");
		}
		else {
			manuAdditionalComapnyInfoImpl.setCompanyNameRepresentative(
				companyNameRepresentative);
		}

		if (companySignatureRepresentative == null) {
			manuAdditionalComapnyInfoImpl.setCompanySignatureRepresentative("");
		}
		else {
			manuAdditionalComapnyInfoImpl.setCompanySignatureRepresentative(
				companySignatureRepresentative);
		}

		if (signatureDate == null) {
			manuAdditionalComapnyInfoImpl.setSignatureDate("");
		}
		else {
			manuAdditionalComapnyInfoImpl.setSignatureDate(signatureDate);
		}

		if (customBrokerName == null) {
			manuAdditionalComapnyInfoImpl.setCustomBrokerName("");
		}
		else {
			manuAdditionalComapnyInfoImpl.setCustomBrokerName(customBrokerName);
		}

		if (customBrokerAddress == null) {
			manuAdditionalComapnyInfoImpl.setCustomBrokerAddress("");
		}
		else {
			manuAdditionalComapnyInfoImpl.setCustomBrokerAddress(
				customBrokerAddress);
		}

		if (telephoneNumber == null) {
			manuAdditionalComapnyInfoImpl.setTelephoneNumber("");
		}
		else {
			manuAdditionalComapnyInfoImpl.setTelephoneNumber(telephoneNumber);
		}

		if (brokerId == null) {
			manuAdditionalComapnyInfoImpl.setBrokerId("");
		}
		else {
			manuAdditionalComapnyInfoImpl.setBrokerId(brokerId);
		}

		manuAdditionalComapnyInfoImpl.setManufacturingApplicationId(
			manufacturingApplicationId);

		manuAdditionalComapnyInfoImpl.resetOriginalValues();

		return manuAdditionalComapnyInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		manuAdditionalComapnyInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		companyNameRepresentative = objectInput.readUTF();
		companySignatureRepresentative = objectInput.readUTF();
		signatureDate = objectInput.readUTF();
		customBrokerName = objectInput.readUTF();
		customBrokerAddress = objectInput.readUTF();
		telephoneNumber = objectInput.readUTF();
		brokerId = objectInput.readUTF();

		manufacturingApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(manuAdditionalComapnyInfoId);

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

		if (companyNameRepresentative == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyNameRepresentative);
		}

		if (companySignatureRepresentative == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companySignatureRepresentative);
		}

		if (signatureDate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(signatureDate);
		}

		if (customBrokerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(customBrokerName);
		}

		if (customBrokerAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(customBrokerAddress);
		}

		if (telephoneNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telephoneNumber);
		}

		if (brokerId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(brokerId);
		}

		objectOutput.writeLong(manufacturingApplicationId);
	}

	public long manuAdditionalComapnyInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String companyNameRepresentative;
	public String companySignatureRepresentative;
	public String signatureDate;
	public String customBrokerName;
	public String customBrokerAddress;
	public String telephoneNumber;
	public String brokerId;
	public long manufacturingApplicationId;

}