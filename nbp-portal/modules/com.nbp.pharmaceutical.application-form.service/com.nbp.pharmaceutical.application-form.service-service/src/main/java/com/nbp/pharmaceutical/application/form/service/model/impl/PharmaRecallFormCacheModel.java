/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.pharmaceutical.application.form.service.model.PharmaRecallForm;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PharmaRecallForm in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PharmaRecallFormCacheModel
	implements CacheModel<PharmaRecallForm>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PharmaRecallFormCacheModel)) {
			return false;
		}

		PharmaRecallFormCacheModel pharmaRecallFormCacheModel =
			(PharmaRecallFormCacheModel)object;

		if (pharmaRecallFormId ==
				pharmaRecallFormCacheModel.pharmaRecallFormId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, pharmaRecallFormId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{pharmaRecallFormId=");
		sb.append(pharmaRecallFormId);
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
		sb.append(", typeOfRecall=");
		sb.append(typeOfRecall);
		sb.append(", licenseNumber=");
		sb.append(licenseNumber);
		sb.append(", pharmaApplicationId=");
		sb.append(pharmaApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PharmaRecallForm toEntityModel() {
		PharmaRecallFormImpl pharmaRecallFormImpl = new PharmaRecallFormImpl();

		pharmaRecallFormImpl.setPharmaRecallFormId(pharmaRecallFormId);
		pharmaRecallFormImpl.setGroupId(groupId);
		pharmaRecallFormImpl.setCompanyId(companyId);
		pharmaRecallFormImpl.setUserId(userId);

		if (userName == null) {
			pharmaRecallFormImpl.setUserName("");
		}
		else {
			pharmaRecallFormImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			pharmaRecallFormImpl.setCreateDate(null);
		}
		else {
			pharmaRecallFormImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			pharmaRecallFormImpl.setModifiedDate(null);
		}
		else {
			pharmaRecallFormImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (nameOfLicenseHolder == null) {
			pharmaRecallFormImpl.setNameOfLicenseHolder("");
		}
		else {
			pharmaRecallFormImpl.setNameOfLicenseHolder(nameOfLicenseHolder);
		}

		if (dateOfRecall == Long.MIN_VALUE) {
			pharmaRecallFormImpl.setDateOfRecall(null);
		}
		else {
			pharmaRecallFormImpl.setDateOfRecall(new Date(dateOfRecall));
		}

		if (initiatedBy == null) {
			pharmaRecallFormImpl.setInitiatedBy("");
		}
		else {
			pharmaRecallFormImpl.setInitiatedBy(initiatedBy);
		}

		if (typeOfRecall == null) {
			pharmaRecallFormImpl.setTypeOfRecall("");
		}
		else {
			pharmaRecallFormImpl.setTypeOfRecall(typeOfRecall);
		}

		if (licenseNumber == null) {
			pharmaRecallFormImpl.setLicenseNumber("");
		}
		else {
			pharmaRecallFormImpl.setLicenseNumber(licenseNumber);
		}

		pharmaRecallFormImpl.setPharmaApplicationId(pharmaApplicationId);

		pharmaRecallFormImpl.resetOriginalValues();

		return pharmaRecallFormImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		pharmaRecallFormId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nameOfLicenseHolder = objectInput.readUTF();
		dateOfRecall = objectInput.readLong();
		initiatedBy = objectInput.readUTF();
		typeOfRecall = objectInput.readUTF();
		licenseNumber = objectInput.readUTF();

		pharmaApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(pharmaRecallFormId);

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

		if (typeOfRecall == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfRecall);
		}

		if (licenseNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(licenseNumber);
		}

		objectOutput.writeLong(pharmaApplicationId);
	}

	public long pharmaRecallFormId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nameOfLicenseHolder;
	public long dateOfRecall;
	public String initiatedBy;
	public String typeOfRecall;
	public String licenseNumber;
	public long pharmaApplicationId;

}