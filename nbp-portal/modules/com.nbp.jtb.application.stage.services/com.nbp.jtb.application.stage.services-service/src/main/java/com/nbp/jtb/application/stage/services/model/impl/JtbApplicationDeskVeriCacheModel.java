/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.stage.services.model.JtbApplicationDeskVeri;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JtbApplicationDeskVeri in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JtbApplicationDeskVeriCacheModel
	implements CacheModel<JtbApplicationDeskVeri>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JtbApplicationDeskVeriCacheModel)) {
			return false;
		}

		JtbApplicationDeskVeriCacheModel jtbApplicationDeskVeriCacheModel =
			(JtbApplicationDeskVeriCacheModel)object;

		if (jtbApplicationDeskVeriId ==
				jtbApplicationDeskVeriCacheModel.jtbApplicationDeskVeriId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jtbApplicationDeskVeriId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{jtbApplicationDeskVeriId=");
		sb.append(jtbApplicationDeskVeriId);
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
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append(", documentStatus=");
		sb.append(documentStatus);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JtbApplicationDeskVeri toEntityModel() {
		JtbApplicationDeskVeriImpl jtbApplicationDeskVeriImpl =
			new JtbApplicationDeskVeriImpl();

		jtbApplicationDeskVeriImpl.setJtbApplicationDeskVeriId(
			jtbApplicationDeskVeriId);
		jtbApplicationDeskVeriImpl.setGroupId(groupId);
		jtbApplicationDeskVeriImpl.setCompanyId(companyId);
		jtbApplicationDeskVeriImpl.setUserId(userId);

		if (userName == null) {
			jtbApplicationDeskVeriImpl.setUserName("");
		}
		else {
			jtbApplicationDeskVeriImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jtbApplicationDeskVeriImpl.setCreateDate(null);
		}
		else {
			jtbApplicationDeskVeriImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jtbApplicationDeskVeriImpl.setModifiedDate(null);
		}
		else {
			jtbApplicationDeskVeriImpl.setModifiedDate(new Date(modifiedDate));
		}

		jtbApplicationDeskVeriImpl.setJtbApplicationId(jtbApplicationId);

		if (documentStatus == null) {
			jtbApplicationDeskVeriImpl.setDocumentStatus("");
		}
		else {
			jtbApplicationDeskVeriImpl.setDocumentStatus(documentStatus);
		}

		if (documentName == null) {
			jtbApplicationDeskVeriImpl.setDocumentName("");
		}
		else {
			jtbApplicationDeskVeriImpl.setDocumentName(documentName);
		}

		jtbApplicationDeskVeriImpl.resetOriginalValues();

		return jtbApplicationDeskVeriImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		jtbApplicationDeskVeriId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		jtbApplicationId = objectInput.readLong();
		documentStatus = objectInput.readUTF();
		documentName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(jtbApplicationDeskVeriId);

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

		objectOutput.writeLong(jtbApplicationId);

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

	public long jtbApplicationDeskVeriId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long jtbApplicationId;
	public String documentStatus;
	public String documentName;

}