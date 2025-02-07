/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.stage.services.model.SezStatusARCDecision;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezStatusARCDecision in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezStatusARCDecisionCacheModel
	implements CacheModel<SezStatusARCDecision>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezStatusARCDecisionCacheModel)) {
			return false;
		}

		SezStatusARCDecisionCacheModel sezStatusARCDecisionCacheModel =
			(SezStatusARCDecisionCacheModel)object;

		if (sezStatusCommitteeId ==
				sezStatusARCDecisionCacheModel.sezStatusCommitteeId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezStatusCommitteeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", sezStatusCommitteeId=");
		sb.append(sezStatusCommitteeId);
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
		sb.append(", committeeDecision=");
		sb.append(committeeDecision);
		sb.append(", committeeDecisionDate=");
		sb.append(committeeDecisionDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezStatusARCDecision toEntityModel() {
		SezStatusARCDecisionImpl sezStatusARCDecisionImpl =
			new SezStatusARCDecisionImpl();

		if (uuid == null) {
			sezStatusARCDecisionImpl.setUuid("");
		}
		else {
			sezStatusARCDecisionImpl.setUuid(uuid);
		}

		sezStatusARCDecisionImpl.setSezStatusCommitteeId(sezStatusCommitteeId);
		sezStatusARCDecisionImpl.setGroupId(groupId);
		sezStatusARCDecisionImpl.setCompanyId(companyId);
		sezStatusARCDecisionImpl.setUserId(userId);

		if (userName == null) {
			sezStatusARCDecisionImpl.setUserName("");
		}
		else {
			sezStatusARCDecisionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezStatusARCDecisionImpl.setCreateDate(null);
		}
		else {
			sezStatusARCDecisionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezStatusARCDecisionImpl.setModifiedDate(null);
		}
		else {
			sezStatusARCDecisionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			sezStatusARCDecisionImpl.setCaseId("");
		}
		else {
			sezStatusARCDecisionImpl.setCaseId(caseId);
		}

		if (committeeDecision == null) {
			sezStatusARCDecisionImpl.setCommitteeDecision("");
		}
		else {
			sezStatusARCDecisionImpl.setCommitteeDecision(committeeDecision);
		}

		if (committeeDecisionDate == Long.MIN_VALUE) {
			sezStatusARCDecisionImpl.setCommitteeDecisionDate(null);
		}
		else {
			sezStatusARCDecisionImpl.setCommitteeDecisionDate(
				new Date(committeeDecisionDate));
		}

		sezStatusARCDecisionImpl.resetOriginalValues();

		return sezStatusARCDecisionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		sezStatusCommitteeId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		committeeDecision = objectInput.readUTF();
		committeeDecisionDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(sezStatusCommitteeId);

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

		if (committeeDecision == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(committeeDecision);
		}

		objectOutput.writeLong(committeeDecisionDate);
	}

	public String uuid;
	public long sezStatusCommitteeId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public String committeeDecision;
	public long committeeDecisionDate;

}