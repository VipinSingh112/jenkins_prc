/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezDevShareholdingInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezDevShareholdingInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezDevShareholdingInfoCacheModel
	implements CacheModel<SezDevShareholdingInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezDevShareholdingInfoCacheModel)) {
			return false;
		}

		SezDevShareholdingInfoCacheModel sezDevShareholdingInfoCacheModel =
			(SezDevShareholdingInfoCacheModel)object;

		if (sezDevShareholdingInfoId ==
				sezDevShareholdingInfoCacheModel.sezDevShareholdingInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezDevShareholdingInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{sezDevShareholdingInfoId=");
		sb.append(sezDevShareholdingInfoId);
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
		sb.append(", authorised=");
		sb.append(authorised);
		sb.append(", subscribed=");
		sb.append(subscribed);
		sb.append(", paidUpShareCapital=");
		sb.append(paidUpShareCapital);
		sb.append(", directorBankrupts=");
		sb.append(directorBankrupts);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezDevShareholdingInfo toEntityModel() {
		SezDevShareholdingInfoImpl sezDevShareholdingInfoImpl =
			new SezDevShareholdingInfoImpl();

		sezDevShareholdingInfoImpl.setSezDevShareholdingInfoId(
			sezDevShareholdingInfoId);
		sezDevShareholdingInfoImpl.setGroupId(groupId);
		sezDevShareholdingInfoImpl.setCompanyId(companyId);
		sezDevShareholdingInfoImpl.setUserId(userId);

		if (userName == null) {
			sezDevShareholdingInfoImpl.setUserName("");
		}
		else {
			sezDevShareholdingInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezDevShareholdingInfoImpl.setCreateDate(null);
		}
		else {
			sezDevShareholdingInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezDevShareholdingInfoImpl.setModifiedDate(null);
		}
		else {
			sezDevShareholdingInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (authorised == null) {
			sezDevShareholdingInfoImpl.setAuthorised("");
		}
		else {
			sezDevShareholdingInfoImpl.setAuthorised(authorised);
		}

		if (subscribed == null) {
			sezDevShareholdingInfoImpl.setSubscribed("");
		}
		else {
			sezDevShareholdingInfoImpl.setSubscribed(subscribed);
		}

		if (paidUpShareCapital == null) {
			sezDevShareholdingInfoImpl.setPaidUpShareCapital("");
		}
		else {
			sezDevShareholdingInfoImpl.setPaidUpShareCapital(
				paidUpShareCapital);
		}

		if (directorBankrupts == null) {
			sezDevShareholdingInfoImpl.setDirectorBankrupts("");
		}
		else {
			sezDevShareholdingInfoImpl.setDirectorBankrupts(directorBankrupts);
		}

		sezDevShareholdingInfoImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezDevShareholdingInfoImpl.resetOriginalValues();

		return sezDevShareholdingInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezDevShareholdingInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		authorised = objectInput.readUTF();
		subscribed = objectInput.readUTF();
		paidUpShareCapital = objectInput.readUTF();
		directorBankrupts = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezDevShareholdingInfoId);

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

		if (authorised == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(authorised);
		}

		if (subscribed == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(subscribed);
		}

		if (paidUpShareCapital == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(paidUpShareCapital);
		}

		if (directorBankrupts == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(directorBankrupts);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezDevShareholdingInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String authorised;
	public String subscribed;
	public String paidUpShareCapital;
	public String directorBankrupts;
	public long sezStatusApplicationId;

}