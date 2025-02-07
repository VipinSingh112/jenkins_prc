/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.MonthlyExpenses;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MonthlyExpenses in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MonthlyExpensesCacheModel
	implements CacheModel<MonthlyExpenses>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MonthlyExpensesCacheModel)) {
			return false;
		}

		MonthlyExpensesCacheModel monthlyExpensesCacheModel =
			(MonthlyExpensesCacheModel)object;

		if (monthlyExpensesId == monthlyExpensesCacheModel.monthlyExpensesId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, monthlyExpensesId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{monthlyExpensesId=");
		sb.append(monthlyExpensesId);
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
		sb.append(", typeOfExpense=");
		sb.append(typeOfExpense);
		sb.append(", lightExpense=");
		sb.append(lightExpense);
		sb.append(", cableExpense=");
		sb.append(cableExpense);
		sb.append(", waterExpense=");
		sb.append(waterExpense);
		sb.append(", expenseCounter=");
		sb.append(expenseCounter);
		sb.append(", telephoneExpense=");
		sb.append(telephoneExpense);
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MonthlyExpenses toEntityModel() {
		MonthlyExpensesImpl monthlyExpensesImpl = new MonthlyExpensesImpl();

		monthlyExpensesImpl.setMonthlyExpensesId(monthlyExpensesId);
		monthlyExpensesImpl.setGroupId(groupId);
		monthlyExpensesImpl.setCompanyId(companyId);
		monthlyExpensesImpl.setUserId(userId);

		if (userName == null) {
			monthlyExpensesImpl.setUserName("");
		}
		else {
			monthlyExpensesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			monthlyExpensesImpl.setCreateDate(null);
		}
		else {
			monthlyExpensesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			monthlyExpensesImpl.setModifiedDate(null);
		}
		else {
			monthlyExpensesImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (typeOfExpense == null) {
			monthlyExpensesImpl.setTypeOfExpense("");
		}
		else {
			monthlyExpensesImpl.setTypeOfExpense(typeOfExpense);
		}

		if (lightExpense == null) {
			monthlyExpensesImpl.setLightExpense("");
		}
		else {
			monthlyExpensesImpl.setLightExpense(lightExpense);
		}

		if (cableExpense == null) {
			monthlyExpensesImpl.setCableExpense("");
		}
		else {
			monthlyExpensesImpl.setCableExpense(cableExpense);
		}

		if (waterExpense == null) {
			monthlyExpensesImpl.setWaterExpense("");
		}
		else {
			monthlyExpensesImpl.setWaterExpense(waterExpense);
		}

		if (expenseCounter == null) {
			monthlyExpensesImpl.setExpenseCounter("");
		}
		else {
			monthlyExpensesImpl.setExpenseCounter(expenseCounter);
		}

		if (telephoneExpense == null) {
			monthlyExpensesImpl.setTelephoneExpense("");
		}
		else {
			monthlyExpensesImpl.setTelephoneExpense(telephoneExpense);
		}

		monthlyExpensesImpl.setOsiInsolvencyId(osiInsolvencyId);

		monthlyExpensesImpl.resetOriginalValues();

		return monthlyExpensesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		monthlyExpensesId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		typeOfExpense = objectInput.readUTF();
		lightExpense = objectInput.readUTF();
		cableExpense = objectInput.readUTF();
		waterExpense = objectInput.readUTF();
		expenseCounter = objectInput.readUTF();
		telephoneExpense = objectInput.readUTF();

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(monthlyExpensesId);

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

		if (typeOfExpense == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfExpense);
		}

		if (lightExpense == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lightExpense);
		}

		if (cableExpense == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cableExpense);
		}

		if (waterExpense == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(waterExpense);
		}

		if (expenseCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expenseCounter);
		}

		if (telephoneExpense == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telephoneExpense);
		}

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long monthlyExpensesId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String typeOfExpense;
	public String lightExpense;
	public String cableExpense;
	public String waterExpense;
	public String expenseCounter;
	public String telephoneExpense;
	public long osiInsolvencyId;

}