/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MiicApplication}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicApplication
 * @generated
 */
public class MiicApplicationWrapper
	extends BaseModelWrapper<MiicApplication>
	implements MiicApplication, ModelWrapper<MiicApplication> {

	public MiicApplicationWrapper(MiicApplication miicApplication) {
		super(miicApplication);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("miicApplicationId", getMiicApplicationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("miicApplication", getMiicApplication());
		attributes.put("typeOfManufacturer ", getTypeOfManufacturer());
		attributes.put("typeOfTransaction", getTypeOfTransaction());
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

		Long miicApplicationId = (Long)attributes.get("miicApplicationId");

		if (miicApplicationId != null) {
			setMiicApplicationId(miicApplicationId);
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

		String miicApplication = (String)attributes.get("miicApplication");

		if (miicApplication != null) {
			setMiicApplication(miicApplication);
		}

		String typeOfManufacturer = (String)attributes.get(
			"typeOfManufacturer ");

		if (typeOfManufacturer != null) {
			setTypeOfManufacturer(typeOfManufacturer);
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

		String entityId = (String)attributes.get("entityId");

		if (entityId != null) {
			setEntityId(entityId);
		}
	}

	@Override
	public MiicApplication cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the app current stage name of this miic application.
	 *
	 * @return the app current stage name of this miic application
	 */
	@Override
	public String getAppCurrentStageName() {
		return model.getAppCurrentStageName();
	}

	/**
	 * Returns the application number of this miic application.
	 *
	 * @return the application number of this miic application
	 */
	@Override
	public String getApplicationNumber() {
		return model.getApplicationNumber();
	}

	/**
	 * Returns the case ID of this miic application.
	 *
	 * @return the case ID of this miic application
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this miic application.
	 *
	 * @return the company ID of this miic application
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this miic application.
	 *
	 * @return the create date of this miic application
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the entity ID of this miic application.
	 *
	 * @return the entity ID of this miic application
	 */
	@Override
	public String getEntityId() {
		return model.getEntityId();
	}

	/**
	 * Returns the expired license app number of this miic application.
	 *
	 * @return the expired license app number of this miic application
	 */
	@Override
	public String getExpiredLicenseAppNumber() {
		return model.getExpiredLicenseAppNumber();
	}

	/**
	 * Returns the group ID of this miic application.
	 *
	 * @return the group ID of this miic application
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the icm document path of this miic application.
	 *
	 * @return the icm document path of this miic application
	 */
	@Override
	public String getIcmDocumentPath() {
		return model.getIcmDocumentPath();
	}

	/**
	 * Returns the miic application of this miic application.
	 *
	 * @return the miic application of this miic application
	 */
	@Override
	public String getMiicApplication() {
		return model.getMiicApplication();
	}

	/**
	 * Returns the miic application ID of this miic application.
	 *
	 * @return the miic application ID of this miic application
	 */
	@Override
	public long getMiicApplicationId() {
		return model.getMiicApplicationId();
	}

	/**
	 * Returns the modified date of this miic application.
	 *
	 * @return the modified date of this miic application
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the pdf file entry ID of this miic application.
	 *
	 * @return the pdf file entry ID of this miic application
	 */
	@Override
	public long getPdfFileEntryId() {
		return model.getPdfFileEntryId();
	}

	/**
	 * Returns the primary key of this miic application.
	 *
	 * @return the primary key of this miic application
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this miic application.
	 *
	 * @return the status of this miic application
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the type of manufacturer of this miic application.
	 *
	 * @return the type of manufacturer of this miic application
	 */
	@Override
	public String getTypeOfManufacturer() {
		return model.getTypeOfManufacturer();
	}

	/**
	 * Returns the type of transaction of this miic application.
	 *
	 * @return the type of transaction of this miic application
	 */
	@Override
	public String getTypeOfTransaction() {
		return model.getTypeOfTransaction();
	}

	/**
	 * Returns the user ID of this miic application.
	 *
	 * @return the user ID of this miic application
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this miic application.
	 *
	 * @return the user name of this miic application
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this miic application.
	 *
	 * @return the user uuid of this miic application
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this miic application.
	 *
	 * @return the uuid of this miic application
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
	 * Sets the app current stage name of this miic application.
	 *
	 * @param appCurrentStageName the app current stage name of this miic application
	 */
	@Override
	public void setAppCurrentStageName(String appCurrentStageName) {
		model.setAppCurrentStageName(appCurrentStageName);
	}

	/**
	 * Sets the application number of this miic application.
	 *
	 * @param applicationNumber the application number of this miic application
	 */
	@Override
	public void setApplicationNumber(String applicationNumber) {
		model.setApplicationNumber(applicationNumber);
	}

	/**
	 * Sets the case ID of this miic application.
	 *
	 * @param caseId the case ID of this miic application
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this miic application.
	 *
	 * @param companyId the company ID of this miic application
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this miic application.
	 *
	 * @param createDate the create date of this miic application
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the entity ID of this miic application.
	 *
	 * @param entityId the entity ID of this miic application
	 */
	@Override
	public void setEntityId(String entityId) {
		model.setEntityId(entityId);
	}

	/**
	 * Sets the expired license app number of this miic application.
	 *
	 * @param expiredLicenseAppNumber the expired license app number of this miic application
	 */
	@Override
	public void setExpiredLicenseAppNumber(String expiredLicenseAppNumber) {
		model.setExpiredLicenseAppNumber(expiredLicenseAppNumber);
	}

	/**
	 * Sets the group ID of this miic application.
	 *
	 * @param groupId the group ID of this miic application
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the icm document path of this miic application.
	 *
	 * @param icmDocumentPath the icm document path of this miic application
	 */
	@Override
	public void setIcmDocumentPath(String icmDocumentPath) {
		model.setIcmDocumentPath(icmDocumentPath);
	}

	/**
	 * Sets the miic application of this miic application.
	 *
	 * @param miicApplication the miic application of this miic application
	 */
	@Override
	public void setMiicApplication(String miicApplication) {
		model.setMiicApplication(miicApplication);
	}

	/**
	 * Sets the miic application ID of this miic application.
	 *
	 * @param miicApplicationId the miic application ID of this miic application
	 */
	@Override
	public void setMiicApplicationId(long miicApplicationId) {
		model.setMiicApplicationId(miicApplicationId);
	}

	/**
	 * Sets the modified date of this miic application.
	 *
	 * @param modifiedDate the modified date of this miic application
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the pdf file entry ID of this miic application.
	 *
	 * @param pdfFileEntryId the pdf file entry ID of this miic application
	 */
	@Override
	public void setPdfFileEntryId(long pdfFileEntryId) {
		model.setPdfFileEntryId(pdfFileEntryId);
	}

	/**
	 * Sets the primary key of this miic application.
	 *
	 * @param primaryKey the primary key of this miic application
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this miic application.
	 *
	 * @param status the status of this miic application
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the type of manufacturer of this miic application.
	 *
	 * @param typeOfManufacturer  the type of manufacturer of this miic application
	 */
	@Override
	public void setTypeOfManufacturer(String typeOfManufacturer) {
		model.setTypeOfManufacturer(typeOfManufacturer);
	}

	/**
	 * Sets the type of transaction of this miic application.
	 *
	 * @param typeOfTransaction the type of transaction of this miic application
	 */
	@Override
	public void setTypeOfTransaction(String typeOfTransaction) {
		model.setTypeOfTransaction(typeOfTransaction);
	}

	/**
	 * Sets the user ID of this miic application.
	 *
	 * @param userId the user ID of this miic application
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this miic application.
	 *
	 * @param userName the user name of this miic application
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this miic application.
	 *
	 * @param userUuid the user uuid of this miic application
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this miic application.
	 *
	 * @param uuid the uuid of this miic application
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
	protected MiicApplicationWrapper wrap(MiicApplication miicApplication) {
		return new MiicApplicationWrapper(miicApplication);
	}

}