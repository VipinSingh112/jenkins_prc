/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.stage.services.model.JtbPaymentConfirmation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JtbPaymentConfirmation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JtbPaymentConfirmationCacheModel
	implements CacheModel<JtbPaymentConfirmation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JtbPaymentConfirmationCacheModel)) {
			return false;
		}

		JtbPaymentConfirmationCacheModel jtbPaymentConfirmationCacheModel =
			(JtbPaymentConfirmationCacheModel)object;

		if (jtbPaymentConfirmationId ==
				jtbPaymentConfirmationCacheModel.jtbPaymentConfirmationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jtbPaymentConfirmationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{jtbPaymentConfirmationId=");
		sb.append(jtbPaymentConfirmationId);
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
	public JtbPaymentConfirmation toEntityModel() {
		JtbPaymentConfirmationImpl jtbPaymentConfirmationImpl =
			new JtbPaymentConfirmationImpl();

		jtbPaymentConfirmationImpl.setJtbPaymentConfirmationId(
			jtbPaymentConfirmationId);
		jtbPaymentConfirmationImpl.setGroupId(groupId);
		jtbPaymentConfirmationImpl.setCompanyId(companyId);
		jtbPaymentConfirmationImpl.setUserId(userId);

		if (userName == null) {
			jtbPaymentConfirmationImpl.setUserName("");
		}
		else {
			jtbPaymentConfirmationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jtbPaymentConfirmationImpl.setCreateDate(null);
		}
		else {
			jtbPaymentConfirmationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jtbPaymentConfirmationImpl.setModifiedDate(null);
		}
		else {
			jtbPaymentConfirmationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			jtbPaymentConfirmationImpl.setCaseId("");
		}
		else {
			jtbPaymentConfirmationImpl.setCaseId(caseId);
		}

		if (dateReceived == Long.MIN_VALUE) {
			jtbPaymentConfirmationImpl.setDateReceived(null);
		}
		else {
			jtbPaymentConfirmationImpl.setDateReceived(new Date(dateReceived));
		}

		if (amountReceived == null) {
			jtbPaymentConfirmationImpl.setAmountReceived("");
		}
		else {
			jtbPaymentConfirmationImpl.setAmountReceived(amountReceived);
		}

		if (amountDue == null) {
			jtbPaymentConfirmationImpl.setAmountDue("");
		}
		else {
			jtbPaymentConfirmationImpl.setAmountDue(amountDue);
		}

		if (receiptNumber == null) {
			jtbPaymentConfirmationImpl.setReceiptNumber("");
		}
		else {
			jtbPaymentConfirmationImpl.setReceiptNumber(receiptNumber);
		}

		if (comment == null) {
			jtbPaymentConfirmationImpl.setComment("");
		}
		else {
			jtbPaymentConfirmationImpl.setComment(comment);
		}

		if (amountOutstanding == null) {
			jtbPaymentConfirmationImpl.setAmountOutstanding("");
		}
		else {
			jtbPaymentConfirmationImpl.setAmountOutstanding(amountOutstanding);
		}

		if (dueDate == Long.MIN_VALUE) {
			jtbPaymentConfirmationImpl.setDueDate(null);
		}
		else {
			jtbPaymentConfirmationImpl.setDueDate(new Date(dueDate));
		}

		if (status == null) {
			jtbPaymentConfirmationImpl.setStatus("");
		}
		else {
			jtbPaymentConfirmationImpl.setStatus(status);
		}

		jtbPaymentConfirmationImpl.setDocFileEntry(docFileEntry);

		jtbPaymentConfirmationImpl.resetOriginalValues();

		return jtbPaymentConfirmationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		jtbPaymentConfirmationId = objectInput.readLong();

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
		objectOutput.writeLong(jtbPaymentConfirmationId);

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

	public long jtbPaymentConfirmationId;
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