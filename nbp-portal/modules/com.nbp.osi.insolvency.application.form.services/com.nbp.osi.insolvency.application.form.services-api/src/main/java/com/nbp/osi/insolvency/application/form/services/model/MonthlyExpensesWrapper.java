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
 * This class is a wrapper for {@link MonthlyExpenses}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MonthlyExpenses
 * @generated
 */
public class MonthlyExpensesWrapper
	extends BaseModelWrapper<MonthlyExpenses>
	implements ModelWrapper<MonthlyExpenses>, MonthlyExpenses {

	public MonthlyExpensesWrapper(MonthlyExpenses monthlyExpenses) {
		super(monthlyExpenses);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("monthlyExpensesId", getMonthlyExpensesId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("typeOfExpense", getTypeOfExpense());
		attributes.put("lightExpense", getLightExpense());
		attributes.put("cableExpense", getCableExpense());
		attributes.put("waterExpense", getWaterExpense());
		attributes.put("expenseCounter", getExpenseCounter());
		attributes.put("telephoneExpense", getTelephoneExpense());
		attributes.put("osiInsolvencyId", getOsiInsolvencyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long monthlyExpensesId = (Long)attributes.get("monthlyExpensesId");

		if (monthlyExpensesId != null) {
			setMonthlyExpensesId(monthlyExpensesId);
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

		String typeOfExpense = (String)attributes.get("typeOfExpense");

		if (typeOfExpense != null) {
			setTypeOfExpense(typeOfExpense);
		}

		String lightExpense = (String)attributes.get("lightExpense");

		if (lightExpense != null) {
			setLightExpense(lightExpense);
		}

		String cableExpense = (String)attributes.get("cableExpense");

		if (cableExpense != null) {
			setCableExpense(cableExpense);
		}

		String waterExpense = (String)attributes.get("waterExpense");

		if (waterExpense != null) {
			setWaterExpense(waterExpense);
		}

		String expenseCounter = (String)attributes.get("expenseCounter");

		if (expenseCounter != null) {
			setExpenseCounter(expenseCounter);
		}

		String telephoneExpense = (String)attributes.get("telephoneExpense");

		if (telephoneExpense != null) {
			setTelephoneExpense(telephoneExpense);
		}

		Long osiInsolvencyId = (Long)attributes.get("osiInsolvencyId");

		if (osiInsolvencyId != null) {
			setOsiInsolvencyId(osiInsolvencyId);
		}
	}

	@Override
	public MonthlyExpenses cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the cable expense of this monthly expenses.
	 *
	 * @return the cable expense of this monthly expenses
	 */
	@Override
	public String getCableExpense() {
		return model.getCableExpense();
	}

	/**
	 * Returns the company ID of this monthly expenses.
	 *
	 * @return the company ID of this monthly expenses
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this monthly expenses.
	 *
	 * @return the create date of this monthly expenses
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the expense counter of this monthly expenses.
	 *
	 * @return the expense counter of this monthly expenses
	 */
	@Override
	public String getExpenseCounter() {
		return model.getExpenseCounter();
	}

	/**
	 * Returns the group ID of this monthly expenses.
	 *
	 * @return the group ID of this monthly expenses
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the light expense of this monthly expenses.
	 *
	 * @return the light expense of this monthly expenses
	 */
	@Override
	public String getLightExpense() {
		return model.getLightExpense();
	}

	/**
	 * Returns the modified date of this monthly expenses.
	 *
	 * @return the modified date of this monthly expenses
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the monthly expenses ID of this monthly expenses.
	 *
	 * @return the monthly expenses ID of this monthly expenses
	 */
	@Override
	public long getMonthlyExpensesId() {
		return model.getMonthlyExpensesId();
	}

	/**
	 * Returns the osi insolvency ID of this monthly expenses.
	 *
	 * @return the osi insolvency ID of this monthly expenses
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the primary key of this monthly expenses.
	 *
	 * @return the primary key of this monthly expenses
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the telephone expense of this monthly expenses.
	 *
	 * @return the telephone expense of this monthly expenses
	 */
	@Override
	public String getTelephoneExpense() {
		return model.getTelephoneExpense();
	}

	/**
	 * Returns the type of expense of this monthly expenses.
	 *
	 * @return the type of expense of this monthly expenses
	 */
	@Override
	public String getTypeOfExpense() {
		return model.getTypeOfExpense();
	}

	/**
	 * Returns the user ID of this monthly expenses.
	 *
	 * @return the user ID of this monthly expenses
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this monthly expenses.
	 *
	 * @return the user name of this monthly expenses
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this monthly expenses.
	 *
	 * @return the user uuid of this monthly expenses
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the water expense of this monthly expenses.
	 *
	 * @return the water expense of this monthly expenses
	 */
	@Override
	public String getWaterExpense() {
		return model.getWaterExpense();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the cable expense of this monthly expenses.
	 *
	 * @param cableExpense the cable expense of this monthly expenses
	 */
	@Override
	public void setCableExpense(String cableExpense) {
		model.setCableExpense(cableExpense);
	}

	/**
	 * Sets the company ID of this monthly expenses.
	 *
	 * @param companyId the company ID of this monthly expenses
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this monthly expenses.
	 *
	 * @param createDate the create date of this monthly expenses
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the expense counter of this monthly expenses.
	 *
	 * @param expenseCounter the expense counter of this monthly expenses
	 */
	@Override
	public void setExpenseCounter(String expenseCounter) {
		model.setExpenseCounter(expenseCounter);
	}

	/**
	 * Sets the group ID of this monthly expenses.
	 *
	 * @param groupId the group ID of this monthly expenses
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the light expense of this monthly expenses.
	 *
	 * @param lightExpense the light expense of this monthly expenses
	 */
	@Override
	public void setLightExpense(String lightExpense) {
		model.setLightExpense(lightExpense);
	}

	/**
	 * Sets the modified date of this monthly expenses.
	 *
	 * @param modifiedDate the modified date of this monthly expenses
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the monthly expenses ID of this monthly expenses.
	 *
	 * @param monthlyExpensesId the monthly expenses ID of this monthly expenses
	 */
	@Override
	public void setMonthlyExpensesId(long monthlyExpensesId) {
		model.setMonthlyExpensesId(monthlyExpensesId);
	}

	/**
	 * Sets the osi insolvency ID of this monthly expenses.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this monthly expenses
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the primary key of this monthly expenses.
	 *
	 * @param primaryKey the primary key of this monthly expenses
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the telephone expense of this monthly expenses.
	 *
	 * @param telephoneExpense the telephone expense of this monthly expenses
	 */
	@Override
	public void setTelephoneExpense(String telephoneExpense) {
		model.setTelephoneExpense(telephoneExpense);
	}

	/**
	 * Sets the type of expense of this monthly expenses.
	 *
	 * @param typeOfExpense the type of expense of this monthly expenses
	 */
	@Override
	public void setTypeOfExpense(String typeOfExpense) {
		model.setTypeOfExpense(typeOfExpense);
	}

	/**
	 * Sets the user ID of this monthly expenses.
	 *
	 * @param userId the user ID of this monthly expenses
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this monthly expenses.
	 *
	 * @param userName the user name of this monthly expenses
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this monthly expenses.
	 *
	 * @param userUuid the user uuid of this monthly expenses
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the water expense of this monthly expenses.
	 *
	 * @param waterExpense the water expense of this monthly expenses
	 */
	@Override
	public void setWaterExpense(String waterExpense) {
		model.setWaterExpense(waterExpense);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected MonthlyExpensesWrapper wrap(MonthlyExpenses monthlyExpenses) {
		return new MonthlyExpensesWrapper(monthlyExpenses);
	}

}