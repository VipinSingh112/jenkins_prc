/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jadsc.application.form.service.model.JADSCNoticeOfAppearance;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JADSCNoticeOfAppearance in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JADSCNoticeOfAppearanceCacheModel
	implements CacheModel<JADSCNoticeOfAppearance>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JADSCNoticeOfAppearanceCacheModel)) {
			return false;
		}

		JADSCNoticeOfAppearanceCacheModel jadscNoticeOfAppearanceCacheModel =
			(JADSCNoticeOfAppearanceCacheModel)object;

		if (jadscNOAId == jadscNoticeOfAppearanceCacheModel.jadscNOAId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jadscNOAId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", jadscNOAId=");
		sb.append(jadscNOAId);
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
		sb.append(", fullName=");
		sb.append(fullName);
		sb.append(", addressOne=");
		sb.append(addressOne);
		sb.append(", date=");
		sb.append(date);
		sb.append(", name=");
		sb.append(name);
		sb.append(", firm=");
		sb.append(firm);
		sb.append(", address=");
		sb.append(address);
		sb.append(", telephone=");
		sb.append(telephone);
		sb.append(", jadscApplicationId=");
		sb.append(jadscApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JADSCNoticeOfAppearance toEntityModel() {
		JADSCNoticeOfAppearanceImpl jadscNoticeOfAppearanceImpl =
			new JADSCNoticeOfAppearanceImpl();

		if (uuid == null) {
			jadscNoticeOfAppearanceImpl.setUuid("");
		}
		else {
			jadscNoticeOfAppearanceImpl.setUuid(uuid);
		}

		jadscNoticeOfAppearanceImpl.setJadscNOAId(jadscNOAId);
		jadscNoticeOfAppearanceImpl.setGroupId(groupId);
		jadscNoticeOfAppearanceImpl.setCompanyId(companyId);
		jadscNoticeOfAppearanceImpl.setUserId(userId);

		if (userName == null) {
			jadscNoticeOfAppearanceImpl.setUserName("");
		}
		else {
			jadscNoticeOfAppearanceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jadscNoticeOfAppearanceImpl.setCreateDate(null);
		}
		else {
			jadscNoticeOfAppearanceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jadscNoticeOfAppearanceImpl.setModifiedDate(null);
		}
		else {
			jadscNoticeOfAppearanceImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (fullName == null) {
			jadscNoticeOfAppearanceImpl.setFullName("");
		}
		else {
			jadscNoticeOfAppearanceImpl.setFullName(fullName);
		}

		if (addressOne == null) {
			jadscNoticeOfAppearanceImpl.setAddressOne("");
		}
		else {
			jadscNoticeOfAppearanceImpl.setAddressOne(addressOne);
		}

		if (date == Long.MIN_VALUE) {
			jadscNoticeOfAppearanceImpl.setDate(null);
		}
		else {
			jadscNoticeOfAppearanceImpl.setDate(new Date(date));
		}

		if (name == null) {
			jadscNoticeOfAppearanceImpl.setName("");
		}
		else {
			jadscNoticeOfAppearanceImpl.setName(name);
		}

		if (firm == null) {
			jadscNoticeOfAppearanceImpl.setFirm("");
		}
		else {
			jadscNoticeOfAppearanceImpl.setFirm(firm);
		}

		if (address == null) {
			jadscNoticeOfAppearanceImpl.setAddress("");
		}
		else {
			jadscNoticeOfAppearanceImpl.setAddress(address);
		}

		if (telephone == null) {
			jadscNoticeOfAppearanceImpl.setTelephone("");
		}
		else {
			jadscNoticeOfAppearanceImpl.setTelephone(telephone);
		}

		jadscNoticeOfAppearanceImpl.setJadscApplicationId(jadscApplicationId);

		jadscNoticeOfAppearanceImpl.resetOriginalValues();

		return jadscNoticeOfAppearanceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		jadscNOAId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		fullName = objectInput.readUTF();
		addressOne = objectInput.readUTF();
		date = objectInput.readLong();
		name = objectInput.readUTF();
		firm = objectInput.readUTF();
		address = objectInput.readUTF();
		telephone = objectInput.readUTF();

		jadscApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(jadscNOAId);

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

		if (fullName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fullName);
		}

		if (addressOne == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(addressOne);
		}

		objectOutput.writeLong(date);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (firm == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firm);
		}

		if (address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (telephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telephone);
		}

		objectOutput.writeLong(jadscApplicationId);
	}

	public String uuid;
	public long jadscNOAId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String fullName;
	public String addressOne;
	public long date;
	public String name;
	public String firm;
	public String address;
	public String telephone;
	public long jadscApplicationId;

}