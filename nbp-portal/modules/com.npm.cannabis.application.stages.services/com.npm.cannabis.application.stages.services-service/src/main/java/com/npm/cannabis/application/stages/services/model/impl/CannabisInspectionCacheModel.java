/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.npm.cannabis.application.stages.services.model.CannabisInspection;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CannabisInspection in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CannabisInspectionCacheModel
	implements CacheModel<CannabisInspection>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CannabisInspectionCacheModel)) {
			return false;
		}

		CannabisInspectionCacheModel cannabisInspectionCacheModel =
			(CannabisInspectionCacheModel)object;

		if (cannabisInspectionId ==
				cannabisInspectionCacheModel.cannabisInspectionId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cannabisInspectionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{cannabisInspectionId=");
		sb.append(cannabisInspectionId);
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
		sb.append(", inspectionDate=");
		sb.append(inspectionDate);
		sb.append(", insectionDateRange=");
		sb.append(insectionDateRange);
		sb.append(", invities=");
		sb.append(invities);
		sb.append(", location=");
		sb.append(location);
		sb.append(", updatedBySource=");
		sb.append(updatedBySource);
		sb.append(", status=");
		sb.append(status);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", cannabisApplicationId=");
		sb.append(cannabisApplicationId);
		sb.append(", slotBookedByUser=");
		sb.append(slotBookedByUser);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CannabisInspection toEntityModel() {
		CannabisInspectionImpl cannabisInspectionImpl =
			new CannabisInspectionImpl();

		cannabisInspectionImpl.setCannabisInspectionId(cannabisInspectionId);
		cannabisInspectionImpl.setGroupId(groupId);
		cannabisInspectionImpl.setCompanyId(companyId);
		cannabisInspectionImpl.setUserId(userId);

		if (userName == null) {
			cannabisInspectionImpl.setUserName("");
		}
		else {
			cannabisInspectionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			cannabisInspectionImpl.setCreateDate(null);
		}
		else {
			cannabisInspectionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cannabisInspectionImpl.setModifiedDate(null);
		}
		else {
			cannabisInspectionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (inspectionDate == Long.MIN_VALUE) {
			cannabisInspectionImpl.setInspectionDate(null);
		}
		else {
			cannabisInspectionImpl.setInspectionDate(new Date(inspectionDate));
		}

		if (insectionDateRange == null) {
			cannabisInspectionImpl.setInsectionDateRange("");
		}
		else {
			cannabisInspectionImpl.setInsectionDateRange(insectionDateRange);
		}

		if (invities == null) {
			cannabisInspectionImpl.setInvities("");
		}
		else {
			cannabisInspectionImpl.setInvities(invities);
		}

		if (location == null) {
			cannabisInspectionImpl.setLocation("");
		}
		else {
			cannabisInspectionImpl.setLocation(location);
		}

		if (updatedBySource == null) {
			cannabisInspectionImpl.setUpdatedBySource("");
		}
		else {
			cannabisInspectionImpl.setUpdatedBySource(updatedBySource);
		}

		if (status == null) {
			cannabisInspectionImpl.setStatus("");
		}
		else {
			cannabisInspectionImpl.setStatus(status);
		}

		if (caseId == null) {
			cannabisInspectionImpl.setCaseId("");
		}
		else {
			cannabisInspectionImpl.setCaseId(caseId);
		}

		cannabisInspectionImpl.setCannabisApplicationId(cannabisApplicationId);
		cannabisInspectionImpl.setSlotBookedByUser(slotBookedByUser);

		cannabisInspectionImpl.resetOriginalValues();

		return cannabisInspectionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cannabisInspectionId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		inspectionDate = objectInput.readLong();
		insectionDateRange = objectInput.readUTF();
		invities = objectInput.readUTF();
		location = objectInput.readUTF();
		updatedBySource = objectInput.readUTF();
		status = objectInput.readUTF();
		caseId = objectInput.readUTF();

		cannabisApplicationId = objectInput.readLong();

		slotBookedByUser = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(cannabisInspectionId);

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
		objectOutput.writeLong(inspectionDate);

		if (insectionDateRange == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insectionDateRange);
		}

		if (invities == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(invities);
		}

		if (location == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(location);
		}

		if (updatedBySource == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(updatedBySource);
		}

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		objectOutput.writeLong(cannabisApplicationId);

		objectOutput.writeLong(slotBookedByUser);
	}

	public long cannabisInspectionId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long inspectionDate;
	public String insectionDateRange;
	public String invities;
	public String location;
	public String updatedBySource;
	public String status;
	public String caseId;
	public long cannabisApplicationId;
	public long slotBookedByUser;

}