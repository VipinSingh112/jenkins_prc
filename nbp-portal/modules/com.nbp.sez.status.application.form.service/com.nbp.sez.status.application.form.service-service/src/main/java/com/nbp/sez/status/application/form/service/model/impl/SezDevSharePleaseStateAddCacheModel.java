/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezDevSharePleaseStateAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezDevSharePleaseStateAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezDevSharePleaseStateAddCacheModel
	implements CacheModel<SezDevSharePleaseStateAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezDevSharePleaseStateAddCacheModel)) {
			return false;
		}

		SezDevSharePleaseStateAddCacheModel
			sezDevSharePleaseStateAddCacheModel =
				(SezDevSharePleaseStateAddCacheModel)object;

		if (sezDevPleaseStateAddId ==
				sezDevSharePleaseStateAddCacheModel.sezDevPleaseStateAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezDevPleaseStateAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{sezDevPleaseStateAddId=");
		sb.append(sezDevPleaseStateAddId);
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
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezDevSharePleaseStateAdd toEntityModel() {
		SezDevSharePleaseStateAddImpl sezDevSharePleaseStateAddImpl =
			new SezDevSharePleaseStateAddImpl();

		sezDevSharePleaseStateAddImpl.setSezDevPleaseStateAddId(
			sezDevPleaseStateAddId);
		sezDevSharePleaseStateAddImpl.setGroupId(groupId);
		sezDevSharePleaseStateAddImpl.setCompanyId(companyId);
		sezDevSharePleaseStateAddImpl.setUserId(userId);

		if (userName == null) {
			sezDevSharePleaseStateAddImpl.setUserName("");
		}
		else {
			sezDevSharePleaseStateAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezDevSharePleaseStateAddImpl.setCreateDate(null);
		}
		else {
			sezDevSharePleaseStateAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezDevSharePleaseStateAddImpl.setModifiedDate(null);
		}
		else {
			sezDevSharePleaseStateAddImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (name == null) {
			sezDevSharePleaseStateAddImpl.setName("");
		}
		else {
			sezDevSharePleaseStateAddImpl.setName(name);
		}

		if (counter == null) {
			sezDevSharePleaseStateAddImpl.setCounter("");
		}
		else {
			sezDevSharePleaseStateAddImpl.setCounter(counter);
		}

		sezDevSharePleaseStateAddImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezDevSharePleaseStateAddImpl.resetOriginalValues();

		return sezDevSharePleaseStateAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezDevPleaseStateAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		counter = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezDevPleaseStateAddId);

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

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezDevPleaseStateAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String counter;
	public long sezStatusApplicationId;

}