/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationFullLicense;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PharmaApplicationFullLicense in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PharmaApplicationFullLicenseCacheModel
	implements CacheModel<PharmaApplicationFullLicense>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PharmaApplicationFullLicenseCacheModel)) {
			return false;
		}

		PharmaApplicationFullLicenseCacheModel
			pharmaApplicationFullLicenseCacheModel =
				(PharmaApplicationFullLicenseCacheModel)object;

		if (pharmaFullLicenseId ==
				pharmaApplicationFullLicenseCacheModel.pharmaFullLicenseId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, pharmaFullLicenseId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{pharmaFullLicenseId=");
		sb.append(pharmaFullLicenseId);
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
	public PharmaApplicationFullLicense toEntityModel() {
		PharmaApplicationFullLicenseImpl pharmaApplicationFullLicenseImpl =
			new PharmaApplicationFullLicenseImpl();

		pharmaApplicationFullLicenseImpl.setPharmaFullLicenseId(
			pharmaFullLicenseId);
		pharmaApplicationFullLicenseImpl.setGroupId(groupId);
		pharmaApplicationFullLicenseImpl.setCompanyId(companyId);
		pharmaApplicationFullLicenseImpl.setUserId(userId);

		if (userName == null) {
			pharmaApplicationFullLicenseImpl.setUserName("");
		}
		else {
			pharmaApplicationFullLicenseImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			pharmaApplicationFullLicenseImpl.setCreateDate(null);
		}
		else {
			pharmaApplicationFullLicenseImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			pharmaApplicationFullLicenseImpl.setModifiedDate(null);
		}
		else {
			pharmaApplicationFullLicenseImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (licenseNumber == null) {
			pharmaApplicationFullLicenseImpl.setLicenseNumber("");
		}
		else {
			pharmaApplicationFullLicenseImpl.setLicenseNumber(licenseNumber);
		}

		if (dateOfIssue == Long.MIN_VALUE) {
			pharmaApplicationFullLicenseImpl.setDateOfIssue(null);
		}
		else {
			pharmaApplicationFullLicenseImpl.setDateOfIssue(
				new Date(dateOfIssue));
		}

		if (feePaidAmount == null) {
			pharmaApplicationFullLicenseImpl.setFeePaidAmount("");
		}
		else {
			pharmaApplicationFullLicenseImpl.setFeePaidAmount(feePaidAmount);
		}

		if (receiptNumber == null) {
			pharmaApplicationFullLicenseImpl.setReceiptNumber("");
		}
		else {
			pharmaApplicationFullLicenseImpl.setReceiptNumber(receiptNumber);
		}

		if (dueDate == Long.MIN_VALUE) {
			pharmaApplicationFullLicenseImpl.setDueDate(null);
		}
		else {
			pharmaApplicationFullLicenseImpl.setDueDate(new Date(dueDate));
		}

		if (leadTime == null) {
			pharmaApplicationFullLicenseImpl.setLeadTime("");
		}
		else {
			pharmaApplicationFullLicenseImpl.setLeadTime(leadTime);
		}

		if (caseId == null) {
			pharmaApplicationFullLicenseImpl.setCaseId("");
		}
		else {
			pharmaApplicationFullLicenseImpl.setCaseId(caseId);
		}

		if (licenseDocId == null) {
			pharmaApplicationFullLicenseImpl.setLicenseDocId("");
		}
		else {
			pharmaApplicationFullLicenseImpl.setLicenseDocId(licenseDocId);
		}

		pharmaApplicationFullLicenseImpl.resetOriginalValues();

		return pharmaApplicationFullLicenseImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		pharmaFullLicenseId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		licenseNumber = objectInput.readUTF();
		dateOfIssue = objectInput.readLong();
		feePaidAmount = objectInput.readUTF();
		receiptNumber = objectInput.readUTF();
		dueDate = objectInput.readLong();
		leadTime = objectInput.readUTF();
		caseId = objectInput.readUTF();
		licenseDocId = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(pharmaFullLicenseId);

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

	public long pharmaFullLicenseId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String licenseNumber;
	public long dateOfIssue;
	public String feePaidAmount;
	public String receiptNumber;
	public long dueDate;
	public String leadTime;
	public String caseId;
	public String licenseDocId;

}