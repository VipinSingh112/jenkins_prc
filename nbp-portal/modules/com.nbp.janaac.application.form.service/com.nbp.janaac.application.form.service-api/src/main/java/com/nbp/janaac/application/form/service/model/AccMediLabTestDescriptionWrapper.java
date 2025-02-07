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
 * This class is a wrapper for {@link AccMediLabTestDescription}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabTestDescription
 * @generated
 */
public class AccMediLabTestDescriptionWrapper
	extends BaseModelWrapper<AccMediLabTestDescription>
	implements AccMediLabTestDescription,
			   ModelWrapper<AccMediLabTestDescription> {

	public AccMediLabTestDescriptionWrapper(
		AccMediLabTestDescription accMediLabTestDescription) {

		super(accMediLabTestDescription);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put(
			"accMediLabTestDescriptionId", getAccMediLabTestDescriptionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("testClinicalActivity", getTestClinicalActivity());
		attributes.put("testLabShiftWork", getTestLabShiftWork());
		attributes.put("testLabSpecimenNo", getTestLabSpecimenNo());
		attributes.put("testSpecimenLocation", getTestSpecimenLocation());
		attributes.put("janaacApplicationId", getJanaacApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long accMediLabTestDescriptionId = (Long)attributes.get(
			"accMediLabTestDescriptionId");

		if (accMediLabTestDescriptionId != null) {
			setAccMediLabTestDescriptionId(accMediLabTestDescriptionId);
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

		String testClinicalActivity = (String)attributes.get(
			"testClinicalActivity");

		if (testClinicalActivity != null) {
			setTestClinicalActivity(testClinicalActivity);
		}

		String testLabShiftWork = (String)attributes.get("testLabShiftWork");

		if (testLabShiftWork != null) {
			setTestLabShiftWork(testLabShiftWork);
		}

		String testLabSpecimenNo = (String)attributes.get("testLabSpecimenNo");

		if (testLabSpecimenNo != null) {
			setTestLabSpecimenNo(testLabSpecimenNo);
		}

		String testSpecimenLocation = (String)attributes.get(
			"testSpecimenLocation");

		if (testSpecimenLocation != null) {
			setTestSpecimenLocation(testSpecimenLocation);
		}

		Long janaacApplicationId = (Long)attributes.get("janaacApplicationId");

		if (janaacApplicationId != null) {
			setJanaacApplicationId(janaacApplicationId);
		}
	}

	@Override
	public AccMediLabTestDescription cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acc medi lab test description ID of this acc medi lab test description.
	 *
	 * @return the acc medi lab test description ID of this acc medi lab test description
	 */
	@Override
	public long getAccMediLabTestDescriptionId() {
		return model.getAccMediLabTestDescriptionId();
	}

	/**
	 * Returns the company ID of this acc medi lab test description.
	 *
	 * @return the company ID of this acc medi lab test description
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acc medi lab test description.
	 *
	 * @return the create date of this acc medi lab test description
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this acc medi lab test description.
	 *
	 * @return the group ID of this acc medi lab test description
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this acc medi lab test description.
	 *
	 * @return the janaac application ID of this acc medi lab test description
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the modified date of this acc medi lab test description.
	 *
	 * @return the modified date of this acc medi lab test description
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this acc medi lab test description.
	 *
	 * @return the primary key of this acc medi lab test description
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the test clinical activity of this acc medi lab test description.
	 *
	 * @return the test clinical activity of this acc medi lab test description
	 */
	@Override
	public String getTestClinicalActivity() {
		return model.getTestClinicalActivity();
	}

	/**
	 * Returns the test lab shift work of this acc medi lab test description.
	 *
	 * @return the test lab shift work of this acc medi lab test description
	 */
	@Override
	public String getTestLabShiftWork() {
		return model.getTestLabShiftWork();
	}

	/**
	 * Returns the test lab specimen no of this acc medi lab test description.
	 *
	 * @return the test lab specimen no of this acc medi lab test description
	 */
	@Override
	public String getTestLabSpecimenNo() {
		return model.getTestLabSpecimenNo();
	}

	/**
	 * Returns the test specimen location of this acc medi lab test description.
	 *
	 * @return the test specimen location of this acc medi lab test description
	 */
	@Override
	public String getTestSpecimenLocation() {
		return model.getTestSpecimenLocation();
	}

	/**
	 * Returns the user ID of this acc medi lab test description.
	 *
	 * @return the user ID of this acc medi lab test description
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acc medi lab test description.
	 *
	 * @return the user name of this acc medi lab test description
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acc medi lab test description.
	 *
	 * @return the user uuid of this acc medi lab test description
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this acc medi lab test description.
	 *
	 * @return the uuid of this acc medi lab test description
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
	 * Sets the acc medi lab test description ID of this acc medi lab test description.
	 *
	 * @param accMediLabTestDescriptionId the acc medi lab test description ID of this acc medi lab test description
	 */
	@Override
	public void setAccMediLabTestDescriptionId(
		long accMediLabTestDescriptionId) {

		model.setAccMediLabTestDescriptionId(accMediLabTestDescriptionId);
	}

	/**
	 * Sets the company ID of this acc medi lab test description.
	 *
	 * @param companyId the company ID of this acc medi lab test description
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acc medi lab test description.
	 *
	 * @param createDate the create date of this acc medi lab test description
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this acc medi lab test description.
	 *
	 * @param groupId the group ID of this acc medi lab test description
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this acc medi lab test description.
	 *
	 * @param janaacApplicationId the janaac application ID of this acc medi lab test description
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the modified date of this acc medi lab test description.
	 *
	 * @param modifiedDate the modified date of this acc medi lab test description
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this acc medi lab test description.
	 *
	 * @param primaryKey the primary key of this acc medi lab test description
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the test clinical activity of this acc medi lab test description.
	 *
	 * @param testClinicalActivity the test clinical activity of this acc medi lab test description
	 */
	@Override
	public void setTestClinicalActivity(String testClinicalActivity) {
		model.setTestClinicalActivity(testClinicalActivity);
	}

	/**
	 * Sets the test lab shift work of this acc medi lab test description.
	 *
	 * @param testLabShiftWork the test lab shift work of this acc medi lab test description
	 */
	@Override
	public void setTestLabShiftWork(String testLabShiftWork) {
		model.setTestLabShiftWork(testLabShiftWork);
	}

	/**
	 * Sets the test lab specimen no of this acc medi lab test description.
	 *
	 * @param testLabSpecimenNo the test lab specimen no of this acc medi lab test description
	 */
	@Override
	public void setTestLabSpecimenNo(String testLabSpecimenNo) {
		model.setTestLabSpecimenNo(testLabSpecimenNo);
	}

	/**
	 * Sets the test specimen location of this acc medi lab test description.
	 *
	 * @param testSpecimenLocation the test specimen location of this acc medi lab test description
	 */
	@Override
	public void setTestSpecimenLocation(String testSpecimenLocation) {
		model.setTestSpecimenLocation(testSpecimenLocation);
	}

	/**
	 * Sets the user ID of this acc medi lab test description.
	 *
	 * @param userId the user ID of this acc medi lab test description
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acc medi lab test description.
	 *
	 * @param userName the user name of this acc medi lab test description
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acc medi lab test description.
	 *
	 * @param userUuid the user uuid of this acc medi lab test description
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this acc medi lab test description.
	 *
	 * @param uuid the uuid of this acc medi lab test description
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
	protected AccMediLabTestDescriptionWrapper wrap(
		AccMediLabTestDescription accMediLabTestDescription) {

		return new AccMediLabTestDescriptionWrapper(accMediLabTestDescription);
	}

}