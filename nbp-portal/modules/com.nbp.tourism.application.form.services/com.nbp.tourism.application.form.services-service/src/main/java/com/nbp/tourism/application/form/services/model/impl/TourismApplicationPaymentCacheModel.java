/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismApplicationPayment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismApplicationPayment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismApplicationPaymentCacheModel
	implements CacheModel<TourismApplicationPayment>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismApplicationPaymentCacheModel)) {
			return false;
		}

		TourismApplicationPaymentCacheModel
			tourismApplicationPaymentCacheModel =
				(TourismApplicationPaymentCacheModel)object;

		if (TourismApplicationPaymentId ==
				tourismApplicationPaymentCacheModel.
					TourismApplicationPaymentId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, TourismApplicationPaymentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{TourismApplicationPaymentId=");
		sb.append(TourismApplicationPaymentId);
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
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismApplicationPayment toEntityModel() {
		TourismApplicationPaymentImpl tourismApplicationPaymentImpl =
			new TourismApplicationPaymentImpl();

		tourismApplicationPaymentImpl.setTourismApplicationPaymentId(
			TourismApplicationPaymentId);
		tourismApplicationPaymentImpl.setGroupId(groupId);
		tourismApplicationPaymentImpl.setCompanyId(companyId);
		tourismApplicationPaymentImpl.setUserId(userId);

		if (userName == null) {
			tourismApplicationPaymentImpl.setUserName("");
		}
		else {
			tourismApplicationPaymentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismApplicationPaymentImpl.setCreateDate(null);
		}
		else {
			tourismApplicationPaymentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismApplicationPaymentImpl.setModifiedDate(null);
		}
		else {
			tourismApplicationPaymentImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (paymentMethod == null) {
			tourismApplicationPaymentImpl.setPaymentMethod("");
		}
		else {
			tourismApplicationPaymentImpl.setPaymentMethod(paymentMethod);
		}

		if (paymentDocId == null) {
			tourismApplicationPaymentImpl.setPaymentDocId("");
		}
		else {
			tourismApplicationPaymentImpl.setPaymentDocId(paymentDocId);
		}

		if (paymentStatus == null) {
			tourismApplicationPaymentImpl.setPaymentStatus("");
		}
		else {
			tourismApplicationPaymentImpl.setPaymentStatus(paymentStatus);
		}

		if (paymentFee == null) {
			tourismApplicationPaymentImpl.setPaymentFee("");
		}
		else {
			tourismApplicationPaymentImpl.setPaymentFee(paymentFee);
		}

		if (amountPaid == null) {
			tourismApplicationPaymentImpl.setAmountPaid("");
		}
		else {
			tourismApplicationPaymentImpl.setAmountPaid(amountPaid);
		}

		if (amountCurrency == null) {
			tourismApplicationPaymentImpl.setAmountCurrency("");
		}
		else {
			tourismApplicationPaymentImpl.setAmountCurrency(amountCurrency);
		}

		if (transactionNumber == null) {
			tourismApplicationPaymentImpl.setTransactionNumber("");
		}
		else {
			tourismApplicationPaymentImpl.setTransactionNumber(
				transactionNumber);
		}

		tourismApplicationPaymentImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismApplicationPaymentImpl.resetOriginalValues();

		return tourismApplicationPaymentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		TourismApplicationPaymentId = objectInput.readLong();

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

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(TourismApplicationPaymentId);

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

		objectOutput.writeLong(tourismApplicationId);
	}

	public long TourismApplicationPaymentId;
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
	public long tourismApplicationId;

}