/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezOccupanteDeveloperUndertakingInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezOccupanteDeveloperUndertakingInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezOccupanteDeveloperUndertakingInfoCacheModel
	implements CacheModel<SezOccupanteDeveloperUndertakingInfo>,
			   Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof
				SezOccupanteDeveloperUndertakingInfoCacheModel)) {

			return false;
		}

		SezOccupanteDeveloperUndertakingInfoCacheModel
			sezOccupanteDeveloperUndertakingInfoCacheModel =
				(SezOccupanteDeveloperUndertakingInfoCacheModel)object;

		if (sezOccDevUnderId ==
				sezOccupanteDeveloperUndertakingInfoCacheModel.
					sezOccDevUnderId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezOccDevUnderId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{sezOccDevUnderId=");
		sb.append(sezOccDevUnderId);
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
		sb.append(", occUndertakingDevName=");
		sb.append(occUndertakingDevName);
		sb.append(", occUndertakingApprLetter=");
		sb.append(occUndertakingApprLetter);
		sb.append(", occUndertakingDate=");
		sb.append(occUndertakingDate);
		sb.append(", occUndertakingAgreeNum=");
		sb.append(occUndertakingAgreeNum);
		sb.append(", occUndertakingAgreeDate=");
		sb.append(occUndertakingAgreeDate);
		sb.append(", occUndertakingControlNum=");
		sb.append(occUndertakingControlNum);
		sb.append(", occDevApplicantTitle=");
		sb.append(occDevApplicantTitle);
		sb.append(", occDevApplicantName=");
		sb.append(occDevApplicantName);
		sb.append(", occDevApplicantTele=");
		sb.append(occDevApplicantTele);
		sb.append(", occDevApplicantEmail=");
		sb.append(occDevApplicantEmail);
		sb.append(", occDevApplicantSignDate=");
		sb.append(occDevApplicantSignDate);
		sb.append(", occDevPublicNotaryName=");
		sb.append(occDevPublicNotaryName);
		sb.append(", occDevPublicNotarySignDate=");
		sb.append(occDevPublicNotarySignDate);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezOccupanteDeveloperUndertakingInfo toEntityModel() {
		SezOccupanteDeveloperUndertakingInfoImpl
			sezOccupanteDeveloperUndertakingInfoImpl =
				new SezOccupanteDeveloperUndertakingInfoImpl();

		sezOccupanteDeveloperUndertakingInfoImpl.setSezOccDevUnderId(
			sezOccDevUnderId);
		sezOccupanteDeveloperUndertakingInfoImpl.setGroupId(groupId);
		sezOccupanteDeveloperUndertakingInfoImpl.setCompanyId(companyId);
		sezOccupanteDeveloperUndertakingInfoImpl.setUserId(userId);

		if (userName == null) {
			sezOccupanteDeveloperUndertakingInfoImpl.setUserName("");
		}
		else {
			sezOccupanteDeveloperUndertakingInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezOccupanteDeveloperUndertakingInfoImpl.setCreateDate(null);
		}
		else {
			sezOccupanteDeveloperUndertakingInfoImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezOccupanteDeveloperUndertakingInfoImpl.setModifiedDate(null);
		}
		else {
			sezOccupanteDeveloperUndertakingInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (occUndertakingDevName == null) {
			sezOccupanteDeveloperUndertakingInfoImpl.setOccUndertakingDevName(
				"");
		}
		else {
			sezOccupanteDeveloperUndertakingInfoImpl.setOccUndertakingDevName(
				occUndertakingDevName);
		}

		if (occUndertakingApprLetter == null) {
			sezOccupanteDeveloperUndertakingInfoImpl.
				setOccUndertakingApprLetter("");
		}
		else {
			sezOccupanteDeveloperUndertakingInfoImpl.
				setOccUndertakingApprLetter(occUndertakingApprLetter);
		}

		if (occUndertakingDate == Long.MIN_VALUE) {
			sezOccupanteDeveloperUndertakingInfoImpl.setOccUndertakingDate(
				null);
		}
		else {
			sezOccupanteDeveloperUndertakingInfoImpl.setOccUndertakingDate(
				new Date(occUndertakingDate));
		}

		if (occUndertakingAgreeNum == null) {
			sezOccupanteDeveloperUndertakingInfoImpl.setOccUndertakingAgreeNum(
				"");
		}
		else {
			sezOccupanteDeveloperUndertakingInfoImpl.setOccUndertakingAgreeNum(
				occUndertakingAgreeNum);
		}

		if (occUndertakingAgreeDate == Long.MIN_VALUE) {
			sezOccupanteDeveloperUndertakingInfoImpl.setOccUndertakingAgreeDate(
				null);
		}
		else {
			sezOccupanteDeveloperUndertakingInfoImpl.setOccUndertakingAgreeDate(
				new Date(occUndertakingAgreeDate));
		}

		if (occUndertakingControlNum == null) {
			sezOccupanteDeveloperUndertakingInfoImpl.
				setOccUndertakingControlNum("");
		}
		else {
			sezOccupanteDeveloperUndertakingInfoImpl.
				setOccUndertakingControlNum(occUndertakingControlNum);
		}

		if (occDevApplicantTitle == null) {
			sezOccupanteDeveloperUndertakingInfoImpl.setOccDevApplicantTitle(
				"");
		}
		else {
			sezOccupanteDeveloperUndertakingInfoImpl.setOccDevApplicantTitle(
				occDevApplicantTitle);
		}

		if (occDevApplicantName == null) {
			sezOccupanteDeveloperUndertakingInfoImpl.setOccDevApplicantName("");
		}
		else {
			sezOccupanteDeveloperUndertakingInfoImpl.setOccDevApplicantName(
				occDevApplicantName);
		}

		if (occDevApplicantTele == null) {
			sezOccupanteDeveloperUndertakingInfoImpl.setOccDevApplicantTele("");
		}
		else {
			sezOccupanteDeveloperUndertakingInfoImpl.setOccDevApplicantTele(
				occDevApplicantTele);
		}

		if (occDevApplicantEmail == null) {
			sezOccupanteDeveloperUndertakingInfoImpl.setOccDevApplicantEmail(
				"");
		}
		else {
			sezOccupanteDeveloperUndertakingInfoImpl.setOccDevApplicantEmail(
				occDevApplicantEmail);
		}

		if (occDevApplicantSignDate == Long.MIN_VALUE) {
			sezOccupanteDeveloperUndertakingInfoImpl.setOccDevApplicantSignDate(
				null);
		}
		else {
			sezOccupanteDeveloperUndertakingInfoImpl.setOccDevApplicantSignDate(
				new Date(occDevApplicantSignDate));
		}

		if (occDevPublicNotaryName == null) {
			sezOccupanteDeveloperUndertakingInfoImpl.setOccDevPublicNotaryName(
				"");
		}
		else {
			sezOccupanteDeveloperUndertakingInfoImpl.setOccDevPublicNotaryName(
				occDevPublicNotaryName);
		}

		if (occDevPublicNotarySignDate == Long.MIN_VALUE) {
			sezOccupanteDeveloperUndertakingInfoImpl.
				setOccDevPublicNotarySignDate(null);
		}
		else {
			sezOccupanteDeveloperUndertakingInfoImpl.
				setOccDevPublicNotarySignDate(
					new Date(occDevPublicNotarySignDate));
		}

		sezOccupanteDeveloperUndertakingInfoImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezOccupanteDeveloperUndertakingInfoImpl.resetOriginalValues();

		return sezOccupanteDeveloperUndertakingInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezOccDevUnderId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		occUndertakingDevName = objectInput.readUTF();
		occUndertakingApprLetter = objectInput.readUTF();
		occUndertakingDate = objectInput.readLong();
		occUndertakingAgreeNum = objectInput.readUTF();
		occUndertakingAgreeDate = objectInput.readLong();
		occUndertakingControlNum = objectInput.readUTF();
		occDevApplicantTitle = objectInput.readUTF();
		occDevApplicantName = objectInput.readUTF();
		occDevApplicantTele = objectInput.readUTF();
		occDevApplicantEmail = objectInput.readUTF();
		occDevApplicantSignDate = objectInput.readLong();
		occDevPublicNotaryName = objectInput.readUTF();
		occDevPublicNotarySignDate = objectInput.readLong();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezOccDevUnderId);

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

		if (occUndertakingDevName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occUndertakingDevName);
		}

		if (occUndertakingApprLetter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occUndertakingApprLetter);
		}

		objectOutput.writeLong(occUndertakingDate);

		if (occUndertakingAgreeNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occUndertakingAgreeNum);
		}

		objectOutput.writeLong(occUndertakingAgreeDate);

		if (occUndertakingControlNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occUndertakingControlNum);
		}

		if (occDevApplicantTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occDevApplicantTitle);
		}

		if (occDevApplicantName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occDevApplicantName);
		}

		if (occDevApplicantTele == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occDevApplicantTele);
		}

		if (occDevApplicantEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occDevApplicantEmail);
		}

		objectOutput.writeLong(occDevApplicantSignDate);

		if (occDevPublicNotaryName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occDevPublicNotaryName);
		}

		objectOutput.writeLong(occDevPublicNotarySignDate);

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezOccDevUnderId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String occUndertakingDevName;
	public String occUndertakingApprLetter;
	public long occUndertakingDate;
	public String occUndertakingAgreeNum;
	public long occUndertakingAgreeDate;
	public String occUndertakingControlNum;
	public String occDevApplicantTitle;
	public String occDevApplicantName;
	public String occDevApplicantTele;
	public String occDevApplicantEmail;
	public long occDevApplicantSignDate;
	public String occDevPublicNotaryName;
	public long occDevPublicNotarySignDate;
	public long sezStatusApplicationId;

}