/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CannabisLicense}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisLicense
 * @generated
 */
public class CannabisLicenseWrapper
	extends BaseModelWrapper<CannabisLicense>
	implements CannabisLicense, ModelWrapper<CannabisLicense> {

	public CannabisLicenseWrapper(CannabisLicense cannabisLicense) {
		super(cannabisLicense);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cannabisLicenseId", getCannabisLicenseId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("entityNumber", getEntityNumber());
		attributes.put("entityName", getEntityName());
		attributes.put("categoryTier", getCategoryTier());
		attributes.put("numberOfTheExtension", getNumberOfTheExtension());
		attributes.put("ListOfConditions", getListOfConditions());
		attributes.put("payentAmtDue", getPayentAmtDue());
		attributes.put("issueDate", getIssueDate());
		attributes.put("expirationDate", getExpirationDate());
		attributes.put("cannabisApplicationId", getCannabisApplicationId());
		attributes.put("updatedBySource", getUpdatedBySource());
		attributes.put("nameOfBPMStep", getNameOfBPMStep());
		attributes.put(
			"licenseConditionsFulfilled", getLicenseConditionsFulfilled());
		attributes.put("dateFulfilled", getDateFulfilled());
		attributes.put("feeOptionSelected", getFeeOptionSelected());
		attributes.put("feeAmount", getFeeAmount());
		attributes.put("feePaidDate", getFeePaidDate());
		attributes.put("bpmUserNameRole", getBpmUserNameRole());
		attributes.put("stageName", getStageName());
		attributes.put("status", getStatus());
		attributes.put("caseId", getCaseId());
		attributes.put("licenseNumber", getLicenseNumber());
		attributes.put("licenseFileId", getLicenseFileId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cannabisLicenseId = (Long)attributes.get("cannabisLicenseId");

		if (cannabisLicenseId != null) {
			setCannabisLicenseId(cannabisLicenseId);
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

		String entityNumber = (String)attributes.get("entityNumber");

		if (entityNumber != null) {
			setEntityNumber(entityNumber);
		}

		String entityName = (String)attributes.get("entityName");

		if (entityName != null) {
			setEntityName(entityName);
		}

		String categoryTier = (String)attributes.get("categoryTier");

		if (categoryTier != null) {
			setCategoryTier(categoryTier);
		}

		String numberOfTheExtension = (String)attributes.get(
			"numberOfTheExtension");

		if (numberOfTheExtension != null) {
			setNumberOfTheExtension(numberOfTheExtension);
		}

		String ListOfConditions = (String)attributes.get("ListOfConditions");

		if (ListOfConditions != null) {
			setListOfConditions(ListOfConditions);
		}

		String payentAmtDue = (String)attributes.get("payentAmtDue");

		if (payentAmtDue != null) {
			setPayentAmtDue(payentAmtDue);
		}

		Date issueDate = (Date)attributes.get("issueDate");

		if (issueDate != null) {
			setIssueDate(issueDate);
		}

		Date expirationDate = (Date)attributes.get("expirationDate");

		if (expirationDate != null) {
			setExpirationDate(expirationDate);
		}

		Long cannabisApplicationId = (Long)attributes.get(
			"cannabisApplicationId");

		if (cannabisApplicationId != null) {
			setCannabisApplicationId(cannabisApplicationId);
		}

		String updatedBySource = (String)attributes.get("updatedBySource");

		if (updatedBySource != null) {
			setUpdatedBySource(updatedBySource);
		}

		String nameOfBPMStep = (String)attributes.get("nameOfBPMStep");

		if (nameOfBPMStep != null) {
			setNameOfBPMStep(nameOfBPMStep);
		}

		String licenseConditionsFulfilled = (String)attributes.get(
			"licenseConditionsFulfilled");

		if (licenseConditionsFulfilled != null) {
			setLicenseConditionsFulfilled(licenseConditionsFulfilled);
		}

		String dateFulfilled = (String)attributes.get("dateFulfilled");

		if (dateFulfilled != null) {
			setDateFulfilled(dateFulfilled);
		}

		String feeOptionSelected = (String)attributes.get("feeOptionSelected");

		if (feeOptionSelected != null) {
			setFeeOptionSelected(feeOptionSelected);
		}

		String feeAmount = (String)attributes.get("feeAmount");

		if (feeAmount != null) {
			setFeeAmount(feeAmount);
		}

		Date feePaidDate = (Date)attributes.get("feePaidDate");

		if (feePaidDate != null) {
			setFeePaidDate(feePaidDate);
		}

		String bpmUserNameRole = (String)attributes.get("bpmUserNameRole");

		if (bpmUserNameRole != null) {
			setBpmUserNameRole(bpmUserNameRole);
		}

		String stageName = (String)attributes.get("stageName");

		if (stageName != null) {
			setStageName(stageName);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		String licenseNumber = (String)attributes.get("licenseNumber");

		if (licenseNumber != null) {
			setLicenseNumber(licenseNumber);
		}

		Long licenseFileId = (Long)attributes.get("licenseFileId");

		if (licenseFileId != null) {
			setLicenseFileId(licenseFileId);
		}
	}

	@Override
	public CannabisLicense cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the bpm user name role of this cannabis license.
	 *
	 * @return the bpm user name role of this cannabis license
	 */
	@Override
	public String getBpmUserNameRole() {
		return model.getBpmUserNameRole();
	}

	/**
	 * Returns the cannabis application ID of this cannabis license.
	 *
	 * @return the cannabis application ID of this cannabis license
	 */
	@Override
	public long getCannabisApplicationId() {
		return model.getCannabisApplicationId();
	}

	/**
	 * Returns the cannabis license ID of this cannabis license.
	 *
	 * @return the cannabis license ID of this cannabis license
	 */
	@Override
	public long getCannabisLicenseId() {
		return model.getCannabisLicenseId();
	}

	/**
	 * Returns the case ID of this cannabis license.
	 *
	 * @return the case ID of this cannabis license
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the category tier of this cannabis license.
	 *
	 * @return the category tier of this cannabis license
	 */
	@Override
	public String getCategoryTier() {
		return model.getCategoryTier();
	}

	/**
	 * Returns the company ID of this cannabis license.
	 *
	 * @return the company ID of this cannabis license
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this cannabis license.
	 *
	 * @return the create date of this cannabis license
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date fulfilled of this cannabis license.
	 *
	 * @return the date fulfilled of this cannabis license
	 */
	@Override
	public String getDateFulfilled() {
		return model.getDateFulfilled();
	}

	/**
	 * Returns the entity name of this cannabis license.
	 *
	 * @return the entity name of this cannabis license
	 */
	@Override
	public String getEntityName() {
		return model.getEntityName();
	}

	/**
	 * Returns the entity number of this cannabis license.
	 *
	 * @return the entity number of this cannabis license
	 */
	@Override
	public String getEntityNumber() {
		return model.getEntityNumber();
	}

	/**
	 * Returns the expiration date of this cannabis license.
	 *
	 * @return the expiration date of this cannabis license
	 */
	@Override
	public Date getExpirationDate() {
		return model.getExpirationDate();
	}

	/**
	 * Returns the fee amount of this cannabis license.
	 *
	 * @return the fee amount of this cannabis license
	 */
	@Override
	public String getFeeAmount() {
		return model.getFeeAmount();
	}

	/**
	 * Returns the fee option selected of this cannabis license.
	 *
	 * @return the fee option selected of this cannabis license
	 */
	@Override
	public String getFeeOptionSelected() {
		return model.getFeeOptionSelected();
	}

	/**
	 * Returns the fee paid date of this cannabis license.
	 *
	 * @return the fee paid date of this cannabis license
	 */
	@Override
	public Date getFeePaidDate() {
		return model.getFeePaidDate();
	}

	/**
	 * Returns the group ID of this cannabis license.
	 *
	 * @return the group ID of this cannabis license
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the issue date of this cannabis license.
	 *
	 * @return the issue date of this cannabis license
	 */
	@Override
	public Date getIssueDate() {
		return model.getIssueDate();
	}

	/**
	 * Returns the license conditions fulfilled of this cannabis license.
	 *
	 * @return the license conditions fulfilled of this cannabis license
	 */
	@Override
	public String getLicenseConditionsFulfilled() {
		return model.getLicenseConditionsFulfilled();
	}

	/**
	 * Returns the license file ID of this cannabis license.
	 *
	 * @return the license file ID of this cannabis license
	 */
	@Override
	public long getLicenseFileId() {
		return model.getLicenseFileId();
	}

	/**
	 * Returns the license number of this cannabis license.
	 *
	 * @return the license number of this cannabis license
	 */
	@Override
	public String getLicenseNumber() {
		return model.getLicenseNumber();
	}

	/**
	 * Returns the list of conditions of this cannabis license.
	 *
	 * @return the list of conditions of this cannabis license
	 */
	@Override
	public String getListOfConditions() {
		return model.getListOfConditions();
	}

	/**
	 * Returns the modified date of this cannabis license.
	 *
	 * @return the modified date of this cannabis license
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of bpm step of this cannabis license.
	 *
	 * @return the name of bpm step of this cannabis license
	 */
	@Override
	public String getNameOfBPMStep() {
		return model.getNameOfBPMStep();
	}

	/**
	 * Returns the number of the extension of this cannabis license.
	 *
	 * @return the number of the extension of this cannabis license
	 */
	@Override
	public String getNumberOfTheExtension() {
		return model.getNumberOfTheExtension();
	}

	/**
	 * Returns the payent amt due of this cannabis license.
	 *
	 * @return the payent amt due of this cannabis license
	 */
	@Override
	public String getPayentAmtDue() {
		return model.getPayentAmtDue();
	}

	/**
	 * Returns the primary key of this cannabis license.
	 *
	 * @return the primary key of this cannabis license
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the stage name of this cannabis license.
	 *
	 * @return the stage name of this cannabis license
	 */
	@Override
	public String getStageName() {
		return model.getStageName();
	}

	/**
	 * Returns the status of this cannabis license.
	 *
	 * @return the status of this cannabis license
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the updated by source of this cannabis license.
	 *
	 * @return the updated by source of this cannabis license
	 */
	@Override
	public String getUpdatedBySource() {
		return model.getUpdatedBySource();
	}

	/**
	 * Returns the user ID of this cannabis license.
	 *
	 * @return the user ID of this cannabis license
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this cannabis license.
	 *
	 * @return the user name of this cannabis license
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this cannabis license.
	 *
	 * @return the user uuid of this cannabis license
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
	 * Sets the bpm user name role of this cannabis license.
	 *
	 * @param bpmUserNameRole the bpm user name role of this cannabis license
	 */
	@Override
	public void setBpmUserNameRole(String bpmUserNameRole) {
		model.setBpmUserNameRole(bpmUserNameRole);
	}

	/**
	 * Sets the cannabis application ID of this cannabis license.
	 *
	 * @param cannabisApplicationId the cannabis application ID of this cannabis license
	 */
	@Override
	public void setCannabisApplicationId(long cannabisApplicationId) {
		model.setCannabisApplicationId(cannabisApplicationId);
	}

	/**
	 * Sets the cannabis license ID of this cannabis license.
	 *
	 * @param cannabisLicenseId the cannabis license ID of this cannabis license
	 */
	@Override
	public void setCannabisLicenseId(long cannabisLicenseId) {
		model.setCannabisLicenseId(cannabisLicenseId);
	}

	/**
	 * Sets the case ID of this cannabis license.
	 *
	 * @param caseId the case ID of this cannabis license
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the category tier of this cannabis license.
	 *
	 * @param categoryTier the category tier of this cannabis license
	 */
	@Override
	public void setCategoryTier(String categoryTier) {
		model.setCategoryTier(categoryTier);
	}

	/**
	 * Sets the company ID of this cannabis license.
	 *
	 * @param companyId the company ID of this cannabis license
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this cannabis license.
	 *
	 * @param createDate the create date of this cannabis license
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date fulfilled of this cannabis license.
	 *
	 * @param dateFulfilled the date fulfilled of this cannabis license
	 */
	@Override
	public void setDateFulfilled(String dateFulfilled) {
		model.setDateFulfilled(dateFulfilled);
	}

	/**
	 * Sets the entity name of this cannabis license.
	 *
	 * @param entityName the entity name of this cannabis license
	 */
	@Override
	public void setEntityName(String entityName) {
		model.setEntityName(entityName);
	}

	/**
	 * Sets the entity number of this cannabis license.
	 *
	 * @param entityNumber the entity number of this cannabis license
	 */
	@Override
	public void setEntityNumber(String entityNumber) {
		model.setEntityNumber(entityNumber);
	}

	/**
	 * Sets the expiration date of this cannabis license.
	 *
	 * @param expirationDate the expiration date of this cannabis license
	 */
	@Override
	public void setExpirationDate(Date expirationDate) {
		model.setExpirationDate(expirationDate);
	}

	/**
	 * Sets the fee amount of this cannabis license.
	 *
	 * @param feeAmount the fee amount of this cannabis license
	 */
	@Override
	public void setFeeAmount(String feeAmount) {
		model.setFeeAmount(feeAmount);
	}

	/**
	 * Sets the fee option selected of this cannabis license.
	 *
	 * @param feeOptionSelected the fee option selected of this cannabis license
	 */
	@Override
	public void setFeeOptionSelected(String feeOptionSelected) {
		model.setFeeOptionSelected(feeOptionSelected);
	}

	/**
	 * Sets the fee paid date of this cannabis license.
	 *
	 * @param feePaidDate the fee paid date of this cannabis license
	 */
	@Override
	public void setFeePaidDate(Date feePaidDate) {
		model.setFeePaidDate(feePaidDate);
	}

	/**
	 * Sets the group ID of this cannabis license.
	 *
	 * @param groupId the group ID of this cannabis license
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the issue date of this cannabis license.
	 *
	 * @param issueDate the issue date of this cannabis license
	 */
	@Override
	public void setIssueDate(Date issueDate) {
		model.setIssueDate(issueDate);
	}

	/**
	 * Sets the license conditions fulfilled of this cannabis license.
	 *
	 * @param licenseConditionsFulfilled the license conditions fulfilled of this cannabis license
	 */
	@Override
	public void setLicenseConditionsFulfilled(
		String licenseConditionsFulfilled) {

		model.setLicenseConditionsFulfilled(licenseConditionsFulfilled);
	}

	/**
	 * Sets the license file ID of this cannabis license.
	 *
	 * @param licenseFileId the license file ID of this cannabis license
	 */
	@Override
	public void setLicenseFileId(long licenseFileId) {
		model.setLicenseFileId(licenseFileId);
	}

	/**
	 * Sets the license number of this cannabis license.
	 *
	 * @param licenseNumber the license number of this cannabis license
	 */
	@Override
	public void setLicenseNumber(String licenseNumber) {
		model.setLicenseNumber(licenseNumber);
	}

	/**
	 * Sets the list of conditions of this cannabis license.
	 *
	 * @param ListOfConditions the list of conditions of this cannabis license
	 */
	@Override
	public void setListOfConditions(String ListOfConditions) {
		model.setListOfConditions(ListOfConditions);
	}

	/**
	 * Sets the modified date of this cannabis license.
	 *
	 * @param modifiedDate the modified date of this cannabis license
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of bpm step of this cannabis license.
	 *
	 * @param nameOfBPMStep the name of bpm step of this cannabis license
	 */
	@Override
	public void setNameOfBPMStep(String nameOfBPMStep) {
		model.setNameOfBPMStep(nameOfBPMStep);
	}

	/**
	 * Sets the number of the extension of this cannabis license.
	 *
	 * @param numberOfTheExtension the number of the extension of this cannabis license
	 */
	@Override
	public void setNumberOfTheExtension(String numberOfTheExtension) {
		model.setNumberOfTheExtension(numberOfTheExtension);
	}

	/**
	 * Sets the payent amt due of this cannabis license.
	 *
	 * @param payentAmtDue the payent amt due of this cannabis license
	 */
	@Override
	public void setPayentAmtDue(String payentAmtDue) {
		model.setPayentAmtDue(payentAmtDue);
	}

	/**
	 * Sets the primary key of this cannabis license.
	 *
	 * @param primaryKey the primary key of this cannabis license
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the stage name of this cannabis license.
	 *
	 * @param stageName the stage name of this cannabis license
	 */
	@Override
	public void setStageName(String stageName) {
		model.setStageName(stageName);
	}

	/**
	 * Sets the status of this cannabis license.
	 *
	 * @param status the status of this cannabis license
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the updated by source of this cannabis license.
	 *
	 * @param updatedBySource the updated by source of this cannabis license
	 */
	@Override
	public void setUpdatedBySource(String updatedBySource) {
		model.setUpdatedBySource(updatedBySource);
	}

	/**
	 * Sets the user ID of this cannabis license.
	 *
	 * @param userId the user ID of this cannabis license
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this cannabis license.
	 *
	 * @param userName the user name of this cannabis license
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this cannabis license.
	 *
	 * @param userUuid the user uuid of this cannabis license
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
	protected CannabisLicenseWrapper wrap(CannabisLicense cannabisLicense) {
		return new CannabisLicenseWrapper(cannabisLicense);
	}

}