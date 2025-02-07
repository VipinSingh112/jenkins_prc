/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CannabisInspection}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisInspection
 * @generated
 */
public class CannabisInspectionWrapper
	extends BaseModelWrapper<CannabisInspection>
	implements CannabisInspection, ModelWrapper<CannabisInspection> {

	public CannabisInspectionWrapper(CannabisInspection cannabisInspection) {
		super(cannabisInspection);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cannabisInspectionId", getCannabisInspectionId());
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
		attributes.put("cannabisApplicationId", getCannabisApplicationId());
		attributes.put("slotBookedByUser", getSlotBookedByUser());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cannabisInspectionId = (Long)attributes.get(
			"cannabisInspectionId");

		if (cannabisInspectionId != null) {
			setCannabisInspectionId(cannabisInspectionId);
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

		Long cannabisApplicationId = (Long)attributes.get(
			"cannabisApplicationId");

		if (cannabisApplicationId != null) {
			setCannabisApplicationId(cannabisApplicationId);
		}

		Long slotBookedByUser = (Long)attributes.get("slotBookedByUser");

		if (slotBookedByUser != null) {
			setSlotBookedByUser(slotBookedByUser);
		}
	}

	@Override
	public CannabisInspection cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the cannabis application ID of this cannabis inspection.
	 *
	 * @return the cannabis application ID of this cannabis inspection
	 */
	@Override
	public long getCannabisApplicationId() {
		return model.getCannabisApplicationId();
	}

	/**
	 * Returns the cannabis inspection ID of this cannabis inspection.
	 *
	 * @return the cannabis inspection ID of this cannabis inspection
	 */
	@Override
	public long getCannabisInspectionId() {
		return model.getCannabisInspectionId();
	}

	/**
	 * Returns the case ID of this cannabis inspection.
	 *
	 * @return the case ID of this cannabis inspection
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this cannabis inspection.
	 *
	 * @return the company ID of this cannabis inspection
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this cannabis inspection.
	 *
	 * @return the create date of this cannabis inspection
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this cannabis inspection.
	 *
	 * @return the group ID of this cannabis inspection
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the insection date range of this cannabis inspection.
	 *
	 * @return the insection date range of this cannabis inspection
	 */
	@Override
	public String getInsectionDateRange() {
		return model.getInsectionDateRange();
	}

	/**
	 * Returns the inspection date of this cannabis inspection.
	 *
	 * @return the inspection date of this cannabis inspection
	 */
	@Override
	public Date getInspectionDate() {
		return model.getInspectionDate();
	}

	/**
	 * Returns the invities of this cannabis inspection.
	 *
	 * @return the invities of this cannabis inspection
	 */
	@Override
	public String getInvities() {
		return model.getInvities();
	}

	/**
	 * Returns the location of this cannabis inspection.
	 *
	 * @return the location of this cannabis inspection
	 */
	@Override
	public String getLocation() {
		return model.getLocation();
	}

	/**
	 * Returns the modified date of this cannabis inspection.
	 *
	 * @return the modified date of this cannabis inspection
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this cannabis inspection.
	 *
	 * @return the primary key of this cannabis inspection
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the slot booked by user of this cannabis inspection.
	 *
	 * @return the slot booked by user of this cannabis inspection
	 */
	@Override
	public long getSlotBookedByUser() {
		return model.getSlotBookedByUser();
	}

	/**
	 * Returns the status of this cannabis inspection.
	 *
	 * @return the status of this cannabis inspection
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the updated by source of this cannabis inspection.
	 *
	 * @return the updated by source of this cannabis inspection
	 */
	@Override
	public String getUpdatedBySource() {
		return model.getUpdatedBySource();
	}

	/**
	 * Returns the user ID of this cannabis inspection.
	 *
	 * @return the user ID of this cannabis inspection
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this cannabis inspection.
	 *
	 * @return the user name of this cannabis inspection
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this cannabis inspection.
	 *
	 * @return the user uuid of this cannabis inspection
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
	 * Sets the cannabis application ID of this cannabis inspection.
	 *
	 * @param cannabisApplicationId the cannabis application ID of this cannabis inspection
	 */
	@Override
	public void setCannabisApplicationId(long cannabisApplicationId) {
		model.setCannabisApplicationId(cannabisApplicationId);
	}

	/**
	 * Sets the cannabis inspection ID of this cannabis inspection.
	 *
	 * @param cannabisInspectionId the cannabis inspection ID of this cannabis inspection
	 */
	@Override
	public void setCannabisInspectionId(long cannabisInspectionId) {
		model.setCannabisInspectionId(cannabisInspectionId);
	}

	/**
	 * Sets the case ID of this cannabis inspection.
	 *
	 * @param caseId the case ID of this cannabis inspection
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this cannabis inspection.
	 *
	 * @param companyId the company ID of this cannabis inspection
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this cannabis inspection.
	 *
	 * @param createDate the create date of this cannabis inspection
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this cannabis inspection.
	 *
	 * @param groupId the group ID of this cannabis inspection
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the insection date range of this cannabis inspection.
	 *
	 * @param insectionDateRange the insection date range of this cannabis inspection
	 */
	@Override
	public void setInsectionDateRange(String insectionDateRange) {
		model.setInsectionDateRange(insectionDateRange);
	}

	/**
	 * Sets the inspection date of this cannabis inspection.
	 *
	 * @param inspectionDate the inspection date of this cannabis inspection
	 */
	@Override
	public void setInspectionDate(Date inspectionDate) {
		model.setInspectionDate(inspectionDate);
	}

	/**
	 * Sets the invities of this cannabis inspection.
	 *
	 * @param invities the invities of this cannabis inspection
	 */
	@Override
	public void setInvities(String invities) {
		model.setInvities(invities);
	}

	/**
	 * Sets the location of this cannabis inspection.
	 *
	 * @param location the location of this cannabis inspection
	 */
	@Override
	public void setLocation(String location) {
		model.setLocation(location);
	}

	/**
	 * Sets the modified date of this cannabis inspection.
	 *
	 * @param modifiedDate the modified date of this cannabis inspection
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this cannabis inspection.
	 *
	 * @param primaryKey the primary key of this cannabis inspection
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the slot booked by user of this cannabis inspection.
	 *
	 * @param slotBookedByUser the slot booked by user of this cannabis inspection
	 */
	@Override
	public void setSlotBookedByUser(long slotBookedByUser) {
		model.setSlotBookedByUser(slotBookedByUser);
	}

	/**
	 * Sets the status of this cannabis inspection.
	 *
	 * @param status the status of this cannabis inspection
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the updated by source of this cannabis inspection.
	 *
	 * @param updatedBySource the updated by source of this cannabis inspection
	 */
	@Override
	public void setUpdatedBySource(String updatedBySource) {
		model.setUpdatedBySource(updatedBySource);
	}

	/**
	 * Sets the user ID of this cannabis inspection.
	 *
	 * @param userId the user ID of this cannabis inspection
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this cannabis inspection.
	 *
	 * @param userName the user name of this cannabis inspection
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this cannabis inspection.
	 *
	 * @param userUuid the user uuid of this cannabis inspection
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
	protected CannabisInspectionWrapper wrap(
		CannabisInspection cannabisInspection) {

		return new CannabisInspectionWrapper(cannabisInspection);
	}

}