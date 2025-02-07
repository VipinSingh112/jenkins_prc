/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link WraInspection}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WraInspection
 * @generated
 */
public class WraInspectionWrapper
	extends BaseModelWrapper<WraInspection>
	implements ModelWrapper<WraInspection>, WraInspection {

	public WraInspectionWrapper(WraInspection wraInspection) {
		super(wraInspection);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("wraInspectionId", getWraInspectionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("dateOfInspection", getDateOfInspection());
		attributes.put("timeOfInspection", getTimeOfInspection());
		attributes.put("location", getLocation());
		attributes.put("status", getStatus());
		attributes.put("wraApplicationId", getWraApplicationId());
		attributes.put("slotBookedByUser", getSlotBookedByUser());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long wraInspectionId = (Long)attributes.get("wraInspectionId");

		if (wraInspectionId != null) {
			setWraInspectionId(wraInspectionId);
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

		String timeOfInspection = (String)attributes.get("timeOfInspection");

		if (timeOfInspection != null) {
			setTimeOfInspection(timeOfInspection);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long wraApplicationId = (Long)attributes.get("wraApplicationId");

		if (wraApplicationId != null) {
			setWraApplicationId(wraApplicationId);
		}

		Long slotBookedByUser = (Long)attributes.get("slotBookedByUser");

		if (slotBookedByUser != null) {
			setSlotBookedByUser(slotBookedByUser);
		}
	}

	@Override
	public WraInspection cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this wra inspection.
	 *
	 * @return the case ID of this wra inspection
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this wra inspection.
	 *
	 * @return the company ID of this wra inspection
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this wra inspection.
	 *
	 * @return the create date of this wra inspection
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of inspection of this wra inspection.
	 *
	 * @return the date of inspection of this wra inspection
	 */
	@Override
	public Date getDateOfInspection() {
		return model.getDateOfInspection();
	}

	/**
	 * Returns the group ID of this wra inspection.
	 *
	 * @return the group ID of this wra inspection
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the location of this wra inspection.
	 *
	 * @return the location of this wra inspection
	 */
	@Override
	public String getLocation() {
		return model.getLocation();
	}

	/**
	 * Returns the modified date of this wra inspection.
	 *
	 * @return the modified date of this wra inspection
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this wra inspection.
	 *
	 * @return the primary key of this wra inspection
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the slot booked by user of this wra inspection.
	 *
	 * @return the slot booked by user of this wra inspection
	 */
	@Override
	public long getSlotBookedByUser() {
		return model.getSlotBookedByUser();
	}

	/**
	 * Returns the status of this wra inspection.
	 *
	 * @return the status of this wra inspection
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the time of inspection of this wra inspection.
	 *
	 * @return the time of inspection of this wra inspection
	 */
	@Override
	public String getTimeOfInspection() {
		return model.getTimeOfInspection();
	}

	/**
	 * Returns the user ID of this wra inspection.
	 *
	 * @return the user ID of this wra inspection
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this wra inspection.
	 *
	 * @return the user name of this wra inspection
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this wra inspection.
	 *
	 * @return the user uuid of this wra inspection
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the wra application ID of this wra inspection.
	 *
	 * @return the wra application ID of this wra inspection
	 */
	@Override
	public long getWraApplicationId() {
		return model.getWraApplicationId();
	}

	/**
	 * Returns the wra inspection ID of this wra inspection.
	 *
	 * @return the wra inspection ID of this wra inspection
	 */
	@Override
	public long getWraInspectionId() {
		return model.getWraInspectionId();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the case ID of this wra inspection.
	 *
	 * @param caseId the case ID of this wra inspection
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this wra inspection.
	 *
	 * @param companyId the company ID of this wra inspection
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this wra inspection.
	 *
	 * @param createDate the create date of this wra inspection
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of inspection of this wra inspection.
	 *
	 * @param dateOfInspection the date of inspection of this wra inspection
	 */
	@Override
	public void setDateOfInspection(Date dateOfInspection) {
		model.setDateOfInspection(dateOfInspection);
	}

	/**
	 * Sets the group ID of this wra inspection.
	 *
	 * @param groupId the group ID of this wra inspection
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the location of this wra inspection.
	 *
	 * @param location the location of this wra inspection
	 */
	@Override
	public void setLocation(String location) {
		model.setLocation(location);
	}

	/**
	 * Sets the modified date of this wra inspection.
	 *
	 * @param modifiedDate the modified date of this wra inspection
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this wra inspection.
	 *
	 * @param primaryKey the primary key of this wra inspection
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the slot booked by user of this wra inspection.
	 *
	 * @param slotBookedByUser the slot booked by user of this wra inspection
	 */
	@Override
	public void setSlotBookedByUser(long slotBookedByUser) {
		model.setSlotBookedByUser(slotBookedByUser);
	}

	/**
	 * Sets the status of this wra inspection.
	 *
	 * @param status the status of this wra inspection
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the time of inspection of this wra inspection.
	 *
	 * @param timeOfInspection the time of inspection of this wra inspection
	 */
	@Override
	public void setTimeOfInspection(String timeOfInspection) {
		model.setTimeOfInspection(timeOfInspection);
	}

	/**
	 * Sets the user ID of this wra inspection.
	 *
	 * @param userId the user ID of this wra inspection
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this wra inspection.
	 *
	 * @param userName the user name of this wra inspection
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this wra inspection.
	 *
	 * @param userUuid the user uuid of this wra inspection
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the wra application ID of this wra inspection.
	 *
	 * @param wraApplicationId the wra application ID of this wra inspection
	 */
	@Override
	public void setWraApplicationId(long wraApplicationId) {
		model.setWraApplicationId(wraApplicationId);
	}

	/**
	 * Sets the wra inspection ID of this wra inspection.
	 *
	 * @param wraInspectionId the wra inspection ID of this wra inspection
	 */
	@Override
	public void setWraInspectionId(long wraInspectionId) {
		model.setWraInspectionId(wraInspectionId);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected WraInspectionWrapper wrap(WraInspection wraInspection) {
		return new WraInspectionWrapper(wraInspection);
	}

}