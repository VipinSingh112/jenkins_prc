/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CannabisConsentByPropertyOwner}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConsentByPropertyOwner
 * @generated
 */
public class CannabisConsentByPropertyOwnerWrapper
	extends BaseModelWrapper<CannabisConsentByPropertyOwner>
	implements CannabisConsentByPropertyOwner,
			   ModelWrapper<CannabisConsentByPropertyOwner> {

	public CannabisConsentByPropertyOwnerWrapper(
		CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner) {

		super(cannabisConsentByPropertyOwner);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("cannabisCPOId", getCannabisCPOId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("typeOfProperty", getTypeOfProperty());
		attributes.put("descriptionOfProperty", getDescriptionOfProperty());
		attributes.put(
			"descriptionOfIntendedUse", getDescriptionOfIntendedUse());
		attributes.put("landType", getLandType());
		attributes.put("ownsProperty", getOwnsProperty());
		attributes.put("cannabisApplicationId", getCannabisApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long cannabisCPOId = (Long)attributes.get("cannabisCPOId");

		if (cannabisCPOId != null) {
			setCannabisCPOId(cannabisCPOId);
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

		String typeOfProperty = (String)attributes.get("typeOfProperty");

		if (typeOfProperty != null) {
			setTypeOfProperty(typeOfProperty);
		}

		String descriptionOfProperty = (String)attributes.get(
			"descriptionOfProperty");

		if (descriptionOfProperty != null) {
			setDescriptionOfProperty(descriptionOfProperty);
		}

		String descriptionOfIntendedUse = (String)attributes.get(
			"descriptionOfIntendedUse");

		if (descriptionOfIntendedUse != null) {
			setDescriptionOfIntendedUse(descriptionOfIntendedUse);
		}

		String landType = (String)attributes.get("landType");

		if (landType != null) {
			setLandType(landType);
		}

		String ownsProperty = (String)attributes.get("ownsProperty");

		if (ownsProperty != null) {
			setOwnsProperty(ownsProperty);
		}

		Long cannabisApplicationId = (Long)attributes.get(
			"cannabisApplicationId");

		if (cannabisApplicationId != null) {
			setCannabisApplicationId(cannabisApplicationId);
		}
	}

	@Override
	public CannabisConsentByPropertyOwner cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the cannabis application ID of this cannabis consent by property owner.
	 *
	 * @return the cannabis application ID of this cannabis consent by property owner
	 */
	@Override
	public long getCannabisApplicationId() {
		return model.getCannabisApplicationId();
	}

	/**
	 * Returns the cannabis cpo ID of this cannabis consent by property owner.
	 *
	 * @return the cannabis cpo ID of this cannabis consent by property owner
	 */
	@Override
	public long getCannabisCPOId() {
		return model.getCannabisCPOId();
	}

	/**
	 * Returns the company ID of this cannabis consent by property owner.
	 *
	 * @return the company ID of this cannabis consent by property owner
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this cannabis consent by property owner.
	 *
	 * @return the create date of this cannabis consent by property owner
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description of intended use of this cannabis consent by property owner.
	 *
	 * @return the description of intended use of this cannabis consent by property owner
	 */
	@Override
	public String getDescriptionOfIntendedUse() {
		return model.getDescriptionOfIntendedUse();
	}

	/**
	 * Returns the description of property of this cannabis consent by property owner.
	 *
	 * @return the description of property of this cannabis consent by property owner
	 */
	@Override
	public String getDescriptionOfProperty() {
		return model.getDescriptionOfProperty();
	}

	/**
	 * Returns the group ID of this cannabis consent by property owner.
	 *
	 * @return the group ID of this cannabis consent by property owner
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the land type of this cannabis consent by property owner.
	 *
	 * @return the land type of this cannabis consent by property owner
	 */
	@Override
	public String getLandType() {
		return model.getLandType();
	}

	/**
	 * Returns the modified date of this cannabis consent by property owner.
	 *
	 * @return the modified date of this cannabis consent by property owner
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the owns property of this cannabis consent by property owner.
	 *
	 * @return the owns property of this cannabis consent by property owner
	 */
	@Override
	public String getOwnsProperty() {
		return model.getOwnsProperty();
	}

	/**
	 * Returns the primary key of this cannabis consent by property owner.
	 *
	 * @return the primary key of this cannabis consent by property owner
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the type of property of this cannabis consent by property owner.
	 *
	 * @return the type of property of this cannabis consent by property owner
	 */
	@Override
	public String getTypeOfProperty() {
		return model.getTypeOfProperty();
	}

	/**
	 * Returns the user ID of this cannabis consent by property owner.
	 *
	 * @return the user ID of this cannabis consent by property owner
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this cannabis consent by property owner.
	 *
	 * @return the user name of this cannabis consent by property owner
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this cannabis consent by property owner.
	 *
	 * @return the user uuid of this cannabis consent by property owner
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this cannabis consent by property owner.
	 *
	 * @return the uuid of this cannabis consent by property owner
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
	 * Sets the cannabis application ID of this cannabis consent by property owner.
	 *
	 * @param cannabisApplicationId the cannabis application ID of this cannabis consent by property owner
	 */
	@Override
	public void setCannabisApplicationId(long cannabisApplicationId) {
		model.setCannabisApplicationId(cannabisApplicationId);
	}

	/**
	 * Sets the cannabis cpo ID of this cannabis consent by property owner.
	 *
	 * @param cannabisCPOId the cannabis cpo ID of this cannabis consent by property owner
	 */
	@Override
	public void setCannabisCPOId(long cannabisCPOId) {
		model.setCannabisCPOId(cannabisCPOId);
	}

	/**
	 * Sets the company ID of this cannabis consent by property owner.
	 *
	 * @param companyId the company ID of this cannabis consent by property owner
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this cannabis consent by property owner.
	 *
	 * @param createDate the create date of this cannabis consent by property owner
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of intended use of this cannabis consent by property owner.
	 *
	 * @param descriptionOfIntendedUse the description of intended use of this cannabis consent by property owner
	 */
	@Override
	public void setDescriptionOfIntendedUse(String descriptionOfIntendedUse) {
		model.setDescriptionOfIntendedUse(descriptionOfIntendedUse);
	}

	/**
	 * Sets the description of property of this cannabis consent by property owner.
	 *
	 * @param descriptionOfProperty the description of property of this cannabis consent by property owner
	 */
	@Override
	public void setDescriptionOfProperty(String descriptionOfProperty) {
		model.setDescriptionOfProperty(descriptionOfProperty);
	}

	/**
	 * Sets the group ID of this cannabis consent by property owner.
	 *
	 * @param groupId the group ID of this cannabis consent by property owner
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the land type of this cannabis consent by property owner.
	 *
	 * @param landType the land type of this cannabis consent by property owner
	 */
	@Override
	public void setLandType(String landType) {
		model.setLandType(landType);
	}

	/**
	 * Sets the modified date of this cannabis consent by property owner.
	 *
	 * @param modifiedDate the modified date of this cannabis consent by property owner
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the owns property of this cannabis consent by property owner.
	 *
	 * @param ownsProperty the owns property of this cannabis consent by property owner
	 */
	@Override
	public void setOwnsProperty(String ownsProperty) {
		model.setOwnsProperty(ownsProperty);
	}

	/**
	 * Sets the primary key of this cannabis consent by property owner.
	 *
	 * @param primaryKey the primary key of this cannabis consent by property owner
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the type of property of this cannabis consent by property owner.
	 *
	 * @param typeOfProperty the type of property of this cannabis consent by property owner
	 */
	@Override
	public void setTypeOfProperty(String typeOfProperty) {
		model.setTypeOfProperty(typeOfProperty);
	}

	/**
	 * Sets the user ID of this cannabis consent by property owner.
	 *
	 * @param userId the user ID of this cannabis consent by property owner
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this cannabis consent by property owner.
	 *
	 * @param userName the user name of this cannabis consent by property owner
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this cannabis consent by property owner.
	 *
	 * @param userUuid the user uuid of this cannabis consent by property owner
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this cannabis consent by property owner.
	 *
	 * @param uuid the uuid of this cannabis consent by property owner
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
	protected CannabisConsentByPropertyOwnerWrapper wrap(
		CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner) {

		return new CannabisConsentByPropertyOwnerWrapper(
			cannabisConsentByPropertyOwner);
	}

}