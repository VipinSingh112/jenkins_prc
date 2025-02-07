/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncbj.stages.services.model.NcbjAppBoardDecision;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcbjAppBoardDecision in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcbjAppBoardDecisionCacheModel
	implements CacheModel<NcbjAppBoardDecision>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcbjAppBoardDecisionCacheModel)) {
			return false;
		}

		NcbjAppBoardDecisionCacheModel ncbjAppBoardDecisionCacheModel =
			(NcbjAppBoardDecisionCacheModel)object;

		if (ncbjAppBoardDecisionId ==
				ncbjAppBoardDecisionCacheModel.ncbjAppBoardDecisionId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncbjAppBoardDecisionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{ncbjAppBoardDecisionId=");
		sb.append(ncbjAppBoardDecisionId);
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
		sb.append(", dateOfBoardDecision=");
		sb.append(dateOfBoardDecision);
		sb.append(", committeeDecision=");
		sb.append(committeeDecision);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcbjAppBoardDecision toEntityModel() {
		NcbjAppBoardDecisionImpl ncbjAppBoardDecisionImpl =
			new NcbjAppBoardDecisionImpl();

		ncbjAppBoardDecisionImpl.setNcbjAppBoardDecisionId(
			ncbjAppBoardDecisionId);
		ncbjAppBoardDecisionImpl.setGroupId(groupId);
		ncbjAppBoardDecisionImpl.setCompanyId(companyId);
		ncbjAppBoardDecisionImpl.setUserId(userId);

		if (userName == null) {
			ncbjAppBoardDecisionImpl.setUserName("");
		}
		else {
			ncbjAppBoardDecisionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncbjAppBoardDecisionImpl.setCreateDate(null);
		}
		else {
			ncbjAppBoardDecisionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncbjAppBoardDecisionImpl.setModifiedDate(null);
		}
		else {
			ncbjAppBoardDecisionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (dateOfBoardDecision == Long.MIN_VALUE) {
			ncbjAppBoardDecisionImpl.setDateOfBoardDecision(null);
		}
		else {
			ncbjAppBoardDecisionImpl.setDateOfBoardDecision(
				new Date(dateOfBoardDecision));
		}

		if (committeeDecision == null) {
			ncbjAppBoardDecisionImpl.setCommitteeDecision("");
		}
		else {
			ncbjAppBoardDecisionImpl.setCommitteeDecision(committeeDecision);
		}

		if (caseId == null) {
			ncbjAppBoardDecisionImpl.setCaseId("");
		}
		else {
			ncbjAppBoardDecisionImpl.setCaseId(caseId);
		}

		ncbjAppBoardDecisionImpl.resetOriginalValues();

		return ncbjAppBoardDecisionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncbjAppBoardDecisionId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		dateOfBoardDecision = objectInput.readLong();
		committeeDecision = objectInput.readUTF();
		caseId = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ncbjAppBoardDecisionId);

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
		objectOutput.writeLong(dateOfBoardDecision);

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

	public long ncbjAppBoardDecisionId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long dateOfBoardDecision;
	public String committeeDecision;
	public String caseId;

}