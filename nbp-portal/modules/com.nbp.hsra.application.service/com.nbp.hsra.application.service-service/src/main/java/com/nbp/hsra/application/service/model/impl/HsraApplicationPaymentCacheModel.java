/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.HsraApplicationPayment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing HsraApplicationPayment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HsraApplicationPaymentCacheModel
	implements CacheModel<HsraApplicationPayment>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof HsraApplicationPaymentCacheModel)) {
			return false;
		}

		HsraApplicationPaymentCacheModel hsraApplicationPaymentCacheModel =
			(HsraApplicationPaymentCacheModel)object;

		if (hsraApplicationPaymentId ==
				hsraApplicationPaymentCacheModel.hsraApplicationPaymentId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, hsraApplicationPaymentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{hsraApplicationPaymentId=");
		sb.append(hsraApplicationPaymentId);
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
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public HsraApplicationPayment toEntityModel() {
		HsraApplicationPaymentImpl hsraApplicationPaymentImpl =
			new HsraApplicationPaymentImpl();

		hsraApplicationPaymentImpl.setHsraApplicationPaymentId(
			hsraApplicationPaymentId);
		hsraApplicationPaymentImpl.setGroupId(groupId);
		hsraApplicationPaymentImpl.setCompanyId(companyId);
		hsraApplicationPaymentImpl.setUserId(userId);

		if (userName == null) {
			hsraApplicationPaymentImpl.setUserName("");
		}
		else {
			hsraApplicationPaymentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			hsraApplicationPaymentImpl.setCreateDate(null);
		}
		else {
			hsraApplicationPaymentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			hsraApplicationPaymentImpl.setModifiedDate(null);
		}
		else {
			hsraApplicationPaymentImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (paymentMethod == null) {
			hsraApplicationPaymentImpl.setPaymentMethod("");
		}
		else {
			hsraApplicationPaymentImpl.setPaymentMethod(paymentMethod);
		}

		if (paymentFee == null) {
			hsraApplicationPaymentImpl.setPaymentFee("");
		}
		else {
			hsraApplicationPaymentImpl.setPaymentFee(paymentFee);
		}

		if (amountPaid == null) {
			hsraApplicationPaymentImpl.setAmountPaid("");
		}
		else {
			hsraApplicationPaymentImpl.setAmountPaid(amountPaid);
		}

		if (amountCurrency == null) {
			hsraApplicationPaymentImpl.setAmountCurrency("");
		}
		else {
			hsraApplicationPaymentImpl.setAmountCurrency(amountCurrency);
		}

		hsraApplicationPaymentImpl.setHsraApplicationId(hsraApplicationId);

		hsraApplicationPaymentImpl.resetOriginalValues();

		return hsraApplicationPaymentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		hsraApplicationPaymentId = objectInput.readLong();

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

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(hsraApplicationPaymentId);

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

		objectOutput.writeLong(hsraApplicationId);
	}

	public long hsraApplicationPaymentId;
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
	public long hsraApplicationId;

}