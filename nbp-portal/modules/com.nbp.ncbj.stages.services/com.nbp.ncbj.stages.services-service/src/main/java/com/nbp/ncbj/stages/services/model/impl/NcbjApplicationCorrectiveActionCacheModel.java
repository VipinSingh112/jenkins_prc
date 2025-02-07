/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncbj.stages.services.model.NcbjApplicationCorrectiveAction;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcbjApplicationCorrectiveAction in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcbjApplicationCorrectiveActionCacheModel
	implements CacheModel<NcbjApplicationCorrectiveAction>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcbjApplicationCorrectiveActionCacheModel)) {
			return false;
		}

		NcbjApplicationCorrectiveActionCacheModel
			ncbjApplicationCorrectiveActionCacheModel =
				(NcbjApplicationCorrectiveActionCacheModel)object;

		if (ncbjAppCorrActionId ==
				ncbjApplicationCorrectiveActionCacheModel.ncbjAppCorrActionId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncbjAppCorrActionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{ncbjAppCorrActionId=");
		sb.append(ncbjAppCorrActionId);
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
		sb.append(", preApprovalLetterId=");
		sb.append(preApprovalLetterId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcbjApplicationCorrectiveAction toEntityModel() {
		NcbjApplicationCorrectiveActionImpl
			ncbjApplicationCorrectiveActionImpl =
				new NcbjApplicationCorrectiveActionImpl();

		ncbjApplicationCorrectiveActionImpl.setNcbjAppCorrActionId(
			ncbjAppCorrActionId);
		ncbjApplicationCorrectiveActionImpl.setGroupId(groupId);
		ncbjApplicationCorrectiveActionImpl.setCompanyId(companyId);
		ncbjApplicationCorrectiveActionImpl.setUserId(userId);

		if (userName == null) {
			ncbjApplicationCorrectiveActionImpl.setUserName("");
		}
		else {
			ncbjApplicationCorrectiveActionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncbjApplicationCorrectiveActionImpl.setCreateDate(null);
		}
		else {
			ncbjApplicationCorrectiveActionImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncbjApplicationCorrectiveActionImpl.setModifiedDate(null);
		}
		else {
			ncbjApplicationCorrectiveActionImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (caseId == null) {
			ncbjApplicationCorrectiveActionImpl.setCaseId("");
		}
		else {
			ncbjApplicationCorrectiveActionImpl.setCaseId(caseId);
		}

		ncbjApplicationCorrectiveActionImpl.setPreApprovalLetterId(
			preApprovalLetterId);

		ncbjApplicationCorrectiveActionImpl.resetOriginalValues();

		return ncbjApplicationCorrectiveActionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncbjAppCorrActionId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();

		preApprovalLetterId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ncbjAppCorrActionId);

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

		objectOutput.writeLong(preApprovalLetterId);
	}

	public long ncbjAppCorrActionId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public long preApprovalLetterId;

}