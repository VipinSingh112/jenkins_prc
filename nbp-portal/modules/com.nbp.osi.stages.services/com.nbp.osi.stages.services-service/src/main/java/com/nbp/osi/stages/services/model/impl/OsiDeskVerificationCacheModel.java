/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.stages.services.model.OsiDeskVerification;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiDeskVerification in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiDeskVerificationCacheModel
	implements CacheModel<OsiDeskVerification>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OsiDeskVerificationCacheModel)) {
			return false;
		}

		OsiDeskVerificationCacheModel osiDeskVerificationCacheModel =
			(OsiDeskVerificationCacheModel)object;

		if (osiDeskVerificationId ==
				osiDeskVerificationCacheModel.osiDeskVerificationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiDeskVerificationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{osiDeskVerificationId=");
		sb.append(osiDeskVerificationId);
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
		sb.append(", osiApplicationId=");
		sb.append(osiApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OsiDeskVerification toEntityModel() {
		OsiDeskVerificationImpl osiDeskVerificationImpl =
			new OsiDeskVerificationImpl();

		osiDeskVerificationImpl.setOsiDeskVerificationId(osiDeskVerificationId);
		osiDeskVerificationImpl.setGroupId(groupId);
		osiDeskVerificationImpl.setCompanyId(companyId);
		osiDeskVerificationImpl.setUserId(userId);

		if (userName == null) {
			osiDeskVerificationImpl.setUserName("");
		}
		else {
			osiDeskVerificationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiDeskVerificationImpl.setCreateDate(null);
		}
		else {
			osiDeskVerificationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiDeskVerificationImpl.setModifiedDate(null);
		}
		else {
			osiDeskVerificationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (documentName == null) {
			osiDeskVerificationImpl.setDocumentName("");
		}
		else {
			osiDeskVerificationImpl.setDocumentName(documentName);
		}

		if (status == null) {
			osiDeskVerificationImpl.setStatus("");
		}
		else {
			osiDeskVerificationImpl.setStatus(status);
		}

		osiDeskVerificationImpl.setOsiApplicationId(osiApplicationId);

		osiDeskVerificationImpl.resetOriginalValues();

		return osiDeskVerificationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		osiDeskVerificationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		documentName = objectInput.readUTF();
		status = objectInput.readUTF();

		osiApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(osiDeskVerificationId);

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

		objectOutput.writeLong(osiApplicationId);
	}

	public long osiDeskVerificationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String documentName;
	public String status;
	public long osiApplicationId;

}