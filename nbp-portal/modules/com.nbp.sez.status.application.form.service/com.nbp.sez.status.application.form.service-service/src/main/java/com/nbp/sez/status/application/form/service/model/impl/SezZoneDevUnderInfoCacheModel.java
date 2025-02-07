/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezZoneDevUnderInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezZoneDevUnderInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezZoneDevUnderInfoCacheModel
	implements CacheModel<SezZoneDevUnderInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezZoneDevUnderInfoCacheModel)) {
			return false;
		}

		SezZoneDevUnderInfoCacheModel sezZoneDevUnderInfoCacheModel =
			(SezZoneDevUnderInfoCacheModel)object;

		if (sezZoneDevUnderInfoId ==
				sezZoneDevUnderInfoCacheModel.sezZoneDevUnderInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezZoneDevUnderInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{sezZoneDevUnderInfoId=");
		sb.append(sezZoneDevUnderInfoId);
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
		sb.append(", developerName=");
		sb.append(developerName);
		sb.append(", approvalLetterNum=");
		sb.append(approvalLetterNum);
		sb.append(", approvalLetterDate=");
		sb.append(approvalLetterDate);
		sb.append(", developerAgreeNum=");
		sb.append(developerAgreeNum);
		sb.append(", developerAgreeDate=");
		sb.append(developerAgreeDate);
		sb.append(", developerControlNum=");
		sb.append(developerControlNum);
		sb.append(", declarantTitle=");
		sb.append(declarantTitle);
		sb.append(", declarantName=");
		sb.append(declarantName);
		sb.append(", declarantTelephoneNum=");
		sb.append(declarantTelephoneNum);
		sb.append(", declarantEmail=");
		sb.append(declarantEmail);
		sb.append(", signatureDate=");
		sb.append(signatureDate);
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
	public SezZoneDevUnderInfo toEntityModel() {
		SezZoneDevUnderInfoImpl sezZoneDevUnderInfoImpl =
			new SezZoneDevUnderInfoImpl();

		sezZoneDevUnderInfoImpl.setSezZoneDevUnderInfoId(sezZoneDevUnderInfoId);
		sezZoneDevUnderInfoImpl.setGroupId(groupId);
		sezZoneDevUnderInfoImpl.setCompanyId(companyId);
		sezZoneDevUnderInfoImpl.setUserId(userId);

		if (userName == null) {
			sezZoneDevUnderInfoImpl.setUserName("");
		}
		else {
			sezZoneDevUnderInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezZoneDevUnderInfoImpl.setCreateDate(null);
		}
		else {
			sezZoneDevUnderInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezZoneDevUnderInfoImpl.setModifiedDate(null);
		}
		else {
			sezZoneDevUnderInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (developerName == null) {
			sezZoneDevUnderInfoImpl.setDeveloperName("");
		}
		else {
			sezZoneDevUnderInfoImpl.setDeveloperName(developerName);
		}

		if (approvalLetterNum == null) {
			sezZoneDevUnderInfoImpl.setApprovalLetterNum("");
		}
		else {
			sezZoneDevUnderInfoImpl.setApprovalLetterNum(approvalLetterNum);
		}

		if (approvalLetterDate == Long.MIN_VALUE) {
			sezZoneDevUnderInfoImpl.setApprovalLetterDate(null);
		}
		else {
			sezZoneDevUnderInfoImpl.setApprovalLetterDate(
				new Date(approvalLetterDate));
		}

		if (developerAgreeNum == null) {
			sezZoneDevUnderInfoImpl.setDeveloperAgreeNum("");
		}
		else {
			sezZoneDevUnderInfoImpl.setDeveloperAgreeNum(developerAgreeNum);
		}

		if (developerAgreeDate == Long.MIN_VALUE) {
			sezZoneDevUnderInfoImpl.setDeveloperAgreeDate(null);
		}
		else {
			sezZoneDevUnderInfoImpl.setDeveloperAgreeDate(
				new Date(developerAgreeDate));
		}

		if (developerControlNum == null) {
			sezZoneDevUnderInfoImpl.setDeveloperControlNum("");
		}
		else {
			sezZoneDevUnderInfoImpl.setDeveloperControlNum(developerControlNum);
		}

		if (declarantTitle == null) {
			sezZoneDevUnderInfoImpl.setDeclarantTitle("");
		}
		else {
			sezZoneDevUnderInfoImpl.setDeclarantTitle(declarantTitle);
		}

		if (declarantName == null) {
			sezZoneDevUnderInfoImpl.setDeclarantName("");
		}
		else {
			sezZoneDevUnderInfoImpl.setDeclarantName(declarantName);
		}

		if (declarantTelephoneNum == null) {
			sezZoneDevUnderInfoImpl.setDeclarantTelephoneNum("");
		}
		else {
			sezZoneDevUnderInfoImpl.setDeclarantTelephoneNum(
				declarantTelephoneNum);
		}

		if (declarantEmail == null) {
			sezZoneDevUnderInfoImpl.setDeclarantEmail("");
		}
		else {
			sezZoneDevUnderInfoImpl.setDeclarantEmail(declarantEmail);
		}

		if (signatureDate == Long.MIN_VALUE) {
			sezZoneDevUnderInfoImpl.setSignatureDate(null);
		}
		else {
			sezZoneDevUnderInfoImpl.setSignatureDate(new Date(signatureDate));
		}

		if (publicNotaryName == null) {
			sezZoneDevUnderInfoImpl.setPublicNotaryName("");
		}
		else {
			sezZoneDevUnderInfoImpl.setPublicNotaryName(publicNotaryName);
		}

		if (publicNotarySignatureDate == Long.MIN_VALUE) {
			sezZoneDevUnderInfoImpl.setPublicNotarySignatureDate(null);
		}
		else {
			sezZoneDevUnderInfoImpl.setPublicNotarySignatureDate(
				new Date(publicNotarySignatureDate));
		}

		sezZoneDevUnderInfoImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezZoneDevUnderInfoImpl.resetOriginalValues();

		return sezZoneDevUnderInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezZoneDevUnderInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		developerName = objectInput.readUTF();
		approvalLetterNum = objectInput.readUTF();
		approvalLetterDate = objectInput.readLong();
		developerAgreeNum = objectInput.readUTF();
		developerAgreeDate = objectInput.readLong();
		developerControlNum = objectInput.readUTF();
		declarantTitle = objectInput.readUTF();
		declarantName = objectInput.readUTF();
		declarantTelephoneNum = objectInput.readUTF();
		declarantEmail = objectInput.readUTF();
		signatureDate = objectInput.readLong();
		publicNotaryName = objectInput.readUTF();
		publicNotarySignatureDate = objectInput.readLong();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezZoneDevUnderInfoId);

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

		if (developerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(developerName);
		}

		if (approvalLetterNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(approvalLetterNum);
		}

		objectOutput.writeLong(approvalLetterDate);

		if (developerAgreeNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(developerAgreeNum);
		}

		objectOutput.writeLong(developerAgreeDate);

		if (developerControlNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(developerControlNum);
		}

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

		if (declarantTelephoneNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(declarantTelephoneNum);
		}

		if (declarantEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(declarantEmail);
		}

		objectOutput.writeLong(signatureDate);

		if (publicNotaryName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(publicNotaryName);
		}

		objectOutput.writeLong(publicNotarySignatureDate);

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezZoneDevUnderInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String developerName;
	public String approvalLetterNum;
	public long approvalLetterDate;
	public String developerAgreeNum;
	public long developerAgreeDate;
	public String developerControlNum;
	public String declarantTitle;
	public String declarantName;
	public String declarantTelephoneNum;
	public String declarantEmail;
	public long signatureDate;
	public String publicNotaryName;
	public long publicNotarySignatureDate;
	public long sezStatusApplicationId;

}