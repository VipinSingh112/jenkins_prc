/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.services.application.form.service.model.OsiServicesApplication;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiServicesApplication in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiServicesApplicationCacheModel
	implements CacheModel<OsiServicesApplication>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OsiServicesApplicationCacheModel)) {
			return false;
		}

		OsiServicesApplicationCacheModel osiServicesApplicationCacheModel =
			(OsiServicesApplicationCacheModel)object;

		if (osiServicesApplicationId ==
				osiServicesApplicationCacheModel.osiServicesApplicationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiServicesApplicationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", osiServicesApplicationId=");
		sb.append(osiServicesApplicationId);
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
		sb.append(", typeOfApplicant=");
		sb.append(typeOfApplicant);
		sb.append(", natureOfApplicant=");
		sb.append(natureOfApplicant);
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OsiServicesApplication toEntityModel() {
		OsiServicesApplicationImpl osiServicesApplicationImpl =
			new OsiServicesApplicationImpl();

		if (uuid == null) {
			osiServicesApplicationImpl.setUuid("");
		}
		else {
			osiServicesApplicationImpl.setUuid(uuid);
		}

		osiServicesApplicationImpl.setOsiServicesApplicationId(
			osiServicesApplicationId);
		osiServicesApplicationImpl.setGroupId(groupId);
		osiServicesApplicationImpl.setCompanyId(companyId);
		osiServicesApplicationImpl.setUserId(userId);

		if (userName == null) {
			osiServicesApplicationImpl.setUserName("");
		}
		else {
			osiServicesApplicationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiServicesApplicationImpl.setCreateDate(null);
		}
		else {
			osiServicesApplicationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiServicesApplicationImpl.setModifiedDate(null);
		}
		else {
			osiServicesApplicationImpl.setModifiedDate(new Date(modifiedDate));
		}

		osiServicesApplicationImpl.setEntityId(entityId);

		if (doYouWant == null) {
			osiServicesApplicationImpl.setDoYouWant("");
		}
		else {
			osiServicesApplicationImpl.setDoYouWant(doYouWant);
		}

		if (typeOfApplicant == null) {
			osiServicesApplicationImpl.setTypeOfApplicant("");
		}
		else {
			osiServicesApplicationImpl.setTypeOfApplicant(typeOfApplicant);
		}

		if (natureOfApplicant == null) {
			osiServicesApplicationImpl.setNatureOfApplicant("");
		}
		else {
			osiServicesApplicationImpl.setNatureOfApplicant(natureOfApplicant);
		}

		if (typeOfTransaction == null) {
			osiServicesApplicationImpl.setTypeOfTransaction("");
		}
		else {
			osiServicesApplicationImpl.setTypeOfTransaction(typeOfTransaction);
		}

		if (caseId == null) {
			osiServicesApplicationImpl.setCaseId("");
		}
		else {
			osiServicesApplicationImpl.setCaseId(caseId);
		}

		osiServicesApplicationImpl.setStatus(status);

		if (icmDocumentPath == null) {
			osiServicesApplicationImpl.setIcmDocumentPath("");
		}
		else {
			osiServicesApplicationImpl.setIcmDocumentPath(icmDocumentPath);
		}

		if (applicationNumber == null) {
			osiServicesApplicationImpl.setApplicationNumber("");
		}
		else {
			osiServicesApplicationImpl.setApplicationNumber(applicationNumber);
		}

		if (expiredLicenseAppNumber == null) {
			osiServicesApplicationImpl.setExpiredLicenseAppNumber("");
		}
		else {
			osiServicesApplicationImpl.setExpiredLicenseAppNumber(
				expiredLicenseAppNumber);
		}

		osiServicesApplicationImpl.setPdfFileEntryId(pdfFileEntryId);

		if (appCurrentStageName == null) {
			osiServicesApplicationImpl.setAppCurrentStageName("");
		}
		else {
			osiServicesApplicationImpl.setAppCurrentStageName(
				appCurrentStageName);
		}

		osiServicesApplicationImpl.resetOriginalValues();

		return osiServicesApplicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		osiServicesApplicationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		entityId = objectInput.readLong();
		doYouWant = objectInput.readUTF();
		typeOfApplicant = objectInput.readUTF();
		natureOfApplicant = objectInput.readUTF();
		typeOfTransaction = objectInput.readUTF();
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

		objectOutput.writeLong(osiServicesApplicationId);

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

		if (doYouWant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(doYouWant);
		}

		if (typeOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfApplicant);
		}

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
	public long osiServicesApplicationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long entityId;
	public String doYouWant;
	public String typeOfApplicant;
	public String natureOfApplicant;
	public String typeOfTransaction;
	public String caseId;
	public int status;
	public String icmDocumentPath;
	public String applicationNumber;
	public String expiredLicenseAppNumber;
	public long pdfFileEntryId;
	public String appCurrentStageName;

}