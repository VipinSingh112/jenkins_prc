/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TourismApplication}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismApplication
 * @generated
 */
public class TourismApplicationWrapper
	extends BaseModelWrapper<TourismApplication>
	implements ModelWrapper<TourismApplication>, TourismApplication {

	public TourismApplicationWrapper(TourismApplication tourismApplication) {
		super(tourismApplication);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tourismApplicationId", getTourismApplicationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("entityId", getEntityId());
		attributes.put("requestType", getRequestType());
		attributes.put("requestTypeTwo", getRequestTypeTwo());
		attributes.put("licenseCategory", getLicenseCategory());
		attributes.put("licenseSubCategory", getLicenseSubCategory());
		attributes.put("status", getStatus());
		attributes.put("applicationNumber", getApplicationNumber());
		attributes.put("caseId", getCaseId());
		attributes.put("icmDocumentsPath", getIcmDocumentsPath());
		attributes.put("pdfFileEntryId", getPdfFileEntryId());
		attributes.put("appCurrentStageName", getAppCurrentStageName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
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

		String requestType = (String)attributes.get("requestType");

		if (requestType != null) {
			setRequestType(requestType);
		}

		String requestTypeTwo = (String)attributes.get("requestTypeTwo");

		if (requestTypeTwo != null) {
			setRequestTypeTwo(requestTypeTwo);
		}

		String licenseCategory = (String)attributes.get("licenseCategory");

		if (licenseCategory != null) {
			setLicenseCategory(licenseCategory);
		}

		String licenseSubCategory = (String)attributes.get(
			"licenseSubCategory");

		if (licenseSubCategory != null) {
			setLicenseSubCategory(licenseSubCategory);
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

		String icmDocumentsPath = (String)attributes.get("icmDocumentsPath");

		if (icmDocumentsPath != null) {
			setIcmDocumentsPath(icmDocumentsPath);
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
	public TourismApplication cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the app current stage name of this tourism application.
	 *
	 * @return the app current stage name of this tourism application
	 */
	@Override
	public String getAppCurrentStageName() {
		return model.getAppCurrentStageName();
	}

	/**
	 * Returns the application number of this tourism application.
	 *
	 * @return the application number of this tourism application
	 */
	@Override
	public String getApplicationNumber() {
		return model.getApplicationNumber();
	}

	/**
	 * Returns the case ID of this tourism application.
	 *
	 * @return the case ID of this tourism application
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this tourism application.
	 *
	 * @return the company ID of this tourism application
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism application.
	 *
	 * @return the create date of this tourism application
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the entity ID of this tourism application.
	 *
	 * @return the entity ID of this tourism application
	 */
	@Override
	public String getEntityId() {
		return model.getEntityId();
	}

	/**
	 * Returns the group ID of this tourism application.
	 *
	 * @return the group ID of this tourism application
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the icm documents path of this tourism application.
	 *
	 * @return the icm documents path of this tourism application
	 */
	@Override
	public String getIcmDocumentsPath() {
		return model.getIcmDocumentsPath();
	}

	/**
	 * Returns the license category of this tourism application.
	 *
	 * @return the license category of this tourism application
	 */
	@Override
	public String getLicenseCategory() {
		return model.getLicenseCategory();
	}

	/**
	 * Returns the license sub category of this tourism application.
	 *
	 * @return the license sub category of this tourism application
	 */
	@Override
	public String getLicenseSubCategory() {
		return model.getLicenseSubCategory();
	}

	/**
	 * Returns the modified date of this tourism application.
	 *
	 * @return the modified date of this tourism application
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the pdf file entry ID of this tourism application.
	 *
	 * @return the pdf file entry ID of this tourism application
	 */
	@Override
	public long getPdfFileEntryId() {
		return model.getPdfFileEntryId();
	}

	/**
	 * Returns the primary key of this tourism application.
	 *
	 * @return the primary key of this tourism application
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the request type of this tourism application.
	 *
	 * @return the request type of this tourism application
	 */
	@Override
	public String getRequestType() {
		return model.getRequestType();
	}

	/**
	 * Returns the request type two of this tourism application.
	 *
	 * @return the request type two of this tourism application
	 */
	@Override
	public String getRequestTypeTwo() {
		return model.getRequestTypeTwo();
	}

	/**
	 * Returns the status of this tourism application.
	 *
	 * @return the status of this tourism application
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the tourism application ID of this tourism application.
	 *
	 * @return the tourism application ID of this tourism application
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the user ID of this tourism application.
	 *
	 * @return the user ID of this tourism application
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism application.
	 *
	 * @return the user name of this tourism application
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism application.
	 *
	 * @return the user uuid of this tourism application
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
	 * Sets the app current stage name of this tourism application.
	 *
	 * @param appCurrentStageName the app current stage name of this tourism application
	 */
	@Override
	public void setAppCurrentStageName(String appCurrentStageName) {
		model.setAppCurrentStageName(appCurrentStageName);
	}

	/**
	 * Sets the application number of this tourism application.
	 *
	 * @param applicationNumber the application number of this tourism application
	 */
	@Override
	public void setApplicationNumber(String applicationNumber) {
		model.setApplicationNumber(applicationNumber);
	}

	/**
	 * Sets the case ID of this tourism application.
	 *
	 * @param caseId the case ID of this tourism application
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this tourism application.
	 *
	 * @param companyId the company ID of this tourism application
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism application.
	 *
	 * @param createDate the create date of this tourism application
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the entity ID of this tourism application.
	 *
	 * @param entityId the entity ID of this tourism application
	 */
	@Override
	public void setEntityId(String entityId) {
		model.setEntityId(entityId);
	}

	/**
	 * Sets the group ID of this tourism application.
	 *
	 * @param groupId the group ID of this tourism application
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the icm documents path of this tourism application.
	 *
	 * @param icmDocumentsPath the icm documents path of this tourism application
	 */
	@Override
	public void setIcmDocumentsPath(String icmDocumentsPath) {
		model.setIcmDocumentsPath(icmDocumentsPath);
	}

	/**
	 * Sets the license category of this tourism application.
	 *
	 * @param licenseCategory the license category of this tourism application
	 */
	@Override
	public void setLicenseCategory(String licenseCategory) {
		model.setLicenseCategory(licenseCategory);
	}

	/**
	 * Sets the license sub category of this tourism application.
	 *
	 * @param licenseSubCategory the license sub category of this tourism application
	 */
	@Override
	public void setLicenseSubCategory(String licenseSubCategory) {
		model.setLicenseSubCategory(licenseSubCategory);
	}

	/**
	 * Sets the modified date of this tourism application.
	 *
	 * @param modifiedDate the modified date of this tourism application
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the pdf file entry ID of this tourism application.
	 *
	 * @param pdfFileEntryId the pdf file entry ID of this tourism application
	 */
	@Override
	public void setPdfFileEntryId(long pdfFileEntryId) {
		model.setPdfFileEntryId(pdfFileEntryId);
	}

	/**
	 * Sets the primary key of this tourism application.
	 *
	 * @param primaryKey the primary key of this tourism application
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the request type of this tourism application.
	 *
	 * @param requestType the request type of this tourism application
	 */
	@Override
	public void setRequestType(String requestType) {
		model.setRequestType(requestType);
	}

	/**
	 * Sets the request type two of this tourism application.
	 *
	 * @param requestTypeTwo the request type two of this tourism application
	 */
	@Override
	public void setRequestTypeTwo(String requestTypeTwo) {
		model.setRequestTypeTwo(requestTypeTwo);
	}

	/**
	 * Sets the status of this tourism application.
	 *
	 * @param status the status of this tourism application
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the tourism application ID of this tourism application.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism application
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the user ID of this tourism application.
	 *
	 * @param userId the user ID of this tourism application
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism application.
	 *
	 * @param userName the user name of this tourism application
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism application.
	 *
	 * @param userUuid the user uuid of this tourism application
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
	protected TourismApplicationWrapper wrap(
		TourismApplication tourismApplication) {

		return new TourismApplicationWrapper(tourismApplication);
	}

}