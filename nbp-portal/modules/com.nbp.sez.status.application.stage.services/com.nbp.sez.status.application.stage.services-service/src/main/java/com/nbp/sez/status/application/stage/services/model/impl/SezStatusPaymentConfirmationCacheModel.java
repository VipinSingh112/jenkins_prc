/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.stage.services.model.SezStatusPaymentConfirmation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezStatusPaymentConfirmation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezStatusPaymentConfirmationCacheModel
	implements CacheModel<SezStatusPaymentConfirmation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezStatusPaymentConfirmationCacheModel)) {
			return false;
		}

		SezStatusPaymentConfirmationCacheModel
			sezStatusPaymentConfirmationCacheModel =
				(SezStatusPaymentConfirmationCacheModel)object;

		if (sezPaymentId ==
				sezStatusPaymentConfirmationCacheModel.sezPaymentId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezPaymentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{sezPaymentId=");
		sb.append(sezPaymentId);
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
	public SezStatusPaymentConfirmation toEntityModel() {
		SezStatusPaymentConfirmationImpl sezStatusPaymentConfirmationImpl =
			new SezStatusPaymentConfirmationImpl();

		sezStatusPaymentConfirmationImpl.setSezPaymentId(sezPaymentId);
		sezStatusPaymentConfirmationImpl.setGroupId(groupId);
		sezStatusPaymentConfirmationImpl.setCompanyId(companyId);
		sezStatusPaymentConfirmationImpl.setUserId(userId);

		if (userName == null) {
			sezStatusPaymentConfirmationImpl.setUserName("");
		}
		else {
			sezStatusPaymentConfirmationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezStatusPaymentConfirmationImpl.setCreateDate(null);
		}
		else {
			sezStatusPaymentConfirmationImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezStatusPaymentConfirmationImpl.setModifiedDate(null);
		}
		else {
			sezStatusPaymentConfirmationImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (caseId == null) {
			sezStatusPaymentConfirmationImpl.setCaseId("");
		}
		else {
			sezStatusPaymentConfirmationImpl.setCaseId(caseId);
		}

		if (amountDue == null) {
			sezStatusPaymentConfirmationImpl.setAmountDue("");
		}
		else {
			sezStatusPaymentConfirmationImpl.setAmountDue(amountDue);
		}

		if (dateReceived == Long.MIN_VALUE) {
			sezStatusPaymentConfirmationImpl.setDateReceived(null);
		}
		else {
			sezStatusPaymentConfirmationImpl.setDateReceived(
				new Date(dateReceived));
		}

		if (amountreceived == null) {
			sezStatusPaymentConfirmationImpl.setAmountreceived("");
		}
		else {
			sezStatusPaymentConfirmationImpl.setAmountreceived(amountreceived);
		}

		if (receivedNumber == null) {
			sezStatusPaymentConfirmationImpl.setReceivedNumber("");
		}
		else {
			sezStatusPaymentConfirmationImpl.setReceivedNumber(receivedNumber);
		}

		if (comments == null) {
			sezStatusPaymentConfirmationImpl.setComments("");
		}
		else {
			sezStatusPaymentConfirmationImpl.setComments(comments);
		}

		if (amountOutstanding == null) {
			sezStatusPaymentConfirmationImpl.setAmountOutstanding("");
		}
		else {
			sezStatusPaymentConfirmationImpl.setAmountOutstanding(
				amountOutstanding);
		}

		if (dueDate == Long.MIN_VALUE) {
			sezStatusPaymentConfirmationImpl.setDueDate(null);
		}
		else {
			sezStatusPaymentConfirmationImpl.setDueDate(new Date(dueDate));
		}

		if (status == null) {
			sezStatusPaymentConfirmationImpl.setStatus("");
		}
		else {
			sezStatusPaymentConfirmationImpl.setStatus(status);
		}

		sezStatusPaymentConfirmationImpl.setPaymentreceiptFileEntryId(
			paymentreceiptFileEntryId);

		sezStatusPaymentConfirmationImpl.resetOriginalValues();

		return sezStatusPaymentConfirmationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezPaymentId = objectInput.readLong();

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
		objectOutput.writeLong(sezPaymentId);

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

	public long sezPaymentId;
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