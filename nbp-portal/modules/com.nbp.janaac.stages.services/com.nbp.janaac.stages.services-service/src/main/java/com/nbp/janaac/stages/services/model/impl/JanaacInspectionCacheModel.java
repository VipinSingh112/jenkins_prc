/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.stages.services.model.JanaacInspection;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JanaacInspection in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JanaacInspectionCacheModel
	implements CacheModel<JanaacInspection>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JanaacInspectionCacheModel)) {
			return false;
		}

		JanaacInspectionCacheModel janaacInspectionCacheModel =
			(JanaacInspectionCacheModel)object;

		if (janaacInspectionId ==
				janaacInspectionCacheModel.janaacInspectionId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, janaacInspectionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{janaacInspectionId=");
		sb.append(janaacInspectionId);
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
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append(", slotBookedByUser=");
		sb.append(slotBookedByUser);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JanaacInspection toEntityModel() {
		JanaacInspectionImpl janaacInspectionImpl = new JanaacInspectionImpl();

		janaacInspectionImpl.setJanaacInspectionId(janaacInspectionId);
		janaacInspectionImpl.setGroupId(groupId);
		janaacInspectionImpl.setCompanyId(companyId);
		janaacInspectionImpl.setUserId(userId);

		if (userName == null) {
			janaacInspectionImpl.setUserName("");
		}
		else {
			janaacInspectionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			janaacInspectionImpl.setCreateDate(null);
		}
		else {
			janaacInspectionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			janaacInspectionImpl.setModifiedDate(null);
		}
		else {
			janaacInspectionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			janaacInspectionImpl.setCaseId("");
		}
		else {
			janaacInspectionImpl.setCaseId(caseId);
		}

		if (dateOfInspection == Long.MIN_VALUE) {
			janaacInspectionImpl.setDateOfInspection(null);
		}
		else {
			janaacInspectionImpl.setDateOfInspection(
				new Date(dateOfInspection));
		}

		if (timeOfInspection == null) {
			janaacInspectionImpl.setTimeOfInspection("");
		}
		else {
			janaacInspectionImpl.setTimeOfInspection(timeOfInspection);
		}

		if (location == null) {
			janaacInspectionImpl.setLocation("");
		}
		else {
			janaacInspectionImpl.setLocation(location);
		}

		if (status == null) {
			janaacInspectionImpl.setStatus("");
		}
		else {
			janaacInspectionImpl.setStatus(status);
		}

		janaacInspectionImpl.setJanaacApplicationId(janaacApplicationId);
		janaacInspectionImpl.setSlotBookedByUser(slotBookedByUser);

		janaacInspectionImpl.resetOriginalValues();

		return janaacInspectionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		janaacInspectionId = objectInput.readLong();

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

		janaacApplicationId = objectInput.readLong();

		slotBookedByUser = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(janaacInspectionId);

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

		objectOutput.writeLong(janaacApplicationId);

		objectOutput.writeLong(slotBookedByUser);
	}

	public long janaacInspectionId;
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
	public long janaacApplicationId;
	public long slotBookedByUser;

}