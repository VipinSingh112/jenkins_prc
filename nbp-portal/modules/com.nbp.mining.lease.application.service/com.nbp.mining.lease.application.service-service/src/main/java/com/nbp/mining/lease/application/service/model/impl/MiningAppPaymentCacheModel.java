/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.mining.lease.application.service.model.MiningAppPayment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MiningAppPayment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MiningAppPaymentCacheModel
	implements CacheModel<MiningAppPayment>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MiningAppPaymentCacheModel)) {
			return false;
		}

		MiningAppPaymentCacheModel miningAppPaymentCacheModel =
			(MiningAppPaymentCacheModel)object;

		if (miningAppPaymentId ==
				miningAppPaymentCacheModel.miningAppPaymentId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, miningAppPaymentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{miningAppPaymentId=");
		sb.append(miningAppPaymentId);
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
		sb.append(", miningLeaseApplicationId=");
		sb.append(miningLeaseApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MiningAppPayment toEntityModel() {
		MiningAppPaymentImpl miningAppPaymentImpl = new MiningAppPaymentImpl();

		miningAppPaymentImpl.setMiningAppPaymentId(miningAppPaymentId);
		miningAppPaymentImpl.setGroupId(groupId);
		miningAppPaymentImpl.setCompanyId(companyId);
		miningAppPaymentImpl.setUserId(userId);

		if (userName == null) {
			miningAppPaymentImpl.setUserName("");
		}
		else {
			miningAppPaymentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			miningAppPaymentImpl.setCreateDate(null);
		}
		else {
			miningAppPaymentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			miningAppPaymentImpl.setModifiedDate(null);
		}
		else {
			miningAppPaymentImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (paymentMethod == null) {
			miningAppPaymentImpl.setPaymentMethod("");
		}
		else {
			miningAppPaymentImpl.setPaymentMethod(paymentMethod);
		}

		if (paymentDocId == null) {
			miningAppPaymentImpl.setPaymentDocId("");
		}
		else {
			miningAppPaymentImpl.setPaymentDocId(paymentDocId);
		}

		if (paymentStatus == null) {
			miningAppPaymentImpl.setPaymentStatus("");
		}
		else {
			miningAppPaymentImpl.setPaymentStatus(paymentStatus);
		}

		if (paymentFee == null) {
			miningAppPaymentImpl.setPaymentFee("");
		}
		else {
			miningAppPaymentImpl.setPaymentFee(paymentFee);
		}

		if (amountPaid == null) {
			miningAppPaymentImpl.setAmountPaid("");
		}
		else {
			miningAppPaymentImpl.setAmountPaid(amountPaid);
		}

		if (amountCurrency == null) {
			miningAppPaymentImpl.setAmountCurrency("");
		}
		else {
			miningAppPaymentImpl.setAmountCurrency(amountCurrency);
		}

		if (transactionNumber == null) {
			miningAppPaymentImpl.setTransactionNumber("");
		}
		else {
			miningAppPaymentImpl.setTransactionNumber(transactionNumber);
		}

		miningAppPaymentImpl.setMiningLeaseApplicationId(
			miningLeaseApplicationId);

		miningAppPaymentImpl.resetOriginalValues();

		return miningAppPaymentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		miningAppPaymentId = objectInput.readLong();

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

		miningLeaseApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(miningAppPaymentId);

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

		objectOutput.writeLong(miningLeaseApplicationId);
	}

	public long miningAppPaymentId;
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
	public long miningLeaseApplicationId;

}