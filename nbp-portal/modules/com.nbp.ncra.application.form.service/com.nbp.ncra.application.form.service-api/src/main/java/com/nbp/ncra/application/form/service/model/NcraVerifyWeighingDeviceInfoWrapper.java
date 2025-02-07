/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link NcraVerifyWeighingDeviceInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcraVerifyWeighingDeviceInfo
 * @generated
 */
public class NcraVerifyWeighingDeviceInfoWrapper
	extends BaseModelWrapper<NcraVerifyWeighingDeviceInfo>
	implements ModelWrapper<NcraVerifyWeighingDeviceInfo>,
			   NcraVerifyWeighingDeviceInfo {

	public NcraVerifyWeighingDeviceInfoWrapper(
		NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo) {

		super(ncraVerifyWeighingDeviceInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"ncraVerifyWeighingDeviceInfoId",
			getNcraVerifyWeighingDeviceInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("typeofDevice", getTypeofDevice());
		attributes.put("manufacturer", getManufacturer());
		attributes.put("serialNumber", getSerialNumber());
		attributes.put("quantity", getQuantity());
		attributes.put("maximumCapacity", getMaximumCapacity());
		attributes.put("counter", getCounter());
		attributes.put("ncraApplicationId", getNcraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ncraVerifyWeighingDeviceInfoId = (Long)attributes.get(
			"ncraVerifyWeighingDeviceInfoId");

		if (ncraVerifyWeighingDeviceInfoId != null) {
			setNcraVerifyWeighingDeviceInfoId(ncraVerifyWeighingDeviceInfoId);
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

		String typeofDevice = (String)attributes.get("typeofDevice");

		if (typeofDevice != null) {
			setTypeofDevice(typeofDevice);
		}

		String manufacturer = (String)attributes.get("manufacturer");

		if (manufacturer != null) {
			setManufacturer(manufacturer);
		}

		String serialNumber = (String)attributes.get("serialNumber");

		if (serialNumber != null) {
			setSerialNumber(serialNumber);
		}

		String quantity = (String)attributes.get("quantity");

		if (quantity != null) {
			setQuantity(quantity);
		}

		String maximumCapacity = (String)attributes.get("maximumCapacity");

		if (maximumCapacity != null) {
			setMaximumCapacity(maximumCapacity);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long ncraApplicationId = (Long)attributes.get("ncraApplicationId");

		if (ncraApplicationId != null) {
			setNcraApplicationId(ncraApplicationId);
		}
	}

	@Override
	public NcraVerifyWeighingDeviceInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this ncra verify weighing device info.
	 *
	 * @return the company ID of this ncra verify weighing device info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this ncra verify weighing device info.
	 *
	 * @return the counter of this ncra verify weighing device info
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this ncra verify weighing device info.
	 *
	 * @return the create date of this ncra verify weighing device info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this ncra verify weighing device info.
	 *
	 * @return the group ID of this ncra verify weighing device info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the manufacturer of this ncra verify weighing device info.
	 *
	 * @return the manufacturer of this ncra verify weighing device info
	 */
	@Override
	public String getManufacturer() {
		return model.getManufacturer();
	}

	/**
	 * Returns the maximum capacity of this ncra verify weighing device info.
	 *
	 * @return the maximum capacity of this ncra verify weighing device info
	 */
	@Override
	public String getMaximumCapacity() {
		return model.getMaximumCapacity();
	}

	/**
	 * Returns the modified date of this ncra verify weighing device info.
	 *
	 * @return the modified date of this ncra verify weighing device info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ncra application ID of this ncra verify weighing device info.
	 *
	 * @return the ncra application ID of this ncra verify weighing device info
	 */
	@Override
	public long getNcraApplicationId() {
		return model.getNcraApplicationId();
	}

	/**
	 * Returns the ncra verify weighing device info ID of this ncra verify weighing device info.
	 *
	 * @return the ncra verify weighing device info ID of this ncra verify weighing device info
	 */
	@Override
	public long getNcraVerifyWeighingDeviceInfoId() {
		return model.getNcraVerifyWeighingDeviceInfoId();
	}

	/**
	 * Returns the primary key of this ncra verify weighing device info.
	 *
	 * @return the primary key of this ncra verify weighing device info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the quantity of this ncra verify weighing device info.
	 *
	 * @return the quantity of this ncra verify weighing device info
	 */
	@Override
	public String getQuantity() {
		return model.getQuantity();
	}

	/**
	 * Returns the serial number of this ncra verify weighing device info.
	 *
	 * @return the serial number of this ncra verify weighing device info
	 */
	@Override
	public String getSerialNumber() {
		return model.getSerialNumber();
	}

	/**
	 * Returns the typeof device of this ncra verify weighing device info.
	 *
	 * @return the typeof device of this ncra verify weighing device info
	 */
	@Override
	public String getTypeofDevice() {
		return model.getTypeofDevice();
	}

	/**
	 * Returns the user ID of this ncra verify weighing device info.
	 *
	 * @return the user ID of this ncra verify weighing device info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ncra verify weighing device info.
	 *
	 * @return the user name of this ncra verify weighing device info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ncra verify weighing device info.
	 *
	 * @return the user uuid of this ncra verify weighing device info
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
	 * Sets the company ID of this ncra verify weighing device info.
	 *
	 * @param companyId the company ID of this ncra verify weighing device info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this ncra verify weighing device info.
	 *
	 * @param counter the counter of this ncra verify weighing device info
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this ncra verify weighing device info.
	 *
	 * @param createDate the create date of this ncra verify weighing device info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this ncra verify weighing device info.
	 *
	 * @param groupId the group ID of this ncra verify weighing device info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the manufacturer of this ncra verify weighing device info.
	 *
	 * @param manufacturer the manufacturer of this ncra verify weighing device info
	 */
	@Override
	public void setManufacturer(String manufacturer) {
		model.setManufacturer(manufacturer);
	}

	/**
	 * Sets the maximum capacity of this ncra verify weighing device info.
	 *
	 * @param maximumCapacity the maximum capacity of this ncra verify weighing device info
	 */
	@Override
	public void setMaximumCapacity(String maximumCapacity) {
		model.setMaximumCapacity(maximumCapacity);
	}

	/**
	 * Sets the modified date of this ncra verify weighing device info.
	 *
	 * @param modifiedDate the modified date of this ncra verify weighing device info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ncra application ID of this ncra verify weighing device info.
	 *
	 * @param ncraApplicationId the ncra application ID of this ncra verify weighing device info
	 */
	@Override
	public void setNcraApplicationId(long ncraApplicationId) {
		model.setNcraApplicationId(ncraApplicationId);
	}

	/**
	 * Sets the ncra verify weighing device info ID of this ncra verify weighing device info.
	 *
	 * @param ncraVerifyWeighingDeviceInfoId the ncra verify weighing device info ID of this ncra verify weighing device info
	 */
	@Override
	public void setNcraVerifyWeighingDeviceInfoId(
		long ncraVerifyWeighingDeviceInfoId) {

		model.setNcraVerifyWeighingDeviceInfoId(ncraVerifyWeighingDeviceInfoId);
	}

	/**
	 * Sets the primary key of this ncra verify weighing device info.
	 *
	 * @param primaryKey the primary key of this ncra verify weighing device info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the quantity of this ncra verify weighing device info.
	 *
	 * @param quantity the quantity of this ncra verify weighing device info
	 */
	@Override
	public void setQuantity(String quantity) {
		model.setQuantity(quantity);
	}

	/**
	 * Sets the serial number of this ncra verify weighing device info.
	 *
	 * @param serialNumber the serial number of this ncra verify weighing device info
	 */
	@Override
	public void setSerialNumber(String serialNumber) {
		model.setSerialNumber(serialNumber);
	}

	/**
	 * Sets the typeof device of this ncra verify weighing device info.
	 *
	 * @param typeofDevice the typeof device of this ncra verify weighing device info
	 */
	@Override
	public void setTypeofDevice(String typeofDevice) {
		model.setTypeofDevice(typeofDevice);
	}

	/**
	 * Sets the user ID of this ncra verify weighing device info.
	 *
	 * @param userId the user ID of this ncra verify weighing device info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ncra verify weighing device info.
	 *
	 * @param userName the user name of this ncra verify weighing device info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ncra verify weighing device info.
	 *
	 * @param userUuid the user uuid of this ncra verify weighing device info
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
	protected NcraVerifyWeighingDeviceInfoWrapper wrap(
		NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo) {

		return new NcraVerifyWeighingDeviceInfoWrapper(
			ncraVerifyWeighingDeviceInfo);
	}

}