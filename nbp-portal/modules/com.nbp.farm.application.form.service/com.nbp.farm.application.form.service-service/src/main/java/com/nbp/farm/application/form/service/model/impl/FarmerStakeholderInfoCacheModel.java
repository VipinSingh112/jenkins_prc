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

package com.nbp.farm.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.farm.application.form.service.model.FarmerStakeholderInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FarmerStakeholderInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FarmerStakeholderInfoCacheModel
	implements CacheModel<FarmerStakeholderInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FarmerStakeholderInfoCacheModel)) {
			return false;
		}

		FarmerStakeholderInfoCacheModel farmerStakeholderInfoCacheModel =
			(FarmerStakeholderInfoCacheModel)object;

		if (farmerStakeholderInfoId ==
				farmerStakeholderInfoCacheModel.farmerStakeholderInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, farmerStakeholderInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(63);

		sb.append("{farmerStakeholderInfoId=");
		sb.append(farmerStakeholderInfoId);
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
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", middleName=");
		sb.append(middleName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", alias=");
		sb.append(alias);
		sb.append(", residentialStreetName=");
		sb.append(residentialStreetName);
		sb.append(", residentialDistrict=");
		sb.append(residentialDistrict);
		sb.append(", residentialPostOffice=");
		sb.append(residentialPostOffice);
		sb.append(", residentialParish=");
		sb.append(residentialParish);
		sb.append(", residentialtelephoneNumber=");
		sb.append(residentialtelephoneNumber);
		sb.append(", businessStreetName=");
		sb.append(businessStreetName);
		sb.append(", businessDistrict=");
		sb.append(businessDistrict);
		sb.append(", businessPostOffice=");
		sb.append(businessPostOffice);
		sb.append(", businessParish=");
		sb.append(businessParish);
		sb.append(", businessTelephoneNumber=");
		sb.append(businessTelephoneNumber);
		sb.append(", identificationType=");
		sb.append(identificationType);
		sb.append(", identificationNumber=");
		sb.append(identificationNumber);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", dateOfBirth=");
		sb.append(dateOfBirth);
		sb.append(", taxpayerRegistrationNumber=");
		sb.append(taxpayerRegistrationNumber);
		sb.append(", cellPhone=");
		sb.append(cellPhone);
		sb.append(", fax=");
		sb.append(fax);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", farmerApplicationId=");
		sb.append(farmerApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FarmerStakeholderInfo toEntityModel() {
		FarmerStakeholderInfoImpl farmerStakeholderInfoImpl =
			new FarmerStakeholderInfoImpl();

		farmerStakeholderInfoImpl.setFarmerStakeholderInfoId(
			farmerStakeholderInfoId);
		farmerStakeholderInfoImpl.setGroupId(groupId);
		farmerStakeholderInfoImpl.setCompanyId(companyId);
		farmerStakeholderInfoImpl.setUserId(userId);

		if (userName == null) {
			farmerStakeholderInfoImpl.setUserName("");
		}
		else {
			farmerStakeholderInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			farmerStakeholderInfoImpl.setCreateDate(null);
		}
		else {
			farmerStakeholderInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			farmerStakeholderInfoImpl.setModifiedDate(null);
		}
		else {
			farmerStakeholderInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (companyName == null) {
			farmerStakeholderInfoImpl.setCompanyName("");
		}
		else {
			farmerStakeholderInfoImpl.setCompanyName(companyName);
		}

		if (firstName == null) {
			farmerStakeholderInfoImpl.setFirstName("");
		}
		else {
			farmerStakeholderInfoImpl.setFirstName(firstName);
		}

		if (middleName == null) {
			farmerStakeholderInfoImpl.setMiddleName("");
		}
		else {
			farmerStakeholderInfoImpl.setMiddleName(middleName);
		}

		if (lastName == null) {
			farmerStakeholderInfoImpl.setLastName("");
		}
		else {
			farmerStakeholderInfoImpl.setLastName(lastName);
		}

		if (alias == null) {
			farmerStakeholderInfoImpl.setAlias("");
		}
		else {
			farmerStakeholderInfoImpl.setAlias(alias);
		}

		if (residentialStreetName == null) {
			farmerStakeholderInfoImpl.setResidentialStreetName("");
		}
		else {
			farmerStakeholderInfoImpl.setResidentialStreetName(
				residentialStreetName);
		}

		if (residentialDistrict == null) {
			farmerStakeholderInfoImpl.setResidentialDistrict("");
		}
		else {
			farmerStakeholderInfoImpl.setResidentialDistrict(
				residentialDistrict);
		}

		if (residentialPostOffice == null) {
			farmerStakeholderInfoImpl.setResidentialPostOffice("");
		}
		else {
			farmerStakeholderInfoImpl.setResidentialPostOffice(
				residentialPostOffice);
		}

		if (residentialParish == null) {
			farmerStakeholderInfoImpl.setResidentialParish("");
		}
		else {
			farmerStakeholderInfoImpl.setResidentialParish(residentialParish);
		}

		if (residentialtelephoneNumber == null) {
			farmerStakeholderInfoImpl.setResidentialtelephoneNumber("");
		}
		else {
			farmerStakeholderInfoImpl.setResidentialtelephoneNumber(
				residentialtelephoneNumber);
		}

		if (businessStreetName == null) {
			farmerStakeholderInfoImpl.setBusinessStreetName("");
		}
		else {
			farmerStakeholderInfoImpl.setBusinessStreetName(businessStreetName);
		}

		if (businessDistrict == null) {
			farmerStakeholderInfoImpl.setBusinessDistrict("");
		}
		else {
			farmerStakeholderInfoImpl.setBusinessDistrict(businessDistrict);
		}

		if (businessPostOffice == null) {
			farmerStakeholderInfoImpl.setBusinessPostOffice("");
		}
		else {
			farmerStakeholderInfoImpl.setBusinessPostOffice(businessPostOffice);
		}

		if (businessParish == null) {
			farmerStakeholderInfoImpl.setBusinessParish("");
		}
		else {
			farmerStakeholderInfoImpl.setBusinessParish(businessParish);
		}

		if (businessTelephoneNumber == null) {
			farmerStakeholderInfoImpl.setBusinessTelephoneNumber("");
		}
		else {
			farmerStakeholderInfoImpl.setBusinessTelephoneNumber(
				businessTelephoneNumber);
		}

		if (identificationType == null) {
			farmerStakeholderInfoImpl.setIdentificationType("");
		}
		else {
			farmerStakeholderInfoImpl.setIdentificationType(identificationType);
		}

		if (identificationNumber == null) {
			farmerStakeholderInfoImpl.setIdentificationNumber("");
		}
		else {
			farmerStakeholderInfoImpl.setIdentificationNumber(
				identificationNumber);
		}

		if (gender == null) {
			farmerStakeholderInfoImpl.setGender("");
		}
		else {
			farmerStakeholderInfoImpl.setGender(gender);
		}

		if (dateOfBirth == Long.MIN_VALUE) {
			farmerStakeholderInfoImpl.setDateOfBirth(null);
		}
		else {
			farmerStakeholderInfoImpl.setDateOfBirth(new Date(dateOfBirth));
		}

		if (taxpayerRegistrationNumber == null) {
			farmerStakeholderInfoImpl.setTaxpayerRegistrationNumber("");
		}
		else {
			farmerStakeholderInfoImpl.setTaxpayerRegistrationNumber(
				taxpayerRegistrationNumber);
		}

		if (cellPhone == null) {
			farmerStakeholderInfoImpl.setCellPhone("");
		}
		else {
			farmerStakeholderInfoImpl.setCellPhone(cellPhone);
		}

		if (fax == null) {
			farmerStakeholderInfoImpl.setFax("");
		}
		else {
			farmerStakeholderInfoImpl.setFax(fax);
		}

		if (emailAddress == null) {
			farmerStakeholderInfoImpl.setEmailAddress("");
		}
		else {
			farmerStakeholderInfoImpl.setEmailAddress(emailAddress);
		}

		farmerStakeholderInfoImpl.setFarmerApplicationId(farmerApplicationId);

		farmerStakeholderInfoImpl.resetOriginalValues();

		return farmerStakeholderInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		farmerStakeholderInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		companyName = objectInput.readUTF();
		firstName = objectInput.readUTF();
		middleName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		alias = objectInput.readUTF();
		residentialStreetName = objectInput.readUTF();
		residentialDistrict = objectInput.readUTF();
		residentialPostOffice = objectInput.readUTF();
		residentialParish = objectInput.readUTF();
		residentialtelephoneNumber = objectInput.readUTF();
		businessStreetName = objectInput.readUTF();
		businessDistrict = objectInput.readUTF();
		businessPostOffice = objectInput.readUTF();
		businessParish = objectInput.readUTF();
		businessTelephoneNumber = objectInput.readUTF();
		identificationType = objectInput.readUTF();
		identificationNumber = objectInput.readUTF();
		gender = objectInput.readUTF();
		dateOfBirth = objectInput.readLong();
		taxpayerRegistrationNumber = objectInput.readUTF();
		cellPhone = objectInput.readUTF();
		fax = objectInput.readUTF();
		emailAddress = objectInput.readUTF();

		farmerApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(farmerStakeholderInfoId);

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

		if (firstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (middleName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(middleName);
		}

		if (lastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		if (alias == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(alias);
		}

		if (residentialStreetName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(residentialStreetName);
		}

		if (residentialDistrict == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(residentialDistrict);
		}

		if (residentialPostOffice == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(residentialPostOffice);
		}

		if (residentialParish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(residentialParish);
		}

		if (residentialtelephoneNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(residentialtelephoneNumber);
		}

		if (businessStreetName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(businessStreetName);
		}

		if (businessDistrict == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(businessDistrict);
		}

		if (businessPostOffice == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(businessPostOffice);
		}

		if (businessParish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(businessParish);
		}

		if (businessTelephoneNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(businessTelephoneNumber);
		}

		if (identificationType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(identificationType);
		}

		if (identificationNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(identificationNumber);
		}

		if (gender == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(gender);
		}

		objectOutput.writeLong(dateOfBirth);

		if (taxpayerRegistrationNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(taxpayerRegistrationNumber);
		}

		if (cellPhone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cellPhone);
		}

		if (fax == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fax);
		}

		if (emailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailAddress);
		}

		objectOutput.writeLong(farmerApplicationId);
	}

	public long farmerStakeholderInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String companyName;
	public String firstName;
	public String middleName;
	public String lastName;
	public String alias;
	public String residentialStreetName;
	public String residentialDistrict;
	public String residentialPostOffice;
	public String residentialParish;
	public String residentialtelephoneNumber;
	public String businessStreetName;
	public String businessDistrict;
	public String businessPostOffice;
	public String businessParish;
	public String businessTelephoneNumber;
	public String identificationType;
	public String identificationNumber;
	public String gender;
	public long dateOfBirth;
	public String taxpayerRegistrationNumber;
	public String cellPhone;
	public String fax;
	public String emailAddress;
	public long farmerApplicationId;

}