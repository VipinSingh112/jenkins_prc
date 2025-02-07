/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OgtApplication}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OgtApplication
 * @generated
 */
public class OgtApplicationWrapper
	extends BaseModelWrapper<OgtApplication>
	implements ModelWrapper<OgtApplication>, OgtApplication {

	public OgtApplicationWrapper(OgtApplication ogtApplication) {
		super(ogtApplication);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ogtApplicationId", getOgtApplicationId());
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
		attributes.put("typeOfMatter", getTypeOfMatter());
		attributes.put("typeOfDebt", getTypeOfDebt());
		attributes.put("debtStatute", getDebtStatute());
		attributes.put("status", getStatus());
		attributes.put("applicationNumber", getApplicationNumber());
		attributes.put("expiredLicenseAppNumber", getExpiredLicenseAppNumber());
		attributes.put("caseId", getCaseId());
		attributes.put("icmDocumentsPath", getIcmDocumentsPath());
		attributes.put("pdfFileEntryId", getPdfFileEntryId());
		attributes.put("appCurrentStageName", getAppCurrentStageName());
		attributes.put("registeredManufacturer", getRegisteredManufacturer());
		attributes.put("prospectingRightsNum", getProspectingRightsNum());
		attributes.put("typeOfBankruptcy", getTypeOfBankruptcy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ogtApplicationId = (Long)attributes.get("ogtApplicationId");

		if (ogtApplicationId != null) {
			setOgtApplicationId(ogtApplicationId);
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

		String typeOfMatter = (String)attributes.get("typeOfMatter");

		if (typeOfMatter != null) {
			setTypeOfMatter(typeOfMatter);
		}

		String typeOfDebt = (String)attributes.get("typeOfDebt");

		if (typeOfDebt != null) {
			setTypeOfDebt(typeOfDebt);
		}

		String debtStatute = (String)attributes.get("debtStatute");

		if (debtStatute != null) {
			setDebtStatute(debtStatute);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
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

		String registeredManufacturer = (String)attributes.get(
			"registeredManufacturer");

		if (registeredManufacturer != null) {
			setRegisteredManufacturer(registeredManufacturer);
		}

		String prospectingRightsNum = (String)attributes.get(
			"prospectingRightsNum");

		if (prospectingRightsNum != null) {
			setProspectingRightsNum(prospectingRightsNum);
		}

		String typeOfBankruptcy = (String)attributes.get("typeOfBankruptcy");

		if (typeOfBankruptcy != null) {
			setTypeOfBankruptcy(typeOfBankruptcy);
		}
	}

	@Override
	public OgtApplication cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the app current stage name of this ogt application.
	 *
	 * @return the app current stage name of this ogt application
	 */
	@Override
	public String getAppCurrentStageName() {
		return model.getAppCurrentStageName();
	}

	/**
	 * Returns the application number of this ogt application.
	 *
	 * @return the application number of this ogt application
	 */
	@Override
	public String getApplicationNumber() {
		return model.getApplicationNumber();
	}

	/**
	 * Returns the case ID of this ogt application.
	 *
	 * @return the case ID of this ogt application
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this ogt application.
	 *
	 * @return the company ID of this ogt application
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this ogt application.
	 *
	 * @return the create date of this ogt application
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the debt statute of this ogt application.
	 *
	 * @return the debt statute of this ogt application
	 */
	@Override
	public String getDebtStatute() {
		return model.getDebtStatute();
	}

	/**
	 * Returns the do you want of this ogt application.
	 *
	 * @return the do you want of this ogt application
	 */
	@Override
	public String getDoYouWant() {
		return model.getDoYouWant();
	}

	/**
	 * Returns the entity ID of this ogt application.
	 *
	 * @return the entity ID of this ogt application
	 */
	@Override
	public String getEntityId() {
		return model.getEntityId();
	}

	/**
	 * Returns the expired license app number of this ogt application.
	 *
	 * @return the expired license app number of this ogt application
	 */
	@Override
	public String getExpiredLicenseAppNumber() {
		return model.getExpiredLicenseAppNumber();
	}

	/**
	 * Returns the group ID of this ogt application.
	 *
	 * @return the group ID of this ogt application
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the icm documents path of this ogt application.
	 *
	 * @return the icm documents path of this ogt application
	 */
	@Override
	public String getIcmDocumentsPath() {
		return model.getIcmDocumentsPath();
	}

	/**
	 * Returns the modified date of this ogt application.
	 *
	 * @return the modified date of this ogt application
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nature of applicant of this ogt application.
	 *
	 * @return the nature of applicant of this ogt application
	 */
	@Override
	public String getNatureOfApplicant() {
		return model.getNatureOfApplicant();
	}

	/**
	 * Returns the ogt application ID of this ogt application.
	 *
	 * @return the ogt application ID of this ogt application
	 */
	@Override
	public long getOgtApplicationId() {
		return model.getOgtApplicationId();
	}

	/**
	 * Returns the pdf file entry ID of this ogt application.
	 *
	 * @return the pdf file entry ID of this ogt application
	 */
	@Override
	public long getPdfFileEntryId() {
		return model.getPdfFileEntryId();
	}

	/**
	 * Returns the primary key of this ogt application.
	 *
	 * @return the primary key of this ogt application
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the prospecting rights num of this ogt application.
	 *
	 * @return the prospecting rights num of this ogt application
	 */
	@Override
	public String getProspectingRightsNum() {
		return model.getProspectingRightsNum();
	}

	/**
	 * Returns the registered manufacturer of this ogt application.
	 *
	 * @return the registered manufacturer of this ogt application
	 */
	@Override
	public String getRegisteredManufacturer() {
		return model.getRegisteredManufacturer();
	}

	/**
	 * Returns the status of this ogt application.
	 *
	 * @return the status of this ogt application
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the type of applicant of this ogt application.
	 *
	 * @return the type of applicant of this ogt application
	 */
	@Override
	public String getTypeOfApplicant() {
		return model.getTypeOfApplicant();
	}

	/**
	 * Returns the type of bankruptcy of this ogt application.
	 *
	 * @return the type of bankruptcy of this ogt application
	 */
	@Override
	public String getTypeOfBankruptcy() {
		return model.getTypeOfBankruptcy();
	}

	/**
	 * Returns the type of debt of this ogt application.
	 *
	 * @return the type of debt of this ogt application
	 */
	@Override
	public String getTypeOfDebt() {
		return model.getTypeOfDebt();
	}

	/**
	 * Returns the type of matter of this ogt application.
	 *
	 * @return the type of matter of this ogt application
	 */
	@Override
	public String getTypeOfMatter() {
		return model.getTypeOfMatter();
	}

	/**
	 * Returns the user ID of this ogt application.
	 *
	 * @return the user ID of this ogt application
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ogt application.
	 *
	 * @return the user name of this ogt application
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ogt application.
	 *
	 * @return the user uuid of this ogt application
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the app current stage name of this ogt application.
	 *
	 * @param appCurrentStageName the app current stage name of this ogt application
	 */
	@Override
	public void setAppCurrentStageName(String appCurrentStageName) {
		model.setAppCurrentStageName(appCurrentStageName);
	}

	/**
	 * Sets the application number of this ogt application.
	 *
	 * @param applicationNumber the application number of this ogt application
	 */
	@Override
	public void setApplicationNumber(String applicationNumber) {
		model.setApplicationNumber(applicationNumber);
	}

	/**
	 * Sets the case ID of this ogt application.
	 *
	 * @param caseId the case ID of this ogt application
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this ogt application.
	 *
	 * @param companyId the company ID of this ogt application
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this ogt application.
	 *
	 * @param createDate the create date of this ogt application
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the debt statute of this ogt application.
	 *
	 * @param debtStatute the debt statute of this ogt application
	 */
	@Override
	public void setDebtStatute(String debtStatute) {
		model.setDebtStatute(debtStatute);
	}

	/**
	 * Sets the do you want of this ogt application.
	 *
	 * @param doYouWant the do you want of this ogt application
	 */
	@Override
	public void setDoYouWant(String doYouWant) {
		model.setDoYouWant(doYouWant);
	}

	/**
	 * Sets the entity ID of this ogt application.
	 *
	 * @param entityId the entity ID of this ogt application
	 */
	@Override
	public void setEntityId(String entityId) {
		model.setEntityId(entityId);
	}

	/**
	 * Sets the expired license app number of this ogt application.
	 *
	 * @param expiredLicenseAppNumber the expired license app number of this ogt application
	 */
	@Override
	public void setExpiredLicenseAppNumber(String expiredLicenseAppNumber) {
		model.setExpiredLicenseAppNumber(expiredLicenseAppNumber);
	}

	/**
	 * Sets the group ID of this ogt application.
	 *
	 * @param groupId the group ID of this ogt application
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the icm documents path of this ogt application.
	 *
	 * @param icmDocumentsPath the icm documents path of this ogt application
	 */
	@Override
	public void setIcmDocumentsPath(String icmDocumentsPath) {
		model.setIcmDocumentsPath(icmDocumentsPath);
	}

	/**
	 * Sets the modified date of this ogt application.
	 *
	 * @param modifiedDate the modified date of this ogt application
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nature of applicant of this ogt application.
	 *
	 * @param natureOfApplicant the nature of applicant of this ogt application
	 */
	@Override
	public void setNatureOfApplicant(String natureOfApplicant) {
		model.setNatureOfApplicant(natureOfApplicant);
	}

	/**
	 * Sets the ogt application ID of this ogt application.
	 *
	 * @param ogtApplicationId the ogt application ID of this ogt application
	 */
	@Override
	public void setOgtApplicationId(long ogtApplicationId) {
		model.setOgtApplicationId(ogtApplicationId);
	}

	/**
	 * Sets the pdf file entry ID of this ogt application.
	 *
	 * @param pdfFileEntryId the pdf file entry ID of this ogt application
	 */
	@Override
	public void setPdfFileEntryId(long pdfFileEntryId) {
		model.setPdfFileEntryId(pdfFileEntryId);
	}

	/**
	 * Sets the primary key of this ogt application.
	 *
	 * @param primaryKey the primary key of this ogt application
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the prospecting rights num of this ogt application.
	 *
	 * @param prospectingRightsNum the prospecting rights num of this ogt application
	 */
	@Override
	public void setProspectingRightsNum(String prospectingRightsNum) {
		model.setProspectingRightsNum(prospectingRightsNum);
	}

	/**
	 * Sets the registered manufacturer of this ogt application.
	 *
	 * @param registeredManufacturer the registered manufacturer of this ogt application
	 */
	@Override
	public void setRegisteredManufacturer(String registeredManufacturer) {
		model.setRegisteredManufacturer(registeredManufacturer);
	}

	/**
	 * Sets the status of this ogt application.
	 *
	 * @param status the status of this ogt application
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the type of applicant of this ogt application.
	 *
	 * @param typeOfApplicant the type of applicant of this ogt application
	 */
	@Override
	public void setTypeOfApplicant(String typeOfApplicant) {
		model.setTypeOfApplicant(typeOfApplicant);
	}

	/**
	 * Sets the type of bankruptcy of this ogt application.
	 *
	 * @param typeOfBankruptcy the type of bankruptcy of this ogt application
	 */
	@Override
	public void setTypeOfBankruptcy(String typeOfBankruptcy) {
		model.setTypeOfBankruptcy(typeOfBankruptcy);
	}

	/**
	 * Sets the type of debt of this ogt application.
	 *
	 * @param typeOfDebt the type of debt of this ogt application
	 */
	@Override
	public void setTypeOfDebt(String typeOfDebt) {
		model.setTypeOfDebt(typeOfDebt);
	}

	/**
	 * Sets the type of matter of this ogt application.
	 *
	 * @param typeOfMatter the type of matter of this ogt application
	 */
	@Override
	public void setTypeOfMatter(String typeOfMatter) {
		model.setTypeOfMatter(typeOfMatter);
	}

	/**
	 * Sets the user ID of this ogt application.
	 *
	 * @param userId the user ID of this ogt application
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ogt application.
	 *
	 * @param userName the user name of this ogt application
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ogt application.
	 *
	 * @param userUuid the user uuid of this ogt application
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected OgtApplicationWrapper wrap(OgtApplication ogtApplication) {
		return new OgtApplicationWrapper(ogtApplication);
	}

}