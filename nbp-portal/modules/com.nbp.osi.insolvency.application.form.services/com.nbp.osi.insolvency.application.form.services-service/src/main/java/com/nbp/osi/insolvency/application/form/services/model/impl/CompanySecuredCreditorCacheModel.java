/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.CompanySecuredCreditor;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CompanySecuredCreditor in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CompanySecuredCreditorCacheModel
	implements CacheModel<CompanySecuredCreditor>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CompanySecuredCreditorCacheModel)) {
			return false;
		}

		CompanySecuredCreditorCacheModel companySecuredCreditorCacheModel =
			(CompanySecuredCreditorCacheModel)object;

		if (companySecuredCreditorId ==
				companySecuredCreditorCacheModel.companySecuredCreditorId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, companySecuredCreditorId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{companySecuredCreditorId=");
		sb.append(companySecuredCreditorId);
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
		sb.append(", securedCreditor=");
		sb.append(securedCreditor);
		sb.append(", securedSecurity=");
		sb.append(securedSecurity);
		sb.append(", securedPurpose=");
		sb.append(securedPurpose);
		sb.append(", securedLiabilty=");
		sb.append(securedLiabilty);
		sb.append(", comSecurityValue=");
		sb.append(comSecurityValue);
		sb.append(", comSecurityCounter=");
		sb.append(comSecurityCounter);
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CompanySecuredCreditor toEntityModel() {
		CompanySecuredCreditorImpl companySecuredCreditorImpl =
			new CompanySecuredCreditorImpl();

		companySecuredCreditorImpl.setCompanySecuredCreditorId(
			companySecuredCreditorId);
		companySecuredCreditorImpl.setGroupId(groupId);
		companySecuredCreditorImpl.setCompanyId(companyId);
		companySecuredCreditorImpl.setUserId(userId);

		if (userName == null) {
			companySecuredCreditorImpl.setUserName("");
		}
		else {
			companySecuredCreditorImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			companySecuredCreditorImpl.setCreateDate(null);
		}
		else {
			companySecuredCreditorImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			companySecuredCreditorImpl.setModifiedDate(null);
		}
		else {
			companySecuredCreditorImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (securedCreditor == null) {
			companySecuredCreditorImpl.setSecuredCreditor("");
		}
		else {
			companySecuredCreditorImpl.setSecuredCreditor(securedCreditor);
		}

		if (securedSecurity == null) {
			companySecuredCreditorImpl.setSecuredSecurity("");
		}
		else {
			companySecuredCreditorImpl.setSecuredSecurity(securedSecurity);
		}

		if (securedPurpose == null) {
			companySecuredCreditorImpl.setSecuredPurpose("");
		}
		else {
			companySecuredCreditorImpl.setSecuredPurpose(securedPurpose);
		}

		if (securedLiabilty == null) {
			companySecuredCreditorImpl.setSecuredLiabilty("");
		}
		else {
			companySecuredCreditorImpl.setSecuredLiabilty(securedLiabilty);
		}

		if (comSecurityValue == null) {
			companySecuredCreditorImpl.setComSecurityValue("");
		}
		else {
			companySecuredCreditorImpl.setComSecurityValue(comSecurityValue);
		}

		if (comSecurityCounter == null) {
			companySecuredCreditorImpl.setComSecurityCounter("");
		}
		else {
			companySecuredCreditorImpl.setComSecurityCounter(
				comSecurityCounter);
		}

		companySecuredCreditorImpl.setOsiInsolvencyId(osiInsolvencyId);

		companySecuredCreditorImpl.resetOriginalValues();

		return companySecuredCreditorImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		companySecuredCreditorId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		securedCreditor = objectInput.readUTF();
		securedSecurity = objectInput.readUTF();
		securedPurpose = objectInput.readUTF();
		securedLiabilty = objectInput.readUTF();
		comSecurityValue = objectInput.readUTF();
		comSecurityCounter = objectInput.readUTF();

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(companySecuredCreditorId);

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

		if (securedCreditor == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securedCreditor);
		}

		if (securedSecurity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securedSecurity);
		}

		if (securedPurpose == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securedPurpose);
		}

		if (securedLiabilty == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securedLiabilty);
		}

		if (comSecurityValue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(comSecurityValue);
		}

		if (comSecurityCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(comSecurityCounter);
		}

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long companySecuredCreditorId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String securedCreditor;
	public String securedSecurity;
	public String securedPurpose;
	public String securedLiabilty;
	public String comSecurityValue;
	public String comSecurityCounter;
	public long osiInsolvencyId;

}