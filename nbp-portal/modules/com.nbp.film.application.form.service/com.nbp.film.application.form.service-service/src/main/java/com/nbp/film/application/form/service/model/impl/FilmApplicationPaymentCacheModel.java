/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.film.application.form.service.model.FilmApplicationPayment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FilmApplicationPayment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FilmApplicationPaymentCacheModel
	implements CacheModel<FilmApplicationPayment>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FilmApplicationPaymentCacheModel)) {
			return false;
		}

		FilmApplicationPaymentCacheModel filmApplicationPaymentCacheModel =
			(FilmApplicationPaymentCacheModel)object;

		if (filmApplicationPaymentId ==
				filmApplicationPaymentCacheModel.filmApplicationPaymentId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, filmApplicationPaymentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{filmApplicationPaymentId=");
		sb.append(filmApplicationPaymentId);
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
		sb.append(", filmApplicationId=");
		sb.append(filmApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FilmApplicationPayment toEntityModel() {
		FilmApplicationPaymentImpl filmApplicationPaymentImpl =
			new FilmApplicationPaymentImpl();

		filmApplicationPaymentImpl.setFilmApplicationPaymentId(
			filmApplicationPaymentId);
		filmApplicationPaymentImpl.setGroupId(groupId);
		filmApplicationPaymentImpl.setCompanyId(companyId);
		filmApplicationPaymentImpl.setUserId(userId);

		if (userName == null) {
			filmApplicationPaymentImpl.setUserName("");
		}
		else {
			filmApplicationPaymentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			filmApplicationPaymentImpl.setCreateDate(null);
		}
		else {
			filmApplicationPaymentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			filmApplicationPaymentImpl.setModifiedDate(null);
		}
		else {
			filmApplicationPaymentImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (paymentMethod == null) {
			filmApplicationPaymentImpl.setPaymentMethod("");
		}
		else {
			filmApplicationPaymentImpl.setPaymentMethod(paymentMethod);
		}

		if (paymentDocId == null) {
			filmApplicationPaymentImpl.setPaymentDocId("");
		}
		else {
			filmApplicationPaymentImpl.setPaymentDocId(paymentDocId);
		}

		if (paymentStatus == null) {
			filmApplicationPaymentImpl.setPaymentStatus("");
		}
		else {
			filmApplicationPaymentImpl.setPaymentStatus(paymentStatus);
		}

		if (paymentFee == null) {
			filmApplicationPaymentImpl.setPaymentFee("");
		}
		else {
			filmApplicationPaymentImpl.setPaymentFee(paymentFee);
		}

		if (amountPaid == null) {
			filmApplicationPaymentImpl.setAmountPaid("");
		}
		else {
			filmApplicationPaymentImpl.setAmountPaid(amountPaid);
		}

		if (amountCurrency == null) {
			filmApplicationPaymentImpl.setAmountCurrency("");
		}
		else {
			filmApplicationPaymentImpl.setAmountCurrency(amountCurrency);
		}

		if (transactionNumber == null) {
			filmApplicationPaymentImpl.setTransactionNumber("");
		}
		else {
			filmApplicationPaymentImpl.setTransactionNumber(transactionNumber);
		}

		filmApplicationPaymentImpl.setFilmApplicationId(filmApplicationId);

		filmApplicationPaymentImpl.resetOriginalValues();

		return filmApplicationPaymentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		filmApplicationPaymentId = objectInput.readLong();

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

		filmApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(filmApplicationPaymentId);

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

		objectOutput.writeLong(filmApplicationId);
	}

	public long filmApplicationPaymentId;
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
	public long filmApplicationId;

}