/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link WRAApplicationDueDiligence}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WRAApplicationDueDiligence
 * @generated
 */
public class WRAApplicationDueDiligenceWrapper
	extends BaseModelWrapper<WRAApplicationDueDiligence>
	implements ModelWrapper<WRAApplicationDueDiligence>,
			   WRAApplicationDueDiligence {

	public WRAApplicationDueDiligenceWrapper(
		WRAApplicationDueDiligence wraApplicationDueDiligence) {

		super(wraApplicationDueDiligence);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"wRAApplicationDueDiligenceId", getWRAApplicationDueDiligenceId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("transactionNumber", getTransactionNumber());
		attributes.put("entityName", getEntityName());
		attributes.put("dateOfApplication", getDateOfApplication());
		attributes.put("agencyContactName", getAgencyContactName());
		attributes.put("agencyEmailAddress", getAgencyEmailAddress());
		attributes.put("licenseNumber", getLicenseNumber());
		attributes.put("agencyName", getAgencyName());
		attributes.put("submittedToAgencyDate", getSubmittedToAgencyDate());
		attributes.put("feedbackReceivedDate", getFeedbackReceivedDate());
		attributes.put("feedbackReceived", getFeedbackReceived());
		attributes.put("deadlineDate", getDeadlineDate());
		attributes.put("wraApplicationId", getWraApplicationId());
		attributes.put("updatedBySource", getUpdatedBySource());
		attributes.put("durationOfTimeSpent", getDurationOfTimeSpent());
		attributes.put("agencyDecision", getAgencyDecision());
		attributes.put("status", getStatus());
		attributes.put("caseId", getCaseId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long wRAApplicationDueDiligenceId = (Long)attributes.get(
			"wRAApplicationDueDiligenceId");

		if (wRAApplicationDueDiligenceId != null) {
			setWRAApplicationDueDiligenceId(wRAApplicationDueDiligenceId);
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

		String transactionNumber = (String)attributes.get("transactionNumber");

		if (transactionNumber != null) {
			setTransactionNumber(transactionNumber);
		}

		String entityName = (String)attributes.get("entityName");

		if (entityName != null) {
			setEntityName(entityName);
		}

		Date dateOfApplication = (Date)attributes.get("dateOfApplication");

		if (dateOfApplication != null) {
			setDateOfApplication(dateOfApplication);
		}

		String agencyContactName = (String)attributes.get("agencyContactName");

		if (agencyContactName != null) {
			setAgencyContactName(agencyContactName);
		}

		String agencyEmailAddress = (String)attributes.get(
			"agencyEmailAddress");

		if (agencyEmailAddress != null) {
			setAgencyEmailAddress(agencyEmailAddress);
		}

		String licenseNumber = (String)attributes.get("licenseNumber");

		if (licenseNumber != null) {
			setLicenseNumber(licenseNumber);
		}

		String agencyName = (String)attributes.get("agencyName");

		if (agencyName != null) {
			setAgencyName(agencyName);
		}

		Date submittedToAgencyDate = (Date)attributes.get(
			"submittedToAgencyDate");

		if (submittedToAgencyDate != null) {
			setSubmittedToAgencyDate(submittedToAgencyDate);
		}

		Date feedbackReceivedDate = (Date)attributes.get(
			"feedbackReceivedDate");

		if (feedbackReceivedDate != null) {
			setFeedbackReceivedDate(feedbackReceivedDate);
		}

		String feedbackReceived = (String)attributes.get("feedbackReceived");

		if (feedbackReceived != null) {
			setFeedbackReceived(feedbackReceived);
		}

		Date deadlineDate = (Date)attributes.get("deadlineDate");

		if (deadlineDate != null) {
			setDeadlineDate(deadlineDate);
		}

		Long wraApplicationId = (Long)attributes.get("wraApplicationId");

		if (wraApplicationId != null) {
			setWraApplicationId(wraApplicationId);
		}

		String updatedBySource = (String)attributes.get("updatedBySource");

		if (updatedBySource != null) {
			setUpdatedBySource(updatedBySource);
		}

		String durationOfTimeSpent = (String)attributes.get(
			"durationOfTimeSpent");

		if (durationOfTimeSpent != null) {
			setDurationOfTimeSpent(durationOfTimeSpent);
		}

		String agencyDecision = (String)attributes.get("agencyDecision");

		if (agencyDecision != null) {
			setAgencyDecision(agencyDecision);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}
	}

	@Override
	public WRAApplicationDueDiligence cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the agency contact name of this wra application due diligence.
	 *
	 * @return the agency contact name of this wra application due diligence
	 */
	@Override
	public String getAgencyContactName() {
		return model.getAgencyContactName();
	}

	/**
	 * Returns the agency decision of this wra application due diligence.
	 *
	 * @return the agency decision of this wra application due diligence
	 */
	@Override
	public String getAgencyDecision() {
		return model.getAgencyDecision();
	}

	/**
	 * Returns the agency email address of this wra application due diligence.
	 *
	 * @return the agency email address of this wra application due diligence
	 */
	@Override
	public String getAgencyEmailAddress() {
		return model.getAgencyEmailAddress();
	}

	/**
	 * Returns the agency name of this wra application due diligence.
	 *
	 * @return the agency name of this wra application due diligence
	 */
	@Override
	public String getAgencyName() {
		return model.getAgencyName();
	}

	/**
	 * Returns the case ID of this wra application due diligence.
	 *
	 * @return the case ID of this wra application due diligence
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this wra application due diligence.
	 *
	 * @return the company ID of this wra application due diligence
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this wra application due diligence.
	 *
	 * @return the create date of this wra application due diligence
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of application of this wra application due diligence.
	 *
	 * @return the date of application of this wra application due diligence
	 */
	@Override
	public Date getDateOfApplication() {
		return model.getDateOfApplication();
	}

	/**
	 * Returns the deadline date of this wra application due diligence.
	 *
	 * @return the deadline date of this wra application due diligence
	 */
	@Override
	public Date getDeadlineDate() {
		return model.getDeadlineDate();
	}

	/**
	 * Returns the duration of time spent of this wra application due diligence.
	 *
	 * @return the duration of time spent of this wra application due diligence
	 */
	@Override
	public String getDurationOfTimeSpent() {
		return model.getDurationOfTimeSpent();
	}

	/**
	 * Returns the entity name of this wra application due diligence.
	 *
	 * @return the entity name of this wra application due diligence
	 */
	@Override
	public String getEntityName() {
		return model.getEntityName();
	}

	/**
	 * Returns the feedback received of this wra application due diligence.
	 *
	 * @return the feedback received of this wra application due diligence
	 */
	@Override
	public String getFeedbackReceived() {
		return model.getFeedbackReceived();
	}

	/**
	 * Returns the feedback received date of this wra application due diligence.
	 *
	 * @return the feedback received date of this wra application due diligence
	 */
	@Override
	public Date getFeedbackReceivedDate() {
		return model.getFeedbackReceivedDate();
	}

	/**
	 * Returns the group ID of this wra application due diligence.
	 *
	 * @return the group ID of this wra application due diligence
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the license number of this wra application due diligence.
	 *
	 * @return the license number of this wra application due diligence
	 */
	@Override
	public String getLicenseNumber() {
		return model.getLicenseNumber();
	}

	/**
	 * Returns the modified date of this wra application due diligence.
	 *
	 * @return the modified date of this wra application due diligence
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this wra application due diligence.
	 *
	 * @return the primary key of this wra application due diligence
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this wra application due diligence.
	 *
	 * @return the status of this wra application due diligence
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the submitted to agency date of this wra application due diligence.
	 *
	 * @return the submitted to agency date of this wra application due diligence
	 */
	@Override
	public Date getSubmittedToAgencyDate() {
		return model.getSubmittedToAgencyDate();
	}

	/**
	 * Returns the transaction number of this wra application due diligence.
	 *
	 * @return the transaction number of this wra application due diligence
	 */
	@Override
	public String getTransactionNumber() {
		return model.getTransactionNumber();
	}

	/**
	 * Returns the updated by source of this wra application due diligence.
	 *
	 * @return the updated by source of this wra application due diligence
	 */
	@Override
	public String getUpdatedBySource() {
		return model.getUpdatedBySource();
	}

	/**
	 * Returns the user ID of this wra application due diligence.
	 *
	 * @return the user ID of this wra application due diligence
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this wra application due diligence.
	 *
	 * @return the user name of this wra application due diligence
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this wra application due diligence.
	 *
	 * @return the user uuid of this wra application due diligence
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the w ra application due diligence ID of this wra application due diligence.
	 *
	 * @return the w ra application due diligence ID of this wra application due diligence
	 */
	@Override
	public long getWRAApplicationDueDiligenceId() {
		return model.getWRAApplicationDueDiligenceId();
	}

	/**
	 * Returns the wra application ID of this wra application due diligence.
	 *
	 * @return the wra application ID of this wra application due diligence
	 */
	@Override
	public long getWraApplicationId() {
		return model.getWraApplicationId();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the agency contact name of this wra application due diligence.
	 *
	 * @param agencyContactName the agency contact name of this wra application due diligence
	 */
	@Override
	public void setAgencyContactName(String agencyContactName) {
		model.setAgencyContactName(agencyContactName);
	}

	/**
	 * Sets the agency decision of this wra application due diligence.
	 *
	 * @param agencyDecision the agency decision of this wra application due diligence
	 */
	@Override
	public void setAgencyDecision(String agencyDecision) {
		model.setAgencyDecision(agencyDecision);
	}

	/**
	 * Sets the agency email address of this wra application due diligence.
	 *
	 * @param agencyEmailAddress the agency email address of this wra application due diligence
	 */
	@Override
	public void setAgencyEmailAddress(String agencyEmailAddress) {
		model.setAgencyEmailAddress(agencyEmailAddress);
	}

	/**
	 * Sets the agency name of this wra application due diligence.
	 *
	 * @param agencyName the agency name of this wra application due diligence
	 */
	@Override
	public void setAgencyName(String agencyName) {
		model.setAgencyName(agencyName);
	}

	/**
	 * Sets the case ID of this wra application due diligence.
	 *
	 * @param caseId the case ID of this wra application due diligence
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this wra application due diligence.
	 *
	 * @param companyId the company ID of this wra application due diligence
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this wra application due diligence.
	 *
	 * @param createDate the create date of this wra application due diligence
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of application of this wra application due diligence.
	 *
	 * @param dateOfApplication the date of application of this wra application due diligence
	 */
	@Override
	public void setDateOfApplication(Date dateOfApplication) {
		model.setDateOfApplication(dateOfApplication);
	}

	/**
	 * Sets the deadline date of this wra application due diligence.
	 *
	 * @param deadlineDate the deadline date of this wra application due diligence
	 */
	@Override
	public void setDeadlineDate(Date deadlineDate) {
		model.setDeadlineDate(deadlineDate);
	}

	/**
	 * Sets the duration of time spent of this wra application due diligence.
	 *
	 * @param durationOfTimeSpent the duration of time spent of this wra application due diligence
	 */
	@Override
	public void setDurationOfTimeSpent(String durationOfTimeSpent) {
		model.setDurationOfTimeSpent(durationOfTimeSpent);
	}

	/**
	 * Sets the entity name of this wra application due diligence.
	 *
	 * @param entityName the entity name of this wra application due diligence
	 */
	@Override
	public void setEntityName(String entityName) {
		model.setEntityName(entityName);
	}

	/**
	 * Sets the feedback received of this wra application due diligence.
	 *
	 * @param feedbackReceived the feedback received of this wra application due diligence
	 */
	@Override
	public void setFeedbackReceived(String feedbackReceived) {
		model.setFeedbackReceived(feedbackReceived);
	}

	/**
	 * Sets the feedback received date of this wra application due diligence.
	 *
	 * @param feedbackReceivedDate the feedback received date of this wra application due diligence
	 */
	@Override
	public void setFeedbackReceivedDate(Date feedbackReceivedDate) {
		model.setFeedbackReceivedDate(feedbackReceivedDate);
	}

	/**
	 * Sets the group ID of this wra application due diligence.
	 *
	 * @param groupId the group ID of this wra application due diligence
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the license number of this wra application due diligence.
	 *
	 * @param licenseNumber the license number of this wra application due diligence
	 */
	@Override
	public void setLicenseNumber(String licenseNumber) {
		model.setLicenseNumber(licenseNumber);
	}

	/**
	 * Sets the modified date of this wra application due diligence.
	 *
	 * @param modifiedDate the modified date of this wra application due diligence
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this wra application due diligence.
	 *
	 * @param primaryKey the primary key of this wra application due diligence
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this wra application due diligence.
	 *
	 * @param status the status of this wra application due diligence
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the submitted to agency date of this wra application due diligence.
	 *
	 * @param submittedToAgencyDate the submitted to agency date of this wra application due diligence
	 */
	@Override
	public void setSubmittedToAgencyDate(Date submittedToAgencyDate) {
		model.setSubmittedToAgencyDate(submittedToAgencyDate);
	}

	/**
	 * Sets the transaction number of this wra application due diligence.
	 *
	 * @param transactionNumber the transaction number of this wra application due diligence
	 */
	@Override
	public void setTransactionNumber(String transactionNumber) {
		model.setTransactionNumber(transactionNumber);
	}

	/**
	 * Sets the updated by source of this wra application due diligence.
	 *
	 * @param updatedBySource the updated by source of this wra application due diligence
	 */
	@Override
	public void setUpdatedBySource(String updatedBySource) {
		model.setUpdatedBySource(updatedBySource);
	}

	/**
	 * Sets the user ID of this wra application due diligence.
	 *
	 * @param userId the user ID of this wra application due diligence
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this wra application due diligence.
	 *
	 * @param userName the user name of this wra application due diligence
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this wra application due diligence.
	 *
	 * @param userUuid the user uuid of this wra application due diligence
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the w ra application due diligence ID of this wra application due diligence.
	 *
	 * @param wRAApplicationDueDiligenceId the w ra application due diligence ID of this wra application due diligence
	 */
	@Override
	public void setWRAApplicationDueDiligenceId(
		long wRAApplicationDueDiligenceId) {

		model.setWRAApplicationDueDiligenceId(wRAApplicationDueDiligenceId);
	}

	/**
	 * Sets the wra application ID of this wra application due diligence.
	 *
	 * @param wraApplicationId the wra application ID of this wra application due diligence
	 */
	@Override
	public void setWraApplicationId(long wraApplicationId) {
		model.setWraApplicationId(wraApplicationId);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected WRAApplicationDueDiligenceWrapper wrap(
		WRAApplicationDueDiligence wraApplicationDueDiligence) {

		return new WRAApplicationDueDiligenceWrapper(
			wraApplicationDueDiligence);
	}

}