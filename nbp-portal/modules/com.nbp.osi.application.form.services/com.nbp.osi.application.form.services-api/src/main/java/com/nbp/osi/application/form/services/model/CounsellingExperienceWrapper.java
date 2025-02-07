/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CounsellingExperience}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CounsellingExperience
 * @generated
 */
public class CounsellingExperienceWrapper
	extends BaseModelWrapper<CounsellingExperience>
	implements CounsellingExperience, ModelWrapper<CounsellingExperience> {

	public CounsellingExperienceWrapper(
		CounsellingExperience counsellingExperience) {

		super(counsellingExperience);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("counsellingExperienceId", getCounsellingExperienceId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("company", getCompany());
		attributes.put("position", getPosition());
		attributes.put("counsellingType", getCounsellingType());
		attributes.put("serviceLength", getServiceLength());
		attributes.put("counter", getCounter());
		attributes.put("osiApplicationId", getOsiApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long counsellingExperienceId = (Long)attributes.get(
			"counsellingExperienceId");

		if (counsellingExperienceId != null) {
			setCounsellingExperienceId(counsellingExperienceId);
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

		String company = (String)attributes.get("company");

		if (company != null) {
			setCompany(company);
		}

		String position = (String)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}

		String counsellingType = (String)attributes.get("counsellingType");

		if (counsellingType != null) {
			setCounsellingType(counsellingType);
		}

		String serviceLength = (String)attributes.get("serviceLength");

		if (serviceLength != null) {
			setServiceLength(serviceLength);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long osiApplicationId = (Long)attributes.get("osiApplicationId");

		if (osiApplicationId != null) {
			setOsiApplicationId(osiApplicationId);
		}
	}

	@Override
	public CounsellingExperience cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company of this counselling experience.
	 *
	 * @return the company of this counselling experience
	 */
	@Override
	public String getCompany() {
		return model.getCompany();
	}

	/**
	 * Returns the company ID of this counselling experience.
	 *
	 * @return the company ID of this counselling experience
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counselling experience ID of this counselling experience.
	 *
	 * @return the counselling experience ID of this counselling experience
	 */
	@Override
	public long getCounsellingExperienceId() {
		return model.getCounsellingExperienceId();
	}

	/**
	 * Returns the counselling type of this counselling experience.
	 *
	 * @return the counselling type of this counselling experience
	 */
	@Override
	public String getCounsellingType() {
		return model.getCounsellingType();
	}

	/**
	 * Returns the counter of this counselling experience.
	 *
	 * @return the counter of this counselling experience
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this counselling experience.
	 *
	 * @return the create date of this counselling experience
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this counselling experience.
	 *
	 * @return the group ID of this counselling experience
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this counselling experience.
	 *
	 * @return the modified date of this counselling experience
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi application ID of this counselling experience.
	 *
	 * @return the osi application ID of this counselling experience
	 */
	@Override
	public long getOsiApplicationId() {
		return model.getOsiApplicationId();
	}

	/**
	 * Returns the position of this counselling experience.
	 *
	 * @return the position of this counselling experience
	 */
	@Override
	public String getPosition() {
		return model.getPosition();
	}

	/**
	 * Returns the primary key of this counselling experience.
	 *
	 * @return the primary key of this counselling experience
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the service length of this counselling experience.
	 *
	 * @return the service length of this counselling experience
	 */
	@Override
	public String getServiceLength() {
		return model.getServiceLength();
	}

	/**
	 * Returns the user ID of this counselling experience.
	 *
	 * @return the user ID of this counselling experience
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this counselling experience.
	 *
	 * @return the user name of this counselling experience
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this counselling experience.
	 *
	 * @return the user uuid of this counselling experience
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
	 * Sets the company of this counselling experience.
	 *
	 * @param company the company of this counselling experience
	 */
	@Override
	public void setCompany(String company) {
		model.setCompany(company);
	}

	/**
	 * Sets the company ID of this counselling experience.
	 *
	 * @param companyId the company ID of this counselling experience
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counselling experience ID of this counselling experience.
	 *
	 * @param counsellingExperienceId the counselling experience ID of this counselling experience
	 */
	@Override
	public void setCounsellingExperienceId(long counsellingExperienceId) {
		model.setCounsellingExperienceId(counsellingExperienceId);
	}

	/**
	 * Sets the counselling type of this counselling experience.
	 *
	 * @param counsellingType the counselling type of this counselling experience
	 */
	@Override
	public void setCounsellingType(String counsellingType) {
		model.setCounsellingType(counsellingType);
	}

	/**
	 * Sets the counter of this counselling experience.
	 *
	 * @param counter the counter of this counselling experience
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this counselling experience.
	 *
	 * @param createDate the create date of this counselling experience
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this counselling experience.
	 *
	 * @param groupId the group ID of this counselling experience
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this counselling experience.
	 *
	 * @param modifiedDate the modified date of this counselling experience
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi application ID of this counselling experience.
	 *
	 * @param osiApplicationId the osi application ID of this counselling experience
	 */
	@Override
	public void setOsiApplicationId(long osiApplicationId) {
		model.setOsiApplicationId(osiApplicationId);
	}

	/**
	 * Sets the position of this counselling experience.
	 *
	 * @param position the position of this counselling experience
	 */
	@Override
	public void setPosition(String position) {
		model.setPosition(position);
	}

	/**
	 * Sets the primary key of this counselling experience.
	 *
	 * @param primaryKey the primary key of this counselling experience
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the service length of this counselling experience.
	 *
	 * @param serviceLength the service length of this counselling experience
	 */
	@Override
	public void setServiceLength(String serviceLength) {
		model.setServiceLength(serviceLength);
	}

	/**
	 * Sets the user ID of this counselling experience.
	 *
	 * @param userId the user ID of this counselling experience
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this counselling experience.
	 *
	 * @param userName the user name of this counselling experience
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this counselling experience.
	 *
	 * @param userUuid the user uuid of this counselling experience
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
	protected CounsellingExperienceWrapper wrap(
		CounsellingExperience counsellingExperience) {

		return new CounsellingExperienceWrapper(counsellingExperience);
	}

}