/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AddLabDescOfActivity;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddLabDescOfActivity in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddLabDescOfActivityCacheModel
	implements CacheModel<AddLabDescOfActivity>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddLabDescOfActivityCacheModel)) {
			return false;
		}

		AddLabDescOfActivityCacheModel addLabDescOfActivityCacheModel =
			(AddLabDescOfActivityCacheModel)object;

		if (addLabDescOfActivityId ==
				addLabDescOfActivityCacheModel.addLabDescOfActivityId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addLabDescOfActivityId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{addLabDescOfActivityId=");
		sb.append(addLabDescOfActivityId);
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
		sb.append(", location=");
		sb.append(location);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append(", counter=");
		sb.append(counter);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AddLabDescOfActivity toEntityModel() {
		AddLabDescOfActivityImpl addLabDescOfActivityImpl =
			new AddLabDescOfActivityImpl();

		addLabDescOfActivityImpl.setAddLabDescOfActivityId(
			addLabDescOfActivityId);
		addLabDescOfActivityImpl.setGroupId(groupId);
		addLabDescOfActivityImpl.setCompanyId(companyId);
		addLabDescOfActivityImpl.setUserId(userId);

		if (userName == null) {
			addLabDescOfActivityImpl.setUserName("");
		}
		else {
			addLabDescOfActivityImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addLabDescOfActivityImpl.setCreateDate(null);
		}
		else {
			addLabDescOfActivityImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addLabDescOfActivityImpl.setModifiedDate(null);
		}
		else {
			addLabDescOfActivityImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (number == null) {
			addLabDescOfActivityImpl.setNumber("");
		}
		else {
			addLabDescOfActivityImpl.setNumber(number);
		}

		if (location == null) {
			addLabDescOfActivityImpl.setLocation("");
		}
		else {
			addLabDescOfActivityImpl.setLocation(location);
		}

		addLabDescOfActivityImpl.setJanaacApplicationId(janaacApplicationId);

		if (counter == null) {
			addLabDescOfActivityImpl.setCounter("");
		}
		else {
			addLabDescOfActivityImpl.setCounter(counter);
		}

		addLabDescOfActivityImpl.resetOriginalValues();

		return addLabDescOfActivityImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		addLabDescOfActivityId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		number = objectInput.readUTF();
		location = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
		counter = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(addLabDescOfActivityId);

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

		if (location == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(location);
		}

		objectOutput.writeLong(janaacApplicationId);

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}
	}

	public long addLabDescOfActivityId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String number;
	public String location;
	public long janaacApplicationId;
	public String counter;

}