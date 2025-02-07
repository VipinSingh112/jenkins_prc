/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.quary.application.form.service.model.DirectorDetailsAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DirectorDetailsAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DirectorDetailsAddCacheModel
	implements CacheModel<DirectorDetailsAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DirectorDetailsAddCacheModel)) {
			return false;
		}

		DirectorDetailsAddCacheModel directorDetailsAddCacheModel =
			(DirectorDetailsAddCacheModel)object;

		if (directorDetailsAddId ==
				directorDetailsAddCacheModel.directorDetailsAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, directorDetailsAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{directorDetailsAddId=");
		sb.append(directorDetailsAddId);
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
		sb.append(", directorName=");
		sb.append(directorName);
		sb.append(", directorNationality=");
		sb.append(directorNationality);
		sb.append(", quarryApplicationId=");
		sb.append(quarryApplicationId);
		sb.append(", counter=");
		sb.append(counter);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DirectorDetailsAdd toEntityModel() {
		DirectorDetailsAddImpl directorDetailsAddImpl =
			new DirectorDetailsAddImpl();

		directorDetailsAddImpl.setDirectorDetailsAddId(directorDetailsAddId);
		directorDetailsAddImpl.setGroupId(groupId);
		directorDetailsAddImpl.setCompanyId(companyId);
		directorDetailsAddImpl.setUserId(userId);

		if (userName == null) {
			directorDetailsAddImpl.setUserName("");
		}
		else {
			directorDetailsAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			directorDetailsAddImpl.setCreateDate(null);
		}
		else {
			directorDetailsAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			directorDetailsAddImpl.setModifiedDate(null);
		}
		else {
			directorDetailsAddImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (directorName == null) {
			directorDetailsAddImpl.setDirectorName("");
		}
		else {
			directorDetailsAddImpl.setDirectorName(directorName);
		}

		if (directorNationality == null) {
			directorDetailsAddImpl.setDirectorNationality("");
		}
		else {
			directorDetailsAddImpl.setDirectorNationality(directorNationality);
		}

		directorDetailsAddImpl.setQuarryApplicationId(quarryApplicationId);

		if (counter == null) {
			directorDetailsAddImpl.setCounter("");
		}
		else {
			directorDetailsAddImpl.setCounter(counter);
		}

		directorDetailsAddImpl.resetOriginalValues();

		return directorDetailsAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		directorDetailsAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		directorName = objectInput.readUTF();
		directorNationality = objectInput.readUTF();

		quarryApplicationId = objectInput.readLong();
		counter = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(directorDetailsAddId);

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

		if (directorName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(directorName);
		}

		if (directorNationality == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(directorNationality);
		}

		objectOutput.writeLong(quarryApplicationId);

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}
	}

	public long directorDetailsAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String directorName;
	public String directorNationality;
	public long quarryApplicationId;
	public String counter;

}