/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.wra.stage.service.model.WraCertificateIssuance;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing WraCertificateIssuance in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class WraCertificateIssuanceCacheModel
	implements CacheModel<WraCertificateIssuance>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof WraCertificateIssuanceCacheModel)) {
			return false;
		}

		WraCertificateIssuanceCacheModel wraCertificateIssuanceCacheModel =
			(WraCertificateIssuanceCacheModel)object;

		if (wraCertificateIssuanceId ==
				wraCertificateIssuanceCacheModel.wraCertificateIssuanceId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, wraCertificateIssuanceId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{wraCertificateIssuanceId=");
		sb.append(wraCertificateIssuanceId);
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
		sb.append(", Category=");
		sb.append(Category);
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
	public WraCertificateIssuance toEntityModel() {
		WraCertificateIssuanceImpl wraCertificateIssuanceImpl =
			new WraCertificateIssuanceImpl();

		wraCertificateIssuanceImpl.setWraCertificateIssuanceId(
			wraCertificateIssuanceId);
		wraCertificateIssuanceImpl.setGroupId(groupId);
		wraCertificateIssuanceImpl.setCompanyId(companyId);
		wraCertificateIssuanceImpl.setUserId(userId);

		if (userName == null) {
			wraCertificateIssuanceImpl.setUserName("");
		}
		else {
			wraCertificateIssuanceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			wraCertificateIssuanceImpl.setCreateDate(null);
		}
		else {
			wraCertificateIssuanceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			wraCertificateIssuanceImpl.setModifiedDate(null);
		}
		else {
			wraCertificateIssuanceImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			wraCertificateIssuanceImpl.setCaseId("");
		}
		else {
			wraCertificateIssuanceImpl.setCaseId(caseId);
		}

		if (licenceNumber == null) {
			wraCertificateIssuanceImpl.setLicenceNumber("");
		}
		else {
			wraCertificateIssuanceImpl.setLicenceNumber(licenceNumber);
		}

		if (status == null) {
			wraCertificateIssuanceImpl.setStatus("");
		}
		else {
			wraCertificateIssuanceImpl.setStatus(status);
		}

		if (Category == null) {
			wraCertificateIssuanceImpl.setCategory("");
		}
		else {
			wraCertificateIssuanceImpl.setCategory(Category);
		}

		if (dateOfLicIssuance == Long.MIN_VALUE) {
			wraCertificateIssuanceImpl.setDateOfLicIssuance(null);
		}
		else {
			wraCertificateIssuanceImpl.setDateOfLicIssuance(
				new Date(dateOfLicIssuance));
		}

		if (dateOfLicenseExpiration == Long.MIN_VALUE) {
			wraCertificateIssuanceImpl.setDateOfLicenseExpiration(null);
		}
		else {
			wraCertificateIssuanceImpl.setDateOfLicenseExpiration(
				new Date(dateOfLicenseExpiration));
		}

		wraCertificateIssuanceImpl.setDocLicFileEntryId(docLicFileEntryId);

		wraCertificateIssuanceImpl.resetOriginalValues();

		return wraCertificateIssuanceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		wraCertificateIssuanceId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		licenceNumber = objectInput.readUTF();
		status = objectInput.readUTF();
		Category = objectInput.readUTF();
		dateOfLicIssuance = objectInput.readLong();
		dateOfLicenseExpiration = objectInput.readLong();

		docLicFileEntryId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(wraCertificateIssuanceId);

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

		if (Category == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Category);
		}

		objectOutput.writeLong(dateOfLicIssuance);
		objectOutput.writeLong(dateOfLicenseExpiration);

		objectOutput.writeLong(docLicFileEntryId);
	}

	public long wraCertificateIssuanceId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public String licenceNumber;
	public String status;
	public String Category;
	public long dateOfLicIssuance;
	public long dateOfLicenseExpiration;
	public long docLicFileEntryId;

}