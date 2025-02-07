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
 * This class is a wrapper for {@link HealthCareApplicantAddress}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareApplicantAddress
 * @generated
 */
public class HealthCareApplicantAddressWrapper
	extends BaseModelWrapper<HealthCareApplicantAddress>
	implements HealthCareApplicantAddress,
			   ModelWrapper<HealthCareApplicantAddress> {

	public HealthCareApplicantAddressWrapper(
		HealthCareApplicantAddress healthCareApplicantAddress) {

		super(healthCareApplicantAddress);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"healthCareApplicantAddressId", getHealthCareApplicantAddressId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("applicantMailingAddress", getApplicantMailingAddress());
		attributes.put("healthCareApplicationId", getHealthCareApplicationId());
		attributes.put(
			"healthCareApplicantInfoId", getHealthCareApplicantInfoId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long healthCareApplicantAddressId = (Long)attributes.get(
			"healthCareApplicantAddressId");

		if (healthCareApplicantAddressId != null) {
			setHealthCareApplicantAddressId(healthCareApplicantAddressId);
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

		String applicantMailingAddress = (String)attributes.get(
			"applicantMailingAddress");

		if (applicantMailingAddress != null) {
			setApplicantMailingAddress(applicantMailingAddress);
		}

		Long healthCareApplicationId = (Long)attributes.get(
			"healthCareApplicationId");

		if (healthCareApplicationId != null) {
			setHealthCareApplicationId(healthCareApplicationId);
		}

		Long healthCareApplicantInfoId = (Long)attributes.get(
			"healthCareApplicantInfoId");

		if (healthCareApplicantInfoId != null) {
			setHealthCareApplicantInfoId(healthCareApplicantInfoId);
		}
	}

	@Override
	public HealthCareApplicantAddress cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the applicant mailing address of this health care applicant address.
	 *
	 * @return the applicant mailing address of this health care applicant address
	 */
	@Override
	public String getApplicantMailingAddress() {
		return model.getApplicantMailingAddress();
	}

	/**
	 * Returns the company ID of this health care applicant address.
	 *
	 * @return the company ID of this health care applicant address
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this health care applicant address.
	 *
	 * @return the create date of this health care applicant address
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this health care applicant address.
	 *
	 * @return the group ID of this health care applicant address
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the health care applicant address ID of this health care applicant address.
	 *
	 * @return the health care applicant address ID of this health care applicant address
	 */
	@Override
	public long getHealthCareApplicantAddressId() {
		return model.getHealthCareApplicantAddressId();
	}

	/**
	 * Returns the health care applicant info ID of this health care applicant address.
	 *
	 * @return the health care applicant info ID of this health care applicant address
	 */
	@Override
	public long getHealthCareApplicantInfoId() {
		return model.getHealthCareApplicantInfoId();
	}

	/**
	 * Returns the health care application ID of this health care applicant address.
	 *
	 * @return the health care application ID of this health care applicant address
	 */
	@Override
	public long getHealthCareApplicationId() {
		return model.getHealthCareApplicationId();
	}

	/**
	 * Returns the modified date of this health care applicant address.
	 *
	 * @return the modified date of this health care applicant address
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this health care applicant address.
	 *
	 * @return the primary key of this health care applicant address
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this health care applicant address.
	 *
	 * @return the user ID of this health care applicant address
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this health care applicant address.
	 *
	 * @return the user name of this health care applicant address
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this health care applicant address.
	 *
	 * @return the user uuid of this health care applicant address
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
	 * Sets the applicant mailing address of this health care applicant address.
	 *
	 * @param applicantMailingAddress the applicant mailing address of this health care applicant address
	 */
	@Override
	public void setApplicantMailingAddress(String applicantMailingAddress) {
		model.setApplicantMailingAddress(applicantMailingAddress);
	}

	/**
	 * Sets the company ID of this health care applicant address.
	 *
	 * @param companyId the company ID of this health care applicant address
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this health care applicant address.
	 *
	 * @param createDate the create date of this health care applicant address
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this health care applicant address.
	 *
	 * @param groupId the group ID of this health care applicant address
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the health care applicant address ID of this health care applicant address.
	 *
	 * @param healthCareApplicantAddressId the health care applicant address ID of this health care applicant address
	 */
	@Override
	public void setHealthCareApplicantAddressId(
		long healthCareApplicantAddressId) {

		model.setHealthCareApplicantAddressId(healthCareApplicantAddressId);
	}

	/**
	 * Sets the health care applicant info ID of this health care applicant address.
	 *
	 * @param healthCareApplicantInfoId the health care applicant info ID of this health care applicant address
	 */
	@Override
	public void setHealthCareApplicantInfoId(long healthCareApplicantInfoId) {
		model.setHealthCareApplicantInfoId(healthCareApplicantInfoId);
	}

	/**
	 * Sets the health care application ID of this health care applicant address.
	 *
	 * @param healthCareApplicationId the health care application ID of this health care applicant address
	 */
	@Override
	public void setHealthCareApplicationId(long healthCareApplicationId) {
		model.setHealthCareApplicationId(healthCareApplicationId);
	}

	/**
	 * Sets the modified date of this health care applicant address.
	 *
	 * @param modifiedDate the modified date of this health care applicant address
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this health care applicant address.
	 *
	 * @param primaryKey the primary key of this health care applicant address
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this health care applicant address.
	 *
	 * @param userId the user ID of this health care applicant address
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this health care applicant address.
	 *
	 * @param userName the user name of this health care applicant address
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this health care applicant address.
	 *
	 * @param userUuid the user uuid of this health care applicant address
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
	protected HealthCareApplicantAddressWrapper wrap(
		HealthCareApplicantAddress healthCareApplicantAddress) {

		return new HealthCareApplicantAddressWrapper(
			healthCareApplicantAddress);
	}

}