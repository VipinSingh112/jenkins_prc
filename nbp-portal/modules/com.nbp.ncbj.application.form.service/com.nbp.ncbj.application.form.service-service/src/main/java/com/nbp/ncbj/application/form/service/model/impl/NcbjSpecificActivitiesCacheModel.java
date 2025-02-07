/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncbj.application.form.service.model.NcbjSpecificActivities;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcbjSpecificActivities in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcbjSpecificActivitiesCacheModel
	implements CacheModel<NcbjSpecificActivities>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcbjSpecificActivitiesCacheModel)) {
			return false;
		}

		NcbjSpecificActivitiesCacheModel ncbjSpecificActivitiesCacheModel =
			(NcbjSpecificActivitiesCacheModel)object;

		if (ncbjSpecificActivitiesId ==
				ncbjSpecificActivitiesCacheModel.ncbjSpecificActivitiesId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncbjSpecificActivitiesId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{ncbjSpecificActivitiesId=");
		sb.append(ncbjSpecificActivitiesId);
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
		sb.append(", specificActivity=");
		sb.append(specificActivity);
		sb.append(", specificActivityNumber=");
		sb.append(specificActivityNumber);
		sb.append(", specificActivityChecked=");
		sb.append(specificActivityChecked);
		sb.append(", ncbjApplicationId=");
		sb.append(ncbjApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcbjSpecificActivities toEntityModel() {
		NcbjSpecificActivitiesImpl ncbjSpecificActivitiesImpl =
			new NcbjSpecificActivitiesImpl();

		ncbjSpecificActivitiesImpl.setNcbjSpecificActivitiesId(
			ncbjSpecificActivitiesId);
		ncbjSpecificActivitiesImpl.setGroupId(groupId);
		ncbjSpecificActivitiesImpl.setCompanyId(companyId);
		ncbjSpecificActivitiesImpl.setUserId(userId);

		if (userName == null) {
			ncbjSpecificActivitiesImpl.setUserName("");
		}
		else {
			ncbjSpecificActivitiesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncbjSpecificActivitiesImpl.setCreateDate(null);
		}
		else {
			ncbjSpecificActivitiesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncbjSpecificActivitiesImpl.setModifiedDate(null);
		}
		else {
			ncbjSpecificActivitiesImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (specificActivity == null) {
			ncbjSpecificActivitiesImpl.setSpecificActivity("");
		}
		else {
			ncbjSpecificActivitiesImpl.setSpecificActivity(specificActivity);
		}

		if (specificActivityNumber == null) {
			ncbjSpecificActivitiesImpl.setSpecificActivityNumber("");
		}
		else {
			ncbjSpecificActivitiesImpl.setSpecificActivityNumber(
				specificActivityNumber);
		}

		if (specificActivityChecked == null) {
			ncbjSpecificActivitiesImpl.setSpecificActivityChecked("");
		}
		else {
			ncbjSpecificActivitiesImpl.setSpecificActivityChecked(
				specificActivityChecked);
		}

		ncbjSpecificActivitiesImpl.setNcbjApplicationId(ncbjApplicationId);

		ncbjSpecificActivitiesImpl.resetOriginalValues();

		return ncbjSpecificActivitiesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncbjSpecificActivitiesId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		specificActivity = objectInput.readUTF();
		specificActivityNumber = objectInput.readUTF();
		specificActivityChecked = objectInput.readUTF();

		ncbjApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ncbjSpecificActivitiesId);

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

		if (specificActivity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(specificActivity);
		}

		if (specificActivityNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(specificActivityNumber);
		}

		if (specificActivityChecked == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(specificActivityChecked);
		}

		objectOutput.writeLong(ncbjApplicationId);
	}

	public long ncbjSpecificActivitiesId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String specificActivity;
	public String specificActivityNumber;
	public String specificActivityChecked;
	public long ncbjApplicationId;

}