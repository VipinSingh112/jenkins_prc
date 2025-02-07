/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesNurseDetail;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MedicalFacilitiesNurseDetail in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MedicalFacilitiesNurseDetailCacheModel
	implements CacheModel<MedicalFacilitiesNurseDetail>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MedicalFacilitiesNurseDetailCacheModel)) {
			return false;
		}

		MedicalFacilitiesNurseDetailCacheModel
			medicalFacilitiesNurseDetailCacheModel =
				(MedicalFacilitiesNurseDetailCacheModel)object;

		if (medicalFacilitiesNurseDetailId ==
				medicalFacilitiesNurseDetailCacheModel.
					medicalFacilitiesNurseDetailId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, medicalFacilitiesNurseDetailId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", medicalFacilitiesNurseDetailId=");
		sb.append(medicalFacilitiesNurseDetailId);
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
		sb.append(", qNurseName=");
		sb.append(qNurseName);
		sb.append(", qNurseQualification=");
		sb.append(qNurseQualification);
		sb.append(", ratioOfQNurses=");
		sb.append(ratioOfQNurses);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", medicalFacilitiesAppId=");
		sb.append(medicalFacilitiesAppId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MedicalFacilitiesNurseDetail toEntityModel() {
		MedicalFacilitiesNurseDetailImpl medicalFacilitiesNurseDetailImpl =
			new MedicalFacilitiesNurseDetailImpl();

		if (uuid == null) {
			medicalFacilitiesNurseDetailImpl.setUuid("");
		}
		else {
			medicalFacilitiesNurseDetailImpl.setUuid(uuid);
		}

		medicalFacilitiesNurseDetailImpl.setMedicalFacilitiesNurseDetailId(
			medicalFacilitiesNurseDetailId);
		medicalFacilitiesNurseDetailImpl.setGroupId(groupId);
		medicalFacilitiesNurseDetailImpl.setCompanyId(companyId);
		medicalFacilitiesNurseDetailImpl.setUserId(userId);

		if (userName == null) {
			medicalFacilitiesNurseDetailImpl.setUserName("");
		}
		else {
			medicalFacilitiesNurseDetailImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			medicalFacilitiesNurseDetailImpl.setCreateDate(null);
		}
		else {
			medicalFacilitiesNurseDetailImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			medicalFacilitiesNurseDetailImpl.setModifiedDate(null);
		}
		else {
			medicalFacilitiesNurseDetailImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (qNurseName == null) {
			medicalFacilitiesNurseDetailImpl.setQNurseName("");
		}
		else {
			medicalFacilitiesNurseDetailImpl.setQNurseName(qNurseName);
		}

		if (qNurseQualification == null) {
			medicalFacilitiesNurseDetailImpl.setQNurseQualification("");
		}
		else {
			medicalFacilitiesNurseDetailImpl.setQNurseQualification(
				qNurseQualification);
		}

		if (ratioOfQNurses == null) {
			medicalFacilitiesNurseDetailImpl.setRatioOfQNurses("");
		}
		else {
			medicalFacilitiesNurseDetailImpl.setRatioOfQNurses(ratioOfQNurses);
		}

		if (counter == null) {
			medicalFacilitiesNurseDetailImpl.setCounter("");
		}
		else {
			medicalFacilitiesNurseDetailImpl.setCounter(counter);
		}

		medicalFacilitiesNurseDetailImpl.setMedicalFacilitiesAppId(
			medicalFacilitiesAppId);

		medicalFacilitiesNurseDetailImpl.resetOriginalValues();

		return medicalFacilitiesNurseDetailImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		medicalFacilitiesNurseDetailId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		qNurseName = objectInput.readUTF();
		qNurseQualification = objectInput.readUTF();
		ratioOfQNurses = objectInput.readUTF();
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

		objectOutput.writeLong(medicalFacilitiesNurseDetailId);

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

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(medicalFacilitiesAppId);
	}

	public String uuid;
	public long medicalFacilitiesNurseDetailId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String qNurseName;
	public String qNurseQualification;
	public String ratioOfQNurses;
	public String counter;
	public long medicalFacilitiesAppId;

}