/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezStatusWFMLocationAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezStatusWFMLocationAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezStatusWFMLocationAddCacheModel
	implements CacheModel<SezStatusWFMLocationAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezStatusWFMLocationAddCacheModel)) {
			return false;
		}

		SezStatusWFMLocationAddCacheModel sezStatusWFMLocationAddCacheModel =
			(SezStatusWFMLocationAddCacheModel)object;

		if (sezStatusWFHLocId ==
				sezStatusWFMLocationAddCacheModel.sezStatusWFHLocId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezStatusWFHLocId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{sezStatusWFHLocId=");
		sb.append(sezStatusWFHLocId);
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
		sb.append(", controlNumber=");
		sb.append(controlNumber);
		sb.append(", location=");
		sb.append(location);
		sb.append(", parish=");
		sb.append(parish);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezStatusWFMLocationAdd toEntityModel() {
		SezStatusWFMLocationAddImpl sezStatusWFMLocationAddImpl =
			new SezStatusWFMLocationAddImpl();

		sezStatusWFMLocationAddImpl.setSezStatusWFHLocId(sezStatusWFHLocId);
		sezStatusWFMLocationAddImpl.setGroupId(groupId);
		sezStatusWFMLocationAddImpl.setCompanyId(companyId);
		sezStatusWFMLocationAddImpl.setUserId(userId);

		if (userName == null) {
			sezStatusWFMLocationAddImpl.setUserName("");
		}
		else {
			sezStatusWFMLocationAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezStatusWFMLocationAddImpl.setCreateDate(null);
		}
		else {
			sezStatusWFMLocationAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezStatusWFMLocationAddImpl.setModifiedDate(null);
		}
		else {
			sezStatusWFMLocationAddImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (controlNumber == null) {
			sezStatusWFMLocationAddImpl.setControlNumber("");
		}
		else {
			sezStatusWFMLocationAddImpl.setControlNumber(controlNumber);
		}

		if (location == null) {
			sezStatusWFMLocationAddImpl.setLocation("");
		}
		else {
			sezStatusWFMLocationAddImpl.setLocation(location);
		}

		if (parish == null) {
			sezStatusWFMLocationAddImpl.setParish("");
		}
		else {
			sezStatusWFMLocationAddImpl.setParish(parish);
		}

		sezStatusWFMLocationAddImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezStatusWFMLocationAddImpl.resetOriginalValues();

		return sezStatusWFMLocationAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezStatusWFHLocId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		controlNumber = objectInput.readUTF();
		location = objectInput.readUTF();
		parish = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezStatusWFHLocId);

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

		if (controlNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(controlNumber);
		}

		if (location == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(location);
		}

		if (parish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(parish);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezStatusWFHLocId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String controlNumber;
	public String location;
	public String parish;
	public long sezStatusApplicationId;

}