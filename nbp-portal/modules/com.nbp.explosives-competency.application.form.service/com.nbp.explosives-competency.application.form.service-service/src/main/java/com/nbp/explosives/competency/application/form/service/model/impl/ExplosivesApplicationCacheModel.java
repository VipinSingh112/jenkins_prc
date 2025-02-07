/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.explosives.competency.application.form.service.model.ExplosivesApplication;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ExplosivesApplication in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ExplosivesApplicationCacheModel
	implements CacheModel<ExplosivesApplication>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ExplosivesApplicationCacheModel)) {
			return false;
		}

		ExplosivesApplicationCacheModel explosivesApplicationCacheModel =
			(ExplosivesApplicationCacheModel)object;

		if (explosivesApplicationId ==
				explosivesApplicationCacheModel.explosivesApplicationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, explosivesApplicationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", explosivesApplicationId=");
		sb.append(explosivesApplicationId);
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
		sb.append(", typeOfApplicant=");
		sb.append(typeOfApplicant);
		sb.append(", typeOfTransaction=");
		sb.append(typeOfTransaction);
		sb.append(", competencyCertificateNumber=");
		sb.append(competencyCertificateNumber);
		sb.append(", dateOfIssue=");
		sb.append(dateOfIssue);
		sb.append(", dateOfExpiration=");
		sb.append(dateOfExpiration);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", status=");
		sb.append(status);
		sb.append(", icmDocumentPath=");
		sb.append(icmDocumentPath);
		sb.append(", applicationNumber=");
		sb.append(applicationNumber);
		sb.append(", expiredLicenseAppNumber=");
		sb.append(expiredLicenseAppNumber);
		sb.append(", pdfFileEntryId=");
		sb.append(pdfFileEntryId);
		sb.append(", appCurrentStageName=");
		sb.append(appCurrentStageName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ExplosivesApplication toEntityModel() {
		ExplosivesApplicationImpl explosivesApplicationImpl =
			new ExplosivesApplicationImpl();

		if (uuid == null) {
			explosivesApplicationImpl.setUuid("");
		}
		else {
			explosivesApplicationImpl.setUuid(uuid);
		}

		explosivesApplicationImpl.setExplosivesApplicationId(
			explosivesApplicationId);
		explosivesApplicationImpl.setGroupId(groupId);
		explosivesApplicationImpl.setCompanyId(companyId);
		explosivesApplicationImpl.setUserId(userId);

		if (userName == null) {
			explosivesApplicationImpl.setUserName("");
		}
		else {
			explosivesApplicationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			explosivesApplicationImpl.setCreateDate(null);
		}
		else {
			explosivesApplicationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			explosivesApplicationImpl.setModifiedDate(null);
		}
		else {
			explosivesApplicationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (typeOfApplicant == null) {
			explosivesApplicationImpl.setTypeOfApplicant("");
		}
		else {
			explosivesApplicationImpl.setTypeOfApplicant(typeOfApplicant);
		}

		if (typeOfTransaction == null) {
			explosivesApplicationImpl.setTypeOfTransaction("");
		}
		else {
			explosivesApplicationImpl.setTypeOfTransaction(typeOfTransaction);
		}

		if (competencyCertificateNumber == null) {
			explosivesApplicationImpl.setCompetencyCertificateNumber("");
		}
		else {
			explosivesApplicationImpl.setCompetencyCertificateNumber(
				competencyCertificateNumber);
		}

		if (dateOfIssue == Long.MIN_VALUE) {
			explosivesApplicationImpl.setDateOfIssue(null);
		}
		else {
			explosivesApplicationImpl.setDateOfIssue(new Date(dateOfIssue));
		}

		if (dateOfExpiration == Long.MIN_VALUE) {
			explosivesApplicationImpl.setDateOfExpiration(null);
		}
		else {
			explosivesApplicationImpl.setDateOfExpiration(
				new Date(dateOfExpiration));
		}

		if (caseId == null) {
			explosivesApplicationImpl.setCaseId("");
		}
		else {
			explosivesApplicationImpl.setCaseId(caseId);
		}

		explosivesApplicationImpl.setStatus(status);

		if (icmDocumentPath == null) {
			explosivesApplicationImpl.setIcmDocumentPath("");
		}
		else {
			explosivesApplicationImpl.setIcmDocumentPath(icmDocumentPath);
		}

		if (applicationNumber == null) {
			explosivesApplicationImpl.setApplicationNumber("");
		}
		else {
			explosivesApplicationImpl.setApplicationNumber(applicationNumber);
		}

		if (expiredLicenseAppNumber == null) {
			explosivesApplicationImpl.setExpiredLicenseAppNumber("");
		}
		else {
			explosivesApplicationImpl.setExpiredLicenseAppNumber(
				expiredLicenseAppNumber);
		}

		explosivesApplicationImpl.setPdfFileEntryId(pdfFileEntryId);

		if (appCurrentStageName == null) {
			explosivesApplicationImpl.setAppCurrentStageName("");
		}
		else {
			explosivesApplicationImpl.setAppCurrentStageName(
				appCurrentStageName);
		}

		explosivesApplicationImpl.resetOriginalValues();

		return explosivesApplicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		explosivesApplicationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		typeOfApplicant = objectInput.readUTF();
		typeOfTransaction = objectInput.readUTF();
		competencyCertificateNumber = objectInput.readUTF();
		dateOfIssue = objectInput.readLong();
		dateOfExpiration = objectInput.readLong();
		caseId = objectInput.readUTF();

		status = objectInput.readInt();
		icmDocumentPath = objectInput.readUTF();
		applicationNumber = objectInput.readUTF();
		expiredLicenseAppNumber = objectInput.readUTF();

		pdfFileEntryId = objectInput.readLong();
		appCurrentStageName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(explosivesApplicationId);

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

		if (typeOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfApplicant);
		}

		if (typeOfTransaction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfTransaction);
		}

		if (competencyCertificateNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(competencyCertificateNumber);
		}

		objectOutput.writeLong(dateOfIssue);
		objectOutput.writeLong(dateOfExpiration);

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		objectOutput.writeInt(status);

		if (icmDocumentPath == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(icmDocumentPath);
		}

		if (applicationNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicationNumber);
		}

		if (expiredLicenseAppNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expiredLicenseAppNumber);
		}

		objectOutput.writeLong(pdfFileEntryId);

		if (appCurrentStageName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appCurrentStageName);
		}
	}

	public String uuid;
	public long explosivesApplicationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String typeOfApplicant;
	public String typeOfTransaction;
	public String competencyCertificateNumber;
	public long dateOfIssue;
	public long dateOfExpiration;
	public String caseId;
	public int status;
	public String icmDocumentPath;
	public String applicationNumber;
	public String expiredLicenseAppNumber;
	public long pdfFileEntryId;
	public String appCurrentStageName;

}