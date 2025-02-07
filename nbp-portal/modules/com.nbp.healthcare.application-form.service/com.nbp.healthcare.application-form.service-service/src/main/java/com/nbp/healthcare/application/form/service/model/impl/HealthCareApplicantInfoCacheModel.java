/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.healthcare.application.form.service.model.HealthCareApplicantInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing HealthCareApplicantInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HealthCareApplicantInfoCacheModel
	implements CacheModel<HealthCareApplicantInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof HealthCareApplicantInfoCacheModel)) {
			return false;
		}

		HealthCareApplicantInfoCacheModel healthCareApplicantInfoCacheModel =
			(HealthCareApplicantInfoCacheModel)object;

		if (healthCareApplicantInfoId ==
				healthCareApplicantInfoCacheModel.healthCareApplicantInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, healthCareApplicantInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{healthCareApplicantInfoId=");
		sb.append(healthCareApplicantInfoId);
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
		sb.append(", name=");
		sb.append(name);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", telephoneNumber=");
		sb.append(telephoneNumber);
		sb.append(", healthCareApplicationId=");
		sb.append(healthCareApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public HealthCareApplicantInfo toEntityModel() {
		HealthCareApplicantInfoImpl healthCareApplicantInfoImpl =
			new HealthCareApplicantInfoImpl();

		healthCareApplicantInfoImpl.setHealthCareApplicantInfoId(
			healthCareApplicantInfoId);
		healthCareApplicantInfoImpl.setGroupId(groupId);
		healthCareApplicantInfoImpl.setCompanyId(companyId);
		healthCareApplicantInfoImpl.setUserId(userId);

		if (userName == null) {
			healthCareApplicantInfoImpl.setUserName("");
		}
		else {
			healthCareApplicantInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			healthCareApplicantInfoImpl.setCreateDate(null);
		}
		else {
			healthCareApplicantInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			healthCareApplicantInfoImpl.setModifiedDate(null);
		}
		else {
			healthCareApplicantInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			healthCareApplicantInfoImpl.setName("");
		}
		else {
			healthCareApplicantInfoImpl.setName(name);
		}

		if (emailAddress == null) {
			healthCareApplicantInfoImpl.setEmailAddress("");
		}
		else {
			healthCareApplicantInfoImpl.setEmailAddress(emailAddress);
		}

		if (telephoneNumber == null) {
			healthCareApplicantInfoImpl.setTelephoneNumber("");
		}
		else {
			healthCareApplicantInfoImpl.setTelephoneNumber(telephoneNumber);
		}

		healthCareApplicantInfoImpl.setHealthCareApplicationId(
			healthCareApplicationId);

		healthCareApplicantInfoImpl.resetOriginalValues();

		return healthCareApplicantInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		healthCareApplicantInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		emailAddress = objectInput.readUTF();
		telephoneNumber = objectInput.readUTF();

		healthCareApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(healthCareApplicantInfoId);

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

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (emailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailAddress);
		}

		if (telephoneNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telephoneNumber);
		}

		objectOutput.writeLong(healthCareApplicationId);
	}

	public long healthCareApplicantInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String emailAddress;
	public String telephoneNumber;
	public long healthCareApplicationId;

}