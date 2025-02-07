/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AddInsOrgInfoSecond;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddInsOrgInfoSecond in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddInsOrgInfoSecondCacheModel
	implements CacheModel<AddInsOrgInfoSecond>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddInsOrgInfoSecondCacheModel)) {
			return false;
		}

		AddInsOrgInfoSecondCacheModel addInsOrgInfoSecondCacheModel =
			(AddInsOrgInfoSecondCacheModel)object;

		if (addInsOrgInfoSecondId ==
				addInsOrgInfoSecondCacheModel.addInsOrgInfoSecondId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addInsOrgInfoSecondId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{addInsOrgInfoSecondId=");
		sb.append(addInsOrgInfoSecondId);
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
		sb.append(", nameOfStaff=");
		sb.append(nameOfStaff);
		sb.append(", jobTitle=");
		sb.append(jobTitle);
		sb.append(", majorResponsibilities=");
		sb.append(majorResponsibilities);
		sb.append(", indexInspector=");
		sb.append(indexInspector);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append(", counter=");
		sb.append(counter);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AddInsOrgInfoSecond toEntityModel() {
		AddInsOrgInfoSecondImpl addInsOrgInfoSecondImpl =
			new AddInsOrgInfoSecondImpl();

		addInsOrgInfoSecondImpl.setAddInsOrgInfoSecondId(addInsOrgInfoSecondId);
		addInsOrgInfoSecondImpl.setGroupId(groupId);
		addInsOrgInfoSecondImpl.setCompanyId(companyId);
		addInsOrgInfoSecondImpl.setUserId(userId);

		if (userName == null) {
			addInsOrgInfoSecondImpl.setUserName("");
		}
		else {
			addInsOrgInfoSecondImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addInsOrgInfoSecondImpl.setCreateDate(null);
		}
		else {
			addInsOrgInfoSecondImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addInsOrgInfoSecondImpl.setModifiedDate(null);
		}
		else {
			addInsOrgInfoSecondImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (nameOfStaff == null) {
			addInsOrgInfoSecondImpl.setNameOfStaff("");
		}
		else {
			addInsOrgInfoSecondImpl.setNameOfStaff(nameOfStaff);
		}

		if (jobTitle == null) {
			addInsOrgInfoSecondImpl.setJobTitle("");
		}
		else {
			addInsOrgInfoSecondImpl.setJobTitle(jobTitle);
		}

		if (majorResponsibilities == null) {
			addInsOrgInfoSecondImpl.setMajorResponsibilities("");
		}
		else {
			addInsOrgInfoSecondImpl.setMajorResponsibilities(
				majorResponsibilities);
		}

		if (indexInspector == null) {
			addInsOrgInfoSecondImpl.setIndexInspector("");
		}
		else {
			addInsOrgInfoSecondImpl.setIndexInspector(indexInspector);
		}

		addInsOrgInfoSecondImpl.setJanaacApplicationId(janaacApplicationId);

		if (counter == null) {
			addInsOrgInfoSecondImpl.setCounter("");
		}
		else {
			addInsOrgInfoSecondImpl.setCounter(counter);
		}

		addInsOrgInfoSecondImpl.resetOriginalValues();

		return addInsOrgInfoSecondImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		addInsOrgInfoSecondId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nameOfStaff = objectInput.readUTF();
		jobTitle = objectInput.readUTF();
		majorResponsibilities = objectInput.readUTF();
		indexInspector = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
		counter = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(addInsOrgInfoSecondId);

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

		if (nameOfStaff == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfStaff);
		}

		if (jobTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(jobTitle);
		}

		if (majorResponsibilities == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(majorResponsibilities);
		}

		if (indexInspector == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(indexInspector);
		}

		objectOutput.writeLong(janaacApplicationId);

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}
	}

	public long addInsOrgInfoSecondId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nameOfStaff;
	public String jobTitle;
	public String majorResponsibilities;
	public String indexInspector;
	public long janaacApplicationId;
	public String counter;

}