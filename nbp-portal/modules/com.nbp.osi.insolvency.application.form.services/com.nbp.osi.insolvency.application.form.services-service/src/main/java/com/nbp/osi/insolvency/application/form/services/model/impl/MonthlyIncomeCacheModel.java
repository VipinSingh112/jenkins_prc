/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.MonthlyIncome;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MonthlyIncome in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MonthlyIncomeCacheModel
	implements CacheModel<MonthlyIncome>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MonthlyIncomeCacheModel)) {
			return false;
		}

		MonthlyIncomeCacheModel monthlyIncomeCacheModel =
			(MonthlyIncomeCacheModel)object;

		if (monthlyIncomeId == monthlyIncomeCacheModel.monthlyIncomeId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, monthlyIncomeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{monthlyIncomeId=");
		sb.append(monthlyIncomeId);
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
		sb.append(", basicSalary=");
		sb.append(basicSalary);
		sb.append(", grossSalary=");
		sb.append(grossSalary);
		sb.append(", statutoryDeduction=");
		sb.append(statutoryDeduction);
		sb.append(", otherDeductions=");
		sb.append(otherDeductions);
		sb.append(", loanDeductions=");
		sb.append(loanDeductions);
		sb.append(", totalDeductions=");
		sb.append(totalDeductions);
		sb.append(", netSalary=");
		sb.append(netSalary);
		sb.append(", otherIncome=");
		sb.append(otherIncome);
		sb.append(", incomeToCover=");
		sb.append(incomeToCover);
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MonthlyIncome toEntityModel() {
		MonthlyIncomeImpl monthlyIncomeImpl = new MonthlyIncomeImpl();

		monthlyIncomeImpl.setMonthlyIncomeId(monthlyIncomeId);
		monthlyIncomeImpl.setGroupId(groupId);
		monthlyIncomeImpl.setCompanyId(companyId);
		monthlyIncomeImpl.setUserId(userId);

		if (userName == null) {
			monthlyIncomeImpl.setUserName("");
		}
		else {
			monthlyIncomeImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			monthlyIncomeImpl.setCreateDate(null);
		}
		else {
			monthlyIncomeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			monthlyIncomeImpl.setModifiedDate(null);
		}
		else {
			monthlyIncomeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (basicSalary == null) {
			monthlyIncomeImpl.setBasicSalary("");
		}
		else {
			monthlyIncomeImpl.setBasicSalary(basicSalary);
		}

		if (grossSalary == null) {
			monthlyIncomeImpl.setGrossSalary("");
		}
		else {
			monthlyIncomeImpl.setGrossSalary(grossSalary);
		}

		if (statutoryDeduction == null) {
			monthlyIncomeImpl.setStatutoryDeduction("");
		}
		else {
			monthlyIncomeImpl.setStatutoryDeduction(statutoryDeduction);
		}

		if (otherDeductions == null) {
			monthlyIncomeImpl.setOtherDeductions("");
		}
		else {
			monthlyIncomeImpl.setOtherDeductions(otherDeductions);
		}

		if (loanDeductions == null) {
			monthlyIncomeImpl.setLoanDeductions("");
		}
		else {
			monthlyIncomeImpl.setLoanDeductions(loanDeductions);
		}

		if (totalDeductions == null) {
			monthlyIncomeImpl.setTotalDeductions("");
		}
		else {
			monthlyIncomeImpl.setTotalDeductions(totalDeductions);
		}

		if (netSalary == null) {
			monthlyIncomeImpl.setNetSalary("");
		}
		else {
			monthlyIncomeImpl.setNetSalary(netSalary);
		}

		if (otherIncome == null) {
			monthlyIncomeImpl.setOtherIncome("");
		}
		else {
			monthlyIncomeImpl.setOtherIncome(otherIncome);
		}

		if (incomeToCover == null) {
			monthlyIncomeImpl.setIncomeToCover("");
		}
		else {
			monthlyIncomeImpl.setIncomeToCover(incomeToCover);
		}

		monthlyIncomeImpl.setOsiInsolvencyId(osiInsolvencyId);

		monthlyIncomeImpl.resetOriginalValues();

		return monthlyIncomeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		monthlyIncomeId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		basicSalary = objectInput.readUTF();
		grossSalary = objectInput.readUTF();
		statutoryDeduction = objectInput.readUTF();
		otherDeductions = objectInput.readUTF();
		loanDeductions = objectInput.readUTF();
		totalDeductions = objectInput.readUTF();
		netSalary = objectInput.readUTF();
		otherIncome = objectInput.readUTF();
		incomeToCover = objectInput.readUTF();

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(monthlyIncomeId);

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

		if (basicSalary == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(basicSalary);
		}

		if (grossSalary == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(grossSalary);
		}

		if (statutoryDeduction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statutoryDeduction);
		}

		if (otherDeductions == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherDeductions);
		}

		if (loanDeductions == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(loanDeductions);
		}

		if (totalDeductions == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(totalDeductions);
		}

		if (netSalary == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(netSalary);
		}

		if (otherIncome == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherIncome);
		}

		if (incomeToCover == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(incomeToCover);
		}

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long monthlyIncomeId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String basicSalary;
	public String grossSalary;
	public String statutoryDeduction;
	public String otherDeductions;
	public String loanDeductions;
	public String totalDeductions;
	public String netSalary;
	public String otherIncome;
	public String incomeToCover;
	public long osiInsolvencyId;

}