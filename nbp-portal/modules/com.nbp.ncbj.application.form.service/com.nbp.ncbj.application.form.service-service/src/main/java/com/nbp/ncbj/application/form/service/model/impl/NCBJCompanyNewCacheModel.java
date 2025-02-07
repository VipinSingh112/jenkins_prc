/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncbj.application.form.service.model.NCBJCompanyNew;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NCBJCompanyNew in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NCBJCompanyNewCacheModel
	implements CacheModel<NCBJCompanyNew>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NCBJCompanyNewCacheModel)) {
			return false;
		}

		NCBJCompanyNewCacheModel ncbjCompanyNewCacheModel =
			(NCBJCompanyNewCacheModel)object;

		if (nCBJCompanyNewId == ncbjCompanyNewCacheModel.nCBJCompanyNewId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, nCBJCompanyNewId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{nCBJCompanyNewId=");
		sb.append(nCBJCompanyNewId);
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
		sb.append(", ncbjApplicationId=");
		sb.append(ncbjApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NCBJCompanyNew toEntityModel() {
		NCBJCompanyNewImpl ncbjCompanyNewImpl = new NCBJCompanyNewImpl();

		ncbjCompanyNewImpl.setNCBJCompanyNewId(nCBJCompanyNewId);
		ncbjCompanyNewImpl.setGroupId(groupId);
		ncbjCompanyNewImpl.setCompanyId(companyId);
		ncbjCompanyNewImpl.setUserId(userId);

		if (userName == null) {
			ncbjCompanyNewImpl.setUserName("");
		}
		else {
			ncbjCompanyNewImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncbjCompanyNewImpl.setCreateDate(null);
		}
		else {
			ncbjCompanyNewImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncbjCompanyNewImpl.setModifiedDate(null);
		}
		else {
			ncbjCompanyNewImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (companyName == null) {
			ncbjCompanyNewImpl.setCompanyName("");
		}
		else {
			ncbjCompanyNewImpl.setCompanyName(companyName);
		}

		if (companyAddress == null) {
			ncbjCompanyNewImpl.setCompanyAddress("");
		}
		else {
			ncbjCompanyNewImpl.setCompanyAddress(companyAddress);
		}

		if (headOfCompany == null) {
			ncbjCompanyNewImpl.setHeadOfCompany("");
		}
		else {
			ncbjCompanyNewImpl.setHeadOfCompany(headOfCompany);
		}

		if (jobTitleOne == null) {
			ncbjCompanyNewImpl.setJobTitleOne("");
		}
		else {
			ncbjCompanyNewImpl.setJobTitleOne(jobTitleOne);
		}

		if (companyEmailOne == null) {
			ncbjCompanyNewImpl.setCompanyEmailOne("");
		}
		else {
			ncbjCompanyNewImpl.setCompanyEmailOne(companyEmailOne);
		}

		if (companyNumOne == null) {
			ncbjCompanyNewImpl.setCompanyNumOne("");
		}
		else {
			ncbjCompanyNewImpl.setCompanyNumOne(companyNumOne);
		}

		if (contactName == null) {
			ncbjCompanyNewImpl.setContactName("");
		}
		else {
			ncbjCompanyNewImpl.setContactName(contactName);
		}

		if (jobTitleTwo == null) {
			ncbjCompanyNewImpl.setJobTitleTwo("");
		}
		else {
			ncbjCompanyNewImpl.setJobTitleTwo(jobTitleTwo);
		}

		if (companyEmailTwo == null) {
			ncbjCompanyNewImpl.setCompanyEmailTwo("");
		}
		else {
			ncbjCompanyNewImpl.setCompanyEmailTwo(companyEmailTwo);
		}

		if (companyNumTwo == null) {
			ncbjCompanyNewImpl.setCompanyNumTwo("");
		}
		else {
			ncbjCompanyNewImpl.setCompanyNumTwo(companyNumTwo);
		}

		ncbjCompanyNewImpl.setNcbjApplicationId(ncbjApplicationId);

		ncbjCompanyNewImpl.resetOriginalValues();

		return ncbjCompanyNewImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		nCBJCompanyNewId = objectInput.readLong();

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

		ncbjApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(nCBJCompanyNewId);

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

		objectOutput.writeLong(ncbjApplicationId);
	}

	public long nCBJCompanyNewId;
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
	public long ncbjApplicationId;

}