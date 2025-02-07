/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link JanaacInspection}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JanaacInspection
 * @generated
 */
public class JanaacInspectionWrapper
	extends BaseModelWrapper<JanaacInspection>
	implements JanaacInspection, ModelWrapper<JanaacInspection> {

	public JanaacInspectionWrapper(JanaacInspection janaacInspection) {
		super(janaacInspection);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("janaacInspectionId", getJanaacInspectionId());
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
		attributes.put("janaacApplicationId", getJanaacApplicationId());
		attributes.put("slotBookedByUser", getSlotBookedByUser());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long janaacInspectionId = (Long)attributes.get("janaacInspectionId");

		if (janaacInspectionId != null) {
			setJanaacInspectionId(janaacInspectionId);
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

		Long janaacApplicationId = (Long)attributes.get("janaacApplicationId");

		if (janaacApplicationId != null) {
			setJanaacApplicationId(janaacApplicationId);
		}

		Long slotBookedByUser = (Long)attributes.get("slotBookedByUser");

		if (slotBookedByUser != null) {
			setSlotBookedByUser(slotBookedByUser);
		}
	}

	@Override
	public JanaacInspection cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this janaac inspection.
	 *
	 * @return the case ID of this janaac inspection
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this janaac inspection.
	 *
	 * @return the company ID of this janaac inspection
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this janaac inspection.
	 *
	 * @return the create date of this janaac inspection
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of inspection of this janaac inspection.
	 *
	 * @return the date of inspection of this janaac inspection
	 */
	@Override
	public Date getDateOfInspection() {
		return model.getDateOfInspection();
	}

	/**
	 * Returns the group ID of this janaac inspection.
	 *
	 * @return the group ID of this janaac inspection
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this janaac inspection.
	 *
	 * @return the janaac application ID of this janaac inspection
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the janaac inspection ID of this janaac inspection.
	 *
	 * @return the janaac inspection ID of this janaac inspection
	 */
	@Override
	public long getJanaacInspectionId() {
		return model.getJanaacInspectionId();
	}

	/**
	 * Returns the location of this janaac inspection.
	 *
	 * @return the location of this janaac inspection
	 */
	@Override
	public String getLocation() {
		return model.getLocation();
	}

	/**
	 * Returns the modified date of this janaac inspection.
	 *
	 * @return the modified date of this janaac inspection
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this janaac inspection.
	 *
	 * @return the primary key of this janaac inspection
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the slot booked by user of this janaac inspection.
	 *
	 * @return the slot booked by user of this janaac inspection
	 */
	@Override
	public long getSlotBookedByUser() {
		return model.getSlotBookedByUser();
	}

	/**
	 * Returns the status of this janaac inspection.
	 *
	 * @return the status of this janaac inspection
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the time of inspection of this janaac inspection.
	 *
	 * @return the time of inspection of this janaac inspection
	 */
	@Override
	public String getTimeOfInspection() {
		return model.getTimeOfInspection();
	}

	/**
	 * Returns the user ID of this janaac inspection.
	 *
	 * @return the user ID of this janaac inspection
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this janaac inspection.
	 *
	 * @return the user name of this janaac inspection
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this janaac inspection.
	 *
	 * @return the user uuid of this janaac inspection
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
	 * Sets the case ID of this janaac inspection.
	 *
	 * @param caseId the case ID of this janaac inspection
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this janaac inspection.
	 *
	 * @param companyId the company ID of this janaac inspection
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this janaac inspection.
	 *
	 * @param createDate the create date of this janaac inspection
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of inspection of this janaac inspection.
	 *
	 * @param dateOfInspection the date of inspection of this janaac inspection
	 */
	@Override
	public void setDateOfInspection(Date dateOfInspection) {
		model.setDateOfInspection(dateOfInspection);
	}

	/**
	 * Sets the group ID of this janaac inspection.
	 *
	 * @param groupId the group ID of this janaac inspection
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this janaac inspection.
	 *
	 * @param janaacApplicationId the janaac application ID of this janaac inspection
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the janaac inspection ID of this janaac inspection.
	 *
	 * @param janaacInspectionId the janaac inspection ID of this janaac inspection
	 */
	@Override
	public void setJanaacInspectionId(long janaacInspectionId) {
		model.setJanaacInspectionId(janaacInspectionId);
	}

	/**
	 * Sets the location of this janaac inspection.
	 *
	 * @param location the location of this janaac inspection
	 */
	@Override
	public void setLocation(String location) {
		model.setLocation(location);
	}

	/**
	 * Sets the modified date of this janaac inspection.
	 *
	 * @param modifiedDate the modified date of this janaac inspection
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this janaac inspection.
	 *
	 * @param primaryKey the primary key of this janaac inspection
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the slot booked by user of this janaac inspection.
	 *
	 * @param slotBookedByUser the slot booked by user of this janaac inspection
	 */
	@Override
	public void setSlotBookedByUser(long slotBookedByUser) {
		model.setSlotBookedByUser(slotBookedByUser);
	}

	/**
	 * Sets the status of this janaac inspection.
	 *
	 * @param status the status of this janaac inspection
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the time of inspection of this janaac inspection.
	 *
	 * @param timeOfInspection the time of inspection of this janaac inspection
	 */
	@Override
	public void setTimeOfInspection(String timeOfInspection) {
		model.setTimeOfInspection(timeOfInspection);
	}

	/**
	 * Sets the user ID of this janaac inspection.
	 *
	 * @param userId the user ID of this janaac inspection
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this janaac inspection.
	 *
	 * @param userName the user name of this janaac inspection
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this janaac inspection.
	 *
	 * @param userUuid the user uuid of this janaac inspection
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
	protected JanaacInspectionWrapper wrap(JanaacInspection janaacInspection) {
		return new JanaacInspectionWrapper(janaacInspection);
	}

}