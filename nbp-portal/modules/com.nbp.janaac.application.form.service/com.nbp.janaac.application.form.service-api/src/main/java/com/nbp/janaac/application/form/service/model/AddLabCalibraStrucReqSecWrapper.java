/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AddLabCalibraStrucReqSec}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLabCalibraStrucReqSec
 * @generated
 */
public class AddLabCalibraStrucReqSecWrapper
	extends BaseModelWrapper<AddLabCalibraStrucReqSec>
	implements AddLabCalibraStrucReqSec,
			   ModelWrapper<AddLabCalibraStrucReqSec> {

	public AddLabCalibraStrucReqSecWrapper(
		AddLabCalibraStrucReqSec addLabCalibraStrucReqSec) {

		super(addLabCalibraStrucReqSec);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"addLabCalibraStrucReqSecId", getAddLabCalibraStrucReqSecId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("number", getNumber());
		attributes.put("measuredQuantity", getMeasuredQuantity());
		attributes.put("calibrationItem", getCalibrationItem());
		attributes.put("range", getRange());
		attributes.put("measurementProcedure", getMeasurementProcedure());
		attributes.put("calibration", getCalibration());
		attributes.put("remarks", getRemarks());
		attributes.put("janaacApplicationId", getJanaacApplicationId());
		attributes.put("counter", getCounter());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long addLabCalibraStrucReqSecId = (Long)attributes.get(
			"addLabCalibraStrucReqSecId");

		if (addLabCalibraStrucReqSecId != null) {
			setAddLabCalibraStrucReqSecId(addLabCalibraStrucReqSecId);
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

		String number = (String)attributes.get("number");

		if (number != null) {
			setNumber(number);
		}

		String measuredQuantity = (String)attributes.get("measuredQuantity");

		if (measuredQuantity != null) {
			setMeasuredQuantity(measuredQuantity);
		}

		String calibrationItem = (String)attributes.get("calibrationItem");

		if (calibrationItem != null) {
			setCalibrationItem(calibrationItem);
		}

		String range = (String)attributes.get("range");

		if (range != null) {
			setRange(range);
		}

		String measurementProcedure = (String)attributes.get(
			"measurementProcedure");

		if (measurementProcedure != null) {
			setMeasurementProcedure(measurementProcedure);
		}

		String calibration = (String)attributes.get("calibration");

		if (calibration != null) {
			setCalibration(calibration);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		Long janaacApplicationId = (Long)attributes.get("janaacApplicationId");

		if (janaacApplicationId != null) {
			setJanaacApplicationId(janaacApplicationId);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}
	}

	@Override
	public AddLabCalibraStrucReqSec cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the add lab calibra struc req sec ID of this add lab calibra struc req sec.
	 *
	 * @return the add lab calibra struc req sec ID of this add lab calibra struc req sec
	 */
	@Override
	public long getAddLabCalibraStrucReqSecId() {
		return model.getAddLabCalibraStrucReqSecId();
	}

	/**
	 * Returns the calibration of this add lab calibra struc req sec.
	 *
	 * @return the calibration of this add lab calibra struc req sec
	 */
	@Override
	public String getCalibration() {
		return model.getCalibration();
	}

	/**
	 * Returns the calibration item of this add lab calibra struc req sec.
	 *
	 * @return the calibration item of this add lab calibra struc req sec
	 */
	@Override
	public String getCalibrationItem() {
		return model.getCalibrationItem();
	}

	/**
	 * Returns the company ID of this add lab calibra struc req sec.
	 *
	 * @return the company ID of this add lab calibra struc req sec
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this add lab calibra struc req sec.
	 *
	 * @return the counter of this add lab calibra struc req sec
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this add lab calibra struc req sec.
	 *
	 * @return the create date of this add lab calibra struc req sec
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this add lab calibra struc req sec.
	 *
	 * @return the group ID of this add lab calibra struc req sec
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this add lab calibra struc req sec.
	 *
	 * @return the janaac application ID of this add lab calibra struc req sec
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the measured quantity of this add lab calibra struc req sec.
	 *
	 * @return the measured quantity of this add lab calibra struc req sec
	 */
	@Override
	public String getMeasuredQuantity() {
		return model.getMeasuredQuantity();
	}

	/**
	 * Returns the measurement procedure of this add lab calibra struc req sec.
	 *
	 * @return the measurement procedure of this add lab calibra struc req sec
	 */
	@Override
	public String getMeasurementProcedure() {
		return model.getMeasurementProcedure();
	}

	/**
	 * Returns the modified date of this add lab calibra struc req sec.
	 *
	 * @return the modified date of this add lab calibra struc req sec
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the number of this add lab calibra struc req sec.
	 *
	 * @return the number of this add lab calibra struc req sec
	 */
	@Override
	public String getNumber() {
		return model.getNumber();
	}

	/**
	 * Returns the primary key of this add lab calibra struc req sec.
	 *
	 * @return the primary key of this add lab calibra struc req sec
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the range of this add lab calibra struc req sec.
	 *
	 * @return the range of this add lab calibra struc req sec
	 */
	@Override
	public String getRange() {
		return model.getRange();
	}

	/**
	 * Returns the remarks of this add lab calibra struc req sec.
	 *
	 * @return the remarks of this add lab calibra struc req sec
	 */
	@Override
	public String getRemarks() {
		return model.getRemarks();
	}

	/**
	 * Returns the user ID of this add lab calibra struc req sec.
	 *
	 * @return the user ID of this add lab calibra struc req sec
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this add lab calibra struc req sec.
	 *
	 * @return the user name of this add lab calibra struc req sec
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this add lab calibra struc req sec.
	 *
	 * @return the user uuid of this add lab calibra struc req sec
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
	 * Sets the add lab calibra struc req sec ID of this add lab calibra struc req sec.
	 *
	 * @param addLabCalibraStrucReqSecId the add lab calibra struc req sec ID of this add lab calibra struc req sec
	 */
	@Override
	public void setAddLabCalibraStrucReqSecId(long addLabCalibraStrucReqSecId) {
		model.setAddLabCalibraStrucReqSecId(addLabCalibraStrucReqSecId);
	}

	/**
	 * Sets the calibration of this add lab calibra struc req sec.
	 *
	 * @param calibration the calibration of this add lab calibra struc req sec
	 */
	@Override
	public void setCalibration(String calibration) {
		model.setCalibration(calibration);
	}

	/**
	 * Sets the calibration item of this add lab calibra struc req sec.
	 *
	 * @param calibrationItem the calibration item of this add lab calibra struc req sec
	 */
	@Override
	public void setCalibrationItem(String calibrationItem) {
		model.setCalibrationItem(calibrationItem);
	}

	/**
	 * Sets the company ID of this add lab calibra struc req sec.
	 *
	 * @param companyId the company ID of this add lab calibra struc req sec
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this add lab calibra struc req sec.
	 *
	 * @param counter the counter of this add lab calibra struc req sec
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this add lab calibra struc req sec.
	 *
	 * @param createDate the create date of this add lab calibra struc req sec
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this add lab calibra struc req sec.
	 *
	 * @param groupId the group ID of this add lab calibra struc req sec
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this add lab calibra struc req sec.
	 *
	 * @param janaacApplicationId the janaac application ID of this add lab calibra struc req sec
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the measured quantity of this add lab calibra struc req sec.
	 *
	 * @param measuredQuantity the measured quantity of this add lab calibra struc req sec
	 */
	@Override
	public void setMeasuredQuantity(String measuredQuantity) {
		model.setMeasuredQuantity(measuredQuantity);
	}

	/**
	 * Sets the measurement procedure of this add lab calibra struc req sec.
	 *
	 * @param measurementProcedure the measurement procedure of this add lab calibra struc req sec
	 */
	@Override
	public void setMeasurementProcedure(String measurementProcedure) {
		model.setMeasurementProcedure(measurementProcedure);
	}

	/**
	 * Sets the modified date of this add lab calibra struc req sec.
	 *
	 * @param modifiedDate the modified date of this add lab calibra struc req sec
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the number of this add lab calibra struc req sec.
	 *
	 * @param number the number of this add lab calibra struc req sec
	 */
	@Override
	public void setNumber(String number) {
		model.setNumber(number);
	}

	/**
	 * Sets the primary key of this add lab calibra struc req sec.
	 *
	 * @param primaryKey the primary key of this add lab calibra struc req sec
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the range of this add lab calibra struc req sec.
	 *
	 * @param range the range of this add lab calibra struc req sec
	 */
	@Override
	public void setRange(String range) {
		model.setRange(range);
	}

	/**
	 * Sets the remarks of this add lab calibra struc req sec.
	 *
	 * @param remarks the remarks of this add lab calibra struc req sec
	 */
	@Override
	public void setRemarks(String remarks) {
		model.setRemarks(remarks);
	}

	/**
	 * Sets the user ID of this add lab calibra struc req sec.
	 *
	 * @param userId the user ID of this add lab calibra struc req sec
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this add lab calibra struc req sec.
	 *
	 * @param userName the user name of this add lab calibra struc req sec
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this add lab calibra struc req sec.
	 *
	 * @param userUuid the user uuid of this add lab calibra struc req sec
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
	protected AddLabCalibraStrucReqSecWrapper wrap(
		AddLabCalibraStrucReqSec addLabCalibraStrucReqSec) {

		return new AddLabCalibraStrucReqSecWrapper(addLabCalibraStrucReqSec);
	}

}