/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismNewVehicleAddBox;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismNewVehicleAddBox in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismNewVehicleAddBoxCacheModel
	implements CacheModel<TourismNewVehicleAddBox>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismNewVehicleAddBoxCacheModel)) {
			return false;
		}

		TourismNewVehicleAddBoxCacheModel tourismNewVehicleAddBoxCacheModel =
			(TourismNewVehicleAddBoxCacheModel)object;

		if (tourismNewVehBoxId ==
				tourismNewVehicleAddBoxCacheModel.tourismNewVehBoxId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismNewVehBoxId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{tourismNewVehBoxId=");
		sb.append(tourismNewVehBoxId);
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
		sb.append(", newMake=");
		sb.append(newMake);
		sb.append(", newYear=");
		sb.append(newYear);
		sb.append(", newModel=");
		sb.append(newModel);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismNewVehicleAddBox toEntityModel() {
		TourismNewVehicleAddBoxImpl tourismNewVehicleAddBoxImpl =
			new TourismNewVehicleAddBoxImpl();

		tourismNewVehicleAddBoxImpl.setTourismNewVehBoxId(tourismNewVehBoxId);
		tourismNewVehicleAddBoxImpl.setGroupId(groupId);
		tourismNewVehicleAddBoxImpl.setCompanyId(companyId);
		tourismNewVehicleAddBoxImpl.setUserId(userId);

		if (userName == null) {
			tourismNewVehicleAddBoxImpl.setUserName("");
		}
		else {
			tourismNewVehicleAddBoxImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismNewVehicleAddBoxImpl.setCreateDate(null);
		}
		else {
			tourismNewVehicleAddBoxImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismNewVehicleAddBoxImpl.setModifiedDate(null);
		}
		else {
			tourismNewVehicleAddBoxImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (newMake == null) {
			tourismNewVehicleAddBoxImpl.setNewMake("");
		}
		else {
			tourismNewVehicleAddBoxImpl.setNewMake(newMake);
		}

		if (newYear == null) {
			tourismNewVehicleAddBoxImpl.setNewYear("");
		}
		else {
			tourismNewVehicleAddBoxImpl.setNewYear(newYear);
		}

		if (newModel == null) {
			tourismNewVehicleAddBoxImpl.setNewModel("");
		}
		else {
			tourismNewVehicleAddBoxImpl.setNewModel(newModel);
		}

		tourismNewVehicleAddBoxImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismNewVehicleAddBoxImpl.resetOriginalValues();

		return tourismNewVehicleAddBoxImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismNewVehBoxId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		newMake = objectInput.readUTF();
		newYear = objectInput.readUTF();
		newModel = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismNewVehBoxId);

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

		if (newMake == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newMake);
		}

		if (newYear == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newYear);
		}

		if (newModel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newModel);
		}

		objectOutput.writeLong(tourismApplicationId);
	}

	public long tourismNewVehBoxId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String newMake;
	public String newYear;
	public String newModel;
	public long tourismApplicationId;

}