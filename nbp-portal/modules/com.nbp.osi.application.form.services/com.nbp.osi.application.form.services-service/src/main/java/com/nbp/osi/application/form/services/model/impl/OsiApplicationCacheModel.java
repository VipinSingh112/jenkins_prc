/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.application.form.services.model.OsiApplication;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiApplication in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiApplicationCacheModel
	implements CacheModel<OsiApplication>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OsiApplicationCacheModel)) {
			return false;
		}

		OsiApplicationCacheModel osiApplicationCacheModel =
			(OsiApplicationCacheModel)object;

		if (osiApplicationId == osiApplicationCacheModel.osiApplicationId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiApplicationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{osiApplicationId=");
		sb.append(osiApplicationId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", entityId=");
		sb.append(entityId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", applicationType=");
		sb.append(applicationType);
		sb.append(", applicationStatus=");
		sb.append(applicationStatus);
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
	public OsiApplication toEntityModel() {
		OsiApplicationImpl osiApplicationImpl = new OsiApplicationImpl();

		osiApplicationImpl.setOsiApplicationId(osiApplicationId);
		osiApplicationImpl.setGroupId(groupId);
		osiApplicationImpl.setCompanyId(companyId);
		osiApplicationImpl.setUserId(userId);

		if (userName == null) {
			osiApplicationImpl.setUserName("");
		}
		else {
			osiApplicationImpl.setUserName(userName);
		}

		if (entityId == null) {
			osiApplicationImpl.setEntityId("");
		}
		else {
			osiApplicationImpl.setEntityId(entityId);
		}

		if (createDate == Long.MIN_VALUE) {
			osiApplicationImpl.setCreateDate(null);
		}
		else {
			osiApplicationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiApplicationImpl.setModifiedDate(null);
		}
		else {
			osiApplicationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (applicationType == null) {
			osiApplicationImpl.setApplicationType("");
		}
		else {
			osiApplicationImpl.setApplicationType(applicationType);
		}

		osiApplicationImpl.setApplicationStatus(applicationStatus);

		if (caseId == null) {
			osiApplicationImpl.setCaseId("");
		}
		else {
			osiApplicationImpl.setCaseId(caseId);
		}

		osiApplicationImpl.setStatus(status);

		if (icmDocumentPath == null) {
			osiApplicationImpl.setIcmDocumentPath("");
		}
		else {
			osiApplicationImpl.setIcmDocumentPath(icmDocumentPath);
		}

		if (applicationNumber == null) {
			osiApplicationImpl.setApplicationNumber("");
		}
		else {
			osiApplicationImpl.setApplicationNumber(applicationNumber);
		}

		if (expiredLicenseAppNumber == null) {
			osiApplicationImpl.setExpiredLicenseAppNumber("");
		}
		else {
			osiApplicationImpl.setExpiredLicenseAppNumber(
				expiredLicenseAppNumber);
		}

		osiApplicationImpl.setPdfFileEntryId(pdfFileEntryId);

		if (appCurrentStageName == null) {
			osiApplicationImpl.setAppCurrentStageName("");
		}
		else {
			osiApplicationImpl.setAppCurrentStageName(appCurrentStageName);
		}

		osiApplicationImpl.resetOriginalValues();

		return osiApplicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		osiApplicationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		entityId = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		applicationType = objectInput.readUTF();

		applicationStatus = objectInput.readInt();
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
		objectOutput.writeLong(osiApplicationId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		if (entityId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(entityId);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (applicationType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicationType);
		}

		objectOutput.writeInt(applicationStatus);

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

	public long osiApplicationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public String entityId;
	public long createDate;
	public long modifiedDate;
	public String applicationType;
	public int applicationStatus;
	public String caseId;
	public int status;
	public String icmDocumentPath;
	public String applicationNumber;
	public String expiredLicenseAppNumber;
	public long pdfFileEntryId;
	public String appCurrentStageName;

}