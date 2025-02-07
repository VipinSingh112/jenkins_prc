/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.wra.application.form.service.model.WRAAppPayment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing WRAAppPayment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class WRAAppPaymentCacheModel
	implements CacheModel<WRAAppPayment>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof WRAAppPaymentCacheModel)) {
			return false;
		}

		WRAAppPaymentCacheModel wraAppPaymentCacheModel =
			(WRAAppPaymentCacheModel)object;

		if (wraAppPaymentId == wraAppPaymentCacheModel.wraAppPaymentId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, wraAppPaymentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{wraAppPaymentId=");
		sb.append(wraAppPaymentId);
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
		sb.append(", wraApplicationId=");
		sb.append(wraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public WRAAppPayment toEntityModel() {
		WRAAppPaymentImpl wraAppPaymentImpl = new WRAAppPaymentImpl();

		wraAppPaymentImpl.setWraAppPaymentId(wraAppPaymentId);
		wraAppPaymentImpl.setGroupId(groupId);
		wraAppPaymentImpl.setCompanyId(companyId);
		wraAppPaymentImpl.setUserId(userId);

		if (userName == null) {
			wraAppPaymentImpl.setUserName("");
		}
		else {
			wraAppPaymentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			wraAppPaymentImpl.setCreateDate(null);
		}
		else {
			wraAppPaymentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			wraAppPaymentImpl.setModifiedDate(null);
		}
		else {
			wraAppPaymentImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (paymentMethod == null) {
			wraAppPaymentImpl.setPaymentMethod("");
		}
		else {
			wraAppPaymentImpl.setPaymentMethod(paymentMethod);
		}

		if (paymentDocId == null) {
			wraAppPaymentImpl.setPaymentDocId("");
		}
		else {
			wraAppPaymentImpl.setPaymentDocId(paymentDocId);
		}

		if (paymentStatus == null) {
			wraAppPaymentImpl.setPaymentStatus("");
		}
		else {
			wraAppPaymentImpl.setPaymentStatus(paymentStatus);
		}

		if (paymentFee == null) {
			wraAppPaymentImpl.setPaymentFee("");
		}
		else {
			wraAppPaymentImpl.setPaymentFee(paymentFee);
		}

		if (amountPaid == null) {
			wraAppPaymentImpl.setAmountPaid("");
		}
		else {
			wraAppPaymentImpl.setAmountPaid(amountPaid);
		}

		if (amountCurrency == null) {
			wraAppPaymentImpl.setAmountCurrency("");
		}
		else {
			wraAppPaymentImpl.setAmountCurrency(amountCurrency);
		}

		if (transactionNumber == null) {
			wraAppPaymentImpl.setTransactionNumber("");
		}
		else {
			wraAppPaymentImpl.setTransactionNumber(transactionNumber);
		}

		wraAppPaymentImpl.setWraApplicationId(wraApplicationId);

		wraAppPaymentImpl.resetOriginalValues();

		return wraAppPaymentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		wraAppPaymentId = objectInput.readLong();

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

		wraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(wraAppPaymentId);

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

		objectOutput.writeLong(wraApplicationId);
	}

	public long wraAppPaymentId;
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
	public long wraApplicationId;

}