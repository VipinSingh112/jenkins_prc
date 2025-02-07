/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.stages.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.miic.stages.service.model.MiicCertificateOfIssuance;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MiicCertificateOfIssuance in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MiicCertificateOfIssuanceCacheModel
	implements CacheModel<MiicCertificateOfIssuance>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MiicCertificateOfIssuanceCacheModel)) {
			return false;
		}

		MiicCertificateOfIssuanceCacheModel
			miicCertificateOfIssuanceCacheModel =
				(MiicCertificateOfIssuanceCacheModel)object;

		if (miicCertificateOfIssuanceId ==
				miicCertificateOfIssuanceCacheModel.
					miicCertificateOfIssuanceId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, miicCertificateOfIssuanceId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{miicCertificateOfIssuanceId=");
		sb.append(miicCertificateOfIssuanceId);
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
		sb.append(", certificateNumber=");
		sb.append(certificateNumber);
		sb.append(", dateCertificateIssued=");
		sb.append(dateCertificateIssued);
		sb.append(", dateOfExpiration=");
		sb.append(dateOfExpiration);
		sb.append(", documentFileEntryId=");
		sb.append(documentFileEntryId);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", nameOfLicensedTrustee=");
		sb.append(nameOfLicensedTrustee);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MiicCertificateOfIssuance toEntityModel() {
		MiicCertificateOfIssuanceImpl miicCertificateOfIssuanceImpl =
			new MiicCertificateOfIssuanceImpl();

		miicCertificateOfIssuanceImpl.setMiicCertificateOfIssuanceId(
			miicCertificateOfIssuanceId);
		miicCertificateOfIssuanceImpl.setGroupId(groupId);
		miicCertificateOfIssuanceImpl.setCompanyId(companyId);
		miicCertificateOfIssuanceImpl.setUserId(userId);

		if (userName == null) {
			miicCertificateOfIssuanceImpl.setUserName("");
		}
		else {
			miicCertificateOfIssuanceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			miicCertificateOfIssuanceImpl.setCreateDate(null);
		}
		else {
			miicCertificateOfIssuanceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			miicCertificateOfIssuanceImpl.setModifiedDate(null);
		}
		else {
			miicCertificateOfIssuanceImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (certificateNumber == null) {
			miicCertificateOfIssuanceImpl.setCertificateNumber("");
		}
		else {
			miicCertificateOfIssuanceImpl.setCertificateNumber(
				certificateNumber);
		}

		if (dateCertificateIssued == Long.MIN_VALUE) {
			miicCertificateOfIssuanceImpl.setDateCertificateIssued(null);
		}
		else {
			miicCertificateOfIssuanceImpl.setDateCertificateIssued(
				new Date(dateCertificateIssued));
		}

		if (dateOfExpiration == Long.MIN_VALUE) {
			miicCertificateOfIssuanceImpl.setDateOfExpiration(null);
		}
		else {
			miicCertificateOfIssuanceImpl.setDateOfExpiration(
				new Date(dateOfExpiration));
		}

		miicCertificateOfIssuanceImpl.setDocumentFileEntryId(
			documentFileEntryId);

		if (caseId == null) {
			miicCertificateOfIssuanceImpl.setCaseId("");
		}
		else {
			miicCertificateOfIssuanceImpl.setCaseId(caseId);
		}

		if (nameOfLicensedTrustee == null) {
			miicCertificateOfIssuanceImpl.setNameOfLicensedTrustee("");
		}
		else {
			miicCertificateOfIssuanceImpl.setNameOfLicensedTrustee(
				nameOfLicensedTrustee);
		}

		miicCertificateOfIssuanceImpl.resetOriginalValues();

		return miicCertificateOfIssuanceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		miicCertificateOfIssuanceId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		certificateNumber = objectInput.readUTF();
		dateCertificateIssued = objectInput.readLong();
		dateOfExpiration = objectInput.readLong();

		documentFileEntryId = objectInput.readLong();
		caseId = objectInput.readUTF();
		nameOfLicensedTrustee = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(miicCertificateOfIssuanceId);

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

		if (certificateNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certificateNumber);
		}

		objectOutput.writeLong(dateCertificateIssued);
		objectOutput.writeLong(dateOfExpiration);

		objectOutput.writeLong(documentFileEntryId);

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		if (nameOfLicensedTrustee == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfLicensedTrustee);
		}
	}

	public long miicCertificateOfIssuanceId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String certificateNumber;
	public long dateCertificateIssued;
	public long dateOfExpiration;
	public long documentFileEntryId;
	public String caseId;
	public String nameOfLicensedTrustee;

}