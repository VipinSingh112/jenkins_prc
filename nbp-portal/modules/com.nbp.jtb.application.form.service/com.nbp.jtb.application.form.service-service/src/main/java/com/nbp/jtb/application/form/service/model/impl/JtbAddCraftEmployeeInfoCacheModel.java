/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.JtbAddCraftEmployeeInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JtbAddCraftEmployeeInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JtbAddCraftEmployeeInfoCacheModel
	implements CacheModel<JtbAddCraftEmployeeInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JtbAddCraftEmployeeInfoCacheModel)) {
			return false;
		}

		JtbAddCraftEmployeeInfoCacheModel jtbAddCraftEmployeeInfoCacheModel =
			(JtbAddCraftEmployeeInfoCacheModel)object;

		if (jtbAddCraftEmployeeInfoId ==
				jtbAddCraftEmployeeInfoCacheModel.jtbAddCraftEmployeeInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jtbAddCraftEmployeeInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{jtbAddCraftEmployeeInfoId=");
		sb.append(jtbAddCraftEmployeeInfoId);
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
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", empName=");
		sb.append(empName);
		sb.append(", empAddress=");
		sb.append(empAddress);
		sb.append(", empPhoneNo=");
		sb.append(empPhoneNo);
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JtbAddCraftEmployeeInfo toEntityModel() {
		JtbAddCraftEmployeeInfoImpl jtbAddCraftEmployeeInfoImpl =
			new JtbAddCraftEmployeeInfoImpl();

		jtbAddCraftEmployeeInfoImpl.setJtbAddCraftEmployeeInfoId(
			jtbAddCraftEmployeeInfoId);
		jtbAddCraftEmployeeInfoImpl.setGroupId(groupId);
		jtbAddCraftEmployeeInfoImpl.setCompanyId(companyId);
		jtbAddCraftEmployeeInfoImpl.setUserId(userId);

		if (userName == null) {
			jtbAddCraftEmployeeInfoImpl.setUserName("");
		}
		else {
			jtbAddCraftEmployeeInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jtbAddCraftEmployeeInfoImpl.setCreateDate(null);
		}
		else {
			jtbAddCraftEmployeeInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jtbAddCraftEmployeeInfoImpl.setModifiedDate(null);
		}
		else {
			jtbAddCraftEmployeeInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (counter == null) {
			jtbAddCraftEmployeeInfoImpl.setCounter("");
		}
		else {
			jtbAddCraftEmployeeInfoImpl.setCounter(counter);
		}

		if (empName == null) {
			jtbAddCraftEmployeeInfoImpl.setEmpName("");
		}
		else {
			jtbAddCraftEmployeeInfoImpl.setEmpName(empName);
		}

		if (empAddress == null) {
			jtbAddCraftEmployeeInfoImpl.setEmpAddress("");
		}
		else {
			jtbAddCraftEmployeeInfoImpl.setEmpAddress(empAddress);
		}

		if (empPhoneNo == null) {
			jtbAddCraftEmployeeInfoImpl.setEmpPhoneNo("");
		}
		else {
			jtbAddCraftEmployeeInfoImpl.setEmpPhoneNo(empPhoneNo);
		}

		jtbAddCraftEmployeeInfoImpl.setJtbApplicationId(jtbApplicationId);

		jtbAddCraftEmployeeInfoImpl.resetOriginalValues();

		return jtbAddCraftEmployeeInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		jtbAddCraftEmployeeInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		counter = objectInput.readUTF();
		empName = objectInput.readUTF();
		empAddress = objectInput.readUTF();
		empPhoneNo = objectInput.readUTF();

		jtbApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(jtbAddCraftEmployeeInfoId);

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

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		if (empName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(empName);
		}

		if (empAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(empAddress);
		}

		if (empPhoneNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(empPhoneNo);
		}

		objectOutput.writeLong(jtbApplicationId);
	}

	public long jtbAddCraftEmployeeInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String counter;
	public String empName;
	public String empAddress;
	public String empPhoneNo;
	public long jtbApplicationId;

}