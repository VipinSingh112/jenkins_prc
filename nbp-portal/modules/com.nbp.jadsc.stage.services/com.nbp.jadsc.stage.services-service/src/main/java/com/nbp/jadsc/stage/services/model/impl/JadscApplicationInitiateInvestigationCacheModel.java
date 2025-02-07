/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jadsc.stage.services.model.JadscApplicationInitiateInvestigation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JadscApplicationInitiateInvestigation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JadscApplicationInitiateInvestigationCacheModel
	implements CacheModel<JadscApplicationInitiateInvestigation>,
			   Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof
				JadscApplicationInitiateInvestigationCacheModel)) {

			return false;
		}

		JadscApplicationInitiateInvestigationCacheModel
			jadscApplicationInitiateInvestigationCacheModel =
				(JadscApplicationInitiateInvestigationCacheModel)object;

		if (jadscAppliInvestiId ==
				jadscApplicationInitiateInvestigationCacheModel.
					jadscAppliInvestiId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jadscAppliInvestiId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{jadscAppliInvestiId=");
		sb.append(jadscAppliInvestiId);
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
		sb.append(", dateOfIniInvest=");
		sb.append(dateOfIniInvest);
		sb.append(", outcome=");
		sb.append(outcome);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JadscApplicationInitiateInvestigation toEntityModel() {
		JadscApplicationInitiateInvestigationImpl
			jadscApplicationInitiateInvestigationImpl =
				new JadscApplicationInitiateInvestigationImpl();

		jadscApplicationInitiateInvestigationImpl.setJadscAppliInvestiId(
			jadscAppliInvestiId);
		jadscApplicationInitiateInvestigationImpl.setGroupId(groupId);
		jadscApplicationInitiateInvestigationImpl.setCompanyId(companyId);
		jadscApplicationInitiateInvestigationImpl.setUserId(userId);

		if (userName == null) {
			jadscApplicationInitiateInvestigationImpl.setUserName("");
		}
		else {
			jadscApplicationInitiateInvestigationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jadscApplicationInitiateInvestigationImpl.setCreateDate(null);
		}
		else {
			jadscApplicationInitiateInvestigationImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jadscApplicationInitiateInvestigationImpl.setModifiedDate(null);
		}
		else {
			jadscApplicationInitiateInvestigationImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (dateOfIniInvest == Long.MIN_VALUE) {
			jadscApplicationInitiateInvestigationImpl.setDateOfIniInvest(null);
		}
		else {
			jadscApplicationInitiateInvestigationImpl.setDateOfIniInvest(
				new Date(dateOfIniInvest));
		}

		if (outcome == null) {
			jadscApplicationInitiateInvestigationImpl.setOutcome("");
		}
		else {
			jadscApplicationInitiateInvestigationImpl.setOutcome(outcome);
		}

		if (caseId == null) {
			jadscApplicationInitiateInvestigationImpl.setCaseId("");
		}
		else {
			jadscApplicationInitiateInvestigationImpl.setCaseId(caseId);
		}

		jadscApplicationInitiateInvestigationImpl.resetOriginalValues();

		return jadscApplicationInitiateInvestigationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		jadscAppliInvestiId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		dateOfIniInvest = objectInput.readLong();
		outcome = objectInput.readUTF();
		caseId = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(jadscAppliInvestiId);

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
		objectOutput.writeLong(dateOfIniInvest);

		if (outcome == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(outcome);
		}

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}
	}

	public long jadscAppliInvestiId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long dateOfIniInvest;
	public String outcome;
	public String caseId;

}