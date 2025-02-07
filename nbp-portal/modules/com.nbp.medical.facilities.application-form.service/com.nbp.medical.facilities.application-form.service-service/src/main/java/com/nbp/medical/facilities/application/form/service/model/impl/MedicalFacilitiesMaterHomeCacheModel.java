/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesMaterHome;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MedicalFacilitiesMaterHome in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MedicalFacilitiesMaterHomeCacheModel
	implements CacheModel<MedicalFacilitiesMaterHome>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MedicalFacilitiesMaterHomeCacheModel)) {
			return false;
		}

		MedicalFacilitiesMaterHomeCacheModel
			medicalFacilitiesMaterHomeCacheModel =
				(MedicalFacilitiesMaterHomeCacheModel)object;

		if (medicalFacilitiesMaterHomeId ==
				medicalFacilitiesMaterHomeCacheModel.
					medicalFacilitiesMaterHomeId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, medicalFacilitiesMaterHomeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", medicalFacilitiesMaterHomeId=");
		sb.append(medicalFacilitiesMaterHomeId);
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
		sb.append(", nurseName=");
		sb.append(nurseName);
		sb.append(", nurseQualification=");
		sb.append(nurseQualification);
		sb.append(", otherPerson=");
		sb.append(otherPerson);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", medicalFacilitiesAppId=");
		sb.append(medicalFacilitiesAppId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MedicalFacilitiesMaterHome toEntityModel() {
		MedicalFacilitiesMaterHomeImpl medicalFacilitiesMaterHomeImpl =
			new MedicalFacilitiesMaterHomeImpl();

		if (uuid == null) {
			medicalFacilitiesMaterHomeImpl.setUuid("");
		}
		else {
			medicalFacilitiesMaterHomeImpl.setUuid(uuid);
		}

		medicalFacilitiesMaterHomeImpl.setMedicalFacilitiesMaterHomeId(
			medicalFacilitiesMaterHomeId);
		medicalFacilitiesMaterHomeImpl.setGroupId(groupId);
		medicalFacilitiesMaterHomeImpl.setCompanyId(companyId);
		medicalFacilitiesMaterHomeImpl.setUserId(userId);

		if (userName == null) {
			medicalFacilitiesMaterHomeImpl.setUserName("");
		}
		else {
			medicalFacilitiesMaterHomeImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			medicalFacilitiesMaterHomeImpl.setCreateDate(null);
		}
		else {
			medicalFacilitiesMaterHomeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			medicalFacilitiesMaterHomeImpl.setModifiedDate(null);
		}
		else {
			medicalFacilitiesMaterHomeImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (nurseName == null) {
			medicalFacilitiesMaterHomeImpl.setNurseName("");
		}
		else {
			medicalFacilitiesMaterHomeImpl.setNurseName(nurseName);
		}

		if (nurseQualification == null) {
			medicalFacilitiesMaterHomeImpl.setNurseQualification("");
		}
		else {
			medicalFacilitiesMaterHomeImpl.setNurseQualification(
				nurseQualification);
		}

		if (otherPerson == null) {
			medicalFacilitiesMaterHomeImpl.setOtherPerson("");
		}
		else {
			medicalFacilitiesMaterHomeImpl.setOtherPerson(otherPerson);
		}

		if (counter == null) {
			medicalFacilitiesMaterHomeImpl.setCounter("");
		}
		else {
			medicalFacilitiesMaterHomeImpl.setCounter(counter);
		}

		medicalFacilitiesMaterHomeImpl.setMedicalFacilitiesAppId(
			medicalFacilitiesAppId);

		medicalFacilitiesMaterHomeImpl.resetOriginalValues();

		return medicalFacilitiesMaterHomeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		medicalFacilitiesMaterHomeId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nurseName = objectInput.readUTF();
		nurseQualification = objectInput.readUTF();
		otherPerson = objectInput.readUTF();
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

		objectOutput.writeLong(medicalFacilitiesMaterHomeId);

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

		if (nurseName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nurseName);
		}

		if (nurseQualification == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nurseQualification);
		}

		if (otherPerson == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherPerson);
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
	public long medicalFacilitiesMaterHomeId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nurseName;
	public String nurseQualification;
	public String otherPerson;
	public String counter;
	public long medicalFacilitiesAppId;

}