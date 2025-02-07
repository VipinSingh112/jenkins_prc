/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.model.impl;

import com.agriculture.application.form.service.model.AgricultureApplication;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AgricultureApplication in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AgricultureApplicationCacheModel
	implements CacheModel<AgricultureApplication>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AgricultureApplicationCacheModel)) {
			return false;
		}

		AgricultureApplicationCacheModel agricultureApplicationCacheModel =
			(AgricultureApplicationCacheModel)object;

		if (agricultureApplicationId ==
				agricultureApplicationCacheModel.agricultureApplicationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, agricultureApplicationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{agricultureApplicationId=");
		sb.append(agricultureApplicationId);
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
		sb.append(", registrationStatus=");
		sb.append(registrationStatus);
		sb.append(", farmLicenseNumber=");
		sb.append(farmLicenseNumber);
		sb.append(", requestType=");
		sb.append(requestType);
		sb.append(", primaryProduct=");
		sb.append(primaryProduct);
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
		sb.append(", pdfFileEntryId=");
		sb.append(pdfFileEntryId);
		sb.append(", appCurrentStageName=");
		sb.append(appCurrentStageName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AgricultureApplication toEntityModel() {
		AgricultureApplicationImpl agricultureApplicationImpl =
			new AgricultureApplicationImpl();

		agricultureApplicationImpl.setAgricultureApplicationId(
			agricultureApplicationId);
		agricultureApplicationImpl.setGroupId(groupId);
		agricultureApplicationImpl.setCompanyId(companyId);
		agricultureApplicationImpl.setUserId(userId);

		if (userName == null) {
			agricultureApplicationImpl.setUserName("");
		}
		else {
			agricultureApplicationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			agricultureApplicationImpl.setCreateDate(null);
		}
		else {
			agricultureApplicationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			agricultureApplicationImpl.setModifiedDate(null);
		}
		else {
			agricultureApplicationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (entityId == null) {
			agricultureApplicationImpl.setEntityId("");
		}
		else {
			agricultureApplicationImpl.setEntityId(entityId);
		}

		if (registrationStatus == null) {
			agricultureApplicationImpl.setRegistrationStatus("");
		}
		else {
			agricultureApplicationImpl.setRegistrationStatus(
				registrationStatus);
		}

		if (farmLicenseNumber == null) {
			agricultureApplicationImpl.setFarmLicenseNumber("");
		}
		else {
			agricultureApplicationImpl.setFarmLicenseNumber(farmLicenseNumber);
		}

		if (requestType == null) {
			agricultureApplicationImpl.setRequestType("");
		}
		else {
			agricultureApplicationImpl.setRequestType(requestType);
		}

		if (primaryProduct == null) {
			agricultureApplicationImpl.setPrimaryProduct("");
		}
		else {
			agricultureApplicationImpl.setPrimaryProduct(primaryProduct);
		}

		agricultureApplicationImpl.setStatus(status);

		if (applicationNumber == null) {
			agricultureApplicationImpl.setApplicationNumber("");
		}
		else {
			agricultureApplicationImpl.setApplicationNumber(applicationNumber);
		}

		if (expiredLicenseAppNo == null) {
			agricultureApplicationImpl.setExpiredLicenseAppNo("");
		}
		else {
			agricultureApplicationImpl.setExpiredLicenseAppNo(
				expiredLicenseAppNo);
		}

		if (caseId == null) {
			agricultureApplicationImpl.setCaseId("");
		}
		else {
			agricultureApplicationImpl.setCaseId(caseId);
		}

		if (icmDocumentsPath == null) {
			agricultureApplicationImpl.setIcmDocumentsPath("");
		}
		else {
			agricultureApplicationImpl.setIcmDocumentsPath(icmDocumentsPath);
		}

		agricultureApplicationImpl.setPdfFileEntryId(pdfFileEntryId);

		if (appCurrentStageName == null) {
			agricultureApplicationImpl.setAppCurrentStageName("");
		}
		else {
			agricultureApplicationImpl.setAppCurrentStageName(
				appCurrentStageName);
		}

		agricultureApplicationImpl.resetOriginalValues();

		return agricultureApplicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		agricultureApplicationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		entityId = objectInput.readUTF();
		registrationStatus = objectInput.readUTF();
		farmLicenseNumber = objectInput.readUTF();
		requestType = objectInput.readUTF();
		primaryProduct = objectInput.readUTF();

		status = objectInput.readInt();
		applicationNumber = objectInput.readUTF();
		expiredLicenseAppNo = objectInput.readUTF();
		caseId = objectInput.readUTF();
		icmDocumentsPath = objectInput.readUTF();

		pdfFileEntryId = objectInput.readLong();
		appCurrentStageName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(agricultureApplicationId);

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

		if (registrationStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(registrationStatus);
		}

		if (farmLicenseNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(farmLicenseNumber);
		}

		if (requestType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(requestType);
		}

		if (primaryProduct == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(primaryProduct);
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

		objectOutput.writeLong(pdfFileEntryId);

		if (appCurrentStageName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appCurrentStageName);
		}
	}

	public long agricultureApplicationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String entityId;
	public String registrationStatus;
	public String farmLicenseNumber;
	public String requestType;
	public String primaryProduct;
	public int status;
	public String applicationNumber;
	public String expiredLicenseAppNo;
	public String caseId;
	public String icmDocumentsPath;
	public long pdfFileEntryId;
	public String appCurrentStageName;

}