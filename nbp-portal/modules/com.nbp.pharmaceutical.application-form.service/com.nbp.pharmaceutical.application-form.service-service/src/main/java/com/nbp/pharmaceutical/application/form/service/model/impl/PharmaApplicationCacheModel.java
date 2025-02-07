/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.pharmaceutical.application.form.service.model.PharmaApplication;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PharmaApplication in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PharmaApplicationCacheModel
	implements CacheModel<PharmaApplication>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PharmaApplicationCacheModel)) {
			return false;
		}

		PharmaApplicationCacheModel pharmaApplicationCacheModel =
			(PharmaApplicationCacheModel)object;

		if (pharmaApplicationId ==
				pharmaApplicationCacheModel.pharmaApplicationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, pharmaApplicationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{pharmaApplicationId=");
		sb.append(pharmaApplicationId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", entityId=");
		sb.append(entityId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", requesttype=");
		sb.append(requesttype);
		sb.append(", typeOfPharmaProduct=");
		sb.append(typeOfPharmaProduct);
		sb.append(", typeOfPharmaDrug=");
		sb.append(typeOfPharmaDrug);
		sb.append(", secondaryCategory=");
		sb.append(secondaryCategory);
		sb.append(", typeOfProduct=");
		sb.append(typeOfProduct);
		sb.append(", subCategoryFirstField=");
		sb.append(subCategoryFirstField);
		sb.append(", subCategorySecondField=");
		sb.append(subCategorySecondField);
		sb.append(", status=");
		sb.append(status);
		sb.append(", applicationNumber=");
		sb.append(applicationNumber);
		sb.append(", caseld=");
		sb.append(caseld);
		sb.append(", icmDocumentsPath=");
		sb.append(icmDocumentsPath);
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
	public PharmaApplication toEntityModel() {
		PharmaApplicationImpl pharmaApplicationImpl =
			new PharmaApplicationImpl();

		pharmaApplicationImpl.setPharmaApplicationId(pharmaApplicationId);
		pharmaApplicationImpl.setGroupId(groupId);
		pharmaApplicationImpl.setCompanyId(companyId);
		pharmaApplicationImpl.setUserId(userId);

		if (userName == null) {
			pharmaApplicationImpl.setUserName("");
		}
		else {
			pharmaApplicationImpl.setUserName(userName);
		}

		if (entityId == null) {
			pharmaApplicationImpl.setEntityId("");
		}
		else {
			pharmaApplicationImpl.setEntityId(entityId);
		}

		if (createDate == Long.MIN_VALUE) {
			pharmaApplicationImpl.setCreateDate(null);
		}
		else {
			pharmaApplicationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			pharmaApplicationImpl.setModifiedDate(null);
		}
		else {
			pharmaApplicationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requesttype == null) {
			pharmaApplicationImpl.setRequesttype("");
		}
		else {
			pharmaApplicationImpl.setRequesttype(requesttype);
		}

		if (typeOfPharmaProduct == null) {
			pharmaApplicationImpl.setTypeOfPharmaProduct("");
		}
		else {
			pharmaApplicationImpl.setTypeOfPharmaProduct(typeOfPharmaProduct);
		}

		if (typeOfPharmaDrug == null) {
			pharmaApplicationImpl.setTypeOfPharmaDrug("");
		}
		else {
			pharmaApplicationImpl.setTypeOfPharmaDrug(typeOfPharmaDrug);
		}

		if (secondaryCategory == null) {
			pharmaApplicationImpl.setSecondaryCategory("");
		}
		else {
			pharmaApplicationImpl.setSecondaryCategory(secondaryCategory);
		}

		if (typeOfProduct == null) {
			pharmaApplicationImpl.setTypeOfProduct("");
		}
		else {
			pharmaApplicationImpl.setTypeOfProduct(typeOfProduct);
		}

		if (subCategoryFirstField == null) {
			pharmaApplicationImpl.setSubCategoryFirstField("");
		}
		else {
			pharmaApplicationImpl.setSubCategoryFirstField(
				subCategoryFirstField);
		}

		if (subCategorySecondField == null) {
			pharmaApplicationImpl.setSubCategorySecondField("");
		}
		else {
			pharmaApplicationImpl.setSubCategorySecondField(
				subCategorySecondField);
		}

		pharmaApplicationImpl.setStatus(status);

		if (applicationNumber == null) {
			pharmaApplicationImpl.setApplicationNumber("");
		}
		else {
			pharmaApplicationImpl.setApplicationNumber(applicationNumber);
		}

		if (caseld == null) {
			pharmaApplicationImpl.setCaseld("");
		}
		else {
			pharmaApplicationImpl.setCaseld(caseld);
		}

		if (icmDocumentsPath == null) {
			pharmaApplicationImpl.setIcmDocumentsPath("");
		}
		else {
			pharmaApplicationImpl.setIcmDocumentsPath(icmDocumentsPath);
		}

		pharmaApplicationImpl.setPdfFileEntryId(pdfFileEntryId);

		if (expiredLicenseAppNumber == null) {
			pharmaApplicationImpl.setExpiredLicenseAppNumber("");
		}
		else {
			pharmaApplicationImpl.setExpiredLicenseAppNumber(
				expiredLicenseAppNumber);
		}

		if (appCurrentStageName == null) {
			pharmaApplicationImpl.setAppCurrentStageName("");
		}
		else {
			pharmaApplicationImpl.setAppCurrentStageName(appCurrentStageName);
		}

		pharmaApplicationImpl.resetOriginalValues();

		return pharmaApplicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		pharmaApplicationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		entityId = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		requesttype = objectInput.readUTF();
		typeOfPharmaProduct = objectInput.readUTF();
		typeOfPharmaDrug = objectInput.readUTF();
		secondaryCategory = objectInput.readUTF();
		typeOfProduct = objectInput.readUTF();
		subCategoryFirstField = objectInput.readUTF();
		subCategorySecondField = objectInput.readUTF();

		status = objectInput.readInt();
		applicationNumber = objectInput.readUTF();
		caseld = objectInput.readUTF();
		icmDocumentsPath = objectInput.readUTF();

		pdfFileEntryId = objectInput.readLong();
		expiredLicenseAppNumber = objectInput.readUTF();
		appCurrentStageName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(pharmaApplicationId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		if (entityId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(entityId);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (requesttype == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(requesttype);
		}

		if (typeOfPharmaProduct == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfPharmaProduct);
		}

		if (typeOfPharmaDrug == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfPharmaDrug);
		}

		if (secondaryCategory == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secondaryCategory);
		}

		if (typeOfProduct == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfProduct);
		}

		if (subCategoryFirstField == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(subCategoryFirstField);
		}

		if (subCategorySecondField == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(subCategorySecondField);
		}

		objectOutput.writeInt(status);

		if (applicationNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicationNumber);
		}

		if (caseld == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseld);
		}

		if (icmDocumentsPath == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(icmDocumentsPath);
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

	public long pharmaApplicationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public String entityId;
	public long createDate;
	public long modifiedDate;
	public String requesttype;
	public String typeOfPharmaProduct;
	public String typeOfPharmaDrug;
	public String secondaryCategory;
	public String typeOfProduct;
	public String subCategoryFirstField;
	public String subCategorySecondField;
	public int status;
	public String applicationNumber;
	public String caseld;
	public String icmDocumentsPath;
	public long pdfFileEntryId;
	public String expiredLicenseAppNumber;
	public String appCurrentStageName;

}