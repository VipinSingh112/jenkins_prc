/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezDevShareComDirectorShipAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezDevShareComDirectorShipAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezDevShareComDirectorShipAddCacheModel
	implements CacheModel<SezDevShareComDirectorShipAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezDevShareComDirectorShipAddCacheModel)) {
			return false;
		}

		SezDevShareComDirectorShipAddCacheModel
			sezDevShareComDirectorShipAddCacheModel =
				(SezDevShareComDirectorShipAddCacheModel)object;

		if (sezDevSharComDirectorShipAddId ==
				sezDevShareComDirectorShipAddCacheModel.
					sezDevSharComDirectorShipAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezDevSharComDirectorShipAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{sezDevSharComDirectorShipAddId=");
		sb.append(sezDevSharComDirectorShipAddId);
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
		sb.append(", name=");
		sb.append(name);
		sb.append(", company=");
		sb.append(company);
		sb.append(", replationship=");
		sb.append(replationship);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezDevShareComDirectorShipAdd toEntityModel() {
		SezDevShareComDirectorShipAddImpl sezDevShareComDirectorShipAddImpl =
			new SezDevShareComDirectorShipAddImpl();

		sezDevShareComDirectorShipAddImpl.setSezDevSharComDirectorShipAddId(
			sezDevSharComDirectorShipAddId);
		sezDevShareComDirectorShipAddImpl.setGroupId(groupId);
		sezDevShareComDirectorShipAddImpl.setCompanyId(companyId);
		sezDevShareComDirectorShipAddImpl.setUserId(userId);

		if (userName == null) {
			sezDevShareComDirectorShipAddImpl.setUserName("");
		}
		else {
			sezDevShareComDirectorShipAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezDevShareComDirectorShipAddImpl.setCreateDate(null);
		}
		else {
			sezDevShareComDirectorShipAddImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezDevShareComDirectorShipAddImpl.setModifiedDate(null);
		}
		else {
			sezDevShareComDirectorShipAddImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (name == null) {
			sezDevShareComDirectorShipAddImpl.setName("");
		}
		else {
			sezDevShareComDirectorShipAddImpl.setName(name);
		}

		if (company == null) {
			sezDevShareComDirectorShipAddImpl.setCompany("");
		}
		else {
			sezDevShareComDirectorShipAddImpl.setCompany(company);
		}

		if (replationship == null) {
			sezDevShareComDirectorShipAddImpl.setReplationship("");
		}
		else {
			sezDevShareComDirectorShipAddImpl.setReplationship(replationship);
		}

		if (counter == null) {
			sezDevShareComDirectorShipAddImpl.setCounter("");
		}
		else {
			sezDevShareComDirectorShipAddImpl.setCounter(counter);
		}

		sezDevShareComDirectorShipAddImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezDevShareComDirectorShipAddImpl.resetOriginalValues();

		return sezDevShareComDirectorShipAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezDevSharComDirectorShipAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		company = objectInput.readUTF();
		replationship = objectInput.readUTF();
		counter = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezDevSharComDirectorShipAddId);

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

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (company == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(company);
		}

		if (replationship == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(replationship);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezDevSharComDirectorShipAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String company;
	public String replationship;
	public String counter;
	public long sezStatusApplicationId;

}