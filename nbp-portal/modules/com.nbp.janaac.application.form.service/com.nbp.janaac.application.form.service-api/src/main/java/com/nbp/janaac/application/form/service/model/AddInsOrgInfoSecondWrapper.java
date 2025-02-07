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
 * This class is a wrapper for {@link AddInsOrgInfoSecond}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddInsOrgInfoSecond
 * @generated
 */
public class AddInsOrgInfoSecondWrapper
	extends BaseModelWrapper<AddInsOrgInfoSecond>
	implements AddInsOrgInfoSecond, ModelWrapper<AddInsOrgInfoSecond> {

	public AddInsOrgInfoSecondWrapper(AddInsOrgInfoSecond addInsOrgInfoSecond) {
		super(addInsOrgInfoSecond);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("addInsOrgInfoSecondId", getAddInsOrgInfoSecondId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nameOfStaff", getNameOfStaff());
		attributes.put("jobTitle", getJobTitle());
		attributes.put("majorResponsibilities", getMajorResponsibilities());
		attributes.put("indexInspector", getIndexInspector());
		attributes.put("janaacApplicationId", getJanaacApplicationId());
		attributes.put("counter", getCounter());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long addInsOrgInfoSecondId = (Long)attributes.get(
			"addInsOrgInfoSecondId");

		if (addInsOrgInfoSecondId != null) {
			setAddInsOrgInfoSecondId(addInsOrgInfoSecondId);
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

		String majorResponsibilities = (String)attributes.get(
			"majorResponsibilities");

		if (majorResponsibilities != null) {
			setMajorResponsibilities(majorResponsibilities);
		}

		String indexInspector = (String)attributes.get("indexInspector");

		if (indexInspector != null) {
			setIndexInspector(indexInspector);
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
	public AddInsOrgInfoSecond cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the add ins org info second ID of this add ins org info second.
	 *
	 * @return the add ins org info second ID of this add ins org info second
	 */
	@Override
	public long getAddInsOrgInfoSecondId() {
		return model.getAddInsOrgInfoSecondId();
	}

	/**
	 * Returns the company ID of this add ins org info second.
	 *
	 * @return the company ID of this add ins org info second
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this add ins org info second.
	 *
	 * @return the counter of this add ins org info second
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this add ins org info second.
	 *
	 * @return the create date of this add ins org info second
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this add ins org info second.
	 *
	 * @return the group ID of this add ins org info second
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the index inspector of this add ins org info second.
	 *
	 * @return the index inspector of this add ins org info second
	 */
	@Override
	public String getIndexInspector() {
		return model.getIndexInspector();
	}

	/**
	 * Returns the janaac application ID of this add ins org info second.
	 *
	 * @return the janaac application ID of this add ins org info second
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the job title of this add ins org info second.
	 *
	 * @return the job title of this add ins org info second
	 */
	@Override
	public String getJobTitle() {
		return model.getJobTitle();
	}

	/**
	 * Returns the major responsibilities of this add ins org info second.
	 *
	 * @return the major responsibilities of this add ins org info second
	 */
	@Override
	public String getMajorResponsibilities() {
		return model.getMajorResponsibilities();
	}

	/**
	 * Returns the modified date of this add ins org info second.
	 *
	 * @return the modified date of this add ins org info second
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of staff of this add ins org info second.
	 *
	 * @return the name of staff of this add ins org info second
	 */
	@Override
	public String getNameOfStaff() {
		return model.getNameOfStaff();
	}

	/**
	 * Returns the primary key of this add ins org info second.
	 *
	 * @return the primary key of this add ins org info second
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this add ins org info second.
	 *
	 * @return the user ID of this add ins org info second
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this add ins org info second.
	 *
	 * @return the user name of this add ins org info second
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this add ins org info second.
	 *
	 * @return the user uuid of this add ins org info second
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
	 * Sets the add ins org info second ID of this add ins org info second.
	 *
	 * @param addInsOrgInfoSecondId the add ins org info second ID of this add ins org info second
	 */
	@Override
	public void setAddInsOrgInfoSecondId(long addInsOrgInfoSecondId) {
		model.setAddInsOrgInfoSecondId(addInsOrgInfoSecondId);
	}

	/**
	 * Sets the company ID of this add ins org info second.
	 *
	 * @param companyId the company ID of this add ins org info second
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this add ins org info second.
	 *
	 * @param counter the counter of this add ins org info second
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this add ins org info second.
	 *
	 * @param createDate the create date of this add ins org info second
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this add ins org info second.
	 *
	 * @param groupId the group ID of this add ins org info second
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the index inspector of this add ins org info second.
	 *
	 * @param indexInspector the index inspector of this add ins org info second
	 */
	@Override
	public void setIndexInspector(String indexInspector) {
		model.setIndexInspector(indexInspector);
	}

	/**
	 * Sets the janaac application ID of this add ins org info second.
	 *
	 * @param janaacApplicationId the janaac application ID of this add ins org info second
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the job title of this add ins org info second.
	 *
	 * @param jobTitle the job title of this add ins org info second
	 */
	@Override
	public void setJobTitle(String jobTitle) {
		model.setJobTitle(jobTitle);
	}

	/**
	 * Sets the major responsibilities of this add ins org info second.
	 *
	 * @param majorResponsibilities the major responsibilities of this add ins org info second
	 */
	@Override
	public void setMajorResponsibilities(String majorResponsibilities) {
		model.setMajorResponsibilities(majorResponsibilities);
	}

	/**
	 * Sets the modified date of this add ins org info second.
	 *
	 * @param modifiedDate the modified date of this add ins org info second
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of staff of this add ins org info second.
	 *
	 * @param nameOfStaff the name of staff of this add ins org info second
	 */
	@Override
	public void setNameOfStaff(String nameOfStaff) {
		model.setNameOfStaff(nameOfStaff);
	}

	/**
	 * Sets the primary key of this add ins org info second.
	 *
	 * @param primaryKey the primary key of this add ins org info second
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this add ins org info second.
	 *
	 * @param userId the user ID of this add ins org info second
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this add ins org info second.
	 *
	 * @param userName the user name of this add ins org info second
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this add ins org info second.
	 *
	 * @param userUuid the user uuid of this add ins org info second
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
	protected AddInsOrgInfoSecondWrapper wrap(
		AddInsOrgInfoSecond addInsOrgInfoSecond) {

		return new AddInsOrgInfoSecondWrapper(addInsOrgInfoSecond);
	}

}