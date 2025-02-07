/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link HealthCareEquipmentInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareEquipmentInfo
 * @generated
 */
public class HealthCareEquipmentInfoWrapper
	extends BaseModelWrapper<HealthCareEquipmentInfo>
	implements HealthCareEquipmentInfo, ModelWrapper<HealthCareEquipmentInfo> {

	public HealthCareEquipmentInfoWrapper(
		HealthCareEquipmentInfo healthCareEquipmentInfo) {

		super(healthCareEquipmentInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"healthCareEquipmentInfoId", getHealthCareEquipmentInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("healthCareApplicationId", getHealthCareApplicationId());
		attributes.put("equipmentManu", getEquipmentManu());
		attributes.put("equipmentModel", getEquipmentModel());
		attributes.put("equipmentMake", getEquipmentMake());
		attributes.put("yearOfEquipment", getYearOfEquipment());
		attributes.put("serialNumber", getSerialNumber());
		attributes.put("quantity", getQuantity());
		attributes.put("description", getDescription());
		attributes.put("hsHeading", getHsHeading());
		attributes.put("hsSubHeading", getHsSubHeading());
		attributes.put("counter", getCounter());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long healthCareEquipmentInfoId = (Long)attributes.get(
			"healthCareEquipmentInfoId");

		if (healthCareEquipmentInfoId != null) {
			setHealthCareEquipmentInfoId(healthCareEquipmentInfoId);
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

		Long healthCareApplicationId = (Long)attributes.get(
			"healthCareApplicationId");

		if (healthCareApplicationId != null) {
			setHealthCareApplicationId(healthCareApplicationId);
		}

		String equipmentManu = (String)attributes.get("equipmentManu");

		if (equipmentManu != null) {
			setEquipmentManu(equipmentManu);
		}

		String equipmentModel = (String)attributes.get("equipmentModel");

		if (equipmentModel != null) {
			setEquipmentModel(equipmentModel);
		}

		String equipmentMake = (String)attributes.get("equipmentMake");

		if (equipmentMake != null) {
			setEquipmentMake(equipmentMake);
		}

		String yearOfEquipment = (String)attributes.get("yearOfEquipment");

		if (yearOfEquipment != null) {
			setYearOfEquipment(yearOfEquipment);
		}

		String serialNumber = (String)attributes.get("serialNumber");

		if (serialNumber != null) {
			setSerialNumber(serialNumber);
		}

		String quantity = (String)attributes.get("quantity");

		if (quantity != null) {
			setQuantity(quantity);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String hsHeading = (String)attributes.get("hsHeading");

		if (hsHeading != null) {
			setHsHeading(hsHeading);
		}

		String hsSubHeading = (String)attributes.get("hsSubHeading");

		if (hsSubHeading != null) {
			setHsSubHeading(hsSubHeading);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}
	}

	@Override
	public HealthCareEquipmentInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this health care equipment info.
	 *
	 * @return the company ID of this health care equipment info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this health care equipment info.
	 *
	 * @return the counter of this health care equipment info
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this health care equipment info.
	 *
	 * @return the create date of this health care equipment info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description of this health care equipment info.
	 *
	 * @return the description of this health care equipment info
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the equipment make of this health care equipment info.
	 *
	 * @return the equipment make of this health care equipment info
	 */
	@Override
	public String getEquipmentMake() {
		return model.getEquipmentMake();
	}

	/**
	 * Returns the equipment manu of this health care equipment info.
	 *
	 * @return the equipment manu of this health care equipment info
	 */
	@Override
	public String getEquipmentManu() {
		return model.getEquipmentManu();
	}

	/**
	 * Returns the equipment model of this health care equipment info.
	 *
	 * @return the equipment model of this health care equipment info
	 */
	@Override
	public String getEquipmentModel() {
		return model.getEquipmentModel();
	}

	/**
	 * Returns the group ID of this health care equipment info.
	 *
	 * @return the group ID of this health care equipment info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the health care application ID of this health care equipment info.
	 *
	 * @return the health care application ID of this health care equipment info
	 */
	@Override
	public long getHealthCareApplicationId() {
		return model.getHealthCareApplicationId();
	}

	/**
	 * Returns the health care equipment info ID of this health care equipment info.
	 *
	 * @return the health care equipment info ID of this health care equipment info
	 */
	@Override
	public long getHealthCareEquipmentInfoId() {
		return model.getHealthCareEquipmentInfoId();
	}

	/**
	 * Returns the hs heading of this health care equipment info.
	 *
	 * @return the hs heading of this health care equipment info
	 */
	@Override
	public String getHsHeading() {
		return model.getHsHeading();
	}

	/**
	 * Returns the hs sub heading of this health care equipment info.
	 *
	 * @return the hs sub heading of this health care equipment info
	 */
	@Override
	public String getHsSubHeading() {
		return model.getHsSubHeading();
	}

	/**
	 * Returns the modified date of this health care equipment info.
	 *
	 * @return the modified date of this health care equipment info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this health care equipment info.
	 *
	 * @return the primary key of this health care equipment info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the quantity of this health care equipment info.
	 *
	 * @return the quantity of this health care equipment info
	 */
	@Override
	public String getQuantity() {
		return model.getQuantity();
	}

	/**
	 * Returns the serial number of this health care equipment info.
	 *
	 * @return the serial number of this health care equipment info
	 */
	@Override
	public String getSerialNumber() {
		return model.getSerialNumber();
	}

	/**
	 * Returns the user ID of this health care equipment info.
	 *
	 * @return the user ID of this health care equipment info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this health care equipment info.
	 *
	 * @return the user name of this health care equipment info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this health care equipment info.
	 *
	 * @return the user uuid of this health care equipment info
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the year of equipment of this health care equipment info.
	 *
	 * @return the year of equipment of this health care equipment info
	 */
	@Override
	public String getYearOfEquipment() {
		return model.getYearOfEquipment();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this health care equipment info.
	 *
	 * @param companyId the company ID of this health care equipment info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this health care equipment info.
	 *
	 * @param counter the counter of this health care equipment info
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this health care equipment info.
	 *
	 * @param createDate the create date of this health care equipment info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this health care equipment info.
	 *
	 * @param description the description of this health care equipment info
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the equipment make of this health care equipment info.
	 *
	 * @param equipmentMake the equipment make of this health care equipment info
	 */
	@Override
	public void setEquipmentMake(String equipmentMake) {
		model.setEquipmentMake(equipmentMake);
	}

	/**
	 * Sets the equipment manu of this health care equipment info.
	 *
	 * @param equipmentManu the equipment manu of this health care equipment info
	 */
	@Override
	public void setEquipmentManu(String equipmentManu) {
		model.setEquipmentManu(equipmentManu);
	}

	/**
	 * Sets the equipment model of this health care equipment info.
	 *
	 * @param equipmentModel the equipment model of this health care equipment info
	 */
	@Override
	public void setEquipmentModel(String equipmentModel) {
		model.setEquipmentModel(equipmentModel);
	}

	/**
	 * Sets the group ID of this health care equipment info.
	 *
	 * @param groupId the group ID of this health care equipment info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the health care application ID of this health care equipment info.
	 *
	 * @param healthCareApplicationId the health care application ID of this health care equipment info
	 */
	@Override
	public void setHealthCareApplicationId(long healthCareApplicationId) {
		model.setHealthCareApplicationId(healthCareApplicationId);
	}

	/**
	 * Sets the health care equipment info ID of this health care equipment info.
	 *
	 * @param healthCareEquipmentInfoId the health care equipment info ID of this health care equipment info
	 */
	@Override
	public void setHealthCareEquipmentInfoId(long healthCareEquipmentInfoId) {
		model.setHealthCareEquipmentInfoId(healthCareEquipmentInfoId);
	}

	/**
	 * Sets the hs heading of this health care equipment info.
	 *
	 * @param hsHeading the hs heading of this health care equipment info
	 */
	@Override
	public void setHsHeading(String hsHeading) {
		model.setHsHeading(hsHeading);
	}

	/**
	 * Sets the hs sub heading of this health care equipment info.
	 *
	 * @param hsSubHeading the hs sub heading of this health care equipment info
	 */
	@Override
	public void setHsSubHeading(String hsSubHeading) {
		model.setHsSubHeading(hsSubHeading);
	}

	/**
	 * Sets the modified date of this health care equipment info.
	 *
	 * @param modifiedDate the modified date of this health care equipment info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this health care equipment info.
	 *
	 * @param primaryKey the primary key of this health care equipment info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the quantity of this health care equipment info.
	 *
	 * @param quantity the quantity of this health care equipment info
	 */
	@Override
	public void setQuantity(String quantity) {
		model.setQuantity(quantity);
	}

	/**
	 * Sets the serial number of this health care equipment info.
	 *
	 * @param serialNumber the serial number of this health care equipment info
	 */
	@Override
	public void setSerialNumber(String serialNumber) {
		model.setSerialNumber(serialNumber);
	}

	/**
	 * Sets the user ID of this health care equipment info.
	 *
	 * @param userId the user ID of this health care equipment info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this health care equipment info.
	 *
	 * @param userName the user name of this health care equipment info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this health care equipment info.
	 *
	 * @param userUuid the user uuid of this health care equipment info
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the year of equipment of this health care equipment info.
	 *
	 * @param yearOfEquipment the year of equipment of this health care equipment info
	 */
	@Override
	public void setYearOfEquipment(String yearOfEquipment) {
		model.setYearOfEquipment(yearOfEquipment);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected HealthCareEquipmentInfoWrapper wrap(
		HealthCareEquipmentInfo healthCareEquipmentInfo) {

		return new HealthCareEquipmentInfoWrapper(healthCareEquipmentInfo);
	}

}