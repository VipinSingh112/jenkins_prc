/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AddLabResourceReqFirst;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddLabResourceReqFirst in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddLabResourceReqFirstCacheModel
	implements CacheModel<AddLabResourceReqFirst>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddLabResourceReqFirstCacheModel)) {
			return false;
		}

		AddLabResourceReqFirstCacheModel addLabResourceReqFirstCacheModel =
			(AddLabResourceReqFirstCacheModel)object;

		if (addLabResourceReqFirstId ==
				addLabResourceReqFirstCacheModel.addLabResourceReqFirstId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addLabResourceReqFirstId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{addLabResourceReqFirstId=");
		sb.append(addLabResourceReqFirstId);
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
		sb.append(", num=");
		sb.append(num);
		sb.append(", location=");
		sb.append(location);
		sb.append(", activities=");
		sb.append(activities);
		sb.append(", contactDetails=");
		sb.append(contactDetails);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append(", counter=");
		sb.append(counter);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AddLabResourceReqFirst toEntityModel() {
		AddLabResourceReqFirstImpl addLabResourceReqFirstImpl =
			new AddLabResourceReqFirstImpl();

		addLabResourceReqFirstImpl.setAddLabResourceReqFirstId(
			addLabResourceReqFirstId);
		addLabResourceReqFirstImpl.setGroupId(groupId);
		addLabResourceReqFirstImpl.setCompanyId(companyId);
		addLabResourceReqFirstImpl.setUserId(userId);

		if (userName == null) {
			addLabResourceReqFirstImpl.setUserName("");
		}
		else {
			addLabResourceReqFirstImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addLabResourceReqFirstImpl.setCreateDate(null);
		}
		else {
			addLabResourceReqFirstImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addLabResourceReqFirstImpl.setModifiedDate(null);
		}
		else {
			addLabResourceReqFirstImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (num == null) {
			addLabResourceReqFirstImpl.setNum("");
		}
		else {
			addLabResourceReqFirstImpl.setNum(num);
		}

		if (location == null) {
			addLabResourceReqFirstImpl.setLocation("");
		}
		else {
			addLabResourceReqFirstImpl.setLocation(location);
		}

		if (activities == null) {
			addLabResourceReqFirstImpl.setActivities("");
		}
		else {
			addLabResourceReqFirstImpl.setActivities(activities);
		}

		if (contactDetails == null) {
			addLabResourceReqFirstImpl.setContactDetails("");
		}
		else {
			addLabResourceReqFirstImpl.setContactDetails(contactDetails);
		}

		addLabResourceReqFirstImpl.setJanaacApplicationId(janaacApplicationId);

		if (counter == null) {
			addLabResourceReqFirstImpl.setCounter("");
		}
		else {
			addLabResourceReqFirstImpl.setCounter(counter);
		}

		addLabResourceReqFirstImpl.resetOriginalValues();

		return addLabResourceReqFirstImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		addLabResourceReqFirstId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		num = objectInput.readUTF();
		location = objectInput.readUTF();
		activities = objectInput.readUTF();
		contactDetails = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
		counter = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(addLabResourceReqFirstId);

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

		if (num == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(num);
		}

		if (location == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(location);
		}

		if (activities == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(activities);
		}

		if (contactDetails == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contactDetails);
		}

		objectOutput.writeLong(janaacApplicationId);

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}
	}

	public long addLabResourceReqFirstId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String num;
	public String location;
	public String activities;
	public String contactDetails;
	public long janaacApplicationId;
	public String counter;

}