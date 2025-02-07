/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.manufacturing.application.stages.services.model.ManuInspection;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ManuInspection in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ManuInspectionCacheModel
	implements CacheModel<ManuInspection>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ManuInspectionCacheModel)) {
			return false;
		}

		ManuInspectionCacheModel manuInspectionCacheModel =
			(ManuInspectionCacheModel)object;

		if (manuInspectionId == manuInspectionCacheModel.manuInspectionId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, manuInspectionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{manuInspectionId=");
		sb.append(manuInspectionId);
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
		sb.append(", manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);
		sb.append(", slotBookedByUser=");
		sb.append(slotBookedByUser);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ManuInspection toEntityModel() {
		ManuInspectionImpl manuInspectionImpl = new ManuInspectionImpl();

		manuInspectionImpl.setManuInspectionId(manuInspectionId);
		manuInspectionImpl.setGroupId(groupId);
		manuInspectionImpl.setCompanyId(companyId);
		manuInspectionImpl.setUserId(userId);

		if (userName == null) {
			manuInspectionImpl.setUserName("");
		}
		else {
			manuInspectionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			manuInspectionImpl.setCreateDate(null);
		}
		else {
			manuInspectionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			manuInspectionImpl.setModifiedDate(null);
		}
		else {
			manuInspectionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			manuInspectionImpl.setCaseId("");
		}
		else {
			manuInspectionImpl.setCaseId(caseId);
		}

		if (dateOfInspection == Long.MIN_VALUE) {
			manuInspectionImpl.setDateOfInspection(null);
		}
		else {
			manuInspectionImpl.setDateOfInspection(new Date(dateOfInspection));
		}

		if (timeOfInspection == null) {
			manuInspectionImpl.setTimeOfInspection("");
		}
		else {
			manuInspectionImpl.setTimeOfInspection(timeOfInspection);
		}

		if (location == null) {
			manuInspectionImpl.setLocation("");
		}
		else {
			manuInspectionImpl.setLocation(location);
		}

		if (status == null) {
			manuInspectionImpl.setStatus("");
		}
		else {
			manuInspectionImpl.setStatus(status);
		}

		manuInspectionImpl.setManufacturingApplicationId(
			manufacturingApplicationId);
		manuInspectionImpl.setSlotBookedByUser(slotBookedByUser);

		manuInspectionImpl.resetOriginalValues();

		return manuInspectionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		manuInspectionId = objectInput.readLong();

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

		manufacturingApplicationId = objectInput.readLong();

		slotBookedByUser = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(manuInspectionId);

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

		objectOutput.writeLong(manufacturingApplicationId);

		objectOutput.writeLong(slotBookedByUser);
	}

	public long manuInspectionId;
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
	public long manufacturingApplicationId;
	public long slotBookedByUser;

}