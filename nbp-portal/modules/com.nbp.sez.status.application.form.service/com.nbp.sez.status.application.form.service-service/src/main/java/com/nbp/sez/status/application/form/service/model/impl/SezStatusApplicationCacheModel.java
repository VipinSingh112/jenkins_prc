/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezStatusApplication;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezStatusApplication in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezStatusApplicationCacheModel
	implements CacheModel<SezStatusApplication>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezStatusApplicationCacheModel)) {
			return false;
		}

		SezStatusApplicationCacheModel sezStatusApplicationCacheModel =
			(SezStatusApplicationCacheModel)object;

		if (sezStatusApplicationId ==
				sezStatusApplicationCacheModel.sezStatusApplicationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezStatusApplicationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(51);

		sb.append("{sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
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
		sb.append(", sezStatus=");
		sb.append(sezStatus);
		sb.append(", typeOfTransaction=");
		sb.append(typeOfTransaction);
		sb.append(", zoningClassification=");
		sb.append(zoningClassification);
		sb.append(", specialEconomicZone=");
		sb.append(specialEconomicZone);
		sb.append(", parish=");
		sb.append(parish);
		sb.append(", industries=");
		sb.append(industries);
		sb.append(", status=");
		sb.append(status);
		sb.append(", applicationNumber=");
		sb.append(applicationNumber);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", expiredLicenseAppNumber=");
		sb.append(expiredLicenseAppNumber);
		sb.append(", icmDocumentsPath=");
		sb.append(icmDocumentsPath);
		sb.append(", pdfFileEntryId=");
		sb.append(pdfFileEntryId);
		sb.append(", appCurrentStageName=");
		sb.append(appCurrentStageName);
		sb.append(", doYouWantTo=");
		sb.append(doYouWantTo);
		sb.append(", typeOfTransactionWFH=");
		sb.append(typeOfTransactionWFH);
		sb.append(", controlNumberWFH=");
		sb.append(controlNumberWFH);
		sb.append(", applicantStatusWFH=");
		sb.append(applicantStatusWFH);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezStatusApplication toEntityModel() {
		SezStatusApplicationImpl sezStatusApplicationImpl =
			new SezStatusApplicationImpl();

		sezStatusApplicationImpl.setSezStatusApplicationId(
			sezStatusApplicationId);
		sezStatusApplicationImpl.setGroupId(groupId);
		sezStatusApplicationImpl.setCompanyId(companyId);
		sezStatusApplicationImpl.setUserId(userId);

		if (userName == null) {
			sezStatusApplicationImpl.setUserName("");
		}
		else {
			sezStatusApplicationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezStatusApplicationImpl.setCreateDate(null);
		}
		else {
			sezStatusApplicationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezStatusApplicationImpl.setModifiedDate(null);
		}
		else {
			sezStatusApplicationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (entityId == null) {
			sezStatusApplicationImpl.setEntityId("");
		}
		else {
			sezStatusApplicationImpl.setEntityId(entityId);
		}

		if (sezStatus == null) {
			sezStatusApplicationImpl.setSezStatus("");
		}
		else {
			sezStatusApplicationImpl.setSezStatus(sezStatus);
		}

		if (typeOfTransaction == null) {
			sezStatusApplicationImpl.setTypeOfTransaction("");
		}
		else {
			sezStatusApplicationImpl.setTypeOfTransaction(typeOfTransaction);
		}

		if (zoningClassification == null) {
			sezStatusApplicationImpl.setZoningClassification("");
		}
		else {
			sezStatusApplicationImpl.setZoningClassification(
				zoningClassification);
		}

		if (specialEconomicZone == null) {
			sezStatusApplicationImpl.setSpecialEconomicZone("");
		}
		else {
			sezStatusApplicationImpl.setSpecialEconomicZone(
				specialEconomicZone);
		}

		if (parish == null) {
			sezStatusApplicationImpl.setParish("");
		}
		else {
			sezStatusApplicationImpl.setParish(parish);
		}

		if (industries == null) {
			sezStatusApplicationImpl.setIndustries("");
		}
		else {
			sezStatusApplicationImpl.setIndustries(industries);
		}

		sezStatusApplicationImpl.setStatus(status);

		if (applicationNumber == null) {
			sezStatusApplicationImpl.setApplicationNumber("");
		}
		else {
			sezStatusApplicationImpl.setApplicationNumber(applicationNumber);
		}

		if (caseId == null) {
			sezStatusApplicationImpl.setCaseId("");
		}
		else {
			sezStatusApplicationImpl.setCaseId(caseId);
		}

		if (expiredLicenseAppNumber == null) {
			sezStatusApplicationImpl.setExpiredLicenseAppNumber("");
		}
		else {
			sezStatusApplicationImpl.setExpiredLicenseAppNumber(
				expiredLicenseAppNumber);
		}

		if (icmDocumentsPath == null) {
			sezStatusApplicationImpl.setIcmDocumentsPath("");
		}
		else {
			sezStatusApplicationImpl.setIcmDocumentsPath(icmDocumentsPath);
		}

		sezStatusApplicationImpl.setPdfFileEntryId(pdfFileEntryId);

		if (appCurrentStageName == null) {
			sezStatusApplicationImpl.setAppCurrentStageName("");
		}
		else {
			sezStatusApplicationImpl.setAppCurrentStageName(
				appCurrentStageName);
		}

		if (doYouWantTo == null) {
			sezStatusApplicationImpl.setDoYouWantTo("");
		}
		else {
			sezStatusApplicationImpl.setDoYouWantTo(doYouWantTo);
		}

		if (typeOfTransactionWFH == null) {
			sezStatusApplicationImpl.setTypeOfTransactionWFH("");
		}
		else {
			sezStatusApplicationImpl.setTypeOfTransactionWFH(
				typeOfTransactionWFH);
		}

		if (controlNumberWFH == null) {
			sezStatusApplicationImpl.setControlNumberWFH("");
		}
		else {
			sezStatusApplicationImpl.setControlNumberWFH(controlNumberWFH);
		}

		if (applicantStatusWFH == null) {
			sezStatusApplicationImpl.setApplicantStatusWFH("");
		}
		else {
			sezStatusApplicationImpl.setApplicantStatusWFH(applicantStatusWFH);
		}

		sezStatusApplicationImpl.resetOriginalValues();

		return sezStatusApplicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezStatusApplicationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		entityId = objectInput.readUTF();
		sezStatus = objectInput.readUTF();
		typeOfTransaction = objectInput.readUTF();
		zoningClassification = objectInput.readUTF();
		specialEconomicZone = objectInput.readUTF();
		parish = objectInput.readUTF();
		industries = objectInput.readUTF();

		status = objectInput.readInt();
		applicationNumber = objectInput.readUTF();
		caseId = objectInput.readUTF();
		expiredLicenseAppNumber = objectInput.readUTF();
		icmDocumentsPath = objectInput.readUTF();

		pdfFileEntryId = objectInput.readLong();
		appCurrentStageName = objectInput.readUTF();
		doYouWantTo = objectInput.readUTF();
		typeOfTransactionWFH = objectInput.readUTF();
		controlNumberWFH = objectInput.readUTF();
		applicantStatusWFH = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezStatusApplicationId);

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

		if (sezStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sezStatus);
		}

		if (typeOfTransaction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfTransaction);
		}

		if (zoningClassification == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(zoningClassification);
		}

		if (specialEconomicZone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(specialEconomicZone);
		}

		if (parish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(parish);
		}

		if (industries == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(industries);
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

		if (doYouWantTo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(doYouWantTo);
		}

		if (typeOfTransactionWFH == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfTransactionWFH);
		}

		if (controlNumberWFH == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(controlNumberWFH);
		}

		if (applicantStatusWFH == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantStatusWFH);
		}
	}

	public long sezStatusApplicationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String entityId;
	public String sezStatus;
	public String typeOfTransaction;
	public String zoningClassification;
	public String specialEconomicZone;
	public String parish;
	public String industries;
	public int status;
	public String applicationNumber;
	public String caseId;
	public String expiredLicenseAppNumber;
	public String icmDocumentsPath;
	public long pdfFileEntryId;
	public String appCurrentStageName;
	public String doYouWantTo;
	public String typeOfTransactionWFH;
	public String controlNumberWFH;
	public String applicantStatusWFH;

}