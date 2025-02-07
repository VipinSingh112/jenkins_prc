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
 * This class is a wrapper for {@link AddLabStructuralRequirement}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLabStructuralRequirement
 * @generated
 */
public class AddLabStructuralRequirementWrapper
	extends BaseModelWrapper<AddLabStructuralRequirement>
	implements AddLabStructuralRequirement,
			   ModelWrapper<AddLabStructuralRequirement> {

	public AddLabStructuralRequirementWrapper(
		AddLabStructuralRequirement addLabStructuralRequirement) {

		super(addLabStructuralRequirement);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"addLabStructuralRequirementId",
			getAddLabStructuralRequirementId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nameOfStaff", getNameOfStaff());
		attributes.put("jobTitle", getJobTitle());
		attributes.put("majorResponsibilities", getMajorResponsibilities());
		attributes.put("indicateAnalysts ", getIndicateAnalysts());
		attributes.put("janaacApplicationId", getJanaacApplicationId());
		attributes.put("counter", getCounter());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long addLabStructuralRequirementId = (Long)attributes.get(
			"addLabStructuralRequirementId");

		if (addLabStructuralRequirementId != null) {
			setAddLabStructuralRequirementId(addLabStructuralRequirementId);
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

		String indicateAnalysts = (String)attributes.get("indicateAnalysts ");

		if (indicateAnalysts != null) {
			setIndicateAnalysts(indicateAnalysts);
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
	public AddLabStructuralRequirement cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the add lab structural requirement ID of this add lab structural requirement.
	 *
	 * @return the add lab structural requirement ID of this add lab structural requirement
	 */
	@Override
	public long getAddLabStructuralRequirementId() {
		return model.getAddLabStructuralRequirementId();
	}

	/**
	 * Returns the company ID of this add lab structural requirement.
	 *
	 * @return the company ID of this add lab structural requirement
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this add lab structural requirement.
	 *
	 * @return the counter of this add lab structural requirement
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this add lab structural requirement.
	 *
	 * @return the create date of this add lab structural requirement
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this add lab structural requirement.
	 *
	 * @return the group ID of this add lab structural requirement
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the indicate analysts of this add lab structural requirement.
	 *
	 * @return the indicate analysts of this add lab structural requirement
	 */
	@Override
	public String getIndicateAnalysts() {
		return model.getIndicateAnalysts();
	}

	/**
	 * Returns the janaac application ID of this add lab structural requirement.
	 *
	 * @return the janaac application ID of this add lab structural requirement
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the job title of this add lab structural requirement.
	 *
	 * @return the job title of this add lab structural requirement
	 */
	@Override
	public String getJobTitle() {
		return model.getJobTitle();
	}

	/**
	 * Returns the major responsibilities of this add lab structural requirement.
	 *
	 * @return the major responsibilities of this add lab structural requirement
	 */
	@Override
	public String getMajorResponsibilities() {
		return model.getMajorResponsibilities();
	}

	/**
	 * Returns the modified date of this add lab structural requirement.
	 *
	 * @return the modified date of this add lab structural requirement
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of staff of this add lab structural requirement.
	 *
	 * @return the name of staff of this add lab structural requirement
	 */
	@Override
	public String getNameOfStaff() {
		return model.getNameOfStaff();
	}

	/**
	 * Returns the primary key of this add lab structural requirement.
	 *
	 * @return the primary key of this add lab structural requirement
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this add lab structural requirement.
	 *
	 * @return the user ID of this add lab structural requirement
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this add lab structural requirement.
	 *
	 * @return the user name of this add lab structural requirement
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this add lab structural requirement.
	 *
	 * @return the user uuid of this add lab structural requirement
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
	 * Sets the add lab structural requirement ID of this add lab structural requirement.
	 *
	 * @param addLabStructuralRequirementId the add lab structural requirement ID of this add lab structural requirement
	 */
	@Override
	public void setAddLabStructuralRequirementId(
		long addLabStructuralRequirementId) {

		model.setAddLabStructuralRequirementId(addLabStructuralRequirementId);
	}

	/**
	 * Sets the company ID of this add lab structural requirement.
	 *
	 * @param companyId the company ID of this add lab structural requirement
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this add lab structural requirement.
	 *
	 * @param counter the counter of this add lab structural requirement
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this add lab structural requirement.
	 *
	 * @param createDate the create date of this add lab structural requirement
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this add lab structural requirement.
	 *
	 * @param groupId the group ID of this add lab structural requirement
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the indicate analysts of this add lab structural requirement.
	 *
	 * @param indicateAnalysts  the indicate analysts of this add lab structural requirement
	 */
	@Override
	public void setIndicateAnalysts(String indicateAnalysts) {
		model.setIndicateAnalysts(indicateAnalysts);
	}

	/**
	 * Sets the janaac application ID of this add lab structural requirement.
	 *
	 * @param janaacApplicationId the janaac application ID of this add lab structural requirement
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the job title of this add lab structural requirement.
	 *
	 * @param jobTitle the job title of this add lab structural requirement
	 */
	@Override
	public void setJobTitle(String jobTitle) {
		model.setJobTitle(jobTitle);
	}

	/**
	 * Sets the major responsibilities of this add lab structural requirement.
	 *
	 * @param majorResponsibilities the major responsibilities of this add lab structural requirement
	 */
	@Override
	public void setMajorResponsibilities(String majorResponsibilities) {
		model.setMajorResponsibilities(majorResponsibilities);
	}

	/**
	 * Sets the modified date of this add lab structural requirement.
	 *
	 * @param modifiedDate the modified date of this add lab structural requirement
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of staff of this add lab structural requirement.
	 *
	 * @param nameOfStaff the name of staff of this add lab structural requirement
	 */
	@Override
	public void setNameOfStaff(String nameOfStaff) {
		model.setNameOfStaff(nameOfStaff);
	}

	/**
	 * Sets the primary key of this add lab structural requirement.
	 *
	 * @param primaryKey the primary key of this add lab structural requirement
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this add lab structural requirement.
	 *
	 * @param userId the user ID of this add lab structural requirement
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this add lab structural requirement.
	 *
	 * @param userName the user name of this add lab structural requirement
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this add lab structural requirement.
	 *
	 * @param userUuid the user uuid of this add lab structural requirement
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
	protected AddLabStructuralRequirementWrapper wrap(
		AddLabStructuralRequirement addLabStructuralRequirement) {

		return new AddLabStructuralRequirementWrapper(
			addLabStructuralRequirement);
	}

}