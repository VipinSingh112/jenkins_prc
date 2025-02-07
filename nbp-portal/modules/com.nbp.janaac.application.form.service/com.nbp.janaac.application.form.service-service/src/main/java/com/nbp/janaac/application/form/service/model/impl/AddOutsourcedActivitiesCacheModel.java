/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AddOutsourcedActivities;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddOutsourcedActivities in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddOutsourcedActivitiesCacheModel
	implements CacheModel<AddOutsourcedActivities>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddOutsourcedActivitiesCacheModel)) {
			return false;
		}

		AddOutsourcedActivitiesCacheModel addOutsourcedActivitiesCacheModel =
			(AddOutsourcedActivitiesCacheModel)object;

		if (addOutsourcedActivitiesId ==
				addOutsourcedActivitiesCacheModel.addOutsourcedActivitiesId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addOutsourcedActivitiesId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{addOutsourcedActivitiesId=");
		sb.append(addOutsourcedActivitiesId);
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
		sb.append(", outSourcedActivity=");
		sb.append(outSourcedActivity);
		sb.append(", serviceProvider=");
		sb.append(serviceProvider);
		sb.append(", locationAddress=");
		sb.append(locationAddress);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append(", counter=");
		sb.append(counter);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AddOutsourcedActivities toEntityModel() {
		AddOutsourcedActivitiesImpl addOutsourcedActivitiesImpl =
			new AddOutsourcedActivitiesImpl();

		addOutsourcedActivitiesImpl.setAddOutsourcedActivitiesId(
			addOutsourcedActivitiesId);
		addOutsourcedActivitiesImpl.setGroupId(groupId);
		addOutsourcedActivitiesImpl.setCompanyId(companyId);
		addOutsourcedActivitiesImpl.setUserId(userId);

		if (userName == null) {
			addOutsourcedActivitiesImpl.setUserName("");
		}
		else {
			addOutsourcedActivitiesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addOutsourcedActivitiesImpl.setCreateDate(null);
		}
		else {
			addOutsourcedActivitiesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addOutsourcedActivitiesImpl.setModifiedDate(null);
		}
		else {
			addOutsourcedActivitiesImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (outSourcedActivity == null) {
			addOutsourcedActivitiesImpl.setOutSourcedActivity("");
		}
		else {
			addOutsourcedActivitiesImpl.setOutSourcedActivity(
				outSourcedActivity);
		}

		if (serviceProvider == null) {
			addOutsourcedActivitiesImpl.setServiceProvider("");
		}
		else {
			addOutsourcedActivitiesImpl.setServiceProvider(serviceProvider);
		}

		if (locationAddress == null) {
			addOutsourcedActivitiesImpl.setLocationAddress("");
		}
		else {
			addOutsourcedActivitiesImpl.setLocationAddress(locationAddress);
		}

		addOutsourcedActivitiesImpl.setJanaacApplicationId(janaacApplicationId);

		if (counter == null) {
			addOutsourcedActivitiesImpl.setCounter("");
		}
		else {
			addOutsourcedActivitiesImpl.setCounter(counter);
		}

		addOutsourcedActivitiesImpl.resetOriginalValues();

		return addOutsourcedActivitiesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		addOutsourcedActivitiesId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		outSourcedActivity = objectInput.readUTF();
		serviceProvider = objectInput.readUTF();
		locationAddress = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
		counter = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(addOutsourcedActivitiesId);

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

		if (outSourcedActivity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(outSourcedActivity);
		}

		if (serviceProvider == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(serviceProvider);
		}

		if (locationAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(locationAddress);
		}

		objectOutput.writeLong(janaacApplicationId);

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}
	}

	public long addOutsourcedActivitiesId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String outSourcedActivity;
	public String serviceProvider;
	public String locationAddress;
	public long janaacApplicationId;
	public String counter;

}