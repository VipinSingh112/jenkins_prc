/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncra.application.form.service.model.NcraApplication;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcraApplication in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcraApplicationCacheModel
	implements CacheModel<NcraApplication>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcraApplicationCacheModel)) {
			return false;
		}

		NcraApplicationCacheModel ncraApplicationCacheModel =
			(NcraApplicationCacheModel)object;

		if (ncraApplicationId == ncraApplicationCacheModel.ncraApplicationId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncraApplicationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{ncraApplicationId=");
		sb.append(ncraApplicationId);
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
		sb.append(", doYouWant=");
		sb.append(doYouWant);
		sb.append(", typeOfTransaction=");
		sb.append(typeOfTransaction);
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
		sb.append(", appCurrentStageName=");
		sb.append(appCurrentStageName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcraApplication toEntityModel() {
		NcraApplicationImpl ncraApplicationImpl = new NcraApplicationImpl();

		ncraApplicationImpl.setNcraApplicationId(ncraApplicationId);
		ncraApplicationImpl.setGroupId(groupId);
		ncraApplicationImpl.setCompanyId(companyId);
		ncraApplicationImpl.setUserId(userId);

		if (userName == null) {
			ncraApplicationImpl.setUserName("");
		}
		else {
			ncraApplicationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncraApplicationImpl.setCreateDate(null);
		}
		else {
			ncraApplicationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncraApplicationImpl.setModifiedDate(null);
		}
		else {
			ncraApplicationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (entityId == null) {
			ncraApplicationImpl.setEntityId("");
		}
		else {
			ncraApplicationImpl.setEntityId(entityId);
		}

		if (doYouWant == null) {
			ncraApplicationImpl.setDoYouWant("");
		}
		else {
			ncraApplicationImpl.setDoYouWant(doYouWant);
		}

		if (typeOfTransaction == null) {
			ncraApplicationImpl.setTypeOfTransaction("");
		}
		else {
			ncraApplicationImpl.setTypeOfTransaction(typeOfTransaction);
		}

		ncraApplicationImpl.setStatus(status);

		if (applicationNumber == null) {
			ncraApplicationImpl.setApplicationNumber("");
		}
		else {
			ncraApplicationImpl.setApplicationNumber(applicationNumber);
		}

		if (expiredLicenseAppNumber == null) {
			ncraApplicationImpl.setExpiredLicenseAppNumber("");
		}
		else {
			ncraApplicationImpl.setExpiredLicenseAppNumber(
				expiredLicenseAppNumber);
		}

		if (caseId == null) {
			ncraApplicationImpl.setCaseId("");
		}
		else {
			ncraApplicationImpl.setCaseId(caseId);
		}

		if (icmDocumentsPath == null) {
			ncraApplicationImpl.setIcmDocumentsPath("");
		}
		else {
			ncraApplicationImpl.setIcmDocumentsPath(icmDocumentsPath);
		}

		ncraApplicationImpl.setPdfFileEntryId(pdfFileEntryId);

		if (appCurrentStageName == null) {
			ncraApplicationImpl.setAppCurrentStageName("");
		}
		else {
			ncraApplicationImpl.setAppCurrentStageName(appCurrentStageName);
		}

		ncraApplicationImpl.resetOriginalValues();

		return ncraApplicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncraApplicationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		entityId = objectInput.readUTF();
		doYouWant = objectInput.readUTF();
		typeOfTransaction = objectInput.readUTF();

		status = objectInput.readInt();
		applicationNumber = objectInput.readUTF();
		expiredLicenseAppNumber = objectInput.readUTF();
		caseId = objectInput.readUTF();
		icmDocumentsPath = objectInput.readUTF();

		pdfFileEntryId = objectInput.readLong();
		appCurrentStageName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ncraApplicationId);

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

		if (doYouWant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(doYouWant);
		}

		if (typeOfTransaction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfTransaction);
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

		if (appCurrentStageName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appCurrentStageName);
		}
	}

	public long ncraApplicationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String entityId;
	public String doYouWant;
	public String typeOfTransaction;
	public int status;
	public String applicationNumber;
	public String expiredLicenseAppNumber;
	public String caseId;
	public String icmDocumentsPath;
	public long pdfFileEntryId;
	public String appCurrentStageName;

}