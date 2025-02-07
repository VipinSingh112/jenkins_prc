/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.healthcare.application.form.service.model.HealthCareApplication;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing HealthCareApplication in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HealthCareApplicationCacheModel
	implements CacheModel<HealthCareApplication>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof HealthCareApplicationCacheModel)) {
			return false;
		}

		HealthCareApplicationCacheModel healthCareApplicationCacheModel =
			(HealthCareApplicationCacheModel)object;

		if (healthCareApplicationId ==
				healthCareApplicationCacheModel.healthCareApplicationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, healthCareApplicationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{healthCareApplicationId=");
		sb.append(healthCareApplicationId);
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
		sb.append(", healthCareFacility=");
		sb.append(healthCareFacility);
		sb.append(", healthCareRegistrationNum=");
		sb.append(healthCareRegistrationNum);
		sb.append(", status=");
		sb.append(status);
		sb.append(", applicationNumber=");
		sb.append(applicationNumber);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", icmDocumentPath=");
		sb.append(icmDocumentPath);
		sb.append(", pdfFileEntryId=");
		sb.append(pdfFileEntryId);
		sb.append(", appCurrentStageName=");
		sb.append(appCurrentStageName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public HealthCareApplication toEntityModel() {
		HealthCareApplicationImpl healthCareApplicationImpl =
			new HealthCareApplicationImpl();

		healthCareApplicationImpl.setHealthCareApplicationId(
			healthCareApplicationId);
		healthCareApplicationImpl.setGroupId(groupId);
		healthCareApplicationImpl.setCompanyId(companyId);
		healthCareApplicationImpl.setUserId(userId);

		if (userName == null) {
			healthCareApplicationImpl.setUserName("");
		}
		else {
			healthCareApplicationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			healthCareApplicationImpl.setCreateDate(null);
		}
		else {
			healthCareApplicationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			healthCareApplicationImpl.setModifiedDate(null);
		}
		else {
			healthCareApplicationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (entityId == null) {
			healthCareApplicationImpl.setEntityId("");
		}
		else {
			healthCareApplicationImpl.setEntityId(entityId);
		}

		if (healthCareFacility == null) {
			healthCareApplicationImpl.setHealthCareFacility("");
		}
		else {
			healthCareApplicationImpl.setHealthCareFacility(healthCareFacility);
		}

		if (healthCareRegistrationNum == null) {
			healthCareApplicationImpl.setHealthCareRegistrationNum("");
		}
		else {
			healthCareApplicationImpl.setHealthCareRegistrationNum(
				healthCareRegistrationNum);
		}

		healthCareApplicationImpl.setStatus(status);

		if (applicationNumber == null) {
			healthCareApplicationImpl.setApplicationNumber("");
		}
		else {
			healthCareApplicationImpl.setApplicationNumber(applicationNumber);
		}

		if (caseId == null) {
			healthCareApplicationImpl.setCaseId("");
		}
		else {
			healthCareApplicationImpl.setCaseId(caseId);
		}

		if (icmDocumentPath == null) {
			healthCareApplicationImpl.setIcmDocumentPath("");
		}
		else {
			healthCareApplicationImpl.setIcmDocumentPath(icmDocumentPath);
		}

		healthCareApplicationImpl.setPdfFileEntryId(pdfFileEntryId);

		if (appCurrentStageName == null) {
			healthCareApplicationImpl.setAppCurrentStageName("");
		}
		else {
			healthCareApplicationImpl.setAppCurrentStageName(
				appCurrentStageName);
		}

		healthCareApplicationImpl.resetOriginalValues();

		return healthCareApplicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		healthCareApplicationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		entityId = objectInput.readUTF();
		healthCareFacility = objectInput.readUTF();
		healthCareRegistrationNum = objectInput.readUTF();

		status = objectInput.readInt();
		applicationNumber = objectInput.readUTF();
		caseId = objectInput.readUTF();
		icmDocumentPath = objectInput.readUTF();

		pdfFileEntryId = objectInput.readLong();
		appCurrentStageName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(healthCareApplicationId);

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

		if (healthCareFacility == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(healthCareFacility);
		}

		if (healthCareRegistrationNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(healthCareRegistrationNum);
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

		objectOutput.writeLong(pdfFileEntryId);

		if (appCurrentStageName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appCurrentStageName);
		}
	}

	public long healthCareApplicationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String entityId;
	public String healthCareFacility;
	public String healthCareRegistrationNum;
	public int status;
	public String applicationNumber;
	public String caseId;
	public String icmDocumentPath;
	public long pdfFileEntryId;
	public String appCurrentStageName;

}