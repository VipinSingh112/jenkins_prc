/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AddLabCalibraStrucReqSec;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddLabCalibraStrucReqSec in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddLabCalibraStrucReqSecCacheModel
	implements CacheModel<AddLabCalibraStrucReqSec>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddLabCalibraStrucReqSecCacheModel)) {
			return false;
		}

		AddLabCalibraStrucReqSecCacheModel addLabCalibraStrucReqSecCacheModel =
			(AddLabCalibraStrucReqSecCacheModel)object;

		if (addLabCalibraStrucReqSecId ==
				addLabCalibraStrucReqSecCacheModel.addLabCalibraStrucReqSecId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addLabCalibraStrucReqSecId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{addLabCalibraStrucReqSecId=");
		sb.append(addLabCalibraStrucReqSecId);
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
		sb.append(", number=");
		sb.append(number);
		sb.append(", measuredQuantity=");
		sb.append(measuredQuantity);
		sb.append(", calibrationItem=");
		sb.append(calibrationItem);
		sb.append(", range=");
		sb.append(range);
		sb.append(", measurementProcedure=");
		sb.append(measurementProcedure);
		sb.append(", calibration=");
		sb.append(calibration);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append(", counter=");
		sb.append(counter);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AddLabCalibraStrucReqSec toEntityModel() {
		AddLabCalibraStrucReqSecImpl addLabCalibraStrucReqSecImpl =
			new AddLabCalibraStrucReqSecImpl();

		addLabCalibraStrucReqSecImpl.setAddLabCalibraStrucReqSecId(
			addLabCalibraStrucReqSecId);
		addLabCalibraStrucReqSecImpl.setGroupId(groupId);
		addLabCalibraStrucReqSecImpl.setCompanyId(companyId);
		addLabCalibraStrucReqSecImpl.setUserId(userId);

		if (userName == null) {
			addLabCalibraStrucReqSecImpl.setUserName("");
		}
		else {
			addLabCalibraStrucReqSecImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addLabCalibraStrucReqSecImpl.setCreateDate(null);
		}
		else {
			addLabCalibraStrucReqSecImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addLabCalibraStrucReqSecImpl.setModifiedDate(null);
		}
		else {
			addLabCalibraStrucReqSecImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (number == null) {
			addLabCalibraStrucReqSecImpl.setNumber("");
		}
		else {
			addLabCalibraStrucReqSecImpl.setNumber(number);
		}

		if (measuredQuantity == null) {
			addLabCalibraStrucReqSecImpl.setMeasuredQuantity("");
		}
		else {
			addLabCalibraStrucReqSecImpl.setMeasuredQuantity(measuredQuantity);
		}

		if (calibrationItem == null) {
			addLabCalibraStrucReqSecImpl.setCalibrationItem("");
		}
		else {
			addLabCalibraStrucReqSecImpl.setCalibrationItem(calibrationItem);
		}

		if (range == null) {
			addLabCalibraStrucReqSecImpl.setRange("");
		}
		else {
			addLabCalibraStrucReqSecImpl.setRange(range);
		}

		if (measurementProcedure == null) {
			addLabCalibraStrucReqSecImpl.setMeasurementProcedure("");
		}
		else {
			addLabCalibraStrucReqSecImpl.setMeasurementProcedure(
				measurementProcedure);
		}

		if (calibration == null) {
			addLabCalibraStrucReqSecImpl.setCalibration("");
		}
		else {
			addLabCalibraStrucReqSecImpl.setCalibration(calibration);
		}

		if (remarks == null) {
			addLabCalibraStrucReqSecImpl.setRemarks("");
		}
		else {
			addLabCalibraStrucReqSecImpl.setRemarks(remarks);
		}

		addLabCalibraStrucReqSecImpl.setJanaacApplicationId(
			janaacApplicationId);

		if (counter == null) {
			addLabCalibraStrucReqSecImpl.setCounter("");
		}
		else {
			addLabCalibraStrucReqSecImpl.setCounter(counter);
		}

		addLabCalibraStrucReqSecImpl.resetOriginalValues();

		return addLabCalibraStrucReqSecImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		addLabCalibraStrucReqSecId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		number = objectInput.readUTF();
		measuredQuantity = objectInput.readUTF();
		calibrationItem = objectInput.readUTF();
		range = objectInput.readUTF();
		measurementProcedure = objectInput.readUTF();
		calibration = objectInput.readUTF();
		remarks = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
		counter = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(addLabCalibraStrucReqSecId);

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

		if (number == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(number);
		}

		if (measuredQuantity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(measuredQuantity);
		}

		if (calibrationItem == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(calibrationItem);
		}

		if (range == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(range);
		}

		if (measurementProcedure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(measurementProcedure);
		}

		if (calibration == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(calibration);
		}

		if (remarks == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		objectOutput.writeLong(janaacApplicationId);

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}
	}

	public long addLabCalibraStrucReqSecId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String number;
	public String measuredQuantity;
	public String calibrationItem;
	public String range;
	public String measurementProcedure;
	public String calibration;
	public String remarks;
	public long janaacApplicationId;
	public String counter;

}