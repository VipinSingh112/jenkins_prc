/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.medical.stages.service.model.MedicalFacilitiesInspection;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MedicalFacilitiesInspection in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MedicalFacilitiesInspectionCacheModel
	implements CacheModel<MedicalFacilitiesInspection>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MedicalFacilitiesInspectionCacheModel)) {
			return false;
		}

		MedicalFacilitiesInspectionCacheModel
			medicalFacilitiesInspectionCacheModel =
				(MedicalFacilitiesInspectionCacheModel)object;

		if (medicalInspectionId ==
				medicalFacilitiesInspectionCacheModel.medicalInspectionId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, medicalInspectionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{medicalInspectionId=");
		sb.append(medicalInspectionId);
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
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", dateOfInspection=");
		sb.append(dateOfInspection);
		sb.append(", timeOfInspection=");
		sb.append(timeOfInspection);
		sb.append(", location=");
		sb.append(location);
		sb.append(", status=");
		sb.append(status);
		sb.append(", medicalApplicationId=");
		sb.append(medicalApplicationId);
		sb.append(", slotBookedByUser=");
		sb.append(slotBookedByUser);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MedicalFacilitiesInspection toEntityModel() {
		MedicalFacilitiesInspectionImpl medicalFacilitiesInspectionImpl =
			new MedicalFacilitiesInspectionImpl();

		medicalFacilitiesInspectionImpl.setMedicalInspectionId(
			medicalInspectionId);
		medicalFacilitiesInspectionImpl.setGroupId(groupId);
		medicalFacilitiesInspectionImpl.setCompanyId(companyId);
		medicalFacilitiesInspectionImpl.setUserId(userId);

		if (userName == null) {
			medicalFacilitiesInspectionImpl.setUserName("");
		}
		else {
			medicalFacilitiesInspectionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			medicalFacilitiesInspectionImpl.setCreateDate(null);
		}
		else {
			medicalFacilitiesInspectionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			medicalFacilitiesInspectionImpl.setModifiedDate(null);
		}
		else {
			medicalFacilitiesInspectionImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (caseId == null) {
			medicalFacilitiesInspectionImpl.setCaseId("");
		}
		else {
			medicalFacilitiesInspectionImpl.setCaseId(caseId);
		}

		if (dateOfInspection == Long.MIN_VALUE) {
			medicalFacilitiesInspectionImpl.setDateOfInspection(null);
		}
		else {
			medicalFacilitiesInspectionImpl.setDateOfInspection(
				new Date(dateOfInspection));
		}

		if (timeOfInspection == null) {
			medicalFacilitiesInspectionImpl.setTimeOfInspection("");
		}
		else {
			medicalFacilitiesInspectionImpl.setTimeOfInspection(
				timeOfInspection);
		}

		if (location == null) {
			medicalFacilitiesInspectionImpl.setLocation("");
		}
		else {
			medicalFacilitiesInspectionImpl.setLocation(location);
		}

		if (status == null) {
			medicalFacilitiesInspectionImpl.setStatus("");
		}
		else {
			medicalFacilitiesInspectionImpl.setStatus(status);
		}

		medicalFacilitiesInspectionImpl.setMedicalApplicationId(
			medicalApplicationId);
		medicalFacilitiesInspectionImpl.setSlotBookedByUser(slotBookedByUser);

		medicalFacilitiesInspectionImpl.resetOriginalValues();

		return medicalFacilitiesInspectionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		medicalInspectionId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		dateOfInspection = objectInput.readLong();
		timeOfInspection = objectInput.readUTF();
		location = objectInput.readUTF();
		status = objectInput.readUTF();

		medicalApplicationId = objectInput.readLong();

		slotBookedByUser = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(medicalInspectionId);

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

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		objectOutput.writeLong(dateOfInspection);

		if (timeOfInspection == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(timeOfInspection);
		}

		if (location == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(location);
		}

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}

		objectOutput.writeLong(medicalApplicationId);

		objectOutput.writeLong(slotBookedByUser);
	}

	public long medicalInspectionId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public long dateOfInspection;
	public String timeOfInspection;
	public String location;
	public String status;
	public long medicalApplicationId;
	public long slotBookedByUser;

}