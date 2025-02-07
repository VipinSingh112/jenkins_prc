/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AcquireApplication}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireApplication
 * @generated
 */
public class AcquireApplicationWrapper
	extends BaseModelWrapper<AcquireApplication>
	implements AcquireApplication, ModelWrapper<AcquireApplication> {

	public AcquireApplicationWrapper(AcquireApplication acquireApplication) {
		super(acquireApplication);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("acquireApplicationId", getAcquireApplicationId());
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
		attributes.put("icmDocumentPath", getIcmDocumentPath());
		attributes.put("divestmentOptions", getDivestmentOptions());
		attributes.put("tenureType", getTenureType());
		attributes.put("currentUse", getCurrentUse());
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

		Long acquireApplicationId = (Long)attributes.get(
			"acquireApplicationId");

		if (acquireApplicationId != null) {
			setAcquireApplicationId(acquireApplicationId);
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

		String icmDocumentPath = (String)attributes.get("icmDocumentPath");

		if (icmDocumentPath != null) {
			setIcmDocumentPath(icmDocumentPath);
		}

		String divestmentOptions = (String)attributes.get("divestmentOptions");

		if (divestmentOptions != null) {
			setDivestmentOptions(divestmentOptions);
		}

		String tenureType = (String)attributes.get("tenureType");

		if (tenureType != null) {
			setTenureType(tenureType);
		}

		String currentUse = (String)attributes.get("currentUse");

		if (currentUse != null) {
			setCurrentUse(currentUse);
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
	public AcquireApplication cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acquire application ID of this acquire application.
	 *
	 * @return the acquire application ID of this acquire application
	 */
	@Override
	public long getAcquireApplicationId() {
		return model.getAcquireApplicationId();
	}

	/**
	 * Returns the app current stage name of this acquire application.
	 *
	 * @return the app current stage name of this acquire application
	 */
	@Override
	public String getAppCurrentStageName() {
		return model.getAppCurrentStageName();
	}

	/**
	 * Returns the application number of this acquire application.
	 *
	 * @return the application number of this acquire application
	 */
	@Override
	public String getApplicationNumber() {
		return model.getApplicationNumber();
	}

	/**
	 * Returns the case ID of this acquire application.
	 *
	 * @return the case ID of this acquire application
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this acquire application.
	 *
	 * @return the company ID of this acquire application
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acquire application.
	 *
	 * @return the create date of this acquire application
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the current use of this acquire application.
	 *
	 * @return the current use of this acquire application
	 */
	@Override
	public String getCurrentUse() {
		return model.getCurrentUse();
	}

	/**
	 * Returns the divestment options of this acquire application.
	 *
	 * @return the divestment options of this acquire application
	 */
	@Override
	public String getDivestmentOptions() {
		return model.getDivestmentOptions();
	}

	/**
	 * Returns the entity ID of this acquire application.
	 *
	 * @return the entity ID of this acquire application
	 */
	@Override
	public String getEntityId() {
		return model.getEntityId();
	}

	/**
	 * Returns the group ID of this acquire application.
	 *
	 * @return the group ID of this acquire application
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the icm document path of this acquire application.
	 *
	 * @return the icm document path of this acquire application
	 */
	@Override
	public String getIcmDocumentPath() {
		return model.getIcmDocumentPath();
	}

	/**
	 * Returns the modified date of this acquire application.
	 *
	 * @return the modified date of this acquire application
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the pdf file entry ID of this acquire application.
	 *
	 * @return the pdf file entry ID of this acquire application
	 */
	@Override
	public long getPdfFileEntryId() {
		return model.getPdfFileEntryId();
	}

	/**
	 * Returns the primary key of this acquire application.
	 *
	 * @return the primary key of this acquire application
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this acquire application.
	 *
	 * @return the status of this acquire application
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the tenure type of this acquire application.
	 *
	 * @return the tenure type of this acquire application
	 */
	@Override
	public String getTenureType() {
		return model.getTenureType();
	}

	/**
	 * Returns the user ID of this acquire application.
	 *
	 * @return the user ID of this acquire application
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acquire application.
	 *
	 * @return the user name of this acquire application
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acquire application.
	 *
	 * @return the user uuid of this acquire application
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this acquire application.
	 *
	 * @return the uuid of this acquire application
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
	 * Sets the acquire application ID of this acquire application.
	 *
	 * @param acquireApplicationId the acquire application ID of this acquire application
	 */
	@Override
	public void setAcquireApplicationId(long acquireApplicationId) {
		model.setAcquireApplicationId(acquireApplicationId);
	}

	/**
	 * Sets the app current stage name of this acquire application.
	 *
	 * @param appCurrentStageName the app current stage name of this acquire application
	 */
	@Override
	public void setAppCurrentStageName(String appCurrentStageName) {
		model.setAppCurrentStageName(appCurrentStageName);
	}

	/**
	 * Sets the application number of this acquire application.
	 *
	 * @param applicationNumber the application number of this acquire application
	 */
	@Override
	public void setApplicationNumber(String applicationNumber) {
		model.setApplicationNumber(applicationNumber);
	}

	/**
	 * Sets the case ID of this acquire application.
	 *
	 * @param caseId the case ID of this acquire application
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this acquire application.
	 *
	 * @param companyId the company ID of this acquire application
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acquire application.
	 *
	 * @param createDate the create date of this acquire application
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the current use of this acquire application.
	 *
	 * @param currentUse the current use of this acquire application
	 */
	@Override
	public void setCurrentUse(String currentUse) {
		model.setCurrentUse(currentUse);
	}

	/**
	 * Sets the divestment options of this acquire application.
	 *
	 * @param divestmentOptions the divestment options of this acquire application
	 */
	@Override
	public void setDivestmentOptions(String divestmentOptions) {
		model.setDivestmentOptions(divestmentOptions);
	}

	/**
	 * Sets the entity ID of this acquire application.
	 *
	 * @param entityId the entity ID of this acquire application
	 */
	@Override
	public void setEntityId(String entityId) {
		model.setEntityId(entityId);
	}

	/**
	 * Sets the group ID of this acquire application.
	 *
	 * @param groupId the group ID of this acquire application
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the icm document path of this acquire application.
	 *
	 * @param icmDocumentPath the icm document path of this acquire application
	 */
	@Override
	public void setIcmDocumentPath(String icmDocumentPath) {
		model.setIcmDocumentPath(icmDocumentPath);
	}

	/**
	 * Sets the modified date of this acquire application.
	 *
	 * @param modifiedDate the modified date of this acquire application
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the pdf file entry ID of this acquire application.
	 *
	 * @param pdfFileEntryId the pdf file entry ID of this acquire application
	 */
	@Override
	public void setPdfFileEntryId(long pdfFileEntryId) {
		model.setPdfFileEntryId(pdfFileEntryId);
	}

	/**
	 * Sets the primary key of this acquire application.
	 *
	 * @param primaryKey the primary key of this acquire application
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this acquire application.
	 *
	 * @param status the status of this acquire application
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the tenure type of this acquire application.
	 *
	 * @param tenureType the tenure type of this acquire application
	 */
	@Override
	public void setTenureType(String tenureType) {
		model.setTenureType(tenureType);
	}

	/**
	 * Sets the user ID of this acquire application.
	 *
	 * @param userId the user ID of this acquire application
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acquire application.
	 *
	 * @param userName the user name of this acquire application
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acquire application.
	 *
	 * @param userUuid the user uuid of this acquire application
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this acquire application.
	 *
	 * @param uuid the uuid of this acquire application
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
	protected AcquireApplicationWrapper wrap(
		AcquireApplication acquireApplication) {

		return new AcquireApplicationWrapper(acquireApplication);
	}

}