/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.pharmaceutical.application.form.service.model.PharmaCancellationForm;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PharmaCancellationForm in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PharmaCancellationFormCacheModel
	implements CacheModel<PharmaCancellationForm>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PharmaCancellationFormCacheModel)) {
			return false;
		}

		PharmaCancellationFormCacheModel pharmaCancellationFormCacheModel =
			(PharmaCancellationFormCacheModel)object;

		if (pharmaCancellationFormId ==
				pharmaCancellationFormCacheModel.pharmaCancellationFormId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, pharmaCancellationFormId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{pharmaCancellationFormId=");
		sb.append(pharmaCancellationFormId);
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
		sb.append(", nameOfLicenseHolder=");
		sb.append(nameOfLicenseHolder);
		sb.append(", dateOfRecall=");
		sb.append(dateOfRecall);
		sb.append(", initiatedBy=");
		sb.append(initiatedBy);
		sb.append(", licenseNumber=");
		sb.append(licenseNumber);
		sb.append(", pharmaApplicationId=");
		sb.append(pharmaApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PharmaCancellationForm toEntityModel() {
		PharmaCancellationFormImpl pharmaCancellationFormImpl =
			new PharmaCancellationFormImpl();

		pharmaCancellationFormImpl.setPharmaCancellationFormId(
			pharmaCancellationFormId);
		pharmaCancellationFormImpl.setGroupId(groupId);
		pharmaCancellationFormImpl.setCompanyId(companyId);
		pharmaCancellationFormImpl.setUserId(userId);

		if (userName == null) {
			pharmaCancellationFormImpl.setUserName("");
		}
		else {
			pharmaCancellationFormImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			pharmaCancellationFormImpl.setCreateDate(null);
		}
		else {
			pharmaCancellationFormImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			pharmaCancellationFormImpl.setModifiedDate(null);
		}
		else {
			pharmaCancellationFormImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (nameOfLicenseHolder == null) {
			pharmaCancellationFormImpl.setNameOfLicenseHolder("");
		}
		else {
			pharmaCancellationFormImpl.setNameOfLicenseHolder(
				nameOfLicenseHolder);
		}

		if (dateOfRecall == Long.MIN_VALUE) {
			pharmaCancellationFormImpl.setDateOfRecall(null);
		}
		else {
			pharmaCancellationFormImpl.setDateOfRecall(new Date(dateOfRecall));
		}

		if (initiatedBy == null) {
			pharmaCancellationFormImpl.setInitiatedBy("");
		}
		else {
			pharmaCancellationFormImpl.setInitiatedBy(initiatedBy);
		}

		if (licenseNumber == null) {
			pharmaCancellationFormImpl.setLicenseNumber("");
		}
		else {
			pharmaCancellationFormImpl.setLicenseNumber(licenseNumber);
		}

		pharmaCancellationFormImpl.setPharmaApplicationId(pharmaApplicationId);

		pharmaCancellationFormImpl.resetOriginalValues();

		return pharmaCancellationFormImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		pharmaCancellationFormId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nameOfLicenseHolder = objectInput.readUTF();
		dateOfRecall = objectInput.readLong();
		initiatedBy = objectInput.readUTF();
		licenseNumber = objectInput.readUTF();

		pharmaApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(pharmaCancellationFormId);

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

		if (nameOfLicenseHolder == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfLicenseHolder);
		}

		objectOutput.writeLong(dateOfRecall);

		if (initiatedBy == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(initiatedBy);
		}

		if (licenseNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(licenseNumber);
		}

		objectOutput.writeLong(pharmaApplicationId);
	}

	public long pharmaCancellationFormId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nameOfLicenseHolder;
	public long dateOfRecall;
	public String initiatedBy;
	public String licenseNumber;
	public long pharmaApplicationId;

}