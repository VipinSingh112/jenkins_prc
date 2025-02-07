/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.quary.application.form.service.model.QuarryMaterialInformationEquipmentList;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QuarryMaterialInformationEquipmentList in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class QuarryMaterialInformationEquipmentListCacheModel
	implements CacheModel<QuarryMaterialInformationEquipmentList>,
			   Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof
				QuarryMaterialInformationEquipmentListCacheModel)) {

			return false;
		}

		QuarryMaterialInformationEquipmentListCacheModel
			quarryMaterialInformationEquipmentListCacheModel =
				(QuarryMaterialInformationEquipmentListCacheModel)object;

		if (materialInfoId ==
				quarryMaterialInformationEquipmentListCacheModel.
					materialInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, materialInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{materialInfoId=");
		sb.append(materialInfoId);
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
		sb.append(", machineName=");
		sb.append(machineName);
		sb.append(", quantity=");
		sb.append(quantity);
		sb.append(", locatedOnPermises=");
		sb.append(locatedOnPermises);
		sb.append(", isManchineNameChecked=");
		sb.append(isManchineNameChecked);
		sb.append(", otherValue=");
		sb.append(otherValue);
		sb.append(", quarryApplicationId=");
		sb.append(quarryApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QuarryMaterialInformationEquipmentList toEntityModel() {
		QuarryMaterialInformationEquipmentListImpl
			quarryMaterialInformationEquipmentListImpl =
				new QuarryMaterialInformationEquipmentListImpl();

		quarryMaterialInformationEquipmentListImpl.setMaterialInfoId(
			materialInfoId);
		quarryMaterialInformationEquipmentListImpl.setGroupId(groupId);
		quarryMaterialInformationEquipmentListImpl.setCompanyId(companyId);
		quarryMaterialInformationEquipmentListImpl.setUserId(userId);

		if (userName == null) {
			quarryMaterialInformationEquipmentListImpl.setUserName("");
		}
		else {
			quarryMaterialInformationEquipmentListImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			quarryMaterialInformationEquipmentListImpl.setCreateDate(null);
		}
		else {
			quarryMaterialInformationEquipmentListImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			quarryMaterialInformationEquipmentListImpl.setModifiedDate(null);
		}
		else {
			quarryMaterialInformationEquipmentListImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (machineName == null) {
			quarryMaterialInformationEquipmentListImpl.setMachineName("");
		}
		else {
			quarryMaterialInformationEquipmentListImpl.setMachineName(
				machineName);
		}

		if (quantity == null) {
			quarryMaterialInformationEquipmentListImpl.setQuantity("");
		}
		else {
			quarryMaterialInformationEquipmentListImpl.setQuantity(quantity);
		}

		if (locatedOnPermises == null) {
			quarryMaterialInformationEquipmentListImpl.setLocatedOnPermises("");
		}
		else {
			quarryMaterialInformationEquipmentListImpl.setLocatedOnPermises(
				locatedOnPermises);
		}

		if (isManchineNameChecked == null) {
			quarryMaterialInformationEquipmentListImpl.setIsManchineNameChecked(
				"");
		}
		else {
			quarryMaterialInformationEquipmentListImpl.setIsManchineNameChecked(
				isManchineNameChecked);
		}

		if (otherValue == null) {
			quarryMaterialInformationEquipmentListImpl.setOtherValue("");
		}
		else {
			quarryMaterialInformationEquipmentListImpl.setOtherValue(
				otherValue);
		}

		quarryMaterialInformationEquipmentListImpl.setQuarryApplicationId(
			quarryApplicationId);

		quarryMaterialInformationEquipmentListImpl.resetOriginalValues();

		return quarryMaterialInformationEquipmentListImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		materialInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		machineName = objectInput.readUTF();
		quantity = objectInput.readUTF();
		locatedOnPermises = objectInput.readUTF();
		isManchineNameChecked = objectInput.readUTF();
		otherValue = objectInput.readUTF();

		quarryApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(materialInfoId);

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

		if (machineName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(machineName);
		}

		if (quantity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(quantity);
		}

		if (locatedOnPermises == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(locatedOnPermises);
		}

		if (isManchineNameChecked == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(isManchineNameChecked);
		}

		if (otherValue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherValue);
		}

		objectOutput.writeLong(quarryApplicationId);
	}

	public long materialInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String machineName;
	public String quantity;
	public String locatedOnPermises;
	public String isManchineNameChecked;
	public String otherValue;
	public long quarryApplicationId;

}