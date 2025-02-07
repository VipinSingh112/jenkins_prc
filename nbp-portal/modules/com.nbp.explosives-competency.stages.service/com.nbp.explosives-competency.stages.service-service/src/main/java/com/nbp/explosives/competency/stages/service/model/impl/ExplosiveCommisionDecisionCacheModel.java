/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.explosives.competency.stages.service.model.ExplosiveCommisionDecision;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ExplosiveCommisionDecision in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ExplosiveCommisionDecisionCacheModel
	implements CacheModel<ExplosiveCommisionDecision>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ExplosiveCommisionDecisionCacheModel)) {
			return false;
		}

		ExplosiveCommisionDecisionCacheModel
			explosiveCommisionDecisionCacheModel =
				(ExplosiveCommisionDecisionCacheModel)object;

		if (commisiondecId ==
				explosiveCommisionDecisionCacheModel.commisiondecId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, commisiondecId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", commisiondecId=");
		sb.append(commisiondecId);
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
		sb.append(", commisionDecision=");
		sb.append(commisionDecision);
		sb.append(", decisionDate=");
		sb.append(decisionDate);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ExplosiveCommisionDecision toEntityModel() {
		ExplosiveCommisionDecisionImpl explosiveCommisionDecisionImpl =
			new ExplosiveCommisionDecisionImpl();

		if (uuid == null) {
			explosiveCommisionDecisionImpl.setUuid("");
		}
		else {
			explosiveCommisionDecisionImpl.setUuid(uuid);
		}

		explosiveCommisionDecisionImpl.setCommisiondecId(commisiondecId);
		explosiveCommisionDecisionImpl.setGroupId(groupId);
		explosiveCommisionDecisionImpl.setCompanyId(companyId);
		explosiveCommisionDecisionImpl.setUserId(userId);

		if (userName == null) {
			explosiveCommisionDecisionImpl.setUserName("");
		}
		else {
			explosiveCommisionDecisionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			explosiveCommisionDecisionImpl.setCreateDate(null);
		}
		else {
			explosiveCommisionDecisionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			explosiveCommisionDecisionImpl.setModifiedDate(null);
		}
		else {
			explosiveCommisionDecisionImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (commisionDecision == null) {
			explosiveCommisionDecisionImpl.setCommisionDecision("");
		}
		else {
			explosiveCommisionDecisionImpl.setCommisionDecision(
				commisionDecision);
		}

		if (decisionDate == Long.MIN_VALUE) {
			explosiveCommisionDecisionImpl.setDecisionDate(null);
		}
		else {
			explosiveCommisionDecisionImpl.setDecisionDate(
				new Date(decisionDate));
		}

		if (caseId == null) {
			explosiveCommisionDecisionImpl.setCaseId("");
		}
		else {
			explosiveCommisionDecisionImpl.setCaseId(caseId);
		}

		explosiveCommisionDecisionImpl.resetOriginalValues();

		return explosiveCommisionDecisionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		commisiondecId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		commisionDecision = objectInput.readUTF();
		decisionDate = objectInput.readLong();
		caseId = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(commisiondecId);

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

		if (commisionDecision == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(commisionDecision);
		}

		objectOutput.writeLong(decisionDate);

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}
	}

	public String uuid;
	public long commisiondecId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String commisionDecision;
	public long decisionDate;
	public String caseId;

}