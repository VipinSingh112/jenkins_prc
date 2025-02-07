/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.npm.cannabis.application.stages.services.model.CannabisLicense;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CannabisLicense in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CannabisLicenseCacheModel
	implements CacheModel<CannabisLicense>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CannabisLicenseCacheModel)) {
			return false;
		}

		CannabisLicenseCacheModel cannabisLicenseCacheModel =
			(CannabisLicenseCacheModel)object;

		if (cannabisLicenseId == cannabisLicenseCacheModel.cannabisLicenseId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cannabisLicenseId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(59);

		sb.append("{cannabisLicenseId=");
		sb.append(cannabisLicenseId);
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
		sb.append(", entityNumber=");
		sb.append(entityNumber);
		sb.append(", entityName=");
		sb.append(entityName);
		sb.append(", categoryTier=");
		sb.append(categoryTier);
		sb.append(", numberOfTheExtension=");
		sb.append(numberOfTheExtension);
		sb.append(", ListOfConditions=");
		sb.append(ListOfConditions);
		sb.append(", payentAmtDue=");
		sb.append(payentAmtDue);
		sb.append(", issueDate=");
		sb.append(issueDate);
		sb.append(", expirationDate=");
		sb.append(expirationDate);
		sb.append(", cannabisApplicationId=");
		sb.append(cannabisApplicationId);
		sb.append(", updatedBySource=");
		sb.append(updatedBySource);
		sb.append(", nameOfBPMStep=");
		sb.append(nameOfBPMStep);
		sb.append(", licenseConditionsFulfilled=");
		sb.append(licenseConditionsFulfilled);
		sb.append(", dateFulfilled=");
		sb.append(dateFulfilled);
		sb.append(", feeOptionSelected=");
		sb.append(feeOptionSelected);
		sb.append(", feeAmount=");
		sb.append(feeAmount);
		sb.append(", feePaidDate=");
		sb.append(feePaidDate);
		sb.append(", bpmUserNameRole=");
		sb.append(bpmUserNameRole);
		sb.append(", stageName=");
		sb.append(stageName);
		sb.append(", status=");
		sb.append(status);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", licenseNumber=");
		sb.append(licenseNumber);
		sb.append(", licenseFileId=");
		sb.append(licenseFileId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CannabisLicense toEntityModel() {
		CannabisLicenseImpl cannabisLicenseImpl = new CannabisLicenseImpl();

		cannabisLicenseImpl.setCannabisLicenseId(cannabisLicenseId);
		cannabisLicenseImpl.setGroupId(groupId);
		cannabisLicenseImpl.setCompanyId(companyId);
		cannabisLicenseImpl.setUserId(userId);

		if (userName == null) {
			cannabisLicenseImpl.setUserName("");
		}
		else {
			cannabisLicenseImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			cannabisLicenseImpl.setCreateDate(null);
		}
		else {
			cannabisLicenseImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cannabisLicenseImpl.setModifiedDate(null);
		}
		else {
			cannabisLicenseImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (entityNumber == null) {
			cannabisLicenseImpl.setEntityNumber("");
		}
		else {
			cannabisLicenseImpl.setEntityNumber(entityNumber);
		}

		if (entityName == null) {
			cannabisLicenseImpl.setEntityName("");
		}
		else {
			cannabisLicenseImpl.setEntityName(entityName);
		}

		if (categoryTier == null) {
			cannabisLicenseImpl.setCategoryTier("");
		}
		else {
			cannabisLicenseImpl.setCategoryTier(categoryTier);
		}

		if (numberOfTheExtension == null) {
			cannabisLicenseImpl.setNumberOfTheExtension("");
		}
		else {
			cannabisLicenseImpl.setNumberOfTheExtension(numberOfTheExtension);
		}

		if (ListOfConditions == null) {
			cannabisLicenseImpl.setListOfConditions("");
		}
		else {
			cannabisLicenseImpl.setListOfConditions(ListOfConditions);
		}

		if (payentAmtDue == null) {
			cannabisLicenseImpl.setPayentAmtDue("");
		}
		else {
			cannabisLicenseImpl.setPayentAmtDue(payentAmtDue);
		}

		if (issueDate == Long.MIN_VALUE) {
			cannabisLicenseImpl.setIssueDate(null);
		}
		else {
			cannabisLicenseImpl.setIssueDate(new Date(issueDate));
		}

		if (expirationDate == Long.MIN_VALUE) {
			cannabisLicenseImpl.setExpirationDate(null);
		}
		else {
			cannabisLicenseImpl.setExpirationDate(new Date(expirationDate));
		}

		cannabisLicenseImpl.setCannabisApplicationId(cannabisApplicationId);

		if (updatedBySource == null) {
			cannabisLicenseImpl.setUpdatedBySource("");
		}
		else {
			cannabisLicenseImpl.setUpdatedBySource(updatedBySource);
		}

		if (nameOfBPMStep == null) {
			cannabisLicenseImpl.setNameOfBPMStep("");
		}
		else {
			cannabisLicenseImpl.setNameOfBPMStep(nameOfBPMStep);
		}

		if (licenseConditionsFulfilled == null) {
			cannabisLicenseImpl.setLicenseConditionsFulfilled("");
		}
		else {
			cannabisLicenseImpl.setLicenseConditionsFulfilled(
				licenseConditionsFulfilled);
		}

		if (dateFulfilled == null) {
			cannabisLicenseImpl.setDateFulfilled("");
		}
		else {
			cannabisLicenseImpl.setDateFulfilled(dateFulfilled);
		}

		if (feeOptionSelected == null) {
			cannabisLicenseImpl.setFeeOptionSelected("");
		}
		else {
			cannabisLicenseImpl.setFeeOptionSelected(feeOptionSelected);
		}

		if (feeAmount == null) {
			cannabisLicenseImpl.setFeeAmount("");
		}
		else {
			cannabisLicenseImpl.setFeeAmount(feeAmount);
		}

		if (feePaidDate == Long.MIN_VALUE) {
			cannabisLicenseImpl.setFeePaidDate(null);
		}
		else {
			cannabisLicenseImpl.setFeePaidDate(new Date(feePaidDate));
		}

		if (bpmUserNameRole == null) {
			cannabisLicenseImpl.setBpmUserNameRole("");
		}
		else {
			cannabisLicenseImpl.setBpmUserNameRole(bpmUserNameRole);
		}

		if (stageName == null) {
			cannabisLicenseImpl.setStageName("");
		}
		else {
			cannabisLicenseImpl.setStageName(stageName);
		}

		if (status == null) {
			cannabisLicenseImpl.setStatus("");
		}
		else {
			cannabisLicenseImpl.setStatus(status);
		}

		if (caseId == null) {
			cannabisLicenseImpl.setCaseId("");
		}
		else {
			cannabisLicenseImpl.setCaseId(caseId);
		}

		if (licenseNumber == null) {
			cannabisLicenseImpl.setLicenseNumber("");
		}
		else {
			cannabisLicenseImpl.setLicenseNumber(licenseNumber);
		}

		cannabisLicenseImpl.setLicenseFileId(licenseFileId);

		cannabisLicenseImpl.resetOriginalValues();

		return cannabisLicenseImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cannabisLicenseId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		entityNumber = objectInput.readUTF();
		entityName = objectInput.readUTF();
		categoryTier = objectInput.readUTF();
		numberOfTheExtension = objectInput.readUTF();
		ListOfConditions = objectInput.readUTF();
		payentAmtDue = objectInput.readUTF();
		issueDate = objectInput.readLong();
		expirationDate = objectInput.readLong();

		cannabisApplicationId = objectInput.readLong();
		updatedBySource = objectInput.readUTF();
		nameOfBPMStep = objectInput.readUTF();
		licenseConditionsFulfilled = objectInput.readUTF();
		dateFulfilled = objectInput.readUTF();
		feeOptionSelected = objectInput.readUTF();
		feeAmount = objectInput.readUTF();
		feePaidDate = objectInput.readLong();
		bpmUserNameRole = objectInput.readUTF();
		stageName = objectInput.readUTF();
		status = objectInput.readUTF();
		caseId = objectInput.readUTF();
		licenseNumber = objectInput.readUTF();

		licenseFileId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(cannabisLicenseId);

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

		if (entityNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(entityNumber);
		}

		if (entityName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(entityName);
		}

		if (categoryTier == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(categoryTier);
		}

		if (numberOfTheExtension == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numberOfTheExtension);
		}

		if (ListOfConditions == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ListOfConditions);
		}

		if (payentAmtDue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(payentAmtDue);
		}

		objectOutput.writeLong(issueDate);
		objectOutput.writeLong(expirationDate);

		objectOutput.writeLong(cannabisApplicationId);

		if (updatedBySource == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(updatedBySource);
		}

		if (nameOfBPMStep == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfBPMStep);
		}

		if (licenseConditionsFulfilled == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(licenseConditionsFulfilled);
		}

		if (dateFulfilled == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dateFulfilled);
		}

		if (feeOptionSelected == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(feeOptionSelected);
		}

		if (feeAmount == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(feeAmount);
		}

		objectOutput.writeLong(feePaidDate);

		if (bpmUserNameRole == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bpmUserNameRole);
		}

		if (stageName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(stageName);
		}

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		if (licenseNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(licenseNumber);
		}

		objectOutput.writeLong(licenseFileId);
	}

	public long cannabisLicenseId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String entityNumber;
	public String entityName;
	public String categoryTier;
	public String numberOfTheExtension;
	public String ListOfConditions;
	public String payentAmtDue;
	public long issueDate;
	public long expirationDate;
	public long cannabisApplicationId;
	public String updatedBySource;
	public String nameOfBPMStep;
	public String licenseConditionsFulfilled;
	public String dateFulfilled;
	public String feeOptionSelected;
	public String feeAmount;
	public long feePaidDate;
	public String bpmUserNameRole;
	public String stageName;
	public String status;
	public String caseId;
	public String licenseNumber;
	public long licenseFileId;

}