/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.wra.stage.service.model.WraInspection;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing WraInspection in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class WraInspectionCacheModel
	implements CacheModel<WraInspection>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof WraInspectionCacheModel)) {
			return false;
		}

		WraInspectionCacheModel wraInspectionCacheModel =
			(WraInspectionCacheModel)object;

		if (wraInspectionId == wraInspectionCacheModel.wraInspectionId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, wraInspectionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{wraInspectionId=");
		sb.append(wraInspectionId);
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
		sb.append(", wraApplicationId=");
		sb.append(wraApplicationId);
		sb.append(", slotBookedByUser=");
		sb.append(slotBookedByUser);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public WraInspection toEntityModel() {
		WraInspectionImpl wraInspectionImpl = new WraInspectionImpl();

		wraInspectionImpl.setWraInspectionId(wraInspectionId);
		wraInspectionImpl.setGroupId(groupId);
		wraInspectionImpl.setCompanyId(companyId);
		wraInspectionImpl.setUserId(userId);

		if (userName == null) {
			wraInspectionImpl.setUserName("");
		}
		else {
			wraInspectionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			wraInspectionImpl.setCreateDate(null);
		}
		else {
			wraInspectionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			wraInspectionImpl.setModifiedDate(null);
		}
		else {
			wraInspectionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			wraInspectionImpl.setCaseId("");
		}
		else {
			wraInspectionImpl.setCaseId(caseId);
		}

		if (dateOfInspection == Long.MIN_VALUE) {
			wraInspectionImpl.setDateOfInspection(null);
		}
		else {
			wraInspectionImpl.setDateOfInspection(new Date(dateOfInspection));
		}

		if (timeOfInspection == null) {
			wraInspectionImpl.setTimeOfInspection("");
		}
		else {
			wraInspectionImpl.setTimeOfInspection(timeOfInspection);
		}

		if (location == null) {
			wraInspectionImpl.setLocation("");
		}
		else {
			wraInspectionImpl.setLocation(location);
		}

		if (status == null) {
			wraInspectionImpl.setStatus("");
		}
		else {
			wraInspectionImpl.setStatus(status);
		}

		wraInspectionImpl.setWraApplicationId(wraApplicationId);
		wraInspectionImpl.setSlotBookedByUser(slotBookedByUser);

		wraInspectionImpl.resetOriginalValues();

		return wraInspectionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		wraInspectionId = objectInput.readLong();

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

		wraApplicationId = objectInput.readLong();

		slotBookedByUser = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(wraInspectionId);

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

		objectOutput.writeLong(wraApplicationId);

		objectOutput.writeLong(slotBookedByUser);
	}

	public long wraInspectionId;
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
	public long wraApplicationId;
	public long slotBookedByUser;

}