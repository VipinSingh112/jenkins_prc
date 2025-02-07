/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.NotifiLegalInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NotifiLegalInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NotifiLegalInfoCacheModel
	implements CacheModel<NotifiLegalInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NotifiLegalInfoCacheModel)) {
			return false;
		}

		NotifiLegalInfoCacheModel notifiLegalInfoCacheModel =
			(NotifiLegalInfoCacheModel)object;

		if (notifiLegalInfoId == notifiLegalInfoCacheModel.notifiLegalInfoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, notifiLegalInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{notifiLegalInfoId=");
		sb.append(notifiLegalInfoId);
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
		sb.append(", legalPersonName=");
		sb.append(legalPersonName);
		sb.append(", legalPersonAddress=");
		sb.append(legalPersonAddress);
		sb.append(", organizationName=");
		sb.append(organizationName);
		sb.append(", organizationAddress=");
		sb.append(organizationAddress);
		sb.append(", contactNumber=");
		sb.append(contactNumber);
		sb.append(", legalPersonEmail=");
		sb.append(legalPersonEmail);
		sb.append(", practiceNature=");
		sb.append(practiceNature);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NotifiLegalInfo toEntityModel() {
		NotifiLegalInfoImpl notifiLegalInfoImpl = new NotifiLegalInfoImpl();

		notifiLegalInfoImpl.setNotifiLegalInfoId(notifiLegalInfoId);
		notifiLegalInfoImpl.setGroupId(groupId);
		notifiLegalInfoImpl.setCompanyId(companyId);
		notifiLegalInfoImpl.setUserId(userId);

		if (userName == null) {
			notifiLegalInfoImpl.setUserName("");
		}
		else {
			notifiLegalInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			notifiLegalInfoImpl.setCreateDate(null);
		}
		else {
			notifiLegalInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			notifiLegalInfoImpl.setModifiedDate(null);
		}
		else {
			notifiLegalInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (legalPersonName == null) {
			notifiLegalInfoImpl.setLegalPersonName("");
		}
		else {
			notifiLegalInfoImpl.setLegalPersonName(legalPersonName);
		}

		if (legalPersonAddress == null) {
			notifiLegalInfoImpl.setLegalPersonAddress("");
		}
		else {
			notifiLegalInfoImpl.setLegalPersonAddress(legalPersonAddress);
		}

		if (organizationName == null) {
			notifiLegalInfoImpl.setOrganizationName("");
		}
		else {
			notifiLegalInfoImpl.setOrganizationName(organizationName);
		}

		if (organizationAddress == null) {
			notifiLegalInfoImpl.setOrganizationAddress("");
		}
		else {
			notifiLegalInfoImpl.setOrganizationAddress(organizationAddress);
		}

		if (contactNumber == null) {
			notifiLegalInfoImpl.setContactNumber("");
		}
		else {
			notifiLegalInfoImpl.setContactNumber(contactNumber);
		}

		if (legalPersonEmail == null) {
			notifiLegalInfoImpl.setLegalPersonEmail("");
		}
		else {
			notifiLegalInfoImpl.setLegalPersonEmail(legalPersonEmail);
		}

		if (practiceNature == null) {
			notifiLegalInfoImpl.setPracticeNature("");
		}
		else {
			notifiLegalInfoImpl.setPracticeNature(practiceNature);
		}

		notifiLegalInfoImpl.setHsraApplicationId(hsraApplicationId);

		notifiLegalInfoImpl.resetOriginalValues();

		return notifiLegalInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		notifiLegalInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		legalPersonName = objectInput.readUTF();
		legalPersonAddress = objectInput.readUTF();
		organizationName = objectInput.readUTF();
		organizationAddress = objectInput.readUTF();
		contactNumber = objectInput.readUTF();
		legalPersonEmail = objectInput.readUTF();
		practiceNature = objectInput.readUTF();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(notifiLegalInfoId);

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

		if (legalPersonName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(legalPersonName);
		}

		if (legalPersonAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(legalPersonAddress);
		}

		if (organizationName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(organizationName);
		}

		if (organizationAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(organizationAddress);
		}

		if (contactNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contactNumber);
		}

		if (legalPersonEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(legalPersonEmail);
		}

		if (practiceNature == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(practiceNature);
		}

		objectOutput.writeLong(hsraApplicationId);
	}

	public long notifiLegalInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String legalPersonName;
	public String legalPersonAddress;
	public String organizationName;
	public String organizationAddress;
	public String contactNumber;
	public String legalPersonEmail;
	public String practiceNature;
	public long hsraApplicationId;

}