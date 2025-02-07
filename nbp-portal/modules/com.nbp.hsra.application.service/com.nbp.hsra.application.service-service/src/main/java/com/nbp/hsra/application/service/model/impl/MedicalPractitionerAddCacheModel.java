/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.MedicalPractitionerAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MedicalPractitionerAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MedicalPractitionerAddCacheModel
	implements CacheModel<MedicalPractitionerAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MedicalPractitionerAddCacheModel)) {
			return false;
		}

		MedicalPractitionerAddCacheModel medicalPractitionerAddCacheModel =
			(MedicalPractitionerAddCacheModel)object;

		if (medicalPractitionerAddId ==
				medicalPractitionerAddCacheModel.medicalPractitionerAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, medicalPractitionerAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{medicalPractitionerAddId=");
		sb.append(medicalPractitionerAddId);
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
		sb.append(", medicalPractitionerName=");
		sb.append(medicalPractitionerName);
		sb.append(", medicalPractitionerAddress=");
		sb.append(medicalPractitionerAddress);
		sb.append(", medicalPractitionerTelephone=");
		sb.append(medicalPractitionerTelephone);
		sb.append(", medicalPractitionerFax=");
		sb.append(medicalPractitionerFax);
		sb.append(", medicalPractitionerEmail=");
		sb.append(medicalPractitionerEmail);
		sb.append(", medicalPractitionerLicenceNo=");
		sb.append(medicalPractitionerLicenceNo);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MedicalPractitionerAdd toEntityModel() {
		MedicalPractitionerAddImpl medicalPractitionerAddImpl =
			new MedicalPractitionerAddImpl();

		medicalPractitionerAddImpl.setMedicalPractitionerAddId(
			medicalPractitionerAddId);
		medicalPractitionerAddImpl.setGroupId(groupId);
		medicalPractitionerAddImpl.setCompanyId(companyId);
		medicalPractitionerAddImpl.setUserId(userId);

		if (userName == null) {
			medicalPractitionerAddImpl.setUserName("");
		}
		else {
			medicalPractitionerAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			medicalPractitionerAddImpl.setCreateDate(null);
		}
		else {
			medicalPractitionerAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			medicalPractitionerAddImpl.setModifiedDate(null);
		}
		else {
			medicalPractitionerAddImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (medicalPractitionerName == null) {
			medicalPractitionerAddImpl.setMedicalPractitionerName("");
		}
		else {
			medicalPractitionerAddImpl.setMedicalPractitionerName(
				medicalPractitionerName);
		}

		if (medicalPractitionerAddress == null) {
			medicalPractitionerAddImpl.setMedicalPractitionerAddress("");
		}
		else {
			medicalPractitionerAddImpl.setMedicalPractitionerAddress(
				medicalPractitionerAddress);
		}

		if (medicalPractitionerTelephone == null) {
			medicalPractitionerAddImpl.setMedicalPractitionerTelephone("");
		}
		else {
			medicalPractitionerAddImpl.setMedicalPractitionerTelephone(
				medicalPractitionerTelephone);
		}

		if (medicalPractitionerFax == null) {
			medicalPractitionerAddImpl.setMedicalPractitionerFax("");
		}
		else {
			medicalPractitionerAddImpl.setMedicalPractitionerFax(
				medicalPractitionerFax);
		}

		if (medicalPractitionerEmail == null) {
			medicalPractitionerAddImpl.setMedicalPractitionerEmail("");
		}
		else {
			medicalPractitionerAddImpl.setMedicalPractitionerEmail(
				medicalPractitionerEmail);
		}

		if (medicalPractitionerLicenceNo == null) {
			medicalPractitionerAddImpl.setMedicalPractitionerLicenceNo("");
		}
		else {
			medicalPractitionerAddImpl.setMedicalPractitionerLicenceNo(
				medicalPractitionerLicenceNo);
		}

		if (counter == null) {
			medicalPractitionerAddImpl.setCounter("");
		}
		else {
			medicalPractitionerAddImpl.setCounter(counter);
		}

		medicalPractitionerAddImpl.setHsraApplicationId(hsraApplicationId);

		medicalPractitionerAddImpl.resetOriginalValues();

		return medicalPractitionerAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		medicalPractitionerAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		medicalPractitionerName = objectInput.readUTF();
		medicalPractitionerAddress = objectInput.readUTF();
		medicalPractitionerTelephone = objectInput.readUTF();
		medicalPractitionerFax = objectInput.readUTF();
		medicalPractitionerEmail = objectInput.readUTF();
		medicalPractitionerLicenceNo = objectInput.readUTF();
		counter = objectInput.readUTF();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(medicalPractitionerAddId);

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

		if (medicalPractitionerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(medicalPractitionerName);
		}

		if (medicalPractitionerAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(medicalPractitionerAddress);
		}

		if (medicalPractitionerTelephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(medicalPractitionerTelephone);
		}

		if (medicalPractitionerFax == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(medicalPractitionerFax);
		}

		if (medicalPractitionerEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(medicalPractitionerEmail);
		}

		if (medicalPractitionerLicenceNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(medicalPractitionerLicenceNo);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(hsraApplicationId);
	}

	public long medicalPractitionerAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String medicalPractitionerName;
	public String medicalPractitionerAddress;
	public String medicalPractitionerTelephone;
	public String medicalPractitionerFax;
	public String medicalPractitionerEmail;
	public String medicalPractitionerLicenceNo;
	public String counter;
	public long hsraApplicationId;

}