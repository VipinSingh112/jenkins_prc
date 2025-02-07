/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MonthlyIncome}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MonthlyIncome
 * @generated
 */
public class MonthlyIncomeWrapper
	extends BaseModelWrapper<MonthlyIncome>
	implements ModelWrapper<MonthlyIncome>, MonthlyIncome {

	public MonthlyIncomeWrapper(MonthlyIncome monthlyIncome) {
		super(monthlyIncome);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("monthlyIncomeId", getMonthlyIncomeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("basicSalary", getBasicSalary());
		attributes.put("grossSalary", getGrossSalary());
		attributes.put("statutoryDeduction", getStatutoryDeduction());
		attributes.put("otherDeductions", getOtherDeductions());
		attributes.put("loanDeductions", getLoanDeductions());
		attributes.put("totalDeductions", getTotalDeductions());
		attributes.put("netSalary", getNetSalary());
		attributes.put("otherIncome", getOtherIncome());
		attributes.put("incomeToCover", getIncomeToCover());
		attributes.put("osiInsolvencyId", getOsiInsolvencyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long monthlyIncomeId = (Long)attributes.get("monthlyIncomeId");

		if (monthlyIncomeId != null) {
			setMonthlyIncomeId(monthlyIncomeId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String basicSalary = (String)attributes.get("basicSalary");

		if (basicSalary != null) {
			setBasicSalary(basicSalary);
		}

		String grossSalary = (String)attributes.get("grossSalary");

		if (grossSalary != null) {
			setGrossSalary(grossSalary);
		}

		String statutoryDeduction = (String)attributes.get(
			"statutoryDeduction");

		if (statutoryDeduction != null) {
			setStatutoryDeduction(statutoryDeduction);
		}

		String otherDeductions = (String)attributes.get("otherDeductions");

		if (otherDeductions != null) {
			setOtherDeductions(otherDeductions);
		}

		String loanDeductions = (String)attributes.get("loanDeductions");

		if (loanDeductions != null) {
			setLoanDeductions(loanDeductions);
		}

		String totalDeductions = (String)attributes.get("totalDeductions");

		if (totalDeductions != null) {
			setTotalDeductions(totalDeductions);
		}

		String netSalary = (String)attributes.get("netSalary");

		if (netSalary != null) {
			setNetSalary(netSalary);
		}

		String otherIncome = (String)attributes.get("otherIncome");

		if (otherIncome != null) {
			setOtherIncome(otherIncome);
		}

		String incomeToCover = (String)attributes.get("incomeToCover");

		if (incomeToCover != null) {
			setIncomeToCover(incomeToCover);
		}

		Long osiInsolvencyId = (Long)attributes.get("osiInsolvencyId");

		if (osiInsolvencyId != null) {
			setOsiInsolvencyId(osiInsolvencyId);
		}
	}

	@Override
	public MonthlyIncome cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the basic salary of this monthly income.
	 *
	 * @return the basic salary of this monthly income
	 */
	@Override
	public String getBasicSalary() {
		return model.getBasicSalary();
	}

	/**
	 * Returns the company ID of this monthly income.
	 *
	 * @return the company ID of this monthly income
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this monthly income.
	 *
	 * @return the create date of this monthly income
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the gross salary of this monthly income.
	 *
	 * @return the gross salary of this monthly income
	 */
	@Override
	public String getGrossSalary() {
		return model.getGrossSalary();
	}

	/**
	 * Returns the group ID of this monthly income.
	 *
	 * @return the group ID of this monthly income
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the income to cover of this monthly income.
	 *
	 * @return the income to cover of this monthly income
	 */
	@Override
	public String getIncomeToCover() {
		return model.getIncomeToCover();
	}

	/**
	 * Returns the loan deductions of this monthly income.
	 *
	 * @return the loan deductions of this monthly income
	 */
	@Override
	public String getLoanDeductions() {
		return model.getLoanDeductions();
	}

	/**
	 * Returns the modified date of this monthly income.
	 *
	 * @return the modified date of this monthly income
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the monthly income ID of this monthly income.
	 *
	 * @return the monthly income ID of this monthly income
	 */
	@Override
	public long getMonthlyIncomeId() {
		return model.getMonthlyIncomeId();
	}

	/**
	 * Returns the net salary of this monthly income.
	 *
	 * @return the net salary of this monthly income
	 */
	@Override
	public String getNetSalary() {
		return model.getNetSalary();
	}

	/**
	 * Returns the osi insolvency ID of this monthly income.
	 *
	 * @return the osi insolvency ID of this monthly income
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the other deductions of this monthly income.
	 *
	 * @return the other deductions of this monthly income
	 */
	@Override
	public String getOtherDeductions() {
		return model.getOtherDeductions();
	}

	/**
	 * Returns the other income of this monthly income.
	 *
	 * @return the other income of this monthly income
	 */
	@Override
	public String getOtherIncome() {
		return model.getOtherIncome();
	}

	/**
	 * Returns the primary key of this monthly income.
	 *
	 * @return the primary key of this monthly income
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the statutory deduction of this monthly income.
	 *
	 * @return the statutory deduction of this monthly income
	 */
	@Override
	public String getStatutoryDeduction() {
		return model.getStatutoryDeduction();
	}

	/**
	 * Returns the total deductions of this monthly income.
	 *
	 * @return the total deductions of this monthly income
	 */
	@Override
	public String getTotalDeductions() {
		return model.getTotalDeductions();
	}

	/**
	 * Returns the user ID of this monthly income.
	 *
	 * @return the user ID of this monthly income
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this monthly income.
	 *
	 * @return the user name of this monthly income
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this monthly income.
	 *
	 * @return the user uuid of this monthly income
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the basic salary of this monthly income.
	 *
	 * @param basicSalary the basic salary of this monthly income
	 */
	@Override
	public void setBasicSalary(String basicSalary) {
		model.setBasicSalary(basicSalary);
	}

	/**
	 * Sets the company ID of this monthly income.
	 *
	 * @param companyId the company ID of this monthly income
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this monthly income.
	 *
	 * @param createDate the create date of this monthly income
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the gross salary of this monthly income.
	 *
	 * @param grossSalary the gross salary of this monthly income
	 */
	@Override
	public void setGrossSalary(String grossSalary) {
		model.setGrossSalary(grossSalary);
	}

	/**
	 * Sets the group ID of this monthly income.
	 *
	 * @param groupId the group ID of this monthly income
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the income to cover of this monthly income.
	 *
	 * @param incomeToCover the income to cover of this monthly income
	 */
	@Override
	public void setIncomeToCover(String incomeToCover) {
		model.setIncomeToCover(incomeToCover);
	}

	/**
	 * Sets the loan deductions of this monthly income.
	 *
	 * @param loanDeductions the loan deductions of this monthly income
	 */
	@Override
	public void setLoanDeductions(String loanDeductions) {
		model.setLoanDeductions(loanDeductions);
	}

	/**
	 * Sets the modified date of this monthly income.
	 *
	 * @param modifiedDate the modified date of this monthly income
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the monthly income ID of this monthly income.
	 *
	 * @param monthlyIncomeId the monthly income ID of this monthly income
	 */
	@Override
	public void setMonthlyIncomeId(long monthlyIncomeId) {
		model.setMonthlyIncomeId(monthlyIncomeId);
	}

	/**
	 * Sets the net salary of this monthly income.
	 *
	 * @param netSalary the net salary of this monthly income
	 */
	@Override
	public void setNetSalary(String netSalary) {
		model.setNetSalary(netSalary);
	}

	/**
	 * Sets the osi insolvency ID of this monthly income.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this monthly income
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the other deductions of this monthly income.
	 *
	 * @param otherDeductions the other deductions of this monthly income
	 */
	@Override
	public void setOtherDeductions(String otherDeductions) {
		model.setOtherDeductions(otherDeductions);
	}

	/**
	 * Sets the other income of this monthly income.
	 *
	 * @param otherIncome the other income of this monthly income
	 */
	@Override
	public void setOtherIncome(String otherIncome) {
		model.setOtherIncome(otherIncome);
	}

	/**
	 * Sets the primary key of this monthly income.
	 *
	 * @param primaryKey the primary key of this monthly income
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the statutory deduction of this monthly income.
	 *
	 * @param statutoryDeduction the statutory deduction of this monthly income
	 */
	@Override
	public void setStatutoryDeduction(String statutoryDeduction) {
		model.setStatutoryDeduction(statutoryDeduction);
	}

	/**
	 * Sets the total deductions of this monthly income.
	 *
	 * @param totalDeductions the total deductions of this monthly income
	 */
	@Override
	public void setTotalDeductions(String totalDeductions) {
		model.setTotalDeductions(totalDeductions);
	}

	/**
	 * Sets the user ID of this monthly income.
	 *
	 * @param userId the user ID of this monthly income
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this monthly income.
	 *
	 * @param userName the user name of this monthly income
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this monthly income.
	 *
	 * @param userUuid the user uuid of this monthly income
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected MonthlyIncomeWrapper wrap(MonthlyIncome monthlyIncome) {
		return new MonthlyIncomeWrapper(monthlyIncome);
	}

}