/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.creative.application.form.service.model.CreativeIndividualDetails;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CreativeIndividualDetails in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CreativeIndividualDetailsCacheModel
	implements CacheModel<CreativeIndividualDetails>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CreativeIndividualDetailsCacheModel)) {
			return false;
		}

		CreativeIndividualDetailsCacheModel
			creativeIndividualDetailsCacheModel =
				(CreativeIndividualDetailsCacheModel)object;

		if (creativeIndividualDetailsId ==
				creativeIndividualDetailsCacheModel.
					creativeIndividualDetailsId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, creativeIndividualDetailsId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{creativeIndividualDetailsId=");
		sb.append(creativeIndividualDetailsId);
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
		sb.append(", sectorOfPractice=");
		sb.append(sectorOfPractice);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", middleName=");
		sb.append(middleName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", trn=");
		sb.append(trn);
		sb.append(", city=");
		sb.append(city);
		sb.append(", country=");
		sb.append(country);
		sb.append(", sex=");
		sb.append(sex);
		sb.append(", cell=");
		sb.append(cell);
		sb.append(", email=");
		sb.append(email);
		sb.append(", areYouStudent=");
		sb.append(areYouStudent);
		sb.append(", companyEmail=");
		sb.append(companyEmail);
		sb.append(", companyWebsite=");
		sb.append(companyWebsite);
		sb.append(", CreativeApplicationId=");
		sb.append(CreativeApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CreativeIndividualDetails toEntityModel() {
		CreativeIndividualDetailsImpl creativeIndividualDetailsImpl =
			new CreativeIndividualDetailsImpl();

		creativeIndividualDetailsImpl.setCreativeIndividualDetailsId(
			creativeIndividualDetailsId);
		creativeIndividualDetailsImpl.setGroupId(groupId);
		creativeIndividualDetailsImpl.setCompanyId(companyId);
		creativeIndividualDetailsImpl.setUserId(userId);

		if (userName == null) {
			creativeIndividualDetailsImpl.setUserName("");
		}
		else {
			creativeIndividualDetailsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			creativeIndividualDetailsImpl.setCreateDate(null);
		}
		else {
			creativeIndividualDetailsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			creativeIndividualDetailsImpl.setModifiedDate(null);
		}
		else {
			creativeIndividualDetailsImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (sectorOfPractice == null) {
			creativeIndividualDetailsImpl.setSectorOfPractice("");
		}
		else {
			creativeIndividualDetailsImpl.setSectorOfPractice(sectorOfPractice);
		}

		if (firstName == null) {
			creativeIndividualDetailsImpl.setFirstName("");
		}
		else {
			creativeIndividualDetailsImpl.setFirstName(firstName);
		}

		if (middleName == null) {
			creativeIndividualDetailsImpl.setMiddleName("");
		}
		else {
			creativeIndividualDetailsImpl.setMiddleName(middleName);
		}

		if (lastName == null) {
			creativeIndividualDetailsImpl.setLastName("");
		}
		else {
			creativeIndividualDetailsImpl.setLastName(lastName);
		}

		if (trn == null) {
			creativeIndividualDetailsImpl.setTrn("");
		}
		else {
			creativeIndividualDetailsImpl.setTrn(trn);
		}

		if (city == null) {
			creativeIndividualDetailsImpl.setCity("");
		}
		else {
			creativeIndividualDetailsImpl.setCity(city);
		}

		if (country == null) {
			creativeIndividualDetailsImpl.setCountry("");
		}
		else {
			creativeIndividualDetailsImpl.setCountry(country);
		}

		if (sex == null) {
			creativeIndividualDetailsImpl.setSex("");
		}
		else {
			creativeIndividualDetailsImpl.setSex(sex);
		}

		if (cell == null) {
			creativeIndividualDetailsImpl.setCell("");
		}
		else {
			creativeIndividualDetailsImpl.setCell(cell);
		}

		if (email == null) {
			creativeIndividualDetailsImpl.setEmail("");
		}
		else {
			creativeIndividualDetailsImpl.setEmail(email);
		}

		if (areYouStudent == null) {
			creativeIndividualDetailsImpl.setAreYouStudent("");
		}
		else {
			creativeIndividualDetailsImpl.setAreYouStudent(areYouStudent);
		}

		if (companyEmail == null) {
			creativeIndividualDetailsImpl.setCompanyEmail("");
		}
		else {
			creativeIndividualDetailsImpl.setCompanyEmail(companyEmail);
		}

		if (companyWebsite == null) {
			creativeIndividualDetailsImpl.setCompanyWebsite("");
		}
		else {
			creativeIndividualDetailsImpl.setCompanyWebsite(companyWebsite);
		}

		creativeIndividualDetailsImpl.setCreativeApplicationId(
			CreativeApplicationId);

		creativeIndividualDetailsImpl.resetOriginalValues();

		return creativeIndividualDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		creativeIndividualDetailsId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		sectorOfPractice = objectInput.readUTF();
		firstName = objectInput.readUTF();
		middleName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		trn = objectInput.readUTF();
		city = objectInput.readUTF();
		country = objectInput.readUTF();
		sex = objectInput.readUTF();
		cell = objectInput.readUTF();
		email = objectInput.readUTF();
		areYouStudent = objectInput.readUTF();
		companyEmail = objectInput.readUTF();
		companyWebsite = objectInput.readUTF();

		CreativeApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(creativeIndividualDetailsId);

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

		if (sectorOfPractice == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sectorOfPractice);
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

		if (trn == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(trn);
		}

		if (city == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(city);
		}

		if (country == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(country);
		}

		if (sex == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sex);
		}

		if (cell == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cell);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (areYouStudent == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(areYouStudent);
		}

		if (companyEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyEmail);
		}

		if (companyWebsite == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyWebsite);
		}

		objectOutput.writeLong(CreativeApplicationId);
	}

	public long creativeIndividualDetailsId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String sectorOfPractice;
	public String firstName;
	public String middleName;
	public String lastName;
	public String trn;
	public String city;
	public String country;
	public String sex;
	public String cell;
	public String email;
	public String areYouStudent;
	public String companyEmail;
	public String companyWebsite;
	public long CreativeApplicationId;

}