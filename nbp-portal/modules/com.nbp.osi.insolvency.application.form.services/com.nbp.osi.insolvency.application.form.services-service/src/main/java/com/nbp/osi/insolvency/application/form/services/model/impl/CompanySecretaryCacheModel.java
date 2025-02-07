/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.CompanySecretary;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CompanySecretary in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CompanySecretaryCacheModel
	implements CacheModel<CompanySecretary>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CompanySecretaryCacheModel)) {
			return false;
		}

		CompanySecretaryCacheModel companySecretaryCacheModel =
			(CompanySecretaryCacheModel)object;

		if (companySecretaryId ==
				companySecretaryCacheModel.companySecretaryId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, companySecretaryId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{companySecretaryId=");
		sb.append(companySecretaryId);
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
		sb.append(", secretaryName=");
		sb.append(secretaryName);
		sb.append(", secretaryDate=");
		sb.append(secretaryDate);
		sb.append(", secretaryOccupation=");
		sb.append(secretaryOccupation);
		sb.append(", secretaryContactNum=");
		sb.append(secretaryContactNum);
		sb.append(", secretaryAddress=");
		sb.append(secretaryAddress);
		sb.append(", secretaryCounter=");
		sb.append(secretaryCounter);
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CompanySecretary toEntityModel() {
		CompanySecretaryImpl companySecretaryImpl = new CompanySecretaryImpl();

		companySecretaryImpl.setCompanySecretaryId(companySecretaryId);
		companySecretaryImpl.setGroupId(groupId);
		companySecretaryImpl.setCompanyId(companyId);
		companySecretaryImpl.setUserId(userId);

		if (userName == null) {
			companySecretaryImpl.setUserName("");
		}
		else {
			companySecretaryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			companySecretaryImpl.setCreateDate(null);
		}
		else {
			companySecretaryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			companySecretaryImpl.setModifiedDate(null);
		}
		else {
			companySecretaryImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (secretaryName == null) {
			companySecretaryImpl.setSecretaryName("");
		}
		else {
			companySecretaryImpl.setSecretaryName(secretaryName);
		}

		if (secretaryDate == Long.MIN_VALUE) {
			companySecretaryImpl.setSecretaryDate(null);
		}
		else {
			companySecretaryImpl.setSecretaryDate(new Date(secretaryDate));
		}

		if (secretaryOccupation == null) {
			companySecretaryImpl.setSecretaryOccupation("");
		}
		else {
			companySecretaryImpl.setSecretaryOccupation(secretaryOccupation);
		}

		if (secretaryContactNum == null) {
			companySecretaryImpl.setSecretaryContactNum("");
		}
		else {
			companySecretaryImpl.setSecretaryContactNum(secretaryContactNum);
		}

		if (secretaryAddress == null) {
			companySecretaryImpl.setSecretaryAddress("");
		}
		else {
			companySecretaryImpl.setSecretaryAddress(secretaryAddress);
		}

		if (secretaryCounter == null) {
			companySecretaryImpl.setSecretaryCounter("");
		}
		else {
			companySecretaryImpl.setSecretaryCounter(secretaryCounter);
		}

		companySecretaryImpl.setOsiInsolvencyId(osiInsolvencyId);

		companySecretaryImpl.resetOriginalValues();

		return companySecretaryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		companySecretaryId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		secretaryName = objectInput.readUTF();
		secretaryDate = objectInput.readLong();
		secretaryOccupation = objectInput.readUTF();
		secretaryContactNum = objectInput.readUTF();
		secretaryAddress = objectInput.readUTF();
		secretaryCounter = objectInput.readUTF();

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(companySecretaryId);

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

		if (secretaryName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secretaryName);
		}

		objectOutput.writeLong(secretaryDate);

		if (secretaryOccupation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secretaryOccupation);
		}

		if (secretaryContactNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secretaryContactNum);
		}

		if (secretaryAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secretaryAddress);
		}

		if (secretaryCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secretaryCounter);
		}

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long companySecretaryId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String secretaryName;
	public long secretaryDate;
	public String secretaryOccupation;
	public String secretaryContactNum;
	public String secretaryAddress;
	public String secretaryCounter;
	public long osiInsolvencyId;

}