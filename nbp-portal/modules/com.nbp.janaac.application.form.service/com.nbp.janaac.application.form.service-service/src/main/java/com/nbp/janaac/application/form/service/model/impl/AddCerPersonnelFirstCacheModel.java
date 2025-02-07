/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AddCerPersonnelFirst;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddCerPersonnelFirst in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddCerPersonnelFirstCacheModel
	implements CacheModel<AddCerPersonnelFirst>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddCerPersonnelFirstCacheModel)) {
			return false;
		}

		AddCerPersonnelFirstCacheModel addCerPersonnelFirstCacheModel =
			(AddCerPersonnelFirstCacheModel)object;

		if (addCerPersonnelFirstId ==
				addCerPersonnelFirstCacheModel.addCerPersonnelFirstId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addCerPersonnelFirstId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{addCerPersonnelFirstId=");
		sb.append(addCerPersonnelFirstId);
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
		sb.append(", majorResponsibility=");
		sb.append(majorResponsibility);
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
	public AddCerPersonnelFirst toEntityModel() {
		AddCerPersonnelFirstImpl addCerPersonnelFirstImpl =
			new AddCerPersonnelFirstImpl();

		addCerPersonnelFirstImpl.setAddCerPersonnelFirstId(
			addCerPersonnelFirstId);
		addCerPersonnelFirstImpl.setGroupId(groupId);
		addCerPersonnelFirstImpl.setCompanyId(companyId);
		addCerPersonnelFirstImpl.setUserId(userId);

		if (userName == null) {
			addCerPersonnelFirstImpl.setUserName("");
		}
		else {
			addCerPersonnelFirstImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addCerPersonnelFirstImpl.setCreateDate(null);
		}
		else {
			addCerPersonnelFirstImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addCerPersonnelFirstImpl.setModifiedDate(null);
		}
		else {
			addCerPersonnelFirstImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (nameOfStaff == null) {
			addCerPersonnelFirstImpl.setNameOfStaff("");
		}
		else {
			addCerPersonnelFirstImpl.setNameOfStaff(nameOfStaff);
		}

		if (jobTitle == null) {
			addCerPersonnelFirstImpl.setJobTitle("");
		}
		else {
			addCerPersonnelFirstImpl.setJobTitle(jobTitle);
		}

		if (majorResponsibility == null) {
			addCerPersonnelFirstImpl.setMajorResponsibility("");
		}
		else {
			addCerPersonnelFirstImpl.setMajorResponsibility(
				majorResponsibility);
		}

		if (specificFunctions == null) {
			addCerPersonnelFirstImpl.setSpecificFunctions("");
		}
		else {
			addCerPersonnelFirstImpl.setSpecificFunctions(specificFunctions);
		}

		addCerPersonnelFirstImpl.setJanaacApplicationId(janaacApplicationId);

		if (counter == null) {
			addCerPersonnelFirstImpl.setCounter("");
		}
		else {
			addCerPersonnelFirstImpl.setCounter(counter);
		}

		addCerPersonnelFirstImpl.resetOriginalValues();

		return addCerPersonnelFirstImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		addCerPersonnelFirstId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nameOfStaff = objectInput.readUTF();
		jobTitle = objectInput.readUTF();
		majorResponsibility = objectInput.readUTF();
		specificFunctions = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
		counter = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(addCerPersonnelFirstId);

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

		if (majorResponsibility == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(majorResponsibility);
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

	public long addCerPersonnelFirstId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nameOfStaff;
	public String jobTitle;
	public String majorResponsibility;
	public String specificFunctions;
	public long janaacApplicationId;
	public String counter;

}