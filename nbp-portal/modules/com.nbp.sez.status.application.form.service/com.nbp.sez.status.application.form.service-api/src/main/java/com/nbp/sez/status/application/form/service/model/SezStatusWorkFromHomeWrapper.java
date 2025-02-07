/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SezStatusWorkFromHome}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusWorkFromHome
 * @generated
 */
public class SezStatusWorkFromHomeWrapper
	extends BaseModelWrapper<SezStatusWorkFromHome>
	implements ModelWrapper<SezStatusWorkFromHome>, SezStatusWorkFromHome {

	public SezStatusWorkFromHomeWrapper(
		SezStatusWorkFromHome sezStatusWorkFromHome) {

		super(sezStatusWorkFromHome);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sezStatusWorkFromHomeId", getSezStatusWorkFromHomeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("companyName", getCompanyName());
		attributes.put("contactPersonName", getContactPersonName());
		attributes.put("contactPersonEmail", getContactPersonEmail());
		attributes.put("controlNumber", getControlNumber());
		attributes.put(
			"workerUtilizingIncentive", getWorkerUtilizingIncentive());
		attributes.put(
			"workerUtilizingIncentiveMonth",
			getWorkerUtilizingIncentiveMonth());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezStatusWorkFromHomeId = (Long)attributes.get(
			"sezStatusWorkFromHomeId");

		if (sezStatusWorkFromHomeId != null) {
			setSezStatusWorkFromHomeId(sezStatusWorkFromHomeId);
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

		String companyName = (String)attributes.get("companyName");

		if (companyName != null) {
			setCompanyName(companyName);
		}

		String contactPersonName = (String)attributes.get("contactPersonName");

		if (contactPersonName != null) {
			setContactPersonName(contactPersonName);
		}

		String contactPersonEmail = (String)attributes.get(
			"contactPersonEmail");

		if (contactPersonEmail != null) {
			setContactPersonEmail(contactPersonEmail);
		}

		String controlNumber = (String)attributes.get("controlNumber");

		if (controlNumber != null) {
			setControlNumber(controlNumber);
		}

		String workerUtilizingIncentive = (String)attributes.get(
			"workerUtilizingIncentive");

		if (workerUtilizingIncentive != null) {
			setWorkerUtilizingIncentive(workerUtilizingIncentive);
		}

		String workerUtilizingIncentiveMonth = (String)attributes.get(
			"workerUtilizingIncentiveMonth");

		if (workerUtilizingIncentiveMonth != null) {
			setWorkerUtilizingIncentiveMonth(workerUtilizingIncentiveMonth);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezStatusWorkFromHome cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this sez status work from home.
	 *
	 * @return the company ID of this sez status work from home
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company name of this sez status work from home.
	 *
	 * @return the company name of this sez status work from home
	 */
	@Override
	public String getCompanyName() {
		return model.getCompanyName();
	}

	/**
	 * Returns the contact person email of this sez status work from home.
	 *
	 * @return the contact person email of this sez status work from home
	 */
	@Override
	public String getContactPersonEmail() {
		return model.getContactPersonEmail();
	}

	/**
	 * Returns the contact person name of this sez status work from home.
	 *
	 * @return the contact person name of this sez status work from home
	 */
	@Override
	public String getContactPersonName() {
		return model.getContactPersonName();
	}

	/**
	 * Returns the control number of this sez status work from home.
	 *
	 * @return the control number of this sez status work from home
	 */
	@Override
	public String getControlNumber() {
		return model.getControlNumber();
	}

	/**
	 * Returns the create date of this sez status work from home.
	 *
	 * @return the create date of this sez status work from home
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this sez status work from home.
	 *
	 * @return the group ID of this sez status work from home
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez status work from home.
	 *
	 * @return the modified date of this sez status work from home
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this sez status work from home.
	 *
	 * @return the primary key of this sez status work from home
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez status application ID of this sez status work from home.
	 *
	 * @return the sez status application ID of this sez status work from home
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the sez status work from home ID of this sez status work from home.
	 *
	 * @return the sez status work from home ID of this sez status work from home
	 */
	@Override
	public long getSezStatusWorkFromHomeId() {
		return model.getSezStatusWorkFromHomeId();
	}

	/**
	 * Returns the user ID of this sez status work from home.
	 *
	 * @return the user ID of this sez status work from home
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez status work from home.
	 *
	 * @return the user name of this sez status work from home
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez status work from home.
	 *
	 * @return the user uuid of this sez status work from home
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the worker utilizing incentive of this sez status work from home.
	 *
	 * @return the worker utilizing incentive of this sez status work from home
	 */
	@Override
	public String getWorkerUtilizingIncentive() {
		return model.getWorkerUtilizingIncentive();
	}

	/**
	 * Returns the worker utilizing incentive month of this sez status work from home.
	 *
	 * @return the worker utilizing incentive month of this sez status work from home
	 */
	@Override
	public String getWorkerUtilizingIncentiveMonth() {
		return model.getWorkerUtilizingIncentiveMonth();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this sez status work from home.
	 *
	 * @param companyId the company ID of this sez status work from home
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company name of this sez status work from home.
	 *
	 * @param companyName the company name of this sez status work from home
	 */
	@Override
	public void setCompanyName(String companyName) {
		model.setCompanyName(companyName);
	}

	/**
	 * Sets the contact person email of this sez status work from home.
	 *
	 * @param contactPersonEmail the contact person email of this sez status work from home
	 */
	@Override
	public void setContactPersonEmail(String contactPersonEmail) {
		model.setContactPersonEmail(contactPersonEmail);
	}

	/**
	 * Sets the contact person name of this sez status work from home.
	 *
	 * @param contactPersonName the contact person name of this sez status work from home
	 */
	@Override
	public void setContactPersonName(String contactPersonName) {
		model.setContactPersonName(contactPersonName);
	}

	/**
	 * Sets the control number of this sez status work from home.
	 *
	 * @param controlNumber the control number of this sez status work from home
	 */
	@Override
	public void setControlNumber(String controlNumber) {
		model.setControlNumber(controlNumber);
	}

	/**
	 * Sets the create date of this sez status work from home.
	 *
	 * @param createDate the create date of this sez status work from home
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this sez status work from home.
	 *
	 * @param groupId the group ID of this sez status work from home
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez status work from home.
	 *
	 * @param modifiedDate the modified date of this sez status work from home
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this sez status work from home.
	 *
	 * @param primaryKey the primary key of this sez status work from home
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez status application ID of this sez status work from home.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez status work from home
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the sez status work from home ID of this sez status work from home.
	 *
	 * @param sezStatusWorkFromHomeId the sez status work from home ID of this sez status work from home
	 */
	@Override
	public void setSezStatusWorkFromHomeId(long sezStatusWorkFromHomeId) {
		model.setSezStatusWorkFromHomeId(sezStatusWorkFromHomeId);
	}

	/**
	 * Sets the user ID of this sez status work from home.
	 *
	 * @param userId the user ID of this sez status work from home
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez status work from home.
	 *
	 * @param userName the user name of this sez status work from home
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez status work from home.
	 *
	 * @param userUuid the user uuid of this sez status work from home
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the worker utilizing incentive of this sez status work from home.
	 *
	 * @param workerUtilizingIncentive the worker utilizing incentive of this sez status work from home
	 */
	@Override
	public void setWorkerUtilizingIncentive(String workerUtilizingIncentive) {
		model.setWorkerUtilizingIncentive(workerUtilizingIncentive);
	}

	/**
	 * Sets the worker utilizing incentive month of this sez status work from home.
	 *
	 * @param workerUtilizingIncentiveMonth the worker utilizing incentive month of this sez status work from home
	 */
	@Override
	public void setWorkerUtilizingIncentiveMonth(
		String workerUtilizingIncentiveMonth) {

		model.setWorkerUtilizingIncentiveMonth(workerUtilizingIncentiveMonth);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected SezStatusWorkFromHomeWrapper wrap(
		SezStatusWorkFromHome sezStatusWorkFromHome) {

		return new SezStatusWorkFromHomeWrapper(sezStatusWorkFromHome);
	}

}