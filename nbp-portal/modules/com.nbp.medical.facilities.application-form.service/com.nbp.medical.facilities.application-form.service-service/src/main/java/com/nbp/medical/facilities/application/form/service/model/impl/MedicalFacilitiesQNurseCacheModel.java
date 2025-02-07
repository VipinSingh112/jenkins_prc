/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesQNurse;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MedicalFacilitiesQNurse in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MedicalFacilitiesQNurseCacheModel
	implements CacheModel<MedicalFacilitiesQNurse>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MedicalFacilitiesQNurseCacheModel)) {
			return false;
		}

		MedicalFacilitiesQNurseCacheModel medicalFacilitiesQNurseCacheModel =
			(MedicalFacilitiesQNurseCacheModel)object;

		if (medicalFacilitiesQNurseId ==
				medicalFacilitiesQNurseCacheModel.medicalFacilitiesQNurseId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, medicalFacilitiesQNurseId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", medicalFacilitiesQNurseId=");
		sb.append(medicalFacilitiesQNurseId);
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
		sb.append(", checkQualifiedNurse=");
		sb.append(checkQualifiedNurse);
		sb.append(", name=");
		sb.append(name);
		sb.append(", qualification=");
		sb.append(qualification);
		sb.append(", nursingStaffCategory=");
		sb.append(nursingStaffCategory);
		sb.append(", qNurseName=");
		sb.append(qNurseName);
		sb.append(", qNurseQualification=");
		sb.append(qNurseQualification);
		sb.append(", ratioOfQNurses=");
		sb.append(ratioOfQNurses);
		sb.append(", medicalFacilitiesAppId=");
		sb.append(medicalFacilitiesAppId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MedicalFacilitiesQNurse toEntityModel() {
		MedicalFacilitiesQNurseImpl medicalFacilitiesQNurseImpl =
			new MedicalFacilitiesQNurseImpl();

		if (uuid == null) {
			medicalFacilitiesQNurseImpl.setUuid("");
		}
		else {
			medicalFacilitiesQNurseImpl.setUuid(uuid);
		}

		medicalFacilitiesQNurseImpl.setMedicalFacilitiesQNurseId(
			medicalFacilitiesQNurseId);
		medicalFacilitiesQNurseImpl.setGroupId(groupId);
		medicalFacilitiesQNurseImpl.setCompanyId(companyId);
		medicalFacilitiesQNurseImpl.setUserId(userId);

		if (userName == null) {
			medicalFacilitiesQNurseImpl.setUserName("");
		}
		else {
			medicalFacilitiesQNurseImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			medicalFacilitiesQNurseImpl.setCreateDate(null);
		}
		else {
			medicalFacilitiesQNurseImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			medicalFacilitiesQNurseImpl.setModifiedDate(null);
		}
		else {
			medicalFacilitiesQNurseImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (checkQualifiedNurse == null) {
			medicalFacilitiesQNurseImpl.setCheckQualifiedNurse("");
		}
		else {
			medicalFacilitiesQNurseImpl.setCheckQualifiedNurse(
				checkQualifiedNurse);
		}

		if (name == null) {
			medicalFacilitiesQNurseImpl.setName("");
		}
		else {
			medicalFacilitiesQNurseImpl.setName(name);
		}

		if (qualification == null) {
			medicalFacilitiesQNurseImpl.setQualification("");
		}
		else {
			medicalFacilitiesQNurseImpl.setQualification(qualification);
		}

		if (nursingStaffCategory == null) {
			medicalFacilitiesQNurseImpl.setNursingStaffCategory("");
		}
		else {
			medicalFacilitiesQNurseImpl.setNursingStaffCategory(
				nursingStaffCategory);
		}

		if (qNurseName == null) {
			medicalFacilitiesQNurseImpl.setQNurseName("");
		}
		else {
			medicalFacilitiesQNurseImpl.setQNurseName(qNurseName);
		}

		if (qNurseQualification == null) {
			medicalFacilitiesQNurseImpl.setQNurseQualification("");
		}
		else {
			medicalFacilitiesQNurseImpl.setQNurseQualification(
				qNurseQualification);
		}

		if (ratioOfQNurses == null) {
			medicalFacilitiesQNurseImpl.setRatioOfQNurses("");
		}
		else {
			medicalFacilitiesQNurseImpl.setRatioOfQNurses(ratioOfQNurses);
		}

		medicalFacilitiesQNurseImpl.setMedicalFacilitiesAppId(
			medicalFacilitiesAppId);

		medicalFacilitiesQNurseImpl.resetOriginalValues();

		return medicalFacilitiesQNurseImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		medicalFacilitiesQNurseId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		checkQualifiedNurse = objectInput.readUTF();
		name = objectInput.readUTF();
		qualification = objectInput.readUTF();
		nursingStaffCategory = objectInput.readUTF();
		qNurseName = objectInput.readUTF();
		qNurseQualification = objectInput.readUTF();
		ratioOfQNurses = objectInput.readUTF();

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

		objectOutput.writeLong(medicalFacilitiesQNurseId);

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

		if (checkQualifiedNurse == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(checkQualifiedNurse);
		}

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (qualification == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualification);
		}

		if (nursingStaffCategory == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nursingStaffCategory);
		}

		if (qNurseName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qNurseName);
		}

		if (qNurseQualification == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qNurseQualification);
		}

		if (ratioOfQNurses == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ratioOfQNurses);
		}

		objectOutput.writeLong(medicalFacilitiesAppId);
	}

	public String uuid;
	public long medicalFacilitiesQNurseId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String checkQualifiedNurse;
	public String name;
	public String qualification;
	public String nursingStaffCategory;
	public String qNurseName;
	public String qNurseQualification;
	public String ratioOfQNurses;
	public long medicalFacilitiesAppId;

}