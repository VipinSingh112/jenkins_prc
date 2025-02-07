/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AddPhyResourceFirst;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddPhyResourceFirst in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddPhyResourceFirstCacheModel
	implements CacheModel<AddPhyResourceFirst>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddPhyResourceFirstCacheModel)) {
			return false;
		}

		AddPhyResourceFirstCacheModel addPhyResourceFirstCacheModel =
			(AddPhyResourceFirstCacheModel)object;

		if (addPhyResourceFirstId ==
				addPhyResourceFirstCacheModel.addPhyResourceFirstId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addPhyResourceFirstId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{addPhyResourceFirstId=");
		sb.append(addPhyResourceFirstId);
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
		sb.append(", inventoryNumber=");
		sb.append(inventoryNumber);
		sb.append(", item=");
		sb.append(item);
		sb.append(", manufacturer=");
		sb.append(manufacturer);
		sb.append(", modelNumber=");
		sb.append(modelNumber);
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
	public AddPhyResourceFirst toEntityModel() {
		AddPhyResourceFirstImpl addPhyResourceFirstImpl =
			new AddPhyResourceFirstImpl();

		addPhyResourceFirstImpl.setAddPhyResourceFirstId(addPhyResourceFirstId);
		addPhyResourceFirstImpl.setGroupId(groupId);
		addPhyResourceFirstImpl.setCompanyId(companyId);
		addPhyResourceFirstImpl.setUserId(userId);

		if (userName == null) {
			addPhyResourceFirstImpl.setUserName("");
		}
		else {
			addPhyResourceFirstImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addPhyResourceFirstImpl.setCreateDate(null);
		}
		else {
			addPhyResourceFirstImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addPhyResourceFirstImpl.setModifiedDate(null);
		}
		else {
			addPhyResourceFirstImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (inventoryNumber == null) {
			addPhyResourceFirstImpl.setInventoryNumber("");
		}
		else {
			addPhyResourceFirstImpl.setInventoryNumber(inventoryNumber);
		}

		if (item == null) {
			addPhyResourceFirstImpl.setItem("");
		}
		else {
			addPhyResourceFirstImpl.setItem(item);
		}

		if (manufacturer == null) {
			addPhyResourceFirstImpl.setManufacturer("");
		}
		else {
			addPhyResourceFirstImpl.setManufacturer(manufacturer);
		}

		if (modelNumber == null) {
			addPhyResourceFirstImpl.setModelNumber("");
		}
		else {
			addPhyResourceFirstImpl.setModelNumber(modelNumber);
		}

		if (calibrationInterval == null) {
			addPhyResourceFirstImpl.setCalibrationInterval("");
		}
		else {
			addPhyResourceFirstImpl.setCalibrationInterval(calibrationInterval);
		}

		if (calibratedBy == null) {
			addPhyResourceFirstImpl.setCalibratedBy("");
		}
		else {
			addPhyResourceFirstImpl.setCalibratedBy(calibratedBy);
		}

		addPhyResourceFirstImpl.setJanaacApplicationId(janaacApplicationId);

		if (counter == null) {
			addPhyResourceFirstImpl.setCounter("");
		}
		else {
			addPhyResourceFirstImpl.setCounter(counter);
		}

		addPhyResourceFirstImpl.resetOriginalValues();

		return addPhyResourceFirstImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		addPhyResourceFirstId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		inventoryNumber = objectInput.readUTF();
		item = objectInput.readUTF();
		manufacturer = objectInput.readUTF();
		modelNumber = objectInput.readUTF();
		calibrationInterval = objectInput.readUTF();
		calibratedBy = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
		counter = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(addPhyResourceFirstId);

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

		if (inventoryNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(inventoryNumber);
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

		if (modelNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(modelNumber);
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

	public long addPhyResourceFirstId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String inventoryNumber;
	public String item;
	public String manufacturer;
	public String modelNumber;
	public String calibrationInterval;
	public String calibratedBy;
	public long janaacApplicationId;
	public String counter;

}