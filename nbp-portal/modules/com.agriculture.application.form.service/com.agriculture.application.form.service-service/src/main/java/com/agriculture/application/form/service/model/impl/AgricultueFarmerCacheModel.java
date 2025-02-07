/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.model.impl;

import com.agriculture.application.form.service.model.AgricultueFarmer;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AgricultueFarmer in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AgricultueFarmerCacheModel
	implements CacheModel<AgricultueFarmer>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AgricultueFarmerCacheModel)) {
			return false;
		}

		AgricultueFarmerCacheModel agricultueFarmerCacheModel =
			(AgricultueFarmerCacheModel)object;

		if (agricultueFarmerId ==
				agricultueFarmerCacheModel.agricultueFarmerId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, agricultueFarmerId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{agricultueFarmerId=");
		sb.append(agricultueFarmerId);
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
		sb.append(", farmerDetail=");
		sb.append(farmerDetail);
		sb.append(", nameOfApplicant=");
		sb.append(nameOfApplicant);
		sb.append(", nameOfFarm=");
		sb.append(nameOfFarm);
		sb.append(", nameOfProprietor=");
		sb.append(nameOfProprietor);
		sb.append(", parishAddress=");
		sb.append(parishAddress);
		sb.append(", localAddress=");
		sb.append(localAddress);
		sb.append(", taxpayerRegistrationNumber=");
		sb.append(taxpayerRegistrationNumber);
		sb.append(", farmerRegistrationNumber=");
		sb.append(farmerRegistrationNumber);
		sb.append(", dateOfIncorporation=");
		sb.append(dateOfIncorporation);
		sb.append(", telephoneNumber=");
		sb.append(telephoneNumber);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", agricultureApplicationId=");
		sb.append(agricultureApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AgricultueFarmer toEntityModel() {
		AgricultueFarmerImpl agricultueFarmerImpl = new AgricultueFarmerImpl();

		agricultueFarmerImpl.setAgricultueFarmerId(agricultueFarmerId);
		agricultueFarmerImpl.setGroupId(groupId);
		agricultueFarmerImpl.setCompanyId(companyId);
		agricultueFarmerImpl.setUserId(userId);

		if (userName == null) {
			agricultueFarmerImpl.setUserName("");
		}
		else {
			agricultueFarmerImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			agricultueFarmerImpl.setCreateDate(null);
		}
		else {
			agricultueFarmerImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			agricultueFarmerImpl.setModifiedDate(null);
		}
		else {
			agricultueFarmerImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (farmerDetail == null) {
			agricultueFarmerImpl.setFarmerDetail("");
		}
		else {
			agricultueFarmerImpl.setFarmerDetail(farmerDetail);
		}

		if (nameOfApplicant == null) {
			agricultueFarmerImpl.setNameOfApplicant("");
		}
		else {
			agricultueFarmerImpl.setNameOfApplicant(nameOfApplicant);
		}

		if (nameOfFarm == null) {
			agricultueFarmerImpl.setNameOfFarm("");
		}
		else {
			agricultueFarmerImpl.setNameOfFarm(nameOfFarm);
		}

		if (nameOfProprietor == null) {
			agricultueFarmerImpl.setNameOfProprietor("");
		}
		else {
			agricultueFarmerImpl.setNameOfProprietor(nameOfProprietor);
		}

		if (parishAddress == null) {
			agricultueFarmerImpl.setParishAddress("");
		}
		else {
			agricultueFarmerImpl.setParishAddress(parishAddress);
		}

		if (localAddress == null) {
			agricultueFarmerImpl.setLocalAddress("");
		}
		else {
			agricultueFarmerImpl.setLocalAddress(localAddress);
		}

		if (taxpayerRegistrationNumber == null) {
			agricultueFarmerImpl.setTaxpayerRegistrationNumber("");
		}
		else {
			agricultueFarmerImpl.setTaxpayerRegistrationNumber(
				taxpayerRegistrationNumber);
		}

		if (farmerRegistrationNumber == null) {
			agricultueFarmerImpl.setFarmerRegistrationNumber("");
		}
		else {
			agricultueFarmerImpl.setFarmerRegistrationNumber(
				farmerRegistrationNumber);
		}

		if (dateOfIncorporation == Long.MIN_VALUE) {
			agricultueFarmerImpl.setDateOfIncorporation(null);
		}
		else {
			agricultueFarmerImpl.setDateOfIncorporation(
				new Date(dateOfIncorporation));
		}

		if (telephoneNumber == null) {
			agricultueFarmerImpl.setTelephoneNumber("");
		}
		else {
			agricultueFarmerImpl.setTelephoneNumber(telephoneNumber);
		}

		if (emailAddress == null) {
			agricultueFarmerImpl.setEmailAddress("");
		}
		else {
			agricultueFarmerImpl.setEmailAddress(emailAddress);
		}

		agricultueFarmerImpl.setAgricultureApplicationId(
			agricultureApplicationId);

		agricultueFarmerImpl.resetOriginalValues();

		return agricultueFarmerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		agricultueFarmerId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		farmerDetail = objectInput.readUTF();
		nameOfApplicant = objectInput.readUTF();
		nameOfFarm = objectInput.readUTF();
		nameOfProprietor = objectInput.readUTF();
		parishAddress = objectInput.readUTF();
		localAddress = objectInput.readUTF();
		taxpayerRegistrationNumber = objectInput.readUTF();
		farmerRegistrationNumber = objectInput.readUTF();
		dateOfIncorporation = objectInput.readLong();
		telephoneNumber = objectInput.readUTF();
		emailAddress = objectInput.readUTF();

		agricultureApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(agricultueFarmerId);

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

		if (farmerDetail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(farmerDetail);
		}

		if (nameOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfApplicant);
		}

		if (nameOfFarm == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfFarm);
		}

		if (nameOfProprietor == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfProprietor);
		}

		if (parishAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(parishAddress);
		}

		if (localAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(localAddress);
		}

		if (taxpayerRegistrationNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(taxpayerRegistrationNumber);
		}

		if (farmerRegistrationNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(farmerRegistrationNumber);
		}

		objectOutput.writeLong(dateOfIncorporation);

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

		objectOutput.writeLong(agricultureApplicationId);
	}

	public long agricultueFarmerId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String farmerDetail;
	public String nameOfApplicant;
	public String nameOfFarm;
	public String nameOfProprietor;
	public String parishAddress;
	public String localAddress;
	public String taxpayerRegistrationNumber;
	public String farmerRegistrationNumber;
	public long dateOfIncorporation;
	public String telephoneNumber;
	public String emailAddress;
	public long agricultureApplicationId;

}