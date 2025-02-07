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

package com.nbp.farm.application.stages.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FarmInspection}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmInspection
 * @generated
 */
public class FarmInspectionWrapper
	extends BaseModelWrapper<FarmInspection>
	implements FarmInspection, ModelWrapper<FarmInspection> {

	public FarmInspectionWrapper(FarmInspection farmInspection) {
		super(farmInspection);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("farmInspectionId", getFarmInspectionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("inspectionDate", getInspectionDate());
		attributes.put("insectionDateRange", getInsectionDateRange());
		attributes.put("invities", getInvities());
		attributes.put("location", getLocation());
		attributes.put("updatedBySource", getUpdatedBySource());
		attributes.put("status", getStatus());
		attributes.put("caseId", getCaseId());
		attributes.put("farmApplicationId", getFarmApplicationId());
		attributes.put("slotBookedByUser", getSlotBookedByUser());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long farmInspectionId = (Long)attributes.get("farmInspectionId");

		if (farmInspectionId != null) {
			setFarmInspectionId(farmInspectionId);
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

		Date inspectionDate = (Date)attributes.get("inspectionDate");

		if (inspectionDate != null) {
			setInspectionDate(inspectionDate);
		}

		String insectionDateRange = (String)attributes.get(
			"insectionDateRange");

		if (insectionDateRange != null) {
			setInsectionDateRange(insectionDateRange);
		}

		String invities = (String)attributes.get("invities");

		if (invities != null) {
			setInvities(invities);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		String updatedBySource = (String)attributes.get("updatedBySource");

		if (updatedBySource != null) {
			setUpdatedBySource(updatedBySource);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		Long farmApplicationId = (Long)attributes.get("farmApplicationId");

		if (farmApplicationId != null) {
			setFarmApplicationId(farmApplicationId);
		}

		Long slotBookedByUser = (Long)attributes.get("slotBookedByUser");

		if (slotBookedByUser != null) {
			setSlotBookedByUser(slotBookedByUser);
		}
	}

	@Override
	public FarmInspection cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this farm inspection.
	 *
	 * @return the case ID of this farm inspection
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this farm inspection.
	 *
	 * @return the company ID of this farm inspection
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this farm inspection.
	 *
	 * @return the create date of this farm inspection
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the farm application ID of this farm inspection.
	 *
	 * @return the farm application ID of this farm inspection
	 */
	@Override
	public long getFarmApplicationId() {
		return model.getFarmApplicationId();
	}

	/**
	 * Returns the farm inspection ID of this farm inspection.
	 *
	 * @return the farm inspection ID of this farm inspection
	 */
	@Override
	public long getFarmInspectionId() {
		return model.getFarmInspectionId();
	}

	/**
	 * Returns the group ID of this farm inspection.
	 *
	 * @return the group ID of this farm inspection
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the insection date range of this farm inspection.
	 *
	 * @return the insection date range of this farm inspection
	 */
	@Override
	public String getInsectionDateRange() {
		return model.getInsectionDateRange();
	}

	/**
	 * Returns the inspection date of this farm inspection.
	 *
	 * @return the inspection date of this farm inspection
	 */
	@Override
	public Date getInspectionDate() {
		return model.getInspectionDate();
	}

	/**
	 * Returns the invities of this farm inspection.
	 *
	 * @return the invities of this farm inspection
	 */
	@Override
	public String getInvities() {
		return model.getInvities();
	}

	/**
	 * Returns the location of this farm inspection.
	 *
	 * @return the location of this farm inspection
	 */
	@Override
	public String getLocation() {
		return model.getLocation();
	}

	/**
	 * Returns the modified date of this farm inspection.
	 *
	 * @return the modified date of this farm inspection
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this farm inspection.
	 *
	 * @return the primary key of this farm inspection
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the slot booked by user of this farm inspection.
	 *
	 * @return the slot booked by user of this farm inspection
	 */
	@Override
	public long getSlotBookedByUser() {
		return model.getSlotBookedByUser();
	}

	/**
	 * Returns the status of this farm inspection.
	 *
	 * @return the status of this farm inspection
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the updated by source of this farm inspection.
	 *
	 * @return the updated by source of this farm inspection
	 */
	@Override
	public String getUpdatedBySource() {
		return model.getUpdatedBySource();
	}

	/**
	 * Returns the user ID of this farm inspection.
	 *
	 * @return the user ID of this farm inspection
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this farm inspection.
	 *
	 * @return the user name of this farm inspection
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this farm inspection.
	 *
	 * @return the user uuid of this farm inspection
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
	 * Sets the case ID of this farm inspection.
	 *
	 * @param caseId the case ID of this farm inspection
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this farm inspection.
	 *
	 * @param companyId the company ID of this farm inspection
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this farm inspection.
	 *
	 * @param createDate the create date of this farm inspection
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the farm application ID of this farm inspection.
	 *
	 * @param farmApplicationId the farm application ID of this farm inspection
	 */
	@Override
	public void setFarmApplicationId(long farmApplicationId) {
		model.setFarmApplicationId(farmApplicationId);
	}

	/**
	 * Sets the farm inspection ID of this farm inspection.
	 *
	 * @param farmInspectionId the farm inspection ID of this farm inspection
	 */
	@Override
	public void setFarmInspectionId(long farmInspectionId) {
		model.setFarmInspectionId(farmInspectionId);
	}

	/**
	 * Sets the group ID of this farm inspection.
	 *
	 * @param groupId the group ID of this farm inspection
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the insection date range of this farm inspection.
	 *
	 * @param insectionDateRange the insection date range of this farm inspection
	 */
	@Override
	public void setInsectionDateRange(String insectionDateRange) {
		model.setInsectionDateRange(insectionDateRange);
	}

	/**
	 * Sets the inspection date of this farm inspection.
	 *
	 * @param inspectionDate the inspection date of this farm inspection
	 */
	@Override
	public void setInspectionDate(Date inspectionDate) {
		model.setInspectionDate(inspectionDate);
	}

	/**
	 * Sets the invities of this farm inspection.
	 *
	 * @param invities the invities of this farm inspection
	 */
	@Override
	public void setInvities(String invities) {
		model.setInvities(invities);
	}

	/**
	 * Sets the location of this farm inspection.
	 *
	 * @param location the location of this farm inspection
	 */
	@Override
	public void setLocation(String location) {
		model.setLocation(location);
	}

	/**
	 * Sets the modified date of this farm inspection.
	 *
	 * @param modifiedDate the modified date of this farm inspection
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this farm inspection.
	 *
	 * @param primaryKey the primary key of this farm inspection
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the slot booked by user of this farm inspection.
	 *
	 * @param slotBookedByUser the slot booked by user of this farm inspection
	 */
	@Override
	public void setSlotBookedByUser(long slotBookedByUser) {
		model.setSlotBookedByUser(slotBookedByUser);
	}

	/**
	 * Sets the status of this farm inspection.
	 *
	 * @param status the status of this farm inspection
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the updated by source of this farm inspection.
	 *
	 * @param updatedBySource the updated by source of this farm inspection
	 */
	@Override
	public void setUpdatedBySource(String updatedBySource) {
		model.setUpdatedBySource(updatedBySource);
	}

	/**
	 * Sets the user ID of this farm inspection.
	 *
	 * @param userId the user ID of this farm inspection
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this farm inspection.
	 *
	 * @param userName the user name of this farm inspection
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this farm inspection.
	 *
	 * @param userUuid the user uuid of this farm inspection
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected FarmInspectionWrapper wrap(FarmInspection farmInspection) {
		return new FarmInspectionWrapper(farmInspection);
	}

}