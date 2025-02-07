/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AccInsBodiesOtherReq;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccInsBodiesOtherReq in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccInsBodiesOtherReqCacheModel
	implements CacheModel<AccInsBodiesOtherReq>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccInsBodiesOtherReqCacheModel)) {
			return false;
		}

		AccInsBodiesOtherReqCacheModel accInsBodiesOtherReqCacheModel =
			(AccInsBodiesOtherReqCacheModel)object;

		if (accInsBodiesOtherReqId ==
				accInsBodiesOtherReqCacheModel.accInsBodiesOtherReqId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accInsBodiesOtherReqId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", accInsBodiesOtherReqId=");
		sb.append(accInsBodiesOtherReqId);
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
		sb.append(", applicationFees=");
		sb.append(applicationFees);
		sb.append(", insPaymentMethod=");
		sb.append(insPaymentMethod);
		sb.append(", applicantRepName=");
		sb.append(applicantRepName);
		sb.append(", applicantRepPosition=");
		sb.append(applicantRepPosition);
		sb.append(", signatureDate=");
		sb.append(signatureDate);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AccInsBodiesOtherReq toEntityModel() {
		AccInsBodiesOtherReqImpl accInsBodiesOtherReqImpl =
			new AccInsBodiesOtherReqImpl();

		if (uuid == null) {
			accInsBodiesOtherReqImpl.setUuid("");
		}
		else {
			accInsBodiesOtherReqImpl.setUuid(uuid);
		}

		accInsBodiesOtherReqImpl.setAccInsBodiesOtherReqId(
			accInsBodiesOtherReqId);
		accInsBodiesOtherReqImpl.setGroupId(groupId);
		accInsBodiesOtherReqImpl.setCompanyId(companyId);
		accInsBodiesOtherReqImpl.setUserId(userId);

		if (userName == null) {
			accInsBodiesOtherReqImpl.setUserName("");
		}
		else {
			accInsBodiesOtherReqImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accInsBodiesOtherReqImpl.setCreateDate(null);
		}
		else {
			accInsBodiesOtherReqImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accInsBodiesOtherReqImpl.setModifiedDate(null);
		}
		else {
			accInsBodiesOtherReqImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (applicationFees == null) {
			accInsBodiesOtherReqImpl.setApplicationFees("");
		}
		else {
			accInsBodiesOtherReqImpl.setApplicationFees(applicationFees);
		}

		if (insPaymentMethod == null) {
			accInsBodiesOtherReqImpl.setInsPaymentMethod("");
		}
		else {
			accInsBodiesOtherReqImpl.setInsPaymentMethod(insPaymentMethod);
		}

		if (applicantRepName == null) {
			accInsBodiesOtherReqImpl.setApplicantRepName("");
		}
		else {
			accInsBodiesOtherReqImpl.setApplicantRepName(applicantRepName);
		}

		if (applicantRepPosition == null) {
			accInsBodiesOtherReqImpl.setApplicantRepPosition("");
		}
		else {
			accInsBodiesOtherReqImpl.setApplicantRepPosition(
				applicantRepPosition);
		}

		if (signatureDate == Long.MIN_VALUE) {
			accInsBodiesOtherReqImpl.setSignatureDate(null);
		}
		else {
			accInsBodiesOtherReqImpl.setSignatureDate(new Date(signatureDate));
		}

		accInsBodiesOtherReqImpl.setJanaacApplicationId(janaacApplicationId);

		accInsBodiesOtherReqImpl.resetOriginalValues();

		return accInsBodiesOtherReqImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		accInsBodiesOtherReqId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		applicationFees = objectInput.readUTF();
		insPaymentMethod = objectInput.readUTF();
		applicantRepName = objectInput.readUTF();
		applicantRepPosition = objectInput.readUTF();
		signatureDate = objectInput.readLong();

		janaacApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(accInsBodiesOtherReqId);

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

		if (applicationFees == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicationFees);
		}

		if (insPaymentMethod == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insPaymentMethod);
		}

		if (applicantRepName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantRepName);
		}

		if (applicantRepPosition == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantRepPosition);
		}

		objectOutput.writeLong(signatureDate);

		objectOutput.writeLong(janaacApplicationId);
	}

	public String uuid;
	public long accInsBodiesOtherReqId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String applicationFees;
	public String insPaymentMethod;
	public String applicantRepName;
	public String applicantRepPosition;
	public long signatureDate;
	public long janaacApplicationId;

}