/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.healthcare.stage.service.model.HealthDeskVerification;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing HealthDeskVerification in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HealthDeskVerificationCacheModel
	implements CacheModel<HealthDeskVerification>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof HealthDeskVerificationCacheModel)) {
			return false;
		}

		HealthDeskVerificationCacheModel healthDeskVerificationCacheModel =
			(HealthDeskVerificationCacheModel)object;

		if (healthDeskVerificationId ==
				healthDeskVerificationCacheModel.healthDeskVerificationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, healthDeskVerificationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{healthDeskVerificationId=");
		sb.append(healthDeskVerificationId);
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
		sb.append(", healthCareApplicationId=");
		sb.append(healthCareApplicationId);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", documentStatus=");
		sb.append(documentStatus);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public HealthDeskVerification toEntityModel() {
		HealthDeskVerificationImpl healthDeskVerificationImpl =
			new HealthDeskVerificationImpl();

		healthDeskVerificationImpl.setHealthDeskVerificationId(
			healthDeskVerificationId);
		healthDeskVerificationImpl.setGroupId(groupId);
		healthDeskVerificationImpl.setCompanyId(companyId);
		healthDeskVerificationImpl.setUserId(userId);

		if (userName == null) {
			healthDeskVerificationImpl.setUserName("");
		}
		else {
			healthDeskVerificationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			healthDeskVerificationImpl.setCreateDate(null);
		}
		else {
			healthDeskVerificationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			healthDeskVerificationImpl.setModifiedDate(null);
		}
		else {
			healthDeskVerificationImpl.setModifiedDate(new Date(modifiedDate));
		}

		healthDeskVerificationImpl.setHealthCareApplicationId(
			healthCareApplicationId);

		if (documentName == null) {
			healthDeskVerificationImpl.setDocumentName("");
		}
		else {
			healthDeskVerificationImpl.setDocumentName(documentName);
		}

		if (documentStatus == null) {
			healthDeskVerificationImpl.setDocumentStatus("");
		}
		else {
			healthDeskVerificationImpl.setDocumentStatus(documentStatus);
		}

		healthDeskVerificationImpl.resetOriginalValues();

		return healthDeskVerificationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		healthDeskVerificationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		healthCareApplicationId = objectInput.readLong();
		documentName = objectInput.readUTF();
		documentStatus = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(healthDeskVerificationId);

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

		objectOutput.writeLong(healthCareApplicationId);

		if (documentName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(documentName);
		}

		if (documentStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(documentStatus);
		}
	}

	public long healthDeskVerificationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long healthCareApplicationId;
	public String documentName;
	public String documentStatus;

}