/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.stage.services.model.OsiInsoIIssuanceOfReport;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiInsoIIssuanceOfReport in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiInsoIIssuanceOfReportCacheModel
	implements CacheModel<OsiInsoIIssuanceOfReport>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OsiInsoIIssuanceOfReportCacheModel)) {
			return false;
		}

		OsiInsoIIssuanceOfReportCacheModel osiInsoIIssuanceOfReportCacheModel =
			(OsiInsoIIssuanceOfReportCacheModel)object;

		if (osiInsoIIssuanceOfReportId ==
				osiInsoIIssuanceOfReportCacheModel.osiInsoIIssuanceOfReportId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiInsoIIssuanceOfReportId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{osiInsoIIssuanceOfReportId=");
		sb.append(osiInsoIIssuanceOfReportId);
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
		sb.append(", dateOfReport=");
		sb.append(dateOfReport);
		sb.append(", nameOfApplicant=");
		sb.append(nameOfApplicant);
		sb.append(", typeOfApplicant=");
		sb.append(typeOfApplicant);
		sb.append(", decision=");
		sb.append(decision);
		sb.append(", docFileEntry=");
		sb.append(docFileEntry);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OsiInsoIIssuanceOfReport toEntityModel() {
		OsiInsoIIssuanceOfReportImpl osiInsoIIssuanceOfReportImpl =
			new OsiInsoIIssuanceOfReportImpl();

		osiInsoIIssuanceOfReportImpl.setOsiInsoIIssuanceOfReportId(
			osiInsoIIssuanceOfReportId);
		osiInsoIIssuanceOfReportImpl.setGroupId(groupId);
		osiInsoIIssuanceOfReportImpl.setCompanyId(companyId);
		osiInsoIIssuanceOfReportImpl.setUserId(userId);

		if (userName == null) {
			osiInsoIIssuanceOfReportImpl.setUserName("");
		}
		else {
			osiInsoIIssuanceOfReportImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiInsoIIssuanceOfReportImpl.setCreateDate(null);
		}
		else {
			osiInsoIIssuanceOfReportImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiInsoIIssuanceOfReportImpl.setModifiedDate(null);
		}
		else {
			osiInsoIIssuanceOfReportImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (caseId == null) {
			osiInsoIIssuanceOfReportImpl.setCaseId("");
		}
		else {
			osiInsoIIssuanceOfReportImpl.setCaseId(caseId);
		}

		if (dateOfReport == Long.MIN_VALUE) {
			osiInsoIIssuanceOfReportImpl.setDateOfReport(null);
		}
		else {
			osiInsoIIssuanceOfReportImpl.setDateOfReport(
				new Date(dateOfReport));
		}

		if (nameOfApplicant == null) {
			osiInsoIIssuanceOfReportImpl.setNameOfApplicant("");
		}
		else {
			osiInsoIIssuanceOfReportImpl.setNameOfApplicant(nameOfApplicant);
		}

		if (typeOfApplicant == null) {
			osiInsoIIssuanceOfReportImpl.setTypeOfApplicant("");
		}
		else {
			osiInsoIIssuanceOfReportImpl.setTypeOfApplicant(typeOfApplicant);
		}

		if (decision == null) {
			osiInsoIIssuanceOfReportImpl.setDecision("");
		}
		else {
			osiInsoIIssuanceOfReportImpl.setDecision(decision);
		}

		osiInsoIIssuanceOfReportImpl.setDocFileEntry(docFileEntry);

		osiInsoIIssuanceOfReportImpl.resetOriginalValues();

		return osiInsoIIssuanceOfReportImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		osiInsoIIssuanceOfReportId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		dateOfReport = objectInput.readLong();
		nameOfApplicant = objectInput.readUTF();
		typeOfApplicant = objectInput.readUTF();
		decision = objectInput.readUTF();

		docFileEntry = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(osiInsoIIssuanceOfReportId);

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

		objectOutput.writeLong(dateOfReport);

		if (nameOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfApplicant);
		}

		if (typeOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfApplicant);
		}

		if (decision == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(decision);
		}

		objectOutput.writeLong(docFileEntry);
	}

	public long osiInsoIIssuanceOfReportId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public long dateOfReport;
	public String nameOfApplicant;
	public String typeOfApplicant;
	public String decision;
	public long docFileEntry;

}