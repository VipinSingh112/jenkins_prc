/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.manufacturing.application.form.service.model.ManufacturingApplication;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ManufacturingApplication in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ManufacturingApplicationCacheModel
	implements CacheModel<ManufacturingApplication>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ManufacturingApplicationCacheModel)) {
			return false;
		}

		ManufacturingApplicationCacheModel manufacturingApplicationCacheModel =
			(ManufacturingApplicationCacheModel)object;

		if (manufacturingApplicationId ==
				manufacturingApplicationCacheModel.manufacturingApplicationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, manufacturingApplicationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);
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
		sb.append(", entityId=");
		sb.append(entityId);
		sb.append(", requestType=");
		sb.append(requestType);
		sb.append(", licenseRequest=");
		sb.append(licenseRequest);
		sb.append(", licenseCategory=");
		sb.append(licenseCategory);
		sb.append(", licenseSubCategory=");
		sb.append(licenseSubCategory);
		sb.append(", parish=");
		sb.append(parish);
		sb.append(", status=");
		sb.append(status);
		sb.append(", applicationNumber=");
		sb.append(applicationNumber);
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
	public ManufacturingApplication toEntityModel() {
		ManufacturingApplicationImpl manufacturingApplicationImpl =
			new ManufacturingApplicationImpl();

		manufacturingApplicationImpl.setManufacturingApplicationId(
			manufacturingApplicationId);
		manufacturingApplicationImpl.setGroupId(groupId);
		manufacturingApplicationImpl.setCompanyId(companyId);
		manufacturingApplicationImpl.setUserId(userId);

		if (userName == null) {
			manufacturingApplicationImpl.setUserName("");
		}
		else {
			manufacturingApplicationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			manufacturingApplicationImpl.setCreateDate(null);
		}
		else {
			manufacturingApplicationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			manufacturingApplicationImpl.setModifiedDate(null);
		}
		else {
			manufacturingApplicationImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (entityId == null) {
			manufacturingApplicationImpl.setEntityId("");
		}
		else {
			manufacturingApplicationImpl.setEntityId(entityId);
		}

		if (requestType == null) {
			manufacturingApplicationImpl.setRequestType("");
		}
		else {
			manufacturingApplicationImpl.setRequestType(requestType);
		}

		if (licenseRequest == null) {
			manufacturingApplicationImpl.setLicenseRequest("");
		}
		else {
			manufacturingApplicationImpl.setLicenseRequest(licenseRequest);
		}

		if (licenseCategory == null) {
			manufacturingApplicationImpl.setLicenseCategory("");
		}
		else {
			manufacturingApplicationImpl.setLicenseCategory(licenseCategory);
		}

		if (licenseSubCategory == null) {
			manufacturingApplicationImpl.setLicenseSubCategory("");
		}
		else {
			manufacturingApplicationImpl.setLicenseSubCategory(
				licenseSubCategory);
		}

		if (parish == null) {
			manufacturingApplicationImpl.setParish("");
		}
		else {
			manufacturingApplicationImpl.setParish(parish);
		}

		manufacturingApplicationImpl.setStatus(status);

		if (applicationNumber == null) {
			manufacturingApplicationImpl.setApplicationNumber("");
		}
		else {
			manufacturingApplicationImpl.setApplicationNumber(
				applicationNumber);
		}

		if (expiredLicenseAppNumber == null) {
			manufacturingApplicationImpl.setExpiredLicenseAppNumber("");
		}
		else {
			manufacturingApplicationImpl.setExpiredLicenseAppNumber(
				expiredLicenseAppNumber);
		}

		if (caseId == null) {
			manufacturingApplicationImpl.setCaseId("");
		}
		else {
			manufacturingApplicationImpl.setCaseId(caseId);
		}

		if (icmDocumentsPath == null) {
			manufacturingApplicationImpl.setIcmDocumentsPath("");
		}
		else {
			manufacturingApplicationImpl.setIcmDocumentsPath(icmDocumentsPath);
		}

		manufacturingApplicationImpl.setPdfFileEntryId(pdfFileEntryId);

		if (dateOfExpiration == Long.MIN_VALUE) {
			manufacturingApplicationImpl.setDateOfExpiration(null);
		}
		else {
			manufacturingApplicationImpl.setDateOfExpiration(
				new Date(dateOfExpiration));
		}

		if (appCurrentStageName == null) {
			manufacturingApplicationImpl.setAppCurrentStageName("");
		}
		else {
			manufacturingApplicationImpl.setAppCurrentStageName(
				appCurrentStageName);
		}

		manufacturingApplicationImpl.resetOriginalValues();

		return manufacturingApplicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		manufacturingApplicationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		entityId = objectInput.readUTF();
		requestType = objectInput.readUTF();
		licenseRequest = objectInput.readUTF();
		licenseCategory = objectInput.readUTF();
		licenseSubCategory = objectInput.readUTF();
		parish = objectInput.readUTF();

		status = objectInput.readInt();
		applicationNumber = objectInput.readUTF();
		expiredLicenseAppNumber = objectInput.readUTF();
		caseId = objectInput.readUTF();
		icmDocumentsPath = objectInput.readUTF();

		pdfFileEntryId = objectInput.readLong();
		dateOfExpiration = objectInput.readLong();
		appCurrentStageName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(manufacturingApplicationId);

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

		if (entityId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(entityId);
		}

		if (requestType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(requestType);
		}

		if (licenseRequest == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(licenseRequest);
		}

		if (licenseCategory == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(licenseCategory);
		}

		if (licenseSubCategory == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(licenseSubCategory);
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

	public long manufacturingApplicationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String entityId;
	public String requestType;
	public String licenseRequest;
	public String licenseCategory;
	public String licenseSubCategory;
	public String parish;
	public int status;
	public String applicationNumber;
	public String expiredLicenseAppNumber;
	public String caseId;
	public String icmDocumentsPath;
	public long pdfFileEntryId;
	public long dateOfExpiration;
	public String appCurrentStageName;

}