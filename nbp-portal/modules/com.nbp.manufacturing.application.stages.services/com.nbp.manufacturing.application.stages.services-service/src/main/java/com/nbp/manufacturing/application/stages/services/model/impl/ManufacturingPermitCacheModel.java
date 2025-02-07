/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.manufacturing.application.stages.services.model.ManufacturingPermit;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ManufacturingPermit in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ManufacturingPermitCacheModel
	implements CacheModel<ManufacturingPermit>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ManufacturingPermitCacheModel)) {
			return false;
		}

		ManufacturingPermitCacheModel manufacturingPermitCacheModel =
			(ManufacturingPermitCacheModel)object;

		if (manufacturingPermitId ==
				manufacturingPermitCacheModel.manufacturingPermitId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, manufacturingPermitId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{manufacturingPermitId=");
		sb.append(manufacturingPermitId);
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
		sb.append(", PIRPermtNumber=");
		sb.append(PIRPermtNumber);
		sb.append(", dateOfIssue=");
		sb.append(dateOfIssue);
		sb.append(", dateOfExpiration=");
		sb.append(dateOfExpiration);
		sb.append(", durationOfPermit=");
		sb.append(durationOfPermit);
		sb.append(", typeOfPermit=");
		sb.append(typeOfPermit);
		sb.append(", numberOfExtensions=");
		sb.append(numberOfExtensions);
		sb.append(", parish=");
		sb.append(parish);
		sb.append(", pirPermitCertificateNumber=");
		sb.append(pirPermitCertificateNumber);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ManufacturingPermit toEntityModel() {
		ManufacturingPermitImpl manufacturingPermitImpl =
			new ManufacturingPermitImpl();

		manufacturingPermitImpl.setManufacturingPermitId(manufacturingPermitId);
		manufacturingPermitImpl.setGroupId(groupId);
		manufacturingPermitImpl.setCompanyId(companyId);
		manufacturingPermitImpl.setUserId(userId);

		if (userName == null) {
			manufacturingPermitImpl.setUserName("");
		}
		else {
			manufacturingPermitImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			manufacturingPermitImpl.setCreateDate(null);
		}
		else {
			manufacturingPermitImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			manufacturingPermitImpl.setModifiedDate(null);
		}
		else {
			manufacturingPermitImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			manufacturingPermitImpl.setCaseId("");
		}
		else {
			manufacturingPermitImpl.setCaseId(caseId);
		}

		if (PIRPermtNumber == null) {
			manufacturingPermitImpl.setPIRPermtNumber("");
		}
		else {
			manufacturingPermitImpl.setPIRPermtNumber(PIRPermtNumber);
		}

		if (dateOfIssue == Long.MIN_VALUE) {
			manufacturingPermitImpl.setDateOfIssue(null);
		}
		else {
			manufacturingPermitImpl.setDateOfIssue(new Date(dateOfIssue));
		}

		if (dateOfExpiration == Long.MIN_VALUE) {
			manufacturingPermitImpl.setDateOfExpiration(null);
		}
		else {
			manufacturingPermitImpl.setDateOfExpiration(
				new Date(dateOfExpiration));
		}

		if (durationOfPermit == null) {
			manufacturingPermitImpl.setDurationOfPermit("");
		}
		else {
			manufacturingPermitImpl.setDurationOfPermit(durationOfPermit);
		}

		if (typeOfPermit == null) {
			manufacturingPermitImpl.setTypeOfPermit("");
		}
		else {
			manufacturingPermitImpl.setTypeOfPermit(typeOfPermit);
		}

		if (numberOfExtensions == null) {
			manufacturingPermitImpl.setNumberOfExtensions("");
		}
		else {
			manufacturingPermitImpl.setNumberOfExtensions(numberOfExtensions);
		}

		if (parish == null) {
			manufacturingPermitImpl.setParish("");
		}
		else {
			manufacturingPermitImpl.setParish(parish);
		}

		manufacturingPermitImpl.setPirPermitCertificateNumber(
			pirPermitCertificateNumber);

		manufacturingPermitImpl.resetOriginalValues();

		return manufacturingPermitImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		manufacturingPermitId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		PIRPermtNumber = objectInput.readUTF();
		dateOfIssue = objectInput.readLong();
		dateOfExpiration = objectInput.readLong();
		durationOfPermit = objectInput.readUTF();
		typeOfPermit = objectInput.readUTF();
		numberOfExtensions = objectInput.readUTF();
		parish = objectInput.readUTF();

		pirPermitCertificateNumber = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(manufacturingPermitId);

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

		if (PIRPermtNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(PIRPermtNumber);
		}

		objectOutput.writeLong(dateOfIssue);
		objectOutput.writeLong(dateOfExpiration);

		if (durationOfPermit == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(durationOfPermit);
		}

		if (typeOfPermit == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfPermit);
		}

		if (numberOfExtensions == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numberOfExtensions);
		}

		if (parish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(parish);
		}

		objectOutput.writeLong(pirPermitCertificateNumber);
	}

	public long manufacturingPermitId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public String PIRPermtNumber;
	public long dateOfIssue;
	public long dateOfExpiration;
	public String durationOfPermit;
	public String typeOfPermit;
	public String numberOfExtensions;
	public String parish;
	public long pirPermitCertificateNumber;

}