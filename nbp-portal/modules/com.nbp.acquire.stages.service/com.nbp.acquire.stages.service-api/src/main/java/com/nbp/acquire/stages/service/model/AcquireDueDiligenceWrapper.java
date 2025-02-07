/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AcquireDueDiligence}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireDueDiligence
 * @generated
 */
public class AcquireDueDiligenceWrapper
	extends BaseModelWrapper<AcquireDueDiligence>
	implements AcquireDueDiligence, ModelWrapper<AcquireDueDiligence> {

	public AcquireDueDiligenceWrapper(AcquireDueDiligence acquireDueDiligence) {
		super(acquireDueDiligence);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sampleId", getSampleId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("siteVisitRequired", getSiteVisitRequired());
		attributes.put("preferredSitVisitDate", getPreferredSitVisitDate());
		attributes.put("agencySubmissionStatus", getAgencySubmissionStatus());
		attributes.put("nameOfAgency", getNameOfAgency());
		attributes.put("caseId", getCaseId());
		attributes.put("dateSubmittedToAgency", getDateSubmittedToAgency());
		attributes.put("agencyRecommendations", getAgencyRecommendations());
		attributes.put("dateFeedbackReceived", getDateFeedbackReceived());
		attributes.put("acquireApplicationId", getAcquireApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sampleId = (Long)attributes.get("sampleId");

		if (sampleId != null) {
			setSampleId(sampleId);
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

		String siteVisitRequired = (String)attributes.get("siteVisitRequired");

		if (siteVisitRequired != null) {
			setSiteVisitRequired(siteVisitRequired);
		}

		Date preferredSitVisitDate = (Date)attributes.get(
			"preferredSitVisitDate");

		if (preferredSitVisitDate != null) {
			setPreferredSitVisitDate(preferredSitVisitDate);
		}

		String agencySubmissionStatus = (String)attributes.get(
			"agencySubmissionStatus");

		if (agencySubmissionStatus != null) {
			setAgencySubmissionStatus(agencySubmissionStatus);
		}

		String nameOfAgency = (String)attributes.get("nameOfAgency");

		if (nameOfAgency != null) {
			setNameOfAgency(nameOfAgency);
		}

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		Date dateSubmittedToAgency = (Date)attributes.get(
			"dateSubmittedToAgency");

		if (dateSubmittedToAgency != null) {
			setDateSubmittedToAgency(dateSubmittedToAgency);
		}

		String agencyRecommendations = (String)attributes.get(
			"agencyRecommendations");

		if (agencyRecommendations != null) {
			setAgencyRecommendations(agencyRecommendations);
		}

		Date dateFeedbackReceived = (Date)attributes.get(
			"dateFeedbackReceived");

		if (dateFeedbackReceived != null) {
			setDateFeedbackReceived(dateFeedbackReceived);
		}

		Long acquireApplicationId = (Long)attributes.get(
			"acquireApplicationId");

		if (acquireApplicationId != null) {
			setAcquireApplicationId(acquireApplicationId);
		}
	}

	@Override
	public AcquireDueDiligence cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acquire application ID of this acquire due diligence.
	 *
	 * @return the acquire application ID of this acquire due diligence
	 */
	@Override
	public long getAcquireApplicationId() {
		return model.getAcquireApplicationId();
	}

	/**
	 * Returns the agency recommendations of this acquire due diligence.
	 *
	 * @return the agency recommendations of this acquire due diligence
	 */
	@Override
	public String getAgencyRecommendations() {
		return model.getAgencyRecommendations();
	}

	/**
	 * Returns the agency submission status of this acquire due diligence.
	 *
	 * @return the agency submission status of this acquire due diligence
	 */
	@Override
	public String getAgencySubmissionStatus() {
		return model.getAgencySubmissionStatus();
	}

	/**
	 * Returns the case ID of this acquire due diligence.
	 *
	 * @return the case ID of this acquire due diligence
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this acquire due diligence.
	 *
	 * @return the company ID of this acquire due diligence
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acquire due diligence.
	 *
	 * @return the create date of this acquire due diligence
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date feedback received of this acquire due diligence.
	 *
	 * @return the date feedback received of this acquire due diligence
	 */
	@Override
	public Date getDateFeedbackReceived() {
		return model.getDateFeedbackReceived();
	}

	/**
	 * Returns the date submitted to agency of this acquire due diligence.
	 *
	 * @return the date submitted to agency of this acquire due diligence
	 */
	@Override
	public Date getDateSubmittedToAgency() {
		return model.getDateSubmittedToAgency();
	}

	/**
	 * Returns the group ID of this acquire due diligence.
	 *
	 * @return the group ID of this acquire due diligence
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this acquire due diligence.
	 *
	 * @return the modified date of this acquire due diligence
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of agency of this acquire due diligence.
	 *
	 * @return the name of agency of this acquire due diligence
	 */
	@Override
	public String getNameOfAgency() {
		return model.getNameOfAgency();
	}

	/**
	 * Returns the preferred sit visit date of this acquire due diligence.
	 *
	 * @return the preferred sit visit date of this acquire due diligence
	 */
	@Override
	public Date getPreferredSitVisitDate() {
		return model.getPreferredSitVisitDate();
	}

	/**
	 * Returns the primary key of this acquire due diligence.
	 *
	 * @return the primary key of this acquire due diligence
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sample ID of this acquire due diligence.
	 *
	 * @return the sample ID of this acquire due diligence
	 */
	@Override
	public long getSampleId() {
		return model.getSampleId();
	}

	/**
	 * Returns the site visit required of this acquire due diligence.
	 *
	 * @return the site visit required of this acquire due diligence
	 */
	@Override
	public String getSiteVisitRequired() {
		return model.getSiteVisitRequired();
	}

	/**
	 * Returns the user ID of this acquire due diligence.
	 *
	 * @return the user ID of this acquire due diligence
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acquire due diligence.
	 *
	 * @return the user name of this acquire due diligence
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acquire due diligence.
	 *
	 * @return the user uuid of this acquire due diligence
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
	 * Sets the acquire application ID of this acquire due diligence.
	 *
	 * @param acquireApplicationId the acquire application ID of this acquire due diligence
	 */
	@Override
	public void setAcquireApplicationId(long acquireApplicationId) {
		model.setAcquireApplicationId(acquireApplicationId);
	}

	/**
	 * Sets the agency recommendations of this acquire due diligence.
	 *
	 * @param agencyRecommendations the agency recommendations of this acquire due diligence
	 */
	@Override
	public void setAgencyRecommendations(String agencyRecommendations) {
		model.setAgencyRecommendations(agencyRecommendations);
	}

	/**
	 * Sets the agency submission status of this acquire due diligence.
	 *
	 * @param agencySubmissionStatus the agency submission status of this acquire due diligence
	 */
	@Override
	public void setAgencySubmissionStatus(String agencySubmissionStatus) {
		model.setAgencySubmissionStatus(agencySubmissionStatus);
	}

	/**
	 * Sets the case ID of this acquire due diligence.
	 *
	 * @param caseId the case ID of this acquire due diligence
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this acquire due diligence.
	 *
	 * @param companyId the company ID of this acquire due diligence
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acquire due diligence.
	 *
	 * @param createDate the create date of this acquire due diligence
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date feedback received of this acquire due diligence.
	 *
	 * @param dateFeedbackReceived the date feedback received of this acquire due diligence
	 */
	@Override
	public void setDateFeedbackReceived(Date dateFeedbackReceived) {
		model.setDateFeedbackReceived(dateFeedbackReceived);
	}

	/**
	 * Sets the date submitted to agency of this acquire due diligence.
	 *
	 * @param dateSubmittedToAgency the date submitted to agency of this acquire due diligence
	 */
	@Override
	public void setDateSubmittedToAgency(Date dateSubmittedToAgency) {
		model.setDateSubmittedToAgency(dateSubmittedToAgency);
	}

	/**
	 * Sets the group ID of this acquire due diligence.
	 *
	 * @param groupId the group ID of this acquire due diligence
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this acquire due diligence.
	 *
	 * @param modifiedDate the modified date of this acquire due diligence
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of agency of this acquire due diligence.
	 *
	 * @param nameOfAgency the name of agency of this acquire due diligence
	 */
	@Override
	public void setNameOfAgency(String nameOfAgency) {
		model.setNameOfAgency(nameOfAgency);
	}

	/**
	 * Sets the preferred sit visit date of this acquire due diligence.
	 *
	 * @param preferredSitVisitDate the preferred sit visit date of this acquire due diligence
	 */
	@Override
	public void setPreferredSitVisitDate(Date preferredSitVisitDate) {
		model.setPreferredSitVisitDate(preferredSitVisitDate);
	}

	/**
	 * Sets the primary key of this acquire due diligence.
	 *
	 * @param primaryKey the primary key of this acquire due diligence
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sample ID of this acquire due diligence.
	 *
	 * @param sampleId the sample ID of this acquire due diligence
	 */
	@Override
	public void setSampleId(long sampleId) {
		model.setSampleId(sampleId);
	}

	/**
	 * Sets the site visit required of this acquire due diligence.
	 *
	 * @param siteVisitRequired the site visit required of this acquire due diligence
	 */
	@Override
	public void setSiteVisitRequired(String siteVisitRequired) {
		model.setSiteVisitRequired(siteVisitRequired);
	}

	/**
	 * Sets the user ID of this acquire due diligence.
	 *
	 * @param userId the user ID of this acquire due diligence
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acquire due diligence.
	 *
	 * @param userName the user name of this acquire due diligence
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acquire due diligence.
	 *
	 * @param userUuid the user uuid of this acquire due diligence
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
	protected AcquireDueDiligenceWrapper wrap(
		AcquireDueDiligence acquireDueDiligence) {

		return new AcquireDueDiligenceWrapper(acquireDueDiligence);
	}

}