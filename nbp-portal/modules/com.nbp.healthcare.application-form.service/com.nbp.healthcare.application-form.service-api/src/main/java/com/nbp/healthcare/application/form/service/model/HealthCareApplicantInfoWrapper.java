/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link HealthCareApplicantInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareApplicantInfo
 * @generated
 */
public class HealthCareApplicantInfoWrapper
	extends BaseModelWrapper<HealthCareApplicantInfo>
	implements HealthCareApplicantInfo, ModelWrapper<HealthCareApplicantInfo> {

	public HealthCareApplicantInfoWrapper(
		HealthCareApplicantInfo healthCareApplicantInfo) {

		super(healthCareApplicantInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"healthCareApplicantInfoId", getHealthCareApplicantInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("telephoneNumber", getTelephoneNumber());
		attributes.put("healthCareApplicationId", getHealthCareApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long healthCareApplicantInfoId = (Long)attributes.get(
			"healthCareApplicantInfoId");

		if (healthCareApplicantInfoId != null) {
			setHealthCareApplicantInfoId(healthCareApplicantInfoId);
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		String telephoneNumber = (String)attributes.get("telephoneNumber");

		if (telephoneNumber != null) {
			setTelephoneNumber(telephoneNumber);
		}

		Long healthCareApplicationId = (Long)attributes.get(
			"healthCareApplicationId");

		if (healthCareApplicationId != null) {
			setHealthCareApplicationId(healthCareApplicationId);
		}
	}

	@Override
	public HealthCareApplicantInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this health care applicant info.
	 *
	 * @return the company ID of this health care applicant info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this health care applicant info.
	 *
	 * @return the create date of this health care applicant info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email address of this health care applicant info.
	 *
	 * @return the email address of this health care applicant info
	 */
	@Override
	public String getEmailAddress() {
		return model.getEmailAddress();
	}

	/**
	 * Returns the group ID of this health care applicant info.
	 *
	 * @return the group ID of this health care applicant info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the health care applicant info ID of this health care applicant info.
	 *
	 * @return the health care applicant info ID of this health care applicant info
	 */
	@Override
	public long getHealthCareApplicantInfoId() {
		return model.getHealthCareApplicantInfoId();
	}

	/**
	 * Returns the health care application ID of this health care applicant info.
	 *
	 * @return the health care application ID of this health care applicant info
	 */
	@Override
	public long getHealthCareApplicationId() {
		return model.getHealthCareApplicationId();
	}

	/**
	 * Returns the modified date of this health care applicant info.
	 *
	 * @return the modified date of this health care applicant info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this health care applicant info.
	 *
	 * @return the name of this health care applicant info
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this health care applicant info.
	 *
	 * @return the primary key of this health care applicant info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the telephone number of this health care applicant info.
	 *
	 * @return the telephone number of this health care applicant info
	 */
	@Override
	public String getTelephoneNumber() {
		return model.getTelephoneNumber();
	}

	/**
	 * Returns the user ID of this health care applicant info.
	 *
	 * @return the user ID of this health care applicant info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this health care applicant info.
	 *
	 * @return the user name of this health care applicant info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this health care applicant info.
	 *
	 * @return the user uuid of this health care applicant info
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
	 * Sets the company ID of this health care applicant info.
	 *
	 * @param companyId the company ID of this health care applicant info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this health care applicant info.
	 *
	 * @param createDate the create date of this health care applicant info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email address of this health care applicant info.
	 *
	 * @param emailAddress the email address of this health care applicant info
	 */
	@Override
	public void setEmailAddress(String emailAddress) {
		model.setEmailAddress(emailAddress);
	}

	/**
	 * Sets the group ID of this health care applicant info.
	 *
	 * @param groupId the group ID of this health care applicant info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the health care applicant info ID of this health care applicant info.
	 *
	 * @param healthCareApplicantInfoId the health care applicant info ID of this health care applicant info
	 */
	@Override
	public void setHealthCareApplicantInfoId(long healthCareApplicantInfoId) {
		model.setHealthCareApplicantInfoId(healthCareApplicantInfoId);
	}

	/**
	 * Sets the health care application ID of this health care applicant info.
	 *
	 * @param healthCareApplicationId the health care application ID of this health care applicant info
	 */
	@Override
	public void setHealthCareApplicationId(long healthCareApplicationId) {
		model.setHealthCareApplicationId(healthCareApplicationId);
	}

	/**
	 * Sets the modified date of this health care applicant info.
	 *
	 * @param modifiedDate the modified date of this health care applicant info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this health care applicant info.
	 *
	 * @param name the name of this health care applicant info
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this health care applicant info.
	 *
	 * @param primaryKey the primary key of this health care applicant info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the telephone number of this health care applicant info.
	 *
	 * @param telephoneNumber the telephone number of this health care applicant info
	 */
	@Override
	public void setTelephoneNumber(String telephoneNumber) {
		model.setTelephoneNumber(telephoneNumber);
	}

	/**
	 * Sets the user ID of this health care applicant info.
	 *
	 * @param userId the user ID of this health care applicant info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this health care applicant info.
	 *
	 * @param userName the user name of this health care applicant info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this health care applicant info.
	 *
	 * @param userUuid the user uuid of this health care applicant info
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
	protected HealthCareApplicantInfoWrapper wrap(
		HealthCareApplicantInfo healthCareApplicantInfo) {

		return new HealthCareApplicantInfoWrapper(healthCareApplicantInfo);
	}

}