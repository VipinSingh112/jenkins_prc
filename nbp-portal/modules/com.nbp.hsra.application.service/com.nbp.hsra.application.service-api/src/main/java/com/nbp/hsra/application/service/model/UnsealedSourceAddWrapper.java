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
 * This class is a wrapper for {@link UnsealedSourceAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UnsealedSourceAdd
 * @generated
 */
public class UnsealedSourceAddWrapper
	extends BaseModelWrapper<UnsealedSourceAdd>
	implements ModelWrapper<UnsealedSourceAdd>, UnsealedSourceAdd {

	public UnsealedSourceAddWrapper(UnsealedSourceAdd unsealedSourceAdd) {
		super(unsealedSourceAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("unsealedSourceAddId", getUnsealedSourceAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("unsealedSourcesRadionu", getUnsealedSourcesRadionu());
		attributes.put("unsealedSourcesActivity", getUnsealedSourcesActivity());
		attributes.put(
			"unsealedSourcesTotalYear", getUnsealedSourcesTotalYear());
		attributes.put("unsealedSourcesUse", getUnsealedSourcesUse());
		attributes.put("counter", getCounter());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long unsealedSourceAddId = (Long)attributes.get("unsealedSourceAddId");

		if (unsealedSourceAddId != null) {
			setUnsealedSourceAddId(unsealedSourceAddId);
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

		String unsealedSourcesRadionu = (String)attributes.get(
			"unsealedSourcesRadionu");

		if (unsealedSourcesRadionu != null) {
			setUnsealedSourcesRadionu(unsealedSourcesRadionu);
		}

		String unsealedSourcesActivity = (String)attributes.get(
			"unsealedSourcesActivity");

		if (unsealedSourcesActivity != null) {
			setUnsealedSourcesActivity(unsealedSourcesActivity);
		}

		String unsealedSourcesTotalYear = (String)attributes.get(
			"unsealedSourcesTotalYear");

		if (unsealedSourcesTotalYear != null) {
			setUnsealedSourcesTotalYear(unsealedSourcesTotalYear);
		}

		String unsealedSourcesUse = (String)attributes.get(
			"unsealedSourcesUse");

		if (unsealedSourcesUse != null) {
			setUnsealedSourcesUse(unsealedSourcesUse);
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
	public UnsealedSourceAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this unsealed source add.
	 *
	 * @return the company ID of this unsealed source add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this unsealed source add.
	 *
	 * @return the counter of this unsealed source add
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this unsealed source add.
	 *
	 * @return the create date of this unsealed source add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this unsealed source add.
	 *
	 * @return the group ID of this unsealed source add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application ID of this unsealed source add.
	 *
	 * @return the hsra application ID of this unsealed source add
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the modified date of this unsealed source add.
	 *
	 * @return the modified date of this unsealed source add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this unsealed source add.
	 *
	 * @return the primary key of this unsealed source add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the unsealed source add ID of this unsealed source add.
	 *
	 * @return the unsealed source add ID of this unsealed source add
	 */
	@Override
	public long getUnsealedSourceAddId() {
		return model.getUnsealedSourceAddId();
	}

	/**
	 * Returns the unsealed sources activity of this unsealed source add.
	 *
	 * @return the unsealed sources activity of this unsealed source add
	 */
	@Override
	public String getUnsealedSourcesActivity() {
		return model.getUnsealedSourcesActivity();
	}

	/**
	 * Returns the unsealed sources radionu of this unsealed source add.
	 *
	 * @return the unsealed sources radionu of this unsealed source add
	 */
	@Override
	public String getUnsealedSourcesRadionu() {
		return model.getUnsealedSourcesRadionu();
	}

	/**
	 * Returns the unsealed sources total year of this unsealed source add.
	 *
	 * @return the unsealed sources total year of this unsealed source add
	 */
	@Override
	public String getUnsealedSourcesTotalYear() {
		return model.getUnsealedSourcesTotalYear();
	}

	/**
	 * Returns the unsealed sources use of this unsealed source add.
	 *
	 * @return the unsealed sources use of this unsealed source add
	 */
	@Override
	public String getUnsealedSourcesUse() {
		return model.getUnsealedSourcesUse();
	}

	/**
	 * Returns the user ID of this unsealed source add.
	 *
	 * @return the user ID of this unsealed source add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this unsealed source add.
	 *
	 * @return the user name of this unsealed source add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this unsealed source add.
	 *
	 * @return the user uuid of this unsealed source add
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
	 * Sets the company ID of this unsealed source add.
	 *
	 * @param companyId the company ID of this unsealed source add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this unsealed source add.
	 *
	 * @param counter the counter of this unsealed source add
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this unsealed source add.
	 *
	 * @param createDate the create date of this unsealed source add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this unsealed source add.
	 *
	 * @param groupId the group ID of this unsealed source add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application ID of this unsealed source add.
	 *
	 * @param hsraApplicationId the hsra application ID of this unsealed source add
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the modified date of this unsealed source add.
	 *
	 * @param modifiedDate the modified date of this unsealed source add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this unsealed source add.
	 *
	 * @param primaryKey the primary key of this unsealed source add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the unsealed source add ID of this unsealed source add.
	 *
	 * @param unsealedSourceAddId the unsealed source add ID of this unsealed source add
	 */
	@Override
	public void setUnsealedSourceAddId(long unsealedSourceAddId) {
		model.setUnsealedSourceAddId(unsealedSourceAddId);
	}

	/**
	 * Sets the unsealed sources activity of this unsealed source add.
	 *
	 * @param unsealedSourcesActivity the unsealed sources activity of this unsealed source add
	 */
	@Override
	public void setUnsealedSourcesActivity(String unsealedSourcesActivity) {
		model.setUnsealedSourcesActivity(unsealedSourcesActivity);
	}

	/**
	 * Sets the unsealed sources radionu of this unsealed source add.
	 *
	 * @param unsealedSourcesRadionu the unsealed sources radionu of this unsealed source add
	 */
	@Override
	public void setUnsealedSourcesRadionu(String unsealedSourcesRadionu) {
		model.setUnsealedSourcesRadionu(unsealedSourcesRadionu);
	}

	/**
	 * Sets the unsealed sources total year of this unsealed source add.
	 *
	 * @param unsealedSourcesTotalYear the unsealed sources total year of this unsealed source add
	 */
	@Override
	public void setUnsealedSourcesTotalYear(String unsealedSourcesTotalYear) {
		model.setUnsealedSourcesTotalYear(unsealedSourcesTotalYear);
	}

	/**
	 * Sets the unsealed sources use of this unsealed source add.
	 *
	 * @param unsealedSourcesUse the unsealed sources use of this unsealed source add
	 */
	@Override
	public void setUnsealedSourcesUse(String unsealedSourcesUse) {
		model.setUnsealedSourcesUse(unsealedSourcesUse);
	}

	/**
	 * Sets the user ID of this unsealed source add.
	 *
	 * @param userId the user ID of this unsealed source add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this unsealed source add.
	 *
	 * @param userName the user name of this unsealed source add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this unsealed source add.
	 *
	 * @param userUuid the user uuid of this unsealed source add
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
	protected UnsealedSourceAddWrapper wrap(
		UnsealedSourceAdd unsealedSourceAdd) {

		return new UnsealedSourceAddWrapper(unsealedSourceAdd);
	}

}