/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesNurseStaff;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MedicalFacilitiesNurseStaff in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MedicalFacilitiesNurseStaffCacheModel
	implements CacheModel<MedicalFacilitiesNurseStaff>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MedicalFacilitiesNurseStaffCacheModel)) {
			return false;
		}

		MedicalFacilitiesNurseStaffCacheModel
			medicalFacilitiesNurseStaffCacheModel =
				(MedicalFacilitiesNurseStaffCacheModel)object;

		if (medicalFacilitiesNurseStaffId ==
				medicalFacilitiesNurseStaffCacheModel.
					medicalFacilitiesNurseStaffId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, medicalFacilitiesNurseStaffId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", medicalFacilitiesNurseStaffId=");
		sb.append(medicalFacilitiesNurseStaffId);
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
		sb.append(", nStaffName=");
		sb.append(nStaffName);
		sb.append(", nStaffQualification=");
		sb.append(nStaffQualification);
		sb.append(", nStaffState=");
		sb.append(nStaffState);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", medicalFacilitiesAppId=");
		sb.append(medicalFacilitiesAppId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MedicalFacilitiesNurseStaff toEntityModel() {
		MedicalFacilitiesNurseStaffImpl medicalFacilitiesNurseStaffImpl =
			new MedicalFacilitiesNurseStaffImpl();

		if (uuid == null) {
			medicalFacilitiesNurseStaffImpl.setUuid("");
		}
		else {
			medicalFacilitiesNurseStaffImpl.setUuid(uuid);
		}

		medicalFacilitiesNurseStaffImpl.setMedicalFacilitiesNurseStaffId(
			medicalFacilitiesNurseStaffId);
		medicalFacilitiesNurseStaffImpl.setGroupId(groupId);
		medicalFacilitiesNurseStaffImpl.setCompanyId(companyId);
		medicalFacilitiesNurseStaffImpl.setUserId(userId);

		if (userName == null) {
			medicalFacilitiesNurseStaffImpl.setUserName("");
		}
		else {
			medicalFacilitiesNurseStaffImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			medicalFacilitiesNurseStaffImpl.setCreateDate(null);
		}
		else {
			medicalFacilitiesNurseStaffImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			medicalFacilitiesNurseStaffImpl.setModifiedDate(null);
		}
		else {
			medicalFacilitiesNurseStaffImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (nStaffName == null) {
			medicalFacilitiesNurseStaffImpl.setNStaffName("");
		}
		else {
			medicalFacilitiesNurseStaffImpl.setNStaffName(nStaffName);
		}

		if (nStaffQualification == null) {
			medicalFacilitiesNurseStaffImpl.setNStaffQualification("");
		}
		else {
			medicalFacilitiesNurseStaffImpl.setNStaffQualification(
				nStaffQualification);
		}

		if (nStaffState == null) {
			medicalFacilitiesNurseStaffImpl.setNStaffState("");
		}
		else {
			medicalFacilitiesNurseStaffImpl.setNStaffState(nStaffState);
		}

		if (counter == null) {
			medicalFacilitiesNurseStaffImpl.setCounter("");
		}
		else {
			medicalFacilitiesNurseStaffImpl.setCounter(counter);
		}

		medicalFacilitiesNurseStaffImpl.setMedicalFacilitiesAppId(
			medicalFacilitiesAppId);

		medicalFacilitiesNurseStaffImpl.resetOriginalValues();

		return medicalFacilitiesNurseStaffImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		medicalFacilitiesNurseStaffId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nStaffName = objectInput.readUTF();
		nStaffQualification = objectInput.readUTF();
		nStaffState = objectInput.readUTF();
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

		objectOutput.writeLong(medicalFacilitiesNurseStaffId);

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

		if (nStaffName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nStaffName);
		}

		if (nStaffQualification == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nStaffQualification);
		}

		if (nStaffState == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nStaffState);
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
	public long medicalFacilitiesNurseStaffId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nStaffName;
	public String nStaffQualification;
	public String nStaffState;
	public String counter;
	public long medicalFacilitiesAppId;

}