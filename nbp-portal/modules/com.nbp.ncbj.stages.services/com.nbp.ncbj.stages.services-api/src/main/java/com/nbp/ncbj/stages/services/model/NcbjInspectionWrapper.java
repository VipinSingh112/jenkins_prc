/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link NcbjInspection}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjInspection
 * @generated
 */
public class NcbjInspectionWrapper
	extends BaseModelWrapper<NcbjInspection>
	implements ModelWrapper<NcbjInspection>, NcbjInspection {

	public NcbjInspectionWrapper(NcbjInspection ncbjInspection) {
		super(ncbjInspection);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ncbjInspectionId", getNcbjInspectionId());
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
		attributes.put("ncbjApplicationId", getNcbjApplicationId());
		attributes.put("slotBookedByUser", getSlotBookedByUser());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ncbjInspectionId = (Long)attributes.get("ncbjInspectionId");

		if (ncbjInspectionId != null) {
			setNcbjInspectionId(ncbjInspectionId);
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

		Long ncbjApplicationId = (Long)attributes.get("ncbjApplicationId");

		if (ncbjApplicationId != null) {
			setNcbjApplicationId(ncbjApplicationId);
		}

		Long slotBookedByUser = (Long)attributes.get("slotBookedByUser");

		if (slotBookedByUser != null) {
			setSlotBookedByUser(slotBookedByUser);
		}
	}

	@Override
	public NcbjInspection cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this ncbj inspection.
	 *
	 * @return the case ID of this ncbj inspection
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this ncbj inspection.
	 *
	 * @return the company ID of this ncbj inspection
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this ncbj inspection.
	 *
	 * @return the create date of this ncbj inspection
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of inspection of this ncbj inspection.
	 *
	 * @return the date of inspection of this ncbj inspection
	 */
	@Override
	public Date getDateOfInspection() {
		return model.getDateOfInspection();
	}

	/**
	 * Returns the group ID of this ncbj inspection.
	 *
	 * @return the group ID of this ncbj inspection
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the location of this ncbj inspection.
	 *
	 * @return the location of this ncbj inspection
	 */
	@Override
	public String getLocation() {
		return model.getLocation();
	}

	/**
	 * Returns the modified date of this ncbj inspection.
	 *
	 * @return the modified date of this ncbj inspection
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ncbj application ID of this ncbj inspection.
	 *
	 * @return the ncbj application ID of this ncbj inspection
	 */
	@Override
	public long getNcbjApplicationId() {
		return model.getNcbjApplicationId();
	}

	/**
	 * Returns the ncbj inspection ID of this ncbj inspection.
	 *
	 * @return the ncbj inspection ID of this ncbj inspection
	 */
	@Override
	public long getNcbjInspectionId() {
		return model.getNcbjInspectionId();
	}

	/**
	 * Returns the primary key of this ncbj inspection.
	 *
	 * @return the primary key of this ncbj inspection
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the slot booked by user of this ncbj inspection.
	 *
	 * @return the slot booked by user of this ncbj inspection
	 */
	@Override
	public long getSlotBookedByUser() {
		return model.getSlotBookedByUser();
	}

	/**
	 * Returns the status of this ncbj inspection.
	 *
	 * @return the status of this ncbj inspection
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the time of inspection of this ncbj inspection.
	 *
	 * @return the time of inspection of this ncbj inspection
	 */
	@Override
	public String getTimeOfInspection() {
		return model.getTimeOfInspection();
	}

	/**
	 * Returns the user ID of this ncbj inspection.
	 *
	 * @return the user ID of this ncbj inspection
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ncbj inspection.
	 *
	 * @return the user name of this ncbj inspection
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ncbj inspection.
	 *
	 * @return the user uuid of this ncbj inspection
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
	 * Sets the case ID of this ncbj inspection.
	 *
	 * @param caseId the case ID of this ncbj inspection
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this ncbj inspection.
	 *
	 * @param companyId the company ID of this ncbj inspection
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this ncbj inspection.
	 *
	 * @param createDate the create date of this ncbj inspection
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of inspection of this ncbj inspection.
	 *
	 * @param dateOfInspection the date of inspection of this ncbj inspection
	 */
	@Override
	public void setDateOfInspection(Date dateOfInspection) {
		model.setDateOfInspection(dateOfInspection);
	}

	/**
	 * Sets the group ID of this ncbj inspection.
	 *
	 * @param groupId the group ID of this ncbj inspection
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the location of this ncbj inspection.
	 *
	 * @param location the location of this ncbj inspection
	 */
	@Override
	public void setLocation(String location) {
		model.setLocation(location);
	}

	/**
	 * Sets the modified date of this ncbj inspection.
	 *
	 * @param modifiedDate the modified date of this ncbj inspection
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ncbj application ID of this ncbj inspection.
	 *
	 * @param ncbjApplicationId the ncbj application ID of this ncbj inspection
	 */
	@Override
	public void setNcbjApplicationId(long ncbjApplicationId) {
		model.setNcbjApplicationId(ncbjApplicationId);
	}

	/**
	 * Sets the ncbj inspection ID of this ncbj inspection.
	 *
	 * @param ncbjInspectionId the ncbj inspection ID of this ncbj inspection
	 */
	@Override
	public void setNcbjInspectionId(long ncbjInspectionId) {
		model.setNcbjInspectionId(ncbjInspectionId);
	}

	/**
	 * Sets the primary key of this ncbj inspection.
	 *
	 * @param primaryKey the primary key of this ncbj inspection
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the slot booked by user of this ncbj inspection.
	 *
	 * @param slotBookedByUser the slot booked by user of this ncbj inspection
	 */
	@Override
	public void setSlotBookedByUser(long slotBookedByUser) {
		model.setSlotBookedByUser(slotBookedByUser);
	}

	/**
	 * Sets the status of this ncbj inspection.
	 *
	 * @param status the status of this ncbj inspection
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the time of inspection of this ncbj inspection.
	 *
	 * @param timeOfInspection the time of inspection of this ncbj inspection
	 */
	@Override
	public void setTimeOfInspection(String timeOfInspection) {
		model.setTimeOfInspection(timeOfInspection);
	}

	/**
	 * Sets the user ID of this ncbj inspection.
	 *
	 * @param userId the user ID of this ncbj inspection
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ncbj inspection.
	 *
	 * @param userName the user name of this ncbj inspection
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ncbj inspection.
	 *
	 * @param userUuid the user uuid of this ncbj inspection
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
	protected NcbjInspectionWrapper wrap(NcbjInspection ncbjInspection) {
		return new NcbjInspectionWrapper(ncbjInspection);
	}

}