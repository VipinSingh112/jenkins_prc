/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.factories.registration.application.form.services.model.FactoriesAppPayment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FactoriesAppPayment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FactoriesAppPaymentCacheModel
	implements CacheModel<FactoriesAppPayment>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FactoriesAppPaymentCacheModel)) {
			return false;
		}

		FactoriesAppPaymentCacheModel factoriesAppPaymentCacheModel =
			(FactoriesAppPaymentCacheModel)object;

		if (factoriesAppPaymentId ==
				factoriesAppPaymentCacheModel.factoriesAppPaymentId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, factoriesAppPaymentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{factoriesAppPaymentId=");
		sb.append(factoriesAppPaymentId);
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
		sb.append(", factoriesApplicationId=");
		sb.append(factoriesApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FactoriesAppPayment toEntityModel() {
		FactoriesAppPaymentImpl factoriesAppPaymentImpl =
			new FactoriesAppPaymentImpl();

		factoriesAppPaymentImpl.setFactoriesAppPaymentId(factoriesAppPaymentId);
		factoriesAppPaymentImpl.setGroupId(groupId);
		factoriesAppPaymentImpl.setCompanyId(companyId);
		factoriesAppPaymentImpl.setUserId(userId);

		if (userName == null) {
			factoriesAppPaymentImpl.setUserName("");
		}
		else {
			factoriesAppPaymentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			factoriesAppPaymentImpl.setCreateDate(null);
		}
		else {
			factoriesAppPaymentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			factoriesAppPaymentImpl.setModifiedDate(null);
		}
		else {
			factoriesAppPaymentImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (paymentMethod == null) {
			factoriesAppPaymentImpl.setPaymentMethod("");
		}
		else {
			factoriesAppPaymentImpl.setPaymentMethod(paymentMethod);
		}

		if (paymentDocId == null) {
			factoriesAppPaymentImpl.setPaymentDocId("");
		}
		else {
			factoriesAppPaymentImpl.setPaymentDocId(paymentDocId);
		}

		if (paymentStatus == null) {
			factoriesAppPaymentImpl.setPaymentStatus("");
		}
		else {
			factoriesAppPaymentImpl.setPaymentStatus(paymentStatus);
		}

		if (paymentFee == null) {
			factoriesAppPaymentImpl.setPaymentFee("");
		}
		else {
			factoriesAppPaymentImpl.setPaymentFee(paymentFee);
		}

		if (amountPaid == null) {
			factoriesAppPaymentImpl.setAmountPaid("");
		}
		else {
			factoriesAppPaymentImpl.setAmountPaid(amountPaid);
		}

		if (amountCurrency == null) {
			factoriesAppPaymentImpl.setAmountCurrency("");
		}
		else {
			factoriesAppPaymentImpl.setAmountCurrency(amountCurrency);
		}

		if (transactionNumber == null) {
			factoriesAppPaymentImpl.setTransactionNumber("");
		}
		else {
			factoriesAppPaymentImpl.setTransactionNumber(transactionNumber);
		}

		factoriesAppPaymentImpl.setFactoriesApplicationId(
			factoriesApplicationId);

		factoriesAppPaymentImpl.resetOriginalValues();

		return factoriesAppPaymentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		factoriesAppPaymentId = objectInput.readLong();

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

		factoriesApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(factoriesAppPaymentId);

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

		objectOutput.writeLong(factoriesApplicationId);
	}

	public long factoriesAppPaymentId;
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
	public long factoriesApplicationId;

}