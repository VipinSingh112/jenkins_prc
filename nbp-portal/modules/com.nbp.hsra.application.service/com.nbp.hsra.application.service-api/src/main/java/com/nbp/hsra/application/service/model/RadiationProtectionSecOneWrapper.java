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
 * This class is a wrapper for {@link RadiationProtectionSecOne}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RadiationProtectionSecOne
 * @generated
 */
public class RadiationProtectionSecOneWrapper
	extends BaseModelWrapper<RadiationProtectionSecOne>
	implements ModelWrapper<RadiationProtectionSecOne>,
			   RadiationProtectionSecOne {

	public RadiationProtectionSecOneWrapper(
		RadiationProtectionSecOne radiationProtectionSecOne) {

		super(radiationProtectionSecOne);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"radiationProtectSecOneId", getRadiationProtectSecOneId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("currentAuthNum", getCurrentAuthNum());
		attributes.put("reasonForAmendment", getReasonForAmendment());
		attributes.put("typeOfApplication", getTypeOfApplication());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long radiationProtectSecOneId = (Long)attributes.get(
			"radiationProtectSecOneId");

		if (radiationProtectSecOneId != null) {
			setRadiationProtectSecOneId(radiationProtectSecOneId);
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

		String currentAuthNum = (String)attributes.get("currentAuthNum");

		if (currentAuthNum != null) {
			setCurrentAuthNum(currentAuthNum);
		}

		String reasonForAmendment = (String)attributes.get(
			"reasonForAmendment");

		if (reasonForAmendment != null) {
			setReasonForAmendment(reasonForAmendment);
		}

		String typeOfApplication = (String)attributes.get("typeOfApplication");

		if (typeOfApplication != null) {
			setTypeOfApplication(typeOfApplication);
		}

		Long hsraApplicationId = (Long)attributes.get("hsraApplicationId");

		if (hsraApplicationId != null) {
			setHsraApplicationId(hsraApplicationId);
		}
	}

	@Override
	public RadiationProtectionSecOne cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this radiation protection sec one.
	 *
	 * @return the company ID of this radiation protection sec one
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this radiation protection sec one.
	 *
	 * @return the create date of this radiation protection sec one
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the current auth num of this radiation protection sec one.
	 *
	 * @return the current auth num of this radiation protection sec one
	 */
	@Override
	public String getCurrentAuthNum() {
		return model.getCurrentAuthNum();
	}

	/**
	 * Returns the group ID of this radiation protection sec one.
	 *
	 * @return the group ID of this radiation protection sec one
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application ID of this radiation protection sec one.
	 *
	 * @return the hsra application ID of this radiation protection sec one
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the modified date of this radiation protection sec one.
	 *
	 * @return the modified date of this radiation protection sec one
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this radiation protection sec one.
	 *
	 * @return the primary key of this radiation protection sec one
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the radiation protect sec one ID of this radiation protection sec one.
	 *
	 * @return the radiation protect sec one ID of this radiation protection sec one
	 */
	@Override
	public long getRadiationProtectSecOneId() {
		return model.getRadiationProtectSecOneId();
	}

	/**
	 * Returns the reason for amendment of this radiation protection sec one.
	 *
	 * @return the reason for amendment of this radiation protection sec one
	 */
	@Override
	public String getReasonForAmendment() {
		return model.getReasonForAmendment();
	}

	/**
	 * Returns the type of application of this radiation protection sec one.
	 *
	 * @return the type of application of this radiation protection sec one
	 */
	@Override
	public String getTypeOfApplication() {
		return model.getTypeOfApplication();
	}

	/**
	 * Returns the user ID of this radiation protection sec one.
	 *
	 * @return the user ID of this radiation protection sec one
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this radiation protection sec one.
	 *
	 * @return the user name of this radiation protection sec one
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this radiation protection sec one.
	 *
	 * @return the user uuid of this radiation protection sec one
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
	 * Sets the company ID of this radiation protection sec one.
	 *
	 * @param companyId the company ID of this radiation protection sec one
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this radiation protection sec one.
	 *
	 * @param createDate the create date of this radiation protection sec one
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the current auth num of this radiation protection sec one.
	 *
	 * @param currentAuthNum the current auth num of this radiation protection sec one
	 */
	@Override
	public void setCurrentAuthNum(String currentAuthNum) {
		model.setCurrentAuthNum(currentAuthNum);
	}

	/**
	 * Sets the group ID of this radiation protection sec one.
	 *
	 * @param groupId the group ID of this radiation protection sec one
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application ID of this radiation protection sec one.
	 *
	 * @param hsraApplicationId the hsra application ID of this radiation protection sec one
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the modified date of this radiation protection sec one.
	 *
	 * @param modifiedDate the modified date of this radiation protection sec one
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this radiation protection sec one.
	 *
	 * @param primaryKey the primary key of this radiation protection sec one
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the radiation protect sec one ID of this radiation protection sec one.
	 *
	 * @param radiationProtectSecOneId the radiation protect sec one ID of this radiation protection sec one
	 */
	@Override
	public void setRadiationProtectSecOneId(long radiationProtectSecOneId) {
		model.setRadiationProtectSecOneId(radiationProtectSecOneId);
	}

	/**
	 * Sets the reason for amendment of this radiation protection sec one.
	 *
	 * @param reasonForAmendment the reason for amendment of this radiation protection sec one
	 */
	@Override
	public void setReasonForAmendment(String reasonForAmendment) {
		model.setReasonForAmendment(reasonForAmendment);
	}

	/**
	 * Sets the type of application of this radiation protection sec one.
	 *
	 * @param typeOfApplication the type of application of this radiation protection sec one
	 */
	@Override
	public void setTypeOfApplication(String typeOfApplication) {
		model.setTypeOfApplication(typeOfApplication);
	}

	/**
	 * Sets the user ID of this radiation protection sec one.
	 *
	 * @param userId the user ID of this radiation protection sec one
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this radiation protection sec one.
	 *
	 * @param userName the user name of this radiation protection sec one
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this radiation protection sec one.
	 *
	 * @param userUuid the user uuid of this radiation protection sec one
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
	protected RadiationProtectionSecOneWrapper wrap(
		RadiationProtectionSecOne radiationProtectionSecOne) {

		return new RadiationProtectionSecOneWrapper(radiationProtectionSecOne);
	}

}