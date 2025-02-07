/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FactoriesApplicationRegistration}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesApplicationRegistration
 * @generated
 */
public class FactoriesApplicationRegistrationWrapper
	extends BaseModelWrapper<FactoriesApplicationRegistration>
	implements FactoriesApplicationRegistration,
			   ModelWrapper<FactoriesApplicationRegistration> {

	public FactoriesApplicationRegistrationWrapper(
		FactoriesApplicationRegistration factoriesApplicationRegistration) {

		super(factoriesApplicationRegistration);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("factoriesApplicationId", getFactoriesApplicationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("entityId", getEntityId());
		attributes.put("status", getStatus());
		attributes.put("applicationNumber", getApplicationNumber());
		attributes.put("caseId", getCaseId());
		attributes.put("expiredLicenseAppNumber", getExpiredLicenseAppNumber());
		attributes.put("icmDocumentPath", getIcmDocumentPath());
		attributes.put("productCategory", getProductCategory());
		attributes.put("areYouProcessing", getAreYouProcessing());
		attributes.put("typeOfTransaction", getTypeOfTransaction());
		attributes.put("pdfFileEntryId", getPdfFileEntryId());
		attributes.put("appCurrentStageName", getAppCurrentStageName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long factoriesApplicationId = (Long)attributes.get(
			"factoriesApplicationId");

		if (factoriesApplicationId != null) {
			setFactoriesApplicationId(factoriesApplicationId);
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

		String expiredLicenseAppNumber = (String)attributes.get(
			"expiredLicenseAppNumber");

		if (expiredLicenseAppNumber != null) {
			setExpiredLicenseAppNumber(expiredLicenseAppNumber);
		}

		String icmDocumentPath = (String)attributes.get("icmDocumentPath");

		if (icmDocumentPath != null) {
			setIcmDocumentPath(icmDocumentPath);
		}

		String productCategory = (String)attributes.get("productCategory");

		if (productCategory != null) {
			setProductCategory(productCategory);
		}

		String areYouProcessing = (String)attributes.get("areYouProcessing");

		if (areYouProcessing != null) {
			setAreYouProcessing(areYouProcessing);
		}

		String typeOfTransaction = (String)attributes.get("typeOfTransaction");

		if (typeOfTransaction != null) {
			setTypeOfTransaction(typeOfTransaction);
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
	public FactoriesApplicationRegistration cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the app current stage name of this factories application registration.
	 *
	 * @return the app current stage name of this factories application registration
	 */
	@Override
	public String getAppCurrentStageName() {
		return model.getAppCurrentStageName();
	}

	/**
	 * Returns the application number of this factories application registration.
	 *
	 * @return the application number of this factories application registration
	 */
	@Override
	public String getApplicationNumber() {
		return model.getApplicationNumber();
	}

	/**
	 * Returns the are you processing of this factories application registration.
	 *
	 * @return the are you processing of this factories application registration
	 */
	@Override
	public String getAreYouProcessing() {
		return model.getAreYouProcessing();
	}

	/**
	 * Returns the case ID of this factories application registration.
	 *
	 * @return the case ID of this factories application registration
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this factories application registration.
	 *
	 * @return the company ID of this factories application registration
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this factories application registration.
	 *
	 * @return the create date of this factories application registration
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the entity ID of this factories application registration.
	 *
	 * @return the entity ID of this factories application registration
	 */
	@Override
	public String getEntityId() {
		return model.getEntityId();
	}

	/**
	 * Returns the expired license app number of this factories application registration.
	 *
	 * @return the expired license app number of this factories application registration
	 */
	@Override
	public String getExpiredLicenseAppNumber() {
		return model.getExpiredLicenseAppNumber();
	}

	/**
	 * Returns the factories application ID of this factories application registration.
	 *
	 * @return the factories application ID of this factories application registration
	 */
	@Override
	public long getFactoriesApplicationId() {
		return model.getFactoriesApplicationId();
	}

	/**
	 * Returns the group ID of this factories application registration.
	 *
	 * @return the group ID of this factories application registration
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the icm document path of this factories application registration.
	 *
	 * @return the icm document path of this factories application registration
	 */
	@Override
	public String getIcmDocumentPath() {
		return model.getIcmDocumentPath();
	}

	/**
	 * Returns the modified date of this factories application registration.
	 *
	 * @return the modified date of this factories application registration
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the pdf file entry ID of this factories application registration.
	 *
	 * @return the pdf file entry ID of this factories application registration
	 */
	@Override
	public long getPdfFileEntryId() {
		return model.getPdfFileEntryId();
	}

	/**
	 * Returns the primary key of this factories application registration.
	 *
	 * @return the primary key of this factories application registration
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the product category of this factories application registration.
	 *
	 * @return the product category of this factories application registration
	 */
	@Override
	public String getProductCategory() {
		return model.getProductCategory();
	}

	/**
	 * Returns the status of this factories application registration.
	 *
	 * @return the status of this factories application registration
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the type of transaction of this factories application registration.
	 *
	 * @return the type of transaction of this factories application registration
	 */
	@Override
	public String getTypeOfTransaction() {
		return model.getTypeOfTransaction();
	}

	/**
	 * Returns the user ID of this factories application registration.
	 *
	 * @return the user ID of this factories application registration
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this factories application registration.
	 *
	 * @return the user name of this factories application registration
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this factories application registration.
	 *
	 * @return the user uuid of this factories application registration
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
	 * Sets the app current stage name of this factories application registration.
	 *
	 * @param appCurrentStageName the app current stage name of this factories application registration
	 */
	@Override
	public void setAppCurrentStageName(String appCurrentStageName) {
		model.setAppCurrentStageName(appCurrentStageName);
	}

	/**
	 * Sets the application number of this factories application registration.
	 *
	 * @param applicationNumber the application number of this factories application registration
	 */
	@Override
	public void setApplicationNumber(String applicationNumber) {
		model.setApplicationNumber(applicationNumber);
	}

	/**
	 * Sets the are you processing of this factories application registration.
	 *
	 * @param areYouProcessing the are you processing of this factories application registration
	 */
	@Override
	public void setAreYouProcessing(String areYouProcessing) {
		model.setAreYouProcessing(areYouProcessing);
	}

	/**
	 * Sets the case ID of this factories application registration.
	 *
	 * @param caseId the case ID of this factories application registration
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this factories application registration.
	 *
	 * @param companyId the company ID of this factories application registration
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this factories application registration.
	 *
	 * @param createDate the create date of this factories application registration
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the entity ID of this factories application registration.
	 *
	 * @param entityId the entity ID of this factories application registration
	 */
	@Override
	public void setEntityId(String entityId) {
		model.setEntityId(entityId);
	}

	/**
	 * Sets the expired license app number of this factories application registration.
	 *
	 * @param expiredLicenseAppNumber the expired license app number of this factories application registration
	 */
	@Override
	public void setExpiredLicenseAppNumber(String expiredLicenseAppNumber) {
		model.setExpiredLicenseAppNumber(expiredLicenseAppNumber);
	}

	/**
	 * Sets the factories application ID of this factories application registration.
	 *
	 * @param factoriesApplicationId the factories application ID of this factories application registration
	 */
	@Override
	public void setFactoriesApplicationId(long factoriesApplicationId) {
		model.setFactoriesApplicationId(factoriesApplicationId);
	}

	/**
	 * Sets the group ID of this factories application registration.
	 *
	 * @param groupId the group ID of this factories application registration
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the icm document path of this factories application registration.
	 *
	 * @param icmDocumentPath the icm document path of this factories application registration
	 */
	@Override
	public void setIcmDocumentPath(String icmDocumentPath) {
		model.setIcmDocumentPath(icmDocumentPath);
	}

	/**
	 * Sets the modified date of this factories application registration.
	 *
	 * @param modifiedDate the modified date of this factories application registration
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the pdf file entry ID of this factories application registration.
	 *
	 * @param pdfFileEntryId the pdf file entry ID of this factories application registration
	 */
	@Override
	public void setPdfFileEntryId(long pdfFileEntryId) {
		model.setPdfFileEntryId(pdfFileEntryId);
	}

	/**
	 * Sets the primary key of this factories application registration.
	 *
	 * @param primaryKey the primary key of this factories application registration
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the product category of this factories application registration.
	 *
	 * @param productCategory the product category of this factories application registration
	 */
	@Override
	public void setProductCategory(String productCategory) {
		model.setProductCategory(productCategory);
	}

	/**
	 * Sets the status of this factories application registration.
	 *
	 * @param status the status of this factories application registration
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the type of transaction of this factories application registration.
	 *
	 * @param typeOfTransaction the type of transaction of this factories application registration
	 */
	@Override
	public void setTypeOfTransaction(String typeOfTransaction) {
		model.setTypeOfTransaction(typeOfTransaction);
	}

	/**
	 * Sets the user ID of this factories application registration.
	 *
	 * @param userId the user ID of this factories application registration
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this factories application registration.
	 *
	 * @param userName the user name of this factories application registration
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this factories application registration.
	 *
	 * @param userUuid the user uuid of this factories application registration
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
	protected FactoriesApplicationRegistrationWrapper wrap(
		FactoriesApplicationRegistration factoriesApplicationRegistration) {

		return new FactoriesApplicationRegistrationWrapper(
			factoriesApplicationRegistration);
	}

}