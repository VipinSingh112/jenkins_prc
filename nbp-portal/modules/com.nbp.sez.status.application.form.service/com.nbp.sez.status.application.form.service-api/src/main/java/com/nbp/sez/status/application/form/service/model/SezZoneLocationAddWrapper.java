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
 * This class is a wrapper for {@link SezZoneLocationAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneLocationAdd
 * @generated
 */
public class SezZoneLocationAddWrapper
	extends BaseModelWrapper<SezZoneLocationAdd>
	implements ModelWrapper<SezZoneLocationAdd>, SezZoneLocationAdd {

	public SezZoneLocationAddWrapper(SezZoneLocationAdd sezZoneLocationAdd) {
		super(sezZoneLocationAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sezZoneLocationAddId", getSezZoneLocationAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("developerLocation", getDeveloperLocation());
		attributes.put(
			"developerLocationDescription", getDeveloperLocationDescription());
		attributes.put("counter", getCounter());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezZoneLocationAddId = (Long)attributes.get(
			"sezZoneLocationAddId");

		if (sezZoneLocationAddId != null) {
			setSezZoneLocationAddId(sezZoneLocationAddId);
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

		String developerLocation = (String)attributes.get("developerLocation");

		if (developerLocation != null) {
			setDeveloperLocation(developerLocation);
		}

		String developerLocationDescription = (String)attributes.get(
			"developerLocationDescription");

		if (developerLocationDescription != null) {
			setDeveloperLocationDescription(developerLocationDescription);
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
	public SezZoneLocationAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this sez zone location add.
	 *
	 * @return the company ID of this sez zone location add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this sez zone location add.
	 *
	 * @return the counter of this sez zone location add
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this sez zone location add.
	 *
	 * @return the create date of this sez zone location add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the developer location of this sez zone location add.
	 *
	 * @return the developer location of this sez zone location add
	 */
	@Override
	public String getDeveloperLocation() {
		return model.getDeveloperLocation();
	}

	/**
	 * Returns the developer location description of this sez zone location add.
	 *
	 * @return the developer location description of this sez zone location add
	 */
	@Override
	public String getDeveloperLocationDescription() {
		return model.getDeveloperLocationDescription();
	}

	/**
	 * Returns the group ID of this sez zone location add.
	 *
	 * @return the group ID of this sez zone location add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez zone location add.
	 *
	 * @return the modified date of this sez zone location add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this sez zone location add.
	 *
	 * @return the primary key of this sez zone location add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez status application ID of this sez zone location add.
	 *
	 * @return the sez status application ID of this sez zone location add
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the sez zone location add ID of this sez zone location add.
	 *
	 * @return the sez zone location add ID of this sez zone location add
	 */
	@Override
	public long getSezZoneLocationAddId() {
		return model.getSezZoneLocationAddId();
	}

	/**
	 * Returns the user ID of this sez zone location add.
	 *
	 * @return the user ID of this sez zone location add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez zone location add.
	 *
	 * @return the user name of this sez zone location add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez zone location add.
	 *
	 * @return the user uuid of this sez zone location add
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
	 * Sets the company ID of this sez zone location add.
	 *
	 * @param companyId the company ID of this sez zone location add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this sez zone location add.
	 *
	 * @param counter the counter of this sez zone location add
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this sez zone location add.
	 *
	 * @param createDate the create date of this sez zone location add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the developer location of this sez zone location add.
	 *
	 * @param developerLocation the developer location of this sez zone location add
	 */
	@Override
	public void setDeveloperLocation(String developerLocation) {
		model.setDeveloperLocation(developerLocation);
	}

	/**
	 * Sets the developer location description of this sez zone location add.
	 *
	 * @param developerLocationDescription the developer location description of this sez zone location add
	 */
	@Override
	public void setDeveloperLocationDescription(
		String developerLocationDescription) {

		model.setDeveloperLocationDescription(developerLocationDescription);
	}

	/**
	 * Sets the group ID of this sez zone location add.
	 *
	 * @param groupId the group ID of this sez zone location add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez zone location add.
	 *
	 * @param modifiedDate the modified date of this sez zone location add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this sez zone location add.
	 *
	 * @param primaryKey the primary key of this sez zone location add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez status application ID of this sez zone location add.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez zone location add
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the sez zone location add ID of this sez zone location add.
	 *
	 * @param sezZoneLocationAddId the sez zone location add ID of this sez zone location add
	 */
	@Override
	public void setSezZoneLocationAddId(long sezZoneLocationAddId) {
		model.setSezZoneLocationAddId(sezZoneLocationAddId);
	}

	/**
	 * Sets the user ID of this sez zone location add.
	 *
	 * @param userId the user ID of this sez zone location add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez zone location add.
	 *
	 * @param userName the user name of this sez zone location add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez zone location add.
	 *
	 * @param userUuid the user uuid of this sez zone location add
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
	protected SezZoneLocationAddWrapper wrap(
		SezZoneLocationAdd sezZoneLocationAdd) {

		return new SezZoneLocationAddWrapper(sezZoneLocationAdd);
	}

}