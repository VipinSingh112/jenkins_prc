/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CannabisLicensePreCondtions}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisLicensePreCondtions
 * @generated
 */
public class CannabisLicensePreCondtionsWrapper
	extends BaseModelWrapper<CannabisLicensePreCondtions>
	implements CannabisLicensePreCondtions,
			   ModelWrapper<CannabisLicensePreCondtions> {

	public CannabisLicensePreCondtionsWrapper(
		CannabisLicensePreCondtions cannabisLicensePreCondtions) {

		super(cannabisLicensePreCondtions);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cannabisPreconditionsId", getCannabisPreconditionsId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("precondition", getPrecondition());
		attributes.put("licenseType", getLicenseType());
		attributes.put("status", getStatus());
		attributes.put("cannabisApplicationId", getCannabisApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cannabisPreconditionsId = (Long)attributes.get(
			"cannabisPreconditionsId");

		if (cannabisPreconditionsId != null) {
			setCannabisPreconditionsId(cannabisPreconditionsId);
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

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		String precondition = (String)attributes.get("precondition");

		if (precondition != null) {
			setPrecondition(precondition);
		}

		String licenseType = (String)attributes.get("licenseType");

		if (licenseType != null) {
			setLicenseType(licenseType);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long cannabisApplicationId = (Long)attributes.get(
			"cannabisApplicationId");

		if (cannabisApplicationId != null) {
			setCannabisApplicationId(cannabisApplicationId);
		}
	}

	@Override
	public CannabisLicensePreCondtions cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the cannabis application ID of this cannabis license pre condtions.
	 *
	 * @return the cannabis application ID of this cannabis license pre condtions
	 */
	@Override
	public long getCannabisApplicationId() {
		return model.getCannabisApplicationId();
	}

	/**
	 * Returns the cannabis preconditions ID of this cannabis license pre condtions.
	 *
	 * @return the cannabis preconditions ID of this cannabis license pre condtions
	 */
	@Override
	public long getCannabisPreconditionsId() {
		return model.getCannabisPreconditionsId();
	}

	/**
	 * Returns the case ID of this cannabis license pre condtions.
	 *
	 * @return the case ID of this cannabis license pre condtions
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this cannabis license pre condtions.
	 *
	 * @return the company ID of this cannabis license pre condtions
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this cannabis license pre condtions.
	 *
	 * @return the create date of this cannabis license pre condtions
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this cannabis license pre condtions.
	 *
	 * @return the group ID of this cannabis license pre condtions
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the license type of this cannabis license pre condtions.
	 *
	 * @return the license type of this cannabis license pre condtions
	 */
	@Override
	public String getLicenseType() {
		return model.getLicenseType();
	}

	/**
	 * Returns the modified date of this cannabis license pre condtions.
	 *
	 * @return the modified date of this cannabis license pre condtions
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the precondition of this cannabis license pre condtions.
	 *
	 * @return the precondition of this cannabis license pre condtions
	 */
	@Override
	public String getPrecondition() {
		return model.getPrecondition();
	}

	/**
	 * Returns the primary key of this cannabis license pre condtions.
	 *
	 * @return the primary key of this cannabis license pre condtions
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this cannabis license pre condtions.
	 *
	 * @return the status of this cannabis license pre condtions
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the user ID of this cannabis license pre condtions.
	 *
	 * @return the user ID of this cannabis license pre condtions
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this cannabis license pre condtions.
	 *
	 * @return the user name of this cannabis license pre condtions
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this cannabis license pre condtions.
	 *
	 * @return the user uuid of this cannabis license pre condtions
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
	 * Sets the cannabis application ID of this cannabis license pre condtions.
	 *
	 * @param cannabisApplicationId the cannabis application ID of this cannabis license pre condtions
	 */
	@Override
	public void setCannabisApplicationId(long cannabisApplicationId) {
		model.setCannabisApplicationId(cannabisApplicationId);
	}

	/**
	 * Sets the cannabis preconditions ID of this cannabis license pre condtions.
	 *
	 * @param cannabisPreconditionsId the cannabis preconditions ID of this cannabis license pre condtions
	 */
	@Override
	public void setCannabisPreconditionsId(long cannabisPreconditionsId) {
		model.setCannabisPreconditionsId(cannabisPreconditionsId);
	}

	/**
	 * Sets the case ID of this cannabis license pre condtions.
	 *
	 * @param caseId the case ID of this cannabis license pre condtions
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this cannabis license pre condtions.
	 *
	 * @param companyId the company ID of this cannabis license pre condtions
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this cannabis license pre condtions.
	 *
	 * @param createDate the create date of this cannabis license pre condtions
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this cannabis license pre condtions.
	 *
	 * @param groupId the group ID of this cannabis license pre condtions
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the license type of this cannabis license pre condtions.
	 *
	 * @param licenseType the license type of this cannabis license pre condtions
	 */
	@Override
	public void setLicenseType(String licenseType) {
		model.setLicenseType(licenseType);
	}

	/**
	 * Sets the modified date of this cannabis license pre condtions.
	 *
	 * @param modifiedDate the modified date of this cannabis license pre condtions
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the precondition of this cannabis license pre condtions.
	 *
	 * @param precondition the precondition of this cannabis license pre condtions
	 */
	@Override
	public void setPrecondition(String precondition) {
		model.setPrecondition(precondition);
	}

	/**
	 * Sets the primary key of this cannabis license pre condtions.
	 *
	 * @param primaryKey the primary key of this cannabis license pre condtions
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this cannabis license pre condtions.
	 *
	 * @param status the status of this cannabis license pre condtions
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the user ID of this cannabis license pre condtions.
	 *
	 * @param userId the user ID of this cannabis license pre condtions
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this cannabis license pre condtions.
	 *
	 * @param userName the user name of this cannabis license pre condtions
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this cannabis license pre condtions.
	 *
	 * @param userUuid the user uuid of this cannabis license pre condtions
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
	protected CannabisLicensePreCondtionsWrapper wrap(
		CannabisLicensePreCondtions cannabisLicensePreCondtions) {

		return new CannabisLicensePreCondtionsWrapper(
			cannabisLicensePreCondtions);
	}

}