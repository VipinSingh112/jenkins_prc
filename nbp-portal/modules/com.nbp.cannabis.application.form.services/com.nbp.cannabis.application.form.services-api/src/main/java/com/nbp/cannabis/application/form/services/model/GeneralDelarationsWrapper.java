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
 * This class is a wrapper for {@link GeneralDelarations}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GeneralDelarations
 * @generated
 */
public class GeneralDelarationsWrapper
	extends BaseModelWrapper<GeneralDelarations>
	implements GeneralDelarations, ModelWrapper<GeneralDelarations> {

	public GeneralDelarationsWrapper(GeneralDelarations generalDelarations) {
		super(generalDelarations);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("generalDeclarationId", getGeneralDeclarationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("declartionQuestion", getDeclartionQuestion());
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

		Long generalDeclarationId = (Long)attributes.get(
			"generalDeclarationId");

		if (generalDeclarationId != null) {
			setGeneralDeclarationId(generalDeclarationId);
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

		String declartionQuestion = (String)attributes.get(
			"declartionQuestion");

		if (declartionQuestion != null) {
			setDeclartionQuestion(declartionQuestion);
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
	public GeneralDelarations cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the answer of this general delarations.
	 *
	 * @return the answer of this general delarations
	 */
	@Override
	public String getAnswer() {
		return model.getAnswer();
	}

	/**
	 * Returns the cannabis application ID of this general delarations.
	 *
	 * @return the cannabis application ID of this general delarations
	 */
	@Override
	public long getCannabisApplicationId() {
		return model.getCannabisApplicationId();
	}

	/**
	 * Returns the company ID of this general delarations.
	 *
	 * @return the company ID of this general delarations
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this general delarations.
	 *
	 * @return the create date of this general delarations
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the declartion question of this general delarations.
	 *
	 * @return the declartion question of this general delarations
	 */
	@Override
	public String getDeclartionQuestion() {
		return model.getDeclartionQuestion();
	}

	/**
	 * Returns the general declaration ID of this general delarations.
	 *
	 * @return the general declaration ID of this general delarations
	 */
	@Override
	public long getGeneralDeclarationId() {
		return model.getGeneralDeclarationId();
	}

	/**
	 * Returns the group ID of this general delarations.
	 *
	 * @return the group ID of this general delarations
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this general delarations.
	 *
	 * @return the modified date of this general delarations
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this general delarations.
	 *
	 * @return the primary key of this general delarations
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this general delarations.
	 *
	 * @return the user ID of this general delarations
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this general delarations.
	 *
	 * @return the user name of this general delarations
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this general delarations.
	 *
	 * @return the user uuid of this general delarations
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this general delarations.
	 *
	 * @return the uuid of this general delarations
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
	 * Sets the answer of this general delarations.
	 *
	 * @param answer the answer of this general delarations
	 */
	@Override
	public void setAnswer(String answer) {
		model.setAnswer(answer);
	}

	/**
	 * Sets the cannabis application ID of this general delarations.
	 *
	 * @param cannabisApplicationId the cannabis application ID of this general delarations
	 */
	@Override
	public void setCannabisApplicationId(long cannabisApplicationId) {
		model.setCannabisApplicationId(cannabisApplicationId);
	}

	/**
	 * Sets the company ID of this general delarations.
	 *
	 * @param companyId the company ID of this general delarations
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this general delarations.
	 *
	 * @param createDate the create date of this general delarations
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the declartion question of this general delarations.
	 *
	 * @param declartionQuestion the declartion question of this general delarations
	 */
	@Override
	public void setDeclartionQuestion(String declartionQuestion) {
		model.setDeclartionQuestion(declartionQuestion);
	}

	/**
	 * Sets the general declaration ID of this general delarations.
	 *
	 * @param generalDeclarationId the general declaration ID of this general delarations
	 */
	@Override
	public void setGeneralDeclarationId(long generalDeclarationId) {
		model.setGeneralDeclarationId(generalDeclarationId);
	}

	/**
	 * Sets the group ID of this general delarations.
	 *
	 * @param groupId the group ID of this general delarations
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this general delarations.
	 *
	 * @param modifiedDate the modified date of this general delarations
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this general delarations.
	 *
	 * @param primaryKey the primary key of this general delarations
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this general delarations.
	 *
	 * @param userId the user ID of this general delarations
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this general delarations.
	 *
	 * @param userName the user name of this general delarations
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this general delarations.
	 *
	 * @param userUuid the user uuid of this general delarations
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this general delarations.
	 *
	 * @param uuid the uuid of this general delarations
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
	protected GeneralDelarationsWrapper wrap(
		GeneralDelarations generalDelarations) {

		return new GeneralDelarationsWrapper(generalDelarations);
	}

}