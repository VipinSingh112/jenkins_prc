/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TourismBonaAttractionSignInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAttractionSignInfo
 * @generated
 */
public class TourismBonaAttractionSignInfoWrapper
	extends BaseModelWrapper<TourismBonaAttractionSignInfo>
	implements ModelWrapper<TourismBonaAttractionSignInfo>,
			   TourismBonaAttractionSignInfo {

	public TourismBonaAttractionSignInfoWrapper(
		TourismBonaAttractionSignInfo tourismBonaAttractionSignInfo) {

		super(tourismBonaAttractionSignInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tourismBonAttrSignId", getTourismBonAttrSignId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("applicantName", getApplicantName());
		attributes.put("applicantStatus", getApplicantStatus());
		attributes.put("signDate", getSignDate());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismBonAttrSignId = (Long)attributes.get(
			"tourismBonAttrSignId");

		if (tourismBonAttrSignId != null) {
			setTourismBonAttrSignId(tourismBonAttrSignId);
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

		String applicantName = (String)attributes.get("applicantName");

		if (applicantName != null) {
			setApplicantName(applicantName);
		}

		String applicantStatus = (String)attributes.get("applicantStatus");

		if (applicantStatus != null) {
			setApplicantStatus(applicantStatus);
		}

		Date signDate = (Date)attributes.get("signDate");

		if (signDate != null) {
			setSignDate(signDate);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}
	}

	@Override
	public TourismBonaAttractionSignInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the applicant name of this tourism bona attraction sign info.
	 *
	 * @return the applicant name of this tourism bona attraction sign info
	 */
	@Override
	public String getApplicantName() {
		return model.getApplicantName();
	}

	/**
	 * Returns the applicant status of this tourism bona attraction sign info.
	 *
	 * @return the applicant status of this tourism bona attraction sign info
	 */
	@Override
	public String getApplicantStatus() {
		return model.getApplicantStatus();
	}

	/**
	 * Returns the company ID of this tourism bona attraction sign info.
	 *
	 * @return the company ID of this tourism bona attraction sign info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism bona attraction sign info.
	 *
	 * @return the create date of this tourism bona attraction sign info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this tourism bona attraction sign info.
	 *
	 * @return the group ID of this tourism bona attraction sign info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism bona attraction sign info.
	 *
	 * @return the modified date of this tourism bona attraction sign info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this tourism bona attraction sign info.
	 *
	 * @return the primary key of this tourism bona attraction sign info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sign date of this tourism bona attraction sign info.
	 *
	 * @return the sign date of this tourism bona attraction sign info
	 */
	@Override
	public Date getSignDate() {
		return model.getSignDate();
	}

	/**
	 * Returns the tourism application ID of this tourism bona attraction sign info.
	 *
	 * @return the tourism application ID of this tourism bona attraction sign info
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism bon attr sign ID of this tourism bona attraction sign info.
	 *
	 * @return the tourism bon attr sign ID of this tourism bona attraction sign info
	 */
	@Override
	public long getTourismBonAttrSignId() {
		return model.getTourismBonAttrSignId();
	}

	/**
	 * Returns the user ID of this tourism bona attraction sign info.
	 *
	 * @return the user ID of this tourism bona attraction sign info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism bona attraction sign info.
	 *
	 * @return the user name of this tourism bona attraction sign info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism bona attraction sign info.
	 *
	 * @return the user uuid of this tourism bona attraction sign info
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
	 * Sets the applicant name of this tourism bona attraction sign info.
	 *
	 * @param applicantName the applicant name of this tourism bona attraction sign info
	 */
	@Override
	public void setApplicantName(String applicantName) {
		model.setApplicantName(applicantName);
	}

	/**
	 * Sets the applicant status of this tourism bona attraction sign info.
	 *
	 * @param applicantStatus the applicant status of this tourism bona attraction sign info
	 */
	@Override
	public void setApplicantStatus(String applicantStatus) {
		model.setApplicantStatus(applicantStatus);
	}

	/**
	 * Sets the company ID of this tourism bona attraction sign info.
	 *
	 * @param companyId the company ID of this tourism bona attraction sign info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism bona attraction sign info.
	 *
	 * @param createDate the create date of this tourism bona attraction sign info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this tourism bona attraction sign info.
	 *
	 * @param groupId the group ID of this tourism bona attraction sign info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism bona attraction sign info.
	 *
	 * @param modifiedDate the modified date of this tourism bona attraction sign info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this tourism bona attraction sign info.
	 *
	 * @param primaryKey the primary key of this tourism bona attraction sign info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sign date of this tourism bona attraction sign info.
	 *
	 * @param signDate the sign date of this tourism bona attraction sign info
	 */
	@Override
	public void setSignDate(Date signDate) {
		model.setSignDate(signDate);
	}

	/**
	 * Sets the tourism application ID of this tourism bona attraction sign info.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism bona attraction sign info
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism bon attr sign ID of this tourism bona attraction sign info.
	 *
	 * @param tourismBonAttrSignId the tourism bon attr sign ID of this tourism bona attraction sign info
	 */
	@Override
	public void setTourismBonAttrSignId(long tourismBonAttrSignId) {
		model.setTourismBonAttrSignId(tourismBonAttrSignId);
	}

	/**
	 * Sets the user ID of this tourism bona attraction sign info.
	 *
	 * @param userId the user ID of this tourism bona attraction sign info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism bona attraction sign info.
	 *
	 * @param userName the user name of this tourism bona attraction sign info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism bona attraction sign info.
	 *
	 * @param userUuid the user uuid of this tourism bona attraction sign info
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
	protected TourismBonaAttractionSignInfoWrapper wrap(
		TourismBonaAttractionSignInfo tourismBonaAttractionSignInfo) {

		return new TourismBonaAttractionSignInfoWrapper(
			tourismBonaAttractionSignInfo);
	}

}