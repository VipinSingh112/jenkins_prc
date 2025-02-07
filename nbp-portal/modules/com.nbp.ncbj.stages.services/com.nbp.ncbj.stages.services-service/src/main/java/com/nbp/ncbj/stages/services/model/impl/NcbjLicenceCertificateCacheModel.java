/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncbj.stages.services.model.NcbjLicenceCertificate;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcbjLicenceCertificate in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcbjLicenceCertificateCacheModel
	implements CacheModel<NcbjLicenceCertificate>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcbjLicenceCertificateCacheModel)) {
			return false;
		}

		NcbjLicenceCertificateCacheModel ncbjLicenceCertificateCacheModel =
			(NcbjLicenceCertificateCacheModel)object;

		if (ncbjLicenceCertificateId ==
				ncbjLicenceCertificateCacheModel.ncbjLicenceCertificateId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncbjLicenceCertificateId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{ncbjLicenceCertificateId=");
		sb.append(ncbjLicenceCertificateId);
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
		sb.append(", licenceCertificate=");
		sb.append(licenceCertificate);
		sb.append(", NameOfApplicant=");
		sb.append(NameOfApplicant);
		sb.append(", nameOfCertification=");
		sb.append(nameOfCertification);
		sb.append(", scopeOfCertification=");
		sb.append(scopeOfCertification);
		sb.append(", issueDate=");
		sb.append(issueDate);
		sb.append(", expirationDate=");
		sb.append(expirationDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", docFileEntry=");
		sb.append(docFileEntry);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcbjLicenceCertificate toEntityModel() {
		NcbjLicenceCertificateImpl ncbjLicenceCertificateImpl =
			new NcbjLicenceCertificateImpl();

		ncbjLicenceCertificateImpl.setNcbjLicenceCertificateId(
			ncbjLicenceCertificateId);
		ncbjLicenceCertificateImpl.setGroupId(groupId);
		ncbjLicenceCertificateImpl.setCompanyId(companyId);
		ncbjLicenceCertificateImpl.setUserId(userId);

		if (userName == null) {
			ncbjLicenceCertificateImpl.setUserName("");
		}
		else {
			ncbjLicenceCertificateImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncbjLicenceCertificateImpl.setCreateDate(null);
		}
		else {
			ncbjLicenceCertificateImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncbjLicenceCertificateImpl.setModifiedDate(null);
		}
		else {
			ncbjLicenceCertificateImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			ncbjLicenceCertificateImpl.setCaseId("");
		}
		else {
			ncbjLicenceCertificateImpl.setCaseId(caseId);
		}

		if (licenceCertificate == null) {
			ncbjLicenceCertificateImpl.setLicenceCertificate("");
		}
		else {
			ncbjLicenceCertificateImpl.setLicenceCertificate(
				licenceCertificate);
		}

		if (NameOfApplicant == null) {
			ncbjLicenceCertificateImpl.setNameOfApplicant("");
		}
		else {
			ncbjLicenceCertificateImpl.setNameOfApplicant(NameOfApplicant);
		}

		if (nameOfCertification == null) {
			ncbjLicenceCertificateImpl.setNameOfCertification("");
		}
		else {
			ncbjLicenceCertificateImpl.setNameOfCertification(
				nameOfCertification);
		}

		if (scopeOfCertification == null) {
			ncbjLicenceCertificateImpl.setScopeOfCertification("");
		}
		else {
			ncbjLicenceCertificateImpl.setScopeOfCertification(
				scopeOfCertification);
		}

		if (issueDate == Long.MIN_VALUE) {
			ncbjLicenceCertificateImpl.setIssueDate(null);
		}
		else {
			ncbjLicenceCertificateImpl.setIssueDate(new Date(issueDate));
		}

		if (expirationDate == Long.MIN_VALUE) {
			ncbjLicenceCertificateImpl.setExpirationDate(null);
		}
		else {
			ncbjLicenceCertificateImpl.setExpirationDate(
				new Date(expirationDate));
		}

		if (status == null) {
			ncbjLicenceCertificateImpl.setStatus("");
		}
		else {
			ncbjLicenceCertificateImpl.setStatus(status);
		}

		ncbjLicenceCertificateImpl.setDocFileEntry(docFileEntry);

		ncbjLicenceCertificateImpl.resetOriginalValues();

		return ncbjLicenceCertificateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncbjLicenceCertificateId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		licenceCertificate = objectInput.readUTF();
		NameOfApplicant = objectInput.readUTF();
		nameOfCertification = objectInput.readUTF();
		scopeOfCertification = objectInput.readUTF();
		issueDate = objectInput.readLong();
		expirationDate = objectInput.readLong();
		status = objectInput.readUTF();

		docFileEntry = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ncbjLicenceCertificateId);

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

		if (licenceCertificate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(licenceCertificate);
		}

		if (NameOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(NameOfApplicant);
		}

		if (nameOfCertification == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfCertification);
		}

		if (scopeOfCertification == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(scopeOfCertification);
		}

		objectOutput.writeLong(issueDate);
		objectOutput.writeLong(expirationDate);

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}

		objectOutput.writeLong(docFileEntry);
	}

	public long ncbjLicenceCertificateId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public String licenceCertificate;
	public String NameOfApplicant;
	public String nameOfCertification;
	public String scopeOfCertification;
	public long issueDate;
	public long expirationDate;
	public String status;
	public long docFileEntry;

}