/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.cannabis.application.form.services.model.StatementOfFinancialHistory;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing StatementOfFinancialHistory in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class StatementOfFinancialHistoryCacheModel
	implements CacheModel<StatementOfFinancialHistory>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof StatementOfFinancialHistoryCacheModel)) {
			return false;
		}

		StatementOfFinancialHistoryCacheModel
			statementOfFinancialHistoryCacheModel =
				(StatementOfFinancialHistoryCacheModel)object;

		if (statementOfFinancialHistoryId ==
				statementOfFinancialHistoryCacheModel.
					statementOfFinancialHistoryId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, statementOfFinancialHistoryId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", statementOfFinancialHistoryId=");
		sb.append(statementOfFinancialHistoryId);
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
		sb.append(", statementOfHistoryQuestion=");
		sb.append(statementOfHistoryQuestion);
		sb.append(", answer=");
		sb.append(answer);
		sb.append(", cannabisApplicationId=");
		sb.append(cannabisApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public StatementOfFinancialHistory toEntityModel() {
		StatementOfFinancialHistoryImpl statementOfFinancialHistoryImpl =
			new StatementOfFinancialHistoryImpl();

		if (uuid == null) {
			statementOfFinancialHistoryImpl.setUuid("");
		}
		else {
			statementOfFinancialHistoryImpl.setUuid(uuid);
		}

		statementOfFinancialHistoryImpl.setStatementOfFinancialHistoryId(
			statementOfFinancialHistoryId);
		statementOfFinancialHistoryImpl.setGroupId(groupId);
		statementOfFinancialHistoryImpl.setCompanyId(companyId);
		statementOfFinancialHistoryImpl.setUserId(userId);

		if (userName == null) {
			statementOfFinancialHistoryImpl.setUserName("");
		}
		else {
			statementOfFinancialHistoryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			statementOfFinancialHistoryImpl.setCreateDate(null);
		}
		else {
			statementOfFinancialHistoryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			statementOfFinancialHistoryImpl.setModifiedDate(null);
		}
		else {
			statementOfFinancialHistoryImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (statementOfHistoryQuestion == null) {
			statementOfFinancialHistoryImpl.setStatementOfHistoryQuestion("");
		}
		else {
			statementOfFinancialHistoryImpl.setStatementOfHistoryQuestion(
				statementOfHistoryQuestion);
		}

		if (answer == null) {
			statementOfFinancialHistoryImpl.setAnswer("");
		}
		else {
			statementOfFinancialHistoryImpl.setAnswer(answer);
		}

		statementOfFinancialHistoryImpl.setCannabisApplicationId(
			cannabisApplicationId);

		statementOfFinancialHistoryImpl.resetOriginalValues();

		return statementOfFinancialHistoryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		statementOfFinancialHistoryId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		statementOfHistoryQuestion = objectInput.readUTF();
		answer = objectInput.readUTF();

		cannabisApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(statementOfFinancialHistoryId);

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

		if (statementOfHistoryQuestion == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statementOfHistoryQuestion);
		}

		if (answer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(answer);
		}

		objectOutput.writeLong(cannabisApplicationId);
	}

	public String uuid;
	public long statementOfFinancialHistoryId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String statementOfHistoryQuestion;
	public String answer;
	public long cannabisApplicationId;

}