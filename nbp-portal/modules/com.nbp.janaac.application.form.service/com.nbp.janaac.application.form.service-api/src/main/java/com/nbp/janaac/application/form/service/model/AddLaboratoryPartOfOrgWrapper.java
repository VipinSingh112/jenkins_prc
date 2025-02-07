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
 * This class is a wrapper for {@link AddLaboratoryPartOfOrg}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLaboratoryPartOfOrg
 * @generated
 */
public class AddLaboratoryPartOfOrgWrapper
	extends BaseModelWrapper<AddLaboratoryPartOfOrg>
	implements AddLaboratoryPartOfOrg, ModelWrapper<AddLaboratoryPartOfOrg> {

	public AddLaboratoryPartOfOrgWrapper(
		AddLaboratoryPartOfOrg addLaboratoryPartOfOrg) {

		super(addLaboratoryPartOfOrg);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"addLaboratoryPartOfOrgId", getAddLaboratoryPartOfOrgId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("laboratoryPartOfOrgName", getLaboratoryPartOfOrgName());
		attributes.put(
			"laboratoryPartOfOrgPosition", getLaboratoryPartOfOrgPosition());
		attributes.put("janaacApplicationId", getJanaacApplicationId());
		attributes.put("counter", getCounter());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long addLaboratoryPartOfOrgId = (Long)attributes.get(
			"addLaboratoryPartOfOrgId");

		if (addLaboratoryPartOfOrgId != null) {
			setAddLaboratoryPartOfOrgId(addLaboratoryPartOfOrgId);
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

		String laboratoryPartOfOrgName = (String)attributes.get(
			"laboratoryPartOfOrgName");

		if (laboratoryPartOfOrgName != null) {
			setLaboratoryPartOfOrgName(laboratoryPartOfOrgName);
		}

		String laboratoryPartOfOrgPosition = (String)attributes.get(
			"laboratoryPartOfOrgPosition");

		if (laboratoryPartOfOrgPosition != null) {
			setLaboratoryPartOfOrgPosition(laboratoryPartOfOrgPosition);
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
	public AddLaboratoryPartOfOrg cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the add laboratory part of org ID of this add laboratory part of org.
	 *
	 * @return the add laboratory part of org ID of this add laboratory part of org
	 */
	@Override
	public long getAddLaboratoryPartOfOrgId() {
		return model.getAddLaboratoryPartOfOrgId();
	}

	/**
	 * Returns the company ID of this add laboratory part of org.
	 *
	 * @return the company ID of this add laboratory part of org
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this add laboratory part of org.
	 *
	 * @return the counter of this add laboratory part of org
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this add laboratory part of org.
	 *
	 * @return the create date of this add laboratory part of org
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this add laboratory part of org.
	 *
	 * @return the group ID of this add laboratory part of org
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this add laboratory part of org.
	 *
	 * @return the janaac application ID of this add laboratory part of org
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the laboratory part of org name of this add laboratory part of org.
	 *
	 * @return the laboratory part of org name of this add laboratory part of org
	 */
	@Override
	public String getLaboratoryPartOfOrgName() {
		return model.getLaboratoryPartOfOrgName();
	}

	/**
	 * Returns the laboratory part of org position of this add laboratory part of org.
	 *
	 * @return the laboratory part of org position of this add laboratory part of org
	 */
	@Override
	public String getLaboratoryPartOfOrgPosition() {
		return model.getLaboratoryPartOfOrgPosition();
	}

	/**
	 * Returns the modified date of this add laboratory part of org.
	 *
	 * @return the modified date of this add laboratory part of org
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this add laboratory part of org.
	 *
	 * @return the primary key of this add laboratory part of org
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this add laboratory part of org.
	 *
	 * @return the user ID of this add laboratory part of org
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this add laboratory part of org.
	 *
	 * @return the user name of this add laboratory part of org
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this add laboratory part of org.
	 *
	 * @return the user uuid of this add laboratory part of org
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
	 * Sets the add laboratory part of org ID of this add laboratory part of org.
	 *
	 * @param addLaboratoryPartOfOrgId the add laboratory part of org ID of this add laboratory part of org
	 */
	@Override
	public void setAddLaboratoryPartOfOrgId(long addLaboratoryPartOfOrgId) {
		model.setAddLaboratoryPartOfOrgId(addLaboratoryPartOfOrgId);
	}

	/**
	 * Sets the company ID of this add laboratory part of org.
	 *
	 * @param companyId the company ID of this add laboratory part of org
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this add laboratory part of org.
	 *
	 * @param counter the counter of this add laboratory part of org
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this add laboratory part of org.
	 *
	 * @param createDate the create date of this add laboratory part of org
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this add laboratory part of org.
	 *
	 * @param groupId the group ID of this add laboratory part of org
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this add laboratory part of org.
	 *
	 * @param janaacApplicationId the janaac application ID of this add laboratory part of org
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the laboratory part of org name of this add laboratory part of org.
	 *
	 * @param laboratoryPartOfOrgName the laboratory part of org name of this add laboratory part of org
	 */
	@Override
	public void setLaboratoryPartOfOrgName(String laboratoryPartOfOrgName) {
		model.setLaboratoryPartOfOrgName(laboratoryPartOfOrgName);
	}

	/**
	 * Sets the laboratory part of org position of this add laboratory part of org.
	 *
	 * @param laboratoryPartOfOrgPosition the laboratory part of org position of this add laboratory part of org
	 */
	@Override
	public void setLaboratoryPartOfOrgPosition(
		String laboratoryPartOfOrgPosition) {

		model.setLaboratoryPartOfOrgPosition(laboratoryPartOfOrgPosition);
	}

	/**
	 * Sets the modified date of this add laboratory part of org.
	 *
	 * @param modifiedDate the modified date of this add laboratory part of org
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this add laboratory part of org.
	 *
	 * @param primaryKey the primary key of this add laboratory part of org
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this add laboratory part of org.
	 *
	 * @param userId the user ID of this add laboratory part of org
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this add laboratory part of org.
	 *
	 * @param userName the user name of this add laboratory part of org
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this add laboratory part of org.
	 *
	 * @param userUuid the user uuid of this add laboratory part of org
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
	protected AddLaboratoryPartOfOrgWrapper wrap(
		AddLaboratoryPartOfOrg addLaboratoryPartOfOrg) {

		return new AddLaboratoryPartOfOrgWrapper(addLaboratoryPartOfOrg);
	}

}