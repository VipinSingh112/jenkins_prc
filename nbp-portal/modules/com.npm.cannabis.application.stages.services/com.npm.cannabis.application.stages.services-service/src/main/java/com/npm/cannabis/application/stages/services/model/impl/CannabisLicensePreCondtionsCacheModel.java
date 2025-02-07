/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.npm.cannabis.application.stages.services.model.CannabisLicensePreCondtions;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CannabisLicensePreCondtions in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CannabisLicensePreCondtionsCacheModel
	implements CacheModel<CannabisLicensePreCondtions>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CannabisLicensePreCondtionsCacheModel)) {
			return false;
		}

		CannabisLicensePreCondtionsCacheModel
			cannabisLicensePreCondtionsCacheModel =
				(CannabisLicensePreCondtionsCacheModel)object;

		if (cannabisPreconditionsId ==
				cannabisLicensePreCondtionsCacheModel.cannabisPreconditionsId) {

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
		StringBundler sb = new StringBundler(25);

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
		sb.append(", licenseType=");
		sb.append(licenseType);
		sb.append(", status=");
		sb.append(status);
		sb.append(", cannabisApplicationId=");
		sb.append(cannabisApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CannabisLicensePreCondtions toEntityModel() {
		CannabisLicensePreCondtionsImpl cannabisLicensePreCondtionsImpl =
			new CannabisLicensePreCondtionsImpl();

		cannabisLicensePreCondtionsImpl.setCannabisPreconditionsId(
			cannabisPreconditionsId);
		cannabisLicensePreCondtionsImpl.setGroupId(groupId);
		cannabisLicensePreCondtionsImpl.setCompanyId(companyId);
		cannabisLicensePreCondtionsImpl.setUserId(userId);

		if (userName == null) {
			cannabisLicensePreCondtionsImpl.setUserName("");
		}
		else {
			cannabisLicensePreCondtionsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			cannabisLicensePreCondtionsImpl.setCreateDate(null);
		}
		else {
			cannabisLicensePreCondtionsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cannabisLicensePreCondtionsImpl.setModifiedDate(null);
		}
		else {
			cannabisLicensePreCondtionsImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (caseId == null) {
			cannabisLicensePreCondtionsImpl.setCaseId("");
		}
		else {
			cannabisLicensePreCondtionsImpl.setCaseId(caseId);
		}

		if (precondition == null) {
			cannabisLicensePreCondtionsImpl.setPrecondition("");
		}
		else {
			cannabisLicensePreCondtionsImpl.setPrecondition(precondition);
		}

		if (licenseType == null) {
			cannabisLicensePreCondtionsImpl.setLicenseType("");
		}
		else {
			cannabisLicensePreCondtionsImpl.setLicenseType(licenseType);
		}

		if (status == null) {
			cannabisLicensePreCondtionsImpl.setStatus("");
		}
		else {
			cannabisLicensePreCondtionsImpl.setStatus(status);
		}

		cannabisLicensePreCondtionsImpl.setCannabisApplicationId(
			cannabisApplicationId);

		cannabisLicensePreCondtionsImpl.resetOriginalValues();

		return cannabisLicensePreCondtionsImpl;
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
		licenseType = objectInput.readUTF();
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

		if (licenseType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(licenseType);
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
	public String licenseType;
	public String status;
	public long cannabisApplicationId;

}