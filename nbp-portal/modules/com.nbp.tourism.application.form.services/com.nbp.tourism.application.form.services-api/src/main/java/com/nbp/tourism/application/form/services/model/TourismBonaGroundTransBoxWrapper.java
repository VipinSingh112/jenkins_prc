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
 * This class is a wrapper for {@link TourismBonaGroundTransBox}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransBox
 * @generated
 */
public class TourismBonaGroundTransBoxWrapper
	extends BaseModelWrapper<TourismBonaGroundTransBox>
	implements ModelWrapper<TourismBonaGroundTransBox>,
			   TourismBonaGroundTransBox {

	public TourismBonaGroundTransBoxWrapper(
		TourismBonaGroundTransBox tourismBonaGroundTransBox) {

		super(tourismBonaGroundTransBox);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tourismVehicleBoxBonaId", getTourismVehicleBoxBonaId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("vehicleMakeBona", getVehicleMakeBona());
		attributes.put("vehiclemodelBona", getVehiclemodelBona());
		attributes.put("vehicleYearBona", getVehicleYearBona());
		attributes.put("vehicleCounter", getVehicleCounter());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismVehicleBoxBonaId = (Long)attributes.get(
			"tourismVehicleBoxBonaId");

		if (tourismVehicleBoxBonaId != null) {
			setTourismVehicleBoxBonaId(tourismVehicleBoxBonaId);
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

		String vehicleMakeBona = (String)attributes.get("vehicleMakeBona");

		if (vehicleMakeBona != null) {
			setVehicleMakeBona(vehicleMakeBona);
		}

		String vehiclemodelBona = (String)attributes.get("vehiclemodelBona");

		if (vehiclemodelBona != null) {
			setVehiclemodelBona(vehiclemodelBona);
		}

		String vehicleYearBona = (String)attributes.get("vehicleYearBona");

		if (vehicleYearBona != null) {
			setVehicleYearBona(vehicleYearBona);
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
	public TourismBonaGroundTransBox cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this tourism bona ground trans box.
	 *
	 * @return the company ID of this tourism bona ground trans box
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism bona ground trans box.
	 *
	 * @return the create date of this tourism bona ground trans box
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this tourism bona ground trans box.
	 *
	 * @return the group ID of this tourism bona ground trans box
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism bona ground trans box.
	 *
	 * @return the modified date of this tourism bona ground trans box
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this tourism bona ground trans box.
	 *
	 * @return the primary key of this tourism bona ground trans box
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tourism application ID of this tourism bona ground trans box.
	 *
	 * @return the tourism application ID of this tourism bona ground trans box
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism vehicle box bona ID of this tourism bona ground trans box.
	 *
	 * @return the tourism vehicle box bona ID of this tourism bona ground trans box
	 */
	@Override
	public long getTourismVehicleBoxBonaId() {
		return model.getTourismVehicleBoxBonaId();
	}

	/**
	 * Returns the user ID of this tourism bona ground trans box.
	 *
	 * @return the user ID of this tourism bona ground trans box
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism bona ground trans box.
	 *
	 * @return the user name of this tourism bona ground trans box
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism bona ground trans box.
	 *
	 * @return the user uuid of this tourism bona ground trans box
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the vehicle counter of this tourism bona ground trans box.
	 *
	 * @return the vehicle counter of this tourism bona ground trans box
	 */
	@Override
	public String getVehicleCounter() {
		return model.getVehicleCounter();
	}

	/**
	 * Returns the vehicle make bona of this tourism bona ground trans box.
	 *
	 * @return the vehicle make bona of this tourism bona ground trans box
	 */
	@Override
	public String getVehicleMakeBona() {
		return model.getVehicleMakeBona();
	}

	/**
	 * Returns the vehiclemodel bona of this tourism bona ground trans box.
	 *
	 * @return the vehiclemodel bona of this tourism bona ground trans box
	 */
	@Override
	public String getVehiclemodelBona() {
		return model.getVehiclemodelBona();
	}

	/**
	 * Returns the vehicle year bona of this tourism bona ground trans box.
	 *
	 * @return the vehicle year bona of this tourism bona ground trans box
	 */
	@Override
	public String getVehicleYearBona() {
		return model.getVehicleYearBona();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this tourism bona ground trans box.
	 *
	 * @param companyId the company ID of this tourism bona ground trans box
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism bona ground trans box.
	 *
	 * @param createDate the create date of this tourism bona ground trans box
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this tourism bona ground trans box.
	 *
	 * @param groupId the group ID of this tourism bona ground trans box
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism bona ground trans box.
	 *
	 * @param modifiedDate the modified date of this tourism bona ground trans box
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this tourism bona ground trans box.
	 *
	 * @param primaryKey the primary key of this tourism bona ground trans box
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tourism application ID of this tourism bona ground trans box.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism bona ground trans box
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism vehicle box bona ID of this tourism bona ground trans box.
	 *
	 * @param tourismVehicleBoxBonaId the tourism vehicle box bona ID of this tourism bona ground trans box
	 */
	@Override
	public void setTourismVehicleBoxBonaId(long tourismVehicleBoxBonaId) {
		model.setTourismVehicleBoxBonaId(tourismVehicleBoxBonaId);
	}

	/**
	 * Sets the user ID of this tourism bona ground trans box.
	 *
	 * @param userId the user ID of this tourism bona ground trans box
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism bona ground trans box.
	 *
	 * @param userName the user name of this tourism bona ground trans box
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism bona ground trans box.
	 *
	 * @param userUuid the user uuid of this tourism bona ground trans box
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the vehicle counter of this tourism bona ground trans box.
	 *
	 * @param vehicleCounter the vehicle counter of this tourism bona ground trans box
	 */
	@Override
	public void setVehicleCounter(String vehicleCounter) {
		model.setVehicleCounter(vehicleCounter);
	}

	/**
	 * Sets the vehicle make bona of this tourism bona ground trans box.
	 *
	 * @param vehicleMakeBona the vehicle make bona of this tourism bona ground trans box
	 */
	@Override
	public void setVehicleMakeBona(String vehicleMakeBona) {
		model.setVehicleMakeBona(vehicleMakeBona);
	}

	/**
	 * Sets the vehiclemodel bona of this tourism bona ground trans box.
	 *
	 * @param vehiclemodelBona the vehiclemodel bona of this tourism bona ground trans box
	 */
	@Override
	public void setVehiclemodelBona(String vehiclemodelBona) {
		model.setVehiclemodelBona(vehiclemodelBona);
	}

	/**
	 * Sets the vehicle year bona of this tourism bona ground trans box.
	 *
	 * @param vehicleYearBona the vehicle year bona of this tourism bona ground trans box
	 */
	@Override
	public void setVehicleYearBona(String vehicleYearBona) {
		model.setVehicleYearBona(vehicleYearBona);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected TourismBonaGroundTransBoxWrapper wrap(
		TourismBonaGroundTransBox tourismBonaGroundTransBox) {

		return new TourismBonaGroundTransBoxWrapper(tourismBonaGroundTransBox);
	}

}