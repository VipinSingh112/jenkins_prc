/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezOccupantLocationAddBox;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezOccupantLocationAddBox in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezOccupantLocationAddBoxCacheModel
	implements CacheModel<SezOccupantLocationAddBox>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezOccupantLocationAddBoxCacheModel)) {
			return false;
		}

		SezOccupantLocationAddBoxCacheModel
			sezOccupantLocationAddBoxCacheModel =
				(SezOccupantLocationAddBoxCacheModel)object;

		if (sezOccLocationId ==
				sezOccupantLocationAddBoxCacheModel.sezOccLocationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezOccLocationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{sezOccLocationId=");
		sb.append(sezOccLocationId);
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
		sb.append(", developerCodeLocation=");
		sb.append(developerCodeLocation);
		sb.append(", descTypeOfAct=");
		sb.append(descTypeOfAct);
		sb.append(", locationCounter=");
		sb.append(locationCounter);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezOccupantLocationAddBox toEntityModel() {
		SezOccupantLocationAddBoxImpl sezOccupantLocationAddBoxImpl =
			new SezOccupantLocationAddBoxImpl();

		sezOccupantLocationAddBoxImpl.setSezOccLocationId(sezOccLocationId);
		sezOccupantLocationAddBoxImpl.setGroupId(groupId);
		sezOccupantLocationAddBoxImpl.setCompanyId(companyId);
		sezOccupantLocationAddBoxImpl.setUserId(userId);

		if (userName == null) {
			sezOccupantLocationAddBoxImpl.setUserName("");
		}
		else {
			sezOccupantLocationAddBoxImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezOccupantLocationAddBoxImpl.setCreateDate(null);
		}
		else {
			sezOccupantLocationAddBoxImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezOccupantLocationAddBoxImpl.setModifiedDate(null);
		}
		else {
			sezOccupantLocationAddBoxImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (developerCodeLocation == null) {
			sezOccupantLocationAddBoxImpl.setDeveloperCodeLocation("");
		}
		else {
			sezOccupantLocationAddBoxImpl.setDeveloperCodeLocation(
				developerCodeLocation);
		}

		if (descTypeOfAct == null) {
			sezOccupantLocationAddBoxImpl.setDescTypeOfAct("");
		}
		else {
			sezOccupantLocationAddBoxImpl.setDescTypeOfAct(descTypeOfAct);
		}

		if (locationCounter == null) {
			sezOccupantLocationAddBoxImpl.setLocationCounter("");
		}
		else {
			sezOccupantLocationAddBoxImpl.setLocationCounter(locationCounter);
		}

		sezOccupantLocationAddBoxImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezOccupantLocationAddBoxImpl.resetOriginalValues();

		return sezOccupantLocationAddBoxImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezOccLocationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		developerCodeLocation = objectInput.readUTF();
		descTypeOfAct = objectInput.readUTF();
		locationCounter = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezOccLocationId);

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

		if (developerCodeLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(developerCodeLocation);
		}

		if (descTypeOfAct == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(descTypeOfAct);
		}

		if (locationCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(locationCounter);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezOccLocationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String developerCodeLocation;
	public String descTypeOfAct;
	public String locationCounter;
	public long sezStatusApplicationId;

}