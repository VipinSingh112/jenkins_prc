/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.stage.services.model.JtbInspection;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JtbInspection in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JtbInspectionCacheModel
	implements CacheModel<JtbInspection>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JtbInspectionCacheModel)) {
			return false;
		}

		JtbInspectionCacheModel jtbInspectionCacheModel =
			(JtbInspectionCacheModel)object;

		if (jtbInspectionId == jtbInspectionCacheModel.jtbInspectionId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jtbInspectionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{jtbInspectionId=");
		sb.append(jtbInspectionId);
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
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append(", slotBookedByUser=");
		sb.append(slotBookedByUser);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JtbInspection toEntityModel() {
		JtbInspectionImpl jtbInspectionImpl = new JtbInspectionImpl();

		jtbInspectionImpl.setJtbInspectionId(jtbInspectionId);
		jtbInspectionImpl.setGroupId(groupId);
		jtbInspectionImpl.setCompanyId(companyId);
		jtbInspectionImpl.setUserId(userId);

		if (userName == null) {
			jtbInspectionImpl.setUserName("");
		}
		else {
			jtbInspectionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jtbInspectionImpl.setCreateDate(null);
		}
		else {
			jtbInspectionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jtbInspectionImpl.setModifiedDate(null);
		}
		else {
			jtbInspectionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			jtbInspectionImpl.setCaseId("");
		}
		else {
			jtbInspectionImpl.setCaseId(caseId);
		}

		if (dateOfInspection == Long.MIN_VALUE) {
			jtbInspectionImpl.setDateOfInspection(null);
		}
		else {
			jtbInspectionImpl.setDateOfInspection(new Date(dateOfInspection));
		}

		if (timeOfInspection == null) {
			jtbInspectionImpl.setTimeOfInspection("");
		}
		else {
			jtbInspectionImpl.setTimeOfInspection(timeOfInspection);
		}

		if (location == null) {
			jtbInspectionImpl.setLocation("");
		}
		else {
			jtbInspectionImpl.setLocation(location);
		}

		if (status == null) {
			jtbInspectionImpl.setStatus("");
		}
		else {
			jtbInspectionImpl.setStatus(status);
		}

		jtbInspectionImpl.setJtbApplicationId(jtbApplicationId);
		jtbInspectionImpl.setSlotBookedByUser(slotBookedByUser);

		jtbInspectionImpl.resetOriginalValues();

		return jtbInspectionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		jtbInspectionId = objectInput.readLong();

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

		jtbApplicationId = objectInput.readLong();

		slotBookedByUser = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(jtbInspectionId);

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

		objectOutput.writeLong(jtbApplicationId);

		objectOutput.writeLong(slotBookedByUser);
	}

	public long jtbInspectionId;
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
	public long jtbApplicationId;
	public long slotBookedByUser;

}