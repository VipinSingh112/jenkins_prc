/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.acquire.application.form.service.model.AcquireApplication;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AcquireApplication in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AcquireApplicationCacheModel
	implements CacheModel<AcquireApplication>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AcquireApplicationCacheModel)) {
			return false;
		}

		AcquireApplicationCacheModel acquireApplicationCacheModel =
			(AcquireApplicationCacheModel)object;

		if (acquireApplicationId ==
				acquireApplicationCacheModel.acquireApplicationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, acquireApplicationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", acquireApplicationId=");
		sb.append(acquireApplicationId);
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
		sb.append(", status=");
		sb.append(status);
		sb.append(", applicationNumber=");
		sb.append(applicationNumber);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", icmDocumentPath=");
		sb.append(icmDocumentPath);
		sb.append(", divestmentOptions=");
		sb.append(divestmentOptions);
		sb.append(", tenureType=");
		sb.append(tenureType);
		sb.append(", currentUse=");
		sb.append(currentUse);
		sb.append(", pdfFileEntryId=");
		sb.append(pdfFileEntryId);
		sb.append(", appCurrentStageName=");
		sb.append(appCurrentStageName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AcquireApplication toEntityModel() {
		AcquireApplicationImpl acquireApplicationImpl =
			new AcquireApplicationImpl();

		if (uuid == null) {
			acquireApplicationImpl.setUuid("");
		}
		else {
			acquireApplicationImpl.setUuid(uuid);
		}

		acquireApplicationImpl.setAcquireApplicationId(acquireApplicationId);
		acquireApplicationImpl.setGroupId(groupId);
		acquireApplicationImpl.setCompanyId(companyId);
		acquireApplicationImpl.setUserId(userId);

		if (userName == null) {
			acquireApplicationImpl.setUserName("");
		}
		else {
			acquireApplicationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			acquireApplicationImpl.setCreateDate(null);
		}
		else {
			acquireApplicationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			acquireApplicationImpl.setModifiedDate(null);
		}
		else {
			acquireApplicationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (entityId == null) {
			acquireApplicationImpl.setEntityId("");
		}
		else {
			acquireApplicationImpl.setEntityId(entityId);
		}

		acquireApplicationImpl.setStatus(status);

		if (applicationNumber == null) {
			acquireApplicationImpl.setApplicationNumber("");
		}
		else {
			acquireApplicationImpl.setApplicationNumber(applicationNumber);
		}

		if (caseId == null) {
			acquireApplicationImpl.setCaseId("");
		}
		else {
			acquireApplicationImpl.setCaseId(caseId);
		}

		if (icmDocumentPath == null) {
			acquireApplicationImpl.setIcmDocumentPath("");
		}
		else {
			acquireApplicationImpl.setIcmDocumentPath(icmDocumentPath);
		}

		if (divestmentOptions == null) {
			acquireApplicationImpl.setDivestmentOptions("");
		}
		else {
			acquireApplicationImpl.setDivestmentOptions(divestmentOptions);
		}

		if (tenureType == null) {
			acquireApplicationImpl.setTenureType("");
		}
		else {
			acquireApplicationImpl.setTenureType(tenureType);
		}

		if (currentUse == null) {
			acquireApplicationImpl.setCurrentUse("");
		}
		else {
			acquireApplicationImpl.setCurrentUse(currentUse);
		}

		acquireApplicationImpl.setPdfFileEntryId(pdfFileEntryId);

		if (appCurrentStageName == null) {
			acquireApplicationImpl.setAppCurrentStageName("");
		}
		else {
			acquireApplicationImpl.setAppCurrentStageName(appCurrentStageName);
		}

		acquireApplicationImpl.resetOriginalValues();

		return acquireApplicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		acquireApplicationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		entityId = objectInput.readUTF();

		status = objectInput.readInt();
		applicationNumber = objectInput.readUTF();
		caseId = objectInput.readUTF();
		icmDocumentPath = objectInput.readUTF();
		divestmentOptions = objectInput.readUTF();
		tenureType = objectInput.readUTF();
		currentUse = objectInput.readUTF();

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

		objectOutput.writeLong(acquireApplicationId);

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

		objectOutput.writeInt(status);

		if (applicationNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicationNumber);
		}

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		if (icmDocumentPath == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(icmDocumentPath);
		}

		if (divestmentOptions == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(divestmentOptions);
		}

		if (tenureType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tenureType);
		}

		if (currentUse == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(currentUse);
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
	public long acquireApplicationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String entityId;
	public int status;
	public String applicationNumber;
	public String caseId;
	public String icmDocumentPath;
	public String divestmentOptions;
	public String tenureType;
	public String currentUse;
	public long pdfFileEntryId;
	public String appCurrentStageName;

}