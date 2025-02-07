/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncra.stages.services.model.NcraInspection;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcraInspection in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcraInspectionCacheModel
	implements CacheModel<NcraInspection>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcraInspectionCacheModel)) {
			return false;
		}

		NcraInspectionCacheModel ncraInspectionCacheModel =
			(NcraInspectionCacheModel)object;

		if (ncraInspectionId == ncraInspectionCacheModel.ncraInspectionId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncraInspectionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{ncraInspectionId=");
		sb.append(ncraInspectionId);
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
		sb.append(", ncraApplicationId=");
		sb.append(ncraApplicationId);
		sb.append(", slotBookedByUser=");
		sb.append(slotBookedByUser);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcraInspection toEntityModel() {
		NcraInspectionImpl ncraInspectionImpl = new NcraInspectionImpl();

		ncraInspectionImpl.setNcraInspectionId(ncraInspectionId);
		ncraInspectionImpl.setGroupId(groupId);
		ncraInspectionImpl.setCompanyId(companyId);
		ncraInspectionImpl.setUserId(userId);

		if (userName == null) {
			ncraInspectionImpl.setUserName("");
		}
		else {
			ncraInspectionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncraInspectionImpl.setCreateDate(null);
		}
		else {
			ncraInspectionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncraInspectionImpl.setModifiedDate(null);
		}
		else {
			ncraInspectionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			ncraInspectionImpl.setCaseId("");
		}
		else {
			ncraInspectionImpl.setCaseId(caseId);
		}

		if (dateOfInspection == Long.MIN_VALUE) {
			ncraInspectionImpl.setDateOfInspection(null);
		}
		else {
			ncraInspectionImpl.setDateOfInspection(new Date(dateOfInspection));
		}

		if (timeOfInspection == null) {
			ncraInspectionImpl.setTimeOfInspection("");
		}
		else {
			ncraInspectionImpl.setTimeOfInspection(timeOfInspection);
		}

		if (location == null) {
			ncraInspectionImpl.setLocation("");
		}
		else {
			ncraInspectionImpl.setLocation(location);
		}

		if (status == null) {
			ncraInspectionImpl.setStatus("");
		}
		else {
			ncraInspectionImpl.setStatus(status);
		}

		ncraInspectionImpl.setNcraApplicationId(ncraApplicationId);
		ncraInspectionImpl.setSlotBookedByUser(slotBookedByUser);

		ncraInspectionImpl.resetOriginalValues();

		return ncraInspectionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncraInspectionId = objectInput.readLong();

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

		ncraApplicationId = objectInput.readLong();

		slotBookedByUser = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ncraInspectionId);

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

		objectOutput.writeLong(ncraApplicationId);

		objectOutput.writeLong(slotBookedByUser);
	}

	public long ncraInspectionId;
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
	public long ncraApplicationId;
	public long slotBookedByUser;

}