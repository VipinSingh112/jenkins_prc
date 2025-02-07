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
 * This class is a wrapper for {@link TourismBonaVehicleAddBox}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaVehicleAddBox
 * @generated
 */
public class TourismBonaVehicleAddBoxWrapper
	extends BaseModelWrapper<TourismBonaVehicleAddBox>
	implements ModelWrapper<TourismBonaVehicleAddBox>,
			   TourismBonaVehicleAddBox {

	public TourismBonaVehicleAddBoxWrapper(
		TourismBonaVehicleAddBox tourismBonaVehicleAddBox) {

		super(tourismBonaVehicleAddBox);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tourismBonaVehBoxId", getTourismBonaVehBoxId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("bonaMake", getBonaMake());
		attributes.put("bonaYear", getBonaYear());
		attributes.put("bonaModel", getBonaModel());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismBonaVehBoxId = (Long)attributes.get("tourismBonaVehBoxId");

		if (tourismBonaVehBoxId != null) {
			setTourismBonaVehBoxId(tourismBonaVehBoxId);
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

		String bonaMake = (String)attributes.get("bonaMake");

		if (bonaMake != null) {
			setBonaMake(bonaMake);
		}

		String bonaYear = (String)attributes.get("bonaYear");

		if (bonaYear != null) {
			setBonaYear(bonaYear);
		}

		String bonaModel = (String)attributes.get("bonaModel");

		if (bonaModel != null) {
			setBonaModel(bonaModel);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}
	}

	@Override
	public TourismBonaVehicleAddBox cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the bona make of this tourism bona vehicle add box.
	 *
	 * @return the bona make of this tourism bona vehicle add box
	 */
	@Override
	public String getBonaMake() {
		return model.getBonaMake();
	}

	/**
	 * Returns the bona model of this tourism bona vehicle add box.
	 *
	 * @return the bona model of this tourism bona vehicle add box
	 */
	@Override
	public String getBonaModel() {
		return model.getBonaModel();
	}

	/**
	 * Returns the bona year of this tourism bona vehicle add box.
	 *
	 * @return the bona year of this tourism bona vehicle add box
	 */
	@Override
	public String getBonaYear() {
		return model.getBonaYear();
	}

	/**
	 * Returns the company ID of this tourism bona vehicle add box.
	 *
	 * @return the company ID of this tourism bona vehicle add box
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism bona vehicle add box.
	 *
	 * @return the create date of this tourism bona vehicle add box
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this tourism bona vehicle add box.
	 *
	 * @return the group ID of this tourism bona vehicle add box
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism bona vehicle add box.
	 *
	 * @return the modified date of this tourism bona vehicle add box
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this tourism bona vehicle add box.
	 *
	 * @return the primary key of this tourism bona vehicle add box
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tourism application ID of this tourism bona vehicle add box.
	 *
	 * @return the tourism application ID of this tourism bona vehicle add box
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism bona veh box ID of this tourism bona vehicle add box.
	 *
	 * @return the tourism bona veh box ID of this tourism bona vehicle add box
	 */
	@Override
	public long getTourismBonaVehBoxId() {
		return model.getTourismBonaVehBoxId();
	}

	/**
	 * Returns the user ID of this tourism bona vehicle add box.
	 *
	 * @return the user ID of this tourism bona vehicle add box
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism bona vehicle add box.
	 *
	 * @return the user name of this tourism bona vehicle add box
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism bona vehicle add box.
	 *
	 * @return the user uuid of this tourism bona vehicle add box
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
	 * Sets the bona make of this tourism bona vehicle add box.
	 *
	 * @param bonaMake the bona make of this tourism bona vehicle add box
	 */
	@Override
	public void setBonaMake(String bonaMake) {
		model.setBonaMake(bonaMake);
	}

	/**
	 * Sets the bona model of this tourism bona vehicle add box.
	 *
	 * @param bonaModel the bona model of this tourism bona vehicle add box
	 */
	@Override
	public void setBonaModel(String bonaModel) {
		model.setBonaModel(bonaModel);
	}

	/**
	 * Sets the bona year of this tourism bona vehicle add box.
	 *
	 * @param bonaYear the bona year of this tourism bona vehicle add box
	 */
	@Override
	public void setBonaYear(String bonaYear) {
		model.setBonaYear(bonaYear);
	}

	/**
	 * Sets the company ID of this tourism bona vehicle add box.
	 *
	 * @param companyId the company ID of this tourism bona vehicle add box
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism bona vehicle add box.
	 *
	 * @param createDate the create date of this tourism bona vehicle add box
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this tourism bona vehicle add box.
	 *
	 * @param groupId the group ID of this tourism bona vehicle add box
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism bona vehicle add box.
	 *
	 * @param modifiedDate the modified date of this tourism bona vehicle add box
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this tourism bona vehicle add box.
	 *
	 * @param primaryKey the primary key of this tourism bona vehicle add box
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tourism application ID of this tourism bona vehicle add box.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism bona vehicle add box
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism bona veh box ID of this tourism bona vehicle add box.
	 *
	 * @param tourismBonaVehBoxId the tourism bona veh box ID of this tourism bona vehicle add box
	 */
	@Override
	public void setTourismBonaVehBoxId(long tourismBonaVehBoxId) {
		model.setTourismBonaVehBoxId(tourismBonaVehBoxId);
	}

	/**
	 * Sets the user ID of this tourism bona vehicle add box.
	 *
	 * @param userId the user ID of this tourism bona vehicle add box
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism bona vehicle add box.
	 *
	 * @param userName the user name of this tourism bona vehicle add box
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism bona vehicle add box.
	 *
	 * @param userUuid the user uuid of this tourism bona vehicle add box
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected TourismBonaVehicleAddBoxWrapper wrap(
		TourismBonaVehicleAddBox tourismBonaVehicleAddBox) {

		return new TourismBonaVehicleAddBoxWrapper(tourismBonaVehicleAddBox);
	}

}