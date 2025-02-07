/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.HsraApplication;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing HsraApplication in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HsraApplicationCacheModel
	implements CacheModel<HsraApplication>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof HsraApplicationCacheModel)) {
			return false;
		}

		HsraApplicationCacheModel hsraApplicationCacheModel =
			(HsraApplicationCacheModel)object;

		if (hsraApplicationId == hsraApplicationCacheModel.hsraApplicationId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, hsraApplicationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(63);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
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
		sb.append(", typeOfApplicant=");
		sb.append(typeOfApplicant);
		sb.append(", typeOfActivities=");
		sb.append(typeOfActivities);
		sb.append(", categoryOfSources=");
		sb.append(categoryOfSources);
		sb.append(", highOne=");
		sb.append(highOne);
		sb.append(", highTwo=");
		sb.append(highTwo);
		sb.append(", medium=");
		sb.append(medium);
		sb.append(", lowOne=");
		sb.append(lowOne);
		sb.append(", lowTwo=");
		sb.append(lowTwo);
		sb.append(", typeOfTransaction=");
		sb.append(typeOfTransaction);
		sb.append(", riskLevel=");
		sb.append(riskLevel);
		sb.append(", typeOfApplication=");
		sb.append(typeOfApplication);
		sb.append(", brokerTransactionType=");
		sb.append(brokerTransactionType);
		sb.append(", specificApplicable=");
		sb.append(specificApplicable);
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
		sb.append(", entityId=");
		sb.append(entityId);
		sb.append(", pdfFileEntryId=");
		sb.append(pdfFileEntryId);
		sb.append(", appCurrentStageName=");
		sb.append(appCurrentStageName);
		sb.append(", qualifiedArea=");
		sb.append(qualifiedArea);
		sb.append(", expiredDate=");
		sb.append(expiredDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public HsraApplication toEntityModel() {
		HsraApplicationImpl hsraApplicationImpl = new HsraApplicationImpl();

		if (uuid == null) {
			hsraApplicationImpl.setUuid("");
		}
		else {
			hsraApplicationImpl.setUuid(uuid);
		}

		hsraApplicationImpl.setHsraApplicationId(hsraApplicationId);
		hsraApplicationImpl.setGroupId(groupId);
		hsraApplicationImpl.setCompanyId(companyId);
		hsraApplicationImpl.setUserId(userId);

		if (userName == null) {
			hsraApplicationImpl.setUserName("");
		}
		else {
			hsraApplicationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			hsraApplicationImpl.setCreateDate(null);
		}
		else {
			hsraApplicationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			hsraApplicationImpl.setModifiedDate(null);
		}
		else {
			hsraApplicationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (typeOfApplicant == null) {
			hsraApplicationImpl.setTypeOfApplicant("");
		}
		else {
			hsraApplicationImpl.setTypeOfApplicant(typeOfApplicant);
		}

		if (typeOfActivities == null) {
			hsraApplicationImpl.setTypeOfActivities("");
		}
		else {
			hsraApplicationImpl.setTypeOfActivities(typeOfActivities);
		}

		if (categoryOfSources == null) {
			hsraApplicationImpl.setCategoryOfSources("");
		}
		else {
			hsraApplicationImpl.setCategoryOfSources(categoryOfSources);
		}

		if (highOne == null) {
			hsraApplicationImpl.setHighOne("");
		}
		else {
			hsraApplicationImpl.setHighOne(highOne);
		}

		if (highTwo == null) {
			hsraApplicationImpl.setHighTwo("");
		}
		else {
			hsraApplicationImpl.setHighTwo(highTwo);
		}

		if (medium == null) {
			hsraApplicationImpl.setMedium("");
		}
		else {
			hsraApplicationImpl.setMedium(medium);
		}

		if (lowOne == null) {
			hsraApplicationImpl.setLowOne("");
		}
		else {
			hsraApplicationImpl.setLowOne(lowOne);
		}

		if (lowTwo == null) {
			hsraApplicationImpl.setLowTwo("");
		}
		else {
			hsraApplicationImpl.setLowTwo(lowTwo);
		}

		if (typeOfTransaction == null) {
			hsraApplicationImpl.setTypeOfTransaction("");
		}
		else {
			hsraApplicationImpl.setTypeOfTransaction(typeOfTransaction);
		}

		if (riskLevel == null) {
			hsraApplicationImpl.setRiskLevel("");
		}
		else {
			hsraApplicationImpl.setRiskLevel(riskLevel);
		}

		if (typeOfApplication == null) {
			hsraApplicationImpl.setTypeOfApplication("");
		}
		else {
			hsraApplicationImpl.setTypeOfApplication(typeOfApplication);
		}

		if (brokerTransactionType == null) {
			hsraApplicationImpl.setBrokerTransactionType("");
		}
		else {
			hsraApplicationImpl.setBrokerTransactionType(brokerTransactionType);
		}

		if (specificApplicable == null) {
			hsraApplicationImpl.setSpecificApplicable("");
		}
		else {
			hsraApplicationImpl.setSpecificApplicable(specificApplicable);
		}

		hsraApplicationImpl.setStatus(status);

		if (applicationNumber == null) {
			hsraApplicationImpl.setApplicationNumber("");
		}
		else {
			hsraApplicationImpl.setApplicationNumber(applicationNumber);
		}

		if (expiredLicenseAppNumber == null) {
			hsraApplicationImpl.setExpiredLicenseAppNumber("");
		}
		else {
			hsraApplicationImpl.setExpiredLicenseAppNumber(
				expiredLicenseAppNumber);
		}

		if (caseId == null) {
			hsraApplicationImpl.setCaseId("");
		}
		else {
			hsraApplicationImpl.setCaseId(caseId);
		}

		if (icmDocumentsPath == null) {
			hsraApplicationImpl.setIcmDocumentsPath("");
		}
		else {
			hsraApplicationImpl.setIcmDocumentsPath(icmDocumentsPath);
		}

		if (entityId == null) {
			hsraApplicationImpl.setEntityId("");
		}
		else {
			hsraApplicationImpl.setEntityId(entityId);
		}

		hsraApplicationImpl.setPdfFileEntryId(pdfFileEntryId);

		if (appCurrentStageName == null) {
			hsraApplicationImpl.setAppCurrentStageName("");
		}
		else {
			hsraApplicationImpl.setAppCurrentStageName(appCurrentStageName);
		}

		if (qualifiedArea == null) {
			hsraApplicationImpl.setQualifiedArea("");
		}
		else {
			hsraApplicationImpl.setQualifiedArea(qualifiedArea);
		}

		if (expiredDate == Long.MIN_VALUE) {
			hsraApplicationImpl.setExpiredDate(null);
		}
		else {
			hsraApplicationImpl.setExpiredDate(new Date(expiredDate));
		}

		hsraApplicationImpl.resetOriginalValues();

		return hsraApplicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		hsraApplicationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		typeOfApplicant = objectInput.readUTF();
		typeOfActivities = objectInput.readUTF();
		categoryOfSources = objectInput.readUTF();
		highOne = objectInput.readUTF();
		highTwo = objectInput.readUTF();
		medium = objectInput.readUTF();
		lowOne = objectInput.readUTF();
		lowTwo = objectInput.readUTF();
		typeOfTransaction = objectInput.readUTF();
		riskLevel = objectInput.readUTF();
		typeOfApplication = objectInput.readUTF();
		brokerTransactionType = objectInput.readUTF();
		specificApplicable = objectInput.readUTF();

		status = objectInput.readInt();
		applicationNumber = objectInput.readUTF();
		expiredLicenseAppNumber = objectInput.readUTF();
		caseId = objectInput.readUTF();
		icmDocumentsPath = objectInput.readUTF();
		entityId = objectInput.readUTF();

		pdfFileEntryId = objectInput.readLong();
		appCurrentStageName = objectInput.readUTF();
		qualifiedArea = objectInput.readUTF();
		expiredDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(hsraApplicationId);

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

		if (typeOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfApplicant);
		}

		if (typeOfActivities == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfActivities);
		}

		if (categoryOfSources == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(categoryOfSources);
		}

		if (highOne == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(highOne);
		}

		if (highTwo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(highTwo);
		}

		if (medium == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(medium);
		}

		if (lowOne == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lowOne);
		}

		if (lowTwo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lowTwo);
		}

		if (typeOfTransaction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfTransaction);
		}

		if (riskLevel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(riskLevel);
		}

		if (typeOfApplication == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfApplication);
		}

		if (brokerTransactionType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(brokerTransactionType);
		}

		if (specificApplicable == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(specificApplicable);
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

		if (entityId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(entityId);
		}

		objectOutput.writeLong(pdfFileEntryId);

		if (appCurrentStageName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appCurrentStageName);
		}

		if (qualifiedArea == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifiedArea);
		}

		objectOutput.writeLong(expiredDate);
	}

	public String uuid;
	public long hsraApplicationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String typeOfApplicant;
	public String typeOfActivities;
	public String categoryOfSources;
	public String highOne;
	public String highTwo;
	public String medium;
	public String lowOne;
	public String lowTwo;
	public String typeOfTransaction;
	public String riskLevel;
	public String typeOfApplication;
	public String brokerTransactionType;
	public String specificApplicable;
	public int status;
	public String applicationNumber;
	public String expiredLicenseAppNumber;
	public String caseId;
	public String icmDocumentsPath;
	public String entityId;
	public long pdfFileEntryId;
	public String appCurrentStageName;
	public String qualifiedArea;
	public long expiredDate;

}