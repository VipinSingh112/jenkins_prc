/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AddInsOrgInfoFirst;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddInsOrgInfoFirst in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddInsOrgInfoFirstCacheModel
	implements CacheModel<AddInsOrgInfoFirst>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddInsOrgInfoFirstCacheModel)) {
			return false;
		}

		AddInsOrgInfoFirstCacheModel addInsOrgInfoFirstCacheModel =
			(AddInsOrgInfoFirstCacheModel)object;

		if (addInsOrgInfoFirstId ==
				addInsOrgInfoFirstCacheModel.addInsOrgInfoFirstId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addInsOrgInfoFirstId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{addInsOrgInfoFirstId=");
		sb.append(addInsOrgInfoFirstId);
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
		sb.append(", position=");
		sb.append(position);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append(", counter=");
		sb.append(counter);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AddInsOrgInfoFirst toEntityModel() {
		AddInsOrgInfoFirstImpl addInsOrgInfoFirstImpl =
			new AddInsOrgInfoFirstImpl();

		addInsOrgInfoFirstImpl.setAddInsOrgInfoFirstId(addInsOrgInfoFirstId);
		addInsOrgInfoFirstImpl.setGroupId(groupId);
		addInsOrgInfoFirstImpl.setCompanyId(companyId);
		addInsOrgInfoFirstImpl.setUserId(userId);

		if (userName == null) {
			addInsOrgInfoFirstImpl.setUserName("");
		}
		else {
			addInsOrgInfoFirstImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addInsOrgInfoFirstImpl.setCreateDate(null);
		}
		else {
			addInsOrgInfoFirstImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addInsOrgInfoFirstImpl.setModifiedDate(null);
		}
		else {
			addInsOrgInfoFirstImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			addInsOrgInfoFirstImpl.setName("");
		}
		else {
			addInsOrgInfoFirstImpl.setName(name);
		}

		if (position == null) {
			addInsOrgInfoFirstImpl.setPosition("");
		}
		else {
			addInsOrgInfoFirstImpl.setPosition(position);
		}

		addInsOrgInfoFirstImpl.setJanaacApplicationId(janaacApplicationId);

		if (counter == null) {
			addInsOrgInfoFirstImpl.setCounter("");
		}
		else {
			addInsOrgInfoFirstImpl.setCounter(counter);
		}

		addInsOrgInfoFirstImpl.resetOriginalValues();

		return addInsOrgInfoFirstImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		addInsOrgInfoFirstId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		position = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
		counter = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(addInsOrgInfoFirstId);

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

		if (position == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(position);
		}

		objectOutput.writeLong(janaacApplicationId);

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}
	}

	public long addInsOrgInfoFirstId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String position;
	public long janaacApplicationId;
	public String counter;

}