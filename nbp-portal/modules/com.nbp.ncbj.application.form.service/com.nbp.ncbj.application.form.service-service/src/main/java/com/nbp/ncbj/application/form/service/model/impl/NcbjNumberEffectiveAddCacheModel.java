/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncbj.application.form.service.model.NcbjNumberEffectiveAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcbjNumberEffectiveAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcbjNumberEffectiveAddCacheModel
	implements CacheModel<NcbjNumberEffectiveAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcbjNumberEffectiveAddCacheModel)) {
			return false;
		}

		NcbjNumberEffectiveAddCacheModel ncbjNumberEffectiveAddCacheModel =
			(NcbjNumberEffectiveAddCacheModel)object;

		if (ncbjNumberEffectiveAddId ==
				ncbjNumberEffectiveAddCacheModel.ncbjNumberEffectiveAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncbjNumberEffectiveAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{ncbjNumberEffectiveAddId=");
		sb.append(ncbjNumberEffectiveAddId);
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
		sb.append(", numberOfFullTimeEmployees=");
		sb.append(numberOfFullTimeEmployees);
		sb.append(", numberOfPartTimeEmployees=");
		sb.append(numberOfPartTimeEmployees);
		sb.append(", department=");
		sb.append(department);
		sb.append(", numberOfcontractors=");
		sb.append(numberOfcontractors);
		sb.append(", numberOfContractedWorkers=");
		sb.append(numberOfContractedWorkers);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", ncbjApplicationId=");
		sb.append(ncbjApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcbjNumberEffectiveAdd toEntityModel() {
		NcbjNumberEffectiveAddImpl ncbjNumberEffectiveAddImpl =
			new NcbjNumberEffectiveAddImpl();

		ncbjNumberEffectiveAddImpl.setNcbjNumberEffectiveAddId(
			ncbjNumberEffectiveAddId);
		ncbjNumberEffectiveAddImpl.setGroupId(groupId);
		ncbjNumberEffectiveAddImpl.setCompanyId(companyId);
		ncbjNumberEffectiveAddImpl.setUserId(userId);

		if (userName == null) {
			ncbjNumberEffectiveAddImpl.setUserName("");
		}
		else {
			ncbjNumberEffectiveAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncbjNumberEffectiveAddImpl.setCreateDate(null);
		}
		else {
			ncbjNumberEffectiveAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncbjNumberEffectiveAddImpl.setModifiedDate(null);
		}
		else {
			ncbjNumberEffectiveAddImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (numberOfFullTimeEmployees == null) {
			ncbjNumberEffectiveAddImpl.setNumberOfFullTimeEmployees("");
		}
		else {
			ncbjNumberEffectiveAddImpl.setNumberOfFullTimeEmployees(
				numberOfFullTimeEmployees);
		}

		if (numberOfPartTimeEmployees == null) {
			ncbjNumberEffectiveAddImpl.setNumberOfPartTimeEmployees("");
		}
		else {
			ncbjNumberEffectiveAddImpl.setNumberOfPartTimeEmployees(
				numberOfPartTimeEmployees);
		}

		if (department == null) {
			ncbjNumberEffectiveAddImpl.setDepartment("");
		}
		else {
			ncbjNumberEffectiveAddImpl.setDepartment(department);
		}

		if (numberOfcontractors == null) {
			ncbjNumberEffectiveAddImpl.setNumberOfcontractors("");
		}
		else {
			ncbjNumberEffectiveAddImpl.setNumberOfcontractors(
				numberOfcontractors);
		}

		if (numberOfContractedWorkers == null) {
			ncbjNumberEffectiveAddImpl.setNumberOfContractedWorkers("");
		}
		else {
			ncbjNumberEffectiveAddImpl.setNumberOfContractedWorkers(
				numberOfContractedWorkers);
		}

		if (counter == null) {
			ncbjNumberEffectiveAddImpl.setCounter("");
		}
		else {
			ncbjNumberEffectiveAddImpl.setCounter(counter);
		}

		ncbjNumberEffectiveAddImpl.setNcbjApplicationId(ncbjApplicationId);

		ncbjNumberEffectiveAddImpl.resetOriginalValues();

		return ncbjNumberEffectiveAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncbjNumberEffectiveAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		numberOfFullTimeEmployees = objectInput.readUTF();
		numberOfPartTimeEmployees = objectInput.readUTF();
		department = objectInput.readUTF();
		numberOfcontractors = objectInput.readUTF();
		numberOfContractedWorkers = objectInput.readUTF();
		counter = objectInput.readUTF();

		ncbjApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ncbjNumberEffectiveAddId);

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

		if (numberOfFullTimeEmployees == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numberOfFullTimeEmployees);
		}

		if (numberOfPartTimeEmployees == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numberOfPartTimeEmployees);
		}

		if (department == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(department);
		}

		if (numberOfcontractors == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numberOfcontractors);
		}

		if (numberOfContractedWorkers == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numberOfContractedWorkers);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(ncbjApplicationId);
	}

	public long ncbjNumberEffectiveAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String numberOfFullTimeEmployees;
	public String numberOfPartTimeEmployees;
	public String department;
	public String numberOfcontractors;
	public String numberOfContractedWorkers;
	public String counter;
	public long ncbjApplicationId;

}