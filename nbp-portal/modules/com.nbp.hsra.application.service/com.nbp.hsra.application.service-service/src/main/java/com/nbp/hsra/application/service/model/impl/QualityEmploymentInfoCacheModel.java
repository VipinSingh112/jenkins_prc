/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.QualityEmploymentInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QualityEmploymentInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class QualityEmploymentInfoCacheModel
	implements CacheModel<QualityEmploymentInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof QualityEmploymentInfoCacheModel)) {
			return false;
		}

		QualityEmploymentInfoCacheModel qualityEmploymentInfoCacheModel =
			(QualityEmploymentInfoCacheModel)object;

		if (qualityEmploymentInfoId ==
				qualityEmploymentInfoCacheModel.qualityEmploymentInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, qualityEmploymentInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{qualityEmploymentInfoId=");
		sb.append(qualityEmploymentInfoId);
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
		sb.append(", companyName=");
		sb.append(companyName);
		sb.append(", teleNo=");
		sb.append(teleNo);
		sb.append(", address=");
		sb.append(address);
		sb.append(", parish=");
		sb.append(parish);
		sb.append(", mobileNo=");
		sb.append(mobileNo);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QualityEmploymentInfo toEntityModel() {
		QualityEmploymentInfoImpl qualityEmploymentInfoImpl =
			new QualityEmploymentInfoImpl();

		qualityEmploymentInfoImpl.setQualityEmploymentInfoId(
			qualityEmploymentInfoId);
		qualityEmploymentInfoImpl.setGroupId(groupId);
		qualityEmploymentInfoImpl.setCompanyId(companyId);
		qualityEmploymentInfoImpl.setUserId(userId);

		if (userName == null) {
			qualityEmploymentInfoImpl.setUserName("");
		}
		else {
			qualityEmploymentInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			qualityEmploymentInfoImpl.setCreateDate(null);
		}
		else {
			qualityEmploymentInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			qualityEmploymentInfoImpl.setModifiedDate(null);
		}
		else {
			qualityEmploymentInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (companyName == null) {
			qualityEmploymentInfoImpl.setCompanyName("");
		}
		else {
			qualityEmploymentInfoImpl.setCompanyName(companyName);
		}

		if (teleNo == null) {
			qualityEmploymentInfoImpl.setTeleNo("");
		}
		else {
			qualityEmploymentInfoImpl.setTeleNo(teleNo);
		}

		if (address == null) {
			qualityEmploymentInfoImpl.setAddress("");
		}
		else {
			qualityEmploymentInfoImpl.setAddress(address);
		}

		if (parish == null) {
			qualityEmploymentInfoImpl.setParish("");
		}
		else {
			qualityEmploymentInfoImpl.setParish(parish);
		}

		if (mobileNo == null) {
			qualityEmploymentInfoImpl.setMobileNo("");
		}
		else {
			qualityEmploymentInfoImpl.setMobileNo(mobileNo);
		}

		if (emailAddress == null) {
			qualityEmploymentInfoImpl.setEmailAddress("");
		}
		else {
			qualityEmploymentInfoImpl.setEmailAddress(emailAddress);
		}

		qualityEmploymentInfoImpl.setHsraApplicationId(hsraApplicationId);

		qualityEmploymentInfoImpl.resetOriginalValues();

		return qualityEmploymentInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		qualityEmploymentInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		companyName = objectInput.readUTF();
		teleNo = objectInput.readUTF();
		address = objectInput.readUTF();
		parish = objectInput.readUTF();
		mobileNo = objectInput.readUTF();
		emailAddress = objectInput.readUTF();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(qualityEmploymentInfoId);

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

		if (companyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyName);
		}

		if (teleNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(teleNo);
		}

		if (address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (parish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(parish);
		}

		if (mobileNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mobileNo);
		}

		if (emailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailAddress);
		}

		objectOutput.writeLong(hsraApplicationId);
	}

	public long qualityEmploymentInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String companyName;
	public String teleNo;
	public String address;
	public String parish;
	public String mobileNo;
	public String emailAddress;
	public long hsraApplicationId;

}