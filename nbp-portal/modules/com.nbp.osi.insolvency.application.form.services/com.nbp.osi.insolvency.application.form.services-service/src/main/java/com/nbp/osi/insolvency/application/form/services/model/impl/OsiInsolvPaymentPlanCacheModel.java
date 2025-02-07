/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.OsiInsolvPaymentPlan;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiInsolvPaymentPlan in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiInsolvPaymentPlanCacheModel
	implements CacheModel<OsiInsolvPaymentPlan>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OsiInsolvPaymentPlanCacheModel)) {
			return false;
		}

		OsiInsolvPaymentPlanCacheModel osiInsolvPaymentPlanCacheModel =
			(OsiInsolvPaymentPlanCacheModel)object;

		if (osiInsolvPaymentPlanId ==
				osiInsolvPaymentPlanCacheModel.osiInsolvPaymentPlanId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiInsolvPaymentPlanId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{osiInsolvPaymentPlanId=");
		sb.append(osiInsolvPaymentPlanId);
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
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OsiInsolvPaymentPlan toEntityModel() {
		OsiInsolvPaymentPlanImpl osiInsolvPaymentPlanImpl =
			new OsiInsolvPaymentPlanImpl();

		osiInsolvPaymentPlanImpl.setOsiInsolvPaymentPlanId(
			osiInsolvPaymentPlanId);
		osiInsolvPaymentPlanImpl.setGroupId(groupId);
		osiInsolvPaymentPlanImpl.setCompanyId(companyId);
		osiInsolvPaymentPlanImpl.setUserId(userId);

		if (userName == null) {
			osiInsolvPaymentPlanImpl.setUserName("");
		}
		else {
			osiInsolvPaymentPlanImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiInsolvPaymentPlanImpl.setCreateDate(null);
		}
		else {
			osiInsolvPaymentPlanImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiInsolvPaymentPlanImpl.setModifiedDate(null);
		}
		else {
			osiInsolvPaymentPlanImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (paymentMethod == null) {
			osiInsolvPaymentPlanImpl.setPaymentMethod("");
		}
		else {
			osiInsolvPaymentPlanImpl.setPaymentMethod(paymentMethod);
		}

		if (amountPaid == null) {
			osiInsolvPaymentPlanImpl.setAmountPaid("");
		}
		else {
			osiInsolvPaymentPlanImpl.setAmountPaid(amountPaid);
		}

		if (paymentCurrencySelected == null) {
			osiInsolvPaymentPlanImpl.setPaymentCurrencySelected("");
		}
		else {
			osiInsolvPaymentPlanImpl.setPaymentCurrencySelected(
				paymentCurrencySelected);
		}

		if (paymentMethodOther == null) {
			osiInsolvPaymentPlanImpl.setPaymentMethodOther("");
		}
		else {
			osiInsolvPaymentPlanImpl.setPaymentMethodOther(paymentMethodOther);
		}

		if (paymentDocId == null) {
			osiInsolvPaymentPlanImpl.setPaymentDocId("");
		}
		else {
			osiInsolvPaymentPlanImpl.setPaymentDocId(paymentDocId);
		}

		osiInsolvPaymentPlanImpl.setOsiInsolvencyId(osiInsolvencyId);

		osiInsolvPaymentPlanImpl.resetOriginalValues();

		return osiInsolvPaymentPlanImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		osiInsolvPaymentPlanId = objectInput.readLong();

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

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(osiInsolvPaymentPlanId);

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

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long osiInsolvPaymentPlanId;
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
	public long osiInsolvencyId;

}