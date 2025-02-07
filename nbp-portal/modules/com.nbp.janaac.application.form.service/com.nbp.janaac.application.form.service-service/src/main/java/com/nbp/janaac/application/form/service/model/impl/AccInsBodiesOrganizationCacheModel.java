/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AccInsBodiesOrganization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccInsBodiesOrganization in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccInsBodiesOrganizationCacheModel
	implements CacheModel<AccInsBodiesOrganization>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccInsBodiesOrganizationCacheModel)) {
			return false;
		}

		AccInsBodiesOrganizationCacheModel accInsBodiesOrganizationCacheModel =
			(AccInsBodiesOrganizationCacheModel)object;

		if (accInsBodiesOrganizationId ==
				accInsBodiesOrganizationCacheModel.accInsBodiesOrganizationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accInsBodiesOrganizationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", accInsBodiesOrganizationId=");
		sb.append(accInsBodiesOrganizationId);
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
		sb.append(", insLegalEntity=");
		sb.append(insLegalEntity);
		sb.append(", insLegalStatusEntity=");
		sb.append(insLegalStatusEntity);
		sb.append(", insBodyOrgPart=");
		sb.append(insBodyOrgPart);
		sb.append(", insPersonnelName=");
		sb.append(insPersonnelName);
		sb.append(", insPersonnelPosition=");
		sb.append(insPersonnelPosition);
		sb.append(", insStaffSize=");
		sb.append(insStaffSize);
		sb.append(", insStaffComplement=");
		sb.append(insStaffComplement);
		sb.append(", insIncomeSource=");
		sb.append(insIncomeSource);
		sb.append(", insOrgBodyType=");
		sb.append(insOrgBodyType);
		sb.append(", insBodyOwnOrgClient=");
		sb.append(insBodyOwnOrgClient);
		sb.append(", insBodyOtherOrgClient=");
		sb.append(insBodyOtherOrgClient);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AccInsBodiesOrganization toEntityModel() {
		AccInsBodiesOrganizationImpl accInsBodiesOrganizationImpl =
			new AccInsBodiesOrganizationImpl();

		if (uuid == null) {
			accInsBodiesOrganizationImpl.setUuid("");
		}
		else {
			accInsBodiesOrganizationImpl.setUuid(uuid);
		}

		accInsBodiesOrganizationImpl.setAccInsBodiesOrganizationId(
			accInsBodiesOrganizationId);
		accInsBodiesOrganizationImpl.setGroupId(groupId);
		accInsBodiesOrganizationImpl.setCompanyId(companyId);
		accInsBodiesOrganizationImpl.setUserId(userId);

		if (userName == null) {
			accInsBodiesOrganizationImpl.setUserName("");
		}
		else {
			accInsBodiesOrganizationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accInsBodiesOrganizationImpl.setCreateDate(null);
		}
		else {
			accInsBodiesOrganizationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accInsBodiesOrganizationImpl.setModifiedDate(null);
		}
		else {
			accInsBodiesOrganizationImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (insLegalEntity == null) {
			accInsBodiesOrganizationImpl.setInsLegalEntity("");
		}
		else {
			accInsBodiesOrganizationImpl.setInsLegalEntity(insLegalEntity);
		}

		if (insLegalStatusEntity == null) {
			accInsBodiesOrganizationImpl.setInsLegalStatusEntity("");
		}
		else {
			accInsBodiesOrganizationImpl.setInsLegalStatusEntity(
				insLegalStatusEntity);
		}

		if (insBodyOrgPart == null) {
			accInsBodiesOrganizationImpl.setInsBodyOrgPart("");
		}
		else {
			accInsBodiesOrganizationImpl.setInsBodyOrgPart(insBodyOrgPart);
		}

		if (insPersonnelName == null) {
			accInsBodiesOrganizationImpl.setInsPersonnelName("");
		}
		else {
			accInsBodiesOrganizationImpl.setInsPersonnelName(insPersonnelName);
		}

		if (insPersonnelPosition == null) {
			accInsBodiesOrganizationImpl.setInsPersonnelPosition("");
		}
		else {
			accInsBodiesOrganizationImpl.setInsPersonnelPosition(
				insPersonnelPosition);
		}

		if (insStaffSize == null) {
			accInsBodiesOrganizationImpl.setInsStaffSize("");
		}
		else {
			accInsBodiesOrganizationImpl.setInsStaffSize(insStaffSize);
		}

		if (insStaffComplement == null) {
			accInsBodiesOrganizationImpl.setInsStaffComplement("");
		}
		else {
			accInsBodiesOrganizationImpl.setInsStaffComplement(
				insStaffComplement);
		}

		if (insIncomeSource == null) {
			accInsBodiesOrganizationImpl.setInsIncomeSource("");
		}
		else {
			accInsBodiesOrganizationImpl.setInsIncomeSource(insIncomeSource);
		}

		if (insOrgBodyType == null) {
			accInsBodiesOrganizationImpl.setInsOrgBodyType("");
		}
		else {
			accInsBodiesOrganizationImpl.setInsOrgBodyType(insOrgBodyType);
		}

		if (insBodyOwnOrgClient == null) {
			accInsBodiesOrganizationImpl.setInsBodyOwnOrgClient("");
		}
		else {
			accInsBodiesOrganizationImpl.setInsBodyOwnOrgClient(
				insBodyOwnOrgClient);
		}

		if (insBodyOtherOrgClient == null) {
			accInsBodiesOrganizationImpl.setInsBodyOtherOrgClient("");
		}
		else {
			accInsBodiesOrganizationImpl.setInsBodyOtherOrgClient(
				insBodyOtherOrgClient);
		}

		accInsBodiesOrganizationImpl.setJanaacApplicationId(
			janaacApplicationId);

		accInsBodiesOrganizationImpl.resetOriginalValues();

		return accInsBodiesOrganizationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		accInsBodiesOrganizationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		insLegalEntity = objectInput.readUTF();
		insLegalStatusEntity = objectInput.readUTF();
		insBodyOrgPart = objectInput.readUTF();
		insPersonnelName = objectInput.readUTF();
		insPersonnelPosition = objectInput.readUTF();
		insStaffSize = objectInput.readUTF();
		insStaffComplement = objectInput.readUTF();
		insIncomeSource = objectInput.readUTF();
		insOrgBodyType = objectInput.readUTF();
		insBodyOwnOrgClient = objectInput.readUTF();
		insBodyOtherOrgClient = objectInput.readUTF();

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

		objectOutput.writeLong(accInsBodiesOrganizationId);

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

		if (insLegalEntity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insLegalEntity);
		}

		if (insLegalStatusEntity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insLegalStatusEntity);
		}

		if (insBodyOrgPart == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insBodyOrgPart);
		}

		if (insPersonnelName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insPersonnelName);
		}

		if (insPersonnelPosition == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insPersonnelPosition);
		}

		if (insStaffSize == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insStaffSize);
		}

		if (insStaffComplement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insStaffComplement);
		}

		if (insIncomeSource == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insIncomeSource);
		}

		if (insOrgBodyType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insOrgBodyType);
		}

		if (insBodyOwnOrgClient == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insBodyOwnOrgClient);
		}

		if (insBodyOtherOrgClient == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insBodyOtherOrgClient);
		}

		objectOutput.writeLong(janaacApplicationId);
	}

	public String uuid;
	public long accInsBodiesOrganizationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String insLegalEntity;
	public String insLegalStatusEntity;
	public String insBodyOrgPart;
	public String insPersonnelName;
	public String insPersonnelPosition;
	public String insStaffSize;
	public String insStaffComplement;
	public String insIncomeSource;
	public String insOrgBodyType;
	public String insBodyOwnOrgClient;
	public String insBodyOtherOrgClient;
	public long janaacApplicationId;

}