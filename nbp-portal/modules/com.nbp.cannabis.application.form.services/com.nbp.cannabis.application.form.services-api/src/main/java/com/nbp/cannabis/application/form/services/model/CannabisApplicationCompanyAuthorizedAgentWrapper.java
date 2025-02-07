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
 * This class is a wrapper for {@link CannabisApplicationCompanyAuthorizedAgent}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationCompanyAuthorizedAgent
 * @generated
 */
public class CannabisApplicationCompanyAuthorizedAgentWrapper
	extends BaseModelWrapper<CannabisApplicationCompanyAuthorizedAgent>
	implements CannabisApplicationCompanyAuthorizedAgent,
			   ModelWrapper<CannabisApplicationCompanyAuthorizedAgent> {

	public CannabisApplicationCompanyAuthorizedAgentWrapper(
		CannabisApplicationCompanyAuthorizedAgent
			cannabisApplicationCompanyAuthorizedAgent) {

		super(cannabisApplicationCompanyAuthorizedAgent);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("cannabisCOAId", getCannabisCOAId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("firstName", getFirstName());
		attributes.put("middleName", getMiddleName());
		attributes.put("surname", getSurname());
		attributes.put("position", getPosition());
		attributes.put("gender", getGender());
		attributes.put("dateOfBirth", getDateOfBirth());
		attributes.put("contactPhoneNumber", getContactPhoneNumber());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("cannabisApplicationId", getCannabisApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long cannabisCOAId = (Long)attributes.get("cannabisCOAId");

		if (cannabisCOAId != null) {
			setCannabisCOAId(cannabisCOAId);
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

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String middleName = (String)attributes.get("middleName");

		if (middleName != null) {
			setMiddleName(middleName);
		}

		String surname = (String)attributes.get("surname");

		if (surname != null) {
			setSurname(surname);
		}

		String position = (String)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}

		String gender = (String)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		Date dateOfBirth = (Date)attributes.get("dateOfBirth");

		if (dateOfBirth != null) {
			setDateOfBirth(dateOfBirth);
		}

		String contactPhoneNumber = (String)attributes.get(
			"contactPhoneNumber");

		if (contactPhoneNumber != null) {
			setContactPhoneNumber(contactPhoneNumber);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		Long cannabisApplicationId = (Long)attributes.get(
			"cannabisApplicationId");

		if (cannabisApplicationId != null) {
			setCannabisApplicationId(cannabisApplicationId);
		}
	}

	@Override
	public CannabisApplicationCompanyAuthorizedAgent cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the cannabis application ID of this cannabis application company authorized agent.
	 *
	 * @return the cannabis application ID of this cannabis application company authorized agent
	 */
	@Override
	public long getCannabisApplicationId() {
		return model.getCannabisApplicationId();
	}

	/**
	 * Returns the cannabis coa ID of this cannabis application company authorized agent.
	 *
	 * @return the cannabis coa ID of this cannabis application company authorized agent
	 */
	@Override
	public long getCannabisCOAId() {
		return model.getCannabisCOAId();
	}

	/**
	 * Returns the company ID of this cannabis application company authorized agent.
	 *
	 * @return the company ID of this cannabis application company authorized agent
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the contact phone number of this cannabis application company authorized agent.
	 *
	 * @return the contact phone number of this cannabis application company authorized agent
	 */
	@Override
	public String getContactPhoneNumber() {
		return model.getContactPhoneNumber();
	}

	/**
	 * Returns the create date of this cannabis application company authorized agent.
	 *
	 * @return the create date of this cannabis application company authorized agent
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of birth of this cannabis application company authorized agent.
	 *
	 * @return the date of birth of this cannabis application company authorized agent
	 */
	@Override
	public Date getDateOfBirth() {
		return model.getDateOfBirth();
	}

	/**
	 * Returns the email address of this cannabis application company authorized agent.
	 *
	 * @return the email address of this cannabis application company authorized agent
	 */
	@Override
	public String getEmailAddress() {
		return model.getEmailAddress();
	}

	/**
	 * Returns the first name of this cannabis application company authorized agent.
	 *
	 * @return the first name of this cannabis application company authorized agent
	 */
	@Override
	public String getFirstName() {
		return model.getFirstName();
	}

	/**
	 * Returns the gender of this cannabis application company authorized agent.
	 *
	 * @return the gender of this cannabis application company authorized agent
	 */
	@Override
	public String getGender() {
		return model.getGender();
	}

	/**
	 * Returns the group ID of this cannabis application company authorized agent.
	 *
	 * @return the group ID of this cannabis application company authorized agent
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the middle name of this cannabis application company authorized agent.
	 *
	 * @return the middle name of this cannabis application company authorized agent
	 */
	@Override
	public String getMiddleName() {
		return model.getMiddleName();
	}

	/**
	 * Returns the modified date of this cannabis application company authorized agent.
	 *
	 * @return the modified date of this cannabis application company authorized agent
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the position of this cannabis application company authorized agent.
	 *
	 * @return the position of this cannabis application company authorized agent
	 */
	@Override
	public String getPosition() {
		return model.getPosition();
	}

	/**
	 * Returns the primary key of this cannabis application company authorized agent.
	 *
	 * @return the primary key of this cannabis application company authorized agent
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the surname of this cannabis application company authorized agent.
	 *
	 * @return the surname of this cannabis application company authorized agent
	 */
	@Override
	public String getSurname() {
		return model.getSurname();
	}

	/**
	 * Returns the user ID of this cannabis application company authorized agent.
	 *
	 * @return the user ID of this cannabis application company authorized agent
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this cannabis application company authorized agent.
	 *
	 * @return the user name of this cannabis application company authorized agent
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this cannabis application company authorized agent.
	 *
	 * @return the user uuid of this cannabis application company authorized agent
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this cannabis application company authorized agent.
	 *
	 * @return the uuid of this cannabis application company authorized agent
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
	 * Sets the cannabis application ID of this cannabis application company authorized agent.
	 *
	 * @param cannabisApplicationId the cannabis application ID of this cannabis application company authorized agent
	 */
	@Override
	public void setCannabisApplicationId(long cannabisApplicationId) {
		model.setCannabisApplicationId(cannabisApplicationId);
	}

	/**
	 * Sets the cannabis coa ID of this cannabis application company authorized agent.
	 *
	 * @param cannabisCOAId the cannabis coa ID of this cannabis application company authorized agent
	 */
	@Override
	public void setCannabisCOAId(long cannabisCOAId) {
		model.setCannabisCOAId(cannabisCOAId);
	}

	/**
	 * Sets the company ID of this cannabis application company authorized agent.
	 *
	 * @param companyId the company ID of this cannabis application company authorized agent
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the contact phone number of this cannabis application company authorized agent.
	 *
	 * @param contactPhoneNumber the contact phone number of this cannabis application company authorized agent
	 */
	@Override
	public void setContactPhoneNumber(String contactPhoneNumber) {
		model.setContactPhoneNumber(contactPhoneNumber);
	}

	/**
	 * Sets the create date of this cannabis application company authorized agent.
	 *
	 * @param createDate the create date of this cannabis application company authorized agent
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of birth of this cannabis application company authorized agent.
	 *
	 * @param dateOfBirth the date of birth of this cannabis application company authorized agent
	 */
	@Override
	public void setDateOfBirth(Date dateOfBirth) {
		model.setDateOfBirth(dateOfBirth);
	}

	/**
	 * Sets the email address of this cannabis application company authorized agent.
	 *
	 * @param emailAddress the email address of this cannabis application company authorized agent
	 */
	@Override
	public void setEmailAddress(String emailAddress) {
		model.setEmailAddress(emailAddress);
	}

	/**
	 * Sets the first name of this cannabis application company authorized agent.
	 *
	 * @param firstName the first name of this cannabis application company authorized agent
	 */
	@Override
	public void setFirstName(String firstName) {
		model.setFirstName(firstName);
	}

	/**
	 * Sets the gender of this cannabis application company authorized agent.
	 *
	 * @param gender the gender of this cannabis application company authorized agent
	 */
	@Override
	public void setGender(String gender) {
		model.setGender(gender);
	}

	/**
	 * Sets the group ID of this cannabis application company authorized agent.
	 *
	 * @param groupId the group ID of this cannabis application company authorized agent
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the middle name of this cannabis application company authorized agent.
	 *
	 * @param middleName the middle name of this cannabis application company authorized agent
	 */
	@Override
	public void setMiddleName(String middleName) {
		model.setMiddleName(middleName);
	}

	/**
	 * Sets the modified date of this cannabis application company authorized agent.
	 *
	 * @param modifiedDate the modified date of this cannabis application company authorized agent
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the position of this cannabis application company authorized agent.
	 *
	 * @param position the position of this cannabis application company authorized agent
	 */
	@Override
	public void setPosition(String position) {
		model.setPosition(position);
	}

	/**
	 * Sets the primary key of this cannabis application company authorized agent.
	 *
	 * @param primaryKey the primary key of this cannabis application company authorized agent
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the surname of this cannabis application company authorized agent.
	 *
	 * @param surname the surname of this cannabis application company authorized agent
	 */
	@Override
	public void setSurname(String surname) {
		model.setSurname(surname);
	}

	/**
	 * Sets the user ID of this cannabis application company authorized agent.
	 *
	 * @param userId the user ID of this cannabis application company authorized agent
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this cannabis application company authorized agent.
	 *
	 * @param userName the user name of this cannabis application company authorized agent
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this cannabis application company authorized agent.
	 *
	 * @param userUuid the user uuid of this cannabis application company authorized agent
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this cannabis application company authorized agent.
	 *
	 * @param uuid the uuid of this cannabis application company authorized agent
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
	protected CannabisApplicationCompanyAuthorizedAgentWrapper wrap(
		CannabisApplicationCompanyAuthorizedAgent
			cannabisApplicationCompanyAuthorizedAgent) {

		return new CannabisApplicationCompanyAuthorizedAgentWrapper(
			cannabisApplicationCompanyAuthorizedAgent);
	}

}