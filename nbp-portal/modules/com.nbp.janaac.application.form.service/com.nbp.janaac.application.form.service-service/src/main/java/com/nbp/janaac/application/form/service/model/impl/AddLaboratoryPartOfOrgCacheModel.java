/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AddLaboratoryPartOfOrg;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddLaboratoryPartOfOrg in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddLaboratoryPartOfOrgCacheModel
	implements CacheModel<AddLaboratoryPartOfOrg>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddLaboratoryPartOfOrgCacheModel)) {
			return false;
		}

		AddLaboratoryPartOfOrgCacheModel addLaboratoryPartOfOrgCacheModel =
			(AddLaboratoryPartOfOrgCacheModel)object;

		if (addLaboratoryPartOfOrgId ==
				addLaboratoryPartOfOrgCacheModel.addLaboratoryPartOfOrgId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addLaboratoryPartOfOrgId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{addLaboratoryPartOfOrgId=");
		sb.append(addLaboratoryPartOfOrgId);
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
		sb.append(", laboratoryPartOfOrgName=");
		sb.append(laboratoryPartOfOrgName);
		sb.append(", laboratoryPartOfOrgPosition=");
		sb.append(laboratoryPartOfOrgPosition);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append(", counter=");
		sb.append(counter);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AddLaboratoryPartOfOrg toEntityModel() {
		AddLaboratoryPartOfOrgImpl addLaboratoryPartOfOrgImpl =
			new AddLaboratoryPartOfOrgImpl();

		addLaboratoryPartOfOrgImpl.setAddLaboratoryPartOfOrgId(
			addLaboratoryPartOfOrgId);
		addLaboratoryPartOfOrgImpl.setGroupId(groupId);
		addLaboratoryPartOfOrgImpl.setCompanyId(companyId);
		addLaboratoryPartOfOrgImpl.setUserId(userId);

		if (userName == null) {
			addLaboratoryPartOfOrgImpl.setUserName("");
		}
		else {
			addLaboratoryPartOfOrgImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addLaboratoryPartOfOrgImpl.setCreateDate(null);
		}
		else {
			addLaboratoryPartOfOrgImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addLaboratoryPartOfOrgImpl.setModifiedDate(null);
		}
		else {
			addLaboratoryPartOfOrgImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (laboratoryPartOfOrgName == null) {
			addLaboratoryPartOfOrgImpl.setLaboratoryPartOfOrgName("");
		}
		else {
			addLaboratoryPartOfOrgImpl.setLaboratoryPartOfOrgName(
				laboratoryPartOfOrgName);
		}

		if (laboratoryPartOfOrgPosition == null) {
			addLaboratoryPartOfOrgImpl.setLaboratoryPartOfOrgPosition("");
		}
		else {
			addLaboratoryPartOfOrgImpl.setLaboratoryPartOfOrgPosition(
				laboratoryPartOfOrgPosition);
		}

		addLaboratoryPartOfOrgImpl.setJanaacApplicationId(janaacApplicationId);

		if (counter == null) {
			addLaboratoryPartOfOrgImpl.setCounter("");
		}
		else {
			addLaboratoryPartOfOrgImpl.setCounter(counter);
		}

		addLaboratoryPartOfOrgImpl.resetOriginalValues();

		return addLaboratoryPartOfOrgImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		addLaboratoryPartOfOrgId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		laboratoryPartOfOrgName = objectInput.readUTF();
		laboratoryPartOfOrgPosition = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
		counter = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(addLaboratoryPartOfOrgId);

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

		if (laboratoryPartOfOrgName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(laboratoryPartOfOrgName);
		}

		if (laboratoryPartOfOrgPosition == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(laboratoryPartOfOrgPosition);
		}

		objectOutput.writeLong(janaacApplicationId);

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}
	}

	public long addLaboratoryPartOfOrgId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String laboratoryPartOfOrgName;
	public String laboratoryPartOfOrgPosition;
	public long janaacApplicationId;
	public String counter;

}