/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link NcbjNumberEffectiveAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjNumberEffectiveAdd
 * @generated
 */
public class NcbjNumberEffectiveAddWrapper
	extends BaseModelWrapper<NcbjNumberEffectiveAdd>
	implements ModelWrapper<NcbjNumberEffectiveAdd>, NcbjNumberEffectiveAdd {

	public NcbjNumberEffectiveAddWrapper(
		NcbjNumberEffectiveAdd ncbjNumberEffectiveAdd) {

		super(ncbjNumberEffectiveAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"ncbjNumberEffectiveAddId", getNcbjNumberEffectiveAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put(
			"numberOfFullTimeEmployees", getNumberOfFullTimeEmployees());
		attributes.put(
			"numberOfPartTimeEmployees", getNumberOfPartTimeEmployees());
		attributes.put("department", getDepartment());
		attributes.put("numberOfcontractors", getNumberOfcontractors());
		attributes.put(
			"numberOfContractedWorkers", getNumberOfContractedWorkers());
		attributes.put("counter", getCounter());
		attributes.put("ncbjApplicationId", getNcbjApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ncbjNumberEffectiveAddId = (Long)attributes.get(
			"ncbjNumberEffectiveAddId");

		if (ncbjNumberEffectiveAddId != null) {
			setNcbjNumberEffectiveAddId(ncbjNumberEffectiveAddId);
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

		String numberOfFullTimeEmployees = (String)attributes.get(
			"numberOfFullTimeEmployees");

		if (numberOfFullTimeEmployees != null) {
			setNumberOfFullTimeEmployees(numberOfFullTimeEmployees);
		}

		String numberOfPartTimeEmployees = (String)attributes.get(
			"numberOfPartTimeEmployees");

		if (numberOfPartTimeEmployees != null) {
			setNumberOfPartTimeEmployees(numberOfPartTimeEmployees);
		}

		String department = (String)attributes.get("department");

		if (department != null) {
			setDepartment(department);
		}

		String numberOfcontractors = (String)attributes.get(
			"numberOfcontractors");

		if (numberOfcontractors != null) {
			setNumberOfcontractors(numberOfcontractors);
		}

		String numberOfContractedWorkers = (String)attributes.get(
			"numberOfContractedWorkers");

		if (numberOfContractedWorkers != null) {
			setNumberOfContractedWorkers(numberOfContractedWorkers);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long ncbjApplicationId = (Long)attributes.get("ncbjApplicationId");

		if (ncbjApplicationId != null) {
			setNcbjApplicationId(ncbjApplicationId);
		}
	}

	@Override
	public NcbjNumberEffectiveAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this ncbj number effective add.
	 *
	 * @return the company ID of this ncbj number effective add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this ncbj number effective add.
	 *
	 * @return the counter of this ncbj number effective add
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this ncbj number effective add.
	 *
	 * @return the create date of this ncbj number effective add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the department of this ncbj number effective add.
	 *
	 * @return the department of this ncbj number effective add
	 */
	@Override
	public String getDepartment() {
		return model.getDepartment();
	}

	/**
	 * Returns the group ID of this ncbj number effective add.
	 *
	 * @return the group ID of this ncbj number effective add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this ncbj number effective add.
	 *
	 * @return the modified date of this ncbj number effective add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ncbj application ID of this ncbj number effective add.
	 *
	 * @return the ncbj application ID of this ncbj number effective add
	 */
	@Override
	public long getNcbjApplicationId() {
		return model.getNcbjApplicationId();
	}

	/**
	 * Returns the ncbj number effective add ID of this ncbj number effective add.
	 *
	 * @return the ncbj number effective add ID of this ncbj number effective add
	 */
	@Override
	public long getNcbjNumberEffectiveAddId() {
		return model.getNcbjNumberEffectiveAddId();
	}

	/**
	 * Returns the number of contracted workers of this ncbj number effective add.
	 *
	 * @return the number of contracted workers of this ncbj number effective add
	 */
	@Override
	public String getNumberOfContractedWorkers() {
		return model.getNumberOfContractedWorkers();
	}

	/**
	 * Returns the number ofcontractors of this ncbj number effective add.
	 *
	 * @return the number ofcontractors of this ncbj number effective add
	 */
	@Override
	public String getNumberOfcontractors() {
		return model.getNumberOfcontractors();
	}

	/**
	 * Returns the number of full time employees of this ncbj number effective add.
	 *
	 * @return the number of full time employees of this ncbj number effective add
	 */
	@Override
	public String getNumberOfFullTimeEmployees() {
		return model.getNumberOfFullTimeEmployees();
	}

	/**
	 * Returns the number of part time employees of this ncbj number effective add.
	 *
	 * @return the number of part time employees of this ncbj number effective add
	 */
	@Override
	public String getNumberOfPartTimeEmployees() {
		return model.getNumberOfPartTimeEmployees();
	}

	/**
	 * Returns the primary key of this ncbj number effective add.
	 *
	 * @return the primary key of this ncbj number effective add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this ncbj number effective add.
	 *
	 * @return the user ID of this ncbj number effective add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ncbj number effective add.
	 *
	 * @return the user name of this ncbj number effective add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ncbj number effective add.
	 *
	 * @return the user uuid of this ncbj number effective add
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
	 * Sets the company ID of this ncbj number effective add.
	 *
	 * @param companyId the company ID of this ncbj number effective add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this ncbj number effective add.
	 *
	 * @param counter the counter of this ncbj number effective add
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this ncbj number effective add.
	 *
	 * @param createDate the create date of this ncbj number effective add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the department of this ncbj number effective add.
	 *
	 * @param department the department of this ncbj number effective add
	 */
	@Override
	public void setDepartment(String department) {
		model.setDepartment(department);
	}

	/**
	 * Sets the group ID of this ncbj number effective add.
	 *
	 * @param groupId the group ID of this ncbj number effective add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this ncbj number effective add.
	 *
	 * @param modifiedDate the modified date of this ncbj number effective add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ncbj application ID of this ncbj number effective add.
	 *
	 * @param ncbjApplicationId the ncbj application ID of this ncbj number effective add
	 */
	@Override
	public void setNcbjApplicationId(long ncbjApplicationId) {
		model.setNcbjApplicationId(ncbjApplicationId);
	}

	/**
	 * Sets the ncbj number effective add ID of this ncbj number effective add.
	 *
	 * @param ncbjNumberEffectiveAddId the ncbj number effective add ID of this ncbj number effective add
	 */
	@Override
	public void setNcbjNumberEffectiveAddId(long ncbjNumberEffectiveAddId) {
		model.setNcbjNumberEffectiveAddId(ncbjNumberEffectiveAddId);
	}

	/**
	 * Sets the number of contracted workers of this ncbj number effective add.
	 *
	 * @param numberOfContractedWorkers the number of contracted workers of this ncbj number effective add
	 */
	@Override
	public void setNumberOfContractedWorkers(String numberOfContractedWorkers) {
		model.setNumberOfContractedWorkers(numberOfContractedWorkers);
	}

	/**
	 * Sets the number ofcontractors of this ncbj number effective add.
	 *
	 * @param numberOfcontractors the number ofcontractors of this ncbj number effective add
	 */
	@Override
	public void setNumberOfcontractors(String numberOfcontractors) {
		model.setNumberOfcontractors(numberOfcontractors);
	}

	/**
	 * Sets the number of full time employees of this ncbj number effective add.
	 *
	 * @param numberOfFullTimeEmployees the number of full time employees of this ncbj number effective add
	 */
	@Override
	public void setNumberOfFullTimeEmployees(String numberOfFullTimeEmployees) {
		model.setNumberOfFullTimeEmployees(numberOfFullTimeEmployees);
	}

	/**
	 * Sets the number of part time employees of this ncbj number effective add.
	 *
	 * @param numberOfPartTimeEmployees the number of part time employees of this ncbj number effective add
	 */
	@Override
	public void setNumberOfPartTimeEmployees(String numberOfPartTimeEmployees) {
		model.setNumberOfPartTimeEmployees(numberOfPartTimeEmployees);
	}

	/**
	 * Sets the primary key of this ncbj number effective add.
	 *
	 * @param primaryKey the primary key of this ncbj number effective add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this ncbj number effective add.
	 *
	 * @param userId the user ID of this ncbj number effective add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ncbj number effective add.
	 *
	 * @param userName the user name of this ncbj number effective add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ncbj number effective add.
	 *
	 * @param userUuid the user uuid of this ncbj number effective add
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
	protected NcbjNumberEffectiveAddWrapper wrap(
		NcbjNumberEffectiveAdd ncbjNumberEffectiveAdd) {

		return new NcbjNumberEffectiveAddWrapper(ncbjNumberEffectiveAdd);
	}

}