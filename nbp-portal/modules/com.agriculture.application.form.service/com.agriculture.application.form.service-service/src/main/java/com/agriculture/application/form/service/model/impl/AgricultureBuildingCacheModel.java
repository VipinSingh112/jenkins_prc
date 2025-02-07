/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.model.impl;

import com.agriculture.application.form.service.model.AgricultureBuilding;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AgricultureBuilding in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AgricultureBuildingCacheModel
	implements CacheModel<AgricultureBuilding>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AgricultureBuildingCacheModel)) {
			return false;
		}

		AgricultureBuildingCacheModel agricultureBuildingCacheModel =
			(AgricultureBuildingCacheModel)object;

		if (agricultureBuildingId ==
				agricultureBuildingCacheModel.agricultureBuildingId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, agricultureBuildingId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{agricultureBuildingId=");
		sb.append(agricultureBuildingId);
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
		sb.append(", buildingPurpose=");
		sb.append(buildingPurpose);
		sb.append(", buildingSize=");
		sb.append(buildingSize);
		sb.append(", machineryDescription=");
		sb.append(machineryDescription);
		sb.append(", dateOfAcquisition=");
		sb.append(dateOfAcquisition);
		sb.append(", buildingCost=");
		sb.append(buildingCost);
		sb.append(", presentBookValue=");
		sb.append(presentBookValue);
		sb.append(", buildingCounter=");
		sb.append(buildingCounter);
		sb.append(", agricultureApplicationId=");
		sb.append(agricultureApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AgricultureBuilding toEntityModel() {
		AgricultureBuildingImpl agricultureBuildingImpl =
			new AgricultureBuildingImpl();

		agricultureBuildingImpl.setAgricultureBuildingId(agricultureBuildingId);
		agricultureBuildingImpl.setGroupId(groupId);
		agricultureBuildingImpl.setCompanyId(companyId);
		agricultureBuildingImpl.setUserId(userId);

		if (userName == null) {
			agricultureBuildingImpl.setUserName("");
		}
		else {
			agricultureBuildingImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			agricultureBuildingImpl.setCreateDate(null);
		}
		else {
			agricultureBuildingImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			agricultureBuildingImpl.setModifiedDate(null);
		}
		else {
			agricultureBuildingImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (buildingPurpose == null) {
			agricultureBuildingImpl.setBuildingPurpose("");
		}
		else {
			agricultureBuildingImpl.setBuildingPurpose(buildingPurpose);
		}

		if (buildingSize == null) {
			agricultureBuildingImpl.setBuildingSize("");
		}
		else {
			agricultureBuildingImpl.setBuildingSize(buildingSize);
		}

		if (machineryDescription == null) {
			agricultureBuildingImpl.setMachineryDescription("");
		}
		else {
			agricultureBuildingImpl.setMachineryDescription(
				machineryDescription);
		}

		if (dateOfAcquisition == Long.MIN_VALUE) {
			agricultureBuildingImpl.setDateOfAcquisition(null);
		}
		else {
			agricultureBuildingImpl.setDateOfAcquisition(
				new Date(dateOfAcquisition));
		}

		if (buildingCost == null) {
			agricultureBuildingImpl.setBuildingCost("");
		}
		else {
			agricultureBuildingImpl.setBuildingCost(buildingCost);
		}

		if (presentBookValue == null) {
			agricultureBuildingImpl.setPresentBookValue("");
		}
		else {
			agricultureBuildingImpl.setPresentBookValue(presentBookValue);
		}

		if (buildingCounter == null) {
			agricultureBuildingImpl.setBuildingCounter("");
		}
		else {
			agricultureBuildingImpl.setBuildingCounter(buildingCounter);
		}

		agricultureBuildingImpl.setAgricultureApplicationId(
			agricultureApplicationId);

		agricultureBuildingImpl.resetOriginalValues();

		return agricultureBuildingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		agricultureBuildingId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		buildingPurpose = objectInput.readUTF();
		buildingSize = objectInput.readUTF();
		machineryDescription = objectInput.readUTF();
		dateOfAcquisition = objectInput.readLong();
		buildingCost = objectInput.readUTF();
		presentBookValue = objectInput.readUTF();
		buildingCounter = objectInput.readUTF();

		agricultureApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(agricultureBuildingId);

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

		if (buildingPurpose == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(buildingPurpose);
		}

		if (buildingSize == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(buildingSize);
		}

		if (machineryDescription == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(machineryDescription);
		}

		objectOutput.writeLong(dateOfAcquisition);

		if (buildingCost == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(buildingCost);
		}

		if (presentBookValue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(presentBookValue);
		}

		if (buildingCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(buildingCounter);
		}

		objectOutput.writeLong(agricultureApplicationId);
	}

	public long agricultureBuildingId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String buildingPurpose;
	public String buildingSize;
	public String machineryDescription;
	public long dateOfAcquisition;
	public String buildingCost;
	public String presentBookValue;
	public String buildingCounter;
	public long agricultureApplicationId;

}