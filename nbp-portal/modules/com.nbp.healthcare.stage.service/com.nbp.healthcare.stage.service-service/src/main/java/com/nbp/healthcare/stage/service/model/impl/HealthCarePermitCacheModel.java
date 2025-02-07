/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.healthcare.stage.service.model.HealthCarePermit;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing HealthCarePermit in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HealthCarePermitCacheModel
	implements CacheModel<HealthCarePermit>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof HealthCarePermitCacheModel)) {
			return false;
		}

		HealthCarePermitCacheModel healthCarePermitCacheModel =
			(HealthCarePermitCacheModel)object;

		if (healthPermitId == healthCarePermitCacheModel.healthPermitId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, healthPermitId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{healthPermitId=");
		sb.append(healthPermitId);
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
		sb.append(", permitTransaction=");
		sb.append(permitTransaction);
		sb.append(", nameofApplicant=");
		sb.append(nameofApplicant);
		sb.append(", category=");
		sb.append(category);
		sb.append(", pirPermt=");
		sb.append(pirPermt);
		sb.append(", bonafideHC=");
		sb.append(bonafideHC);
		sb.append(", tariffCode=");
		sb.append(tariffCode);
		sb.append(", dateofIssue=");
		sb.append(dateofIssue);
		sb.append(", pirPermitFileEntryId=");
		sb.append(pirPermitFileEntryId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public HealthCarePermit toEntityModel() {
		HealthCarePermitImpl healthCarePermitImpl = new HealthCarePermitImpl();

		healthCarePermitImpl.setHealthPermitId(healthPermitId);
		healthCarePermitImpl.setGroupId(groupId);
		healthCarePermitImpl.setCompanyId(companyId);
		healthCarePermitImpl.setUserId(userId);

		if (userName == null) {
			healthCarePermitImpl.setUserName("");
		}
		else {
			healthCarePermitImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			healthCarePermitImpl.setCreateDate(null);
		}
		else {
			healthCarePermitImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			healthCarePermitImpl.setModifiedDate(null);
		}
		else {
			healthCarePermitImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			healthCarePermitImpl.setCaseId("");
		}
		else {
			healthCarePermitImpl.setCaseId(caseId);
		}

		if (permitTransaction == null) {
			healthCarePermitImpl.setPermitTransaction("");
		}
		else {
			healthCarePermitImpl.setPermitTransaction(permitTransaction);
		}

		if (nameofApplicant == null) {
			healthCarePermitImpl.setNameofApplicant("");
		}
		else {
			healthCarePermitImpl.setNameofApplicant(nameofApplicant);
		}

		if (category == null) {
			healthCarePermitImpl.setCategory("");
		}
		else {
			healthCarePermitImpl.setCategory(category);
		}

		if (pirPermt == null) {
			healthCarePermitImpl.setPirPermt("");
		}
		else {
			healthCarePermitImpl.setPirPermt(pirPermt);
		}

		if (bonafideHC == null) {
			healthCarePermitImpl.setBonafideHC("");
		}
		else {
			healthCarePermitImpl.setBonafideHC(bonafideHC);
		}

		if (tariffCode == null) {
			healthCarePermitImpl.setTariffCode("");
		}
		else {
			healthCarePermitImpl.setTariffCode(tariffCode);
		}

		if (dateofIssue == Long.MIN_VALUE) {
			healthCarePermitImpl.setDateofIssue(null);
		}
		else {
			healthCarePermitImpl.setDateofIssue(new Date(dateofIssue));
		}

		healthCarePermitImpl.setPirPermitFileEntryId(pirPermitFileEntryId);

		healthCarePermitImpl.resetOriginalValues();

		return healthCarePermitImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		healthPermitId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		permitTransaction = objectInput.readUTF();
		nameofApplicant = objectInput.readUTF();
		category = objectInput.readUTF();
		pirPermt = objectInput.readUTF();
		bonafideHC = objectInput.readUTF();
		tariffCode = objectInput.readUTF();
		dateofIssue = objectInput.readLong();

		pirPermitFileEntryId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(healthPermitId);

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

		if (permitTransaction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitTransaction);
		}

		if (nameofApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameofApplicant);
		}

		if (category == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(category);
		}

		if (pirPermt == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pirPermt);
		}

		if (bonafideHC == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonafideHC);
		}

		if (tariffCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tariffCode);
		}

		objectOutput.writeLong(dateofIssue);

		objectOutput.writeLong(pirPermitFileEntryId);
	}

	public long healthPermitId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public String permitTransaction;
	public String nameofApplicant;
	public String category;
	public String pirPermt;
	public String bonafideHC;
	public String tariffCode;
	public long dateofIssue;
	public long pirPermitFileEntryId;

}