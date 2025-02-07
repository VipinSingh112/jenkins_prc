/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.stages.services.model.OsiApplicationPermit;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiApplicationPermit in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiApplicationPermitCacheModel
	implements CacheModel<OsiApplicationPermit>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OsiApplicationPermitCacheModel)) {
			return false;
		}

		OsiApplicationPermitCacheModel osiApplicationPermitCacheModel =
			(OsiApplicationPermitCacheModel)object;

		if (osiApplicationPermitId ==
				osiApplicationPermitCacheModel.osiApplicationPermitId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiApplicationPermitId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{osiApplicationPermitId=");
		sb.append(osiApplicationPermitId);
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
		sb.append(", decision=");
		sb.append(decision);
		sb.append(", dateOfDecision=");
		sb.append(dateOfDecision);
		sb.append(", dateOfIssue=");
		sb.append(dateOfIssue);
		sb.append(", dateOfExpiration=");
		sb.append(dateOfExpiration);
		sb.append(", permitNumber=");
		sb.append(permitNumber);
		sb.append(", fileEntryId=");
		sb.append(fileEntryId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OsiApplicationPermit toEntityModel() {
		OsiApplicationPermitImpl osiApplicationPermitImpl =
			new OsiApplicationPermitImpl();

		osiApplicationPermitImpl.setOsiApplicationPermitId(
			osiApplicationPermitId);
		osiApplicationPermitImpl.setGroupId(groupId);
		osiApplicationPermitImpl.setCompanyId(companyId);
		osiApplicationPermitImpl.setUserId(userId);

		if (userName == null) {
			osiApplicationPermitImpl.setUserName("");
		}
		else {
			osiApplicationPermitImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiApplicationPermitImpl.setCreateDate(null);
		}
		else {
			osiApplicationPermitImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiApplicationPermitImpl.setModifiedDate(null);
		}
		else {
			osiApplicationPermitImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			osiApplicationPermitImpl.setCaseId("");
		}
		else {
			osiApplicationPermitImpl.setCaseId(caseId);
		}

		if (decision == null) {
			osiApplicationPermitImpl.setDecision("");
		}
		else {
			osiApplicationPermitImpl.setDecision(decision);
		}

		if (dateOfDecision == Long.MIN_VALUE) {
			osiApplicationPermitImpl.setDateOfDecision(null);
		}
		else {
			osiApplicationPermitImpl.setDateOfDecision(
				new Date(dateOfDecision));
		}

		if (dateOfIssue == Long.MIN_VALUE) {
			osiApplicationPermitImpl.setDateOfIssue(null);
		}
		else {
			osiApplicationPermitImpl.setDateOfIssue(new Date(dateOfIssue));
		}

		if (dateOfExpiration == Long.MIN_VALUE) {
			osiApplicationPermitImpl.setDateOfExpiration(null);
		}
		else {
			osiApplicationPermitImpl.setDateOfExpiration(
				new Date(dateOfExpiration));
		}

		if (permitNumber == null) {
			osiApplicationPermitImpl.setPermitNumber("");
		}
		else {
			osiApplicationPermitImpl.setPermitNumber(permitNumber);
		}

		if (fileEntryId == null) {
			osiApplicationPermitImpl.setFileEntryId("");
		}
		else {
			osiApplicationPermitImpl.setFileEntryId(fileEntryId);
		}

		osiApplicationPermitImpl.resetOriginalValues();

		return osiApplicationPermitImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		osiApplicationPermitId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		decision = objectInput.readUTF();
		dateOfDecision = objectInput.readLong();
		dateOfIssue = objectInput.readLong();
		dateOfExpiration = objectInput.readLong();
		permitNumber = objectInput.readUTF();
		fileEntryId = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(osiApplicationPermitId);

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

		if (decision == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(decision);
		}

		objectOutput.writeLong(dateOfDecision);
		objectOutput.writeLong(dateOfIssue);
		objectOutput.writeLong(dateOfExpiration);

		if (permitNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitNumber);
		}

		if (fileEntryId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fileEntryId);
		}
	}

	public long osiApplicationPermitId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public String decision;
	public long dateOfDecision;
	public long dateOfIssue;
	public long dateOfExpiration;
	public String permitNumber;
	public String fileEntryId;

}