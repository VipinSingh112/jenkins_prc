/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.fire.brigade.application.form.service.model.FireBrigadeSignatureInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FireBrigadeSignatureInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FireBrigadeSignatureInfoCacheModel
	implements CacheModel<FireBrigadeSignatureInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FireBrigadeSignatureInfoCacheModel)) {
			return false;
		}

		FireBrigadeSignatureInfoCacheModel fireBrigadeSignatureInfoCacheModel =
			(FireBrigadeSignatureInfoCacheModel)object;

		if (fireBrigadeSignatureInfoId ==
				fireBrigadeSignatureInfoCacheModel.fireBrigadeSignatureInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fireBrigadeSignatureInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{fireBrigadeSignatureInfoId=");
		sb.append(fireBrigadeSignatureInfoId);
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
		sb.append(", title=");
		sb.append(title);
		sb.append(", name=");
		sb.append(name);
		sb.append(", telephone=");
		sb.append(telephone);
		sb.append(", fax=");
		sb.append(fax);
		sb.append(", trn=");
		sb.append(trn);
		sb.append(", email=");
		sb.append(email);
		sb.append(", date=");
		sb.append(date);
		sb.append(", Address=");
		sb.append(Address);
		sb.append(", fireBrigadeApplicationId=");
		sb.append(fireBrigadeApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FireBrigadeSignatureInfo toEntityModel() {
		FireBrigadeSignatureInfoImpl fireBrigadeSignatureInfoImpl =
			new FireBrigadeSignatureInfoImpl();

		fireBrigadeSignatureInfoImpl.setFireBrigadeSignatureInfoId(
			fireBrigadeSignatureInfoId);
		fireBrigadeSignatureInfoImpl.setGroupId(groupId);
		fireBrigadeSignatureInfoImpl.setCompanyId(companyId);
		fireBrigadeSignatureInfoImpl.setUserId(userId);

		if (userName == null) {
			fireBrigadeSignatureInfoImpl.setUserName("");
		}
		else {
			fireBrigadeSignatureInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			fireBrigadeSignatureInfoImpl.setCreateDate(null);
		}
		else {
			fireBrigadeSignatureInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			fireBrigadeSignatureInfoImpl.setModifiedDate(null);
		}
		else {
			fireBrigadeSignatureInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (title == null) {
			fireBrigadeSignatureInfoImpl.setTitle("");
		}
		else {
			fireBrigadeSignatureInfoImpl.setTitle(title);
		}

		if (name == null) {
			fireBrigadeSignatureInfoImpl.setName("");
		}
		else {
			fireBrigadeSignatureInfoImpl.setName(name);
		}

		if (telephone == null) {
			fireBrigadeSignatureInfoImpl.setTelephone("");
		}
		else {
			fireBrigadeSignatureInfoImpl.setTelephone(telephone);
		}

		if (fax == null) {
			fireBrigadeSignatureInfoImpl.setFax("");
		}
		else {
			fireBrigadeSignatureInfoImpl.setFax(fax);
		}

		if (trn == null) {
			fireBrigadeSignatureInfoImpl.setTrn("");
		}
		else {
			fireBrigadeSignatureInfoImpl.setTrn(trn);
		}

		if (email == null) {
			fireBrigadeSignatureInfoImpl.setEmail("");
		}
		else {
			fireBrigadeSignatureInfoImpl.setEmail(email);
		}

		if (date == Long.MIN_VALUE) {
			fireBrigadeSignatureInfoImpl.setDate(null);
		}
		else {
			fireBrigadeSignatureInfoImpl.setDate(new Date(date));
		}

		if (Address == null) {
			fireBrigadeSignatureInfoImpl.setAddress("");
		}
		else {
			fireBrigadeSignatureInfoImpl.setAddress(Address);
		}

		fireBrigadeSignatureInfoImpl.setFireBrigadeApplicationId(
			fireBrigadeApplicationId);

		fireBrigadeSignatureInfoImpl.resetOriginalValues();

		return fireBrigadeSignatureInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fireBrigadeSignatureInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		title = objectInput.readUTF();
		name = objectInput.readUTF();
		telephone = objectInput.readUTF();
		fax = objectInput.readUTF();
		trn = objectInput.readUTF();
		email = objectInput.readUTF();
		date = objectInput.readLong();
		Address = objectInput.readUTF();

		fireBrigadeApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(fireBrigadeSignatureInfoId);

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

		if (title == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (telephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telephone);
		}

		if (fax == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fax);
		}

		if (trn == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(trn);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		objectOutput.writeLong(date);

		if (Address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Address);
		}

		objectOutput.writeLong(fireBrigadeApplicationId);
	}

	public long fireBrigadeSignatureInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String title;
	public String name;
	public String telephone;
	public String fax;
	public String trn;
	public String email;
	public long date;
	public String Address;
	public long fireBrigadeApplicationId;

}