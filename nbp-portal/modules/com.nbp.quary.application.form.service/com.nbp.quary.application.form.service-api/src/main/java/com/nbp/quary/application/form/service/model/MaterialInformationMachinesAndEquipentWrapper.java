/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
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
 * This class is a wrapper for {@link MaterialInformationMachinesAndEquipent}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MaterialInformationMachinesAndEquipent
 * @generated
 */
public class MaterialInformationMachinesAndEquipentWrapper
	extends BaseModelWrapper<MaterialInformationMachinesAndEquipent>
	implements MaterialInformationMachinesAndEquipent,
			   ModelWrapper<MaterialInformationMachinesAndEquipent> {

	public MaterialInformationMachinesAndEquipentWrapper(
		MaterialInformationMachinesAndEquipent
			materialInformationMachinesAndEquipent) {

		super(materialInformationMachinesAndEquipent);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("miMachineId", getMiMachineId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("manchineName", getManchineName());
		attributes.put("isManchineNameChecked", getIsManchineNameChecked());
		attributes.put("locatedOnProposedSite", getLocatedOnProposedSite());
		attributes.put("quarryApplicationId", getQuarryApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long miMachineId = (Long)attributes.get("miMachineId");

		if (miMachineId != null) {
			setMiMachineId(miMachineId);
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

		String locatedOnProposedSite = (String)attributes.get(
			"locatedOnProposedSite");

		if (locatedOnProposedSite != null) {
			setLocatedOnProposedSite(locatedOnProposedSite);
		}

		String quarryApplicationId = (String)attributes.get(
			"quarryApplicationId");

		if (quarryApplicationId != null) {
			setQuarryApplicationId(quarryApplicationId);
		}
	}

	@Override
	public MaterialInformationMachinesAndEquipent cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this material information machines and equipent.
	 *
	 * @return the company ID of this material information machines and equipent
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this material information machines and equipent.
	 *
	 * @return the create date of this material information machines and equipent
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this material information machines and equipent.
	 *
	 * @return the group ID of this material information machines and equipent
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the is manchine name checked of this material information machines and equipent.
	 *
	 * @return the is manchine name checked of this material information machines and equipent
	 */
	@Override
	public String getIsManchineNameChecked() {
		return model.getIsManchineNameChecked();
	}

	/**
	 * Returns the located on proposed site of this material information machines and equipent.
	 *
	 * @return the located on proposed site of this material information machines and equipent
	 */
	@Override
	public String getLocatedOnProposedSite() {
		return model.getLocatedOnProposedSite();
	}

	/**
	 * Returns the manchine name of this material information machines and equipent.
	 *
	 * @return the manchine name of this material information machines and equipent
	 */
	@Override
	public String getManchineName() {
		return model.getManchineName();
	}

	/**
	 * Returns the mi machine ID of this material information machines and equipent.
	 *
	 * @return the mi machine ID of this material information machines and equipent
	 */
	@Override
	public long getMiMachineId() {
		return model.getMiMachineId();
	}

	/**
	 * Returns the modified date of this material information machines and equipent.
	 *
	 * @return the modified date of this material information machines and equipent
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this material information machines and equipent.
	 *
	 * @return the primary key of this material information machines and equipent
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the quarry application ID of this material information machines and equipent.
	 *
	 * @return the quarry application ID of this material information machines and equipent
	 */
	@Override
	public String getQuarryApplicationId() {
		return model.getQuarryApplicationId();
	}

	/**
	 * Returns the user ID of this material information machines and equipent.
	 *
	 * @return the user ID of this material information machines and equipent
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this material information machines and equipent.
	 *
	 * @return the user name of this material information machines and equipent
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this material information machines and equipent.
	 *
	 * @return the user uuid of this material information machines and equipent
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this material information machines and equipent.
	 *
	 * @return the uuid of this material information machines and equipent
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
	 * Sets the company ID of this material information machines and equipent.
	 *
	 * @param companyId the company ID of this material information machines and equipent
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this material information machines and equipent.
	 *
	 * @param createDate the create date of this material information machines and equipent
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this material information machines and equipent.
	 *
	 * @param groupId the group ID of this material information machines and equipent
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the is manchine name checked of this material information machines and equipent.
	 *
	 * @param isManchineNameChecked the is manchine name checked of this material information machines and equipent
	 */
	@Override
	public void setIsManchineNameChecked(String isManchineNameChecked) {
		model.setIsManchineNameChecked(isManchineNameChecked);
	}

	/**
	 * Sets the located on proposed site of this material information machines and equipent.
	 *
	 * @param locatedOnProposedSite the located on proposed site of this material information machines and equipent
	 */
	@Override
	public void setLocatedOnProposedSite(String locatedOnProposedSite) {
		model.setLocatedOnProposedSite(locatedOnProposedSite);
	}

	/**
	 * Sets the manchine name of this material information machines and equipent.
	 *
	 * @param manchineName the manchine name of this material information machines and equipent
	 */
	@Override
	public void setManchineName(String manchineName) {
		model.setManchineName(manchineName);
	}

	/**
	 * Sets the mi machine ID of this material information machines and equipent.
	 *
	 * @param miMachineId the mi machine ID of this material information machines and equipent
	 */
	@Override
	public void setMiMachineId(long miMachineId) {
		model.setMiMachineId(miMachineId);
	}

	/**
	 * Sets the modified date of this material information machines and equipent.
	 *
	 * @param modifiedDate the modified date of this material information machines and equipent
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this material information machines and equipent.
	 *
	 * @param primaryKey the primary key of this material information machines and equipent
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the quarry application ID of this material information machines and equipent.
	 *
	 * @param quarryApplicationId the quarry application ID of this material information machines and equipent
	 */
	@Override
	public void setQuarryApplicationId(String quarryApplicationId) {
		model.setQuarryApplicationId(quarryApplicationId);
	}

	/**
	 * Sets the user ID of this material information machines and equipent.
	 *
	 * @param userId the user ID of this material information machines and equipent
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this material information machines and equipent.
	 *
	 * @param userName the user name of this material information machines and equipent
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this material information machines and equipent.
	 *
	 * @param userUuid the user uuid of this material information machines and equipent
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this material information machines and equipent.
	 *
	 * @param uuid the uuid of this material information machines and equipent
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected MaterialInformationMachinesAndEquipentWrapper wrap(
		MaterialInformationMachinesAndEquipent
			materialInformationMachinesAndEquipent) {

		return new MaterialInformationMachinesAndEquipentWrapper(
			materialInformationMachinesAndEquipent);
	}

}