/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.creative.application.form.service.model.CreativeCompanyApplicantInformation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CreativeCompanyApplicantInformation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CreativeCompanyApplicantInformationCacheModel
	implements CacheModel<CreativeCompanyApplicantInformation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof
				CreativeCompanyApplicantInformationCacheModel)) {

			return false;
		}

		CreativeCompanyApplicantInformationCacheModel
			creativeCompanyApplicantInformationCacheModel =
				(CreativeCompanyApplicantInformationCacheModel)object;

		if (creativeCompanyApplicantInfoId ==
				creativeCompanyApplicantInformationCacheModel.
					creativeCompanyApplicantInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, creativeCompanyApplicantInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{creativeCompanyApplicantInfoId=");
		sb.append(creativeCompanyApplicantInfoId);
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
		sb.append(", prefix=");
		sb.append(prefix);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", sex=");
		sb.append(sex);
		sb.append(", trn=");
		sb.append(trn);
		sb.append(", countryOfResidence=");
		sb.append(countryOfResidence);
		sb.append(", nationality=");
		sb.append(nationality);
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
	public CreativeCompanyApplicantInformation toEntityModel() {
		CreativeCompanyApplicantInformationImpl
			creativeCompanyApplicantInformationImpl =
				new CreativeCompanyApplicantInformationImpl();

		creativeCompanyApplicantInformationImpl.
			setCreativeCompanyApplicantInfoId(creativeCompanyApplicantInfoId);
		creativeCompanyApplicantInformationImpl.setGroupId(groupId);
		creativeCompanyApplicantInformationImpl.setCompanyId(companyId);
		creativeCompanyApplicantInformationImpl.setUserId(userId);

		if (userName == null) {
			creativeCompanyApplicantInformationImpl.setUserName("");
		}
		else {
			creativeCompanyApplicantInformationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			creativeCompanyApplicantInformationImpl.setCreateDate(null);
		}
		else {
			creativeCompanyApplicantInformationImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			creativeCompanyApplicantInformationImpl.setModifiedDate(null);
		}
		else {
			creativeCompanyApplicantInformationImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (prefix == null) {
			creativeCompanyApplicantInformationImpl.setPrefix("");
		}
		else {
			creativeCompanyApplicantInformationImpl.setPrefix(prefix);
		}

		if (firstName == null) {
			creativeCompanyApplicantInformationImpl.setFirstName("");
		}
		else {
			creativeCompanyApplicantInformationImpl.setFirstName(firstName);
		}

		if (lastName == null) {
			creativeCompanyApplicantInformationImpl.setLastName("");
		}
		else {
			creativeCompanyApplicantInformationImpl.setLastName(lastName);
		}

		if (sex == null) {
			creativeCompanyApplicantInformationImpl.setSex("");
		}
		else {
			creativeCompanyApplicantInformationImpl.setSex(sex);
		}

		if (trn == null) {
			creativeCompanyApplicantInformationImpl.setTrn("");
		}
		else {
			creativeCompanyApplicantInformationImpl.setTrn(trn);
		}

		if (countryOfResidence == null) {
			creativeCompanyApplicantInformationImpl.setCountryOfResidence("");
		}
		else {
			creativeCompanyApplicantInformationImpl.setCountryOfResidence(
				countryOfResidence);
		}

		if (nationality == null) {
			creativeCompanyApplicantInformationImpl.setNationality("");
		}
		else {
			creativeCompanyApplicantInformationImpl.setNationality(nationality);
		}

		if (cell == null) {
			creativeCompanyApplicantInformationImpl.setCell("");
		}
		else {
			creativeCompanyApplicantInformationImpl.setCell(cell);
		}

		if (email == null) {
			creativeCompanyApplicantInformationImpl.setEmail("");
		}
		else {
			creativeCompanyApplicantInformationImpl.setEmail(email);
		}

		creativeCompanyApplicantInformationImpl.setCreativeApplicationId(
			CreativeApplicationId);

		creativeCompanyApplicantInformationImpl.resetOriginalValues();

		return creativeCompanyApplicantInformationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		creativeCompanyApplicantInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		prefix = objectInput.readUTF();
		firstName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		sex = objectInput.readUTF();
		trn = objectInput.readUTF();
		countryOfResidence = objectInput.readUTF();
		nationality = objectInput.readUTF();
		cell = objectInput.readUTF();
		email = objectInput.readUTF();

		CreativeApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(creativeCompanyApplicantInfoId);

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

		if (prefix == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(prefix);
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

		if (countryOfResidence == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(countryOfResidence);
		}

		if (nationality == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nationality);
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

	public long creativeCompanyApplicantInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String prefix;
	public String firstName;
	public String lastName;
	public String sex;
	public String trn;
	public String countryOfResidence;
	public String nationality;
	public String cell;
	public String email;
	public long CreativeApplicationId;

}