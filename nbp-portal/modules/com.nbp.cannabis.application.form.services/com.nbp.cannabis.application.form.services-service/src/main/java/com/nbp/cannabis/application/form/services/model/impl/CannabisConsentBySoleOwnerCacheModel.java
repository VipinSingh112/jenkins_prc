/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.cannabis.application.form.services.model.CannabisConsentBySoleOwner;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CannabisConsentBySoleOwner in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CannabisConsentBySoleOwnerCacheModel
	implements CacheModel<CannabisConsentBySoleOwner>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CannabisConsentBySoleOwnerCacheModel)) {
			return false;
		}

		CannabisConsentBySoleOwnerCacheModel
			cannabisConsentBySoleOwnerCacheModel =
				(CannabisConsentBySoleOwnerCacheModel)object;

		if (cannabisConsentBySoleOwnerId ==
				cannabisConsentBySoleOwnerCacheModel.
					cannabisConsentBySoleOwnerId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cannabisConsentBySoleOwnerId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{cannabisConsentBySoleOwnerId=");
		sb.append(cannabisConsentBySoleOwnerId);
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
		sb.append(", ownerName=");
		sb.append(ownerName);
		sb.append(", date=");
		sb.append(date);
		sb.append(", ownerPhone=");
		sb.append(ownerPhone);
		sb.append(", ownerAddress=");
		sb.append(ownerAddress);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", cannabisApplicationId=");
		sb.append(cannabisApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CannabisConsentBySoleOwner toEntityModel() {
		CannabisConsentBySoleOwnerImpl cannabisConsentBySoleOwnerImpl =
			new CannabisConsentBySoleOwnerImpl();

		cannabisConsentBySoleOwnerImpl.setCannabisConsentBySoleOwnerId(
			cannabisConsentBySoleOwnerId);
		cannabisConsentBySoleOwnerImpl.setGroupId(groupId);
		cannabisConsentBySoleOwnerImpl.setCompanyId(companyId);
		cannabisConsentBySoleOwnerImpl.setUserId(userId);

		if (userName == null) {
			cannabisConsentBySoleOwnerImpl.setUserName("");
		}
		else {
			cannabisConsentBySoleOwnerImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			cannabisConsentBySoleOwnerImpl.setCreateDate(null);
		}
		else {
			cannabisConsentBySoleOwnerImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cannabisConsentBySoleOwnerImpl.setModifiedDate(null);
		}
		else {
			cannabisConsentBySoleOwnerImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (ownerName == null) {
			cannabisConsentBySoleOwnerImpl.setOwnerName("");
		}
		else {
			cannabisConsentBySoleOwnerImpl.setOwnerName(ownerName);
		}

		if (date == Long.MIN_VALUE) {
			cannabisConsentBySoleOwnerImpl.setDate(null);
		}
		else {
			cannabisConsentBySoleOwnerImpl.setDate(new Date(date));
		}

		if (ownerPhone == null) {
			cannabisConsentBySoleOwnerImpl.setOwnerPhone("");
		}
		else {
			cannabisConsentBySoleOwnerImpl.setOwnerPhone(ownerPhone);
		}

		if (ownerAddress == null) {
			cannabisConsentBySoleOwnerImpl.setOwnerAddress("");
		}
		else {
			cannabisConsentBySoleOwnerImpl.setOwnerAddress(ownerAddress);
		}

		if (counter == null) {
			cannabisConsentBySoleOwnerImpl.setCounter("");
		}
		else {
			cannabisConsentBySoleOwnerImpl.setCounter(counter);
		}

		cannabisConsentBySoleOwnerImpl.setCannabisApplicationId(
			cannabisApplicationId);

		cannabisConsentBySoleOwnerImpl.resetOriginalValues();

		return cannabisConsentBySoleOwnerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cannabisConsentBySoleOwnerId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		ownerName = objectInput.readUTF();
		date = objectInput.readLong();
		ownerPhone = objectInput.readUTF();
		ownerAddress = objectInput.readUTF();
		counter = objectInput.readUTF();

		cannabisApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(cannabisConsentBySoleOwnerId);

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

		if (ownerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ownerName);
		}

		objectOutput.writeLong(date);

		if (ownerPhone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ownerPhone);
		}

		if (ownerAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ownerAddress);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(cannabisApplicationId);
	}

	public long cannabisConsentBySoleOwnerId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String ownerName;
	public long date;
	public String ownerPhone;
	public String ownerAddress;
	public String counter;
	public long cannabisApplicationId;

}