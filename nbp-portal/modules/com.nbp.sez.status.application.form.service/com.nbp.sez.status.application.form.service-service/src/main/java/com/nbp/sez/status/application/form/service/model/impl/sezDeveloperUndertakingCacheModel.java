/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.sezDeveloperUndertaking;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing sezDeveloperUndertaking in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class sezDeveloperUndertakingCacheModel
	implements CacheModel<sezDeveloperUndertaking>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof sezDeveloperUndertakingCacheModel)) {
			return false;
		}

		sezDeveloperUndertakingCacheModel sezDeveloperUndertakingCacheModel =
			(sezDeveloperUndertakingCacheModel)object;

		if (sezDeveloperUndertakingId ==
				sezDeveloperUndertakingCacheModel.sezDeveloperUndertakingId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezDeveloperUndertakingId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{sezDeveloperUndertakingId=");
		sb.append(sezDeveloperUndertakingId);
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
		sb.append(", titleOfApplicant=");
		sb.append(titleOfApplicant);
		sb.append(", nameOfApplicant=");
		sb.append(nameOfApplicant);
		sb.append(", telephoneNum=");
		sb.append(telephoneNum);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", applicantSignatureDate=");
		sb.append(applicantSignatureDate);
		sb.append(", nameOfNotaryPublic=");
		sb.append(nameOfNotaryPublic);
		sb.append(", publicNotarySignatureDate=");
		sb.append(publicNotarySignatureDate);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public sezDeveloperUndertaking toEntityModel() {
		sezDeveloperUndertakingImpl sezDeveloperUndertakingImpl =
			new sezDeveloperUndertakingImpl();

		sezDeveloperUndertakingImpl.setSezDeveloperUndertakingId(
			sezDeveloperUndertakingId);
		sezDeveloperUndertakingImpl.setGroupId(groupId);
		sezDeveloperUndertakingImpl.setCompanyId(companyId);
		sezDeveloperUndertakingImpl.setUserId(userId);

		if (userName == null) {
			sezDeveloperUndertakingImpl.setUserName("");
		}
		else {
			sezDeveloperUndertakingImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezDeveloperUndertakingImpl.setCreateDate(null);
		}
		else {
			sezDeveloperUndertakingImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezDeveloperUndertakingImpl.setModifiedDate(null);
		}
		else {
			sezDeveloperUndertakingImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (titleOfApplicant == null) {
			sezDeveloperUndertakingImpl.setTitleOfApplicant("");
		}
		else {
			sezDeveloperUndertakingImpl.setTitleOfApplicant(titleOfApplicant);
		}

		if (nameOfApplicant == null) {
			sezDeveloperUndertakingImpl.setNameOfApplicant("");
		}
		else {
			sezDeveloperUndertakingImpl.setNameOfApplicant(nameOfApplicant);
		}

		if (telephoneNum == null) {
			sezDeveloperUndertakingImpl.setTelephoneNum("");
		}
		else {
			sezDeveloperUndertakingImpl.setTelephoneNum(telephoneNum);
		}

		if (emailAddress == null) {
			sezDeveloperUndertakingImpl.setEmailAddress("");
		}
		else {
			sezDeveloperUndertakingImpl.setEmailAddress(emailAddress);
		}

		if (applicantSignatureDate == Long.MIN_VALUE) {
			sezDeveloperUndertakingImpl.setApplicantSignatureDate(null);
		}
		else {
			sezDeveloperUndertakingImpl.setApplicantSignatureDate(
				new Date(applicantSignatureDate));
		}

		if (nameOfNotaryPublic == null) {
			sezDeveloperUndertakingImpl.setNameOfNotaryPublic("");
		}
		else {
			sezDeveloperUndertakingImpl.setNameOfNotaryPublic(
				nameOfNotaryPublic);
		}

		if (publicNotarySignatureDate == Long.MIN_VALUE) {
			sezDeveloperUndertakingImpl.setPublicNotarySignatureDate(null);
		}
		else {
			sezDeveloperUndertakingImpl.setPublicNotarySignatureDate(
				new Date(publicNotarySignatureDate));
		}

		sezDeveloperUndertakingImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezDeveloperUndertakingImpl.resetOriginalValues();

		return sezDeveloperUndertakingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezDeveloperUndertakingId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		titleOfApplicant = objectInput.readUTF();
		nameOfApplicant = objectInput.readUTF();
		telephoneNum = objectInput.readUTF();
		emailAddress = objectInput.readUTF();
		applicantSignatureDate = objectInput.readLong();
		nameOfNotaryPublic = objectInput.readUTF();
		publicNotarySignatureDate = objectInput.readLong();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezDeveloperUndertakingId);

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

		if (titleOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(titleOfApplicant);
		}

		if (nameOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfApplicant);
		}

		if (telephoneNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telephoneNum);
		}

		if (emailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailAddress);
		}

		objectOutput.writeLong(applicantSignatureDate);

		if (nameOfNotaryPublic == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfNotaryPublic);
		}

		objectOutput.writeLong(publicNotarySignatureDate);

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezDeveloperUndertakingId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String titleOfApplicant;
	public String nameOfApplicant;
	public String telephoneNum;
	public String emailAddress;
	public long applicantSignatureDate;
	public String nameOfNotaryPublic;
	public long publicNotarySignatureDate;
	public long sezStatusApplicationId;

}