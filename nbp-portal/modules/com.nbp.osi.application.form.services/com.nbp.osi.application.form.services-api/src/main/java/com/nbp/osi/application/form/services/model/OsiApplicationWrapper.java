/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OsiApplication}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiApplication
 * @generated
 */
public class OsiApplicationWrapper
	extends BaseModelWrapper<OsiApplication>
	implements ModelWrapper<OsiApplication>, OsiApplication {

	public OsiApplicationWrapper(OsiApplication osiApplication) {
		super(osiApplication);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("osiApplicationId", getOsiApplicationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("entityId", getEntityId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("applicationType", getApplicationType());
		attributes.put("applicationStatus", getApplicationStatus());
		attributes.put("caseId", getCaseId());
		attributes.put("status", getStatus());
		attributes.put("icmDocumentPath", getIcmDocumentPath());
		attributes.put("applicationNumber", getApplicationNumber());
		attributes.put("expiredLicenseAppNumber", getExpiredLicenseAppNumber());
		attributes.put("pdfFileEntryId", getPdfFileEntryId());
		attributes.put("appCurrentStageName", getAppCurrentStageName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long osiApplicationId = (Long)attributes.get("osiApplicationId");

		if (osiApplicationId != null) {
			setOsiApplicationId(osiApplicationId);
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

		String entityId = (String)attributes.get("entityId");

		if (entityId != null) {
			setEntityId(entityId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String applicationType = (String)attributes.get("applicationType");

		if (applicationType != null) {
			setApplicationType(applicationType);
		}

		Integer applicationStatus = (Integer)attributes.get(
			"applicationStatus");

		if (applicationStatus != null) {
			setApplicationStatus(applicationStatus);
		}

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String icmDocumentPath = (String)attributes.get("icmDocumentPath");

		if (icmDocumentPath != null) {
			setIcmDocumentPath(icmDocumentPath);
		}

		String applicationNumber = (String)attributes.get("applicationNumber");

		if (applicationNumber != null) {
			setApplicationNumber(applicationNumber);
		}

		String expiredLicenseAppNumber = (String)attributes.get(
			"expiredLicenseAppNumber");

		if (expiredLicenseAppNumber != null) {
			setExpiredLicenseAppNumber(expiredLicenseAppNumber);
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
	public OsiApplication cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the app current stage name of this osi application.
	 *
	 * @return the app current stage name of this osi application
	 */
	@Override
	public String getAppCurrentStageName() {
		return model.getAppCurrentStageName();
	}

	/**
	 * Returns the application number of this osi application.
	 *
	 * @return the application number of this osi application
	 */
	@Override
	public String getApplicationNumber() {
		return model.getApplicationNumber();
	}

	/**
	 * Returns the application status of this osi application.
	 *
	 * @return the application status of this osi application
	 */
	@Override
	public int getApplicationStatus() {
		return model.getApplicationStatus();
	}

	/**
	 * Returns the application type of this osi application.
	 *
	 * @return the application type of this osi application
	 */
	@Override
	public String getApplicationType() {
		return model.getApplicationType();
	}

	/**
	 * Returns the case ID of this osi application.
	 *
	 * @return the case ID of this osi application
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this osi application.
	 *
	 * @return the company ID of this osi application
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this osi application.
	 *
	 * @return the create date of this osi application
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the entity ID of this osi application.
	 *
	 * @return the entity ID of this osi application
	 */
	@Override
	public String getEntityId() {
		return model.getEntityId();
	}

	/**
	 * Returns the expired license app number of this osi application.
	 *
	 * @return the expired license app number of this osi application
	 */
	@Override
	public String getExpiredLicenseAppNumber() {
		return model.getExpiredLicenseAppNumber();
	}

	/**
	 * Returns the group ID of this osi application.
	 *
	 * @return the group ID of this osi application
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the icm document path of this osi application.
	 *
	 * @return the icm document path of this osi application
	 */
	@Override
	public String getIcmDocumentPath() {
		return model.getIcmDocumentPath();
	}

	/**
	 * Returns the modified date of this osi application.
	 *
	 * @return the modified date of this osi application
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi application ID of this osi application.
	 *
	 * @return the osi application ID of this osi application
	 */
	@Override
	public long getOsiApplicationId() {
		return model.getOsiApplicationId();
	}

	/**
	 * Returns the pdf file entry ID of this osi application.
	 *
	 * @return the pdf file entry ID of this osi application
	 */
	@Override
	public long getPdfFileEntryId() {
		return model.getPdfFileEntryId();
	}

	/**
	 * Returns the primary key of this osi application.
	 *
	 * @return the primary key of this osi application
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this osi application.
	 *
	 * @return the status of this osi application
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the user ID of this osi application.
	 *
	 * @return the user ID of this osi application
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this osi application.
	 *
	 * @return the user name of this osi application
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this osi application.
	 *
	 * @return the user uuid of this osi application
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
	 * Sets the app current stage name of this osi application.
	 *
	 * @param appCurrentStageName the app current stage name of this osi application
	 */
	@Override
	public void setAppCurrentStageName(String appCurrentStageName) {
		model.setAppCurrentStageName(appCurrentStageName);
	}

	/**
	 * Sets the application number of this osi application.
	 *
	 * @param applicationNumber the application number of this osi application
	 */
	@Override
	public void setApplicationNumber(String applicationNumber) {
		model.setApplicationNumber(applicationNumber);
	}

	/**
	 * Sets the application status of this osi application.
	 *
	 * @param applicationStatus the application status of this osi application
	 */
	@Override
	public void setApplicationStatus(int applicationStatus) {
		model.setApplicationStatus(applicationStatus);
	}

	/**
	 * Sets the application type of this osi application.
	 *
	 * @param applicationType the application type of this osi application
	 */
	@Override
	public void setApplicationType(String applicationType) {
		model.setApplicationType(applicationType);
	}

	/**
	 * Sets the case ID of this osi application.
	 *
	 * @param caseId the case ID of this osi application
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this osi application.
	 *
	 * @param companyId the company ID of this osi application
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this osi application.
	 *
	 * @param createDate the create date of this osi application
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the entity ID of this osi application.
	 *
	 * @param entityId the entity ID of this osi application
	 */
	@Override
	public void setEntityId(String entityId) {
		model.setEntityId(entityId);
	}

	/**
	 * Sets the expired license app number of this osi application.
	 *
	 * @param expiredLicenseAppNumber the expired license app number of this osi application
	 */
	@Override
	public void setExpiredLicenseAppNumber(String expiredLicenseAppNumber) {
		model.setExpiredLicenseAppNumber(expiredLicenseAppNumber);
	}

	/**
	 * Sets the group ID of this osi application.
	 *
	 * @param groupId the group ID of this osi application
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the icm document path of this osi application.
	 *
	 * @param icmDocumentPath the icm document path of this osi application
	 */
	@Override
	public void setIcmDocumentPath(String icmDocumentPath) {
		model.setIcmDocumentPath(icmDocumentPath);
	}

	/**
	 * Sets the modified date of this osi application.
	 *
	 * @param modifiedDate the modified date of this osi application
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi application ID of this osi application.
	 *
	 * @param osiApplicationId the osi application ID of this osi application
	 */
	@Override
	public void setOsiApplicationId(long osiApplicationId) {
		model.setOsiApplicationId(osiApplicationId);
	}

	/**
	 * Sets the pdf file entry ID of this osi application.
	 *
	 * @param pdfFileEntryId the pdf file entry ID of this osi application
	 */
	@Override
	public void setPdfFileEntryId(long pdfFileEntryId) {
		model.setPdfFileEntryId(pdfFileEntryId);
	}

	/**
	 * Sets the primary key of this osi application.
	 *
	 * @param primaryKey the primary key of this osi application
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this osi application.
	 *
	 * @param status the status of this osi application
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the user ID of this osi application.
	 *
	 * @param userId the user ID of this osi application
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this osi application.
	 *
	 * @param userName the user name of this osi application
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this osi application.
	 *
	 * @param userUuid the user uuid of this osi application
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
	protected OsiApplicationWrapper wrap(OsiApplication osiApplication) {
		return new OsiApplicationWrapper(osiApplication);
	}

}