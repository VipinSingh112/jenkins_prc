/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.acquire.application.form.service.model.AcquireApplicationDetails;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AcquireApplicationDetails in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AcquireApplicationDetailsCacheModel
	implements CacheModel<AcquireApplicationDetails>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AcquireApplicationDetailsCacheModel)) {
			return false;
		}

		AcquireApplicationDetailsCacheModel
			acquireApplicationDetailsCacheModel =
				(AcquireApplicationDetailsCacheModel)object;

		if (acquireApplicationDetailsId ==
				acquireApplicationDetailsCacheModel.
					acquireApplicationDetailsId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, acquireApplicationDetailsId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{acquireApplicationDetailsId=");
		sb.append(acquireApplicationDetailsId);
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
		sb.append(", applicantName=");
		sb.append(applicantName);
		sb.append(", applicantOrganisation=");
		sb.append(applicantOrganisation);
		sb.append(", applicantPostalAddr=");
		sb.append(applicantPostalAddr);
		sb.append(", applicantEmail=");
		sb.append(applicantEmail);
		sb.append(", applicantTeleNum=");
		sb.append(applicantTeleNum);
		sb.append(", acquireApplicationId=");
		sb.append(acquireApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AcquireApplicationDetails toEntityModel() {
		AcquireApplicationDetailsImpl acquireApplicationDetailsImpl =
			new AcquireApplicationDetailsImpl();

		acquireApplicationDetailsImpl.setAcquireApplicationDetailsId(
			acquireApplicationDetailsId);
		acquireApplicationDetailsImpl.setGroupId(groupId);
		acquireApplicationDetailsImpl.setCompanyId(companyId);
		acquireApplicationDetailsImpl.setUserId(userId);

		if (userName == null) {
			acquireApplicationDetailsImpl.setUserName("");
		}
		else {
			acquireApplicationDetailsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			acquireApplicationDetailsImpl.setCreateDate(null);
		}
		else {
			acquireApplicationDetailsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			acquireApplicationDetailsImpl.setModifiedDate(null);
		}
		else {
			acquireApplicationDetailsImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (applicantName == null) {
			acquireApplicationDetailsImpl.setApplicantName("");
		}
		else {
			acquireApplicationDetailsImpl.setApplicantName(applicantName);
		}

		if (applicantOrganisation == null) {
			acquireApplicationDetailsImpl.setApplicantOrganisation("");
		}
		else {
			acquireApplicationDetailsImpl.setApplicantOrganisation(
				applicantOrganisation);
		}

		if (applicantPostalAddr == null) {
			acquireApplicationDetailsImpl.setApplicantPostalAddr("");
		}
		else {
			acquireApplicationDetailsImpl.setApplicantPostalAddr(
				applicantPostalAddr);
		}

		if (applicantEmail == null) {
			acquireApplicationDetailsImpl.setApplicantEmail("");
		}
		else {
			acquireApplicationDetailsImpl.setApplicantEmail(applicantEmail);
		}

		if (applicantTeleNum == null) {
			acquireApplicationDetailsImpl.setApplicantTeleNum("");
		}
		else {
			acquireApplicationDetailsImpl.setApplicantTeleNum(applicantTeleNum);
		}

		acquireApplicationDetailsImpl.setAcquireApplicationId(
			acquireApplicationId);

		acquireApplicationDetailsImpl.resetOriginalValues();

		return acquireApplicationDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		acquireApplicationDetailsId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		applicantName = objectInput.readUTF();
		applicantOrganisation = objectInput.readUTF();
		applicantPostalAddr = objectInput.readUTF();
		applicantEmail = objectInput.readUTF();
		applicantTeleNum = objectInput.readUTF();

		acquireApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(acquireApplicationDetailsId);

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

		if (applicantName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantName);
		}

		if (applicantOrganisation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantOrganisation);
		}

		if (applicantPostalAddr == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantPostalAddr);
		}

		if (applicantEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantEmail);
		}

		if (applicantTeleNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantTeleNum);
		}

		objectOutput.writeLong(acquireApplicationId);
	}

	public long acquireApplicationDetailsId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String applicantName;
	public String applicantOrganisation;
	public String applicantPostalAddr;
	public String applicantEmail;
	public String applicantTeleNum;
	public long acquireApplicationId;

}