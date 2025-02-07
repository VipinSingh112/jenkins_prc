/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.miic.application.form.services.model.MiicApplicantDetails;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MiicApplicantDetails in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MiicApplicantDetailsCacheModel
	implements CacheModel<MiicApplicantDetails>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MiicApplicantDetailsCacheModel)) {
			return false;
		}

		MiicApplicantDetailsCacheModel miicApplicantDetailsCacheModel =
			(MiicApplicantDetailsCacheModel)object;

		if (miicApplicantDetailsId ==
				miicApplicantDetailsCacheModel.miicApplicantDetailsId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, miicApplicantDetailsId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{miicApplicantDetailsId=");
		sb.append(miicApplicantDetailsId);
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
		sb.append(", natureOfApplicant=");
		sb.append(natureOfApplicant);
		sb.append(", applicantName =");
		sb.append(applicantName);
		sb.append(", address=");
		sb.append(address);
		sb.append(", email=");
		sb.append(email);
		sb.append(", telephone=");
		sb.append(telephone);
		sb.append(", dateOfApplication=");
		sb.append(dateOfApplication);
		sb.append(", trnNumber=");
		sb.append(trnNumber);
		sb.append(", miicApplicationId=");
		sb.append(miicApplicationId);
		sb.append(", nameOfProducer=");
		sb.append(nameOfProducer);
		sb.append(", companyName=");
		sb.append(companyName);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MiicApplicantDetails toEntityModel() {
		MiicApplicantDetailsImpl miicApplicantDetailsImpl =
			new MiicApplicantDetailsImpl();

		miicApplicantDetailsImpl.setMiicApplicantDetailsId(
			miicApplicantDetailsId);
		miicApplicantDetailsImpl.setGroupId(groupId);
		miicApplicantDetailsImpl.setCompanyId(companyId);
		miicApplicantDetailsImpl.setUserId(userId);

		if (userName == null) {
			miicApplicantDetailsImpl.setUserName("");
		}
		else {
			miicApplicantDetailsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			miicApplicantDetailsImpl.setCreateDate(null);
		}
		else {
			miicApplicantDetailsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			miicApplicantDetailsImpl.setModifiedDate(null);
		}
		else {
			miicApplicantDetailsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (natureOfApplicant == null) {
			miicApplicantDetailsImpl.setNatureOfApplicant("");
		}
		else {
			miicApplicantDetailsImpl.setNatureOfApplicant(natureOfApplicant);
		}

		if (applicantName == null) {
			miicApplicantDetailsImpl.setApplicantName("");
		}
		else {
			miicApplicantDetailsImpl.setApplicantName(applicantName);
		}

		if (address == null) {
			miicApplicantDetailsImpl.setAddress("");
		}
		else {
			miicApplicantDetailsImpl.setAddress(address);
		}

		if (email == null) {
			miicApplicantDetailsImpl.setEmail("");
		}
		else {
			miicApplicantDetailsImpl.setEmail(email);
		}

		if (telephone == null) {
			miicApplicantDetailsImpl.setTelephone("");
		}
		else {
			miicApplicantDetailsImpl.setTelephone(telephone);
		}

		if (dateOfApplication == Long.MIN_VALUE) {
			miicApplicantDetailsImpl.setDateOfApplication(null);
		}
		else {
			miicApplicantDetailsImpl.setDateOfApplication(
				new Date(dateOfApplication));
		}

		if (trnNumber == null) {
			miicApplicantDetailsImpl.setTrnNumber("");
		}
		else {
			miicApplicantDetailsImpl.setTrnNumber(trnNumber);
		}

		miicApplicantDetailsImpl.setMiicApplicationId(miicApplicationId);

		if (nameOfProducer == null) {
			miicApplicantDetailsImpl.setNameOfProducer("");
		}
		else {
			miicApplicantDetailsImpl.setNameOfProducer(nameOfProducer);
		}

		if (companyName == null) {
			miicApplicantDetailsImpl.setCompanyName("");
		}
		else {
			miicApplicantDetailsImpl.setCompanyName(companyName);
		}

		if (firstName == null) {
			miicApplicantDetailsImpl.setFirstName("");
		}
		else {
			miicApplicantDetailsImpl.setFirstName(firstName);
		}

		if (lastName == null) {
			miicApplicantDetailsImpl.setLastName("");
		}
		else {
			miicApplicantDetailsImpl.setLastName(lastName);
		}

		miicApplicantDetailsImpl.resetOriginalValues();

		return miicApplicantDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		miicApplicantDetailsId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		natureOfApplicant = objectInput.readUTF();
		applicantName = objectInput.readUTF();
		address = objectInput.readUTF();
		email = objectInput.readUTF();
		telephone = objectInput.readUTF();
		dateOfApplication = objectInput.readLong();
		trnNumber = objectInput.readUTF();

		miicApplicationId = objectInput.readLong();
		nameOfProducer = objectInput.readUTF();
		companyName = objectInput.readUTF();
		firstName = objectInput.readUTF();
		lastName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(miicApplicantDetailsId);

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

		if (natureOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(natureOfApplicant);
		}

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

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (telephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telephone);
		}

		objectOutput.writeLong(dateOfApplication);

		if (trnNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(trnNumber);
		}

		objectOutput.writeLong(miicApplicationId);

		if (nameOfProducer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfProducer);
		}

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

		if (lastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastName);
		}
	}

	public long miicApplicantDetailsId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String natureOfApplicant;
	public String applicantName;
	public String address;
	public String email;
	public String telephone;
	public long dateOfApplication;
	public String trnNumber;
	public long miicApplicationId;
	public String nameOfProducer;
	public String companyName;
	public String firstName;
	public String lastName;

}