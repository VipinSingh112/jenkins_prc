/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.quarry.stage.service.model.QueryLicenceCertificate;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QueryLicenceCertificate in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class QueryLicenceCertificateCacheModel
	implements CacheModel<QueryLicenceCertificate>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof QueryLicenceCertificateCacheModel)) {
			return false;
		}

		QueryLicenceCertificateCacheModel queryLicenceCertificateCacheModel =
			(QueryLicenceCertificateCacheModel)object;

		if (queryLicenceCertificateId ==
				queryLicenceCertificateCacheModel.queryLicenceCertificateId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, queryLicenceCertificateId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{queryLicenceCertificateId=");
		sb.append(queryLicenceCertificateId);
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
	public QueryLicenceCertificate toEntityModel() {
		QueryLicenceCertificateImpl queryLicenceCertificateImpl =
			new QueryLicenceCertificateImpl();

		queryLicenceCertificateImpl.setQueryLicenceCertificateId(
			queryLicenceCertificateId);
		queryLicenceCertificateImpl.setGroupId(groupId);
		queryLicenceCertificateImpl.setCompanyId(companyId);
		queryLicenceCertificateImpl.setUserId(userId);

		if (userName == null) {
			queryLicenceCertificateImpl.setUserName("");
		}
		else {
			queryLicenceCertificateImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			queryLicenceCertificateImpl.setCreateDate(null);
		}
		else {
			queryLicenceCertificateImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			queryLicenceCertificateImpl.setModifiedDate(null);
		}
		else {
			queryLicenceCertificateImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			queryLicenceCertificateImpl.setCaseId("");
		}
		else {
			queryLicenceCertificateImpl.setCaseId(caseId);
		}

		if (licenceCertificate == null) {
			queryLicenceCertificateImpl.setLicenceCertificate("");
		}
		else {
			queryLicenceCertificateImpl.setLicenceCertificate(
				licenceCertificate);
		}

		if (category == null) {
			queryLicenceCertificateImpl.setCategory("");
		}
		else {
			queryLicenceCertificateImpl.setCategory(category);
		}

		if (issueDate == Long.MIN_VALUE) {
			queryLicenceCertificateImpl.setIssueDate(null);
		}
		else {
			queryLicenceCertificateImpl.setIssueDate(new Date(issueDate));
		}

		if (expirationDate == Long.MIN_VALUE) {
			queryLicenceCertificateImpl.setExpirationDate(null);
		}
		else {
			queryLicenceCertificateImpl.setExpirationDate(
				new Date(expirationDate));
		}

		if (status == null) {
			queryLicenceCertificateImpl.setStatus("");
		}
		else {
			queryLicenceCertificateImpl.setStatus(status);
		}

		queryLicenceCertificateImpl.setDocFileEntry(docFileEntry);

		queryLicenceCertificateImpl.resetOriginalValues();

		return queryLicenceCertificateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		queryLicenceCertificateId = objectInput.readLong();

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
		objectOutput.writeLong(queryLicenceCertificateId);

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

	public long queryLicenceCertificateId;
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