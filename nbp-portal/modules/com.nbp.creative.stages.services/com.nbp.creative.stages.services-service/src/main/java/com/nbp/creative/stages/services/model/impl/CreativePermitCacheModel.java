/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.creative.stages.services.model.CreativePermit;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CreativePermit in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CreativePermitCacheModel
	implements CacheModel<CreativePermit>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CreativePermitCacheModel)) {
			return false;
		}

		CreativePermitCacheModel creativePermitCacheModel =
			(CreativePermitCacheModel)object;

		if (creativePermitId == creativePermitCacheModel.creativePermitId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, creativePermitId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{creativePermitId=");
		sb.append(creativePermitId);
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
		sb.append(", pirCertificateNumber=");
		sb.append(pirCertificateNumber);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CreativePermit toEntityModel() {
		CreativePermitImpl creativePermitImpl = new CreativePermitImpl();

		creativePermitImpl.setCreativePermitId(creativePermitId);
		creativePermitImpl.setGroupId(groupId);
		creativePermitImpl.setCompanyId(companyId);
		creativePermitImpl.setUserId(userId);

		if (userName == null) {
			creativePermitImpl.setUserName("");
		}
		else {
			creativePermitImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			creativePermitImpl.setCreateDate(null);
		}
		else {
			creativePermitImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			creativePermitImpl.setModifiedDate(null);
		}
		else {
			creativePermitImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			creativePermitImpl.setCaseId("");
		}
		else {
			creativePermitImpl.setCaseId(caseId);
		}

		if (pirPermtNumber == null) {
			creativePermitImpl.setPirPermtNumber("");
		}
		else {
			creativePermitImpl.setPirPermtNumber(pirPermtNumber);
		}

		if (dateofIssue == Long.MIN_VALUE) {
			creativePermitImpl.setDateofIssue(null);
		}
		else {
			creativePermitImpl.setDateofIssue(new Date(dateofIssue));
		}

		if (dateOfExpiration == Long.MIN_VALUE) {
			creativePermitImpl.setDateOfExpiration(null);
		}
		else {
			creativePermitImpl.setDateOfExpiration(new Date(dateOfExpiration));
		}

		if (durationOfPermit == null) {
			creativePermitImpl.setDurationOfPermit("");
		}
		else {
			creativePermitImpl.setDurationOfPermit(durationOfPermit);
		}

		creativePermitImpl.setPirCertificateNumber(pirCertificateNumber);

		creativePermitImpl.resetOriginalValues();

		return creativePermitImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		creativePermitId = objectInput.readLong();

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

		pirCertificateNumber = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(creativePermitId);

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

		objectOutput.writeLong(pirCertificateNumber);
	}

	public long creativePermitId;
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
	public long pirCertificateNumber;

}