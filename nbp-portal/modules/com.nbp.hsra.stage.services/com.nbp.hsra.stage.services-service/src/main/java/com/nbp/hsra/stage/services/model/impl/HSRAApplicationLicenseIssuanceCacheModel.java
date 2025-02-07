/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.stage.services.model.HSRAApplicationLicenseIssuance;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing HSRAApplicationLicenseIssuance in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HSRAApplicationLicenseIssuanceCacheModel
	implements CacheModel<HSRAApplicationLicenseIssuance>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof HSRAApplicationLicenseIssuanceCacheModel)) {
			return false;
		}

		HSRAApplicationLicenseIssuanceCacheModel
			hsraApplicationLicenseIssuanceCacheModel =
				(HSRAApplicationLicenseIssuanceCacheModel)object;

		if (hsraFullLicenseId ==
				hsraApplicationLicenseIssuanceCacheModel.hsraFullLicenseId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, hsraFullLicenseId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{hsraFullLicenseId=");
		sb.append(hsraFullLicenseId);
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
		sb.append(", licenseNumber=");
		sb.append(licenseNumber);
		sb.append(", dateOfIssue=");
		sb.append(dateOfIssue);
		sb.append(", dateOfExpiry=");
		sb.append(dateOfExpiry);
		sb.append(", status=");
		sb.append(status);
		sb.append(", feePaidAmount=");
		sb.append(feePaidAmount);
		sb.append(", receiptNumber=");
		sb.append(receiptNumber);
		sb.append(", dueDate=");
		sb.append(dueDate);
		sb.append(", leadTime=");
		sb.append(leadTime);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", licenseDocId=");
		sb.append(licenseDocId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public HSRAApplicationLicenseIssuance toEntityModel() {
		HSRAApplicationLicenseIssuanceImpl hsraApplicationLicenseIssuanceImpl =
			new HSRAApplicationLicenseIssuanceImpl();

		hsraApplicationLicenseIssuanceImpl.setHsraFullLicenseId(
			hsraFullLicenseId);
		hsraApplicationLicenseIssuanceImpl.setGroupId(groupId);
		hsraApplicationLicenseIssuanceImpl.setCompanyId(companyId);
		hsraApplicationLicenseIssuanceImpl.setUserId(userId);

		if (userName == null) {
			hsraApplicationLicenseIssuanceImpl.setUserName("");
		}
		else {
			hsraApplicationLicenseIssuanceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			hsraApplicationLicenseIssuanceImpl.setCreateDate(null);
		}
		else {
			hsraApplicationLicenseIssuanceImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			hsraApplicationLicenseIssuanceImpl.setModifiedDate(null);
		}
		else {
			hsraApplicationLicenseIssuanceImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (licenseNumber == null) {
			hsraApplicationLicenseIssuanceImpl.setLicenseNumber("");
		}
		else {
			hsraApplicationLicenseIssuanceImpl.setLicenseNumber(licenseNumber);
		}

		if (dateOfIssue == Long.MIN_VALUE) {
			hsraApplicationLicenseIssuanceImpl.setDateOfIssue(null);
		}
		else {
			hsraApplicationLicenseIssuanceImpl.setDateOfIssue(
				new Date(dateOfIssue));
		}

		if (dateOfExpiry == Long.MIN_VALUE) {
			hsraApplicationLicenseIssuanceImpl.setDateOfExpiry(null);
		}
		else {
			hsraApplicationLicenseIssuanceImpl.setDateOfExpiry(
				new Date(dateOfExpiry));
		}

		if (status == null) {
			hsraApplicationLicenseIssuanceImpl.setStatus("");
		}
		else {
			hsraApplicationLicenseIssuanceImpl.setStatus(status);
		}

		if (feePaidAmount == null) {
			hsraApplicationLicenseIssuanceImpl.setFeePaidAmount("");
		}
		else {
			hsraApplicationLicenseIssuanceImpl.setFeePaidAmount(feePaidAmount);
		}

		if (receiptNumber == null) {
			hsraApplicationLicenseIssuanceImpl.setReceiptNumber("");
		}
		else {
			hsraApplicationLicenseIssuanceImpl.setReceiptNumber(receiptNumber);
		}

		if (dueDate == Long.MIN_VALUE) {
			hsraApplicationLicenseIssuanceImpl.setDueDate(null);
		}
		else {
			hsraApplicationLicenseIssuanceImpl.setDueDate(new Date(dueDate));
		}

		if (leadTime == null) {
			hsraApplicationLicenseIssuanceImpl.setLeadTime("");
		}
		else {
			hsraApplicationLicenseIssuanceImpl.setLeadTime(leadTime);
		}

		if (caseId == null) {
			hsraApplicationLicenseIssuanceImpl.setCaseId("");
		}
		else {
			hsraApplicationLicenseIssuanceImpl.setCaseId(caseId);
		}

		if (licenseDocId == null) {
			hsraApplicationLicenseIssuanceImpl.setLicenseDocId("");
		}
		else {
			hsraApplicationLicenseIssuanceImpl.setLicenseDocId(licenseDocId);
		}

		hsraApplicationLicenseIssuanceImpl.resetOriginalValues();

		return hsraApplicationLicenseIssuanceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		hsraFullLicenseId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		licenseNumber = objectInput.readUTF();
		dateOfIssue = objectInput.readLong();
		dateOfExpiry = objectInput.readLong();
		status = objectInput.readUTF();
		feePaidAmount = objectInput.readUTF();
		receiptNumber = objectInput.readUTF();
		dueDate = objectInput.readLong();
		leadTime = objectInput.readUTF();
		caseId = objectInput.readUTF();
		licenseDocId = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(hsraFullLicenseId);

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

		if (licenseNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(licenseNumber);
		}

		objectOutput.writeLong(dateOfIssue);
		objectOutput.writeLong(dateOfExpiry);

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}

		if (feePaidAmount == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(feePaidAmount);
		}

		if (receiptNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(receiptNumber);
		}

		objectOutput.writeLong(dueDate);

		if (leadTime == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(leadTime);
		}

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		if (licenseDocId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(licenseDocId);
		}
	}

	public long hsraFullLicenseId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String licenseNumber;
	public long dateOfIssue;
	public long dateOfExpiry;
	public String status;
	public String feePaidAmount;
	public String receiptNumber;
	public long dueDate;
	public String leadTime;
	public String caseId;
	public String licenseDocId;

}