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
 * This class is a wrapper for {@link TourismBonaAccoSignInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccoSignInfo
 * @generated
 */
public class TourismBonaAccoSignInfoWrapper
	extends BaseModelWrapper<TourismBonaAccoSignInfo>
	implements ModelWrapper<TourismBonaAccoSignInfo>, TourismBonaAccoSignInfo {

	public TourismBonaAccoSignInfoWrapper(
		TourismBonaAccoSignInfo tourismBonaAccoSignInfo) {

		super(tourismBonaAccoSignInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tourismBonaAccoSignId", getTourismBonaAccoSignId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("newSignApplicantName", getNewSignApplicantName());
		attributes.put("newSignApplicantStatus", getNewSignApplicantStatus());
		attributes.put("newSignDate", getNewSignDate());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismBonaAccoSignId = (Long)attributes.get(
			"tourismBonaAccoSignId");

		if (tourismBonaAccoSignId != null) {
			setTourismBonaAccoSignId(tourismBonaAccoSignId);
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

		String newSignApplicantName = (String)attributes.get(
			"newSignApplicantName");

		if (newSignApplicantName != null) {
			setNewSignApplicantName(newSignApplicantName);
		}

		String newSignApplicantStatus = (String)attributes.get(
			"newSignApplicantStatus");

		if (newSignApplicantStatus != null) {
			setNewSignApplicantStatus(newSignApplicantStatus);
		}

		Date newSignDate = (Date)attributes.get("newSignDate");

		if (newSignDate != null) {
			setNewSignDate(newSignDate);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}
	}

	@Override
	public TourismBonaAccoSignInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this tourism bona acco sign info.
	 *
	 * @return the company ID of this tourism bona acco sign info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism bona acco sign info.
	 *
	 * @return the create date of this tourism bona acco sign info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this tourism bona acco sign info.
	 *
	 * @return the group ID of this tourism bona acco sign info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism bona acco sign info.
	 *
	 * @return the modified date of this tourism bona acco sign info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the new sign applicant name of this tourism bona acco sign info.
	 *
	 * @return the new sign applicant name of this tourism bona acco sign info
	 */
	@Override
	public String getNewSignApplicantName() {
		return model.getNewSignApplicantName();
	}

	/**
	 * Returns the new sign applicant status of this tourism bona acco sign info.
	 *
	 * @return the new sign applicant status of this tourism bona acco sign info
	 */
	@Override
	public String getNewSignApplicantStatus() {
		return model.getNewSignApplicantStatus();
	}

	/**
	 * Returns the new sign date of this tourism bona acco sign info.
	 *
	 * @return the new sign date of this tourism bona acco sign info
	 */
	@Override
	public Date getNewSignDate() {
		return model.getNewSignDate();
	}

	/**
	 * Returns the primary key of this tourism bona acco sign info.
	 *
	 * @return the primary key of this tourism bona acco sign info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tourism application ID of this tourism bona acco sign info.
	 *
	 * @return the tourism application ID of this tourism bona acco sign info
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism bona acco sign ID of this tourism bona acco sign info.
	 *
	 * @return the tourism bona acco sign ID of this tourism bona acco sign info
	 */
	@Override
	public long getTourismBonaAccoSignId() {
		return model.getTourismBonaAccoSignId();
	}

	/**
	 * Returns the user ID of this tourism bona acco sign info.
	 *
	 * @return the user ID of this tourism bona acco sign info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism bona acco sign info.
	 *
	 * @return the user name of this tourism bona acco sign info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism bona acco sign info.
	 *
	 * @return the user uuid of this tourism bona acco sign info
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
	 * Sets the company ID of this tourism bona acco sign info.
	 *
	 * @param companyId the company ID of this tourism bona acco sign info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism bona acco sign info.
	 *
	 * @param createDate the create date of this tourism bona acco sign info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this tourism bona acco sign info.
	 *
	 * @param groupId the group ID of this tourism bona acco sign info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism bona acco sign info.
	 *
	 * @param modifiedDate the modified date of this tourism bona acco sign info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the new sign applicant name of this tourism bona acco sign info.
	 *
	 * @param newSignApplicantName the new sign applicant name of this tourism bona acco sign info
	 */
	@Override
	public void setNewSignApplicantName(String newSignApplicantName) {
		model.setNewSignApplicantName(newSignApplicantName);
	}

	/**
	 * Sets the new sign applicant status of this tourism bona acco sign info.
	 *
	 * @param newSignApplicantStatus the new sign applicant status of this tourism bona acco sign info
	 */
	@Override
	public void setNewSignApplicantStatus(String newSignApplicantStatus) {
		model.setNewSignApplicantStatus(newSignApplicantStatus);
	}

	/**
	 * Sets the new sign date of this tourism bona acco sign info.
	 *
	 * @param newSignDate the new sign date of this tourism bona acco sign info
	 */
	@Override
	public void setNewSignDate(Date newSignDate) {
		model.setNewSignDate(newSignDate);
	}

	/**
	 * Sets the primary key of this tourism bona acco sign info.
	 *
	 * @param primaryKey the primary key of this tourism bona acco sign info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tourism application ID of this tourism bona acco sign info.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism bona acco sign info
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism bona acco sign ID of this tourism bona acco sign info.
	 *
	 * @param tourismBonaAccoSignId the tourism bona acco sign ID of this tourism bona acco sign info
	 */
	@Override
	public void setTourismBonaAccoSignId(long tourismBonaAccoSignId) {
		model.setTourismBonaAccoSignId(tourismBonaAccoSignId);
	}

	/**
	 * Sets the user ID of this tourism bona acco sign info.
	 *
	 * @param userId the user ID of this tourism bona acco sign info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism bona acco sign info.
	 *
	 * @param userName the user name of this tourism bona acco sign info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism bona acco sign info.
	 *
	 * @param userUuid the user uuid of this tourism bona acco sign info
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
	protected TourismBonaAccoSignInfoWrapper wrap(
		TourismBonaAccoSignInfo tourismBonaAccoSignInfo) {

		return new TourismBonaAccoSignInfoWrapper(tourismBonaAccoSignInfo);
	}

}