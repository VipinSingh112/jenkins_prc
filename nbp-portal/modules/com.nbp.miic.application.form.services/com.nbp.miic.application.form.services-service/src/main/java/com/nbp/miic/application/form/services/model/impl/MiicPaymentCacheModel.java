/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.miic.application.form.services.model.MiicPayment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MiicPayment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MiicPaymentCacheModel
	implements CacheModel<MiicPayment>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MiicPaymentCacheModel)) {
			return false;
		}

		MiicPaymentCacheModel miicPaymentCacheModel =
			(MiicPaymentCacheModel)object;

		if (miicPaymentId == miicPaymentCacheModel.miicPaymentId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, miicPaymentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{miicPaymentId=");
		sb.append(miicPaymentId);
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
		sb.append(", miicApplicationId=");
		sb.append(miicApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MiicPayment toEntityModel() {
		MiicPaymentImpl miicPaymentImpl = new MiicPaymentImpl();

		miicPaymentImpl.setMiicPaymentId(miicPaymentId);
		miicPaymentImpl.setGroupId(groupId);
		miicPaymentImpl.setCompanyId(companyId);
		miicPaymentImpl.setUserId(userId);

		if (userName == null) {
			miicPaymentImpl.setUserName("");
		}
		else {
			miicPaymentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			miicPaymentImpl.setCreateDate(null);
		}
		else {
			miicPaymentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			miicPaymentImpl.setModifiedDate(null);
		}
		else {
			miicPaymentImpl.setModifiedDate(new Date(modifiedDate));
		}

		miicPaymentImpl.setMiicApplicationId(miicApplicationId);

		miicPaymentImpl.resetOriginalValues();

		return miicPaymentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		miicPaymentId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		miicApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(miicPaymentId);

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

		objectOutput.writeLong(miicApplicationId);
	}

	public long miicPaymentId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long miicApplicationId;

}