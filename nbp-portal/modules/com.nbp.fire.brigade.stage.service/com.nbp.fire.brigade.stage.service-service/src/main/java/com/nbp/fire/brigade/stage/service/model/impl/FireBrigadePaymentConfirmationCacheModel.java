/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.fire.brigade.stage.service.model.FireBrigadePaymentConfirmation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FireBrigadePaymentConfirmation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FireBrigadePaymentConfirmationCacheModel
	implements CacheModel<FireBrigadePaymentConfirmation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FireBrigadePaymentConfirmationCacheModel)) {
			return false;
		}

		FireBrigadePaymentConfirmationCacheModel
			fireBrigadePaymentConfirmationCacheModel =
				(FireBrigadePaymentConfirmationCacheModel)object;

		if (fireBrigadePaymentConfirId ==
				fireBrigadePaymentConfirmationCacheModel.
					fireBrigadePaymentConfirId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fireBrigadePaymentConfirId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{fireBrigadePaymentConfirId=");
		sb.append(fireBrigadePaymentConfirId);
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
		sb.append(", dateReceived=");
		sb.append(dateReceived);
		sb.append(", amountDue=");
		sb.append(amountDue);
		sb.append(", amountReceived=");
		sb.append(amountReceived);
		sb.append(", receiptNumber=");
		sb.append(receiptNumber);
		sb.append(", comment=");
		sb.append(comment);
		sb.append(", amountOutstanding=");
		sb.append(amountOutstanding);
		sb.append(", dueDate=");
		sb.append(dueDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", docFileEntry=");
		sb.append(docFileEntry);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FireBrigadePaymentConfirmation toEntityModel() {
		FireBrigadePaymentConfirmationImpl fireBrigadePaymentConfirmationImpl =
			new FireBrigadePaymentConfirmationImpl();

		fireBrigadePaymentConfirmationImpl.setFireBrigadePaymentConfirId(
			fireBrigadePaymentConfirId);
		fireBrigadePaymentConfirmationImpl.setGroupId(groupId);
		fireBrigadePaymentConfirmationImpl.setCompanyId(companyId);
		fireBrigadePaymentConfirmationImpl.setUserId(userId);

		if (userName == null) {
			fireBrigadePaymentConfirmationImpl.setUserName("");
		}
		else {
			fireBrigadePaymentConfirmationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			fireBrigadePaymentConfirmationImpl.setCreateDate(null);
		}
		else {
			fireBrigadePaymentConfirmationImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			fireBrigadePaymentConfirmationImpl.setModifiedDate(null);
		}
		else {
			fireBrigadePaymentConfirmationImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (caseId == null) {
			fireBrigadePaymentConfirmationImpl.setCaseId("");
		}
		else {
			fireBrigadePaymentConfirmationImpl.setCaseId(caseId);
		}

		if (dateReceived == Long.MIN_VALUE) {
			fireBrigadePaymentConfirmationImpl.setDateReceived(null);
		}
		else {
			fireBrigadePaymentConfirmationImpl.setDateReceived(
				new Date(dateReceived));
		}

		if (amountDue == null) {
			fireBrigadePaymentConfirmationImpl.setAmountDue("");
		}
		else {
			fireBrigadePaymentConfirmationImpl.setAmountDue(amountDue);
		}

		if (amountReceived == null) {
			fireBrigadePaymentConfirmationImpl.setAmountReceived("");
		}
		else {
			fireBrigadePaymentConfirmationImpl.setAmountReceived(
				amountReceived);
		}

		if (receiptNumber == null) {
			fireBrigadePaymentConfirmationImpl.setReceiptNumber("");
		}
		else {
			fireBrigadePaymentConfirmationImpl.setReceiptNumber(receiptNumber);
		}

		if (comment == null) {
			fireBrigadePaymentConfirmationImpl.setComment("");
		}
		else {
			fireBrigadePaymentConfirmationImpl.setComment(comment);
		}

		if (amountOutstanding == null) {
			fireBrigadePaymentConfirmationImpl.setAmountOutstanding("");
		}
		else {
			fireBrigadePaymentConfirmationImpl.setAmountOutstanding(
				amountOutstanding);
		}

		if (dueDate == Long.MIN_VALUE) {
			fireBrigadePaymentConfirmationImpl.setDueDate(null);
		}
		else {
			fireBrigadePaymentConfirmationImpl.setDueDate(new Date(dueDate));
		}

		if (status == null) {
			fireBrigadePaymentConfirmationImpl.setStatus("");
		}
		else {
			fireBrigadePaymentConfirmationImpl.setStatus(status);
		}

		fireBrigadePaymentConfirmationImpl.setDocFileEntry(docFileEntry);

		fireBrigadePaymentConfirmationImpl.resetOriginalValues();

		return fireBrigadePaymentConfirmationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fireBrigadePaymentConfirId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		dateReceived = objectInput.readLong();
		amountDue = objectInput.readUTF();
		amountReceived = objectInput.readUTF();
		receiptNumber = objectInput.readUTF();
		comment = objectInput.readUTF();
		amountOutstanding = objectInput.readUTF();
		dueDate = objectInput.readLong();
		status = objectInput.readUTF();

		docFileEntry = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(fireBrigadePaymentConfirId);

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

		objectOutput.writeLong(dateReceived);

		if (amountDue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(amountDue);
		}

		if (amountReceived == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(amountReceived);
		}

		if (receiptNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(receiptNumber);
		}

		if (comment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(comment);
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

		objectOutput.writeLong(docFileEntry);
	}

	public long fireBrigadePaymentConfirId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public long dateReceived;
	public String amountDue;
	public String amountReceived;
	public String receiptNumber;
	public String comment;
	public String amountOutstanding;
	public long dueDate;
	public String status;
	public long docFileEntry;

}