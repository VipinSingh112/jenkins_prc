/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SezDevDisasterManagementAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevDisasterManagementAdd
 * @generated
 */
public class SezDevDisasterManagementAddWrapper
	extends BaseModelWrapper<SezDevDisasterManagementAdd>
	implements ModelWrapper<SezDevDisasterManagementAdd>,
			   SezDevDisasterManagementAdd {

	public SezDevDisasterManagementAddWrapper(
		SezDevDisasterManagementAdd sezDevDisasterManagementAdd) {

		super(sezDevDisasterManagementAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"sezDevDisasterManagementAddId",
			getSezDevDisasterManagementAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("disasterMitigationPlan", getDisasterMitigationPlan());
		attributes.put("counter", getCounter());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezDevDisasterManagementAddId = (Long)attributes.get(
			"sezDevDisasterManagementAddId");

		if (sezDevDisasterManagementAddId != null) {
			setSezDevDisasterManagementAddId(sezDevDisasterManagementAddId);
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

		String disasterMitigationPlan = (String)attributes.get(
			"disasterMitigationPlan");

		if (disasterMitigationPlan != null) {
			setDisasterMitigationPlan(disasterMitigationPlan);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezDevDisasterManagementAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this sez dev disaster management add.
	 *
	 * @return the company ID of this sez dev disaster management add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this sez dev disaster management add.
	 *
	 * @return the counter of this sez dev disaster management add
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this sez dev disaster management add.
	 *
	 * @return the create date of this sez dev disaster management add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the disaster mitigation plan of this sez dev disaster management add.
	 *
	 * @return the disaster mitigation plan of this sez dev disaster management add
	 */
	@Override
	public String getDisasterMitigationPlan() {
		return model.getDisasterMitigationPlan();
	}

	/**
	 * Returns the group ID of this sez dev disaster management add.
	 *
	 * @return the group ID of this sez dev disaster management add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez dev disaster management add.
	 *
	 * @return the modified date of this sez dev disaster management add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this sez dev disaster management add.
	 *
	 * @return the primary key of this sez dev disaster management add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez dev disaster management add ID of this sez dev disaster management add.
	 *
	 * @return the sez dev disaster management add ID of this sez dev disaster management add
	 */
	@Override
	public long getSezDevDisasterManagementAddId() {
		return model.getSezDevDisasterManagementAddId();
	}

	/**
	 * Returns the sez status application ID of this sez dev disaster management add.
	 *
	 * @return the sez status application ID of this sez dev disaster management add
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the user ID of this sez dev disaster management add.
	 *
	 * @return the user ID of this sez dev disaster management add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez dev disaster management add.
	 *
	 * @return the user name of this sez dev disaster management add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez dev disaster management add.
	 *
	 * @return the user uuid of this sez dev disaster management add
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
	 * Sets the company ID of this sez dev disaster management add.
	 *
	 * @param companyId the company ID of this sez dev disaster management add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this sez dev disaster management add.
	 *
	 * @param counter the counter of this sez dev disaster management add
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this sez dev disaster management add.
	 *
	 * @param createDate the create date of this sez dev disaster management add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the disaster mitigation plan of this sez dev disaster management add.
	 *
	 * @param disasterMitigationPlan the disaster mitigation plan of this sez dev disaster management add
	 */
	@Override
	public void setDisasterMitigationPlan(String disasterMitigationPlan) {
		model.setDisasterMitigationPlan(disasterMitigationPlan);
	}

	/**
	 * Sets the group ID of this sez dev disaster management add.
	 *
	 * @param groupId the group ID of this sez dev disaster management add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez dev disaster management add.
	 *
	 * @param modifiedDate the modified date of this sez dev disaster management add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this sez dev disaster management add.
	 *
	 * @param primaryKey the primary key of this sez dev disaster management add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez dev disaster management add ID of this sez dev disaster management add.
	 *
	 * @param sezDevDisasterManagementAddId the sez dev disaster management add ID of this sez dev disaster management add
	 */
	@Override
	public void setSezDevDisasterManagementAddId(
		long sezDevDisasterManagementAddId) {

		model.setSezDevDisasterManagementAddId(sezDevDisasterManagementAddId);
	}

	/**
	 * Sets the sez status application ID of this sez dev disaster management add.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez dev disaster management add
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the user ID of this sez dev disaster management add.
	 *
	 * @param userId the user ID of this sez dev disaster management add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez dev disaster management add.
	 *
	 * @param userName the user name of this sez dev disaster management add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez dev disaster management add.
	 *
	 * @param userUuid the user uuid of this sez dev disaster management add
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
	protected SezDevDisasterManagementAddWrapper wrap(
		SezDevDisasterManagementAdd sezDevDisasterManagementAdd) {

		return new SezDevDisasterManagementAddWrapper(
			sezDevDisasterManagementAdd);
	}

}