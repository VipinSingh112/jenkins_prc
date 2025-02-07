/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.VerificationRequestorsInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VerificationRequestorsInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class VerificationRequestorsInfoCacheModel
	implements CacheModel<VerificationRequestorsInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof VerificationRequestorsInfoCacheModel)) {
			return false;
		}

		VerificationRequestorsInfoCacheModel
			verificationRequestorsInfoCacheModel =
				(VerificationRequestorsInfoCacheModel)object;

		if (requestorInformationId ==
				verificationRequestorsInfoCacheModel.requestorInformationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, requestorInformationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{requestorInformationId=");
		sb.append(requestorInformationId);
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
		sb.append(", verRequestorName=");
		sb.append(verRequestorName);
		sb.append(", verRequestorLastName=");
		sb.append(verRequestorLastName);
		sb.append(", verRequestorOccupation=");
		sb.append(verRequestorOccupation);
		sb.append(", verRequestorAddress=");
		sb.append(verRequestorAddress);
		sb.append(", verDateOfRequest=");
		sb.append(verDateOfRequest);
		sb.append(", verRequestorTelNum=");
		sb.append(verRequestorTelNum);
		sb.append(", verRequestorEmail=");
		sb.append(verRequestorEmail);
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VerificationRequestorsInfo toEntityModel() {
		VerificationRequestorsInfoImpl verificationRequestorsInfoImpl =
			new VerificationRequestorsInfoImpl();

		verificationRequestorsInfoImpl.setRequestorInformationId(
			requestorInformationId);
		verificationRequestorsInfoImpl.setGroupId(groupId);
		verificationRequestorsInfoImpl.setCompanyId(companyId);
		verificationRequestorsInfoImpl.setUserId(userId);

		if (userName == null) {
			verificationRequestorsInfoImpl.setUserName("");
		}
		else {
			verificationRequestorsInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			verificationRequestorsInfoImpl.setCreateDate(null);
		}
		else {
			verificationRequestorsInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			verificationRequestorsInfoImpl.setModifiedDate(null);
		}
		else {
			verificationRequestorsInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (verRequestorName == null) {
			verificationRequestorsInfoImpl.setVerRequestorName("");
		}
		else {
			verificationRequestorsInfoImpl.setVerRequestorName(
				verRequestorName);
		}

		if (verRequestorLastName == null) {
			verificationRequestorsInfoImpl.setVerRequestorLastName("");
		}
		else {
			verificationRequestorsInfoImpl.setVerRequestorLastName(
				verRequestorLastName);
		}

		if (verRequestorOccupation == null) {
			verificationRequestorsInfoImpl.setVerRequestorOccupation("");
		}
		else {
			verificationRequestorsInfoImpl.setVerRequestorOccupation(
				verRequestorOccupation);
		}

		if (verRequestorAddress == null) {
			verificationRequestorsInfoImpl.setVerRequestorAddress("");
		}
		else {
			verificationRequestorsInfoImpl.setVerRequestorAddress(
				verRequestorAddress);
		}

		if (verDateOfRequest == Long.MIN_VALUE) {
			verificationRequestorsInfoImpl.setVerDateOfRequest(null);
		}
		else {
			verificationRequestorsInfoImpl.setVerDateOfRequest(
				new Date(verDateOfRequest));
		}

		if (verRequestorTelNum == null) {
			verificationRequestorsInfoImpl.setVerRequestorTelNum("");
		}
		else {
			verificationRequestorsInfoImpl.setVerRequestorTelNum(
				verRequestorTelNum);
		}

		if (verRequestorEmail == null) {
			verificationRequestorsInfoImpl.setVerRequestorEmail("");
		}
		else {
			verificationRequestorsInfoImpl.setVerRequestorEmail(
				verRequestorEmail);
		}

		verificationRequestorsInfoImpl.setOsiInsolvencyId(osiInsolvencyId);

		verificationRequestorsInfoImpl.resetOriginalValues();

		return verificationRequestorsInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		requestorInformationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		verRequestorName = objectInput.readUTF();
		verRequestorLastName = objectInput.readUTF();
		verRequestorOccupation = objectInput.readUTF();
		verRequestorAddress = objectInput.readUTF();
		verDateOfRequest = objectInput.readLong();
		verRequestorTelNum = objectInput.readUTF();
		verRequestorEmail = objectInput.readUTF();

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(requestorInformationId);

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

		if (verRequestorName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(verRequestorName);
		}

		if (verRequestorLastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(verRequestorLastName);
		}

		if (verRequestorOccupation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(verRequestorOccupation);
		}

		if (verRequestorAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(verRequestorAddress);
		}

		objectOutput.writeLong(verDateOfRequest);

		if (verRequestorTelNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(verRequestorTelNum);
		}

		if (verRequestorEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(verRequestorEmail);
		}

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long requestorInformationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String verRequestorName;
	public String verRequestorLastName;
	public String verRequestorOccupation;
	public String verRequestorAddress;
	public long verDateOfRequest;
	public String verRequestorTelNum;
	public String verRequestorEmail;
	public long osiInsolvencyId;

}