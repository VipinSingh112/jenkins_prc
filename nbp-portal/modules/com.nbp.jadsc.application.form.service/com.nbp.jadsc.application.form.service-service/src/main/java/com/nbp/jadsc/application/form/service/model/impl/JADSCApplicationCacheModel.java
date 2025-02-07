/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jadsc.application.form.service.model.JADSCApplication;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JADSCApplication in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JADSCApplicationCacheModel
	implements CacheModel<JADSCApplication>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JADSCApplicationCacheModel)) {
			return false;
		}

		JADSCApplicationCacheModel jadscApplicationCacheModel =
			(JADSCApplicationCacheModel)object;

		if (jadscApplicationId ==
				jadscApplicationCacheModel.jadscApplicationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jadscApplicationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(55);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", jadscApplicationId=");
		sb.append(jadscApplicationId);
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
		sb.append(", typeOfApplication=");
		sb.append(typeOfApplication);
		sb.append(", typeOfComplaint=");
		sb.append(typeOfComplaint);
		sb.append(", typeOfTransaction=");
		sb.append(typeOfTransaction);
		sb.append(", transactionNumber=");
		sb.append(transactionNumber);
		sb.append(", typeOfApplicant=");
		sb.append(typeOfApplicant);
		sb.append(", industriesImpacted=");
		sb.append(industriesImpacted);
		sb.append(", breachOfConfidentiality=");
		sb.append(breachOfConfidentiality);
		sb.append(", categoriesOfConfidentialInfo=");
		sb.append(categoriesOfConfidentialInfo);
		sb.append(", categoriesOfConfiOtherPlease=");
		sb.append(categoriesOfConfiOtherPlease);
		sb.append(", reasonForConfidentialStatus=");
		sb.append(reasonForConfidentialStatus);
		sb.append(", nonConfidentialSummary=");
		sb.append(nonConfidentialSummary);
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
	public JADSCApplication toEntityModel() {
		JADSCApplicationImpl jadscApplicationImpl = new JADSCApplicationImpl();

		if (uuid == null) {
			jadscApplicationImpl.setUuid("");
		}
		else {
			jadscApplicationImpl.setUuid(uuid);
		}

		jadscApplicationImpl.setJadscApplicationId(jadscApplicationId);
		jadscApplicationImpl.setGroupId(groupId);
		jadscApplicationImpl.setCompanyId(companyId);
		jadscApplicationImpl.setUserId(userId);

		if (userName == null) {
			jadscApplicationImpl.setUserName("");
		}
		else {
			jadscApplicationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jadscApplicationImpl.setCreateDate(null);
		}
		else {
			jadscApplicationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jadscApplicationImpl.setModifiedDate(null);
		}
		else {
			jadscApplicationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (entityId == null) {
			jadscApplicationImpl.setEntityId("");
		}
		else {
			jadscApplicationImpl.setEntityId(entityId);
		}

		if (typeOfApplication == null) {
			jadscApplicationImpl.setTypeOfApplication("");
		}
		else {
			jadscApplicationImpl.setTypeOfApplication(typeOfApplication);
		}

		if (typeOfComplaint == null) {
			jadscApplicationImpl.setTypeOfComplaint("");
		}
		else {
			jadscApplicationImpl.setTypeOfComplaint(typeOfComplaint);
		}

		if (typeOfTransaction == null) {
			jadscApplicationImpl.setTypeOfTransaction("");
		}
		else {
			jadscApplicationImpl.setTypeOfTransaction(typeOfTransaction);
		}

		if (transactionNumber == null) {
			jadscApplicationImpl.setTransactionNumber("");
		}
		else {
			jadscApplicationImpl.setTransactionNumber(transactionNumber);
		}

		if (typeOfApplicant == null) {
			jadscApplicationImpl.setTypeOfApplicant("");
		}
		else {
			jadscApplicationImpl.setTypeOfApplicant(typeOfApplicant);
		}

		if (industriesImpacted == null) {
			jadscApplicationImpl.setIndustriesImpacted("");
		}
		else {
			jadscApplicationImpl.setIndustriesImpacted(industriesImpacted);
		}

		if (breachOfConfidentiality == null) {
			jadscApplicationImpl.setBreachOfConfidentiality("");
		}
		else {
			jadscApplicationImpl.setBreachOfConfidentiality(
				breachOfConfidentiality);
		}

		if (categoriesOfConfidentialInfo == null) {
			jadscApplicationImpl.setCategoriesOfConfidentialInfo("");
		}
		else {
			jadscApplicationImpl.setCategoriesOfConfidentialInfo(
				categoriesOfConfidentialInfo);
		}

		if (categoriesOfConfiOtherPlease == null) {
			jadscApplicationImpl.setCategoriesOfConfiOtherPlease("");
		}
		else {
			jadscApplicationImpl.setCategoriesOfConfiOtherPlease(
				categoriesOfConfiOtherPlease);
		}

		if (reasonForConfidentialStatus == null) {
			jadscApplicationImpl.setReasonForConfidentialStatus("");
		}
		else {
			jadscApplicationImpl.setReasonForConfidentialStatus(
				reasonForConfidentialStatus);
		}

		if (nonConfidentialSummary == null) {
			jadscApplicationImpl.setNonConfidentialSummary("");
		}
		else {
			jadscApplicationImpl.setNonConfidentialSummary(
				nonConfidentialSummary);
		}

		if (caseId == null) {
			jadscApplicationImpl.setCaseId("");
		}
		else {
			jadscApplicationImpl.setCaseId(caseId);
		}

		jadscApplicationImpl.setStatus(status);

		if (icmDocumentPath == null) {
			jadscApplicationImpl.setIcmDocumentPath("");
		}
		else {
			jadscApplicationImpl.setIcmDocumentPath(icmDocumentPath);
		}

		if (applicationNumber == null) {
			jadscApplicationImpl.setApplicationNumber("");
		}
		else {
			jadscApplicationImpl.setApplicationNumber(applicationNumber);
		}

		if (expiredLicenseAppNumber == null) {
			jadscApplicationImpl.setExpiredLicenseAppNumber("");
		}
		else {
			jadscApplicationImpl.setExpiredLicenseAppNumber(
				expiredLicenseAppNumber);
		}

		jadscApplicationImpl.setPdfFileEntryId(pdfFileEntryId);

		if (appCurrentStageName == null) {
			jadscApplicationImpl.setAppCurrentStageName("");
		}
		else {
			jadscApplicationImpl.setAppCurrentStageName(appCurrentStageName);
		}

		jadscApplicationImpl.resetOriginalValues();

		return jadscApplicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		jadscApplicationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		entityId = objectInput.readUTF();
		typeOfApplication = objectInput.readUTF();
		typeOfComplaint = objectInput.readUTF();
		typeOfTransaction = objectInput.readUTF();
		transactionNumber = objectInput.readUTF();
		typeOfApplicant = objectInput.readUTF();
		industriesImpacted = objectInput.readUTF();
		breachOfConfidentiality = objectInput.readUTF();
		categoriesOfConfidentialInfo = objectInput.readUTF();
		categoriesOfConfiOtherPlease = objectInput.readUTF();
		reasonForConfidentialStatus = objectInput.readUTF();
		nonConfidentialSummary = objectInput.readUTF();
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

		objectOutput.writeLong(jadscApplicationId);

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

		if (typeOfApplication == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfApplication);
		}

		if (typeOfComplaint == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfComplaint);
		}

		if (typeOfTransaction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfTransaction);
		}

		if (transactionNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(transactionNumber);
		}

		if (typeOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfApplicant);
		}

		if (industriesImpacted == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(industriesImpacted);
		}

		if (breachOfConfidentiality == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(breachOfConfidentiality);
		}

		if (categoriesOfConfidentialInfo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(categoriesOfConfidentialInfo);
		}

		if (categoriesOfConfiOtherPlease == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(categoriesOfConfiOtherPlease);
		}

		if (reasonForConfidentialStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(reasonForConfidentialStatus);
		}

		if (nonConfidentialSummary == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nonConfidentialSummary);
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
	public long jadscApplicationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String entityId;
	public String typeOfApplication;
	public String typeOfComplaint;
	public String typeOfTransaction;
	public String transactionNumber;
	public String typeOfApplicant;
	public String industriesImpacted;
	public String breachOfConfidentiality;
	public String categoriesOfConfidentialInfo;
	public String categoriesOfConfiOtherPlease;
	public String reasonForConfidentialStatus;
	public String nonConfidentialSummary;
	public String caseId;
	public int status;
	public String icmDocumentPath;
	public String applicationNumber;
	public String expiredLicenseAppNumber;
	public long pdfFileEntryId;
	public String appCurrentStageName;

}