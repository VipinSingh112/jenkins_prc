/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.agriculture.stages.services.model.AgriculturePermit;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AgriculturePermit in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AgriculturePermitCacheModel
	implements CacheModel<AgriculturePermit>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AgriculturePermitCacheModel)) {
			return false;
		}

		AgriculturePermitCacheModel agriculturePermitCacheModel =
			(AgriculturePermitCacheModel)object;

		if (agriculturePermitId ==
				agriculturePermitCacheModel.agriculturePermitId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, agriculturePermitId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{agriculturePermitId=");
		sb.append(agriculturePermitId);
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
		sb.append(", pirPermtNumber=");
		sb.append(pirPermtNumber);
		sb.append(", dateofIssue=");
		sb.append(dateofIssue);
		sb.append(", dateOfExpiration=");
		sb.append(dateOfExpiration);
		sb.append(", durationOfPermit=");
		sb.append(durationOfPermit);
		sb.append(", pirCertificateNUmber=");
		sb.append(pirCertificateNUmber);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AgriculturePermit toEntityModel() {
		AgriculturePermitImpl agriculturePermitImpl =
			new AgriculturePermitImpl();

		agriculturePermitImpl.setAgriculturePermitId(agriculturePermitId);
		agriculturePermitImpl.setGroupId(groupId);
		agriculturePermitImpl.setCompanyId(companyId);
		agriculturePermitImpl.setUserId(userId);

		if (userName == null) {
			agriculturePermitImpl.setUserName("");
		}
		else {
			agriculturePermitImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			agriculturePermitImpl.setCreateDate(null);
		}
		else {
			agriculturePermitImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			agriculturePermitImpl.setModifiedDate(null);
		}
		else {
			agriculturePermitImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			agriculturePermitImpl.setCaseId("");
		}
		else {
			agriculturePermitImpl.setCaseId(caseId);
		}

		if (pirPermtNumber == null) {
			agriculturePermitImpl.setPirPermtNumber("");
		}
		else {
			agriculturePermitImpl.setPirPermtNumber(pirPermtNumber);
		}

		if (dateofIssue == Long.MIN_VALUE) {
			agriculturePermitImpl.setDateofIssue(null);
		}
		else {
			agriculturePermitImpl.setDateofIssue(new Date(dateofIssue));
		}

		if (dateOfExpiration == Long.MIN_VALUE) {
			agriculturePermitImpl.setDateOfExpiration(null);
		}
		else {
			agriculturePermitImpl.setDateOfExpiration(
				new Date(dateOfExpiration));
		}

		if (durationOfPermit == null) {
			agriculturePermitImpl.setDurationOfPermit("");
		}
		else {
			agriculturePermitImpl.setDurationOfPermit(durationOfPermit);
		}

		agriculturePermitImpl.setPirCertificateNUmber(pirCertificateNUmber);

		agriculturePermitImpl.resetOriginalValues();

		return agriculturePermitImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		agriculturePermitId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		pirPermtNumber = objectInput.readUTF();
		dateofIssue = objectInput.readLong();
		dateOfExpiration = objectInput.readLong();
		durationOfPermit = objectInput.readUTF();

		pirCertificateNUmber = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(agriculturePermitId);

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

		if (pirPermtNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pirPermtNumber);
		}

		objectOutput.writeLong(dateofIssue);
		objectOutput.writeLong(dateOfExpiration);

		if (durationOfPermit == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(durationOfPermit);
		}

		objectOutput.writeLong(pirCertificateNUmber);
	}

	public long agriculturePermitId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public String pirPermtNumber;
	public long dateofIssue;
	public long dateOfExpiration;
	public String durationOfPermit;
	public long pirCertificateNUmber;

}