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
 * This class is a wrapper for {@link CannabisSupplementalInformation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisSupplementalInformation
 * @generated
 */
public class CannabisSupplementalInformationWrapper
	extends BaseModelWrapper<CannabisSupplementalInformation>
	implements CannabisSupplementalInformation,
			   ModelWrapper<CannabisSupplementalInformation> {

	public CannabisSupplementalInformationWrapper(
		CannabisSupplementalInformation cannabisSupplementalInformation) {

		super(cannabisSupplementalInformation);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put(
			"cannabisSupplementalInfoId", getCannabisSupplementalInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("supplementInfoQuestion", getSupplementInfoQuestion());
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

		Long cannabisSupplementalInfoId = (Long)attributes.get(
			"cannabisSupplementalInfoId");

		if (cannabisSupplementalInfoId != null) {
			setCannabisSupplementalInfoId(cannabisSupplementalInfoId);
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

		String supplementInfoQuestion = (String)attributes.get(
			"supplementInfoQuestion");

		if (supplementInfoQuestion != null) {
			setSupplementInfoQuestion(supplementInfoQuestion);
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
	public CannabisSupplementalInformation cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the answer of this cannabis supplemental information.
	 *
	 * @return the answer of this cannabis supplemental information
	 */
	@Override
	public String getAnswer() {
		return model.getAnswer();
	}

	/**
	 * Returns the cannabis application ID of this cannabis supplemental information.
	 *
	 * @return the cannabis application ID of this cannabis supplemental information
	 */
	@Override
	public long getCannabisApplicationId() {
		return model.getCannabisApplicationId();
	}

	/**
	 * Returns the cannabis supplemental info ID of this cannabis supplemental information.
	 *
	 * @return the cannabis supplemental info ID of this cannabis supplemental information
	 */
	@Override
	public long getCannabisSupplementalInfoId() {
		return model.getCannabisSupplementalInfoId();
	}

	/**
	 * Returns the company ID of this cannabis supplemental information.
	 *
	 * @return the company ID of this cannabis supplemental information
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this cannabis supplemental information.
	 *
	 * @return the create date of this cannabis supplemental information
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this cannabis supplemental information.
	 *
	 * @return the group ID of this cannabis supplemental information
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this cannabis supplemental information.
	 *
	 * @return the modified date of this cannabis supplemental information
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this cannabis supplemental information.
	 *
	 * @return the primary key of this cannabis supplemental information
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the supplement info question of this cannabis supplemental information.
	 *
	 * @return the supplement info question of this cannabis supplemental information
	 */
	@Override
	public String getSupplementInfoQuestion() {
		return model.getSupplementInfoQuestion();
	}

	/**
	 * Returns the user ID of this cannabis supplemental information.
	 *
	 * @return the user ID of this cannabis supplemental information
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this cannabis supplemental information.
	 *
	 * @return the user name of this cannabis supplemental information
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this cannabis supplemental information.
	 *
	 * @return the user uuid of this cannabis supplemental information
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this cannabis supplemental information.
	 *
	 * @return the uuid of this cannabis supplemental information
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
	 * Sets the answer of this cannabis supplemental information.
	 *
	 * @param answer the answer of this cannabis supplemental information
	 */
	@Override
	public void setAnswer(String answer) {
		model.setAnswer(answer);
	}

	/**
	 * Sets the cannabis application ID of this cannabis supplemental information.
	 *
	 * @param cannabisApplicationId the cannabis application ID of this cannabis supplemental information
	 */
	@Override
	public void setCannabisApplicationId(long cannabisApplicationId) {
		model.setCannabisApplicationId(cannabisApplicationId);
	}

	/**
	 * Sets the cannabis supplemental info ID of this cannabis supplemental information.
	 *
	 * @param cannabisSupplementalInfoId the cannabis supplemental info ID of this cannabis supplemental information
	 */
	@Override
	public void setCannabisSupplementalInfoId(long cannabisSupplementalInfoId) {
		model.setCannabisSupplementalInfoId(cannabisSupplementalInfoId);
	}

	/**
	 * Sets the company ID of this cannabis supplemental information.
	 *
	 * @param companyId the company ID of this cannabis supplemental information
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this cannabis supplemental information.
	 *
	 * @param createDate the create date of this cannabis supplemental information
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this cannabis supplemental information.
	 *
	 * @param groupId the group ID of this cannabis supplemental information
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this cannabis supplemental information.
	 *
	 * @param modifiedDate the modified date of this cannabis supplemental information
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this cannabis supplemental information.
	 *
	 * @param primaryKey the primary key of this cannabis supplemental information
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the supplement info question of this cannabis supplemental information.
	 *
	 * @param supplementInfoQuestion the supplement info question of this cannabis supplemental information
	 */
	@Override
	public void setSupplementInfoQuestion(String supplementInfoQuestion) {
		model.setSupplementInfoQuestion(supplementInfoQuestion);
	}

	/**
	 * Sets the user ID of this cannabis supplemental information.
	 *
	 * @param userId the user ID of this cannabis supplemental information
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this cannabis supplemental information.
	 *
	 * @param userName the user name of this cannabis supplemental information
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this cannabis supplemental information.
	 *
	 * @param userUuid the user uuid of this cannabis supplemental information
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this cannabis supplemental information.
	 *
	 * @param uuid the uuid of this cannabis supplemental information
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
	protected CannabisSupplementalInformationWrapper wrap(
		CannabisSupplementalInformation cannabisSupplementalInformation) {

		return new CannabisSupplementalInformationWrapper(
			cannabisSupplementalInformation);
	}

}