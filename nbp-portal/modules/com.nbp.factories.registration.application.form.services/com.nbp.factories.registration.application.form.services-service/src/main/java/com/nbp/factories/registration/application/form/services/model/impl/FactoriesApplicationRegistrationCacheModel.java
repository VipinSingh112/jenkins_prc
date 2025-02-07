/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.factories.registration.application.form.services.model.FactoriesApplicationRegistration;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FactoriesApplicationRegistration in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FactoriesApplicationRegistrationCacheModel
	implements CacheModel<FactoriesApplicationRegistration>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FactoriesApplicationRegistrationCacheModel)) {
			return false;
		}

		FactoriesApplicationRegistrationCacheModel
			factoriesApplicationRegistrationCacheModel =
				(FactoriesApplicationRegistrationCacheModel)object;

		if (factoriesApplicationId ==
				factoriesApplicationRegistrationCacheModel.
					factoriesApplicationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, factoriesApplicationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{factoriesApplicationId=");
		sb.append(factoriesApplicationId);
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
		sb.append(", expiredLicenseAppNumber=");
		sb.append(expiredLicenseAppNumber);
		sb.append(", icmDocumentPath=");
		sb.append(icmDocumentPath);
		sb.append(", productCategory=");
		sb.append(productCategory);
		sb.append(", areYouProcessing=");
		sb.append(areYouProcessing);
		sb.append(", typeOfTransaction=");
		sb.append(typeOfTransaction);
		sb.append(", pdfFileEntryId=");
		sb.append(pdfFileEntryId);
		sb.append(", appCurrentStageName=");
		sb.append(appCurrentStageName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FactoriesApplicationRegistration toEntityModel() {
		FactoriesApplicationRegistrationImpl
			factoriesApplicationRegistrationImpl =
				new FactoriesApplicationRegistrationImpl();

		factoriesApplicationRegistrationImpl.setFactoriesApplicationId(
			factoriesApplicationId);
		factoriesApplicationRegistrationImpl.setGroupId(groupId);
		factoriesApplicationRegistrationImpl.setCompanyId(companyId);
		factoriesApplicationRegistrationImpl.setUserId(userId);

		if (userName == null) {
			factoriesApplicationRegistrationImpl.setUserName("");
		}
		else {
			factoriesApplicationRegistrationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			factoriesApplicationRegistrationImpl.setCreateDate(null);
		}
		else {
			factoriesApplicationRegistrationImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			factoriesApplicationRegistrationImpl.setModifiedDate(null);
		}
		else {
			factoriesApplicationRegistrationImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (entityId == null) {
			factoriesApplicationRegistrationImpl.setEntityId("");
		}
		else {
			factoriesApplicationRegistrationImpl.setEntityId(entityId);
		}

		factoriesApplicationRegistrationImpl.setStatus(status);

		if (applicationNumber == null) {
			factoriesApplicationRegistrationImpl.setApplicationNumber("");
		}
		else {
			factoriesApplicationRegistrationImpl.setApplicationNumber(
				applicationNumber);
		}

		if (caseId == null) {
			factoriesApplicationRegistrationImpl.setCaseId("");
		}
		else {
			factoriesApplicationRegistrationImpl.setCaseId(caseId);
		}

		if (expiredLicenseAppNumber == null) {
			factoriesApplicationRegistrationImpl.setExpiredLicenseAppNumber("");
		}
		else {
			factoriesApplicationRegistrationImpl.setExpiredLicenseAppNumber(
				expiredLicenseAppNumber);
		}

		if (icmDocumentPath == null) {
			factoriesApplicationRegistrationImpl.setIcmDocumentPath("");
		}
		else {
			factoriesApplicationRegistrationImpl.setIcmDocumentPath(
				icmDocumentPath);
		}

		if (productCategory == null) {
			factoriesApplicationRegistrationImpl.setProductCategory("");
		}
		else {
			factoriesApplicationRegistrationImpl.setProductCategory(
				productCategory);
		}

		if (areYouProcessing == null) {
			factoriesApplicationRegistrationImpl.setAreYouProcessing("");
		}
		else {
			factoriesApplicationRegistrationImpl.setAreYouProcessing(
				areYouProcessing);
		}

		if (typeOfTransaction == null) {
			factoriesApplicationRegistrationImpl.setTypeOfTransaction("");
		}
		else {
			factoriesApplicationRegistrationImpl.setTypeOfTransaction(
				typeOfTransaction);
		}

		factoriesApplicationRegistrationImpl.setPdfFileEntryId(pdfFileEntryId);

		if (appCurrentStageName == null) {
			factoriesApplicationRegistrationImpl.setAppCurrentStageName("");
		}
		else {
			factoriesApplicationRegistrationImpl.setAppCurrentStageName(
				appCurrentStageName);
		}

		factoriesApplicationRegistrationImpl.resetOriginalValues();

		return factoriesApplicationRegistrationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		factoriesApplicationId = objectInput.readLong();

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
		expiredLicenseAppNumber = objectInput.readUTF();
		icmDocumentPath = objectInput.readUTF();
		productCategory = objectInput.readUTF();
		areYouProcessing = objectInput.readUTF();
		typeOfTransaction = objectInput.readUTF();

		pdfFileEntryId = objectInput.readLong();
		appCurrentStageName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(factoriesApplicationId);

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

		if (expiredLicenseAppNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expiredLicenseAppNumber);
		}

		if (icmDocumentPath == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(icmDocumentPath);
		}

		if (productCategory == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(productCategory);
		}

		if (areYouProcessing == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(areYouProcessing);
		}

		if (typeOfTransaction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfTransaction);
		}

		objectOutput.writeLong(pdfFileEntryId);

		if (appCurrentStageName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appCurrentStageName);
		}
	}

	public long factoriesApplicationId;
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
	public String expiredLicenseAppNumber;
	public String icmDocumentPath;
	public String productCategory;
	public String areYouProcessing;
	public String typeOfTransaction;
	public long pdfFileEntryId;
	public String appCurrentStageName;

}