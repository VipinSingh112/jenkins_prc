/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OSIServicesRecommendations}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OSIServicesRecommendations
 * @generated
 */
public class OSIServicesRecommendationsWrapper
	extends BaseModelWrapper<OSIServicesRecommendations>
	implements ModelWrapper<OSIServicesRecommendations>,
			   OSIServicesRecommendations {

	public OSIServicesRecommendationsWrapper(
		OSIServicesRecommendations osiServicesRecommendations) {

		super(osiServicesRecommendations);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"oSIServicesRecommendationsId", getOSIServicesRecommendationsId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put(
			"dateOfRecommendationsDecision",
			getDateOfRecommendationsDecision());
		attributes.put("recommendationsDecision", getRecommendationsDecision());
		attributes.put("caseId", getCaseId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long oSIServicesRecommendationsId = (Long)attributes.get(
			"oSIServicesRecommendationsId");

		if (oSIServicesRecommendationsId != null) {
			setOSIServicesRecommendationsId(oSIServicesRecommendationsId);
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

		Date dateOfRecommendationsDecision = (Date)attributes.get(
			"dateOfRecommendationsDecision");

		if (dateOfRecommendationsDecision != null) {
			setDateOfRecommendationsDecision(dateOfRecommendationsDecision);
		}

		String recommendationsDecision = (String)attributes.get(
			"recommendationsDecision");

		if (recommendationsDecision != null) {
			setRecommendationsDecision(recommendationsDecision);
		}

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}
	}

	@Override
	public OSIServicesRecommendations cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this osi services recommendations.
	 *
	 * @return the case ID of this osi services recommendations
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this osi services recommendations.
	 *
	 * @return the company ID of this osi services recommendations
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this osi services recommendations.
	 *
	 * @return the create date of this osi services recommendations
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of recommendations decision of this osi services recommendations.
	 *
	 * @return the date of recommendations decision of this osi services recommendations
	 */
	@Override
	public Date getDateOfRecommendationsDecision() {
		return model.getDateOfRecommendationsDecision();
	}

	/**
	 * Returns the group ID of this osi services recommendations.
	 *
	 * @return the group ID of this osi services recommendations
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this osi services recommendations.
	 *
	 * @return the modified date of this osi services recommendations
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the o si services recommendations ID of this osi services recommendations.
	 *
	 * @return the o si services recommendations ID of this osi services recommendations
	 */
	@Override
	public long getOSIServicesRecommendationsId() {
		return model.getOSIServicesRecommendationsId();
	}

	/**
	 * Returns the primary key of this osi services recommendations.
	 *
	 * @return the primary key of this osi services recommendations
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the recommendations decision of this osi services recommendations.
	 *
	 * @return the recommendations decision of this osi services recommendations
	 */
	@Override
	public String getRecommendationsDecision() {
		return model.getRecommendationsDecision();
	}

	/**
	 * Returns the user ID of this osi services recommendations.
	 *
	 * @return the user ID of this osi services recommendations
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this osi services recommendations.
	 *
	 * @return the user name of this osi services recommendations
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this osi services recommendations.
	 *
	 * @return the user uuid of this osi services recommendations
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
	 * Sets the case ID of this osi services recommendations.
	 *
	 * @param caseId the case ID of this osi services recommendations
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this osi services recommendations.
	 *
	 * @param companyId the company ID of this osi services recommendations
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this osi services recommendations.
	 *
	 * @param createDate the create date of this osi services recommendations
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of recommendations decision of this osi services recommendations.
	 *
	 * @param dateOfRecommendationsDecision the date of recommendations decision of this osi services recommendations
	 */
	@Override
	public void setDateOfRecommendationsDecision(
		Date dateOfRecommendationsDecision) {

		model.setDateOfRecommendationsDecision(dateOfRecommendationsDecision);
	}

	/**
	 * Sets the group ID of this osi services recommendations.
	 *
	 * @param groupId the group ID of this osi services recommendations
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this osi services recommendations.
	 *
	 * @param modifiedDate the modified date of this osi services recommendations
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the o si services recommendations ID of this osi services recommendations.
	 *
	 * @param oSIServicesRecommendationsId the o si services recommendations ID of this osi services recommendations
	 */
	@Override
	public void setOSIServicesRecommendationsId(
		long oSIServicesRecommendationsId) {

		model.setOSIServicesRecommendationsId(oSIServicesRecommendationsId);
	}

	/**
	 * Sets the primary key of this osi services recommendations.
	 *
	 * @param primaryKey the primary key of this osi services recommendations
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the recommendations decision of this osi services recommendations.
	 *
	 * @param recommendationsDecision the recommendations decision of this osi services recommendations
	 */
	@Override
	public void setRecommendationsDecision(String recommendationsDecision) {
		model.setRecommendationsDecision(recommendationsDecision);
	}

	/**
	 * Sets the user ID of this osi services recommendations.
	 *
	 * @param userId the user ID of this osi services recommendations
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this osi services recommendations.
	 *
	 * @param userName the user name of this osi services recommendations
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this osi services recommendations.
	 *
	 * @param userUuid the user uuid of this osi services recommendations
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
	protected OSIServicesRecommendationsWrapper wrap(
		OSIServicesRecommendations osiServicesRecommendations) {

		return new OSIServicesRecommendationsWrapper(
			osiServicesRecommendations);
	}

}