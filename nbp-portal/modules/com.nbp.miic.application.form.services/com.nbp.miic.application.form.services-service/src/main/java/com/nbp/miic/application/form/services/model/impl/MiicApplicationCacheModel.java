/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.miic.application.form.services.model.MiicApplication;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MiicApplication in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MiicApplicationCacheModel
	implements CacheModel<MiicApplication>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MiicApplicationCacheModel)) {
			return false;
		}

		MiicApplicationCacheModel miicApplicationCacheModel =
			(MiicApplicationCacheModel)object;

		if (miicApplicationId == miicApplicationCacheModel.miicApplicationId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, miicApplicationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", miicApplicationId=");
		sb.append(miicApplicationId);
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
		sb.append(", miicApplication=");
		sb.append(miicApplication);
		sb.append(", typeOfManufacturer =");
		sb.append(typeOfManufacturer);
		sb.append(", typeOfTransaction=");
		sb.append(typeOfTransaction);
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
	public MiicApplication toEntityModel() {
		MiicApplicationImpl miicApplicationImpl = new MiicApplicationImpl();

		if (uuid == null) {
			miicApplicationImpl.setUuid("");
		}
		else {
			miicApplicationImpl.setUuid(uuid);
		}

		miicApplicationImpl.setMiicApplicationId(miicApplicationId);
		miicApplicationImpl.setGroupId(groupId);
		miicApplicationImpl.setCompanyId(companyId);
		miicApplicationImpl.setUserId(userId);

		if (userName == null) {
			miicApplicationImpl.setUserName("");
		}
		else {
			miicApplicationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			miicApplicationImpl.setCreateDate(null);
		}
		else {
			miicApplicationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			miicApplicationImpl.setModifiedDate(null);
		}
		else {
			miicApplicationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (miicApplication == null) {
			miicApplicationImpl.setMiicApplication("");
		}
		else {
			miicApplicationImpl.setMiicApplication(miicApplication);
		}

		if (typeOfManufacturer == null) {
			miicApplicationImpl.setTypeOfManufacturer("");
		}
		else {
			miicApplicationImpl.setTypeOfManufacturer(typeOfManufacturer);
		}

		if (typeOfTransaction == null) {
			miicApplicationImpl.setTypeOfTransaction("");
		}
		else {
			miicApplicationImpl.setTypeOfTransaction(typeOfTransaction);
		}

		if (caseId == null) {
			miicApplicationImpl.setCaseId("");
		}
		else {
			miicApplicationImpl.setCaseId(caseId);
		}

		miicApplicationImpl.setStatus(status);

		if (icmDocumentPath == null) {
			miicApplicationImpl.setIcmDocumentPath("");
		}
		else {
			miicApplicationImpl.setIcmDocumentPath(icmDocumentPath);
		}

		if (applicationNumber == null) {
			miicApplicationImpl.setApplicationNumber("");
		}
		else {
			miicApplicationImpl.setApplicationNumber(applicationNumber);
		}

		if (expiredLicenseAppNumber == null) {
			miicApplicationImpl.setExpiredLicenseAppNumber("");
		}
		else {
			miicApplicationImpl.setExpiredLicenseAppNumber(
				expiredLicenseAppNumber);
		}

		miicApplicationImpl.setPdfFileEntryId(pdfFileEntryId);

		if (appCurrentStageName == null) {
			miicApplicationImpl.setAppCurrentStageName("");
		}
		else {
			miicApplicationImpl.setAppCurrentStageName(appCurrentStageName);
		}

		if (entityId == null) {
			miicApplicationImpl.setEntityId("");
		}
		else {
			miicApplicationImpl.setEntityId(entityId);
		}

		miicApplicationImpl.resetOriginalValues();

		return miicApplicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		miicApplicationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		miicApplication = objectInput.readUTF();
		typeOfManufacturer = objectInput.readUTF();
		typeOfTransaction = objectInput.readUTF();
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

		objectOutput.writeLong(miicApplicationId);

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

		if (miicApplication == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(miicApplication);
		}

		if (typeOfManufacturer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfManufacturer);
		}

		if (typeOfTransaction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfTransaction);
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
	public long miicApplicationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String miicApplication;
	public String typeOfManufacturer;
	public String typeOfTransaction;
	public String caseId;
	public int status;
	public String icmDocumentPath;
	public String applicationNumber;
	public String expiredLicenseAppNumber;
	public long pdfFileEntryId;
	public String appCurrentStageName;
	public String entityId;

}