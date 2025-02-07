/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.wra.stage.service.model.WraApplicationDeskVeri;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing WraApplicationDeskVeri in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class WraApplicationDeskVeriCacheModel
	implements CacheModel<WraApplicationDeskVeri>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof WraApplicationDeskVeriCacheModel)) {
			return false;
		}

		WraApplicationDeskVeriCacheModel wraApplicationDeskVeriCacheModel =
			(WraApplicationDeskVeriCacheModel)object;

		if (wraApplicationDeskVeriId ==
				wraApplicationDeskVeriCacheModel.wraApplicationDeskVeriId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, wraApplicationDeskVeriId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{wraApplicationDeskVeriId=");
		sb.append(wraApplicationDeskVeriId);
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
		sb.append(", wraApplicationId=");
		sb.append(wraApplicationId);
		sb.append(", documentStatus=");
		sb.append(documentStatus);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public WraApplicationDeskVeri toEntityModel() {
		WraApplicationDeskVeriImpl wraApplicationDeskVeriImpl =
			new WraApplicationDeskVeriImpl();

		wraApplicationDeskVeriImpl.setWraApplicationDeskVeriId(
			wraApplicationDeskVeriId);
		wraApplicationDeskVeriImpl.setGroupId(groupId);
		wraApplicationDeskVeriImpl.setCompanyId(companyId);
		wraApplicationDeskVeriImpl.setUserId(userId);

		if (userName == null) {
			wraApplicationDeskVeriImpl.setUserName("");
		}
		else {
			wraApplicationDeskVeriImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			wraApplicationDeskVeriImpl.setCreateDate(null);
		}
		else {
			wraApplicationDeskVeriImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			wraApplicationDeskVeriImpl.setModifiedDate(null);
		}
		else {
			wraApplicationDeskVeriImpl.setModifiedDate(new Date(modifiedDate));
		}

		wraApplicationDeskVeriImpl.setWraApplicationId(wraApplicationId);

		if (documentStatus == null) {
			wraApplicationDeskVeriImpl.setDocumentStatus("");
		}
		else {
			wraApplicationDeskVeriImpl.setDocumentStatus(documentStatus);
		}

		if (documentName == null) {
			wraApplicationDeskVeriImpl.setDocumentName("");
		}
		else {
			wraApplicationDeskVeriImpl.setDocumentName(documentName);
		}

		wraApplicationDeskVeriImpl.resetOriginalValues();

		return wraApplicationDeskVeriImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		wraApplicationDeskVeriId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		wraApplicationId = objectInput.readLong();
		documentStatus = objectInput.readUTF();
		documentName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(wraApplicationDeskVeriId);

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

		objectOutput.writeLong(wraApplicationId);

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

	public long wraApplicationDeskVeriId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long wraApplicationId;
	public String documentStatus;
	public String documentName;

}