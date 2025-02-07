/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.factories.registration.stage.services.model.FactoriesAppCommitteeDecision;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FactoriesAppCommitteeDecision in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FactoriesAppCommitteeDecisionCacheModel
	implements CacheModel<FactoriesAppCommitteeDecision>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FactoriesAppCommitteeDecisionCacheModel)) {
			return false;
		}

		FactoriesAppCommitteeDecisionCacheModel
			factoriesAppCommitteeDecisionCacheModel =
				(FactoriesAppCommitteeDecisionCacheModel)object;

		if (factoriesAppCommiDecId ==
				factoriesAppCommitteeDecisionCacheModel.
					factoriesAppCommiDecId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, factoriesAppCommiDecId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{factoriesAppCommiDecId=");
		sb.append(factoriesAppCommiDecId);
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
	public FactoriesAppCommitteeDecision toEntityModel() {
		FactoriesAppCommitteeDecisionImpl factoriesAppCommitteeDecisionImpl =
			new FactoriesAppCommitteeDecisionImpl();

		factoriesAppCommitteeDecisionImpl.setFactoriesAppCommiDecId(
			factoriesAppCommiDecId);
		factoriesAppCommitteeDecisionImpl.setGroupId(groupId);
		factoriesAppCommitteeDecisionImpl.setCompanyId(companyId);
		factoriesAppCommitteeDecisionImpl.setUserId(userId);

		if (userName == null) {
			factoriesAppCommitteeDecisionImpl.setUserName("");
		}
		else {
			factoriesAppCommitteeDecisionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			factoriesAppCommitteeDecisionImpl.setCreateDate(null);
		}
		else {
			factoriesAppCommitteeDecisionImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			factoriesAppCommitteeDecisionImpl.setModifiedDate(null);
		}
		else {
			factoriesAppCommitteeDecisionImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (dateOfCommitteeDecision == Long.MIN_VALUE) {
			factoriesAppCommitteeDecisionImpl.setDateOfCommitteeDecision(null);
		}
		else {
			factoriesAppCommitteeDecisionImpl.setDateOfCommitteeDecision(
				new Date(dateOfCommitteeDecision));
		}

		if (committeeDecision == null) {
			factoriesAppCommitteeDecisionImpl.setCommitteeDecision("");
		}
		else {
			factoriesAppCommitteeDecisionImpl.setCommitteeDecision(
				committeeDecision);
		}

		if (caseId == null) {
			factoriesAppCommitteeDecisionImpl.setCaseId("");
		}
		else {
			factoriesAppCommitteeDecisionImpl.setCaseId(caseId);
		}

		factoriesAppCommitteeDecisionImpl.resetOriginalValues();

		return factoriesAppCommitteeDecisionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		factoriesAppCommiDecId = objectInput.readLong();

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
		objectOutput.writeLong(factoriesAppCommiDecId);

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

	public long factoriesAppCommiDecId;
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