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
 * This class is a wrapper for {@link CannabisConditionalLicense}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConditionalLicense
 * @generated
 */
public class CannabisConditionalLicenseWrapper
	extends BaseModelWrapper<CannabisConditionalLicense>
	implements CannabisConditionalLicense,
			   ModelWrapper<CannabisConditionalLicense> {

	public CannabisConditionalLicenseWrapper(
		CannabisConditionalLicense cannabisConditionalLicense) {

		super(cannabisConditionalLicense);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"cannabisConditonalLicenseId", getCannabisConditonalLicenseId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("entityNumber", getEntityNumber());
		attributes.put("entityName", getEntityName());
		attributes.put("categoryTier", getCategoryTier());
		attributes.put("numberOfTheExtension", getNumberOfTheExtension());
		attributes.put("ListOfPreconditions", getListOfPreconditions());
		attributes.put("payentAmtDue", getPayentAmtDue());
		attributes.put("issueDate", getIssueDate());
		attributes.put("expirationDate", getExpirationDate());
		attributes.put("cannabisApplicationId", getCannabisApplicationId());
		attributes.put("updatedBySource", getUpdatedBySource());
		attributes.put("status", getStatus());
		attributes.put("caseId", getCaseId());
		attributes.put(
			"conditionalLicenseFileId", getConditionalLicenseFileId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cannabisConditonalLicenseId = (Long)attributes.get(
			"cannabisConditonalLicenseId");

		if (cannabisConditonalLicenseId != null) {
			setCannabisConditonalLicenseId(cannabisConditonalLicenseId);
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

		String entityNumber = (String)attributes.get("entityNumber");

		if (entityNumber != null) {
			setEntityNumber(entityNumber);
		}

		String entityName = (String)attributes.get("entityName");

		if (entityName != null) {
			setEntityName(entityName);
		}

		String categoryTier = (String)attributes.get("categoryTier");

		if (categoryTier != null) {
			setCategoryTier(categoryTier);
		}

		Integer numberOfTheExtension = (Integer)attributes.get(
			"numberOfTheExtension");

		if (numberOfTheExtension != null) {
			setNumberOfTheExtension(numberOfTheExtension);
		}

		String ListOfPreconditions = (String)attributes.get(
			"ListOfPreconditions");

		if (ListOfPreconditions != null) {
			setListOfPreconditions(ListOfPreconditions);
		}

		String payentAmtDue = (String)attributes.get("payentAmtDue");

		if (payentAmtDue != null) {
			setPayentAmtDue(payentAmtDue);
		}

		Date issueDate = (Date)attributes.get("issueDate");

		if (issueDate != null) {
			setIssueDate(issueDate);
		}

		Date expirationDate = (Date)attributes.get("expirationDate");

		if (expirationDate != null) {
			setExpirationDate(expirationDate);
		}

		Long cannabisApplicationId = (Long)attributes.get(
			"cannabisApplicationId");

		if (cannabisApplicationId != null) {
			setCannabisApplicationId(cannabisApplicationId);
		}

		String updatedBySource = (String)attributes.get("updatedBySource");

		if (updatedBySource != null) {
			setUpdatedBySource(updatedBySource);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		Long conditionalLicenseFileId = (Long)attributes.get(
			"conditionalLicenseFileId");

		if (conditionalLicenseFileId != null) {
			setConditionalLicenseFileId(conditionalLicenseFileId);
		}
	}

	@Override
	public CannabisConditionalLicense cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the cannabis application ID of this cannabis conditional license.
	 *
	 * @return the cannabis application ID of this cannabis conditional license
	 */
	@Override
	public long getCannabisApplicationId() {
		return model.getCannabisApplicationId();
	}

	/**
	 * Returns the cannabis conditonal license ID of this cannabis conditional license.
	 *
	 * @return the cannabis conditonal license ID of this cannabis conditional license
	 */
	@Override
	public long getCannabisConditonalLicenseId() {
		return model.getCannabisConditonalLicenseId();
	}

	/**
	 * Returns the case ID of this cannabis conditional license.
	 *
	 * @return the case ID of this cannabis conditional license
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the category tier of this cannabis conditional license.
	 *
	 * @return the category tier of this cannabis conditional license
	 */
	@Override
	public String getCategoryTier() {
		return model.getCategoryTier();
	}

	/**
	 * Returns the company ID of this cannabis conditional license.
	 *
	 * @return the company ID of this cannabis conditional license
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the conditional license file ID of this cannabis conditional license.
	 *
	 * @return the conditional license file ID of this cannabis conditional license
	 */
	@Override
	public long getConditionalLicenseFileId() {
		return model.getConditionalLicenseFileId();
	}

	/**
	 * Returns the create date of this cannabis conditional license.
	 *
	 * @return the create date of this cannabis conditional license
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the entity name of this cannabis conditional license.
	 *
	 * @return the entity name of this cannabis conditional license
	 */
	@Override
	public String getEntityName() {
		return model.getEntityName();
	}

	/**
	 * Returns the entity number of this cannabis conditional license.
	 *
	 * @return the entity number of this cannabis conditional license
	 */
	@Override
	public String getEntityNumber() {
		return model.getEntityNumber();
	}

	/**
	 * Returns the expiration date of this cannabis conditional license.
	 *
	 * @return the expiration date of this cannabis conditional license
	 */
	@Override
	public Date getExpirationDate() {
		return model.getExpirationDate();
	}

	/**
	 * Returns the group ID of this cannabis conditional license.
	 *
	 * @return the group ID of this cannabis conditional license
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the issue date of this cannabis conditional license.
	 *
	 * @return the issue date of this cannabis conditional license
	 */
	@Override
	public Date getIssueDate() {
		return model.getIssueDate();
	}

	/**
	 * Returns the list of preconditions of this cannabis conditional license.
	 *
	 * @return the list of preconditions of this cannabis conditional license
	 */
	@Override
	public String getListOfPreconditions() {
		return model.getListOfPreconditions();
	}

	/**
	 * Returns the modified date of this cannabis conditional license.
	 *
	 * @return the modified date of this cannabis conditional license
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the number of the extension of this cannabis conditional license.
	 *
	 * @return the number of the extension of this cannabis conditional license
	 */
	@Override
	public int getNumberOfTheExtension() {
		return model.getNumberOfTheExtension();
	}

	/**
	 * Returns the payent amt due of this cannabis conditional license.
	 *
	 * @return the payent amt due of this cannabis conditional license
	 */
	@Override
	public String getPayentAmtDue() {
		return model.getPayentAmtDue();
	}

	/**
	 * Returns the primary key of this cannabis conditional license.
	 *
	 * @return the primary key of this cannabis conditional license
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this cannabis conditional license.
	 *
	 * @return the status of this cannabis conditional license
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the updated by source of this cannabis conditional license.
	 *
	 * @return the updated by source of this cannabis conditional license
	 */
	@Override
	public String getUpdatedBySource() {
		return model.getUpdatedBySource();
	}

	/**
	 * Returns the user ID of this cannabis conditional license.
	 *
	 * @return the user ID of this cannabis conditional license
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this cannabis conditional license.
	 *
	 * @return the user name of this cannabis conditional license
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this cannabis conditional license.
	 *
	 * @return the user uuid of this cannabis conditional license
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
	 * Sets the cannabis application ID of this cannabis conditional license.
	 *
	 * @param cannabisApplicationId the cannabis application ID of this cannabis conditional license
	 */
	@Override
	public void setCannabisApplicationId(long cannabisApplicationId) {
		model.setCannabisApplicationId(cannabisApplicationId);
	}

	/**
	 * Sets the cannabis conditonal license ID of this cannabis conditional license.
	 *
	 * @param cannabisConditonalLicenseId the cannabis conditonal license ID of this cannabis conditional license
	 */
	@Override
	public void setCannabisConditonalLicenseId(
		long cannabisConditonalLicenseId) {

		model.setCannabisConditonalLicenseId(cannabisConditonalLicenseId);
	}

	/**
	 * Sets the case ID of this cannabis conditional license.
	 *
	 * @param caseId the case ID of this cannabis conditional license
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the category tier of this cannabis conditional license.
	 *
	 * @param categoryTier the category tier of this cannabis conditional license
	 */
	@Override
	public void setCategoryTier(String categoryTier) {
		model.setCategoryTier(categoryTier);
	}

	/**
	 * Sets the company ID of this cannabis conditional license.
	 *
	 * @param companyId the company ID of this cannabis conditional license
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the conditional license file ID of this cannabis conditional license.
	 *
	 * @param conditionalLicenseFileId the conditional license file ID of this cannabis conditional license
	 */
	@Override
	public void setConditionalLicenseFileId(long conditionalLicenseFileId) {
		model.setConditionalLicenseFileId(conditionalLicenseFileId);
	}

	/**
	 * Sets the create date of this cannabis conditional license.
	 *
	 * @param createDate the create date of this cannabis conditional license
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the entity name of this cannabis conditional license.
	 *
	 * @param entityName the entity name of this cannabis conditional license
	 */
	@Override
	public void setEntityName(String entityName) {
		model.setEntityName(entityName);
	}

	/**
	 * Sets the entity number of this cannabis conditional license.
	 *
	 * @param entityNumber the entity number of this cannabis conditional license
	 */
	@Override
	public void setEntityNumber(String entityNumber) {
		model.setEntityNumber(entityNumber);
	}

	/**
	 * Sets the expiration date of this cannabis conditional license.
	 *
	 * @param expirationDate the expiration date of this cannabis conditional license
	 */
	@Override
	public void setExpirationDate(Date expirationDate) {
		model.setExpirationDate(expirationDate);
	}

	/**
	 * Sets the group ID of this cannabis conditional license.
	 *
	 * @param groupId the group ID of this cannabis conditional license
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the issue date of this cannabis conditional license.
	 *
	 * @param issueDate the issue date of this cannabis conditional license
	 */
	@Override
	public void setIssueDate(Date issueDate) {
		model.setIssueDate(issueDate);
	}

	/**
	 * Sets the list of preconditions of this cannabis conditional license.
	 *
	 * @param ListOfPreconditions the list of preconditions of this cannabis conditional license
	 */
	@Override
	public void setListOfPreconditions(String ListOfPreconditions) {
		model.setListOfPreconditions(ListOfPreconditions);
	}

	/**
	 * Sets the modified date of this cannabis conditional license.
	 *
	 * @param modifiedDate the modified date of this cannabis conditional license
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the number of the extension of this cannabis conditional license.
	 *
	 * @param numberOfTheExtension the number of the extension of this cannabis conditional license
	 */
	@Override
	public void setNumberOfTheExtension(int numberOfTheExtension) {
		model.setNumberOfTheExtension(numberOfTheExtension);
	}

	/**
	 * Sets the payent amt due of this cannabis conditional license.
	 *
	 * @param payentAmtDue the payent amt due of this cannabis conditional license
	 */
	@Override
	public void setPayentAmtDue(String payentAmtDue) {
		model.setPayentAmtDue(payentAmtDue);
	}

	/**
	 * Sets the primary key of this cannabis conditional license.
	 *
	 * @param primaryKey the primary key of this cannabis conditional license
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this cannabis conditional license.
	 *
	 * @param status the status of this cannabis conditional license
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the updated by source of this cannabis conditional license.
	 *
	 * @param updatedBySource the updated by source of this cannabis conditional license
	 */
	@Override
	public void setUpdatedBySource(String updatedBySource) {
		model.setUpdatedBySource(updatedBySource);
	}

	/**
	 * Sets the user ID of this cannabis conditional license.
	 *
	 * @param userId the user ID of this cannabis conditional license
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this cannabis conditional license.
	 *
	 * @param userName the user name of this cannabis conditional license
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this cannabis conditional license.
	 *
	 * @param userUuid the user uuid of this cannabis conditional license
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
	protected CannabisConditionalLicenseWrapper wrap(
		CannabisConditionalLicense cannabisConditionalLicense) {

		return new CannabisConditionalLicenseWrapper(
			cannabisConditionalLicense);
	}

}