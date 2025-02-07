/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TourismGroundTransBox}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismGroundTransBox
 * @generated
 */
public class TourismGroundTransBoxWrapper
	extends BaseModelWrapper<TourismGroundTransBox>
	implements ModelWrapper<TourismGroundTransBox>, TourismGroundTransBox {

	public TourismGroundTransBoxWrapper(
		TourismGroundTransBox tourismGroundTransBox) {

		super(tourismGroundTransBox);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tourismVehicleBoxId", getTourismVehicleBoxId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("vehicleMake", getVehicleMake());
		attributes.put("vehiclemodel", getVehiclemodel());
		attributes.put("vehicleYear", getVehicleYear());
		attributes.put("vehicleCounter", getVehicleCounter());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismVehicleBoxId = (Long)attributes.get("tourismVehicleBoxId");

		if (tourismVehicleBoxId != null) {
			setTourismVehicleBoxId(tourismVehicleBoxId);
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

		String vehicleMake = (String)attributes.get("vehicleMake");

		if (vehicleMake != null) {
			setVehicleMake(vehicleMake);
		}

		String vehiclemodel = (String)attributes.get("vehiclemodel");

		if (vehiclemodel != null) {
			setVehiclemodel(vehiclemodel);
		}

		String vehicleYear = (String)attributes.get("vehicleYear");

		if (vehicleYear != null) {
			setVehicleYear(vehicleYear);
		}

		String vehicleCounter = (String)attributes.get("vehicleCounter");

		if (vehicleCounter != null) {
			setVehicleCounter(vehicleCounter);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}
	}

	@Override
	public TourismGroundTransBox cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this tourism ground trans box.
	 *
	 * @return the company ID of this tourism ground trans box
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism ground trans box.
	 *
	 * @return the create date of this tourism ground trans box
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this tourism ground trans box.
	 *
	 * @return the group ID of this tourism ground trans box
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism ground trans box.
	 *
	 * @return the modified date of this tourism ground trans box
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this tourism ground trans box.
	 *
	 * @return the primary key of this tourism ground trans box
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tourism application ID of this tourism ground trans box.
	 *
	 * @return the tourism application ID of this tourism ground trans box
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism vehicle box ID of this tourism ground trans box.
	 *
	 * @return the tourism vehicle box ID of this tourism ground trans box
	 */
	@Override
	public long getTourismVehicleBoxId() {
		return model.getTourismVehicleBoxId();
	}

	/**
	 * Returns the user ID of this tourism ground trans box.
	 *
	 * @return the user ID of this tourism ground trans box
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism ground trans box.
	 *
	 * @return the user name of this tourism ground trans box
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism ground trans box.
	 *
	 * @return the user uuid of this tourism ground trans box
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the vehicle counter of this tourism ground trans box.
	 *
	 * @return the vehicle counter of this tourism ground trans box
	 */
	@Override
	public String getVehicleCounter() {
		return model.getVehicleCounter();
	}

	/**
	 * Returns the vehicle make of this tourism ground trans box.
	 *
	 * @return the vehicle make of this tourism ground trans box
	 */
	@Override
	public String getVehicleMake() {
		return model.getVehicleMake();
	}

	/**
	 * Returns the vehiclemodel of this tourism ground trans box.
	 *
	 * @return the vehiclemodel of this tourism ground trans box
	 */
	@Override
	public String getVehiclemodel() {
		return model.getVehiclemodel();
	}

	/**
	 * Returns the vehicle year of this tourism ground trans box.
	 *
	 * @return the vehicle year of this tourism ground trans box
	 */
	@Override
	public String getVehicleYear() {
		return model.getVehicleYear();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this tourism ground trans box.
	 *
	 * @param companyId the company ID of this tourism ground trans box
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism ground trans box.
	 *
	 * @param createDate the create date of this tourism ground trans box
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this tourism ground trans box.
	 *
	 * @param groupId the group ID of this tourism ground trans box
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism ground trans box.
	 *
	 * @param modifiedDate the modified date of this tourism ground trans box
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this tourism ground trans box.
	 *
	 * @param primaryKey the primary key of this tourism ground trans box
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tourism application ID of this tourism ground trans box.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism ground trans box
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism vehicle box ID of this tourism ground trans box.
	 *
	 * @param tourismVehicleBoxId the tourism vehicle box ID of this tourism ground trans box
	 */
	@Override
	public void setTourismVehicleBoxId(long tourismVehicleBoxId) {
		model.setTourismVehicleBoxId(tourismVehicleBoxId);
	}

	/**
	 * Sets the user ID of this tourism ground trans box.
	 *
	 * @param userId the user ID of this tourism ground trans box
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism ground trans box.
	 *
	 * @param userName the user name of this tourism ground trans box
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism ground trans box.
	 *
	 * @param userUuid the user uuid of this tourism ground trans box
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the vehicle counter of this tourism ground trans box.
	 *
	 * @param vehicleCounter the vehicle counter of this tourism ground trans box
	 */
	@Override
	public void setVehicleCounter(String vehicleCounter) {
		model.setVehicleCounter(vehicleCounter);
	}

	/**
	 * Sets the vehicle make of this tourism ground trans box.
	 *
	 * @param vehicleMake the vehicle make of this tourism ground trans box
	 */
	@Override
	public void setVehicleMake(String vehicleMake) {
		model.setVehicleMake(vehicleMake);
	}

	/**
	 * Sets the vehiclemodel of this tourism ground trans box.
	 *
	 * @param vehiclemodel the vehiclemodel of this tourism ground trans box
	 */
	@Override
	public void setVehiclemodel(String vehiclemodel) {
		model.setVehiclemodel(vehiclemodel);
	}

	/**
	 * Sets the vehicle year of this tourism ground trans box.
	 *
	 * @param vehicleYear the vehicle year of this tourism ground trans box
	 */
	@Override
	public void setVehicleYear(String vehicleYear) {
		model.setVehicleYear(vehicleYear);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected TourismGroundTransBoxWrapper wrap(
		TourismGroundTransBox tourismGroundTransBox) {

		return new TourismGroundTransBoxWrapper(tourismGroundTransBox);
	}

}