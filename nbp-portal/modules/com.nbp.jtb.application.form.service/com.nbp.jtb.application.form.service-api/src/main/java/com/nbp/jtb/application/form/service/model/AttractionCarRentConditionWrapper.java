/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AttractionCarRentCondition}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionCarRentCondition
 * @generated
 */
public class AttractionCarRentConditionWrapper
	extends BaseModelWrapper<AttractionCarRentCondition>
	implements AttractionCarRentCondition,
			   ModelWrapper<AttractionCarRentCondition> {

	public AttractionCarRentConditionWrapper(
		AttractionCarRentCondition attractionCarRentCondition) {

		super(attractionCarRentCondition);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"attractionCarRenConditId", getAttractionCarRenConditId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ncrConditionProp", getNcrConditionProp());
		attributes.put("jtbApplicationId", getJtbApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long attractionCarRenConditId = (Long)attributes.get(
			"attractionCarRenConditId");

		if (attractionCarRenConditId != null) {
			setAttractionCarRenConditId(attractionCarRenConditId);
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

		String ncrConditionProp = (String)attributes.get("ncrConditionProp");

		if (ncrConditionProp != null) {
			setNcrConditionProp(ncrConditionProp);
		}

		Long jtbApplicationId = (Long)attributes.get("jtbApplicationId");

		if (jtbApplicationId != null) {
			setJtbApplicationId(jtbApplicationId);
		}
	}

	@Override
	public AttractionCarRentCondition cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the attraction car ren condit ID of this attraction car rent condition.
	 *
	 * @return the attraction car ren condit ID of this attraction car rent condition
	 */
	@Override
	public long getAttractionCarRenConditId() {
		return model.getAttractionCarRenConditId();
	}

	/**
	 * Returns the company ID of this attraction car rent condition.
	 *
	 * @return the company ID of this attraction car rent condition
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this attraction car rent condition.
	 *
	 * @return the create date of this attraction car rent condition
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this attraction car rent condition.
	 *
	 * @return the group ID of this attraction car rent condition
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jtb application ID of this attraction car rent condition.
	 *
	 * @return the jtb application ID of this attraction car rent condition
	 */
	@Override
	public long getJtbApplicationId() {
		return model.getJtbApplicationId();
	}

	/**
	 * Returns the modified date of this attraction car rent condition.
	 *
	 * @return the modified date of this attraction car rent condition
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ncr condition prop of this attraction car rent condition.
	 *
	 * @return the ncr condition prop of this attraction car rent condition
	 */
	@Override
	public String getNcrConditionProp() {
		return model.getNcrConditionProp();
	}

	/**
	 * Returns the primary key of this attraction car rent condition.
	 *
	 * @return the primary key of this attraction car rent condition
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this attraction car rent condition.
	 *
	 * @return the user ID of this attraction car rent condition
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this attraction car rent condition.
	 *
	 * @return the user name of this attraction car rent condition
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this attraction car rent condition.
	 *
	 * @return the user uuid of this attraction car rent condition
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
	 * Sets the attraction car ren condit ID of this attraction car rent condition.
	 *
	 * @param attractionCarRenConditId the attraction car ren condit ID of this attraction car rent condition
	 */
	@Override
	public void setAttractionCarRenConditId(long attractionCarRenConditId) {
		model.setAttractionCarRenConditId(attractionCarRenConditId);
	}

	/**
	 * Sets the company ID of this attraction car rent condition.
	 *
	 * @param companyId the company ID of this attraction car rent condition
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this attraction car rent condition.
	 *
	 * @param createDate the create date of this attraction car rent condition
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this attraction car rent condition.
	 *
	 * @param groupId the group ID of this attraction car rent condition
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jtb application ID of this attraction car rent condition.
	 *
	 * @param jtbApplicationId the jtb application ID of this attraction car rent condition
	 */
	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		model.setJtbApplicationId(jtbApplicationId);
	}

	/**
	 * Sets the modified date of this attraction car rent condition.
	 *
	 * @param modifiedDate the modified date of this attraction car rent condition
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ncr condition prop of this attraction car rent condition.
	 *
	 * @param ncrConditionProp the ncr condition prop of this attraction car rent condition
	 */
	@Override
	public void setNcrConditionProp(String ncrConditionProp) {
		model.setNcrConditionProp(ncrConditionProp);
	}

	/**
	 * Sets the primary key of this attraction car rent condition.
	 *
	 * @param primaryKey the primary key of this attraction car rent condition
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this attraction car rent condition.
	 *
	 * @param userId the user ID of this attraction car rent condition
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this attraction car rent condition.
	 *
	 * @param userName the user name of this attraction car rent condition
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this attraction car rent condition.
	 *
	 * @param userUuid the user uuid of this attraction car rent condition
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
	protected AttractionCarRentConditionWrapper wrap(
		AttractionCarRentCondition attractionCarRentCondition) {

		return new AttractionCarRentConditionWrapper(
			attractionCarRentCondition);
	}

}