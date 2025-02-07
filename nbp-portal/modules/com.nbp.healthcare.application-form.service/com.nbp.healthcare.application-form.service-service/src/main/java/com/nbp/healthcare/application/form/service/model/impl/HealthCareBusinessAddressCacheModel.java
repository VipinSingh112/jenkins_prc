/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.healthcare.application.form.service.model.HealthCareBusinessAddress;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing HealthCareBusinessAddress in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HealthCareBusinessAddressCacheModel
	implements CacheModel<HealthCareBusinessAddress>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof HealthCareBusinessAddressCacheModel)) {
			return false;
		}

		HealthCareBusinessAddressCacheModel
			healthCareBusinessAddressCacheModel =
				(HealthCareBusinessAddressCacheModel)object;

		if (healthCareBusinessAddressId ==
				healthCareBusinessAddressCacheModel.
					healthCareBusinessAddressId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, healthCareBusinessAddressId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{healthCareBusinessAddressId=");
		sb.append(healthCareBusinessAddressId);
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
		sb.append(", bussinessAddress=");
		sb.append(bussinessAddress);
		sb.append(", healthCareApplicationId=");
		sb.append(healthCareApplicationId);
		sb.append(", healthCareBussinessInfoId=");
		sb.append(healthCareBussinessInfoId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public HealthCareBusinessAddress toEntityModel() {
		HealthCareBusinessAddressImpl healthCareBusinessAddressImpl =
			new HealthCareBusinessAddressImpl();

		healthCareBusinessAddressImpl.setHealthCareBusinessAddressId(
			healthCareBusinessAddressId);
		healthCareBusinessAddressImpl.setGroupId(groupId);
		healthCareBusinessAddressImpl.setCompanyId(companyId);
		healthCareBusinessAddressImpl.setUserId(userId);

		if (userName == null) {
			healthCareBusinessAddressImpl.setUserName("");
		}
		else {
			healthCareBusinessAddressImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			healthCareBusinessAddressImpl.setCreateDate(null);
		}
		else {
			healthCareBusinessAddressImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			healthCareBusinessAddressImpl.setModifiedDate(null);
		}
		else {
			healthCareBusinessAddressImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (bussinessAddress == null) {
			healthCareBusinessAddressImpl.setBussinessAddress("");
		}
		else {
			healthCareBusinessAddressImpl.setBussinessAddress(bussinessAddress);
		}

		healthCareBusinessAddressImpl.setHealthCareApplicationId(
			healthCareApplicationId);
		healthCareBusinessAddressImpl.setHealthCareBussinessInfoId(
			healthCareBussinessInfoId);

		healthCareBusinessAddressImpl.resetOriginalValues();

		return healthCareBusinessAddressImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		healthCareBusinessAddressId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		bussinessAddress = objectInput.readUTF();

		healthCareApplicationId = objectInput.readLong();

		healthCareBussinessInfoId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(healthCareBusinessAddressId);

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

		if (bussinessAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bussinessAddress);
		}

		objectOutput.writeLong(healthCareApplicationId);

		objectOutput.writeLong(healthCareBussinessInfoId);
	}

	public long healthCareBusinessAddressId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String bussinessAddress;
	public long healthCareApplicationId;
	public long healthCareBussinessInfoId;

}