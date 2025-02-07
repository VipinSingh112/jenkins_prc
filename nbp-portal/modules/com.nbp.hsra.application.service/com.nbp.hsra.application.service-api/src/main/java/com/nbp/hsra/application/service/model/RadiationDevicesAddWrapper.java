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
 * This class is a wrapper for {@link RadiationDevicesAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RadiationDevicesAdd
 * @generated
 */
public class RadiationDevicesAddWrapper
	extends BaseModelWrapper<RadiationDevicesAdd>
	implements ModelWrapper<RadiationDevicesAdd>, RadiationDevicesAdd {

	public RadiationDevicesAddWrapper(RadiationDevicesAdd radiationDevicesAdd) {
		super(radiationDevicesAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("radiationDevicesAddId", getRadiationDevicesAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("radiationDevicesRadio", getRadiationDevicesRadio());
		attributes.put(
			"radiationDevicesMaxActivity", getRadiationDevicesMaxActivity());
		attributes.put(
			"radiationDevicesManufacturer", getRadiationDevicesManufacturer());
		attributes.put("radiationDevicesName", getRadiationDevicesName());
		attributes.put("radiationDevicesModelNo", getRadiationDevicesModelNo());
		attributes.put("radiationDevicesNumber", getRadiationDevicesNumber());
		attributes.put("radiationDevicesUse", getRadiationDevicesUse());
		attributes.put("counter", getCounter());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long radiationDevicesAddId = (Long)attributes.get(
			"radiationDevicesAddId");

		if (radiationDevicesAddId != null) {
			setRadiationDevicesAddId(radiationDevicesAddId);
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

		String radiationDevicesRadio = (String)attributes.get(
			"radiationDevicesRadio");

		if (radiationDevicesRadio != null) {
			setRadiationDevicesRadio(radiationDevicesRadio);
		}

		String radiationDevicesMaxActivity = (String)attributes.get(
			"radiationDevicesMaxActivity");

		if (radiationDevicesMaxActivity != null) {
			setRadiationDevicesMaxActivity(radiationDevicesMaxActivity);
		}

		String radiationDevicesManufacturer = (String)attributes.get(
			"radiationDevicesManufacturer");

		if (radiationDevicesManufacturer != null) {
			setRadiationDevicesManufacturer(radiationDevicesManufacturer);
		}

		String radiationDevicesName = (String)attributes.get(
			"radiationDevicesName");

		if (radiationDevicesName != null) {
			setRadiationDevicesName(radiationDevicesName);
		}

		String radiationDevicesModelNo = (String)attributes.get(
			"radiationDevicesModelNo");

		if (radiationDevicesModelNo != null) {
			setRadiationDevicesModelNo(radiationDevicesModelNo);
		}

		String radiationDevicesNumber = (String)attributes.get(
			"radiationDevicesNumber");

		if (radiationDevicesNumber != null) {
			setRadiationDevicesNumber(radiationDevicesNumber);
		}

		String radiationDevicesUse = (String)attributes.get(
			"radiationDevicesUse");

		if (radiationDevicesUse != null) {
			setRadiationDevicesUse(radiationDevicesUse);
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
	public RadiationDevicesAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this radiation devices add.
	 *
	 * @return the company ID of this radiation devices add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this radiation devices add.
	 *
	 * @return the counter of this radiation devices add
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this radiation devices add.
	 *
	 * @return the create date of this radiation devices add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this radiation devices add.
	 *
	 * @return the group ID of this radiation devices add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application ID of this radiation devices add.
	 *
	 * @return the hsra application ID of this radiation devices add
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the modified date of this radiation devices add.
	 *
	 * @return the modified date of this radiation devices add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this radiation devices add.
	 *
	 * @return the primary key of this radiation devices add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the radiation devices add ID of this radiation devices add.
	 *
	 * @return the radiation devices add ID of this radiation devices add
	 */
	@Override
	public long getRadiationDevicesAddId() {
		return model.getRadiationDevicesAddId();
	}

	/**
	 * Returns the radiation devices manufacturer of this radiation devices add.
	 *
	 * @return the radiation devices manufacturer of this radiation devices add
	 */
	@Override
	public String getRadiationDevicesManufacturer() {
		return model.getRadiationDevicesManufacturer();
	}

	/**
	 * Returns the radiation devices max activity of this radiation devices add.
	 *
	 * @return the radiation devices max activity of this radiation devices add
	 */
	@Override
	public String getRadiationDevicesMaxActivity() {
		return model.getRadiationDevicesMaxActivity();
	}

	/**
	 * Returns the radiation devices model no of this radiation devices add.
	 *
	 * @return the radiation devices model no of this radiation devices add
	 */
	@Override
	public String getRadiationDevicesModelNo() {
		return model.getRadiationDevicesModelNo();
	}

	/**
	 * Returns the radiation devices name of this radiation devices add.
	 *
	 * @return the radiation devices name of this radiation devices add
	 */
	@Override
	public String getRadiationDevicesName() {
		return model.getRadiationDevicesName();
	}

	/**
	 * Returns the radiation devices number of this radiation devices add.
	 *
	 * @return the radiation devices number of this radiation devices add
	 */
	@Override
	public String getRadiationDevicesNumber() {
		return model.getRadiationDevicesNumber();
	}

	/**
	 * Returns the radiation devices radio of this radiation devices add.
	 *
	 * @return the radiation devices radio of this radiation devices add
	 */
	@Override
	public String getRadiationDevicesRadio() {
		return model.getRadiationDevicesRadio();
	}

	/**
	 * Returns the radiation devices use of this radiation devices add.
	 *
	 * @return the radiation devices use of this radiation devices add
	 */
	@Override
	public String getRadiationDevicesUse() {
		return model.getRadiationDevicesUse();
	}

	/**
	 * Returns the user ID of this radiation devices add.
	 *
	 * @return the user ID of this radiation devices add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this radiation devices add.
	 *
	 * @return the user name of this radiation devices add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this radiation devices add.
	 *
	 * @return the user uuid of this radiation devices add
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
	 * Sets the company ID of this radiation devices add.
	 *
	 * @param companyId the company ID of this radiation devices add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this radiation devices add.
	 *
	 * @param counter the counter of this radiation devices add
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this radiation devices add.
	 *
	 * @param createDate the create date of this radiation devices add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this radiation devices add.
	 *
	 * @param groupId the group ID of this radiation devices add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application ID of this radiation devices add.
	 *
	 * @param hsraApplicationId the hsra application ID of this radiation devices add
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the modified date of this radiation devices add.
	 *
	 * @param modifiedDate the modified date of this radiation devices add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this radiation devices add.
	 *
	 * @param primaryKey the primary key of this radiation devices add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the radiation devices add ID of this radiation devices add.
	 *
	 * @param radiationDevicesAddId the radiation devices add ID of this radiation devices add
	 */
	@Override
	public void setRadiationDevicesAddId(long radiationDevicesAddId) {
		model.setRadiationDevicesAddId(radiationDevicesAddId);
	}

	/**
	 * Sets the radiation devices manufacturer of this radiation devices add.
	 *
	 * @param radiationDevicesManufacturer the radiation devices manufacturer of this radiation devices add
	 */
	@Override
	public void setRadiationDevicesManufacturer(
		String radiationDevicesManufacturer) {

		model.setRadiationDevicesManufacturer(radiationDevicesManufacturer);
	}

	/**
	 * Sets the radiation devices max activity of this radiation devices add.
	 *
	 * @param radiationDevicesMaxActivity the radiation devices max activity of this radiation devices add
	 */
	@Override
	public void setRadiationDevicesMaxActivity(
		String radiationDevicesMaxActivity) {

		model.setRadiationDevicesMaxActivity(radiationDevicesMaxActivity);
	}

	/**
	 * Sets the radiation devices model no of this radiation devices add.
	 *
	 * @param radiationDevicesModelNo the radiation devices model no of this radiation devices add
	 */
	@Override
	public void setRadiationDevicesModelNo(String radiationDevicesModelNo) {
		model.setRadiationDevicesModelNo(radiationDevicesModelNo);
	}

	/**
	 * Sets the radiation devices name of this radiation devices add.
	 *
	 * @param radiationDevicesName the radiation devices name of this radiation devices add
	 */
	@Override
	public void setRadiationDevicesName(String radiationDevicesName) {
		model.setRadiationDevicesName(radiationDevicesName);
	}

	/**
	 * Sets the radiation devices number of this radiation devices add.
	 *
	 * @param radiationDevicesNumber the radiation devices number of this radiation devices add
	 */
	@Override
	public void setRadiationDevicesNumber(String radiationDevicesNumber) {
		model.setRadiationDevicesNumber(radiationDevicesNumber);
	}

	/**
	 * Sets the radiation devices radio of this radiation devices add.
	 *
	 * @param radiationDevicesRadio the radiation devices radio of this radiation devices add
	 */
	@Override
	public void setRadiationDevicesRadio(String radiationDevicesRadio) {
		model.setRadiationDevicesRadio(radiationDevicesRadio);
	}

	/**
	 * Sets the radiation devices use of this radiation devices add.
	 *
	 * @param radiationDevicesUse the radiation devices use of this radiation devices add
	 */
	@Override
	public void setRadiationDevicesUse(String radiationDevicesUse) {
		model.setRadiationDevicesUse(radiationDevicesUse);
	}

	/**
	 * Sets the user ID of this radiation devices add.
	 *
	 * @param userId the user ID of this radiation devices add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this radiation devices add.
	 *
	 * @param userName the user name of this radiation devices add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this radiation devices add.
	 *
	 * @param userUuid the user uuid of this radiation devices add
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
	protected RadiationDevicesAddWrapper wrap(
		RadiationDevicesAdd radiationDevicesAdd) {

		return new RadiationDevicesAddWrapper(radiationDevicesAdd);
	}

}