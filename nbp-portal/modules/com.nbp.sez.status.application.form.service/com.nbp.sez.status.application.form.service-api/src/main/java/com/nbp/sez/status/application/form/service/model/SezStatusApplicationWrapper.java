/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SezStatusApplication}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusApplication
 * @generated
 */
public class SezStatusApplicationWrapper
	extends BaseModelWrapper<SezStatusApplication>
	implements ModelWrapper<SezStatusApplication>, SezStatusApplication {

	public SezStatusApplicationWrapper(
		SezStatusApplication sezStatusApplication) {

		super(sezStatusApplication);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("entityId", getEntityId());
		attributes.put("sezStatus", getSezStatus());
		attributes.put("typeOfTransaction", getTypeOfTransaction());
		attributes.put("zoningClassification", getZoningClassification());
		attributes.put("specialEconomicZone", getSpecialEconomicZone());
		attributes.put("parish", getParish());
		attributes.put("industries", getIndustries());
		attributes.put("status", getStatus());
		attributes.put("applicationNumber", getApplicationNumber());
		attributes.put("caseId", getCaseId());
		attributes.put("expiredLicenseAppNumber", getExpiredLicenseAppNumber());
		attributes.put("icmDocumentsPath", getIcmDocumentsPath());
		attributes.put("pdfFileEntryId", getPdfFileEntryId());
		attributes.put("appCurrentStageName", getAppCurrentStageName());
		attributes.put("doYouWantTo", getDoYouWantTo());
		attributes.put("typeOfTransactionWFH", getTypeOfTransactionWFH());
		attributes.put("controlNumberWFH", getControlNumberWFH());
		attributes.put("applicantStatusWFH", getApplicantStatusWFH());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
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

		String sezStatus = (String)attributes.get("sezStatus");

		if (sezStatus != null) {
			setSezStatus(sezStatus);
		}

		String typeOfTransaction = (String)attributes.get("typeOfTransaction");

		if (typeOfTransaction != null) {
			setTypeOfTransaction(typeOfTransaction);
		}

		String zoningClassification = (String)attributes.get(
			"zoningClassification");

		if (zoningClassification != null) {
			setZoningClassification(zoningClassification);
		}

		String specialEconomicZone = (String)attributes.get(
			"specialEconomicZone");

		if (specialEconomicZone != null) {
			setSpecialEconomicZone(specialEconomicZone);
		}

		String parish = (String)attributes.get("parish");

		if (parish != null) {
			setParish(parish);
		}

		String industries = (String)attributes.get("industries");

		if (industries != null) {
			setIndustries(industries);
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

		String doYouWantTo = (String)attributes.get("doYouWantTo");

		if (doYouWantTo != null) {
			setDoYouWantTo(doYouWantTo);
		}

		String typeOfTransactionWFH = (String)attributes.get(
			"typeOfTransactionWFH");

		if (typeOfTransactionWFH != null) {
			setTypeOfTransactionWFH(typeOfTransactionWFH);
		}

		String controlNumberWFH = (String)attributes.get("controlNumberWFH");

		if (controlNumberWFH != null) {
			setControlNumberWFH(controlNumberWFH);
		}

		String applicantStatusWFH = (String)attributes.get(
			"applicantStatusWFH");

		if (applicantStatusWFH != null) {
			setApplicantStatusWFH(applicantStatusWFH);
		}
	}

	@Override
	public SezStatusApplication cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the app current stage name of this sez status application.
	 *
	 * @return the app current stage name of this sez status application
	 */
	@Override
	public String getAppCurrentStageName() {
		return model.getAppCurrentStageName();
	}

	/**
	 * Returns the applicant status wfh of this sez status application.
	 *
	 * @return the applicant status wfh of this sez status application
	 */
	@Override
	public String getApplicantStatusWFH() {
		return model.getApplicantStatusWFH();
	}

	/**
	 * Returns the application number of this sez status application.
	 *
	 * @return the application number of this sez status application
	 */
	@Override
	public String getApplicationNumber() {
		return model.getApplicationNumber();
	}

	/**
	 * Returns the case ID of this sez status application.
	 *
	 * @return the case ID of this sez status application
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this sez status application.
	 *
	 * @return the company ID of this sez status application
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the control number wfh of this sez status application.
	 *
	 * @return the control number wfh of this sez status application
	 */
	@Override
	public String getControlNumberWFH() {
		return model.getControlNumberWFH();
	}

	/**
	 * Returns the create date of this sez status application.
	 *
	 * @return the create date of this sez status application
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the do you want to of this sez status application.
	 *
	 * @return the do you want to of this sez status application
	 */
	@Override
	public String getDoYouWantTo() {
		return model.getDoYouWantTo();
	}

	/**
	 * Returns the entity ID of this sez status application.
	 *
	 * @return the entity ID of this sez status application
	 */
	@Override
	public String getEntityId() {
		return model.getEntityId();
	}

	/**
	 * Returns the expired license app number of this sez status application.
	 *
	 * @return the expired license app number of this sez status application
	 */
	@Override
	public String getExpiredLicenseAppNumber() {
		return model.getExpiredLicenseAppNumber();
	}

	/**
	 * Returns the group ID of this sez status application.
	 *
	 * @return the group ID of this sez status application
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the icm documents path of this sez status application.
	 *
	 * @return the icm documents path of this sez status application
	 */
	@Override
	public String getIcmDocumentsPath() {
		return model.getIcmDocumentsPath();
	}

	/**
	 * Returns the industries of this sez status application.
	 *
	 * @return the industries of this sez status application
	 */
	@Override
	public String getIndustries() {
		return model.getIndustries();
	}

	/**
	 * Returns the modified date of this sez status application.
	 *
	 * @return the modified date of this sez status application
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the parish of this sez status application.
	 *
	 * @return the parish of this sez status application
	 */
	@Override
	public String getParish() {
		return model.getParish();
	}

	/**
	 * Returns the pdf file entry ID of this sez status application.
	 *
	 * @return the pdf file entry ID of this sez status application
	 */
	@Override
	public long getPdfFileEntryId() {
		return model.getPdfFileEntryId();
	}

	/**
	 * Returns the primary key of this sez status application.
	 *
	 * @return the primary key of this sez status application
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez status of this sez status application.
	 *
	 * @return the sez status of this sez status application
	 */
	@Override
	public String getSezStatus() {
		return model.getSezStatus();
	}

	/**
	 * Returns the sez status application ID of this sez status application.
	 *
	 * @return the sez status application ID of this sez status application
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the special economic zone of this sez status application.
	 *
	 * @return the special economic zone of this sez status application
	 */
	@Override
	public String getSpecialEconomicZone() {
		return model.getSpecialEconomicZone();
	}

	/**
	 * Returns the status of this sez status application.
	 *
	 * @return the status of this sez status application
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the type of transaction of this sez status application.
	 *
	 * @return the type of transaction of this sez status application
	 */
	@Override
	public String getTypeOfTransaction() {
		return model.getTypeOfTransaction();
	}

	/**
	 * Returns the type of transaction wfh of this sez status application.
	 *
	 * @return the type of transaction wfh of this sez status application
	 */
	@Override
	public String getTypeOfTransactionWFH() {
		return model.getTypeOfTransactionWFH();
	}

	/**
	 * Returns the user ID of this sez status application.
	 *
	 * @return the user ID of this sez status application
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez status application.
	 *
	 * @return the user name of this sez status application
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez status application.
	 *
	 * @return the user uuid of this sez status application
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the zoning classification of this sez status application.
	 *
	 * @return the zoning classification of this sez status application
	 */
	@Override
	public String getZoningClassification() {
		return model.getZoningClassification();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the app current stage name of this sez status application.
	 *
	 * @param appCurrentStageName the app current stage name of this sez status application
	 */
	@Override
	public void setAppCurrentStageName(String appCurrentStageName) {
		model.setAppCurrentStageName(appCurrentStageName);
	}

	/**
	 * Sets the applicant status wfh of this sez status application.
	 *
	 * @param applicantStatusWFH the applicant status wfh of this sez status application
	 */
	@Override
	public void setApplicantStatusWFH(String applicantStatusWFH) {
		model.setApplicantStatusWFH(applicantStatusWFH);
	}

	/**
	 * Sets the application number of this sez status application.
	 *
	 * @param applicationNumber the application number of this sez status application
	 */
	@Override
	public void setApplicationNumber(String applicationNumber) {
		model.setApplicationNumber(applicationNumber);
	}

	/**
	 * Sets the case ID of this sez status application.
	 *
	 * @param caseId the case ID of this sez status application
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this sez status application.
	 *
	 * @param companyId the company ID of this sez status application
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the control number wfh of this sez status application.
	 *
	 * @param controlNumberWFH the control number wfh of this sez status application
	 */
	@Override
	public void setControlNumberWFH(String controlNumberWFH) {
		model.setControlNumberWFH(controlNumberWFH);
	}

	/**
	 * Sets the create date of this sez status application.
	 *
	 * @param createDate the create date of this sez status application
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the do you want to of this sez status application.
	 *
	 * @param doYouWantTo the do you want to of this sez status application
	 */
	@Override
	public void setDoYouWantTo(String doYouWantTo) {
		model.setDoYouWantTo(doYouWantTo);
	}

	/**
	 * Sets the entity ID of this sez status application.
	 *
	 * @param entityId the entity ID of this sez status application
	 */
	@Override
	public void setEntityId(String entityId) {
		model.setEntityId(entityId);
	}

	/**
	 * Sets the expired license app number of this sez status application.
	 *
	 * @param expiredLicenseAppNumber the expired license app number of this sez status application
	 */
	@Override
	public void setExpiredLicenseAppNumber(String expiredLicenseAppNumber) {
		model.setExpiredLicenseAppNumber(expiredLicenseAppNumber);
	}

	/**
	 * Sets the group ID of this sez status application.
	 *
	 * @param groupId the group ID of this sez status application
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the icm documents path of this sez status application.
	 *
	 * @param icmDocumentsPath the icm documents path of this sez status application
	 */
	@Override
	public void setIcmDocumentsPath(String icmDocumentsPath) {
		model.setIcmDocumentsPath(icmDocumentsPath);
	}

	/**
	 * Sets the industries of this sez status application.
	 *
	 * @param industries the industries of this sez status application
	 */
	@Override
	public void setIndustries(String industries) {
		model.setIndustries(industries);
	}

	/**
	 * Sets the modified date of this sez status application.
	 *
	 * @param modifiedDate the modified date of this sez status application
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the parish of this sez status application.
	 *
	 * @param parish the parish of this sez status application
	 */
	@Override
	public void setParish(String parish) {
		model.setParish(parish);
	}

	/**
	 * Sets the pdf file entry ID of this sez status application.
	 *
	 * @param pdfFileEntryId the pdf file entry ID of this sez status application
	 */
	@Override
	public void setPdfFileEntryId(long pdfFileEntryId) {
		model.setPdfFileEntryId(pdfFileEntryId);
	}

	/**
	 * Sets the primary key of this sez status application.
	 *
	 * @param primaryKey the primary key of this sez status application
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez status of this sez status application.
	 *
	 * @param sezStatus the sez status of this sez status application
	 */
	@Override
	public void setSezStatus(String sezStatus) {
		model.setSezStatus(sezStatus);
	}

	/**
	 * Sets the sez status application ID of this sez status application.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez status application
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the special economic zone of this sez status application.
	 *
	 * @param specialEconomicZone the special economic zone of this sez status application
	 */
	@Override
	public void setSpecialEconomicZone(String specialEconomicZone) {
		model.setSpecialEconomicZone(specialEconomicZone);
	}

	/**
	 * Sets the status of this sez status application.
	 *
	 * @param status the status of this sez status application
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the type of transaction of this sez status application.
	 *
	 * @param typeOfTransaction the type of transaction of this sez status application
	 */
	@Override
	public void setTypeOfTransaction(String typeOfTransaction) {
		model.setTypeOfTransaction(typeOfTransaction);
	}

	/**
	 * Sets the type of transaction wfh of this sez status application.
	 *
	 * @param typeOfTransactionWFH the type of transaction wfh of this sez status application
	 */
	@Override
	public void setTypeOfTransactionWFH(String typeOfTransactionWFH) {
		model.setTypeOfTransactionWFH(typeOfTransactionWFH);
	}

	/**
	 * Sets the user ID of this sez status application.
	 *
	 * @param userId the user ID of this sez status application
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez status application.
	 *
	 * @param userName the user name of this sez status application
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez status application.
	 *
	 * @param userUuid the user uuid of this sez status application
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the zoning classification of this sez status application.
	 *
	 * @param zoningClassification the zoning classification of this sez status application
	 */
	@Override
	public void setZoningClassification(String zoningClassification) {
		model.setZoningClassification(zoningClassification);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected SezStatusApplicationWrapper wrap(
		SezStatusApplication sezStatusApplication) {

		return new SezStatusApplicationWrapper(sezStatusApplication);
	}

}