/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.services.application.form.service.model.OsiServicesAppPayment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiServicesAppPayment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiServicesAppPaymentCacheModel
	implements CacheModel<OsiServicesAppPayment>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OsiServicesAppPaymentCacheModel)) {
			return false;
		}

		OsiServicesAppPaymentCacheModel osiServicesAppPaymentCacheModel =
			(OsiServicesAppPaymentCacheModel)object;

		if (osiServicesAppPaymentId ==
				osiServicesAppPaymentCacheModel.osiServicesAppPaymentId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiServicesAppPaymentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{osiServicesAppPaymentId=");
		sb.append(osiServicesAppPaymentId);
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
		sb.append(", osiServicesApplicationId=");
		sb.append(osiServicesApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OsiServicesAppPayment toEntityModel() {
		OsiServicesAppPaymentImpl osiServicesAppPaymentImpl =
			new OsiServicesAppPaymentImpl();

		osiServicesAppPaymentImpl.setOsiServicesAppPaymentId(
			osiServicesAppPaymentId);
		osiServicesAppPaymentImpl.setGroupId(groupId);
		osiServicesAppPaymentImpl.setCompanyId(companyId);
		osiServicesAppPaymentImpl.setUserId(userId);

		if (userName == null) {
			osiServicesAppPaymentImpl.setUserName("");
		}
		else {
			osiServicesAppPaymentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiServicesAppPaymentImpl.setCreateDate(null);
		}
		else {
			osiServicesAppPaymentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiServicesAppPaymentImpl.setModifiedDate(null);
		}
		else {
			osiServicesAppPaymentImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (paymentMethod == null) {
			osiServicesAppPaymentImpl.setPaymentMethod("");
		}
		else {
			osiServicesAppPaymentImpl.setPaymentMethod(paymentMethod);
		}

		if (paymentFee == null) {
			osiServicesAppPaymentImpl.setPaymentFee("");
		}
		else {
			osiServicesAppPaymentImpl.setPaymentFee(paymentFee);
		}

		if (amountPaid == null) {
			osiServicesAppPaymentImpl.setAmountPaid("");
		}
		else {
			osiServicesAppPaymentImpl.setAmountPaid(amountPaid);
		}

		if (amountCurrency == null) {
			osiServicesAppPaymentImpl.setAmountCurrency("");
		}
		else {
			osiServicesAppPaymentImpl.setAmountCurrency(amountCurrency);
		}

		osiServicesAppPaymentImpl.setOsiServicesApplicationId(
			osiServicesApplicationId);

		osiServicesAppPaymentImpl.resetOriginalValues();

		return osiServicesAppPaymentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		osiServicesAppPaymentId = objectInput.readLong();

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

		osiServicesApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(osiServicesAppPaymentId);

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

		objectOutput.writeLong(osiServicesApplicationId);
	}

	public long osiServicesAppPaymentId;
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
	public long osiServicesApplicationId;

}