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
 * This class is a wrapper for {@link AddLabMedicalDescOfActiSec}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLabMedicalDescOfActiSec
 * @generated
 */
public class AddLabMedicalDescOfActiSecWrapper
	extends BaseModelWrapper<AddLabMedicalDescOfActiSec>
	implements AddLabMedicalDescOfActiSec,
			   ModelWrapper<AddLabMedicalDescOfActiSec> {

	public AddLabMedicalDescOfActiSecWrapper(
		AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec) {

		super(addLabMedicalDescOfActiSec);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"addLabMedicalDescOfActiSecId", getAddLabMedicalDescOfActiSecId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("requestedPoct", getRequestedPoct());
		attributes.put("location", getLocation());
		attributes.put("janaacApplicationId", getJanaacApplicationId());
		attributes.put("counter", getCounter());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long addLabMedicalDescOfActiSecId = (Long)attributes.get(
			"addLabMedicalDescOfActiSecId");

		if (addLabMedicalDescOfActiSecId != null) {
			setAddLabMedicalDescOfActiSecId(addLabMedicalDescOfActiSecId);
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

		String requestedPoct = (String)attributes.get("requestedPoct");

		if (requestedPoct != null) {
			setRequestedPoct(requestedPoct);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
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
	public AddLabMedicalDescOfActiSec cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the add lab medical desc of acti sec ID of this add lab medical desc of acti sec.
	 *
	 * @return the add lab medical desc of acti sec ID of this add lab medical desc of acti sec
	 */
	@Override
	public long getAddLabMedicalDescOfActiSecId() {
		return model.getAddLabMedicalDescOfActiSecId();
	}

	/**
	 * Returns the company ID of this add lab medical desc of acti sec.
	 *
	 * @return the company ID of this add lab medical desc of acti sec
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this add lab medical desc of acti sec.
	 *
	 * @return the counter of this add lab medical desc of acti sec
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this add lab medical desc of acti sec.
	 *
	 * @return the create date of this add lab medical desc of acti sec
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this add lab medical desc of acti sec.
	 *
	 * @return the group ID of this add lab medical desc of acti sec
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this add lab medical desc of acti sec.
	 *
	 * @return the janaac application ID of this add lab medical desc of acti sec
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the location of this add lab medical desc of acti sec.
	 *
	 * @return the location of this add lab medical desc of acti sec
	 */
	@Override
	public String getLocation() {
		return model.getLocation();
	}

	/**
	 * Returns the modified date of this add lab medical desc of acti sec.
	 *
	 * @return the modified date of this add lab medical desc of acti sec
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this add lab medical desc of acti sec.
	 *
	 * @return the primary key of this add lab medical desc of acti sec
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the requested poct of this add lab medical desc of acti sec.
	 *
	 * @return the requested poct of this add lab medical desc of acti sec
	 */
	@Override
	public String getRequestedPoct() {
		return model.getRequestedPoct();
	}

	/**
	 * Returns the user ID of this add lab medical desc of acti sec.
	 *
	 * @return the user ID of this add lab medical desc of acti sec
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this add lab medical desc of acti sec.
	 *
	 * @return the user name of this add lab medical desc of acti sec
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this add lab medical desc of acti sec.
	 *
	 * @return the user uuid of this add lab medical desc of acti sec
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
	 * Sets the add lab medical desc of acti sec ID of this add lab medical desc of acti sec.
	 *
	 * @param addLabMedicalDescOfActiSecId the add lab medical desc of acti sec ID of this add lab medical desc of acti sec
	 */
	@Override
	public void setAddLabMedicalDescOfActiSecId(
		long addLabMedicalDescOfActiSecId) {

		model.setAddLabMedicalDescOfActiSecId(addLabMedicalDescOfActiSecId);
	}

	/**
	 * Sets the company ID of this add lab medical desc of acti sec.
	 *
	 * @param companyId the company ID of this add lab medical desc of acti sec
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this add lab medical desc of acti sec.
	 *
	 * @param counter the counter of this add lab medical desc of acti sec
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this add lab medical desc of acti sec.
	 *
	 * @param createDate the create date of this add lab medical desc of acti sec
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this add lab medical desc of acti sec.
	 *
	 * @param groupId the group ID of this add lab medical desc of acti sec
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this add lab medical desc of acti sec.
	 *
	 * @param janaacApplicationId the janaac application ID of this add lab medical desc of acti sec
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the location of this add lab medical desc of acti sec.
	 *
	 * @param location the location of this add lab medical desc of acti sec
	 */
	@Override
	public void setLocation(String location) {
		model.setLocation(location);
	}

	/**
	 * Sets the modified date of this add lab medical desc of acti sec.
	 *
	 * @param modifiedDate the modified date of this add lab medical desc of acti sec
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this add lab medical desc of acti sec.
	 *
	 * @param primaryKey the primary key of this add lab medical desc of acti sec
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the requested poct of this add lab medical desc of acti sec.
	 *
	 * @param requestedPoct the requested poct of this add lab medical desc of acti sec
	 */
	@Override
	public void setRequestedPoct(String requestedPoct) {
		model.setRequestedPoct(requestedPoct);
	}

	/**
	 * Sets the user ID of this add lab medical desc of acti sec.
	 *
	 * @param userId the user ID of this add lab medical desc of acti sec
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this add lab medical desc of acti sec.
	 *
	 * @param userName the user name of this add lab medical desc of acti sec
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this add lab medical desc of acti sec.
	 *
	 * @param userUuid the user uuid of this add lab medical desc of acti sec
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
	protected AddLabMedicalDescOfActiSecWrapper wrap(
		AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec) {

		return new AddLabMedicalDescOfActiSecWrapper(
			addLabMedicalDescOfActiSec);
	}

}