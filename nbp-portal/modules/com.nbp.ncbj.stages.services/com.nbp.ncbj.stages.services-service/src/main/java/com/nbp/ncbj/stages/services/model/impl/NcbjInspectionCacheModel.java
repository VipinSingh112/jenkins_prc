/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncbj.stages.services.model.NcbjInspection;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcbjInspection in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcbjInspectionCacheModel
	implements CacheModel<NcbjInspection>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcbjInspectionCacheModel)) {
			return false;
		}

		NcbjInspectionCacheModel ncbjInspectionCacheModel =
			(NcbjInspectionCacheModel)object;

		if (ncbjInspectionId == ncbjInspectionCacheModel.ncbjInspectionId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncbjInspectionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{ncbjInspectionId=");
		sb.append(ncbjInspectionId);
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
		sb.append(", dateOfInspection=");
		sb.append(dateOfInspection);
		sb.append(", timeOfInspection=");
		sb.append(timeOfInspection);
		sb.append(", location=");
		sb.append(location);
		sb.append(", status=");
		sb.append(status);
		sb.append(", ncbjApplicationId=");
		sb.append(ncbjApplicationId);
		sb.append(", slotBookedByUser=");
		sb.append(slotBookedByUser);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcbjInspection toEntityModel() {
		NcbjInspectionImpl ncbjInspectionImpl = new NcbjInspectionImpl();

		ncbjInspectionImpl.setNcbjInspectionId(ncbjInspectionId);
		ncbjInspectionImpl.setGroupId(groupId);
		ncbjInspectionImpl.setCompanyId(companyId);
		ncbjInspectionImpl.setUserId(userId);

		if (userName == null) {
			ncbjInspectionImpl.setUserName("");
		}
		else {
			ncbjInspectionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncbjInspectionImpl.setCreateDate(null);
		}
		else {
			ncbjInspectionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncbjInspectionImpl.setModifiedDate(null);
		}
		else {
			ncbjInspectionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			ncbjInspectionImpl.setCaseId("");
		}
		else {
			ncbjInspectionImpl.setCaseId(caseId);
		}

		if (dateOfInspection == Long.MIN_VALUE) {
			ncbjInspectionImpl.setDateOfInspection(null);
		}
		else {
			ncbjInspectionImpl.setDateOfInspection(new Date(dateOfInspection));
		}

		if (timeOfInspection == null) {
			ncbjInspectionImpl.setTimeOfInspection("");
		}
		else {
			ncbjInspectionImpl.setTimeOfInspection(timeOfInspection);
		}

		if (location == null) {
			ncbjInspectionImpl.setLocation("");
		}
		else {
			ncbjInspectionImpl.setLocation(location);
		}

		if (status == null) {
			ncbjInspectionImpl.setStatus("");
		}
		else {
			ncbjInspectionImpl.setStatus(status);
		}

		ncbjInspectionImpl.setNcbjApplicationId(ncbjApplicationId);
		ncbjInspectionImpl.setSlotBookedByUser(slotBookedByUser);

		ncbjInspectionImpl.resetOriginalValues();

		return ncbjInspectionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncbjInspectionId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		dateOfInspection = objectInput.readLong();
		timeOfInspection = objectInput.readUTF();
		location = objectInput.readUTF();
		status = objectInput.readUTF();

		ncbjApplicationId = objectInput.readLong();

		slotBookedByUser = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ncbjInspectionId);

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

		objectOutput.writeLong(dateOfInspection);

		if (timeOfInspection == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(timeOfInspection);
		}

		if (location == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(location);
		}

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}

		objectOutput.writeLong(ncbjApplicationId);

		objectOutput.writeLong(slotBookedByUser);
	}

	public long ncbjInspectionId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public long dateOfInspection;
	public String timeOfInspection;
	public String location;
	public String status;
	public long ncbjApplicationId;
	public long slotBookedByUser;

}