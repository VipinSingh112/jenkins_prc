/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AccCerBodyInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccCerBodyInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccCerBodyInfoCacheModel
	implements CacheModel<AccCerBodyInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccCerBodyInfoCacheModel)) {
			return false;
		}

		AccCerBodyInfoCacheModel accCerBodyInfoCacheModel =
			(AccCerBodyInfoCacheModel)object;

		if (accCerBodyInfoId == accCerBodyInfoCacheModel.accCerBodyInfoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accCerBodyInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", accCerBodyInfoId=");
		sb.append(accCerBodyInfoId);
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
		sb.append(", describeMechanism=");
		sb.append(describeMechanism);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AccCerBodyInfo toEntityModel() {
		AccCerBodyInfoImpl accCerBodyInfoImpl = new AccCerBodyInfoImpl();

		if (uuid == null) {
			accCerBodyInfoImpl.setUuid("");
		}
		else {
			accCerBodyInfoImpl.setUuid(uuid);
		}

		accCerBodyInfoImpl.setAccCerBodyInfoId(accCerBodyInfoId);
		accCerBodyInfoImpl.setGroupId(groupId);
		accCerBodyInfoImpl.setCompanyId(companyId);
		accCerBodyInfoImpl.setUserId(userId);

		if (userName == null) {
			accCerBodyInfoImpl.setUserName("");
		}
		else {
			accCerBodyInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accCerBodyInfoImpl.setCreateDate(null);
		}
		else {
			accCerBodyInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accCerBodyInfoImpl.setModifiedDate(null);
		}
		else {
			accCerBodyInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (describeMechanism == null) {
			accCerBodyInfoImpl.setDescribeMechanism("");
		}
		else {
			accCerBodyInfoImpl.setDescribeMechanism(describeMechanism);
		}

		accCerBodyInfoImpl.setJanaacApplicationId(janaacApplicationId);

		accCerBodyInfoImpl.resetOriginalValues();

		return accCerBodyInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		accCerBodyInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		describeMechanism = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(accCerBodyInfoId);

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

		if (describeMechanism == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(describeMechanism);
		}

		objectOutput.writeLong(janaacApplicationId);
	}

	public String uuid;
	public long accCerBodyInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String describeMechanism;
	public long janaacApplicationId;

}