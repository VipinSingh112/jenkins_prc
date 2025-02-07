/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.JtbAddListDriverInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JtbAddListDriverInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JtbAddListDriverInfoCacheModel
	implements CacheModel<JtbAddListDriverInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JtbAddListDriverInfoCacheModel)) {
			return false;
		}

		JtbAddListDriverInfoCacheModel jtbAddListDriverInfoCacheModel =
			(JtbAddListDriverInfoCacheModel)object;

		if (jtbAddListDriverInfoId ==
				jtbAddListDriverInfoCacheModel.jtbAddListDriverInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jtbAddListDriverInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{jtbAddListDriverInfoId=");
		sb.append(jtbAddListDriverInfoId);
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
		sb.append(", driverName=");
		sb.append(driverName);
		sb.append(", driverLicence=");
		sb.append(driverLicence);
		sb.append(", driverExpiryDate=");
		sb.append(driverExpiryDate);
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JtbAddListDriverInfo toEntityModel() {
		JtbAddListDriverInfoImpl jtbAddListDriverInfoImpl =
			new JtbAddListDriverInfoImpl();

		jtbAddListDriverInfoImpl.setJtbAddListDriverInfoId(
			jtbAddListDriverInfoId);
		jtbAddListDriverInfoImpl.setGroupId(groupId);
		jtbAddListDriverInfoImpl.setCompanyId(companyId);
		jtbAddListDriverInfoImpl.setUserId(userId);

		if (userName == null) {
			jtbAddListDriverInfoImpl.setUserName("");
		}
		else {
			jtbAddListDriverInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jtbAddListDriverInfoImpl.setCreateDate(null);
		}
		else {
			jtbAddListDriverInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jtbAddListDriverInfoImpl.setModifiedDate(null);
		}
		else {
			jtbAddListDriverInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (counter == null) {
			jtbAddListDriverInfoImpl.setCounter("");
		}
		else {
			jtbAddListDriverInfoImpl.setCounter(counter);
		}

		if (driverName == null) {
			jtbAddListDriverInfoImpl.setDriverName("");
		}
		else {
			jtbAddListDriverInfoImpl.setDriverName(driverName);
		}

		if (driverLicence == null) {
			jtbAddListDriverInfoImpl.setDriverLicence("");
		}
		else {
			jtbAddListDriverInfoImpl.setDriverLicence(driverLicence);
		}

		if (driverExpiryDate == Long.MIN_VALUE) {
			jtbAddListDriverInfoImpl.setDriverExpiryDate(null);
		}
		else {
			jtbAddListDriverInfoImpl.setDriverExpiryDate(
				new Date(driverExpiryDate));
		}

		jtbAddListDriverInfoImpl.setJtbApplicationId(jtbApplicationId);

		jtbAddListDriverInfoImpl.resetOriginalValues();

		return jtbAddListDriverInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		jtbAddListDriverInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		counter = objectInput.readUTF();
		driverName = objectInput.readUTF();
		driverLicence = objectInput.readUTF();
		driverExpiryDate = objectInput.readLong();

		jtbApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(jtbAddListDriverInfoId);

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

		if (driverName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(driverName);
		}

		if (driverLicence == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(driverLicence);
		}

		objectOutput.writeLong(driverExpiryDate);

		objectOutput.writeLong(jtbApplicationId);
	}

	public long jtbAddListDriverInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String counter;
	public String driverName;
	public String driverLicence;
	public long driverExpiryDate;
	public long jtbApplicationId;

}