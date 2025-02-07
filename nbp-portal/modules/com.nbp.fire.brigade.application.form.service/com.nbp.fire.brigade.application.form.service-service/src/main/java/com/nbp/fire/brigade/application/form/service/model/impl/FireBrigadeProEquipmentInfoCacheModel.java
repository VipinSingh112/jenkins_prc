/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.fire.brigade.application.form.service.model.FireBrigadeProEquipmentInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FireBrigadeProEquipmentInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FireBrigadeProEquipmentInfoCacheModel
	implements CacheModel<FireBrigadeProEquipmentInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FireBrigadeProEquipmentInfoCacheModel)) {
			return false;
		}

		FireBrigadeProEquipmentInfoCacheModel
			fireBrigadeProEquipmentInfoCacheModel =
				(FireBrigadeProEquipmentInfoCacheModel)object;

		if (fireBrigadeProEquipmentInfoId ==
				fireBrigadeProEquipmentInfoCacheModel.
					fireBrigadeProEquipmentInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fireBrigadeProEquipmentInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{fireBrigadeProEquipmentInfoId=");
		sb.append(fireBrigadeProEquipmentInfoId);
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
		sb.append(", equipmentProtectionPre=");
		sb.append(equipmentProtectionPre);
		sb.append(", equipmentProtectionOne=");
		sb.append(equipmentProtectionOne);
		sb.append(", equipmentProtectionTwo=");
		sb.append(equipmentProtectionTwo);
		sb.append(", equipmentProtectionThree=");
		sb.append(equipmentProtectionThree);
		sb.append(", equipmentProtectionFour=");
		sb.append(equipmentProtectionFour);
		sb.append(", equipmentProtectionFive=");
		sb.append(equipmentProtectionFive);
		sb.append(", equipmentProtectionSix=");
		sb.append(equipmentProtectionSix);
		sb.append(", otherEquipment=");
		sb.append(otherEquipment);
		sb.append(", fireBrigadeApplicationId=");
		sb.append(fireBrigadeApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FireBrigadeProEquipmentInfo toEntityModel() {
		FireBrigadeProEquipmentInfoImpl fireBrigadeProEquipmentInfoImpl =
			new FireBrigadeProEquipmentInfoImpl();

		fireBrigadeProEquipmentInfoImpl.setFireBrigadeProEquipmentInfoId(
			fireBrigadeProEquipmentInfoId);
		fireBrigadeProEquipmentInfoImpl.setGroupId(groupId);
		fireBrigadeProEquipmentInfoImpl.setCompanyId(companyId);
		fireBrigadeProEquipmentInfoImpl.setUserId(userId);

		if (userName == null) {
			fireBrigadeProEquipmentInfoImpl.setUserName("");
		}
		else {
			fireBrigadeProEquipmentInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			fireBrigadeProEquipmentInfoImpl.setCreateDate(null);
		}
		else {
			fireBrigadeProEquipmentInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			fireBrigadeProEquipmentInfoImpl.setModifiedDate(null);
		}
		else {
			fireBrigadeProEquipmentInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (equipmentProtectionPre == null) {
			fireBrigadeProEquipmentInfoImpl.setEquipmentProtectionPre("");
		}
		else {
			fireBrigadeProEquipmentInfoImpl.setEquipmentProtectionPre(
				equipmentProtectionPre);
		}

		if (equipmentProtectionOne == null) {
			fireBrigadeProEquipmentInfoImpl.setEquipmentProtectionOne("");
		}
		else {
			fireBrigadeProEquipmentInfoImpl.setEquipmentProtectionOne(
				equipmentProtectionOne);
		}

		if (equipmentProtectionTwo == null) {
			fireBrigadeProEquipmentInfoImpl.setEquipmentProtectionTwo("");
		}
		else {
			fireBrigadeProEquipmentInfoImpl.setEquipmentProtectionTwo(
				equipmentProtectionTwo);
		}

		if (equipmentProtectionThree == null) {
			fireBrigadeProEquipmentInfoImpl.setEquipmentProtectionThree("");
		}
		else {
			fireBrigadeProEquipmentInfoImpl.setEquipmentProtectionThree(
				equipmentProtectionThree);
		}

		if (equipmentProtectionFour == null) {
			fireBrigadeProEquipmentInfoImpl.setEquipmentProtectionFour("");
		}
		else {
			fireBrigadeProEquipmentInfoImpl.setEquipmentProtectionFour(
				equipmentProtectionFour);
		}

		if (equipmentProtectionFive == null) {
			fireBrigadeProEquipmentInfoImpl.setEquipmentProtectionFive("");
		}
		else {
			fireBrigadeProEquipmentInfoImpl.setEquipmentProtectionFive(
				equipmentProtectionFive);
		}

		if (equipmentProtectionSix == null) {
			fireBrigadeProEquipmentInfoImpl.setEquipmentProtectionSix("");
		}
		else {
			fireBrigadeProEquipmentInfoImpl.setEquipmentProtectionSix(
				equipmentProtectionSix);
		}

		if (otherEquipment == null) {
			fireBrigadeProEquipmentInfoImpl.setOtherEquipment("");
		}
		else {
			fireBrigadeProEquipmentInfoImpl.setOtherEquipment(otherEquipment);
		}

		fireBrigadeProEquipmentInfoImpl.setFireBrigadeApplicationId(
			fireBrigadeApplicationId);

		fireBrigadeProEquipmentInfoImpl.resetOriginalValues();

		return fireBrigadeProEquipmentInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fireBrigadeProEquipmentInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		equipmentProtectionPre = objectInput.readUTF();
		equipmentProtectionOne = objectInput.readUTF();
		equipmentProtectionTwo = objectInput.readUTF();
		equipmentProtectionThree = objectInput.readUTF();
		equipmentProtectionFour = objectInput.readUTF();
		equipmentProtectionFive = objectInput.readUTF();
		equipmentProtectionSix = objectInput.readUTF();
		otherEquipment = objectInput.readUTF();

		fireBrigadeApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(fireBrigadeProEquipmentInfoId);

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

		if (equipmentProtectionPre == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipmentProtectionPre);
		}

		if (equipmentProtectionOne == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipmentProtectionOne);
		}

		if (equipmentProtectionTwo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipmentProtectionTwo);
		}

		if (equipmentProtectionThree == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipmentProtectionThree);
		}

		if (equipmentProtectionFour == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipmentProtectionFour);
		}

		if (equipmentProtectionFive == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipmentProtectionFive);
		}

		if (equipmentProtectionSix == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipmentProtectionSix);
		}

		if (otherEquipment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherEquipment);
		}

		objectOutput.writeLong(fireBrigadeApplicationId);
	}

	public long fireBrigadeProEquipmentInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String equipmentProtectionPre;
	public String equipmentProtectionOne;
	public String equipmentProtectionTwo;
	public String equipmentProtectionThree;
	public String equipmentProtectionFour;
	public String equipmentProtectionFive;
	public String equipmentProtectionSix;
	public String otherEquipment;
	public long fireBrigadeApplicationId;

}