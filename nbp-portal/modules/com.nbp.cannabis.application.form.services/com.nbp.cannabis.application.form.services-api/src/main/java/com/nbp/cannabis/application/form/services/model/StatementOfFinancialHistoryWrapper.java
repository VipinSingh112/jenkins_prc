/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link StatementOfFinancialHistory}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StatementOfFinancialHistory
 * @generated
 */
public class StatementOfFinancialHistoryWrapper
	extends BaseModelWrapper<StatementOfFinancialHistory>
	implements ModelWrapper<StatementOfFinancialHistory>,
			   StatementOfFinancialHistory {

	public StatementOfFinancialHistoryWrapper(
		StatementOfFinancialHistory statementOfFinancialHistory) {

		super(statementOfFinancialHistory);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put(
			"statementOfFinancialHistoryId",
			getStatementOfFinancialHistoryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put(
			"statementOfHistoryQuestion", getStatementOfHistoryQuestion());
		attributes.put("answer", getAnswer());
		attributes.put("cannabisApplicationId", getCannabisApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long statementOfFinancialHistoryId = (Long)attributes.get(
			"statementOfFinancialHistoryId");

		if (statementOfFinancialHistoryId != null) {
			setStatementOfFinancialHistoryId(statementOfFinancialHistoryId);
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

		String statementOfHistoryQuestion = (String)attributes.get(
			"statementOfHistoryQuestion");

		if (statementOfHistoryQuestion != null) {
			setStatementOfHistoryQuestion(statementOfHistoryQuestion);
		}

		String answer = (String)attributes.get("answer");

		if (answer != null) {
			setAnswer(answer);
		}

		Long cannabisApplicationId = (Long)attributes.get(
			"cannabisApplicationId");

		if (cannabisApplicationId != null) {
			setCannabisApplicationId(cannabisApplicationId);
		}
	}

	@Override
	public StatementOfFinancialHistory cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the answer of this statement of financial history.
	 *
	 * @return the answer of this statement of financial history
	 */
	@Override
	public String getAnswer() {
		return model.getAnswer();
	}

	/**
	 * Returns the cannabis application ID of this statement of financial history.
	 *
	 * @return the cannabis application ID of this statement of financial history
	 */
	@Override
	public long getCannabisApplicationId() {
		return model.getCannabisApplicationId();
	}

	/**
	 * Returns the company ID of this statement of financial history.
	 *
	 * @return the company ID of this statement of financial history
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this statement of financial history.
	 *
	 * @return the create date of this statement of financial history
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this statement of financial history.
	 *
	 * @return the group ID of this statement of financial history
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this statement of financial history.
	 *
	 * @return the modified date of this statement of financial history
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this statement of financial history.
	 *
	 * @return the primary key of this statement of financial history
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the statement of financial history ID of this statement of financial history.
	 *
	 * @return the statement of financial history ID of this statement of financial history
	 */
	@Override
	public long getStatementOfFinancialHistoryId() {
		return model.getStatementOfFinancialHistoryId();
	}

	/**
	 * Returns the statement of history question of this statement of financial history.
	 *
	 * @return the statement of history question of this statement of financial history
	 */
	@Override
	public String getStatementOfHistoryQuestion() {
		return model.getStatementOfHistoryQuestion();
	}

	/**
	 * Returns the user ID of this statement of financial history.
	 *
	 * @return the user ID of this statement of financial history
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this statement of financial history.
	 *
	 * @return the user name of this statement of financial history
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this statement of financial history.
	 *
	 * @return the user uuid of this statement of financial history
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this statement of financial history.
	 *
	 * @return the uuid of this statement of financial history
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the answer of this statement of financial history.
	 *
	 * @param answer the answer of this statement of financial history
	 */
	@Override
	public void setAnswer(String answer) {
		model.setAnswer(answer);
	}

	/**
	 * Sets the cannabis application ID of this statement of financial history.
	 *
	 * @param cannabisApplicationId the cannabis application ID of this statement of financial history
	 */
	@Override
	public void setCannabisApplicationId(long cannabisApplicationId) {
		model.setCannabisApplicationId(cannabisApplicationId);
	}

	/**
	 * Sets the company ID of this statement of financial history.
	 *
	 * @param companyId the company ID of this statement of financial history
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this statement of financial history.
	 *
	 * @param createDate the create date of this statement of financial history
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this statement of financial history.
	 *
	 * @param groupId the group ID of this statement of financial history
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this statement of financial history.
	 *
	 * @param modifiedDate the modified date of this statement of financial history
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this statement of financial history.
	 *
	 * @param primaryKey the primary key of this statement of financial history
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the statement of financial history ID of this statement of financial history.
	 *
	 * @param statementOfFinancialHistoryId the statement of financial history ID of this statement of financial history
	 */
	@Override
	public void setStatementOfFinancialHistoryId(
		long statementOfFinancialHistoryId) {

		model.setStatementOfFinancialHistoryId(statementOfFinancialHistoryId);
	}

	/**
	 * Sets the statement of history question of this statement of financial history.
	 *
	 * @param statementOfHistoryQuestion the statement of history question of this statement of financial history
	 */
	@Override
	public void setStatementOfHistoryQuestion(
		String statementOfHistoryQuestion) {

		model.setStatementOfHistoryQuestion(statementOfHistoryQuestion);
	}

	/**
	 * Sets the user ID of this statement of financial history.
	 *
	 * @param userId the user ID of this statement of financial history
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this statement of financial history.
	 *
	 * @param userName the user name of this statement of financial history
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this statement of financial history.
	 *
	 * @param userUuid the user uuid of this statement of financial history
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this statement of financial history.
	 *
	 * @param uuid the uuid of this statement of financial history
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected StatementOfFinancialHistoryWrapper wrap(
		StatementOfFinancialHistory statementOfFinancialHistory) {

		return new StatementOfFinancialHistoryWrapper(
			statementOfFinancialHistory);
	}

}