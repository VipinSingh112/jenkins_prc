/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.cannabis.application.form.services.model.CannabisApplicationCompanyInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CannabisApplicationCompanyInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CannabisApplicationCompanyInfoCacheModel
	implements CacheModel<CannabisApplicationCompanyInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CannabisApplicationCompanyInfoCacheModel)) {
			return false;
		}

		CannabisApplicationCompanyInfoCacheModel
			cannabisApplicationCompanyInfoCacheModel =
				(CannabisApplicationCompanyInfoCacheModel)object;

		if (companyInformationId ==
				cannabisApplicationCompanyInfoCacheModel.companyInformationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, companyInformationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", companyInformationId=");
		sb.append(companyInformationId);
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
		sb.append(", trn=");
		sb.append(trn);
		sb.append(", typeOfCompany=");
		sb.append(typeOfCompany);
		sb.append(", otherCompanyType=");
		sb.append(otherCompanyType);
		sb.append(", registrationNumber=");
		sb.append(registrationNumber);
		sb.append(", contactPhoneNumber=");
		sb.append(contactPhoneNumber);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", status=");
		sb.append(status);
		sb.append(", applicationNumber=");
		sb.append(applicationNumber);
		sb.append(", cannabisApplicationId=");
		sb.append(cannabisApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CannabisApplicationCompanyInfo toEntityModel() {
		CannabisApplicationCompanyInfoImpl cannabisApplicationCompanyInfoImpl =
			new CannabisApplicationCompanyInfoImpl();

		if (uuid == null) {
			cannabisApplicationCompanyInfoImpl.setUuid("");
		}
		else {
			cannabisApplicationCompanyInfoImpl.setUuid(uuid);
		}

		cannabisApplicationCompanyInfoImpl.setCompanyInformationId(
			companyInformationId);
		cannabisApplicationCompanyInfoImpl.setGroupId(groupId);
		cannabisApplicationCompanyInfoImpl.setCompanyId(companyId);
		cannabisApplicationCompanyInfoImpl.setUserId(userId);

		if (userName == null) {
			cannabisApplicationCompanyInfoImpl.setUserName("");
		}
		else {
			cannabisApplicationCompanyInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			cannabisApplicationCompanyInfoImpl.setCreateDate(null);
		}
		else {
			cannabisApplicationCompanyInfoImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cannabisApplicationCompanyInfoImpl.setModifiedDate(null);
		}
		else {
			cannabisApplicationCompanyInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (companyName == null) {
			cannabisApplicationCompanyInfoImpl.setCompanyName("");
		}
		else {
			cannabisApplicationCompanyInfoImpl.setCompanyName(companyName);
		}

		if (trn == null) {
			cannabisApplicationCompanyInfoImpl.setTrn("");
		}
		else {
			cannabisApplicationCompanyInfoImpl.setTrn(trn);
		}

		if (typeOfCompany == null) {
			cannabisApplicationCompanyInfoImpl.setTypeOfCompany("");
		}
		else {
			cannabisApplicationCompanyInfoImpl.setTypeOfCompany(typeOfCompany);
		}

		if (otherCompanyType == null) {
			cannabisApplicationCompanyInfoImpl.setOtherCompanyType("");
		}
		else {
			cannabisApplicationCompanyInfoImpl.setOtherCompanyType(
				otherCompanyType);
		}

		if (registrationNumber == null) {
			cannabisApplicationCompanyInfoImpl.setRegistrationNumber("");
		}
		else {
			cannabisApplicationCompanyInfoImpl.setRegistrationNumber(
				registrationNumber);
		}

		if (contactPhoneNumber == null) {
			cannabisApplicationCompanyInfoImpl.setContactPhoneNumber("");
		}
		else {
			cannabisApplicationCompanyInfoImpl.setContactPhoneNumber(
				contactPhoneNumber);
		}

		if (emailAddress == null) {
			cannabisApplicationCompanyInfoImpl.setEmailAddress("");
		}
		else {
			cannabisApplicationCompanyInfoImpl.setEmailAddress(emailAddress);
		}

		cannabisApplicationCompanyInfoImpl.setStatus(status);

		if (applicationNumber == null) {
			cannabisApplicationCompanyInfoImpl.setApplicationNumber("");
		}
		else {
			cannabisApplicationCompanyInfoImpl.setApplicationNumber(
				applicationNumber);
		}

		cannabisApplicationCompanyInfoImpl.setCannabisApplicationId(
			cannabisApplicationId);

		cannabisApplicationCompanyInfoImpl.resetOriginalValues();

		return cannabisApplicationCompanyInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		companyInformationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		companyName = objectInput.readUTF();
		trn = objectInput.readUTF();
		typeOfCompany = objectInput.readUTF();
		otherCompanyType = objectInput.readUTF();
		registrationNumber = objectInput.readUTF();
		contactPhoneNumber = objectInput.readUTF();
		emailAddress = objectInput.readUTF();

		status = objectInput.readInt();
		applicationNumber = objectInput.readUTF();

		cannabisApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(companyInformationId);

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

		if (trn == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(trn);
		}

		if (typeOfCompany == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfCompany);
		}

		if (otherCompanyType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherCompanyType);
		}

		if (registrationNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(registrationNumber);
		}

		if (contactPhoneNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contactPhoneNumber);
		}

		if (emailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailAddress);
		}

		objectOutput.writeInt(status);

		if (applicationNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicationNumber);
		}

		objectOutput.writeLong(cannabisApplicationId);
	}

	public String uuid;
	public long companyInformationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String companyName;
	public String trn;
	public String typeOfCompany;
	public String otherCompanyType;
	public String registrationNumber;
	public String contactPhoneNumber;
	public String emailAddress;
	public int status;
	public String applicationNumber;
	public long cannabisApplicationId;

}