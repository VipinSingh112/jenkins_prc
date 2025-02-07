/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismApplication;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismApplication in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismApplicationCacheModel
	implements CacheModel<TourismApplication>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismApplicationCacheModel)) {
			return false;
		}

		TourismApplicationCacheModel tourismApplicationCacheModel =
			(TourismApplicationCacheModel)object;

		if (tourismApplicationId ==
				tourismApplicationCacheModel.tourismApplicationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismApplicationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{tourismApplicationId=");
		sb.append(tourismApplicationId);
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
		sb.append(", requestType=");
		sb.append(requestType);
		sb.append(", requestTypeTwo=");
		sb.append(requestTypeTwo);
		sb.append(", licenseCategory=");
		sb.append(licenseCategory);
		sb.append(", licenseSubCategory=");
		sb.append(licenseSubCategory);
		sb.append(", status=");
		sb.append(status);
		sb.append(", applicationNumber=");
		sb.append(applicationNumber);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", icmDocumentsPath=");
		sb.append(icmDocumentsPath);
		sb.append(", pdfFileEntryId=");
		sb.append(pdfFileEntryId);
		sb.append(", appCurrentStageName=");
		sb.append(appCurrentStageName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismApplication toEntityModel() {
		TourismApplicationImpl tourismApplicationImpl =
			new TourismApplicationImpl();

		tourismApplicationImpl.setTourismApplicationId(tourismApplicationId);
		tourismApplicationImpl.setGroupId(groupId);
		tourismApplicationImpl.setCompanyId(companyId);
		tourismApplicationImpl.setUserId(userId);

		if (userName == null) {
			tourismApplicationImpl.setUserName("");
		}
		else {
			tourismApplicationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismApplicationImpl.setCreateDate(null);
		}
		else {
			tourismApplicationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismApplicationImpl.setModifiedDate(null);
		}
		else {
			tourismApplicationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (entityId == null) {
			tourismApplicationImpl.setEntityId("");
		}
		else {
			tourismApplicationImpl.setEntityId(entityId);
		}

		if (requestType == null) {
			tourismApplicationImpl.setRequestType("");
		}
		else {
			tourismApplicationImpl.setRequestType(requestType);
		}

		if (requestTypeTwo == null) {
			tourismApplicationImpl.setRequestTypeTwo("");
		}
		else {
			tourismApplicationImpl.setRequestTypeTwo(requestTypeTwo);
		}

		if (licenseCategory == null) {
			tourismApplicationImpl.setLicenseCategory("");
		}
		else {
			tourismApplicationImpl.setLicenseCategory(licenseCategory);
		}

		if (licenseSubCategory == null) {
			tourismApplicationImpl.setLicenseSubCategory("");
		}
		else {
			tourismApplicationImpl.setLicenseSubCategory(licenseSubCategory);
		}

		tourismApplicationImpl.setStatus(status);

		if (applicationNumber == null) {
			tourismApplicationImpl.setApplicationNumber("");
		}
		else {
			tourismApplicationImpl.setApplicationNumber(applicationNumber);
		}

		if (caseId == null) {
			tourismApplicationImpl.setCaseId("");
		}
		else {
			tourismApplicationImpl.setCaseId(caseId);
		}

		if (icmDocumentsPath == null) {
			tourismApplicationImpl.setIcmDocumentsPath("");
		}
		else {
			tourismApplicationImpl.setIcmDocumentsPath(icmDocumentsPath);
		}

		tourismApplicationImpl.setPdfFileEntryId(pdfFileEntryId);

		if (appCurrentStageName == null) {
			tourismApplicationImpl.setAppCurrentStageName("");
		}
		else {
			tourismApplicationImpl.setAppCurrentStageName(appCurrentStageName);
		}

		tourismApplicationImpl.resetOriginalValues();

		return tourismApplicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismApplicationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		entityId = objectInput.readUTF();
		requestType = objectInput.readUTF();
		requestTypeTwo = objectInput.readUTF();
		licenseCategory = objectInput.readUTF();
		licenseSubCategory = objectInput.readUTF();

		status = objectInput.readInt();
		applicationNumber = objectInput.readUTF();
		caseId = objectInput.readUTF();
		icmDocumentsPath = objectInput.readUTF();

		pdfFileEntryId = objectInput.readLong();
		appCurrentStageName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismApplicationId);

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

		if (requestType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(requestType);
		}

		if (requestTypeTwo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(requestTypeTwo);
		}

		if (licenseCategory == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(licenseCategory);
		}

		if (licenseSubCategory == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(licenseSubCategory);
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
	}

	public long tourismApplicationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String entityId;
	public String requestType;
	public String requestTypeTwo;
	public String licenseCategory;
	public String licenseSubCategory;
	public int status;
	public String applicationNumber;
	public String caseId;
	public String icmDocumentsPath;
	public long pdfFileEntryId;
	public String appCurrentStageName;

}