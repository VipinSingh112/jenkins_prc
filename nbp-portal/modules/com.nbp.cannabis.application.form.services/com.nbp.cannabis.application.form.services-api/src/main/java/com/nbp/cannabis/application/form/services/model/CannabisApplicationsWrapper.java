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
 * This class is a wrapper for {@link CannabisApplications}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplications
 * @generated
 */
public class CannabisApplicationsWrapper
	extends BaseModelWrapper<CannabisApplications>
	implements CannabisApplications, ModelWrapper<CannabisApplications> {

	public CannabisApplicationsWrapper(
		CannabisApplications cannabisApplications) {

		super(cannabisApplications);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("cannabisApplicationId", getCannabisApplicationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("entityId", getEntityId());
		attributes.put("requestType", getRequestType());
		attributes.put("licenseCategory", getLicenseCategory());
		attributes.put("licenseSubCategory", getLicenseSubCategory());
		attributes.put("typeOfEntity", getTypeOfEntity());
		attributes.put("status", getStatus());
		attributes.put("applicationNumber", getApplicationNumber());
		attributes.put("expiredLicenseAppNo", getExpiredLicenseAppNo());
		attributes.put("caseId", getCaseId());
		attributes.put("icmDocumentsPath", getIcmDocumentsPath());
		attributes.put("PdfFileEntryId", getPdfFileEntryId());
		attributes.put("appCurrentStageName", getAppCurrentStageName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long cannabisApplicationId = (Long)attributes.get(
			"cannabisApplicationId");

		if (cannabisApplicationId != null) {
			setCannabisApplicationId(cannabisApplicationId);
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

		String licenseCategory = (String)attributes.get("licenseCategory");

		if (licenseCategory != null) {
			setLicenseCategory(licenseCategory);
		}

		String licenseSubCategory = (String)attributes.get(
			"licenseSubCategory");

		if (licenseSubCategory != null) {
			setLicenseSubCategory(licenseSubCategory);
		}

		String typeOfEntity = (String)attributes.get("typeOfEntity");

		if (typeOfEntity != null) {
			setTypeOfEntity(typeOfEntity);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String applicationNumber = (String)attributes.get("applicationNumber");

		if (applicationNumber != null) {
			setApplicationNumber(applicationNumber);
		}

		String expiredLicenseAppNo = (String)attributes.get(
			"expiredLicenseAppNo");

		if (expiredLicenseAppNo != null) {
			setExpiredLicenseAppNo(expiredLicenseAppNo);
		}

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		String icmDocumentsPath = (String)attributes.get("icmDocumentsPath");

		if (icmDocumentsPath != null) {
			setIcmDocumentsPath(icmDocumentsPath);
		}

		Long PdfFileEntryId = (Long)attributes.get("PdfFileEntryId");

		if (PdfFileEntryId != null) {
			setPdfFileEntryId(PdfFileEntryId);
		}

		String appCurrentStageName = (String)attributes.get(
			"appCurrentStageName");

		if (appCurrentStageName != null) {
			setAppCurrentStageName(appCurrentStageName);
		}
	}

	@Override
	public CannabisApplications cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the app current stage name of this cannabis applications.
	 *
	 * @return the app current stage name of this cannabis applications
	 */
	@Override
	public String getAppCurrentStageName() {
		return model.getAppCurrentStageName();
	}

	/**
	 * Returns the application number of this cannabis applications.
	 *
	 * @return the application number of this cannabis applications
	 */
	@Override
	public String getApplicationNumber() {
		return model.getApplicationNumber();
	}

	/**
	 * Returns the cannabis application ID of this cannabis applications.
	 *
	 * @return the cannabis application ID of this cannabis applications
	 */
	@Override
	public long getCannabisApplicationId() {
		return model.getCannabisApplicationId();
	}

	/**
	 * Returns the case ID of this cannabis applications.
	 *
	 * @return the case ID of this cannabis applications
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this cannabis applications.
	 *
	 * @return the company ID of this cannabis applications
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this cannabis applications.
	 *
	 * @return the create date of this cannabis applications
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the entity ID of this cannabis applications.
	 *
	 * @return the entity ID of this cannabis applications
	 */
	@Override
	public String getEntityId() {
		return model.getEntityId();
	}

	/**
	 * Returns the expired license app no of this cannabis applications.
	 *
	 * @return the expired license app no of this cannabis applications
	 */
	@Override
	public String getExpiredLicenseAppNo() {
		return model.getExpiredLicenseAppNo();
	}

	/**
	 * Returns the group ID of this cannabis applications.
	 *
	 * @return the group ID of this cannabis applications
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the icm documents path of this cannabis applications.
	 *
	 * @return the icm documents path of this cannabis applications
	 */
	@Override
	public String getIcmDocumentsPath() {
		return model.getIcmDocumentsPath();
	}

	/**
	 * Returns the license category of this cannabis applications.
	 *
	 * @return the license category of this cannabis applications
	 */
	@Override
	public String getLicenseCategory() {
		return model.getLicenseCategory();
	}

	/**
	 * Returns the license sub category of this cannabis applications.
	 *
	 * @return the license sub category of this cannabis applications
	 */
	@Override
	public String getLicenseSubCategory() {
		return model.getLicenseSubCategory();
	}

	/**
	 * Returns the modified date of this cannabis applications.
	 *
	 * @return the modified date of this cannabis applications
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the pdf file entry ID of this cannabis applications.
	 *
	 * @return the pdf file entry ID of this cannabis applications
	 */
	@Override
	public long getPdfFileEntryId() {
		return model.getPdfFileEntryId();
	}

	/**
	 * Returns the primary key of this cannabis applications.
	 *
	 * @return the primary key of this cannabis applications
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the request type of this cannabis applications.
	 *
	 * @return the request type of this cannabis applications
	 */
	@Override
	public String getRequestType() {
		return model.getRequestType();
	}

	/**
	 * Returns the status of this cannabis applications.
	 *
	 * @return the status of this cannabis applications
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the type of entity of this cannabis applications.
	 *
	 * @return the type of entity of this cannabis applications
	 */
	@Override
	public String getTypeOfEntity() {
		return model.getTypeOfEntity();
	}

	/**
	 * Returns the user ID of this cannabis applications.
	 *
	 * @return the user ID of this cannabis applications
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this cannabis applications.
	 *
	 * @return the user name of this cannabis applications
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this cannabis applications.
	 *
	 * @return the user uuid of this cannabis applications
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this cannabis applications.
	 *
	 * @return the uuid of this cannabis applications
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
	 * Sets the app current stage name of this cannabis applications.
	 *
	 * @param appCurrentStageName the app current stage name of this cannabis applications
	 */
	@Override
	public void setAppCurrentStageName(String appCurrentStageName) {
		model.setAppCurrentStageName(appCurrentStageName);
	}

	/**
	 * Sets the application number of this cannabis applications.
	 *
	 * @param applicationNumber the application number of this cannabis applications
	 */
	@Override
	public void setApplicationNumber(String applicationNumber) {
		model.setApplicationNumber(applicationNumber);
	}

	/**
	 * Sets the cannabis application ID of this cannabis applications.
	 *
	 * @param cannabisApplicationId the cannabis application ID of this cannabis applications
	 */
	@Override
	public void setCannabisApplicationId(long cannabisApplicationId) {
		model.setCannabisApplicationId(cannabisApplicationId);
	}

	/**
	 * Sets the case ID of this cannabis applications.
	 *
	 * @param caseId the case ID of this cannabis applications
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this cannabis applications.
	 *
	 * @param companyId the company ID of this cannabis applications
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this cannabis applications.
	 *
	 * @param createDate the create date of this cannabis applications
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the entity ID of this cannabis applications.
	 *
	 * @param entityId the entity ID of this cannabis applications
	 */
	@Override
	public void setEntityId(String entityId) {
		model.setEntityId(entityId);
	}

	/**
	 * Sets the expired license app no of this cannabis applications.
	 *
	 * @param expiredLicenseAppNo the expired license app no of this cannabis applications
	 */
	@Override
	public void setExpiredLicenseAppNo(String expiredLicenseAppNo) {
		model.setExpiredLicenseAppNo(expiredLicenseAppNo);
	}

	/**
	 * Sets the group ID of this cannabis applications.
	 *
	 * @param groupId the group ID of this cannabis applications
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the icm documents path of this cannabis applications.
	 *
	 * @param icmDocumentsPath the icm documents path of this cannabis applications
	 */
	@Override
	public void setIcmDocumentsPath(String icmDocumentsPath) {
		model.setIcmDocumentsPath(icmDocumentsPath);
	}

	/**
	 * Sets the license category of this cannabis applications.
	 *
	 * @param licenseCategory the license category of this cannabis applications
	 */
	@Override
	public void setLicenseCategory(String licenseCategory) {
		model.setLicenseCategory(licenseCategory);
	}

	/**
	 * Sets the license sub category of this cannabis applications.
	 *
	 * @param licenseSubCategory the license sub category of this cannabis applications
	 */
	@Override
	public void setLicenseSubCategory(String licenseSubCategory) {
		model.setLicenseSubCategory(licenseSubCategory);
	}

	/**
	 * Sets the modified date of this cannabis applications.
	 *
	 * @param modifiedDate the modified date of this cannabis applications
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the pdf file entry ID of this cannabis applications.
	 *
	 * @param PdfFileEntryId the pdf file entry ID of this cannabis applications
	 */
	@Override
	public void setPdfFileEntryId(long PdfFileEntryId) {
		model.setPdfFileEntryId(PdfFileEntryId);
	}

	/**
	 * Sets the primary key of this cannabis applications.
	 *
	 * @param primaryKey the primary key of this cannabis applications
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the request type of this cannabis applications.
	 *
	 * @param requestType the request type of this cannabis applications
	 */
	@Override
	public void setRequestType(String requestType) {
		model.setRequestType(requestType);
	}

	/**
	 * Sets the status of this cannabis applications.
	 *
	 * @param status the status of this cannabis applications
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the type of entity of this cannabis applications.
	 *
	 * @param typeOfEntity the type of entity of this cannabis applications
	 */
	@Override
	public void setTypeOfEntity(String typeOfEntity) {
		model.setTypeOfEntity(typeOfEntity);
	}

	/**
	 * Sets the user ID of this cannabis applications.
	 *
	 * @param userId the user ID of this cannabis applications
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this cannabis applications.
	 *
	 * @param userName the user name of this cannabis applications
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this cannabis applications.
	 *
	 * @param userUuid the user uuid of this cannabis applications
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this cannabis applications.
	 *
	 * @param uuid the uuid of this cannabis applications
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
	protected CannabisApplicationsWrapper wrap(
		CannabisApplications cannabisApplications) {

		return new CannabisApplicationsWrapper(cannabisApplications);
	}

}