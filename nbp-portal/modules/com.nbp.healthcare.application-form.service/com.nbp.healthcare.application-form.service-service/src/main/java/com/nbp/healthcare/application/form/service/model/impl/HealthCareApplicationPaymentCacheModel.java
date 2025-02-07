/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.healthcare.application.form.service.model.HealthCareApplicationPayment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing HealthCareApplicationPayment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HealthCareApplicationPaymentCacheModel
	implements CacheModel<HealthCareApplicationPayment>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof HealthCareApplicationPaymentCacheModel)) {
			return false;
		}

		HealthCareApplicationPaymentCacheModel
			healthCareApplicationPaymentCacheModel =
				(HealthCareApplicationPaymentCacheModel)object;

		if (healthCareApplicationPaymentId ==
				healthCareApplicationPaymentCacheModel.
					healthCareApplicationPaymentId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, healthCareApplicationPaymentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{healthCareApplicationPaymentId=");
		sb.append(healthCareApplicationPaymentId);
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
		sb.append(", transactionNumber=");
		sb.append(transactionNumber);
		sb.append(", healthCareApplicationId=");
		sb.append(healthCareApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public HealthCareApplicationPayment toEntityModel() {
		HealthCareApplicationPaymentImpl healthCareApplicationPaymentImpl =
			new HealthCareApplicationPaymentImpl();

		healthCareApplicationPaymentImpl.setHealthCareApplicationPaymentId(
			healthCareApplicationPaymentId);
		healthCareApplicationPaymentImpl.setGroupId(groupId);
		healthCareApplicationPaymentImpl.setCompanyId(companyId);
		healthCareApplicationPaymentImpl.setUserId(userId);

		if (userName == null) {
			healthCareApplicationPaymentImpl.setUserName("");
		}
		else {
			healthCareApplicationPaymentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			healthCareApplicationPaymentImpl.setCreateDate(null);
		}
		else {
			healthCareApplicationPaymentImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			healthCareApplicationPaymentImpl.setModifiedDate(null);
		}
		else {
			healthCareApplicationPaymentImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (paymentMethod == null) {
			healthCareApplicationPaymentImpl.setPaymentMethod("");
		}
		else {
			healthCareApplicationPaymentImpl.setPaymentMethod(paymentMethod);
		}

		if (paymentDocId == null) {
			healthCareApplicationPaymentImpl.setPaymentDocId("");
		}
		else {
			healthCareApplicationPaymentImpl.setPaymentDocId(paymentDocId);
		}

		if (paymentStatus == null) {
			healthCareApplicationPaymentImpl.setPaymentStatus("");
		}
		else {
			healthCareApplicationPaymentImpl.setPaymentStatus(paymentStatus);
		}

		if (paymentFee == null) {
			healthCareApplicationPaymentImpl.setPaymentFee("");
		}
		else {
			healthCareApplicationPaymentImpl.setPaymentFee(paymentFee);
		}

		if (transactionNumber == null) {
			healthCareApplicationPaymentImpl.setTransactionNumber("");
		}
		else {
			healthCareApplicationPaymentImpl.setTransactionNumber(
				transactionNumber);
		}

		healthCareApplicationPaymentImpl.setHealthCareApplicationId(
			healthCareApplicationId);

		healthCareApplicationPaymentImpl.resetOriginalValues();

		return healthCareApplicationPaymentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		healthCareApplicationPaymentId = objectInput.readLong();

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
		transactionNumber = objectInput.readUTF();

		healthCareApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(healthCareApplicationPaymentId);

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

		if (transactionNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(transactionNumber);
		}

		objectOutput.writeLong(healthCareApplicationId);
	}

	public long healthCareApplicationPaymentId;
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
	public String transactionNumber;
	public long healthCareApplicationId;

}