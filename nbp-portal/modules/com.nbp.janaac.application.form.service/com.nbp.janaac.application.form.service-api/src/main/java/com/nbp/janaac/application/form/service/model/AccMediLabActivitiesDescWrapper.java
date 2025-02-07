/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AccMediLabActivitiesDesc}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabActivitiesDesc
 * @generated
 */
public class AccMediLabActivitiesDescWrapper
	extends BaseModelWrapper<AccMediLabActivitiesDesc>
	implements AccMediLabActivitiesDesc,
			   ModelWrapper<AccMediLabActivitiesDesc> {

	public AccMediLabActivitiesDescWrapper(
		AccMediLabActivitiesDesc accMediLabActivitiesDesc) {

		super(accMediLabActivitiesDesc);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put(
			"accMediLabActivitiesDescId", getAccMediLabActivitiesDescId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("activitiesDescription", getActivitiesDescription());
		attributes.put("shiftWork", getShiftWork());
		attributes.put("specimenNo", getSpecimenNo());
		attributes.put("specimenLocation", getSpecimenLocation());
		attributes.put("requestedPOCT", getRequestedPOCT());
		attributes.put("requestedPOCTLocation", getRequestedPOCTLocation());
		attributes.put("janaacApplicationId", getJanaacApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long accMediLabActivitiesDescId = (Long)attributes.get(
			"accMediLabActivitiesDescId");

		if (accMediLabActivitiesDescId != null) {
			setAccMediLabActivitiesDescId(accMediLabActivitiesDescId);
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

		String activitiesDescription = (String)attributes.get(
			"activitiesDescription");

		if (activitiesDescription != null) {
			setActivitiesDescription(activitiesDescription);
		}

		String shiftWork = (String)attributes.get("shiftWork");

		if (shiftWork != null) {
			setShiftWork(shiftWork);
		}

		String specimenNo = (String)attributes.get("specimenNo");

		if (specimenNo != null) {
			setSpecimenNo(specimenNo);
		}

		String specimenLocation = (String)attributes.get("specimenLocation");

		if (specimenLocation != null) {
			setSpecimenLocation(specimenLocation);
		}

		String requestedPOCT = (String)attributes.get("requestedPOCT");

		if (requestedPOCT != null) {
			setRequestedPOCT(requestedPOCT);
		}

		String requestedPOCTLocation = (String)attributes.get(
			"requestedPOCTLocation");

		if (requestedPOCTLocation != null) {
			setRequestedPOCTLocation(requestedPOCTLocation);
		}

		Long janaacApplicationId = (Long)attributes.get("janaacApplicationId");

		if (janaacApplicationId != null) {
			setJanaacApplicationId(janaacApplicationId);
		}
	}

	@Override
	public AccMediLabActivitiesDesc cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acc medi lab activities desc ID of this acc medi lab activities desc.
	 *
	 * @return the acc medi lab activities desc ID of this acc medi lab activities desc
	 */
	@Override
	public long getAccMediLabActivitiesDescId() {
		return model.getAccMediLabActivitiesDescId();
	}

	/**
	 * Returns the activities description of this acc medi lab activities desc.
	 *
	 * @return the activities description of this acc medi lab activities desc
	 */
	@Override
	public String getActivitiesDescription() {
		return model.getActivitiesDescription();
	}

	/**
	 * Returns the company ID of this acc medi lab activities desc.
	 *
	 * @return the company ID of this acc medi lab activities desc
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acc medi lab activities desc.
	 *
	 * @return the create date of this acc medi lab activities desc
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this acc medi lab activities desc.
	 *
	 * @return the group ID of this acc medi lab activities desc
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this acc medi lab activities desc.
	 *
	 * @return the janaac application ID of this acc medi lab activities desc
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the modified date of this acc medi lab activities desc.
	 *
	 * @return the modified date of this acc medi lab activities desc
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this acc medi lab activities desc.
	 *
	 * @return the primary key of this acc medi lab activities desc
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the requested poct of this acc medi lab activities desc.
	 *
	 * @return the requested poct of this acc medi lab activities desc
	 */
	@Override
	public String getRequestedPOCT() {
		return model.getRequestedPOCT();
	}

	/**
	 * Returns the requested poct location of this acc medi lab activities desc.
	 *
	 * @return the requested poct location of this acc medi lab activities desc
	 */
	@Override
	public String getRequestedPOCTLocation() {
		return model.getRequestedPOCTLocation();
	}

	/**
	 * Returns the shift work of this acc medi lab activities desc.
	 *
	 * @return the shift work of this acc medi lab activities desc
	 */
	@Override
	public String getShiftWork() {
		return model.getShiftWork();
	}

	/**
	 * Returns the specimen location of this acc medi lab activities desc.
	 *
	 * @return the specimen location of this acc medi lab activities desc
	 */
	@Override
	public String getSpecimenLocation() {
		return model.getSpecimenLocation();
	}

	/**
	 * Returns the specimen no of this acc medi lab activities desc.
	 *
	 * @return the specimen no of this acc medi lab activities desc
	 */
	@Override
	public String getSpecimenNo() {
		return model.getSpecimenNo();
	}

	/**
	 * Returns the user ID of this acc medi lab activities desc.
	 *
	 * @return the user ID of this acc medi lab activities desc
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acc medi lab activities desc.
	 *
	 * @return the user name of this acc medi lab activities desc
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acc medi lab activities desc.
	 *
	 * @return the user uuid of this acc medi lab activities desc
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this acc medi lab activities desc.
	 *
	 * @return the uuid of this acc medi lab activities desc
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the acc medi lab activities desc ID of this acc medi lab activities desc.
	 *
	 * @param accMediLabActivitiesDescId the acc medi lab activities desc ID of this acc medi lab activities desc
	 */
	@Override
	public void setAccMediLabActivitiesDescId(long accMediLabActivitiesDescId) {
		model.setAccMediLabActivitiesDescId(accMediLabActivitiesDescId);
	}

	/**
	 * Sets the activities description of this acc medi lab activities desc.
	 *
	 * @param activitiesDescription the activities description of this acc medi lab activities desc
	 */
	@Override
	public void setActivitiesDescription(String activitiesDescription) {
		model.setActivitiesDescription(activitiesDescription);
	}

	/**
	 * Sets the company ID of this acc medi lab activities desc.
	 *
	 * @param companyId the company ID of this acc medi lab activities desc
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acc medi lab activities desc.
	 *
	 * @param createDate the create date of this acc medi lab activities desc
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this acc medi lab activities desc.
	 *
	 * @param groupId the group ID of this acc medi lab activities desc
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this acc medi lab activities desc.
	 *
	 * @param janaacApplicationId the janaac application ID of this acc medi lab activities desc
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the modified date of this acc medi lab activities desc.
	 *
	 * @param modifiedDate the modified date of this acc medi lab activities desc
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this acc medi lab activities desc.
	 *
	 * @param primaryKey the primary key of this acc medi lab activities desc
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the requested poct of this acc medi lab activities desc.
	 *
	 * @param requestedPOCT the requested poct of this acc medi lab activities desc
	 */
	@Override
	public void setRequestedPOCT(String requestedPOCT) {
		model.setRequestedPOCT(requestedPOCT);
	}

	/**
	 * Sets the requested poct location of this acc medi lab activities desc.
	 *
	 * @param requestedPOCTLocation the requested poct location of this acc medi lab activities desc
	 */
	@Override
	public void setRequestedPOCTLocation(String requestedPOCTLocation) {
		model.setRequestedPOCTLocation(requestedPOCTLocation);
	}

	/**
	 * Sets the shift work of this acc medi lab activities desc.
	 *
	 * @param shiftWork the shift work of this acc medi lab activities desc
	 */
	@Override
	public void setShiftWork(String shiftWork) {
		model.setShiftWork(shiftWork);
	}

	/**
	 * Sets the specimen location of this acc medi lab activities desc.
	 *
	 * @param specimenLocation the specimen location of this acc medi lab activities desc
	 */
	@Override
	public void setSpecimenLocation(String specimenLocation) {
		model.setSpecimenLocation(specimenLocation);
	}

	/**
	 * Sets the specimen no of this acc medi lab activities desc.
	 *
	 * @param specimenNo the specimen no of this acc medi lab activities desc
	 */
	@Override
	public void setSpecimenNo(String specimenNo) {
		model.setSpecimenNo(specimenNo);
	}

	/**
	 * Sets the user ID of this acc medi lab activities desc.
	 *
	 * @param userId the user ID of this acc medi lab activities desc
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acc medi lab activities desc.
	 *
	 * @param userName the user name of this acc medi lab activities desc
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acc medi lab activities desc.
	 *
	 * @param userUuid the user uuid of this acc medi lab activities desc
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this acc medi lab activities desc.
	 *
	 * @param uuid the uuid of this acc medi lab activities desc
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected AccMediLabActivitiesDescWrapper wrap(
		AccMediLabActivitiesDesc accMediLabActivitiesDesc) {

		return new AccMediLabActivitiesDescWrapper(accMediLabActivitiesDesc);
	}

}