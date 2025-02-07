/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.cannabis.application.form.services.model.CannabisApplications;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CannabisApplications in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CannabisApplicationsCacheModel
	implements CacheModel<CannabisApplications>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CannabisApplicationsCacheModel)) {
			return false;
		}

		CannabisApplicationsCacheModel cannabisApplicationsCacheModel =
			(CannabisApplicationsCacheModel)object;

		if (cannabisApplicationId ==
				cannabisApplicationsCacheModel.cannabisApplicationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cannabisApplicationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", cannabisApplicationId=");
		sb.append(cannabisApplicationId);
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
		sb.append(", licenseCategory=");
		sb.append(licenseCategory);
		sb.append(", licenseSubCategory=");
		sb.append(licenseSubCategory);
		sb.append(", typeOfEntity=");
		sb.append(typeOfEntity);
		sb.append(", status=");
		sb.append(status);
		sb.append(", applicationNumber=");
		sb.append(applicationNumber);
		sb.append(", expiredLicenseAppNo=");
		sb.append(expiredLicenseAppNo);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", icmDocumentsPath=");
		sb.append(icmDocumentsPath);
		sb.append(", PdfFileEntryId=");
		sb.append(PdfFileEntryId);
		sb.append(", appCurrentStageName=");
		sb.append(appCurrentStageName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CannabisApplications toEntityModel() {
		CannabisApplicationsImpl cannabisApplicationsImpl =
			new CannabisApplicationsImpl();

		if (uuid == null) {
			cannabisApplicationsImpl.setUuid("");
		}
		else {
			cannabisApplicationsImpl.setUuid(uuid);
		}

		cannabisApplicationsImpl.setCannabisApplicationId(
			cannabisApplicationId);
		cannabisApplicationsImpl.setGroupId(groupId);
		cannabisApplicationsImpl.setCompanyId(companyId);
		cannabisApplicationsImpl.setUserId(userId);

		if (userName == null) {
			cannabisApplicationsImpl.setUserName("");
		}
		else {
			cannabisApplicationsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			cannabisApplicationsImpl.setCreateDate(null);
		}
		else {
			cannabisApplicationsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cannabisApplicationsImpl.setModifiedDate(null);
		}
		else {
			cannabisApplicationsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (entityId == null) {
			cannabisApplicationsImpl.setEntityId("");
		}
		else {
			cannabisApplicationsImpl.setEntityId(entityId);
		}

		if (requestType == null) {
			cannabisApplicationsImpl.setRequestType("");
		}
		else {
			cannabisApplicationsImpl.setRequestType(requestType);
		}

		if (licenseCategory == null) {
			cannabisApplicationsImpl.setLicenseCategory("");
		}
		else {
			cannabisApplicationsImpl.setLicenseCategory(licenseCategory);
		}

		if (licenseSubCategory == null) {
			cannabisApplicationsImpl.setLicenseSubCategory("");
		}
		else {
			cannabisApplicationsImpl.setLicenseSubCategory(licenseSubCategory);
		}

		if (typeOfEntity == null) {
			cannabisApplicationsImpl.setTypeOfEntity("");
		}
		else {
			cannabisApplicationsImpl.setTypeOfEntity(typeOfEntity);
		}

		cannabisApplicationsImpl.setStatus(status);

		if (applicationNumber == null) {
			cannabisApplicationsImpl.setApplicationNumber("");
		}
		else {
			cannabisApplicationsImpl.setApplicationNumber(applicationNumber);
		}

		if (expiredLicenseAppNo == null) {
			cannabisApplicationsImpl.setExpiredLicenseAppNo("");
		}
		else {
			cannabisApplicationsImpl.setExpiredLicenseAppNo(
				expiredLicenseAppNo);
		}

		if (caseId == null) {
			cannabisApplicationsImpl.setCaseId("");
		}
		else {
			cannabisApplicationsImpl.setCaseId(caseId);
		}

		if (icmDocumentsPath == null) {
			cannabisApplicationsImpl.setIcmDocumentsPath("");
		}
		else {
			cannabisApplicationsImpl.setIcmDocumentsPath(icmDocumentsPath);
		}

		cannabisApplicationsImpl.setPdfFileEntryId(PdfFileEntryId);

		if (appCurrentStageName == null) {
			cannabisApplicationsImpl.setAppCurrentStageName("");
		}
		else {
			cannabisApplicationsImpl.setAppCurrentStageName(
				appCurrentStageName);
		}

		cannabisApplicationsImpl.resetOriginalValues();

		return cannabisApplicationsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		cannabisApplicationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		entityId = objectInput.readUTF();
		requestType = objectInput.readUTF();
		licenseCategory = objectInput.readUTF();
		licenseSubCategory = objectInput.readUTF();
		typeOfEntity = objectInput.readUTF();

		status = objectInput.readInt();
		applicationNumber = objectInput.readUTF();
		expiredLicenseAppNo = objectInput.readUTF();
		caseId = objectInput.readUTF();
		icmDocumentsPath = objectInput.readUTF();

		PdfFileEntryId = objectInput.readLong();
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

		objectOutput.writeLong(cannabisApplicationId);

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

		if (typeOfEntity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfEntity);
		}

		objectOutput.writeInt(status);

		if (applicationNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicationNumber);
		}

		if (expiredLicenseAppNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expiredLicenseAppNo);
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

		objectOutput.writeLong(PdfFileEntryId);

		if (appCurrentStageName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appCurrentStageName);
		}
	}

	public String uuid;
	public long cannabisApplicationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String entityId;
	public String requestType;
	public String licenseCategory;
	public String licenseSubCategory;
	public String typeOfEntity;
	public int status;
	public String applicationNumber;
	public String expiredLicenseAppNo;
	public String caseId;
	public String icmDocumentsPath;
	public long PdfFileEntryId;
	public String appCurrentStageName;

}