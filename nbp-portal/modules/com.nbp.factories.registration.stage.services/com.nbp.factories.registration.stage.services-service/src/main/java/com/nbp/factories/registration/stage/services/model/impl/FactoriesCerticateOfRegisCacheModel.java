/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.factories.registration.stage.services.model.FactoriesCerticateOfRegis;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FactoriesCerticateOfRegis in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FactoriesCerticateOfRegisCacheModel
	implements CacheModel<FactoriesCerticateOfRegis>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FactoriesCerticateOfRegisCacheModel)) {
			return false;
		}

		FactoriesCerticateOfRegisCacheModel
			factoriesCerticateOfRegisCacheModel =
				(FactoriesCerticateOfRegisCacheModel)object;

		if (factoriesCerticateOfRegisId ==
				factoriesCerticateOfRegisCacheModel.
					factoriesCerticateOfRegisId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, factoriesCerticateOfRegisId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{factoriesCerticateOfRegisId=");
		sb.append(factoriesCerticateOfRegisId);
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
		sb.append(", nameOfEstablishment=");
		sb.append(nameOfEstablishment);
		sb.append(", parish=");
		sb.append(parish);
		sb.append(", procuctCatAndName=");
		sb.append(procuctCatAndName);
		sb.append(", certificateIssueDate=");
		sb.append(certificateIssueDate);
		sb.append(", dateOfExpiration=");
		sb.append(dateOfExpiration);
		sb.append(", registration=");
		sb.append(registration);
		sb.append(", status=");
		sb.append(status);
		sb.append(", docFileEntry=");
		sb.append(docFileEntry);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FactoriesCerticateOfRegis toEntityModel() {
		FactoriesCerticateOfRegisImpl factoriesCerticateOfRegisImpl =
			new FactoriesCerticateOfRegisImpl();

		factoriesCerticateOfRegisImpl.setFactoriesCerticateOfRegisId(
			factoriesCerticateOfRegisId);
		factoriesCerticateOfRegisImpl.setGroupId(groupId);
		factoriesCerticateOfRegisImpl.setCompanyId(companyId);
		factoriesCerticateOfRegisImpl.setUserId(userId);

		if (userName == null) {
			factoriesCerticateOfRegisImpl.setUserName("");
		}
		else {
			factoriesCerticateOfRegisImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			factoriesCerticateOfRegisImpl.setCreateDate(null);
		}
		else {
			factoriesCerticateOfRegisImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			factoriesCerticateOfRegisImpl.setModifiedDate(null);
		}
		else {
			factoriesCerticateOfRegisImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (caseId == null) {
			factoriesCerticateOfRegisImpl.setCaseId("");
		}
		else {
			factoriesCerticateOfRegisImpl.setCaseId(caseId);
		}

		if (nameOfEstablishment == null) {
			factoriesCerticateOfRegisImpl.setNameOfEstablishment("");
		}
		else {
			factoriesCerticateOfRegisImpl.setNameOfEstablishment(
				nameOfEstablishment);
		}

		if (parish == null) {
			factoriesCerticateOfRegisImpl.setParish("");
		}
		else {
			factoriesCerticateOfRegisImpl.setParish(parish);
		}

		if (procuctCatAndName == null) {
			factoriesCerticateOfRegisImpl.setProcuctCatAndName("");
		}
		else {
			factoriesCerticateOfRegisImpl.setProcuctCatAndName(
				procuctCatAndName);
		}

		if (certificateIssueDate == Long.MIN_VALUE) {
			factoriesCerticateOfRegisImpl.setCertificateIssueDate(null);
		}
		else {
			factoriesCerticateOfRegisImpl.setCertificateIssueDate(
				new Date(certificateIssueDate));
		}

		if (dateOfExpiration == Long.MIN_VALUE) {
			factoriesCerticateOfRegisImpl.setDateOfExpiration(null);
		}
		else {
			factoriesCerticateOfRegisImpl.setDateOfExpiration(
				new Date(dateOfExpiration));
		}

		if (registration == null) {
			factoriesCerticateOfRegisImpl.setRegistration("");
		}
		else {
			factoriesCerticateOfRegisImpl.setRegistration(registration);
		}

		if (status == null) {
			factoriesCerticateOfRegisImpl.setStatus("");
		}
		else {
			factoriesCerticateOfRegisImpl.setStatus(status);
		}

		factoriesCerticateOfRegisImpl.setDocFileEntry(docFileEntry);

		factoriesCerticateOfRegisImpl.resetOriginalValues();

		return factoriesCerticateOfRegisImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		factoriesCerticateOfRegisId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		nameOfEstablishment = objectInput.readUTF();
		parish = objectInput.readUTF();
		procuctCatAndName = objectInput.readUTF();
		certificateIssueDate = objectInput.readLong();
		dateOfExpiration = objectInput.readLong();
		registration = objectInput.readUTF();
		status = objectInput.readUTF();

		docFileEntry = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(factoriesCerticateOfRegisId);

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

		if (nameOfEstablishment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfEstablishment);
		}

		if (parish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(parish);
		}

		if (procuctCatAndName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(procuctCatAndName);
		}

		objectOutput.writeLong(certificateIssueDate);
		objectOutput.writeLong(dateOfExpiration);

		if (registration == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(registration);
		}

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}

		objectOutput.writeLong(docFileEntry);
	}

	public long factoriesCerticateOfRegisId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public String nameOfEstablishment;
	public String parish;
	public String procuctCatAndName;
	public long certificateIssueDate;
	public long dateOfExpiration;
	public String registration;
	public String status;
	public long docFileEntry;

}