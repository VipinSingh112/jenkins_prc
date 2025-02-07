/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AddLabAppliInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddLabAppliInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddLabAppliInfoCacheModel
	implements CacheModel<AddLabAppliInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddLabAppliInfoCacheModel)) {
			return false;
		}

		AddLabAppliInfoCacheModel addLabAppliInfoCacheModel =
			(AddLabAppliInfoCacheModel)object;

		if (addLabAppliInfoId == addLabAppliInfoCacheModel.addLabAppliInfoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addLabAppliInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{addLabAppliInfoId=");
		sb.append(addLabAppliInfoId);
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
		sb.append(", name=");
		sb.append(name);
		sb.append(", email=");
		sb.append(email);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append(", counter=");
		sb.append(counter);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AddLabAppliInfo toEntityModel() {
		AddLabAppliInfoImpl addLabAppliInfoImpl = new AddLabAppliInfoImpl();

		addLabAppliInfoImpl.setAddLabAppliInfoId(addLabAppliInfoId);
		addLabAppliInfoImpl.setGroupId(groupId);
		addLabAppliInfoImpl.setCompanyId(companyId);
		addLabAppliInfoImpl.setUserId(userId);

		if (userName == null) {
			addLabAppliInfoImpl.setUserName("");
		}
		else {
			addLabAppliInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addLabAppliInfoImpl.setCreateDate(null);
		}
		else {
			addLabAppliInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addLabAppliInfoImpl.setModifiedDate(null);
		}
		else {
			addLabAppliInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			addLabAppliInfoImpl.setName("");
		}
		else {
			addLabAppliInfoImpl.setName(name);
		}

		if (email == null) {
			addLabAppliInfoImpl.setEmail("");
		}
		else {
			addLabAppliInfoImpl.setEmail(email);
		}

		addLabAppliInfoImpl.setJanaacApplicationId(janaacApplicationId);

		if (counter == null) {
			addLabAppliInfoImpl.setCounter("");
		}
		else {
			addLabAppliInfoImpl.setCounter(counter);
		}

		addLabAppliInfoImpl.resetOriginalValues();

		return addLabAppliInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		addLabAppliInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		email = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
		counter = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(addLabAppliInfoId);

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

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		objectOutput.writeLong(janaacApplicationId);

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}
	}

	public long addLabAppliInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String email;
	public long janaacApplicationId;
	public String counter;

}