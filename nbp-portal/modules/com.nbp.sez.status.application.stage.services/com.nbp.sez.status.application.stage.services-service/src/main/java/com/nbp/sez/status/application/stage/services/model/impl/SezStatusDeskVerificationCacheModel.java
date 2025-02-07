/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.stage.services.model.SezStatusDeskVerification;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezStatusDeskVerification in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezStatusDeskVerificationCacheModel
	implements CacheModel<SezStatusDeskVerification>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezStatusDeskVerificationCacheModel)) {
			return false;
		}

		SezStatusDeskVerificationCacheModel
			sezStatusDeskVerificationCacheModel =
				(SezStatusDeskVerificationCacheModel)object;

		if (SezDeskVerificationId ==
				sezStatusDeskVerificationCacheModel.SezDeskVerificationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, SezDeskVerificationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{SezDeskVerificationId=");
		sb.append(SezDeskVerificationId);
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
		sb.append(", sezApplicationId=");
		sb.append(sezApplicationId);
		sb.append(", document=");
		sb.append(document);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezStatusDeskVerification toEntityModel() {
		SezStatusDeskVerificationImpl sezStatusDeskVerificationImpl =
			new SezStatusDeskVerificationImpl();

		sezStatusDeskVerificationImpl.setSezDeskVerificationId(
			SezDeskVerificationId);
		sezStatusDeskVerificationImpl.setGroupId(groupId);
		sezStatusDeskVerificationImpl.setCompanyId(companyId);
		sezStatusDeskVerificationImpl.setUserId(userId);

		if (userName == null) {
			sezStatusDeskVerificationImpl.setUserName("");
		}
		else {
			sezStatusDeskVerificationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezStatusDeskVerificationImpl.setCreateDate(null);
		}
		else {
			sezStatusDeskVerificationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezStatusDeskVerificationImpl.setModifiedDate(null);
		}
		else {
			sezStatusDeskVerificationImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		sezStatusDeskVerificationImpl.setSezApplicationId(sezApplicationId);

		if (document == null) {
			sezStatusDeskVerificationImpl.setDocument("");
		}
		else {
			sezStatusDeskVerificationImpl.setDocument(document);
		}

		if (documentName == null) {
			sezStatusDeskVerificationImpl.setDocumentName("");
		}
		else {
			sezStatusDeskVerificationImpl.setDocumentName(documentName);
		}

		if (status == null) {
			sezStatusDeskVerificationImpl.setStatus("");
		}
		else {
			sezStatusDeskVerificationImpl.setStatus(status);
		}

		sezStatusDeskVerificationImpl.resetOriginalValues();

		return sezStatusDeskVerificationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		SezDeskVerificationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		sezApplicationId = objectInput.readLong();
		document = objectInput.readUTF();
		documentName = objectInput.readUTF();
		status = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(SezDeskVerificationId);

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

		objectOutput.writeLong(sezApplicationId);

		if (document == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(document);
		}

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
	}

	public long SezDeskVerificationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long sezApplicationId;
	public String document;
	public String documentName;
	public String status;

}