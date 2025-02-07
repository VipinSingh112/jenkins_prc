/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.npm.cannabis.application.stages.services.model.CannabisLicensePayment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CannabisLicensePayment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CannabisLicensePaymentCacheModel
	implements CacheModel<CannabisLicensePayment>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CannabisLicensePaymentCacheModel)) {
			return false;
		}

		CannabisLicensePaymentCacheModel cannabisLicensePaymentCacheModel =
			(CannabisLicensePaymentCacheModel)object;

		if (cannabisLicensePaymentId ==
				cannabisLicensePaymentCacheModel.cannabisLicensePaymentId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cannabisLicensePaymentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{cannabisLicensePaymentId=");
		sb.append(cannabisLicensePaymentId);
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
		sb.append(", bondAmtDue=");
		sb.append(bondAmtDue);
		sb.append(", licenseFeeDue=");
		sb.append(licenseFeeDue);
		sb.append(", feeIssuanceDue=");
		sb.append(feeIssuanceDue);
		sb.append(", feeOption=");
		sb.append(feeOption);
		sb.append(", deferredPaymentType=");
		sb.append(deferredPaymentType);
		sb.append(", feePaymentdDate=");
		sb.append(feePaymentdDate);
		sb.append(", paymentOption=");
		sb.append(paymentOption);
		sb.append(", paymentAmtRecieved=");
		sb.append(paymentAmtRecieved);
		sb.append(", paymentStatus=");
		sb.append(paymentStatus);
		sb.append(", updatedBySource=");
		sb.append(updatedBySource);
		sb.append(", status=");
		sb.append(status);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", amountCurrency=");
		sb.append(amountCurrency);
		sb.append(", cannabisApplicationId=");
		sb.append(cannabisApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CannabisLicensePayment toEntityModel() {
		CannabisLicensePaymentImpl cannabisLicensePaymentImpl =
			new CannabisLicensePaymentImpl();

		cannabisLicensePaymentImpl.setCannabisLicensePaymentId(
			cannabisLicensePaymentId);
		cannabisLicensePaymentImpl.setGroupId(groupId);
		cannabisLicensePaymentImpl.setCompanyId(companyId);
		cannabisLicensePaymentImpl.setUserId(userId);

		if (userName == null) {
			cannabisLicensePaymentImpl.setUserName("");
		}
		else {
			cannabisLicensePaymentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			cannabisLicensePaymentImpl.setCreateDate(null);
		}
		else {
			cannabisLicensePaymentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cannabisLicensePaymentImpl.setModifiedDate(null);
		}
		else {
			cannabisLicensePaymentImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (bondAmtDue == null) {
			cannabisLicensePaymentImpl.setBondAmtDue("");
		}
		else {
			cannabisLicensePaymentImpl.setBondAmtDue(bondAmtDue);
		}

		if (licenseFeeDue == null) {
			cannabisLicensePaymentImpl.setLicenseFeeDue("");
		}
		else {
			cannabisLicensePaymentImpl.setLicenseFeeDue(licenseFeeDue);
		}

		if (feeIssuanceDue == null) {
			cannabisLicensePaymentImpl.setFeeIssuanceDue("");
		}
		else {
			cannabisLicensePaymentImpl.setFeeIssuanceDue(feeIssuanceDue);
		}

		if (feeOption == null) {
			cannabisLicensePaymentImpl.setFeeOption("");
		}
		else {
			cannabisLicensePaymentImpl.setFeeOption(feeOption);
		}

		if (deferredPaymentType == null) {
			cannabisLicensePaymentImpl.setDeferredPaymentType("");
		}
		else {
			cannabisLicensePaymentImpl.setDeferredPaymentType(
				deferredPaymentType);
		}

		if (feePaymentdDate == Long.MIN_VALUE) {
			cannabisLicensePaymentImpl.setFeePaymentdDate(null);
		}
		else {
			cannabisLicensePaymentImpl.setFeePaymentdDate(
				new Date(feePaymentdDate));
		}

		if (paymentOption == null) {
			cannabisLicensePaymentImpl.setPaymentOption("");
		}
		else {
			cannabisLicensePaymentImpl.setPaymentOption(paymentOption);
		}

		if (paymentAmtRecieved == null) {
			cannabisLicensePaymentImpl.setPaymentAmtRecieved("");
		}
		else {
			cannabisLicensePaymentImpl.setPaymentAmtRecieved(
				paymentAmtRecieved);
		}

		if (paymentStatus == null) {
			cannabisLicensePaymentImpl.setPaymentStatus("");
		}
		else {
			cannabisLicensePaymentImpl.setPaymentStatus(paymentStatus);
		}

		if (updatedBySource == null) {
			cannabisLicensePaymentImpl.setUpdatedBySource("");
		}
		else {
			cannabisLicensePaymentImpl.setUpdatedBySource(updatedBySource);
		}

		if (status == null) {
			cannabisLicensePaymentImpl.setStatus("");
		}
		else {
			cannabisLicensePaymentImpl.setStatus(status);
		}

		if (caseId == null) {
			cannabisLicensePaymentImpl.setCaseId("");
		}
		else {
			cannabisLicensePaymentImpl.setCaseId(caseId);
		}

		if (amountCurrency == null) {
			cannabisLicensePaymentImpl.setAmountCurrency("");
		}
		else {
			cannabisLicensePaymentImpl.setAmountCurrency(amountCurrency);
		}

		cannabisLicensePaymentImpl.setCannabisApplicationId(
			cannabisApplicationId);

		cannabisLicensePaymentImpl.resetOriginalValues();

		return cannabisLicensePaymentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cannabisLicensePaymentId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		bondAmtDue = objectInput.readUTF();
		licenseFeeDue = objectInput.readUTF();
		feeIssuanceDue = objectInput.readUTF();
		feeOption = objectInput.readUTF();
		deferredPaymentType = objectInput.readUTF();
		feePaymentdDate = objectInput.readLong();
		paymentOption = objectInput.readUTF();
		paymentAmtRecieved = objectInput.readUTF();
		paymentStatus = objectInput.readUTF();
		updatedBySource = objectInput.readUTF();
		status = objectInput.readUTF();
		caseId = objectInput.readUTF();
		amountCurrency = objectInput.readUTF();

		cannabisApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(cannabisLicensePaymentId);

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

		if (bondAmtDue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bondAmtDue);
		}

		if (licenseFeeDue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(licenseFeeDue);
		}

		if (feeIssuanceDue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(feeIssuanceDue);
		}

		if (feeOption == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(feeOption);
		}

		if (deferredPaymentType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(deferredPaymentType);
		}

		objectOutput.writeLong(feePaymentdDate);

		if (paymentOption == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(paymentOption);
		}

		if (paymentAmtRecieved == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(paymentAmtRecieved);
		}

		if (paymentStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(paymentStatus);
		}

		if (updatedBySource == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(updatedBySource);
		}

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		if (amountCurrency == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(amountCurrency);
		}

		objectOutput.writeLong(cannabisApplicationId);
	}

	public long cannabisLicensePaymentId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String bondAmtDue;
	public String licenseFeeDue;
	public String feeIssuanceDue;
	public String feeOption;
	public String deferredPaymentType;
	public long feePaymentdDate;
	public String paymentOption;
	public String paymentAmtRecieved;
	public String paymentStatus;
	public String updatedBySource;
	public String status;
	public String caseId;
	public String amountCurrency;
	public long cannabisApplicationId;

}