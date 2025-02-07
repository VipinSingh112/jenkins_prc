/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.quarry.stage.service.model.QuarryAppCommitteeDecision;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QuarryAppCommitteeDecision in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class QuarryAppCommitteeDecisionCacheModel
	implements CacheModel<QuarryAppCommitteeDecision>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof QuarryAppCommitteeDecisionCacheModel)) {
			return false;
		}

		QuarryAppCommitteeDecisionCacheModel
			quarryAppCommitteeDecisionCacheModel =
				(QuarryAppCommitteeDecisionCacheModel)object;

		if (quarryAppCommitteeDecisionId ==
				quarryAppCommitteeDecisionCacheModel.
					quarryAppCommitteeDecisionId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, quarryAppCommitteeDecisionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{quarryAppCommitteeDecisionId=");
		sb.append(quarryAppCommitteeDecisionId);
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
	public QuarryAppCommitteeDecision toEntityModel() {
		QuarryAppCommitteeDecisionImpl quarryAppCommitteeDecisionImpl =
			new QuarryAppCommitteeDecisionImpl();

		quarryAppCommitteeDecisionImpl.setQuarryAppCommitteeDecisionId(
			quarryAppCommitteeDecisionId);
		quarryAppCommitteeDecisionImpl.setGroupId(groupId);
		quarryAppCommitteeDecisionImpl.setCompanyId(companyId);
		quarryAppCommitteeDecisionImpl.setUserId(userId);

		if (userName == null) {
			quarryAppCommitteeDecisionImpl.setUserName("");
		}
		else {
			quarryAppCommitteeDecisionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			quarryAppCommitteeDecisionImpl.setCreateDate(null);
		}
		else {
			quarryAppCommitteeDecisionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			quarryAppCommitteeDecisionImpl.setModifiedDate(null);
		}
		else {
			quarryAppCommitteeDecisionImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (dateOfCommitteeDecision == Long.MIN_VALUE) {
			quarryAppCommitteeDecisionImpl.setDateOfCommitteeDecision(null);
		}
		else {
			quarryAppCommitteeDecisionImpl.setDateOfCommitteeDecision(
				new Date(dateOfCommitteeDecision));
		}

		if (committeeDecision == null) {
			quarryAppCommitteeDecisionImpl.setCommitteeDecision("");
		}
		else {
			quarryAppCommitteeDecisionImpl.setCommitteeDecision(
				committeeDecision);
		}

		if (caseId == null) {
			quarryAppCommitteeDecisionImpl.setCaseId("");
		}
		else {
			quarryAppCommitteeDecisionImpl.setCaseId(caseId);
		}

		quarryAppCommitteeDecisionImpl.resetOriginalValues();

		return quarryAppCommitteeDecisionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		quarryAppCommitteeDecisionId = objectInput.readLong();

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
		objectOutput.writeLong(quarryAppCommitteeDecisionId);

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

	public long quarryAppCommitteeDecisionId;
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