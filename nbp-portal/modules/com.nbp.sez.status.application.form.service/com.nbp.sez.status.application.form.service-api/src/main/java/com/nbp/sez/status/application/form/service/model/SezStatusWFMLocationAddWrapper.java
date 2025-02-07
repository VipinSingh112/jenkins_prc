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
 * This class is a wrapper for {@link SezStatusWFMLocationAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusWFMLocationAdd
 * @generated
 */
public class SezStatusWFMLocationAddWrapper
	extends BaseModelWrapper<SezStatusWFMLocationAdd>
	implements ModelWrapper<SezStatusWFMLocationAdd>, SezStatusWFMLocationAdd {

	public SezStatusWFMLocationAddWrapper(
		SezStatusWFMLocationAdd sezStatusWFMLocationAdd) {

		super(sezStatusWFMLocationAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sezStatusWFHLocId", getSezStatusWFHLocId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("controlNumber", getControlNumber());
		attributes.put("location", getLocation());
		attributes.put("parish", getParish());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezStatusWFHLocId = (Long)attributes.get("sezStatusWFHLocId");

		if (sezStatusWFHLocId != null) {
			setSezStatusWFHLocId(sezStatusWFHLocId);
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

		String controlNumber = (String)attributes.get("controlNumber");

		if (controlNumber != null) {
			setControlNumber(controlNumber);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		String parish = (String)attributes.get("parish");

		if (parish != null) {
			setParish(parish);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezStatusWFMLocationAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this sez status wfm location add.
	 *
	 * @return the company ID of this sez status wfm location add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the control number of this sez status wfm location add.
	 *
	 * @return the control number of this sez status wfm location add
	 */
	@Override
	public String getControlNumber() {
		return model.getControlNumber();
	}

	/**
	 * Returns the create date of this sez status wfm location add.
	 *
	 * @return the create date of this sez status wfm location add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this sez status wfm location add.
	 *
	 * @return the group ID of this sez status wfm location add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the location of this sez status wfm location add.
	 *
	 * @return the location of this sez status wfm location add
	 */
	@Override
	public String getLocation() {
		return model.getLocation();
	}

	/**
	 * Returns the modified date of this sez status wfm location add.
	 *
	 * @return the modified date of this sez status wfm location add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the parish of this sez status wfm location add.
	 *
	 * @return the parish of this sez status wfm location add
	 */
	@Override
	public String getParish() {
		return model.getParish();
	}

	/**
	 * Returns the primary key of this sez status wfm location add.
	 *
	 * @return the primary key of this sez status wfm location add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez status application ID of this sez status wfm location add.
	 *
	 * @return the sez status application ID of this sez status wfm location add
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the sez status wfh loc ID of this sez status wfm location add.
	 *
	 * @return the sez status wfh loc ID of this sez status wfm location add
	 */
	@Override
	public long getSezStatusWFHLocId() {
		return model.getSezStatusWFHLocId();
	}

	/**
	 * Returns the user ID of this sez status wfm location add.
	 *
	 * @return the user ID of this sez status wfm location add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez status wfm location add.
	 *
	 * @return the user name of this sez status wfm location add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez status wfm location add.
	 *
	 * @return the user uuid of this sez status wfm location add
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
	 * Sets the company ID of this sez status wfm location add.
	 *
	 * @param companyId the company ID of this sez status wfm location add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the control number of this sez status wfm location add.
	 *
	 * @param controlNumber the control number of this sez status wfm location add
	 */
	@Override
	public void setControlNumber(String controlNumber) {
		model.setControlNumber(controlNumber);
	}

	/**
	 * Sets the create date of this sez status wfm location add.
	 *
	 * @param createDate the create date of this sez status wfm location add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this sez status wfm location add.
	 *
	 * @param groupId the group ID of this sez status wfm location add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the location of this sez status wfm location add.
	 *
	 * @param location the location of this sez status wfm location add
	 */
	@Override
	public void setLocation(String location) {
		model.setLocation(location);
	}

	/**
	 * Sets the modified date of this sez status wfm location add.
	 *
	 * @param modifiedDate the modified date of this sez status wfm location add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the parish of this sez status wfm location add.
	 *
	 * @param parish the parish of this sez status wfm location add
	 */
	@Override
	public void setParish(String parish) {
		model.setParish(parish);
	}

	/**
	 * Sets the primary key of this sez status wfm location add.
	 *
	 * @param primaryKey the primary key of this sez status wfm location add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez status application ID of this sez status wfm location add.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez status wfm location add
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the sez status wfh loc ID of this sez status wfm location add.
	 *
	 * @param sezStatusWFHLocId the sez status wfh loc ID of this sez status wfm location add
	 */
	@Override
	public void setSezStatusWFHLocId(long sezStatusWFHLocId) {
		model.setSezStatusWFHLocId(sezStatusWFHLocId);
	}

	/**
	 * Sets the user ID of this sez status wfm location add.
	 *
	 * @param userId the user ID of this sez status wfm location add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez status wfm location add.
	 *
	 * @param userName the user name of this sez status wfm location add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez status wfm location add.
	 *
	 * @param userUuid the user uuid of this sez status wfm location add
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
	protected SezStatusWFMLocationAddWrapper wrap(
		SezStatusWFMLocationAdd sezStatusWFMLocationAdd) {

		return new SezStatusWFMLocationAddWrapper(sezStatusWFMLocationAdd);
	}

}