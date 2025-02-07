/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.cannabis.application.form.services.model.CannabisSupplementalInformation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CannabisSupplementalInformation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CannabisSupplementalInformationCacheModel
	implements CacheModel<CannabisSupplementalInformation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CannabisSupplementalInformationCacheModel)) {
			return false;
		}

		CannabisSupplementalInformationCacheModel
			cannabisSupplementalInformationCacheModel =
				(CannabisSupplementalInformationCacheModel)object;

		if (cannabisSupplementalInfoId ==
				cannabisSupplementalInformationCacheModel.
					cannabisSupplementalInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cannabisSupplementalInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", cannabisSupplementalInfoId=");
		sb.append(cannabisSupplementalInfoId);
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
		sb.append(", supplementInfoQuestion=");
		sb.append(supplementInfoQuestion);
		sb.append(", answer=");
		sb.append(answer);
		sb.append(", cannabisApplicationId=");
		sb.append(cannabisApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CannabisSupplementalInformation toEntityModel() {
		CannabisSupplementalInformationImpl
			cannabisSupplementalInformationImpl =
				new CannabisSupplementalInformationImpl();

		if (uuid == null) {
			cannabisSupplementalInformationImpl.setUuid("");
		}
		else {
			cannabisSupplementalInformationImpl.setUuid(uuid);
		}

		cannabisSupplementalInformationImpl.setCannabisSupplementalInfoId(
			cannabisSupplementalInfoId);
		cannabisSupplementalInformationImpl.setGroupId(groupId);
		cannabisSupplementalInformationImpl.setCompanyId(companyId);
		cannabisSupplementalInformationImpl.setUserId(userId);

		if (userName == null) {
			cannabisSupplementalInformationImpl.setUserName("");
		}
		else {
			cannabisSupplementalInformationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			cannabisSupplementalInformationImpl.setCreateDate(null);
		}
		else {
			cannabisSupplementalInformationImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cannabisSupplementalInformationImpl.setModifiedDate(null);
		}
		else {
			cannabisSupplementalInformationImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (supplementInfoQuestion == null) {
			cannabisSupplementalInformationImpl.setSupplementInfoQuestion("");
		}
		else {
			cannabisSupplementalInformationImpl.setSupplementInfoQuestion(
				supplementInfoQuestion);
		}

		if (answer == null) {
			cannabisSupplementalInformationImpl.setAnswer("");
		}
		else {
			cannabisSupplementalInformationImpl.setAnswer(answer);
		}

		cannabisSupplementalInformationImpl.setCannabisApplicationId(
			cannabisApplicationId);

		cannabisSupplementalInformationImpl.resetOriginalValues();

		return cannabisSupplementalInformationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		cannabisSupplementalInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		supplementInfoQuestion = objectInput.readUTF();
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

		objectOutput.writeLong(cannabisSupplementalInfoId);

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

		if (supplementInfoQuestion == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(supplementInfoQuestion);
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
	public long cannabisSupplementalInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String supplementInfoQuestion;
	public String answer;
	public long cannabisApplicationId;

}