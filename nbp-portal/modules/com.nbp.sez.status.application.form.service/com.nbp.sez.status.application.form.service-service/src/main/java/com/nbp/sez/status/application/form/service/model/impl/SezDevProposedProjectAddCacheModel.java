/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezDevProposedProjectAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezDevProposedProjectAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezDevProposedProjectAddCacheModel
	implements CacheModel<SezDevProposedProjectAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezDevProposedProjectAddCacheModel)) {
			return false;
		}

		SezDevProposedProjectAddCacheModel sezDevProposedProjectAddCacheModel =
			(SezDevProposedProjectAddCacheModel)object;

		if (sezDevProposedProjectAddId ==
				sezDevProposedProjectAddCacheModel.sezDevProposedProjectAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezDevProposedProjectAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{sezDevProposedProjectAddId=");
		sb.append(sezDevProposedProjectAddId);
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
		sb.append(", nameOfZone=");
		sb.append(nameOfZone);
		sb.append(", parish=");
		sb.append(parish);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezDevProposedProjectAdd toEntityModel() {
		SezDevProposedProjectAddImpl sezDevProposedProjectAddImpl =
			new SezDevProposedProjectAddImpl();

		sezDevProposedProjectAddImpl.setSezDevProposedProjectAddId(
			sezDevProposedProjectAddId);
		sezDevProposedProjectAddImpl.setGroupId(groupId);
		sezDevProposedProjectAddImpl.setCompanyId(companyId);
		sezDevProposedProjectAddImpl.setUserId(userId);

		if (userName == null) {
			sezDevProposedProjectAddImpl.setUserName("");
		}
		else {
			sezDevProposedProjectAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezDevProposedProjectAddImpl.setCreateDate(null);
		}
		else {
			sezDevProposedProjectAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezDevProposedProjectAddImpl.setModifiedDate(null);
		}
		else {
			sezDevProposedProjectAddImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (nameOfZone == null) {
			sezDevProposedProjectAddImpl.setNameOfZone("");
		}
		else {
			sezDevProposedProjectAddImpl.setNameOfZone(nameOfZone);
		}

		if (parish == null) {
			sezDevProposedProjectAddImpl.setParish("");
		}
		else {
			sezDevProposedProjectAddImpl.setParish(parish);
		}

		if (counter == null) {
			sezDevProposedProjectAddImpl.setCounter("");
		}
		else {
			sezDevProposedProjectAddImpl.setCounter(counter);
		}

		sezDevProposedProjectAddImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezDevProposedProjectAddImpl.resetOriginalValues();

		return sezDevProposedProjectAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezDevProposedProjectAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nameOfZone = objectInput.readUTF();
		parish = objectInput.readUTF();
		counter = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezDevProposedProjectAddId);

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

		if (nameOfZone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfZone);
		}

		if (parish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(parish);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezDevProposedProjectAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nameOfZone;
	public String parish;
	public String counter;
	public long sezStatusApplicationId;

}