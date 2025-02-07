/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OsiServicesApplication}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesApplication
 * @generated
 */
public class OsiServicesApplicationWrapper
	extends BaseModelWrapper<OsiServicesApplication>
	implements ModelWrapper<OsiServicesApplication>, OsiServicesApplication {

	public OsiServicesApplicationWrapper(
		OsiServicesApplication osiServicesApplication) {

		super(osiServicesApplication);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put(
			"osiServicesApplicationId", getOsiServicesApplicationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("entityId", getEntityId());
		attributes.put("doYouWant", getDoYouWant());
		attributes.put("typeOfApplicant", getTypeOfApplicant());
		attributes.put("natureOfApplicant", getNatureOfApplicant());
		attributes.put("typeOfTransaction", getTypeOfTransaction());
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

		Long osiServicesApplicationId = (Long)attributes.get(
			"osiServicesApplicationId");

		if (osiServicesApplicationId != null) {
			setOsiServicesApplicationId(osiServicesApplicationId);
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

		Long entityId = (Long)attributes.get("entityId");

		if (entityId != null) {
			setEntityId(entityId);
		}

		String doYouWant = (String)attributes.get("doYouWant");

		if (doYouWant != null) {
			setDoYouWant(doYouWant);
		}

		String typeOfApplicant = (String)attributes.get("typeOfApplicant");

		if (typeOfApplicant != null) {
			setTypeOfApplicant(typeOfApplicant);
		}

		String natureOfApplicant = (String)attributes.get("natureOfApplicant");

		if (natureOfApplicant != null) {
			setNatureOfApplicant(natureOfApplicant);
		}

		String typeOfTransaction = (String)attributes.get("typeOfTransaction");

		if (typeOfTransaction != null) {
			setTypeOfTransaction(typeOfTransaction);
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
	public OsiServicesApplication cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the app current stage name of this osi services application.
	 *
	 * @return the app current stage name of this osi services application
	 */
	@Override
	public String getAppCurrentStageName() {
		return model.getAppCurrentStageName();
	}

	/**
	 * Returns the application number of this osi services application.
	 *
	 * @return the application number of this osi services application
	 */
	@Override
	public String getApplicationNumber() {
		return model.getApplicationNumber();
	}

	/**
	 * Returns the case ID of this osi services application.
	 *
	 * @return the case ID of this osi services application
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this osi services application.
	 *
	 * @return the company ID of this osi services application
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this osi services application.
	 *
	 * @return the create date of this osi services application
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the do you want of this osi services application.
	 *
	 * @return the do you want of this osi services application
	 */
	@Override
	public String getDoYouWant() {
		return model.getDoYouWant();
	}

	/**
	 * Returns the entity ID of this osi services application.
	 *
	 * @return the entity ID of this osi services application
	 */
	@Override
	public long getEntityId() {
		return model.getEntityId();
	}

	/**
	 * Returns the expired license app number of this osi services application.
	 *
	 * @return the expired license app number of this osi services application
	 */
	@Override
	public String getExpiredLicenseAppNumber() {
		return model.getExpiredLicenseAppNumber();
	}

	/**
	 * Returns the group ID of this osi services application.
	 *
	 * @return the group ID of this osi services application
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the icm document path of this osi services application.
	 *
	 * @return the icm document path of this osi services application
	 */
	@Override
	public String getIcmDocumentPath() {
		return model.getIcmDocumentPath();
	}

	/**
	 * Returns the modified date of this osi services application.
	 *
	 * @return the modified date of this osi services application
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nature of applicant of this osi services application.
	 *
	 * @return the nature of applicant of this osi services application
	 */
	@Override
	public String getNatureOfApplicant() {
		return model.getNatureOfApplicant();
	}

	/**
	 * Returns the osi services application ID of this osi services application.
	 *
	 * @return the osi services application ID of this osi services application
	 */
	@Override
	public long getOsiServicesApplicationId() {
		return model.getOsiServicesApplicationId();
	}

	/**
	 * Returns the pdf file entry ID of this osi services application.
	 *
	 * @return the pdf file entry ID of this osi services application
	 */
	@Override
	public long getPdfFileEntryId() {
		return model.getPdfFileEntryId();
	}

	/**
	 * Returns the primary key of this osi services application.
	 *
	 * @return the primary key of this osi services application
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this osi services application.
	 *
	 * @return the status of this osi services application
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the type of applicant of this osi services application.
	 *
	 * @return the type of applicant of this osi services application
	 */
	@Override
	public String getTypeOfApplicant() {
		return model.getTypeOfApplicant();
	}

	/**
	 * Returns the type of transaction of this osi services application.
	 *
	 * @return the type of transaction of this osi services application
	 */
	@Override
	public String getTypeOfTransaction() {
		return model.getTypeOfTransaction();
	}

	/**
	 * Returns the user ID of this osi services application.
	 *
	 * @return the user ID of this osi services application
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this osi services application.
	 *
	 * @return the user name of this osi services application
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this osi services application.
	 *
	 * @return the user uuid of this osi services application
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this osi services application.
	 *
	 * @return the uuid of this osi services application
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
	 * Sets the app current stage name of this osi services application.
	 *
	 * @param appCurrentStageName the app current stage name of this osi services application
	 */
	@Override
	public void setAppCurrentStageName(String appCurrentStageName) {
		model.setAppCurrentStageName(appCurrentStageName);
	}

	/**
	 * Sets the application number of this osi services application.
	 *
	 * @param applicationNumber the application number of this osi services application
	 */
	@Override
	public void setApplicationNumber(String applicationNumber) {
		model.setApplicationNumber(applicationNumber);
	}

	/**
	 * Sets the case ID of this osi services application.
	 *
	 * @param caseId the case ID of this osi services application
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this osi services application.
	 *
	 * @param companyId the company ID of this osi services application
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this osi services application.
	 *
	 * @param createDate the create date of this osi services application
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the do you want of this osi services application.
	 *
	 * @param doYouWant the do you want of this osi services application
	 */
	@Override
	public void setDoYouWant(String doYouWant) {
		model.setDoYouWant(doYouWant);
	}

	/**
	 * Sets the entity ID of this osi services application.
	 *
	 * @param entityId the entity ID of this osi services application
	 */
	@Override
	public void setEntityId(long entityId) {
		model.setEntityId(entityId);
	}

	/**
	 * Sets the expired license app number of this osi services application.
	 *
	 * @param expiredLicenseAppNumber the expired license app number of this osi services application
	 */
	@Override
	public void setExpiredLicenseAppNumber(String expiredLicenseAppNumber) {
		model.setExpiredLicenseAppNumber(expiredLicenseAppNumber);
	}

	/**
	 * Sets the group ID of this osi services application.
	 *
	 * @param groupId the group ID of this osi services application
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the icm document path of this osi services application.
	 *
	 * @param icmDocumentPath the icm document path of this osi services application
	 */
	@Override
	public void setIcmDocumentPath(String icmDocumentPath) {
		model.setIcmDocumentPath(icmDocumentPath);
	}

	/**
	 * Sets the modified date of this osi services application.
	 *
	 * @param modifiedDate the modified date of this osi services application
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nature of applicant of this osi services application.
	 *
	 * @param natureOfApplicant the nature of applicant of this osi services application
	 */
	@Override
	public void setNatureOfApplicant(String natureOfApplicant) {
		model.setNatureOfApplicant(natureOfApplicant);
	}

	/**
	 * Sets the osi services application ID of this osi services application.
	 *
	 * @param osiServicesApplicationId the osi services application ID of this osi services application
	 */
	@Override
	public void setOsiServicesApplicationId(long osiServicesApplicationId) {
		model.setOsiServicesApplicationId(osiServicesApplicationId);
	}

	/**
	 * Sets the pdf file entry ID of this osi services application.
	 *
	 * @param pdfFileEntryId the pdf file entry ID of this osi services application
	 */
	@Override
	public void setPdfFileEntryId(long pdfFileEntryId) {
		model.setPdfFileEntryId(pdfFileEntryId);
	}

	/**
	 * Sets the primary key of this osi services application.
	 *
	 * @param primaryKey the primary key of this osi services application
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this osi services application.
	 *
	 * @param status the status of this osi services application
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the type of applicant of this osi services application.
	 *
	 * @param typeOfApplicant the type of applicant of this osi services application
	 */
	@Override
	public void setTypeOfApplicant(String typeOfApplicant) {
		model.setTypeOfApplicant(typeOfApplicant);
	}

	/**
	 * Sets the type of transaction of this osi services application.
	 *
	 * @param typeOfTransaction the type of transaction of this osi services application
	 */
	@Override
	public void setTypeOfTransaction(String typeOfTransaction) {
		model.setTypeOfTransaction(typeOfTransaction);
	}

	/**
	 * Sets the user ID of this osi services application.
	 *
	 * @param userId the user ID of this osi services application
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this osi services application.
	 *
	 * @param userName the user name of this osi services application
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this osi services application.
	 *
	 * @param userUuid the user uuid of this osi services application
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this osi services application.
	 *
	 * @param uuid the uuid of this osi services application
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
	protected OsiServicesApplicationWrapper wrap(
		OsiServicesApplication osiServicesApplication) {

		return new OsiServicesApplicationWrapper(osiServicesApplication);
	}

}