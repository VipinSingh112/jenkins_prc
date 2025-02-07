/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.stages.services.model.OsiInspection;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiInspection in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiInspectionCacheModel
	implements CacheModel<OsiInspection>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OsiInspectionCacheModel)) {
			return false;
		}

		OsiInspectionCacheModel osiInspectionCacheModel =
			(OsiInspectionCacheModel)object;

		if (osiInspectionId == osiInspectionCacheModel.osiInspectionId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiInspectionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{osiInspectionId=");
		sb.append(osiInspectionId);
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
		sb.append(", osiApplicationId=");
		sb.append(osiApplicationId);
		sb.append(", slotBookedByUser=");
		sb.append(slotBookedByUser);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OsiInspection toEntityModel() {
		OsiInspectionImpl osiInspectionImpl = new OsiInspectionImpl();

		osiInspectionImpl.setOsiInspectionId(osiInspectionId);
		osiInspectionImpl.setGroupId(groupId);
		osiInspectionImpl.setCompanyId(companyId);
		osiInspectionImpl.setUserId(userId);

		if (userName == null) {
			osiInspectionImpl.setUserName("");
		}
		else {
			osiInspectionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiInspectionImpl.setCreateDate(null);
		}
		else {
			osiInspectionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiInspectionImpl.setModifiedDate(null);
		}
		else {
			osiInspectionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			osiInspectionImpl.setCaseId("");
		}
		else {
			osiInspectionImpl.setCaseId(caseId);
		}

		if (dateOfInspection == Long.MIN_VALUE) {
			osiInspectionImpl.setDateOfInspection(null);
		}
		else {
			osiInspectionImpl.setDateOfInspection(new Date(dateOfInspection));
		}

		if (timeOfInspection == null) {
			osiInspectionImpl.setTimeOfInspection("");
		}
		else {
			osiInspectionImpl.setTimeOfInspection(timeOfInspection);
		}

		if (location == null) {
			osiInspectionImpl.setLocation("");
		}
		else {
			osiInspectionImpl.setLocation(location);
		}

		if (status == null) {
			osiInspectionImpl.setStatus("");
		}
		else {
			osiInspectionImpl.setStatus(status);
		}

		osiInspectionImpl.setOsiApplicationId(osiApplicationId);
		osiInspectionImpl.setSlotBookedByUser(slotBookedByUser);

		osiInspectionImpl.resetOriginalValues();

		return osiInspectionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		osiInspectionId = objectInput.readLong();

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

		osiApplicationId = objectInput.readLong();

		slotBookedByUser = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(osiInspectionId);

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

		objectOutput.writeLong(osiApplicationId);

		objectOutput.writeLong(slotBookedByUser);
	}

	public long osiInspectionId;
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
	public long osiApplicationId;
	public long slotBookedByUser;

}