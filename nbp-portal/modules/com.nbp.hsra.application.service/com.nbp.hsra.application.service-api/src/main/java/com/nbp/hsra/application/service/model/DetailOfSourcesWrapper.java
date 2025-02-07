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
 * This class is a wrapper for {@link DetailOfSources}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfSources
 * @generated
 */
public class DetailOfSourcesWrapper
	extends BaseModelWrapper<DetailOfSources>
	implements DetailOfSources, ModelWrapper<DetailOfSources> {

	public DetailOfSourcesWrapper(DetailOfSources detailOfSources) {
		super(detailOfSources);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("detailOfSourcesId", getDetailOfSourcesId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("sourceIdentification", getSourceIdentification());
		attributes.put("sourceLocation", getSourceLocation());
		attributes.put("stateActivity", getStateActivity());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long detailOfSourcesId = (Long)attributes.get("detailOfSourcesId");

		if (detailOfSourcesId != null) {
			setDetailOfSourcesId(detailOfSourcesId);
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

		String sourceIdentification = (String)attributes.get(
			"sourceIdentification");

		if (sourceIdentification != null) {
			setSourceIdentification(sourceIdentification);
		}

		String sourceLocation = (String)attributes.get("sourceLocation");

		if (sourceLocation != null) {
			setSourceLocation(sourceLocation);
		}

		String stateActivity = (String)attributes.get("stateActivity");

		if (stateActivity != null) {
			setStateActivity(stateActivity);
		}

		Long hsraApplicationId = (Long)attributes.get("hsraApplicationId");

		if (hsraApplicationId != null) {
			setHsraApplicationId(hsraApplicationId);
		}
	}

	@Override
	public DetailOfSources cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this detail of sources.
	 *
	 * @return the company ID of this detail of sources
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this detail of sources.
	 *
	 * @return the create date of this detail of sources
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the detail of sources ID of this detail of sources.
	 *
	 * @return the detail of sources ID of this detail of sources
	 */
	@Override
	public long getDetailOfSourcesId() {
		return model.getDetailOfSourcesId();
	}

	/**
	 * Returns the group ID of this detail of sources.
	 *
	 * @return the group ID of this detail of sources
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application ID of this detail of sources.
	 *
	 * @return the hsra application ID of this detail of sources
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the modified date of this detail of sources.
	 *
	 * @return the modified date of this detail of sources
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this detail of sources.
	 *
	 * @return the primary key of this detail of sources
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the source identification of this detail of sources.
	 *
	 * @return the source identification of this detail of sources
	 */
	@Override
	public String getSourceIdentification() {
		return model.getSourceIdentification();
	}

	/**
	 * Returns the source location of this detail of sources.
	 *
	 * @return the source location of this detail of sources
	 */
	@Override
	public String getSourceLocation() {
		return model.getSourceLocation();
	}

	/**
	 * Returns the state activity of this detail of sources.
	 *
	 * @return the state activity of this detail of sources
	 */
	@Override
	public String getStateActivity() {
		return model.getStateActivity();
	}

	/**
	 * Returns the user ID of this detail of sources.
	 *
	 * @return the user ID of this detail of sources
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this detail of sources.
	 *
	 * @return the user name of this detail of sources
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this detail of sources.
	 *
	 * @return the user uuid of this detail of sources
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
	 * Sets the company ID of this detail of sources.
	 *
	 * @param companyId the company ID of this detail of sources
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this detail of sources.
	 *
	 * @param createDate the create date of this detail of sources
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the detail of sources ID of this detail of sources.
	 *
	 * @param detailOfSourcesId the detail of sources ID of this detail of sources
	 */
	@Override
	public void setDetailOfSourcesId(long detailOfSourcesId) {
		model.setDetailOfSourcesId(detailOfSourcesId);
	}

	/**
	 * Sets the group ID of this detail of sources.
	 *
	 * @param groupId the group ID of this detail of sources
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application ID of this detail of sources.
	 *
	 * @param hsraApplicationId the hsra application ID of this detail of sources
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the modified date of this detail of sources.
	 *
	 * @param modifiedDate the modified date of this detail of sources
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this detail of sources.
	 *
	 * @param primaryKey the primary key of this detail of sources
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the source identification of this detail of sources.
	 *
	 * @param sourceIdentification the source identification of this detail of sources
	 */
	@Override
	public void setSourceIdentification(String sourceIdentification) {
		model.setSourceIdentification(sourceIdentification);
	}

	/**
	 * Sets the source location of this detail of sources.
	 *
	 * @param sourceLocation the source location of this detail of sources
	 */
	@Override
	public void setSourceLocation(String sourceLocation) {
		model.setSourceLocation(sourceLocation);
	}

	/**
	 * Sets the state activity of this detail of sources.
	 *
	 * @param stateActivity the state activity of this detail of sources
	 */
	@Override
	public void setStateActivity(String stateActivity) {
		model.setStateActivity(stateActivity);
	}

	/**
	 * Sets the user ID of this detail of sources.
	 *
	 * @param userId the user ID of this detail of sources
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this detail of sources.
	 *
	 * @param userName the user name of this detail of sources
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this detail of sources.
	 *
	 * @param userUuid the user uuid of this detail of sources
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
	protected DetailOfSourcesWrapper wrap(DetailOfSources detailOfSources) {
		return new DetailOfSourcesWrapper(detailOfSources);
	}

}