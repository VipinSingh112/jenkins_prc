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
 * This class is a wrapper for {@link TourismBonaOperatorInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaOperatorInfo
 * @generated
 */
public class TourismBonaOperatorInfoWrapper
	extends BaseModelWrapper<TourismBonaOperatorInfo>
	implements ModelWrapper<TourismBonaOperatorInfo>, TourismBonaOperatorInfo {

	public TourismBonaOperatorInfoWrapper(
		TourismBonaOperatorInfo tourismBonaOperatorInfo) {

		super(tourismBonaOperatorInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"tourismBonaOperatorInfoId", getTourismBonaOperatorInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("operatorName", getOperatorName());
		attributes.put("operatorNumber", getOperatorNumber());
		attributes.put("issueDate", getIssueDate());
		attributes.put("expirationDate", getExpirationDate());
		attributes.put("categories", getCategories());
		attributes.put("subCategories", getSubCategories());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismBonaOperatorInfoId = (Long)attributes.get(
			"tourismBonaOperatorInfoId");

		if (tourismBonaOperatorInfoId != null) {
			setTourismBonaOperatorInfoId(tourismBonaOperatorInfoId);
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

		String operatorName = (String)attributes.get("operatorName");

		if (operatorName != null) {
			setOperatorName(operatorName);
		}

		String operatorNumber = (String)attributes.get("operatorNumber");

		if (operatorNumber != null) {
			setOperatorNumber(operatorNumber);
		}

		Date issueDate = (Date)attributes.get("issueDate");

		if (issueDate != null) {
			setIssueDate(issueDate);
		}

		Date expirationDate = (Date)attributes.get("expirationDate");

		if (expirationDate != null) {
			setExpirationDate(expirationDate);
		}

		String categories = (String)attributes.get("categories");

		if (categories != null) {
			setCategories(categories);
		}

		String subCategories = (String)attributes.get("subCategories");

		if (subCategories != null) {
			setSubCategories(subCategories);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}
	}

	@Override
	public TourismBonaOperatorInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the categories of this tourism bona operator info.
	 *
	 * @return the categories of this tourism bona operator info
	 */
	@Override
	public String getCategories() {
		return model.getCategories();
	}

	/**
	 * Returns the company ID of this tourism bona operator info.
	 *
	 * @return the company ID of this tourism bona operator info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism bona operator info.
	 *
	 * @return the create date of this tourism bona operator info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the expiration date of this tourism bona operator info.
	 *
	 * @return the expiration date of this tourism bona operator info
	 */
	@Override
	public Date getExpirationDate() {
		return model.getExpirationDate();
	}

	/**
	 * Returns the group ID of this tourism bona operator info.
	 *
	 * @return the group ID of this tourism bona operator info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the issue date of this tourism bona operator info.
	 *
	 * @return the issue date of this tourism bona operator info
	 */
	@Override
	public Date getIssueDate() {
		return model.getIssueDate();
	}

	/**
	 * Returns the modified date of this tourism bona operator info.
	 *
	 * @return the modified date of this tourism bona operator info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the operator name of this tourism bona operator info.
	 *
	 * @return the operator name of this tourism bona operator info
	 */
	@Override
	public String getOperatorName() {
		return model.getOperatorName();
	}

	/**
	 * Returns the operator number of this tourism bona operator info.
	 *
	 * @return the operator number of this tourism bona operator info
	 */
	@Override
	public String getOperatorNumber() {
		return model.getOperatorNumber();
	}

	/**
	 * Returns the primary key of this tourism bona operator info.
	 *
	 * @return the primary key of this tourism bona operator info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sub categories of this tourism bona operator info.
	 *
	 * @return the sub categories of this tourism bona operator info
	 */
	@Override
	public String getSubCategories() {
		return model.getSubCategories();
	}

	/**
	 * Returns the tourism application ID of this tourism bona operator info.
	 *
	 * @return the tourism application ID of this tourism bona operator info
	 */
	@Override
	public Long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism bona operator info ID of this tourism bona operator info.
	 *
	 * @return the tourism bona operator info ID of this tourism bona operator info
	 */
	@Override
	public long getTourismBonaOperatorInfoId() {
		return model.getTourismBonaOperatorInfoId();
	}

	/**
	 * Returns the user ID of this tourism bona operator info.
	 *
	 * @return the user ID of this tourism bona operator info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism bona operator info.
	 *
	 * @return the user name of this tourism bona operator info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism bona operator info.
	 *
	 * @return the user uuid of this tourism bona operator info
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
	 * Sets the categories of this tourism bona operator info.
	 *
	 * @param categories the categories of this tourism bona operator info
	 */
	@Override
	public void setCategories(String categories) {
		model.setCategories(categories);
	}

	/**
	 * Sets the company ID of this tourism bona operator info.
	 *
	 * @param companyId the company ID of this tourism bona operator info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism bona operator info.
	 *
	 * @param createDate the create date of this tourism bona operator info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the expiration date of this tourism bona operator info.
	 *
	 * @param expirationDate the expiration date of this tourism bona operator info
	 */
	@Override
	public void setExpirationDate(Date expirationDate) {
		model.setExpirationDate(expirationDate);
	}

	/**
	 * Sets the group ID of this tourism bona operator info.
	 *
	 * @param groupId the group ID of this tourism bona operator info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the issue date of this tourism bona operator info.
	 *
	 * @param issueDate the issue date of this tourism bona operator info
	 */
	@Override
	public void setIssueDate(Date issueDate) {
		model.setIssueDate(issueDate);
	}

	/**
	 * Sets the modified date of this tourism bona operator info.
	 *
	 * @param modifiedDate the modified date of this tourism bona operator info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the operator name of this tourism bona operator info.
	 *
	 * @param operatorName the operator name of this tourism bona operator info
	 */
	@Override
	public void setOperatorName(String operatorName) {
		model.setOperatorName(operatorName);
	}

	/**
	 * Sets the operator number of this tourism bona operator info.
	 *
	 * @param operatorNumber the operator number of this tourism bona operator info
	 */
	@Override
	public void setOperatorNumber(String operatorNumber) {
		model.setOperatorNumber(operatorNumber);
	}

	/**
	 * Sets the primary key of this tourism bona operator info.
	 *
	 * @param primaryKey the primary key of this tourism bona operator info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sub categories of this tourism bona operator info.
	 *
	 * @param subCategories the sub categories of this tourism bona operator info
	 */
	@Override
	public void setSubCategories(String subCategories) {
		model.setSubCategories(subCategories);
	}

	/**
	 * Sets the tourism application ID of this tourism bona operator info.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism bona operator info
	 */
	@Override
	public void setTourismApplicationId(Long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism bona operator info ID of this tourism bona operator info.
	 *
	 * @param tourismBonaOperatorInfoId the tourism bona operator info ID of this tourism bona operator info
	 */
	@Override
	public void setTourismBonaOperatorInfoId(long tourismBonaOperatorInfoId) {
		model.setTourismBonaOperatorInfoId(tourismBonaOperatorInfoId);
	}

	/**
	 * Sets the user ID of this tourism bona operator info.
	 *
	 * @param userId the user ID of this tourism bona operator info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism bona operator info.
	 *
	 * @param userName the user name of this tourism bona operator info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism bona operator info.
	 *
	 * @param userUuid the user uuid of this tourism bona operator info
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
	protected TourismBonaOperatorInfoWrapper wrap(
		TourismBonaOperatorInfo tourismBonaOperatorInfo) {

		return new TourismBonaOperatorInfoWrapper(tourismBonaOperatorInfo);
	}

}