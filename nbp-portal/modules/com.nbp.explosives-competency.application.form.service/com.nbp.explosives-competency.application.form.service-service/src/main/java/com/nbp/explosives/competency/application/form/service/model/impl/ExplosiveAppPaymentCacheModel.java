/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.explosives.competency.application.form.service.model.ExplosiveAppPayment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ExplosiveAppPayment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ExplosiveAppPaymentCacheModel
	implements CacheModel<ExplosiveAppPayment>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ExplosiveAppPaymentCacheModel)) {
			return false;
		}

		ExplosiveAppPaymentCacheModel explosiveAppPaymentCacheModel =
			(ExplosiveAppPaymentCacheModel)object;

		if (explosiveAppPaymentId ==
				explosiveAppPaymentCacheModel.explosiveAppPaymentId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, explosiveAppPaymentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{explosiveAppPaymentId=");
		sb.append(explosiveAppPaymentId);
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
		sb.append(", explosivesApplicationId=");
		sb.append(explosivesApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ExplosiveAppPayment toEntityModel() {
		ExplosiveAppPaymentImpl explosiveAppPaymentImpl =
			new ExplosiveAppPaymentImpl();

		explosiveAppPaymentImpl.setExplosiveAppPaymentId(explosiveAppPaymentId);
		explosiveAppPaymentImpl.setGroupId(groupId);
		explosiveAppPaymentImpl.setCompanyId(companyId);
		explosiveAppPaymentImpl.setUserId(userId);

		if (userName == null) {
			explosiveAppPaymentImpl.setUserName("");
		}
		else {
			explosiveAppPaymentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			explosiveAppPaymentImpl.setCreateDate(null);
		}
		else {
			explosiveAppPaymentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			explosiveAppPaymentImpl.setModifiedDate(null);
		}
		else {
			explosiveAppPaymentImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (paymentMethod == null) {
			explosiveAppPaymentImpl.setPaymentMethod("");
		}
		else {
			explosiveAppPaymentImpl.setPaymentMethod(paymentMethod);
		}

		if (paymentDocId == null) {
			explosiveAppPaymentImpl.setPaymentDocId("");
		}
		else {
			explosiveAppPaymentImpl.setPaymentDocId(paymentDocId);
		}

		if (paymentStatus == null) {
			explosiveAppPaymentImpl.setPaymentStatus("");
		}
		else {
			explosiveAppPaymentImpl.setPaymentStatus(paymentStatus);
		}

		if (paymentFee == null) {
			explosiveAppPaymentImpl.setPaymentFee("");
		}
		else {
			explosiveAppPaymentImpl.setPaymentFee(paymentFee);
		}

		if (amountPaid == null) {
			explosiveAppPaymentImpl.setAmountPaid("");
		}
		else {
			explosiveAppPaymentImpl.setAmountPaid(amountPaid);
		}

		if (amountCurrency == null) {
			explosiveAppPaymentImpl.setAmountCurrency("");
		}
		else {
			explosiveAppPaymentImpl.setAmountCurrency(amountCurrency);
		}

		if (transactionNumber == null) {
			explosiveAppPaymentImpl.setTransactionNumber("");
		}
		else {
			explosiveAppPaymentImpl.setTransactionNumber(transactionNumber);
		}

		explosiveAppPaymentImpl.setExplosivesApplicationId(
			explosivesApplicationId);

		explosiveAppPaymentImpl.resetOriginalValues();

		return explosiveAppPaymentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		explosiveAppPaymentId = objectInput.readLong();

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

		explosivesApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(explosiveAppPaymentId);

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

		objectOutput.writeLong(explosivesApplicationId);
	}

	public long explosiveAppPaymentId;
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
	public long explosivesApplicationId;

}