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
 * This class is a wrapper for {@link AddInsOrgInfoFirst}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddInsOrgInfoFirst
 * @generated
 */
public class AddInsOrgInfoFirstWrapper
	extends BaseModelWrapper<AddInsOrgInfoFirst>
	implements AddInsOrgInfoFirst, ModelWrapper<AddInsOrgInfoFirst> {

	public AddInsOrgInfoFirstWrapper(AddInsOrgInfoFirst addInsOrgInfoFirst) {
		super(addInsOrgInfoFirst);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("addInsOrgInfoFirstId", getAddInsOrgInfoFirstId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("position", getPosition());
		attributes.put("janaacApplicationId", getJanaacApplicationId());
		attributes.put("counter", getCounter());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long addInsOrgInfoFirstId = (Long)attributes.get(
			"addInsOrgInfoFirstId");

		if (addInsOrgInfoFirstId != null) {
			setAddInsOrgInfoFirstId(addInsOrgInfoFirstId);
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String position = (String)attributes.get("position");

		if (position != null) {
			setPosition(position);
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
	public AddInsOrgInfoFirst cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the add ins org info first ID of this add ins org info first.
	 *
	 * @return the add ins org info first ID of this add ins org info first
	 */
	@Override
	public long getAddInsOrgInfoFirstId() {
		return model.getAddInsOrgInfoFirstId();
	}

	/**
	 * Returns the company ID of this add ins org info first.
	 *
	 * @return the company ID of this add ins org info first
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this add ins org info first.
	 *
	 * @return the counter of this add ins org info first
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this add ins org info first.
	 *
	 * @return the create date of this add ins org info first
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this add ins org info first.
	 *
	 * @return the group ID of this add ins org info first
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this add ins org info first.
	 *
	 * @return the janaac application ID of this add ins org info first
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the modified date of this add ins org info first.
	 *
	 * @return the modified date of this add ins org info first
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this add ins org info first.
	 *
	 * @return the name of this add ins org info first
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the position of this add ins org info first.
	 *
	 * @return the position of this add ins org info first
	 */
	@Override
	public String getPosition() {
		return model.getPosition();
	}

	/**
	 * Returns the primary key of this add ins org info first.
	 *
	 * @return the primary key of this add ins org info first
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this add ins org info first.
	 *
	 * @return the user ID of this add ins org info first
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this add ins org info first.
	 *
	 * @return the user name of this add ins org info first
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this add ins org info first.
	 *
	 * @return the user uuid of this add ins org info first
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
	 * Sets the add ins org info first ID of this add ins org info first.
	 *
	 * @param addInsOrgInfoFirstId the add ins org info first ID of this add ins org info first
	 */
	@Override
	public void setAddInsOrgInfoFirstId(long addInsOrgInfoFirstId) {
		model.setAddInsOrgInfoFirstId(addInsOrgInfoFirstId);
	}

	/**
	 * Sets the company ID of this add ins org info first.
	 *
	 * @param companyId the company ID of this add ins org info first
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this add ins org info first.
	 *
	 * @param counter the counter of this add ins org info first
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this add ins org info first.
	 *
	 * @param createDate the create date of this add ins org info first
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this add ins org info first.
	 *
	 * @param groupId the group ID of this add ins org info first
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this add ins org info first.
	 *
	 * @param janaacApplicationId the janaac application ID of this add ins org info first
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the modified date of this add ins org info first.
	 *
	 * @param modifiedDate the modified date of this add ins org info first
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this add ins org info first.
	 *
	 * @param name the name of this add ins org info first
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the position of this add ins org info first.
	 *
	 * @param position the position of this add ins org info first
	 */
	@Override
	public void setPosition(String position) {
		model.setPosition(position);
	}

	/**
	 * Sets the primary key of this add ins org info first.
	 *
	 * @param primaryKey the primary key of this add ins org info first
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this add ins org info first.
	 *
	 * @param userId the user ID of this add ins org info first
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this add ins org info first.
	 *
	 * @param userName the user name of this add ins org info first
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this add ins org info first.
	 *
	 * @param userUuid the user uuid of this add ins org info first
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
	protected AddInsOrgInfoFirstWrapper wrap(
		AddInsOrgInfoFirst addInsOrgInfoFirst) {

		return new AddInsOrgInfoFirstWrapper(addInsOrgInfoFirst);
	}

}