/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jadsc.application.form.service.model.JADSCChecklistAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JADSCChecklistAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JADSCChecklistAddCacheModel
	implements CacheModel<JADSCChecklistAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JADSCChecklistAddCacheModel)) {
			return false;
		}

		JADSCChecklistAddCacheModel jadscChecklistAddCacheModel =
			(JADSCChecklistAddCacheModel)object;

		if (jADSCChecklistAddId ==
				jadscChecklistAddCacheModel.jADSCChecklistAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jADSCChecklistAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", jADSCChecklistAddId=");
		sb.append(jADSCChecklistAddId);
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
		sb.append(", AddItem=");
		sb.append(AddItem);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", jadscApplicationId=");
		sb.append(jadscApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JADSCChecklistAdd toEntityModel() {
		JADSCChecklistAddImpl jadscChecklistAddImpl =
			new JADSCChecklistAddImpl();

		if (uuid == null) {
			jadscChecklistAddImpl.setUuid("");
		}
		else {
			jadscChecklistAddImpl.setUuid(uuid);
		}

		jadscChecklistAddImpl.setJADSCChecklistAddId(jADSCChecklistAddId);
		jadscChecklistAddImpl.setGroupId(groupId);
		jadscChecklistAddImpl.setCompanyId(companyId);
		jadscChecklistAddImpl.setUserId(userId);

		if (userName == null) {
			jadscChecklistAddImpl.setUserName("");
		}
		else {
			jadscChecklistAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jadscChecklistAddImpl.setCreateDate(null);
		}
		else {
			jadscChecklistAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jadscChecklistAddImpl.setModifiedDate(null);
		}
		else {
			jadscChecklistAddImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (AddItem == null) {
			jadscChecklistAddImpl.setAddItem("");
		}
		else {
			jadscChecklistAddImpl.setAddItem(AddItem);
		}

		if (counter == null) {
			jadscChecklistAddImpl.setCounter("");
		}
		else {
			jadscChecklistAddImpl.setCounter(counter);
		}

		jadscChecklistAddImpl.setJadscApplicationId(jadscApplicationId);

		jadscChecklistAddImpl.resetOriginalValues();

		return jadscChecklistAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		jADSCChecklistAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		AddItem = objectInput.readUTF();
		counter = objectInput.readUTF();

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

		objectOutput.writeLong(jADSCChecklistAddId);

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

		if (AddItem == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(AddItem);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(jadscApplicationId);
	}

	public String uuid;
	public long jADSCChecklistAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String AddItem;
	public String counter;
	public long jadscApplicationId;

}