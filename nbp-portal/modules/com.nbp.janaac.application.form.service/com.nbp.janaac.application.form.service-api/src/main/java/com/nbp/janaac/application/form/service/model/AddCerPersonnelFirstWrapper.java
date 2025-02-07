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
 * This class is a wrapper for {@link AddCerPersonnelFirst}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddCerPersonnelFirst
 * @generated
 */
public class AddCerPersonnelFirstWrapper
	extends BaseModelWrapper<AddCerPersonnelFirst>
	implements AddCerPersonnelFirst, ModelWrapper<AddCerPersonnelFirst> {

	public AddCerPersonnelFirstWrapper(
		AddCerPersonnelFirst addCerPersonnelFirst) {

		super(addCerPersonnelFirst);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("addCerPersonnelFirstId", getAddCerPersonnelFirstId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nameOfStaff", getNameOfStaff());
		attributes.put("jobTitle", getJobTitle());
		attributes.put("majorResponsibility", getMajorResponsibility());
		attributes.put("specificFunctions", getSpecificFunctions());
		attributes.put("janaacApplicationId", getJanaacApplicationId());
		attributes.put("counter", getCounter());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long addCerPersonnelFirstId = (Long)attributes.get(
			"addCerPersonnelFirstId");

		if (addCerPersonnelFirstId != null) {
			setAddCerPersonnelFirstId(addCerPersonnelFirstId);
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

		String nameOfStaff = (String)attributes.get("nameOfStaff");

		if (nameOfStaff != null) {
			setNameOfStaff(nameOfStaff);
		}

		String jobTitle = (String)attributes.get("jobTitle");

		if (jobTitle != null) {
			setJobTitle(jobTitle);
		}

		String majorResponsibility = (String)attributes.get(
			"majorResponsibility");

		if (majorResponsibility != null) {
			setMajorResponsibility(majorResponsibility);
		}

		String specificFunctions = (String)attributes.get("specificFunctions");

		if (specificFunctions != null) {
			setSpecificFunctions(specificFunctions);
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
	public AddCerPersonnelFirst cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the add cer personnel first ID of this add cer personnel first.
	 *
	 * @return the add cer personnel first ID of this add cer personnel first
	 */
	@Override
	public long getAddCerPersonnelFirstId() {
		return model.getAddCerPersonnelFirstId();
	}

	/**
	 * Returns the company ID of this add cer personnel first.
	 *
	 * @return the company ID of this add cer personnel first
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this add cer personnel first.
	 *
	 * @return the counter of this add cer personnel first
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this add cer personnel first.
	 *
	 * @return the create date of this add cer personnel first
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this add cer personnel first.
	 *
	 * @return the group ID of this add cer personnel first
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this add cer personnel first.
	 *
	 * @return the janaac application ID of this add cer personnel first
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the job title of this add cer personnel first.
	 *
	 * @return the job title of this add cer personnel first
	 */
	@Override
	public String getJobTitle() {
		return model.getJobTitle();
	}

	/**
	 * Returns the major responsibility of this add cer personnel first.
	 *
	 * @return the major responsibility of this add cer personnel first
	 */
	@Override
	public String getMajorResponsibility() {
		return model.getMajorResponsibility();
	}

	/**
	 * Returns the modified date of this add cer personnel first.
	 *
	 * @return the modified date of this add cer personnel first
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of staff of this add cer personnel first.
	 *
	 * @return the name of staff of this add cer personnel first
	 */
	@Override
	public String getNameOfStaff() {
		return model.getNameOfStaff();
	}

	/**
	 * Returns the primary key of this add cer personnel first.
	 *
	 * @return the primary key of this add cer personnel first
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the specific functions of this add cer personnel first.
	 *
	 * @return the specific functions of this add cer personnel first
	 */
	@Override
	public String getSpecificFunctions() {
		return model.getSpecificFunctions();
	}

	/**
	 * Returns the user ID of this add cer personnel first.
	 *
	 * @return the user ID of this add cer personnel first
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this add cer personnel first.
	 *
	 * @return the user name of this add cer personnel first
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this add cer personnel first.
	 *
	 * @return the user uuid of this add cer personnel first
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
	 * Sets the add cer personnel first ID of this add cer personnel first.
	 *
	 * @param addCerPersonnelFirstId the add cer personnel first ID of this add cer personnel first
	 */
	@Override
	public void setAddCerPersonnelFirstId(long addCerPersonnelFirstId) {
		model.setAddCerPersonnelFirstId(addCerPersonnelFirstId);
	}

	/**
	 * Sets the company ID of this add cer personnel first.
	 *
	 * @param companyId the company ID of this add cer personnel first
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this add cer personnel first.
	 *
	 * @param counter the counter of this add cer personnel first
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this add cer personnel first.
	 *
	 * @param createDate the create date of this add cer personnel first
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this add cer personnel first.
	 *
	 * @param groupId the group ID of this add cer personnel first
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this add cer personnel first.
	 *
	 * @param janaacApplicationId the janaac application ID of this add cer personnel first
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the job title of this add cer personnel first.
	 *
	 * @param jobTitle the job title of this add cer personnel first
	 */
	@Override
	public void setJobTitle(String jobTitle) {
		model.setJobTitle(jobTitle);
	}

	/**
	 * Sets the major responsibility of this add cer personnel first.
	 *
	 * @param majorResponsibility the major responsibility of this add cer personnel first
	 */
	@Override
	public void setMajorResponsibility(String majorResponsibility) {
		model.setMajorResponsibility(majorResponsibility);
	}

	/**
	 * Sets the modified date of this add cer personnel first.
	 *
	 * @param modifiedDate the modified date of this add cer personnel first
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of staff of this add cer personnel first.
	 *
	 * @param nameOfStaff the name of staff of this add cer personnel first
	 */
	@Override
	public void setNameOfStaff(String nameOfStaff) {
		model.setNameOfStaff(nameOfStaff);
	}

	/**
	 * Sets the primary key of this add cer personnel first.
	 *
	 * @param primaryKey the primary key of this add cer personnel first
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the specific functions of this add cer personnel first.
	 *
	 * @param specificFunctions the specific functions of this add cer personnel first
	 */
	@Override
	public void setSpecificFunctions(String specificFunctions) {
		model.setSpecificFunctions(specificFunctions);
	}

	/**
	 * Sets the user ID of this add cer personnel first.
	 *
	 * @param userId the user ID of this add cer personnel first
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this add cer personnel first.
	 *
	 * @param userName the user name of this add cer personnel first
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this add cer personnel first.
	 *
	 * @param userUuid the user uuid of this add cer personnel first
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
	protected AddCerPersonnelFirstWrapper wrap(
		AddCerPersonnelFirst addCerPersonnelFirst) {

		return new AddCerPersonnelFirstWrapper(addCerPersonnelFirst);
	}

}