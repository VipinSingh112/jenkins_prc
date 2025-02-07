/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.agriculture.stages.services.model.AgriDeskVerification;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AgriDeskVerification in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AgriDeskVerificationCacheModel
	implements CacheModel<AgriDeskVerification>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AgriDeskVerificationCacheModel)) {
			return false;
		}

		AgriDeskVerificationCacheModel agriDeskVerificationCacheModel =
			(AgriDeskVerificationCacheModel)object;

		if (agriDeskVerificationId ==
				agriDeskVerificationCacheModel.agriDeskVerificationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, agriDeskVerificationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{agriDeskVerificationId=");
		sb.append(agriDeskVerificationId);
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
		sb.append(", agricultureApplicationId=");
		sb.append(agricultureApplicationId);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", documentStatus=");
		sb.append(documentStatus);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AgriDeskVerification toEntityModel() {
		AgriDeskVerificationImpl agriDeskVerificationImpl =
			new AgriDeskVerificationImpl();

		agriDeskVerificationImpl.setAgriDeskVerificationId(
			agriDeskVerificationId);
		agriDeskVerificationImpl.setGroupId(groupId);
		agriDeskVerificationImpl.setCompanyId(companyId);
		agriDeskVerificationImpl.setUserId(userId);

		if (userName == null) {
			agriDeskVerificationImpl.setUserName("");
		}
		else {
			agriDeskVerificationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			agriDeskVerificationImpl.setCreateDate(null);
		}
		else {
			agriDeskVerificationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			agriDeskVerificationImpl.setModifiedDate(null);
		}
		else {
			agriDeskVerificationImpl.setModifiedDate(new Date(modifiedDate));
		}

		agriDeskVerificationImpl.setAgricultureApplicationId(
			agricultureApplicationId);

		if (documentName == null) {
			agriDeskVerificationImpl.setDocumentName("");
		}
		else {
			agriDeskVerificationImpl.setDocumentName(documentName);
		}

		if (documentStatus == null) {
			agriDeskVerificationImpl.setDocumentStatus("");
		}
		else {
			agriDeskVerificationImpl.setDocumentStatus(documentStatus);
		}

		agriDeskVerificationImpl.resetOriginalValues();

		return agriDeskVerificationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		agriDeskVerificationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		agricultureApplicationId = objectInput.readLong();
		documentName = objectInput.readUTF();
		documentStatus = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(agriDeskVerificationId);

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

		objectOutput.writeLong(agricultureApplicationId);

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

	public long agriDeskVerificationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long agricultureApplicationId;
	public String documentName;
	public String documentStatus;

}