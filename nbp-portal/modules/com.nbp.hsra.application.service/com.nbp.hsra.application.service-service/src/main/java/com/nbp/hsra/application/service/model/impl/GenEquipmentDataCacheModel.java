/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.GenEquipmentData;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing GenEquipmentData in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class GenEquipmentDataCacheModel
	implements CacheModel<GenEquipmentData>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof GenEquipmentDataCacheModel)) {
			return false;
		}

		GenEquipmentDataCacheModel genEquipmentDataCacheModel =
			(GenEquipmentDataCacheModel)object;

		if (genEquipmentDataId ==
				genEquipmentDataCacheModel.genEquipmentDataId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, genEquipmentDataId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{genEquipmentDataId=");
		sb.append(genEquipmentDataId);
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
		sb.append(", natureEquipment=");
		sb.append(natureEquipment);
		sb.append(", radiationGeneratingLoc=");
		sb.append(radiationGeneratingLoc);
		sb.append(", equipmentModels=");
		sb.append(equipmentModels);
		sb.append(", equipmentStatusDetail=");
		sb.append(equipmentStatusDetail);
		sb.append(", equipmentDate=");
		sb.append(equipmentDate);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public GenEquipmentData toEntityModel() {
		GenEquipmentDataImpl genEquipmentDataImpl = new GenEquipmentDataImpl();

		genEquipmentDataImpl.setGenEquipmentDataId(genEquipmentDataId);
		genEquipmentDataImpl.setGroupId(groupId);
		genEquipmentDataImpl.setCompanyId(companyId);
		genEquipmentDataImpl.setUserId(userId);

		if (userName == null) {
			genEquipmentDataImpl.setUserName("");
		}
		else {
			genEquipmentDataImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			genEquipmentDataImpl.setCreateDate(null);
		}
		else {
			genEquipmentDataImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			genEquipmentDataImpl.setModifiedDate(null);
		}
		else {
			genEquipmentDataImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (manufacturerEquipment == null) {
			genEquipmentDataImpl.setManufacturerEquipment("");
		}
		else {
			genEquipmentDataImpl.setManufacturerEquipment(
				manufacturerEquipment);
		}

		if (equipmentModel == null) {
			genEquipmentDataImpl.setEquipmentModel("");
		}
		else {
			genEquipmentDataImpl.setEquipmentModel(equipmentModel);
		}

		if (equipmentSerial == null) {
			genEquipmentDataImpl.setEquipmentSerial("");
		}
		else {
			genEquipmentDataImpl.setEquipmentSerial(equipmentSerial);
		}

		if (operatingPotential == null) {
			genEquipmentDataImpl.setOperatingPotential("");
		}
		else {
			genEquipmentDataImpl.setOperatingPotential(operatingPotential);
		}

		if (natureEquipment == null) {
			genEquipmentDataImpl.setNatureEquipment("");
		}
		else {
			genEquipmentDataImpl.setNatureEquipment(natureEquipment);
		}

		if (radiationGeneratingLoc == null) {
			genEquipmentDataImpl.setRadiationGeneratingLoc("");
		}
		else {
			genEquipmentDataImpl.setRadiationGeneratingLoc(
				radiationGeneratingLoc);
		}

		if (equipmentModels == null) {
			genEquipmentDataImpl.setEquipmentModels("");
		}
		else {
			genEquipmentDataImpl.setEquipmentModels(equipmentModels);
		}

		if (equipmentStatusDetail == null) {
			genEquipmentDataImpl.setEquipmentStatusDetail("");
		}
		else {
			genEquipmentDataImpl.setEquipmentStatusDetail(
				equipmentStatusDetail);
		}

		if (equipmentDate == Long.MIN_VALUE) {
			genEquipmentDataImpl.setEquipmentDate(null);
		}
		else {
			genEquipmentDataImpl.setEquipmentDate(new Date(equipmentDate));
		}

		if (counter == null) {
			genEquipmentDataImpl.setCounter("");
		}
		else {
			genEquipmentDataImpl.setCounter(counter);
		}

		genEquipmentDataImpl.setHsraApplicationId(hsraApplicationId);

		genEquipmentDataImpl.resetOriginalValues();

		return genEquipmentDataImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		genEquipmentDataId = objectInput.readLong();

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
		natureEquipment = objectInput.readUTF();
		radiationGeneratingLoc = objectInput.readUTF();
		equipmentModels = objectInput.readUTF();
		equipmentStatusDetail = objectInput.readUTF();
		equipmentDate = objectInput.readLong();
		counter = objectInput.readUTF();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(genEquipmentDataId);

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

		if (natureEquipment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(natureEquipment);
		}

		if (radiationGeneratingLoc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(radiationGeneratingLoc);
		}

		if (equipmentModels == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipmentModels);
		}

		if (equipmentStatusDetail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipmentStatusDetail);
		}

		objectOutput.writeLong(equipmentDate);

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(hsraApplicationId);
	}

	public long genEquipmentDataId;
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
	public String natureEquipment;
	public String radiationGeneratingLoc;
	public String equipmentModels;
	public String equipmentStatusDetail;
	public long equipmentDate;
	public String counter;
	public long hsraApplicationId;

}