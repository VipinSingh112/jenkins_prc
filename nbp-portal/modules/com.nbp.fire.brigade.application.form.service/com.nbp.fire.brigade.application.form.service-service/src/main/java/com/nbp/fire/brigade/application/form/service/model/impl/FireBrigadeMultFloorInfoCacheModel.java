/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.fire.brigade.application.form.service.model.FireBrigadeMultFloorInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FireBrigadeMultFloorInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FireBrigadeMultFloorInfoCacheModel
	implements CacheModel<FireBrigadeMultFloorInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FireBrigadeMultFloorInfoCacheModel)) {
			return false;
		}

		FireBrigadeMultFloorInfoCacheModel fireBrigadeMultFloorInfoCacheModel =
			(FireBrigadeMultFloorInfoCacheModel)object;

		if (fireBrigadeMultFloorInfoId ==
				fireBrigadeMultFloorInfoCacheModel.fireBrigadeMultFloorInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fireBrigadeMultFloorInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{fireBrigadeMultFloorInfoId=");
		sb.append(fireBrigadeMultFloorInfoId);
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
		sb.append(", floorAlternateExist=");
		sb.append(floorAlternateExist);
		sb.append(", buildingRisingMain=");
		sb.append(buildingRisingMain);
		sb.append(", equipmentConnection=");
		sb.append(equipmentConnection);
		sb.append(", buildingParkingGarage=");
		sb.append(buildingParkingGarage);
		sb.append(", fireBrigadeApplicationId=");
		sb.append(fireBrigadeApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FireBrigadeMultFloorInfo toEntityModel() {
		FireBrigadeMultFloorInfoImpl fireBrigadeMultFloorInfoImpl =
			new FireBrigadeMultFloorInfoImpl();

		fireBrigadeMultFloorInfoImpl.setFireBrigadeMultFloorInfoId(
			fireBrigadeMultFloorInfoId);
		fireBrigadeMultFloorInfoImpl.setGroupId(groupId);
		fireBrigadeMultFloorInfoImpl.setCompanyId(companyId);
		fireBrigadeMultFloorInfoImpl.setUserId(userId);

		if (userName == null) {
			fireBrigadeMultFloorInfoImpl.setUserName("");
		}
		else {
			fireBrigadeMultFloorInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			fireBrigadeMultFloorInfoImpl.setCreateDate(null);
		}
		else {
			fireBrigadeMultFloorInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			fireBrigadeMultFloorInfoImpl.setModifiedDate(null);
		}
		else {
			fireBrigadeMultFloorInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (floorAlternateExist == null) {
			fireBrigadeMultFloorInfoImpl.setFloorAlternateExist("");
		}
		else {
			fireBrigadeMultFloorInfoImpl.setFloorAlternateExist(
				floorAlternateExist);
		}

		if (buildingRisingMain == null) {
			fireBrigadeMultFloorInfoImpl.setBuildingRisingMain("");
		}
		else {
			fireBrigadeMultFloorInfoImpl.setBuildingRisingMain(
				buildingRisingMain);
		}

		if (equipmentConnection == null) {
			fireBrigadeMultFloorInfoImpl.setEquipmentConnection("");
		}
		else {
			fireBrigadeMultFloorInfoImpl.setEquipmentConnection(
				equipmentConnection);
		}

		if (buildingParkingGarage == null) {
			fireBrigadeMultFloorInfoImpl.setBuildingParkingGarage("");
		}
		else {
			fireBrigadeMultFloorInfoImpl.setBuildingParkingGarage(
				buildingParkingGarage);
		}

		fireBrigadeMultFloorInfoImpl.setFireBrigadeApplicationId(
			fireBrigadeApplicationId);

		fireBrigadeMultFloorInfoImpl.resetOriginalValues();

		return fireBrigadeMultFloorInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fireBrigadeMultFloorInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		floorAlternateExist = objectInput.readUTF();
		buildingRisingMain = objectInput.readUTF();
		equipmentConnection = objectInput.readUTF();
		buildingParkingGarage = objectInput.readUTF();

		fireBrigadeApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(fireBrigadeMultFloorInfoId);

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

		if (floorAlternateExist == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(floorAlternateExist);
		}

		if (buildingRisingMain == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(buildingRisingMain);
		}

		if (equipmentConnection == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipmentConnection);
		}

		if (buildingParkingGarage == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(buildingParkingGarage);
		}

		objectOutput.writeLong(fireBrigadeApplicationId);
	}

	public long fireBrigadeMultFloorInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String floorAlternateExist;
	public String buildingRisingMain;
	public String equipmentConnection;
	public String buildingParkingGarage;
	public long fireBrigadeApplicationId;

}