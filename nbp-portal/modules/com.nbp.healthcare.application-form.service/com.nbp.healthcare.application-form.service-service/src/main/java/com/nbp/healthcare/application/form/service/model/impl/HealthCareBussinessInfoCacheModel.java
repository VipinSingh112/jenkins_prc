/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.healthcare.application.form.service.model.HealthCareBussinessInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing HealthCareBussinessInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HealthCareBussinessInfoCacheModel
	implements CacheModel<HealthCareBussinessInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof HealthCareBussinessInfoCacheModel)) {
			return false;
		}

		HealthCareBussinessInfoCacheModel healthCareBussinessInfoCacheModel =
			(HealthCareBussinessInfoCacheModel)object;

		if (healthCareBussinessInfoId ==
				healthCareBussinessInfoCacheModel.healthCareBussinessInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, healthCareBussinessInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{healthCareBussinessInfoId=");
		sb.append(healthCareBussinessInfoId);
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
		sb.append(", telephoneNumber=");
		sb.append(telephoneNumber);
		sb.append(", email=");
		sb.append(email);
		sb.append(", parish=");
		sb.append(parish);
		sb.append(", companyNumber=");
		sb.append(companyNumber);
		sb.append(", trnNumber=");
		sb.append(trnNumber);
		sb.append(", healthCareApplicationId=");
		sb.append(healthCareApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public HealthCareBussinessInfo toEntityModel() {
		HealthCareBussinessInfoImpl healthCareBussinessInfoImpl =
			new HealthCareBussinessInfoImpl();

		healthCareBussinessInfoImpl.setHealthCareBussinessInfoId(
			healthCareBussinessInfoId);
		healthCareBussinessInfoImpl.setGroupId(groupId);
		healthCareBussinessInfoImpl.setCompanyId(companyId);
		healthCareBussinessInfoImpl.setUserId(userId);

		if (userName == null) {
			healthCareBussinessInfoImpl.setUserName("");
		}
		else {
			healthCareBussinessInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			healthCareBussinessInfoImpl.setCreateDate(null);
		}
		else {
			healthCareBussinessInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			healthCareBussinessInfoImpl.setModifiedDate(null);
		}
		else {
			healthCareBussinessInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			healthCareBussinessInfoImpl.setName("");
		}
		else {
			healthCareBussinessInfoImpl.setName(name);
		}

		if (telephoneNumber == null) {
			healthCareBussinessInfoImpl.setTelephoneNumber("");
		}
		else {
			healthCareBussinessInfoImpl.setTelephoneNumber(telephoneNumber);
		}

		if (email == null) {
			healthCareBussinessInfoImpl.setEmail("");
		}
		else {
			healthCareBussinessInfoImpl.setEmail(email);
		}

		if (parish == null) {
			healthCareBussinessInfoImpl.setParish("");
		}
		else {
			healthCareBussinessInfoImpl.setParish(parish);
		}

		if (companyNumber == null) {
			healthCareBussinessInfoImpl.setCompanyNumber("");
		}
		else {
			healthCareBussinessInfoImpl.setCompanyNumber(companyNumber);
		}

		if (trnNumber == null) {
			healthCareBussinessInfoImpl.setTrnNumber("");
		}
		else {
			healthCareBussinessInfoImpl.setTrnNumber(trnNumber);
		}

		healthCareBussinessInfoImpl.setHealthCareApplicationId(
			healthCareApplicationId);

		healthCareBussinessInfoImpl.resetOriginalValues();

		return healthCareBussinessInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		healthCareBussinessInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		telephoneNumber = objectInput.readUTF();
		email = objectInput.readUTF();
		parish = objectInput.readUTF();
		companyNumber = objectInput.readUTF();
		trnNumber = objectInput.readUTF();

		healthCareApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(healthCareBussinessInfoId);

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

		if (telephoneNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telephoneNumber);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (parish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(parish);
		}

		if (companyNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyNumber);
		}

		if (trnNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(trnNumber);
		}

		objectOutput.writeLong(healthCareApplicationId);
	}

	public long healthCareBussinessInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String telephoneNumber;
	public String email;
	public String parish;
	public String companyNumber;
	public String trnNumber;
	public long healthCareApplicationId;

}