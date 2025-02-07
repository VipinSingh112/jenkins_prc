/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DirectorDetailsAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DirectorDetailsAdd
 * @generated
 */
public class DirectorDetailsAddWrapper
	extends BaseModelWrapper<DirectorDetailsAdd>
	implements DirectorDetailsAdd, ModelWrapper<DirectorDetailsAdd> {

	public DirectorDetailsAddWrapper(DirectorDetailsAdd directorDetailsAdd) {
		super(directorDetailsAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("directorDetailsAddId", getDirectorDetailsAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("directorName", getDirectorName());
		attributes.put("directorNationality", getDirectorNationality());
		attributes.put("quarryApplicationId", getQuarryApplicationId());
		attributes.put("counter", getCounter());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long directorDetailsAddId = (Long)attributes.get(
			"directorDetailsAddId");

		if (directorDetailsAddId != null) {
			setDirectorDetailsAddId(directorDetailsAddId);
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

		String directorName = (String)attributes.get("directorName");

		if (directorName != null) {
			setDirectorName(directorName);
		}

		String directorNationality = (String)attributes.get(
			"directorNationality");

		if (directorNationality != null) {
			setDirectorNationality(directorNationality);
		}

		Long quarryApplicationId = (Long)attributes.get("quarryApplicationId");

		if (quarryApplicationId != null) {
			setQuarryApplicationId(quarryApplicationId);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}
	}

	@Override
	public DirectorDetailsAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this director details add.
	 *
	 * @return the company ID of this director details add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this director details add.
	 *
	 * @return the counter of this director details add
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this director details add.
	 *
	 * @return the create date of this director details add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the director details add ID of this director details add.
	 *
	 * @return the director details add ID of this director details add
	 */
	@Override
	public long getDirectorDetailsAddId() {
		return model.getDirectorDetailsAddId();
	}

	/**
	 * Returns the director name of this director details add.
	 *
	 * @return the director name of this director details add
	 */
	@Override
	public String getDirectorName() {
		return model.getDirectorName();
	}

	/**
	 * Returns the director nationality of this director details add.
	 *
	 * @return the director nationality of this director details add
	 */
	@Override
	public String getDirectorNationality() {
		return model.getDirectorNationality();
	}

	/**
	 * Returns the group ID of this director details add.
	 *
	 * @return the group ID of this director details add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this director details add.
	 *
	 * @return the modified date of this director details add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this director details add.
	 *
	 * @return the primary key of this director details add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the quarry application ID of this director details add.
	 *
	 * @return the quarry application ID of this director details add
	 */
	@Override
	public long getQuarryApplicationId() {
		return model.getQuarryApplicationId();
	}

	/**
	 * Returns the user ID of this director details add.
	 *
	 * @return the user ID of this director details add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this director details add.
	 *
	 * @return the user name of this director details add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this director details add.
	 *
	 * @return the user uuid of this director details add
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
	 * Sets the company ID of this director details add.
	 *
	 * @param companyId the company ID of this director details add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this director details add.
	 *
	 * @param counter the counter of this director details add
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this director details add.
	 *
	 * @param createDate the create date of this director details add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the director details add ID of this director details add.
	 *
	 * @param directorDetailsAddId the director details add ID of this director details add
	 */
	@Override
	public void setDirectorDetailsAddId(long directorDetailsAddId) {
		model.setDirectorDetailsAddId(directorDetailsAddId);
	}

	/**
	 * Sets the director name of this director details add.
	 *
	 * @param directorName the director name of this director details add
	 */
	@Override
	public void setDirectorName(String directorName) {
		model.setDirectorName(directorName);
	}

	/**
	 * Sets the director nationality of this director details add.
	 *
	 * @param directorNationality the director nationality of this director details add
	 */
	@Override
	public void setDirectorNationality(String directorNationality) {
		model.setDirectorNationality(directorNationality);
	}

	/**
	 * Sets the group ID of this director details add.
	 *
	 * @param groupId the group ID of this director details add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this director details add.
	 *
	 * @param modifiedDate the modified date of this director details add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this director details add.
	 *
	 * @param primaryKey the primary key of this director details add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the quarry application ID of this director details add.
	 *
	 * @param quarryApplicationId the quarry application ID of this director details add
	 */
	@Override
	public void setQuarryApplicationId(long quarryApplicationId) {
		model.setQuarryApplicationId(quarryApplicationId);
	}

	/**
	 * Sets the user ID of this director details add.
	 *
	 * @param userId the user ID of this director details add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this director details add.
	 *
	 * @param userName the user name of this director details add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this director details add.
	 *
	 * @param userUuid the user uuid of this director details add
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
	protected DirectorDetailsAddWrapper wrap(
		DirectorDetailsAdd directorDetailsAdd) {

		return new DirectorDetailsAddWrapper(directorDetailsAdd);
	}

}