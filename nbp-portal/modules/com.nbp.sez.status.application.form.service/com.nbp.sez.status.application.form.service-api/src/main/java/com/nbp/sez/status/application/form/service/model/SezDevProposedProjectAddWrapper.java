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
 * This class is a wrapper for {@link SezDevProposedProjectAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevProposedProjectAdd
 * @generated
 */
public class SezDevProposedProjectAddWrapper
	extends BaseModelWrapper<SezDevProposedProjectAdd>
	implements ModelWrapper<SezDevProposedProjectAdd>,
			   SezDevProposedProjectAdd {

	public SezDevProposedProjectAddWrapper(
		SezDevProposedProjectAdd sezDevProposedProjectAdd) {

		super(sezDevProposedProjectAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"sezDevProposedProjectAddId", getSezDevProposedProjectAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nameOfZone", getNameOfZone());
		attributes.put("parish", getParish());
		attributes.put("counter", getCounter());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezDevProposedProjectAddId = (Long)attributes.get(
			"sezDevProposedProjectAddId");

		if (sezDevProposedProjectAddId != null) {
			setSezDevProposedProjectAddId(sezDevProposedProjectAddId);
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

		String nameOfZone = (String)attributes.get("nameOfZone");

		if (nameOfZone != null) {
			setNameOfZone(nameOfZone);
		}

		String parish = (String)attributes.get("parish");

		if (parish != null) {
			setParish(parish);
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
	public SezDevProposedProjectAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this sez dev proposed project add.
	 *
	 * @return the company ID of this sez dev proposed project add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this sez dev proposed project add.
	 *
	 * @return the counter of this sez dev proposed project add
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this sez dev proposed project add.
	 *
	 * @return the create date of this sez dev proposed project add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this sez dev proposed project add.
	 *
	 * @return the group ID of this sez dev proposed project add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez dev proposed project add.
	 *
	 * @return the modified date of this sez dev proposed project add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of zone of this sez dev proposed project add.
	 *
	 * @return the name of zone of this sez dev proposed project add
	 */
	@Override
	public String getNameOfZone() {
		return model.getNameOfZone();
	}

	/**
	 * Returns the parish of this sez dev proposed project add.
	 *
	 * @return the parish of this sez dev proposed project add
	 */
	@Override
	public String getParish() {
		return model.getParish();
	}

	/**
	 * Returns the primary key of this sez dev proposed project add.
	 *
	 * @return the primary key of this sez dev proposed project add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez dev proposed project add ID of this sez dev proposed project add.
	 *
	 * @return the sez dev proposed project add ID of this sez dev proposed project add
	 */
	@Override
	public long getSezDevProposedProjectAddId() {
		return model.getSezDevProposedProjectAddId();
	}

	/**
	 * Returns the sez status application ID of this sez dev proposed project add.
	 *
	 * @return the sez status application ID of this sez dev proposed project add
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the user ID of this sez dev proposed project add.
	 *
	 * @return the user ID of this sez dev proposed project add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez dev proposed project add.
	 *
	 * @return the user name of this sez dev proposed project add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez dev proposed project add.
	 *
	 * @return the user uuid of this sez dev proposed project add
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
	 * Sets the company ID of this sez dev proposed project add.
	 *
	 * @param companyId the company ID of this sez dev proposed project add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this sez dev proposed project add.
	 *
	 * @param counter the counter of this sez dev proposed project add
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this sez dev proposed project add.
	 *
	 * @param createDate the create date of this sez dev proposed project add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this sez dev proposed project add.
	 *
	 * @param groupId the group ID of this sez dev proposed project add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez dev proposed project add.
	 *
	 * @param modifiedDate the modified date of this sez dev proposed project add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of zone of this sez dev proposed project add.
	 *
	 * @param nameOfZone the name of zone of this sez dev proposed project add
	 */
	@Override
	public void setNameOfZone(String nameOfZone) {
		model.setNameOfZone(nameOfZone);
	}

	/**
	 * Sets the parish of this sez dev proposed project add.
	 *
	 * @param parish the parish of this sez dev proposed project add
	 */
	@Override
	public void setParish(String parish) {
		model.setParish(parish);
	}

	/**
	 * Sets the primary key of this sez dev proposed project add.
	 *
	 * @param primaryKey the primary key of this sez dev proposed project add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez dev proposed project add ID of this sez dev proposed project add.
	 *
	 * @param sezDevProposedProjectAddId the sez dev proposed project add ID of this sez dev proposed project add
	 */
	@Override
	public void setSezDevProposedProjectAddId(long sezDevProposedProjectAddId) {
		model.setSezDevProposedProjectAddId(sezDevProposedProjectAddId);
	}

	/**
	 * Sets the sez status application ID of this sez dev proposed project add.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez dev proposed project add
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the user ID of this sez dev proposed project add.
	 *
	 * @param userId the user ID of this sez dev proposed project add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez dev proposed project add.
	 *
	 * @param userName the user name of this sez dev proposed project add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez dev proposed project add.
	 *
	 * @param userUuid the user uuid of this sez dev proposed project add
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
	protected SezDevProposedProjectAddWrapper wrap(
		SezDevProposedProjectAdd sezDevProposedProjectAdd) {

		return new SezDevProposedProjectAddWrapper(sezDevProposedProjectAdd);
	}

}