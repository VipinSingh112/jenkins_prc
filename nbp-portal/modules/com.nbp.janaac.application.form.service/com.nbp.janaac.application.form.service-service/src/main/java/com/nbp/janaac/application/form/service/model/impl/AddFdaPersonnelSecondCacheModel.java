/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AddFdaPersonnelSecond;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddFdaPersonnelSecond in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddFdaPersonnelSecondCacheModel
	implements CacheModel<AddFdaPersonnelSecond>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddFdaPersonnelSecondCacheModel)) {
			return false;
		}

		AddFdaPersonnelSecondCacheModel addFdaPersonnelSecondCacheModel =
			(AddFdaPersonnelSecondCacheModel)object;

		if (addFdaPersonnelSecondId ==
				addFdaPersonnelSecondCacheModel.addFdaPersonnelSecondId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addFdaPersonnelSecondId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{addFdaPersonnelSecondId=");
		sb.append(addFdaPersonnelSecondId);
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
		sb.append(", role=");
		sb.append(role);
		sb.append(", fdaRegulation=");
		sb.append(fdaRegulation);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append(", counter=");
		sb.append(counter);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AddFdaPersonnelSecond toEntityModel() {
		AddFdaPersonnelSecondImpl addFdaPersonnelSecondImpl =
			new AddFdaPersonnelSecondImpl();

		addFdaPersonnelSecondImpl.setAddFdaPersonnelSecondId(
			addFdaPersonnelSecondId);
		addFdaPersonnelSecondImpl.setGroupId(groupId);
		addFdaPersonnelSecondImpl.setCompanyId(companyId);
		addFdaPersonnelSecondImpl.setUserId(userId);

		if (userName == null) {
			addFdaPersonnelSecondImpl.setUserName("");
		}
		else {
			addFdaPersonnelSecondImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addFdaPersonnelSecondImpl.setCreateDate(null);
		}
		else {
			addFdaPersonnelSecondImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addFdaPersonnelSecondImpl.setModifiedDate(null);
		}
		else {
			addFdaPersonnelSecondImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			addFdaPersonnelSecondImpl.setName("");
		}
		else {
			addFdaPersonnelSecondImpl.setName(name);
		}

		if (role == null) {
			addFdaPersonnelSecondImpl.setRole("");
		}
		else {
			addFdaPersonnelSecondImpl.setRole(role);
		}

		if (fdaRegulation == null) {
			addFdaPersonnelSecondImpl.setFdaRegulation("");
		}
		else {
			addFdaPersonnelSecondImpl.setFdaRegulation(fdaRegulation);
		}

		addFdaPersonnelSecondImpl.setJanaacApplicationId(janaacApplicationId);

		if (counter == null) {
			addFdaPersonnelSecondImpl.setCounter("");
		}
		else {
			addFdaPersonnelSecondImpl.setCounter(counter);
		}

		addFdaPersonnelSecondImpl.resetOriginalValues();

		return addFdaPersonnelSecondImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		addFdaPersonnelSecondId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		role = objectInput.readUTF();
		fdaRegulation = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
		counter = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(addFdaPersonnelSecondId);

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

		if (role == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(role);
		}

		if (fdaRegulation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fdaRegulation);
		}

		objectOutput.writeLong(janaacApplicationId);

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}
	}

	public long addFdaPersonnelSecondId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String role;
	public String fdaRegulation;
	public long janaacApplicationId;
	public String counter;

}