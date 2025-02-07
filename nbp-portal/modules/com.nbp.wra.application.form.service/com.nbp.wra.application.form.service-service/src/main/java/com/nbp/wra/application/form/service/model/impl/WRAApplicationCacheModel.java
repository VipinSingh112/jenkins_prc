/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.wra.application.form.service.model.WRAApplication;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing WRAApplication in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class WRAApplicationCacheModel
	implements CacheModel<WRAApplication>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof WRAApplicationCacheModel)) {
			return false;
		}

		WRAApplicationCacheModel wraApplicationCacheModel =
			(WRAApplicationCacheModel)object;

		if (wraApplicationId == wraApplicationCacheModel.wraApplicationId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, wraApplicationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(47);

		sb.append("{wraApplicationId=");
		sb.append(wraApplicationId);
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
		sb.append(", typeOfTransaction=");
		sb.append(typeOfTransaction);
		sb.append(", typeOfPermit=");
		sb.append(typeOfPermit);
		sb.append(", typeOfTransacPermit=");
		sb.append(typeOfTransacPermit);
		sb.append(", userWaterTypeCat=");
		sb.append(userWaterTypeCat);
		sb.append(", consumptiveSubCat=");
		sb.append(consumptiveSubCat);
		sb.append(", nonConsumptiveSubCat=");
		sb.append(nonConsumptiveSubCat);
		sb.append(", industrialTypeSubCat=");
		sb.append(industrialTypeSubCat);
		sb.append(", icmDocumentPath=");
		sb.append(icmDocumentPath);
		sb.append(", status=");
		sb.append(status);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", applicationNumber=");
		sb.append(applicationNumber);
		sb.append(", pdfFileEntryId=");
		sb.append(pdfFileEntryId);
		sb.append(", expiredLicenseAppNumber=");
		sb.append(expiredLicenseAppNumber);
		sb.append(", appCurrentStageName=");
		sb.append(appCurrentStageName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public WRAApplication toEntityModel() {
		WRAApplicationImpl wraApplicationImpl = new WRAApplicationImpl();

		wraApplicationImpl.setWraApplicationId(wraApplicationId);
		wraApplicationImpl.setGroupId(groupId);
		wraApplicationImpl.setCompanyId(companyId);
		wraApplicationImpl.setUserId(userId);

		if (userName == null) {
			wraApplicationImpl.setUserName("");
		}
		else {
			wraApplicationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			wraApplicationImpl.setCreateDate(null);
		}
		else {
			wraApplicationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			wraApplicationImpl.setModifiedDate(null);
		}
		else {
			wraApplicationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (entityId == Long.MIN_VALUE) {
			wraApplicationImpl.setEntityId(null);
		}
		else {
			wraApplicationImpl.setEntityId(new Date(entityId));
		}

		if (typeOfApplication == null) {
			wraApplicationImpl.setTypeOfApplication("");
		}
		else {
			wraApplicationImpl.setTypeOfApplication(typeOfApplication);
		}

		if (typeOfTransaction == null) {
			wraApplicationImpl.setTypeOfTransaction("");
		}
		else {
			wraApplicationImpl.setTypeOfTransaction(typeOfTransaction);
		}

		if (typeOfPermit == null) {
			wraApplicationImpl.setTypeOfPermit("");
		}
		else {
			wraApplicationImpl.setTypeOfPermit(typeOfPermit);
		}

		if (typeOfTransacPermit == null) {
			wraApplicationImpl.setTypeOfTransacPermit("");
		}
		else {
			wraApplicationImpl.setTypeOfTransacPermit(typeOfTransacPermit);
		}

		if (userWaterTypeCat == null) {
			wraApplicationImpl.setUserWaterTypeCat("");
		}
		else {
			wraApplicationImpl.setUserWaterTypeCat(userWaterTypeCat);
		}

		if (consumptiveSubCat == null) {
			wraApplicationImpl.setConsumptiveSubCat("");
		}
		else {
			wraApplicationImpl.setConsumptiveSubCat(consumptiveSubCat);
		}

		if (nonConsumptiveSubCat == null) {
			wraApplicationImpl.setNonConsumptiveSubCat("");
		}
		else {
			wraApplicationImpl.setNonConsumptiveSubCat(nonConsumptiveSubCat);
		}

		if (industrialTypeSubCat == null) {
			wraApplicationImpl.setIndustrialTypeSubCat("");
		}
		else {
			wraApplicationImpl.setIndustrialTypeSubCat(industrialTypeSubCat);
		}

		if (icmDocumentPath == null) {
			wraApplicationImpl.setIcmDocumentPath("");
		}
		else {
			wraApplicationImpl.setIcmDocumentPath(icmDocumentPath);
		}

		wraApplicationImpl.setStatus(status);

		if (caseId == null) {
			wraApplicationImpl.setCaseId("");
		}
		else {
			wraApplicationImpl.setCaseId(caseId);
		}

		if (applicationNumber == null) {
			wraApplicationImpl.setApplicationNumber("");
		}
		else {
			wraApplicationImpl.setApplicationNumber(applicationNumber);
		}

		wraApplicationImpl.setPdfFileEntryId(pdfFileEntryId);

		if (expiredLicenseAppNumber == null) {
			wraApplicationImpl.setExpiredLicenseAppNumber("");
		}
		else {
			wraApplicationImpl.setExpiredLicenseAppNumber(
				expiredLicenseAppNumber);
		}

		if (appCurrentStageName == null) {
			wraApplicationImpl.setAppCurrentStageName("");
		}
		else {
			wraApplicationImpl.setAppCurrentStageName(appCurrentStageName);
		}

		wraApplicationImpl.resetOriginalValues();

		return wraApplicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		wraApplicationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		entityId = objectInput.readLong();
		typeOfApplication = objectInput.readUTF();
		typeOfTransaction = objectInput.readUTF();
		typeOfPermit = objectInput.readUTF();
		typeOfTransacPermit = objectInput.readUTF();
		userWaterTypeCat = objectInput.readUTF();
		consumptiveSubCat = objectInput.readUTF();
		nonConsumptiveSubCat = objectInput.readUTF();
		industrialTypeSubCat = objectInput.readUTF();
		icmDocumentPath = objectInput.readUTF();

		status = objectInput.readInt();
		caseId = objectInput.readUTF();
		applicationNumber = objectInput.readUTF();

		pdfFileEntryId = objectInput.readLong();
		expiredLicenseAppNumber = objectInput.readUTF();
		appCurrentStageName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(wraApplicationId);

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
		objectOutput.writeLong(entityId);

		if (typeOfApplication == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfApplication);
		}

		if (typeOfTransaction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfTransaction);
		}

		if (typeOfPermit == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfPermit);
		}

		if (typeOfTransacPermit == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfTransacPermit);
		}

		if (userWaterTypeCat == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userWaterTypeCat);
		}

		if (consumptiveSubCat == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(consumptiveSubCat);
		}

		if (nonConsumptiveSubCat == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nonConsumptiveSubCat);
		}

		if (industrialTypeSubCat == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(industrialTypeSubCat);
		}

		if (icmDocumentPath == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(icmDocumentPath);
		}

		objectOutput.writeInt(status);

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		if (applicationNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicationNumber);
		}

		objectOutput.writeLong(pdfFileEntryId);

		if (expiredLicenseAppNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expiredLicenseAppNumber);
		}

		if (appCurrentStageName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appCurrentStageName);
		}
	}

	public long wraApplicationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long entityId;
	public String typeOfApplication;
	public String typeOfTransaction;
	public String typeOfPermit;
	public String typeOfTransacPermit;
	public String userWaterTypeCat;
	public String consumptiveSubCat;
	public String nonConsumptiveSubCat;
	public String industrialTypeSubCat;
	public String icmDocumentPath;
	public int status;
	public String caseId;
	public String applicationNumber;
	public long pdfFileEntryId;
	public String expiredLicenseAppNumber;
	public String appCurrentStageName;

}