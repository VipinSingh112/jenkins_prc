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

import com.nbp.tourism.application.form.services.model.TourismBonaVehicleAddBox;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismBonaVehicleAddBox in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismBonaVehicleAddBoxCacheModel
	implements CacheModel<TourismBonaVehicleAddBox>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismBonaVehicleAddBoxCacheModel)) {
			return false;
		}

		TourismBonaVehicleAddBoxCacheModel tourismBonaVehicleAddBoxCacheModel =
			(TourismBonaVehicleAddBoxCacheModel)object;

		if (tourismBonaVehBoxId ==
				tourismBonaVehicleAddBoxCacheModel.tourismBonaVehBoxId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismBonaVehBoxId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{tourismBonaVehBoxId=");
		sb.append(tourismBonaVehBoxId);
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
		sb.append(", bonaMake=");
		sb.append(bonaMake);
		sb.append(", bonaYear=");
		sb.append(bonaYear);
		sb.append(", bonaModel=");
		sb.append(bonaModel);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismBonaVehicleAddBox toEntityModel() {
		TourismBonaVehicleAddBoxImpl tourismBonaVehicleAddBoxImpl =
			new TourismBonaVehicleAddBoxImpl();

		tourismBonaVehicleAddBoxImpl.setTourismBonaVehBoxId(
			tourismBonaVehBoxId);
		tourismBonaVehicleAddBoxImpl.setGroupId(groupId);
		tourismBonaVehicleAddBoxImpl.setCompanyId(companyId);
		tourismBonaVehicleAddBoxImpl.setUserId(userId);

		if (userName == null) {
			tourismBonaVehicleAddBoxImpl.setUserName("");
		}
		else {
			tourismBonaVehicleAddBoxImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismBonaVehicleAddBoxImpl.setCreateDate(null);
		}
		else {
			tourismBonaVehicleAddBoxImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismBonaVehicleAddBoxImpl.setModifiedDate(null);
		}
		else {
			tourismBonaVehicleAddBoxImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (bonaMake == null) {
			tourismBonaVehicleAddBoxImpl.setBonaMake("");
		}
		else {
			tourismBonaVehicleAddBoxImpl.setBonaMake(bonaMake);
		}

		if (bonaYear == null) {
			tourismBonaVehicleAddBoxImpl.setBonaYear("");
		}
		else {
			tourismBonaVehicleAddBoxImpl.setBonaYear(bonaYear);
		}

		if (bonaModel == null) {
			tourismBonaVehicleAddBoxImpl.setBonaModel("");
		}
		else {
			tourismBonaVehicleAddBoxImpl.setBonaModel(bonaModel);
		}

		tourismBonaVehicleAddBoxImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismBonaVehicleAddBoxImpl.resetOriginalValues();

		return tourismBonaVehicleAddBoxImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismBonaVehBoxId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		bonaMake = objectInput.readUTF();
		bonaYear = objectInput.readUTF();
		bonaModel = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismBonaVehBoxId);

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

		if (bonaMake == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaMake);
		}

		if (bonaYear == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaYear);
		}

		if (bonaModel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaModel);
		}

		objectOutput.writeLong(tourismApplicationId);
	}

	public long tourismBonaVehBoxId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String bonaMake;
	public String bonaYear;
	public String bonaModel;
	public long tourismApplicationId;

}