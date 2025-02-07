/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AddLabResourceReqSec;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddLabResourceReqSec in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddLabResourceReqSecCacheModel
	implements CacheModel<AddLabResourceReqSec>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddLabResourceReqSecCacheModel)) {
			return false;
		}

		AddLabResourceReqSecCacheModel addLabResourceReqSecCacheModel =
			(AddLabResourceReqSecCacheModel)object;

		if (addLabResourceReqSecId ==
				addLabResourceReqSecCacheModel.addLabResourceReqSecId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addLabResourceReqSecId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{addLabResourceReqSecId=");
		sb.append(addLabResourceReqSecId);
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
	public AddLabResourceReqSec toEntityModel() {
		AddLabResourceReqSecImpl addLabResourceReqSecImpl =
			new AddLabResourceReqSecImpl();

		addLabResourceReqSecImpl.setAddLabResourceReqSecId(
			addLabResourceReqSecId);
		addLabResourceReqSecImpl.setGroupId(groupId);
		addLabResourceReqSecImpl.setCompanyId(companyId);
		addLabResourceReqSecImpl.setUserId(userId);

		if (userName == null) {
			addLabResourceReqSecImpl.setUserName("");
		}
		else {
			addLabResourceReqSecImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addLabResourceReqSecImpl.setCreateDate(null);
		}
		else {
			addLabResourceReqSecImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addLabResourceReqSecImpl.setModifiedDate(null);
		}
		else {
			addLabResourceReqSecImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (inventoryNumber == null) {
			addLabResourceReqSecImpl.setInventoryNumber("");
		}
		else {
			addLabResourceReqSecImpl.setInventoryNumber(inventoryNumber);
		}

		if (item == null) {
			addLabResourceReqSecImpl.setItem("");
		}
		else {
			addLabResourceReqSecImpl.setItem(item);
		}

		if (manufacturer == null) {
			addLabResourceReqSecImpl.setManufacturer("");
		}
		else {
			addLabResourceReqSecImpl.setManufacturer(manufacturer);
		}

		if (modelNumber == null) {
			addLabResourceReqSecImpl.setModelNumber("");
		}
		else {
			addLabResourceReqSecImpl.setModelNumber(modelNumber);
		}

		if (calibrationInterval == null) {
			addLabResourceReqSecImpl.setCalibrationInterval("");
		}
		else {
			addLabResourceReqSecImpl.setCalibrationInterval(
				calibrationInterval);
		}

		if (calibratedBy == null) {
			addLabResourceReqSecImpl.setCalibratedBy("");
		}
		else {
			addLabResourceReqSecImpl.setCalibratedBy(calibratedBy);
		}

		addLabResourceReqSecImpl.setJanaacApplicationId(janaacApplicationId);

		if (counter == null) {
			addLabResourceReqSecImpl.setCounter("");
		}
		else {
			addLabResourceReqSecImpl.setCounter(counter);
		}

		addLabResourceReqSecImpl.resetOriginalValues();

		return addLabResourceReqSecImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		addLabResourceReqSecId = objectInput.readLong();

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
		objectOutput.writeLong(addLabResourceReqSecId);

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

	public long addLabResourceReqSecId;
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