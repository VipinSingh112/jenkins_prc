/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.fire.brigade.stage.service.model.FireBrigadeInspection;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FireBrigadeInspection in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FireBrigadeInspectionCacheModel
	implements CacheModel<FireBrigadeInspection>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FireBrigadeInspectionCacheModel)) {
			return false;
		}

		FireBrigadeInspectionCacheModel fireBrigadeInspectionCacheModel =
			(FireBrigadeInspectionCacheModel)object;

		if (fireBrigadeInspectionId ==
				fireBrigadeInspectionCacheModel.fireBrigadeInspectionId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fireBrigadeInspectionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{fireBrigadeInspectionId=");
		sb.append(fireBrigadeInspectionId);
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
		sb.append(", fireBrigadeApplicationId=");
		sb.append(fireBrigadeApplicationId);
		sb.append(", slotBookedByUser=");
		sb.append(slotBookedByUser);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FireBrigadeInspection toEntityModel() {
		FireBrigadeInspectionImpl fireBrigadeInspectionImpl =
			new FireBrigadeInspectionImpl();

		fireBrigadeInspectionImpl.setFireBrigadeInspectionId(
			fireBrigadeInspectionId);
		fireBrigadeInspectionImpl.setGroupId(groupId);
		fireBrigadeInspectionImpl.setCompanyId(companyId);
		fireBrigadeInspectionImpl.setUserId(userId);

		if (userName == null) {
			fireBrigadeInspectionImpl.setUserName("");
		}
		else {
			fireBrigadeInspectionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			fireBrigadeInspectionImpl.setCreateDate(null);
		}
		else {
			fireBrigadeInspectionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			fireBrigadeInspectionImpl.setModifiedDate(null);
		}
		else {
			fireBrigadeInspectionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			fireBrigadeInspectionImpl.setCaseId("");
		}
		else {
			fireBrigadeInspectionImpl.setCaseId(caseId);
		}

		if (dateOfInspection == Long.MIN_VALUE) {
			fireBrigadeInspectionImpl.setDateOfInspection(null);
		}
		else {
			fireBrigadeInspectionImpl.setDateOfInspection(
				new Date(dateOfInspection));
		}

		if (timeOfInspection == null) {
			fireBrigadeInspectionImpl.setTimeOfInspection("");
		}
		else {
			fireBrigadeInspectionImpl.setTimeOfInspection(timeOfInspection);
		}

		if (location == null) {
			fireBrigadeInspectionImpl.setLocation("");
		}
		else {
			fireBrigadeInspectionImpl.setLocation(location);
		}

		if (status == null) {
			fireBrigadeInspectionImpl.setStatus("");
		}
		else {
			fireBrigadeInspectionImpl.setStatus(status);
		}

		fireBrigadeInspectionImpl.setFireBrigadeApplicationId(
			fireBrigadeApplicationId);
		fireBrigadeInspectionImpl.setSlotBookedByUser(slotBookedByUser);

		fireBrigadeInspectionImpl.resetOriginalValues();

		return fireBrigadeInspectionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fireBrigadeInspectionId = objectInput.readLong();

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

		fireBrigadeApplicationId = objectInput.readLong();

		slotBookedByUser = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(fireBrigadeInspectionId);

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

		objectOutput.writeLong(fireBrigadeApplicationId);

		objectOutput.writeLong(slotBookedByUser);
	}

	public long fireBrigadeInspectionId;
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
	public long fireBrigadeApplicationId;
	public long slotBookedByUser;

}