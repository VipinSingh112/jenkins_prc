/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.cannabis.application.form.services.model.CannabisApplicationCompanyAuthorizedAgent;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CannabisApplicationCompanyAuthorizedAgent in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CannabisApplicationCompanyAuthorizedAgentCacheModel
	implements CacheModel<CannabisApplicationCompanyAuthorizedAgent>,
			   Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof
				CannabisApplicationCompanyAuthorizedAgentCacheModel)) {

			return false;
		}

		CannabisApplicationCompanyAuthorizedAgentCacheModel
			cannabisApplicationCompanyAuthorizedAgentCacheModel =
				(CannabisApplicationCompanyAuthorizedAgentCacheModel)object;

		if (cannabisCOAId ==
				cannabisApplicationCompanyAuthorizedAgentCacheModel.
					cannabisCOAId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cannabisCOAId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", cannabisCOAId=");
		sb.append(cannabisCOAId);
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
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", middleName=");
		sb.append(middleName);
		sb.append(", surname=");
		sb.append(surname);
		sb.append(", position=");
		sb.append(position);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", dateOfBirth=");
		sb.append(dateOfBirth);
		sb.append(", contactPhoneNumber=");
		sb.append(contactPhoneNumber);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", cannabisApplicationId=");
		sb.append(cannabisApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CannabisApplicationCompanyAuthorizedAgent toEntityModel() {
		CannabisApplicationCompanyAuthorizedAgentImpl
			cannabisApplicationCompanyAuthorizedAgentImpl =
				new CannabisApplicationCompanyAuthorizedAgentImpl();

		if (uuid == null) {
			cannabisApplicationCompanyAuthorizedAgentImpl.setUuid("");
		}
		else {
			cannabisApplicationCompanyAuthorizedAgentImpl.setUuid(uuid);
		}

		cannabisApplicationCompanyAuthorizedAgentImpl.setCannabisCOAId(
			cannabisCOAId);
		cannabisApplicationCompanyAuthorizedAgentImpl.setGroupId(groupId);
		cannabisApplicationCompanyAuthorizedAgentImpl.setCompanyId(companyId);
		cannabisApplicationCompanyAuthorizedAgentImpl.setUserId(userId);

		if (userName == null) {
			cannabisApplicationCompanyAuthorizedAgentImpl.setUserName("");
		}
		else {
			cannabisApplicationCompanyAuthorizedAgentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			cannabisApplicationCompanyAuthorizedAgentImpl.setCreateDate(null);
		}
		else {
			cannabisApplicationCompanyAuthorizedAgentImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cannabisApplicationCompanyAuthorizedAgentImpl.setModifiedDate(null);
		}
		else {
			cannabisApplicationCompanyAuthorizedAgentImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (firstName == null) {
			cannabisApplicationCompanyAuthorizedAgentImpl.setFirstName("");
		}
		else {
			cannabisApplicationCompanyAuthorizedAgentImpl.setFirstName(
				firstName);
		}

		if (middleName == null) {
			cannabisApplicationCompanyAuthorizedAgentImpl.setMiddleName("");
		}
		else {
			cannabisApplicationCompanyAuthorizedAgentImpl.setMiddleName(
				middleName);
		}

		if (surname == null) {
			cannabisApplicationCompanyAuthorizedAgentImpl.setSurname("");
		}
		else {
			cannabisApplicationCompanyAuthorizedAgentImpl.setSurname(surname);
		}

		if (position == null) {
			cannabisApplicationCompanyAuthorizedAgentImpl.setPosition("");
		}
		else {
			cannabisApplicationCompanyAuthorizedAgentImpl.setPosition(position);
		}

		if (gender == null) {
			cannabisApplicationCompanyAuthorizedAgentImpl.setGender("");
		}
		else {
			cannabisApplicationCompanyAuthorizedAgentImpl.setGender(gender);
		}

		if (dateOfBirth == Long.MIN_VALUE) {
			cannabisApplicationCompanyAuthorizedAgentImpl.setDateOfBirth(null);
		}
		else {
			cannabisApplicationCompanyAuthorizedAgentImpl.setDateOfBirth(
				new Date(dateOfBirth));
		}

		if (contactPhoneNumber == null) {
			cannabisApplicationCompanyAuthorizedAgentImpl.setContactPhoneNumber(
				"");
		}
		else {
			cannabisApplicationCompanyAuthorizedAgentImpl.setContactPhoneNumber(
				contactPhoneNumber);
		}

		if (emailAddress == null) {
			cannabisApplicationCompanyAuthorizedAgentImpl.setEmailAddress("");
		}
		else {
			cannabisApplicationCompanyAuthorizedAgentImpl.setEmailAddress(
				emailAddress);
		}

		cannabisApplicationCompanyAuthorizedAgentImpl.setCannabisApplicationId(
			cannabisApplicationId);

		cannabisApplicationCompanyAuthorizedAgentImpl.resetOriginalValues();

		return cannabisApplicationCompanyAuthorizedAgentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		cannabisCOAId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		firstName = objectInput.readUTF();
		middleName = objectInput.readUTF();
		surname = objectInput.readUTF();
		position = objectInput.readUTF();
		gender = objectInput.readUTF();
		dateOfBirth = objectInput.readLong();
		contactPhoneNumber = objectInput.readUTF();
		emailAddress = objectInput.readUTF();

		cannabisApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(cannabisCOAId);

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

		if (surname == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(surname);
		}

		if (position == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(position);
		}

		if (gender == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(gender);
		}

		objectOutput.writeLong(dateOfBirth);

		if (contactPhoneNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contactPhoneNumber);
		}

		if (emailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailAddress);
		}

		objectOutput.writeLong(cannabisApplicationId);
	}

	public String uuid;
	public long cannabisCOAId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String firstName;
	public String middleName;
	public String surname;
	public String position;
	public String gender;
	public long dateOfBirth;
	public String contactPhoneNumber;
	public String emailAddress;
	public long cannabisApplicationId;

}