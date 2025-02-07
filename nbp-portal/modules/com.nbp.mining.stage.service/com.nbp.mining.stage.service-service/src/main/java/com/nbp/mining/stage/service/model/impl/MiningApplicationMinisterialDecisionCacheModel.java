/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.mining.stage.service.model.MiningApplicationMinisterialDecision;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MiningApplicationMinisterialDecision in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MiningApplicationMinisterialDecisionCacheModel
	implements CacheModel<MiningApplicationMinisterialDecision>,
			   Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof
				MiningApplicationMinisterialDecisionCacheModel)) {

			return false;
		}

		MiningApplicationMinisterialDecisionCacheModel
			miningApplicationMinisterialDecisionCacheModel =
				(MiningApplicationMinisterialDecisionCacheModel)object;

		if (miningDecId ==
				miningApplicationMinisterialDecisionCacheModel.miningDecId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, miningDecId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", miningDecId=");
		sb.append(miningDecId);
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
		sb.append(", dateOfCommDec=");
		sb.append(dateOfCommDec);
		sb.append(", commDecision=");
		sb.append(commDecision);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MiningApplicationMinisterialDecision toEntityModel() {
		MiningApplicationMinisterialDecisionImpl
			miningApplicationMinisterialDecisionImpl =
				new MiningApplicationMinisterialDecisionImpl();

		if (uuid == null) {
			miningApplicationMinisterialDecisionImpl.setUuid("");
		}
		else {
			miningApplicationMinisterialDecisionImpl.setUuid(uuid);
		}

		miningApplicationMinisterialDecisionImpl.setMiningDecId(miningDecId);
		miningApplicationMinisterialDecisionImpl.setGroupId(groupId);
		miningApplicationMinisterialDecisionImpl.setCompanyId(companyId);
		miningApplicationMinisterialDecisionImpl.setUserId(userId);

		if (userName == null) {
			miningApplicationMinisterialDecisionImpl.setUserName("");
		}
		else {
			miningApplicationMinisterialDecisionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			miningApplicationMinisterialDecisionImpl.setCreateDate(null);
		}
		else {
			miningApplicationMinisterialDecisionImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			miningApplicationMinisterialDecisionImpl.setModifiedDate(null);
		}
		else {
			miningApplicationMinisterialDecisionImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (caseId == null) {
			miningApplicationMinisterialDecisionImpl.setCaseId("");
		}
		else {
			miningApplicationMinisterialDecisionImpl.setCaseId(caseId);
		}

		if (dateOfCommDec == Long.MIN_VALUE) {
			miningApplicationMinisterialDecisionImpl.setDateOfCommDec(null);
		}
		else {
			miningApplicationMinisterialDecisionImpl.setDateOfCommDec(
				new Date(dateOfCommDec));
		}

		if (commDecision == null) {
			miningApplicationMinisterialDecisionImpl.setCommDecision("");
		}
		else {
			miningApplicationMinisterialDecisionImpl.setCommDecision(
				commDecision);
		}

		miningApplicationMinisterialDecisionImpl.resetOriginalValues();

		return miningApplicationMinisterialDecisionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		miningDecId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		dateOfCommDec = objectInput.readLong();
		commDecision = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(miningDecId);

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

		objectOutput.writeLong(dateOfCommDec);

		if (commDecision == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(commDecision);
		}
	}

	public String uuid;
	public long miningDecId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public long dateOfCommDec;
	public String commDecision;

}