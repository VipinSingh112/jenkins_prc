/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezOccupantShareHoldingInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezOccupantShareHoldingInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezOccupantShareHoldingInfoCacheModel
	implements CacheModel<SezOccupantShareHoldingInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezOccupantShareHoldingInfoCacheModel)) {
			return false;
		}

		SezOccupantShareHoldingInfoCacheModel
			sezOccupantShareHoldingInfoCacheModel =
				(SezOccupantShareHoldingInfoCacheModel)object;

		if (sezOccShareHolderId ==
				sezOccupantShareHoldingInfoCacheModel.sezOccShareHolderId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezOccShareHolderId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{sezOccShareHolderId=");
		sb.append(sezOccShareHolderId);
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
		sb.append(", occAuthorised=");
		sb.append(occAuthorised);
		sb.append(", occSubscribed=");
		sb.append(occSubscribed);
		sb.append(", occShareHolderCounter=");
		sb.append(occShareHolderCounter);
		sb.append(", occPaidCapital=");
		sb.append(occPaidCapital);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezOccupantShareHoldingInfo toEntityModel() {
		SezOccupantShareHoldingInfoImpl sezOccupantShareHoldingInfoImpl =
			new SezOccupantShareHoldingInfoImpl();

		sezOccupantShareHoldingInfoImpl.setSezOccShareHolderId(
			sezOccShareHolderId);
		sezOccupantShareHoldingInfoImpl.setGroupId(groupId);
		sezOccupantShareHoldingInfoImpl.setCompanyId(companyId);
		sezOccupantShareHoldingInfoImpl.setUserId(userId);

		if (userName == null) {
			sezOccupantShareHoldingInfoImpl.setUserName("");
		}
		else {
			sezOccupantShareHoldingInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezOccupantShareHoldingInfoImpl.setCreateDate(null);
		}
		else {
			sezOccupantShareHoldingInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezOccupantShareHoldingInfoImpl.setModifiedDate(null);
		}
		else {
			sezOccupantShareHoldingInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (occAuthorised == null) {
			sezOccupantShareHoldingInfoImpl.setOccAuthorised("");
		}
		else {
			sezOccupantShareHoldingInfoImpl.setOccAuthorised(occAuthorised);
		}

		if (occSubscribed == null) {
			sezOccupantShareHoldingInfoImpl.setOccSubscribed("");
		}
		else {
			sezOccupantShareHoldingInfoImpl.setOccSubscribed(occSubscribed);
		}

		if (occShareHolderCounter == null) {
			sezOccupantShareHoldingInfoImpl.setOccShareHolderCounter("");
		}
		else {
			sezOccupantShareHoldingInfoImpl.setOccShareHolderCounter(
				occShareHolderCounter);
		}

		if (occPaidCapital == null) {
			sezOccupantShareHoldingInfoImpl.setOccPaidCapital("");
		}
		else {
			sezOccupantShareHoldingInfoImpl.setOccPaidCapital(occPaidCapital);
		}

		sezOccupantShareHoldingInfoImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezOccupantShareHoldingInfoImpl.resetOriginalValues();

		return sezOccupantShareHoldingInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezOccShareHolderId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		occAuthorised = objectInput.readUTF();
		occSubscribed = objectInput.readUTF();
		occShareHolderCounter = objectInput.readUTF();
		occPaidCapital = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezOccShareHolderId);

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

		if (occAuthorised == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occAuthorised);
		}

		if (occSubscribed == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occSubscribed);
		}

		if (occShareHolderCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occShareHolderCounter);
		}

		if (occPaidCapital == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occPaidCapital);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezOccShareHolderId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String occAuthorised;
	public String occSubscribed;
	public String occShareHolderCounter;
	public String occPaidCapital;
	public long sezStatusApplicationId;

}