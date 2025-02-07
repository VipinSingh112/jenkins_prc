/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AddPhyResourceFirst}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddPhyResourceFirst
 * @generated
 */
public class AddPhyResourceFirstWrapper
	extends BaseModelWrapper<AddPhyResourceFirst>
	implements AddPhyResourceFirst, ModelWrapper<AddPhyResourceFirst> {

	public AddPhyResourceFirstWrapper(AddPhyResourceFirst addPhyResourceFirst) {
		super(addPhyResourceFirst);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("addPhyResourceFirstId", getAddPhyResourceFirstId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("inventoryNumber", getInventoryNumber());
		attributes.put("item", getItem());
		attributes.put("manufacturer", getManufacturer());
		attributes.put("modelNumber", getModelNumber());
		attributes.put("calibrationInterval", getCalibrationInterval());
		attributes.put("calibratedBy", getCalibratedBy());
		attributes.put("janaacApplicationId", getJanaacApplicationId());
		attributes.put("counter", getCounter());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long addPhyResourceFirstId = (Long)attributes.get(
			"addPhyResourceFirstId");

		if (addPhyResourceFirstId != null) {
			setAddPhyResourceFirstId(addPhyResourceFirstId);
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

		String inventoryNumber = (String)attributes.get("inventoryNumber");

		if (inventoryNumber != null) {
			setInventoryNumber(inventoryNumber);
		}

		String item = (String)attributes.get("item");

		if (item != null) {
			setItem(item);
		}

		String manufacturer = (String)attributes.get("manufacturer");

		if (manufacturer != null) {
			setManufacturer(manufacturer);
		}

		String modelNumber = (String)attributes.get("modelNumber");

		if (modelNumber != null) {
			setModelNumber(modelNumber);
		}

		String calibrationInterval = (String)attributes.get(
			"calibrationInterval");

		if (calibrationInterval != null) {
			setCalibrationInterval(calibrationInterval);
		}

		String calibratedBy = (String)attributes.get("calibratedBy");

		if (calibratedBy != null) {
			setCalibratedBy(calibratedBy);
		}

		Long janaacApplicationId = (Long)attributes.get("janaacApplicationId");

		if (janaacApplicationId != null) {
			setJanaacApplicationId(janaacApplicationId);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}
	}

	@Override
	public AddPhyResourceFirst cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the add phy resource first ID of this add phy resource first.
	 *
	 * @return the add phy resource first ID of this add phy resource first
	 */
	@Override
	public long getAddPhyResourceFirstId() {
		return model.getAddPhyResourceFirstId();
	}

	/**
	 * Returns the calibrated by of this add phy resource first.
	 *
	 * @return the calibrated by of this add phy resource first
	 */
	@Override
	public String getCalibratedBy() {
		return model.getCalibratedBy();
	}

	/**
	 * Returns the calibration interval of this add phy resource first.
	 *
	 * @return the calibration interval of this add phy resource first
	 */
	@Override
	public String getCalibrationInterval() {
		return model.getCalibrationInterval();
	}

	/**
	 * Returns the company ID of this add phy resource first.
	 *
	 * @return the company ID of this add phy resource first
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this add phy resource first.
	 *
	 * @return the counter of this add phy resource first
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this add phy resource first.
	 *
	 * @return the create date of this add phy resource first
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this add phy resource first.
	 *
	 * @return the group ID of this add phy resource first
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the inventory number of this add phy resource first.
	 *
	 * @return the inventory number of this add phy resource first
	 */
	@Override
	public String getInventoryNumber() {
		return model.getInventoryNumber();
	}

	/**
	 * Returns the item of this add phy resource first.
	 *
	 * @return the item of this add phy resource first
	 */
	@Override
	public String getItem() {
		return model.getItem();
	}

	/**
	 * Returns the janaac application ID of this add phy resource first.
	 *
	 * @return the janaac application ID of this add phy resource first
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the manufacturer of this add phy resource first.
	 *
	 * @return the manufacturer of this add phy resource first
	 */
	@Override
	public String getManufacturer() {
		return model.getManufacturer();
	}

	/**
	 * Returns the model number of this add phy resource first.
	 *
	 * @return the model number of this add phy resource first
	 */
	@Override
	public String getModelNumber() {
		return model.getModelNumber();
	}

	/**
	 * Returns the modified date of this add phy resource first.
	 *
	 * @return the modified date of this add phy resource first
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this add phy resource first.
	 *
	 * @return the primary key of this add phy resource first
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this add phy resource first.
	 *
	 * @return the user ID of this add phy resource first
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this add phy resource first.
	 *
	 * @return the user name of this add phy resource first
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this add phy resource first.
	 *
	 * @return the user uuid of this add phy resource first
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
	 * Sets the add phy resource first ID of this add phy resource first.
	 *
	 * @param addPhyResourceFirstId the add phy resource first ID of this add phy resource first
	 */
	@Override
	public void setAddPhyResourceFirstId(long addPhyResourceFirstId) {
		model.setAddPhyResourceFirstId(addPhyResourceFirstId);
	}

	/**
	 * Sets the calibrated by of this add phy resource first.
	 *
	 * @param calibratedBy the calibrated by of this add phy resource first
	 */
	@Override
	public void setCalibratedBy(String calibratedBy) {
		model.setCalibratedBy(calibratedBy);
	}

	/**
	 * Sets the calibration interval of this add phy resource first.
	 *
	 * @param calibrationInterval the calibration interval of this add phy resource first
	 */
	@Override
	public void setCalibrationInterval(String calibrationInterval) {
		model.setCalibrationInterval(calibrationInterval);
	}

	/**
	 * Sets the company ID of this add phy resource first.
	 *
	 * @param companyId the company ID of this add phy resource first
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this add phy resource first.
	 *
	 * @param counter the counter of this add phy resource first
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this add phy resource first.
	 *
	 * @param createDate the create date of this add phy resource first
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this add phy resource first.
	 *
	 * @param groupId the group ID of this add phy resource first
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the inventory number of this add phy resource first.
	 *
	 * @param inventoryNumber the inventory number of this add phy resource first
	 */
	@Override
	public void setInventoryNumber(String inventoryNumber) {
		model.setInventoryNumber(inventoryNumber);
	}

	/**
	 * Sets the item of this add phy resource first.
	 *
	 * @param item the item of this add phy resource first
	 */
	@Override
	public void setItem(String item) {
		model.setItem(item);
	}

	/**
	 * Sets the janaac application ID of this add phy resource first.
	 *
	 * @param janaacApplicationId the janaac application ID of this add phy resource first
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the manufacturer of this add phy resource first.
	 *
	 * @param manufacturer the manufacturer of this add phy resource first
	 */
	@Override
	public void setManufacturer(String manufacturer) {
		model.setManufacturer(manufacturer);
	}

	/**
	 * Sets the model number of this add phy resource first.
	 *
	 * @param modelNumber the model number of this add phy resource first
	 */
	@Override
	public void setModelNumber(String modelNumber) {
		model.setModelNumber(modelNumber);
	}

	/**
	 * Sets the modified date of this add phy resource first.
	 *
	 * @param modifiedDate the modified date of this add phy resource first
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this add phy resource first.
	 *
	 * @param primaryKey the primary key of this add phy resource first
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this add phy resource first.
	 *
	 * @param userId the user ID of this add phy resource first
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this add phy resource first.
	 *
	 * @param userName the user name of this add phy resource first
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this add phy resource first.
	 *
	 * @param userUuid the user uuid of this add phy resource first
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
	protected AddPhyResourceFirstWrapper wrap(
		AddPhyResourceFirst addPhyResourceFirst) {

		return new AddPhyResourceFirstWrapper(addPhyResourceFirst);
	}

}