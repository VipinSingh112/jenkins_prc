/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailGen;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcbjCompanyDetailGen in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcbjCompanyDetailGenCacheModel
	implements CacheModel<NcbjCompanyDetailGen>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcbjCompanyDetailGenCacheModel)) {
			return false;
		}

		NcbjCompanyDetailGenCacheModel ncbjCompanyDetailGenCacheModel =
			(NcbjCompanyDetailGenCacheModel)object;

		if (ncbjCompanyDetailGenId ==
				ncbjCompanyDetailGenCacheModel.ncbjCompanyDetailGenId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncbjCompanyDetailGenId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{ncbjCompanyDetailGenId=");
		sb.append(ncbjCompanyDetailGenId);
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
		sb.append(", companyName=");
		sb.append(companyName);
		sb.append(", companyAddress=");
		sb.append(companyAddress);
		sb.append(", headOfCompany=");
		sb.append(headOfCompany);
		sb.append(", jobTitleOne=");
		sb.append(jobTitleOne);
		sb.append(", companyEmailOne=");
		sb.append(companyEmailOne);
		sb.append(", companyNumOne=");
		sb.append(companyNumOne);
		sb.append(", contactName=");
		sb.append(contactName);
		sb.append(", jobTitleTwo=");
		sb.append(jobTitleTwo);
		sb.append(", companyEmailTwo=");
		sb.append(companyEmailTwo);
		sb.append(", companyNumTwo=");
		sb.append(companyNumTwo);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", ncbjApplicationId=");
		sb.append(ncbjApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcbjCompanyDetailGen toEntityModel() {
		NcbjCompanyDetailGenImpl ncbjCompanyDetailGenImpl =
			new NcbjCompanyDetailGenImpl();

		ncbjCompanyDetailGenImpl.setNcbjCompanyDetailGenId(
			ncbjCompanyDetailGenId);
		ncbjCompanyDetailGenImpl.setGroupId(groupId);
		ncbjCompanyDetailGenImpl.setCompanyId(companyId);
		ncbjCompanyDetailGenImpl.setUserId(userId);

		if (userName == null) {
			ncbjCompanyDetailGenImpl.setUserName("");
		}
		else {
			ncbjCompanyDetailGenImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncbjCompanyDetailGenImpl.setCreateDate(null);
		}
		else {
			ncbjCompanyDetailGenImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncbjCompanyDetailGenImpl.setModifiedDate(null);
		}
		else {
			ncbjCompanyDetailGenImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (companyName == null) {
			ncbjCompanyDetailGenImpl.setCompanyName("");
		}
		else {
			ncbjCompanyDetailGenImpl.setCompanyName(companyName);
		}

		if (companyAddress == null) {
			ncbjCompanyDetailGenImpl.setCompanyAddress("");
		}
		else {
			ncbjCompanyDetailGenImpl.setCompanyAddress(companyAddress);
		}

		if (headOfCompany == null) {
			ncbjCompanyDetailGenImpl.setHeadOfCompany("");
		}
		else {
			ncbjCompanyDetailGenImpl.setHeadOfCompany(headOfCompany);
		}

		if (jobTitleOne == null) {
			ncbjCompanyDetailGenImpl.setJobTitleOne("");
		}
		else {
			ncbjCompanyDetailGenImpl.setJobTitleOne(jobTitleOne);
		}

		if (companyEmailOne == null) {
			ncbjCompanyDetailGenImpl.setCompanyEmailOne("");
		}
		else {
			ncbjCompanyDetailGenImpl.setCompanyEmailOne(companyEmailOne);
		}

		if (companyNumOne == null) {
			ncbjCompanyDetailGenImpl.setCompanyNumOne("");
		}
		else {
			ncbjCompanyDetailGenImpl.setCompanyNumOne(companyNumOne);
		}

		if (contactName == null) {
			ncbjCompanyDetailGenImpl.setContactName("");
		}
		else {
			ncbjCompanyDetailGenImpl.setContactName(contactName);
		}

		if (jobTitleTwo == null) {
			ncbjCompanyDetailGenImpl.setJobTitleTwo("");
		}
		else {
			ncbjCompanyDetailGenImpl.setJobTitleTwo(jobTitleTwo);
		}

		if (companyEmailTwo == null) {
			ncbjCompanyDetailGenImpl.setCompanyEmailTwo("");
		}
		else {
			ncbjCompanyDetailGenImpl.setCompanyEmailTwo(companyEmailTwo);
		}

		if (companyNumTwo == null) {
			ncbjCompanyDetailGenImpl.setCompanyNumTwo("");
		}
		else {
			ncbjCompanyDetailGenImpl.setCompanyNumTwo(companyNumTwo);
		}

		if (counter == null) {
			ncbjCompanyDetailGenImpl.setCounter("");
		}
		else {
			ncbjCompanyDetailGenImpl.setCounter(counter);
		}

		ncbjCompanyDetailGenImpl.setNcbjApplicationId(ncbjApplicationId);

		ncbjCompanyDetailGenImpl.resetOriginalValues();

		return ncbjCompanyDetailGenImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncbjCompanyDetailGenId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		companyName = objectInput.readUTF();
		companyAddress = objectInput.readUTF();
		headOfCompany = objectInput.readUTF();
		jobTitleOne = objectInput.readUTF();
		companyEmailOne = objectInput.readUTF();
		companyNumOne = objectInput.readUTF();
		contactName = objectInput.readUTF();
		jobTitleTwo = objectInput.readUTF();
		companyEmailTwo = objectInput.readUTF();
		companyNumTwo = objectInput.readUTF();
		counter = objectInput.readUTF();

		ncbjApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ncbjCompanyDetailGenId);

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

		if (companyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyName);
		}

		if (companyAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyAddress);
		}

		if (headOfCompany == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(headOfCompany);
		}

		if (jobTitleOne == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(jobTitleOne);
		}

		if (companyEmailOne == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyEmailOne);
		}

		if (companyNumOne == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyNumOne);
		}

		if (contactName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contactName);
		}

		if (jobTitleTwo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(jobTitleTwo);
		}

		if (companyEmailTwo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyEmailTwo);
		}

		if (companyNumTwo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyNumTwo);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(ncbjApplicationId);
	}

	public long ncbjCompanyDetailGenId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String companyName;
	public String companyAddress;
	public String headOfCompany;
	public String jobTitleOne;
	public String companyEmailOne;
	public String companyNumOne;
	public String contactName;
	public String jobTitleTwo;
	public String companyEmailTwo;
	public String companyNumTwo;
	public String counter;
	public long ncbjApplicationId;

}