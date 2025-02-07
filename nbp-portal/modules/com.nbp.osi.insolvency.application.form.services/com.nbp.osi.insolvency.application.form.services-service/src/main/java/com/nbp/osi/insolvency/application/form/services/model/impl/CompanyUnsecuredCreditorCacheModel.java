/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.CompanyUnsecuredCreditor;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CompanyUnsecuredCreditor in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CompanyUnsecuredCreditorCacheModel
	implements CacheModel<CompanyUnsecuredCreditor>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CompanyUnsecuredCreditorCacheModel)) {
			return false;
		}

		CompanyUnsecuredCreditorCacheModel companyUnsecuredCreditorCacheModel =
			(CompanyUnsecuredCreditorCacheModel)object;

		if (companyUnsecuredCreditorId ==
				companyUnsecuredCreditorCacheModel.companyUnsecuredCreditorId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, companyUnsecuredCreditorId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{companyUnsecuredCreditorId=");
		sb.append(companyUnsecuredCreditorId);
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
		sb.append(", unsecuredCreditor=");
		sb.append(unsecuredCreditor);
		sb.append(", unsecuredDebtor=");
		sb.append(unsecuredDebtor);
		sb.append(", unsecuredPurpose=");
		sb.append(unsecuredPurpose);
		sb.append(", unsecuredLiabilty=");
		sb.append(unsecuredLiabilty);
		sb.append(", unsecuredCounter=");
		sb.append(unsecuredCounter);
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CompanyUnsecuredCreditor toEntityModel() {
		CompanyUnsecuredCreditorImpl companyUnsecuredCreditorImpl =
			new CompanyUnsecuredCreditorImpl();

		companyUnsecuredCreditorImpl.setCompanyUnsecuredCreditorId(
			companyUnsecuredCreditorId);
		companyUnsecuredCreditorImpl.setGroupId(groupId);
		companyUnsecuredCreditorImpl.setCompanyId(companyId);
		companyUnsecuredCreditorImpl.setUserId(userId);

		if (userName == null) {
			companyUnsecuredCreditorImpl.setUserName("");
		}
		else {
			companyUnsecuredCreditorImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			companyUnsecuredCreditorImpl.setCreateDate(null);
		}
		else {
			companyUnsecuredCreditorImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			companyUnsecuredCreditorImpl.setModifiedDate(null);
		}
		else {
			companyUnsecuredCreditorImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (unsecuredCreditor == null) {
			companyUnsecuredCreditorImpl.setUnsecuredCreditor("");
		}
		else {
			companyUnsecuredCreditorImpl.setUnsecuredCreditor(
				unsecuredCreditor);
		}

		if (unsecuredDebtor == null) {
			companyUnsecuredCreditorImpl.setUnsecuredDebtor("");
		}
		else {
			companyUnsecuredCreditorImpl.setUnsecuredDebtor(unsecuredDebtor);
		}

		if (unsecuredPurpose == null) {
			companyUnsecuredCreditorImpl.setUnsecuredPurpose("");
		}
		else {
			companyUnsecuredCreditorImpl.setUnsecuredPurpose(unsecuredPurpose);
		}

		if (unsecuredLiabilty == null) {
			companyUnsecuredCreditorImpl.setUnsecuredLiabilty("");
		}
		else {
			companyUnsecuredCreditorImpl.setUnsecuredLiabilty(
				unsecuredLiabilty);
		}

		if (unsecuredCounter == null) {
			companyUnsecuredCreditorImpl.setUnsecuredCounter("");
		}
		else {
			companyUnsecuredCreditorImpl.setUnsecuredCounter(unsecuredCounter);
		}

		companyUnsecuredCreditorImpl.setOsiInsolvencyId(osiInsolvencyId);

		companyUnsecuredCreditorImpl.resetOriginalValues();

		return companyUnsecuredCreditorImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		companyUnsecuredCreditorId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		unsecuredCreditor = objectInput.readUTF();
		unsecuredDebtor = objectInput.readUTF();
		unsecuredPurpose = objectInput.readUTF();
		unsecuredLiabilty = objectInput.readUTF();
		unsecuredCounter = objectInput.readUTF();

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(companyUnsecuredCreditorId);

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

		if (unsecuredCreditor == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(unsecuredCreditor);
		}

		if (unsecuredDebtor == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(unsecuredDebtor);
		}

		if (unsecuredPurpose == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(unsecuredPurpose);
		}

		if (unsecuredLiabilty == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(unsecuredLiabilty);
		}

		if (unsecuredCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(unsecuredCounter);
		}

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long companyUnsecuredCreditorId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String unsecuredCreditor;
	public String unsecuredDebtor;
	public String unsecuredPurpose;
	public String unsecuredLiabilty;
	public String unsecuredCounter;
	public long osiInsolvencyId;

}