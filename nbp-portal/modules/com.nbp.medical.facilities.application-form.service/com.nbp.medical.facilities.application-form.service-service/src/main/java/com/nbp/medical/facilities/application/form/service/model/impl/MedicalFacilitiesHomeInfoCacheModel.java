/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesHomeInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MedicalFacilitiesHomeInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MedicalFacilitiesHomeInfoCacheModel
	implements CacheModel<MedicalFacilitiesHomeInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MedicalFacilitiesHomeInfoCacheModel)) {
			return false;
		}

		MedicalFacilitiesHomeInfoCacheModel
			medicalFacilitiesHomeInfoCacheModel =
				(MedicalFacilitiesHomeInfoCacheModel)object;

		if (medicalFacilitiesHomeInfoId ==
				medicalFacilitiesHomeInfoCacheModel.
					medicalFacilitiesHomeInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, medicalFacilitiesHomeInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", medicalFacilitiesHomeInfoId=");
		sb.append(medicalFacilitiesHomeInfoId);
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
		sb.append(", nameOfOwner=");
		sb.append(nameOfOwner);
		sb.append(", homeAddress=");
		sb.append(homeAddress);
		sb.append(", homeTelephoneNumber=");
		sb.append(homeTelephoneNumber);
		sb.append(", homeEmailAddress=");
		sb.append(homeEmailAddress);
		sb.append(", description=");
		sb.append(description);
		sb.append(", otherBusinessDetails=");
		sb.append(otherBusinessDetails);
		sb.append(", maternityPatients=");
		sb.append(maternityPatients);
		sb.append(", otherPatients=");
		sb.append(otherPatients);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", medicalFacilitiesAppId=");
		sb.append(medicalFacilitiesAppId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MedicalFacilitiesHomeInfo toEntityModel() {
		MedicalFacilitiesHomeInfoImpl medicalFacilitiesHomeInfoImpl =
			new MedicalFacilitiesHomeInfoImpl();

		if (uuid == null) {
			medicalFacilitiesHomeInfoImpl.setUuid("");
		}
		else {
			medicalFacilitiesHomeInfoImpl.setUuid(uuid);
		}

		medicalFacilitiesHomeInfoImpl.setMedicalFacilitiesHomeInfoId(
			medicalFacilitiesHomeInfoId);
		medicalFacilitiesHomeInfoImpl.setGroupId(groupId);
		medicalFacilitiesHomeInfoImpl.setCompanyId(companyId);
		medicalFacilitiesHomeInfoImpl.setUserId(userId);

		if (userName == null) {
			medicalFacilitiesHomeInfoImpl.setUserName("");
		}
		else {
			medicalFacilitiesHomeInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			medicalFacilitiesHomeInfoImpl.setCreateDate(null);
		}
		else {
			medicalFacilitiesHomeInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			medicalFacilitiesHomeInfoImpl.setModifiedDate(null);
		}
		else {
			medicalFacilitiesHomeInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (nameOfOwner == null) {
			medicalFacilitiesHomeInfoImpl.setNameOfOwner("");
		}
		else {
			medicalFacilitiesHomeInfoImpl.setNameOfOwner(nameOfOwner);
		}

		if (homeAddress == null) {
			medicalFacilitiesHomeInfoImpl.setHomeAddress("");
		}
		else {
			medicalFacilitiesHomeInfoImpl.setHomeAddress(homeAddress);
		}

		if (homeTelephoneNumber == null) {
			medicalFacilitiesHomeInfoImpl.setHomeTelephoneNumber("");
		}
		else {
			medicalFacilitiesHomeInfoImpl.setHomeTelephoneNumber(
				homeTelephoneNumber);
		}

		if (homeEmailAddress == null) {
			medicalFacilitiesHomeInfoImpl.setHomeEmailAddress("");
		}
		else {
			medicalFacilitiesHomeInfoImpl.setHomeEmailAddress(homeEmailAddress);
		}

		if (description == null) {
			medicalFacilitiesHomeInfoImpl.setDescription("");
		}
		else {
			medicalFacilitiesHomeInfoImpl.setDescription(description);
		}

		if (otherBusinessDetails == null) {
			medicalFacilitiesHomeInfoImpl.setOtherBusinessDetails("");
		}
		else {
			medicalFacilitiesHomeInfoImpl.setOtherBusinessDetails(
				otherBusinessDetails);
		}

		if (maternityPatients == null) {
			medicalFacilitiesHomeInfoImpl.setMaternityPatients("");
		}
		else {
			medicalFacilitiesHomeInfoImpl.setMaternityPatients(
				maternityPatients);
		}

		if (otherPatients == null) {
			medicalFacilitiesHomeInfoImpl.setOtherPatients("");
		}
		else {
			medicalFacilitiesHomeInfoImpl.setOtherPatients(otherPatients);
		}

		if (counter == null) {
			medicalFacilitiesHomeInfoImpl.setCounter("");
		}
		else {
			medicalFacilitiesHomeInfoImpl.setCounter(counter);
		}

		medicalFacilitiesHomeInfoImpl.setMedicalFacilitiesAppId(
			medicalFacilitiesAppId);

		medicalFacilitiesHomeInfoImpl.resetOriginalValues();

		return medicalFacilitiesHomeInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		medicalFacilitiesHomeInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nameOfOwner = objectInput.readUTF();
		homeAddress = objectInput.readUTF();
		homeTelephoneNumber = objectInput.readUTF();
		homeEmailAddress = objectInput.readUTF();
		description = objectInput.readUTF();
		otherBusinessDetails = objectInput.readUTF();
		maternityPatients = objectInput.readUTF();
		otherPatients = objectInput.readUTF();
		counter = objectInput.readUTF();

		medicalFacilitiesAppId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(medicalFacilitiesHomeInfoId);

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

		if (nameOfOwner == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfOwner);
		}

		if (homeAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(homeAddress);
		}

		if (homeTelephoneNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(homeTelephoneNumber);
		}

		if (homeEmailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(homeEmailAddress);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (otherBusinessDetails == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherBusinessDetails);
		}

		if (maternityPatients == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(maternityPatients);
		}

		if (otherPatients == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherPatients);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(medicalFacilitiesAppId);
	}

	public String uuid;
	public long medicalFacilitiesHomeInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nameOfOwner;
	public String homeAddress;
	public String homeTelephoneNumber;
	public String homeEmailAddress;
	public String description;
	public String otherBusinessDetails;
	public String maternityPatients;
	public String otherPatients;
	public String counter;
	public long medicalFacilitiesAppId;

}