/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.acquire.application.form.service.model.AcquirePaymentPlan;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AcquirePaymentPlan in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AcquirePaymentPlanCacheModel
	implements CacheModel<AcquirePaymentPlan>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AcquirePaymentPlanCacheModel)) {
			return false;
		}

		AcquirePaymentPlanCacheModel acquirePaymentPlanCacheModel =
			(AcquirePaymentPlanCacheModel)object;

		if (acquirePaymentPlanId ==
				acquirePaymentPlanCacheModel.acquirePaymentPlanId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, acquirePaymentPlanId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{acquirePaymentPlanId=");
		sb.append(acquirePaymentPlanId);
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
		sb.append(", amountPaid=");
		sb.append(amountPaid);
		sb.append(", paymentCurrencySelected=");
		sb.append(paymentCurrencySelected);
		sb.append(", paymentMethodOther=");
		sb.append(paymentMethodOther);
		sb.append(", paymentDocId=");
		sb.append(paymentDocId);
		sb.append(", acquireApplicationId=");
		sb.append(acquireApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AcquirePaymentPlan toEntityModel() {
		AcquirePaymentPlanImpl acquirePaymentPlanImpl =
			new AcquirePaymentPlanImpl();

		acquirePaymentPlanImpl.setAcquirePaymentPlanId(acquirePaymentPlanId);
		acquirePaymentPlanImpl.setGroupId(groupId);
		acquirePaymentPlanImpl.setCompanyId(companyId);
		acquirePaymentPlanImpl.setUserId(userId);

		if (userName == null) {
			acquirePaymentPlanImpl.setUserName("");
		}
		else {
			acquirePaymentPlanImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			acquirePaymentPlanImpl.setCreateDate(null);
		}
		else {
			acquirePaymentPlanImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			acquirePaymentPlanImpl.setModifiedDate(null);
		}
		else {
			acquirePaymentPlanImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (paymentMethod == null) {
			acquirePaymentPlanImpl.setPaymentMethod("");
		}
		else {
			acquirePaymentPlanImpl.setPaymentMethod(paymentMethod);
		}

		if (amountPaid == null) {
			acquirePaymentPlanImpl.setAmountPaid("");
		}
		else {
			acquirePaymentPlanImpl.setAmountPaid(amountPaid);
		}

		if (paymentCurrencySelected == null) {
			acquirePaymentPlanImpl.setPaymentCurrencySelected("");
		}
		else {
			acquirePaymentPlanImpl.setPaymentCurrencySelected(
				paymentCurrencySelected);
		}

		if (paymentMethodOther == null) {
			acquirePaymentPlanImpl.setPaymentMethodOther("");
		}
		else {
			acquirePaymentPlanImpl.setPaymentMethodOther(paymentMethodOther);
		}

		if (paymentDocId == null) {
			acquirePaymentPlanImpl.setPaymentDocId("");
		}
		else {
			acquirePaymentPlanImpl.setPaymentDocId(paymentDocId);
		}

		acquirePaymentPlanImpl.setAcquireApplicationId(acquireApplicationId);

		acquirePaymentPlanImpl.resetOriginalValues();

		return acquirePaymentPlanImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		acquirePaymentPlanId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		paymentMethod = objectInput.readUTF();
		amountPaid = objectInput.readUTF();
		paymentCurrencySelected = objectInput.readUTF();
		paymentMethodOther = objectInput.readUTF();
		paymentDocId = objectInput.readUTF();

		acquireApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(acquirePaymentPlanId);

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

		if (amountPaid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(amountPaid);
		}

		if (paymentCurrencySelected == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(paymentCurrencySelected);
		}

		if (paymentMethodOther == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(paymentMethodOther);
		}

		if (paymentDocId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(paymentDocId);
		}

		objectOutput.writeLong(acquireApplicationId);
	}

	public long acquirePaymentPlanId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String paymentMethod;
	public String amountPaid;
	public String paymentCurrencySelected;
	public String paymentMethodOther;
	public String paymentDocId;
	public long acquireApplicationId;

}