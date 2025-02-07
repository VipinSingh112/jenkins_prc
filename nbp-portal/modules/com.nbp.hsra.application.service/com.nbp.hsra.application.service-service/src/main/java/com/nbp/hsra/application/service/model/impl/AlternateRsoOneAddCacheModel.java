/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.AlternateRsoOneAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AlternateRsoOneAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AlternateRsoOneAddCacheModel
	implements CacheModel<AlternateRsoOneAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AlternateRsoOneAddCacheModel)) {
			return false;
		}

		AlternateRsoOneAddCacheModel alternateRsoOneAddCacheModel =
			(AlternateRsoOneAddCacheModel)object;

		if (alternateRsoOneAddId ==
				alternateRsoOneAddCacheModel.alternateRsoOneAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, alternateRsoOneAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{alternateRsoOneAddId=");
		sb.append(alternateRsoOneAddId);
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
		sb.append(", alternateRsoOneName=");
		sb.append(alternateRsoOneName);
		sb.append(", alternateRsoOneTitle=");
		sb.append(alternateRsoOneTitle);
		sb.append(", alternateRsoOneTelephone=");
		sb.append(alternateRsoOneTelephone);
		sb.append(", alternateRsoOneExt=");
		sb.append(alternateRsoOneExt);
		sb.append(", alternateRsoOneFax=");
		sb.append(alternateRsoOneFax);
		sb.append(", alternateRsoOneEmailAdd=");
		sb.append(alternateRsoOneEmailAdd);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AlternateRsoOneAdd toEntityModel() {
		AlternateRsoOneAddImpl alternateRsoOneAddImpl =
			new AlternateRsoOneAddImpl();

		alternateRsoOneAddImpl.setAlternateRsoOneAddId(alternateRsoOneAddId);
		alternateRsoOneAddImpl.setGroupId(groupId);
		alternateRsoOneAddImpl.setCompanyId(companyId);
		alternateRsoOneAddImpl.setUserId(userId);

		if (userName == null) {
			alternateRsoOneAddImpl.setUserName("");
		}
		else {
			alternateRsoOneAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			alternateRsoOneAddImpl.setCreateDate(null);
		}
		else {
			alternateRsoOneAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			alternateRsoOneAddImpl.setModifiedDate(null);
		}
		else {
			alternateRsoOneAddImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (alternateRsoOneName == null) {
			alternateRsoOneAddImpl.setAlternateRsoOneName("");
		}
		else {
			alternateRsoOneAddImpl.setAlternateRsoOneName(alternateRsoOneName);
		}

		if (alternateRsoOneTitle == null) {
			alternateRsoOneAddImpl.setAlternateRsoOneTitle("");
		}
		else {
			alternateRsoOneAddImpl.setAlternateRsoOneTitle(
				alternateRsoOneTitle);
		}

		if (alternateRsoOneTelephone == null) {
			alternateRsoOneAddImpl.setAlternateRsoOneTelephone("");
		}
		else {
			alternateRsoOneAddImpl.setAlternateRsoOneTelephone(
				alternateRsoOneTelephone);
		}

		if (alternateRsoOneExt == null) {
			alternateRsoOneAddImpl.setAlternateRsoOneExt("");
		}
		else {
			alternateRsoOneAddImpl.setAlternateRsoOneExt(alternateRsoOneExt);
		}

		if (alternateRsoOneFax == null) {
			alternateRsoOneAddImpl.setAlternateRsoOneFax("");
		}
		else {
			alternateRsoOneAddImpl.setAlternateRsoOneFax(alternateRsoOneFax);
		}

		if (alternateRsoOneEmailAdd == null) {
			alternateRsoOneAddImpl.setAlternateRsoOneEmailAdd("");
		}
		else {
			alternateRsoOneAddImpl.setAlternateRsoOneEmailAdd(
				alternateRsoOneEmailAdd);
		}

		if (counter == null) {
			alternateRsoOneAddImpl.setCounter("");
		}
		else {
			alternateRsoOneAddImpl.setCounter(counter);
		}

		alternateRsoOneAddImpl.setHsraApplicationId(hsraApplicationId);

		alternateRsoOneAddImpl.resetOriginalValues();

		return alternateRsoOneAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		alternateRsoOneAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		alternateRsoOneName = objectInput.readUTF();
		alternateRsoOneTitle = objectInput.readUTF();
		alternateRsoOneTelephone = objectInput.readUTF();
		alternateRsoOneExt = objectInput.readUTF();
		alternateRsoOneFax = objectInput.readUTF();
		alternateRsoOneEmailAdd = objectInput.readUTF();
		counter = objectInput.readUTF();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(alternateRsoOneAddId);

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

		if (alternateRsoOneName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(alternateRsoOneName);
		}

		if (alternateRsoOneTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(alternateRsoOneTitle);
		}

		if (alternateRsoOneTelephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(alternateRsoOneTelephone);
		}

		if (alternateRsoOneExt == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(alternateRsoOneExt);
		}

		if (alternateRsoOneFax == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(alternateRsoOneFax);
		}

		if (alternateRsoOneEmailAdd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(alternateRsoOneEmailAdd);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(hsraApplicationId);
	}

	public long alternateRsoOneAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String alternateRsoOneName;
	public String alternateRsoOneTitle;
	public String alternateRsoOneTelephone;
	public String alternateRsoOneExt;
	public String alternateRsoOneFax;
	public String alternateRsoOneEmailAdd;
	public String counter;
	public long hsraApplicationId;

}