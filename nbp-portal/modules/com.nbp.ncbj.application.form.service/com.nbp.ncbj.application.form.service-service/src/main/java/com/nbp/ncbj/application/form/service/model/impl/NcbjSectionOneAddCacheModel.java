/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncbj.application.form.service.model.NcbjSectionOneAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcbjSectionOneAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcbjSectionOneAddCacheModel
	implements CacheModel<NcbjSectionOneAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcbjSectionOneAddCacheModel)) {
			return false;
		}

		NcbjSectionOneAddCacheModel ncbjSectionOneAddCacheModel =
			(NcbjSectionOneAddCacheModel)object;

		if (ncbjSectionOneAddId ==
				ncbjSectionOneAddCacheModel.ncbjSectionOneAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncbjSectionOneAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{ncbjSectionOneAddId=");
		sb.append(ncbjSectionOneAddId);
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
		sb.append(", JobTitle=");
		sb.append(JobTitle);
		sb.append(", eMeilAddress=");
		sb.append(eMeilAddress);
		sb.append(", telephoneNumber=");
		sb.append(telephoneNumber);
		sb.append(", contactName=");
		sb.append(contactName);
		sb.append(", contactNameJobTitle=");
		sb.append(contactNameJobTitle);
		sb.append(", contactNameEmailAddress=");
		sb.append(contactNameEmailAddress);
		sb.append(", contactNameTelephoneNum =");
		sb.append(contactNameTelephoneNum);
		sb.append(", ncbjApplicationId=");
		sb.append(ncbjApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcbjSectionOneAdd toEntityModel() {
		NcbjSectionOneAddImpl ncbjSectionOneAddImpl =
			new NcbjSectionOneAddImpl();

		ncbjSectionOneAddImpl.setNcbjSectionOneAddId(ncbjSectionOneAddId);
		ncbjSectionOneAddImpl.setGroupId(groupId);
		ncbjSectionOneAddImpl.setCompanyId(companyId);
		ncbjSectionOneAddImpl.setUserId(userId);

		if (userName == null) {
			ncbjSectionOneAddImpl.setUserName("");
		}
		else {
			ncbjSectionOneAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncbjSectionOneAddImpl.setCreateDate(null);
		}
		else {
			ncbjSectionOneAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncbjSectionOneAddImpl.setModifiedDate(null);
		}
		else {
			ncbjSectionOneAddImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (headOfCompanyName == null) {
			ncbjSectionOneAddImpl.setHeadOfCompanyName("");
		}
		else {
			ncbjSectionOneAddImpl.setHeadOfCompanyName(headOfCompanyName);
		}

		if (JobTitle == null) {
			ncbjSectionOneAddImpl.setJobTitle("");
		}
		else {
			ncbjSectionOneAddImpl.setJobTitle(JobTitle);
		}

		if (eMeilAddress == Long.MIN_VALUE) {
			ncbjSectionOneAddImpl.setEMeilAddress(null);
		}
		else {
			ncbjSectionOneAddImpl.setEMeilAddress(new Date(eMeilAddress));
		}

		if (telephoneNumber == Long.MIN_VALUE) {
			ncbjSectionOneAddImpl.setTelephoneNumber(null);
		}
		else {
			ncbjSectionOneAddImpl.setTelephoneNumber(new Date(telephoneNumber));
		}

		if (contactName == Long.MIN_VALUE) {
			ncbjSectionOneAddImpl.setContactName(null);
		}
		else {
			ncbjSectionOneAddImpl.setContactName(new Date(contactName));
		}

		if (contactNameJobTitle == Long.MIN_VALUE) {
			ncbjSectionOneAddImpl.setContactNameJobTitle(null);
		}
		else {
			ncbjSectionOneAddImpl.setContactNameJobTitle(
				new Date(contactNameJobTitle));
		}

		if (contactNameEmailAddress == Long.MIN_VALUE) {
			ncbjSectionOneAddImpl.setContactNameEmailAddress(null);
		}
		else {
			ncbjSectionOneAddImpl.setContactNameEmailAddress(
				new Date(contactNameEmailAddress));
		}

		if (contactNameTelephoneNum == Long.MIN_VALUE) {
			ncbjSectionOneAddImpl.setContactNameTelephoneNum(null);
		}
		else {
			ncbjSectionOneAddImpl.setContactNameTelephoneNum(
				new Date(contactNameTelephoneNum));
		}

		ncbjSectionOneAddImpl.setNcbjApplicationId(ncbjApplicationId);

		ncbjSectionOneAddImpl.resetOriginalValues();

		return ncbjSectionOneAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncbjSectionOneAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		headOfCompanyName = objectInput.readUTF();
		JobTitle = objectInput.readUTF();
		eMeilAddress = objectInput.readLong();
		telephoneNumber = objectInput.readLong();
		contactName = objectInput.readLong();
		contactNameJobTitle = objectInput.readLong();
		contactNameEmailAddress = objectInput.readLong();
		contactNameTelephoneNum = objectInput.readLong();

		ncbjApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ncbjSectionOneAddId);

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

		if (JobTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(JobTitle);
		}

		objectOutput.writeLong(eMeilAddress);
		objectOutput.writeLong(telephoneNumber);
		objectOutput.writeLong(contactName);
		objectOutput.writeLong(contactNameJobTitle);
		objectOutput.writeLong(contactNameEmailAddress);
		objectOutput.writeLong(contactNameTelephoneNum);

		objectOutput.writeLong(ncbjApplicationId);
	}

	public long ncbjSectionOneAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String headOfCompanyName;
	public String JobTitle;
	public long eMeilAddress;
	public long telephoneNumber;
	public long contactName;
	public long contactNameJobTitle;
	public long contactNameEmailAddress;
	public long contactNameTelephoneNum;
	public long ncbjApplicationId;

}