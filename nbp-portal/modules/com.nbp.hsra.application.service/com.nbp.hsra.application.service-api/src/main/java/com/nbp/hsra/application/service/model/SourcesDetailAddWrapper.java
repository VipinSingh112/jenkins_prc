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
 * This class is a wrapper for {@link SourcesDetailAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SourcesDetailAdd
 * @generated
 */
public class SourcesDetailAddWrapper
	extends BaseModelWrapper<SourcesDetailAdd>
	implements ModelWrapper<SourcesDetailAdd>, SourcesDetailAdd {

	public SourcesDetailAddWrapper(SourcesDetailAdd sourcesDetailAdd) {
		super(sourcesDetailAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sourcesDetailAddId", getSourcesDetailAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("sourceIdentification", getSourceIdentification());
		attributes.put("stateActivity", getStateActivity());
		attributes.put("counter", getCounter());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sourcesDetailAddId = (Long)attributes.get("sourcesDetailAddId");

		if (sourcesDetailAddId != null) {
			setSourcesDetailAddId(sourcesDetailAddId);
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

		String stateActivity = (String)attributes.get("stateActivity");

		if (stateActivity != null) {
			setStateActivity(stateActivity);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long hsraApplicationId = (Long)attributes.get("hsraApplicationId");

		if (hsraApplicationId != null) {
			setHsraApplicationId(hsraApplicationId);
		}
	}

	@Override
	public SourcesDetailAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this sources detail add.
	 *
	 * @return the company ID of this sources detail add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this sources detail add.
	 *
	 * @return the counter of this sources detail add
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this sources detail add.
	 *
	 * @return the create date of this sources detail add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this sources detail add.
	 *
	 * @return the group ID of this sources detail add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application ID of this sources detail add.
	 *
	 * @return the hsra application ID of this sources detail add
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the modified date of this sources detail add.
	 *
	 * @return the modified date of this sources detail add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this sources detail add.
	 *
	 * @return the primary key of this sources detail add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the source identification of this sources detail add.
	 *
	 * @return the source identification of this sources detail add
	 */
	@Override
	public String getSourceIdentification() {
		return model.getSourceIdentification();
	}

	/**
	 * Returns the sources detail add ID of this sources detail add.
	 *
	 * @return the sources detail add ID of this sources detail add
	 */
	@Override
	public long getSourcesDetailAddId() {
		return model.getSourcesDetailAddId();
	}

	/**
	 * Returns the state activity of this sources detail add.
	 *
	 * @return the state activity of this sources detail add
	 */
	@Override
	public String getStateActivity() {
		return model.getStateActivity();
	}

	/**
	 * Returns the user ID of this sources detail add.
	 *
	 * @return the user ID of this sources detail add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sources detail add.
	 *
	 * @return the user name of this sources detail add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sources detail add.
	 *
	 * @return the user uuid of this sources detail add
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
	 * Sets the company ID of this sources detail add.
	 *
	 * @param companyId the company ID of this sources detail add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this sources detail add.
	 *
	 * @param counter the counter of this sources detail add
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this sources detail add.
	 *
	 * @param createDate the create date of this sources detail add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this sources detail add.
	 *
	 * @param groupId the group ID of this sources detail add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application ID of this sources detail add.
	 *
	 * @param hsraApplicationId the hsra application ID of this sources detail add
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the modified date of this sources detail add.
	 *
	 * @param modifiedDate the modified date of this sources detail add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this sources detail add.
	 *
	 * @param primaryKey the primary key of this sources detail add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the source identification of this sources detail add.
	 *
	 * @param sourceIdentification the source identification of this sources detail add
	 */
	@Override
	public void setSourceIdentification(String sourceIdentification) {
		model.setSourceIdentification(sourceIdentification);
	}

	/**
	 * Sets the sources detail add ID of this sources detail add.
	 *
	 * @param sourcesDetailAddId the sources detail add ID of this sources detail add
	 */
	@Override
	public void setSourcesDetailAddId(long sourcesDetailAddId) {
		model.setSourcesDetailAddId(sourcesDetailAddId);
	}

	/**
	 * Sets the state activity of this sources detail add.
	 *
	 * @param stateActivity the state activity of this sources detail add
	 */
	@Override
	public void setStateActivity(String stateActivity) {
		model.setStateActivity(stateActivity);
	}

	/**
	 * Sets the user ID of this sources detail add.
	 *
	 * @param userId the user ID of this sources detail add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sources detail add.
	 *
	 * @param userName the user name of this sources detail add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sources detail add.
	 *
	 * @param userUuid the user uuid of this sources detail add
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
	protected SourcesDetailAddWrapper wrap(SourcesDetailAdd sourcesDetailAdd) {
		return new SourcesDetailAddWrapper(sourcesDetailAdd);
	}

}