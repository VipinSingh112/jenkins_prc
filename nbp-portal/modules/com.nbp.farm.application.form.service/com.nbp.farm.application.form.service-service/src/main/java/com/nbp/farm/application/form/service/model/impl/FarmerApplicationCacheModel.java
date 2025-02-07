/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.farm.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.farm.application.form.service.model.FarmerApplication;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FarmerApplication in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FarmerApplicationCacheModel
	implements CacheModel<FarmerApplication>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FarmerApplicationCacheModel)) {
			return false;
		}

		FarmerApplicationCacheModel farmerApplicationCacheModel =
			(FarmerApplicationCacheModel)object;

		if (farmerApplicationId ==
				farmerApplicationCacheModel.farmerApplicationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, farmerApplicationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{farmerApplicationId=");
		sb.append(farmerApplicationId);
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
		sb.append(", requestType=");
		sb.append(requestType);
		sb.append(", perishLocal=");
		sb.append(perishLocal);
		sb.append(", farmType=");
		sb.append(farmType);
		sb.append(", farmParishLocal=");
		sb.append(farmParishLocal);
		sb.append(", entityId=");
		sb.append(entityId);
		sb.append(", status=");
		sb.append(status);
		sb.append(", applicationNumber=");
		sb.append(applicationNumber);
		sb.append(", expiredLicenseappNumber=");
		sb.append(expiredLicenseappNumber);
		sb.append(", caseld=");
		sb.append(caseld);
		sb.append(", icmDocumentsPath=");
		sb.append(icmDocumentsPath);
		sb.append(", PdfFileEntryId=");
		sb.append(PdfFileEntryId);
		sb.append(", appCurrentStageName=");
		sb.append(appCurrentStageName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FarmerApplication toEntityModel() {
		FarmerApplicationImpl farmerApplicationImpl =
			new FarmerApplicationImpl();

		farmerApplicationImpl.setFarmerApplicationId(farmerApplicationId);
		farmerApplicationImpl.setGroupId(groupId);
		farmerApplicationImpl.setCompanyId(companyId);
		farmerApplicationImpl.setUserId(userId);

		if (userName == null) {
			farmerApplicationImpl.setUserName("");
		}
		else {
			farmerApplicationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			farmerApplicationImpl.setCreateDate(null);
		}
		else {
			farmerApplicationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			farmerApplicationImpl.setModifiedDate(null);
		}
		else {
			farmerApplicationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestType == null) {
			farmerApplicationImpl.setRequestType("");
		}
		else {
			farmerApplicationImpl.setRequestType(requestType);
		}

		if (perishLocal == null) {
			farmerApplicationImpl.setPerishLocal("");
		}
		else {
			farmerApplicationImpl.setPerishLocal(perishLocal);
		}

		if (farmType == null) {
			farmerApplicationImpl.setFarmType("");
		}
		else {
			farmerApplicationImpl.setFarmType(farmType);
		}

		if (farmParishLocal == null) {
			farmerApplicationImpl.setFarmParishLocal("");
		}
		else {
			farmerApplicationImpl.setFarmParishLocal(farmParishLocal);
		}

		if (entityId == null) {
			farmerApplicationImpl.setEntityId("");
		}
		else {
			farmerApplicationImpl.setEntityId(entityId);
		}

		farmerApplicationImpl.setStatus(status);

		if (applicationNumber == null) {
			farmerApplicationImpl.setApplicationNumber("");
		}
		else {
			farmerApplicationImpl.setApplicationNumber(applicationNumber);
		}

		if (expiredLicenseappNumber == null) {
			farmerApplicationImpl.setExpiredLicenseappNumber("");
		}
		else {
			farmerApplicationImpl.setExpiredLicenseappNumber(
				expiredLicenseappNumber);
		}

		if (caseld == null) {
			farmerApplicationImpl.setCaseld("");
		}
		else {
			farmerApplicationImpl.setCaseld(caseld);
		}

		if (icmDocumentsPath == null) {
			farmerApplicationImpl.setIcmDocumentsPath("");
		}
		else {
			farmerApplicationImpl.setIcmDocumentsPath(icmDocumentsPath);
		}

		farmerApplicationImpl.setPdfFileEntryId(PdfFileEntryId);

		if (appCurrentStageName == null) {
			farmerApplicationImpl.setAppCurrentStageName("");
		}
		else {
			farmerApplicationImpl.setAppCurrentStageName(appCurrentStageName);
		}

		farmerApplicationImpl.resetOriginalValues();

		return farmerApplicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		farmerApplicationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		requestType = objectInput.readUTF();
		perishLocal = objectInput.readUTF();
		farmType = objectInput.readUTF();
		farmParishLocal = objectInput.readUTF();
		entityId = objectInput.readUTF();

		status = objectInput.readInt();
		applicationNumber = objectInput.readUTF();
		expiredLicenseappNumber = objectInput.readUTF();
		caseld = objectInput.readUTF();
		icmDocumentsPath = objectInput.readUTF();

		PdfFileEntryId = objectInput.readLong();
		appCurrentStageName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(farmerApplicationId);

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

		if (requestType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(requestType);
		}

		if (perishLocal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(perishLocal);
		}

		if (farmType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(farmType);
		}

		if (farmParishLocal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(farmParishLocal);
		}

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

		if (expiredLicenseappNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expiredLicenseappNumber);
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

		objectOutput.writeLong(PdfFileEntryId);

		if (appCurrentStageName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appCurrentStageName);
		}
	}

	public long farmerApplicationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String requestType;
	public String perishLocal;
	public String farmType;
	public String farmParishLocal;
	public String entityId;
	public int status;
	public String applicationNumber;
	public String expiredLicenseappNumber;
	public String caseld;
	public String icmDocumentsPath;
	public long PdfFileEntryId;
	public String appCurrentStageName;

}