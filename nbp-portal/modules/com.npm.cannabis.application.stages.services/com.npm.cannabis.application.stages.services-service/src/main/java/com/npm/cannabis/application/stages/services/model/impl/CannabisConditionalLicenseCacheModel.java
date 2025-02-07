/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.npm.cannabis.application.stages.services.model.CannabisConditionalLicense;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CannabisConditionalLicense in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CannabisConditionalLicenseCacheModel
	implements CacheModel<CannabisConditionalLicense>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CannabisConditionalLicenseCacheModel)) {
			return false;
		}

		CannabisConditionalLicenseCacheModel
			cannabisConditionalLicenseCacheModel =
				(CannabisConditionalLicenseCacheModel)object;

		if (cannabisConditonalLicenseId ==
				cannabisConditionalLicenseCacheModel.
					cannabisConditonalLicenseId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cannabisConditonalLicenseId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{cannabisConditonalLicenseId=");
		sb.append(cannabisConditonalLicenseId);
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
		sb.append(", ListOfPreconditions=");
		sb.append(ListOfPreconditions);
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
		sb.append(", status=");
		sb.append(status);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", conditionalLicenseFileId=");
		sb.append(conditionalLicenseFileId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CannabisConditionalLicense toEntityModel() {
		CannabisConditionalLicenseImpl cannabisConditionalLicenseImpl =
			new CannabisConditionalLicenseImpl();

		cannabisConditionalLicenseImpl.setCannabisConditonalLicenseId(
			cannabisConditonalLicenseId);
		cannabisConditionalLicenseImpl.setGroupId(groupId);
		cannabisConditionalLicenseImpl.setCompanyId(companyId);
		cannabisConditionalLicenseImpl.setUserId(userId);

		if (userName == null) {
			cannabisConditionalLicenseImpl.setUserName("");
		}
		else {
			cannabisConditionalLicenseImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			cannabisConditionalLicenseImpl.setCreateDate(null);
		}
		else {
			cannabisConditionalLicenseImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cannabisConditionalLicenseImpl.setModifiedDate(null);
		}
		else {
			cannabisConditionalLicenseImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (entityNumber == null) {
			cannabisConditionalLicenseImpl.setEntityNumber("");
		}
		else {
			cannabisConditionalLicenseImpl.setEntityNumber(entityNumber);
		}

		if (entityName == null) {
			cannabisConditionalLicenseImpl.setEntityName("");
		}
		else {
			cannabisConditionalLicenseImpl.setEntityName(entityName);
		}

		if (categoryTier == null) {
			cannabisConditionalLicenseImpl.setCategoryTier("");
		}
		else {
			cannabisConditionalLicenseImpl.setCategoryTier(categoryTier);
		}

		cannabisConditionalLicenseImpl.setNumberOfTheExtension(
			numberOfTheExtension);

		if (ListOfPreconditions == null) {
			cannabisConditionalLicenseImpl.setListOfPreconditions("");
		}
		else {
			cannabisConditionalLicenseImpl.setListOfPreconditions(
				ListOfPreconditions);
		}

		if (payentAmtDue == null) {
			cannabisConditionalLicenseImpl.setPayentAmtDue("");
		}
		else {
			cannabisConditionalLicenseImpl.setPayentAmtDue(payentAmtDue);
		}

		if (issueDate == Long.MIN_VALUE) {
			cannabisConditionalLicenseImpl.setIssueDate(null);
		}
		else {
			cannabisConditionalLicenseImpl.setIssueDate(new Date(issueDate));
		}

		if (expirationDate == Long.MIN_VALUE) {
			cannabisConditionalLicenseImpl.setExpirationDate(null);
		}
		else {
			cannabisConditionalLicenseImpl.setExpirationDate(
				new Date(expirationDate));
		}

		cannabisConditionalLicenseImpl.setCannabisApplicationId(
			cannabisApplicationId);

		if (updatedBySource == null) {
			cannabisConditionalLicenseImpl.setUpdatedBySource("");
		}
		else {
			cannabisConditionalLicenseImpl.setUpdatedBySource(updatedBySource);
		}

		if (status == null) {
			cannabisConditionalLicenseImpl.setStatus("");
		}
		else {
			cannabisConditionalLicenseImpl.setStatus(status);
		}

		if (caseId == null) {
			cannabisConditionalLicenseImpl.setCaseId("");
		}
		else {
			cannabisConditionalLicenseImpl.setCaseId(caseId);
		}

		cannabisConditionalLicenseImpl.setConditionalLicenseFileId(
			conditionalLicenseFileId);

		cannabisConditionalLicenseImpl.resetOriginalValues();

		return cannabisConditionalLicenseImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cannabisConditonalLicenseId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		entityNumber = objectInput.readUTF();
		entityName = objectInput.readUTF();
		categoryTier = objectInput.readUTF();

		numberOfTheExtension = objectInput.readInt();
		ListOfPreconditions = objectInput.readUTF();
		payentAmtDue = objectInput.readUTF();
		issueDate = objectInput.readLong();
		expirationDate = objectInput.readLong();

		cannabisApplicationId = objectInput.readLong();
		updatedBySource = objectInput.readUTF();
		status = objectInput.readUTF();
		caseId = objectInput.readUTF();

		conditionalLicenseFileId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(cannabisConditonalLicenseId);

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

		objectOutput.writeInt(numberOfTheExtension);

		if (ListOfPreconditions == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ListOfPreconditions);
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

		objectOutput.writeLong(conditionalLicenseFileId);
	}

	public long cannabisConditonalLicenseId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String entityNumber;
	public String entityName;
	public String categoryTier;
	public int numberOfTheExtension;
	public String ListOfPreconditions;
	public String payentAmtDue;
	public long issueDate;
	public long expirationDate;
	public long cannabisApplicationId;
	public String updatedBySource;
	public String status;
	public String caseId;
	public long conditionalLicenseFileId;

}