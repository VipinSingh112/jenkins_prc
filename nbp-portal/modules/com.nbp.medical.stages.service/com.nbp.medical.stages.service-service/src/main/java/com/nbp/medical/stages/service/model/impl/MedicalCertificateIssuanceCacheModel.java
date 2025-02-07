/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.medical.stages.service.model.MedicalCertificateIssuance;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MedicalCertificateIssuance in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MedicalCertificateIssuanceCacheModel
	implements CacheModel<MedicalCertificateIssuance>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MedicalCertificateIssuanceCacheModel)) {
			return false;
		}

		MedicalCertificateIssuanceCacheModel
			medicalCertificateIssuanceCacheModel =
				(MedicalCertificateIssuanceCacheModel)object;

		if (medicalCertificateIssuanceId ==
				medicalCertificateIssuanceCacheModel.
					medicalCertificateIssuanceId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, medicalCertificateIssuanceId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{medicalCertificateIssuanceId=");
		sb.append(medicalCertificateIssuanceId);
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
		sb.append(", licenceNumber=");
		sb.append(licenceNumber);
		sb.append(", status=");
		sb.append(status);
		sb.append(", medicalCategory=");
		sb.append(medicalCategory);
		sb.append(", dateOfLicIssuance=");
		sb.append(dateOfLicIssuance);
		sb.append(", dateOfLicenseExpiration=");
		sb.append(dateOfLicenseExpiration);
		sb.append(", docLicFileEntryId=");
		sb.append(docLicFileEntryId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MedicalCertificateIssuance toEntityModel() {
		MedicalCertificateIssuanceImpl medicalCertificateIssuanceImpl =
			new MedicalCertificateIssuanceImpl();

		medicalCertificateIssuanceImpl.setMedicalCertificateIssuanceId(
			medicalCertificateIssuanceId);
		medicalCertificateIssuanceImpl.setGroupId(groupId);
		medicalCertificateIssuanceImpl.setCompanyId(companyId);
		medicalCertificateIssuanceImpl.setUserId(userId);

		if (userName == null) {
			medicalCertificateIssuanceImpl.setUserName("");
		}
		else {
			medicalCertificateIssuanceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			medicalCertificateIssuanceImpl.setCreateDate(null);
		}
		else {
			medicalCertificateIssuanceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			medicalCertificateIssuanceImpl.setModifiedDate(null);
		}
		else {
			medicalCertificateIssuanceImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (caseId == null) {
			medicalCertificateIssuanceImpl.setCaseId("");
		}
		else {
			medicalCertificateIssuanceImpl.setCaseId(caseId);
		}

		if (licenceNumber == null) {
			medicalCertificateIssuanceImpl.setLicenceNumber("");
		}
		else {
			medicalCertificateIssuanceImpl.setLicenceNumber(licenceNumber);
		}

		if (status == null) {
			medicalCertificateIssuanceImpl.setStatus("");
		}
		else {
			medicalCertificateIssuanceImpl.setStatus(status);
		}

		if (medicalCategory == null) {
			medicalCertificateIssuanceImpl.setMedicalCategory("");
		}
		else {
			medicalCertificateIssuanceImpl.setMedicalCategory(medicalCategory);
		}

		if (dateOfLicIssuance == Long.MIN_VALUE) {
			medicalCertificateIssuanceImpl.setDateOfLicIssuance(null);
		}
		else {
			medicalCertificateIssuanceImpl.setDateOfLicIssuance(
				new Date(dateOfLicIssuance));
		}

		if (dateOfLicenseExpiration == Long.MIN_VALUE) {
			medicalCertificateIssuanceImpl.setDateOfLicenseExpiration(null);
		}
		else {
			medicalCertificateIssuanceImpl.setDateOfLicenseExpiration(
				new Date(dateOfLicenseExpiration));
		}

		medicalCertificateIssuanceImpl.setDocLicFileEntryId(docLicFileEntryId);

		medicalCertificateIssuanceImpl.resetOriginalValues();

		return medicalCertificateIssuanceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		medicalCertificateIssuanceId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		licenceNumber = objectInput.readUTF();
		status = objectInput.readUTF();
		medicalCategory = objectInput.readUTF();
		dateOfLicIssuance = objectInput.readLong();
		dateOfLicenseExpiration = objectInput.readLong();

		docLicFileEntryId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(medicalCertificateIssuanceId);

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

		if (licenceNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(licenceNumber);
		}

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}

		if (medicalCategory == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(medicalCategory);
		}

		objectOutput.writeLong(dateOfLicIssuance);
		objectOutput.writeLong(dateOfLicenseExpiration);

		objectOutput.writeLong(docLicFileEntryId);
	}

	public long medicalCertificateIssuanceId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public String licenceNumber;
	public String status;
	public String medicalCategory;
	public long dateOfLicIssuance;
	public long dateOfLicenseExpiration;
	public long docLicFileEntryId;

}