/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.JTBApplication;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JTBApplication in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JTBApplicationCacheModel
	implements CacheModel<JTBApplication>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JTBApplicationCacheModel)) {
			return false;
		}

		JTBApplicationCacheModel jtbApplicationCacheModel =
			(JTBApplicationCacheModel)object;

		if (jtbApplicationId == jtbApplicationCacheModel.jtbApplicationId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jtbApplicationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(55);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
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
		sb.append(", categoryTypeValAccomo=");
		sb.append(categoryTypeValAccomo);
		sb.append(", nonHotelSubCategory=");
		sb.append(nonHotelSubCategory);
		sb.append(", jtbTransactionTypeVal=");
		sb.append(jtbTransactionTypeVal);
		sb.append(", attractionCategoryTypeVal=");
		sb.append(attractionCategoryTypeVal);
		sb.append(", domesticToursType=");
		sb.append(domesticToursType);
		sb.append(", otherCategories=");
		sb.append(otherCategories);
		sb.append(", operatorName=");
		sb.append(operatorName);
		sb.append(", dateOfIssue=");
		sb.append(dateOfIssue);
		sb.append(", dateOfExp=");
		sb.append(dateOfExp);
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
		sb.append(", dateOfExpiration=");
		sb.append(dateOfExpiration);
		sb.append(", appCurrentStageName=");
		sb.append(appCurrentStageName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JTBApplication toEntityModel() {
		JTBApplicationImpl jtbApplicationImpl = new JTBApplicationImpl();

		if (uuid == null) {
			jtbApplicationImpl.setUuid("");
		}
		else {
			jtbApplicationImpl.setUuid(uuid);
		}

		jtbApplicationImpl.setJtbApplicationId(jtbApplicationId);
		jtbApplicationImpl.setGroupId(groupId);
		jtbApplicationImpl.setCompanyId(companyId);
		jtbApplicationImpl.setUserId(userId);

		if (userName == null) {
			jtbApplicationImpl.setUserName("");
		}
		else {
			jtbApplicationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jtbApplicationImpl.setCreateDate(null);
		}
		else {
			jtbApplicationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jtbApplicationImpl.setModifiedDate(null);
		}
		else {
			jtbApplicationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (entityId == null) {
			jtbApplicationImpl.setEntityId("");
		}
		else {
			jtbApplicationImpl.setEntityId(entityId);
		}

		if (typeOfApplication == null) {
			jtbApplicationImpl.setTypeOfApplication("");
		}
		else {
			jtbApplicationImpl.setTypeOfApplication(typeOfApplication);
		}

		if (categoryTypeValAccomo == null) {
			jtbApplicationImpl.setCategoryTypeValAccomo("");
		}
		else {
			jtbApplicationImpl.setCategoryTypeValAccomo(categoryTypeValAccomo);
		}

		if (nonHotelSubCategory == null) {
			jtbApplicationImpl.setNonHotelSubCategory("");
		}
		else {
			jtbApplicationImpl.setNonHotelSubCategory(nonHotelSubCategory);
		}

		if (jtbTransactionTypeVal == null) {
			jtbApplicationImpl.setJtbTransactionTypeVal("");
		}
		else {
			jtbApplicationImpl.setJtbTransactionTypeVal(jtbTransactionTypeVal);
		}

		if (attractionCategoryTypeVal == null) {
			jtbApplicationImpl.setAttractionCategoryTypeVal("");
		}
		else {
			jtbApplicationImpl.setAttractionCategoryTypeVal(
				attractionCategoryTypeVal);
		}

		if (domesticToursType == null) {
			jtbApplicationImpl.setDomesticToursType("");
		}
		else {
			jtbApplicationImpl.setDomesticToursType(domesticToursType);
		}

		if (otherCategories == null) {
			jtbApplicationImpl.setOtherCategories("");
		}
		else {
			jtbApplicationImpl.setOtherCategories(otherCategories);
		}

		if (operatorName == null) {
			jtbApplicationImpl.setOperatorName("");
		}
		else {
			jtbApplicationImpl.setOperatorName(operatorName);
		}

		if (dateOfIssue == Long.MIN_VALUE) {
			jtbApplicationImpl.setDateOfIssue(null);
		}
		else {
			jtbApplicationImpl.setDateOfIssue(new Date(dateOfIssue));
		}

		if (dateOfExp == Long.MIN_VALUE) {
			jtbApplicationImpl.setDateOfExp(null);
		}
		else {
			jtbApplicationImpl.setDateOfExp(new Date(dateOfExp));
		}

		jtbApplicationImpl.setStatus(status);

		if (applicationNumber == null) {
			jtbApplicationImpl.setApplicationNumber("");
		}
		else {
			jtbApplicationImpl.setApplicationNumber(applicationNumber);
		}

		if (expiredLicenseAppNumber == null) {
			jtbApplicationImpl.setExpiredLicenseAppNumber("");
		}
		else {
			jtbApplicationImpl.setExpiredLicenseAppNumber(
				expiredLicenseAppNumber);
		}

		if (caseId == null) {
			jtbApplicationImpl.setCaseId("");
		}
		else {
			jtbApplicationImpl.setCaseId(caseId);
		}

		if (icmDocumentsPath == null) {
			jtbApplicationImpl.setIcmDocumentsPath("");
		}
		else {
			jtbApplicationImpl.setIcmDocumentsPath(icmDocumentsPath);
		}

		jtbApplicationImpl.setPdfFileEntryId(pdfFileEntryId);

		if (dateOfExpiration == Long.MIN_VALUE) {
			jtbApplicationImpl.setDateOfExpiration(null);
		}
		else {
			jtbApplicationImpl.setDateOfExpiration(new Date(dateOfExpiration));
		}

		if (appCurrentStageName == null) {
			jtbApplicationImpl.setAppCurrentStageName("");
		}
		else {
			jtbApplicationImpl.setAppCurrentStageName(appCurrentStageName);
		}

		jtbApplicationImpl.resetOriginalValues();

		return jtbApplicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		jtbApplicationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		entityId = objectInput.readUTF();
		typeOfApplication = objectInput.readUTF();
		categoryTypeValAccomo = objectInput.readUTF();
		nonHotelSubCategory = objectInput.readUTF();
		jtbTransactionTypeVal = objectInput.readUTF();
		attractionCategoryTypeVal = objectInput.readUTF();
		domesticToursType = objectInput.readUTF();
		otherCategories = objectInput.readUTF();
		operatorName = objectInput.readUTF();
		dateOfIssue = objectInput.readLong();
		dateOfExp = objectInput.readLong();

		status = objectInput.readInt();
		applicationNumber = objectInput.readUTF();
		expiredLicenseAppNumber = objectInput.readUTF();
		caseId = objectInput.readUTF();
		icmDocumentsPath = objectInput.readUTF();

		pdfFileEntryId = objectInput.readLong();
		dateOfExpiration = objectInput.readLong();
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

		objectOutput.writeLong(jtbApplicationId);

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

		if (categoryTypeValAccomo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(categoryTypeValAccomo);
		}

		if (nonHotelSubCategory == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nonHotelSubCategory);
		}

		if (jtbTransactionTypeVal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(jtbTransactionTypeVal);
		}

		if (attractionCategoryTypeVal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(attractionCategoryTypeVal);
		}

		if (domesticToursType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(domesticToursType);
		}

		if (otherCategories == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherCategories);
		}

		if (operatorName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(operatorName);
		}

		objectOutput.writeLong(dateOfIssue);
		objectOutput.writeLong(dateOfExp);

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
		objectOutput.writeLong(dateOfExpiration);

		if (appCurrentStageName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appCurrentStageName);
		}
	}

	public String uuid;
	public long jtbApplicationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String entityId;
	public String typeOfApplication;
	public String categoryTypeValAccomo;
	public String nonHotelSubCategory;
	public String jtbTransactionTypeVal;
	public String attractionCategoryTypeVal;
	public String domesticToursType;
	public String otherCategories;
	public String operatorName;
	public long dateOfIssue;
	public long dateOfExp;
	public int status;
	public String applicationNumber;
	public String expiredLicenseAppNumber;
	public String caseId;
	public String icmDocumentsPath;
	public long pdfFileEntryId;
	public long dateOfExpiration;
	public String appCurrentStageName;

}