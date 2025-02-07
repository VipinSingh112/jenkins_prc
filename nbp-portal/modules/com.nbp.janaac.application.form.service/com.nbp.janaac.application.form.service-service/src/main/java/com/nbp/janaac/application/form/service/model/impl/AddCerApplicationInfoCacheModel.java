/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AddCerApplicationInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddCerApplicationInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddCerApplicationInfoCacheModel
	implements CacheModel<AddCerApplicationInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddCerApplicationInfoCacheModel)) {
			return false;
		}

		AddCerApplicationInfoCacheModel addCerApplicationInfoCacheModel =
			(AddCerApplicationInfoCacheModel)object;

		if (addCerApplicationInfoId ==
				addCerApplicationInfoCacheModel.addCerApplicationInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addCerApplicationInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{addCerApplicationInfoId=");
		sb.append(addCerApplicationInfoId);
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
	public AddCerApplicationInfo toEntityModel() {
		AddCerApplicationInfoImpl addCerApplicationInfoImpl =
			new AddCerApplicationInfoImpl();

		addCerApplicationInfoImpl.setAddCerApplicationInfoId(
			addCerApplicationInfoId);
		addCerApplicationInfoImpl.setGroupId(groupId);
		addCerApplicationInfoImpl.setCompanyId(companyId);
		addCerApplicationInfoImpl.setUserId(userId);

		if (userName == null) {
			addCerApplicationInfoImpl.setUserName("");
		}
		else {
			addCerApplicationInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addCerApplicationInfoImpl.setCreateDate(null);
		}
		else {
			addCerApplicationInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addCerApplicationInfoImpl.setModifiedDate(null);
		}
		else {
			addCerApplicationInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			addCerApplicationInfoImpl.setName("");
		}
		else {
			addCerApplicationInfoImpl.setName(name);
		}

		if (email == null) {
			addCerApplicationInfoImpl.setEmail("");
		}
		else {
			addCerApplicationInfoImpl.setEmail(email);
		}

		addCerApplicationInfoImpl.setJanaacApplicationId(janaacApplicationId);

		if (counter == null) {
			addCerApplicationInfoImpl.setCounter("");
		}
		else {
			addCerApplicationInfoImpl.setCounter(counter);
		}

		addCerApplicationInfoImpl.resetOriginalValues();

		return addCerApplicationInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		addCerApplicationInfoId = objectInput.readLong();

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
		objectOutput.writeLong(addCerApplicationInfoId);

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

	public long addCerApplicationInfoId;
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