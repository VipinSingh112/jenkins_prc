/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.medical.facilities.application.form.service.model.MedicalFaciltiesPayment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MedicalFaciltiesPayment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MedicalFaciltiesPaymentCacheModel
	implements CacheModel<MedicalFaciltiesPayment>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MedicalFaciltiesPaymentCacheModel)) {
			return false;
		}

		MedicalFaciltiesPaymentCacheModel medicalFaciltiesPaymentCacheModel =
			(MedicalFaciltiesPaymentCacheModel)object;

		if (medicalFaciltiesPaymentId ==
				medicalFaciltiesPaymentCacheModel.medicalFaciltiesPaymentId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, medicalFaciltiesPaymentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{medicalFaciltiesPaymentId=");
		sb.append(medicalFaciltiesPaymentId);
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
		sb.append(", medicalFacilitiesAppId=");
		sb.append(medicalFacilitiesAppId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MedicalFaciltiesPayment toEntityModel() {
		MedicalFaciltiesPaymentImpl medicalFaciltiesPaymentImpl =
			new MedicalFaciltiesPaymentImpl();

		medicalFaciltiesPaymentImpl.setMedicalFaciltiesPaymentId(
			medicalFaciltiesPaymentId);
		medicalFaciltiesPaymentImpl.setGroupId(groupId);
		medicalFaciltiesPaymentImpl.setCompanyId(companyId);
		medicalFaciltiesPaymentImpl.setUserId(userId);

		if (userName == null) {
			medicalFaciltiesPaymentImpl.setUserName("");
		}
		else {
			medicalFaciltiesPaymentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			medicalFaciltiesPaymentImpl.setCreateDate(null);
		}
		else {
			medicalFaciltiesPaymentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			medicalFaciltiesPaymentImpl.setModifiedDate(null);
		}
		else {
			medicalFaciltiesPaymentImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (paymentMethod == null) {
			medicalFaciltiesPaymentImpl.setPaymentMethod("");
		}
		else {
			medicalFaciltiesPaymentImpl.setPaymentMethod(paymentMethod);
		}

		if (paymentDocId == null) {
			medicalFaciltiesPaymentImpl.setPaymentDocId("");
		}
		else {
			medicalFaciltiesPaymentImpl.setPaymentDocId(paymentDocId);
		}

		if (paymentStatus == null) {
			medicalFaciltiesPaymentImpl.setPaymentStatus("");
		}
		else {
			medicalFaciltiesPaymentImpl.setPaymentStatus(paymentStatus);
		}

		if (paymentFee == null) {
			medicalFaciltiesPaymentImpl.setPaymentFee("");
		}
		else {
			medicalFaciltiesPaymentImpl.setPaymentFee(paymentFee);
		}

		if (amountPaid == null) {
			medicalFaciltiesPaymentImpl.setAmountPaid("");
		}
		else {
			medicalFaciltiesPaymentImpl.setAmountPaid(amountPaid);
		}

		if (amountCurrency == null) {
			medicalFaciltiesPaymentImpl.setAmountCurrency("");
		}
		else {
			medicalFaciltiesPaymentImpl.setAmountCurrency(amountCurrency);
		}

		if (transactionNumber == null) {
			medicalFaciltiesPaymentImpl.setTransactionNumber("");
		}
		else {
			medicalFaciltiesPaymentImpl.setTransactionNumber(transactionNumber);
		}

		medicalFaciltiesPaymentImpl.setMedicalFacilitiesAppId(
			medicalFacilitiesAppId);

		medicalFaciltiesPaymentImpl.resetOriginalValues();

		return medicalFaciltiesPaymentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		medicalFaciltiesPaymentId = objectInput.readLong();

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

		medicalFacilitiesAppId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(medicalFaciltiesPaymentId);

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

		objectOutput.writeLong(medicalFacilitiesAppId);
	}

	public long medicalFaciltiesPaymentId;
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
	public long medicalFacilitiesAppId;

}