/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransBox;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismBonaGroundTransBox in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismBonaGroundTransBoxCacheModel
	implements CacheModel<TourismBonaGroundTransBox>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismBonaGroundTransBoxCacheModel)) {
			return false;
		}

		TourismBonaGroundTransBoxCacheModel
			tourismBonaGroundTransBoxCacheModel =
				(TourismBonaGroundTransBoxCacheModel)object;

		if (tourismVehicleBoxBonaId ==
				tourismBonaGroundTransBoxCacheModel.tourismVehicleBoxBonaId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismVehicleBoxBonaId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{tourismVehicleBoxBonaId=");
		sb.append(tourismVehicleBoxBonaId);
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
		sb.append(", vehicleMakeBona=");
		sb.append(vehicleMakeBona);
		sb.append(", vehiclemodelBona=");
		sb.append(vehiclemodelBona);
		sb.append(", vehicleYearBona=");
		sb.append(vehicleYearBona);
		sb.append(", vehicleCounter=");
		sb.append(vehicleCounter);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismBonaGroundTransBox toEntityModel() {
		TourismBonaGroundTransBoxImpl tourismBonaGroundTransBoxImpl =
			new TourismBonaGroundTransBoxImpl();

		tourismBonaGroundTransBoxImpl.setTourismVehicleBoxBonaId(
			tourismVehicleBoxBonaId);
		tourismBonaGroundTransBoxImpl.setGroupId(groupId);
		tourismBonaGroundTransBoxImpl.setCompanyId(companyId);
		tourismBonaGroundTransBoxImpl.setUserId(userId);

		if (userName == null) {
			tourismBonaGroundTransBoxImpl.setUserName("");
		}
		else {
			tourismBonaGroundTransBoxImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismBonaGroundTransBoxImpl.setCreateDate(null);
		}
		else {
			tourismBonaGroundTransBoxImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismBonaGroundTransBoxImpl.setModifiedDate(null);
		}
		else {
			tourismBonaGroundTransBoxImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (vehicleMakeBona == null) {
			tourismBonaGroundTransBoxImpl.setVehicleMakeBona("");
		}
		else {
			tourismBonaGroundTransBoxImpl.setVehicleMakeBona(vehicleMakeBona);
		}

		if (vehiclemodelBona == null) {
			tourismBonaGroundTransBoxImpl.setVehiclemodelBona("");
		}
		else {
			tourismBonaGroundTransBoxImpl.setVehiclemodelBona(vehiclemodelBona);
		}

		if (vehicleYearBona == null) {
			tourismBonaGroundTransBoxImpl.setVehicleYearBona("");
		}
		else {
			tourismBonaGroundTransBoxImpl.setVehicleYearBona(vehicleYearBona);
		}

		if (vehicleCounter == null) {
			tourismBonaGroundTransBoxImpl.setVehicleCounter("");
		}
		else {
			tourismBonaGroundTransBoxImpl.setVehicleCounter(vehicleCounter);
		}

		tourismBonaGroundTransBoxImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismBonaGroundTransBoxImpl.resetOriginalValues();

		return tourismBonaGroundTransBoxImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismVehicleBoxBonaId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		vehicleMakeBona = objectInput.readUTF();
		vehiclemodelBona = objectInput.readUTF();
		vehicleYearBona = objectInput.readUTF();
		vehicleCounter = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismVehicleBoxBonaId);

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

		if (vehicleMakeBona == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(vehicleMakeBona);
		}

		if (vehiclemodelBona == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(vehiclemodelBona);
		}

		if (vehicleYearBona == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(vehicleYearBona);
		}

		if (vehicleCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(vehicleCounter);
		}

		objectOutput.writeLong(tourismApplicationId);
	}

	public long tourismVehicleBoxBonaId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String vehicleMakeBona;
	public String vehiclemodelBona;
	public String vehicleYearBona;
	public String vehicleCounter;
	public long tourismApplicationId;

}