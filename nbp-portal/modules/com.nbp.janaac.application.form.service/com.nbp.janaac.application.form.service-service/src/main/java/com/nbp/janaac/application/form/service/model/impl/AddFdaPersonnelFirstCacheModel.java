/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AddFdaPersonnelFirst;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddFdaPersonnelFirst in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddFdaPersonnelFirstCacheModel
	implements CacheModel<AddFdaPersonnelFirst>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddFdaPersonnelFirstCacheModel)) {
			return false;
		}

		AddFdaPersonnelFirstCacheModel addFdaPersonnelFirstCacheModel =
			(AddFdaPersonnelFirstCacheModel)object;

		if (addFdaPersonnelFirstId ==
				addFdaPersonnelFirstCacheModel.addFdaPersonnelFirstId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addFdaPersonnelFirstId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{addFdaPersonnelFirstId=");
		sb.append(addFdaPersonnelFirstId);
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
		sb.append(", majorResponsibilites=");
		sb.append(majorResponsibilites);
		sb.append(", specificFunctions=");
		sb.append(specificFunctions);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append(", counter=");
		sb.append(counter);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AddFdaPersonnelFirst toEntityModel() {
		AddFdaPersonnelFirstImpl addFdaPersonnelFirstImpl =
			new AddFdaPersonnelFirstImpl();

		addFdaPersonnelFirstImpl.setAddFdaPersonnelFirstId(
			addFdaPersonnelFirstId);
		addFdaPersonnelFirstImpl.setGroupId(groupId);
		addFdaPersonnelFirstImpl.setCompanyId(companyId);
		addFdaPersonnelFirstImpl.setUserId(userId);

		if (userName == null) {
			addFdaPersonnelFirstImpl.setUserName("");
		}
		else {
			addFdaPersonnelFirstImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addFdaPersonnelFirstImpl.setCreateDate(null);
		}
		else {
			addFdaPersonnelFirstImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addFdaPersonnelFirstImpl.setModifiedDate(null);
		}
		else {
			addFdaPersonnelFirstImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (nameOfStaff == null) {
			addFdaPersonnelFirstImpl.setNameOfStaff("");
		}
		else {
			addFdaPersonnelFirstImpl.setNameOfStaff(nameOfStaff);
		}

		if (jobTitle == null) {
			addFdaPersonnelFirstImpl.setJobTitle("");
		}
		else {
			addFdaPersonnelFirstImpl.setJobTitle(jobTitle);
		}

		if (majorResponsibilites == null) {
			addFdaPersonnelFirstImpl.setMajorResponsibilites("");
		}
		else {
			addFdaPersonnelFirstImpl.setMajorResponsibilites(
				majorResponsibilites);
		}

		if (specificFunctions == null) {
			addFdaPersonnelFirstImpl.setSpecificFunctions("");
		}
		else {
			addFdaPersonnelFirstImpl.setSpecificFunctions(specificFunctions);
		}

		addFdaPersonnelFirstImpl.setJanaacApplicationId(janaacApplicationId);

		if (counter == null) {
			addFdaPersonnelFirstImpl.setCounter("");
		}
		else {
			addFdaPersonnelFirstImpl.setCounter(counter);
		}

		addFdaPersonnelFirstImpl.resetOriginalValues();

		return addFdaPersonnelFirstImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		addFdaPersonnelFirstId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nameOfStaff = objectInput.readUTF();
		jobTitle = objectInput.readUTF();
		majorResponsibilites = objectInput.readUTF();
		specificFunctions = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
		counter = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(addFdaPersonnelFirstId);

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

		if (majorResponsibilites == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(majorResponsibilites);
		}

		if (specificFunctions == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(specificFunctions);
		}

		objectOutput.writeLong(janaacApplicationId);

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}
	}

	public long addFdaPersonnelFirstId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nameOfStaff;
	public String jobTitle;
	public String majorResponsibilites;
	public String specificFunctions;
	public long janaacApplicationId;
	public String counter;

}