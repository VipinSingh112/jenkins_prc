/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.stage.services.model.OsiInsolveDeskVerification;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiInsolveDeskVerification in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiInsolveDeskVerificationCacheModel
	implements CacheModel<OsiInsolveDeskVerification>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OsiInsolveDeskVerificationCacheModel)) {
			return false;
		}

		OsiInsolveDeskVerificationCacheModel
			osiInsolveDeskVerificationCacheModel =
				(OsiInsolveDeskVerificationCacheModel)object;

		if (OsiInsolveDeskVerificationId ==
				osiInsolveDeskVerificationCacheModel.
					OsiInsolveDeskVerificationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, OsiInsolveDeskVerificationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{OsiInsolveDeskVerificationId=");
		sb.append(OsiInsolveDeskVerificationId);
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
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OsiInsolveDeskVerification toEntityModel() {
		OsiInsolveDeskVerificationImpl osiInsolveDeskVerificationImpl =
			new OsiInsolveDeskVerificationImpl();

		osiInsolveDeskVerificationImpl.setOsiInsolveDeskVerificationId(
			OsiInsolveDeskVerificationId);
		osiInsolveDeskVerificationImpl.setGroupId(groupId);
		osiInsolveDeskVerificationImpl.setCompanyId(companyId);
		osiInsolveDeskVerificationImpl.setUserId(userId);

		if (userName == null) {
			osiInsolveDeskVerificationImpl.setUserName("");
		}
		else {
			osiInsolveDeskVerificationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiInsolveDeskVerificationImpl.setCreateDate(null);
		}
		else {
			osiInsolveDeskVerificationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiInsolveDeskVerificationImpl.setModifiedDate(null);
		}
		else {
			osiInsolveDeskVerificationImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (documentName == null) {
			osiInsolveDeskVerificationImpl.setDocumentName("");
		}
		else {
			osiInsolveDeskVerificationImpl.setDocumentName(documentName);
		}

		if (status == null) {
			osiInsolveDeskVerificationImpl.setStatus("");
		}
		else {
			osiInsolveDeskVerificationImpl.setStatus(status);
		}

		osiInsolveDeskVerificationImpl.setOsiInsolvencyId(osiInsolvencyId);

		osiInsolveDeskVerificationImpl.resetOriginalValues();

		return osiInsolveDeskVerificationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		OsiInsolveDeskVerificationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		documentName = objectInput.readUTF();
		status = objectInput.readUTF();

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(OsiInsolveDeskVerificationId);

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

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long OsiInsolveDeskVerificationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String documentName;
	public String status;
	public long osiInsolvencyId;

}