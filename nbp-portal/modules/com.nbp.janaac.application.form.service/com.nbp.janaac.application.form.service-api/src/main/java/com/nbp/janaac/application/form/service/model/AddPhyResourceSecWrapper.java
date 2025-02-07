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
 * This class is a wrapper for {@link AddPhyResourceSec}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddPhyResourceSec
 * @generated
 */
public class AddPhyResourceSecWrapper
	extends BaseModelWrapper<AddPhyResourceSec>
	implements AddPhyResourceSec, ModelWrapper<AddPhyResourceSec> {

	public AddPhyResourceSecWrapper(AddPhyResourceSec addPhyResourceSec) {
		super(addPhyResourceSec);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("addPhyResourceSecId", getAddPhyResourceSecId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("number", getNumber());
		attributes.put("location", getLocation());
		attributes.put("activitiesPerformed", getActivitiesPerformed());
		attributes.put("contactDetails", getContactDetails());
		attributes.put("janaacApplicationId", getJanaacApplicationId());
		attributes.put("counter", getCounter());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long addPhyResourceSecId = (Long)attributes.get("addPhyResourceSecId");

		if (addPhyResourceSecId != null) {
			setAddPhyResourceSecId(addPhyResourceSecId);
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

		String number = (String)attributes.get("number");

		if (number != null) {
			setNumber(number);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		String activitiesPerformed = (String)attributes.get(
			"activitiesPerformed");

		if (activitiesPerformed != null) {
			setActivitiesPerformed(activitiesPerformed);
		}

		String contactDetails = (String)attributes.get("contactDetails");

		if (contactDetails != null) {
			setContactDetails(contactDetails);
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
	public AddPhyResourceSec cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the activities performed of this add phy resource sec.
	 *
	 * @return the activities performed of this add phy resource sec
	 */
	@Override
	public String getActivitiesPerformed() {
		return model.getActivitiesPerformed();
	}

	/**
	 * Returns the add phy resource sec ID of this add phy resource sec.
	 *
	 * @return the add phy resource sec ID of this add phy resource sec
	 */
	@Override
	public long getAddPhyResourceSecId() {
		return model.getAddPhyResourceSecId();
	}

	/**
	 * Returns the company ID of this add phy resource sec.
	 *
	 * @return the company ID of this add phy resource sec
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the contact details of this add phy resource sec.
	 *
	 * @return the contact details of this add phy resource sec
	 */
	@Override
	public String getContactDetails() {
		return model.getContactDetails();
	}

	/**
	 * Returns the counter of this add phy resource sec.
	 *
	 * @return the counter of this add phy resource sec
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this add phy resource sec.
	 *
	 * @return the create date of this add phy resource sec
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this add phy resource sec.
	 *
	 * @return the group ID of this add phy resource sec
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this add phy resource sec.
	 *
	 * @return the janaac application ID of this add phy resource sec
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the location of this add phy resource sec.
	 *
	 * @return the location of this add phy resource sec
	 */
	@Override
	public String getLocation() {
		return model.getLocation();
	}

	/**
	 * Returns the modified date of this add phy resource sec.
	 *
	 * @return the modified date of this add phy resource sec
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the number of this add phy resource sec.
	 *
	 * @return the number of this add phy resource sec
	 */
	@Override
	public String getNumber() {
		return model.getNumber();
	}

	/**
	 * Returns the primary key of this add phy resource sec.
	 *
	 * @return the primary key of this add phy resource sec
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this add phy resource sec.
	 *
	 * @return the user ID of this add phy resource sec
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this add phy resource sec.
	 *
	 * @return the user name of this add phy resource sec
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this add phy resource sec.
	 *
	 * @return the user uuid of this add phy resource sec
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
	 * Sets the activities performed of this add phy resource sec.
	 *
	 * @param activitiesPerformed the activities performed of this add phy resource sec
	 */
	@Override
	public void setActivitiesPerformed(String activitiesPerformed) {
		model.setActivitiesPerformed(activitiesPerformed);
	}

	/**
	 * Sets the add phy resource sec ID of this add phy resource sec.
	 *
	 * @param addPhyResourceSecId the add phy resource sec ID of this add phy resource sec
	 */
	@Override
	public void setAddPhyResourceSecId(long addPhyResourceSecId) {
		model.setAddPhyResourceSecId(addPhyResourceSecId);
	}

	/**
	 * Sets the company ID of this add phy resource sec.
	 *
	 * @param companyId the company ID of this add phy resource sec
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the contact details of this add phy resource sec.
	 *
	 * @param contactDetails the contact details of this add phy resource sec
	 */
	@Override
	public void setContactDetails(String contactDetails) {
		model.setContactDetails(contactDetails);
	}

	/**
	 * Sets the counter of this add phy resource sec.
	 *
	 * @param counter the counter of this add phy resource sec
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this add phy resource sec.
	 *
	 * @param createDate the create date of this add phy resource sec
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this add phy resource sec.
	 *
	 * @param groupId the group ID of this add phy resource sec
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this add phy resource sec.
	 *
	 * @param janaacApplicationId the janaac application ID of this add phy resource sec
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the location of this add phy resource sec.
	 *
	 * @param location the location of this add phy resource sec
	 */
	@Override
	public void setLocation(String location) {
		model.setLocation(location);
	}

	/**
	 * Sets the modified date of this add phy resource sec.
	 *
	 * @param modifiedDate the modified date of this add phy resource sec
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the number of this add phy resource sec.
	 *
	 * @param number the number of this add phy resource sec
	 */
	@Override
	public void setNumber(String number) {
		model.setNumber(number);
	}

	/**
	 * Sets the primary key of this add phy resource sec.
	 *
	 * @param primaryKey the primary key of this add phy resource sec
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this add phy resource sec.
	 *
	 * @param userId the user ID of this add phy resource sec
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this add phy resource sec.
	 *
	 * @param userName the user name of this add phy resource sec
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this add phy resource sec.
	 *
	 * @param userUuid the user uuid of this add phy resource sec
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
	protected AddPhyResourceSecWrapper wrap(
		AddPhyResourceSec addPhyResourceSec) {

		return new AddPhyResourceSecWrapper(addPhyResourceSec);
	}

}