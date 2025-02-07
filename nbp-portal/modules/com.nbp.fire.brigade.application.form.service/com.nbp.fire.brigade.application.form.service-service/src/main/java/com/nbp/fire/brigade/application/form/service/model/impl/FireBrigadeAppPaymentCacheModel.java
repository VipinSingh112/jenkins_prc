/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.fire.brigade.application.form.service.model.FireBrigadeAppPayment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FireBrigadeAppPayment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FireBrigadeAppPaymentCacheModel
	implements CacheModel<FireBrigadeAppPayment>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FireBrigadeAppPaymentCacheModel)) {
			return false;
		}

		FireBrigadeAppPaymentCacheModel fireBrigadeAppPaymentCacheModel =
			(FireBrigadeAppPaymentCacheModel)object;

		if (fireBrigadeAppPaymentId ==
				fireBrigadeAppPaymentCacheModel.fireBrigadeAppPaymentId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fireBrigadeAppPaymentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{fireBrigadeAppPaymentId=");
		sb.append(fireBrigadeAppPaymentId);
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
		sb.append(", paymentFee=");
		sb.append(paymentFee);
		sb.append(", amountPaid=");
		sb.append(amountPaid);
		sb.append(", amountCurrency=");
		sb.append(amountCurrency);
		sb.append(", fireBrigadeApplicationId=");
		sb.append(fireBrigadeApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FireBrigadeAppPayment toEntityModel() {
		FireBrigadeAppPaymentImpl fireBrigadeAppPaymentImpl =
			new FireBrigadeAppPaymentImpl();

		fireBrigadeAppPaymentImpl.setFireBrigadeAppPaymentId(
			fireBrigadeAppPaymentId);
		fireBrigadeAppPaymentImpl.setGroupId(groupId);
		fireBrigadeAppPaymentImpl.setCompanyId(companyId);
		fireBrigadeAppPaymentImpl.setUserId(userId);

		if (userName == null) {
			fireBrigadeAppPaymentImpl.setUserName("");
		}
		else {
			fireBrigadeAppPaymentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			fireBrigadeAppPaymentImpl.setCreateDate(null);
		}
		else {
			fireBrigadeAppPaymentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			fireBrigadeAppPaymentImpl.setModifiedDate(null);
		}
		else {
			fireBrigadeAppPaymentImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (paymentMethod == null) {
			fireBrigadeAppPaymentImpl.setPaymentMethod("");
		}
		else {
			fireBrigadeAppPaymentImpl.setPaymentMethod(paymentMethod);
		}

		if (paymentFee == null) {
			fireBrigadeAppPaymentImpl.setPaymentFee("");
		}
		else {
			fireBrigadeAppPaymentImpl.setPaymentFee(paymentFee);
		}

		if (amountPaid == null) {
			fireBrigadeAppPaymentImpl.setAmountPaid("");
		}
		else {
			fireBrigadeAppPaymentImpl.setAmountPaid(amountPaid);
		}

		if (amountCurrency == null) {
			fireBrigadeAppPaymentImpl.setAmountCurrency("");
		}
		else {
			fireBrigadeAppPaymentImpl.setAmountCurrency(amountCurrency);
		}

		fireBrigadeAppPaymentImpl.setFireBrigadeApplicationId(
			fireBrigadeApplicationId);

		fireBrigadeAppPaymentImpl.resetOriginalValues();

		return fireBrigadeAppPaymentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fireBrigadeAppPaymentId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		paymentMethod = objectInput.readUTF();
		paymentFee = objectInput.readUTF();
		amountPaid = objectInput.readUTF();
		amountCurrency = objectInput.readUTF();

		fireBrigadeApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(fireBrigadeAppPaymentId);

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

		objectOutput.writeLong(fireBrigadeApplicationId);
	}

	public long fireBrigadeAppPaymentId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String paymentMethod;
	public String paymentFee;
	public String amountPaid;
	public String amountCurrency;
	public long fireBrigadeApplicationId;

}