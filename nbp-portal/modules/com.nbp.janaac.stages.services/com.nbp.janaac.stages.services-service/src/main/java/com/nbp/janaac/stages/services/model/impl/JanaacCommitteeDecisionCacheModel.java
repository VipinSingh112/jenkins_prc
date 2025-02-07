/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.stages.services.model.JanaacCommitteeDecision;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JanaacCommitteeDecision in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JanaacCommitteeDecisionCacheModel
	implements CacheModel<JanaacCommitteeDecision>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JanaacCommitteeDecisionCacheModel)) {
			return false;
		}

		JanaacCommitteeDecisionCacheModel janaacCommitteeDecisionCacheModel =
			(JanaacCommitteeDecisionCacheModel)object;

		if (janaacCommitteeDecisionId ==
				janaacCommitteeDecisionCacheModel.janaacCommitteeDecisionId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, janaacCommitteeDecisionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{janaacCommitteeDecisionId=");
		sb.append(janaacCommitteeDecisionId);
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
	public JanaacCommitteeDecision toEntityModel() {
		JanaacCommitteeDecisionImpl janaacCommitteeDecisionImpl =
			new JanaacCommitteeDecisionImpl();

		janaacCommitteeDecisionImpl.setJanaacCommitteeDecisionId(
			janaacCommitteeDecisionId);
		janaacCommitteeDecisionImpl.setGroupId(groupId);
		janaacCommitteeDecisionImpl.setCompanyId(companyId);
		janaacCommitteeDecisionImpl.setUserId(userId);

		if (userName == null) {
			janaacCommitteeDecisionImpl.setUserName("");
		}
		else {
			janaacCommitteeDecisionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			janaacCommitteeDecisionImpl.setCreateDate(null);
		}
		else {
			janaacCommitteeDecisionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			janaacCommitteeDecisionImpl.setModifiedDate(null);
		}
		else {
			janaacCommitteeDecisionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (dateOfCommitteeDecision == Long.MIN_VALUE) {
			janaacCommitteeDecisionImpl.setDateOfCommitteeDecision(null);
		}
		else {
			janaacCommitteeDecisionImpl.setDateOfCommitteeDecision(
				new Date(dateOfCommitteeDecision));
		}

		if (committeeDecision == null) {
			janaacCommitteeDecisionImpl.setCommitteeDecision("");
		}
		else {
			janaacCommitteeDecisionImpl.setCommitteeDecision(committeeDecision);
		}

		if (caseId == null) {
			janaacCommitteeDecisionImpl.setCaseId("");
		}
		else {
			janaacCommitteeDecisionImpl.setCaseId(caseId);
		}

		janaacCommitteeDecisionImpl.resetOriginalValues();

		return janaacCommitteeDecisionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		janaacCommitteeDecisionId = objectInput.readLong();

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
		objectOutput.writeLong(janaacCommitteeDecisionId);

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

	public long janaacCommitteeDecisionId;
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