/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.farm.application.stages.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.farm.application.stages.service.model.FarmInspection;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FarmInspection in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FarmInspectionCacheModel
	implements CacheModel<FarmInspection>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FarmInspectionCacheModel)) {
			return false;
		}

		FarmInspectionCacheModel farmInspectionCacheModel =
			(FarmInspectionCacheModel)object;

		if (farmInspectionId == farmInspectionCacheModel.farmInspectionId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, farmInspectionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{farmInspectionId=");
		sb.append(farmInspectionId);
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
		sb.append(", farmApplicationId=");
		sb.append(farmApplicationId);
		sb.append(", slotBookedByUser=");
		sb.append(slotBookedByUser);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FarmInspection toEntityModel() {
		FarmInspectionImpl farmInspectionImpl = new FarmInspectionImpl();

		farmInspectionImpl.setFarmInspectionId(farmInspectionId);
		farmInspectionImpl.setGroupId(groupId);
		farmInspectionImpl.setCompanyId(companyId);
		farmInspectionImpl.setUserId(userId);

		if (userName == null) {
			farmInspectionImpl.setUserName("");
		}
		else {
			farmInspectionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			farmInspectionImpl.setCreateDate(null);
		}
		else {
			farmInspectionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			farmInspectionImpl.setModifiedDate(null);
		}
		else {
			farmInspectionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (inspectionDate == Long.MIN_VALUE) {
			farmInspectionImpl.setInspectionDate(null);
		}
		else {
			farmInspectionImpl.setInspectionDate(new Date(inspectionDate));
		}

		if (insectionDateRange == null) {
			farmInspectionImpl.setInsectionDateRange("");
		}
		else {
			farmInspectionImpl.setInsectionDateRange(insectionDateRange);
		}

		if (invities == null) {
			farmInspectionImpl.setInvities("");
		}
		else {
			farmInspectionImpl.setInvities(invities);
		}

		if (location == null) {
			farmInspectionImpl.setLocation("");
		}
		else {
			farmInspectionImpl.setLocation(location);
		}

		if (updatedBySource == null) {
			farmInspectionImpl.setUpdatedBySource("");
		}
		else {
			farmInspectionImpl.setUpdatedBySource(updatedBySource);
		}

		if (status == null) {
			farmInspectionImpl.setStatus("");
		}
		else {
			farmInspectionImpl.setStatus(status);
		}

		if (caseId == null) {
			farmInspectionImpl.setCaseId("");
		}
		else {
			farmInspectionImpl.setCaseId(caseId);
		}

		farmInspectionImpl.setFarmApplicationId(farmApplicationId);
		farmInspectionImpl.setSlotBookedByUser(slotBookedByUser);

		farmInspectionImpl.resetOriginalValues();

		return farmInspectionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		farmInspectionId = objectInput.readLong();

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

		farmApplicationId = objectInput.readLong();

		slotBookedByUser = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(farmInspectionId);

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

		objectOutput.writeLong(farmApplicationId);

		objectOutput.writeLong(slotBookedByUser);
	}

	public long farmInspectionId;
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
	public long farmApplicationId;
	public long slotBookedByUser;

}