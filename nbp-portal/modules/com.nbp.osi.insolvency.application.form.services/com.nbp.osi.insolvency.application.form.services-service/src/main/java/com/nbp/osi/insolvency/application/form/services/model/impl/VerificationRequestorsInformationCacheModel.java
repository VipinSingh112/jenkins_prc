/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.VerificationRequestorsInformation;
import com.nbp.osi.insolvency.application.form.services.service.persistence.VerificationRequestorsInformationPK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VerificationRequestorsInformation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class VerificationRequestorsInformationCacheModel
	implements CacheModel<VerificationRequestorsInformation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof VerificationRequestorsInformationCacheModel)) {
			return false;
		}

		VerificationRequestorsInformationCacheModel
			verificationRequestorsInformationCacheModel =
				(VerificationRequestorsInformationCacheModel)object;

		if (verificationRequestorsInformationPK.equals(
				verificationRequestorsInformationCacheModel.
					verificationRequestorsInformationPK)) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, verificationRequestorsInformationPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

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
	public VerificationRequestorsInformation toEntityModel() {
		VerificationRequestorsInformationImpl
			verificationRequestorsInformationImpl =
				new VerificationRequestorsInformationImpl();

		verificationRequestorsInformationImpl.setRequestorInformationId(
			requestorInformationId);
		verificationRequestorsInformationImpl.setGroupId(groupId);
		verificationRequestorsInformationImpl.setCompanyId(companyId);
		verificationRequestorsInformationImpl.setUserId(userId);

		if (userName == null) {
			verificationRequestorsInformationImpl.setUserName("");
		}
		else {
			verificationRequestorsInformationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			verificationRequestorsInformationImpl.setCreateDate(null);
		}
		else {
			verificationRequestorsInformationImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			verificationRequestorsInformationImpl.setModifiedDate(null);
		}
		else {
			verificationRequestorsInformationImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (verRequestorName == null) {
			verificationRequestorsInformationImpl.setVerRequestorName("");
		}
		else {
			verificationRequestorsInformationImpl.setVerRequestorName(
				verRequestorName);
		}

		if (verRequestorOccupation == null) {
			verificationRequestorsInformationImpl.setVerRequestorOccupation("");
		}
		else {
			verificationRequestorsInformationImpl.setVerRequestorOccupation(
				verRequestorOccupation);
		}

		if (verRequestorAddress == null) {
			verificationRequestorsInformationImpl.setVerRequestorAddress("");
		}
		else {
			verificationRequestorsInformationImpl.setVerRequestorAddress(
				verRequestorAddress);
		}

		if (verDateOfRequest == Long.MIN_VALUE) {
			verificationRequestorsInformationImpl.setVerDateOfRequest(null);
		}
		else {
			verificationRequestorsInformationImpl.setVerDateOfRequest(
				new Date(verDateOfRequest));
		}

		if (verRequestorTelNum == null) {
			verificationRequestorsInformationImpl.setVerRequestorTelNum("");
		}
		else {
			verificationRequestorsInformationImpl.setVerRequestorTelNum(
				verRequestorTelNum);
		}

		if (verRequestorEmail == null) {
			verificationRequestorsInformationImpl.setVerRequestorEmail("");
		}
		else {
			verificationRequestorsInformationImpl.setVerRequestorEmail(
				verRequestorEmail);
		}

		verificationRequestorsInformationImpl.setOsiInsolvencyId(
			osiInsolvencyId);

		verificationRequestorsInformationImpl.resetOriginalValues();

		return verificationRequestorsInformationImpl;
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
		verRequestorOccupation = objectInput.readUTF();
		verRequestorAddress = objectInput.readUTF();
		verDateOfRequest = objectInput.readLong();
		verRequestorTelNum = objectInput.readUTF();
		verRequestorEmail = objectInput.readUTF();

		osiInsolvencyId = objectInput.readLong();

		verificationRequestorsInformationPK =
			new VerificationRequestorsInformationPK(
				requestorInformationId, osiInsolvencyId);
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
	public String verRequestorOccupation;
	public String verRequestorAddress;
	public long verDateOfRequest;
	public String verRequestorTelNum;
	public String verRequestorEmail;
	public long osiInsolvencyId;
	public transient VerificationRequestorsInformationPK
		verificationRequestorsInformationPK;

}