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

package com.nbp.farm.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FarmerProperty}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerProperty
 * @generated
 */
public class FarmerPropertyWrapper
	extends BaseModelWrapper<FarmerProperty>
	implements FarmerProperty, ModelWrapper<FarmerProperty> {

	public FarmerPropertyWrapper(FarmerProperty farmerProperty) {
		super(farmerProperty);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("farmerPropertyId", getFarmerPropertyId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("property01Extension", getProperty01Extension());
		attributes.put("property01District", getProperty01District());
		attributes.put("property01Tenure", getProperty01Tenure());
		attributes.put("property01Status", getProperty01Status());
		attributes.put("property01Size", getProperty01Size());
		attributes.put("property01Usage", getProperty01Usage());
		attributes.put("property01Volume", getProperty01Volume());
		attributes.put("property01Folio", getProperty01Folio());
		attributes.put(
			"property01DistanceFromRoad", getProperty01DistanceFromRoad());
		attributes.put("propertyId02", getPropertyId02());
		attributes.put("propertyId03", getPropertyId03());
		attributes.put("propertyCounter", getPropertyCounter());
		attributes.put("remarks", getRemarks());
		attributes.put("farmerApplicationId", getFarmerApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long farmerPropertyId = (Long)attributes.get("farmerPropertyId");

		if (farmerPropertyId != null) {
			setFarmerPropertyId(farmerPropertyId);
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

		String property01Extension = (String)attributes.get(
			"property01Extension");

		if (property01Extension != null) {
			setProperty01Extension(property01Extension);
		}

		String property01District = (String)attributes.get(
			"property01District");

		if (property01District != null) {
			setProperty01District(property01District);
		}

		String property01Tenure = (String)attributes.get("property01Tenure");

		if (property01Tenure != null) {
			setProperty01Tenure(property01Tenure);
		}

		String property01Status = (String)attributes.get("property01Status");

		if (property01Status != null) {
			setProperty01Status(property01Status);
		}

		String property01Size = (String)attributes.get("property01Size");

		if (property01Size != null) {
			setProperty01Size(property01Size);
		}

		String property01Usage = (String)attributes.get("property01Usage");

		if (property01Usage != null) {
			setProperty01Usage(property01Usage);
		}

		String property01Volume = (String)attributes.get("property01Volume");

		if (property01Volume != null) {
			setProperty01Volume(property01Volume);
		}

		String property01Folio = (String)attributes.get("property01Folio");

		if (property01Folio != null) {
			setProperty01Folio(property01Folio);
		}

		String property01DistanceFromRoad = (String)attributes.get(
			"property01DistanceFromRoad");

		if (property01DistanceFromRoad != null) {
			setProperty01DistanceFromRoad(property01DistanceFromRoad);
		}

		String propertyId02 = (String)attributes.get("propertyId02");

		if (propertyId02 != null) {
			setPropertyId02(propertyId02);
		}

		String propertyId03 = (String)attributes.get("propertyId03");

		if (propertyId03 != null) {
			setPropertyId03(propertyId03);
		}

		String propertyCounter = (String)attributes.get("propertyCounter");

		if (propertyCounter != null) {
			setPropertyCounter(propertyCounter);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		Long farmerApplicationId = (Long)attributes.get("farmerApplicationId");

		if (farmerApplicationId != null) {
			setFarmerApplicationId(farmerApplicationId);
		}
	}

	@Override
	public FarmerProperty cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this farmer property.
	 *
	 * @return the company ID of this farmer property
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this farmer property.
	 *
	 * @return the create date of this farmer property
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the farmer application ID of this farmer property.
	 *
	 * @return the farmer application ID of this farmer property
	 */
	@Override
	public long getFarmerApplicationId() {
		return model.getFarmerApplicationId();
	}

	/**
	 * Returns the farmer property ID of this farmer property.
	 *
	 * @return the farmer property ID of this farmer property
	 */
	@Override
	public long getFarmerPropertyId() {
		return model.getFarmerPropertyId();
	}

	/**
	 * Returns the group ID of this farmer property.
	 *
	 * @return the group ID of this farmer property
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this farmer property.
	 *
	 * @return the modified date of this farmer property
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this farmer property.
	 *
	 * @return the primary key of this farmer property
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the property01 distance from road of this farmer property.
	 *
	 * @return the property01 distance from road of this farmer property
	 */
	@Override
	public String getProperty01DistanceFromRoad() {
		return model.getProperty01DistanceFromRoad();
	}

	/**
	 * Returns the property01 district of this farmer property.
	 *
	 * @return the property01 district of this farmer property
	 */
	@Override
	public String getProperty01District() {
		return model.getProperty01District();
	}

	/**
	 * Returns the property01 extension of this farmer property.
	 *
	 * @return the property01 extension of this farmer property
	 */
	@Override
	public String getProperty01Extension() {
		return model.getProperty01Extension();
	}

	/**
	 * Returns the property01 folio of this farmer property.
	 *
	 * @return the property01 folio of this farmer property
	 */
	@Override
	public String getProperty01Folio() {
		return model.getProperty01Folio();
	}

	/**
	 * Returns the property01 size of this farmer property.
	 *
	 * @return the property01 size of this farmer property
	 */
	@Override
	public String getProperty01Size() {
		return model.getProperty01Size();
	}

	/**
	 * Returns the property01 status of this farmer property.
	 *
	 * @return the property01 status of this farmer property
	 */
	@Override
	public String getProperty01Status() {
		return model.getProperty01Status();
	}

	/**
	 * Returns the property01 tenure of this farmer property.
	 *
	 * @return the property01 tenure of this farmer property
	 */
	@Override
	public String getProperty01Tenure() {
		return model.getProperty01Tenure();
	}

	/**
	 * Returns the property01 usage of this farmer property.
	 *
	 * @return the property01 usage of this farmer property
	 */
	@Override
	public String getProperty01Usage() {
		return model.getProperty01Usage();
	}

	/**
	 * Returns the property01 volume of this farmer property.
	 *
	 * @return the property01 volume of this farmer property
	 */
	@Override
	public String getProperty01Volume() {
		return model.getProperty01Volume();
	}

	/**
	 * Returns the property counter of this farmer property.
	 *
	 * @return the property counter of this farmer property
	 */
	@Override
	public String getPropertyCounter() {
		return model.getPropertyCounter();
	}

	/**
	 * Returns the property id02 of this farmer property.
	 *
	 * @return the property id02 of this farmer property
	 */
	@Override
	public String getPropertyId02() {
		return model.getPropertyId02();
	}

	/**
	 * Returns the property id03 of this farmer property.
	 *
	 * @return the property id03 of this farmer property
	 */
	@Override
	public String getPropertyId03() {
		return model.getPropertyId03();
	}

	/**
	 * Returns the remarks of this farmer property.
	 *
	 * @return the remarks of this farmer property
	 */
	@Override
	public String getRemarks() {
		return model.getRemarks();
	}

	/**
	 * Returns the user ID of this farmer property.
	 *
	 * @return the user ID of this farmer property
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this farmer property.
	 *
	 * @return the user name of this farmer property
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this farmer property.
	 *
	 * @return the user uuid of this farmer property
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
	 * Sets the company ID of this farmer property.
	 *
	 * @param companyId the company ID of this farmer property
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this farmer property.
	 *
	 * @param createDate the create date of this farmer property
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the farmer application ID of this farmer property.
	 *
	 * @param farmerApplicationId the farmer application ID of this farmer property
	 */
	@Override
	public void setFarmerApplicationId(long farmerApplicationId) {
		model.setFarmerApplicationId(farmerApplicationId);
	}

	/**
	 * Sets the farmer property ID of this farmer property.
	 *
	 * @param farmerPropertyId the farmer property ID of this farmer property
	 */
	@Override
	public void setFarmerPropertyId(long farmerPropertyId) {
		model.setFarmerPropertyId(farmerPropertyId);
	}

	/**
	 * Sets the group ID of this farmer property.
	 *
	 * @param groupId the group ID of this farmer property
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this farmer property.
	 *
	 * @param modifiedDate the modified date of this farmer property
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this farmer property.
	 *
	 * @param primaryKey the primary key of this farmer property
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the property01 distance from road of this farmer property.
	 *
	 * @param property01DistanceFromRoad the property01 distance from road of this farmer property
	 */
	@Override
	public void setProperty01DistanceFromRoad(
		String property01DistanceFromRoad) {

		model.setProperty01DistanceFromRoad(property01DistanceFromRoad);
	}

	/**
	 * Sets the property01 district of this farmer property.
	 *
	 * @param property01District the property01 district of this farmer property
	 */
	@Override
	public void setProperty01District(String property01District) {
		model.setProperty01District(property01District);
	}

	/**
	 * Sets the property01 extension of this farmer property.
	 *
	 * @param property01Extension the property01 extension of this farmer property
	 */
	@Override
	public void setProperty01Extension(String property01Extension) {
		model.setProperty01Extension(property01Extension);
	}

	/**
	 * Sets the property01 folio of this farmer property.
	 *
	 * @param property01Folio the property01 folio of this farmer property
	 */
	@Override
	public void setProperty01Folio(String property01Folio) {
		model.setProperty01Folio(property01Folio);
	}

	/**
	 * Sets the property01 size of this farmer property.
	 *
	 * @param property01Size the property01 size of this farmer property
	 */
	@Override
	public void setProperty01Size(String property01Size) {
		model.setProperty01Size(property01Size);
	}

	/**
	 * Sets the property01 status of this farmer property.
	 *
	 * @param property01Status the property01 status of this farmer property
	 */
	@Override
	public void setProperty01Status(String property01Status) {
		model.setProperty01Status(property01Status);
	}

	/**
	 * Sets the property01 tenure of this farmer property.
	 *
	 * @param property01Tenure the property01 tenure of this farmer property
	 */
	@Override
	public void setProperty01Tenure(String property01Tenure) {
		model.setProperty01Tenure(property01Tenure);
	}

	/**
	 * Sets the property01 usage of this farmer property.
	 *
	 * @param property01Usage the property01 usage of this farmer property
	 */
	@Override
	public void setProperty01Usage(String property01Usage) {
		model.setProperty01Usage(property01Usage);
	}

	/**
	 * Sets the property01 volume of this farmer property.
	 *
	 * @param property01Volume the property01 volume of this farmer property
	 */
	@Override
	public void setProperty01Volume(String property01Volume) {
		model.setProperty01Volume(property01Volume);
	}

	/**
	 * Sets the property counter of this farmer property.
	 *
	 * @param propertyCounter the property counter of this farmer property
	 */
	@Override
	public void setPropertyCounter(String propertyCounter) {
		model.setPropertyCounter(propertyCounter);
	}

	/**
	 * Sets the property id02 of this farmer property.
	 *
	 * @param propertyId02 the property id02 of this farmer property
	 */
	@Override
	public void setPropertyId02(String propertyId02) {
		model.setPropertyId02(propertyId02);
	}

	/**
	 * Sets the property id03 of this farmer property.
	 *
	 * @param propertyId03 the property id03 of this farmer property
	 */
	@Override
	public void setPropertyId03(String propertyId03) {
		model.setPropertyId03(propertyId03);
	}

	/**
	 * Sets the remarks of this farmer property.
	 *
	 * @param remarks the remarks of this farmer property
	 */
	@Override
	public void setRemarks(String remarks) {
		model.setRemarks(remarks);
	}

	/**
	 * Sets the user ID of this farmer property.
	 *
	 * @param userId the user ID of this farmer property
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this farmer property.
	 *
	 * @param userName the user name of this farmer property
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this farmer property.
	 *
	 * @param userUuid the user uuid of this farmer property
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected FarmerPropertyWrapper wrap(FarmerProperty farmerProperty) {
		return new FarmerPropertyWrapper(farmerProperty);
	}

}