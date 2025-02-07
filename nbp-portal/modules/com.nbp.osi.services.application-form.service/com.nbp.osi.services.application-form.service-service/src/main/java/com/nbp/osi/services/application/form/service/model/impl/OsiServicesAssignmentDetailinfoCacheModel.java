/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.services.application.form.service.model.OsiServicesAssignmentDetailinfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiServicesAssignmentDetailinfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiServicesAssignmentDetailinfoCacheModel
	implements CacheModel<OsiServicesAssignmentDetailinfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OsiServicesAssignmentDetailinfoCacheModel)) {
			return false;
		}

		OsiServicesAssignmentDetailinfoCacheModel
			osiServicesAssignmentDetailinfoCacheModel =
				(OsiServicesAssignmentDetailinfoCacheModel)object;

		if (osiADId == osiServicesAssignmentDetailinfoCacheModel.osiADId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiADId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", osiADId=");
		sb.append(osiADId);
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
		sb.append(", assignmentName=");
		sb.append(assignmentName);
		sb.append(", assignmentDated=");
		sb.append(assignmentDated);
		sb.append(", selectedAssignmentAttached=");
		sb.append(selectedAssignmentAttached);
		sb.append(", assignmentAddress=");
		sb.append(assignmentAddress);
		sb.append(", trusteeAct=");
		sb.append(trusteeAct);
		sb.append(", osiServicesApplicationId=");
		sb.append(osiServicesApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OsiServicesAssignmentDetailinfo toEntityModel() {
		OsiServicesAssignmentDetailinfoImpl
			osiServicesAssignmentDetailinfoImpl =
				new OsiServicesAssignmentDetailinfoImpl();

		if (uuid == null) {
			osiServicesAssignmentDetailinfoImpl.setUuid("");
		}
		else {
			osiServicesAssignmentDetailinfoImpl.setUuid(uuid);
		}

		osiServicesAssignmentDetailinfoImpl.setOsiADId(osiADId);
		osiServicesAssignmentDetailinfoImpl.setGroupId(groupId);
		osiServicesAssignmentDetailinfoImpl.setCompanyId(companyId);
		osiServicesAssignmentDetailinfoImpl.setUserId(userId);

		if (userName == null) {
			osiServicesAssignmentDetailinfoImpl.setUserName("");
		}
		else {
			osiServicesAssignmentDetailinfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiServicesAssignmentDetailinfoImpl.setCreateDate(null);
		}
		else {
			osiServicesAssignmentDetailinfoImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiServicesAssignmentDetailinfoImpl.setModifiedDate(null);
		}
		else {
			osiServicesAssignmentDetailinfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (assignmentName == null) {
			osiServicesAssignmentDetailinfoImpl.setAssignmentName("");
		}
		else {
			osiServicesAssignmentDetailinfoImpl.setAssignmentName(
				assignmentName);
		}

		if (assignmentDated == Long.MIN_VALUE) {
			osiServicesAssignmentDetailinfoImpl.setAssignmentDated(null);
		}
		else {
			osiServicesAssignmentDetailinfoImpl.setAssignmentDated(
				new Date(assignmentDated));
		}

		if (selectedAssignmentAttached == null) {
			osiServicesAssignmentDetailinfoImpl.setSelectedAssignmentAttached(
				"");
		}
		else {
			osiServicesAssignmentDetailinfoImpl.setSelectedAssignmentAttached(
				selectedAssignmentAttached);
		}

		if (assignmentAddress == null) {
			osiServicesAssignmentDetailinfoImpl.setAssignmentAddress("");
		}
		else {
			osiServicesAssignmentDetailinfoImpl.setAssignmentAddress(
				assignmentAddress);
		}

		if (trusteeAct == null) {
			osiServicesAssignmentDetailinfoImpl.setTrusteeAct("");
		}
		else {
			osiServicesAssignmentDetailinfoImpl.setTrusteeAct(trusteeAct);
		}

		osiServicesAssignmentDetailinfoImpl.setOsiServicesApplicationId(
			osiServicesApplicationId);

		osiServicesAssignmentDetailinfoImpl.resetOriginalValues();

		return osiServicesAssignmentDetailinfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		osiADId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		assignmentName = objectInput.readUTF();
		assignmentDated = objectInput.readLong();
		selectedAssignmentAttached = objectInput.readUTF();
		assignmentAddress = objectInput.readUTF();
		trusteeAct = objectInput.readUTF();

		osiServicesApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(osiADId);

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

		if (assignmentName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assignmentName);
		}

		objectOutput.writeLong(assignmentDated);

		if (selectedAssignmentAttached == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(selectedAssignmentAttached);
		}

		if (assignmentAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assignmentAddress);
		}

		if (trusteeAct == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(trusteeAct);
		}

		objectOutput.writeLong(osiServicesApplicationId);
	}

	public String uuid;
	public long osiADId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String assignmentName;
	public long assignmentDated;
	public String selectedAssignmentAttached;
	public String assignmentAddress;
	public String trusteeAct;
	public long osiServicesApplicationId;

}