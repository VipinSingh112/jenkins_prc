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
 * This class is a wrapper for {@link TourismNewAccoSignInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccoSignInfo
 * @generated
 */
public class TourismNewAccoSignInfoWrapper
	extends BaseModelWrapper<TourismNewAccoSignInfo>
	implements ModelWrapper<TourismNewAccoSignInfo>, TourismNewAccoSignInfo {

	public TourismNewAccoSignInfoWrapper(
		TourismNewAccoSignInfo tourismNewAccoSignInfo) {

		super(tourismNewAccoSignInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"tourismNewAccoSignInfoId", getTourismNewAccoSignInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("signApplicantName", getSignApplicantName());
		attributes.put("signApplicantStatus", getSignApplicantStatus());
		attributes.put("newSignDate", getNewSignDate());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismNewAccoSignInfoId = (Long)attributes.get(
			"tourismNewAccoSignInfoId");

		if (tourismNewAccoSignInfoId != null) {
			setTourismNewAccoSignInfoId(tourismNewAccoSignInfoId);
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

		String signApplicantName = (String)attributes.get("signApplicantName");

		if (signApplicantName != null) {
			setSignApplicantName(signApplicantName);
		}

		String signApplicantStatus = (String)attributes.get(
			"signApplicantStatus");

		if (signApplicantStatus != null) {
			setSignApplicantStatus(signApplicantStatus);
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
	public TourismNewAccoSignInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this tourism new acco sign info.
	 *
	 * @return the company ID of this tourism new acco sign info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism new acco sign info.
	 *
	 * @return the create date of this tourism new acco sign info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this tourism new acco sign info.
	 *
	 * @return the group ID of this tourism new acco sign info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism new acco sign info.
	 *
	 * @return the modified date of this tourism new acco sign info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the new sign date of this tourism new acco sign info.
	 *
	 * @return the new sign date of this tourism new acco sign info
	 */
	@Override
	public Date getNewSignDate() {
		return model.getNewSignDate();
	}

	/**
	 * Returns the primary key of this tourism new acco sign info.
	 *
	 * @return the primary key of this tourism new acco sign info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sign applicant name of this tourism new acco sign info.
	 *
	 * @return the sign applicant name of this tourism new acco sign info
	 */
	@Override
	public String getSignApplicantName() {
		return model.getSignApplicantName();
	}

	/**
	 * Returns the sign applicant status of this tourism new acco sign info.
	 *
	 * @return the sign applicant status of this tourism new acco sign info
	 */
	@Override
	public String getSignApplicantStatus() {
		return model.getSignApplicantStatus();
	}

	/**
	 * Returns the tourism application ID of this tourism new acco sign info.
	 *
	 * @return the tourism application ID of this tourism new acco sign info
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism new acco sign info ID of this tourism new acco sign info.
	 *
	 * @return the tourism new acco sign info ID of this tourism new acco sign info
	 */
	@Override
	public long getTourismNewAccoSignInfoId() {
		return model.getTourismNewAccoSignInfoId();
	}

	/**
	 * Returns the user ID of this tourism new acco sign info.
	 *
	 * @return the user ID of this tourism new acco sign info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism new acco sign info.
	 *
	 * @return the user name of this tourism new acco sign info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism new acco sign info.
	 *
	 * @return the user uuid of this tourism new acco sign info
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
	 * Sets the company ID of this tourism new acco sign info.
	 *
	 * @param companyId the company ID of this tourism new acco sign info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism new acco sign info.
	 *
	 * @param createDate the create date of this tourism new acco sign info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this tourism new acco sign info.
	 *
	 * @param groupId the group ID of this tourism new acco sign info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism new acco sign info.
	 *
	 * @param modifiedDate the modified date of this tourism new acco sign info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the new sign date of this tourism new acco sign info.
	 *
	 * @param newSignDate the new sign date of this tourism new acco sign info
	 */
	@Override
	public void setNewSignDate(Date newSignDate) {
		model.setNewSignDate(newSignDate);
	}

	/**
	 * Sets the primary key of this tourism new acco sign info.
	 *
	 * @param primaryKey the primary key of this tourism new acco sign info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sign applicant name of this tourism new acco sign info.
	 *
	 * @param signApplicantName the sign applicant name of this tourism new acco sign info
	 */
	@Override
	public void setSignApplicantName(String signApplicantName) {
		model.setSignApplicantName(signApplicantName);
	}

	/**
	 * Sets the sign applicant status of this tourism new acco sign info.
	 *
	 * @param signApplicantStatus the sign applicant status of this tourism new acco sign info
	 */
	@Override
	public void setSignApplicantStatus(String signApplicantStatus) {
		model.setSignApplicantStatus(signApplicantStatus);
	}

	/**
	 * Sets the tourism application ID of this tourism new acco sign info.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism new acco sign info
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism new acco sign info ID of this tourism new acco sign info.
	 *
	 * @param tourismNewAccoSignInfoId the tourism new acco sign info ID of this tourism new acco sign info
	 */
	@Override
	public void setTourismNewAccoSignInfoId(long tourismNewAccoSignInfoId) {
		model.setTourismNewAccoSignInfoId(tourismNewAccoSignInfoId);
	}

	/**
	 * Sets the user ID of this tourism new acco sign info.
	 *
	 * @param userId the user ID of this tourism new acco sign info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism new acco sign info.
	 *
	 * @param userName the user name of this tourism new acco sign info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism new acco sign info.
	 *
	 * @param userUuid the user uuid of this tourism new acco sign info
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
	protected TourismNewAccoSignInfoWrapper wrap(
		TourismNewAccoSignInfo tourismNewAccoSignInfo) {

		return new TourismNewAccoSignInfoWrapper(tourismNewAccoSignInfo);
	}

}