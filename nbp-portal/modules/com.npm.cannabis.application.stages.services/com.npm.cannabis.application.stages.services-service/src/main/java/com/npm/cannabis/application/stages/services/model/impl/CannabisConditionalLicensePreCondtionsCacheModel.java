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

import com.npm.cannabis.application.stages.services.model.CannabisConditionalLicensePreCondtions;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CannabisConditionalLicensePreCondtions in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CannabisConditionalLicensePreCondtionsCacheModel
	implements CacheModel<CannabisConditionalLicensePreCondtions>,
			   Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof
				CannabisConditionalLicensePreCondtionsCacheModel)) {

			return false;
		}

		CannabisConditionalLicensePreCondtionsCacheModel
			cannabisConditionalLicensePreCondtionsCacheModel =
				(CannabisConditionalLicensePreCondtionsCacheModel)object;

		if (cannabisPreconditionsId ==
				cannabisConditionalLicensePreCondtionsCacheModel.
					cannabisPreconditionsId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cannabisPreconditionsId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{cannabisPreconditionsId=");
		sb.append(cannabisPreconditionsId);
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
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", precondition=");
		sb.append(precondition);
		sb.append(", status=");
		sb.append(status);
		sb.append(", cannabisApplicationId=");
		sb.append(cannabisApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CannabisConditionalLicensePreCondtions toEntityModel() {
		CannabisConditionalLicensePreCondtionsImpl
			cannabisConditionalLicensePreCondtionsImpl =
				new CannabisConditionalLicensePreCondtionsImpl();

		cannabisConditionalLicensePreCondtionsImpl.setCannabisPreconditionsId(
			cannabisPreconditionsId);
		cannabisConditionalLicensePreCondtionsImpl.setGroupId(groupId);
		cannabisConditionalLicensePreCondtionsImpl.setCompanyId(companyId);
		cannabisConditionalLicensePreCondtionsImpl.setUserId(userId);

		if (userName == null) {
			cannabisConditionalLicensePreCondtionsImpl.setUserName("");
		}
		else {
			cannabisConditionalLicensePreCondtionsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			cannabisConditionalLicensePreCondtionsImpl.setCreateDate(null);
		}
		else {
			cannabisConditionalLicensePreCondtionsImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cannabisConditionalLicensePreCondtionsImpl.setModifiedDate(null);
		}
		else {
			cannabisConditionalLicensePreCondtionsImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (caseId == null) {
			cannabisConditionalLicensePreCondtionsImpl.setCaseId("");
		}
		else {
			cannabisConditionalLicensePreCondtionsImpl.setCaseId(caseId);
		}

		if (precondition == null) {
			cannabisConditionalLicensePreCondtionsImpl.setPrecondition("");
		}
		else {
			cannabisConditionalLicensePreCondtionsImpl.setPrecondition(
				precondition);
		}

		if (status == null) {
			cannabisConditionalLicensePreCondtionsImpl.setStatus("");
		}
		else {
			cannabisConditionalLicensePreCondtionsImpl.setStatus(status);
		}

		cannabisConditionalLicensePreCondtionsImpl.setCannabisApplicationId(
			cannabisApplicationId);

		cannabisConditionalLicensePreCondtionsImpl.resetOriginalValues();

		return cannabisConditionalLicensePreCondtionsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cannabisPreconditionsId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		precondition = objectInput.readUTF();
		status = objectInput.readUTF();

		cannabisApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(cannabisPreconditionsId);

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

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		if (precondition == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(precondition);
		}

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}

		objectOutput.writeLong(cannabisApplicationId);
	}

	public long cannabisPreconditionsId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public String precondition;
	public String status;
	public long cannabisApplicationId;

}