/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.pharmaceutical.application.form.service.model.PharmaMedicalDeviceInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PharmaMedicalDeviceInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PharmaMedicalDeviceInfoCacheModel
	implements CacheModel<PharmaMedicalDeviceInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PharmaMedicalDeviceInfoCacheModel)) {
			return false;
		}

		PharmaMedicalDeviceInfoCacheModel pharmaMedicalDeviceInfoCacheModel =
			(PharmaMedicalDeviceInfoCacheModel)object;

		if (pharmaMedicalDeviceId ==
				pharmaMedicalDeviceInfoCacheModel.pharmaMedicalDeviceId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, pharmaMedicalDeviceId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{pharmaMedicalDeviceId=");
		sb.append(pharmaMedicalDeviceId);
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
		sb.append(", pharmaDeviceName=");
		sb.append(pharmaDeviceName);
		sb.append(", pharmaDeviceDeisgnation=");
		sb.append(pharmaDeviceDeisgnation);
		sb.append(", pharmaManufacturerName=");
		sb.append(pharmaManufacturerName);
		sb.append(", pharmaManufacturerAddress=");
		sb.append(pharmaManufacturerAddress);
		sb.append(", pharmaMedicalApplicantName=");
		sb.append(pharmaMedicalApplicantName);
		sb.append(", pharmaMedicalApplicantAddress=");
		sb.append(pharmaMedicalApplicantAddress);
		sb.append(", pharmaRepresentativeName=");
		sb.append(pharmaRepresentativeName);
		sb.append(", pharmaRepresentativeAddress=");
		sb.append(pharmaRepresentativeAddress);
		sb.append(", pharmaApplicationId=");
		sb.append(pharmaApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PharmaMedicalDeviceInfo toEntityModel() {
		PharmaMedicalDeviceInfoImpl pharmaMedicalDeviceInfoImpl =
			new PharmaMedicalDeviceInfoImpl();

		pharmaMedicalDeviceInfoImpl.setPharmaMedicalDeviceId(
			pharmaMedicalDeviceId);
		pharmaMedicalDeviceInfoImpl.setGroupId(groupId);
		pharmaMedicalDeviceInfoImpl.setCompanyId(companyId);
		pharmaMedicalDeviceInfoImpl.setUserId(userId);

		if (userName == null) {
			pharmaMedicalDeviceInfoImpl.setUserName("");
		}
		else {
			pharmaMedicalDeviceInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			pharmaMedicalDeviceInfoImpl.setCreateDate(null);
		}
		else {
			pharmaMedicalDeviceInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			pharmaMedicalDeviceInfoImpl.setModifiedDate(null);
		}
		else {
			pharmaMedicalDeviceInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (pharmaDeviceName == null) {
			pharmaMedicalDeviceInfoImpl.setPharmaDeviceName("");
		}
		else {
			pharmaMedicalDeviceInfoImpl.setPharmaDeviceName(pharmaDeviceName);
		}

		if (pharmaDeviceDeisgnation == null) {
			pharmaMedicalDeviceInfoImpl.setPharmaDeviceDeisgnation("");
		}
		else {
			pharmaMedicalDeviceInfoImpl.setPharmaDeviceDeisgnation(
				pharmaDeviceDeisgnation);
		}

		if (pharmaManufacturerName == null) {
			pharmaMedicalDeviceInfoImpl.setPharmaManufacturerName("");
		}
		else {
			pharmaMedicalDeviceInfoImpl.setPharmaManufacturerName(
				pharmaManufacturerName);
		}

		if (pharmaManufacturerAddress == null) {
			pharmaMedicalDeviceInfoImpl.setPharmaManufacturerAddress("");
		}
		else {
			pharmaMedicalDeviceInfoImpl.setPharmaManufacturerAddress(
				pharmaManufacturerAddress);
		}

		if (pharmaMedicalApplicantName == null) {
			pharmaMedicalDeviceInfoImpl.setPharmaMedicalApplicantName("");
		}
		else {
			pharmaMedicalDeviceInfoImpl.setPharmaMedicalApplicantName(
				pharmaMedicalApplicantName);
		}

		if (pharmaMedicalApplicantAddress == null) {
			pharmaMedicalDeviceInfoImpl.setPharmaMedicalApplicantAddress("");
		}
		else {
			pharmaMedicalDeviceInfoImpl.setPharmaMedicalApplicantAddress(
				pharmaMedicalApplicantAddress);
		}

		if (pharmaRepresentativeName == null) {
			pharmaMedicalDeviceInfoImpl.setPharmaRepresentativeName("");
		}
		else {
			pharmaMedicalDeviceInfoImpl.setPharmaRepresentativeName(
				pharmaRepresentativeName);
		}

		if (pharmaRepresentativeAddress == null) {
			pharmaMedicalDeviceInfoImpl.setPharmaRepresentativeAddress("");
		}
		else {
			pharmaMedicalDeviceInfoImpl.setPharmaRepresentativeAddress(
				pharmaRepresentativeAddress);
		}

		pharmaMedicalDeviceInfoImpl.setPharmaApplicationId(pharmaApplicationId);

		pharmaMedicalDeviceInfoImpl.resetOriginalValues();

		return pharmaMedicalDeviceInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		pharmaMedicalDeviceId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		pharmaDeviceName = objectInput.readUTF();
		pharmaDeviceDeisgnation = objectInput.readUTF();
		pharmaManufacturerName = objectInput.readUTF();
		pharmaManufacturerAddress = objectInput.readUTF();
		pharmaMedicalApplicantName = objectInput.readUTF();
		pharmaMedicalApplicantAddress = objectInput.readUTF();
		pharmaRepresentativeName = objectInput.readUTF();
		pharmaRepresentativeAddress = objectInput.readUTF();

		pharmaApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(pharmaMedicalDeviceId);

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

		if (pharmaDeviceName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaDeviceName);
		}

		if (pharmaDeviceDeisgnation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaDeviceDeisgnation);
		}

		if (pharmaManufacturerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaManufacturerName);
		}

		if (pharmaManufacturerAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaManufacturerAddress);
		}

		if (pharmaMedicalApplicantName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaMedicalApplicantName);
		}

		if (pharmaMedicalApplicantAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaMedicalApplicantAddress);
		}

		if (pharmaRepresentativeName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaRepresentativeName);
		}

		if (pharmaRepresentativeAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaRepresentativeAddress);
		}

		objectOutput.writeLong(pharmaApplicationId);
	}

	public long pharmaMedicalDeviceId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String pharmaDeviceName;
	public String pharmaDeviceDeisgnation;
	public String pharmaManufacturerName;
	public String pharmaManufacturerAddress;
	public String pharmaMedicalApplicantName;
	public String pharmaMedicalApplicantAddress;
	public String pharmaRepresentativeName;
	public String pharmaRepresentativeAddress;
	public long pharmaApplicationId;

}