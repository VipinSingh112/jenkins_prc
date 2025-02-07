/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FilmApplication}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplication
 * @generated
 */
public class FilmApplicationWrapper
	extends BaseModelWrapper<FilmApplication>
	implements FilmApplication, ModelWrapper<FilmApplication> {

	public FilmApplicationWrapper(FilmApplication filmApplication) {
		super(filmApplication);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("filmApplicationId", getFilmApplicationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("entityId", getEntityId());
		attributes.put("typeOfTransaction", getTypeOfTransaction());
		attributes.put("projectType", getProjectType());
		attributes.put("productionType", getProductionType());
		attributes.put("importEquipment", getImportEquipment());
		attributes.put("status", getStatus());
		attributes.put("applicationNumber", getApplicationNumber());
		attributes.put("caseId", getCaseId());
		attributes.put("icmDocumentsPath", getIcmDocumentsPath());
		attributes.put("pdfFileEntryId", getPdfFileEntryId());
		attributes.put("appCurrentStageName", getAppCurrentStageName());
		attributes.put("isUpdateEquipmentList", getIsUpdateEquipmentList());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long filmApplicationId = (Long)attributes.get("filmApplicationId");

		if (filmApplicationId != null) {
			setFilmApplicationId(filmApplicationId);
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

		String typeOfTransaction = (String)attributes.get("typeOfTransaction");

		if (typeOfTransaction != null) {
			setTypeOfTransaction(typeOfTransaction);
		}

		String projectType = (String)attributes.get("projectType");

		if (projectType != null) {
			setProjectType(projectType);
		}

		String productionType = (String)attributes.get("productionType");

		if (productionType != null) {
			setProductionType(productionType);
		}

		String importEquipment = (String)attributes.get("importEquipment");

		if (importEquipment != null) {
			setImportEquipment(importEquipment);
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

		String isUpdateEquipmentList = (String)attributes.get(
			"isUpdateEquipmentList");

		if (isUpdateEquipmentList != null) {
			setIsUpdateEquipmentList(isUpdateEquipmentList);
		}
	}

	@Override
	public FilmApplication cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the app current stage name of this film application.
	 *
	 * @return the app current stage name of this film application
	 */
	@Override
	public String getAppCurrentStageName() {
		return model.getAppCurrentStageName();
	}

	/**
	 * Returns the application number of this film application.
	 *
	 * @return the application number of this film application
	 */
	@Override
	public String getApplicationNumber() {
		return model.getApplicationNumber();
	}

	/**
	 * Returns the case ID of this film application.
	 *
	 * @return the case ID of this film application
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this film application.
	 *
	 * @return the company ID of this film application
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this film application.
	 *
	 * @return the create date of this film application
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the entity ID of this film application.
	 *
	 * @return the entity ID of this film application
	 */
	@Override
	public String getEntityId() {
		return model.getEntityId();
	}

	/**
	 * Returns the film application ID of this film application.
	 *
	 * @return the film application ID of this film application
	 */
	@Override
	public long getFilmApplicationId() {
		return model.getFilmApplicationId();
	}

	/**
	 * Returns the group ID of this film application.
	 *
	 * @return the group ID of this film application
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the icm documents path of this film application.
	 *
	 * @return the icm documents path of this film application
	 */
	@Override
	public String getIcmDocumentsPath() {
		return model.getIcmDocumentsPath();
	}

	/**
	 * Returns the import equipment of this film application.
	 *
	 * @return the import equipment of this film application
	 */
	@Override
	public String getImportEquipment() {
		return model.getImportEquipment();
	}

	/**
	 * Returns the is update equipment list of this film application.
	 *
	 * @return the is update equipment list of this film application
	 */
	@Override
	public String getIsUpdateEquipmentList() {
		return model.getIsUpdateEquipmentList();
	}

	/**
	 * Returns the modified date of this film application.
	 *
	 * @return the modified date of this film application
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the pdf file entry ID of this film application.
	 *
	 * @return the pdf file entry ID of this film application
	 */
	@Override
	public long getPdfFileEntryId() {
		return model.getPdfFileEntryId();
	}

	/**
	 * Returns the primary key of this film application.
	 *
	 * @return the primary key of this film application
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the production type of this film application.
	 *
	 * @return the production type of this film application
	 */
	@Override
	public String getProductionType() {
		return model.getProductionType();
	}

	/**
	 * Returns the project type of this film application.
	 *
	 * @return the project type of this film application
	 */
	@Override
	public String getProjectType() {
		return model.getProjectType();
	}

	/**
	 * Returns the status of this film application.
	 *
	 * @return the status of this film application
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the type of transaction of this film application.
	 *
	 * @return the type of transaction of this film application
	 */
	@Override
	public String getTypeOfTransaction() {
		return model.getTypeOfTransaction();
	}

	/**
	 * Returns the user ID of this film application.
	 *
	 * @return the user ID of this film application
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this film application.
	 *
	 * @return the user name of this film application
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this film application.
	 *
	 * @return the user uuid of this film application
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this film application.
	 *
	 * @return the uuid of this film application
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
	 * Sets the app current stage name of this film application.
	 *
	 * @param appCurrentStageName the app current stage name of this film application
	 */
	@Override
	public void setAppCurrentStageName(String appCurrentStageName) {
		model.setAppCurrentStageName(appCurrentStageName);
	}

	/**
	 * Sets the application number of this film application.
	 *
	 * @param applicationNumber the application number of this film application
	 */
	@Override
	public void setApplicationNumber(String applicationNumber) {
		model.setApplicationNumber(applicationNumber);
	}

	/**
	 * Sets the case ID of this film application.
	 *
	 * @param caseId the case ID of this film application
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this film application.
	 *
	 * @param companyId the company ID of this film application
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this film application.
	 *
	 * @param createDate the create date of this film application
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the entity ID of this film application.
	 *
	 * @param entityId the entity ID of this film application
	 */
	@Override
	public void setEntityId(String entityId) {
		model.setEntityId(entityId);
	}

	/**
	 * Sets the film application ID of this film application.
	 *
	 * @param filmApplicationId the film application ID of this film application
	 */
	@Override
	public void setFilmApplicationId(long filmApplicationId) {
		model.setFilmApplicationId(filmApplicationId);
	}

	/**
	 * Sets the group ID of this film application.
	 *
	 * @param groupId the group ID of this film application
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the icm documents path of this film application.
	 *
	 * @param icmDocumentsPath the icm documents path of this film application
	 */
	@Override
	public void setIcmDocumentsPath(String icmDocumentsPath) {
		model.setIcmDocumentsPath(icmDocumentsPath);
	}

	/**
	 * Sets the import equipment of this film application.
	 *
	 * @param importEquipment the import equipment of this film application
	 */
	@Override
	public void setImportEquipment(String importEquipment) {
		model.setImportEquipment(importEquipment);
	}

	/**
	 * Sets the is update equipment list of this film application.
	 *
	 * @param isUpdateEquipmentList the is update equipment list of this film application
	 */
	@Override
	public void setIsUpdateEquipmentList(String isUpdateEquipmentList) {
		model.setIsUpdateEquipmentList(isUpdateEquipmentList);
	}

	/**
	 * Sets the modified date of this film application.
	 *
	 * @param modifiedDate the modified date of this film application
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the pdf file entry ID of this film application.
	 *
	 * @param pdfFileEntryId the pdf file entry ID of this film application
	 */
	@Override
	public void setPdfFileEntryId(long pdfFileEntryId) {
		model.setPdfFileEntryId(pdfFileEntryId);
	}

	/**
	 * Sets the primary key of this film application.
	 *
	 * @param primaryKey the primary key of this film application
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the production type of this film application.
	 *
	 * @param productionType the production type of this film application
	 */
	@Override
	public void setProductionType(String productionType) {
		model.setProductionType(productionType);
	}

	/**
	 * Sets the project type of this film application.
	 *
	 * @param projectType the project type of this film application
	 */
	@Override
	public void setProjectType(String projectType) {
		model.setProjectType(projectType);
	}

	/**
	 * Sets the status of this film application.
	 *
	 * @param status the status of this film application
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the type of transaction of this film application.
	 *
	 * @param typeOfTransaction the type of transaction of this film application
	 */
	@Override
	public void setTypeOfTransaction(String typeOfTransaction) {
		model.setTypeOfTransaction(typeOfTransaction);
	}

	/**
	 * Sets the user ID of this film application.
	 *
	 * @param userId the user ID of this film application
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this film application.
	 *
	 * @param userName the user name of this film application
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this film application.
	 *
	 * @param userUuid the user uuid of this film application
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this film application.
	 *
	 * @param uuid the uuid of this film application
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
	protected FilmApplicationWrapper wrap(FilmApplication filmApplication) {
		return new FilmApplicationWrapper(filmApplication);
	}

}