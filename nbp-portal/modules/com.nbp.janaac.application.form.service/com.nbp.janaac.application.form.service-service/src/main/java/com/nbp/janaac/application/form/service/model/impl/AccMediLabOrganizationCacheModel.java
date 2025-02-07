/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AccMediLabOrganization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccMediLabOrganization in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccMediLabOrganizationCacheModel
	implements CacheModel<AccMediLabOrganization>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccMediLabOrganizationCacheModel)) {
			return false;
		}

		AccMediLabOrganizationCacheModel accMediLabOrganizationCacheModel =
			(AccMediLabOrganizationCacheModel)object;

		if (accMediLabOrganizationId ==
				accMediLabOrganizationCacheModel.accMediLabOrganizationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accMediLabOrganizationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", accMediLabOrganizationId=");
		sb.append(accMediLabOrganizationId);
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
		sb.append(", laboratoryLegalEntity=");
		sb.append(laboratoryLegalEntity);
		sb.append(", legalStatus=");
		sb.append(legalStatus);
		sb.append(", laboratoryPartOfOrg=");
		sb.append(laboratoryPartOfOrg);
		sb.append(", laboratoryPartOfOrgName=");
		sb.append(laboratoryPartOfOrgName);
		sb.append(", laboratoryPartOfOrgPos=");
		sb.append(laboratoryPartOfOrgPos);
		sb.append(", nameOfAnalysts=");
		sb.append(nameOfAnalysts);
		sb.append(", majorIncomeSource=");
		sb.append(majorIncomeSource);
		sb.append(", laboratoryClients=");
		sb.append(laboratoryClients);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AccMediLabOrganization toEntityModel() {
		AccMediLabOrganizationImpl accMediLabOrganizationImpl =
			new AccMediLabOrganizationImpl();

		if (uuid == null) {
			accMediLabOrganizationImpl.setUuid("");
		}
		else {
			accMediLabOrganizationImpl.setUuid(uuid);
		}

		accMediLabOrganizationImpl.setAccMediLabOrganizationId(
			accMediLabOrganizationId);
		accMediLabOrganizationImpl.setGroupId(groupId);
		accMediLabOrganizationImpl.setCompanyId(companyId);
		accMediLabOrganizationImpl.setUserId(userId);

		if (userName == null) {
			accMediLabOrganizationImpl.setUserName("");
		}
		else {
			accMediLabOrganizationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accMediLabOrganizationImpl.setCreateDate(null);
		}
		else {
			accMediLabOrganizationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accMediLabOrganizationImpl.setModifiedDate(null);
		}
		else {
			accMediLabOrganizationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (laboratoryLegalEntity == null) {
			accMediLabOrganizationImpl.setLaboratoryLegalEntity("");
		}
		else {
			accMediLabOrganizationImpl.setLaboratoryLegalEntity(
				laboratoryLegalEntity);
		}

		if (legalStatus == null) {
			accMediLabOrganizationImpl.setLegalStatus("");
		}
		else {
			accMediLabOrganizationImpl.setLegalStatus(legalStatus);
		}

		if (laboratoryPartOfOrg == null) {
			accMediLabOrganizationImpl.setLaboratoryPartOfOrg("");
		}
		else {
			accMediLabOrganizationImpl.setLaboratoryPartOfOrg(
				laboratoryPartOfOrg);
		}

		if (laboratoryPartOfOrgName == null) {
			accMediLabOrganizationImpl.setLaboratoryPartOfOrgName("");
		}
		else {
			accMediLabOrganizationImpl.setLaboratoryPartOfOrgName(
				laboratoryPartOfOrgName);
		}

		if (laboratoryPartOfOrgPos == null) {
			accMediLabOrganizationImpl.setLaboratoryPartOfOrgPos("");
		}
		else {
			accMediLabOrganizationImpl.setLaboratoryPartOfOrgPos(
				laboratoryPartOfOrgPos);
		}

		if (nameOfAnalysts == null) {
			accMediLabOrganizationImpl.setNameOfAnalysts("");
		}
		else {
			accMediLabOrganizationImpl.setNameOfAnalysts(nameOfAnalysts);
		}

		if (majorIncomeSource == null) {
			accMediLabOrganizationImpl.setMajorIncomeSource("");
		}
		else {
			accMediLabOrganizationImpl.setMajorIncomeSource(majorIncomeSource);
		}

		if (laboratoryClients == null) {
			accMediLabOrganizationImpl.setLaboratoryClients("");
		}
		else {
			accMediLabOrganizationImpl.setLaboratoryClients(laboratoryClients);
		}

		accMediLabOrganizationImpl.setJanaacApplicationId(janaacApplicationId);

		accMediLabOrganizationImpl.resetOriginalValues();

		return accMediLabOrganizationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		accMediLabOrganizationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		laboratoryLegalEntity = objectInput.readUTF();
		legalStatus = objectInput.readUTF();
		laboratoryPartOfOrg = objectInput.readUTF();
		laboratoryPartOfOrgName = objectInput.readUTF();
		laboratoryPartOfOrgPos = objectInput.readUTF();
		nameOfAnalysts = objectInput.readUTF();
		majorIncomeSource = objectInput.readUTF();
		laboratoryClients = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(accMediLabOrganizationId);

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

		if (laboratoryLegalEntity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(laboratoryLegalEntity);
		}

		if (legalStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(legalStatus);
		}

		if (laboratoryPartOfOrg == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(laboratoryPartOfOrg);
		}

		if (laboratoryPartOfOrgName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(laboratoryPartOfOrgName);
		}

		if (laboratoryPartOfOrgPos == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(laboratoryPartOfOrgPos);
		}

		if (nameOfAnalysts == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfAnalysts);
		}

		if (majorIncomeSource == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(majorIncomeSource);
		}

		if (laboratoryClients == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(laboratoryClients);
		}

		objectOutput.writeLong(janaacApplicationId);
	}

	public String uuid;
	public long accMediLabOrganizationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String laboratoryLegalEntity;
	public String legalStatus;
	public String laboratoryPartOfOrg;
	public String laboratoryPartOfOrgName;
	public String laboratoryPartOfOrgPos;
	public String nameOfAnalysts;
	public String majorIncomeSource;
	public String laboratoryClients;
	public long janaacApplicationId;

}