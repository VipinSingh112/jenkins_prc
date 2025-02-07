/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QualityApplicantDetail}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QualityApplicantDetail
 * @generated
 */
public class QualityApplicantDetailWrapper
	extends BaseModelWrapper<QualityApplicantDetail>
	implements ModelWrapper<QualityApplicantDetail>, QualityApplicantDetail {

	public QualityApplicantDetailWrapper(
		QualityApplicantDetail qualityApplicantDetail) {

		super(qualityApplicantDetail);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"qualityApplicantDetailId", getQualityApplicantDetailId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("expertSurname", getExpertSurname());
		attributes.put("expertFirstName", getExpertFirstName());
		attributes.put("expertId", getExpertId());
		attributes.put("expertPosition", getExpertPosition());
		attributes.put("expertTelephone", getExpertTelephone());
		attributes.put("expertMobile", getExpertMobile());
		attributes.put("expertEmail", getExpertEmail());
		attributes.put("expertDate", getExpertDate());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long qualityApplicantDetailId = (Long)attributes.get(
			"qualityApplicantDetailId");

		if (qualityApplicantDetailId != null) {
			setQualityApplicantDetailId(qualityApplicantDetailId);
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

		String expertSurname = (String)attributes.get("expertSurname");

		if (expertSurname != null) {
			setExpertSurname(expertSurname);
		}

		String expertFirstName = (String)attributes.get("expertFirstName");

		if (expertFirstName != null) {
			setExpertFirstName(expertFirstName);
		}

		String expertId = (String)attributes.get("expertId");

		if (expertId != null) {
			setExpertId(expertId);
		}

		String expertPosition = (String)attributes.get("expertPosition");

		if (expertPosition != null) {
			setExpertPosition(expertPosition);
		}

		String expertTelephone = (String)attributes.get("expertTelephone");

		if (expertTelephone != null) {
			setExpertTelephone(expertTelephone);
		}

		String expertMobile = (String)attributes.get("expertMobile");

		if (expertMobile != null) {
			setExpertMobile(expertMobile);
		}

		String expertEmail = (String)attributes.get("expertEmail");

		if (expertEmail != null) {
			setExpertEmail(expertEmail);
		}

		Date expertDate = (Date)attributes.get("expertDate");

		if (expertDate != null) {
			setExpertDate(expertDate);
		}

		Long hsraApplicationId = (Long)attributes.get("hsraApplicationId");

		if (hsraApplicationId != null) {
			setHsraApplicationId(hsraApplicationId);
		}
	}

	@Override
	public QualityApplicantDetail cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this quality applicant detail.
	 *
	 * @return the company ID of this quality applicant detail
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this quality applicant detail.
	 *
	 * @return the create date of this quality applicant detail
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the expert date of this quality applicant detail.
	 *
	 * @return the expert date of this quality applicant detail
	 */
	@Override
	public Date getExpertDate() {
		return model.getExpertDate();
	}

	/**
	 * Returns the expert email of this quality applicant detail.
	 *
	 * @return the expert email of this quality applicant detail
	 */
	@Override
	public String getExpertEmail() {
		return model.getExpertEmail();
	}

	/**
	 * Returns the expert first name of this quality applicant detail.
	 *
	 * @return the expert first name of this quality applicant detail
	 */
	@Override
	public String getExpertFirstName() {
		return model.getExpertFirstName();
	}

	/**
	 * Returns the expert ID of this quality applicant detail.
	 *
	 * @return the expert ID of this quality applicant detail
	 */
	@Override
	public String getExpertId() {
		return model.getExpertId();
	}

	/**
	 * Returns the expert mobile of this quality applicant detail.
	 *
	 * @return the expert mobile of this quality applicant detail
	 */
	@Override
	public String getExpertMobile() {
		return model.getExpertMobile();
	}

	/**
	 * Returns the expert position of this quality applicant detail.
	 *
	 * @return the expert position of this quality applicant detail
	 */
	@Override
	public String getExpertPosition() {
		return model.getExpertPosition();
	}

	/**
	 * Returns the expert surname of this quality applicant detail.
	 *
	 * @return the expert surname of this quality applicant detail
	 */
	@Override
	public String getExpertSurname() {
		return model.getExpertSurname();
	}

	/**
	 * Returns the expert telephone of this quality applicant detail.
	 *
	 * @return the expert telephone of this quality applicant detail
	 */
	@Override
	public String getExpertTelephone() {
		return model.getExpertTelephone();
	}

	/**
	 * Returns the group ID of this quality applicant detail.
	 *
	 * @return the group ID of this quality applicant detail
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application ID of this quality applicant detail.
	 *
	 * @return the hsra application ID of this quality applicant detail
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the modified date of this quality applicant detail.
	 *
	 * @return the modified date of this quality applicant detail
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this quality applicant detail.
	 *
	 * @return the primary key of this quality applicant detail
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the quality applicant detail ID of this quality applicant detail.
	 *
	 * @return the quality applicant detail ID of this quality applicant detail
	 */
	@Override
	public long getQualityApplicantDetailId() {
		return model.getQualityApplicantDetailId();
	}

	/**
	 * Returns the user ID of this quality applicant detail.
	 *
	 * @return the user ID of this quality applicant detail
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this quality applicant detail.
	 *
	 * @return the user name of this quality applicant detail
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this quality applicant detail.
	 *
	 * @return the user uuid of this quality applicant detail
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
	 * Sets the company ID of this quality applicant detail.
	 *
	 * @param companyId the company ID of this quality applicant detail
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this quality applicant detail.
	 *
	 * @param createDate the create date of this quality applicant detail
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the expert date of this quality applicant detail.
	 *
	 * @param expertDate the expert date of this quality applicant detail
	 */
	@Override
	public void setExpertDate(Date expertDate) {
		model.setExpertDate(expertDate);
	}

	/**
	 * Sets the expert email of this quality applicant detail.
	 *
	 * @param expertEmail the expert email of this quality applicant detail
	 */
	@Override
	public void setExpertEmail(String expertEmail) {
		model.setExpertEmail(expertEmail);
	}

	/**
	 * Sets the expert first name of this quality applicant detail.
	 *
	 * @param expertFirstName the expert first name of this quality applicant detail
	 */
	@Override
	public void setExpertFirstName(String expertFirstName) {
		model.setExpertFirstName(expertFirstName);
	}

	/**
	 * Sets the expert ID of this quality applicant detail.
	 *
	 * @param expertId the expert ID of this quality applicant detail
	 */
	@Override
	public void setExpertId(String expertId) {
		model.setExpertId(expertId);
	}

	/**
	 * Sets the expert mobile of this quality applicant detail.
	 *
	 * @param expertMobile the expert mobile of this quality applicant detail
	 */
	@Override
	public void setExpertMobile(String expertMobile) {
		model.setExpertMobile(expertMobile);
	}

	/**
	 * Sets the expert position of this quality applicant detail.
	 *
	 * @param expertPosition the expert position of this quality applicant detail
	 */
	@Override
	public void setExpertPosition(String expertPosition) {
		model.setExpertPosition(expertPosition);
	}

	/**
	 * Sets the expert surname of this quality applicant detail.
	 *
	 * @param expertSurname the expert surname of this quality applicant detail
	 */
	@Override
	public void setExpertSurname(String expertSurname) {
		model.setExpertSurname(expertSurname);
	}

	/**
	 * Sets the expert telephone of this quality applicant detail.
	 *
	 * @param expertTelephone the expert telephone of this quality applicant detail
	 */
	@Override
	public void setExpertTelephone(String expertTelephone) {
		model.setExpertTelephone(expertTelephone);
	}

	/**
	 * Sets the group ID of this quality applicant detail.
	 *
	 * @param groupId the group ID of this quality applicant detail
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application ID of this quality applicant detail.
	 *
	 * @param hsraApplicationId the hsra application ID of this quality applicant detail
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the modified date of this quality applicant detail.
	 *
	 * @param modifiedDate the modified date of this quality applicant detail
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this quality applicant detail.
	 *
	 * @param primaryKey the primary key of this quality applicant detail
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the quality applicant detail ID of this quality applicant detail.
	 *
	 * @param qualityApplicantDetailId the quality applicant detail ID of this quality applicant detail
	 */
	@Override
	public void setQualityApplicantDetailId(long qualityApplicantDetailId) {
		model.setQualityApplicantDetailId(qualityApplicantDetailId);
	}

	/**
	 * Sets the user ID of this quality applicant detail.
	 *
	 * @param userId the user ID of this quality applicant detail
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this quality applicant detail.
	 *
	 * @param userName the user name of this quality applicant detail
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this quality applicant detail.
	 *
	 * @param userUuid the user uuid of this quality applicant detail
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
	protected QualityApplicantDetailWrapper wrap(
		QualityApplicantDetail qualityApplicantDetail) {

		return new QualityApplicantDetailWrapper(qualityApplicantDetail);
	}

}