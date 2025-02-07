/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesAppliInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MedicalFacilitiesAppliInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MedicalFacilitiesAppliInfoCacheModel
	implements CacheModel<MedicalFacilitiesAppliInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MedicalFacilitiesAppliInfoCacheModel)) {
			return false;
		}

		MedicalFacilitiesAppliInfoCacheModel
			medicalFacilitiesAppliInfoCacheModel =
				(MedicalFacilitiesAppliInfoCacheModel)object;

		if (medicalFacilitiesAppliId ==
				medicalFacilitiesAppliInfoCacheModel.medicalFacilitiesAppliId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, medicalFacilitiesAppliId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", medicalFacilitiesAppliId=");
		sb.append(medicalFacilitiesAppliId);
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
		sb.append(", appliTelephoneNumber=");
		sb.append(appliTelephoneNumber);
		sb.append(", appliAddress=");
		sb.append(appliAddress);
		sb.append(", appliEmailAddress=");
		sb.append(appliEmailAddress);
		sb.append(", appliNationality=");
		sb.append(appliNationality);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", medicalFacilitiesAppId=");
		sb.append(medicalFacilitiesAppId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MedicalFacilitiesAppliInfo toEntityModel() {
		MedicalFacilitiesAppliInfoImpl medicalFacilitiesAppliInfoImpl =
			new MedicalFacilitiesAppliInfoImpl();

		if (uuid == null) {
			medicalFacilitiesAppliInfoImpl.setUuid("");
		}
		else {
			medicalFacilitiesAppliInfoImpl.setUuid(uuid);
		}

		medicalFacilitiesAppliInfoImpl.setMedicalFacilitiesAppliId(
			medicalFacilitiesAppliId);
		medicalFacilitiesAppliInfoImpl.setGroupId(groupId);
		medicalFacilitiesAppliInfoImpl.setCompanyId(companyId);
		medicalFacilitiesAppliInfoImpl.setUserId(userId);

		if (userName == null) {
			medicalFacilitiesAppliInfoImpl.setUserName("");
		}
		else {
			medicalFacilitiesAppliInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			medicalFacilitiesAppliInfoImpl.setCreateDate(null);
		}
		else {
			medicalFacilitiesAppliInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			medicalFacilitiesAppliInfoImpl.setModifiedDate(null);
		}
		else {
			medicalFacilitiesAppliInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (applicantName == null) {
			medicalFacilitiesAppliInfoImpl.setApplicantName("");
		}
		else {
			medicalFacilitiesAppliInfoImpl.setApplicantName(applicantName);
		}

		if (appliTelephoneNumber == null) {
			medicalFacilitiesAppliInfoImpl.setAppliTelephoneNumber("");
		}
		else {
			medicalFacilitiesAppliInfoImpl.setAppliTelephoneNumber(
				appliTelephoneNumber);
		}

		if (appliAddress == null) {
			medicalFacilitiesAppliInfoImpl.setAppliAddress("");
		}
		else {
			medicalFacilitiesAppliInfoImpl.setAppliAddress(appliAddress);
		}

		if (appliEmailAddress == null) {
			medicalFacilitiesAppliInfoImpl.setAppliEmailAddress("");
		}
		else {
			medicalFacilitiesAppliInfoImpl.setAppliEmailAddress(
				appliEmailAddress);
		}

		if (appliNationality == null) {
			medicalFacilitiesAppliInfoImpl.setAppliNationality("");
		}
		else {
			medicalFacilitiesAppliInfoImpl.setAppliNationality(
				appliNationality);
		}

		if (counter == null) {
			medicalFacilitiesAppliInfoImpl.setCounter("");
		}
		else {
			medicalFacilitiesAppliInfoImpl.setCounter(counter);
		}

		medicalFacilitiesAppliInfoImpl.setMedicalFacilitiesAppId(
			medicalFacilitiesAppId);

		medicalFacilitiesAppliInfoImpl.resetOriginalValues();

		return medicalFacilitiesAppliInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		medicalFacilitiesAppliId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		applicantName = objectInput.readUTF();
		appliTelephoneNumber = objectInput.readUTF();
		appliAddress = objectInput.readUTF();
		appliEmailAddress = objectInput.readUTF();
		appliNationality = objectInput.readUTF();
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

		objectOutput.writeLong(medicalFacilitiesAppliId);

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

		if (appliTelephoneNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appliTelephoneNumber);
		}

		if (appliAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appliAddress);
		}

		if (appliEmailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appliEmailAddress);
		}

		if (appliNationality == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appliNationality);
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
	public long medicalFacilitiesAppliId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String applicantName;
	public String appliTelephoneNumber;
	public String appliAddress;
	public String appliEmailAddress;
	public String appliNationality;
	public String counter;
	public long medicalFacilitiesAppId;

}