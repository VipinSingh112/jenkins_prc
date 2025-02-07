/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link HsraApplication}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HsraApplication
 * @generated
 */
public class HsraApplicationWrapper
	extends BaseModelWrapper<HsraApplication>
	implements HsraApplication, ModelWrapper<HsraApplication> {

	public HsraApplicationWrapper(HsraApplication hsraApplication) {
		super(hsraApplication);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("hsraApplicationId", getHsraApplicationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("typeOfApplicant", getTypeOfApplicant());
		attributes.put("typeOfActivities", getTypeOfActivities());
		attributes.put("categoryOfSources", getCategoryOfSources());
		attributes.put("highOne", getHighOne());
		attributes.put("highTwo", getHighTwo());
		attributes.put("medium", getMedium());
		attributes.put("lowOne", getLowOne());
		attributes.put("lowTwo", getLowTwo());
		attributes.put("typeOfTransaction", getTypeOfTransaction());
		attributes.put("riskLevel", getRiskLevel());
		attributes.put("typeOfApplication", getTypeOfApplication());
		attributes.put("brokerTransactionType", getBrokerTransactionType());
		attributes.put("specificApplicable", getSpecificApplicable());
		attributes.put("status", getStatus());
		attributes.put("applicationNumber", getApplicationNumber());
		attributes.put("expiredLicenseAppNumber", getExpiredLicenseAppNumber());
		attributes.put("caseId", getCaseId());
		attributes.put("icmDocumentsPath", getIcmDocumentsPath());
		attributes.put("entityId", getEntityId());
		attributes.put("pdfFileEntryId", getPdfFileEntryId());
		attributes.put("appCurrentStageName", getAppCurrentStageName());
		attributes.put("qualifiedArea", getQualifiedArea());
		attributes.put("expiredDate", getExpiredDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long hsraApplicationId = (Long)attributes.get("hsraApplicationId");

		if (hsraApplicationId != null) {
			setHsraApplicationId(hsraApplicationId);
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

		String typeOfApplicant = (String)attributes.get("typeOfApplicant");

		if (typeOfApplicant != null) {
			setTypeOfApplicant(typeOfApplicant);
		}

		String typeOfActivities = (String)attributes.get("typeOfActivities");

		if (typeOfActivities != null) {
			setTypeOfActivities(typeOfActivities);
		}

		String categoryOfSources = (String)attributes.get("categoryOfSources");

		if (categoryOfSources != null) {
			setCategoryOfSources(categoryOfSources);
		}

		String highOne = (String)attributes.get("highOne");

		if (highOne != null) {
			setHighOne(highOne);
		}

		String highTwo = (String)attributes.get("highTwo");

		if (highTwo != null) {
			setHighTwo(highTwo);
		}

		String medium = (String)attributes.get("medium");

		if (medium != null) {
			setMedium(medium);
		}

		String lowOne = (String)attributes.get("lowOne");

		if (lowOne != null) {
			setLowOne(lowOne);
		}

		String lowTwo = (String)attributes.get("lowTwo");

		if (lowTwo != null) {
			setLowTwo(lowTwo);
		}

		String typeOfTransaction = (String)attributes.get("typeOfTransaction");

		if (typeOfTransaction != null) {
			setTypeOfTransaction(typeOfTransaction);
		}

		String riskLevel = (String)attributes.get("riskLevel");

		if (riskLevel != null) {
			setRiskLevel(riskLevel);
		}

		String typeOfApplication = (String)attributes.get("typeOfApplication");

		if (typeOfApplication != null) {
			setTypeOfApplication(typeOfApplication);
		}

		String brokerTransactionType = (String)attributes.get(
			"brokerTransactionType");

		if (brokerTransactionType != null) {
			setBrokerTransactionType(brokerTransactionType);
		}

		String specificApplicable = (String)attributes.get(
			"specificApplicable");

		if (specificApplicable != null) {
			setSpecificApplicable(specificApplicable);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
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

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		String icmDocumentsPath = (String)attributes.get("icmDocumentsPath");

		if (icmDocumentsPath != null) {
			setIcmDocumentsPath(icmDocumentsPath);
		}

		String entityId = (String)attributes.get("entityId");

		if (entityId != null) {
			setEntityId(entityId);
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

		String qualifiedArea = (String)attributes.get("qualifiedArea");

		if (qualifiedArea != null) {
			setQualifiedArea(qualifiedArea);
		}

		Date expiredDate = (Date)attributes.get("expiredDate");

		if (expiredDate != null) {
			setExpiredDate(expiredDate);
		}
	}

	@Override
	public HsraApplication cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the app current stage name of this hsra application.
	 *
	 * @return the app current stage name of this hsra application
	 */
	@Override
	public String getAppCurrentStageName() {
		return model.getAppCurrentStageName();
	}

	/**
	 * Returns the application number of this hsra application.
	 *
	 * @return the application number of this hsra application
	 */
	@Override
	public String getApplicationNumber() {
		return model.getApplicationNumber();
	}

	/**
	 * Returns the broker transaction type of this hsra application.
	 *
	 * @return the broker transaction type of this hsra application
	 */
	@Override
	public String getBrokerTransactionType() {
		return model.getBrokerTransactionType();
	}

	/**
	 * Returns the case ID of this hsra application.
	 *
	 * @return the case ID of this hsra application
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the category of sources of this hsra application.
	 *
	 * @return the category of sources of this hsra application
	 */
	@Override
	public String getCategoryOfSources() {
		return model.getCategoryOfSources();
	}

	/**
	 * Returns the company ID of this hsra application.
	 *
	 * @return the company ID of this hsra application
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this hsra application.
	 *
	 * @return the create date of this hsra application
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the entity ID of this hsra application.
	 *
	 * @return the entity ID of this hsra application
	 */
	@Override
	public String getEntityId() {
		return model.getEntityId();
	}

	/**
	 * Returns the expired date of this hsra application.
	 *
	 * @return the expired date of this hsra application
	 */
	@Override
	public Date getExpiredDate() {
		return model.getExpiredDate();
	}

	/**
	 * Returns the expired license app number of this hsra application.
	 *
	 * @return the expired license app number of this hsra application
	 */
	@Override
	public String getExpiredLicenseAppNumber() {
		return model.getExpiredLicenseAppNumber();
	}

	/**
	 * Returns the group ID of this hsra application.
	 *
	 * @return the group ID of this hsra application
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the high one of this hsra application.
	 *
	 * @return the high one of this hsra application
	 */
	@Override
	public String getHighOne() {
		return model.getHighOne();
	}

	/**
	 * Returns the high two of this hsra application.
	 *
	 * @return the high two of this hsra application
	 */
	@Override
	public String getHighTwo() {
		return model.getHighTwo();
	}

	/**
	 * Returns the hsra application ID of this hsra application.
	 *
	 * @return the hsra application ID of this hsra application
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the icm documents path of this hsra application.
	 *
	 * @return the icm documents path of this hsra application
	 */
	@Override
	public String getIcmDocumentsPath() {
		return model.getIcmDocumentsPath();
	}

	/**
	 * Returns the low one of this hsra application.
	 *
	 * @return the low one of this hsra application
	 */
	@Override
	public String getLowOne() {
		return model.getLowOne();
	}

	/**
	 * Returns the low two of this hsra application.
	 *
	 * @return the low two of this hsra application
	 */
	@Override
	public String getLowTwo() {
		return model.getLowTwo();
	}

	/**
	 * Returns the medium of this hsra application.
	 *
	 * @return the medium of this hsra application
	 */
	@Override
	public String getMedium() {
		return model.getMedium();
	}

	/**
	 * Returns the modified date of this hsra application.
	 *
	 * @return the modified date of this hsra application
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the pdf file entry ID of this hsra application.
	 *
	 * @return the pdf file entry ID of this hsra application
	 */
	@Override
	public long getPdfFileEntryId() {
		return model.getPdfFileEntryId();
	}

	/**
	 * Returns the primary key of this hsra application.
	 *
	 * @return the primary key of this hsra application
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the qualified area of this hsra application.
	 *
	 * @return the qualified area of this hsra application
	 */
	@Override
	public String getQualifiedArea() {
		return model.getQualifiedArea();
	}

	/**
	 * Returns the risk level of this hsra application.
	 *
	 * @return the risk level of this hsra application
	 */
	@Override
	public String getRiskLevel() {
		return model.getRiskLevel();
	}

	/**
	 * Returns the specific applicable of this hsra application.
	 *
	 * @return the specific applicable of this hsra application
	 */
	@Override
	public String getSpecificApplicable() {
		return model.getSpecificApplicable();
	}

	/**
	 * Returns the status of this hsra application.
	 *
	 * @return the status of this hsra application
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the type of activities of this hsra application.
	 *
	 * @return the type of activities of this hsra application
	 */
	@Override
	public String getTypeOfActivities() {
		return model.getTypeOfActivities();
	}

	/**
	 * Returns the type of applicant of this hsra application.
	 *
	 * @return the type of applicant of this hsra application
	 */
	@Override
	public String getTypeOfApplicant() {
		return model.getTypeOfApplicant();
	}

	/**
	 * Returns the type of application of this hsra application.
	 *
	 * @return the type of application of this hsra application
	 */
	@Override
	public String getTypeOfApplication() {
		return model.getTypeOfApplication();
	}

	/**
	 * Returns the type of transaction of this hsra application.
	 *
	 * @return the type of transaction of this hsra application
	 */
	@Override
	public String getTypeOfTransaction() {
		return model.getTypeOfTransaction();
	}

	/**
	 * Returns the user ID of this hsra application.
	 *
	 * @return the user ID of this hsra application
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this hsra application.
	 *
	 * @return the user name of this hsra application
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this hsra application.
	 *
	 * @return the user uuid of this hsra application
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this hsra application.
	 *
	 * @return the uuid of this hsra application
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
	 * Sets the app current stage name of this hsra application.
	 *
	 * @param appCurrentStageName the app current stage name of this hsra application
	 */
	@Override
	public void setAppCurrentStageName(String appCurrentStageName) {
		model.setAppCurrentStageName(appCurrentStageName);
	}

	/**
	 * Sets the application number of this hsra application.
	 *
	 * @param applicationNumber the application number of this hsra application
	 */
	@Override
	public void setApplicationNumber(String applicationNumber) {
		model.setApplicationNumber(applicationNumber);
	}

	/**
	 * Sets the broker transaction type of this hsra application.
	 *
	 * @param brokerTransactionType the broker transaction type of this hsra application
	 */
	@Override
	public void setBrokerTransactionType(String brokerTransactionType) {
		model.setBrokerTransactionType(brokerTransactionType);
	}

	/**
	 * Sets the case ID of this hsra application.
	 *
	 * @param caseId the case ID of this hsra application
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the category of sources of this hsra application.
	 *
	 * @param categoryOfSources the category of sources of this hsra application
	 */
	@Override
	public void setCategoryOfSources(String categoryOfSources) {
		model.setCategoryOfSources(categoryOfSources);
	}

	/**
	 * Sets the company ID of this hsra application.
	 *
	 * @param companyId the company ID of this hsra application
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this hsra application.
	 *
	 * @param createDate the create date of this hsra application
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the entity ID of this hsra application.
	 *
	 * @param entityId the entity ID of this hsra application
	 */
	@Override
	public void setEntityId(String entityId) {
		model.setEntityId(entityId);
	}

	/**
	 * Sets the expired date of this hsra application.
	 *
	 * @param expiredDate the expired date of this hsra application
	 */
	@Override
	public void setExpiredDate(Date expiredDate) {
		model.setExpiredDate(expiredDate);
	}

	/**
	 * Sets the expired license app number of this hsra application.
	 *
	 * @param expiredLicenseAppNumber the expired license app number of this hsra application
	 */
	@Override
	public void setExpiredLicenseAppNumber(String expiredLicenseAppNumber) {
		model.setExpiredLicenseAppNumber(expiredLicenseAppNumber);
	}

	/**
	 * Sets the group ID of this hsra application.
	 *
	 * @param groupId the group ID of this hsra application
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the high one of this hsra application.
	 *
	 * @param highOne the high one of this hsra application
	 */
	@Override
	public void setHighOne(String highOne) {
		model.setHighOne(highOne);
	}

	/**
	 * Sets the high two of this hsra application.
	 *
	 * @param highTwo the high two of this hsra application
	 */
	@Override
	public void setHighTwo(String highTwo) {
		model.setHighTwo(highTwo);
	}

	/**
	 * Sets the hsra application ID of this hsra application.
	 *
	 * @param hsraApplicationId the hsra application ID of this hsra application
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the icm documents path of this hsra application.
	 *
	 * @param icmDocumentsPath the icm documents path of this hsra application
	 */
	@Override
	public void setIcmDocumentsPath(String icmDocumentsPath) {
		model.setIcmDocumentsPath(icmDocumentsPath);
	}

	/**
	 * Sets the low one of this hsra application.
	 *
	 * @param lowOne the low one of this hsra application
	 */
	@Override
	public void setLowOne(String lowOne) {
		model.setLowOne(lowOne);
	}

	/**
	 * Sets the low two of this hsra application.
	 *
	 * @param lowTwo the low two of this hsra application
	 */
	@Override
	public void setLowTwo(String lowTwo) {
		model.setLowTwo(lowTwo);
	}

	/**
	 * Sets the medium of this hsra application.
	 *
	 * @param medium the medium of this hsra application
	 */
	@Override
	public void setMedium(String medium) {
		model.setMedium(medium);
	}

	/**
	 * Sets the modified date of this hsra application.
	 *
	 * @param modifiedDate the modified date of this hsra application
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the pdf file entry ID of this hsra application.
	 *
	 * @param pdfFileEntryId the pdf file entry ID of this hsra application
	 */
	@Override
	public void setPdfFileEntryId(long pdfFileEntryId) {
		model.setPdfFileEntryId(pdfFileEntryId);
	}

	/**
	 * Sets the primary key of this hsra application.
	 *
	 * @param primaryKey the primary key of this hsra application
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the qualified area of this hsra application.
	 *
	 * @param qualifiedArea the qualified area of this hsra application
	 */
	@Override
	public void setQualifiedArea(String qualifiedArea) {
		model.setQualifiedArea(qualifiedArea);
	}

	/**
	 * Sets the risk level of this hsra application.
	 *
	 * @param riskLevel the risk level of this hsra application
	 */
	@Override
	public void setRiskLevel(String riskLevel) {
		model.setRiskLevel(riskLevel);
	}

	/**
	 * Sets the specific applicable of this hsra application.
	 *
	 * @param specificApplicable the specific applicable of this hsra application
	 */
	@Override
	public void setSpecificApplicable(String specificApplicable) {
		model.setSpecificApplicable(specificApplicable);
	}

	/**
	 * Sets the status of this hsra application.
	 *
	 * @param status the status of this hsra application
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the type of activities of this hsra application.
	 *
	 * @param typeOfActivities the type of activities of this hsra application
	 */
	@Override
	public void setTypeOfActivities(String typeOfActivities) {
		model.setTypeOfActivities(typeOfActivities);
	}

	/**
	 * Sets the type of applicant of this hsra application.
	 *
	 * @param typeOfApplicant the type of applicant of this hsra application
	 */
	@Override
	public void setTypeOfApplicant(String typeOfApplicant) {
		model.setTypeOfApplicant(typeOfApplicant);
	}

	/**
	 * Sets the type of application of this hsra application.
	 *
	 * @param typeOfApplication the type of application of this hsra application
	 */
	@Override
	public void setTypeOfApplication(String typeOfApplication) {
		model.setTypeOfApplication(typeOfApplication);
	}

	/**
	 * Sets the type of transaction of this hsra application.
	 *
	 * @param typeOfTransaction the type of transaction of this hsra application
	 */
	@Override
	public void setTypeOfTransaction(String typeOfTransaction) {
		model.setTypeOfTransaction(typeOfTransaction);
	}

	/**
	 * Sets the user ID of this hsra application.
	 *
	 * @param userId the user ID of this hsra application
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this hsra application.
	 *
	 * @param userName the user name of this hsra application
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this hsra application.
	 *
	 * @param userUuid the user uuid of this hsra application
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this hsra application.
	 *
	 * @param uuid the uuid of this hsra application
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
	protected HsraApplicationWrapper wrap(HsraApplication hsraApplication) {
		return new HsraApplicationWrapper(hsraApplication);
	}

}