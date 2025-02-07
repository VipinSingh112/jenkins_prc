/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.CompanyFinancialPosition;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CompanyFinancialPosition in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CompanyFinancialPositionCacheModel
	implements CacheModel<CompanyFinancialPosition>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CompanyFinancialPositionCacheModel)) {
			return false;
		}

		CompanyFinancialPositionCacheModel companyFinancialPositionCacheModel =
			(CompanyFinancialPositionCacheModel)object;

		if (companyFinancialPositionId ==
				companyFinancialPositionCacheModel.companyFinancialPositionId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, companyFinancialPositionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{companyFinancialPositionId=");
		sb.append(companyFinancialPositionId);
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
		sb.append(", companySecured=");
		sb.append(companySecured);
		sb.append(", companyUnsecured=");
		sb.append(companyUnsecured);
		sb.append(", companyAmount=");
		sb.append(companyAmount);
		sb.append(", companyDeficit=");
		sb.append(companyDeficit);
		sb.append(", companyNetValue=");
		sb.append(companyNetValue);
		sb.append(", companyAssetValue=");
		sb.append(companyAssetValue);
		sb.append(", companyDisposableAsset=");
		sb.append(companyDisposableAsset);
		sb.append(", companySurplus=");
		sb.append(companySurplus);
		sb.append(", companySummary=");
		sb.append(companySummary);
		sb.append(", companyProposal=");
		sb.append(companyProposal);
		sb.append(", companyTrusteeResponse=");
		sb.append(companyTrusteeResponse);
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CompanyFinancialPosition toEntityModel() {
		CompanyFinancialPositionImpl companyFinancialPositionImpl =
			new CompanyFinancialPositionImpl();

		companyFinancialPositionImpl.setCompanyFinancialPositionId(
			companyFinancialPositionId);
		companyFinancialPositionImpl.setGroupId(groupId);
		companyFinancialPositionImpl.setCompanyId(companyId);
		companyFinancialPositionImpl.setUserId(userId);

		if (userName == null) {
			companyFinancialPositionImpl.setUserName("");
		}
		else {
			companyFinancialPositionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			companyFinancialPositionImpl.setCreateDate(null);
		}
		else {
			companyFinancialPositionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			companyFinancialPositionImpl.setModifiedDate(null);
		}
		else {
			companyFinancialPositionImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (companySecured == null) {
			companyFinancialPositionImpl.setCompanySecured("");
		}
		else {
			companyFinancialPositionImpl.setCompanySecured(companySecured);
		}

		if (companyUnsecured == null) {
			companyFinancialPositionImpl.setCompanyUnsecured("");
		}
		else {
			companyFinancialPositionImpl.setCompanyUnsecured(companyUnsecured);
		}

		if (companyAmount == null) {
			companyFinancialPositionImpl.setCompanyAmount("");
		}
		else {
			companyFinancialPositionImpl.setCompanyAmount(companyAmount);
		}

		if (companyDeficit == null) {
			companyFinancialPositionImpl.setCompanyDeficit("");
		}
		else {
			companyFinancialPositionImpl.setCompanyDeficit(companyDeficit);
		}

		if (companyNetValue == null) {
			companyFinancialPositionImpl.setCompanyNetValue("");
		}
		else {
			companyFinancialPositionImpl.setCompanyNetValue(companyNetValue);
		}

		if (companyAssetValue == null) {
			companyFinancialPositionImpl.setCompanyAssetValue("");
		}
		else {
			companyFinancialPositionImpl.setCompanyAssetValue(
				companyAssetValue);
		}

		if (companyDisposableAsset == null) {
			companyFinancialPositionImpl.setCompanyDisposableAsset("");
		}
		else {
			companyFinancialPositionImpl.setCompanyDisposableAsset(
				companyDisposableAsset);
		}

		if (companySurplus == null) {
			companyFinancialPositionImpl.setCompanySurplus("");
		}
		else {
			companyFinancialPositionImpl.setCompanySurplus(companySurplus);
		}

		if (companySummary == null) {
			companyFinancialPositionImpl.setCompanySummary("");
		}
		else {
			companyFinancialPositionImpl.setCompanySummary(companySummary);
		}

		if (companyProposal == null) {
			companyFinancialPositionImpl.setCompanyProposal("");
		}
		else {
			companyFinancialPositionImpl.setCompanyProposal(companyProposal);
		}

		if (companyTrusteeResponse == null) {
			companyFinancialPositionImpl.setCompanyTrusteeResponse("");
		}
		else {
			companyFinancialPositionImpl.setCompanyTrusteeResponse(
				companyTrusteeResponse);
		}

		companyFinancialPositionImpl.setOsiInsolvencyId(osiInsolvencyId);

		companyFinancialPositionImpl.resetOriginalValues();

		return companyFinancialPositionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		companyFinancialPositionId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		companySecured = objectInput.readUTF();
		companyUnsecured = objectInput.readUTF();
		companyAmount = objectInput.readUTF();
		companyDeficit = objectInput.readUTF();
		companyNetValue = objectInput.readUTF();
		companyAssetValue = objectInput.readUTF();
		companyDisposableAsset = objectInput.readUTF();
		companySurplus = objectInput.readUTF();
		companySummary = objectInput.readUTF();
		companyProposal = objectInput.readUTF();
		companyTrusteeResponse = objectInput.readUTF();

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(companyFinancialPositionId);

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

		if (companySecured == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companySecured);
		}

		if (companyUnsecured == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyUnsecured);
		}

		if (companyAmount == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyAmount);
		}

		if (companyDeficit == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyDeficit);
		}

		if (companyNetValue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyNetValue);
		}

		if (companyAssetValue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyAssetValue);
		}

		if (companyDisposableAsset == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyDisposableAsset);
		}

		if (companySurplus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companySurplus);
		}

		if (companySummary == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companySummary);
		}

		if (companyProposal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyProposal);
		}

		if (companyTrusteeResponse == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyTrusteeResponse);
		}

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long companyFinancialPositionId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String companySecured;
	public String companyUnsecured;
	public String companyAmount;
	public String companyDeficit;
	public String companyNetValue;
	public String companyAssetValue;
	public String companyDisposableAsset;
	public String companySurplus;
	public String companySummary;
	public String companyProposal;
	public String companyTrusteeResponse;
	public long osiInsolvencyId;

}