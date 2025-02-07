/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.application.form.services.model.DetailOfApplicant;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DetailOfApplicant in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DetailOfApplicantCacheModel
	implements CacheModel<DetailOfApplicant>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DetailOfApplicantCacheModel)) {
			return false;
		}

		DetailOfApplicantCacheModel detailOfApplicantCacheModel =
			(DetailOfApplicantCacheModel)object;

		if (detailOfApplicantId ==
				detailOfApplicantCacheModel.detailOfApplicantId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, detailOfApplicantId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", detailOfApplicantId=");
		sb.append(detailOfApplicantId);
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
		sb.append(", applicantMiddleName=");
		sb.append(applicantMiddleName);
		sb.append(", applicantLastName=");
		sb.append(applicantLastName);
		sb.append(", applicantAddress=");
		sb.append(applicantAddress);
		sb.append(", applicantEmail=");
		sb.append(applicantEmail);
		sb.append(", applicantTeleNum=");
		sb.append(applicantTeleNum);
		sb.append(", applicantTrn=");
		sb.append(applicantTrn);
		sb.append(", applicantIdNumber=");
		sb.append(applicantIdNumber);
		sb.append(", applicantDob=");
		sb.append(applicantDob);
		sb.append(", applicantOccupation=");
		sb.append(applicantOccupation);
		sb.append(", osiApplicationId=");
		sb.append(osiApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DetailOfApplicant toEntityModel() {
		DetailOfApplicantImpl detailOfApplicantImpl =
			new DetailOfApplicantImpl();

		if (uuid == null) {
			detailOfApplicantImpl.setUuid("");
		}
		else {
			detailOfApplicantImpl.setUuid(uuid);
		}

		detailOfApplicantImpl.setDetailOfApplicantId(detailOfApplicantId);
		detailOfApplicantImpl.setGroupId(groupId);
		detailOfApplicantImpl.setCompanyId(companyId);
		detailOfApplicantImpl.setUserId(userId);

		if (userName == null) {
			detailOfApplicantImpl.setUserName("");
		}
		else {
			detailOfApplicantImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			detailOfApplicantImpl.setCreateDate(null);
		}
		else {
			detailOfApplicantImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			detailOfApplicantImpl.setModifiedDate(null);
		}
		else {
			detailOfApplicantImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (applicantName == null) {
			detailOfApplicantImpl.setApplicantName("");
		}
		else {
			detailOfApplicantImpl.setApplicantName(applicantName);
		}

		if (applicantMiddleName == null) {
			detailOfApplicantImpl.setApplicantMiddleName("");
		}
		else {
			detailOfApplicantImpl.setApplicantMiddleName(applicantMiddleName);
		}

		if (applicantLastName == null) {
			detailOfApplicantImpl.setApplicantLastName("");
		}
		else {
			detailOfApplicantImpl.setApplicantLastName(applicantLastName);
		}

		if (applicantAddress == null) {
			detailOfApplicantImpl.setApplicantAddress("");
		}
		else {
			detailOfApplicantImpl.setApplicantAddress(applicantAddress);
		}

		if (applicantEmail == null) {
			detailOfApplicantImpl.setApplicantEmail("");
		}
		else {
			detailOfApplicantImpl.setApplicantEmail(applicantEmail);
		}

		if (applicantTeleNum == null) {
			detailOfApplicantImpl.setApplicantTeleNum("");
		}
		else {
			detailOfApplicantImpl.setApplicantTeleNum(applicantTeleNum);
		}

		if (applicantTrn == null) {
			detailOfApplicantImpl.setApplicantTrn("");
		}
		else {
			detailOfApplicantImpl.setApplicantTrn(applicantTrn);
		}

		if (applicantIdNumber == null) {
			detailOfApplicantImpl.setApplicantIdNumber("");
		}
		else {
			detailOfApplicantImpl.setApplicantIdNumber(applicantIdNumber);
		}

		if (applicantDob == Long.MIN_VALUE) {
			detailOfApplicantImpl.setApplicantDob(null);
		}
		else {
			detailOfApplicantImpl.setApplicantDob(new Date(applicantDob));
		}

		if (applicantOccupation == null) {
			detailOfApplicantImpl.setApplicantOccupation("");
		}
		else {
			detailOfApplicantImpl.setApplicantOccupation(applicantOccupation);
		}

		detailOfApplicantImpl.setOsiApplicationId(osiApplicationId);

		detailOfApplicantImpl.resetOriginalValues();

		return detailOfApplicantImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		detailOfApplicantId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		applicantName = objectInput.readUTF();
		applicantMiddleName = objectInput.readUTF();
		applicantLastName = objectInput.readUTF();
		applicantAddress = objectInput.readUTF();
		applicantEmail = objectInput.readUTF();
		applicantTeleNum = objectInput.readUTF();
		applicantTrn = objectInput.readUTF();
		applicantIdNumber = objectInput.readUTF();
		applicantDob = objectInput.readLong();
		applicantOccupation = objectInput.readUTF();

		osiApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(detailOfApplicantId);

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

		if (applicantMiddleName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantMiddleName);
		}

		if (applicantLastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantLastName);
		}

		if (applicantAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantAddress);
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

		if (applicantTrn == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantTrn);
		}

		if (applicantIdNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantIdNumber);
		}

		objectOutput.writeLong(applicantDob);

		if (applicantOccupation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantOccupation);
		}

		objectOutput.writeLong(osiApplicationId);
	}

	public String uuid;
	public long detailOfApplicantId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String applicantName;
	public String applicantMiddleName;
	public String applicantLastName;
	public String applicantAddress;
	public String applicantEmail;
	public String applicantTeleNum;
	public String applicantTrn;
	public String applicantIdNumber;
	public long applicantDob;
	public String applicantOccupation;
	public long osiApplicationId;

}