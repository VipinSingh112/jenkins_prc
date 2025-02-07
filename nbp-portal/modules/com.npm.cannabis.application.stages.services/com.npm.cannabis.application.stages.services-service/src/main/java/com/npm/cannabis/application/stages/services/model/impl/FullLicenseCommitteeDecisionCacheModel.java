/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.npm.cannabis.application.stages.services.model.FullLicenseCommitteeDecision;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FullLicenseCommitteeDecision in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FullLicenseCommitteeDecisionCacheModel
	implements CacheModel<FullLicenseCommitteeDecision>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FullLicenseCommitteeDecisionCacheModel)) {
			return false;
		}

		FullLicenseCommitteeDecisionCacheModel
			fullLicenseCommitteeDecisionCacheModel =
				(FullLicenseCommitteeDecisionCacheModel)object;

		if (fullLicenseCommitteeDecisionId ==
				fullLicenseCommitteeDecisionCacheModel.
					fullLicenseCommitteeDecisionId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fullLicenseCommitteeDecisionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{fullLicenseCommitteeDecisionId=");
		sb.append(fullLicenseCommitteeDecisionId);
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
		sb.append(", licenseFeeDue=");
		sb.append(licenseFeeDue);
		sb.append(", bondFeeDue=");
		sb.append(bondFeeDue);
		sb.append(", committeeDecision=");
		sb.append(committeeDecision);
		sb.append(", totalAmountDue=");
		sb.append(totalAmountDue);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FullLicenseCommitteeDecision toEntityModel() {
		FullLicenseCommitteeDecisionImpl fullLicenseCommitteeDecisionImpl =
			new FullLicenseCommitteeDecisionImpl();

		fullLicenseCommitteeDecisionImpl.setFullLicenseCommitteeDecisionId(
			fullLicenseCommitteeDecisionId);
		fullLicenseCommitteeDecisionImpl.setGroupId(groupId);
		fullLicenseCommitteeDecisionImpl.setCompanyId(companyId);
		fullLicenseCommitteeDecisionImpl.setUserId(userId);

		if (userName == null) {
			fullLicenseCommitteeDecisionImpl.setUserName("");
		}
		else {
			fullLicenseCommitteeDecisionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			fullLicenseCommitteeDecisionImpl.setCreateDate(null);
		}
		else {
			fullLicenseCommitteeDecisionImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			fullLicenseCommitteeDecisionImpl.setModifiedDate(null);
		}
		else {
			fullLicenseCommitteeDecisionImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (caseId == null) {
			fullLicenseCommitteeDecisionImpl.setCaseId("");
		}
		else {
			fullLicenseCommitteeDecisionImpl.setCaseId(caseId);
		}

		if (licenseFeeDue == null) {
			fullLicenseCommitteeDecisionImpl.setLicenseFeeDue("");
		}
		else {
			fullLicenseCommitteeDecisionImpl.setLicenseFeeDue(licenseFeeDue);
		}

		if (bondFeeDue == null) {
			fullLicenseCommitteeDecisionImpl.setBondFeeDue("");
		}
		else {
			fullLicenseCommitteeDecisionImpl.setBondFeeDue(bondFeeDue);
		}

		if (committeeDecision == null) {
			fullLicenseCommitteeDecisionImpl.setCommitteeDecision("");
		}
		else {
			fullLicenseCommitteeDecisionImpl.setCommitteeDecision(
				committeeDecision);
		}

		fullLicenseCommitteeDecisionImpl.setTotalAmountDue(totalAmountDue);

		fullLicenseCommitteeDecisionImpl.resetOriginalValues();

		return fullLicenseCommitteeDecisionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fullLicenseCommitteeDecisionId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		licenseFeeDue = objectInput.readUTF();
		bondFeeDue = objectInput.readUTF();
		committeeDecision = objectInput.readUTF();

		totalAmountDue = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(fullLicenseCommitteeDecisionId);

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

		if (licenseFeeDue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(licenseFeeDue);
		}

		if (bondFeeDue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bondFeeDue);
		}

		if (committeeDecision == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(committeeDecision);
		}

		objectOutput.writeLong(totalAmountDue);
	}

	public long fullLicenseCommitteeDecisionId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public String licenseFeeDue;
	public String bondFeeDue;
	public String committeeDecision;
	public long totalAmountDue;

}