/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.factories.registration.stage.services.model.FactoriesInspection;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FactoriesInspection in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FactoriesInspectionCacheModel
	implements CacheModel<FactoriesInspection>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FactoriesInspectionCacheModel)) {
			return false;
		}

		FactoriesInspectionCacheModel factoriesInspectionCacheModel =
			(FactoriesInspectionCacheModel)object;

		if (factoriesInspectionId ==
				factoriesInspectionCacheModel.factoriesInspectionId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, factoriesInspectionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{factoriesInspectionId=");
		sb.append(factoriesInspectionId);
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
		sb.append(", factoriesApplicationId=");
		sb.append(factoriesApplicationId);
		sb.append(", slotBookedByUser=");
		sb.append(slotBookedByUser);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FactoriesInspection toEntityModel() {
		FactoriesInspectionImpl factoriesInspectionImpl =
			new FactoriesInspectionImpl();

		factoriesInspectionImpl.setFactoriesInspectionId(factoriesInspectionId);
		factoriesInspectionImpl.setGroupId(groupId);
		factoriesInspectionImpl.setCompanyId(companyId);
		factoriesInspectionImpl.setUserId(userId);

		if (userName == null) {
			factoriesInspectionImpl.setUserName("");
		}
		else {
			factoriesInspectionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			factoriesInspectionImpl.setCreateDate(null);
		}
		else {
			factoriesInspectionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			factoriesInspectionImpl.setModifiedDate(null);
		}
		else {
			factoriesInspectionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			factoriesInspectionImpl.setCaseId("");
		}
		else {
			factoriesInspectionImpl.setCaseId(caseId);
		}

		if (dateOfInspection == Long.MIN_VALUE) {
			factoriesInspectionImpl.setDateOfInspection(null);
		}
		else {
			factoriesInspectionImpl.setDateOfInspection(
				new Date(dateOfInspection));
		}

		if (timeOfInspection == null) {
			factoriesInspectionImpl.setTimeOfInspection("");
		}
		else {
			factoriesInspectionImpl.setTimeOfInspection(timeOfInspection);
		}

		if (location == null) {
			factoriesInspectionImpl.setLocation("");
		}
		else {
			factoriesInspectionImpl.setLocation(location);
		}

		if (status == null) {
			factoriesInspectionImpl.setStatus("");
		}
		else {
			factoriesInspectionImpl.setStatus(status);
		}

		factoriesInspectionImpl.setFactoriesApplicationId(
			factoriesApplicationId);
		factoriesInspectionImpl.setSlotBookedByUser(slotBookedByUser);

		factoriesInspectionImpl.resetOriginalValues();

		return factoriesInspectionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		factoriesInspectionId = objectInput.readLong();

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

		factoriesApplicationId = objectInput.readLong();

		slotBookedByUser = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(factoriesInspectionId);

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

		objectOutput.writeLong(factoriesApplicationId);

		objectOutput.writeLong(slotBookedByUser);
	}

	public long factoriesInspectionId;
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
	public long factoriesApplicationId;
	public long slotBookedByUser;

}