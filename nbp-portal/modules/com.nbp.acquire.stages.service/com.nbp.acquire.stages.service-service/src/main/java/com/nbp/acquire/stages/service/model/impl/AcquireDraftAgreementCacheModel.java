/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.acquire.stages.service.model.AcquireDraftAgreement;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AcquireDraftAgreement in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AcquireDraftAgreementCacheModel
	implements CacheModel<AcquireDraftAgreement>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AcquireDraftAgreementCacheModel)) {
			return false;
		}

		AcquireDraftAgreementCacheModel acquireDraftAgreementCacheModel =
			(AcquireDraftAgreementCacheModel)object;

		if (acquireDraftId == acquireDraftAgreementCacheModel.acquireDraftId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, acquireDraftId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{acquireDraftId=");
		sb.append(acquireDraftId);
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
		sb.append(", paymentAmountDue=");
		sb.append(paymentAmountDue);
		sb.append(", docFileEntryId=");
		sb.append(docFileEntryId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AcquireDraftAgreement toEntityModel() {
		AcquireDraftAgreementImpl acquireDraftAgreementImpl =
			new AcquireDraftAgreementImpl();

		acquireDraftAgreementImpl.setAcquireDraftId(acquireDraftId);
		acquireDraftAgreementImpl.setGroupId(groupId);
		acquireDraftAgreementImpl.setCompanyId(companyId);
		acquireDraftAgreementImpl.setUserId(userId);

		if (userName == null) {
			acquireDraftAgreementImpl.setUserName("");
		}
		else {
			acquireDraftAgreementImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			acquireDraftAgreementImpl.setCreateDate(null);
		}
		else {
			acquireDraftAgreementImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			acquireDraftAgreementImpl.setModifiedDate(null);
		}
		else {
			acquireDraftAgreementImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			acquireDraftAgreementImpl.setCaseId("");
		}
		else {
			acquireDraftAgreementImpl.setCaseId(caseId);
		}

		if (paymentAmountDue == null) {
			acquireDraftAgreementImpl.setPaymentAmountDue("");
		}
		else {
			acquireDraftAgreementImpl.setPaymentAmountDue(paymentAmountDue);
		}

		acquireDraftAgreementImpl.setDocFileEntryId(docFileEntryId);

		acquireDraftAgreementImpl.resetOriginalValues();

		return acquireDraftAgreementImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		acquireDraftId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		paymentAmountDue = objectInput.readUTF();

		docFileEntryId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(acquireDraftId);

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

		if (paymentAmountDue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(paymentAmountDue);
		}

		objectOutput.writeLong(docFileEntryId);
	}

	public long acquireDraftId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public String paymentAmountDue;
	public long docFileEntryId;

}