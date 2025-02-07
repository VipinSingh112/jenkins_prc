/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CreativeApplication}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeApplication
 * @generated
 */
public class CreativeApplicationWrapper
	extends BaseModelWrapper<CreativeApplication>
	implements CreativeApplication, ModelWrapper<CreativeApplication> {

	public CreativeApplicationWrapper(CreativeApplication creativeApplication) {
		super(creativeApplication);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("CreativeApplicationId", getCreativeApplicationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("entityId", getEntityId());
		attributes.put("practitionerStatus", getPractitionerStatus());
		attributes.put("eRegistryNumber", getERegistryNumber());
		attributes.put("entertainerType", getEntertainerType());
		attributes.put("IndividualType", getIndividualType());
		attributes.put("companyType", getCompanyType());
		attributes.put("primaryCategory", getPrimaryCategory());
		attributes.put("mainCategories", getMainCategories());
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
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long CreativeApplicationId = (Long)attributes.get(
			"CreativeApplicationId");

		if (CreativeApplicationId != null) {
			setCreativeApplicationId(CreativeApplicationId);
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

		String practitionerStatus = (String)attributes.get(
			"practitionerStatus");

		if (practitionerStatus != null) {
			setPractitionerStatus(practitionerStatus);
		}

		String eRegistryNumber = (String)attributes.get("eRegistryNumber");

		if (eRegistryNumber != null) {
			setERegistryNumber(eRegistryNumber);
		}

		String entertainerType = (String)attributes.get("entertainerType");

		if (entertainerType != null) {
			setEntertainerType(entertainerType);
		}

		String IndividualType = (String)attributes.get("IndividualType");

		if (IndividualType != null) {
			setIndividualType(IndividualType);
		}

		String companyType = (String)attributes.get("companyType");

		if (companyType != null) {
			setCompanyType(companyType);
		}

		String primaryCategory = (String)attributes.get("primaryCategory");

		if (primaryCategory != null) {
			setPrimaryCategory(primaryCategory);
		}

		String mainCategories = (String)attributes.get("mainCategories");

		if (mainCategories != null) {
			setMainCategories(mainCategories);
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
	public CreativeApplication cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the app current stage name of this creative application.
	 *
	 * @return the app current stage name of this creative application
	 */
	@Override
	public String getAppCurrentStageName() {
		return model.getAppCurrentStageName();
	}

	/**
	 * Returns the application number of this creative application.
	 *
	 * @return the application number of this creative application
	 */
	@Override
	public String getApplicationNumber() {
		return model.getApplicationNumber();
	}

	/**
	 * Returns the case ID of this creative application.
	 *
	 * @return the case ID of this creative application
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this creative application.
	 *
	 * @return the company ID of this creative application
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company type of this creative application.
	 *
	 * @return the company type of this creative application
	 */
	@Override
	public String getCompanyType() {
		return model.getCompanyType();
	}

	/**
	 * Returns the create date of this creative application.
	 *
	 * @return the create date of this creative application
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the creative application ID of this creative application.
	 *
	 * @return the creative application ID of this creative application
	 */
	@Override
	public long getCreativeApplicationId() {
		return model.getCreativeApplicationId();
	}

	/**
	 * Returns the entertainer type of this creative application.
	 *
	 * @return the entertainer type of this creative application
	 */
	@Override
	public String getEntertainerType() {
		return model.getEntertainerType();
	}

	/**
	 * Returns the entity ID of this creative application.
	 *
	 * @return the entity ID of this creative application
	 */
	@Override
	public String getEntityId() {
		return model.getEntityId();
	}

	/**
	 * Returns the e registry number of this creative application.
	 *
	 * @return the e registry number of this creative application
	 */
	@Override
	public String getERegistryNumber() {
		return model.getERegistryNumber();
	}

	/**
	 * Returns the group ID of this creative application.
	 *
	 * @return the group ID of this creative application
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the icm documents path of this creative application.
	 *
	 * @return the icm documents path of this creative application
	 */
	@Override
	public String getIcmDocumentsPath() {
		return model.getIcmDocumentsPath();
	}

	/**
	 * Returns the individual type of this creative application.
	 *
	 * @return the individual type of this creative application
	 */
	@Override
	public String getIndividualType() {
		return model.getIndividualType();
	}

	/**
	 * Returns the main categories of this creative application.
	 *
	 * @return the main categories of this creative application
	 */
	@Override
	public String getMainCategories() {
		return model.getMainCategories();
	}

	/**
	 * Returns the modified date of this creative application.
	 *
	 * @return the modified date of this creative application
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the pdf file entry ID of this creative application.
	 *
	 * @return the pdf file entry ID of this creative application
	 */
	@Override
	public long getPdfFileEntryId() {
		return model.getPdfFileEntryId();
	}

	/**
	 * Returns the practitioner status of this creative application.
	 *
	 * @return the practitioner status of this creative application
	 */
	@Override
	public String getPractitionerStatus() {
		return model.getPractitionerStatus();
	}

	/**
	 * Returns the primary category of this creative application.
	 *
	 * @return the primary category of this creative application
	 */
	@Override
	public String getPrimaryCategory() {
		return model.getPrimaryCategory();
	}

	/**
	 * Returns the primary key of this creative application.
	 *
	 * @return the primary key of this creative application
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this creative application.
	 *
	 * @return the status of this creative application
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the user ID of this creative application.
	 *
	 * @return the user ID of this creative application
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this creative application.
	 *
	 * @return the user name of this creative application
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this creative application.
	 *
	 * @return the user uuid of this creative application
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this creative application.
	 *
	 * @return the uuid of this creative application
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
	 * Sets the app current stage name of this creative application.
	 *
	 * @param appCurrentStageName the app current stage name of this creative application
	 */
	@Override
	public void setAppCurrentStageName(String appCurrentStageName) {
		model.setAppCurrentStageName(appCurrentStageName);
	}

	/**
	 * Sets the application number of this creative application.
	 *
	 * @param applicationNumber the application number of this creative application
	 */
	@Override
	public void setApplicationNumber(String applicationNumber) {
		model.setApplicationNumber(applicationNumber);
	}

	/**
	 * Sets the case ID of this creative application.
	 *
	 * @param caseId the case ID of this creative application
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this creative application.
	 *
	 * @param companyId the company ID of this creative application
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company type of this creative application.
	 *
	 * @param companyType the company type of this creative application
	 */
	@Override
	public void setCompanyType(String companyType) {
		model.setCompanyType(companyType);
	}

	/**
	 * Sets the create date of this creative application.
	 *
	 * @param createDate the create date of this creative application
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the creative application ID of this creative application.
	 *
	 * @param CreativeApplicationId the creative application ID of this creative application
	 */
	@Override
	public void setCreativeApplicationId(long CreativeApplicationId) {
		model.setCreativeApplicationId(CreativeApplicationId);
	}

	/**
	 * Sets the entertainer type of this creative application.
	 *
	 * @param entertainerType the entertainer type of this creative application
	 */
	@Override
	public void setEntertainerType(String entertainerType) {
		model.setEntertainerType(entertainerType);
	}

	/**
	 * Sets the entity ID of this creative application.
	 *
	 * @param entityId the entity ID of this creative application
	 */
	@Override
	public void setEntityId(String entityId) {
		model.setEntityId(entityId);
	}

	/**
	 * Sets the e registry number of this creative application.
	 *
	 * @param eRegistryNumber the e registry number of this creative application
	 */
	@Override
	public void setERegistryNumber(String eRegistryNumber) {
		model.setERegistryNumber(eRegistryNumber);
	}

	/**
	 * Sets the group ID of this creative application.
	 *
	 * @param groupId the group ID of this creative application
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the icm documents path of this creative application.
	 *
	 * @param icmDocumentsPath the icm documents path of this creative application
	 */
	@Override
	public void setIcmDocumentsPath(String icmDocumentsPath) {
		model.setIcmDocumentsPath(icmDocumentsPath);
	}

	/**
	 * Sets the individual type of this creative application.
	 *
	 * @param IndividualType the individual type of this creative application
	 */
	@Override
	public void setIndividualType(String IndividualType) {
		model.setIndividualType(IndividualType);
	}

	/**
	 * Sets the main categories of this creative application.
	 *
	 * @param mainCategories the main categories of this creative application
	 */
	@Override
	public void setMainCategories(String mainCategories) {
		model.setMainCategories(mainCategories);
	}

	/**
	 * Sets the modified date of this creative application.
	 *
	 * @param modifiedDate the modified date of this creative application
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the pdf file entry ID of this creative application.
	 *
	 * @param pdfFileEntryId the pdf file entry ID of this creative application
	 */
	@Override
	public void setPdfFileEntryId(long pdfFileEntryId) {
		model.setPdfFileEntryId(pdfFileEntryId);
	}

	/**
	 * Sets the practitioner status of this creative application.
	 *
	 * @param practitionerStatus the practitioner status of this creative application
	 */
	@Override
	public void setPractitionerStatus(String practitionerStatus) {
		model.setPractitionerStatus(practitionerStatus);
	}

	/**
	 * Sets the primary category of this creative application.
	 *
	 * @param primaryCategory the primary category of this creative application
	 */
	@Override
	public void setPrimaryCategory(String primaryCategory) {
		model.setPrimaryCategory(primaryCategory);
	}

	/**
	 * Sets the primary key of this creative application.
	 *
	 * @param primaryKey the primary key of this creative application
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this creative application.
	 *
	 * @param status the status of this creative application
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the user ID of this creative application.
	 *
	 * @param userId the user ID of this creative application
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this creative application.
	 *
	 * @param userName the user name of this creative application
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this creative application.
	 *
	 * @param userUuid the user uuid of this creative application
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this creative application.
	 *
	 * @param uuid the uuid of this creative application
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
	protected CreativeApplicationWrapper wrap(
		CreativeApplication creativeApplication) {

		return new CreativeApplicationWrapper(creativeApplication);
	}

}