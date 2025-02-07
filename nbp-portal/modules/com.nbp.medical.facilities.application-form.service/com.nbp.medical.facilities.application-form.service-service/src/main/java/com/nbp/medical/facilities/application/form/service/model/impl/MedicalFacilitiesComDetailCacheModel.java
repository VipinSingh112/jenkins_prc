/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesComDetail;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MedicalFacilitiesComDetail in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MedicalFacilitiesComDetailCacheModel
	implements CacheModel<MedicalFacilitiesComDetail>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MedicalFacilitiesComDetailCacheModel)) {
			return false;
		}

		MedicalFacilitiesComDetailCacheModel
			medicalFacilitiesComDetailCacheModel =
				(MedicalFacilitiesComDetailCacheModel)object;

		if (medicalFacilitiesComDetailId ==
				medicalFacilitiesComDetailCacheModel.
					medicalFacilitiesComDetailId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, medicalFacilitiesComDetailId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", medicalFacilitiesComDetailId=");
		sb.append(medicalFacilitiesComDetailId);
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
		sb.append(", fullName=");
		sb.append(fullName);
		sb.append(", privateAddress=");
		sb.append(privateAddress);
		sb.append(", registeredOffice=");
		sb.append(registeredOffice);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", medicalFacilitiesAppId=");
		sb.append(medicalFacilitiesAppId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MedicalFacilitiesComDetail toEntityModel() {
		MedicalFacilitiesComDetailImpl medicalFacilitiesComDetailImpl =
			new MedicalFacilitiesComDetailImpl();

		if (uuid == null) {
			medicalFacilitiesComDetailImpl.setUuid("");
		}
		else {
			medicalFacilitiesComDetailImpl.setUuid(uuid);
		}

		medicalFacilitiesComDetailImpl.setMedicalFacilitiesComDetailId(
			medicalFacilitiesComDetailId);
		medicalFacilitiesComDetailImpl.setGroupId(groupId);
		medicalFacilitiesComDetailImpl.setCompanyId(companyId);
		medicalFacilitiesComDetailImpl.setUserId(userId);

		if (userName == null) {
			medicalFacilitiesComDetailImpl.setUserName("");
		}
		else {
			medicalFacilitiesComDetailImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			medicalFacilitiesComDetailImpl.setCreateDate(null);
		}
		else {
			medicalFacilitiesComDetailImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			medicalFacilitiesComDetailImpl.setModifiedDate(null);
		}
		else {
			medicalFacilitiesComDetailImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (fullName == null) {
			medicalFacilitiesComDetailImpl.setFullName("");
		}
		else {
			medicalFacilitiesComDetailImpl.setFullName(fullName);
		}

		if (privateAddress == null) {
			medicalFacilitiesComDetailImpl.setPrivateAddress("");
		}
		else {
			medicalFacilitiesComDetailImpl.setPrivateAddress(privateAddress);
		}

		if (registeredOffice == null) {
			medicalFacilitiesComDetailImpl.setRegisteredOffice("");
		}
		else {
			medicalFacilitiesComDetailImpl.setRegisteredOffice(
				registeredOffice);
		}

		if (counter == null) {
			medicalFacilitiesComDetailImpl.setCounter("");
		}
		else {
			medicalFacilitiesComDetailImpl.setCounter(counter);
		}

		medicalFacilitiesComDetailImpl.setMedicalFacilitiesAppId(
			medicalFacilitiesAppId);

		medicalFacilitiesComDetailImpl.resetOriginalValues();

		return medicalFacilitiesComDetailImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		medicalFacilitiesComDetailId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		fullName = objectInput.readUTF();
		privateAddress = objectInput.readUTF();
		registeredOffice = objectInput.readUTF();
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

		objectOutput.writeLong(medicalFacilitiesComDetailId);

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

		if (fullName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fullName);
		}

		if (privateAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(privateAddress);
		}

		if (registeredOffice == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(registeredOffice);
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
	public long medicalFacilitiesComDetailId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String fullName;
	public String privateAddress;
	public String registeredOffice;
	public String counter;
	public long medicalFacilitiesAppId;

}