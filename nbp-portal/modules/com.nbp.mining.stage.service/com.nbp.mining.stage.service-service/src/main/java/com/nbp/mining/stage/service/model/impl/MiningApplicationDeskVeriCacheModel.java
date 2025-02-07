/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.mining.stage.service.model.MiningApplicationDeskVeri;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MiningApplicationDeskVeri in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MiningApplicationDeskVeriCacheModel
	implements CacheModel<MiningApplicationDeskVeri>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MiningApplicationDeskVeriCacheModel)) {
			return false;
		}

		MiningApplicationDeskVeriCacheModel
			miningApplicationDeskVeriCacheModel =
				(MiningApplicationDeskVeriCacheModel)object;

		if (miningDeskVeriId ==
				miningApplicationDeskVeriCacheModel.miningDeskVeriId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, miningDeskVeriId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{miningDeskVeriId=");
		sb.append(miningDeskVeriId);
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
		sb.append(", miningApplicationId=");
		sb.append(miningApplicationId);
		sb.append(", documentStatus=");
		sb.append(documentStatus);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MiningApplicationDeskVeri toEntityModel() {
		MiningApplicationDeskVeriImpl miningApplicationDeskVeriImpl =
			new MiningApplicationDeskVeriImpl();

		miningApplicationDeskVeriImpl.setMiningDeskVeriId(miningDeskVeriId);
		miningApplicationDeskVeriImpl.setGroupId(groupId);
		miningApplicationDeskVeriImpl.setCompanyId(companyId);
		miningApplicationDeskVeriImpl.setUserId(userId);

		if (userName == null) {
			miningApplicationDeskVeriImpl.setUserName("");
		}
		else {
			miningApplicationDeskVeriImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			miningApplicationDeskVeriImpl.setCreateDate(null);
		}
		else {
			miningApplicationDeskVeriImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			miningApplicationDeskVeriImpl.setModifiedDate(null);
		}
		else {
			miningApplicationDeskVeriImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		miningApplicationDeskVeriImpl.setMiningApplicationId(
			miningApplicationId);

		if (documentStatus == null) {
			miningApplicationDeskVeriImpl.setDocumentStatus("");
		}
		else {
			miningApplicationDeskVeriImpl.setDocumentStatus(documentStatus);
		}

		if (documentName == null) {
			miningApplicationDeskVeriImpl.setDocumentName("");
		}
		else {
			miningApplicationDeskVeriImpl.setDocumentName(documentName);
		}

		miningApplicationDeskVeriImpl.resetOriginalValues();

		return miningApplicationDeskVeriImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		miningDeskVeriId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		miningApplicationId = objectInput.readLong();
		documentStatus = objectInput.readUTF();
		documentName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(miningDeskVeriId);

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

		objectOutput.writeLong(miningApplicationId);

		if (documentStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(documentStatus);
		}

		if (documentName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(documentName);
		}
	}

	public long miningDeskVeriId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long miningApplicationId;
	public String documentStatus;
	public String documentName;

}