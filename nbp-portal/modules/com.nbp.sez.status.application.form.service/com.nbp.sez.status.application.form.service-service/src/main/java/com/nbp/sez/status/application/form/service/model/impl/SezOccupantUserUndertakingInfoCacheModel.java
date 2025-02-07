/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezOccupantUserUndertakingInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezOccupantUserUndertakingInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezOccupantUserUndertakingInfoCacheModel
	implements CacheModel<SezOccupantUserUndertakingInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezOccupantUserUndertakingInfoCacheModel)) {
			return false;
		}

		SezOccupantUserUndertakingInfoCacheModel
			sezOccupantUserUndertakingInfoCacheModel =
				(SezOccupantUserUndertakingInfoCacheModel)object;

		if (sezOccUserunderId ==
				sezOccupantUserUndertakingInfoCacheModel.sezOccUserunderId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezOccUserunderId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{sezOccUserunderId=");
		sb.append(sezOccUserunderId);
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
		sb.append(", occApplicantTitle=");
		sb.append(occApplicantTitle);
		sb.append(", occApplicantName=");
		sb.append(occApplicantName);
		sb.append(", occApplicantTeleNum=");
		sb.append(occApplicantTeleNum);
		sb.append(", occApplicantEmail=");
		sb.append(occApplicantEmail);
		sb.append(", occApplicantSignDate=");
		sb.append(occApplicantSignDate);
		sb.append(", occPublicNotaryName=");
		sb.append(occPublicNotaryName);
		sb.append(", occPublicNotarySignDate=");
		sb.append(occPublicNotarySignDate);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezOccupantUserUndertakingInfo toEntityModel() {
		SezOccupantUserUndertakingInfoImpl sezOccupantUserUndertakingInfoImpl =
			new SezOccupantUserUndertakingInfoImpl();

		sezOccupantUserUndertakingInfoImpl.setSezOccUserunderId(
			sezOccUserunderId);
		sezOccupantUserUndertakingInfoImpl.setGroupId(groupId);
		sezOccupantUserUndertakingInfoImpl.setCompanyId(companyId);
		sezOccupantUserUndertakingInfoImpl.setUserId(userId);

		if (userName == null) {
			sezOccupantUserUndertakingInfoImpl.setUserName("");
		}
		else {
			sezOccupantUserUndertakingInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezOccupantUserUndertakingInfoImpl.setCreateDate(null);
		}
		else {
			sezOccupantUserUndertakingInfoImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezOccupantUserUndertakingInfoImpl.setModifiedDate(null);
		}
		else {
			sezOccupantUserUndertakingInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (occApplicantTitle == null) {
			sezOccupantUserUndertakingInfoImpl.setOccApplicantTitle("");
		}
		else {
			sezOccupantUserUndertakingInfoImpl.setOccApplicantTitle(
				occApplicantTitle);
		}

		if (occApplicantName == null) {
			sezOccupantUserUndertakingInfoImpl.setOccApplicantName("");
		}
		else {
			sezOccupantUserUndertakingInfoImpl.setOccApplicantName(
				occApplicantName);
		}

		if (occApplicantTeleNum == null) {
			sezOccupantUserUndertakingInfoImpl.setOccApplicantTeleNum("");
		}
		else {
			sezOccupantUserUndertakingInfoImpl.setOccApplicantTeleNum(
				occApplicantTeleNum);
		}

		if (occApplicantEmail == null) {
			sezOccupantUserUndertakingInfoImpl.setOccApplicantEmail("");
		}
		else {
			sezOccupantUserUndertakingInfoImpl.setOccApplicantEmail(
				occApplicantEmail);
		}

		if (occApplicantSignDate == Long.MIN_VALUE) {
			sezOccupantUserUndertakingInfoImpl.setOccApplicantSignDate(null);
		}
		else {
			sezOccupantUserUndertakingInfoImpl.setOccApplicantSignDate(
				new Date(occApplicantSignDate));
		}

		if (occPublicNotaryName == null) {
			sezOccupantUserUndertakingInfoImpl.setOccPublicNotaryName("");
		}
		else {
			sezOccupantUserUndertakingInfoImpl.setOccPublicNotaryName(
				occPublicNotaryName);
		}

		if (occPublicNotarySignDate == Long.MIN_VALUE) {
			sezOccupantUserUndertakingInfoImpl.setOccPublicNotarySignDate(null);
		}
		else {
			sezOccupantUserUndertakingInfoImpl.setOccPublicNotarySignDate(
				new Date(occPublicNotarySignDate));
		}

		sezOccupantUserUndertakingInfoImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezOccupantUserUndertakingInfoImpl.resetOriginalValues();

		return sezOccupantUserUndertakingInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezOccUserunderId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		occApplicantTitle = objectInput.readUTF();
		occApplicantName = objectInput.readUTF();
		occApplicantTeleNum = objectInput.readUTF();
		occApplicantEmail = objectInput.readUTF();
		occApplicantSignDate = objectInput.readLong();
		occPublicNotaryName = objectInput.readUTF();
		occPublicNotarySignDate = objectInput.readLong();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezOccUserunderId);

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

		if (occApplicantTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occApplicantTitle);
		}

		if (occApplicantName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occApplicantName);
		}

		if (occApplicantTeleNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occApplicantTeleNum);
		}

		if (occApplicantEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occApplicantEmail);
		}

		objectOutput.writeLong(occApplicantSignDate);

		if (occPublicNotaryName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occPublicNotaryName);
		}

		objectOutput.writeLong(occPublicNotarySignDate);

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezOccUserunderId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String occApplicantTitle;
	public String occApplicantName;
	public String occApplicantTeleNum;
	public String occApplicantEmail;
	public long occApplicantSignDate;
	public String occPublicNotaryName;
	public long occPublicNotarySignDate;
	public long sezStatusApplicationId;

}