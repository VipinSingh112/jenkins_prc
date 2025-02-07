/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.agriculture.stages.services.model.AgricultureInspection;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AgricultureInspection in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AgricultureInspectionCacheModel
	implements CacheModel<AgricultureInspection>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AgricultureInspectionCacheModel)) {
			return false;
		}

		AgricultureInspectionCacheModel agricultureInspectionCacheModel =
			(AgricultureInspectionCacheModel)object;

		if (agricultureInspectionId ==
				agricultureInspectionCacheModel.agricultureInspectionId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, agricultureInspectionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{agricultureInspectionId=");
		sb.append(agricultureInspectionId);
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
		sb.append(", agriApplicationId=");
		sb.append(agriApplicationId);
		sb.append(", slotBookedByUser=");
		sb.append(slotBookedByUser);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AgricultureInspection toEntityModel() {
		AgricultureInspectionImpl agricultureInspectionImpl =
			new AgricultureInspectionImpl();

		agricultureInspectionImpl.setAgricultureInspectionId(
			agricultureInspectionId);
		agricultureInspectionImpl.setGroupId(groupId);
		agricultureInspectionImpl.setCompanyId(companyId);
		agricultureInspectionImpl.setUserId(userId);

		if (userName == null) {
			agricultureInspectionImpl.setUserName("");
		}
		else {
			agricultureInspectionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			agricultureInspectionImpl.setCreateDate(null);
		}
		else {
			agricultureInspectionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			agricultureInspectionImpl.setModifiedDate(null);
		}
		else {
			agricultureInspectionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			agricultureInspectionImpl.setCaseId("");
		}
		else {
			agricultureInspectionImpl.setCaseId(caseId);
		}

		if (dateOfInspection == Long.MIN_VALUE) {
			agricultureInspectionImpl.setDateOfInspection(null);
		}
		else {
			agricultureInspectionImpl.setDateOfInspection(
				new Date(dateOfInspection));
		}

		if (insectionDateRange == null) {
			agricultureInspectionImpl.setInsectionDateRange("");
		}
		else {
			agricultureInspectionImpl.setInsectionDateRange(insectionDateRange);
		}

		if (invities == null) {
			agricultureInspectionImpl.setInvities("");
		}
		else {
			agricultureInspectionImpl.setInvities(invities);
		}

		if (location == null) {
			agricultureInspectionImpl.setLocation("");
		}
		else {
			agricultureInspectionImpl.setLocation(location);
		}

		if (updatedBySource == null) {
			agricultureInspectionImpl.setUpdatedBySource("");
		}
		else {
			agricultureInspectionImpl.setUpdatedBySource(updatedBySource);
		}

		if (status == null) {
			agricultureInspectionImpl.setStatus("");
		}
		else {
			agricultureInspectionImpl.setStatus(status);
		}

		agricultureInspectionImpl.setAgriApplicationId(agriApplicationId);
		agricultureInspectionImpl.setSlotBookedByUser(slotBookedByUser);

		agricultureInspectionImpl.resetOriginalValues();

		return agricultureInspectionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		agricultureInspectionId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		dateOfInspection = objectInput.readLong();
		insectionDateRange = objectInput.readUTF();
		invities = objectInput.readUTF();
		location = objectInput.readUTF();
		updatedBySource = objectInput.readUTF();
		status = objectInput.readUTF();

		agriApplicationId = objectInput.readLong();

		slotBookedByUser = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(agricultureInspectionId);

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

		objectOutput.writeLong(agriApplicationId);

		objectOutput.writeLong(slotBookedByUser);
	}

	public long agricultureInspectionId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public long dateOfInspection;
	public String insectionDateRange;
	public String invities;
	public String location;
	public String updatedBySource;
	public String status;
	public long agriApplicationId;
	public long slotBookedByUser;

}