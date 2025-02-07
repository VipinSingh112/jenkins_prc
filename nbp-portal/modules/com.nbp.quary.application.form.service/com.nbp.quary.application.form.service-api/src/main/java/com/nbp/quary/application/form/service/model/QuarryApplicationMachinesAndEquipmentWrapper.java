/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QuarryApplicationMachinesAndEquipment}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicationMachinesAndEquipment
 * @generated
 */
public class QuarryApplicationMachinesAndEquipmentWrapper
	extends BaseModelWrapper<QuarryApplicationMachinesAndEquipment>
	implements ModelWrapper<QuarryApplicationMachinesAndEquipment>,
			   QuarryApplicationMachinesAndEquipment {

	public QuarryApplicationMachinesAndEquipmentWrapper(
		QuarryApplicationMachinesAndEquipment
			quarryApplicationMachinesAndEquipment) {

		super(quarryApplicationMachinesAndEquipment);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put(
			"quarryApplicationMachinId", getQuarryApplicationMachinId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("manchineName", getManchineName());
		attributes.put("isManchineNameChecked", getIsManchineNameChecked());
		attributes.put("quantity", getQuantity());
		attributes.put("locationOfPermises", getLocationOfPermises());
		attributes.put("locatedOnLocation", getLocatedOnLocation());
		attributes.put("otherValue", getOtherValue());
		attributes.put("quarryApplicationId", getQuarryApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long quarryApplicationMachinId = (Long)attributes.get(
			"quarryApplicationMachinId");

		if (quarryApplicationMachinId != null) {
			setQuarryApplicationMachinId(quarryApplicationMachinId);
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

		String manchineName = (String)attributes.get("manchineName");

		if (manchineName != null) {
			setManchineName(manchineName);
		}

		String isManchineNameChecked = (String)attributes.get(
			"isManchineNameChecked");

		if (isManchineNameChecked != null) {
			setIsManchineNameChecked(isManchineNameChecked);
		}

		String quantity = (String)attributes.get("quantity");

		if (quantity != null) {
			setQuantity(quantity);
		}

		String locationOfPermises = (String)attributes.get(
			"locationOfPermises");

		if (locationOfPermises != null) {
			setLocationOfPermises(locationOfPermises);
		}

		String locatedOnLocation = (String)attributes.get("locatedOnLocation");

		if (locatedOnLocation != null) {
			setLocatedOnLocation(locatedOnLocation);
		}

		String otherValue = (String)attributes.get("otherValue");

		if (otherValue != null) {
			setOtherValue(otherValue);
		}

		String quarryApplicationId = (String)attributes.get(
			"quarryApplicationId");

		if (quarryApplicationId != null) {
			setQuarryApplicationId(quarryApplicationId);
		}
	}

	@Override
	public QuarryApplicationMachinesAndEquipment cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this quarry application machines and equipment.
	 *
	 * @return the company ID of this quarry application machines and equipment
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this quarry application machines and equipment.
	 *
	 * @return the create date of this quarry application machines and equipment
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this quarry application machines and equipment.
	 *
	 * @return the group ID of this quarry application machines and equipment
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the is manchine name checked of this quarry application machines and equipment.
	 *
	 * @return the is manchine name checked of this quarry application machines and equipment
	 */
	@Override
	public String getIsManchineNameChecked() {
		return model.getIsManchineNameChecked();
	}

	/**
	 * Returns the located on location of this quarry application machines and equipment.
	 *
	 * @return the located on location of this quarry application machines and equipment
	 */
	@Override
	public String getLocatedOnLocation() {
		return model.getLocatedOnLocation();
	}

	/**
	 * Returns the location of permises of this quarry application machines and equipment.
	 *
	 * @return the location of permises of this quarry application machines and equipment
	 */
	@Override
	public String getLocationOfPermises() {
		return model.getLocationOfPermises();
	}

	/**
	 * Returns the manchine name of this quarry application machines and equipment.
	 *
	 * @return the manchine name of this quarry application machines and equipment
	 */
	@Override
	public String getManchineName() {
		return model.getManchineName();
	}

	/**
	 * Returns the modified date of this quarry application machines and equipment.
	 *
	 * @return the modified date of this quarry application machines and equipment
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the other value of this quarry application machines and equipment.
	 *
	 * @return the other value of this quarry application machines and equipment
	 */
	@Override
	public String getOtherValue() {
		return model.getOtherValue();
	}

	/**
	 * Returns the primary key of this quarry application machines and equipment.
	 *
	 * @return the primary key of this quarry application machines and equipment
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the quantity of this quarry application machines and equipment.
	 *
	 * @return the quantity of this quarry application machines and equipment
	 */
	@Override
	public String getQuantity() {
		return model.getQuantity();
	}

	/**
	 * Returns the quarry application ID of this quarry application machines and equipment.
	 *
	 * @return the quarry application ID of this quarry application machines and equipment
	 */
	@Override
	public String getQuarryApplicationId() {
		return model.getQuarryApplicationId();
	}

	/**
	 * Returns the quarry application machin ID of this quarry application machines and equipment.
	 *
	 * @return the quarry application machin ID of this quarry application machines and equipment
	 */
	@Override
	public long getQuarryApplicationMachinId() {
		return model.getQuarryApplicationMachinId();
	}

	/**
	 * Returns the user ID of this quarry application machines and equipment.
	 *
	 * @return the user ID of this quarry application machines and equipment
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this quarry application machines and equipment.
	 *
	 * @return the user name of this quarry application machines and equipment
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this quarry application machines and equipment.
	 *
	 * @return the user uuid of this quarry application machines and equipment
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this quarry application machines and equipment.
	 *
	 * @return the uuid of this quarry application machines and equipment
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this quarry application machines and equipment.
	 *
	 * @param companyId the company ID of this quarry application machines and equipment
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this quarry application machines and equipment.
	 *
	 * @param createDate the create date of this quarry application machines and equipment
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this quarry application machines and equipment.
	 *
	 * @param groupId the group ID of this quarry application machines and equipment
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the is manchine name checked of this quarry application machines and equipment.
	 *
	 * @param isManchineNameChecked the is manchine name checked of this quarry application machines and equipment
	 */
	@Override
	public void setIsManchineNameChecked(String isManchineNameChecked) {
		model.setIsManchineNameChecked(isManchineNameChecked);
	}

	/**
	 * Sets the located on location of this quarry application machines and equipment.
	 *
	 * @param locatedOnLocation the located on location of this quarry application machines and equipment
	 */
	@Override
	public void setLocatedOnLocation(String locatedOnLocation) {
		model.setLocatedOnLocation(locatedOnLocation);
	}

	/**
	 * Sets the location of permises of this quarry application machines and equipment.
	 *
	 * @param locationOfPermises the location of permises of this quarry application machines and equipment
	 */
	@Override
	public void setLocationOfPermises(String locationOfPermises) {
		model.setLocationOfPermises(locationOfPermises);
	}

	/**
	 * Sets the manchine name of this quarry application machines and equipment.
	 *
	 * @param manchineName the manchine name of this quarry application machines and equipment
	 */
	@Override
	public void setManchineName(String manchineName) {
		model.setManchineName(manchineName);
	}

	/**
	 * Sets the modified date of this quarry application machines and equipment.
	 *
	 * @param modifiedDate the modified date of this quarry application machines and equipment
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the other value of this quarry application machines and equipment.
	 *
	 * @param otherValue the other value of this quarry application machines and equipment
	 */
	@Override
	public void setOtherValue(String otherValue) {
		model.setOtherValue(otherValue);
	}

	/**
	 * Sets the primary key of this quarry application machines and equipment.
	 *
	 * @param primaryKey the primary key of this quarry application machines and equipment
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the quantity of this quarry application machines and equipment.
	 *
	 * @param quantity the quantity of this quarry application machines and equipment
	 */
	@Override
	public void setQuantity(String quantity) {
		model.setQuantity(quantity);
	}

	/**
	 * Sets the quarry application ID of this quarry application machines and equipment.
	 *
	 * @param quarryApplicationId the quarry application ID of this quarry application machines and equipment
	 */
	@Override
	public void setQuarryApplicationId(String quarryApplicationId) {
		model.setQuarryApplicationId(quarryApplicationId);
	}

	/**
	 * Sets the quarry application machin ID of this quarry application machines and equipment.
	 *
	 * @param quarryApplicationMachinId the quarry application machin ID of this quarry application machines and equipment
	 */
	@Override
	public void setQuarryApplicationMachinId(long quarryApplicationMachinId) {
		model.setQuarryApplicationMachinId(quarryApplicationMachinId);
	}

	/**
	 * Sets the user ID of this quarry application machines and equipment.
	 *
	 * @param userId the user ID of this quarry application machines and equipment
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this quarry application machines and equipment.
	 *
	 * @param userName the user name of this quarry application machines and equipment
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this quarry application machines and equipment.
	 *
	 * @param userUuid the user uuid of this quarry application machines and equipment
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this quarry application machines and equipment.
	 *
	 * @param uuid the uuid of this quarry application machines and equipment
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected QuarryApplicationMachinesAndEquipmentWrapper wrap(
		QuarryApplicationMachinesAndEquipment
			quarryApplicationMachinesAndEquipment) {

		return new QuarryApplicationMachinesAndEquipmentWrapper(
			quarryApplicationMachinesAndEquipment);
	}

}