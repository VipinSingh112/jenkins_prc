/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcbjCompanyDetailAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcbjCompanyDetailAddCacheModel
	implements CacheModel<NcbjCompanyDetailAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcbjCompanyDetailAddCacheModel)) {
			return false;
		}

		NcbjCompanyDetailAddCacheModel ncbjCompanyDetailAddCacheModel =
			(NcbjCompanyDetailAddCacheModel)object;

		if (ncbjCompanyDetailAddId ==
				ncbjCompanyDetailAddCacheModel.ncbjCompanyDetailAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncbjCompanyDetailAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{ncbjCompanyDetailAddId=");
		sb.append(ncbjCompanyDetailAddId);
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
		sb.append(", headOfCompanyName=");
		sb.append(headOfCompanyName);
		sb.append(", companyAddr=");
		sb.append(companyAddr);
		sb.append(", jobTitle=");
		sb.append(jobTitle);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", telephoneNumber=");
		sb.append(telephoneNumber);
		sb.append(", contactName=");
		sb.append(contactName);
		sb.append(", contactNameJobTitle=");
		sb.append(contactNameJobTitle);
		sb.append(", contactNameEmailAddress=");
		sb.append(contactNameEmailAddress);
		sb.append(", contactNameTelephoneNum=");
		sb.append(contactNameTelephoneNum);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", ncbjApplicationId=");
		sb.append(ncbjApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcbjCompanyDetailAdd toEntityModel() {
		NcbjCompanyDetailAddImpl ncbjCompanyDetailAddImpl =
			new NcbjCompanyDetailAddImpl();

		ncbjCompanyDetailAddImpl.setNcbjCompanyDetailAddId(
			ncbjCompanyDetailAddId);
		ncbjCompanyDetailAddImpl.setGroupId(groupId);
		ncbjCompanyDetailAddImpl.setCompanyId(companyId);
		ncbjCompanyDetailAddImpl.setUserId(userId);

		if (userName == null) {
			ncbjCompanyDetailAddImpl.setUserName("");
		}
		else {
			ncbjCompanyDetailAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncbjCompanyDetailAddImpl.setCreateDate(null);
		}
		else {
			ncbjCompanyDetailAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncbjCompanyDetailAddImpl.setModifiedDate(null);
		}
		else {
			ncbjCompanyDetailAddImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (headOfCompanyName == null) {
			ncbjCompanyDetailAddImpl.setHeadOfCompanyName("");
		}
		else {
			ncbjCompanyDetailAddImpl.setHeadOfCompanyName(headOfCompanyName);
		}

		if (companyAddr == null) {
			ncbjCompanyDetailAddImpl.setCompanyAddr("");
		}
		else {
			ncbjCompanyDetailAddImpl.setCompanyAddr(companyAddr);
		}

		if (jobTitle == null) {
			ncbjCompanyDetailAddImpl.setJobTitle("");
		}
		else {
			ncbjCompanyDetailAddImpl.setJobTitle(jobTitle);
		}

		if (emailAddress == null) {
			ncbjCompanyDetailAddImpl.setEmailAddress("");
		}
		else {
			ncbjCompanyDetailAddImpl.setEmailAddress(emailAddress);
		}

		if (telephoneNumber == null) {
			ncbjCompanyDetailAddImpl.setTelephoneNumber("");
		}
		else {
			ncbjCompanyDetailAddImpl.setTelephoneNumber(telephoneNumber);
		}

		if (contactName == null) {
			ncbjCompanyDetailAddImpl.setContactName("");
		}
		else {
			ncbjCompanyDetailAddImpl.setContactName(contactName);
		}

		if (contactNameJobTitle == null) {
			ncbjCompanyDetailAddImpl.setContactNameJobTitle("");
		}
		else {
			ncbjCompanyDetailAddImpl.setContactNameJobTitle(
				contactNameJobTitle);
		}

		if (contactNameEmailAddress == null) {
			ncbjCompanyDetailAddImpl.setContactNameEmailAddress("");
		}
		else {
			ncbjCompanyDetailAddImpl.setContactNameEmailAddress(
				contactNameEmailAddress);
		}

		if (contactNameTelephoneNum == null) {
			ncbjCompanyDetailAddImpl.setContactNameTelephoneNum("");
		}
		else {
			ncbjCompanyDetailAddImpl.setContactNameTelephoneNum(
				contactNameTelephoneNum);
		}

		if (counter == null) {
			ncbjCompanyDetailAddImpl.setCounter("");
		}
		else {
			ncbjCompanyDetailAddImpl.setCounter(counter);
		}

		ncbjCompanyDetailAddImpl.setNcbjApplicationId(ncbjApplicationId);

		ncbjCompanyDetailAddImpl.resetOriginalValues();

		return ncbjCompanyDetailAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncbjCompanyDetailAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		headOfCompanyName = objectInput.readUTF();
		companyAddr = objectInput.readUTF();
		jobTitle = objectInput.readUTF();
		emailAddress = objectInput.readUTF();
		telephoneNumber = objectInput.readUTF();
		contactName = objectInput.readUTF();
		contactNameJobTitle = objectInput.readUTF();
		contactNameEmailAddress = objectInput.readUTF();
		contactNameTelephoneNum = objectInput.readUTF();
		counter = objectInput.readUTF();

		ncbjApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ncbjCompanyDetailAddId);

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

		if (headOfCompanyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(headOfCompanyName);
		}

		if (companyAddr == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyAddr);
		}

		if (jobTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(jobTitle);
		}

		if (emailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailAddress);
		}

		if (telephoneNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telephoneNumber);
		}

		if (contactName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contactName);
		}

		if (contactNameJobTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contactNameJobTitle);
		}

		if (contactNameEmailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contactNameEmailAddress);
		}

		if (contactNameTelephoneNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contactNameTelephoneNum);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(ncbjApplicationId);
	}

	public long ncbjCompanyDetailAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String headOfCompanyName;
	public String companyAddr;
	public String jobTitle;
	public String emailAddress;
	public String telephoneNumber;
	public String contactName;
	public String contactNameJobTitle;
	public String contactNameEmailAddress;
	public String contactNameTelephoneNum;
	public String counter;
	public long ncbjApplicationId;

}