/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.AlternateRsoAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AlternateRsoAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AlternateRsoAddCacheModel
	implements CacheModel<AlternateRsoAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AlternateRsoAddCacheModel)) {
			return false;
		}

		AlternateRsoAddCacheModel alternateRsoAddCacheModel =
			(AlternateRsoAddCacheModel)object;

		if (alternateRsoAddId == alternateRsoAddCacheModel.alternateRsoAddId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, alternateRsoAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{alternateRsoAddId=");
		sb.append(alternateRsoAddId);
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
		sb.append(", alternateRsoName=");
		sb.append(alternateRsoName);
		sb.append(", alternateRsoTitle=");
		sb.append(alternateRsoTitle);
		sb.append(", alternateRsoTelephone=");
		sb.append(alternateRsoTelephone);
		sb.append(", alternateRsoExt=");
		sb.append(alternateRsoExt);
		sb.append(", alternateRsoFax=");
		sb.append(alternateRsoFax);
		sb.append(", alternateRsoEmailAdd=");
		sb.append(alternateRsoEmailAdd);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AlternateRsoAdd toEntityModel() {
		AlternateRsoAddImpl alternateRsoAddImpl = new AlternateRsoAddImpl();

		alternateRsoAddImpl.setAlternateRsoAddId(alternateRsoAddId);
		alternateRsoAddImpl.setGroupId(groupId);
		alternateRsoAddImpl.setCompanyId(companyId);
		alternateRsoAddImpl.setUserId(userId);

		if (userName == null) {
			alternateRsoAddImpl.setUserName("");
		}
		else {
			alternateRsoAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			alternateRsoAddImpl.setCreateDate(null);
		}
		else {
			alternateRsoAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			alternateRsoAddImpl.setModifiedDate(null);
		}
		else {
			alternateRsoAddImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (alternateRsoName == null) {
			alternateRsoAddImpl.setAlternateRsoName("");
		}
		else {
			alternateRsoAddImpl.setAlternateRsoName(alternateRsoName);
		}

		if (alternateRsoTitle == null) {
			alternateRsoAddImpl.setAlternateRsoTitle("");
		}
		else {
			alternateRsoAddImpl.setAlternateRsoTitle(alternateRsoTitle);
		}

		if (alternateRsoTelephone == null) {
			alternateRsoAddImpl.setAlternateRsoTelephone("");
		}
		else {
			alternateRsoAddImpl.setAlternateRsoTelephone(alternateRsoTelephone);
		}

		if (alternateRsoExt == null) {
			alternateRsoAddImpl.setAlternateRsoExt("");
		}
		else {
			alternateRsoAddImpl.setAlternateRsoExt(alternateRsoExt);
		}

		if (alternateRsoFax == null) {
			alternateRsoAddImpl.setAlternateRsoFax("");
		}
		else {
			alternateRsoAddImpl.setAlternateRsoFax(alternateRsoFax);
		}

		if (alternateRsoEmailAdd == null) {
			alternateRsoAddImpl.setAlternateRsoEmailAdd("");
		}
		else {
			alternateRsoAddImpl.setAlternateRsoEmailAdd(alternateRsoEmailAdd);
		}

		if (counter == null) {
			alternateRsoAddImpl.setCounter("");
		}
		else {
			alternateRsoAddImpl.setCounter(counter);
		}

		alternateRsoAddImpl.setHsraApplicationId(hsraApplicationId);

		alternateRsoAddImpl.resetOriginalValues();

		return alternateRsoAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		alternateRsoAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		alternateRsoName = objectInput.readUTF();
		alternateRsoTitle = objectInput.readUTF();
		alternateRsoTelephone = objectInput.readUTF();
		alternateRsoExt = objectInput.readUTF();
		alternateRsoFax = objectInput.readUTF();
		alternateRsoEmailAdd = objectInput.readUTF();
		counter = objectInput.readUTF();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(alternateRsoAddId);

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

		if (alternateRsoName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(alternateRsoName);
		}

		if (alternateRsoTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(alternateRsoTitle);
		}

		if (alternateRsoTelephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(alternateRsoTelephone);
		}

		if (alternateRsoExt == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(alternateRsoExt);
		}

		if (alternateRsoFax == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(alternateRsoFax);
		}

		if (alternateRsoEmailAdd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(alternateRsoEmailAdd);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(hsraApplicationId);
	}

	public long alternateRsoAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String alternateRsoName;
	public String alternateRsoTitle;
	public String alternateRsoTelephone;
	public String alternateRsoExt;
	public String alternateRsoFax;
	public String alternateRsoEmailAdd;
	public String counter;
	public long hsraApplicationId;

}