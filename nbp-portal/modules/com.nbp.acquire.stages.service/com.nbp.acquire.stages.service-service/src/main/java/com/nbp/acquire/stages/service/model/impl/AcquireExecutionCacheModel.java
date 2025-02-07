/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.acquire.stages.service.model.AcquireExecution;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AcquireExecution in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AcquireExecutionCacheModel
	implements CacheModel<AcquireExecution>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AcquireExecutionCacheModel)) {
			return false;
		}

		AcquireExecutionCacheModel acquireExecutionCacheModel =
			(AcquireExecutionCacheModel)object;

		if (acquireExecutionId ==
				acquireExecutionCacheModel.acquireExecutionId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, acquireExecutionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{acquireExecutionId=");
		sb.append(acquireExecutionId);
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
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", paymentSection=");
		sb.append(paymentSection);
		sb.append(", paymentAmountDue=");
		sb.append(paymentAmountDue);
		sb.append(", contractSection=");
		sb.append(contractSection);
		sb.append(", dateContractExecuted=");
		sb.append(dateContractExecuted);
		sb.append(", docFileEntryId=");
		sb.append(docFileEntryId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AcquireExecution toEntityModel() {
		AcquireExecutionImpl acquireExecutionImpl = new AcquireExecutionImpl();

		acquireExecutionImpl.setAcquireExecutionId(acquireExecutionId);
		acquireExecutionImpl.setGroupId(groupId);
		acquireExecutionImpl.setCompanyId(companyId);
		acquireExecutionImpl.setUserId(userId);

		if (userName == null) {
			acquireExecutionImpl.setUserName("");
		}
		else {
			acquireExecutionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			acquireExecutionImpl.setCreateDate(null);
		}
		else {
			acquireExecutionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			acquireExecutionImpl.setModifiedDate(null);
		}
		else {
			acquireExecutionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			acquireExecutionImpl.setCaseId("");
		}
		else {
			acquireExecutionImpl.setCaseId(caseId);
		}

		if (paymentSection == null) {
			acquireExecutionImpl.setPaymentSection("");
		}
		else {
			acquireExecutionImpl.setPaymentSection(paymentSection);
		}

		if (paymentAmountDue == null) {
			acquireExecutionImpl.setPaymentAmountDue("");
		}
		else {
			acquireExecutionImpl.setPaymentAmountDue(paymentAmountDue);
		}

		if (contractSection == null) {
			acquireExecutionImpl.setContractSection("");
		}
		else {
			acquireExecutionImpl.setContractSection(contractSection);
		}

		if (dateContractExecuted == Long.MIN_VALUE) {
			acquireExecutionImpl.setDateContractExecuted(null);
		}
		else {
			acquireExecutionImpl.setDateContractExecuted(
				new Date(dateContractExecuted));
		}

		acquireExecutionImpl.setDocFileEntryId(docFileEntryId);

		acquireExecutionImpl.resetOriginalValues();

		return acquireExecutionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		acquireExecutionId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		paymentSection = objectInput.readUTF();
		paymentAmountDue = objectInput.readUTF();
		contractSection = objectInput.readUTF();
		dateContractExecuted = objectInput.readLong();

		docFileEntryId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(acquireExecutionId);

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

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		if (paymentSection == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(paymentSection);
		}

		if (paymentAmountDue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(paymentAmountDue);
		}

		if (contractSection == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contractSection);
		}

		objectOutput.writeLong(dateContractExecuted);

		objectOutput.writeLong(docFileEntryId);
	}

	public long acquireExecutionId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public String paymentSection;
	public String paymentAmountDue;
	public String contractSection;
	public long dateContractExecuted;
	public long docFileEntryId;

}