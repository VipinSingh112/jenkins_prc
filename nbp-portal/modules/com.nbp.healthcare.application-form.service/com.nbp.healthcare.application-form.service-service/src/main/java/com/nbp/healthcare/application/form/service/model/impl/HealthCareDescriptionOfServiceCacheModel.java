/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.healthcare.application.form.service.model.HealthCareDescriptionOfService;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing HealthCareDescriptionOfService in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HealthCareDescriptionOfServiceCacheModel
	implements CacheModel<HealthCareDescriptionOfService>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof HealthCareDescriptionOfServiceCacheModel)) {
			return false;
		}

		HealthCareDescriptionOfServiceCacheModel
			healthCareDescriptionOfServiceCacheModel =
				(HealthCareDescriptionOfServiceCacheModel)object;

		if (healthCareDescriptionId ==
				healthCareDescriptionOfServiceCacheModel.
					healthCareDescriptionId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, healthCareDescriptionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{healthCareDescriptionId=");
		sb.append(healthCareDescriptionId);
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
		sb.append(", descriptionOfService=");
		sb.append(descriptionOfService);
		sb.append(", healthCareApplicationId=");
		sb.append(healthCareApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public HealthCareDescriptionOfService toEntityModel() {
		HealthCareDescriptionOfServiceImpl healthCareDescriptionOfServiceImpl =
			new HealthCareDescriptionOfServiceImpl();

		healthCareDescriptionOfServiceImpl.setHealthCareDescriptionId(
			healthCareDescriptionId);
		healthCareDescriptionOfServiceImpl.setGroupId(groupId);
		healthCareDescriptionOfServiceImpl.setCompanyId(companyId);
		healthCareDescriptionOfServiceImpl.setUserId(userId);

		if (userName == null) {
			healthCareDescriptionOfServiceImpl.setUserName("");
		}
		else {
			healthCareDescriptionOfServiceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			healthCareDescriptionOfServiceImpl.setCreateDate(null);
		}
		else {
			healthCareDescriptionOfServiceImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			healthCareDescriptionOfServiceImpl.setModifiedDate(null);
		}
		else {
			healthCareDescriptionOfServiceImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (descriptionOfService == null) {
			healthCareDescriptionOfServiceImpl.setDescriptionOfService("");
		}
		else {
			healthCareDescriptionOfServiceImpl.setDescriptionOfService(
				descriptionOfService);
		}

		healthCareDescriptionOfServiceImpl.setHealthCareApplicationId(
			healthCareApplicationId);

		healthCareDescriptionOfServiceImpl.resetOriginalValues();

		return healthCareDescriptionOfServiceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		healthCareDescriptionId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		descriptionOfService = objectInput.readUTF();

		healthCareApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(healthCareDescriptionId);

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

		if (descriptionOfService == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(descriptionOfService);
		}

		objectOutput.writeLong(healthCareApplicationId);
	}

	public long healthCareDescriptionId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String descriptionOfService;
	public long healthCareApplicationId;

}