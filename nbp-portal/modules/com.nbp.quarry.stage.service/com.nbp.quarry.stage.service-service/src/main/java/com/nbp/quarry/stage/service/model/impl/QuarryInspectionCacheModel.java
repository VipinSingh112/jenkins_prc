/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.quarry.stage.service.model.QuarryInspection;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QuarryInspection in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class QuarryInspectionCacheModel
	implements CacheModel<QuarryInspection>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof QuarryInspectionCacheModel)) {
			return false;
		}

		QuarryInspectionCacheModel quarryInspectionCacheModel =
			(QuarryInspectionCacheModel)object;

		if (quarryInspectionId ==
				quarryInspectionCacheModel.quarryInspectionId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, quarryInspectionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{quarryInspectionId=");
		sb.append(quarryInspectionId);
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
		sb.append(", quarryApplicationId=");
		sb.append(quarryApplicationId);
		sb.append(", slotBookedByUser=");
		sb.append(slotBookedByUser);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QuarryInspection toEntityModel() {
		QuarryInspectionImpl quarryInspectionImpl = new QuarryInspectionImpl();

		quarryInspectionImpl.setQuarryInspectionId(quarryInspectionId);
		quarryInspectionImpl.setGroupId(groupId);
		quarryInspectionImpl.setCompanyId(companyId);
		quarryInspectionImpl.setUserId(userId);

		if (userName == null) {
			quarryInspectionImpl.setUserName("");
		}
		else {
			quarryInspectionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			quarryInspectionImpl.setCreateDate(null);
		}
		else {
			quarryInspectionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			quarryInspectionImpl.setModifiedDate(null);
		}
		else {
			quarryInspectionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			quarryInspectionImpl.setCaseId("");
		}
		else {
			quarryInspectionImpl.setCaseId(caseId);
		}

		if (dateOfInspection == Long.MIN_VALUE) {
			quarryInspectionImpl.setDateOfInspection(null);
		}
		else {
			quarryInspectionImpl.setDateOfInspection(
				new Date(dateOfInspection));
		}

		if (timeOfInspection == null) {
			quarryInspectionImpl.setTimeOfInspection("");
		}
		else {
			quarryInspectionImpl.setTimeOfInspection(timeOfInspection);
		}

		if (location == null) {
			quarryInspectionImpl.setLocation("");
		}
		else {
			quarryInspectionImpl.setLocation(location);
		}

		if (status == null) {
			quarryInspectionImpl.setStatus("");
		}
		else {
			quarryInspectionImpl.setStatus(status);
		}

		quarryInspectionImpl.setQuarryApplicationId(quarryApplicationId);
		quarryInspectionImpl.setSlotBookedByUser(slotBookedByUser);

		quarryInspectionImpl.resetOriginalValues();

		return quarryInspectionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		quarryInspectionId = objectInput.readLong();

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

		quarryApplicationId = objectInput.readLong();

		slotBookedByUser = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(quarryInspectionId);

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

		objectOutput.writeLong(quarryApplicationId);

		objectOutput.writeLong(slotBookedByUser);
	}

	public long quarryInspectionId;
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
	public long quarryApplicationId;
	public long slotBookedByUser;

}