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

package com.nbp.tourism.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TourismNewVehicleAddBox}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewVehicleAddBox
 * @generated
 */
public class TourismNewVehicleAddBoxWrapper
	extends BaseModelWrapper<TourismNewVehicleAddBox>
	implements ModelWrapper<TourismNewVehicleAddBox>, TourismNewVehicleAddBox {

	public TourismNewVehicleAddBoxWrapper(
		TourismNewVehicleAddBox tourismNewVehicleAddBox) {

		super(tourismNewVehicleAddBox);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tourismNewVehBoxId", getTourismNewVehBoxId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("newMake", getNewMake());
		attributes.put("newYear", getNewYear());
		attributes.put("newModel", getNewModel());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismNewVehBoxId = (Long)attributes.get("tourismNewVehBoxId");

		if (tourismNewVehBoxId != null) {
			setTourismNewVehBoxId(tourismNewVehBoxId);
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

		String newMake = (String)attributes.get("newMake");

		if (newMake != null) {
			setNewMake(newMake);
		}

		String newYear = (String)attributes.get("newYear");

		if (newYear != null) {
			setNewYear(newYear);
		}

		String newModel = (String)attributes.get("newModel");

		if (newModel != null) {
			setNewModel(newModel);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}
	}

	@Override
	public TourismNewVehicleAddBox cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this tourism new vehicle add box.
	 *
	 * @return the company ID of this tourism new vehicle add box
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism new vehicle add box.
	 *
	 * @return the create date of this tourism new vehicle add box
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this tourism new vehicle add box.
	 *
	 * @return the group ID of this tourism new vehicle add box
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism new vehicle add box.
	 *
	 * @return the modified date of this tourism new vehicle add box
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the new make of this tourism new vehicle add box.
	 *
	 * @return the new make of this tourism new vehicle add box
	 */
	@Override
	public String getNewMake() {
		return model.getNewMake();
	}

	/**
	 * Returns the new model of this tourism new vehicle add box.
	 *
	 * @return the new model of this tourism new vehicle add box
	 */
	@Override
	public String getNewModel() {
		return model.getNewModel();
	}

	/**
	 * Returns the new year of this tourism new vehicle add box.
	 *
	 * @return the new year of this tourism new vehicle add box
	 */
	@Override
	public String getNewYear() {
		return model.getNewYear();
	}

	/**
	 * Returns the primary key of this tourism new vehicle add box.
	 *
	 * @return the primary key of this tourism new vehicle add box
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tourism application ID of this tourism new vehicle add box.
	 *
	 * @return the tourism application ID of this tourism new vehicle add box
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism new veh box ID of this tourism new vehicle add box.
	 *
	 * @return the tourism new veh box ID of this tourism new vehicle add box
	 */
	@Override
	public long getTourismNewVehBoxId() {
		return model.getTourismNewVehBoxId();
	}

	/**
	 * Returns the user ID of this tourism new vehicle add box.
	 *
	 * @return the user ID of this tourism new vehicle add box
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism new vehicle add box.
	 *
	 * @return the user name of this tourism new vehicle add box
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism new vehicle add box.
	 *
	 * @return the user uuid of this tourism new vehicle add box
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
	 * Sets the company ID of this tourism new vehicle add box.
	 *
	 * @param companyId the company ID of this tourism new vehicle add box
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism new vehicle add box.
	 *
	 * @param createDate the create date of this tourism new vehicle add box
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this tourism new vehicle add box.
	 *
	 * @param groupId the group ID of this tourism new vehicle add box
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism new vehicle add box.
	 *
	 * @param modifiedDate the modified date of this tourism new vehicle add box
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the new make of this tourism new vehicle add box.
	 *
	 * @param newMake the new make of this tourism new vehicle add box
	 */
	@Override
	public void setNewMake(String newMake) {
		model.setNewMake(newMake);
	}

	/**
	 * Sets the new model of this tourism new vehicle add box.
	 *
	 * @param newModel the new model of this tourism new vehicle add box
	 */
	@Override
	public void setNewModel(String newModel) {
		model.setNewModel(newModel);
	}

	/**
	 * Sets the new year of this tourism new vehicle add box.
	 *
	 * @param newYear the new year of this tourism new vehicle add box
	 */
	@Override
	public void setNewYear(String newYear) {
		model.setNewYear(newYear);
	}

	/**
	 * Sets the primary key of this tourism new vehicle add box.
	 *
	 * @param primaryKey the primary key of this tourism new vehicle add box
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tourism application ID of this tourism new vehicle add box.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism new vehicle add box
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism new veh box ID of this tourism new vehicle add box.
	 *
	 * @param tourismNewVehBoxId the tourism new veh box ID of this tourism new vehicle add box
	 */
	@Override
	public void setTourismNewVehBoxId(long tourismNewVehBoxId) {
		model.setTourismNewVehBoxId(tourismNewVehBoxId);
	}

	/**
	 * Sets the user ID of this tourism new vehicle add box.
	 *
	 * @param userId the user ID of this tourism new vehicle add box
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism new vehicle add box.
	 *
	 * @param userName the user name of this tourism new vehicle add box
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism new vehicle add box.
	 *
	 * @param userUuid the user uuid of this tourism new vehicle add box
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected TourismNewVehicleAddBoxWrapper wrap(
		TourismNewVehicleAddBox tourismNewVehicleAddBox) {

		return new TourismNewVehicleAddBoxWrapper(tourismNewVehicleAddBox);
	}

}