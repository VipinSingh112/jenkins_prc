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

package com.npm.cannabis.application.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.npm.cannabis.application.stages.services.model.CannabisDeskVerification;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CannabisDeskVerification in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CannabisDeskVerificationCacheModel
	implements CacheModel<CannabisDeskVerification>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CannabisDeskVerificationCacheModel)) {
			return false;
		}

		CannabisDeskVerificationCacheModel cannabisDeskVerificationCacheModel =
			(CannabisDeskVerificationCacheModel)object;

		if (cannabisDeskVerificationId ==
				cannabisDeskVerificationCacheModel.cannabisDeskVerificationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cannabisDeskVerificationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{cannabisDeskVerificationId=");
		sb.append(cannabisDeskVerificationId);
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
		sb.append(", cannabisApplicationId=");
		sb.append(cannabisApplicationId);
		sb.append(", documentStatus=");
		sb.append(documentStatus);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CannabisDeskVerification toEntityModel() {
		CannabisDeskVerificationImpl cannabisDeskVerificationImpl =
			new CannabisDeskVerificationImpl();

		cannabisDeskVerificationImpl.setCannabisDeskVerificationId(
			cannabisDeskVerificationId);
		cannabisDeskVerificationImpl.setGroupId(groupId);
		cannabisDeskVerificationImpl.setCompanyId(companyId);
		cannabisDeskVerificationImpl.setUserId(userId);

		if (userName == null) {
			cannabisDeskVerificationImpl.setUserName("");
		}
		else {
			cannabisDeskVerificationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			cannabisDeskVerificationImpl.setCreateDate(null);
		}
		else {
			cannabisDeskVerificationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cannabisDeskVerificationImpl.setModifiedDate(null);
		}
		else {
			cannabisDeskVerificationImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		cannabisDeskVerificationImpl.setCannabisApplicationId(
			cannabisApplicationId);

		if (documentStatus == null) {
			cannabisDeskVerificationImpl.setDocumentStatus("");
		}
		else {
			cannabisDeskVerificationImpl.setDocumentStatus(documentStatus);
		}

		if (documentName == null) {
			cannabisDeskVerificationImpl.setDocumentName("");
		}
		else {
			cannabisDeskVerificationImpl.setDocumentName(documentName);
		}

		cannabisDeskVerificationImpl.resetOriginalValues();

		return cannabisDeskVerificationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cannabisDeskVerificationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		cannabisApplicationId = objectInput.readLong();
		documentStatus = objectInput.readUTF();
		documentName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(cannabisDeskVerificationId);

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

		objectOutput.writeLong(cannabisApplicationId);

		if (documentStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(documentStatus);
		}

		if (documentName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(documentName);
		}
	}

	public long cannabisDeskVerificationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long cannabisApplicationId;
	public String documentStatus;
	public String documentName;

}