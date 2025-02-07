/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.cannabis.application.form.services.model.CannabisApplicationPayment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CannabisApplicationPayment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CannabisApplicationPaymentCacheModel
	implements CacheModel<CannabisApplicationPayment>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CannabisApplicationPaymentCacheModel)) {
			return false;
		}

		CannabisApplicationPaymentCacheModel
			cannabisApplicationPaymentCacheModel =
				(CannabisApplicationPaymentCacheModel)object;

		if (cannabisApplicationPaymentId ==
				cannabisApplicationPaymentCacheModel.
					cannabisApplicationPaymentId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cannabisApplicationPaymentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{cannabisApplicationPaymentId=");
		sb.append(cannabisApplicationPaymentId);
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
		sb.append(", paymentMethod=");
		sb.append(paymentMethod);
		sb.append(", paymentDocId=");
		sb.append(paymentDocId);
		sb.append(", paymentStatus=");
		sb.append(paymentStatus);
		sb.append(", paymentFee=");
		sb.append(paymentFee);
		sb.append(", transactionNumber=");
		sb.append(transactionNumber);
		sb.append(", cannabisApplicationId=");
		sb.append(cannabisApplicationId);
		sb.append(", paymentReceiptNumber=");
		sb.append(paymentReceiptNumber);
		sb.append(", paymentReceiptDocId=");
		sb.append(paymentReceiptDocId);
		sb.append(", amountPaid=");
		sb.append(amountPaid);
		sb.append(", amountCurrency=");
		sb.append(amountCurrency);
		sb.append(", dateReceived=");
		sb.append(dateReceived);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CannabisApplicationPayment toEntityModel() {
		CannabisApplicationPaymentImpl cannabisApplicationPaymentImpl =
			new CannabisApplicationPaymentImpl();

		cannabisApplicationPaymentImpl.setCannabisApplicationPaymentId(
			cannabisApplicationPaymentId);
		cannabisApplicationPaymentImpl.setGroupId(groupId);
		cannabisApplicationPaymentImpl.setCompanyId(companyId);
		cannabisApplicationPaymentImpl.setUserId(userId);

		if (userName == null) {
			cannabisApplicationPaymentImpl.setUserName("");
		}
		else {
			cannabisApplicationPaymentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			cannabisApplicationPaymentImpl.setCreateDate(null);
		}
		else {
			cannabisApplicationPaymentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cannabisApplicationPaymentImpl.setModifiedDate(null);
		}
		else {
			cannabisApplicationPaymentImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (paymentMethod == null) {
			cannabisApplicationPaymentImpl.setPaymentMethod("");
		}
		else {
			cannabisApplicationPaymentImpl.setPaymentMethod(paymentMethod);
		}

		if (paymentDocId == null) {
			cannabisApplicationPaymentImpl.setPaymentDocId("");
		}
		else {
			cannabisApplicationPaymentImpl.setPaymentDocId(paymentDocId);
		}

		if (paymentStatus == null) {
			cannabisApplicationPaymentImpl.setPaymentStatus("");
		}
		else {
			cannabisApplicationPaymentImpl.setPaymentStatus(paymentStatus);
		}

		if (paymentFee == null) {
			cannabisApplicationPaymentImpl.setPaymentFee("");
		}
		else {
			cannabisApplicationPaymentImpl.setPaymentFee(paymentFee);
		}

		if (transactionNumber == null) {
			cannabisApplicationPaymentImpl.setTransactionNumber("");
		}
		else {
			cannabisApplicationPaymentImpl.setTransactionNumber(
				transactionNumber);
		}

		cannabisApplicationPaymentImpl.setCannabisApplicationId(
			cannabisApplicationId);

		if (paymentReceiptNumber == null) {
			cannabisApplicationPaymentImpl.setPaymentReceiptNumber("");
		}
		else {
			cannabisApplicationPaymentImpl.setPaymentReceiptNumber(
				paymentReceiptNumber);
		}

		cannabisApplicationPaymentImpl.setPaymentReceiptDocId(
			paymentReceiptDocId);

		if (amountPaid == null) {
			cannabisApplicationPaymentImpl.setAmountPaid("");
		}
		else {
			cannabisApplicationPaymentImpl.setAmountPaid(amountPaid);
		}

		if (amountCurrency == null) {
			cannabisApplicationPaymentImpl.setAmountCurrency("");
		}
		else {
			cannabisApplicationPaymentImpl.setAmountCurrency(amountCurrency);
		}

		if (dateReceived == Long.MIN_VALUE) {
			cannabisApplicationPaymentImpl.setDateReceived(null);
		}
		else {
			cannabisApplicationPaymentImpl.setDateReceived(
				new Date(dateReceived));
		}

		cannabisApplicationPaymentImpl.resetOriginalValues();

		return cannabisApplicationPaymentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cannabisApplicationPaymentId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		paymentMethod = objectInput.readUTF();
		paymentDocId = objectInput.readUTF();
		paymentStatus = objectInput.readUTF();
		paymentFee = objectInput.readUTF();
		transactionNumber = objectInput.readUTF();

		cannabisApplicationId = objectInput.readLong();
		paymentReceiptNumber = objectInput.readUTF();

		paymentReceiptDocId = objectInput.readLong();
		amountPaid = objectInput.readUTF();
		amountCurrency = objectInput.readUTF();
		dateReceived = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(cannabisApplicationPaymentId);

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

		if (paymentMethod == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(paymentMethod);
		}

		if (paymentDocId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(paymentDocId);
		}

		if (paymentStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(paymentStatus);
		}

		if (paymentFee == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(paymentFee);
		}

		if (transactionNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(transactionNumber);
		}

		objectOutput.writeLong(cannabisApplicationId);

		if (paymentReceiptNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(paymentReceiptNumber);
		}

		objectOutput.writeLong(paymentReceiptDocId);

		if (amountPaid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(amountPaid);
		}

		if (amountCurrency == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(amountCurrency);
		}

		objectOutput.writeLong(dateReceived);
	}

	public long cannabisApplicationPaymentId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String paymentMethod;
	public String paymentDocId;
	public String paymentStatus;
	public String paymentFee;
	public String transactionNumber;
	public long cannabisApplicationId;
	public String paymentReceiptNumber;
	public long paymentReceiptDocId;
	public String amountPaid;
	public String amountCurrency;
	public long dateReceived;

}