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
 * This class is a wrapper for {@link SealedSourcesAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SealedSourcesAdd
 * @generated
 */
public class SealedSourcesAddWrapper
	extends BaseModelWrapper<SealedSourcesAdd>
	implements ModelWrapper<SealedSourcesAdd>, SealedSourcesAdd {

	public SealedSourcesAddWrapper(SealedSourcesAdd sealedSourcesAdd) {
		super(sealedSourcesAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sealedSourcesAddId", getSealedSourcesAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("sealedSourcesRadionu", getSealedSourcesRadionu());
		attributes.put(
			"sealedSourcesMaxActivity", getSealedSourcesMaxActivity());
		attributes.put(
			"sealedSourcesActivityDate", getSealedSourcesActivityDate());
		attributes.put("sealedSourcesCategories", getSealedSourcesCategories());
		attributes.put("sealedSourcesUse", getSealedSourcesUse());
		attributes.put("counter", getCounter());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sealedSourcesAddId = (Long)attributes.get("sealedSourcesAddId");

		if (sealedSourcesAddId != null) {
			setSealedSourcesAddId(sealedSourcesAddId);
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

		String sealedSourcesRadionu = (String)attributes.get(
			"sealedSourcesRadionu");

		if (sealedSourcesRadionu != null) {
			setSealedSourcesRadionu(sealedSourcesRadionu);
		}

		String sealedSourcesMaxActivity = (String)attributes.get(
			"sealedSourcesMaxActivity");

		if (sealedSourcesMaxActivity != null) {
			setSealedSourcesMaxActivity(sealedSourcesMaxActivity);
		}

		Date sealedSourcesActivityDate = (Date)attributes.get(
			"sealedSourcesActivityDate");

		if (sealedSourcesActivityDate != null) {
			setSealedSourcesActivityDate(sealedSourcesActivityDate);
		}

		String sealedSourcesCategories = (String)attributes.get(
			"sealedSourcesCategories");

		if (sealedSourcesCategories != null) {
			setSealedSourcesCategories(sealedSourcesCategories);
		}

		String sealedSourcesUse = (String)attributes.get("sealedSourcesUse");

		if (sealedSourcesUse != null) {
			setSealedSourcesUse(sealedSourcesUse);
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
	public SealedSourcesAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this sealed sources add.
	 *
	 * @return the company ID of this sealed sources add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this sealed sources add.
	 *
	 * @return the counter of this sealed sources add
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this sealed sources add.
	 *
	 * @return the create date of this sealed sources add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this sealed sources add.
	 *
	 * @return the group ID of this sealed sources add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application ID of this sealed sources add.
	 *
	 * @return the hsra application ID of this sealed sources add
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the modified date of this sealed sources add.
	 *
	 * @return the modified date of this sealed sources add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this sealed sources add.
	 *
	 * @return the primary key of this sealed sources add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sealed sources activity date of this sealed sources add.
	 *
	 * @return the sealed sources activity date of this sealed sources add
	 */
	@Override
	public Date getSealedSourcesActivityDate() {
		return model.getSealedSourcesActivityDate();
	}

	/**
	 * Returns the sealed sources add ID of this sealed sources add.
	 *
	 * @return the sealed sources add ID of this sealed sources add
	 */
	@Override
	public long getSealedSourcesAddId() {
		return model.getSealedSourcesAddId();
	}

	/**
	 * Returns the sealed sources categories of this sealed sources add.
	 *
	 * @return the sealed sources categories of this sealed sources add
	 */
	@Override
	public String getSealedSourcesCategories() {
		return model.getSealedSourcesCategories();
	}

	/**
	 * Returns the sealed sources max activity of this sealed sources add.
	 *
	 * @return the sealed sources max activity of this sealed sources add
	 */
	@Override
	public String getSealedSourcesMaxActivity() {
		return model.getSealedSourcesMaxActivity();
	}

	/**
	 * Returns the sealed sources radionu of this sealed sources add.
	 *
	 * @return the sealed sources radionu of this sealed sources add
	 */
	@Override
	public String getSealedSourcesRadionu() {
		return model.getSealedSourcesRadionu();
	}

	/**
	 * Returns the sealed sources use of this sealed sources add.
	 *
	 * @return the sealed sources use of this sealed sources add
	 */
	@Override
	public String getSealedSourcesUse() {
		return model.getSealedSourcesUse();
	}

	/**
	 * Returns the user ID of this sealed sources add.
	 *
	 * @return the user ID of this sealed sources add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sealed sources add.
	 *
	 * @return the user name of this sealed sources add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sealed sources add.
	 *
	 * @return the user uuid of this sealed sources add
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
	 * Sets the company ID of this sealed sources add.
	 *
	 * @param companyId the company ID of this sealed sources add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this sealed sources add.
	 *
	 * @param counter the counter of this sealed sources add
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this sealed sources add.
	 *
	 * @param createDate the create date of this sealed sources add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this sealed sources add.
	 *
	 * @param groupId the group ID of this sealed sources add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application ID of this sealed sources add.
	 *
	 * @param hsraApplicationId the hsra application ID of this sealed sources add
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the modified date of this sealed sources add.
	 *
	 * @param modifiedDate the modified date of this sealed sources add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this sealed sources add.
	 *
	 * @param primaryKey the primary key of this sealed sources add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sealed sources activity date of this sealed sources add.
	 *
	 * @param sealedSourcesActivityDate the sealed sources activity date of this sealed sources add
	 */
	@Override
	public void setSealedSourcesActivityDate(Date sealedSourcesActivityDate) {
		model.setSealedSourcesActivityDate(sealedSourcesActivityDate);
	}

	/**
	 * Sets the sealed sources add ID of this sealed sources add.
	 *
	 * @param sealedSourcesAddId the sealed sources add ID of this sealed sources add
	 */
	@Override
	public void setSealedSourcesAddId(long sealedSourcesAddId) {
		model.setSealedSourcesAddId(sealedSourcesAddId);
	}

	/**
	 * Sets the sealed sources categories of this sealed sources add.
	 *
	 * @param sealedSourcesCategories the sealed sources categories of this sealed sources add
	 */
	@Override
	public void setSealedSourcesCategories(String sealedSourcesCategories) {
		model.setSealedSourcesCategories(sealedSourcesCategories);
	}

	/**
	 * Sets the sealed sources max activity of this sealed sources add.
	 *
	 * @param sealedSourcesMaxActivity the sealed sources max activity of this sealed sources add
	 */
	@Override
	public void setSealedSourcesMaxActivity(String sealedSourcesMaxActivity) {
		model.setSealedSourcesMaxActivity(sealedSourcesMaxActivity);
	}

	/**
	 * Sets the sealed sources radionu of this sealed sources add.
	 *
	 * @param sealedSourcesRadionu the sealed sources radionu of this sealed sources add
	 */
	@Override
	public void setSealedSourcesRadionu(String sealedSourcesRadionu) {
		model.setSealedSourcesRadionu(sealedSourcesRadionu);
	}

	/**
	 * Sets the sealed sources use of this sealed sources add.
	 *
	 * @param sealedSourcesUse the sealed sources use of this sealed sources add
	 */
	@Override
	public void setSealedSourcesUse(String sealedSourcesUse) {
		model.setSealedSourcesUse(sealedSourcesUse);
	}

	/**
	 * Sets the user ID of this sealed sources add.
	 *
	 * @param userId the user ID of this sealed sources add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sealed sources add.
	 *
	 * @param userName the user name of this sealed sources add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sealed sources add.
	 *
	 * @param userUuid the user uuid of this sealed sources add
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
	protected SealedSourcesAddWrapper wrap(SealedSourcesAdd sealedSourcesAdd) {
		return new SealedSourcesAddWrapper(sealedSourcesAdd);
	}

}