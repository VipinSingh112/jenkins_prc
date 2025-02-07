/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.FinancialPosition;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FinancialPosition in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FinancialPositionCacheModel
	implements CacheModel<FinancialPosition>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FinancialPositionCacheModel)) {
			return false;
		}

		FinancialPositionCacheModel financialPositionCacheModel =
			(FinancialPositionCacheModel)object;

		if (financialPositionId ==
				financialPositionCacheModel.financialPositionId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, financialPositionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{financialPositionId=");
		sb.append(financialPositionId);
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
		sb.append(", securedLiabilities=");
		sb.append(securedLiabilities);
		sb.append(", unsecuredLiabilities=");
		sb.append(unsecuredLiabilities);
		sb.append(", amountLiabilities=");
		sb.append(amountLiabilities);
		sb.append(", deficitLiabilities=");
		sb.append(deficitLiabilities);
		sb.append(", assestsUsedAsSecurity=");
		sb.append(assestsUsedAsSecurity);
		sb.append(", assestsNotUsedAsSecurity=");
		sb.append(assestsNotUsedAsSecurity);
		sb.append(", assestsDisposable=");
		sb.append(assestsDisposable);
		sb.append(", assestsSurplus=");
		sb.append(assestsSurplus);
		sb.append(", assestsSummary=");
		sb.append(assestsSummary);
		sb.append(", assestsProposal=");
		sb.append(assestsProposal);
		sb.append(", assestsTrusteeResponse=");
		sb.append(assestsTrusteeResponse);
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FinancialPosition toEntityModel() {
		FinancialPositionImpl financialPositionImpl =
			new FinancialPositionImpl();

		financialPositionImpl.setFinancialPositionId(financialPositionId);
		financialPositionImpl.setGroupId(groupId);
		financialPositionImpl.setCompanyId(companyId);
		financialPositionImpl.setUserId(userId);

		if (userName == null) {
			financialPositionImpl.setUserName("");
		}
		else {
			financialPositionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			financialPositionImpl.setCreateDate(null);
		}
		else {
			financialPositionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			financialPositionImpl.setModifiedDate(null);
		}
		else {
			financialPositionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (securedLiabilities == null) {
			financialPositionImpl.setSecuredLiabilities("");
		}
		else {
			financialPositionImpl.setSecuredLiabilities(securedLiabilities);
		}

		if (unsecuredLiabilities == null) {
			financialPositionImpl.setUnsecuredLiabilities("");
		}
		else {
			financialPositionImpl.setUnsecuredLiabilities(unsecuredLiabilities);
		}

		if (amountLiabilities == null) {
			financialPositionImpl.setAmountLiabilities("");
		}
		else {
			financialPositionImpl.setAmountLiabilities(amountLiabilities);
		}

		if (deficitLiabilities == null) {
			financialPositionImpl.setDeficitLiabilities("");
		}
		else {
			financialPositionImpl.setDeficitLiabilities(deficitLiabilities);
		}

		if (assestsUsedAsSecurity == null) {
			financialPositionImpl.setAssestsUsedAsSecurity("");
		}
		else {
			financialPositionImpl.setAssestsUsedAsSecurity(
				assestsUsedAsSecurity);
		}

		if (assestsNotUsedAsSecurity == null) {
			financialPositionImpl.setAssestsNotUsedAsSecurity("");
		}
		else {
			financialPositionImpl.setAssestsNotUsedAsSecurity(
				assestsNotUsedAsSecurity);
		}

		if (assestsDisposable == null) {
			financialPositionImpl.setAssestsDisposable("");
		}
		else {
			financialPositionImpl.setAssestsDisposable(assestsDisposable);
		}

		if (assestsSurplus == null) {
			financialPositionImpl.setAssestsSurplus("");
		}
		else {
			financialPositionImpl.setAssestsSurplus(assestsSurplus);
		}

		if (assestsSummary == null) {
			financialPositionImpl.setAssestsSummary("");
		}
		else {
			financialPositionImpl.setAssestsSummary(assestsSummary);
		}

		if (assestsProposal == null) {
			financialPositionImpl.setAssestsProposal("");
		}
		else {
			financialPositionImpl.setAssestsProposal(assestsProposal);
		}

		if (assestsTrusteeResponse == null) {
			financialPositionImpl.setAssestsTrusteeResponse("");
		}
		else {
			financialPositionImpl.setAssestsTrusteeResponse(
				assestsTrusteeResponse);
		}

		financialPositionImpl.setOsiInsolvencyId(osiInsolvencyId);

		financialPositionImpl.resetOriginalValues();

		return financialPositionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		financialPositionId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		securedLiabilities = objectInput.readUTF();
		unsecuredLiabilities = objectInput.readUTF();
		amountLiabilities = objectInput.readUTF();
		deficitLiabilities = objectInput.readUTF();
		assestsUsedAsSecurity = objectInput.readUTF();
		assestsNotUsedAsSecurity = objectInput.readUTF();
		assestsDisposable = objectInput.readUTF();
		assestsSurplus = objectInput.readUTF();
		assestsSummary = objectInput.readUTF();
		assestsProposal = objectInput.readUTF();
		assestsTrusteeResponse = objectInput.readUTF();

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(financialPositionId);

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

		if (securedLiabilities == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securedLiabilities);
		}

		if (unsecuredLiabilities == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(unsecuredLiabilities);
		}

		if (amountLiabilities == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(amountLiabilities);
		}

		if (deficitLiabilities == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(deficitLiabilities);
		}

		if (assestsUsedAsSecurity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assestsUsedAsSecurity);
		}

		if (assestsNotUsedAsSecurity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assestsNotUsedAsSecurity);
		}

		if (assestsDisposable == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assestsDisposable);
		}

		if (assestsSurplus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assestsSurplus);
		}

		if (assestsSummary == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assestsSummary);
		}

		if (assestsProposal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assestsProposal);
		}

		if (assestsTrusteeResponse == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assestsTrusteeResponse);
		}

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long financialPositionId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String securedLiabilities;
	public String unsecuredLiabilities;
	public String amountLiabilities;
	public String deficitLiabilities;
	public String assestsUsedAsSecurity;
	public String assestsNotUsedAsSecurity;
	public String assestsDisposable;
	public String assestsSurplus;
	public String assestsSummary;
	public String assestsProposal;
	public String assestsTrusteeResponse;
	public long osiInsolvencyId;

}