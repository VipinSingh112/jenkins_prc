/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesApp;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MedicalFacilitiesApp in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MedicalFacilitiesAppCacheModel
	implements CacheModel<MedicalFacilitiesApp>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MedicalFacilitiesAppCacheModel)) {
			return false;
		}

		MedicalFacilitiesAppCacheModel medicalFacilitiesAppCacheModel =
			(MedicalFacilitiesAppCacheModel)object;

		if (medicalFacilitiesAppId ==
				medicalFacilitiesAppCacheModel.medicalFacilitiesAppId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, medicalFacilitiesAppId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", medicalFacilitiesAppId=");
		sb.append(medicalFacilitiesAppId);
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
		sb.append(", natureOfApplicant=");
		sb.append(natureOfApplicant);
		sb.append(", typeOfTransaction=");
		sb.append(typeOfTransaction);
		sb.append(", registrationNumber=");
		sb.append(registrationNumber);
		sb.append(", medicalCategory=");
		sb.append(medicalCategory);
		sb.append(", subCategory=");
		sb.append(subCategory);
		sb.append(", nursingHomesCategory=");
		sb.append(nursingHomesCategory);
		sb.append(", nursingSubCategoryVal=");
		sb.append(nursingSubCategoryVal);
		sb.append(", numberOfBeds=");
		sb.append(numberOfBeds);
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
		sb.append(", entityId=");
		sb.append(entityId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MedicalFacilitiesApp toEntityModel() {
		MedicalFacilitiesAppImpl medicalFacilitiesAppImpl =
			new MedicalFacilitiesAppImpl();

		if (uuid == null) {
			medicalFacilitiesAppImpl.setUuid("");
		}
		else {
			medicalFacilitiesAppImpl.setUuid(uuid);
		}

		medicalFacilitiesAppImpl.setMedicalFacilitiesAppId(
			medicalFacilitiesAppId);
		medicalFacilitiesAppImpl.setGroupId(groupId);
		medicalFacilitiesAppImpl.setCompanyId(companyId);
		medicalFacilitiesAppImpl.setUserId(userId);

		if (userName == null) {
			medicalFacilitiesAppImpl.setUserName("");
		}
		else {
			medicalFacilitiesAppImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			medicalFacilitiesAppImpl.setCreateDate(null);
		}
		else {
			medicalFacilitiesAppImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			medicalFacilitiesAppImpl.setModifiedDate(null);
		}
		else {
			medicalFacilitiesAppImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (natureOfApplicant == null) {
			medicalFacilitiesAppImpl.setNatureOfApplicant("");
		}
		else {
			medicalFacilitiesAppImpl.setNatureOfApplicant(natureOfApplicant);
		}

		if (typeOfTransaction == null) {
			medicalFacilitiesAppImpl.setTypeOfTransaction("");
		}
		else {
			medicalFacilitiesAppImpl.setTypeOfTransaction(typeOfTransaction);
		}

		medicalFacilitiesAppImpl.setRegistrationNumber(registrationNumber);

		if (medicalCategory == null) {
			medicalFacilitiesAppImpl.setMedicalCategory("");
		}
		else {
			medicalFacilitiesAppImpl.setMedicalCategory(medicalCategory);
		}

		if (subCategory == null) {
			medicalFacilitiesAppImpl.setSubCategory("");
		}
		else {
			medicalFacilitiesAppImpl.setSubCategory(subCategory);
		}

		if (nursingHomesCategory == null) {
			medicalFacilitiesAppImpl.setNursingHomesCategory("");
		}
		else {
			medicalFacilitiesAppImpl.setNursingHomesCategory(
				nursingHomesCategory);
		}

		if (nursingSubCategoryVal == null) {
			medicalFacilitiesAppImpl.setNursingSubCategoryVal("");
		}
		else {
			medicalFacilitiesAppImpl.setNursingSubCategoryVal(
				nursingSubCategoryVal);
		}

		if (numberOfBeds == null) {
			medicalFacilitiesAppImpl.setNumberOfBeds("");
		}
		else {
			medicalFacilitiesAppImpl.setNumberOfBeds(numberOfBeds);
		}

		if (caseId == null) {
			medicalFacilitiesAppImpl.setCaseId("");
		}
		else {
			medicalFacilitiesAppImpl.setCaseId(caseId);
		}

		medicalFacilitiesAppImpl.setStatus(status);

		if (icmDocumentPath == null) {
			medicalFacilitiesAppImpl.setIcmDocumentPath("");
		}
		else {
			medicalFacilitiesAppImpl.setIcmDocumentPath(icmDocumentPath);
		}

		if (applicationNumber == null) {
			medicalFacilitiesAppImpl.setApplicationNumber("");
		}
		else {
			medicalFacilitiesAppImpl.setApplicationNumber(applicationNumber);
		}

		if (expiredLicenseAppNumber == null) {
			medicalFacilitiesAppImpl.setExpiredLicenseAppNumber("");
		}
		else {
			medicalFacilitiesAppImpl.setExpiredLicenseAppNumber(
				expiredLicenseAppNumber);
		}

		medicalFacilitiesAppImpl.setPdfFileEntryId(pdfFileEntryId);

		if (appCurrentStageName == null) {
			medicalFacilitiesAppImpl.setAppCurrentStageName("");
		}
		else {
			medicalFacilitiesAppImpl.setAppCurrentStageName(
				appCurrentStageName);
		}

		if (entityId == null) {
			medicalFacilitiesAppImpl.setEntityId("");
		}
		else {
			medicalFacilitiesAppImpl.setEntityId(entityId);
		}

		medicalFacilitiesAppImpl.resetOriginalValues();

		return medicalFacilitiesAppImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		medicalFacilitiesAppId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		natureOfApplicant = objectInput.readUTF();
		typeOfTransaction = objectInput.readUTF();

		registrationNumber = objectInput.readLong();
		medicalCategory = objectInput.readUTF();
		subCategory = objectInput.readUTF();
		nursingHomesCategory = objectInput.readUTF();
		nursingSubCategoryVal = objectInput.readUTF();
		numberOfBeds = objectInput.readUTF();
		caseId = objectInput.readUTF();

		status = objectInput.readInt();
		icmDocumentPath = objectInput.readUTF();
		applicationNumber = objectInput.readUTF();
		expiredLicenseAppNumber = objectInput.readUTF();

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

		objectOutput.writeLong(medicalFacilitiesAppId);

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

		if (natureOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(natureOfApplicant);
		}

		if (typeOfTransaction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfTransaction);
		}

		objectOutput.writeLong(registrationNumber);

		if (medicalCategory == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(medicalCategory);
		}

		if (subCategory == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(subCategory);
		}

		if (nursingHomesCategory == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nursingHomesCategory);
		}

		if (nursingSubCategoryVal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nursingSubCategoryVal);
		}

		if (numberOfBeds == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numberOfBeds);
		}

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

		if (entityId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(entityId);
		}
	}

	public String uuid;
	public long medicalFacilitiesAppId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String natureOfApplicant;
	public String typeOfTransaction;
	public long registrationNumber;
	public String medicalCategory;
	public String subCategory;
	public String nursingHomesCategory;
	public String nursingSubCategoryVal;
	public String numberOfBeds;
	public String caseId;
	public int status;
	public String icmDocumentPath;
	public String applicationNumber;
	public String expiredLicenseAppNumber;
	public long pdfFileEntryId;
	public String appCurrentStageName;
	public String entityId;

}