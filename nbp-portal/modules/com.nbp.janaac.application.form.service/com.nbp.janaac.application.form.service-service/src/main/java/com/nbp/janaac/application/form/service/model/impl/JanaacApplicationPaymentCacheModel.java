/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.JanaacApplicationPayment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JanaacApplicationPayment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JanaacApplicationPaymentCacheModel
	implements CacheModel<JanaacApplicationPayment>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JanaacApplicationPaymentCacheModel)) {
			return false;
		}

		JanaacApplicationPaymentCacheModel janaacApplicationPaymentCacheModel =
			(JanaacApplicationPaymentCacheModel)object;

		if (janaacApplicationPaymentId ==
				janaacApplicationPaymentCacheModel.janaacApplicationPaymentId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, janaacApplicationPaymentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{janaacApplicationPaymentId=");
		sb.append(janaacApplicationPaymentId);
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
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JanaacApplicationPayment toEntityModel() {
		JanaacApplicationPaymentImpl janaacApplicationPaymentImpl =
			new JanaacApplicationPaymentImpl();

		janaacApplicationPaymentImpl.setJanaacApplicationPaymentId(
			janaacApplicationPaymentId);
		janaacApplicationPaymentImpl.setGroupId(groupId);
		janaacApplicationPaymentImpl.setCompanyId(companyId);
		janaacApplicationPaymentImpl.setUserId(userId);

		if (userName == null) {
			janaacApplicationPaymentImpl.setUserName("");
		}
		else {
			janaacApplicationPaymentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			janaacApplicationPaymentImpl.setCreateDate(null);
		}
		else {
			janaacApplicationPaymentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			janaacApplicationPaymentImpl.setModifiedDate(null);
		}
		else {
			janaacApplicationPaymentImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (paymentMethod == null) {
			janaacApplicationPaymentImpl.setPaymentMethod("");
		}
		else {
			janaacApplicationPaymentImpl.setPaymentMethod(paymentMethod);
		}

		if (paymentFee == null) {
			janaacApplicationPaymentImpl.setPaymentFee("");
		}
		else {
			janaacApplicationPaymentImpl.setPaymentFee(paymentFee);
		}

		if (amountPaid == null) {
			janaacApplicationPaymentImpl.setAmountPaid("");
		}
		else {
			janaacApplicationPaymentImpl.setAmountPaid(amountPaid);
		}

		if (amountCurrency == null) {
			janaacApplicationPaymentImpl.setAmountCurrency("");
		}
		else {
			janaacApplicationPaymentImpl.setAmountCurrency(amountCurrency);
		}

		janaacApplicationPaymentImpl.setJanaacApplicationId(
			janaacApplicationId);

		janaacApplicationPaymentImpl.resetOriginalValues();

		return janaacApplicationPaymentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		janaacApplicationPaymentId = objectInput.readLong();

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

		janaacApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(janaacApplicationPaymentId);

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

		objectOutput.writeLong(janaacApplicationId);
	}

	public long janaacApplicationPaymentId;
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
	public long janaacApplicationId;

}