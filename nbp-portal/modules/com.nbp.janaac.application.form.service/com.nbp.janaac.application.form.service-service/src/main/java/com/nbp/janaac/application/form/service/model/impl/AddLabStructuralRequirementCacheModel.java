/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AddLabStructuralRequirement;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddLabStructuralRequirement in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddLabStructuralRequirementCacheModel
	implements CacheModel<AddLabStructuralRequirement>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddLabStructuralRequirementCacheModel)) {
			return false;
		}

		AddLabStructuralRequirementCacheModel
			addLabStructuralRequirementCacheModel =
				(AddLabStructuralRequirementCacheModel)object;

		if (addLabStructuralRequirementId ==
				addLabStructuralRequirementCacheModel.
					addLabStructuralRequirementId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addLabStructuralRequirementId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{addLabStructuralRequirementId=");
		sb.append(addLabStructuralRequirementId);
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
		sb.append(", indicateAnalysts =");
		sb.append(indicateAnalysts);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append(", counter=");
		sb.append(counter);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AddLabStructuralRequirement toEntityModel() {
		AddLabStructuralRequirementImpl addLabStructuralRequirementImpl =
			new AddLabStructuralRequirementImpl();

		addLabStructuralRequirementImpl.setAddLabStructuralRequirementId(
			addLabStructuralRequirementId);
		addLabStructuralRequirementImpl.setGroupId(groupId);
		addLabStructuralRequirementImpl.setCompanyId(companyId);
		addLabStructuralRequirementImpl.setUserId(userId);

		if (userName == null) {
			addLabStructuralRequirementImpl.setUserName("");
		}
		else {
			addLabStructuralRequirementImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addLabStructuralRequirementImpl.setCreateDate(null);
		}
		else {
			addLabStructuralRequirementImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addLabStructuralRequirementImpl.setModifiedDate(null);
		}
		else {
			addLabStructuralRequirementImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (nameOfStaff == null) {
			addLabStructuralRequirementImpl.setNameOfStaff("");
		}
		else {
			addLabStructuralRequirementImpl.setNameOfStaff(nameOfStaff);
		}

		if (jobTitle == null) {
			addLabStructuralRequirementImpl.setJobTitle("");
		}
		else {
			addLabStructuralRequirementImpl.setJobTitle(jobTitle);
		}

		if (majorResponsibilities == null) {
			addLabStructuralRequirementImpl.setMajorResponsibilities("");
		}
		else {
			addLabStructuralRequirementImpl.setMajorResponsibilities(
				majorResponsibilities);
		}

		if (indicateAnalysts == null) {
			addLabStructuralRequirementImpl.setIndicateAnalysts("");
		}
		else {
			addLabStructuralRequirementImpl.setIndicateAnalysts(
				indicateAnalysts);
		}

		addLabStructuralRequirementImpl.setJanaacApplicationId(
			janaacApplicationId);

		if (counter == null) {
			addLabStructuralRequirementImpl.setCounter("");
		}
		else {
			addLabStructuralRequirementImpl.setCounter(counter);
		}

		addLabStructuralRequirementImpl.resetOriginalValues();

		return addLabStructuralRequirementImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		addLabStructuralRequirementId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nameOfStaff = objectInput.readUTF();
		jobTitle = objectInput.readUTF();
		majorResponsibilities = objectInput.readUTF();
		indicateAnalysts = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
		counter = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(addLabStructuralRequirementId);

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

		if (indicateAnalysts == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(indicateAnalysts);
		}

		objectOutput.writeLong(janaacApplicationId);

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}
	}

	public long addLabStructuralRequirementId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nameOfStaff;
	public String jobTitle;
	public String majorResponsibilities;
	public String indicateAnalysts;
	public long janaacApplicationId;
	public String counter;

}