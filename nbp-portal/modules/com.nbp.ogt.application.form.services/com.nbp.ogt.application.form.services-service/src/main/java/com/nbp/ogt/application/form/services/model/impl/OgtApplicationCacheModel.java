/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ogt.application.form.services.model.OgtApplication;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OgtApplication in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OgtApplicationCacheModel
	implements CacheModel<OgtApplication>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OgtApplicationCacheModel)) {
			return false;
		}

		OgtApplicationCacheModel ogtApplicationCacheModel =
			(OgtApplicationCacheModel)object;

		if (ogtApplicationId == ogtApplicationCacheModel.ogtApplicationId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ogtApplicationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{ogtApplicationId=");
		sb.append(ogtApplicationId);
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
		sb.append(", doYouWant=");
		sb.append(doYouWant);
		sb.append(", typeOfApplicant=");
		sb.append(typeOfApplicant);
		sb.append(", natureOfApplicant=");
		sb.append(natureOfApplicant);
		sb.append(", typeOfMatter=");
		sb.append(typeOfMatter);
		sb.append(", typeOfDebt=");
		sb.append(typeOfDebt);
		sb.append(", debtStatute=");
		sb.append(debtStatute);
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
		sb.append(", pdfFileEntryId=");
		sb.append(pdfFileEntryId);
		sb.append(", appCurrentStageName=");
		sb.append(appCurrentStageName);
		sb.append(", registeredManufacturer=");
		sb.append(registeredManufacturer);
		sb.append(", prospectingRightsNum=");
		sb.append(prospectingRightsNum);
		sb.append(", typeOfBankruptcy=");
		sb.append(typeOfBankruptcy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OgtApplication toEntityModel() {
		OgtApplicationImpl ogtApplicationImpl = new OgtApplicationImpl();

		ogtApplicationImpl.setOgtApplicationId(ogtApplicationId);
		ogtApplicationImpl.setGroupId(groupId);
		ogtApplicationImpl.setCompanyId(companyId);
		ogtApplicationImpl.setUserId(userId);

		if (userName == null) {
			ogtApplicationImpl.setUserName("");
		}
		else {
			ogtApplicationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ogtApplicationImpl.setCreateDate(null);
		}
		else {
			ogtApplicationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ogtApplicationImpl.setModifiedDate(null);
		}
		else {
			ogtApplicationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (entityId == null) {
			ogtApplicationImpl.setEntityId("");
		}
		else {
			ogtApplicationImpl.setEntityId(entityId);
		}

		if (doYouWant == null) {
			ogtApplicationImpl.setDoYouWant("");
		}
		else {
			ogtApplicationImpl.setDoYouWant(doYouWant);
		}

		if (typeOfApplicant == null) {
			ogtApplicationImpl.setTypeOfApplicant("");
		}
		else {
			ogtApplicationImpl.setTypeOfApplicant(typeOfApplicant);
		}

		if (natureOfApplicant == null) {
			ogtApplicationImpl.setNatureOfApplicant("");
		}
		else {
			ogtApplicationImpl.setNatureOfApplicant(natureOfApplicant);
		}

		if (typeOfMatter == null) {
			ogtApplicationImpl.setTypeOfMatter("");
		}
		else {
			ogtApplicationImpl.setTypeOfMatter(typeOfMatter);
		}

		if (typeOfDebt == null) {
			ogtApplicationImpl.setTypeOfDebt("");
		}
		else {
			ogtApplicationImpl.setTypeOfDebt(typeOfDebt);
		}

		if (debtStatute == null) {
			ogtApplicationImpl.setDebtStatute("");
		}
		else {
			ogtApplicationImpl.setDebtStatute(debtStatute);
		}

		ogtApplicationImpl.setStatus(status);

		if (applicationNumber == null) {
			ogtApplicationImpl.setApplicationNumber("");
		}
		else {
			ogtApplicationImpl.setApplicationNumber(applicationNumber);
		}

		if (expiredLicenseAppNumber == null) {
			ogtApplicationImpl.setExpiredLicenseAppNumber("");
		}
		else {
			ogtApplicationImpl.setExpiredLicenseAppNumber(
				expiredLicenseAppNumber);
		}

		if (caseId == null) {
			ogtApplicationImpl.setCaseId("");
		}
		else {
			ogtApplicationImpl.setCaseId(caseId);
		}

		if (icmDocumentsPath == null) {
			ogtApplicationImpl.setIcmDocumentsPath("");
		}
		else {
			ogtApplicationImpl.setIcmDocumentsPath(icmDocumentsPath);
		}

		ogtApplicationImpl.setPdfFileEntryId(pdfFileEntryId);

		if (appCurrentStageName == null) {
			ogtApplicationImpl.setAppCurrentStageName("");
		}
		else {
			ogtApplicationImpl.setAppCurrentStageName(appCurrentStageName);
		}

		if (registeredManufacturer == null) {
			ogtApplicationImpl.setRegisteredManufacturer("");
		}
		else {
			ogtApplicationImpl.setRegisteredManufacturer(
				registeredManufacturer);
		}

		if (prospectingRightsNum == null) {
			ogtApplicationImpl.setProspectingRightsNum("");
		}
		else {
			ogtApplicationImpl.setProspectingRightsNum(prospectingRightsNum);
		}

		if (typeOfBankruptcy == null) {
			ogtApplicationImpl.setTypeOfBankruptcy("");
		}
		else {
			ogtApplicationImpl.setTypeOfBankruptcy(typeOfBankruptcy);
		}

		ogtApplicationImpl.resetOriginalValues();

		return ogtApplicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ogtApplicationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		entityId = objectInput.readUTF();
		doYouWant = objectInput.readUTF();
		typeOfApplicant = objectInput.readUTF();
		natureOfApplicant = objectInput.readUTF();
		typeOfMatter = objectInput.readUTF();
		typeOfDebt = objectInput.readUTF();
		debtStatute = objectInput.readUTF();

		status = objectInput.readInt();
		applicationNumber = objectInput.readUTF();
		expiredLicenseAppNumber = objectInput.readUTF();
		caseId = objectInput.readUTF();
		icmDocumentsPath = objectInput.readUTF();

		pdfFileEntryId = objectInput.readLong();
		appCurrentStageName = objectInput.readUTF();
		registeredManufacturer = objectInput.readUTF();
		prospectingRightsNum = objectInput.readUTF();
		typeOfBankruptcy = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ogtApplicationId);

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

		if (doYouWant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(doYouWant);
		}

		if (typeOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfApplicant);
		}

		if (natureOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(natureOfApplicant);
		}

		if (typeOfMatter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfMatter);
		}

		if (typeOfDebt == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfDebt);
		}

		if (debtStatute == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(debtStatute);
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

		objectOutput.writeLong(pdfFileEntryId);

		if (appCurrentStageName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appCurrentStageName);
		}

		if (registeredManufacturer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(registeredManufacturer);
		}

		if (prospectingRightsNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(prospectingRightsNum);
		}

		if (typeOfBankruptcy == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfBankruptcy);
		}
	}

	public long ogtApplicationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String entityId;
	public String doYouWant;
	public String typeOfApplicant;
	public String natureOfApplicant;
	public String typeOfMatter;
	public String typeOfDebt;
	public String debtStatute;
	public int status;
	public String applicationNumber;
	public String expiredLicenseAppNumber;
	public String caseId;
	public String icmDocumentsPath;
	public long pdfFileEntryId;
	public String appCurrentStageName;
	public String registeredManufacturer;
	public String prospectingRightsNum;
	public String typeOfBankruptcy;

}