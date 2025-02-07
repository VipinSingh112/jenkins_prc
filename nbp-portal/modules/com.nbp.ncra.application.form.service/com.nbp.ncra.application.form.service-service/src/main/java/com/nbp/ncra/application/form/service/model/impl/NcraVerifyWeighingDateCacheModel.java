/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDate;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcraVerifyWeighingDate in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcraVerifyWeighingDateCacheModel
	implements CacheModel<NcraVerifyWeighingDate>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcraVerifyWeighingDateCacheModel)) {
			return false;
		}

		NcraVerifyWeighingDateCacheModel ncraVerifyWeighingDateCacheModel =
			(NcraVerifyWeighingDateCacheModel)object;

		if (ncraVerifyWeighingDateId ==
				ncraVerifyWeighingDateCacheModel.ncraVerifyWeighingDateId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncraVerifyWeighingDateId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{ncraVerifyWeighingDateId=");
		sb.append(ncraVerifyWeighingDateId);
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
		sb.append(", weighingDate=");
		sb.append(weighingDate);
		sb.append(", ncraApplicationId=");
		sb.append(ncraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcraVerifyWeighingDate toEntityModel() {
		NcraVerifyWeighingDateImpl ncraVerifyWeighingDateImpl =
			new NcraVerifyWeighingDateImpl();

		ncraVerifyWeighingDateImpl.setNcraVerifyWeighingDateId(
			ncraVerifyWeighingDateId);
		ncraVerifyWeighingDateImpl.setGroupId(groupId);
		ncraVerifyWeighingDateImpl.setCompanyId(companyId);
		ncraVerifyWeighingDateImpl.setUserId(userId);

		if (userName == null) {
			ncraVerifyWeighingDateImpl.setUserName("");
		}
		else {
			ncraVerifyWeighingDateImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncraVerifyWeighingDateImpl.setCreateDate(null);
		}
		else {
			ncraVerifyWeighingDateImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncraVerifyWeighingDateImpl.setModifiedDate(null);
		}
		else {
			ncraVerifyWeighingDateImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (weighingDate == Long.MIN_VALUE) {
			ncraVerifyWeighingDateImpl.setWeighingDate(null);
		}
		else {
			ncraVerifyWeighingDateImpl.setWeighingDate(new Date(weighingDate));
		}

		ncraVerifyWeighingDateImpl.setNcraApplicationId(ncraApplicationId);

		ncraVerifyWeighingDateImpl.resetOriginalValues();

		return ncraVerifyWeighingDateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncraVerifyWeighingDateId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		weighingDate = objectInput.readLong();

		ncraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ncraVerifyWeighingDateId);

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
		objectOutput.writeLong(weighingDate);

		objectOutput.writeLong(ncraApplicationId);
	}

	public long ncraVerifyWeighingDateId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long weighingDate;
	public long ncraApplicationId;

}