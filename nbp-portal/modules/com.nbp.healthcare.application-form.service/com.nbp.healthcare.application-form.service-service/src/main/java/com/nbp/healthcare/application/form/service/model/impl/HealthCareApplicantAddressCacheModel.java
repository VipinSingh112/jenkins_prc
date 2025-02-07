/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.healthcare.application.form.service.model.HealthCareApplicantAddress;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing HealthCareApplicantAddress in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HealthCareApplicantAddressCacheModel
	implements CacheModel<HealthCareApplicantAddress>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof HealthCareApplicantAddressCacheModel)) {
			return false;
		}

		HealthCareApplicantAddressCacheModel
			healthCareApplicantAddressCacheModel =
				(HealthCareApplicantAddressCacheModel)object;

		if (healthCareApplicantAddressId ==
				healthCareApplicantAddressCacheModel.
					healthCareApplicantAddressId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, healthCareApplicantAddressId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{healthCareApplicantAddressId=");
		sb.append(healthCareApplicantAddressId);
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
		sb.append(", applicantMailingAddress=");
		sb.append(applicantMailingAddress);
		sb.append(", healthCareApplicationId=");
		sb.append(healthCareApplicationId);
		sb.append(", healthCareApplicantInfoId=");
		sb.append(healthCareApplicantInfoId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public HealthCareApplicantAddress toEntityModel() {
		HealthCareApplicantAddressImpl healthCareApplicantAddressImpl =
			new HealthCareApplicantAddressImpl();

		healthCareApplicantAddressImpl.setHealthCareApplicantAddressId(
			healthCareApplicantAddressId);
		healthCareApplicantAddressImpl.setGroupId(groupId);
		healthCareApplicantAddressImpl.setCompanyId(companyId);
		healthCareApplicantAddressImpl.setUserId(userId);

		if (userName == null) {
			healthCareApplicantAddressImpl.setUserName("");
		}
		else {
			healthCareApplicantAddressImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			healthCareApplicantAddressImpl.setCreateDate(null);
		}
		else {
			healthCareApplicantAddressImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			healthCareApplicantAddressImpl.setModifiedDate(null);
		}
		else {
			healthCareApplicantAddressImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (applicantMailingAddress == null) {
			healthCareApplicantAddressImpl.setApplicantMailingAddress("");
		}
		else {
			healthCareApplicantAddressImpl.setApplicantMailingAddress(
				applicantMailingAddress);
		}

		healthCareApplicantAddressImpl.setHealthCareApplicationId(
			healthCareApplicationId);
		healthCareApplicantAddressImpl.setHealthCareApplicantInfoId(
			healthCareApplicantInfoId);

		healthCareApplicantAddressImpl.resetOriginalValues();

		return healthCareApplicantAddressImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		healthCareApplicantAddressId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		applicantMailingAddress = objectInput.readUTF();

		healthCareApplicationId = objectInput.readLong();

		healthCareApplicantInfoId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(healthCareApplicantAddressId);

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

		if (applicantMailingAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantMailingAddress);
		}

		objectOutput.writeLong(healthCareApplicationId);

		objectOutput.writeLong(healthCareApplicantInfoId);
	}

	public long healthCareApplicantAddressId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String applicantMailingAddress;
	public long healthCareApplicationId;
	public long healthCareApplicantInfoId;

}