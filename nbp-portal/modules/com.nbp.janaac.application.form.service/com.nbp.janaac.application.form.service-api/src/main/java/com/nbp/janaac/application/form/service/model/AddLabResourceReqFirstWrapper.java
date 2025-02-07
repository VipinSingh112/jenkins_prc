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
 * This class is a wrapper for {@link AddLabResourceReqFirst}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLabResourceReqFirst
 * @generated
 */
public class AddLabResourceReqFirstWrapper
	extends BaseModelWrapper<AddLabResourceReqFirst>
	implements AddLabResourceReqFirst, ModelWrapper<AddLabResourceReqFirst> {

	public AddLabResourceReqFirstWrapper(
		AddLabResourceReqFirst addLabResourceReqFirst) {

		super(addLabResourceReqFirst);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"addLabResourceReqFirstId", getAddLabResourceReqFirstId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("num", getNum());
		attributes.put("location", getLocation());
		attributes.put("activities", getActivities());
		attributes.put("contactDetails", getContactDetails());
		attributes.put("janaacApplicationId", getJanaacApplicationId());
		attributes.put("counter", getCounter());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long addLabResourceReqFirstId = (Long)attributes.get(
			"addLabResourceReqFirstId");

		if (addLabResourceReqFirstId != null) {
			setAddLabResourceReqFirstId(addLabResourceReqFirstId);
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

		String num = (String)attributes.get("num");

		if (num != null) {
			setNum(num);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		String activities = (String)attributes.get("activities");

		if (activities != null) {
			setActivities(activities);
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
	public AddLabResourceReqFirst cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the activities of this add lab resource req first.
	 *
	 * @return the activities of this add lab resource req first
	 */
	@Override
	public String getActivities() {
		return model.getActivities();
	}

	/**
	 * Returns the add lab resource req first ID of this add lab resource req first.
	 *
	 * @return the add lab resource req first ID of this add lab resource req first
	 */
	@Override
	public long getAddLabResourceReqFirstId() {
		return model.getAddLabResourceReqFirstId();
	}

	/**
	 * Returns the company ID of this add lab resource req first.
	 *
	 * @return the company ID of this add lab resource req first
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the contact details of this add lab resource req first.
	 *
	 * @return the contact details of this add lab resource req first
	 */
	@Override
	public String getContactDetails() {
		return model.getContactDetails();
	}

	/**
	 * Returns the counter of this add lab resource req first.
	 *
	 * @return the counter of this add lab resource req first
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this add lab resource req first.
	 *
	 * @return the create date of this add lab resource req first
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this add lab resource req first.
	 *
	 * @return the group ID of this add lab resource req first
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this add lab resource req first.
	 *
	 * @return the janaac application ID of this add lab resource req first
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the location of this add lab resource req first.
	 *
	 * @return the location of this add lab resource req first
	 */
	@Override
	public String getLocation() {
		return model.getLocation();
	}

	/**
	 * Returns the modified date of this add lab resource req first.
	 *
	 * @return the modified date of this add lab resource req first
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the num of this add lab resource req first.
	 *
	 * @return the num of this add lab resource req first
	 */
	@Override
	public String getNum() {
		return model.getNum();
	}

	/**
	 * Returns the primary key of this add lab resource req first.
	 *
	 * @return the primary key of this add lab resource req first
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this add lab resource req first.
	 *
	 * @return the user ID of this add lab resource req first
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this add lab resource req first.
	 *
	 * @return the user name of this add lab resource req first
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this add lab resource req first.
	 *
	 * @return the user uuid of this add lab resource req first
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
	 * Sets the activities of this add lab resource req first.
	 *
	 * @param activities the activities of this add lab resource req first
	 */
	@Override
	public void setActivities(String activities) {
		model.setActivities(activities);
	}

	/**
	 * Sets the add lab resource req first ID of this add lab resource req first.
	 *
	 * @param addLabResourceReqFirstId the add lab resource req first ID of this add lab resource req first
	 */
	@Override
	public void setAddLabResourceReqFirstId(long addLabResourceReqFirstId) {
		model.setAddLabResourceReqFirstId(addLabResourceReqFirstId);
	}

	/**
	 * Sets the company ID of this add lab resource req first.
	 *
	 * @param companyId the company ID of this add lab resource req first
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the contact details of this add lab resource req first.
	 *
	 * @param contactDetails the contact details of this add lab resource req first
	 */
	@Override
	public void setContactDetails(String contactDetails) {
		model.setContactDetails(contactDetails);
	}

	/**
	 * Sets the counter of this add lab resource req first.
	 *
	 * @param counter the counter of this add lab resource req first
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this add lab resource req first.
	 *
	 * @param createDate the create date of this add lab resource req first
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this add lab resource req first.
	 *
	 * @param groupId the group ID of this add lab resource req first
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this add lab resource req first.
	 *
	 * @param janaacApplicationId the janaac application ID of this add lab resource req first
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the location of this add lab resource req first.
	 *
	 * @param location the location of this add lab resource req first
	 */
	@Override
	public void setLocation(String location) {
		model.setLocation(location);
	}

	/**
	 * Sets the modified date of this add lab resource req first.
	 *
	 * @param modifiedDate the modified date of this add lab resource req first
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the num of this add lab resource req first.
	 *
	 * @param num the num of this add lab resource req first
	 */
	@Override
	public void setNum(String num) {
		model.setNum(num);
	}

	/**
	 * Sets the primary key of this add lab resource req first.
	 *
	 * @param primaryKey the primary key of this add lab resource req first
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this add lab resource req first.
	 *
	 * @param userId the user ID of this add lab resource req first
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this add lab resource req first.
	 *
	 * @param userName the user name of this add lab resource req first
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this add lab resource req first.
	 *
	 * @param userUuid the user uuid of this add lab resource req first
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
	protected AddLabResourceReqFirstWrapper wrap(
		AddLabResourceReqFirst addLabResourceReqFirst) {

		return new AddLabResourceReqFirstWrapper(addLabResourceReqFirst);
	}

}