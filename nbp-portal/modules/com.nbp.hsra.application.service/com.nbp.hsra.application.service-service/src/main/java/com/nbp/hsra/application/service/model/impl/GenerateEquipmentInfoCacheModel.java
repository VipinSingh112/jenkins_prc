/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.GenerateEquipmentInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing GenerateEquipmentInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class GenerateEquipmentInfoCacheModel
	implements CacheModel<GenerateEquipmentInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof GenerateEquipmentInfoCacheModel)) {
			return false;
		}

		GenerateEquipmentInfoCacheModel generateEquipmentInfoCacheModel =
			(GenerateEquipmentInfoCacheModel)object;

		if (GenerateEquipmentInfoId ==
				generateEquipmentInfoCacheModel.GenerateEquipmentInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, GenerateEquipmentInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{GenerateEquipmentInfoId=");
		sb.append(GenerateEquipmentInfoId);
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
		sb.append(", manufacturerEquipment=");
		sb.append(manufacturerEquipment);
		sb.append(", equipmentModel=");
		sb.append(equipmentModel);
		sb.append(", equipmentSerial=");
		sb.append(equipmentSerial);
		sb.append(", operatingPotential=");
		sb.append(operatingPotential);
		sb.append(", equipmentModels=");
		sb.append(equipmentModels);
		sb.append(", natureEquipment=");
		sb.append(natureEquipment);
		sb.append(", equipmentStatusDetail=");
		sb.append(equipmentStatusDetail);
		sb.append(", equipmentDate=");
		sb.append(equipmentDate);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public GenerateEquipmentInfo toEntityModel() {
		GenerateEquipmentInfoImpl generateEquipmentInfoImpl =
			new GenerateEquipmentInfoImpl();

		generateEquipmentInfoImpl.setGenerateEquipmentInfoId(
			GenerateEquipmentInfoId);
		generateEquipmentInfoImpl.setGroupId(groupId);
		generateEquipmentInfoImpl.setCompanyId(companyId);
		generateEquipmentInfoImpl.setUserId(userId);

		if (userName == null) {
			generateEquipmentInfoImpl.setUserName("");
		}
		else {
			generateEquipmentInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			generateEquipmentInfoImpl.setCreateDate(null);
		}
		else {
			generateEquipmentInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			generateEquipmentInfoImpl.setModifiedDate(null);
		}
		else {
			generateEquipmentInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (manufacturerEquipment == null) {
			generateEquipmentInfoImpl.setManufacturerEquipment("");
		}
		else {
			generateEquipmentInfoImpl.setManufacturerEquipment(
				manufacturerEquipment);
		}

		if (equipmentModel == null) {
			generateEquipmentInfoImpl.setEquipmentModel("");
		}
		else {
			generateEquipmentInfoImpl.setEquipmentModel(equipmentModel);
		}

		if (equipmentSerial == null) {
			generateEquipmentInfoImpl.setEquipmentSerial("");
		}
		else {
			generateEquipmentInfoImpl.setEquipmentSerial(equipmentSerial);
		}

		if (operatingPotential == null) {
			generateEquipmentInfoImpl.setOperatingPotential("");
		}
		else {
			generateEquipmentInfoImpl.setOperatingPotential(operatingPotential);
		}

		if (equipmentModels == null) {
			generateEquipmentInfoImpl.setEquipmentModels("");
		}
		else {
			generateEquipmentInfoImpl.setEquipmentModels(equipmentModels);
		}

		if (natureEquipment == null) {
			generateEquipmentInfoImpl.setNatureEquipment("");
		}
		else {
			generateEquipmentInfoImpl.setNatureEquipment(natureEquipment);
		}

		if (equipmentStatusDetail == null) {
			generateEquipmentInfoImpl.setEquipmentStatusDetail("");
		}
		else {
			generateEquipmentInfoImpl.setEquipmentStatusDetail(
				equipmentStatusDetail);
		}

		if (equipmentDate == Long.MIN_VALUE) {
			generateEquipmentInfoImpl.setEquipmentDate(null);
		}
		else {
			generateEquipmentInfoImpl.setEquipmentDate(new Date(equipmentDate));
		}

		generateEquipmentInfoImpl.setHsraApplicationId(hsraApplicationId);

		generateEquipmentInfoImpl.resetOriginalValues();

		return generateEquipmentInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		GenerateEquipmentInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		manufacturerEquipment = objectInput.readUTF();
		equipmentModel = objectInput.readUTF();
		equipmentSerial = objectInput.readUTF();
		operatingPotential = objectInput.readUTF();
		equipmentModels = objectInput.readUTF();
		natureEquipment = objectInput.readUTF();
		equipmentStatusDetail = objectInput.readUTF();
		equipmentDate = objectInput.readLong();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(GenerateEquipmentInfoId);

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

		if (manufacturerEquipment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manufacturerEquipment);
		}

		if (equipmentModel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipmentModel);
		}

		if (equipmentSerial == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipmentSerial);
		}

		if (operatingPotential == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(operatingPotential);
		}

		if (equipmentModels == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipmentModels);
		}

		if (natureEquipment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(natureEquipment);
		}

		if (equipmentStatusDetail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipmentStatusDetail);
		}

		objectOutput.writeLong(equipmentDate);

		objectOutput.writeLong(hsraApplicationId);
	}

	public long GenerateEquipmentInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String manufacturerEquipment;
	public String equipmentModel;
	public String equipmentSerial;
	public String operatingPotential;
	public String equipmentModels;
	public String natureEquipment;
	public String equipmentStatusDetail;
	public long equipmentDate;
	public long hsraApplicationId;

}