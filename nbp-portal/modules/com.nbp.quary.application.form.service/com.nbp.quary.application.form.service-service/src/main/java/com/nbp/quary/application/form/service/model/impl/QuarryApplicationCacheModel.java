/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.quary.application.form.service.model.QuarryApplication;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QuarryApplication in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class QuarryApplicationCacheModel
	implements CacheModel<QuarryApplication>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof QuarryApplicationCacheModel)) {
			return false;
		}

		QuarryApplicationCacheModel quarryApplicationCacheModel =
			(QuarryApplicationCacheModel)object;

		if (quarryApplicationId ==
				quarryApplicationCacheModel.quarryApplicationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, quarryApplicationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", quarryApplicationId=");
		sb.append(quarryApplicationId);
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
		sb.append(", natureOfApplicant=");
		sb.append(natureOfApplicant);
		sb.append(", typeOfTransaction=");
		sb.append(typeOfTransaction);
		sb.append(", renewLicenceNumber=");
		sb.append(renewLicenceNumber);
		sb.append(", typeOfMaterialQuarried=");
		sb.append(typeOfMaterialQuarried);
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
	public QuarryApplication toEntityModel() {
		QuarryApplicationImpl quarryApplicationImpl =
			new QuarryApplicationImpl();

		if (uuid == null) {
			quarryApplicationImpl.setUuid("");
		}
		else {
			quarryApplicationImpl.setUuid(uuid);
		}

		quarryApplicationImpl.setQuarryApplicationId(quarryApplicationId);
		quarryApplicationImpl.setGroupId(groupId);
		quarryApplicationImpl.setCompanyId(companyId);
		quarryApplicationImpl.setUserId(userId);

		if (userName == null) {
			quarryApplicationImpl.setUserName("");
		}
		else {
			quarryApplicationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			quarryApplicationImpl.setCreateDate(null);
		}
		else {
			quarryApplicationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			quarryApplicationImpl.setModifiedDate(null);
		}
		else {
			quarryApplicationImpl.setModifiedDate(new Date(modifiedDate));
		}

		quarryApplicationImpl.setEntityId(entityId);

		if (natureOfApplicant == null) {
			quarryApplicationImpl.setNatureOfApplicant("");
		}
		else {
			quarryApplicationImpl.setNatureOfApplicant(natureOfApplicant);
		}

		if (typeOfTransaction == null) {
			quarryApplicationImpl.setTypeOfTransaction("");
		}
		else {
			quarryApplicationImpl.setTypeOfTransaction(typeOfTransaction);
		}

		if (renewLicenceNumber == null) {
			quarryApplicationImpl.setRenewLicenceNumber("");
		}
		else {
			quarryApplicationImpl.setRenewLicenceNumber(renewLicenceNumber);
		}

		if (typeOfMaterialQuarried == null) {
			quarryApplicationImpl.setTypeOfMaterialQuarried("");
		}
		else {
			quarryApplicationImpl.setTypeOfMaterialQuarried(
				typeOfMaterialQuarried);
		}

		if (caseId == null) {
			quarryApplicationImpl.setCaseId("");
		}
		else {
			quarryApplicationImpl.setCaseId(caseId);
		}

		quarryApplicationImpl.setStatus(status);

		if (icmDocumentPath == null) {
			quarryApplicationImpl.setIcmDocumentPath("");
		}
		else {
			quarryApplicationImpl.setIcmDocumentPath(icmDocumentPath);
		}

		if (applicationNumber == null) {
			quarryApplicationImpl.setApplicationNumber("");
		}
		else {
			quarryApplicationImpl.setApplicationNumber(applicationNumber);
		}

		if (expiredLicenseAppNumber == null) {
			quarryApplicationImpl.setExpiredLicenseAppNumber("");
		}
		else {
			quarryApplicationImpl.setExpiredLicenseAppNumber(
				expiredLicenseAppNumber);
		}

		quarryApplicationImpl.setPdfFileEntryId(pdfFileEntryId);

		if (appCurrentStageName == null) {
			quarryApplicationImpl.setAppCurrentStageName("");
		}
		else {
			quarryApplicationImpl.setAppCurrentStageName(appCurrentStageName);
		}

		quarryApplicationImpl.resetOriginalValues();

		return quarryApplicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		quarryApplicationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		entityId = objectInput.readLong();
		natureOfApplicant = objectInput.readUTF();
		typeOfTransaction = objectInput.readUTF();
		renewLicenceNumber = objectInput.readUTF();
		typeOfMaterialQuarried = objectInput.readUTF();
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

		objectOutput.writeLong(quarryApplicationId);

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

		objectOutput.writeLong(entityId);

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

		if (renewLicenceNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(renewLicenceNumber);
		}

		if (typeOfMaterialQuarried == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfMaterialQuarried);
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
	}

	public String uuid;
	public long quarryApplicationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long entityId;
	public String natureOfApplicant;
	public String typeOfTransaction;
	public String renewLicenceNumber;
	public String typeOfMaterialQuarried;
	public String caseId;
	public int status;
	public String icmDocumentPath;
	public String applicationNumber;
	public String expiredLicenseAppNumber;
	public long pdfFileEntryId;
	public String appCurrentStageName;

}