/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ExplosivesApplication}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExplosivesApplication
 * @generated
 */
public class ExplosivesApplicationWrapper
	extends BaseModelWrapper<ExplosivesApplication>
	implements ExplosivesApplication, ModelWrapper<ExplosivesApplication> {

	public ExplosivesApplicationWrapper(
		ExplosivesApplication explosivesApplication) {

		super(explosivesApplication);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("explosivesApplicationId", getExplosivesApplicationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("typeOfApplicant", getTypeOfApplicant());
		attributes.put("typeOfTransaction", getTypeOfTransaction());
		attributes.put(
			"competencyCertificateNumber", getCompetencyCertificateNumber());
		attributes.put("dateOfIssue", getDateOfIssue());
		attributes.put("dateOfExpiration", getDateOfExpiration());
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
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long explosivesApplicationId = (Long)attributes.get(
			"explosivesApplicationId");

		if (explosivesApplicationId != null) {
			setExplosivesApplicationId(explosivesApplicationId);
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

		String typeOfTransaction = (String)attributes.get("typeOfTransaction");

		if (typeOfTransaction != null) {
			setTypeOfTransaction(typeOfTransaction);
		}

		String competencyCertificateNumber = (String)attributes.get(
			"competencyCertificateNumber");

		if (competencyCertificateNumber != null) {
			setCompetencyCertificateNumber(competencyCertificateNumber);
		}

		Date dateOfIssue = (Date)attributes.get("dateOfIssue");

		if (dateOfIssue != null) {
			setDateOfIssue(dateOfIssue);
		}

		Date dateOfExpiration = (Date)attributes.get("dateOfExpiration");

		if (dateOfExpiration != null) {
			setDateOfExpiration(dateOfExpiration);
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
	public ExplosivesApplication cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the app current stage name of this explosives application.
	 *
	 * @return the app current stage name of this explosives application
	 */
	@Override
	public String getAppCurrentStageName() {
		return model.getAppCurrentStageName();
	}

	/**
	 * Returns the application number of this explosives application.
	 *
	 * @return the application number of this explosives application
	 */
	@Override
	public String getApplicationNumber() {
		return model.getApplicationNumber();
	}

	/**
	 * Returns the case ID of this explosives application.
	 *
	 * @return the case ID of this explosives application
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this explosives application.
	 *
	 * @return the company ID of this explosives application
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the competency certificate number of this explosives application.
	 *
	 * @return the competency certificate number of this explosives application
	 */
	@Override
	public String getCompetencyCertificateNumber() {
		return model.getCompetencyCertificateNumber();
	}

	/**
	 * Returns the create date of this explosives application.
	 *
	 * @return the create date of this explosives application
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of expiration of this explosives application.
	 *
	 * @return the date of expiration of this explosives application
	 */
	@Override
	public Date getDateOfExpiration() {
		return model.getDateOfExpiration();
	}

	/**
	 * Returns the date of issue of this explosives application.
	 *
	 * @return the date of issue of this explosives application
	 */
	@Override
	public Date getDateOfIssue() {
		return model.getDateOfIssue();
	}

	/**
	 * Returns the expired license app number of this explosives application.
	 *
	 * @return the expired license app number of this explosives application
	 */
	@Override
	public String getExpiredLicenseAppNumber() {
		return model.getExpiredLicenseAppNumber();
	}

	/**
	 * Returns the explosives application ID of this explosives application.
	 *
	 * @return the explosives application ID of this explosives application
	 */
	@Override
	public long getExplosivesApplicationId() {
		return model.getExplosivesApplicationId();
	}

	/**
	 * Returns the group ID of this explosives application.
	 *
	 * @return the group ID of this explosives application
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the icm document path of this explosives application.
	 *
	 * @return the icm document path of this explosives application
	 */
	@Override
	public String getIcmDocumentPath() {
		return model.getIcmDocumentPath();
	}

	/**
	 * Returns the modified date of this explosives application.
	 *
	 * @return the modified date of this explosives application
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the pdf file entry ID of this explosives application.
	 *
	 * @return the pdf file entry ID of this explosives application
	 */
	@Override
	public long getPdfFileEntryId() {
		return model.getPdfFileEntryId();
	}

	/**
	 * Returns the primary key of this explosives application.
	 *
	 * @return the primary key of this explosives application
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this explosives application.
	 *
	 * @return the status of this explosives application
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the type of applicant of this explosives application.
	 *
	 * @return the type of applicant of this explosives application
	 */
	@Override
	public String getTypeOfApplicant() {
		return model.getTypeOfApplicant();
	}

	/**
	 * Returns the type of transaction of this explosives application.
	 *
	 * @return the type of transaction of this explosives application
	 */
	@Override
	public String getTypeOfTransaction() {
		return model.getTypeOfTransaction();
	}

	/**
	 * Returns the user ID of this explosives application.
	 *
	 * @return the user ID of this explosives application
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this explosives application.
	 *
	 * @return the user name of this explosives application
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this explosives application.
	 *
	 * @return the user uuid of this explosives application
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this explosives application.
	 *
	 * @return the uuid of this explosives application
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
	 * Sets the app current stage name of this explosives application.
	 *
	 * @param appCurrentStageName the app current stage name of this explosives application
	 */
	@Override
	public void setAppCurrentStageName(String appCurrentStageName) {
		model.setAppCurrentStageName(appCurrentStageName);
	}

	/**
	 * Sets the application number of this explosives application.
	 *
	 * @param applicationNumber the application number of this explosives application
	 */
	@Override
	public void setApplicationNumber(String applicationNumber) {
		model.setApplicationNumber(applicationNumber);
	}

	/**
	 * Sets the case ID of this explosives application.
	 *
	 * @param caseId the case ID of this explosives application
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this explosives application.
	 *
	 * @param companyId the company ID of this explosives application
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the competency certificate number of this explosives application.
	 *
	 * @param competencyCertificateNumber the competency certificate number of this explosives application
	 */
	@Override
	public void setCompetencyCertificateNumber(
		String competencyCertificateNumber) {

		model.setCompetencyCertificateNumber(competencyCertificateNumber);
	}

	/**
	 * Sets the create date of this explosives application.
	 *
	 * @param createDate the create date of this explosives application
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of expiration of this explosives application.
	 *
	 * @param dateOfExpiration the date of expiration of this explosives application
	 */
	@Override
	public void setDateOfExpiration(Date dateOfExpiration) {
		model.setDateOfExpiration(dateOfExpiration);
	}

	/**
	 * Sets the date of issue of this explosives application.
	 *
	 * @param dateOfIssue the date of issue of this explosives application
	 */
	@Override
	public void setDateOfIssue(Date dateOfIssue) {
		model.setDateOfIssue(dateOfIssue);
	}

	/**
	 * Sets the expired license app number of this explosives application.
	 *
	 * @param expiredLicenseAppNumber the expired license app number of this explosives application
	 */
	@Override
	public void setExpiredLicenseAppNumber(String expiredLicenseAppNumber) {
		model.setExpiredLicenseAppNumber(expiredLicenseAppNumber);
	}

	/**
	 * Sets the explosives application ID of this explosives application.
	 *
	 * @param explosivesApplicationId the explosives application ID of this explosives application
	 */
	@Override
	public void setExplosivesApplicationId(long explosivesApplicationId) {
		model.setExplosivesApplicationId(explosivesApplicationId);
	}

	/**
	 * Sets the group ID of this explosives application.
	 *
	 * @param groupId the group ID of this explosives application
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the icm document path of this explosives application.
	 *
	 * @param icmDocumentPath the icm document path of this explosives application
	 */
	@Override
	public void setIcmDocumentPath(String icmDocumentPath) {
		model.setIcmDocumentPath(icmDocumentPath);
	}

	/**
	 * Sets the modified date of this explosives application.
	 *
	 * @param modifiedDate the modified date of this explosives application
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the pdf file entry ID of this explosives application.
	 *
	 * @param pdfFileEntryId the pdf file entry ID of this explosives application
	 */
	@Override
	public void setPdfFileEntryId(long pdfFileEntryId) {
		model.setPdfFileEntryId(pdfFileEntryId);
	}

	/**
	 * Sets the primary key of this explosives application.
	 *
	 * @param primaryKey the primary key of this explosives application
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this explosives application.
	 *
	 * @param status the status of this explosives application
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the type of applicant of this explosives application.
	 *
	 * @param typeOfApplicant the type of applicant of this explosives application
	 */
	@Override
	public void setTypeOfApplicant(String typeOfApplicant) {
		model.setTypeOfApplicant(typeOfApplicant);
	}

	/**
	 * Sets the type of transaction of this explosives application.
	 *
	 * @param typeOfTransaction the type of transaction of this explosives application
	 */
	@Override
	public void setTypeOfTransaction(String typeOfTransaction) {
		model.setTypeOfTransaction(typeOfTransaction);
	}

	/**
	 * Sets the user ID of this explosives application.
	 *
	 * @param userId the user ID of this explosives application
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this explosives application.
	 *
	 * @param userName the user name of this explosives application
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this explosives application.
	 *
	 * @param userUuid the user uuid of this explosives application
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this explosives application.
	 *
	 * @param uuid the uuid of this explosives application
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
	protected ExplosivesApplicationWrapper wrap(
		ExplosivesApplication explosivesApplication) {

		return new ExplosivesApplicationWrapper(explosivesApplication);
	}

}