/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.creative.stages.services.model.CreativeDeskVerification;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CreativeDeskVerification in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CreativeDeskVerificationCacheModel
	implements CacheModel<CreativeDeskVerification>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CreativeDeskVerificationCacheModel)) {
			return false;
		}

		CreativeDeskVerificationCacheModel creativeDeskVerificationCacheModel =
			(CreativeDeskVerificationCacheModel)object;

		if (creativeDeskVerificationId ==
				creativeDeskVerificationCacheModel.creativeDeskVerificationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, creativeDeskVerificationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{creativeDeskVerificationId=");
		sb.append(creativeDeskVerificationId);
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
		sb.append(", creativeApplicationId=");
		sb.append(creativeApplicationId);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", documentStatus=");
		sb.append(documentStatus);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CreativeDeskVerification toEntityModel() {
		CreativeDeskVerificationImpl creativeDeskVerificationImpl =
			new CreativeDeskVerificationImpl();

		creativeDeskVerificationImpl.setCreativeDeskVerificationId(
			creativeDeskVerificationId);
		creativeDeskVerificationImpl.setGroupId(groupId);
		creativeDeskVerificationImpl.setCompanyId(companyId);
		creativeDeskVerificationImpl.setUserId(userId);

		if (userName == null) {
			creativeDeskVerificationImpl.setUserName("");
		}
		else {
			creativeDeskVerificationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			creativeDeskVerificationImpl.setCreateDate(null);
		}
		else {
			creativeDeskVerificationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			creativeDeskVerificationImpl.setModifiedDate(null);
		}
		else {
			creativeDeskVerificationImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		creativeDeskVerificationImpl.setCreativeApplicationId(
			creativeApplicationId);

		if (documentName == null) {
			creativeDeskVerificationImpl.setDocumentName("");
		}
		else {
			creativeDeskVerificationImpl.setDocumentName(documentName);
		}

		if (documentStatus == null) {
			creativeDeskVerificationImpl.setDocumentStatus("");
		}
		else {
			creativeDeskVerificationImpl.setDocumentStatus(documentStatus);
		}

		creativeDeskVerificationImpl.resetOriginalValues();

		return creativeDeskVerificationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		creativeDeskVerificationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		creativeApplicationId = objectInput.readLong();
		documentName = objectInput.readUTF();
		documentStatus = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(creativeDeskVerificationId);

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

		objectOutput.writeLong(creativeApplicationId);

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

	public long creativeDeskVerificationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long creativeApplicationId;
	public String documentName;
	public String documentStatus;

}