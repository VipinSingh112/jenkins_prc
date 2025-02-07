/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AgricultureInspection}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureInspection
 * @generated
 */
public class AgricultureInspectionWrapper
	extends BaseModelWrapper<AgricultureInspection>
	implements AgricultureInspection, ModelWrapper<AgricultureInspection> {

	public AgricultureInspectionWrapper(
		AgricultureInspection agricultureInspection) {

		super(agricultureInspection);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("agricultureInspectionId", getAgricultureInspectionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("dateOfInspection", getDateOfInspection());
		attributes.put("insectionDateRange", getInsectionDateRange());
		attributes.put("invities", getInvities());
		attributes.put("location", getLocation());
		attributes.put("updatedBySource", getUpdatedBySource());
		attributes.put("status", getStatus());
		attributes.put("agriApplicationId", getAgriApplicationId());
		attributes.put("slotBookedByUser", getSlotBookedByUser());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long agricultureInspectionId = (Long)attributes.get(
			"agricultureInspectionId");

		if (agricultureInspectionId != null) {
			setAgricultureInspectionId(agricultureInspectionId);
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

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		Date dateOfInspection = (Date)attributes.get("dateOfInspection");

		if (dateOfInspection != null) {
			setDateOfInspection(dateOfInspection);
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

		Long agriApplicationId = (Long)attributes.get("agriApplicationId");

		if (agriApplicationId != null) {
			setAgriApplicationId(agriApplicationId);
		}

		Long slotBookedByUser = (Long)attributes.get("slotBookedByUser");

		if (slotBookedByUser != null) {
			setSlotBookedByUser(slotBookedByUser);
		}
	}

	@Override
	public AgricultureInspection cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the agri application ID of this agriculture inspection.
	 *
	 * @return the agri application ID of this agriculture inspection
	 */
	@Override
	public long getAgriApplicationId() {
		return model.getAgriApplicationId();
	}

	/**
	 * Returns the agriculture inspection ID of this agriculture inspection.
	 *
	 * @return the agriculture inspection ID of this agriculture inspection
	 */
	@Override
	public long getAgricultureInspectionId() {
		return model.getAgricultureInspectionId();
	}

	/**
	 * Returns the case ID of this agriculture inspection.
	 *
	 * @return the case ID of this agriculture inspection
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this agriculture inspection.
	 *
	 * @return the company ID of this agriculture inspection
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this agriculture inspection.
	 *
	 * @return the create date of this agriculture inspection
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of inspection of this agriculture inspection.
	 *
	 * @return the date of inspection of this agriculture inspection
	 */
	@Override
	public Date getDateOfInspection() {
		return model.getDateOfInspection();
	}

	/**
	 * Returns the group ID of this agriculture inspection.
	 *
	 * @return the group ID of this agriculture inspection
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the insection date range of this agriculture inspection.
	 *
	 * @return the insection date range of this agriculture inspection
	 */
	@Override
	public String getInsectionDateRange() {
		return model.getInsectionDateRange();
	}

	/**
	 * Returns the invities of this agriculture inspection.
	 *
	 * @return the invities of this agriculture inspection
	 */
	@Override
	public String getInvities() {
		return model.getInvities();
	}

	/**
	 * Returns the location of this agriculture inspection.
	 *
	 * @return the location of this agriculture inspection
	 */
	@Override
	public String getLocation() {
		return model.getLocation();
	}

	/**
	 * Returns the modified date of this agriculture inspection.
	 *
	 * @return the modified date of this agriculture inspection
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this agriculture inspection.
	 *
	 * @return the primary key of this agriculture inspection
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the slot booked by user of this agriculture inspection.
	 *
	 * @return the slot booked by user of this agriculture inspection
	 */
	@Override
	public long getSlotBookedByUser() {
		return model.getSlotBookedByUser();
	}

	/**
	 * Returns the status of this agriculture inspection.
	 *
	 * @return the status of this agriculture inspection
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the updated by source of this agriculture inspection.
	 *
	 * @return the updated by source of this agriculture inspection
	 */
	@Override
	public String getUpdatedBySource() {
		return model.getUpdatedBySource();
	}

	/**
	 * Returns the user ID of this agriculture inspection.
	 *
	 * @return the user ID of this agriculture inspection
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this agriculture inspection.
	 *
	 * @return the user name of this agriculture inspection
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this agriculture inspection.
	 *
	 * @return the user uuid of this agriculture inspection
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
	 * Sets the agri application ID of this agriculture inspection.
	 *
	 * @param agriApplicationId the agri application ID of this agriculture inspection
	 */
	@Override
	public void setAgriApplicationId(long agriApplicationId) {
		model.setAgriApplicationId(agriApplicationId);
	}

	/**
	 * Sets the agriculture inspection ID of this agriculture inspection.
	 *
	 * @param agricultureInspectionId the agriculture inspection ID of this agriculture inspection
	 */
	@Override
	public void setAgricultureInspectionId(long agricultureInspectionId) {
		model.setAgricultureInspectionId(agricultureInspectionId);
	}

	/**
	 * Sets the case ID of this agriculture inspection.
	 *
	 * @param caseId the case ID of this agriculture inspection
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this agriculture inspection.
	 *
	 * @param companyId the company ID of this agriculture inspection
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this agriculture inspection.
	 *
	 * @param createDate the create date of this agriculture inspection
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of inspection of this agriculture inspection.
	 *
	 * @param dateOfInspection the date of inspection of this agriculture inspection
	 */
	@Override
	public void setDateOfInspection(Date dateOfInspection) {
		model.setDateOfInspection(dateOfInspection);
	}

	/**
	 * Sets the group ID of this agriculture inspection.
	 *
	 * @param groupId the group ID of this agriculture inspection
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the insection date range of this agriculture inspection.
	 *
	 * @param insectionDateRange the insection date range of this agriculture inspection
	 */
	@Override
	public void setInsectionDateRange(String insectionDateRange) {
		model.setInsectionDateRange(insectionDateRange);
	}

	/**
	 * Sets the invities of this agriculture inspection.
	 *
	 * @param invities the invities of this agriculture inspection
	 */
	@Override
	public void setInvities(String invities) {
		model.setInvities(invities);
	}

	/**
	 * Sets the location of this agriculture inspection.
	 *
	 * @param location the location of this agriculture inspection
	 */
	@Override
	public void setLocation(String location) {
		model.setLocation(location);
	}

	/**
	 * Sets the modified date of this agriculture inspection.
	 *
	 * @param modifiedDate the modified date of this agriculture inspection
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this agriculture inspection.
	 *
	 * @param primaryKey the primary key of this agriculture inspection
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the slot booked by user of this agriculture inspection.
	 *
	 * @param slotBookedByUser the slot booked by user of this agriculture inspection
	 */
	@Override
	public void setSlotBookedByUser(long slotBookedByUser) {
		model.setSlotBookedByUser(slotBookedByUser);
	}

	/**
	 * Sets the status of this agriculture inspection.
	 *
	 * @param status the status of this agriculture inspection
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the updated by source of this agriculture inspection.
	 *
	 * @param updatedBySource the updated by source of this agriculture inspection
	 */
	@Override
	public void setUpdatedBySource(String updatedBySource) {
		model.setUpdatedBySource(updatedBySource);
	}

	/**
	 * Sets the user ID of this agriculture inspection.
	 *
	 * @param userId the user ID of this agriculture inspection
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this agriculture inspection.
	 *
	 * @param userName the user name of this agriculture inspection
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this agriculture inspection.
	 *
	 * @param userUuid the user uuid of this agriculture inspection
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
	protected AgricultureInspectionWrapper wrap(
		AgricultureInspection agricultureInspection) {

		return new AgricultureInspectionWrapper(agricultureInspection);
	}

}