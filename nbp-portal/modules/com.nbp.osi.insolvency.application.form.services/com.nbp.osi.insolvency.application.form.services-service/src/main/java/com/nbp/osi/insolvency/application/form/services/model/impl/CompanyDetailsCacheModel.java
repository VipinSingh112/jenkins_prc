/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.CompanyDetails;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CompanyDetails in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CompanyDetailsCacheModel
	implements CacheModel<CompanyDetails>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CompanyDetailsCacheModel)) {
			return false;
		}

		CompanyDetailsCacheModel companyDetailsCacheModel =
			(CompanyDetailsCacheModel)object;

		if (companyDetailsId == companyDetailsCacheModel.companyDetailsId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, companyDetailsId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{companyDetailsId=");
		sb.append(companyDetailsId);
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
		sb.append(", companyDate=");
		sb.append(companyDate);
		sb.append(", companyName=");
		sb.append(companyName);
		sb.append(", companyAddress=");
		sb.append(companyAddress);
		sb.append(", companyEmail=");
		sb.append(companyEmail);
		sb.append(", companyTelNum=");
		sb.append(companyTelNum);
		sb.append(", companyTrn=");
		sb.append(companyTrn);
		sb.append(", companyDateInco=");
		sb.append(companyDateInco);
		sb.append(", companyTypeOfCo=");
		sb.append(companyTypeOfCo);
		sb.append(", companyCore=");
		sb.append(companyCore);
		sb.append(", companyEmployees=");
		sb.append(companyEmployees);
		sb.append(", companyLastReturn=");
		sb.append(companyLastReturn);
		sb.append(", companyTurnover=");
		sb.append(companyTurnover);
		sb.append(", companyShares=");
		sb.append(companyShares);
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CompanyDetails toEntityModel() {
		CompanyDetailsImpl companyDetailsImpl = new CompanyDetailsImpl();

		companyDetailsImpl.setCompanyDetailsId(companyDetailsId);
		companyDetailsImpl.setGroupId(groupId);
		companyDetailsImpl.setCompanyId(companyId);
		companyDetailsImpl.setUserId(userId);

		if (userName == null) {
			companyDetailsImpl.setUserName("");
		}
		else {
			companyDetailsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			companyDetailsImpl.setCreateDate(null);
		}
		else {
			companyDetailsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			companyDetailsImpl.setModifiedDate(null);
		}
		else {
			companyDetailsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (companyDate == Long.MIN_VALUE) {
			companyDetailsImpl.setCompanyDate(null);
		}
		else {
			companyDetailsImpl.setCompanyDate(new Date(companyDate));
		}

		if (companyName == null) {
			companyDetailsImpl.setCompanyName("");
		}
		else {
			companyDetailsImpl.setCompanyName(companyName);
		}

		if (companyAddress == null) {
			companyDetailsImpl.setCompanyAddress("");
		}
		else {
			companyDetailsImpl.setCompanyAddress(companyAddress);
		}

		if (companyEmail == null) {
			companyDetailsImpl.setCompanyEmail("");
		}
		else {
			companyDetailsImpl.setCompanyEmail(companyEmail);
		}

		if (companyTelNum == null) {
			companyDetailsImpl.setCompanyTelNum("");
		}
		else {
			companyDetailsImpl.setCompanyTelNum(companyTelNum);
		}

		if (companyTrn == null) {
			companyDetailsImpl.setCompanyTrn("");
		}
		else {
			companyDetailsImpl.setCompanyTrn(companyTrn);
		}

		if (companyDateInco == Long.MIN_VALUE) {
			companyDetailsImpl.setCompanyDateInco(null);
		}
		else {
			companyDetailsImpl.setCompanyDateInco(new Date(companyDateInco));
		}

		if (companyTypeOfCo == null) {
			companyDetailsImpl.setCompanyTypeOfCo("");
		}
		else {
			companyDetailsImpl.setCompanyTypeOfCo(companyTypeOfCo);
		}

		if (companyCore == null) {
			companyDetailsImpl.setCompanyCore("");
		}
		else {
			companyDetailsImpl.setCompanyCore(companyCore);
		}

		if (companyEmployees == null) {
			companyDetailsImpl.setCompanyEmployees("");
		}
		else {
			companyDetailsImpl.setCompanyEmployees(companyEmployees);
		}

		if (companyLastReturn == Long.MIN_VALUE) {
			companyDetailsImpl.setCompanyLastReturn(null);
		}
		else {
			companyDetailsImpl.setCompanyLastReturn(
				new Date(companyLastReturn));
		}

		if (companyTurnover == null) {
			companyDetailsImpl.setCompanyTurnover("");
		}
		else {
			companyDetailsImpl.setCompanyTurnover(companyTurnover);
		}

		if (companyShares == null) {
			companyDetailsImpl.setCompanyShares("");
		}
		else {
			companyDetailsImpl.setCompanyShares(companyShares);
		}

		companyDetailsImpl.setOsiInsolvencyId(osiInsolvencyId);

		companyDetailsImpl.resetOriginalValues();

		return companyDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		companyDetailsId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		companyDate = objectInput.readLong();
		companyName = objectInput.readUTF();
		companyAddress = objectInput.readUTF();
		companyEmail = objectInput.readUTF();
		companyTelNum = objectInput.readUTF();
		companyTrn = objectInput.readUTF();
		companyDateInco = objectInput.readLong();
		companyTypeOfCo = objectInput.readUTF();
		companyCore = objectInput.readUTF();
		companyEmployees = objectInput.readUTF();
		companyLastReturn = objectInput.readLong();
		companyTurnover = objectInput.readUTF();
		companyShares = objectInput.readUTF();

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(companyDetailsId);

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
		objectOutput.writeLong(companyDate);

		if (companyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyName);
		}

		if (companyAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyAddress);
		}

		if (companyEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyEmail);
		}

		if (companyTelNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyTelNum);
		}

		if (companyTrn == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyTrn);
		}

		objectOutput.writeLong(companyDateInco);

		if (companyTypeOfCo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyTypeOfCo);
		}

		if (companyCore == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyCore);
		}

		if (companyEmployees == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyEmployees);
		}

		objectOutput.writeLong(companyLastReturn);

		if (companyTurnover == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyTurnover);
		}

		if (companyShares == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyShares);
		}

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long companyDetailsId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long companyDate;
	public String companyName;
	public String companyAddress;
	public String companyEmail;
	public String companyTelNum;
	public String companyTrn;
	public long companyDateInco;
	public String companyTypeOfCo;
	public String companyCore;
	public String companyEmployees;
	public long companyLastReturn;
	public String companyTurnover;
	public String companyShares;
	public long osiInsolvencyId;

}