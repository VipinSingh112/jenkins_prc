/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.fire.brigade.application.form.service.model.FireBrigadeApplication;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FireBrigadeApplication in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FireBrigadeApplicationCacheModel
	implements CacheModel<FireBrigadeApplication>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FireBrigadeApplicationCacheModel)) {
			return false;
		}

		FireBrigadeApplicationCacheModel fireBrigadeApplicationCacheModel =
			(FireBrigadeApplicationCacheModel)object;

		if (fireBrigadeApplicationId ==
				fireBrigadeApplicationCacheModel.fireBrigadeApplicationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fireBrigadeApplicationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", fireBrigadeApplicationId=");
		sb.append(fireBrigadeApplicationId);
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
		sb.append(", certificateType=");
		sb.append(certificateType);
		sb.append(", typeOfTransaction=");
		sb.append(typeOfTransaction);
		sb.append(", typeOfApplicant=");
		sb.append(typeOfApplicant);
		sb.append(", typeOfPermises=");
		sb.append(typeOfPermises);
		sb.append(", purposeOfCertificate=");
		sb.append(purposeOfCertificate);
		sb.append(", parish=");
		sb.append(parish);
		sb.append(", status=");
		sb.append(status);
		sb.append(", applicationNumber=");
		sb.append(applicationNumber);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", expiredLicenseNumber=");
		sb.append(expiredLicenseNumber);
		sb.append(", icmDocumentsPath=");
		sb.append(icmDocumentsPath);
		sb.append(", pdfFileEntryId=");
		sb.append(pdfFileEntryId);
		sb.append(", appCurrentStageName=");
		sb.append(appCurrentStageName);
		sb.append(", entityId=");
		sb.append(entityId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FireBrigadeApplication toEntityModel() {
		FireBrigadeApplicationImpl fireBrigadeApplicationImpl =
			new FireBrigadeApplicationImpl();

		if (uuid == null) {
			fireBrigadeApplicationImpl.setUuid("");
		}
		else {
			fireBrigadeApplicationImpl.setUuid(uuid);
		}

		fireBrigadeApplicationImpl.setFireBrigadeApplicationId(
			fireBrigadeApplicationId);
		fireBrigadeApplicationImpl.setGroupId(groupId);
		fireBrigadeApplicationImpl.setCompanyId(companyId);
		fireBrigadeApplicationImpl.setUserId(userId);

		if (userName == null) {
			fireBrigadeApplicationImpl.setUserName("");
		}
		else {
			fireBrigadeApplicationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			fireBrigadeApplicationImpl.setCreateDate(null);
		}
		else {
			fireBrigadeApplicationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			fireBrigadeApplicationImpl.setModifiedDate(null);
		}
		else {
			fireBrigadeApplicationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (certificateType == null) {
			fireBrigadeApplicationImpl.setCertificateType("");
		}
		else {
			fireBrigadeApplicationImpl.setCertificateType(certificateType);
		}

		if (typeOfTransaction == null) {
			fireBrigadeApplicationImpl.setTypeOfTransaction("");
		}
		else {
			fireBrigadeApplicationImpl.setTypeOfTransaction(typeOfTransaction);
		}

		if (typeOfApplicant == null) {
			fireBrigadeApplicationImpl.setTypeOfApplicant("");
		}
		else {
			fireBrigadeApplicationImpl.setTypeOfApplicant(typeOfApplicant);
		}

		if (typeOfPermises == null) {
			fireBrigadeApplicationImpl.setTypeOfPermises("");
		}
		else {
			fireBrigadeApplicationImpl.setTypeOfPermises(typeOfPermises);
		}

		if (purposeOfCertificate == null) {
			fireBrigadeApplicationImpl.setPurposeOfCertificate("");
		}
		else {
			fireBrigadeApplicationImpl.setPurposeOfCertificate(
				purposeOfCertificate);
		}

		if (parish == null) {
			fireBrigadeApplicationImpl.setParish("");
		}
		else {
			fireBrigadeApplicationImpl.setParish(parish);
		}

		fireBrigadeApplicationImpl.setStatus(status);

		if (applicationNumber == null) {
			fireBrigadeApplicationImpl.setApplicationNumber("");
		}
		else {
			fireBrigadeApplicationImpl.setApplicationNumber(applicationNumber);
		}

		if (caseId == null) {
			fireBrigadeApplicationImpl.setCaseId("");
		}
		else {
			fireBrigadeApplicationImpl.setCaseId(caseId);
		}

		if (expiredLicenseNumber == null) {
			fireBrigadeApplicationImpl.setExpiredLicenseNumber("");
		}
		else {
			fireBrigadeApplicationImpl.setExpiredLicenseNumber(
				expiredLicenseNumber);
		}

		if (icmDocumentsPath == null) {
			fireBrigadeApplicationImpl.setIcmDocumentsPath("");
		}
		else {
			fireBrigadeApplicationImpl.setIcmDocumentsPath(icmDocumentsPath);
		}

		fireBrigadeApplicationImpl.setPdfFileEntryId(pdfFileEntryId);

		if (appCurrentStageName == null) {
			fireBrigadeApplicationImpl.setAppCurrentStageName("");
		}
		else {
			fireBrigadeApplicationImpl.setAppCurrentStageName(
				appCurrentStageName);
		}

		if (entityId == null) {
			fireBrigadeApplicationImpl.setEntityId("");
		}
		else {
			fireBrigadeApplicationImpl.setEntityId(entityId);
		}

		fireBrigadeApplicationImpl.resetOriginalValues();

		return fireBrigadeApplicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		fireBrigadeApplicationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		certificateType = objectInput.readUTF();
		typeOfTransaction = objectInput.readUTF();
		typeOfApplicant = objectInput.readUTF();
		typeOfPermises = objectInput.readUTF();
		purposeOfCertificate = objectInput.readUTF();
		parish = objectInput.readUTF();

		status = objectInput.readInt();
		applicationNumber = objectInput.readUTF();
		caseId = objectInput.readUTF();
		expiredLicenseNumber = objectInput.readUTF();
		icmDocumentsPath = objectInput.readUTF();

		pdfFileEntryId = objectInput.readLong();
		appCurrentStageName = objectInput.readUTF();
		entityId = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(fireBrigadeApplicationId);

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

		if (certificateType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certificateType);
		}

		if (typeOfTransaction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfTransaction);
		}

		if (typeOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfApplicant);
		}

		if (typeOfPermises == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfPermises);
		}

		if (purposeOfCertificate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(purposeOfCertificate);
		}

		if (parish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(parish);
		}

		objectOutput.writeInt(status);

		if (applicationNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicationNumber);
		}

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		if (expiredLicenseNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expiredLicenseNumber);
		}

		if (icmDocumentsPath == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(icmDocumentsPath);
		}

		objectOutput.writeLong(pdfFileEntryId);

		if (appCurrentStageName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appCurrentStageName);
		}

		if (entityId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(entityId);
		}
	}

	public String uuid;
	public long fireBrigadeApplicationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String certificateType;
	public String typeOfTransaction;
	public String typeOfApplicant;
	public String typeOfPermises;
	public String purposeOfCertificate;
	public String parish;
	public int status;
	public String applicationNumber;
	public String caseId;
	public String expiredLicenseNumber;
	public String icmDocumentsPath;
	public long pdfFileEntryId;
	public String appCurrentStageName;
	public String entityId;

}