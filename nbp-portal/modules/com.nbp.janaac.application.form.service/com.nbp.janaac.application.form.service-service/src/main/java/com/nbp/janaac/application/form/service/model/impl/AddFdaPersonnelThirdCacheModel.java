/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AddFdaPersonnelThird;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddFdaPersonnelThird in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddFdaPersonnelThirdCacheModel
	implements CacheModel<AddFdaPersonnelThird>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddFdaPersonnelThirdCacheModel)) {
			return false;
		}

		AddFdaPersonnelThirdCacheModel addFdaPersonnelThirdCacheModel =
			(AddFdaPersonnelThirdCacheModel)object;

		if (addFdaPersonnelThirdId ==
				addFdaPersonnelThirdCacheModel.addFdaPersonnelThirdId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addFdaPersonnelThirdId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{addFdaPersonnelThirdId=");
		sb.append(addFdaPersonnelThirdId);
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
		sb.append(", outsourcedActivity=");
		sb.append(outsourcedActivity);
		sb.append(", supplierServiceProvider=");
		sb.append(supplierServiceProvider);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append(", counter=");
		sb.append(counter);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AddFdaPersonnelThird toEntityModel() {
		AddFdaPersonnelThirdImpl addFdaPersonnelThirdImpl =
			new AddFdaPersonnelThirdImpl();

		addFdaPersonnelThirdImpl.setAddFdaPersonnelThirdId(
			addFdaPersonnelThirdId);
		addFdaPersonnelThirdImpl.setGroupId(groupId);
		addFdaPersonnelThirdImpl.setCompanyId(companyId);
		addFdaPersonnelThirdImpl.setUserId(userId);

		if (userName == null) {
			addFdaPersonnelThirdImpl.setUserName("");
		}
		else {
			addFdaPersonnelThirdImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addFdaPersonnelThirdImpl.setCreateDate(null);
		}
		else {
			addFdaPersonnelThirdImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addFdaPersonnelThirdImpl.setModifiedDate(null);
		}
		else {
			addFdaPersonnelThirdImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (outsourcedActivity == null) {
			addFdaPersonnelThirdImpl.setOutsourcedActivity("");
		}
		else {
			addFdaPersonnelThirdImpl.setOutsourcedActivity(outsourcedActivity);
		}

		if (supplierServiceProvider == null) {
			addFdaPersonnelThirdImpl.setSupplierServiceProvider("");
		}
		else {
			addFdaPersonnelThirdImpl.setSupplierServiceProvider(
				supplierServiceProvider);
		}

		addFdaPersonnelThirdImpl.setJanaacApplicationId(janaacApplicationId);

		if (counter == null) {
			addFdaPersonnelThirdImpl.setCounter("");
		}
		else {
			addFdaPersonnelThirdImpl.setCounter(counter);
		}

		addFdaPersonnelThirdImpl.resetOriginalValues();

		return addFdaPersonnelThirdImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		addFdaPersonnelThirdId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		outsourcedActivity = objectInput.readUTF();
		supplierServiceProvider = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
		counter = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(addFdaPersonnelThirdId);

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

		if (outsourcedActivity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(outsourcedActivity);
		}

		if (supplierServiceProvider == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(supplierServiceProvider);
		}

		objectOutput.writeLong(janaacApplicationId);

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}
	}

	public long addFdaPersonnelThirdId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String outsourcedActivity;
	public String supplierServiceProvider;
	public long janaacApplicationId;
	public String counter;

}