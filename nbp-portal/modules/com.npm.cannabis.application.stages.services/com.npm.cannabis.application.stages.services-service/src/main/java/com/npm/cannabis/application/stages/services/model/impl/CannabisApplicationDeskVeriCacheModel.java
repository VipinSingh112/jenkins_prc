/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.npm.cannabis.application.stages.services.model.CannabisApplicationDeskVeri;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CannabisApplicationDeskVeri in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CannabisApplicationDeskVeriCacheModel
	implements CacheModel<CannabisApplicationDeskVeri>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CannabisApplicationDeskVeriCacheModel)) {
			return false;
		}

		CannabisApplicationDeskVeriCacheModel
			cannabisApplicationDeskVeriCacheModel =
				(CannabisApplicationDeskVeriCacheModel)object;

		if (cannabisDeskVeriId ==
				cannabisApplicationDeskVeriCacheModel.cannabisDeskVeriId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cannabisDeskVeriId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{cannabisDeskVeriId=");
		sb.append(cannabisDeskVeriId);
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
		sb.append(", cannabisApplicationId=");
		sb.append(cannabisApplicationId);
		sb.append(", documentStatus=");
		sb.append(documentStatus);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CannabisApplicationDeskVeri toEntityModel() {
		CannabisApplicationDeskVeriImpl cannabisApplicationDeskVeriImpl =
			new CannabisApplicationDeskVeriImpl();

		cannabisApplicationDeskVeriImpl.setCannabisDeskVeriId(
			cannabisDeskVeriId);
		cannabisApplicationDeskVeriImpl.setGroupId(groupId);
		cannabisApplicationDeskVeriImpl.setCompanyId(companyId);
		cannabisApplicationDeskVeriImpl.setUserId(userId);

		if (userName == null) {
			cannabisApplicationDeskVeriImpl.setUserName("");
		}
		else {
			cannabisApplicationDeskVeriImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			cannabisApplicationDeskVeriImpl.setCreateDate(null);
		}
		else {
			cannabisApplicationDeskVeriImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cannabisApplicationDeskVeriImpl.setModifiedDate(null);
		}
		else {
			cannabisApplicationDeskVeriImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		cannabisApplicationDeskVeriImpl.setCannabisApplicationId(
			cannabisApplicationId);

		if (documentStatus == null) {
			cannabisApplicationDeskVeriImpl.setDocumentStatus("");
		}
		else {
			cannabisApplicationDeskVeriImpl.setDocumentStatus(documentStatus);
		}

		if (documentName == null) {
			cannabisApplicationDeskVeriImpl.setDocumentName("");
		}
		else {
			cannabisApplicationDeskVeriImpl.setDocumentName(documentName);
		}

		cannabisApplicationDeskVeriImpl.resetOriginalValues();

		return cannabisApplicationDeskVeriImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cannabisDeskVeriId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		cannabisApplicationId = objectInput.readLong();
		documentStatus = objectInput.readUTF();
		documentName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(cannabisDeskVeriId);

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

		objectOutput.writeLong(cannabisApplicationId);

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

	public long cannabisDeskVeriId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long cannabisApplicationId;
	public String documentStatus;
	public String documentName;

}