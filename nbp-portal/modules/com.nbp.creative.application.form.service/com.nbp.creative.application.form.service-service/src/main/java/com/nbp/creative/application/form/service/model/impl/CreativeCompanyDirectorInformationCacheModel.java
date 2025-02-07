/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.creative.application.form.service.model.CreativeCompanyDirectorInformation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CreativeCompanyDirectorInformation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CreativeCompanyDirectorInformationCacheModel
	implements CacheModel<CreativeCompanyDirectorInformation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CreativeCompanyDirectorInformationCacheModel)) {
			return false;
		}

		CreativeCompanyDirectorInformationCacheModel
			creativeCompanyDirectorInformationCacheModel =
				(CreativeCompanyDirectorInformationCacheModel)object;

		if (creativeComDirectorInfoId ==
				creativeCompanyDirectorInformationCacheModel.
					creativeComDirectorInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, creativeComDirectorInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{creativeComDirectorInfoId=");
		sb.append(creativeComDirectorInfoId);
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
		sb.append(", directorFullName=");
		sb.append(directorFullName);
		sb.append(", directorTitle=");
		sb.append(directorTitle);
		sb.append(", directorTrn=");
		sb.append(directorTrn);
		sb.append(", telephoneNumber=");
		sb.append(telephoneNumber);
		sb.append(", faxNumber=");
		sb.append(faxNumber);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", socialMedia=");
		sb.append(socialMedia);
		sb.append(", profileName=");
		sb.append(profileName);
		sb.append(", isOperatorDifferentFromOwner=");
		sb.append(isOperatorDifferentFromOwner);
		sb.append(", operatorFirstName=");
		sb.append(operatorFirstName);
		sb.append(", operatorMiddleName=");
		sb.append(operatorMiddleName);
		sb.append(", operatorLastName=");
		sb.append(operatorLastName);
		sb.append(", city=");
		sb.append(city);
		sb.append(", country=");
		sb.append(country);
		sb.append(", sex=");
		sb.append(sex);
		sb.append(", trn=");
		sb.append(trn);
		sb.append(", cell=");
		sb.append(cell);
		sb.append(", email=");
		sb.append(email);
		sb.append(", CreativeApplicationId=");
		sb.append(CreativeApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CreativeCompanyDirectorInformation toEntityModel() {
		CreativeCompanyDirectorInformationImpl
			creativeCompanyDirectorInformationImpl =
				new CreativeCompanyDirectorInformationImpl();

		creativeCompanyDirectorInformationImpl.setCreativeComDirectorInfoId(
			creativeComDirectorInfoId);
		creativeCompanyDirectorInformationImpl.setGroupId(groupId);
		creativeCompanyDirectorInformationImpl.setCompanyId(companyId);
		creativeCompanyDirectorInformationImpl.setUserId(userId);

		if (userName == null) {
			creativeCompanyDirectorInformationImpl.setUserName("");
		}
		else {
			creativeCompanyDirectorInformationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			creativeCompanyDirectorInformationImpl.setCreateDate(null);
		}
		else {
			creativeCompanyDirectorInformationImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			creativeCompanyDirectorInformationImpl.setModifiedDate(null);
		}
		else {
			creativeCompanyDirectorInformationImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (directorFullName == null) {
			creativeCompanyDirectorInformationImpl.setDirectorFullName("");
		}
		else {
			creativeCompanyDirectorInformationImpl.setDirectorFullName(
				directorFullName);
		}

		if (directorTitle == null) {
			creativeCompanyDirectorInformationImpl.setDirectorTitle("");
		}
		else {
			creativeCompanyDirectorInformationImpl.setDirectorTitle(
				directorTitle);
		}

		if (directorTrn == null) {
			creativeCompanyDirectorInformationImpl.setDirectorTrn("");
		}
		else {
			creativeCompanyDirectorInformationImpl.setDirectorTrn(directorTrn);
		}

		if (telephoneNumber == null) {
			creativeCompanyDirectorInformationImpl.setTelephoneNumber("");
		}
		else {
			creativeCompanyDirectorInformationImpl.setTelephoneNumber(
				telephoneNumber);
		}

		if (faxNumber == null) {
			creativeCompanyDirectorInformationImpl.setFaxNumber("");
		}
		else {
			creativeCompanyDirectorInformationImpl.setFaxNumber(faxNumber);
		}

		if (emailAddress == null) {
			creativeCompanyDirectorInformationImpl.setEmailAddress("");
		}
		else {
			creativeCompanyDirectorInformationImpl.setEmailAddress(
				emailAddress);
		}

		if (socialMedia == null) {
			creativeCompanyDirectorInformationImpl.setSocialMedia("");
		}
		else {
			creativeCompanyDirectorInformationImpl.setSocialMedia(socialMedia);
		}

		if (profileName == null) {
			creativeCompanyDirectorInformationImpl.setProfileName("");
		}
		else {
			creativeCompanyDirectorInformationImpl.setProfileName(profileName);
		}

		if (isOperatorDifferentFromOwner == null) {
			creativeCompanyDirectorInformationImpl.
				setIsOperatorDifferentFromOwner("");
		}
		else {
			creativeCompanyDirectorInformationImpl.
				setIsOperatorDifferentFromOwner(isOperatorDifferentFromOwner);
		}

		if (operatorFirstName == null) {
			creativeCompanyDirectorInformationImpl.setOperatorFirstName("");
		}
		else {
			creativeCompanyDirectorInformationImpl.setOperatorFirstName(
				operatorFirstName);
		}

		if (operatorMiddleName == null) {
			creativeCompanyDirectorInformationImpl.setOperatorMiddleName("");
		}
		else {
			creativeCompanyDirectorInformationImpl.setOperatorMiddleName(
				operatorMiddleName);
		}

		if (operatorLastName == null) {
			creativeCompanyDirectorInformationImpl.setOperatorLastName("");
		}
		else {
			creativeCompanyDirectorInformationImpl.setOperatorLastName(
				operatorLastName);
		}

		if (city == null) {
			creativeCompanyDirectorInformationImpl.setCity("");
		}
		else {
			creativeCompanyDirectorInformationImpl.setCity(city);
		}

		if (country == null) {
			creativeCompanyDirectorInformationImpl.setCountry("");
		}
		else {
			creativeCompanyDirectorInformationImpl.setCountry(country);
		}

		if (sex == null) {
			creativeCompanyDirectorInformationImpl.setSex("");
		}
		else {
			creativeCompanyDirectorInformationImpl.setSex(sex);
		}

		if (trn == null) {
			creativeCompanyDirectorInformationImpl.setTrn("");
		}
		else {
			creativeCompanyDirectorInformationImpl.setTrn(trn);
		}

		if (cell == null) {
			creativeCompanyDirectorInformationImpl.setCell("");
		}
		else {
			creativeCompanyDirectorInformationImpl.setCell(cell);
		}

		if (email == null) {
			creativeCompanyDirectorInformationImpl.setEmail("");
		}
		else {
			creativeCompanyDirectorInformationImpl.setEmail(email);
		}

		creativeCompanyDirectorInformationImpl.setCreativeApplicationId(
			CreativeApplicationId);

		creativeCompanyDirectorInformationImpl.resetOriginalValues();

		return creativeCompanyDirectorInformationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		creativeComDirectorInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		directorFullName = objectInput.readUTF();
		directorTitle = objectInput.readUTF();
		directorTrn = objectInput.readUTF();
		telephoneNumber = objectInput.readUTF();
		faxNumber = objectInput.readUTF();
		emailAddress = objectInput.readUTF();
		socialMedia = objectInput.readUTF();
		profileName = objectInput.readUTF();
		isOperatorDifferentFromOwner = objectInput.readUTF();
		operatorFirstName = objectInput.readUTF();
		operatorMiddleName = objectInput.readUTF();
		operatorLastName = objectInput.readUTF();
		city = objectInput.readUTF();
		country = objectInput.readUTF();
		sex = objectInput.readUTF();
		trn = objectInput.readUTF();
		cell = objectInput.readUTF();
		email = objectInput.readUTF();

		CreativeApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(creativeComDirectorInfoId);

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

		if (directorFullName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(directorFullName);
		}

		if (directorTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(directorTitle);
		}

		if (directorTrn == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(directorTrn);
		}

		if (telephoneNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telephoneNumber);
		}

		if (faxNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(faxNumber);
		}

		if (emailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailAddress);
		}

		if (socialMedia == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(socialMedia);
		}

		if (profileName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(profileName);
		}

		if (isOperatorDifferentFromOwner == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(isOperatorDifferentFromOwner);
		}

		if (operatorFirstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(operatorFirstName);
		}

		if (operatorMiddleName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(operatorMiddleName);
		}

		if (operatorLastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(operatorLastName);
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

		if (trn == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(trn);
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

		objectOutput.writeLong(CreativeApplicationId);
	}

	public long creativeComDirectorInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String directorFullName;
	public String directorTitle;
	public String directorTrn;
	public String telephoneNumber;
	public String faxNumber;
	public String emailAddress;
	public String socialMedia;
	public String profileName;
	public String isOperatorDifferentFromOwner;
	public String operatorFirstName;
	public String operatorMiddleName;
	public String operatorLastName;
	public String city;
	public String country;
	public String sex;
	public String trn;
	public String cell;
	public String email;
	public long CreativeApplicationId;

}