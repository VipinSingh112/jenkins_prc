/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CreativeIndividualGeneralInformation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeIndividualGeneralInformation
 * @generated
 */
public class CreativeIndividualGeneralInformationWrapper
	extends BaseModelWrapper<CreativeIndividualGeneralInformation>
	implements CreativeIndividualGeneralInformation,
			   ModelWrapper<CreativeIndividualGeneralInformation> {

	public CreativeIndividualGeneralInformationWrapper(
		CreativeIndividualGeneralInformation
			creativeIndividualGeneralInformation) {

		super(creativeIndividualGeneralInformation);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"creativeIndiGeneralInfoId", getCreativeIndiGeneralInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("profile", getProfile());
		attributes.put("CreativeApplicationId", getCreativeApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long creativeIndiGeneralInfoId = (Long)attributes.get(
			"creativeIndiGeneralInfoId");

		if (creativeIndiGeneralInfoId != null) {
			setCreativeIndiGeneralInfoId(creativeIndiGeneralInfoId);
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

		String profile = (String)attributes.get("profile");

		if (profile != null) {
			setProfile(profile);
		}

		Long CreativeApplicationId = (Long)attributes.get(
			"CreativeApplicationId");

		if (CreativeApplicationId != null) {
			setCreativeApplicationId(CreativeApplicationId);
		}
	}

	@Override
	public CreativeIndividualGeneralInformation cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this creative individual general information.
	 *
	 * @return the company ID of this creative individual general information
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this creative individual general information.
	 *
	 * @return the create date of this creative individual general information
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the creative application ID of this creative individual general information.
	 *
	 * @return the creative application ID of this creative individual general information
	 */
	@Override
	public long getCreativeApplicationId() {
		return model.getCreativeApplicationId();
	}

	/**
	 * Returns the creative indi general info ID of this creative individual general information.
	 *
	 * @return the creative indi general info ID of this creative individual general information
	 */
	@Override
	public long getCreativeIndiGeneralInfoId() {
		return model.getCreativeIndiGeneralInfoId();
	}

	/**
	 * Returns the group ID of this creative individual general information.
	 *
	 * @return the group ID of this creative individual general information
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this creative individual general information.
	 *
	 * @return the modified date of this creative individual general information
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this creative individual general information.
	 *
	 * @return the primary key of this creative individual general information
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the profile of this creative individual general information.
	 *
	 * @return the profile of this creative individual general information
	 */
	@Override
	public String getProfile() {
		return model.getProfile();
	}

	/**
	 * Returns the user ID of this creative individual general information.
	 *
	 * @return the user ID of this creative individual general information
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this creative individual general information.
	 *
	 * @return the user name of this creative individual general information
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this creative individual general information.
	 *
	 * @return the user uuid of this creative individual general information
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
	 * Sets the company ID of this creative individual general information.
	 *
	 * @param companyId the company ID of this creative individual general information
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this creative individual general information.
	 *
	 * @param createDate the create date of this creative individual general information
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the creative application ID of this creative individual general information.
	 *
	 * @param CreativeApplicationId the creative application ID of this creative individual general information
	 */
	@Override
	public void setCreativeApplicationId(long CreativeApplicationId) {
		model.setCreativeApplicationId(CreativeApplicationId);
	}

	/**
	 * Sets the creative indi general info ID of this creative individual general information.
	 *
	 * @param creativeIndiGeneralInfoId the creative indi general info ID of this creative individual general information
	 */
	@Override
	public void setCreativeIndiGeneralInfoId(long creativeIndiGeneralInfoId) {
		model.setCreativeIndiGeneralInfoId(creativeIndiGeneralInfoId);
	}

	/**
	 * Sets the group ID of this creative individual general information.
	 *
	 * @param groupId the group ID of this creative individual general information
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this creative individual general information.
	 *
	 * @param modifiedDate the modified date of this creative individual general information
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this creative individual general information.
	 *
	 * @param primaryKey the primary key of this creative individual general information
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the profile of this creative individual general information.
	 *
	 * @param profile the profile of this creative individual general information
	 */
	@Override
	public void setProfile(String profile) {
		model.setProfile(profile);
	}

	/**
	 * Sets the user ID of this creative individual general information.
	 *
	 * @param userId the user ID of this creative individual general information
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this creative individual general information.
	 *
	 * @param userName the user name of this creative individual general information
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this creative individual general information.
	 *
	 * @param userUuid the user uuid of this creative individual general information
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
	protected CreativeIndividualGeneralInformationWrapper wrap(
		CreativeIndividualGeneralInformation
			creativeIndividualGeneralInformation) {

		return new CreativeIndividualGeneralInformationWrapper(
			creativeIndividualGeneralInformation);
	}

}