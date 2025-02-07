/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.pharmaceutical.stages.services.model.PharmaDeskVerification;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PharmaDeskVerification in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PharmaDeskVerificationCacheModel
	implements CacheModel<PharmaDeskVerification>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PharmaDeskVerificationCacheModel)) {
			return false;
		}

		PharmaDeskVerificationCacheModel pharmaDeskVerificationCacheModel =
			(PharmaDeskVerificationCacheModel)object;

		if (pharmaDeskVerificationId ==
				pharmaDeskVerificationCacheModel.pharmaDeskVerificationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, pharmaDeskVerificationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{pharmaDeskVerificationId=");
		sb.append(pharmaDeskVerificationId);
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
		sb.append(", pharmaApplicationId=");
		sb.append(pharmaApplicationId);
		sb.append(", document=");
		sb.append(document);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PharmaDeskVerification toEntityModel() {
		PharmaDeskVerificationImpl pharmaDeskVerificationImpl =
			new PharmaDeskVerificationImpl();

		pharmaDeskVerificationImpl.setPharmaDeskVerificationId(
			pharmaDeskVerificationId);
		pharmaDeskVerificationImpl.setGroupId(groupId);
		pharmaDeskVerificationImpl.setCompanyId(companyId);
		pharmaDeskVerificationImpl.setUserId(userId);

		if (userName == null) {
			pharmaDeskVerificationImpl.setUserName("");
		}
		else {
			pharmaDeskVerificationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			pharmaDeskVerificationImpl.setCreateDate(null);
		}
		else {
			pharmaDeskVerificationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			pharmaDeskVerificationImpl.setModifiedDate(null);
		}
		else {
			pharmaDeskVerificationImpl.setModifiedDate(new Date(modifiedDate));
		}

		pharmaDeskVerificationImpl.setPharmaApplicationId(pharmaApplicationId);

		if (document == null) {
			pharmaDeskVerificationImpl.setDocument("");
		}
		else {
			pharmaDeskVerificationImpl.setDocument(document);
		}

		if (documentName == null) {
			pharmaDeskVerificationImpl.setDocumentName("");
		}
		else {
			pharmaDeskVerificationImpl.setDocumentName(documentName);
		}

		pharmaDeskVerificationImpl.resetOriginalValues();

		return pharmaDeskVerificationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		pharmaDeskVerificationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		pharmaApplicationId = objectInput.readLong();
		document = objectInput.readUTF();
		documentName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(pharmaDeskVerificationId);

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

		objectOutput.writeLong(pharmaApplicationId);

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
	}

	public long pharmaDeskVerificationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long pharmaApplicationId;
	public String document;
	public String documentName;

}