/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link JanaacApplication}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JanaacApplication
 * @generated
 */
public class JanaacApplicationWrapper
	extends BaseModelWrapper<JanaacApplication>
	implements JanaacApplication, ModelWrapper<JanaacApplication> {

	public JanaacApplicationWrapper(JanaacApplication janaacApplication) {
		super(janaacApplication);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("janaacApplicationId", getJanaacApplicationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("accreditationType", getAccreditationType());
		attributes.put("accServiceType", getAccServiceType());
		attributes.put("transactionType", getTransactionType());
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

		Long janaacApplicationId = (Long)attributes.get("janaacApplicationId");

		if (janaacApplicationId != null) {
			setJanaacApplicationId(janaacApplicationId);
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

		String accreditationType = (String)attributes.get("accreditationType");

		if (accreditationType != null) {
			setAccreditationType(accreditationType);
		}

		String accServiceType = (String)attributes.get("accServiceType");

		if (accServiceType != null) {
			setAccServiceType(accServiceType);
		}

		String transactionType = (String)attributes.get("transactionType");

		if (transactionType != null) {
			setTransactionType(transactionType);
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
	public JanaacApplication cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the accreditation type of this janaac application.
	 *
	 * @return the accreditation type of this janaac application
	 */
	@Override
	public String getAccreditationType() {
		return model.getAccreditationType();
	}

	/**
	 * Returns the acc service type of this janaac application.
	 *
	 * @return the acc service type of this janaac application
	 */
	@Override
	public String getAccServiceType() {
		return model.getAccServiceType();
	}

	/**
	 * Returns the app current stage name of this janaac application.
	 *
	 * @return the app current stage name of this janaac application
	 */
	@Override
	public String getAppCurrentStageName() {
		return model.getAppCurrentStageName();
	}

	/**
	 * Returns the application number of this janaac application.
	 *
	 * @return the application number of this janaac application
	 */
	@Override
	public String getApplicationNumber() {
		return model.getApplicationNumber();
	}

	/**
	 * Returns the case ID of this janaac application.
	 *
	 * @return the case ID of this janaac application
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this janaac application.
	 *
	 * @return the company ID of this janaac application
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this janaac application.
	 *
	 * @return the create date of this janaac application
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this janaac application.
	 *
	 * @return the group ID of this janaac application
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the icm documents path of this janaac application.
	 *
	 * @return the icm documents path of this janaac application
	 */
	@Override
	public String getIcmDocumentsPath() {
		return model.getIcmDocumentsPath();
	}

	/**
	 * Returns the janaac application ID of this janaac application.
	 *
	 * @return the janaac application ID of this janaac application
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the modified date of this janaac application.
	 *
	 * @return the modified date of this janaac application
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the pdf file entry ID of this janaac application.
	 *
	 * @return the pdf file entry ID of this janaac application
	 */
	@Override
	public long getPdfFileEntryId() {
		return model.getPdfFileEntryId();
	}

	/**
	 * Returns the primary key of this janaac application.
	 *
	 * @return the primary key of this janaac application
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this janaac application.
	 *
	 * @return the status of this janaac application
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the transaction type of this janaac application.
	 *
	 * @return the transaction type of this janaac application
	 */
	@Override
	public String getTransactionType() {
		return model.getTransactionType();
	}

	/**
	 * Returns the user ID of this janaac application.
	 *
	 * @return the user ID of this janaac application
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this janaac application.
	 *
	 * @return the user name of this janaac application
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this janaac application.
	 *
	 * @return the user uuid of this janaac application
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this janaac application.
	 *
	 * @return the uuid of this janaac application
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
	 * Sets the accreditation type of this janaac application.
	 *
	 * @param accreditationType the accreditation type of this janaac application
	 */
	@Override
	public void setAccreditationType(String accreditationType) {
		model.setAccreditationType(accreditationType);
	}

	/**
	 * Sets the acc service type of this janaac application.
	 *
	 * @param accServiceType the acc service type of this janaac application
	 */
	@Override
	public void setAccServiceType(String accServiceType) {
		model.setAccServiceType(accServiceType);
	}

	/**
	 * Sets the app current stage name of this janaac application.
	 *
	 * @param appCurrentStageName the app current stage name of this janaac application
	 */
	@Override
	public void setAppCurrentStageName(String appCurrentStageName) {
		model.setAppCurrentStageName(appCurrentStageName);
	}

	/**
	 * Sets the application number of this janaac application.
	 *
	 * @param applicationNumber the application number of this janaac application
	 */
	@Override
	public void setApplicationNumber(String applicationNumber) {
		model.setApplicationNumber(applicationNumber);
	}

	/**
	 * Sets the case ID of this janaac application.
	 *
	 * @param caseId the case ID of this janaac application
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this janaac application.
	 *
	 * @param companyId the company ID of this janaac application
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this janaac application.
	 *
	 * @param createDate the create date of this janaac application
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this janaac application.
	 *
	 * @param groupId the group ID of this janaac application
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the icm documents path of this janaac application.
	 *
	 * @param icmDocumentsPath the icm documents path of this janaac application
	 */
	@Override
	public void setIcmDocumentsPath(String icmDocumentsPath) {
		model.setIcmDocumentsPath(icmDocumentsPath);
	}

	/**
	 * Sets the janaac application ID of this janaac application.
	 *
	 * @param janaacApplicationId the janaac application ID of this janaac application
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the modified date of this janaac application.
	 *
	 * @param modifiedDate the modified date of this janaac application
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the pdf file entry ID of this janaac application.
	 *
	 * @param pdfFileEntryId the pdf file entry ID of this janaac application
	 */
	@Override
	public void setPdfFileEntryId(long pdfFileEntryId) {
		model.setPdfFileEntryId(pdfFileEntryId);
	}

	/**
	 * Sets the primary key of this janaac application.
	 *
	 * @param primaryKey the primary key of this janaac application
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this janaac application.
	 *
	 * @param status the status of this janaac application
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the transaction type of this janaac application.
	 *
	 * @param transactionType the transaction type of this janaac application
	 */
	@Override
	public void setTransactionType(String transactionType) {
		model.setTransactionType(transactionType);
	}

	/**
	 * Sets the user ID of this janaac application.
	 *
	 * @param userId the user ID of this janaac application
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this janaac application.
	 *
	 * @param userName the user name of this janaac application
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this janaac application.
	 *
	 * @param userUuid the user uuid of this janaac application
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this janaac application.
	 *
	 * @param uuid the uuid of this janaac application
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
	protected JanaacApplicationWrapper wrap(
		JanaacApplication janaacApplication) {

		return new JanaacApplicationWrapper(janaacApplication);
	}

}