/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.acquire.application.form.service.model.AcquireLandApplicantDetails;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AcquireLandApplicantDetails in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AcquireLandApplicantDetailsCacheModel
	implements CacheModel<AcquireLandApplicantDetails>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AcquireLandApplicantDetailsCacheModel)) {
			return false;
		}

		AcquireLandApplicantDetailsCacheModel
			acquireLandApplicantDetailsCacheModel =
				(AcquireLandApplicantDetailsCacheModel)object;

		if (acquireLandApplicantDetailsId ==
				acquireLandApplicantDetailsCacheModel.
					acquireLandApplicantDetailsId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, acquireLandApplicantDetailsId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{acquireLandApplicantDetailsId=");
		sb.append(acquireLandApplicantDetailsId);
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
		sb.append(", landApplicantName=");
		sb.append(landApplicantName);
		sb.append(", landApplicantGender=");
		sb.append(landApplicantGender);
		sb.append(", landApplicantDob=");
		sb.append(landApplicantDob);
		sb.append(", landApplicantTrnNum=");
		sb.append(landApplicantTrnNum);
		sb.append(", landApplicantHomeAddr=");
		sb.append(landApplicantHomeAddr);
		sb.append(", landApplicantMailingAddr=");
		sb.append(landApplicantMailingAddr);
		sb.append(", landApplicantPhoneNum=");
		sb.append(landApplicantPhoneNum);
		sb.append(", landApplicantEmail=");
		sb.append(landApplicantEmail);
		sb.append(", acquireApplicationId=");
		sb.append(acquireApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AcquireLandApplicantDetails toEntityModel() {
		AcquireLandApplicantDetailsImpl acquireLandApplicantDetailsImpl =
			new AcquireLandApplicantDetailsImpl();

		acquireLandApplicantDetailsImpl.setAcquireLandApplicantDetailsId(
			acquireLandApplicantDetailsId);
		acquireLandApplicantDetailsImpl.setGroupId(groupId);
		acquireLandApplicantDetailsImpl.setCompanyId(companyId);
		acquireLandApplicantDetailsImpl.setUserId(userId);

		if (userName == null) {
			acquireLandApplicantDetailsImpl.setUserName("");
		}
		else {
			acquireLandApplicantDetailsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			acquireLandApplicantDetailsImpl.setCreateDate(null);
		}
		else {
			acquireLandApplicantDetailsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			acquireLandApplicantDetailsImpl.setModifiedDate(null);
		}
		else {
			acquireLandApplicantDetailsImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (landApplicantName == null) {
			acquireLandApplicantDetailsImpl.setLandApplicantName("");
		}
		else {
			acquireLandApplicantDetailsImpl.setLandApplicantName(
				landApplicantName);
		}

		if (landApplicantGender == null) {
			acquireLandApplicantDetailsImpl.setLandApplicantGender("");
		}
		else {
			acquireLandApplicantDetailsImpl.setLandApplicantGender(
				landApplicantGender);
		}

		if (landApplicantDob == Long.MIN_VALUE) {
			acquireLandApplicantDetailsImpl.setLandApplicantDob(null);
		}
		else {
			acquireLandApplicantDetailsImpl.setLandApplicantDob(
				new Date(landApplicantDob));
		}

		if (landApplicantTrnNum == null) {
			acquireLandApplicantDetailsImpl.setLandApplicantTrnNum("");
		}
		else {
			acquireLandApplicantDetailsImpl.setLandApplicantTrnNum(
				landApplicantTrnNum);
		}

		if (landApplicantHomeAddr == null) {
			acquireLandApplicantDetailsImpl.setLandApplicantHomeAddr("");
		}
		else {
			acquireLandApplicantDetailsImpl.setLandApplicantHomeAddr(
				landApplicantHomeAddr);
		}

		if (landApplicantMailingAddr == null) {
			acquireLandApplicantDetailsImpl.setLandApplicantMailingAddr("");
		}
		else {
			acquireLandApplicantDetailsImpl.setLandApplicantMailingAddr(
				landApplicantMailingAddr);
		}

		if (landApplicantPhoneNum == null) {
			acquireLandApplicantDetailsImpl.setLandApplicantPhoneNum("");
		}
		else {
			acquireLandApplicantDetailsImpl.setLandApplicantPhoneNum(
				landApplicantPhoneNum);
		}

		if (landApplicantEmail == null) {
			acquireLandApplicantDetailsImpl.setLandApplicantEmail("");
		}
		else {
			acquireLandApplicantDetailsImpl.setLandApplicantEmail(
				landApplicantEmail);
		}

		acquireLandApplicantDetailsImpl.setAcquireApplicationId(
			acquireApplicationId);

		acquireLandApplicantDetailsImpl.resetOriginalValues();

		return acquireLandApplicantDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		acquireLandApplicantDetailsId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		landApplicantName = objectInput.readUTF();
		landApplicantGender = objectInput.readUTF();
		landApplicantDob = objectInput.readLong();
		landApplicantTrnNum = objectInput.readUTF();
		landApplicantHomeAddr = objectInput.readUTF();
		landApplicantMailingAddr = objectInput.readUTF();
		landApplicantPhoneNum = objectInput.readUTF();
		landApplicantEmail = objectInput.readUTF();

		acquireApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(acquireLandApplicantDetailsId);

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

		if (landApplicantName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landApplicantName);
		}

		if (landApplicantGender == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landApplicantGender);
		}

		objectOutput.writeLong(landApplicantDob);

		if (landApplicantTrnNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landApplicantTrnNum);
		}

		if (landApplicantHomeAddr == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landApplicantHomeAddr);
		}

		if (landApplicantMailingAddr == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landApplicantMailingAddr);
		}

		if (landApplicantPhoneNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landApplicantPhoneNum);
		}

		if (landApplicantEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landApplicantEmail);
		}

		objectOutput.writeLong(acquireApplicationId);
	}

	public long acquireLandApplicantDetailsId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String landApplicantName;
	public String landApplicantGender;
	public long landApplicantDob;
	public String landApplicantTrnNum;
	public String landApplicantHomeAddr;
	public String landApplicantMailingAddr;
	public String landApplicantPhoneNum;
	public String landApplicantEmail;
	public long acquireApplicationId;

}