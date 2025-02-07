/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.acquire.stages.service.model.AcquireFinalExecutedAgreement;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AcquireFinalExecutedAgreement in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AcquireFinalExecutedAgreementCacheModel
	implements CacheModel<AcquireFinalExecutedAgreement>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AcquireFinalExecutedAgreementCacheModel)) {
			return false;
		}

		AcquireFinalExecutedAgreementCacheModel
			acquireFinalExecutedAgreementCacheModel =
				(AcquireFinalExecutedAgreementCacheModel)object;

		if (acquirefinalId ==
				acquireFinalExecutedAgreementCacheModel.acquirefinalId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, acquirefinalId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{acquirefinalId=");
		sb.append(acquirefinalId);
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
		sb.append(", dateContractExecuted=");
		sb.append(dateContractExecuted);
		sb.append(", docFileEntryId=");
		sb.append(docFileEntryId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AcquireFinalExecutedAgreement toEntityModel() {
		AcquireFinalExecutedAgreementImpl acquireFinalExecutedAgreementImpl =
			new AcquireFinalExecutedAgreementImpl();

		acquireFinalExecutedAgreementImpl.setAcquirefinalId(acquirefinalId);
		acquireFinalExecutedAgreementImpl.setGroupId(groupId);
		acquireFinalExecutedAgreementImpl.setCompanyId(companyId);
		acquireFinalExecutedAgreementImpl.setUserId(userId);

		if (userName == null) {
			acquireFinalExecutedAgreementImpl.setUserName("");
		}
		else {
			acquireFinalExecutedAgreementImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			acquireFinalExecutedAgreementImpl.setCreateDate(null);
		}
		else {
			acquireFinalExecutedAgreementImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			acquireFinalExecutedAgreementImpl.setModifiedDate(null);
		}
		else {
			acquireFinalExecutedAgreementImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (caseId == null) {
			acquireFinalExecutedAgreementImpl.setCaseId("");
		}
		else {
			acquireFinalExecutedAgreementImpl.setCaseId(caseId);
		}

		if (dateContractExecuted == Long.MIN_VALUE) {
			acquireFinalExecutedAgreementImpl.setDateContractExecuted(null);
		}
		else {
			acquireFinalExecutedAgreementImpl.setDateContractExecuted(
				new Date(dateContractExecuted));
		}

		acquireFinalExecutedAgreementImpl.setDocFileEntryId(docFileEntryId);

		acquireFinalExecutedAgreementImpl.resetOriginalValues();

		return acquireFinalExecutedAgreementImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		acquirefinalId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		dateContractExecuted = objectInput.readLong();

		docFileEntryId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(acquirefinalId);

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

		objectOutput.writeLong(dateContractExecuted);

		objectOutput.writeLong(docFileEntryId);
	}

	public long acquirefinalId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public long dateContractExecuted;
	public long docFileEntryId;

}