/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.AddMedicalPractitioner;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddMedicalPractitioner in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddMedicalPractitionerCacheModel
	implements CacheModel<AddMedicalPractitioner>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddMedicalPractitionerCacheModel)) {
			return false;
		}

		AddMedicalPractitionerCacheModel addMedicalPractitionerCacheModel =
			(AddMedicalPractitionerCacheModel)object;

		if (addMedicalPractitionerId ==
				addMedicalPractitionerCacheModel.addMedicalPractitionerId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addMedicalPractitionerId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", addMedicalPractitionerId=");
		sb.append(addMedicalPractitionerId);
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
		sb.append(", medicalPractitionerDate=");
		sb.append(medicalPractitionerDate);
		sb.append(", applicantDate=");
		sb.append(applicantDate);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AddMedicalPractitioner toEntityModel() {
		AddMedicalPractitionerImpl addMedicalPractitionerImpl =
			new AddMedicalPractitionerImpl();

		if (uuid == null) {
			addMedicalPractitionerImpl.setUuid("");
		}
		else {
			addMedicalPractitionerImpl.setUuid(uuid);
		}

		addMedicalPractitionerImpl.setAddMedicalPractitionerId(
			addMedicalPractitionerId);
		addMedicalPractitionerImpl.setGroupId(groupId);
		addMedicalPractitionerImpl.setCompanyId(companyId);
		addMedicalPractitionerImpl.setUserId(userId);

		if (userName == null) {
			addMedicalPractitionerImpl.setUserName("");
		}
		else {
			addMedicalPractitionerImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addMedicalPractitionerImpl.setCreateDate(null);
		}
		else {
			addMedicalPractitionerImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addMedicalPractitionerImpl.setModifiedDate(null);
		}
		else {
			addMedicalPractitionerImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (medicalPractitionerDate == Long.MIN_VALUE) {
			addMedicalPractitionerImpl.setMedicalPractitionerDate(null);
		}
		else {
			addMedicalPractitionerImpl.setMedicalPractitionerDate(
				new Date(medicalPractitionerDate));
		}

		if (applicantDate == Long.MIN_VALUE) {
			addMedicalPractitionerImpl.setApplicantDate(null);
		}
		else {
			addMedicalPractitionerImpl.setApplicantDate(
				new Date(applicantDate));
		}

		if (counter == null) {
			addMedicalPractitionerImpl.setCounter("");
		}
		else {
			addMedicalPractitionerImpl.setCounter(counter);
		}

		addMedicalPractitionerImpl.setHsraApplicationId(hsraApplicationId);

		addMedicalPractitionerImpl.resetOriginalValues();

		return addMedicalPractitionerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		addMedicalPractitionerId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		medicalPractitionerDate = objectInput.readLong();
		applicantDate = objectInput.readLong();
		counter = objectInput.readUTF();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(addMedicalPractitionerId);

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
		objectOutput.writeLong(medicalPractitionerDate);
		objectOutput.writeLong(applicantDate);

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(hsraApplicationId);
	}

	public String uuid;
	public long addMedicalPractitionerId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long medicalPractitionerDate;
	public long applicantDate;
	public String counter;
	public long hsraApplicationId;

}