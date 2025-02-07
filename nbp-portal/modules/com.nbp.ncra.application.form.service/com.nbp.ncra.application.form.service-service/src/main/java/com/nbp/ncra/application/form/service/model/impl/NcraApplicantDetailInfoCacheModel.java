/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncra.application.form.service.model.NcraApplicantDetailInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcraApplicantDetailInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcraApplicantDetailInfoCacheModel
	implements CacheModel<NcraApplicantDetailInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcraApplicantDetailInfoCacheModel)) {
			return false;
		}

		NcraApplicantDetailInfoCacheModel ncraApplicantDetailInfoCacheModel =
			(NcraApplicantDetailInfoCacheModel)object;

		if (ncraApplicantDetailInfoId ==
				ncraApplicantDetailInfoCacheModel.ncraApplicantDetailInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncraApplicantDetailInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{ncraApplicantDetailInfoId=");
		sb.append(ncraApplicantDetailInfoId);
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
		sb.append(", applicantBusinessName=");
		sb.append(applicantBusinessName);
		sb.append(", applicantAddress=");
		sb.append(applicantAddress);
		sb.append(", applicantContact=");
		sb.append(applicantContact);
		sb.append(", applicantTeleNum=");
		sb.append(applicantTeleNum);
		sb.append(", applicantFaxNo=");
		sb.append(applicantFaxNo);
		sb.append(", applicantEmailAddr=");
		sb.append(applicantEmailAddr);
		sb.append(", applicantLocation=");
		sb.append(applicantLocation);
		sb.append(", ncraApplicationId=");
		sb.append(ncraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcraApplicantDetailInfo toEntityModel() {
		NcraApplicantDetailInfoImpl ncraApplicantDetailInfoImpl =
			new NcraApplicantDetailInfoImpl();

		ncraApplicantDetailInfoImpl.setNcraApplicantDetailInfoId(
			ncraApplicantDetailInfoId);
		ncraApplicantDetailInfoImpl.setGroupId(groupId);
		ncraApplicantDetailInfoImpl.setCompanyId(companyId);
		ncraApplicantDetailInfoImpl.setUserId(userId);

		if (userName == null) {
			ncraApplicantDetailInfoImpl.setUserName("");
		}
		else {
			ncraApplicantDetailInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncraApplicantDetailInfoImpl.setCreateDate(null);
		}
		else {
			ncraApplicantDetailInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncraApplicantDetailInfoImpl.setModifiedDate(null);
		}
		else {
			ncraApplicantDetailInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (applicantBusinessName == null) {
			ncraApplicantDetailInfoImpl.setApplicantBusinessName("");
		}
		else {
			ncraApplicantDetailInfoImpl.setApplicantBusinessName(
				applicantBusinessName);
		}

		if (applicantAddress == null) {
			ncraApplicantDetailInfoImpl.setApplicantAddress("");
		}
		else {
			ncraApplicantDetailInfoImpl.setApplicantAddress(applicantAddress);
		}

		if (applicantContact == null) {
			ncraApplicantDetailInfoImpl.setApplicantContact("");
		}
		else {
			ncraApplicantDetailInfoImpl.setApplicantContact(applicantContact);
		}

		if (applicantTeleNum == null) {
			ncraApplicantDetailInfoImpl.setApplicantTeleNum("");
		}
		else {
			ncraApplicantDetailInfoImpl.setApplicantTeleNum(applicantTeleNum);
		}

		if (applicantFaxNo == null) {
			ncraApplicantDetailInfoImpl.setApplicantFaxNo("");
		}
		else {
			ncraApplicantDetailInfoImpl.setApplicantFaxNo(applicantFaxNo);
		}

		if (applicantEmailAddr == null) {
			ncraApplicantDetailInfoImpl.setApplicantEmailAddr("");
		}
		else {
			ncraApplicantDetailInfoImpl.setApplicantEmailAddr(
				applicantEmailAddr);
		}

		if (applicantLocation == null) {
			ncraApplicantDetailInfoImpl.setApplicantLocation("");
		}
		else {
			ncraApplicantDetailInfoImpl.setApplicantLocation(applicantLocation);
		}

		ncraApplicantDetailInfoImpl.setNcraApplicationId(ncraApplicationId);

		ncraApplicantDetailInfoImpl.resetOriginalValues();

		return ncraApplicantDetailInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncraApplicantDetailInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		applicantBusinessName = objectInput.readUTF();
		applicantAddress = objectInput.readUTF();
		applicantContact = objectInput.readUTF();
		applicantTeleNum = objectInput.readUTF();
		applicantFaxNo = objectInput.readUTF();
		applicantEmailAddr = objectInput.readUTF();
		applicantLocation = objectInput.readUTF();

		ncraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ncraApplicantDetailInfoId);

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

		if (applicantBusinessName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantBusinessName);
		}

		if (applicantAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantAddress);
		}

		if (applicantContact == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantContact);
		}

		if (applicantTeleNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantTeleNum);
		}

		if (applicantFaxNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantFaxNo);
		}

		if (applicantEmailAddr == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantEmailAddr);
		}

		if (applicantLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantLocation);
		}

		objectOutput.writeLong(ncraApplicationId);
	}

	public long ncraApplicantDetailInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String applicantBusinessName;
	public String applicantAddress;
	public String applicantContact;
	public String applicantTeleNum;
	public String applicantFaxNo;
	public String applicantEmailAddr;
	public String applicantLocation;
	public long ncraApplicationId;

}