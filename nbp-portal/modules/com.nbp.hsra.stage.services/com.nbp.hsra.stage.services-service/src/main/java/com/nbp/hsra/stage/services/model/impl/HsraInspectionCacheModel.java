/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.stage.services.model.HsraInspection;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing HsraInspection in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HsraInspectionCacheModel
	implements CacheModel<HsraInspection>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof HsraInspectionCacheModel)) {
			return false;
		}

		HsraInspectionCacheModel hsraInspectionCacheModel =
			(HsraInspectionCacheModel)object;

		if (hsraInspectionId == hsraInspectionCacheModel.hsraInspectionId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, hsraInspectionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{hsraInspectionId=");
		sb.append(hsraInspectionId);
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
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append(", slotBookedByUser=");
		sb.append(slotBookedByUser);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public HsraInspection toEntityModel() {
		HsraInspectionImpl hsraInspectionImpl = new HsraInspectionImpl();

		hsraInspectionImpl.setHsraInspectionId(hsraInspectionId);
		hsraInspectionImpl.setGroupId(groupId);
		hsraInspectionImpl.setCompanyId(companyId);
		hsraInspectionImpl.setUserId(userId);

		if (userName == null) {
			hsraInspectionImpl.setUserName("");
		}
		else {
			hsraInspectionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			hsraInspectionImpl.setCreateDate(null);
		}
		else {
			hsraInspectionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			hsraInspectionImpl.setModifiedDate(null);
		}
		else {
			hsraInspectionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			hsraInspectionImpl.setCaseId("");
		}
		else {
			hsraInspectionImpl.setCaseId(caseId);
		}

		if (dateOfInspection == Long.MIN_VALUE) {
			hsraInspectionImpl.setDateOfInspection(null);
		}
		else {
			hsraInspectionImpl.setDateOfInspection(new Date(dateOfInspection));
		}

		if (timeOfInspection == null) {
			hsraInspectionImpl.setTimeOfInspection("");
		}
		else {
			hsraInspectionImpl.setTimeOfInspection(timeOfInspection);
		}

		if (location == null) {
			hsraInspectionImpl.setLocation("");
		}
		else {
			hsraInspectionImpl.setLocation(location);
		}

		if (status == null) {
			hsraInspectionImpl.setStatus("");
		}
		else {
			hsraInspectionImpl.setStatus(status);
		}

		hsraInspectionImpl.setHsraApplicationId(hsraApplicationId);
		hsraInspectionImpl.setSlotBookedByUser(slotBookedByUser);

		hsraInspectionImpl.resetOriginalValues();

		return hsraInspectionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		hsraInspectionId = objectInput.readLong();

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

		hsraApplicationId = objectInput.readLong();

		slotBookedByUser = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(hsraInspectionId);

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

		objectOutput.writeLong(hsraApplicationId);

		objectOutput.writeLong(slotBookedByUser);
	}

	public long hsraInspectionId;
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
	public long hsraApplicationId;
	public long slotBookedByUser;

}