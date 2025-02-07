/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismGroundTransBox;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismGroundTransBox in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismGroundTransBoxCacheModel
	implements CacheModel<TourismGroundTransBox>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismGroundTransBoxCacheModel)) {
			return false;
		}

		TourismGroundTransBoxCacheModel tourismGroundTransBoxCacheModel =
			(TourismGroundTransBoxCacheModel)object;

		if (tourismVehicleBoxId ==
				tourismGroundTransBoxCacheModel.tourismVehicleBoxId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismVehicleBoxId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{tourismVehicleBoxId=");
		sb.append(tourismVehicleBoxId);
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
		sb.append(", vehicleMake=");
		sb.append(vehicleMake);
		sb.append(", vehiclemodel=");
		sb.append(vehiclemodel);
		sb.append(", vehicleYear=");
		sb.append(vehicleYear);
		sb.append(", vehicleCounter=");
		sb.append(vehicleCounter);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismGroundTransBox toEntityModel() {
		TourismGroundTransBoxImpl tourismGroundTransBoxImpl =
			new TourismGroundTransBoxImpl();

		tourismGroundTransBoxImpl.setTourismVehicleBoxId(tourismVehicleBoxId);
		tourismGroundTransBoxImpl.setGroupId(groupId);
		tourismGroundTransBoxImpl.setCompanyId(companyId);
		tourismGroundTransBoxImpl.setUserId(userId);

		if (userName == null) {
			tourismGroundTransBoxImpl.setUserName("");
		}
		else {
			tourismGroundTransBoxImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismGroundTransBoxImpl.setCreateDate(null);
		}
		else {
			tourismGroundTransBoxImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismGroundTransBoxImpl.setModifiedDate(null);
		}
		else {
			tourismGroundTransBoxImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (vehicleMake == null) {
			tourismGroundTransBoxImpl.setVehicleMake("");
		}
		else {
			tourismGroundTransBoxImpl.setVehicleMake(vehicleMake);
		}

		if (vehiclemodel == null) {
			tourismGroundTransBoxImpl.setVehiclemodel("");
		}
		else {
			tourismGroundTransBoxImpl.setVehiclemodel(vehiclemodel);
		}

		if (vehicleYear == null) {
			tourismGroundTransBoxImpl.setVehicleYear("");
		}
		else {
			tourismGroundTransBoxImpl.setVehicleYear(vehicleYear);
		}

		if (vehicleCounter == null) {
			tourismGroundTransBoxImpl.setVehicleCounter("");
		}
		else {
			tourismGroundTransBoxImpl.setVehicleCounter(vehicleCounter);
		}

		tourismGroundTransBoxImpl.setTourismApplicationId(tourismApplicationId);

		tourismGroundTransBoxImpl.resetOriginalValues();

		return tourismGroundTransBoxImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismVehicleBoxId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		vehicleMake = objectInput.readUTF();
		vehiclemodel = objectInput.readUTF();
		vehicleYear = objectInput.readUTF();
		vehicleCounter = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismVehicleBoxId);

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

		if (vehicleMake == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(vehicleMake);
		}

		if (vehiclemodel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(vehiclemodel);
		}

		if (vehicleYear == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(vehicleYear);
		}

		if (vehicleCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(vehicleCounter);
		}

		objectOutput.writeLong(tourismApplicationId);
	}

	public long tourismVehicleBoxId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String vehicleMake;
	public String vehiclemodel;
	public String vehicleYear;
	public String vehicleCounter;
	public long tourismApplicationId;

}