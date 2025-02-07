/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QuarryMaterialInformationEquipmentList}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryMaterialInformationEquipmentList
 * @generated
 */
public class QuarryMaterialInformationEquipmentListWrapper
	extends BaseModelWrapper<QuarryMaterialInformationEquipmentList>
	implements ModelWrapper<QuarryMaterialInformationEquipmentList>,
			   QuarryMaterialInformationEquipmentList {

	public QuarryMaterialInformationEquipmentListWrapper(
		QuarryMaterialInformationEquipmentList
			quarryMaterialInformationEquipmentList) {

		super(quarryMaterialInformationEquipmentList);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("materialInfoId", getMaterialInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("machineName", getMachineName());
		attributes.put("quantity", getQuantity());
		attributes.put("locatedOnPermises", getLocatedOnPermises());
		attributes.put("isManchineNameChecked", getIsManchineNameChecked());
		attributes.put("otherValue", getOtherValue());
		attributes.put("quarryApplicationId", getQuarryApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long materialInfoId = (Long)attributes.get("materialInfoId");

		if (materialInfoId != null) {
			setMaterialInfoId(materialInfoId);
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

		String machineName = (String)attributes.get("machineName");

		if (machineName != null) {
			setMachineName(machineName);
		}

		String quantity = (String)attributes.get("quantity");

		if (quantity != null) {
			setQuantity(quantity);
		}

		String locatedOnPermises = (String)attributes.get("locatedOnPermises");

		if (locatedOnPermises != null) {
			setLocatedOnPermises(locatedOnPermises);
		}

		String isManchineNameChecked = (String)attributes.get(
			"isManchineNameChecked");

		if (isManchineNameChecked != null) {
			setIsManchineNameChecked(isManchineNameChecked);
		}

		String otherValue = (String)attributes.get("otherValue");

		if (otherValue != null) {
			setOtherValue(otherValue);
		}

		Long quarryApplicationId = (Long)attributes.get("quarryApplicationId");

		if (quarryApplicationId != null) {
			setQuarryApplicationId(quarryApplicationId);
		}
	}

	@Override
	public QuarryMaterialInformationEquipmentList cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this quarry material information equipment list.
	 *
	 * @return the company ID of this quarry material information equipment list
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this quarry material information equipment list.
	 *
	 * @return the create date of this quarry material information equipment list
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this quarry material information equipment list.
	 *
	 * @return the group ID of this quarry material information equipment list
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the is manchine name checked of this quarry material information equipment list.
	 *
	 * @return the is manchine name checked of this quarry material information equipment list
	 */
	@Override
	public String getIsManchineNameChecked() {
		return model.getIsManchineNameChecked();
	}

	/**
	 * Returns the located on permises of this quarry material information equipment list.
	 *
	 * @return the located on permises of this quarry material information equipment list
	 */
	@Override
	public String getLocatedOnPermises() {
		return model.getLocatedOnPermises();
	}

	/**
	 * Returns the machine name of this quarry material information equipment list.
	 *
	 * @return the machine name of this quarry material information equipment list
	 */
	@Override
	public String getMachineName() {
		return model.getMachineName();
	}

	/**
	 * Returns the material info ID of this quarry material information equipment list.
	 *
	 * @return the material info ID of this quarry material information equipment list
	 */
	@Override
	public long getMaterialInfoId() {
		return model.getMaterialInfoId();
	}

	/**
	 * Returns the modified date of this quarry material information equipment list.
	 *
	 * @return the modified date of this quarry material information equipment list
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the other value of this quarry material information equipment list.
	 *
	 * @return the other value of this quarry material information equipment list
	 */
	@Override
	public String getOtherValue() {
		return model.getOtherValue();
	}

	/**
	 * Returns the primary key of this quarry material information equipment list.
	 *
	 * @return the primary key of this quarry material information equipment list
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the quantity of this quarry material information equipment list.
	 *
	 * @return the quantity of this quarry material information equipment list
	 */
	@Override
	public String getQuantity() {
		return model.getQuantity();
	}

	/**
	 * Returns the quarry application ID of this quarry material information equipment list.
	 *
	 * @return the quarry application ID of this quarry material information equipment list
	 */
	@Override
	public long getQuarryApplicationId() {
		return model.getQuarryApplicationId();
	}

	/**
	 * Returns the user ID of this quarry material information equipment list.
	 *
	 * @return the user ID of this quarry material information equipment list
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this quarry material information equipment list.
	 *
	 * @return the user name of this quarry material information equipment list
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this quarry material information equipment list.
	 *
	 * @return the user uuid of this quarry material information equipment list
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
	 * Sets the company ID of this quarry material information equipment list.
	 *
	 * @param companyId the company ID of this quarry material information equipment list
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this quarry material information equipment list.
	 *
	 * @param createDate the create date of this quarry material information equipment list
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this quarry material information equipment list.
	 *
	 * @param groupId the group ID of this quarry material information equipment list
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the is manchine name checked of this quarry material information equipment list.
	 *
	 * @param isManchineNameChecked the is manchine name checked of this quarry material information equipment list
	 */
	@Override
	public void setIsManchineNameChecked(String isManchineNameChecked) {
		model.setIsManchineNameChecked(isManchineNameChecked);
	}

	/**
	 * Sets the located on permises of this quarry material information equipment list.
	 *
	 * @param locatedOnPermises the located on permises of this quarry material information equipment list
	 */
	@Override
	public void setLocatedOnPermises(String locatedOnPermises) {
		model.setLocatedOnPermises(locatedOnPermises);
	}

	/**
	 * Sets the machine name of this quarry material information equipment list.
	 *
	 * @param machineName the machine name of this quarry material information equipment list
	 */
	@Override
	public void setMachineName(String machineName) {
		model.setMachineName(machineName);
	}

	/**
	 * Sets the material info ID of this quarry material information equipment list.
	 *
	 * @param materialInfoId the material info ID of this quarry material information equipment list
	 */
	@Override
	public void setMaterialInfoId(long materialInfoId) {
		model.setMaterialInfoId(materialInfoId);
	}

	/**
	 * Sets the modified date of this quarry material information equipment list.
	 *
	 * @param modifiedDate the modified date of this quarry material information equipment list
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the other value of this quarry material information equipment list.
	 *
	 * @param otherValue the other value of this quarry material information equipment list
	 */
	@Override
	public void setOtherValue(String otherValue) {
		model.setOtherValue(otherValue);
	}

	/**
	 * Sets the primary key of this quarry material information equipment list.
	 *
	 * @param primaryKey the primary key of this quarry material information equipment list
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the quantity of this quarry material information equipment list.
	 *
	 * @param quantity the quantity of this quarry material information equipment list
	 */
	@Override
	public void setQuantity(String quantity) {
		model.setQuantity(quantity);
	}

	/**
	 * Sets the quarry application ID of this quarry material information equipment list.
	 *
	 * @param quarryApplicationId the quarry application ID of this quarry material information equipment list
	 */
	@Override
	public void setQuarryApplicationId(long quarryApplicationId) {
		model.setQuarryApplicationId(quarryApplicationId);
	}

	/**
	 * Sets the user ID of this quarry material information equipment list.
	 *
	 * @param userId the user ID of this quarry material information equipment list
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this quarry material information equipment list.
	 *
	 * @param userName the user name of this quarry material information equipment list
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this quarry material information equipment list.
	 *
	 * @param userUuid the user uuid of this quarry material information equipment list
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
	protected QuarryMaterialInformationEquipmentListWrapper wrap(
		QuarryMaterialInformationEquipmentList
			quarryMaterialInformationEquipmentList) {

		return new QuarryMaterialInformationEquipmentListWrapper(
			quarryMaterialInformationEquipmentList);
	}

}