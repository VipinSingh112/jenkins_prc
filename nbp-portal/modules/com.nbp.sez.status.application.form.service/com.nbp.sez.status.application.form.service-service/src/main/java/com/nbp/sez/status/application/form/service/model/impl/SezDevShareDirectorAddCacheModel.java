/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezDevShareDirectorAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezDevShareDirectorAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezDevShareDirectorAddCacheModel
	implements CacheModel<SezDevShareDirectorAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezDevShareDirectorAddCacheModel)) {
			return false;
		}

		SezDevShareDirectorAddCacheModel sezDevShareDirectorAddCacheModel =
			(SezDevShareDirectorAddCacheModel)object;

		if (sezDevShareDirectorAddId ==
				sezDevShareDirectorAddCacheModel.sezDevShareDirectorAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezDevShareDirectorAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{sezDevShareDirectorAddId=");
		sb.append(sezDevShareDirectorAddId);
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
		sb.append(", shareholderName=");
		sb.append(shareholderName);
		sb.append(", numOfShare=");
		sb.append(numOfShare);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezDevShareDirectorAdd toEntityModel() {
		SezDevShareDirectorAddImpl sezDevShareDirectorAddImpl =
			new SezDevShareDirectorAddImpl();

		sezDevShareDirectorAddImpl.setSezDevShareDirectorAddId(
			sezDevShareDirectorAddId);
		sezDevShareDirectorAddImpl.setGroupId(groupId);
		sezDevShareDirectorAddImpl.setCompanyId(companyId);
		sezDevShareDirectorAddImpl.setUserId(userId);

		if (userName == null) {
			sezDevShareDirectorAddImpl.setUserName("");
		}
		else {
			sezDevShareDirectorAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezDevShareDirectorAddImpl.setCreateDate(null);
		}
		else {
			sezDevShareDirectorAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezDevShareDirectorAddImpl.setModifiedDate(null);
		}
		else {
			sezDevShareDirectorAddImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (shareholderName == null) {
			sezDevShareDirectorAddImpl.setShareholderName("");
		}
		else {
			sezDevShareDirectorAddImpl.setShareholderName(shareholderName);
		}

		if (numOfShare == null) {
			sezDevShareDirectorAddImpl.setNumOfShare("");
		}
		else {
			sezDevShareDirectorAddImpl.setNumOfShare(numOfShare);
		}

		if (counter == null) {
			sezDevShareDirectorAddImpl.setCounter("");
		}
		else {
			sezDevShareDirectorAddImpl.setCounter(counter);
		}

		sezDevShareDirectorAddImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezDevShareDirectorAddImpl.resetOriginalValues();

		return sezDevShareDirectorAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezDevShareDirectorAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		shareholderName = objectInput.readUTF();
		numOfShare = objectInput.readUTF();
		counter = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezDevShareDirectorAddId);

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

		if (shareholderName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(shareholderName);
		}

		if (numOfShare == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numOfShare);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezDevShareDirectorAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String shareholderName;
	public String numOfShare;
	public String counter;
	public long sezStatusApplicationId;

}