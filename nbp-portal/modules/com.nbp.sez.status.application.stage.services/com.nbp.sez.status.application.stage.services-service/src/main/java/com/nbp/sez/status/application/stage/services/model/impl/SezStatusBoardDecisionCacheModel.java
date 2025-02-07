/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.stage.services.model.SezStatusBoardDecision;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezStatusBoardDecision in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezStatusBoardDecisionCacheModel
	implements CacheModel<SezStatusBoardDecision>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezStatusBoardDecisionCacheModel)) {
			return false;
		}

		SezStatusBoardDecisionCacheModel sezStatusBoardDecisionCacheModel =
			(SezStatusBoardDecisionCacheModel)object;

		if (sezStatusBoardId ==
				sezStatusBoardDecisionCacheModel.sezStatusBoardId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezStatusBoardId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", sezStatusBoardId=");
		sb.append(sezStatusBoardId);
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
		sb.append(", boardDecision=");
		sb.append(boardDecision);
		sb.append(", boardDecisionDate=");
		sb.append(boardDecisionDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezStatusBoardDecision toEntityModel() {
		SezStatusBoardDecisionImpl sezStatusBoardDecisionImpl =
			new SezStatusBoardDecisionImpl();

		if (uuid == null) {
			sezStatusBoardDecisionImpl.setUuid("");
		}
		else {
			sezStatusBoardDecisionImpl.setUuid(uuid);
		}

		sezStatusBoardDecisionImpl.setSezStatusBoardId(sezStatusBoardId);
		sezStatusBoardDecisionImpl.setGroupId(groupId);
		sezStatusBoardDecisionImpl.setCompanyId(companyId);
		sezStatusBoardDecisionImpl.setUserId(userId);

		if (userName == null) {
			sezStatusBoardDecisionImpl.setUserName("");
		}
		else {
			sezStatusBoardDecisionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezStatusBoardDecisionImpl.setCreateDate(null);
		}
		else {
			sezStatusBoardDecisionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezStatusBoardDecisionImpl.setModifiedDate(null);
		}
		else {
			sezStatusBoardDecisionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			sezStatusBoardDecisionImpl.setCaseId("");
		}
		else {
			sezStatusBoardDecisionImpl.setCaseId(caseId);
		}

		if (boardDecision == null) {
			sezStatusBoardDecisionImpl.setBoardDecision("");
		}
		else {
			sezStatusBoardDecisionImpl.setBoardDecision(boardDecision);
		}

		if (boardDecisionDate == Long.MIN_VALUE) {
			sezStatusBoardDecisionImpl.setBoardDecisionDate(null);
		}
		else {
			sezStatusBoardDecisionImpl.setBoardDecisionDate(
				new Date(boardDecisionDate));
		}

		sezStatusBoardDecisionImpl.resetOriginalValues();

		return sezStatusBoardDecisionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		sezStatusBoardId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		boardDecision = objectInput.readUTF();
		boardDecisionDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(sezStatusBoardId);

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

		if (boardDecision == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(boardDecision);
		}

		objectOutput.writeLong(boardDecisionDate);
	}

	public String uuid;
	public long sezStatusBoardId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public String boardDecision;
	public long boardDecisionDate;

}