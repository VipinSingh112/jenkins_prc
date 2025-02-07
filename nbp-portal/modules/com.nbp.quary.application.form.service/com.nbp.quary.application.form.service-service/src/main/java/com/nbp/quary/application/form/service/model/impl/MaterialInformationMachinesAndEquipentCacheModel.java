/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.quary.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.quary.application.form.service.model.MaterialInformationMachinesAndEquipent;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MaterialInformationMachinesAndEquipent in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MaterialInformationMachinesAndEquipentCacheModel
	implements CacheModel<MaterialInformationMachinesAndEquipent>,
			   Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof
				MaterialInformationMachinesAndEquipentCacheModel)) {

			return false;
		}

		MaterialInformationMachinesAndEquipentCacheModel
			materialInformationMachinesAndEquipentCacheModel =
				(MaterialInformationMachinesAndEquipentCacheModel)object;

		if (miMachineId ==
				materialInformationMachinesAndEquipentCacheModel.miMachineId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, miMachineId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", miMachineId=");
		sb.append(miMachineId);
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
		sb.append(", locatedOnProposedSite=");
		sb.append(locatedOnProposedSite);
		sb.append(", quarryApplicationId=");
		sb.append(quarryApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MaterialInformationMachinesAndEquipent toEntityModel() {
		MaterialInformationMachinesAndEquipentImpl
			materialInformationMachinesAndEquipentImpl =
				new MaterialInformationMachinesAndEquipentImpl();

		if (uuid == null) {
			materialInformationMachinesAndEquipentImpl.setUuid("");
		}
		else {
			materialInformationMachinesAndEquipentImpl.setUuid(uuid);
		}

		materialInformationMachinesAndEquipentImpl.setMiMachineId(miMachineId);
		materialInformationMachinesAndEquipentImpl.setGroupId(groupId);
		materialInformationMachinesAndEquipentImpl.setCompanyId(companyId);
		materialInformationMachinesAndEquipentImpl.setUserId(userId);

		if (userName == null) {
			materialInformationMachinesAndEquipentImpl.setUserName("");
		}
		else {
			materialInformationMachinesAndEquipentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			materialInformationMachinesAndEquipentImpl.setCreateDate(null);
		}
		else {
			materialInformationMachinesAndEquipentImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			materialInformationMachinesAndEquipentImpl.setModifiedDate(null);
		}
		else {
			materialInformationMachinesAndEquipentImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (manchineName == null) {
			materialInformationMachinesAndEquipentImpl.setManchineName("");
		}
		else {
			materialInformationMachinesAndEquipentImpl.setManchineName(
				manchineName);
		}

		if (isManchineNameChecked == null) {
			materialInformationMachinesAndEquipentImpl.setIsManchineNameChecked(
				"");
		}
		else {
			materialInformationMachinesAndEquipentImpl.setIsManchineNameChecked(
				isManchineNameChecked);
		}

		if (locatedOnProposedSite == null) {
			materialInformationMachinesAndEquipentImpl.setLocatedOnProposedSite(
				"");
		}
		else {
			materialInformationMachinesAndEquipentImpl.setLocatedOnProposedSite(
				locatedOnProposedSite);
		}

		if (quarryApplicationId == null) {
			materialInformationMachinesAndEquipentImpl.setQuarryApplicationId(
				"");
		}
		else {
			materialInformationMachinesAndEquipentImpl.setQuarryApplicationId(
				quarryApplicationId);
		}

		materialInformationMachinesAndEquipentImpl.resetOriginalValues();

		return materialInformationMachinesAndEquipentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		miMachineId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		manchineName = objectInput.readUTF();
		isManchineNameChecked = objectInput.readUTF();
		locatedOnProposedSite = objectInput.readUTF();
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

		objectOutput.writeLong(miMachineId);

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

		if (locatedOnProposedSite == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(locatedOnProposedSite);
		}

		if (quarryApplicationId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(quarryApplicationId);
		}
	}

	public String uuid;
	public long miMachineId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String manchineName;
	public String isManchineNameChecked;
	public String locatedOnProposedSite;
	public String quarryApplicationId;

}