/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.stage.services.model.JTBLicenceCertificate;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JTBLicenceCertificate in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JTBLicenceCertificateCacheModel
	implements CacheModel<JTBLicenceCertificate>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JTBLicenceCertificateCacheModel)) {
			return false;
		}

		JTBLicenceCertificateCacheModel jtbLicenceCertificateCacheModel =
			(JTBLicenceCertificateCacheModel)object;

		if (jTBLicenceCertificateId ==
				jtbLicenceCertificateCacheModel.jTBLicenceCertificateId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jTBLicenceCertificateId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{jTBLicenceCertificateId=");
		sb.append(jTBLicenceCertificateId);
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
		sb.append(", category=");
		sb.append(category);
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
	public JTBLicenceCertificate toEntityModel() {
		JTBLicenceCertificateImpl jtbLicenceCertificateImpl =
			new JTBLicenceCertificateImpl();

		jtbLicenceCertificateImpl.setJTBLicenceCertificateId(
			jTBLicenceCertificateId);
		jtbLicenceCertificateImpl.setGroupId(groupId);
		jtbLicenceCertificateImpl.setCompanyId(companyId);
		jtbLicenceCertificateImpl.setUserId(userId);

		if (userName == null) {
			jtbLicenceCertificateImpl.setUserName("");
		}
		else {
			jtbLicenceCertificateImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jtbLicenceCertificateImpl.setCreateDate(null);
		}
		else {
			jtbLicenceCertificateImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jtbLicenceCertificateImpl.setModifiedDate(null);
		}
		else {
			jtbLicenceCertificateImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			jtbLicenceCertificateImpl.setCaseId("");
		}
		else {
			jtbLicenceCertificateImpl.setCaseId(caseId);
		}

		if (licenceCertificate == null) {
			jtbLicenceCertificateImpl.setLicenceCertificate("");
		}
		else {
			jtbLicenceCertificateImpl.setLicenceCertificate(licenceCertificate);
		}

		if (category == null) {
			jtbLicenceCertificateImpl.setCategory("");
		}
		else {
			jtbLicenceCertificateImpl.setCategory(category);
		}

		if (issueDate == Long.MIN_VALUE) {
			jtbLicenceCertificateImpl.setIssueDate(null);
		}
		else {
			jtbLicenceCertificateImpl.setIssueDate(new Date(issueDate));
		}

		if (expirationDate == Long.MIN_VALUE) {
			jtbLicenceCertificateImpl.setExpirationDate(null);
		}
		else {
			jtbLicenceCertificateImpl.setExpirationDate(
				new Date(expirationDate));
		}

		if (status == null) {
			jtbLicenceCertificateImpl.setStatus("");
		}
		else {
			jtbLicenceCertificateImpl.setStatus(status);
		}

		jtbLicenceCertificateImpl.setDocFileEntry(docFileEntry);

		jtbLicenceCertificateImpl.resetOriginalValues();

		return jtbLicenceCertificateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		jTBLicenceCertificateId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		licenceCertificate = objectInput.readUTF();
		category = objectInput.readUTF();
		issueDate = objectInput.readLong();
		expirationDate = objectInput.readLong();
		status = objectInput.readUTF();

		docFileEntry = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(jTBLicenceCertificateId);

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

		if (category == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(category);
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

	public long jTBLicenceCertificateId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public String licenceCertificate;
	public String category;
	public long issueDate;
	public long expirationDate;
	public String status;
	public long docFileEntry;

}