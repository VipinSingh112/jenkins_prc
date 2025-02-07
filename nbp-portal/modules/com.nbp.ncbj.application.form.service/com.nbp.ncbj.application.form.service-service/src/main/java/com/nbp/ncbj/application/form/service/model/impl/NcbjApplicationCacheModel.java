/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncbj.application.form.service.model.NcbjApplication;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcbjApplication in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcbjApplicationCacheModel
	implements CacheModel<NcbjApplication>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcbjApplicationCacheModel)) {
			return false;
		}

		NcbjApplicationCacheModel ncbjApplicationCacheModel =
			(NcbjApplicationCacheModel)object;

		if (ncbjApplicationId == ncbjApplicationCacheModel.ncbjApplicationId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncbjApplicationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", ncbjApplicationId=");
		sb.append(ncbjApplicationId);
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
		sb.append(", typeOfCertification=");
		sb.append(typeOfCertification);
		sb.append(", typeOfTransaction=");
		sb.append(typeOfTransaction);
		sb.append(", typeOfServices=");
		sb.append(typeOfServices);
		sb.append(", subCategoryServices=");
		sb.append(subCategoryServices);
		sb.append(", iso9001CertificationValue=");
		sb.append(iso9001CertificationValue);
		sb.append(", numberOfSite=");
		sb.append(numberOfSite);
		sb.append(", iso22000CertificationValue=");
		sb.append(iso22000CertificationValue);
		sb.append(", status=");
		sb.append(status);
		sb.append(", applicationNumber=");
		sb.append(applicationNumber);
		sb.append(", transferReason=");
		sb.append(transferReason);
		sb.append(", expiredLicenseAppNumber=");
		sb.append(expiredLicenseAppNumber);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", icmDocumentsPath=");
		sb.append(icmDocumentsPath);
		sb.append(", pdfFileEntryId=");
		sb.append(pdfFileEntryId);
		sb.append(", dateOfExpiration=");
		sb.append(dateOfExpiration);
		sb.append(", appCurrentStageName=");
		sb.append(appCurrentStageName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcbjApplication toEntityModel() {
		NcbjApplicationImpl ncbjApplicationImpl = new NcbjApplicationImpl();

		if (uuid == null) {
			ncbjApplicationImpl.setUuid("");
		}
		else {
			ncbjApplicationImpl.setUuid(uuid);
		}

		ncbjApplicationImpl.setNcbjApplicationId(ncbjApplicationId);
		ncbjApplicationImpl.setGroupId(groupId);
		ncbjApplicationImpl.setCompanyId(companyId);
		ncbjApplicationImpl.setUserId(userId);

		if (userName == null) {
			ncbjApplicationImpl.setUserName("");
		}
		else {
			ncbjApplicationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncbjApplicationImpl.setCreateDate(null);
		}
		else {
			ncbjApplicationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncbjApplicationImpl.setModifiedDate(null);
		}
		else {
			ncbjApplicationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (typeOfCertification == null) {
			ncbjApplicationImpl.setTypeOfCertification("");
		}
		else {
			ncbjApplicationImpl.setTypeOfCertification(typeOfCertification);
		}

		if (typeOfTransaction == null) {
			ncbjApplicationImpl.setTypeOfTransaction("");
		}
		else {
			ncbjApplicationImpl.setTypeOfTransaction(typeOfTransaction);
		}

		if (typeOfServices == null) {
			ncbjApplicationImpl.setTypeOfServices("");
		}
		else {
			ncbjApplicationImpl.setTypeOfServices(typeOfServices);
		}

		if (subCategoryServices == null) {
			ncbjApplicationImpl.setSubCategoryServices("");
		}
		else {
			ncbjApplicationImpl.setSubCategoryServices(subCategoryServices);
		}

		if (iso9001CertificationValue == null) {
			ncbjApplicationImpl.setIso9001CertificationValue("");
		}
		else {
			ncbjApplicationImpl.setIso9001CertificationValue(
				iso9001CertificationValue);
		}

		if (numberOfSite == null) {
			ncbjApplicationImpl.setNumberOfSite("");
		}
		else {
			ncbjApplicationImpl.setNumberOfSite(numberOfSite);
		}

		if (iso22000CertificationValue == null) {
			ncbjApplicationImpl.setIso22000CertificationValue("");
		}
		else {
			ncbjApplicationImpl.setIso22000CertificationValue(
				iso22000CertificationValue);
		}

		ncbjApplicationImpl.setStatus(status);

		if (applicationNumber == null) {
			ncbjApplicationImpl.setApplicationNumber("");
		}
		else {
			ncbjApplicationImpl.setApplicationNumber(applicationNumber);
		}

		if (transferReason == null) {
			ncbjApplicationImpl.setTransferReason("");
		}
		else {
			ncbjApplicationImpl.setTransferReason(transferReason);
		}

		if (expiredLicenseAppNumber == null) {
			ncbjApplicationImpl.setExpiredLicenseAppNumber("");
		}
		else {
			ncbjApplicationImpl.setExpiredLicenseAppNumber(
				expiredLicenseAppNumber);
		}

		if (caseId == null) {
			ncbjApplicationImpl.setCaseId("");
		}
		else {
			ncbjApplicationImpl.setCaseId(caseId);
		}

		if (icmDocumentsPath == null) {
			ncbjApplicationImpl.setIcmDocumentsPath("");
		}
		else {
			ncbjApplicationImpl.setIcmDocumentsPath(icmDocumentsPath);
		}

		ncbjApplicationImpl.setPdfFileEntryId(pdfFileEntryId);

		if (dateOfExpiration == Long.MIN_VALUE) {
			ncbjApplicationImpl.setDateOfExpiration(null);
		}
		else {
			ncbjApplicationImpl.setDateOfExpiration(new Date(dateOfExpiration));
		}

		if (appCurrentStageName == null) {
			ncbjApplicationImpl.setAppCurrentStageName("");
		}
		else {
			ncbjApplicationImpl.setAppCurrentStageName(appCurrentStageName);
		}

		ncbjApplicationImpl.resetOriginalValues();

		return ncbjApplicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		ncbjApplicationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		typeOfCertification = objectInput.readUTF();
		typeOfTransaction = objectInput.readUTF();
		typeOfServices = objectInput.readUTF();
		subCategoryServices = objectInput.readUTF();
		iso9001CertificationValue = objectInput.readUTF();
		numberOfSite = objectInput.readUTF();
		iso22000CertificationValue = objectInput.readUTF();

		status = objectInput.readInt();
		applicationNumber = objectInput.readUTF();
		transferReason = objectInput.readUTF();
		expiredLicenseAppNumber = objectInput.readUTF();
		caseId = objectInput.readUTF();
		icmDocumentsPath = objectInput.readUTF();

		pdfFileEntryId = objectInput.readLong();
		dateOfExpiration = objectInput.readLong();
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

		objectOutput.writeLong(ncbjApplicationId);

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

		if (typeOfCertification == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfCertification);
		}

		if (typeOfTransaction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfTransaction);
		}

		if (typeOfServices == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfServices);
		}

		if (subCategoryServices == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(subCategoryServices);
		}

		if (iso9001CertificationValue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(iso9001CertificationValue);
		}

		if (numberOfSite == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numberOfSite);
		}

		if (iso22000CertificationValue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(iso22000CertificationValue);
		}

		objectOutput.writeInt(status);

		if (applicationNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicationNumber);
		}

		if (transferReason == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(transferReason);
		}

		if (expiredLicenseAppNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expiredLicenseAppNumber);
		}

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		if (icmDocumentsPath == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(icmDocumentsPath);
		}

		objectOutput.writeLong(pdfFileEntryId);
		objectOutput.writeLong(dateOfExpiration);

		if (appCurrentStageName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appCurrentStageName);
		}
	}

	public String uuid;
	public long ncbjApplicationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String typeOfCertification;
	public String typeOfTransaction;
	public String typeOfServices;
	public String subCategoryServices;
	public String iso9001CertificationValue;
	public String numberOfSite;
	public String iso22000CertificationValue;
	public int status;
	public String applicationNumber;
	public String transferReason;
	public String expiredLicenseAppNumber;
	public String caseId;
	public String icmDocumentsPath;
	public long pdfFileEntryId;
	public long dateOfExpiration;
	public String appCurrentStageName;

}