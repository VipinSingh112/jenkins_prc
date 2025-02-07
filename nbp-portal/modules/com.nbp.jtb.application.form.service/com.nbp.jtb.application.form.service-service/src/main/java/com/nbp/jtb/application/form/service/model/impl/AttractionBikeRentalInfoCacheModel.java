/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.AttractionBikeRentalInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AttractionBikeRentalInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AttractionBikeRentalInfoCacheModel
	implements CacheModel<AttractionBikeRentalInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AttractionBikeRentalInfoCacheModel)) {
			return false;
		}

		AttractionBikeRentalInfoCacheModel attractionBikeRentalInfoCacheModel =
			(AttractionBikeRentalInfoCacheModel)object;

		if (attractionBikeRentalInfoId ==
				attractionBikeRentalInfoCacheModel.attractionBikeRentalInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, attractionBikeRentalInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{attractionBikeRentalInfoId=");
		sb.append(attractionBikeRentalInfoId);
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
		sb.append(", applicantName=");
		sb.append(applicantName);
		sb.append(", address=");
		sb.append(address);
		sb.append(", companyName=");
		sb.append(companyName);
		sb.append(", exactLocation=");
		sb.append(exactLocation);
		sb.append(", telephone=");
		sb.append(telephone);
		sb.append(", email=");
		sb.append(email);
		sb.append(", registrationDate=");
		sb.append(registrationDate);
		sb.append(", managerName=");
		sb.append(managerName);
		sb.append(", numberOfBikes=");
		sb.append(numberOfBikes);
		sb.append(", numberOfHelmets=");
		sb.append(numberOfHelmets);
		sb.append(", numberOfEmployees=");
		sb.append(numberOfEmployees);
		sb.append(", signatureDate=");
		sb.append(signatureDate);
		sb.append(", motorBikeIndustry=");
		sb.append(motorBikeIndustry);
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AttractionBikeRentalInfo toEntityModel() {
		AttractionBikeRentalInfoImpl attractionBikeRentalInfoImpl =
			new AttractionBikeRentalInfoImpl();

		attractionBikeRentalInfoImpl.setAttractionBikeRentalInfoId(
			attractionBikeRentalInfoId);
		attractionBikeRentalInfoImpl.setGroupId(groupId);
		attractionBikeRentalInfoImpl.setCompanyId(companyId);
		attractionBikeRentalInfoImpl.setUserId(userId);

		if (userName == null) {
			attractionBikeRentalInfoImpl.setUserName("");
		}
		else {
			attractionBikeRentalInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			attractionBikeRentalInfoImpl.setCreateDate(null);
		}
		else {
			attractionBikeRentalInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			attractionBikeRentalInfoImpl.setModifiedDate(null);
		}
		else {
			attractionBikeRentalInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (applicantName == null) {
			attractionBikeRentalInfoImpl.setApplicantName("");
		}
		else {
			attractionBikeRentalInfoImpl.setApplicantName(applicantName);
		}

		if (address == null) {
			attractionBikeRentalInfoImpl.setAddress("");
		}
		else {
			attractionBikeRentalInfoImpl.setAddress(address);
		}

		if (companyName == null) {
			attractionBikeRentalInfoImpl.setCompanyName("");
		}
		else {
			attractionBikeRentalInfoImpl.setCompanyName(companyName);
		}

		if (exactLocation == null) {
			attractionBikeRentalInfoImpl.setExactLocation("");
		}
		else {
			attractionBikeRentalInfoImpl.setExactLocation(exactLocation);
		}

		if (telephone == null) {
			attractionBikeRentalInfoImpl.setTelephone("");
		}
		else {
			attractionBikeRentalInfoImpl.setTelephone(telephone);
		}

		if (email == null) {
			attractionBikeRentalInfoImpl.setEmail("");
		}
		else {
			attractionBikeRentalInfoImpl.setEmail(email);
		}

		if (registrationDate == Long.MIN_VALUE) {
			attractionBikeRentalInfoImpl.setRegistrationDate(null);
		}
		else {
			attractionBikeRentalInfoImpl.setRegistrationDate(
				new Date(registrationDate));
		}

		if (managerName == null) {
			attractionBikeRentalInfoImpl.setManagerName("");
		}
		else {
			attractionBikeRentalInfoImpl.setManagerName(managerName);
		}

		if (numberOfBikes == null) {
			attractionBikeRentalInfoImpl.setNumberOfBikes("");
		}
		else {
			attractionBikeRentalInfoImpl.setNumberOfBikes(numberOfBikes);
		}

		if (numberOfHelmets == null) {
			attractionBikeRentalInfoImpl.setNumberOfHelmets("");
		}
		else {
			attractionBikeRentalInfoImpl.setNumberOfHelmets(numberOfHelmets);
		}

		if (numberOfEmployees == null) {
			attractionBikeRentalInfoImpl.setNumberOfEmployees("");
		}
		else {
			attractionBikeRentalInfoImpl.setNumberOfEmployees(
				numberOfEmployees);
		}

		if (signatureDate == Long.MIN_VALUE) {
			attractionBikeRentalInfoImpl.setSignatureDate(null);
		}
		else {
			attractionBikeRentalInfoImpl.setSignatureDate(
				new Date(signatureDate));
		}

		if (motorBikeIndustry == null) {
			attractionBikeRentalInfoImpl.setMotorBikeIndustry("");
		}
		else {
			attractionBikeRentalInfoImpl.setMotorBikeIndustry(
				motorBikeIndustry);
		}

		attractionBikeRentalInfoImpl.setJtbApplicationId(jtbApplicationId);

		attractionBikeRentalInfoImpl.resetOriginalValues();

		return attractionBikeRentalInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		attractionBikeRentalInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		applicantName = objectInput.readUTF();
		address = objectInput.readUTF();
		companyName = objectInput.readUTF();
		exactLocation = objectInput.readUTF();
		telephone = objectInput.readUTF();
		email = objectInput.readUTF();
		registrationDate = objectInput.readLong();
		managerName = objectInput.readUTF();
		numberOfBikes = objectInput.readUTF();
		numberOfHelmets = objectInput.readUTF();
		numberOfEmployees = objectInput.readUTF();
		signatureDate = objectInput.readLong();
		motorBikeIndustry = objectInput.readUTF();

		jtbApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(attractionBikeRentalInfoId);

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

		if (applicantName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantName);
		}

		if (address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (companyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyName);
		}

		if (exactLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(exactLocation);
		}

		if (telephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telephone);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		objectOutput.writeLong(registrationDate);

		if (managerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(managerName);
		}

		if (numberOfBikes == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numberOfBikes);
		}

		if (numberOfHelmets == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numberOfHelmets);
		}

		if (numberOfEmployees == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numberOfEmployees);
		}

		objectOutput.writeLong(signatureDate);

		if (motorBikeIndustry == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(motorBikeIndustry);
		}

		objectOutput.writeLong(jtbApplicationId);
	}

	public long attractionBikeRentalInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String applicantName;
	public String address;
	public String companyName;
	public String exactLocation;
	public String telephone;
	public String email;
	public long registrationDate;
	public String managerName;
	public String numberOfBikes;
	public String numberOfHelmets;
	public String numberOfEmployees;
	public long signatureDate;
	public String motorBikeIndustry;
	public long jtbApplicationId;

}