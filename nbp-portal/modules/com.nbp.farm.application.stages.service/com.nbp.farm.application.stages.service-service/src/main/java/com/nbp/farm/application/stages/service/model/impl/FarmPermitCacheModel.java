/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.farm.application.stages.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.farm.application.stages.service.model.FarmPermit;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FarmPermit in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FarmPermitCacheModel
	implements CacheModel<FarmPermit>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FarmPermitCacheModel)) {
			return false;
		}

		FarmPermitCacheModel farmPermitCacheModel =
			(FarmPermitCacheModel)object;

		if (farmPermitId == farmPermitCacheModel.farmPermitId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, farmPermitId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{farmPermitId=");
		sb.append(farmPermitId);
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
		sb.append(", duration=");
		sb.append(duration);
		sb.append(", dateofIssue=");
		sb.append(dateofIssue);
		sb.append(", dateOfExpiration=");
		sb.append(dateOfExpiration);
		sb.append(", pirCertificateNUmber=");
		sb.append(pirCertificateNUmber);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FarmPermit toEntityModel() {
		FarmPermitImpl farmPermitImpl = new FarmPermitImpl();

		farmPermitImpl.setFarmPermitId(farmPermitId);
		farmPermitImpl.setGroupId(groupId);
		farmPermitImpl.setCompanyId(companyId);
		farmPermitImpl.setUserId(userId);

		if (userName == null) {
			farmPermitImpl.setUserName("");
		}
		else {
			farmPermitImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			farmPermitImpl.setCreateDate(null);
		}
		else {
			farmPermitImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			farmPermitImpl.setModifiedDate(null);
		}
		else {
			farmPermitImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			farmPermitImpl.setCaseId("");
		}
		else {
			farmPermitImpl.setCaseId(caseId);
		}

		if (pirPermtNumber == null) {
			farmPermitImpl.setPirPermtNumber("");
		}
		else {
			farmPermitImpl.setPirPermtNumber(pirPermtNumber);
		}

		if (duration == null) {
			farmPermitImpl.setDuration("");
		}
		else {
			farmPermitImpl.setDuration(duration);
		}

		if (dateofIssue == Long.MIN_VALUE) {
			farmPermitImpl.setDateofIssue(null);
		}
		else {
			farmPermitImpl.setDateofIssue(new Date(dateofIssue));
		}

		if (dateOfExpiration == Long.MIN_VALUE) {
			farmPermitImpl.setDateOfExpiration(null);
		}
		else {
			farmPermitImpl.setDateOfExpiration(new Date(dateOfExpiration));
		}

		farmPermitImpl.setPirCertificateNUmber(pirCertificateNUmber);

		farmPermitImpl.resetOriginalValues();

		return farmPermitImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		farmPermitId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		pirPermtNumber = objectInput.readUTF();
		duration = objectInput.readUTF();
		dateofIssue = objectInput.readLong();
		dateOfExpiration = objectInput.readLong();

		pirCertificateNUmber = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(farmPermitId);

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

		if (duration == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(duration);
		}

		objectOutput.writeLong(dateofIssue);
		objectOutput.writeLong(dateOfExpiration);

		objectOutput.writeLong(pirCertificateNUmber);
	}

	public long farmPermitId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public String pirPermtNumber;
	public String duration;
	public long dateofIssue;
	public long dateOfExpiration;
	public long pirCertificateNUmber;

}