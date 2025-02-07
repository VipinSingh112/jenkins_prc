/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.creative.application.form.service.model.CreativeApplication;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CreativeApplication in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CreativeApplicationCacheModel
	implements CacheModel<CreativeApplication>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CreativeApplicationCacheModel)) {
			return false;
		}

		CreativeApplicationCacheModel creativeApplicationCacheModel =
			(CreativeApplicationCacheModel)object;

		if (CreativeApplicationId ==
				creativeApplicationCacheModel.CreativeApplicationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, CreativeApplicationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", CreativeApplicationId=");
		sb.append(CreativeApplicationId);
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
		sb.append(", practitionerStatus=");
		sb.append(practitionerStatus);
		sb.append(", eRegistryNumber=");
		sb.append(eRegistryNumber);
		sb.append(", entertainerType=");
		sb.append(entertainerType);
		sb.append(", IndividualType=");
		sb.append(IndividualType);
		sb.append(", companyType=");
		sb.append(companyType);
		sb.append(", primaryCategory=");
		sb.append(primaryCategory);
		sb.append(", mainCategories=");
		sb.append(mainCategories);
		sb.append(", status=");
		sb.append(status);
		sb.append(", applicationNumber=");
		sb.append(applicationNumber);
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
	public CreativeApplication toEntityModel() {
		CreativeApplicationImpl creativeApplicationImpl =
			new CreativeApplicationImpl();

		if (uuid == null) {
			creativeApplicationImpl.setUuid("");
		}
		else {
			creativeApplicationImpl.setUuid(uuid);
		}

		creativeApplicationImpl.setCreativeApplicationId(CreativeApplicationId);
		creativeApplicationImpl.setGroupId(groupId);
		creativeApplicationImpl.setCompanyId(companyId);
		creativeApplicationImpl.setUserId(userId);

		if (userName == null) {
			creativeApplicationImpl.setUserName("");
		}
		else {
			creativeApplicationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			creativeApplicationImpl.setCreateDate(null);
		}
		else {
			creativeApplicationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			creativeApplicationImpl.setModifiedDate(null);
		}
		else {
			creativeApplicationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (entityId == null) {
			creativeApplicationImpl.setEntityId("");
		}
		else {
			creativeApplicationImpl.setEntityId(entityId);
		}

		if (practitionerStatus == null) {
			creativeApplicationImpl.setPractitionerStatus("");
		}
		else {
			creativeApplicationImpl.setPractitionerStatus(practitionerStatus);
		}

		if (eRegistryNumber == null) {
			creativeApplicationImpl.setERegistryNumber("");
		}
		else {
			creativeApplicationImpl.setERegistryNumber(eRegistryNumber);
		}

		if (entertainerType == null) {
			creativeApplicationImpl.setEntertainerType("");
		}
		else {
			creativeApplicationImpl.setEntertainerType(entertainerType);
		}

		if (IndividualType == null) {
			creativeApplicationImpl.setIndividualType("");
		}
		else {
			creativeApplicationImpl.setIndividualType(IndividualType);
		}

		if (companyType == null) {
			creativeApplicationImpl.setCompanyType("");
		}
		else {
			creativeApplicationImpl.setCompanyType(companyType);
		}

		if (primaryCategory == null) {
			creativeApplicationImpl.setPrimaryCategory("");
		}
		else {
			creativeApplicationImpl.setPrimaryCategory(primaryCategory);
		}

		if (mainCategories == null) {
			creativeApplicationImpl.setMainCategories("");
		}
		else {
			creativeApplicationImpl.setMainCategories(mainCategories);
		}

		creativeApplicationImpl.setStatus(status);

		if (applicationNumber == null) {
			creativeApplicationImpl.setApplicationNumber("");
		}
		else {
			creativeApplicationImpl.setApplicationNumber(applicationNumber);
		}

		if (caseId == null) {
			creativeApplicationImpl.setCaseId("");
		}
		else {
			creativeApplicationImpl.setCaseId(caseId);
		}

		if (icmDocumentsPath == null) {
			creativeApplicationImpl.setIcmDocumentsPath("");
		}
		else {
			creativeApplicationImpl.setIcmDocumentsPath(icmDocumentsPath);
		}

		creativeApplicationImpl.setPdfFileEntryId(pdfFileEntryId);

		if (appCurrentStageName == null) {
			creativeApplicationImpl.setAppCurrentStageName("");
		}
		else {
			creativeApplicationImpl.setAppCurrentStageName(appCurrentStageName);
		}

		creativeApplicationImpl.resetOriginalValues();

		return creativeApplicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		CreativeApplicationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		entityId = objectInput.readUTF();
		practitionerStatus = objectInput.readUTF();
		eRegistryNumber = objectInput.readUTF();
		entertainerType = objectInput.readUTF();
		IndividualType = objectInput.readUTF();
		companyType = objectInput.readUTF();
		primaryCategory = objectInput.readUTF();
		mainCategories = objectInput.readUTF();

		status = objectInput.readInt();
		applicationNumber = objectInput.readUTF();
		caseId = objectInput.readUTF();
		icmDocumentsPath = objectInput.readUTF();

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

		objectOutput.writeLong(CreativeApplicationId);

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

		if (practitionerStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(practitionerStatus);
		}

		if (eRegistryNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(eRegistryNumber);
		}

		if (entertainerType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(entertainerType);
		}

		if (IndividualType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(IndividualType);
		}

		if (companyType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyType);
		}

		if (primaryCategory == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(primaryCategory);
		}

		if (mainCategories == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mainCategories);
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

	public String uuid;
	public long CreativeApplicationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String entityId;
	public String practitionerStatus;
	public String eRegistryNumber;
	public String entertainerType;
	public String IndividualType;
	public String companyType;
	public String primaryCategory;
	public String mainCategories;
	public int status;
	public String applicationNumber;
	public String caseId;
	public String icmDocumentsPath;
	public long pdfFileEntryId;
	public String appCurrentStageName;

}