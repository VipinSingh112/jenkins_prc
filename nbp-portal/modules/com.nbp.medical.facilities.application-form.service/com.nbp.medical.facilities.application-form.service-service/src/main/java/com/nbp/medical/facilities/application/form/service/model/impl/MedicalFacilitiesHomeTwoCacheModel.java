/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesHomeTwo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MedicalFacilitiesHomeTwo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MedicalFacilitiesHomeTwoCacheModel
	implements CacheModel<MedicalFacilitiesHomeTwo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MedicalFacilitiesHomeTwoCacheModel)) {
			return false;
		}

		MedicalFacilitiesHomeTwoCacheModel medicalFacilitiesHomeTwoCacheModel =
			(MedicalFacilitiesHomeTwoCacheModel)object;

		if (medicalFacilitiesHomeTwoId ==
				medicalFacilitiesHomeTwoCacheModel.medicalFacilitiesHomeTwoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, medicalFacilitiesHomeTwoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", medicalFacilitiesHomeTwoId=");
		sb.append(medicalFacilitiesHomeTwoId);
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
	public MedicalFacilitiesHomeTwo toEntityModel() {
		MedicalFacilitiesHomeTwoImpl medicalFacilitiesHomeTwoImpl =
			new MedicalFacilitiesHomeTwoImpl();

		if (uuid == null) {
			medicalFacilitiesHomeTwoImpl.setUuid("");
		}
		else {
			medicalFacilitiesHomeTwoImpl.setUuid(uuid);
		}

		medicalFacilitiesHomeTwoImpl.setMedicalFacilitiesHomeTwoId(
			medicalFacilitiesHomeTwoId);
		medicalFacilitiesHomeTwoImpl.setGroupId(groupId);
		medicalFacilitiesHomeTwoImpl.setCompanyId(companyId);
		medicalFacilitiesHomeTwoImpl.setUserId(userId);

		if (userName == null) {
			medicalFacilitiesHomeTwoImpl.setUserName("");
		}
		else {
			medicalFacilitiesHomeTwoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			medicalFacilitiesHomeTwoImpl.setCreateDate(null);
		}
		else {
			medicalFacilitiesHomeTwoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			medicalFacilitiesHomeTwoImpl.setModifiedDate(null);
		}
		else {
			medicalFacilitiesHomeTwoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (maternityPatients == null) {
			medicalFacilitiesHomeTwoImpl.setMaternityPatients("");
		}
		else {
			medicalFacilitiesHomeTwoImpl.setMaternityPatients(
				maternityPatients);
		}

		if (otherPatients == null) {
			medicalFacilitiesHomeTwoImpl.setOtherPatients("");
		}
		else {
			medicalFacilitiesHomeTwoImpl.setOtherPatients(otherPatients);
		}

		if (counter == null) {
			medicalFacilitiesHomeTwoImpl.setCounter("");
		}
		else {
			medicalFacilitiesHomeTwoImpl.setCounter(counter);
		}

		medicalFacilitiesHomeTwoImpl.setMedicalFacilitiesAppId(
			medicalFacilitiesAppId);

		medicalFacilitiesHomeTwoImpl.resetOriginalValues();

		return medicalFacilitiesHomeTwoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		medicalFacilitiesHomeTwoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
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

		objectOutput.writeLong(medicalFacilitiesHomeTwoId);

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
	public long medicalFacilitiesHomeTwoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String maternityPatients;
	public String otherPatients;
	public String counter;
	public long medicalFacilitiesAppId;

}