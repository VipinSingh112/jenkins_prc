/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncra.stages.services.model.CertificateOfVerification;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CertificateOfVerification in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CertificateOfVerificationCacheModel
	implements CacheModel<CertificateOfVerification>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CertificateOfVerificationCacheModel)) {
			return false;
		}

		CertificateOfVerificationCacheModel
			certificateOfVerificationCacheModel =
				(CertificateOfVerificationCacheModel)object;

		if (certificateOfVerificationId ==
				certificateOfVerificationCacheModel.
					certificateOfVerificationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, certificateOfVerificationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{certificateOfVerificationId=");
		sb.append(certificateOfVerificationId);
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
		sb.append(", nameOfApplicant=");
		sb.append(nameOfApplicant);
		sb.append(", productName=");
		sb.append(productName);
		sb.append(", dateCertificateIssued=");
		sb.append(dateCertificateIssued);
		sb.append(", dateOfExpiration=");
		sb.append(dateOfExpiration);
		sb.append(", certificateNumber=");
		sb.append(certificateNumber);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", documentFileEntryId=");
		sb.append(documentFileEntryId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CertificateOfVerification toEntityModel() {
		CertificateOfVerificationImpl certificateOfVerificationImpl =
			new CertificateOfVerificationImpl();

		certificateOfVerificationImpl.setCertificateOfVerificationId(
			certificateOfVerificationId);
		certificateOfVerificationImpl.setGroupId(groupId);
		certificateOfVerificationImpl.setCompanyId(companyId);
		certificateOfVerificationImpl.setUserId(userId);

		if (userName == null) {
			certificateOfVerificationImpl.setUserName("");
		}
		else {
			certificateOfVerificationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			certificateOfVerificationImpl.setCreateDate(null);
		}
		else {
			certificateOfVerificationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			certificateOfVerificationImpl.setModifiedDate(null);
		}
		else {
			certificateOfVerificationImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (nameOfApplicant == null) {
			certificateOfVerificationImpl.setNameOfApplicant("");
		}
		else {
			certificateOfVerificationImpl.setNameOfApplicant(nameOfApplicant);
		}

		if (productName == null) {
			certificateOfVerificationImpl.setProductName("");
		}
		else {
			certificateOfVerificationImpl.setProductName(productName);
		}

		if (dateCertificateIssued == Long.MIN_VALUE) {
			certificateOfVerificationImpl.setDateCertificateIssued(null);
		}
		else {
			certificateOfVerificationImpl.setDateCertificateIssued(
				new Date(dateCertificateIssued));
		}

		if (dateOfExpiration == Long.MIN_VALUE) {
			certificateOfVerificationImpl.setDateOfExpiration(null);
		}
		else {
			certificateOfVerificationImpl.setDateOfExpiration(
				new Date(dateOfExpiration));
		}

		if (certificateNumber == null) {
			certificateOfVerificationImpl.setCertificateNumber("");
		}
		else {
			certificateOfVerificationImpl.setCertificateNumber(
				certificateNumber);
		}

		if (caseId == null) {
			certificateOfVerificationImpl.setCaseId("");
		}
		else {
			certificateOfVerificationImpl.setCaseId(caseId);
		}

		certificateOfVerificationImpl.setDocumentFileEntryId(
			documentFileEntryId);

		certificateOfVerificationImpl.resetOriginalValues();

		return certificateOfVerificationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		certificateOfVerificationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nameOfApplicant = objectInput.readUTF();
		productName = objectInput.readUTF();
		dateCertificateIssued = objectInput.readLong();
		dateOfExpiration = objectInput.readLong();
		certificateNumber = objectInput.readUTF();
		caseId = objectInput.readUTF();

		documentFileEntryId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(certificateOfVerificationId);

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

		if (nameOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfApplicant);
		}

		if (productName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(productName);
		}

		objectOutput.writeLong(dateCertificateIssued);
		objectOutput.writeLong(dateOfExpiration);

		if (certificateNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certificateNumber);
		}

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		objectOutput.writeLong(documentFileEntryId);
	}

	public long certificateOfVerificationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nameOfApplicant;
	public String productName;
	public long dateCertificateIssued;
	public long dateOfExpiration;
	public String certificateNumber;
	public String caseId;
	public long documentFileEntryId;

}