/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MedicalFacilitiesApp}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesApp
 * @generated
 */
public class MedicalFacilitiesAppWrapper
	extends BaseModelWrapper<MedicalFacilitiesApp>
	implements MedicalFacilitiesApp, ModelWrapper<MedicalFacilitiesApp> {

	public MedicalFacilitiesAppWrapper(
		MedicalFacilitiesApp medicalFacilitiesApp) {

		super(medicalFacilitiesApp);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("medicalFacilitiesAppId", getMedicalFacilitiesAppId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("natureOfApplicant", getNatureOfApplicant());
		attributes.put("typeOfTransaction", getTypeOfTransaction());
		attributes.put("registrationNumber", getRegistrationNumber());
		attributes.put("medicalCategory", getMedicalCategory());
		attributes.put("subCategory", getSubCategory());
		attributes.put("nursingHomesCategory", getNursingHomesCategory());
		attributes.put("nursingSubCategoryVal", getNursingSubCategoryVal());
		attributes.put("numberOfBeds", getNumberOfBeds());
		attributes.put("caseId", getCaseId());
		attributes.put("status", getStatus());
		attributes.put("icmDocumentPath", getIcmDocumentPath());
		attributes.put("applicationNumber", getApplicationNumber());
		attributes.put("expiredLicenseAppNumber", getExpiredLicenseAppNumber());
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

		Long medicalFacilitiesAppId = (Long)attributes.get(
			"medicalFacilitiesAppId");

		if (medicalFacilitiesAppId != null) {
			setMedicalFacilitiesAppId(medicalFacilitiesAppId);
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

		String natureOfApplicant = (String)attributes.get("natureOfApplicant");

		if (natureOfApplicant != null) {
			setNatureOfApplicant(natureOfApplicant);
		}

		String typeOfTransaction = (String)attributes.get("typeOfTransaction");

		if (typeOfTransaction != null) {
			setTypeOfTransaction(typeOfTransaction);
		}

		Long registrationNumber = (Long)attributes.get("registrationNumber");

		if (registrationNumber != null) {
			setRegistrationNumber(registrationNumber);
		}

		String medicalCategory = (String)attributes.get("medicalCategory");

		if (medicalCategory != null) {
			setMedicalCategory(medicalCategory);
		}

		String subCategory = (String)attributes.get("subCategory");

		if (subCategory != null) {
			setSubCategory(subCategory);
		}

		String nursingHomesCategory = (String)attributes.get(
			"nursingHomesCategory");

		if (nursingHomesCategory != null) {
			setNursingHomesCategory(nursingHomesCategory);
		}

		String nursingSubCategoryVal = (String)attributes.get(
			"nursingSubCategoryVal");

		if (nursingSubCategoryVal != null) {
			setNursingSubCategoryVal(nursingSubCategoryVal);
		}

		String numberOfBeds = (String)attributes.get("numberOfBeds");

		if (numberOfBeds != null) {
			setNumberOfBeds(numberOfBeds);
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

		String entityId = (String)attributes.get("entityId");

		if (entityId != null) {
			setEntityId(entityId);
		}
	}

	@Override
	public MedicalFacilitiesApp cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the app current stage name of this medical facilities app.
	 *
	 * @return the app current stage name of this medical facilities app
	 */
	@Override
	public String getAppCurrentStageName() {
		return model.getAppCurrentStageName();
	}

	/**
	 * Returns the application number of this medical facilities app.
	 *
	 * @return the application number of this medical facilities app
	 */
	@Override
	public String getApplicationNumber() {
		return model.getApplicationNumber();
	}

	/**
	 * Returns the case ID of this medical facilities app.
	 *
	 * @return the case ID of this medical facilities app
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this medical facilities app.
	 *
	 * @return the company ID of this medical facilities app
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this medical facilities app.
	 *
	 * @return the create date of this medical facilities app
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the entity ID of this medical facilities app.
	 *
	 * @return the entity ID of this medical facilities app
	 */
	@Override
	public String getEntityId() {
		return model.getEntityId();
	}

	/**
	 * Returns the expired license app number of this medical facilities app.
	 *
	 * @return the expired license app number of this medical facilities app
	 */
	@Override
	public String getExpiredLicenseAppNumber() {
		return model.getExpiredLicenseAppNumber();
	}

	/**
	 * Returns the group ID of this medical facilities app.
	 *
	 * @return the group ID of this medical facilities app
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the icm document path of this medical facilities app.
	 *
	 * @return the icm document path of this medical facilities app
	 */
	@Override
	public String getIcmDocumentPath() {
		return model.getIcmDocumentPath();
	}

	/**
	 * Returns the medical category of this medical facilities app.
	 *
	 * @return the medical category of this medical facilities app
	 */
	@Override
	public String getMedicalCategory() {
		return model.getMedicalCategory();
	}

	/**
	 * Returns the medical facilities app ID of this medical facilities app.
	 *
	 * @return the medical facilities app ID of this medical facilities app
	 */
	@Override
	public long getMedicalFacilitiesAppId() {
		return model.getMedicalFacilitiesAppId();
	}

	/**
	 * Returns the modified date of this medical facilities app.
	 *
	 * @return the modified date of this medical facilities app
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nature of applicant of this medical facilities app.
	 *
	 * @return the nature of applicant of this medical facilities app
	 */
	@Override
	public String getNatureOfApplicant() {
		return model.getNatureOfApplicant();
	}

	/**
	 * Returns the number of beds of this medical facilities app.
	 *
	 * @return the number of beds of this medical facilities app
	 */
	@Override
	public String getNumberOfBeds() {
		return model.getNumberOfBeds();
	}

	/**
	 * Returns the nursing homes category of this medical facilities app.
	 *
	 * @return the nursing homes category of this medical facilities app
	 */
	@Override
	public String getNursingHomesCategory() {
		return model.getNursingHomesCategory();
	}

	/**
	 * Returns the nursing sub category val of this medical facilities app.
	 *
	 * @return the nursing sub category val of this medical facilities app
	 */
	@Override
	public String getNursingSubCategoryVal() {
		return model.getNursingSubCategoryVal();
	}

	/**
	 * Returns the pdf file entry ID of this medical facilities app.
	 *
	 * @return the pdf file entry ID of this medical facilities app
	 */
	@Override
	public long getPdfFileEntryId() {
		return model.getPdfFileEntryId();
	}

	/**
	 * Returns the primary key of this medical facilities app.
	 *
	 * @return the primary key of this medical facilities app
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the registration number of this medical facilities app.
	 *
	 * @return the registration number of this medical facilities app
	 */
	@Override
	public Long getRegistrationNumber() {
		return model.getRegistrationNumber();
	}

	/**
	 * Returns the status of this medical facilities app.
	 *
	 * @return the status of this medical facilities app
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the sub category of this medical facilities app.
	 *
	 * @return the sub category of this medical facilities app
	 */
	@Override
	public String getSubCategory() {
		return model.getSubCategory();
	}

	/**
	 * Returns the type of transaction of this medical facilities app.
	 *
	 * @return the type of transaction of this medical facilities app
	 */
	@Override
	public String getTypeOfTransaction() {
		return model.getTypeOfTransaction();
	}

	/**
	 * Returns the user ID of this medical facilities app.
	 *
	 * @return the user ID of this medical facilities app
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this medical facilities app.
	 *
	 * @return the user name of this medical facilities app
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this medical facilities app.
	 *
	 * @return the user uuid of this medical facilities app
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this medical facilities app.
	 *
	 * @return the uuid of this medical facilities app
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
	 * Sets the app current stage name of this medical facilities app.
	 *
	 * @param appCurrentStageName the app current stage name of this medical facilities app
	 */
	@Override
	public void setAppCurrentStageName(String appCurrentStageName) {
		model.setAppCurrentStageName(appCurrentStageName);
	}

	/**
	 * Sets the application number of this medical facilities app.
	 *
	 * @param applicationNumber the application number of this medical facilities app
	 */
	@Override
	public void setApplicationNumber(String applicationNumber) {
		model.setApplicationNumber(applicationNumber);
	}

	/**
	 * Sets the case ID of this medical facilities app.
	 *
	 * @param caseId the case ID of this medical facilities app
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this medical facilities app.
	 *
	 * @param companyId the company ID of this medical facilities app
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this medical facilities app.
	 *
	 * @param createDate the create date of this medical facilities app
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the entity ID of this medical facilities app.
	 *
	 * @param entityId the entity ID of this medical facilities app
	 */
	@Override
	public void setEntityId(String entityId) {
		model.setEntityId(entityId);
	}

	/**
	 * Sets the expired license app number of this medical facilities app.
	 *
	 * @param expiredLicenseAppNumber the expired license app number of this medical facilities app
	 */
	@Override
	public void setExpiredLicenseAppNumber(String expiredLicenseAppNumber) {
		model.setExpiredLicenseAppNumber(expiredLicenseAppNumber);
	}

	/**
	 * Sets the group ID of this medical facilities app.
	 *
	 * @param groupId the group ID of this medical facilities app
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the icm document path of this medical facilities app.
	 *
	 * @param icmDocumentPath the icm document path of this medical facilities app
	 */
	@Override
	public void setIcmDocumentPath(String icmDocumentPath) {
		model.setIcmDocumentPath(icmDocumentPath);
	}

	/**
	 * Sets the medical category of this medical facilities app.
	 *
	 * @param medicalCategory the medical category of this medical facilities app
	 */
	@Override
	public void setMedicalCategory(String medicalCategory) {
		model.setMedicalCategory(medicalCategory);
	}

	/**
	 * Sets the medical facilities app ID of this medical facilities app.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID of this medical facilities app
	 */
	@Override
	public void setMedicalFacilitiesAppId(long medicalFacilitiesAppId) {
		model.setMedicalFacilitiesAppId(medicalFacilitiesAppId);
	}

	/**
	 * Sets the modified date of this medical facilities app.
	 *
	 * @param modifiedDate the modified date of this medical facilities app
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nature of applicant of this medical facilities app.
	 *
	 * @param natureOfApplicant the nature of applicant of this medical facilities app
	 */
	@Override
	public void setNatureOfApplicant(String natureOfApplicant) {
		model.setNatureOfApplicant(natureOfApplicant);
	}

	/**
	 * Sets the number of beds of this medical facilities app.
	 *
	 * @param numberOfBeds the number of beds of this medical facilities app
	 */
	@Override
	public void setNumberOfBeds(String numberOfBeds) {
		model.setNumberOfBeds(numberOfBeds);
	}

	/**
	 * Sets the nursing homes category of this medical facilities app.
	 *
	 * @param nursingHomesCategory the nursing homes category of this medical facilities app
	 */
	@Override
	public void setNursingHomesCategory(String nursingHomesCategory) {
		model.setNursingHomesCategory(nursingHomesCategory);
	}

	/**
	 * Sets the nursing sub category val of this medical facilities app.
	 *
	 * @param nursingSubCategoryVal the nursing sub category val of this medical facilities app
	 */
	@Override
	public void setNursingSubCategoryVal(String nursingSubCategoryVal) {
		model.setNursingSubCategoryVal(nursingSubCategoryVal);
	}

	/**
	 * Sets the pdf file entry ID of this medical facilities app.
	 *
	 * @param pdfFileEntryId the pdf file entry ID of this medical facilities app
	 */
	@Override
	public void setPdfFileEntryId(long pdfFileEntryId) {
		model.setPdfFileEntryId(pdfFileEntryId);
	}

	/**
	 * Sets the primary key of this medical facilities app.
	 *
	 * @param primaryKey the primary key of this medical facilities app
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the registration number of this medical facilities app.
	 *
	 * @param registrationNumber the registration number of this medical facilities app
	 */
	@Override
	public void setRegistrationNumber(Long registrationNumber) {
		model.setRegistrationNumber(registrationNumber);
	}

	/**
	 * Sets the status of this medical facilities app.
	 *
	 * @param status the status of this medical facilities app
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the sub category of this medical facilities app.
	 *
	 * @param subCategory the sub category of this medical facilities app
	 */
	@Override
	public void setSubCategory(String subCategory) {
		model.setSubCategory(subCategory);
	}

	/**
	 * Sets the type of transaction of this medical facilities app.
	 *
	 * @param typeOfTransaction the type of transaction of this medical facilities app
	 */
	@Override
	public void setTypeOfTransaction(String typeOfTransaction) {
		model.setTypeOfTransaction(typeOfTransaction);
	}

	/**
	 * Sets the user ID of this medical facilities app.
	 *
	 * @param userId the user ID of this medical facilities app
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this medical facilities app.
	 *
	 * @param userName the user name of this medical facilities app
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this medical facilities app.
	 *
	 * @param userUuid the user uuid of this medical facilities app
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this medical facilities app.
	 *
	 * @param uuid the uuid of this medical facilities app
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
	protected MedicalFacilitiesAppWrapper wrap(
		MedicalFacilitiesApp medicalFacilitiesApp) {

		return new MedicalFacilitiesAppWrapper(medicalFacilitiesApp);
	}

}