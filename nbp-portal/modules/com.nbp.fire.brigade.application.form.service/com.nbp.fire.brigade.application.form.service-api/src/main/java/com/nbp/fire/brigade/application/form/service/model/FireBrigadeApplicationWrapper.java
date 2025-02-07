/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FireBrigadeApplication}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeApplication
 * @generated
 */
public class FireBrigadeApplicationWrapper
	extends BaseModelWrapper<FireBrigadeApplication>
	implements FireBrigadeApplication, ModelWrapper<FireBrigadeApplication> {

	public FireBrigadeApplicationWrapper(
		FireBrigadeApplication fireBrigadeApplication) {

		super(fireBrigadeApplication);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put(
			"fireBrigadeApplicationId", getFireBrigadeApplicationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("certificateType", getCertificateType());
		attributes.put("typeOfTransaction", getTypeOfTransaction());
		attributes.put("typeOfApplicant", getTypeOfApplicant());
		attributes.put("typeOfPermises", getTypeOfPermises());
		attributes.put("purposeOfCertificate", getPurposeOfCertificate());
		attributes.put("parish", getParish());
		attributes.put("status", getStatus());
		attributes.put("applicationNumber", getApplicationNumber());
		attributes.put("caseId", getCaseId());
		attributes.put("expiredLicenseNumber", getExpiredLicenseNumber());
		attributes.put("icmDocumentsPath", getIcmDocumentsPath());
		attributes.put("pdfFileEntryId", getPdfFileEntryId());
		attributes.put("appCurrentStageName", getAppCurrentStageName());
		attributes.put("entityId", getEntityId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long fireBrigadeApplicationId = (Long)attributes.get(
			"fireBrigadeApplicationId");

		if (fireBrigadeApplicationId != null) {
			setFireBrigadeApplicationId(fireBrigadeApplicationId);
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

		String certificateType = (String)attributes.get("certificateType");

		if (certificateType != null) {
			setCertificateType(certificateType);
		}

		String typeOfTransaction = (String)attributes.get("typeOfTransaction");

		if (typeOfTransaction != null) {
			setTypeOfTransaction(typeOfTransaction);
		}

		String typeOfApplicant = (String)attributes.get("typeOfApplicant");

		if (typeOfApplicant != null) {
			setTypeOfApplicant(typeOfApplicant);
		}

		String typeOfPermises = (String)attributes.get("typeOfPermises");

		if (typeOfPermises != null) {
			setTypeOfPermises(typeOfPermises);
		}

		String purposeOfCertificate = (String)attributes.get(
			"purposeOfCertificate");

		if (purposeOfCertificate != null) {
			setPurposeOfCertificate(purposeOfCertificate);
		}

		String parish = (String)attributes.get("parish");

		if (parish != null) {
			setParish(parish);
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

		String expiredLicenseNumber = (String)attributes.get(
			"expiredLicenseNumber");

		if (expiredLicenseNumber != null) {
			setExpiredLicenseNumber(expiredLicenseNumber);
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

		String entityId = (String)attributes.get("entityId");

		if (entityId != null) {
			setEntityId(entityId);
		}
	}

	@Override
	public FireBrigadeApplication cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the app current stage name of this fire brigade application.
	 *
	 * @return the app current stage name of this fire brigade application
	 */
	@Override
	public String getAppCurrentStageName() {
		return model.getAppCurrentStageName();
	}

	/**
	 * Returns the application number of this fire brigade application.
	 *
	 * @return the application number of this fire brigade application
	 */
	@Override
	public String getApplicationNumber() {
		return model.getApplicationNumber();
	}

	/**
	 * Returns the case ID of this fire brigade application.
	 *
	 * @return the case ID of this fire brigade application
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the certificate type of this fire brigade application.
	 *
	 * @return the certificate type of this fire brigade application
	 */
	@Override
	public String getCertificateType() {
		return model.getCertificateType();
	}

	/**
	 * Returns the company ID of this fire brigade application.
	 *
	 * @return the company ID of this fire brigade application
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this fire brigade application.
	 *
	 * @return the create date of this fire brigade application
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the entity ID of this fire brigade application.
	 *
	 * @return the entity ID of this fire brigade application
	 */
	@Override
	public String getEntityId() {
		return model.getEntityId();
	}

	/**
	 * Returns the expired license number of this fire brigade application.
	 *
	 * @return the expired license number of this fire brigade application
	 */
	@Override
	public String getExpiredLicenseNumber() {
		return model.getExpiredLicenseNumber();
	}

	/**
	 * Returns the fire brigade application ID of this fire brigade application.
	 *
	 * @return the fire brigade application ID of this fire brigade application
	 */
	@Override
	public long getFireBrigadeApplicationId() {
		return model.getFireBrigadeApplicationId();
	}

	/**
	 * Returns the group ID of this fire brigade application.
	 *
	 * @return the group ID of this fire brigade application
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the icm documents path of this fire brigade application.
	 *
	 * @return the icm documents path of this fire brigade application
	 */
	@Override
	public String getIcmDocumentsPath() {
		return model.getIcmDocumentsPath();
	}

	/**
	 * Returns the modified date of this fire brigade application.
	 *
	 * @return the modified date of this fire brigade application
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the parish of this fire brigade application.
	 *
	 * @return the parish of this fire brigade application
	 */
	@Override
	public String getParish() {
		return model.getParish();
	}

	/**
	 * Returns the pdf file entry ID of this fire brigade application.
	 *
	 * @return the pdf file entry ID of this fire brigade application
	 */
	@Override
	public long getPdfFileEntryId() {
		return model.getPdfFileEntryId();
	}

	/**
	 * Returns the primary key of this fire brigade application.
	 *
	 * @return the primary key of this fire brigade application
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the purpose of certificate of this fire brigade application.
	 *
	 * @return the purpose of certificate of this fire brigade application
	 */
	@Override
	public String getPurposeOfCertificate() {
		return model.getPurposeOfCertificate();
	}

	/**
	 * Returns the status of this fire brigade application.
	 *
	 * @return the status of this fire brigade application
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the type of applicant of this fire brigade application.
	 *
	 * @return the type of applicant of this fire brigade application
	 */
	@Override
	public String getTypeOfApplicant() {
		return model.getTypeOfApplicant();
	}

	/**
	 * Returns the type of permises of this fire brigade application.
	 *
	 * @return the type of permises of this fire brigade application
	 */
	@Override
	public String getTypeOfPermises() {
		return model.getTypeOfPermises();
	}

	/**
	 * Returns the type of transaction of this fire brigade application.
	 *
	 * @return the type of transaction of this fire brigade application
	 */
	@Override
	public String getTypeOfTransaction() {
		return model.getTypeOfTransaction();
	}

	/**
	 * Returns the user ID of this fire brigade application.
	 *
	 * @return the user ID of this fire brigade application
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this fire brigade application.
	 *
	 * @return the user name of this fire brigade application
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this fire brigade application.
	 *
	 * @return the user uuid of this fire brigade application
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this fire brigade application.
	 *
	 * @return the uuid of this fire brigade application
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
	 * Sets the app current stage name of this fire brigade application.
	 *
	 * @param appCurrentStageName the app current stage name of this fire brigade application
	 */
	@Override
	public void setAppCurrentStageName(String appCurrentStageName) {
		model.setAppCurrentStageName(appCurrentStageName);
	}

	/**
	 * Sets the application number of this fire brigade application.
	 *
	 * @param applicationNumber the application number of this fire brigade application
	 */
	@Override
	public void setApplicationNumber(String applicationNumber) {
		model.setApplicationNumber(applicationNumber);
	}

	/**
	 * Sets the case ID of this fire brigade application.
	 *
	 * @param caseId the case ID of this fire brigade application
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the certificate type of this fire brigade application.
	 *
	 * @param certificateType the certificate type of this fire brigade application
	 */
	@Override
	public void setCertificateType(String certificateType) {
		model.setCertificateType(certificateType);
	}

	/**
	 * Sets the company ID of this fire brigade application.
	 *
	 * @param companyId the company ID of this fire brigade application
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this fire brigade application.
	 *
	 * @param createDate the create date of this fire brigade application
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the entity ID of this fire brigade application.
	 *
	 * @param entityId the entity ID of this fire brigade application
	 */
	@Override
	public void setEntityId(String entityId) {
		model.setEntityId(entityId);
	}

	/**
	 * Sets the expired license number of this fire brigade application.
	 *
	 * @param expiredLicenseNumber the expired license number of this fire brigade application
	 */
	@Override
	public void setExpiredLicenseNumber(String expiredLicenseNumber) {
		model.setExpiredLicenseNumber(expiredLicenseNumber);
	}

	/**
	 * Sets the fire brigade application ID of this fire brigade application.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID of this fire brigade application
	 */
	@Override
	public void setFireBrigadeApplicationId(long fireBrigadeApplicationId) {
		model.setFireBrigadeApplicationId(fireBrigadeApplicationId);
	}

	/**
	 * Sets the group ID of this fire brigade application.
	 *
	 * @param groupId the group ID of this fire brigade application
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the icm documents path of this fire brigade application.
	 *
	 * @param icmDocumentsPath the icm documents path of this fire brigade application
	 */
	@Override
	public void setIcmDocumentsPath(String icmDocumentsPath) {
		model.setIcmDocumentsPath(icmDocumentsPath);
	}

	/**
	 * Sets the modified date of this fire brigade application.
	 *
	 * @param modifiedDate the modified date of this fire brigade application
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the parish of this fire brigade application.
	 *
	 * @param parish the parish of this fire brigade application
	 */
	@Override
	public void setParish(String parish) {
		model.setParish(parish);
	}

	/**
	 * Sets the pdf file entry ID of this fire brigade application.
	 *
	 * @param pdfFileEntryId the pdf file entry ID of this fire brigade application
	 */
	@Override
	public void setPdfFileEntryId(long pdfFileEntryId) {
		model.setPdfFileEntryId(pdfFileEntryId);
	}

	/**
	 * Sets the primary key of this fire brigade application.
	 *
	 * @param primaryKey the primary key of this fire brigade application
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the purpose of certificate of this fire brigade application.
	 *
	 * @param purposeOfCertificate the purpose of certificate of this fire brigade application
	 */
	@Override
	public void setPurposeOfCertificate(String purposeOfCertificate) {
		model.setPurposeOfCertificate(purposeOfCertificate);
	}

	/**
	 * Sets the status of this fire brigade application.
	 *
	 * @param status the status of this fire brigade application
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the type of applicant of this fire brigade application.
	 *
	 * @param typeOfApplicant the type of applicant of this fire brigade application
	 */
	@Override
	public void setTypeOfApplicant(String typeOfApplicant) {
		model.setTypeOfApplicant(typeOfApplicant);
	}

	/**
	 * Sets the type of permises of this fire brigade application.
	 *
	 * @param typeOfPermises the type of permises of this fire brigade application
	 */
	@Override
	public void setTypeOfPermises(String typeOfPermises) {
		model.setTypeOfPermises(typeOfPermises);
	}

	/**
	 * Sets the type of transaction of this fire brigade application.
	 *
	 * @param typeOfTransaction the type of transaction of this fire brigade application
	 */
	@Override
	public void setTypeOfTransaction(String typeOfTransaction) {
		model.setTypeOfTransaction(typeOfTransaction);
	}

	/**
	 * Sets the user ID of this fire brigade application.
	 *
	 * @param userId the user ID of this fire brigade application
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this fire brigade application.
	 *
	 * @param userName the user name of this fire brigade application
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this fire brigade application.
	 *
	 * @param userUuid the user uuid of this fire brigade application
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this fire brigade application.
	 *
	 * @param uuid the uuid of this fire brigade application
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
	protected FireBrigadeApplicationWrapper wrap(
		FireBrigadeApplication fireBrigadeApplication) {

		return new FireBrigadeApplicationWrapper(fireBrigadeApplication);
	}

}