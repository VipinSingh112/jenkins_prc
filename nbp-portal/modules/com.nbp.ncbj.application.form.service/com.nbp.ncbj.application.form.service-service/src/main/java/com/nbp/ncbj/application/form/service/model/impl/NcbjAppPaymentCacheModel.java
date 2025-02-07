/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncbj.application.form.service.model.NcbjAppPayment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcbjAppPayment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcbjAppPaymentCacheModel
	implements CacheModel<NcbjAppPayment>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcbjAppPaymentCacheModel)) {
			return false;
		}

		NcbjAppPaymentCacheModel ncbjAppPaymentCacheModel =
			(NcbjAppPaymentCacheModel)object;

		if (ncbjAppPaymentId == ncbjAppPaymentCacheModel.ncbjAppPaymentId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncbjAppPaymentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{ncbjAppPaymentId=");
		sb.append(ncbjAppPaymentId);
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
		sb.append(", ncbjApplicationId=");
		sb.append(ncbjApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcbjAppPayment toEntityModel() {
		NcbjAppPaymentImpl ncbjAppPaymentImpl = new NcbjAppPaymentImpl();

		ncbjAppPaymentImpl.setNcbjAppPaymentId(ncbjAppPaymentId);
		ncbjAppPaymentImpl.setGroupId(groupId);
		ncbjAppPaymentImpl.setCompanyId(companyId);
		ncbjAppPaymentImpl.setUserId(userId);

		if (userName == null) {
			ncbjAppPaymentImpl.setUserName("");
		}
		else {
			ncbjAppPaymentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncbjAppPaymentImpl.setCreateDate(null);
		}
		else {
			ncbjAppPaymentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncbjAppPaymentImpl.setModifiedDate(null);
		}
		else {
			ncbjAppPaymentImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (paymentMethod == null) {
			ncbjAppPaymentImpl.setPaymentMethod("");
		}
		else {
			ncbjAppPaymentImpl.setPaymentMethod(paymentMethod);
		}

		if (paymentDocId == null) {
			ncbjAppPaymentImpl.setPaymentDocId("");
		}
		else {
			ncbjAppPaymentImpl.setPaymentDocId(paymentDocId);
		}

		if (paymentStatus == null) {
			ncbjAppPaymentImpl.setPaymentStatus("");
		}
		else {
			ncbjAppPaymentImpl.setPaymentStatus(paymentStatus);
		}

		if (paymentFee == null) {
			ncbjAppPaymentImpl.setPaymentFee("");
		}
		else {
			ncbjAppPaymentImpl.setPaymentFee(paymentFee);
		}

		if (amountPaid == null) {
			ncbjAppPaymentImpl.setAmountPaid("");
		}
		else {
			ncbjAppPaymentImpl.setAmountPaid(amountPaid);
		}

		if (amountCurrency == null) {
			ncbjAppPaymentImpl.setAmountCurrency("");
		}
		else {
			ncbjAppPaymentImpl.setAmountCurrency(amountCurrency);
		}

		if (transactionNumber == null) {
			ncbjAppPaymentImpl.setTransactionNumber("");
		}
		else {
			ncbjAppPaymentImpl.setTransactionNumber(transactionNumber);
		}

		ncbjAppPaymentImpl.setNcbjApplicationId(ncbjApplicationId);

		ncbjAppPaymentImpl.resetOriginalValues();

		return ncbjAppPaymentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncbjAppPaymentId = objectInput.readLong();

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

		ncbjApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ncbjAppPaymentId);

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

		objectOutput.writeLong(ncbjApplicationId);
	}

	public long ncbjAppPaymentId;
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
	public long ncbjApplicationId;

}