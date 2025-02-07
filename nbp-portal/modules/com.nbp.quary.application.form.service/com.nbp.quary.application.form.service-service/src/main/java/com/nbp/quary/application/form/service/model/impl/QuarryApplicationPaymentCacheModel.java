/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.quary.application.form.service.model.QuarryApplicationPayment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QuarryApplicationPayment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class QuarryApplicationPaymentCacheModel
	implements CacheModel<QuarryApplicationPayment>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof QuarryApplicationPaymentCacheModel)) {
			return false;
		}

		QuarryApplicationPaymentCacheModel quarryApplicationPaymentCacheModel =
			(QuarryApplicationPaymentCacheModel)object;

		if (quarryApplicationPaymentId ==
				quarryApplicationPaymentCacheModel.quarryApplicationPaymentId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, quarryApplicationPaymentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{quarryApplicationPaymentId=");
		sb.append(quarryApplicationPaymentId);
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
		sb.append(", quarryApplicationId=");
		sb.append(quarryApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QuarryApplicationPayment toEntityModel() {
		QuarryApplicationPaymentImpl quarryApplicationPaymentImpl =
			new QuarryApplicationPaymentImpl();

		quarryApplicationPaymentImpl.setQuarryApplicationPaymentId(
			quarryApplicationPaymentId);
		quarryApplicationPaymentImpl.setGroupId(groupId);
		quarryApplicationPaymentImpl.setCompanyId(companyId);
		quarryApplicationPaymentImpl.setUserId(userId);

		if (userName == null) {
			quarryApplicationPaymentImpl.setUserName("");
		}
		else {
			quarryApplicationPaymentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			quarryApplicationPaymentImpl.setCreateDate(null);
		}
		else {
			quarryApplicationPaymentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			quarryApplicationPaymentImpl.setModifiedDate(null);
		}
		else {
			quarryApplicationPaymentImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (paymentMethod == null) {
			quarryApplicationPaymentImpl.setPaymentMethod("");
		}
		else {
			quarryApplicationPaymentImpl.setPaymentMethod(paymentMethod);
		}

		if (paymentDocId == null) {
			quarryApplicationPaymentImpl.setPaymentDocId("");
		}
		else {
			quarryApplicationPaymentImpl.setPaymentDocId(paymentDocId);
		}

		if (paymentStatus == null) {
			quarryApplicationPaymentImpl.setPaymentStatus("");
		}
		else {
			quarryApplicationPaymentImpl.setPaymentStatus(paymentStatus);
		}

		if (paymentFee == null) {
			quarryApplicationPaymentImpl.setPaymentFee("");
		}
		else {
			quarryApplicationPaymentImpl.setPaymentFee(paymentFee);
		}

		if (amountPaid == null) {
			quarryApplicationPaymentImpl.setAmountPaid("");
		}
		else {
			quarryApplicationPaymentImpl.setAmountPaid(amountPaid);
		}

		if (amountCurrency == null) {
			quarryApplicationPaymentImpl.setAmountCurrency("");
		}
		else {
			quarryApplicationPaymentImpl.setAmountCurrency(amountCurrency);
		}

		if (transactionNumber == null) {
			quarryApplicationPaymentImpl.setTransactionNumber("");
		}
		else {
			quarryApplicationPaymentImpl.setTransactionNumber(
				transactionNumber);
		}

		quarryApplicationPaymentImpl.setQuarryApplicationId(
			quarryApplicationId);

		quarryApplicationPaymentImpl.resetOriginalValues();

		return quarryApplicationPaymentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		quarryApplicationPaymentId = objectInput.readLong();

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

		quarryApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(quarryApplicationPaymentId);

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

		objectOutput.writeLong(quarryApplicationId);
	}

	public long quarryApplicationPaymentId;
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
	public long quarryApplicationId;

}