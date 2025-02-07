/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.OsiInsolvencyApplicationPayment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiInsolvencyApplicationPayment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiInsolvencyApplicationPaymentCacheModel
	implements CacheModel<OsiInsolvencyApplicationPayment>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OsiInsolvencyApplicationPaymentCacheModel)) {
			return false;
		}

		OsiInsolvencyApplicationPaymentCacheModel
			osiInsolvencyApplicationPaymentCacheModel =
				(OsiInsolvencyApplicationPaymentCacheModel)object;

		if (osiInsolveApplicationPaymentId ==
				osiInsolvencyApplicationPaymentCacheModel.
					osiInsolveApplicationPaymentId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiInsolveApplicationPaymentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{osiInsolveApplicationPaymentId=");
		sb.append(osiInsolveApplicationPaymentId);
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
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OsiInsolvencyApplicationPayment toEntityModel() {
		OsiInsolvencyApplicationPaymentImpl
			osiInsolvencyApplicationPaymentImpl =
				new OsiInsolvencyApplicationPaymentImpl();

		osiInsolvencyApplicationPaymentImpl.setOsiInsolveApplicationPaymentId(
			osiInsolveApplicationPaymentId);
		osiInsolvencyApplicationPaymentImpl.setGroupId(groupId);
		osiInsolvencyApplicationPaymentImpl.setCompanyId(companyId);
		osiInsolvencyApplicationPaymentImpl.setUserId(userId);

		if (userName == null) {
			osiInsolvencyApplicationPaymentImpl.setUserName("");
		}
		else {
			osiInsolvencyApplicationPaymentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiInsolvencyApplicationPaymentImpl.setCreateDate(null);
		}
		else {
			osiInsolvencyApplicationPaymentImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiInsolvencyApplicationPaymentImpl.setModifiedDate(null);
		}
		else {
			osiInsolvencyApplicationPaymentImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (paymentMethod == null) {
			osiInsolvencyApplicationPaymentImpl.setPaymentMethod("");
		}
		else {
			osiInsolvencyApplicationPaymentImpl.setPaymentMethod(paymentMethod);
		}

		if (paymentDocId == null) {
			osiInsolvencyApplicationPaymentImpl.setPaymentDocId("");
		}
		else {
			osiInsolvencyApplicationPaymentImpl.setPaymentDocId(paymentDocId);
		}

		if (paymentStatus == null) {
			osiInsolvencyApplicationPaymentImpl.setPaymentStatus("");
		}
		else {
			osiInsolvencyApplicationPaymentImpl.setPaymentStatus(paymentStatus);
		}

		if (paymentFee == null) {
			osiInsolvencyApplicationPaymentImpl.setPaymentFee("");
		}
		else {
			osiInsolvencyApplicationPaymentImpl.setPaymentFee(paymentFee);
		}

		if (amountPaid == null) {
			osiInsolvencyApplicationPaymentImpl.setAmountPaid("");
		}
		else {
			osiInsolvencyApplicationPaymentImpl.setAmountPaid(amountPaid);
		}

		if (amountCurrency == null) {
			osiInsolvencyApplicationPaymentImpl.setAmountCurrency("");
		}
		else {
			osiInsolvencyApplicationPaymentImpl.setAmountCurrency(
				amountCurrency);
		}

		if (transactionNumber == null) {
			osiInsolvencyApplicationPaymentImpl.setTransactionNumber("");
		}
		else {
			osiInsolvencyApplicationPaymentImpl.setTransactionNumber(
				transactionNumber);
		}

		osiInsolvencyApplicationPaymentImpl.setOsiInsolvencyId(osiInsolvencyId);

		osiInsolvencyApplicationPaymentImpl.resetOriginalValues();

		return osiInsolvencyApplicationPaymentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		osiInsolveApplicationPaymentId = objectInput.readLong();

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

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(osiInsolveApplicationPaymentId);

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

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long osiInsolveApplicationPaymentId;
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
	public long osiInsolvencyId;

}