/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AddLabMedicalOrganFirst;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddLabMedicalOrganFirst in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddLabMedicalOrganFirstCacheModel
	implements CacheModel<AddLabMedicalOrganFirst>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddLabMedicalOrganFirstCacheModel)) {
			return false;
		}

		AddLabMedicalOrganFirstCacheModel addLabMedicalOrganFirstCacheModel =
			(AddLabMedicalOrganFirstCacheModel)object;

		if (addLabMedicalOrganFirstId ==
				addLabMedicalOrganFirstCacheModel.addLabMedicalOrganFirstId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addLabMedicalOrganFirstId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{addLabMedicalOrganFirstId=");
		sb.append(addLabMedicalOrganFirstId);
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
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append(", counter=");
		sb.append(counter);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AddLabMedicalOrganFirst toEntityModel() {
		AddLabMedicalOrganFirstImpl addLabMedicalOrganFirstImpl =
			new AddLabMedicalOrganFirstImpl();

		addLabMedicalOrganFirstImpl.setAddLabMedicalOrganFirstId(
			addLabMedicalOrganFirstId);
		addLabMedicalOrganFirstImpl.setGroupId(groupId);
		addLabMedicalOrganFirstImpl.setCompanyId(companyId);
		addLabMedicalOrganFirstImpl.setUserId(userId);

		if (userName == null) {
			addLabMedicalOrganFirstImpl.setUserName("");
		}
		else {
			addLabMedicalOrganFirstImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addLabMedicalOrganFirstImpl.setCreateDate(null);
		}
		else {
			addLabMedicalOrganFirstImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addLabMedicalOrganFirstImpl.setModifiedDate(null);
		}
		else {
			addLabMedicalOrganFirstImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (nameOfStaff == null) {
			addLabMedicalOrganFirstImpl.setNameOfStaff("");
		}
		else {
			addLabMedicalOrganFirstImpl.setNameOfStaff(nameOfStaff);
		}

		if (jobTitle == null) {
			addLabMedicalOrganFirstImpl.setJobTitle("");
		}
		else {
			addLabMedicalOrganFirstImpl.setJobTitle(jobTitle);
		}

		if (majorResponsibilities == null) {
			addLabMedicalOrganFirstImpl.setMajorResponsibilities("");
		}
		else {
			addLabMedicalOrganFirstImpl.setMajorResponsibilities(
				majorResponsibilities);
		}

		addLabMedicalOrganFirstImpl.setJanaacApplicationId(janaacApplicationId);

		if (counter == null) {
			addLabMedicalOrganFirstImpl.setCounter("");
		}
		else {
			addLabMedicalOrganFirstImpl.setCounter(counter);
		}

		addLabMedicalOrganFirstImpl.resetOriginalValues();

		return addLabMedicalOrganFirstImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		addLabMedicalOrganFirstId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nameOfStaff = objectInput.readUTF();
		jobTitle = objectInput.readUTF();
		majorResponsibilities = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
		counter = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(addLabMedicalOrganFirstId);

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

		objectOutput.writeLong(janaacApplicationId);

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}
	}

	public long addLabMedicalOrganFirstId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nameOfStaff;
	public String jobTitle;
	public String majorResponsibilities;
	public long janaacApplicationId;
	public String counter;

}