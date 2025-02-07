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

package com.nbp.farm.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.farm.application.form.service.model.FarmerProperty;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FarmerProperty in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FarmerPropertyCacheModel
	implements CacheModel<FarmerProperty>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FarmerPropertyCacheModel)) {
			return false;
		}

		FarmerPropertyCacheModel farmerPropertyCacheModel =
			(FarmerPropertyCacheModel)object;

		if (farmerPropertyId == farmerPropertyCacheModel.farmerPropertyId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, farmerPropertyId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{farmerPropertyId=");
		sb.append(farmerPropertyId);
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
		sb.append(", property01Extension=");
		sb.append(property01Extension);
		sb.append(", property01District=");
		sb.append(property01District);
		sb.append(", property01Tenure=");
		sb.append(property01Tenure);
		sb.append(", property01Status=");
		sb.append(property01Status);
		sb.append(", property01Size=");
		sb.append(property01Size);
		sb.append(", property01Usage=");
		sb.append(property01Usage);
		sb.append(", property01Volume=");
		sb.append(property01Volume);
		sb.append(", property01Folio=");
		sb.append(property01Folio);
		sb.append(", property01DistanceFromRoad=");
		sb.append(property01DistanceFromRoad);
		sb.append(", propertyId02=");
		sb.append(propertyId02);
		sb.append(", propertyId03=");
		sb.append(propertyId03);
		sb.append(", propertyCounter=");
		sb.append(propertyCounter);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", farmerApplicationId=");
		sb.append(farmerApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FarmerProperty toEntityModel() {
		FarmerPropertyImpl farmerPropertyImpl = new FarmerPropertyImpl();

		farmerPropertyImpl.setFarmerPropertyId(farmerPropertyId);
		farmerPropertyImpl.setGroupId(groupId);
		farmerPropertyImpl.setCompanyId(companyId);
		farmerPropertyImpl.setUserId(userId);

		if (userName == null) {
			farmerPropertyImpl.setUserName("");
		}
		else {
			farmerPropertyImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			farmerPropertyImpl.setCreateDate(null);
		}
		else {
			farmerPropertyImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			farmerPropertyImpl.setModifiedDate(null);
		}
		else {
			farmerPropertyImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (property01Extension == null) {
			farmerPropertyImpl.setProperty01Extension("");
		}
		else {
			farmerPropertyImpl.setProperty01Extension(property01Extension);
		}

		if (property01District == null) {
			farmerPropertyImpl.setProperty01District("");
		}
		else {
			farmerPropertyImpl.setProperty01District(property01District);
		}

		if (property01Tenure == null) {
			farmerPropertyImpl.setProperty01Tenure("");
		}
		else {
			farmerPropertyImpl.setProperty01Tenure(property01Tenure);
		}

		if (property01Status == null) {
			farmerPropertyImpl.setProperty01Status("");
		}
		else {
			farmerPropertyImpl.setProperty01Status(property01Status);
		}

		if (property01Size == null) {
			farmerPropertyImpl.setProperty01Size("");
		}
		else {
			farmerPropertyImpl.setProperty01Size(property01Size);
		}

		if (property01Usage == null) {
			farmerPropertyImpl.setProperty01Usage("");
		}
		else {
			farmerPropertyImpl.setProperty01Usage(property01Usage);
		}

		if (property01Volume == null) {
			farmerPropertyImpl.setProperty01Volume("");
		}
		else {
			farmerPropertyImpl.setProperty01Volume(property01Volume);
		}

		if (property01Folio == null) {
			farmerPropertyImpl.setProperty01Folio("");
		}
		else {
			farmerPropertyImpl.setProperty01Folio(property01Folio);
		}

		if (property01DistanceFromRoad == null) {
			farmerPropertyImpl.setProperty01DistanceFromRoad("");
		}
		else {
			farmerPropertyImpl.setProperty01DistanceFromRoad(
				property01DistanceFromRoad);
		}

		if (propertyId02 == null) {
			farmerPropertyImpl.setPropertyId02("");
		}
		else {
			farmerPropertyImpl.setPropertyId02(propertyId02);
		}

		if (propertyId03 == null) {
			farmerPropertyImpl.setPropertyId03("");
		}
		else {
			farmerPropertyImpl.setPropertyId03(propertyId03);
		}

		if (propertyCounter == null) {
			farmerPropertyImpl.setPropertyCounter("");
		}
		else {
			farmerPropertyImpl.setPropertyCounter(propertyCounter);
		}

		if (remarks == null) {
			farmerPropertyImpl.setRemarks("");
		}
		else {
			farmerPropertyImpl.setRemarks(remarks);
		}

		farmerPropertyImpl.setFarmerApplicationId(farmerApplicationId);

		farmerPropertyImpl.resetOriginalValues();

		return farmerPropertyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		farmerPropertyId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		property01Extension = objectInput.readUTF();
		property01District = objectInput.readUTF();
		property01Tenure = objectInput.readUTF();
		property01Status = objectInput.readUTF();
		property01Size = objectInput.readUTF();
		property01Usage = objectInput.readUTF();
		property01Volume = objectInput.readUTF();
		property01Folio = objectInput.readUTF();
		property01DistanceFromRoad = objectInput.readUTF();
		propertyId02 = objectInput.readUTF();
		propertyId03 = objectInput.readUTF();
		propertyCounter = objectInput.readUTF();
		remarks = objectInput.readUTF();

		farmerApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(farmerPropertyId);

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

		if (property01Extension == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(property01Extension);
		}

		if (property01District == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(property01District);
		}

		if (property01Tenure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(property01Tenure);
		}

		if (property01Status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(property01Status);
		}

		if (property01Size == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(property01Size);
		}

		if (property01Usage == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(property01Usage);
		}

		if (property01Volume == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(property01Volume);
		}

		if (property01Folio == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(property01Folio);
		}

		if (property01DistanceFromRoad == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(property01DistanceFromRoad);
		}

		if (propertyId02 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propertyId02);
		}

		if (propertyId03 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propertyId03);
		}

		if (propertyCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propertyCounter);
		}

		if (remarks == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		objectOutput.writeLong(farmerApplicationId);
	}

	public long farmerPropertyId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String property01Extension;
	public String property01District;
	public String property01Tenure;
	public String property01Status;
	public String property01Size;
	public String property01Usage;
	public String property01Volume;
	public String property01Folio;
	public String property01DistanceFromRoad;
	public String propertyId02;
	public String propertyId03;
	public String propertyCounter;
	public String remarks;
	public long farmerApplicationId;

}