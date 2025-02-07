/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AgricultureApplication}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureApplication
 * @generated
 */
public class AgricultureApplicationWrapper
	extends BaseModelWrapper<AgricultureApplication>
	implements AgricultureApplication, ModelWrapper<AgricultureApplication> {

	public AgricultureApplicationWrapper(
		AgricultureApplication agricultureApplication) {

		super(agricultureApplication);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"agricultureApplicationId", getAgricultureApplicationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("entityId", getEntityId());
		attributes.put("registrationStatus", getRegistrationStatus());
		attributes.put("farmLicenseNumber", getFarmLicenseNumber());
		attributes.put("requestType", getRequestType());
		attributes.put("primaryProduct", getPrimaryProduct());
		attributes.put("status", getStatus());
		attributes.put("applicationNumber", getApplicationNumber());
		attributes.put("expiredLicenseAppNo", getExpiredLicenseAppNo());
		attributes.put("caseId", getCaseId());
		attributes.put("icmDocumentsPath", getIcmDocumentsPath());
		attributes.put("pdfFileEntryId", getPdfFileEntryId());
		attributes.put("appCurrentStageName", getAppCurrentStageName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long agricultureApplicationId = (Long)attributes.get(
			"agricultureApplicationId");

		if (agricultureApplicationId != null) {
			setAgricultureApplicationId(agricultureApplicationId);
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

		String registrationStatus = (String)attributes.get(
			"registrationStatus");

		if (registrationStatus != null) {
			setRegistrationStatus(registrationStatus);
		}

		String farmLicenseNumber = (String)attributes.get("farmLicenseNumber");

		if (farmLicenseNumber != null) {
			setFarmLicenseNumber(farmLicenseNumber);
		}

		String requestType = (String)attributes.get("requestType");

		if (requestType != null) {
			setRequestType(requestType);
		}

		String primaryProduct = (String)attributes.get("primaryProduct");

		if (primaryProduct != null) {
			setPrimaryProduct(primaryProduct);
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
	public AgricultureApplication cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the agriculture application ID of this agriculture application.
	 *
	 * @return the agriculture application ID of this agriculture application
	 */
	@Override
	public long getAgricultureApplicationId() {
		return model.getAgricultureApplicationId();
	}

	/**
	 * Returns the app current stage name of this agriculture application.
	 *
	 * @return the app current stage name of this agriculture application
	 */
	@Override
	public String getAppCurrentStageName() {
		return model.getAppCurrentStageName();
	}

	/**
	 * Returns the application number of this agriculture application.
	 *
	 * @return the application number of this agriculture application
	 */
	@Override
	public String getApplicationNumber() {
		return model.getApplicationNumber();
	}

	/**
	 * Returns the case ID of this agriculture application.
	 *
	 * @return the case ID of this agriculture application
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this agriculture application.
	 *
	 * @return the company ID of this agriculture application
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this agriculture application.
	 *
	 * @return the create date of this agriculture application
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the entity ID of this agriculture application.
	 *
	 * @return the entity ID of this agriculture application
	 */
	@Override
	public String getEntityId() {
		return model.getEntityId();
	}

	/**
	 * Returns the expired license app no of this agriculture application.
	 *
	 * @return the expired license app no of this agriculture application
	 */
	@Override
	public String getExpiredLicenseAppNo() {
		return model.getExpiredLicenseAppNo();
	}

	/**
	 * Returns the farm license number of this agriculture application.
	 *
	 * @return the farm license number of this agriculture application
	 */
	@Override
	public String getFarmLicenseNumber() {
		return model.getFarmLicenseNumber();
	}

	/**
	 * Returns the group ID of this agriculture application.
	 *
	 * @return the group ID of this agriculture application
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the icm documents path of this agriculture application.
	 *
	 * @return the icm documents path of this agriculture application
	 */
	@Override
	public String getIcmDocumentsPath() {
		return model.getIcmDocumentsPath();
	}

	/**
	 * Returns the modified date of this agriculture application.
	 *
	 * @return the modified date of this agriculture application
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the pdf file entry ID of this agriculture application.
	 *
	 * @return the pdf file entry ID of this agriculture application
	 */
	@Override
	public long getPdfFileEntryId() {
		return model.getPdfFileEntryId();
	}

	/**
	 * Returns the primary key of this agriculture application.
	 *
	 * @return the primary key of this agriculture application
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the primary product of this agriculture application.
	 *
	 * @return the primary product of this agriculture application
	 */
	@Override
	public String getPrimaryProduct() {
		return model.getPrimaryProduct();
	}

	/**
	 * Returns the registration status of this agriculture application.
	 *
	 * @return the registration status of this agriculture application
	 */
	@Override
	public String getRegistrationStatus() {
		return model.getRegistrationStatus();
	}

	/**
	 * Returns the request type of this agriculture application.
	 *
	 * @return the request type of this agriculture application
	 */
	@Override
	public String getRequestType() {
		return model.getRequestType();
	}

	/**
	 * Returns the status of this agriculture application.
	 *
	 * @return the status of this agriculture application
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the user ID of this agriculture application.
	 *
	 * @return the user ID of this agriculture application
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this agriculture application.
	 *
	 * @return the user name of this agriculture application
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this agriculture application.
	 *
	 * @return the user uuid of this agriculture application
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
	 * Sets the agriculture application ID of this agriculture application.
	 *
	 * @param agricultureApplicationId the agriculture application ID of this agriculture application
	 */
	@Override
	public void setAgricultureApplicationId(long agricultureApplicationId) {
		model.setAgricultureApplicationId(agricultureApplicationId);
	}

	/**
	 * Sets the app current stage name of this agriculture application.
	 *
	 * @param appCurrentStageName the app current stage name of this agriculture application
	 */
	@Override
	public void setAppCurrentStageName(String appCurrentStageName) {
		model.setAppCurrentStageName(appCurrentStageName);
	}

	/**
	 * Sets the application number of this agriculture application.
	 *
	 * @param applicationNumber the application number of this agriculture application
	 */
	@Override
	public void setApplicationNumber(String applicationNumber) {
		model.setApplicationNumber(applicationNumber);
	}

	/**
	 * Sets the case ID of this agriculture application.
	 *
	 * @param caseId the case ID of this agriculture application
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this agriculture application.
	 *
	 * @param companyId the company ID of this agriculture application
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this agriculture application.
	 *
	 * @param createDate the create date of this agriculture application
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the entity ID of this agriculture application.
	 *
	 * @param entityId the entity ID of this agriculture application
	 */
	@Override
	public void setEntityId(String entityId) {
		model.setEntityId(entityId);
	}

	/**
	 * Sets the expired license app no of this agriculture application.
	 *
	 * @param expiredLicenseAppNo the expired license app no of this agriculture application
	 */
	@Override
	public void setExpiredLicenseAppNo(String expiredLicenseAppNo) {
		model.setExpiredLicenseAppNo(expiredLicenseAppNo);
	}

	/**
	 * Sets the farm license number of this agriculture application.
	 *
	 * @param farmLicenseNumber the farm license number of this agriculture application
	 */
	@Override
	public void setFarmLicenseNumber(String farmLicenseNumber) {
		model.setFarmLicenseNumber(farmLicenseNumber);
	}

	/**
	 * Sets the group ID of this agriculture application.
	 *
	 * @param groupId the group ID of this agriculture application
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the icm documents path of this agriculture application.
	 *
	 * @param icmDocumentsPath the icm documents path of this agriculture application
	 */
	@Override
	public void setIcmDocumentsPath(String icmDocumentsPath) {
		model.setIcmDocumentsPath(icmDocumentsPath);
	}

	/**
	 * Sets the modified date of this agriculture application.
	 *
	 * @param modifiedDate the modified date of this agriculture application
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the pdf file entry ID of this agriculture application.
	 *
	 * @param pdfFileEntryId the pdf file entry ID of this agriculture application
	 */
	@Override
	public void setPdfFileEntryId(long pdfFileEntryId) {
		model.setPdfFileEntryId(pdfFileEntryId);
	}

	/**
	 * Sets the primary key of this agriculture application.
	 *
	 * @param primaryKey the primary key of this agriculture application
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the primary product of this agriculture application.
	 *
	 * @param primaryProduct the primary product of this agriculture application
	 */
	@Override
	public void setPrimaryProduct(String primaryProduct) {
		model.setPrimaryProduct(primaryProduct);
	}

	/**
	 * Sets the registration status of this agriculture application.
	 *
	 * @param registrationStatus the registration status of this agriculture application
	 */
	@Override
	public void setRegistrationStatus(String registrationStatus) {
		model.setRegistrationStatus(registrationStatus);
	}

	/**
	 * Sets the request type of this agriculture application.
	 *
	 * @param requestType the request type of this agriculture application
	 */
	@Override
	public void setRequestType(String requestType) {
		model.setRequestType(requestType);
	}

	/**
	 * Sets the status of this agriculture application.
	 *
	 * @param status the status of this agriculture application
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the user ID of this agriculture application.
	 *
	 * @param userId the user ID of this agriculture application
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this agriculture application.
	 *
	 * @param userName the user name of this agriculture application
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this agriculture application.
	 *
	 * @param userUuid the user uuid of this agriculture application
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
	protected AgricultureApplicationWrapper wrap(
		AgricultureApplication agricultureApplication) {

		return new AgricultureApplicationWrapper(agricultureApplication);
	}

}