/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.fire.brigade.stage.service.model.FireBrigadeCertificate;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FireBrigadeCertificate in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FireBrigadeCertificateCacheModel
	implements CacheModel<FireBrigadeCertificate>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FireBrigadeCertificateCacheModel)) {
			return false;
		}

		FireBrigadeCertificateCacheModel fireBrigadeCertificateCacheModel =
			(FireBrigadeCertificateCacheModel)object;

		if (fireBrigadeCertificateId ==
				fireBrigadeCertificateCacheModel.fireBrigadeCertificateId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fireBrigadeCertificateId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{fireBrigadeCertificateId=");
		sb.append(fireBrigadeCertificateId);
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
		sb.append(", nameOfOwner=");
		sb.append(nameOfOwner);
		sb.append(", typeOfPremises=");
		sb.append(typeOfPremises);
		sb.append(", issueDate=");
		sb.append(issueDate);
		sb.append(", expirationDate=");
		sb.append(expirationDate);
		sb.append(", docFileEntry=");
		sb.append(docFileEntry);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", certificateNumber=");
		sb.append(certificateNumber);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FireBrigadeCertificate toEntityModel() {
		FireBrigadeCertificateImpl fireBrigadeCertificateImpl =
			new FireBrigadeCertificateImpl();

		fireBrigadeCertificateImpl.setFireBrigadeCertificateId(
			fireBrigadeCertificateId);
		fireBrigadeCertificateImpl.setGroupId(groupId);
		fireBrigadeCertificateImpl.setCompanyId(companyId);
		fireBrigadeCertificateImpl.setUserId(userId);

		if (userName == null) {
			fireBrigadeCertificateImpl.setUserName("");
		}
		else {
			fireBrigadeCertificateImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			fireBrigadeCertificateImpl.setCreateDate(null);
		}
		else {
			fireBrigadeCertificateImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			fireBrigadeCertificateImpl.setModifiedDate(null);
		}
		else {
			fireBrigadeCertificateImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (nameOfOwner == null) {
			fireBrigadeCertificateImpl.setNameOfOwner("");
		}
		else {
			fireBrigadeCertificateImpl.setNameOfOwner(nameOfOwner);
		}

		if (typeOfPremises == null) {
			fireBrigadeCertificateImpl.setTypeOfPremises("");
		}
		else {
			fireBrigadeCertificateImpl.setTypeOfPremises(typeOfPremises);
		}

		if (issueDate == Long.MIN_VALUE) {
			fireBrigadeCertificateImpl.setIssueDate(null);
		}
		else {
			fireBrigadeCertificateImpl.setIssueDate(new Date(issueDate));
		}

		if (expirationDate == Long.MIN_VALUE) {
			fireBrigadeCertificateImpl.setExpirationDate(null);
		}
		else {
			fireBrigadeCertificateImpl.setExpirationDate(
				new Date(expirationDate));
		}

		fireBrigadeCertificateImpl.setDocFileEntry(docFileEntry);

		if (caseId == null) {
			fireBrigadeCertificateImpl.setCaseId("");
		}
		else {
			fireBrigadeCertificateImpl.setCaseId(caseId);
		}

		if (certificateNumber == null) {
			fireBrigadeCertificateImpl.setCertificateNumber("");
		}
		else {
			fireBrigadeCertificateImpl.setCertificateNumber(certificateNumber);
		}

		fireBrigadeCertificateImpl.resetOriginalValues();

		return fireBrigadeCertificateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fireBrigadeCertificateId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nameOfOwner = objectInput.readUTF();
		typeOfPremises = objectInput.readUTF();
		issueDate = objectInput.readLong();
		expirationDate = objectInput.readLong();

		docFileEntry = objectInput.readLong();
		caseId = objectInput.readUTF();
		certificateNumber = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(fireBrigadeCertificateId);

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

		if (nameOfOwner == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfOwner);
		}

		if (typeOfPremises == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfPremises);
		}

		objectOutput.writeLong(issueDate);
		objectOutput.writeLong(expirationDate);

		objectOutput.writeLong(docFileEntry);

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		if (certificateNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certificateNumber);
		}
	}

	public long fireBrigadeCertificateId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nameOfOwner;
	public String typeOfPremises;
	public long issueDate;
	public long expirationDate;
	public long docFileEntry;
	public String caseId;
	public String certificateNumber;

}