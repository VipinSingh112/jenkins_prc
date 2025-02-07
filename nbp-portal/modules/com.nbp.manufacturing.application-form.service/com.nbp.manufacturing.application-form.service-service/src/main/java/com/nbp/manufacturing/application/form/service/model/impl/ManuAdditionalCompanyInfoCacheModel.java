/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.manufacturing.application.form.service.model.ManuAdditionalCompanyInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ManuAdditionalCompanyInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ManuAdditionalCompanyInfoCacheModel
	implements CacheModel<ManuAdditionalCompanyInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ManuAdditionalCompanyInfoCacheModel)) {
			return false;
		}

		ManuAdditionalCompanyInfoCacheModel
			manuAdditionalCompanyInfoCacheModel =
				(ManuAdditionalCompanyInfoCacheModel)object;

		if (manuAdditionalCompanyInfoId ==
				manuAdditionalCompanyInfoCacheModel.
					manuAdditionalCompanyInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, manuAdditionalCompanyInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{manuAdditionalCompanyInfoId=");
		sb.append(manuAdditionalCompanyInfoId);
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
	public ManuAdditionalCompanyInfo toEntityModel() {
		ManuAdditionalCompanyInfoImpl manuAdditionalCompanyInfoImpl =
			new ManuAdditionalCompanyInfoImpl();

		manuAdditionalCompanyInfoImpl.setManuAdditionalCompanyInfoId(
			manuAdditionalCompanyInfoId);
		manuAdditionalCompanyInfoImpl.setGroupId(groupId);
		manuAdditionalCompanyInfoImpl.setCompanyId(companyId);
		manuAdditionalCompanyInfoImpl.setUserId(userId);

		if (userName == null) {
			manuAdditionalCompanyInfoImpl.setUserName("");
		}
		else {
			manuAdditionalCompanyInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			manuAdditionalCompanyInfoImpl.setCreateDate(null);
		}
		else {
			manuAdditionalCompanyInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			manuAdditionalCompanyInfoImpl.setModifiedDate(null);
		}
		else {
			manuAdditionalCompanyInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (companyNameRepresentative == null) {
			manuAdditionalCompanyInfoImpl.setCompanyNameRepresentative("");
		}
		else {
			manuAdditionalCompanyInfoImpl.setCompanyNameRepresentative(
				companyNameRepresentative);
		}

		if (companySignatureRepresentative == null) {
			manuAdditionalCompanyInfoImpl.setCompanySignatureRepresentative("");
		}
		else {
			manuAdditionalCompanyInfoImpl.setCompanySignatureRepresentative(
				companySignatureRepresentative);
		}

		if (signatureDate == Long.MIN_VALUE) {
			manuAdditionalCompanyInfoImpl.setSignatureDate(null);
		}
		else {
			manuAdditionalCompanyInfoImpl.setSignatureDate(
				new Date(signatureDate));
		}

		if (customBrokerName == null) {
			manuAdditionalCompanyInfoImpl.setCustomBrokerName("");
		}
		else {
			manuAdditionalCompanyInfoImpl.setCustomBrokerName(customBrokerName);
		}

		if (customBrokerAddress == null) {
			manuAdditionalCompanyInfoImpl.setCustomBrokerAddress("");
		}
		else {
			manuAdditionalCompanyInfoImpl.setCustomBrokerAddress(
				customBrokerAddress);
		}

		if (telephoneNumber == null) {
			manuAdditionalCompanyInfoImpl.setTelephoneNumber("");
		}
		else {
			manuAdditionalCompanyInfoImpl.setTelephoneNumber(telephoneNumber);
		}

		if (brokerId == null) {
			manuAdditionalCompanyInfoImpl.setBrokerId("");
		}
		else {
			manuAdditionalCompanyInfoImpl.setBrokerId(brokerId);
		}

		manuAdditionalCompanyInfoImpl.setManufacturingApplicationId(
			manufacturingApplicationId);

		manuAdditionalCompanyInfoImpl.resetOriginalValues();

		return manuAdditionalCompanyInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		manuAdditionalCompanyInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		companyNameRepresentative = objectInput.readUTF();
		companySignatureRepresentative = objectInput.readUTF();
		signatureDate = objectInput.readLong();
		customBrokerName = objectInput.readUTF();
		customBrokerAddress = objectInput.readUTF();
		telephoneNumber = objectInput.readUTF();
		brokerId = objectInput.readUTF();

		manufacturingApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(manuAdditionalCompanyInfoId);

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

		objectOutput.writeLong(signatureDate);

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

	public long manuAdditionalCompanyInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String companyNameRepresentative;
	public String companySignatureRepresentative;
	public long signatureDate;
	public String customBrokerName;
	public String customBrokerAddress;
	public String telephoneNumber;
	public String brokerId;
	public long manufacturingApplicationId;

}