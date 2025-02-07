/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezStatusAppPayment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezStatusAppPayment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezStatusAppPaymentCacheModel
	implements CacheModel<SezStatusAppPayment>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezStatusAppPaymentCacheModel)) {
			return false;
		}

		SezStatusAppPaymentCacheModel sezStatusAppPaymentCacheModel =
			(SezStatusAppPaymentCacheModel)object;

		if (sezStatusAppPaymentId ==
				sezStatusAppPaymentCacheModel.sezStatusAppPaymentId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezStatusAppPaymentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{sezStatusAppPaymentId=");
		sb.append(sezStatusAppPaymentId);
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
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezStatusAppPayment toEntityModel() {
		SezStatusAppPaymentImpl sezStatusAppPaymentImpl =
			new SezStatusAppPaymentImpl();

		sezStatusAppPaymentImpl.setSezStatusAppPaymentId(sezStatusAppPaymentId);
		sezStatusAppPaymentImpl.setGroupId(groupId);
		sezStatusAppPaymentImpl.setCompanyId(companyId);
		sezStatusAppPaymentImpl.setUserId(userId);

		if (userName == null) {
			sezStatusAppPaymentImpl.setUserName("");
		}
		else {
			sezStatusAppPaymentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezStatusAppPaymentImpl.setCreateDate(null);
		}
		else {
			sezStatusAppPaymentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezStatusAppPaymentImpl.setModifiedDate(null);
		}
		else {
			sezStatusAppPaymentImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (paymentMethod == null) {
			sezStatusAppPaymentImpl.setPaymentMethod("");
		}
		else {
			sezStatusAppPaymentImpl.setPaymentMethod(paymentMethod);
		}

		if (paymentDocId == null) {
			sezStatusAppPaymentImpl.setPaymentDocId("");
		}
		else {
			sezStatusAppPaymentImpl.setPaymentDocId(paymentDocId);
		}

		if (paymentStatus == null) {
			sezStatusAppPaymentImpl.setPaymentStatus("");
		}
		else {
			sezStatusAppPaymentImpl.setPaymentStatus(paymentStatus);
		}

		if (paymentFee == null) {
			sezStatusAppPaymentImpl.setPaymentFee("");
		}
		else {
			sezStatusAppPaymentImpl.setPaymentFee(paymentFee);
		}

		if (amountPaid == null) {
			sezStatusAppPaymentImpl.setAmountPaid("");
		}
		else {
			sezStatusAppPaymentImpl.setAmountPaid(amountPaid);
		}

		if (amountCurrency == null) {
			sezStatusAppPaymentImpl.setAmountCurrency("");
		}
		else {
			sezStatusAppPaymentImpl.setAmountCurrency(amountCurrency);
		}

		if (transactionNumber == null) {
			sezStatusAppPaymentImpl.setTransactionNumber("");
		}
		else {
			sezStatusAppPaymentImpl.setTransactionNumber(transactionNumber);
		}

		sezStatusAppPaymentImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezStatusAppPaymentImpl.resetOriginalValues();

		return sezStatusAppPaymentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezStatusAppPaymentId = objectInput.readLong();

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

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezStatusAppPaymentId);

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

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezStatusAppPaymentId;
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
	public long sezStatusApplicationId;

}