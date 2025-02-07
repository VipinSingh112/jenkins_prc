/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.manufacturing.application.form.service.model.ManuCompanyInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ManuCompanyInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ManuCompanyInfoCacheModel
	implements CacheModel<ManuCompanyInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ManuCompanyInfoCacheModel)) {
			return false;
		}

		ManuCompanyInfoCacheModel manuCompanyInfoCacheModel =
			(ManuCompanyInfoCacheModel)object;

		if (manuCompanyInfoId == manuCompanyInfoCacheModel.manuCompanyInfoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, manuCompanyInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{manuCompanyInfoId=");
		sb.append(manuCompanyInfoId);
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
		sb.append(", companyName=");
		sb.append(companyName);
		sb.append(", directorName=");
		sb.append(directorName);
		sb.append(", businessAddress=");
		sb.append(businessAddress);
		sb.append(", tccNumber=");
		sb.append(tccNumber);
		sb.append(", incorporationDate=");
		sb.append(incorporationDate);
		sb.append(", factoryAddress=");
		sb.append(factoryAddress);
		sb.append(", telephoneNumber=");
		sb.append(telephoneNumber);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", companyWebsite=");
		sb.append(companyWebsite);
		sb.append(", applicantTRN=");
		sb.append(applicantTRN);
		sb.append(", beneficieryTRN=");
		sb.append(beneficieryTRN);
		sb.append(", parish=");
		sb.append(parish);
		sb.append(", manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ManuCompanyInfo toEntityModel() {
		ManuCompanyInfoImpl manuCompanyInfoImpl = new ManuCompanyInfoImpl();

		manuCompanyInfoImpl.setManuCompanyInfoId(manuCompanyInfoId);
		manuCompanyInfoImpl.setGroupId(groupId);
		manuCompanyInfoImpl.setCompanyId(companyId);
		manuCompanyInfoImpl.setUserId(userId);

		if (userName == null) {
			manuCompanyInfoImpl.setUserName("");
		}
		else {
			manuCompanyInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			manuCompanyInfoImpl.setCreateDate(null);
		}
		else {
			manuCompanyInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			manuCompanyInfoImpl.setModifiedDate(null);
		}
		else {
			manuCompanyInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (companyName == null) {
			manuCompanyInfoImpl.setCompanyName("");
		}
		else {
			manuCompanyInfoImpl.setCompanyName(companyName);
		}

		if (directorName == null) {
			manuCompanyInfoImpl.setDirectorName("");
		}
		else {
			manuCompanyInfoImpl.setDirectorName(directorName);
		}

		if (businessAddress == null) {
			manuCompanyInfoImpl.setBusinessAddress("");
		}
		else {
			manuCompanyInfoImpl.setBusinessAddress(businessAddress);
		}

		if (tccNumber == null) {
			manuCompanyInfoImpl.setTccNumber("");
		}
		else {
			manuCompanyInfoImpl.setTccNumber(tccNumber);
		}

		if (incorporationDate == Long.MIN_VALUE) {
			manuCompanyInfoImpl.setIncorporationDate(null);
		}
		else {
			manuCompanyInfoImpl.setIncorporationDate(
				new Date(incorporationDate));
		}

		if (factoryAddress == null) {
			manuCompanyInfoImpl.setFactoryAddress("");
		}
		else {
			manuCompanyInfoImpl.setFactoryAddress(factoryAddress);
		}

		if (telephoneNumber == null) {
			manuCompanyInfoImpl.setTelephoneNumber("");
		}
		else {
			manuCompanyInfoImpl.setTelephoneNumber(telephoneNumber);
		}

		if (emailAddress == null) {
			manuCompanyInfoImpl.setEmailAddress("");
		}
		else {
			manuCompanyInfoImpl.setEmailAddress(emailAddress);
		}

		if (companyWebsite == null) {
			manuCompanyInfoImpl.setCompanyWebsite("");
		}
		else {
			manuCompanyInfoImpl.setCompanyWebsite(companyWebsite);
		}

		if (applicantTRN == null) {
			manuCompanyInfoImpl.setApplicantTRN("");
		}
		else {
			manuCompanyInfoImpl.setApplicantTRN(applicantTRN);
		}

		if (beneficieryTRN == null) {
			manuCompanyInfoImpl.setBeneficieryTRN("");
		}
		else {
			manuCompanyInfoImpl.setBeneficieryTRN(beneficieryTRN);
		}

		if (parish == null) {
			manuCompanyInfoImpl.setParish("");
		}
		else {
			manuCompanyInfoImpl.setParish(parish);
		}

		manuCompanyInfoImpl.setManufacturingApplicationId(
			manufacturingApplicationId);

		manuCompanyInfoImpl.resetOriginalValues();

		return manuCompanyInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		manuCompanyInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		companyName = objectInput.readUTF();
		directorName = objectInput.readUTF();
		businessAddress = objectInput.readUTF();
		tccNumber = objectInput.readUTF();
		incorporationDate = objectInput.readLong();
		factoryAddress = objectInput.readUTF();
		telephoneNumber = objectInput.readUTF();
		emailAddress = objectInput.readUTF();
		companyWebsite = objectInput.readUTF();
		applicantTRN = objectInput.readUTF();
		beneficieryTRN = objectInput.readUTF();
		parish = objectInput.readUTF();

		manufacturingApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(manuCompanyInfoId);

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

		if (companyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyName);
		}

		if (directorName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(directorName);
		}

		if (businessAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(businessAddress);
		}

		if (tccNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tccNumber);
		}

		objectOutput.writeLong(incorporationDate);

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

		if (applicantTRN == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantTRN);
		}

		if (beneficieryTRN == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(beneficieryTRN);
		}

		if (parish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(parish);
		}

		objectOutput.writeLong(manufacturingApplicationId);
	}

	public long manuCompanyInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String companyName;
	public String directorName;
	public String businessAddress;
	public String tccNumber;
	public long incorporationDate;
	public String factoryAddress;
	public String telephoneNumber;
	public String emailAddress;
	public String companyWebsite;
	public String applicantTRN;
	public String beneficieryTRN;
	public String parish;
	public long manufacturingApplicationId;

}