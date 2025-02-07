/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link JADSCApplication}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCApplication
 * @generated
 */
public class JADSCApplicationWrapper
	extends BaseModelWrapper<JADSCApplication>
	implements JADSCApplication, ModelWrapper<JADSCApplication> {

	public JADSCApplicationWrapper(JADSCApplication jadscApplication) {
		super(jadscApplication);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("jadscApplicationId", getJadscApplicationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("entityId", getEntityId());
		attributes.put("typeOfApplication", getTypeOfApplication());
		attributes.put("typeOfComplaint", getTypeOfComplaint());
		attributes.put("typeOfTransaction", getTypeOfTransaction());
		attributes.put("transactionNumber", getTransactionNumber());
		attributes.put("typeOfApplicant", getTypeOfApplicant());
		attributes.put("industriesImpacted", getIndustriesImpacted());
		attributes.put("breachOfConfidentiality", getBreachOfConfidentiality());
		attributes.put(
			"categoriesOfConfidentialInfo", getCategoriesOfConfidentialInfo());
		attributes.put(
			"categoriesOfConfiOtherPlease", getCategoriesOfConfiOtherPlease());
		attributes.put(
			"reasonForConfidentialStatus", getReasonForConfidentialStatus());
		attributes.put("nonConfidentialSummary", getNonConfidentialSummary());
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

		Long jadscApplicationId = (Long)attributes.get("jadscApplicationId");

		if (jadscApplicationId != null) {
			setJadscApplicationId(jadscApplicationId);
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

		String typeOfApplication = (String)attributes.get("typeOfApplication");

		if (typeOfApplication != null) {
			setTypeOfApplication(typeOfApplication);
		}

		String typeOfComplaint = (String)attributes.get("typeOfComplaint");

		if (typeOfComplaint != null) {
			setTypeOfComplaint(typeOfComplaint);
		}

		String typeOfTransaction = (String)attributes.get("typeOfTransaction");

		if (typeOfTransaction != null) {
			setTypeOfTransaction(typeOfTransaction);
		}

		String transactionNumber = (String)attributes.get("transactionNumber");

		if (transactionNumber != null) {
			setTransactionNumber(transactionNumber);
		}

		String typeOfApplicant = (String)attributes.get("typeOfApplicant");

		if (typeOfApplicant != null) {
			setTypeOfApplicant(typeOfApplicant);
		}

		String industriesImpacted = (String)attributes.get(
			"industriesImpacted");

		if (industriesImpacted != null) {
			setIndustriesImpacted(industriesImpacted);
		}

		String breachOfConfidentiality = (String)attributes.get(
			"breachOfConfidentiality");

		if (breachOfConfidentiality != null) {
			setBreachOfConfidentiality(breachOfConfidentiality);
		}

		String categoriesOfConfidentialInfo = (String)attributes.get(
			"categoriesOfConfidentialInfo");

		if (categoriesOfConfidentialInfo != null) {
			setCategoriesOfConfidentialInfo(categoriesOfConfidentialInfo);
		}

		String categoriesOfConfiOtherPlease = (String)attributes.get(
			"categoriesOfConfiOtherPlease");

		if (categoriesOfConfiOtherPlease != null) {
			setCategoriesOfConfiOtherPlease(categoriesOfConfiOtherPlease);
		}

		String reasonForConfidentialStatus = (String)attributes.get(
			"reasonForConfidentialStatus");

		if (reasonForConfidentialStatus != null) {
			setReasonForConfidentialStatus(reasonForConfidentialStatus);
		}

		String nonConfidentialSummary = (String)attributes.get(
			"nonConfidentialSummary");

		if (nonConfidentialSummary != null) {
			setNonConfidentialSummary(nonConfidentialSummary);
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
	public JADSCApplication cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the app current stage name of this jadsc application.
	 *
	 * @return the app current stage name of this jadsc application
	 */
	@Override
	public String getAppCurrentStageName() {
		return model.getAppCurrentStageName();
	}

	/**
	 * Returns the application number of this jadsc application.
	 *
	 * @return the application number of this jadsc application
	 */
	@Override
	public String getApplicationNumber() {
		return model.getApplicationNumber();
	}

	/**
	 * Returns the breach of confidentiality of this jadsc application.
	 *
	 * @return the breach of confidentiality of this jadsc application
	 */
	@Override
	public String getBreachOfConfidentiality() {
		return model.getBreachOfConfidentiality();
	}

	/**
	 * Returns the case ID of this jadsc application.
	 *
	 * @return the case ID of this jadsc application
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the categories of confidential info of this jadsc application.
	 *
	 * @return the categories of confidential info of this jadsc application
	 */
	@Override
	public String getCategoriesOfConfidentialInfo() {
		return model.getCategoriesOfConfidentialInfo();
	}

	/**
	 * Returns the categories of confi other please of this jadsc application.
	 *
	 * @return the categories of confi other please of this jadsc application
	 */
	@Override
	public String getCategoriesOfConfiOtherPlease() {
		return model.getCategoriesOfConfiOtherPlease();
	}

	/**
	 * Returns the company ID of this jadsc application.
	 *
	 * @return the company ID of this jadsc application
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this jadsc application.
	 *
	 * @return the create date of this jadsc application
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the entity ID of this jadsc application.
	 *
	 * @return the entity ID of this jadsc application
	 */
	@Override
	public String getEntityId() {
		return model.getEntityId();
	}

	/**
	 * Returns the expired license app number of this jadsc application.
	 *
	 * @return the expired license app number of this jadsc application
	 */
	@Override
	public String getExpiredLicenseAppNumber() {
		return model.getExpiredLicenseAppNumber();
	}

	/**
	 * Returns the group ID of this jadsc application.
	 *
	 * @return the group ID of this jadsc application
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the icm document path of this jadsc application.
	 *
	 * @return the icm document path of this jadsc application
	 */
	@Override
	public String getIcmDocumentPath() {
		return model.getIcmDocumentPath();
	}

	/**
	 * Returns the industries impacted of this jadsc application.
	 *
	 * @return the industries impacted of this jadsc application
	 */
	@Override
	public String getIndustriesImpacted() {
		return model.getIndustriesImpacted();
	}

	/**
	 * Returns the jadsc application ID of this jadsc application.
	 *
	 * @return the jadsc application ID of this jadsc application
	 */
	@Override
	public long getJadscApplicationId() {
		return model.getJadscApplicationId();
	}

	/**
	 * Returns the modified date of this jadsc application.
	 *
	 * @return the modified date of this jadsc application
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the non confidential summary of this jadsc application.
	 *
	 * @return the non confidential summary of this jadsc application
	 */
	@Override
	public String getNonConfidentialSummary() {
		return model.getNonConfidentialSummary();
	}

	/**
	 * Returns the pdf file entry ID of this jadsc application.
	 *
	 * @return the pdf file entry ID of this jadsc application
	 */
	@Override
	public long getPdfFileEntryId() {
		return model.getPdfFileEntryId();
	}

	/**
	 * Returns the primary key of this jadsc application.
	 *
	 * @return the primary key of this jadsc application
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the reason for confidential status of this jadsc application.
	 *
	 * @return the reason for confidential status of this jadsc application
	 */
	@Override
	public String getReasonForConfidentialStatus() {
		return model.getReasonForConfidentialStatus();
	}

	/**
	 * Returns the status of this jadsc application.
	 *
	 * @return the status of this jadsc application
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the transaction number of this jadsc application.
	 *
	 * @return the transaction number of this jadsc application
	 */
	@Override
	public String getTransactionNumber() {
		return model.getTransactionNumber();
	}

	/**
	 * Returns the type of applicant of this jadsc application.
	 *
	 * @return the type of applicant of this jadsc application
	 */
	@Override
	public String getTypeOfApplicant() {
		return model.getTypeOfApplicant();
	}

	/**
	 * Returns the type of application of this jadsc application.
	 *
	 * @return the type of application of this jadsc application
	 */
	@Override
	public String getTypeOfApplication() {
		return model.getTypeOfApplication();
	}

	/**
	 * Returns the type of complaint of this jadsc application.
	 *
	 * @return the type of complaint of this jadsc application
	 */
	@Override
	public String getTypeOfComplaint() {
		return model.getTypeOfComplaint();
	}

	/**
	 * Returns the type of transaction of this jadsc application.
	 *
	 * @return the type of transaction of this jadsc application
	 */
	@Override
	public String getTypeOfTransaction() {
		return model.getTypeOfTransaction();
	}

	/**
	 * Returns the user ID of this jadsc application.
	 *
	 * @return the user ID of this jadsc application
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this jadsc application.
	 *
	 * @return the user name of this jadsc application
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this jadsc application.
	 *
	 * @return the user uuid of this jadsc application
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this jadsc application.
	 *
	 * @return the uuid of this jadsc application
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
	 * Sets the app current stage name of this jadsc application.
	 *
	 * @param appCurrentStageName the app current stage name of this jadsc application
	 */
	@Override
	public void setAppCurrentStageName(String appCurrentStageName) {
		model.setAppCurrentStageName(appCurrentStageName);
	}

	/**
	 * Sets the application number of this jadsc application.
	 *
	 * @param applicationNumber the application number of this jadsc application
	 */
	@Override
	public void setApplicationNumber(String applicationNumber) {
		model.setApplicationNumber(applicationNumber);
	}

	/**
	 * Sets the breach of confidentiality of this jadsc application.
	 *
	 * @param breachOfConfidentiality the breach of confidentiality of this jadsc application
	 */
	@Override
	public void setBreachOfConfidentiality(String breachOfConfidentiality) {
		model.setBreachOfConfidentiality(breachOfConfidentiality);
	}

	/**
	 * Sets the case ID of this jadsc application.
	 *
	 * @param caseId the case ID of this jadsc application
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the categories of confidential info of this jadsc application.
	 *
	 * @param categoriesOfConfidentialInfo the categories of confidential info of this jadsc application
	 */
	@Override
	public void setCategoriesOfConfidentialInfo(
		String categoriesOfConfidentialInfo) {

		model.setCategoriesOfConfidentialInfo(categoriesOfConfidentialInfo);
	}

	/**
	 * Sets the categories of confi other please of this jadsc application.
	 *
	 * @param categoriesOfConfiOtherPlease the categories of confi other please of this jadsc application
	 */
	@Override
	public void setCategoriesOfConfiOtherPlease(
		String categoriesOfConfiOtherPlease) {

		model.setCategoriesOfConfiOtherPlease(categoriesOfConfiOtherPlease);
	}

	/**
	 * Sets the company ID of this jadsc application.
	 *
	 * @param companyId the company ID of this jadsc application
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this jadsc application.
	 *
	 * @param createDate the create date of this jadsc application
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the entity ID of this jadsc application.
	 *
	 * @param entityId the entity ID of this jadsc application
	 */
	@Override
	public void setEntityId(String entityId) {
		model.setEntityId(entityId);
	}

	/**
	 * Sets the expired license app number of this jadsc application.
	 *
	 * @param expiredLicenseAppNumber the expired license app number of this jadsc application
	 */
	@Override
	public void setExpiredLicenseAppNumber(String expiredLicenseAppNumber) {
		model.setExpiredLicenseAppNumber(expiredLicenseAppNumber);
	}

	/**
	 * Sets the group ID of this jadsc application.
	 *
	 * @param groupId the group ID of this jadsc application
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the icm document path of this jadsc application.
	 *
	 * @param icmDocumentPath the icm document path of this jadsc application
	 */
	@Override
	public void setIcmDocumentPath(String icmDocumentPath) {
		model.setIcmDocumentPath(icmDocumentPath);
	}

	/**
	 * Sets the industries impacted of this jadsc application.
	 *
	 * @param industriesImpacted the industries impacted of this jadsc application
	 */
	@Override
	public void setIndustriesImpacted(String industriesImpacted) {
		model.setIndustriesImpacted(industriesImpacted);
	}

	/**
	 * Sets the jadsc application ID of this jadsc application.
	 *
	 * @param jadscApplicationId the jadsc application ID of this jadsc application
	 */
	@Override
	public void setJadscApplicationId(long jadscApplicationId) {
		model.setJadscApplicationId(jadscApplicationId);
	}

	/**
	 * Sets the modified date of this jadsc application.
	 *
	 * @param modifiedDate the modified date of this jadsc application
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the non confidential summary of this jadsc application.
	 *
	 * @param nonConfidentialSummary the non confidential summary of this jadsc application
	 */
	@Override
	public void setNonConfidentialSummary(String nonConfidentialSummary) {
		model.setNonConfidentialSummary(nonConfidentialSummary);
	}

	/**
	 * Sets the pdf file entry ID of this jadsc application.
	 *
	 * @param pdfFileEntryId the pdf file entry ID of this jadsc application
	 */
	@Override
	public void setPdfFileEntryId(long pdfFileEntryId) {
		model.setPdfFileEntryId(pdfFileEntryId);
	}

	/**
	 * Sets the primary key of this jadsc application.
	 *
	 * @param primaryKey the primary key of this jadsc application
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the reason for confidential status of this jadsc application.
	 *
	 * @param reasonForConfidentialStatus the reason for confidential status of this jadsc application
	 */
	@Override
	public void setReasonForConfidentialStatus(
		String reasonForConfidentialStatus) {

		model.setReasonForConfidentialStatus(reasonForConfidentialStatus);
	}

	/**
	 * Sets the status of this jadsc application.
	 *
	 * @param status the status of this jadsc application
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the transaction number of this jadsc application.
	 *
	 * @param transactionNumber the transaction number of this jadsc application
	 */
	@Override
	public void setTransactionNumber(String transactionNumber) {
		model.setTransactionNumber(transactionNumber);
	}

	/**
	 * Sets the type of applicant of this jadsc application.
	 *
	 * @param typeOfApplicant the type of applicant of this jadsc application
	 */
	@Override
	public void setTypeOfApplicant(String typeOfApplicant) {
		model.setTypeOfApplicant(typeOfApplicant);
	}

	/**
	 * Sets the type of application of this jadsc application.
	 *
	 * @param typeOfApplication the type of application of this jadsc application
	 */
	@Override
	public void setTypeOfApplication(String typeOfApplication) {
		model.setTypeOfApplication(typeOfApplication);
	}

	/**
	 * Sets the type of complaint of this jadsc application.
	 *
	 * @param typeOfComplaint the type of complaint of this jadsc application
	 */
	@Override
	public void setTypeOfComplaint(String typeOfComplaint) {
		model.setTypeOfComplaint(typeOfComplaint);
	}

	/**
	 * Sets the type of transaction of this jadsc application.
	 *
	 * @param typeOfTransaction the type of transaction of this jadsc application
	 */
	@Override
	public void setTypeOfTransaction(String typeOfTransaction) {
		model.setTypeOfTransaction(typeOfTransaction);
	}

	/**
	 * Sets the user ID of this jadsc application.
	 *
	 * @param userId the user ID of this jadsc application
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this jadsc application.
	 *
	 * @param userName the user name of this jadsc application
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this jadsc application.
	 *
	 * @param userUuid the user uuid of this jadsc application
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this jadsc application.
	 *
	 * @param uuid the uuid of this jadsc application
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
	protected JADSCApplicationWrapper wrap(JADSCApplication jadscApplication) {
		return new JADSCApplicationWrapper(jadscApplication);
	}

}