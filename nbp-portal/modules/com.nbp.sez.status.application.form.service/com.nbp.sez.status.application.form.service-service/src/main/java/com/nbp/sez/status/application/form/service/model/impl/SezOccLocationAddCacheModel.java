/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezOccLocationAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezOccLocationAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezOccLocationAddCacheModel
	implements CacheModel<SezOccLocationAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezOccLocationAddCacheModel)) {
			return false;
		}

		SezOccLocationAddCacheModel sezOccLocationAddCacheModel =
			(SezOccLocationAddCacheModel)object;

		if (sezOccLocationAddId ==
				sezOccLocationAddCacheModel.sezOccLocationAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezOccLocationAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{sezOccLocationAddId=");
		sb.append(sezOccLocationAddId);
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
		sb.append(", developerLocation=");
		sb.append(developerLocation);
		sb.append(", developerLocationDescription=");
		sb.append(developerLocationDescription);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezOccLocationAdd toEntityModel() {
		SezOccLocationAddImpl sezOccLocationAddImpl =
			new SezOccLocationAddImpl();

		sezOccLocationAddImpl.setSezOccLocationAddId(sezOccLocationAddId);
		sezOccLocationAddImpl.setGroupId(groupId);
		sezOccLocationAddImpl.setCompanyId(companyId);
		sezOccLocationAddImpl.setUserId(userId);

		if (userName == null) {
			sezOccLocationAddImpl.setUserName("");
		}
		else {
			sezOccLocationAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezOccLocationAddImpl.setCreateDate(null);
		}
		else {
			sezOccLocationAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezOccLocationAddImpl.setModifiedDate(null);
		}
		else {
			sezOccLocationAddImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (developerLocation == null) {
			sezOccLocationAddImpl.setDeveloperLocation("");
		}
		else {
			sezOccLocationAddImpl.setDeveloperLocation(developerLocation);
		}

		if (developerLocationDescription == null) {
			sezOccLocationAddImpl.setDeveloperLocationDescription("");
		}
		else {
			sezOccLocationAddImpl.setDeveloperLocationDescription(
				developerLocationDescription);
		}

		if (counter == null) {
			sezOccLocationAddImpl.setCounter("");
		}
		else {
			sezOccLocationAddImpl.setCounter(counter);
		}

		sezOccLocationAddImpl.setSezStatusApplicationId(sezStatusApplicationId);

		sezOccLocationAddImpl.resetOriginalValues();

		return sezOccLocationAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezOccLocationAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		developerLocation = objectInput.readUTF();
		developerLocationDescription = objectInput.readUTF();
		counter = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezOccLocationAddId);

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

		if (developerLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(developerLocation);
		}

		if (developerLocationDescription == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(developerLocationDescription);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezOccLocationAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String developerLocation;
	public String developerLocationDescription;
	public String counter;
	public long sezStatusApplicationId;

}