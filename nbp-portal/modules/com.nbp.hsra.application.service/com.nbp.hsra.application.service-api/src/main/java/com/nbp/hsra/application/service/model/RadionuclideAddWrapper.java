/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link RadionuclideAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RadionuclideAdd
 * @generated
 */
public class RadionuclideAddWrapper
	extends BaseModelWrapper<RadionuclideAdd>
	implements ModelWrapper<RadionuclideAdd>, RadionuclideAdd {

	public RadionuclideAddWrapper(RadionuclideAdd radionuclideAdd) {
		super(radionuclideAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("radionuclideAddId", getRadionuclideAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("radionuclideDetails", getRadionuclideDetails());
		attributes.put("activityDetails", getActivityDetails());
		attributes.put("activityDate", getActivityDate());
		attributes.put("chemicalDetailsForm", getChemicalDetailsForm());
		attributes.put("serialNo", getSerialNo());
		attributes.put("radionuclideLocation", getRadionuclideLocation());
		attributes.put("counter", getCounter());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long radionuclideAddId = (Long)attributes.get("radionuclideAddId");

		if (radionuclideAddId != null) {
			setRadionuclideAddId(radionuclideAddId);
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

		String radionuclideDetails = (String)attributes.get(
			"radionuclideDetails");

		if (radionuclideDetails != null) {
			setRadionuclideDetails(radionuclideDetails);
		}

		String activityDetails = (String)attributes.get("activityDetails");

		if (activityDetails != null) {
			setActivityDetails(activityDetails);
		}

		Date activityDate = (Date)attributes.get("activityDate");

		if (activityDate != null) {
			setActivityDate(activityDate);
		}

		String chemicalDetailsForm = (String)attributes.get(
			"chemicalDetailsForm");

		if (chemicalDetailsForm != null) {
			setChemicalDetailsForm(chemicalDetailsForm);
		}

		String serialNo = (String)attributes.get("serialNo");

		if (serialNo != null) {
			setSerialNo(serialNo);
		}

		String radionuclideLocation = (String)attributes.get(
			"radionuclideLocation");

		if (radionuclideLocation != null) {
			setRadionuclideLocation(radionuclideLocation);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long hsraApplicationId = (Long)attributes.get("hsraApplicationId");

		if (hsraApplicationId != null) {
			setHsraApplicationId(hsraApplicationId);
		}
	}

	@Override
	public RadionuclideAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the activity date of this radionuclide add.
	 *
	 * @return the activity date of this radionuclide add
	 */
	@Override
	public Date getActivityDate() {
		return model.getActivityDate();
	}

	/**
	 * Returns the activity details of this radionuclide add.
	 *
	 * @return the activity details of this radionuclide add
	 */
	@Override
	public String getActivityDetails() {
		return model.getActivityDetails();
	}

	/**
	 * Returns the chemical details form of this radionuclide add.
	 *
	 * @return the chemical details form of this radionuclide add
	 */
	@Override
	public String getChemicalDetailsForm() {
		return model.getChemicalDetailsForm();
	}

	/**
	 * Returns the company ID of this radionuclide add.
	 *
	 * @return the company ID of this radionuclide add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this radionuclide add.
	 *
	 * @return the counter of this radionuclide add
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this radionuclide add.
	 *
	 * @return the create date of this radionuclide add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this radionuclide add.
	 *
	 * @return the group ID of this radionuclide add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application ID of this radionuclide add.
	 *
	 * @return the hsra application ID of this radionuclide add
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the modified date of this radionuclide add.
	 *
	 * @return the modified date of this radionuclide add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this radionuclide add.
	 *
	 * @return the primary key of this radionuclide add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the radionuclide add ID of this radionuclide add.
	 *
	 * @return the radionuclide add ID of this radionuclide add
	 */
	@Override
	public long getRadionuclideAddId() {
		return model.getRadionuclideAddId();
	}

	/**
	 * Returns the radionuclide details of this radionuclide add.
	 *
	 * @return the radionuclide details of this radionuclide add
	 */
	@Override
	public String getRadionuclideDetails() {
		return model.getRadionuclideDetails();
	}

	/**
	 * Returns the radionuclide location of this radionuclide add.
	 *
	 * @return the radionuclide location of this radionuclide add
	 */
	@Override
	public String getRadionuclideLocation() {
		return model.getRadionuclideLocation();
	}

	/**
	 * Returns the serial no of this radionuclide add.
	 *
	 * @return the serial no of this radionuclide add
	 */
	@Override
	public String getSerialNo() {
		return model.getSerialNo();
	}

	/**
	 * Returns the user ID of this radionuclide add.
	 *
	 * @return the user ID of this radionuclide add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this radionuclide add.
	 *
	 * @return the user name of this radionuclide add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this radionuclide add.
	 *
	 * @return the user uuid of this radionuclide add
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
	 * Sets the activity date of this radionuclide add.
	 *
	 * @param activityDate the activity date of this radionuclide add
	 */
	@Override
	public void setActivityDate(Date activityDate) {
		model.setActivityDate(activityDate);
	}

	/**
	 * Sets the activity details of this radionuclide add.
	 *
	 * @param activityDetails the activity details of this radionuclide add
	 */
	@Override
	public void setActivityDetails(String activityDetails) {
		model.setActivityDetails(activityDetails);
	}

	/**
	 * Sets the chemical details form of this radionuclide add.
	 *
	 * @param chemicalDetailsForm the chemical details form of this radionuclide add
	 */
	@Override
	public void setChemicalDetailsForm(String chemicalDetailsForm) {
		model.setChemicalDetailsForm(chemicalDetailsForm);
	}

	/**
	 * Sets the company ID of this radionuclide add.
	 *
	 * @param companyId the company ID of this radionuclide add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this radionuclide add.
	 *
	 * @param counter the counter of this radionuclide add
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this radionuclide add.
	 *
	 * @param createDate the create date of this radionuclide add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this radionuclide add.
	 *
	 * @param groupId the group ID of this radionuclide add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application ID of this radionuclide add.
	 *
	 * @param hsraApplicationId the hsra application ID of this radionuclide add
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the modified date of this radionuclide add.
	 *
	 * @param modifiedDate the modified date of this radionuclide add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this radionuclide add.
	 *
	 * @param primaryKey the primary key of this radionuclide add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the radionuclide add ID of this radionuclide add.
	 *
	 * @param radionuclideAddId the radionuclide add ID of this radionuclide add
	 */
	@Override
	public void setRadionuclideAddId(long radionuclideAddId) {
		model.setRadionuclideAddId(radionuclideAddId);
	}

	/**
	 * Sets the radionuclide details of this radionuclide add.
	 *
	 * @param radionuclideDetails the radionuclide details of this radionuclide add
	 */
	@Override
	public void setRadionuclideDetails(String radionuclideDetails) {
		model.setRadionuclideDetails(radionuclideDetails);
	}

	/**
	 * Sets the radionuclide location of this radionuclide add.
	 *
	 * @param radionuclideLocation the radionuclide location of this radionuclide add
	 */
	@Override
	public void setRadionuclideLocation(String radionuclideLocation) {
		model.setRadionuclideLocation(radionuclideLocation);
	}

	/**
	 * Sets the serial no of this radionuclide add.
	 *
	 * @param serialNo the serial no of this radionuclide add
	 */
	@Override
	public void setSerialNo(String serialNo) {
		model.setSerialNo(serialNo);
	}

	/**
	 * Sets the user ID of this radionuclide add.
	 *
	 * @param userId the user ID of this radionuclide add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this radionuclide add.
	 *
	 * @param userName the user name of this radionuclide add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this radionuclide add.
	 *
	 * @param userUuid the user uuid of this radionuclide add
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
	protected RadionuclideAddWrapper wrap(RadionuclideAdd radionuclideAdd) {
		return new RadionuclideAddWrapper(radionuclideAdd);
	}

}