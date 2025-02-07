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
 * This class is a wrapper for {@link HealthCareApplication}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareApplication
 * @generated
 */
public class HealthCareApplicationWrapper
	extends BaseModelWrapper<HealthCareApplication>
	implements HealthCareApplication, ModelWrapper<HealthCareApplication> {

	public HealthCareApplicationWrapper(
		HealthCareApplication healthCareApplication) {

		super(healthCareApplication);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("healthCareApplicationId", getHealthCareApplicationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("entityId", getEntityId());
		attributes.put("healthCareFacility", getHealthCareFacility());
		attributes.put(
			"healthCareRegistrationNum", getHealthCareRegistrationNum());
		attributes.put("status", getStatus());
		attributes.put("applicationNumber", getApplicationNumber());
		attributes.put("caseId", getCaseId());
		attributes.put("icmDocumentPath", getIcmDocumentPath());
		attributes.put("pdfFileEntryId", getPdfFileEntryId());
		attributes.put("appCurrentStageName", getAppCurrentStageName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long healthCareApplicationId = (Long)attributes.get(
			"healthCareApplicationId");

		if (healthCareApplicationId != null) {
			setHealthCareApplicationId(healthCareApplicationId);
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

		String entityId = (String)attributes.get("entityId");

		if (entityId != null) {
			setEntityId(entityId);
		}

		String healthCareFacility = (String)attributes.get(
			"healthCareFacility");

		if (healthCareFacility != null) {
			setHealthCareFacility(healthCareFacility);
		}

		String healthCareRegistrationNum = (String)attributes.get(
			"healthCareRegistrationNum");

		if (healthCareRegistrationNum != null) {
			setHealthCareRegistrationNum(healthCareRegistrationNum);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String applicationNumber = (String)attributes.get("applicationNumber");

		if (applicationNumber != null) {
			setApplicationNumber(applicationNumber);
		}

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		String icmDocumentPath = (String)attributes.get("icmDocumentPath");

		if (icmDocumentPath != null) {
			setIcmDocumentPath(icmDocumentPath);
		}

		Long pdfFileEntryId = (Long)attributes.get("pdfFileEntryId");

		if (pdfFileEntryId != null) {
			setPdfFileEntryId(pdfFileEntryId);
		}

		String appCurrentStageName = (String)attributes.get(
			"appCurrentStageName");

		if (appCurrentStageName != null) {
			setAppCurrentStageName(appCurrentStageName);
		}
	}

	@Override
	public HealthCareApplication cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the app current stage name of this health care application.
	 *
	 * @return the app current stage name of this health care application
	 */
	@Override
	public String getAppCurrentStageName() {
		return model.getAppCurrentStageName();
	}

	/**
	 * Returns the application number of this health care application.
	 *
	 * @return the application number of this health care application
	 */
	@Override
	public String getApplicationNumber() {
		return model.getApplicationNumber();
	}

	/**
	 * Returns the case ID of this health care application.
	 *
	 * @return the case ID of this health care application
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this health care application.
	 *
	 * @return the company ID of this health care application
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this health care application.
	 *
	 * @return the create date of this health care application
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the entity ID of this health care application.
	 *
	 * @return the entity ID of this health care application
	 */
	@Override
	public String getEntityId() {
		return model.getEntityId();
	}

	/**
	 * Returns the group ID of this health care application.
	 *
	 * @return the group ID of this health care application
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the health care application ID of this health care application.
	 *
	 * @return the health care application ID of this health care application
	 */
	@Override
	public long getHealthCareApplicationId() {
		return model.getHealthCareApplicationId();
	}

	/**
	 * Returns the health care facility of this health care application.
	 *
	 * @return the health care facility of this health care application
	 */
	@Override
	public String getHealthCareFacility() {
		return model.getHealthCareFacility();
	}

	/**
	 * Returns the health care registration num of this health care application.
	 *
	 * @return the health care registration num of this health care application
	 */
	@Override
	public String getHealthCareRegistrationNum() {
		return model.getHealthCareRegistrationNum();
	}

	/**
	 * Returns the icm document path of this health care application.
	 *
	 * @return the icm document path of this health care application
	 */
	@Override
	public String getIcmDocumentPath() {
		return model.getIcmDocumentPath();
	}

	/**
	 * Returns the modified date of this health care application.
	 *
	 * @return the modified date of this health care application
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the pdf file entry ID of this health care application.
	 *
	 * @return the pdf file entry ID of this health care application
	 */
	@Override
	public long getPdfFileEntryId() {
		return model.getPdfFileEntryId();
	}

	/**
	 * Returns the primary key of this health care application.
	 *
	 * @return the primary key of this health care application
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this health care application.
	 *
	 * @return the status of this health care application
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the user ID of this health care application.
	 *
	 * @return the user ID of this health care application
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this health care application.
	 *
	 * @return the user name of this health care application
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this health care application.
	 *
	 * @return the user uuid of this health care application
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
	 * Sets the app current stage name of this health care application.
	 *
	 * @param appCurrentStageName the app current stage name of this health care application
	 */
	@Override
	public void setAppCurrentStageName(String appCurrentStageName) {
		model.setAppCurrentStageName(appCurrentStageName);
	}

	/**
	 * Sets the application number of this health care application.
	 *
	 * @param applicationNumber the application number of this health care application
	 */
	@Override
	public void setApplicationNumber(String applicationNumber) {
		model.setApplicationNumber(applicationNumber);
	}

	/**
	 * Sets the case ID of this health care application.
	 *
	 * @param caseId the case ID of this health care application
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this health care application.
	 *
	 * @param companyId the company ID of this health care application
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this health care application.
	 *
	 * @param createDate the create date of this health care application
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the entity ID of this health care application.
	 *
	 * @param entityId the entity ID of this health care application
	 */
	@Override
	public void setEntityId(String entityId) {
		model.setEntityId(entityId);
	}

	/**
	 * Sets the group ID of this health care application.
	 *
	 * @param groupId the group ID of this health care application
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the health care application ID of this health care application.
	 *
	 * @param healthCareApplicationId the health care application ID of this health care application
	 */
	@Override
	public void setHealthCareApplicationId(long healthCareApplicationId) {
		model.setHealthCareApplicationId(healthCareApplicationId);
	}

	/**
	 * Sets the health care facility of this health care application.
	 *
	 * @param healthCareFacility the health care facility of this health care application
	 */
	@Override
	public void setHealthCareFacility(String healthCareFacility) {
		model.setHealthCareFacility(healthCareFacility);
	}

	/**
	 * Sets the health care registration num of this health care application.
	 *
	 * @param healthCareRegistrationNum the health care registration num of this health care application
	 */
	@Override
	public void setHealthCareRegistrationNum(String healthCareRegistrationNum) {
		model.setHealthCareRegistrationNum(healthCareRegistrationNum);
	}

	/**
	 * Sets the icm document path of this health care application.
	 *
	 * @param icmDocumentPath the icm document path of this health care application
	 */
	@Override
	public void setIcmDocumentPath(String icmDocumentPath) {
		model.setIcmDocumentPath(icmDocumentPath);
	}

	/**
	 * Sets the modified date of this health care application.
	 *
	 * @param modifiedDate the modified date of this health care application
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the pdf file entry ID of this health care application.
	 *
	 * @param pdfFileEntryId the pdf file entry ID of this health care application
	 */
	@Override
	public void setPdfFileEntryId(long pdfFileEntryId) {
		model.setPdfFileEntryId(pdfFileEntryId);
	}

	/**
	 * Sets the primary key of this health care application.
	 *
	 * @param primaryKey the primary key of this health care application
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this health care application.
	 *
	 * @param status the status of this health care application
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the user ID of this health care application.
	 *
	 * @param userId the user ID of this health care application
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this health care application.
	 *
	 * @param userName the user name of this health care application
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this health care application.
	 *
	 * @param userUuid the user uuid of this health care application
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
	protected HealthCareApplicationWrapper wrap(
		HealthCareApplication healthCareApplication) {

		return new HealthCareApplicationWrapper(healthCareApplication);
	}

}