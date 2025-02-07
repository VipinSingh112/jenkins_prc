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
 * This class is a wrapper for {@link AddFdaPersonnelFour}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaPersonnelFour
 * @generated
 */
public class AddFdaPersonnelFourWrapper
	extends BaseModelWrapper<AddFdaPersonnelFour>
	implements AddFdaPersonnelFour, ModelWrapper<AddFdaPersonnelFour> {

	public AddFdaPersonnelFourWrapper(AddFdaPersonnelFour addFdaPersonnelFour) {
		super(addFdaPersonnelFour);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("addFdaPersonnelFourId", getAddFdaPersonnelFourId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("number", getNumber());
		attributes.put("locationAddress", getLocationAddress());
		attributes.put("certificationActivities", getCertificationActivities());
		attributes.put("contactDetails", getContactDetails());
		attributes.put("janaacApplicationId", getJanaacApplicationId());
		attributes.put("counter", getCounter());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long addFdaPersonnelFourId = (Long)attributes.get(
			"addFdaPersonnelFourId");

		if (addFdaPersonnelFourId != null) {
			setAddFdaPersonnelFourId(addFdaPersonnelFourId);
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

		String locationAddress = (String)attributes.get("locationAddress");

		if (locationAddress != null) {
			setLocationAddress(locationAddress);
		}

		String certificationActivities = (String)attributes.get(
			"certificationActivities");

		if (certificationActivities != null) {
			setCertificationActivities(certificationActivities);
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
	public AddFdaPersonnelFour cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the add fda personnel four ID of this add fda personnel four.
	 *
	 * @return the add fda personnel four ID of this add fda personnel four
	 */
	@Override
	public long getAddFdaPersonnelFourId() {
		return model.getAddFdaPersonnelFourId();
	}

	/**
	 * Returns the certification activities of this add fda personnel four.
	 *
	 * @return the certification activities of this add fda personnel four
	 */
	@Override
	public String getCertificationActivities() {
		return model.getCertificationActivities();
	}

	/**
	 * Returns the company ID of this add fda personnel four.
	 *
	 * @return the company ID of this add fda personnel four
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the contact details of this add fda personnel four.
	 *
	 * @return the contact details of this add fda personnel four
	 */
	@Override
	public String getContactDetails() {
		return model.getContactDetails();
	}

	/**
	 * Returns the counter of this add fda personnel four.
	 *
	 * @return the counter of this add fda personnel four
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this add fda personnel four.
	 *
	 * @return the create date of this add fda personnel four
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this add fda personnel four.
	 *
	 * @return the group ID of this add fda personnel four
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this add fda personnel four.
	 *
	 * @return the janaac application ID of this add fda personnel four
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the location address of this add fda personnel four.
	 *
	 * @return the location address of this add fda personnel four
	 */
	@Override
	public String getLocationAddress() {
		return model.getLocationAddress();
	}

	/**
	 * Returns the modified date of this add fda personnel four.
	 *
	 * @return the modified date of this add fda personnel four
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the number of this add fda personnel four.
	 *
	 * @return the number of this add fda personnel four
	 */
	@Override
	public String getNumber() {
		return model.getNumber();
	}

	/**
	 * Returns the primary key of this add fda personnel four.
	 *
	 * @return the primary key of this add fda personnel four
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this add fda personnel four.
	 *
	 * @return the user ID of this add fda personnel four
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this add fda personnel four.
	 *
	 * @return the user name of this add fda personnel four
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this add fda personnel four.
	 *
	 * @return the user uuid of this add fda personnel four
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
	 * Sets the add fda personnel four ID of this add fda personnel four.
	 *
	 * @param addFdaPersonnelFourId the add fda personnel four ID of this add fda personnel four
	 */
	@Override
	public void setAddFdaPersonnelFourId(long addFdaPersonnelFourId) {
		model.setAddFdaPersonnelFourId(addFdaPersonnelFourId);
	}

	/**
	 * Sets the certification activities of this add fda personnel four.
	 *
	 * @param certificationActivities the certification activities of this add fda personnel four
	 */
	@Override
	public void setCertificationActivities(String certificationActivities) {
		model.setCertificationActivities(certificationActivities);
	}

	/**
	 * Sets the company ID of this add fda personnel four.
	 *
	 * @param companyId the company ID of this add fda personnel four
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the contact details of this add fda personnel four.
	 *
	 * @param contactDetails the contact details of this add fda personnel four
	 */
	@Override
	public void setContactDetails(String contactDetails) {
		model.setContactDetails(contactDetails);
	}

	/**
	 * Sets the counter of this add fda personnel four.
	 *
	 * @param counter the counter of this add fda personnel four
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this add fda personnel four.
	 *
	 * @param createDate the create date of this add fda personnel four
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this add fda personnel four.
	 *
	 * @param groupId the group ID of this add fda personnel four
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this add fda personnel four.
	 *
	 * @param janaacApplicationId the janaac application ID of this add fda personnel four
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the location address of this add fda personnel four.
	 *
	 * @param locationAddress the location address of this add fda personnel four
	 */
	@Override
	public void setLocationAddress(String locationAddress) {
		model.setLocationAddress(locationAddress);
	}

	/**
	 * Sets the modified date of this add fda personnel four.
	 *
	 * @param modifiedDate the modified date of this add fda personnel four
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the number of this add fda personnel four.
	 *
	 * @param number the number of this add fda personnel four
	 */
	@Override
	public void setNumber(String number) {
		model.setNumber(number);
	}

	/**
	 * Sets the primary key of this add fda personnel four.
	 *
	 * @param primaryKey the primary key of this add fda personnel four
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this add fda personnel four.
	 *
	 * @param userId the user ID of this add fda personnel four
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this add fda personnel four.
	 *
	 * @param userName the user name of this add fda personnel four
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this add fda personnel four.
	 *
	 * @param userUuid the user uuid of this add fda personnel four
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
	protected AddFdaPersonnelFourWrapper wrap(
		AddFdaPersonnelFour addFdaPersonnelFour) {

		return new AddFdaPersonnelFourWrapper(addFdaPersonnelFour);
	}

}