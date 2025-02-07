/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link HealthCareDueDiligence}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareDueDiligence
 * @generated
 */
public class HealthCareDueDiligenceWrapper
	extends BaseModelWrapper<HealthCareDueDiligence>
	implements HealthCareDueDiligence, ModelWrapper<HealthCareDueDiligence> {

	public HealthCareDueDiligenceWrapper(
		HealthCareDueDiligence healthCareDueDiligence) {

		super(healthCareDueDiligence);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("healthDDId", getHealthDDId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("dateSubmittedAgency ", getDateSubmittedAgency());
		attributes.put("nameofAgency", getNameofAgency());
		attributes.put("agencyDecision", getAgencyDecision());
		attributes.put("reasonForObejction", getReasonForObejction());
		attributes.put("durationOfPeriod", getDurationOfPeriod());
		attributes.put("date", getDate());
		attributes.put("feedbackReceived", getFeedbackReceived());
		attributes.put("Status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long healthDDId = (Long)attributes.get("healthDDId");

		if (healthDDId != null) {
			setHealthDDId(healthDDId);
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

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		Date dateSubmittedAgency = (Date)attributes.get("dateSubmittedAgency ");

		if (dateSubmittedAgency != null) {
			setDateSubmittedAgency(dateSubmittedAgency);
		}

		String nameofAgency = (String)attributes.get("nameofAgency");

		if (nameofAgency != null) {
			setNameofAgency(nameofAgency);
		}

		String agencyDecision = (String)attributes.get("agencyDecision");

		if (agencyDecision != null) {
			setAgencyDecision(agencyDecision);
		}

		String reasonForObejction = (String)attributes.get(
			"reasonForObejction");

		if (reasonForObejction != null) {
			setReasonForObejction(reasonForObejction);
		}

		String durationOfPeriod = (String)attributes.get("durationOfPeriod");

		if (durationOfPeriod != null) {
			setDurationOfPeriod(durationOfPeriod);
		}

		Date date = (Date)attributes.get("date");

		if (date != null) {
			setDate(date);
		}

		Date feedbackReceived = (Date)attributes.get("feedbackReceived");

		if (feedbackReceived != null) {
			setFeedbackReceived(feedbackReceived);
		}

		String Status = (String)attributes.get("Status");

		if (Status != null) {
			setStatus(Status);
		}
	}

	@Override
	public HealthCareDueDiligence cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the agency decision of this health care due diligence.
	 *
	 * @return the agency decision of this health care due diligence
	 */
	@Override
	public String getAgencyDecision() {
		return model.getAgencyDecision();
	}

	/**
	 * Returns the case ID of this health care due diligence.
	 *
	 * @return the case ID of this health care due diligence
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this health care due diligence.
	 *
	 * @return the company ID of this health care due diligence
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this health care due diligence.
	 *
	 * @return the create date of this health care due diligence
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of this health care due diligence.
	 *
	 * @return the date of this health care due diligence
	 */
	@Override
	public Date getDate() {
		return model.getDate();
	}

	/**
	 * Returns the date submitted agency of this health care due diligence.
	 *
	 * @return the date submitted agency of this health care due diligence
	 */
	@Override
	public Date getDateSubmittedAgency() {
		return model.getDateSubmittedAgency();
	}

	/**
	 * Returns the duration of period of this health care due diligence.
	 *
	 * @return the duration of period of this health care due diligence
	 */
	@Override
	public String getDurationOfPeriod() {
		return model.getDurationOfPeriod();
	}

	/**
	 * Returns the feedback received of this health care due diligence.
	 *
	 * @return the feedback received of this health care due diligence
	 */
	@Override
	public Date getFeedbackReceived() {
		return model.getFeedbackReceived();
	}

	/**
	 * Returns the group ID of this health care due diligence.
	 *
	 * @return the group ID of this health care due diligence
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the health dd ID of this health care due diligence.
	 *
	 * @return the health dd ID of this health care due diligence
	 */
	@Override
	public long getHealthDDId() {
		return model.getHealthDDId();
	}

	/**
	 * Returns the modified date of this health care due diligence.
	 *
	 * @return the modified date of this health care due diligence
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nameof agency of this health care due diligence.
	 *
	 * @return the nameof agency of this health care due diligence
	 */
	@Override
	public String getNameofAgency() {
		return model.getNameofAgency();
	}

	/**
	 * Returns the primary key of this health care due diligence.
	 *
	 * @return the primary key of this health care due diligence
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the reason for obejction of this health care due diligence.
	 *
	 * @return the reason for obejction of this health care due diligence
	 */
	@Override
	public String getReasonForObejction() {
		return model.getReasonForObejction();
	}

	/**
	 * Returns the status of this health care due diligence.
	 *
	 * @return the status of this health care due diligence
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the user ID of this health care due diligence.
	 *
	 * @return the user ID of this health care due diligence
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this health care due diligence.
	 *
	 * @return the user name of this health care due diligence
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this health care due diligence.
	 *
	 * @return the user uuid of this health care due diligence
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
	 * Sets the agency decision of this health care due diligence.
	 *
	 * @param agencyDecision the agency decision of this health care due diligence
	 */
	@Override
	public void setAgencyDecision(String agencyDecision) {
		model.setAgencyDecision(agencyDecision);
	}

	/**
	 * Sets the case ID of this health care due diligence.
	 *
	 * @param caseId the case ID of this health care due diligence
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this health care due diligence.
	 *
	 * @param companyId the company ID of this health care due diligence
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this health care due diligence.
	 *
	 * @param createDate the create date of this health care due diligence
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of this health care due diligence.
	 *
	 * @param date the date of this health care due diligence
	 */
	@Override
	public void setDate(Date date) {
		model.setDate(date);
	}

	/**
	 * Sets the date submitted agency of this health care due diligence.
	 *
	 * @param dateSubmittedAgency  the date submitted agency of this health care due diligence
	 */
	@Override
	public void setDateSubmittedAgency(Date dateSubmittedAgency) {
		model.setDateSubmittedAgency(dateSubmittedAgency);
	}

	/**
	 * Sets the duration of period of this health care due diligence.
	 *
	 * @param durationOfPeriod the duration of period of this health care due diligence
	 */
	@Override
	public void setDurationOfPeriod(String durationOfPeriod) {
		model.setDurationOfPeriod(durationOfPeriod);
	}

	/**
	 * Sets the feedback received of this health care due diligence.
	 *
	 * @param feedbackReceived the feedback received of this health care due diligence
	 */
	@Override
	public void setFeedbackReceived(Date feedbackReceived) {
		model.setFeedbackReceived(feedbackReceived);
	}

	/**
	 * Sets the group ID of this health care due diligence.
	 *
	 * @param groupId the group ID of this health care due diligence
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the health dd ID of this health care due diligence.
	 *
	 * @param healthDDId the health dd ID of this health care due diligence
	 */
	@Override
	public void setHealthDDId(long healthDDId) {
		model.setHealthDDId(healthDDId);
	}

	/**
	 * Sets the modified date of this health care due diligence.
	 *
	 * @param modifiedDate the modified date of this health care due diligence
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nameof agency of this health care due diligence.
	 *
	 * @param nameofAgency the nameof agency of this health care due diligence
	 */
	@Override
	public void setNameofAgency(String nameofAgency) {
		model.setNameofAgency(nameofAgency);
	}

	/**
	 * Sets the primary key of this health care due diligence.
	 *
	 * @param primaryKey the primary key of this health care due diligence
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the reason for obejction of this health care due diligence.
	 *
	 * @param reasonForObejction the reason for obejction of this health care due diligence
	 */
	@Override
	public void setReasonForObejction(String reasonForObejction) {
		model.setReasonForObejction(reasonForObejction);
	}

	/**
	 * Sets the status of this health care due diligence.
	 *
	 * @param Status the status of this health care due diligence
	 */
	@Override
	public void setStatus(String Status) {
		model.setStatus(Status);
	}

	/**
	 * Sets the user ID of this health care due diligence.
	 *
	 * @param userId the user ID of this health care due diligence
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this health care due diligence.
	 *
	 * @param userName the user name of this health care due diligence
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this health care due diligence.
	 *
	 * @param userUuid the user uuid of this health care due diligence
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
	protected HealthCareDueDiligenceWrapper wrap(
		HealthCareDueDiligence healthCareDueDiligence) {

		return new HealthCareDueDiligenceWrapper(healthCareDueDiligence);
	}

}