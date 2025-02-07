/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AccCerBodyPersonnel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccCerBodyPersonnel in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccCerBodyPersonnelCacheModel
	implements CacheModel<AccCerBodyPersonnel>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccCerBodyPersonnelCacheModel)) {
			return false;
		}

		AccCerBodyPersonnelCacheModel accCerBodyPersonnelCacheModel =
			(AccCerBodyPersonnelCacheModel)object;

		if (accCerBodyPersonnelId ==
				accCerBodyPersonnelCacheModel.accCerBodyPersonnelId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accCerBodyPersonnelId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", accCerBodyPersonnelId=");
		sb.append(accCerBodyPersonnelId);
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
		sb.append(", internalStaffSize=");
		sb.append(internalStaffSize);
		sb.append(", auditorsNum=");
		sb.append(auditorsNum);
		sb.append(", contractedPerNum=");
		sb.append(contractedPerNum);
		sb.append(", bodyOutsource=");
		sb.append(bodyOutsource);
		sb.append(", descSecurity=");
		sb.append(descSecurity);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AccCerBodyPersonnel toEntityModel() {
		AccCerBodyPersonnelImpl accCerBodyPersonnelImpl =
			new AccCerBodyPersonnelImpl();

		if (uuid == null) {
			accCerBodyPersonnelImpl.setUuid("");
		}
		else {
			accCerBodyPersonnelImpl.setUuid(uuid);
		}

		accCerBodyPersonnelImpl.setAccCerBodyPersonnelId(accCerBodyPersonnelId);
		accCerBodyPersonnelImpl.setGroupId(groupId);
		accCerBodyPersonnelImpl.setCompanyId(companyId);
		accCerBodyPersonnelImpl.setUserId(userId);

		if (userName == null) {
			accCerBodyPersonnelImpl.setUserName("");
		}
		else {
			accCerBodyPersonnelImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accCerBodyPersonnelImpl.setCreateDate(null);
		}
		else {
			accCerBodyPersonnelImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accCerBodyPersonnelImpl.setModifiedDate(null);
		}
		else {
			accCerBodyPersonnelImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (internalStaffSize == null) {
			accCerBodyPersonnelImpl.setInternalStaffSize("");
		}
		else {
			accCerBodyPersonnelImpl.setInternalStaffSize(internalStaffSize);
		}

		if (auditorsNum == null) {
			accCerBodyPersonnelImpl.setAuditorsNum("");
		}
		else {
			accCerBodyPersonnelImpl.setAuditorsNum(auditorsNum);
		}

		if (contractedPerNum == null) {
			accCerBodyPersonnelImpl.setContractedPerNum("");
		}
		else {
			accCerBodyPersonnelImpl.setContractedPerNum(contractedPerNum);
		}

		if (bodyOutsource == null) {
			accCerBodyPersonnelImpl.setBodyOutsource("");
		}
		else {
			accCerBodyPersonnelImpl.setBodyOutsource(bodyOutsource);
		}

		if (descSecurity == null) {
			accCerBodyPersonnelImpl.setDescSecurity("");
		}
		else {
			accCerBodyPersonnelImpl.setDescSecurity(descSecurity);
		}

		accCerBodyPersonnelImpl.setJanaacApplicationId(janaacApplicationId);

		accCerBodyPersonnelImpl.resetOriginalValues();

		return accCerBodyPersonnelImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		accCerBodyPersonnelId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		internalStaffSize = objectInput.readUTF();
		auditorsNum = objectInput.readUTF();
		contractedPerNum = objectInput.readUTF();
		bodyOutsource = objectInput.readUTF();
		descSecurity = objectInput.readUTF();

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

		objectOutput.writeLong(accCerBodyPersonnelId);

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

		if (internalStaffSize == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(internalStaffSize);
		}

		if (auditorsNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(auditorsNum);
		}

		if (contractedPerNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contractedPerNum);
		}

		if (bodyOutsource == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bodyOutsource);
		}

		if (descSecurity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(descSecurity);
		}

		objectOutput.writeLong(janaacApplicationId);
	}

	public String uuid;
	public long accCerBodyPersonnelId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String internalStaffSize;
	public String auditorsNum;
	public String contractedPerNum;
	public String bodyOutsource;
	public String descSecurity;
	public long janaacApplicationId;

}