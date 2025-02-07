/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.manufacturing.application.stages.services.model.ManuDeskVerification;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ManuDeskVerification in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ManuDeskVerificationCacheModel
	implements CacheModel<ManuDeskVerification>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ManuDeskVerificationCacheModel)) {
			return false;
		}

		ManuDeskVerificationCacheModel manuDeskVerificationCacheModel =
			(ManuDeskVerificationCacheModel)object;

		if (manuDeskVerificationId ==
				manuDeskVerificationCacheModel.manuDeskVerificationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, manuDeskVerificationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{manuDeskVerificationId=");
		sb.append(manuDeskVerificationId);
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
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", status=");
		sb.append(status);
		sb.append(", manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ManuDeskVerification toEntityModel() {
		ManuDeskVerificationImpl manuDeskVerificationImpl =
			new ManuDeskVerificationImpl();

		manuDeskVerificationImpl.setManuDeskVerificationId(
			manuDeskVerificationId);
		manuDeskVerificationImpl.setGroupId(groupId);
		manuDeskVerificationImpl.setCompanyId(companyId);
		manuDeskVerificationImpl.setUserId(userId);

		if (userName == null) {
			manuDeskVerificationImpl.setUserName("");
		}
		else {
			manuDeskVerificationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			manuDeskVerificationImpl.setCreateDate(null);
		}
		else {
			manuDeskVerificationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			manuDeskVerificationImpl.setModifiedDate(null);
		}
		else {
			manuDeskVerificationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (documentName == null) {
			manuDeskVerificationImpl.setDocumentName("");
		}
		else {
			manuDeskVerificationImpl.setDocumentName(documentName);
		}

		if (status == null) {
			manuDeskVerificationImpl.setStatus("");
		}
		else {
			manuDeskVerificationImpl.setStatus(status);
		}

		manuDeskVerificationImpl.setManufacturingApplicationId(
			manufacturingApplicationId);

		manuDeskVerificationImpl.resetOriginalValues();

		return manuDeskVerificationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		manuDeskVerificationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		documentName = objectInput.readUTF();
		status = objectInput.readUTF();

		manufacturingApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(manuDeskVerificationId);

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

		if (documentName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(documentName);
		}

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}

		objectOutput.writeLong(manufacturingApplicationId);
	}

	public long manuDeskVerificationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String documentName;
	public String status;
	public long manufacturingApplicationId;

}