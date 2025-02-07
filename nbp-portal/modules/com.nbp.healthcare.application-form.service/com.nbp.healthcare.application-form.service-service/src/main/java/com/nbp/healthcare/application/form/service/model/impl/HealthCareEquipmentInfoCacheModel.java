/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.healthcare.application.form.service.model.HealthCareEquipmentInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing HealthCareEquipmentInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HealthCareEquipmentInfoCacheModel
	implements CacheModel<HealthCareEquipmentInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof HealthCareEquipmentInfoCacheModel)) {
			return false;
		}

		HealthCareEquipmentInfoCacheModel healthCareEquipmentInfoCacheModel =
			(HealthCareEquipmentInfoCacheModel)object;

		if (healthCareEquipmentInfoId ==
				healthCareEquipmentInfoCacheModel.healthCareEquipmentInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, healthCareEquipmentInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{healthCareEquipmentInfoId=");
		sb.append(healthCareEquipmentInfoId);
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
		sb.append(", healthCareApplicationId=");
		sb.append(healthCareApplicationId);
		sb.append(", equipmentManu=");
		sb.append(equipmentManu);
		sb.append(", equipmentModel=");
		sb.append(equipmentModel);
		sb.append(", equipmentMake=");
		sb.append(equipmentMake);
		sb.append(", yearOfEquipment=");
		sb.append(yearOfEquipment);
		sb.append(", serialNumber=");
		sb.append(serialNumber);
		sb.append(", quantity=");
		sb.append(quantity);
		sb.append(", description=");
		sb.append(description);
		sb.append(", hsHeading=");
		sb.append(hsHeading);
		sb.append(", hsSubHeading=");
		sb.append(hsSubHeading);
		sb.append(", counter=");
		sb.append(counter);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public HealthCareEquipmentInfo toEntityModel() {
		HealthCareEquipmentInfoImpl healthCareEquipmentInfoImpl =
			new HealthCareEquipmentInfoImpl();

		healthCareEquipmentInfoImpl.setHealthCareEquipmentInfoId(
			healthCareEquipmentInfoId);
		healthCareEquipmentInfoImpl.setGroupId(groupId);
		healthCareEquipmentInfoImpl.setCompanyId(companyId);
		healthCareEquipmentInfoImpl.setUserId(userId);

		if (userName == null) {
			healthCareEquipmentInfoImpl.setUserName("");
		}
		else {
			healthCareEquipmentInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			healthCareEquipmentInfoImpl.setCreateDate(null);
		}
		else {
			healthCareEquipmentInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			healthCareEquipmentInfoImpl.setModifiedDate(null);
		}
		else {
			healthCareEquipmentInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		healthCareEquipmentInfoImpl.setHealthCareApplicationId(
			healthCareApplicationId);

		if (equipmentManu == null) {
			healthCareEquipmentInfoImpl.setEquipmentManu("");
		}
		else {
			healthCareEquipmentInfoImpl.setEquipmentManu(equipmentManu);
		}

		if (equipmentModel == null) {
			healthCareEquipmentInfoImpl.setEquipmentModel("");
		}
		else {
			healthCareEquipmentInfoImpl.setEquipmentModel(equipmentModel);
		}

		if (equipmentMake == null) {
			healthCareEquipmentInfoImpl.setEquipmentMake("");
		}
		else {
			healthCareEquipmentInfoImpl.setEquipmentMake(equipmentMake);
		}

		if (yearOfEquipment == null) {
			healthCareEquipmentInfoImpl.setYearOfEquipment("");
		}
		else {
			healthCareEquipmentInfoImpl.setYearOfEquipment(yearOfEquipment);
		}

		if (serialNumber == null) {
			healthCareEquipmentInfoImpl.setSerialNumber("");
		}
		else {
			healthCareEquipmentInfoImpl.setSerialNumber(serialNumber);
		}

		if (quantity == null) {
			healthCareEquipmentInfoImpl.setQuantity("");
		}
		else {
			healthCareEquipmentInfoImpl.setQuantity(quantity);
		}

		if (description == null) {
			healthCareEquipmentInfoImpl.setDescription("");
		}
		else {
			healthCareEquipmentInfoImpl.setDescription(description);
		}

		if (hsHeading == null) {
			healthCareEquipmentInfoImpl.setHsHeading("");
		}
		else {
			healthCareEquipmentInfoImpl.setHsHeading(hsHeading);
		}

		if (hsSubHeading == null) {
			healthCareEquipmentInfoImpl.setHsSubHeading("");
		}
		else {
			healthCareEquipmentInfoImpl.setHsSubHeading(hsSubHeading);
		}

		if (counter == null) {
			healthCareEquipmentInfoImpl.setCounter("");
		}
		else {
			healthCareEquipmentInfoImpl.setCounter(counter);
		}

		healthCareEquipmentInfoImpl.resetOriginalValues();

		return healthCareEquipmentInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		healthCareEquipmentInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		healthCareApplicationId = objectInput.readLong();
		equipmentManu = objectInput.readUTF();
		equipmentModel = objectInput.readUTF();
		equipmentMake = objectInput.readUTF();
		yearOfEquipment = objectInput.readUTF();
		serialNumber = objectInput.readUTF();
		quantity = objectInput.readUTF();
		description = objectInput.readUTF();
		hsHeading = objectInput.readUTF();
		hsSubHeading = objectInput.readUTF();
		counter = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(healthCareEquipmentInfoId);

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

		objectOutput.writeLong(healthCareApplicationId);

		if (equipmentManu == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipmentManu);
		}

		if (equipmentModel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipmentModel);
		}

		if (equipmentMake == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipmentMake);
		}

		if (yearOfEquipment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(yearOfEquipment);
		}

		if (serialNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(serialNumber);
		}

		if (quantity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(quantity);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (hsHeading == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(hsHeading);
		}

		if (hsSubHeading == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(hsSubHeading);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}
	}

	public long healthCareEquipmentInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long healthCareApplicationId;
	public String equipmentManu;
	public String equipmentModel;
	public String equipmentMake;
	public String yearOfEquipment;
	public String serialNumber;
	public String quantity;
	public String description;
	public String hsHeading;
	public String hsSubHeading;
	public String counter;

}