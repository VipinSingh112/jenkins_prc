/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.acquire.stages.service.model.AcquireDeskVerification;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AcquireDeskVerification in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AcquireDeskVerificationCacheModel
	implements CacheModel<AcquireDeskVerification>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AcquireDeskVerificationCacheModel)) {
			return false;
		}

		AcquireDeskVerificationCacheModel acquireDeskVerificationCacheModel =
			(AcquireDeskVerificationCacheModel)object;

		if (acquireDeskVerificationId ==
				acquireDeskVerificationCacheModel.acquireDeskVerificationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, acquireDeskVerificationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{acquireDeskVerificationId=");
		sb.append(acquireDeskVerificationId);
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
		sb.append(", acquireApplicationId=");
		sb.append(acquireApplicationId);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", documentStatus=");
		sb.append(documentStatus);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AcquireDeskVerification toEntityModel() {
		AcquireDeskVerificationImpl acquireDeskVerificationImpl =
			new AcquireDeskVerificationImpl();

		acquireDeskVerificationImpl.setAcquireDeskVerificationId(
			acquireDeskVerificationId);
		acquireDeskVerificationImpl.setGroupId(groupId);
		acquireDeskVerificationImpl.setCompanyId(companyId);
		acquireDeskVerificationImpl.setUserId(userId);

		if (userName == null) {
			acquireDeskVerificationImpl.setUserName("");
		}
		else {
			acquireDeskVerificationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			acquireDeskVerificationImpl.setCreateDate(null);
		}
		else {
			acquireDeskVerificationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			acquireDeskVerificationImpl.setModifiedDate(null);
		}
		else {
			acquireDeskVerificationImpl.setModifiedDate(new Date(modifiedDate));
		}

		acquireDeskVerificationImpl.setAcquireApplicationId(
			acquireApplicationId);

		if (documentName == null) {
			acquireDeskVerificationImpl.setDocumentName("");
		}
		else {
			acquireDeskVerificationImpl.setDocumentName(documentName);
		}

		if (documentStatus == null) {
			acquireDeskVerificationImpl.setDocumentStatus("");
		}
		else {
			acquireDeskVerificationImpl.setDocumentStatus(documentStatus);
		}

		acquireDeskVerificationImpl.resetOriginalValues();

		return acquireDeskVerificationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		acquireDeskVerificationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		acquireApplicationId = objectInput.readLong();
		documentName = objectInput.readUTF();
		documentStatus = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(acquireDeskVerificationId);

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

		objectOutput.writeLong(acquireApplicationId);

		if (documentName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(documentName);
		}

		if (documentStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(documentStatus);
		}
	}

	public long acquireDeskVerificationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long acquireApplicationId;
	public String documentName;
	public String documentStatus;

}