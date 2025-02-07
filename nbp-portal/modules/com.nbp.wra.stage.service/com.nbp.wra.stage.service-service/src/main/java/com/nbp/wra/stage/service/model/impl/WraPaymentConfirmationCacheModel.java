/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.wra.stage.service.model.WraPaymentConfirmation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing WraPaymentConfirmation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class WraPaymentConfirmationCacheModel
	implements CacheModel<WraPaymentConfirmation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof WraPaymentConfirmationCacheModel)) {
			return false;
		}

		WraPaymentConfirmationCacheModel wraPaymentConfirmationCacheModel =
			(WraPaymentConfirmationCacheModel)object;

		if (wraPaymentConfirmationId ==
				wraPaymentConfirmationCacheModel.wraPaymentConfirmationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, wraPaymentConfirmationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{wraPaymentConfirmationId=");
		sb.append(wraPaymentConfirmationId);
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
		sb.append(", amountReceived=");
		sb.append(amountReceived);
		sb.append(", amountDue=");
		sb.append(amountDue);
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
	public WraPaymentConfirmation toEntityModel() {
		WraPaymentConfirmationImpl wraPaymentConfirmationImpl =
			new WraPaymentConfirmationImpl();

		wraPaymentConfirmationImpl.setWraPaymentConfirmationId(
			wraPaymentConfirmationId);
		wraPaymentConfirmationImpl.setGroupId(groupId);
		wraPaymentConfirmationImpl.setCompanyId(companyId);
		wraPaymentConfirmationImpl.setUserId(userId);

		if (userName == null) {
			wraPaymentConfirmationImpl.setUserName("");
		}
		else {
			wraPaymentConfirmationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			wraPaymentConfirmationImpl.setCreateDate(null);
		}
		else {
			wraPaymentConfirmationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			wraPaymentConfirmationImpl.setModifiedDate(null);
		}
		else {
			wraPaymentConfirmationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			wraPaymentConfirmationImpl.setCaseId("");
		}
		else {
			wraPaymentConfirmationImpl.setCaseId(caseId);
		}

		if (dateReceived == Long.MIN_VALUE) {
			wraPaymentConfirmationImpl.setDateReceived(null);
		}
		else {
			wraPaymentConfirmationImpl.setDateReceived(new Date(dateReceived));
		}

		if (amountReceived == null) {
			wraPaymentConfirmationImpl.setAmountReceived("");
		}
		else {
			wraPaymentConfirmationImpl.setAmountReceived(amountReceived);
		}

		if (amountDue == null) {
			wraPaymentConfirmationImpl.setAmountDue("");
		}
		else {
			wraPaymentConfirmationImpl.setAmountDue(amountDue);
		}

		if (receiptNumber == null) {
			wraPaymentConfirmationImpl.setReceiptNumber("");
		}
		else {
			wraPaymentConfirmationImpl.setReceiptNumber(receiptNumber);
		}

		if (comment == null) {
			wraPaymentConfirmationImpl.setComment("");
		}
		else {
			wraPaymentConfirmationImpl.setComment(comment);
		}

		if (amountOutstanding == null) {
			wraPaymentConfirmationImpl.setAmountOutstanding("");
		}
		else {
			wraPaymentConfirmationImpl.setAmountOutstanding(amountOutstanding);
		}

		if (dueDate == Long.MIN_VALUE) {
			wraPaymentConfirmationImpl.setDueDate(null);
		}
		else {
			wraPaymentConfirmationImpl.setDueDate(new Date(dueDate));
		}

		if (status == null) {
			wraPaymentConfirmationImpl.setStatus("");
		}
		else {
			wraPaymentConfirmationImpl.setStatus(status);
		}

		wraPaymentConfirmationImpl.setDocFileEntry(docFileEntry);

		wraPaymentConfirmationImpl.resetOriginalValues();

		return wraPaymentConfirmationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		wraPaymentConfirmationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		dateReceived = objectInput.readLong();
		amountReceived = objectInput.readUTF();
		amountDue = objectInput.readUTF();
		receiptNumber = objectInput.readUTF();
		comment = objectInput.readUTF();
		amountOutstanding = objectInput.readUTF();
		dueDate = objectInput.readLong();
		status = objectInput.readUTF();

		docFileEntry = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(wraPaymentConfirmationId);

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

		if (amountReceived == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(amountReceived);
		}

		if (amountDue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(amountDue);
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

	public long wraPaymentConfirmationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public long dateReceived;
	public String amountReceived;
	public String amountDue;
	public String receiptNumber;
	public String comment;
	public String amountOutstanding;
	public long dueDate;
	public String status;
	public long docFileEntry;

}