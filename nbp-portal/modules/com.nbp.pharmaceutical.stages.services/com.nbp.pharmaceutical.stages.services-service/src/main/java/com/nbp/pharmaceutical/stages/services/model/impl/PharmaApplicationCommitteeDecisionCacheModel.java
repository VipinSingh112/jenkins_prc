/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationCommitteeDecision;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PharmaApplicationCommitteeDecision in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PharmaApplicationCommitteeDecisionCacheModel
	implements CacheModel<PharmaApplicationCommitteeDecision>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PharmaApplicationCommitteeDecisionCacheModel)) {
			return false;
		}

		PharmaApplicationCommitteeDecisionCacheModel
			pharmaApplicationCommitteeDecisionCacheModel =
				(PharmaApplicationCommitteeDecisionCacheModel)object;

		if (pharmaCommitteeDecisionId ==
				pharmaApplicationCommitteeDecisionCacheModel.
					pharmaCommitteeDecisionId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, pharmaCommitteeDecisionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{pharmaCommitteeDecisionId=");
		sb.append(pharmaCommitteeDecisionId);
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
		sb.append(", dateOfCommitteeDecision=");
		sb.append(dateOfCommitteeDecision);
		sb.append(", committeeDecision=");
		sb.append(committeeDecision);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PharmaApplicationCommitteeDecision toEntityModel() {
		PharmaApplicationCommitteeDecisionImpl
			pharmaApplicationCommitteeDecisionImpl =
				new PharmaApplicationCommitteeDecisionImpl();

		pharmaApplicationCommitteeDecisionImpl.setPharmaCommitteeDecisionId(
			pharmaCommitteeDecisionId);
		pharmaApplicationCommitteeDecisionImpl.setGroupId(groupId);
		pharmaApplicationCommitteeDecisionImpl.setCompanyId(companyId);
		pharmaApplicationCommitteeDecisionImpl.setUserId(userId);

		if (userName == null) {
			pharmaApplicationCommitteeDecisionImpl.setUserName("");
		}
		else {
			pharmaApplicationCommitteeDecisionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			pharmaApplicationCommitteeDecisionImpl.setCreateDate(null);
		}
		else {
			pharmaApplicationCommitteeDecisionImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			pharmaApplicationCommitteeDecisionImpl.setModifiedDate(null);
		}
		else {
			pharmaApplicationCommitteeDecisionImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (dateOfCommitteeDecision == Long.MIN_VALUE) {
			pharmaApplicationCommitteeDecisionImpl.setDateOfCommitteeDecision(
				null);
		}
		else {
			pharmaApplicationCommitteeDecisionImpl.setDateOfCommitteeDecision(
				new Date(dateOfCommitteeDecision));
		}

		if (committeeDecision == null) {
			pharmaApplicationCommitteeDecisionImpl.setCommitteeDecision("");
		}
		else {
			pharmaApplicationCommitteeDecisionImpl.setCommitteeDecision(
				committeeDecision);
		}

		if (caseId == null) {
			pharmaApplicationCommitteeDecisionImpl.setCaseId("");
		}
		else {
			pharmaApplicationCommitteeDecisionImpl.setCaseId(caseId);
		}

		pharmaApplicationCommitteeDecisionImpl.resetOriginalValues();

		return pharmaApplicationCommitteeDecisionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		pharmaCommitteeDecisionId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		dateOfCommitteeDecision = objectInput.readLong();
		committeeDecision = objectInput.readUTF();
		caseId = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(pharmaCommitteeDecisionId);

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
		objectOutput.writeLong(dateOfCommitteeDecision);

		if (committeeDecision == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(committeeDecision);
		}

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}
	}

	public long pharmaCommitteeDecisionId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long dateOfCommitteeDecision;
	public String committeeDecision;
	public String caseId;

}