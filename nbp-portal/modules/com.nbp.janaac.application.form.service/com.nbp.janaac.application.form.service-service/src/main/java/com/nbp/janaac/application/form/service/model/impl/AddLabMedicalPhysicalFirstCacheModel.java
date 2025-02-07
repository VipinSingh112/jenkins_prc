/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalFirst;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddLabMedicalPhysicalFirst in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddLabMedicalPhysicalFirstCacheModel
	implements CacheModel<AddLabMedicalPhysicalFirst>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddLabMedicalPhysicalFirstCacheModel)) {
			return false;
		}

		AddLabMedicalPhysicalFirstCacheModel
			addLabMedicalPhysicalFirstCacheModel =
				(AddLabMedicalPhysicalFirstCacheModel)object;

		if (addLabMedicalPhysicalFirstId ==
				addLabMedicalPhysicalFirstCacheModel.
					addLabMedicalPhysicalFirstId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addLabMedicalPhysicalFirstId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{addLabMedicalPhysicalFirstId=");
		sb.append(addLabMedicalPhysicalFirstId);
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
		sb.append(", inventoryNum=");
		sb.append(inventoryNum);
		sb.append(", item=");
		sb.append(item);
		sb.append(", manufacturer=");
		sb.append(manufacturer);
		sb.append(", modelNum=");
		sb.append(modelNum);
		sb.append(", calibrationInterval=");
		sb.append(calibrationInterval);
		sb.append(", calibratedBy=");
		sb.append(calibratedBy);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append(", counter=");
		sb.append(counter);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AddLabMedicalPhysicalFirst toEntityModel() {
		AddLabMedicalPhysicalFirstImpl addLabMedicalPhysicalFirstImpl =
			new AddLabMedicalPhysicalFirstImpl();

		addLabMedicalPhysicalFirstImpl.setAddLabMedicalPhysicalFirstId(
			addLabMedicalPhysicalFirstId);
		addLabMedicalPhysicalFirstImpl.setGroupId(groupId);
		addLabMedicalPhysicalFirstImpl.setCompanyId(companyId);
		addLabMedicalPhysicalFirstImpl.setUserId(userId);

		if (userName == null) {
			addLabMedicalPhysicalFirstImpl.setUserName("");
		}
		else {
			addLabMedicalPhysicalFirstImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addLabMedicalPhysicalFirstImpl.setCreateDate(null);
		}
		else {
			addLabMedicalPhysicalFirstImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addLabMedicalPhysicalFirstImpl.setModifiedDate(null);
		}
		else {
			addLabMedicalPhysicalFirstImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (inventoryNum == null) {
			addLabMedicalPhysicalFirstImpl.setInventoryNum("");
		}
		else {
			addLabMedicalPhysicalFirstImpl.setInventoryNum(inventoryNum);
		}

		if (item == null) {
			addLabMedicalPhysicalFirstImpl.setItem("");
		}
		else {
			addLabMedicalPhysicalFirstImpl.setItem(item);
		}

		if (manufacturer == null) {
			addLabMedicalPhysicalFirstImpl.setManufacturer("");
		}
		else {
			addLabMedicalPhysicalFirstImpl.setManufacturer(manufacturer);
		}

		if (modelNum == null) {
			addLabMedicalPhysicalFirstImpl.setModelNum("");
		}
		else {
			addLabMedicalPhysicalFirstImpl.setModelNum(modelNum);
		}

		if (calibrationInterval == null) {
			addLabMedicalPhysicalFirstImpl.setCalibrationInterval("");
		}
		else {
			addLabMedicalPhysicalFirstImpl.setCalibrationInterval(
				calibrationInterval);
		}

		if (calibratedBy == null) {
			addLabMedicalPhysicalFirstImpl.setCalibratedBy("");
		}
		else {
			addLabMedicalPhysicalFirstImpl.setCalibratedBy(calibratedBy);
		}

		addLabMedicalPhysicalFirstImpl.setJanaacApplicationId(
			janaacApplicationId);

		if (counter == null) {
			addLabMedicalPhysicalFirstImpl.setCounter("");
		}
		else {
			addLabMedicalPhysicalFirstImpl.setCounter(counter);
		}

		addLabMedicalPhysicalFirstImpl.resetOriginalValues();

		return addLabMedicalPhysicalFirstImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		addLabMedicalPhysicalFirstId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		inventoryNum = objectInput.readUTF();
		item = objectInput.readUTF();
		manufacturer = objectInput.readUTF();
		modelNum = objectInput.readUTF();
		calibrationInterval = objectInput.readUTF();
		calibratedBy = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
		counter = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(addLabMedicalPhysicalFirstId);

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

		if (inventoryNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(inventoryNum);
		}

		if (item == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(item);
		}

		if (manufacturer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manufacturer);
		}

		if (modelNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(modelNum);
		}

		if (calibrationInterval == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(calibrationInterval);
		}

		if (calibratedBy == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(calibratedBy);
		}

		objectOutput.writeLong(janaacApplicationId);

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}
	}

	public long addLabMedicalPhysicalFirstId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String inventoryNum;
	public String item;
	public String manufacturer;
	public String modelNum;
	public String calibrationInterval;
	public String calibratedBy;
	public long janaacApplicationId;
	public String counter;

}