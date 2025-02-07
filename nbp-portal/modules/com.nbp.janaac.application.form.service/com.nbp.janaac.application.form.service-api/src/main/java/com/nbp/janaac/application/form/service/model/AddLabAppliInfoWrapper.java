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
 * This class is a wrapper for {@link AddLabAppliInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLabAppliInfo
 * @generated
 */
public class AddLabAppliInfoWrapper
	extends BaseModelWrapper<AddLabAppliInfo>
	implements AddLabAppliInfo, ModelWrapper<AddLabAppliInfo> {

	public AddLabAppliInfoWrapper(AddLabAppliInfo addLabAppliInfo) {
		super(addLabAppliInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("addLabAppliInfoId", getAddLabAppliInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("email", getEmail());
		attributes.put("janaacApplicationId", getJanaacApplicationId());
		attributes.put("counter", getCounter());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long addLabAppliInfoId = (Long)attributes.get("addLabAppliInfoId");

		if (addLabAppliInfoId != null) {
			setAddLabAppliInfoId(addLabAppliInfoId);
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

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
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
	public AddLabAppliInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the add lab appli info ID of this add lab appli info.
	 *
	 * @return the add lab appli info ID of this add lab appli info
	 */
	@Override
	public long getAddLabAppliInfoId() {
		return model.getAddLabAppliInfoId();
	}

	/**
	 * Returns the company ID of this add lab appli info.
	 *
	 * @return the company ID of this add lab appli info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this add lab appli info.
	 *
	 * @return the counter of this add lab appli info
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this add lab appli info.
	 *
	 * @return the create date of this add lab appli info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email of this add lab appli info.
	 *
	 * @return the email of this add lab appli info
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the group ID of this add lab appli info.
	 *
	 * @return the group ID of this add lab appli info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this add lab appli info.
	 *
	 * @return the janaac application ID of this add lab appli info
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the modified date of this add lab appli info.
	 *
	 * @return the modified date of this add lab appli info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this add lab appli info.
	 *
	 * @return the name of this add lab appli info
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this add lab appli info.
	 *
	 * @return the primary key of this add lab appli info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this add lab appli info.
	 *
	 * @return the user ID of this add lab appli info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this add lab appli info.
	 *
	 * @return the user name of this add lab appli info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this add lab appli info.
	 *
	 * @return the user uuid of this add lab appli info
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
	 * Sets the add lab appli info ID of this add lab appli info.
	 *
	 * @param addLabAppliInfoId the add lab appli info ID of this add lab appli info
	 */
	@Override
	public void setAddLabAppliInfoId(long addLabAppliInfoId) {
		model.setAddLabAppliInfoId(addLabAppliInfoId);
	}

	/**
	 * Sets the company ID of this add lab appli info.
	 *
	 * @param companyId the company ID of this add lab appli info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this add lab appli info.
	 *
	 * @param counter the counter of this add lab appli info
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this add lab appli info.
	 *
	 * @param createDate the create date of this add lab appli info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email of this add lab appli info.
	 *
	 * @param email the email of this add lab appli info
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the group ID of this add lab appli info.
	 *
	 * @param groupId the group ID of this add lab appli info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this add lab appli info.
	 *
	 * @param janaacApplicationId the janaac application ID of this add lab appli info
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the modified date of this add lab appli info.
	 *
	 * @param modifiedDate the modified date of this add lab appli info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this add lab appli info.
	 *
	 * @param name the name of this add lab appli info
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this add lab appli info.
	 *
	 * @param primaryKey the primary key of this add lab appli info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this add lab appli info.
	 *
	 * @param userId the user ID of this add lab appli info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this add lab appli info.
	 *
	 * @param userName the user name of this add lab appli info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this add lab appli info.
	 *
	 * @param userUuid the user uuid of this add lab appli info
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
	protected AddLabAppliInfoWrapper wrap(AddLabAppliInfo addLabAppliInfo) {
		return new AddLabAppliInfoWrapper(addLabAppliInfo);
	}

}