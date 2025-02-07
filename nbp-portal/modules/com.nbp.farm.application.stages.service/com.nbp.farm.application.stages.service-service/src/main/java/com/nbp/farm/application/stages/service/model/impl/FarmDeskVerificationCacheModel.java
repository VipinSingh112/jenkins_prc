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

package com.nbp.farm.application.stages.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.farm.application.stages.service.model.FarmDeskVerification;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FarmDeskVerification in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FarmDeskVerificationCacheModel
	implements CacheModel<FarmDeskVerification>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FarmDeskVerificationCacheModel)) {
			return false;
		}

		FarmDeskVerificationCacheModel farmDeskVerificationCacheModel =
			(FarmDeskVerificationCacheModel)object;

		if (farmDeskVerificationId ==
				farmDeskVerificationCacheModel.farmDeskVerificationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, farmDeskVerificationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{farmDeskVerificationId=");
		sb.append(farmDeskVerificationId);
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
		sb.append(", farmerApplicationId=");
		sb.append(farmerApplicationId);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", documentStatus=");
		sb.append(documentStatus);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FarmDeskVerification toEntityModel() {
		FarmDeskVerificationImpl farmDeskVerificationImpl =
			new FarmDeskVerificationImpl();

		farmDeskVerificationImpl.setFarmDeskVerificationId(
			farmDeskVerificationId);
		farmDeskVerificationImpl.setGroupId(groupId);
		farmDeskVerificationImpl.setCompanyId(companyId);
		farmDeskVerificationImpl.setUserId(userId);

		if (userName == null) {
			farmDeskVerificationImpl.setUserName("");
		}
		else {
			farmDeskVerificationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			farmDeskVerificationImpl.setCreateDate(null);
		}
		else {
			farmDeskVerificationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			farmDeskVerificationImpl.setModifiedDate(null);
		}
		else {
			farmDeskVerificationImpl.setModifiedDate(new Date(modifiedDate));
		}

		farmDeskVerificationImpl.setFarmerApplicationId(farmerApplicationId);

		if (documentName == null) {
			farmDeskVerificationImpl.setDocumentName("");
		}
		else {
			farmDeskVerificationImpl.setDocumentName(documentName);
		}

		if (documentStatus == null) {
			farmDeskVerificationImpl.setDocumentStatus("");
		}
		else {
			farmDeskVerificationImpl.setDocumentStatus(documentStatus);
		}

		farmDeskVerificationImpl.resetOriginalValues();

		return farmDeskVerificationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		farmDeskVerificationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		farmerApplicationId = objectInput.readLong();
		documentName = objectInput.readUTF();
		documentStatus = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(farmDeskVerificationId);

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

		objectOutput.writeLong(farmerApplicationId);

		if (documentName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(documentName);
		}

		if (documentStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(documentStatus);
		}
	}

	public long farmDeskVerificationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long farmerApplicationId;
	public String documentName;
	public String documentStatus;

}