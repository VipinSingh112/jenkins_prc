/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.creative.stages.services.model.CreativeInspection;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CreativeInspection in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CreativeInspectionCacheModel
	implements CacheModel<CreativeInspection>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CreativeInspectionCacheModel)) {
			return false;
		}

		CreativeInspectionCacheModel creativeInspectionCacheModel =
			(CreativeInspectionCacheModel)object;

		if (creativeInspectionId ==
				creativeInspectionCacheModel.creativeInspectionId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, creativeInspectionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{creativeInspectionId=");
		sb.append(creativeInspectionId);
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
		sb.append(", dateOfInspection=");
		sb.append(dateOfInspection);
		sb.append(", timeOfInspection=");
		sb.append(timeOfInspection);
		sb.append(", location=");
		sb.append(location);
		sb.append(", updatedBySource=");
		sb.append(updatedBySource);
		sb.append(", status=");
		sb.append(status);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", creativeApplicationId=");
		sb.append(creativeApplicationId);
		sb.append(", slotBookedByUser=");
		sb.append(slotBookedByUser);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CreativeInspection toEntityModel() {
		CreativeInspectionImpl creativeInspectionImpl =
			new CreativeInspectionImpl();

		creativeInspectionImpl.setCreativeInspectionId(creativeInspectionId);
		creativeInspectionImpl.setGroupId(groupId);
		creativeInspectionImpl.setCompanyId(companyId);
		creativeInspectionImpl.setUserId(userId);

		if (userName == null) {
			creativeInspectionImpl.setUserName("");
		}
		else {
			creativeInspectionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			creativeInspectionImpl.setCreateDate(null);
		}
		else {
			creativeInspectionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			creativeInspectionImpl.setModifiedDate(null);
		}
		else {
			creativeInspectionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (dateOfInspection == Long.MIN_VALUE) {
			creativeInspectionImpl.setDateOfInspection(null);
		}
		else {
			creativeInspectionImpl.setDateOfInspection(
				new Date(dateOfInspection));
		}

		if (timeOfInspection == null) {
			creativeInspectionImpl.setTimeOfInspection("");
		}
		else {
			creativeInspectionImpl.setTimeOfInspection(timeOfInspection);
		}

		if (location == null) {
			creativeInspectionImpl.setLocation("");
		}
		else {
			creativeInspectionImpl.setLocation(location);
		}

		if (updatedBySource == null) {
			creativeInspectionImpl.setUpdatedBySource("");
		}
		else {
			creativeInspectionImpl.setUpdatedBySource(updatedBySource);
		}

		if (status == null) {
			creativeInspectionImpl.setStatus("");
		}
		else {
			creativeInspectionImpl.setStatus(status);
		}

		if (caseId == null) {
			creativeInspectionImpl.setCaseId("");
		}
		else {
			creativeInspectionImpl.setCaseId(caseId);
		}

		creativeInspectionImpl.setCreativeApplicationId(creativeApplicationId);
		creativeInspectionImpl.setSlotBookedByUser(slotBookedByUser);

		creativeInspectionImpl.resetOriginalValues();

		return creativeInspectionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		creativeInspectionId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		dateOfInspection = objectInput.readLong();
		timeOfInspection = objectInput.readUTF();
		location = objectInput.readUTF();
		updatedBySource = objectInput.readUTF();
		status = objectInput.readUTF();
		caseId = objectInput.readUTF();

		creativeApplicationId = objectInput.readLong();

		slotBookedByUser = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(creativeInspectionId);

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

		objectOutput.writeLong(creativeApplicationId);

		objectOutput.writeLong(slotBookedByUser);
	}

	public long creativeInspectionId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long dateOfInspection;
	public String timeOfInspection;
	public String location;
	public String updatedBySource;
	public String status;
	public String caseId;
	public long creativeApplicationId;
	public long slotBookedByUser;

}