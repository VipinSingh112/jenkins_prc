/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezZoneUserUnderInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezZoneUserUnderInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezZoneUserUnderInfoCacheModel
	implements CacheModel<SezZoneUserUnderInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezZoneUserUnderInfoCacheModel)) {
			return false;
		}

		SezZoneUserUnderInfoCacheModel sezZoneUserUnderInfoCacheModel =
			(SezZoneUserUnderInfoCacheModel)object;

		if (sezZoneUserUnderInfoId ==
				sezZoneUserUnderInfoCacheModel.sezZoneUserUnderInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezZoneUserUnderInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{sezZoneUserUnderInfoId=");
		sb.append(sezZoneUserUnderInfoId);
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
		sb.append(", declarantTitle=");
		sb.append(declarantTitle);
		sb.append(", declarantName=");
		sb.append(declarantName);
		sb.append(", declarantTeleNum=");
		sb.append(declarantTeleNum);
		sb.append(", declarantEmail=");
		sb.append(declarantEmail);
		sb.append(", applicantSignatureDate=");
		sb.append(applicantSignatureDate);
		sb.append(", publicNotaryName=");
		sb.append(publicNotaryName);
		sb.append(", publicNotarySignatureDate=");
		sb.append(publicNotarySignatureDate);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezZoneUserUnderInfo toEntityModel() {
		SezZoneUserUnderInfoImpl sezZoneUserUnderInfoImpl =
			new SezZoneUserUnderInfoImpl();

		sezZoneUserUnderInfoImpl.setSezZoneUserUnderInfoId(
			sezZoneUserUnderInfoId);
		sezZoneUserUnderInfoImpl.setGroupId(groupId);
		sezZoneUserUnderInfoImpl.setCompanyId(companyId);
		sezZoneUserUnderInfoImpl.setUserId(userId);

		if (userName == null) {
			sezZoneUserUnderInfoImpl.setUserName("");
		}
		else {
			sezZoneUserUnderInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezZoneUserUnderInfoImpl.setCreateDate(null);
		}
		else {
			sezZoneUserUnderInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezZoneUserUnderInfoImpl.setModifiedDate(null);
		}
		else {
			sezZoneUserUnderInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (declarantTitle == null) {
			sezZoneUserUnderInfoImpl.setDeclarantTitle("");
		}
		else {
			sezZoneUserUnderInfoImpl.setDeclarantTitle(declarantTitle);
		}

		if (declarantName == null) {
			sezZoneUserUnderInfoImpl.setDeclarantName("");
		}
		else {
			sezZoneUserUnderInfoImpl.setDeclarantName(declarantName);
		}

		if (declarantTeleNum == null) {
			sezZoneUserUnderInfoImpl.setDeclarantTeleNum("");
		}
		else {
			sezZoneUserUnderInfoImpl.setDeclarantTeleNum(declarantTeleNum);
		}

		if (declarantEmail == null) {
			sezZoneUserUnderInfoImpl.setDeclarantEmail("");
		}
		else {
			sezZoneUserUnderInfoImpl.setDeclarantEmail(declarantEmail);
		}

		if (applicantSignatureDate == Long.MIN_VALUE) {
			sezZoneUserUnderInfoImpl.setApplicantSignatureDate(null);
		}
		else {
			sezZoneUserUnderInfoImpl.setApplicantSignatureDate(
				new Date(applicantSignatureDate));
		}

		if (publicNotaryName == null) {
			sezZoneUserUnderInfoImpl.setPublicNotaryName("");
		}
		else {
			sezZoneUserUnderInfoImpl.setPublicNotaryName(publicNotaryName);
		}

		if (publicNotarySignatureDate == Long.MIN_VALUE) {
			sezZoneUserUnderInfoImpl.setPublicNotarySignatureDate(null);
		}
		else {
			sezZoneUserUnderInfoImpl.setPublicNotarySignatureDate(
				new Date(publicNotarySignatureDate));
		}

		sezZoneUserUnderInfoImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezZoneUserUnderInfoImpl.resetOriginalValues();

		return sezZoneUserUnderInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezZoneUserUnderInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		declarantTitle = objectInput.readUTF();
		declarantName = objectInput.readUTF();
		declarantTeleNum = objectInput.readUTF();
		declarantEmail = objectInput.readUTF();
		applicantSignatureDate = objectInput.readLong();
		publicNotaryName = objectInput.readUTF();
		publicNotarySignatureDate = objectInput.readLong();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezZoneUserUnderInfoId);

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

		if (declarantTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(declarantTitle);
		}

		if (declarantName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(declarantName);
		}

		if (declarantTeleNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(declarantTeleNum);
		}

		if (declarantEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(declarantEmail);
		}

		objectOutput.writeLong(applicantSignatureDate);

		if (publicNotaryName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(publicNotaryName);
		}

		objectOutput.writeLong(publicNotarySignatureDate);

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezZoneUserUnderInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String declarantTitle;
	public String declarantName;
	public String declarantTeleNum;
	public String declarantEmail;
	public long applicantSignatureDate;
	public String publicNotaryName;
	public long publicNotarySignatureDate;
	public long sezStatusApplicationId;

}