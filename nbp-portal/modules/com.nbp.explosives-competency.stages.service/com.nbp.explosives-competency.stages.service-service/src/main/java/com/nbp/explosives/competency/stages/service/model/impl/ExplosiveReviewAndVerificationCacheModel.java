/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.explosives.competency.stages.service.model.ExplosiveReviewAndVerification;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ExplosiveReviewAndVerification in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ExplosiveReviewAndVerificationCacheModel
	implements CacheModel<ExplosiveReviewAndVerification>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ExplosiveReviewAndVerificationCacheModel)) {
			return false;
		}

		ExplosiveReviewAndVerificationCacheModel
			explosiveReviewAndVerificationCacheModel =
				(ExplosiveReviewAndVerificationCacheModel)object;

		if (issuanceId == explosiveReviewAndVerificationCacheModel.issuanceId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, issuanceId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", issuanceId=");
		sb.append(issuanceId);
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
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", amountDue=");
		sb.append(amountDue);
		sb.append(", dateReceived=");
		sb.append(dateReceived);
		sb.append(", amountreceived=");
		sb.append(amountreceived);
		sb.append(", receivedNumber=");
		sb.append(receivedNumber);
		sb.append(", comments=");
		sb.append(comments);
		sb.append(", amountOutstanding=");
		sb.append(amountOutstanding);
		sb.append(", dueDate=");
		sb.append(dueDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", paymentreceiptFileEntryId=");
		sb.append(paymentreceiptFileEntryId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ExplosiveReviewAndVerification toEntityModel() {
		ExplosiveReviewAndVerificationImpl explosiveReviewAndVerificationImpl =
			new ExplosiveReviewAndVerificationImpl();

		if (uuid == null) {
			explosiveReviewAndVerificationImpl.setUuid("");
		}
		else {
			explosiveReviewAndVerificationImpl.setUuid(uuid);
		}

		explosiveReviewAndVerificationImpl.setIssuanceId(issuanceId);
		explosiveReviewAndVerificationImpl.setGroupId(groupId);
		explosiveReviewAndVerificationImpl.setCompanyId(companyId);
		explosiveReviewAndVerificationImpl.setUserId(userId);

		if (userName == null) {
			explosiveReviewAndVerificationImpl.setUserName("");
		}
		else {
			explosiveReviewAndVerificationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			explosiveReviewAndVerificationImpl.setCreateDate(null);
		}
		else {
			explosiveReviewAndVerificationImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			explosiveReviewAndVerificationImpl.setModifiedDate(null);
		}
		else {
			explosiveReviewAndVerificationImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (caseId == null) {
			explosiveReviewAndVerificationImpl.setCaseId("");
		}
		else {
			explosiveReviewAndVerificationImpl.setCaseId(caseId);
		}

		if (amountDue == null) {
			explosiveReviewAndVerificationImpl.setAmountDue("");
		}
		else {
			explosiveReviewAndVerificationImpl.setAmountDue(amountDue);
		}

		if (dateReceived == Long.MIN_VALUE) {
			explosiveReviewAndVerificationImpl.setDateReceived(null);
		}
		else {
			explosiveReviewAndVerificationImpl.setDateReceived(
				new Date(dateReceived));
		}

		if (amountreceived == null) {
			explosiveReviewAndVerificationImpl.setAmountreceived("");
		}
		else {
			explosiveReviewAndVerificationImpl.setAmountreceived(
				amountreceived);
		}

		if (receivedNumber == null) {
			explosiveReviewAndVerificationImpl.setReceivedNumber("");
		}
		else {
			explosiveReviewAndVerificationImpl.setReceivedNumber(
				receivedNumber);
		}

		if (comments == null) {
			explosiveReviewAndVerificationImpl.setComments("");
		}
		else {
			explosiveReviewAndVerificationImpl.setComments(comments);
		}

		if (amountOutstanding == null) {
			explosiveReviewAndVerificationImpl.setAmountOutstanding("");
		}
		else {
			explosiveReviewAndVerificationImpl.setAmountOutstanding(
				amountOutstanding);
		}

		if (dueDate == Long.MIN_VALUE) {
			explosiveReviewAndVerificationImpl.setDueDate(null);
		}
		else {
			explosiveReviewAndVerificationImpl.setDueDate(new Date(dueDate));
		}

		if (status == null) {
			explosiveReviewAndVerificationImpl.setStatus("");
		}
		else {
			explosiveReviewAndVerificationImpl.setStatus(status);
		}

		explosiveReviewAndVerificationImpl.setPaymentreceiptFileEntryId(
			paymentreceiptFileEntryId);

		explosiveReviewAndVerificationImpl.resetOriginalValues();

		return explosiveReviewAndVerificationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		issuanceId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		amountDue = objectInput.readUTF();
		dateReceived = objectInput.readLong();
		amountreceived = objectInput.readUTF();
		receivedNumber = objectInput.readUTF();
		comments = objectInput.readUTF();
		amountOutstanding = objectInput.readUTF();
		dueDate = objectInput.readLong();
		status = objectInput.readUTF();

		paymentreceiptFileEntryId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(issuanceId);

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

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		if (amountDue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(amountDue);
		}

		objectOutput.writeLong(dateReceived);

		if (amountreceived == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(amountreceived);
		}

		if (receivedNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(receivedNumber);
		}

		if (comments == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(comments);
		}

		if (amountOutstanding == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(amountOutstanding);
		}

		objectOutput.writeLong(dueDate);

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}

		objectOutput.writeLong(paymentreceiptFileEntryId);
	}

	public String uuid;
	public long issuanceId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public String amountDue;
	public long dateReceived;
	public String amountreceived;
	public String receivedNumber;
	public String comments;
	public String amountOutstanding;
	public long dueDate;
	public String status;
	public long paymentreceiptFileEntryId;

}