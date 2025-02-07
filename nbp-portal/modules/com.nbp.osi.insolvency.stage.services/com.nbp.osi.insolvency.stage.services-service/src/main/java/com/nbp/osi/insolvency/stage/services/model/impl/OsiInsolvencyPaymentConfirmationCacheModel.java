/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.stage.services.model.OsiInsolvencyPaymentConfirmation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiInsolvencyPaymentConfirmation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiInsolvencyPaymentConfirmationCacheModel
	implements CacheModel<OsiInsolvencyPaymentConfirmation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OsiInsolvencyPaymentConfirmationCacheModel)) {
			return false;
		}

		OsiInsolvencyPaymentConfirmationCacheModel
			osiInsolvencyPaymentConfirmationCacheModel =
				(OsiInsolvencyPaymentConfirmationCacheModel)object;

		if (osiIRPaymentId ==
				osiInsolvencyPaymentConfirmationCacheModel.osiIRPaymentId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiIRPaymentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{osiIRPaymentId=");
		sb.append(osiIRPaymentId);
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
	public OsiInsolvencyPaymentConfirmation toEntityModel() {
		OsiInsolvencyPaymentConfirmationImpl
			osiInsolvencyPaymentConfirmationImpl =
				new OsiInsolvencyPaymentConfirmationImpl();

		osiInsolvencyPaymentConfirmationImpl.setOsiIRPaymentId(osiIRPaymentId);
		osiInsolvencyPaymentConfirmationImpl.setGroupId(groupId);
		osiInsolvencyPaymentConfirmationImpl.setCompanyId(companyId);
		osiInsolvencyPaymentConfirmationImpl.setUserId(userId);

		if (userName == null) {
			osiInsolvencyPaymentConfirmationImpl.setUserName("");
		}
		else {
			osiInsolvencyPaymentConfirmationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiInsolvencyPaymentConfirmationImpl.setCreateDate(null);
		}
		else {
			osiInsolvencyPaymentConfirmationImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiInsolvencyPaymentConfirmationImpl.setModifiedDate(null);
		}
		else {
			osiInsolvencyPaymentConfirmationImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (caseId == null) {
			osiInsolvencyPaymentConfirmationImpl.setCaseId("");
		}
		else {
			osiInsolvencyPaymentConfirmationImpl.setCaseId(caseId);
		}

		if (dateReceived == Long.MIN_VALUE) {
			osiInsolvencyPaymentConfirmationImpl.setDateReceived(null);
		}
		else {
			osiInsolvencyPaymentConfirmationImpl.setDateReceived(
				new Date(dateReceived));
		}

		if (amountReceived == null) {
			osiInsolvencyPaymentConfirmationImpl.setAmountReceived("");
		}
		else {
			osiInsolvencyPaymentConfirmationImpl.setAmountReceived(
				amountReceived);
		}

		if (amountDue == null) {
			osiInsolvencyPaymentConfirmationImpl.setAmountDue("");
		}
		else {
			osiInsolvencyPaymentConfirmationImpl.setAmountDue(amountDue);
		}

		if (receiptNumber == null) {
			osiInsolvencyPaymentConfirmationImpl.setReceiptNumber("");
		}
		else {
			osiInsolvencyPaymentConfirmationImpl.setReceiptNumber(
				receiptNumber);
		}

		if (comment == null) {
			osiInsolvencyPaymentConfirmationImpl.setComment("");
		}
		else {
			osiInsolvencyPaymentConfirmationImpl.setComment(comment);
		}

		if (amountOutstanding == null) {
			osiInsolvencyPaymentConfirmationImpl.setAmountOutstanding("");
		}
		else {
			osiInsolvencyPaymentConfirmationImpl.setAmountOutstanding(
				amountOutstanding);
		}

		if (dueDate == Long.MIN_VALUE) {
			osiInsolvencyPaymentConfirmationImpl.setDueDate(null);
		}
		else {
			osiInsolvencyPaymentConfirmationImpl.setDueDate(new Date(dueDate));
		}

		if (status == null) {
			osiInsolvencyPaymentConfirmationImpl.setStatus("");
		}
		else {
			osiInsolvencyPaymentConfirmationImpl.setStatus(status);
		}

		osiInsolvencyPaymentConfirmationImpl.setDocFileEntry(docFileEntry);

		osiInsolvencyPaymentConfirmationImpl.resetOriginalValues();

		return osiInsolvencyPaymentConfirmationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		osiIRPaymentId = objectInput.readLong();

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
		objectOutput.writeLong(osiIRPaymentId);

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

	public long osiIRPaymentId;
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