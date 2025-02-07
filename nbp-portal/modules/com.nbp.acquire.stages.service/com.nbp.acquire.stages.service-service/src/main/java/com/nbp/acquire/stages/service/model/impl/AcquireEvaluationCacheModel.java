/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.acquire.stages.service.model.AcquireEvaluation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AcquireEvaluation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AcquireEvaluationCacheModel
	implements CacheModel<AcquireEvaluation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AcquireEvaluationCacheModel)) {
			return false;
		}

		AcquireEvaluationCacheModel acquireEvaluationCacheModel =
			(AcquireEvaluationCacheModel)object;

		if (acquireEvaluationId ==
				acquireEvaluationCacheModel.acquireEvaluationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, acquireEvaluationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{acquireEvaluationId=");
		sb.append(acquireEvaluationId);
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
		sb.append(", typeOfCommittee=");
		sb.append(typeOfCommittee);
		sb.append(", dateOfCommitteeDecision=");
		sb.append(dateOfCommitteeDecision);
		sb.append(", committeeDecision=");
		sb.append(committeeDecision);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AcquireEvaluation toEntityModel() {
		AcquireEvaluationImpl acquireEvaluationImpl =
			new AcquireEvaluationImpl();

		acquireEvaluationImpl.setAcquireEvaluationId(acquireEvaluationId);
		acquireEvaluationImpl.setGroupId(groupId);
		acquireEvaluationImpl.setCompanyId(companyId);
		acquireEvaluationImpl.setUserId(userId);

		if (userName == null) {
			acquireEvaluationImpl.setUserName("");
		}
		else {
			acquireEvaluationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			acquireEvaluationImpl.setCreateDate(null);
		}
		else {
			acquireEvaluationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			acquireEvaluationImpl.setModifiedDate(null);
		}
		else {
			acquireEvaluationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			acquireEvaluationImpl.setCaseId("");
		}
		else {
			acquireEvaluationImpl.setCaseId(caseId);
		}

		if (typeOfCommittee == null) {
			acquireEvaluationImpl.setTypeOfCommittee("");
		}
		else {
			acquireEvaluationImpl.setTypeOfCommittee(typeOfCommittee);
		}

		if (dateOfCommitteeDecision == Long.MIN_VALUE) {
			acquireEvaluationImpl.setDateOfCommitteeDecision(null);
		}
		else {
			acquireEvaluationImpl.setDateOfCommitteeDecision(
				new Date(dateOfCommitteeDecision));
		}

		if (committeeDecision == null) {
			acquireEvaluationImpl.setCommitteeDecision("");
		}
		else {
			acquireEvaluationImpl.setCommitteeDecision(committeeDecision);
		}

		acquireEvaluationImpl.resetOriginalValues();

		return acquireEvaluationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		acquireEvaluationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		typeOfCommittee = objectInput.readUTF();
		dateOfCommitteeDecision = objectInput.readLong();
		committeeDecision = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(acquireEvaluationId);

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

		if (typeOfCommittee == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfCommittee);
		}

		objectOutput.writeLong(dateOfCommitteeDecision);

		if (committeeDecision == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(committeeDecision);
		}
	}

	public long acquireEvaluationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public String typeOfCommittee;
	public long dateOfCommitteeDecision;
	public String committeeDecision;

}