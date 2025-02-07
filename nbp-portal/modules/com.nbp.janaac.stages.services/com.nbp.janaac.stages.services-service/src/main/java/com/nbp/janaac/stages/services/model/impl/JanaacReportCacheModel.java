/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.stages.services.model.JanaacReport;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JanaacReport in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JanaacReportCacheModel
	implements CacheModel<JanaacReport>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JanaacReportCacheModel)) {
			return false;
		}

		JanaacReportCacheModel janaacReportCacheModel =
			(JanaacReportCacheModel)object;

		if (janaacReportId == janaacReportCacheModel.janaacReportId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, janaacReportId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{janaacReportId=");
		sb.append(janaacReportId);
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
		sb.append(", dateOfReport=");
		sb.append(dateOfReport);
		sb.append(", report=");
		sb.append(report);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JanaacReport toEntityModel() {
		JanaacReportImpl janaacReportImpl = new JanaacReportImpl();

		janaacReportImpl.setJanaacReportId(janaacReportId);
		janaacReportImpl.setGroupId(groupId);
		janaacReportImpl.setCompanyId(companyId);
		janaacReportImpl.setUserId(userId);

		if (userName == null) {
			janaacReportImpl.setUserName("");
		}
		else {
			janaacReportImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			janaacReportImpl.setCreateDate(null);
		}
		else {
			janaacReportImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			janaacReportImpl.setModifiedDate(null);
		}
		else {
			janaacReportImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (dateOfReport == Long.MIN_VALUE) {
			janaacReportImpl.setDateOfReport(null);
		}
		else {
			janaacReportImpl.setDateOfReport(new Date(dateOfReport));
		}

		if (report == null) {
			janaacReportImpl.setReport("");
		}
		else {
			janaacReportImpl.setReport(report);
		}

		if (caseId == null) {
			janaacReportImpl.setCaseId("");
		}
		else {
			janaacReportImpl.setCaseId(caseId);
		}

		janaacReportImpl.resetOriginalValues();

		return janaacReportImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		janaacReportId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		dateOfReport = objectInput.readLong();
		report = objectInput.readUTF();
		caseId = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(janaacReportId);

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
		objectOutput.writeLong(dateOfReport);

		if (report == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(report);
		}

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}
	}

	public long janaacReportId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long dateOfReport;
	public String report;
	public String caseId;

}