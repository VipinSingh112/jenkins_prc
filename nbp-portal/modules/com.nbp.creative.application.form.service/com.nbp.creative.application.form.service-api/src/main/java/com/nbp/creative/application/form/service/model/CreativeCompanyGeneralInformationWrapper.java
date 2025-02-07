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
 * This class is a wrapper for {@link CreativeCompanyGeneralInformation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyGeneralInformation
 * @generated
 */
public class CreativeCompanyGeneralInformationWrapper
	extends BaseModelWrapper<CreativeCompanyGeneralInformation>
	implements CreativeCompanyGeneralInformation,
			   ModelWrapper<CreativeCompanyGeneralInformation> {

	public CreativeCompanyGeneralInformationWrapper(
		CreativeCompanyGeneralInformation creativeCompanyGeneralInformation) {

		super(creativeCompanyGeneralInformation);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"creativeCompanyGeneralInfoId", getCreativeCompanyGeneralInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("HaveYouRecievedAny", getHaveYouRecievedAny());
		attributes.put("mprsStartDate", getMprsStartDate());
		attributes.put("mprsEndDate", getMprsEndDate());
		attributes.put("mttStartDate", getMttStartDate());
		attributes.put("mttEndDate", getMttEndDate());
		attributes.put("CreativeApplicationId", getCreativeApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long creativeCompanyGeneralInfoId = (Long)attributes.get(
			"creativeCompanyGeneralInfoId");

		if (creativeCompanyGeneralInfoId != null) {
			setCreativeCompanyGeneralInfoId(creativeCompanyGeneralInfoId);
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

		String HaveYouRecievedAny = (String)attributes.get(
			"HaveYouRecievedAny");

		if (HaveYouRecievedAny != null) {
			setHaveYouRecievedAny(HaveYouRecievedAny);
		}

		Date mprsStartDate = (Date)attributes.get("mprsStartDate");

		if (mprsStartDate != null) {
			setMprsStartDate(mprsStartDate);
		}

		Date mprsEndDate = (Date)attributes.get("mprsEndDate");

		if (mprsEndDate != null) {
			setMprsEndDate(mprsEndDate);
		}

		Date mttStartDate = (Date)attributes.get("mttStartDate");

		if (mttStartDate != null) {
			setMttStartDate(mttStartDate);
		}

		Date mttEndDate = (Date)attributes.get("mttEndDate");

		if (mttEndDate != null) {
			setMttEndDate(mttEndDate);
		}

		Long CreativeApplicationId = (Long)attributes.get(
			"CreativeApplicationId");

		if (CreativeApplicationId != null) {
			setCreativeApplicationId(CreativeApplicationId);
		}
	}

	@Override
	public CreativeCompanyGeneralInformation cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this creative company general information.
	 *
	 * @return the company ID of this creative company general information
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this creative company general information.
	 *
	 * @return the create date of this creative company general information
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the creative application ID of this creative company general information.
	 *
	 * @return the creative application ID of this creative company general information
	 */
	@Override
	public long getCreativeApplicationId() {
		return model.getCreativeApplicationId();
	}

	/**
	 * Returns the creative company general info ID of this creative company general information.
	 *
	 * @return the creative company general info ID of this creative company general information
	 */
	@Override
	public long getCreativeCompanyGeneralInfoId() {
		return model.getCreativeCompanyGeneralInfoId();
	}

	/**
	 * Returns the group ID of this creative company general information.
	 *
	 * @return the group ID of this creative company general information
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the have you recieved any of this creative company general information.
	 *
	 * @return the have you recieved any of this creative company general information
	 */
	@Override
	public String getHaveYouRecievedAny() {
		return model.getHaveYouRecievedAny();
	}

	/**
	 * Returns the modified date of this creative company general information.
	 *
	 * @return the modified date of this creative company general information
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the mprs end date of this creative company general information.
	 *
	 * @return the mprs end date of this creative company general information
	 */
	@Override
	public Date getMprsEndDate() {
		return model.getMprsEndDate();
	}

	/**
	 * Returns the mprs start date of this creative company general information.
	 *
	 * @return the mprs start date of this creative company general information
	 */
	@Override
	public Date getMprsStartDate() {
		return model.getMprsStartDate();
	}

	/**
	 * Returns the mtt end date of this creative company general information.
	 *
	 * @return the mtt end date of this creative company general information
	 */
	@Override
	public Date getMttEndDate() {
		return model.getMttEndDate();
	}

	/**
	 * Returns the mtt start date of this creative company general information.
	 *
	 * @return the mtt start date of this creative company general information
	 */
	@Override
	public Date getMttStartDate() {
		return model.getMttStartDate();
	}

	/**
	 * Returns the primary key of this creative company general information.
	 *
	 * @return the primary key of this creative company general information
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this creative company general information.
	 *
	 * @return the user ID of this creative company general information
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this creative company general information.
	 *
	 * @return the user name of this creative company general information
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this creative company general information.
	 *
	 * @return the user uuid of this creative company general information
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
	 * Sets the company ID of this creative company general information.
	 *
	 * @param companyId the company ID of this creative company general information
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this creative company general information.
	 *
	 * @param createDate the create date of this creative company general information
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the creative application ID of this creative company general information.
	 *
	 * @param CreativeApplicationId the creative application ID of this creative company general information
	 */
	@Override
	public void setCreativeApplicationId(long CreativeApplicationId) {
		model.setCreativeApplicationId(CreativeApplicationId);
	}

	/**
	 * Sets the creative company general info ID of this creative company general information.
	 *
	 * @param creativeCompanyGeneralInfoId the creative company general info ID of this creative company general information
	 */
	@Override
	public void setCreativeCompanyGeneralInfoId(
		long creativeCompanyGeneralInfoId) {

		model.setCreativeCompanyGeneralInfoId(creativeCompanyGeneralInfoId);
	}

	/**
	 * Sets the group ID of this creative company general information.
	 *
	 * @param groupId the group ID of this creative company general information
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the have you recieved any of this creative company general information.
	 *
	 * @param HaveYouRecievedAny the have you recieved any of this creative company general information
	 */
	@Override
	public void setHaveYouRecievedAny(String HaveYouRecievedAny) {
		model.setHaveYouRecievedAny(HaveYouRecievedAny);
	}

	/**
	 * Sets the modified date of this creative company general information.
	 *
	 * @param modifiedDate the modified date of this creative company general information
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the mprs end date of this creative company general information.
	 *
	 * @param mprsEndDate the mprs end date of this creative company general information
	 */
	@Override
	public void setMprsEndDate(Date mprsEndDate) {
		model.setMprsEndDate(mprsEndDate);
	}

	/**
	 * Sets the mprs start date of this creative company general information.
	 *
	 * @param mprsStartDate the mprs start date of this creative company general information
	 */
	@Override
	public void setMprsStartDate(Date mprsStartDate) {
		model.setMprsStartDate(mprsStartDate);
	}

	/**
	 * Sets the mtt end date of this creative company general information.
	 *
	 * @param mttEndDate the mtt end date of this creative company general information
	 */
	@Override
	public void setMttEndDate(Date mttEndDate) {
		model.setMttEndDate(mttEndDate);
	}

	/**
	 * Sets the mtt start date of this creative company general information.
	 *
	 * @param mttStartDate the mtt start date of this creative company general information
	 */
	@Override
	public void setMttStartDate(Date mttStartDate) {
		model.setMttStartDate(mttStartDate);
	}

	/**
	 * Sets the primary key of this creative company general information.
	 *
	 * @param primaryKey the primary key of this creative company general information
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this creative company general information.
	 *
	 * @param userId the user ID of this creative company general information
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this creative company general information.
	 *
	 * @param userName the user name of this creative company general information
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this creative company general information.
	 *
	 * @param userUuid the user uuid of this creative company general information
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
	protected CreativeCompanyGeneralInformationWrapper wrap(
		CreativeCompanyGeneralInformation creativeCompanyGeneralInformation) {

		return new CreativeCompanyGeneralInformationWrapper(
			creativeCompanyGeneralInformation);
	}

}