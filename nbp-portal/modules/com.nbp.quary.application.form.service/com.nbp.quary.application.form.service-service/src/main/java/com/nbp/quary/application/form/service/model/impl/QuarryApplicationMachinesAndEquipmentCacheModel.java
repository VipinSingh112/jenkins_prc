/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.quary.application.form.service.model.QuarryApplicationMachinesAndEquipment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QuarryApplicationMachinesAndEquipment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class QuarryApplicationMachinesAndEquipmentCacheModel
	implements CacheModel<QuarryApplicationMachinesAndEquipment>,
			   Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof
				QuarryApplicationMachinesAndEquipmentCacheModel)) {

			return false;
		}

		QuarryApplicationMachinesAndEquipmentCacheModel
			quarryApplicationMachinesAndEquipmentCacheModel =
				(QuarryApplicationMachinesAndEquipmentCacheModel)object;

		if (quarryApplicationMachinId ==
				quarryApplicationMachinesAndEquipmentCacheModel.
					quarryApplicationMachinId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, quarryApplicationMachinId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", quarryApplicationMachinId=");
		sb.append(quarryApplicationMachinId);
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
		sb.append(", manchineName=");
		sb.append(manchineName);
		sb.append(", isManchineNameChecked=");
		sb.append(isManchineNameChecked);
		sb.append(", quantity=");
		sb.append(quantity);
		sb.append(", locationOfPermises=");
		sb.append(locationOfPermises);
		sb.append(", locatedOnLocation=");
		sb.append(locatedOnLocation);
		sb.append(", otherValue=");
		sb.append(otherValue);
		sb.append(", quarryApplicationId=");
		sb.append(quarryApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QuarryApplicationMachinesAndEquipment toEntityModel() {
		QuarryApplicationMachinesAndEquipmentImpl
			quarryApplicationMachinesAndEquipmentImpl =
				new QuarryApplicationMachinesAndEquipmentImpl();

		if (uuid == null) {
			quarryApplicationMachinesAndEquipmentImpl.setUuid("");
		}
		else {
			quarryApplicationMachinesAndEquipmentImpl.setUuid(uuid);
		}

		quarryApplicationMachinesAndEquipmentImpl.setQuarryApplicationMachinId(
			quarryApplicationMachinId);
		quarryApplicationMachinesAndEquipmentImpl.setGroupId(groupId);
		quarryApplicationMachinesAndEquipmentImpl.setCompanyId(companyId);
		quarryApplicationMachinesAndEquipmentImpl.setUserId(userId);

		if (userName == null) {
			quarryApplicationMachinesAndEquipmentImpl.setUserName("");
		}
		else {
			quarryApplicationMachinesAndEquipmentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			quarryApplicationMachinesAndEquipmentImpl.setCreateDate(null);
		}
		else {
			quarryApplicationMachinesAndEquipmentImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			quarryApplicationMachinesAndEquipmentImpl.setModifiedDate(null);
		}
		else {
			quarryApplicationMachinesAndEquipmentImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (manchineName == null) {
			quarryApplicationMachinesAndEquipmentImpl.setManchineName("");
		}
		else {
			quarryApplicationMachinesAndEquipmentImpl.setManchineName(
				manchineName);
		}

		if (isManchineNameChecked == null) {
			quarryApplicationMachinesAndEquipmentImpl.setIsManchineNameChecked(
				"");
		}
		else {
			quarryApplicationMachinesAndEquipmentImpl.setIsManchineNameChecked(
				isManchineNameChecked);
		}

		if (quantity == null) {
			quarryApplicationMachinesAndEquipmentImpl.setQuantity("");
		}
		else {
			quarryApplicationMachinesAndEquipmentImpl.setQuantity(quantity);
		}

		if (locationOfPermises == null) {
			quarryApplicationMachinesAndEquipmentImpl.setLocationOfPermises("");
		}
		else {
			quarryApplicationMachinesAndEquipmentImpl.setLocationOfPermises(
				locationOfPermises);
		}

		if (locatedOnLocation == null) {
			quarryApplicationMachinesAndEquipmentImpl.setLocatedOnLocation("");
		}
		else {
			quarryApplicationMachinesAndEquipmentImpl.setLocatedOnLocation(
				locatedOnLocation);
		}

		if (otherValue == null) {
			quarryApplicationMachinesAndEquipmentImpl.setOtherValue("");
		}
		else {
			quarryApplicationMachinesAndEquipmentImpl.setOtherValue(otherValue);
		}

		if (quarryApplicationId == null) {
			quarryApplicationMachinesAndEquipmentImpl.setQuarryApplicationId(
				"");
		}
		else {
			quarryApplicationMachinesAndEquipmentImpl.setQuarryApplicationId(
				quarryApplicationId);
		}

		quarryApplicationMachinesAndEquipmentImpl.resetOriginalValues();

		return quarryApplicationMachinesAndEquipmentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		quarryApplicationMachinId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		manchineName = objectInput.readUTF();
		isManchineNameChecked = objectInput.readUTF();
		quantity = objectInput.readUTF();
		locationOfPermises = objectInput.readUTF();
		locatedOnLocation = objectInput.readUTF();
		otherValue = objectInput.readUTF();
		quarryApplicationId = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(quarryApplicationMachinId);

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

		if (manchineName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manchineName);
		}

		if (isManchineNameChecked == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(isManchineNameChecked);
		}

		if (quantity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(quantity);
		}

		if (locationOfPermises == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(locationOfPermises);
		}

		if (locatedOnLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(locatedOnLocation);
		}

		if (otherValue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherValue);
		}

		if (quarryApplicationId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(quarryApplicationId);
		}
	}

	public String uuid;
	public long quarryApplicationMachinId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String manchineName;
	public String isManchineNameChecked;
	public String quantity;
	public String locationOfPermises;
	public String locatedOnLocation;
	public String otherValue;
	public String quarryApplicationId;

}