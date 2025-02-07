/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.cannabis.application.form.services.model.GeneralDelarations;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing GeneralDelarations in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class GeneralDelarationsCacheModel
	implements CacheModel<GeneralDelarations>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof GeneralDelarationsCacheModel)) {
			return false;
		}

		GeneralDelarationsCacheModel generalDelarationsCacheModel =
			(GeneralDelarationsCacheModel)object;

		if (generalDeclarationId ==
				generalDelarationsCacheModel.generalDeclarationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, generalDeclarationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", generalDeclarationId=");
		sb.append(generalDeclarationId);
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
		sb.append(", declartionQuestion=");
		sb.append(declartionQuestion);
		sb.append(", answer=");
		sb.append(answer);
		sb.append(", cannabisApplicationId=");
		sb.append(cannabisApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public GeneralDelarations toEntityModel() {
		GeneralDelarationsImpl generalDelarationsImpl =
			new GeneralDelarationsImpl();

		if (uuid == null) {
			generalDelarationsImpl.setUuid("");
		}
		else {
			generalDelarationsImpl.setUuid(uuid);
		}

		generalDelarationsImpl.setGeneralDeclarationId(generalDeclarationId);
		generalDelarationsImpl.setGroupId(groupId);
		generalDelarationsImpl.setCompanyId(companyId);
		generalDelarationsImpl.setUserId(userId);

		if (userName == null) {
			generalDelarationsImpl.setUserName("");
		}
		else {
			generalDelarationsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			generalDelarationsImpl.setCreateDate(null);
		}
		else {
			generalDelarationsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			generalDelarationsImpl.setModifiedDate(null);
		}
		else {
			generalDelarationsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (declartionQuestion == null) {
			generalDelarationsImpl.setDeclartionQuestion("");
		}
		else {
			generalDelarationsImpl.setDeclartionQuestion(declartionQuestion);
		}

		if (answer == null) {
			generalDelarationsImpl.setAnswer("");
		}
		else {
			generalDelarationsImpl.setAnswer(answer);
		}

		generalDelarationsImpl.setCannabisApplicationId(cannabisApplicationId);

		generalDelarationsImpl.resetOriginalValues();

		return generalDelarationsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		generalDeclarationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		declartionQuestion = objectInput.readUTF();
		answer = objectInput.readUTF();

		cannabisApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(generalDeclarationId);

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

		if (declartionQuestion == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(declartionQuestion);
		}

		if (answer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(answer);
		}

		objectOutput.writeLong(cannabisApplicationId);
	}

	public String uuid;
	public long generalDeclarationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String declartionQuestion;
	public String answer;
	public long cannabisApplicationId;

}