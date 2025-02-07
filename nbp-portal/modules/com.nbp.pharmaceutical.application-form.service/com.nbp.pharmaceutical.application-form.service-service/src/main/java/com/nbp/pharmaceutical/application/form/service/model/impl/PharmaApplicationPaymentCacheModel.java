/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.pharmaceutical.application.form.service.model.PharmaApplicationPayment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PharmaApplicationPayment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PharmaApplicationPaymentCacheModel
	implements CacheModel<PharmaApplicationPayment>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PharmaApplicationPaymentCacheModel)) {
			return false;
		}

		PharmaApplicationPaymentCacheModel pharmaApplicationPaymentCacheModel =
			(PharmaApplicationPaymentCacheModel)object;

		if (pharmaApplicationPaymentId ==
				pharmaApplicationPaymentCacheModel.pharmaApplicationPaymentId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, pharmaApplicationPaymentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{pharmaApplicationPaymentId=");
		sb.append(pharmaApplicationPaymentId);
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
		sb.append(", amountPaid=");
		sb.append(amountPaid);
		sb.append(", amountCurrency=");
		sb.append(amountCurrency);
		sb.append(", transactionNumber=");
		sb.append(transactionNumber);
		sb.append(", pharmaApplicationId=");
		sb.append(pharmaApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PharmaApplicationPayment toEntityModel() {
		PharmaApplicationPaymentImpl pharmaApplicationPaymentImpl =
			new PharmaApplicationPaymentImpl();

		pharmaApplicationPaymentImpl.setPharmaApplicationPaymentId(
			pharmaApplicationPaymentId);
		pharmaApplicationPaymentImpl.setGroupId(groupId);
		pharmaApplicationPaymentImpl.setCompanyId(companyId);
		pharmaApplicationPaymentImpl.setUserId(userId);

		if (userName == null) {
			pharmaApplicationPaymentImpl.setUserName("");
		}
		else {
			pharmaApplicationPaymentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			pharmaApplicationPaymentImpl.setCreateDate(null);
		}
		else {
			pharmaApplicationPaymentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			pharmaApplicationPaymentImpl.setModifiedDate(null);
		}
		else {
			pharmaApplicationPaymentImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (paymentMethod == null) {
			pharmaApplicationPaymentImpl.setPaymentMethod("");
		}
		else {
			pharmaApplicationPaymentImpl.setPaymentMethod(paymentMethod);
		}

		if (paymentDocId == null) {
			pharmaApplicationPaymentImpl.setPaymentDocId("");
		}
		else {
			pharmaApplicationPaymentImpl.setPaymentDocId(paymentDocId);
		}

		if (paymentStatus == null) {
			pharmaApplicationPaymentImpl.setPaymentStatus("");
		}
		else {
			pharmaApplicationPaymentImpl.setPaymentStatus(paymentStatus);
		}

		if (paymentFee == null) {
			pharmaApplicationPaymentImpl.setPaymentFee("");
		}
		else {
			pharmaApplicationPaymentImpl.setPaymentFee(paymentFee);
		}

		if (amountPaid == null) {
			pharmaApplicationPaymentImpl.setAmountPaid("");
		}
		else {
			pharmaApplicationPaymentImpl.setAmountPaid(amountPaid);
		}

		if (amountCurrency == null) {
			pharmaApplicationPaymentImpl.setAmountCurrency("");
		}
		else {
			pharmaApplicationPaymentImpl.setAmountCurrency(amountCurrency);
		}

		if (transactionNumber == null) {
			pharmaApplicationPaymentImpl.setTransactionNumber("");
		}
		else {
			pharmaApplicationPaymentImpl.setTransactionNumber(
				transactionNumber);
		}

		pharmaApplicationPaymentImpl.setPharmaApplicationId(
			pharmaApplicationId);

		pharmaApplicationPaymentImpl.resetOriginalValues();

		return pharmaApplicationPaymentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		pharmaApplicationPaymentId = objectInput.readLong();

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
		amountPaid = objectInput.readUTF();
		amountCurrency = objectInput.readUTF();
		transactionNumber = objectInput.readUTF();

		pharmaApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(pharmaApplicationPaymentId);

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

		if (transactionNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(transactionNumber);
		}

		objectOutput.writeLong(pharmaApplicationId);
	}

	public long pharmaApplicationPaymentId;
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
	public String amountPaid;
	public String amountCurrency;
	public String transactionNumber;
	public long pharmaApplicationId;

}