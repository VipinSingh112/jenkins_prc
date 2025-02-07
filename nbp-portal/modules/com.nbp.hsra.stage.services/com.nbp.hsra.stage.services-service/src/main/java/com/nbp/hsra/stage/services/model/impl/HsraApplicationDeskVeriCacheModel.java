/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.stage.services.model.HsraApplicationDeskVeri;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing HsraApplicationDeskVeri in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HsraApplicationDeskVeriCacheModel
	implements CacheModel<HsraApplicationDeskVeri>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof HsraApplicationDeskVeriCacheModel)) {
			return false;
		}

		HsraApplicationDeskVeriCacheModel hsraApplicationDeskVeriCacheModel =
			(HsraApplicationDeskVeriCacheModel)object;

		if (hsraApplicationDeskVeriId ==
				hsraApplicationDeskVeriCacheModel.hsraApplicationDeskVeriId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, hsraApplicationDeskVeriId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{hsraApplicationDeskVeriId=");
		sb.append(hsraApplicationDeskVeriId);
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
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append(", documentStatus=");
		sb.append(documentStatus);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public HsraApplicationDeskVeri toEntityModel() {
		HsraApplicationDeskVeriImpl hsraApplicationDeskVeriImpl =
			new HsraApplicationDeskVeriImpl();

		hsraApplicationDeskVeriImpl.setHsraApplicationDeskVeriId(
			hsraApplicationDeskVeriId);
		hsraApplicationDeskVeriImpl.setGroupId(groupId);
		hsraApplicationDeskVeriImpl.setCompanyId(companyId);
		hsraApplicationDeskVeriImpl.setUserId(userId);

		if (userName == null) {
			hsraApplicationDeskVeriImpl.setUserName("");
		}
		else {
			hsraApplicationDeskVeriImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			hsraApplicationDeskVeriImpl.setCreateDate(null);
		}
		else {
			hsraApplicationDeskVeriImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			hsraApplicationDeskVeriImpl.setModifiedDate(null);
		}
		else {
			hsraApplicationDeskVeriImpl.setModifiedDate(new Date(modifiedDate));
		}

		hsraApplicationDeskVeriImpl.setHsraApplicationId(hsraApplicationId);

		if (documentStatus == null) {
			hsraApplicationDeskVeriImpl.setDocumentStatus("");
		}
		else {
			hsraApplicationDeskVeriImpl.setDocumentStatus(documentStatus);
		}

		if (documentName == null) {
			hsraApplicationDeskVeriImpl.setDocumentName("");
		}
		else {
			hsraApplicationDeskVeriImpl.setDocumentName(documentName);
		}

		hsraApplicationDeskVeriImpl.resetOriginalValues();

		return hsraApplicationDeskVeriImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		hsraApplicationDeskVeriId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		hsraApplicationId = objectInput.readLong();
		documentStatus = objectInput.readUTF();
		documentName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(hsraApplicationDeskVeriId);

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

		objectOutput.writeLong(hsraApplicationId);

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

	public long hsraApplicationDeskVeriId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long hsraApplicationId;
	public String documentStatus;
	public String documentName;

}