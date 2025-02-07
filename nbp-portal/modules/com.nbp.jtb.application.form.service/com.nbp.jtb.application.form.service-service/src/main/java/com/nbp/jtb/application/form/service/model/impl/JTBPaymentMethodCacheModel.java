/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.JTBPaymentMethod;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JTBPaymentMethod in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JTBPaymentMethodCacheModel
	implements CacheModel<JTBPaymentMethod>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JTBPaymentMethodCacheModel)) {
			return false;
		}

		JTBPaymentMethodCacheModel jtbPaymentMethodCacheModel =
			(JTBPaymentMethodCacheModel)object;

		if (jTBPaymentMethodId ==
				jtbPaymentMethodCacheModel.jTBPaymentMethodId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jTBPaymentMethodId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{jTBPaymentMethodId=");
		sb.append(jTBPaymentMethodId);
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
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JTBPaymentMethod toEntityModel() {
		JTBPaymentMethodImpl jtbPaymentMethodImpl = new JTBPaymentMethodImpl();

		jtbPaymentMethodImpl.setJTBPaymentMethodId(jTBPaymentMethodId);
		jtbPaymentMethodImpl.setGroupId(groupId);
		jtbPaymentMethodImpl.setCompanyId(companyId);
		jtbPaymentMethodImpl.setUserId(userId);

		if (userName == null) {
			jtbPaymentMethodImpl.setUserName("");
		}
		else {
			jtbPaymentMethodImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jtbPaymentMethodImpl.setCreateDate(null);
		}
		else {
			jtbPaymentMethodImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jtbPaymentMethodImpl.setModifiedDate(null);
		}
		else {
			jtbPaymentMethodImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (paymentMethod == null) {
			jtbPaymentMethodImpl.setPaymentMethod("");
		}
		else {
			jtbPaymentMethodImpl.setPaymentMethod(paymentMethod);
		}

		if (paymentDocId == null) {
			jtbPaymentMethodImpl.setPaymentDocId("");
		}
		else {
			jtbPaymentMethodImpl.setPaymentDocId(paymentDocId);
		}

		if (paymentStatus == null) {
			jtbPaymentMethodImpl.setPaymentStatus("");
		}
		else {
			jtbPaymentMethodImpl.setPaymentStatus(paymentStatus);
		}

		if (paymentFee == null) {
			jtbPaymentMethodImpl.setPaymentFee("");
		}
		else {
			jtbPaymentMethodImpl.setPaymentFee(paymentFee);
		}

		if (amountPaid == null) {
			jtbPaymentMethodImpl.setAmountPaid("");
		}
		else {
			jtbPaymentMethodImpl.setAmountPaid(amountPaid);
		}

		if (amountCurrency == null) {
			jtbPaymentMethodImpl.setAmountCurrency("");
		}
		else {
			jtbPaymentMethodImpl.setAmountCurrency(amountCurrency);
		}

		if (transactionNumber == null) {
			jtbPaymentMethodImpl.setTransactionNumber("");
		}
		else {
			jtbPaymentMethodImpl.setTransactionNumber(transactionNumber);
		}

		jtbPaymentMethodImpl.setJtbApplicationId(jtbApplicationId);

		jtbPaymentMethodImpl.resetOriginalValues();

		return jtbPaymentMethodImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		jTBPaymentMethodId = objectInput.readLong();

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

		jtbApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(jTBPaymentMethodId);

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

		objectOutput.writeLong(jtbApplicationId);
	}

	public long jTBPaymentMethodId;
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
	public long jtbApplicationId;

}