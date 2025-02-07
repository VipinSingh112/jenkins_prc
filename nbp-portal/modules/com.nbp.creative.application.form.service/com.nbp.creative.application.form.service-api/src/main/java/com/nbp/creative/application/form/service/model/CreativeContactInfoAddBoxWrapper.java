/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CreativeContactInfoAddBox}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeContactInfoAddBox
 * @generated
 */
public class CreativeContactInfoAddBoxWrapper
	extends BaseModelWrapper<CreativeContactInfoAddBox>
	implements CreativeContactInfoAddBox,
			   ModelWrapper<CreativeContactInfoAddBox> {

	public CreativeContactInfoAddBoxWrapper(
		CreativeContactInfoAddBox creativeContactInfoAddBox) {

		super(creativeContactInfoAddBox);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("creativeContactBoxId", getCreativeContactBoxId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("contactTelephone", getContactTelephone());
		attributes.put("contactFax", getContactFax());
		attributes.put("contactEmailAddress", getContactEmailAddress());
		attributes.put("counterContact", getCounterContact());
		attributes.put("CreativeApplicationId", getCreativeApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long creativeContactBoxId = (Long)attributes.get(
			"creativeContactBoxId");

		if (creativeContactBoxId != null) {
			setCreativeContactBoxId(creativeContactBoxId);
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

		String contactTelephone = (String)attributes.get("contactTelephone");

		if (contactTelephone != null) {
			setContactTelephone(contactTelephone);
		}

		String contactFax = (String)attributes.get("contactFax");

		if (contactFax != null) {
			setContactFax(contactFax);
		}

		String contactEmailAddress = (String)attributes.get(
			"contactEmailAddress");

		if (contactEmailAddress != null) {
			setContactEmailAddress(contactEmailAddress);
		}

		String counterContact = (String)attributes.get("counterContact");

		if (counterContact != null) {
			setCounterContact(counterContact);
		}

		Long CreativeApplicationId = (Long)attributes.get(
			"CreativeApplicationId");

		if (CreativeApplicationId != null) {
			setCreativeApplicationId(CreativeApplicationId);
		}
	}

	@Override
	public CreativeContactInfoAddBox cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this creative contact info add box.
	 *
	 * @return the company ID of this creative contact info add box
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the contact email address of this creative contact info add box.
	 *
	 * @return the contact email address of this creative contact info add box
	 */
	@Override
	public String getContactEmailAddress() {
		return model.getContactEmailAddress();
	}

	/**
	 * Returns the contact fax of this creative contact info add box.
	 *
	 * @return the contact fax of this creative contact info add box
	 */
	@Override
	public String getContactFax() {
		return model.getContactFax();
	}

	/**
	 * Returns the contact telephone of this creative contact info add box.
	 *
	 * @return the contact telephone of this creative contact info add box
	 */
	@Override
	public String getContactTelephone() {
		return model.getContactTelephone();
	}

	/**
	 * Returns the counter contact of this creative contact info add box.
	 *
	 * @return the counter contact of this creative contact info add box
	 */
	@Override
	public String getCounterContact() {
		return model.getCounterContact();
	}

	/**
	 * Returns the create date of this creative contact info add box.
	 *
	 * @return the create date of this creative contact info add box
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the creative application ID of this creative contact info add box.
	 *
	 * @return the creative application ID of this creative contact info add box
	 */
	@Override
	public long getCreativeApplicationId() {
		return model.getCreativeApplicationId();
	}

	/**
	 * Returns the creative contact box ID of this creative contact info add box.
	 *
	 * @return the creative contact box ID of this creative contact info add box
	 */
	@Override
	public long getCreativeContactBoxId() {
		return model.getCreativeContactBoxId();
	}

	/**
	 * Returns the group ID of this creative contact info add box.
	 *
	 * @return the group ID of this creative contact info add box
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this creative contact info add box.
	 *
	 * @return the modified date of this creative contact info add box
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this creative contact info add box.
	 *
	 * @return the primary key of this creative contact info add box
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this creative contact info add box.
	 *
	 * @return the user ID of this creative contact info add box
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this creative contact info add box.
	 *
	 * @return the user name of this creative contact info add box
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this creative contact info add box.
	 *
	 * @return the user uuid of this creative contact info add box
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
	 * Sets the company ID of this creative contact info add box.
	 *
	 * @param companyId the company ID of this creative contact info add box
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the contact email address of this creative contact info add box.
	 *
	 * @param contactEmailAddress the contact email address of this creative contact info add box
	 */
	@Override
	public void setContactEmailAddress(String contactEmailAddress) {
		model.setContactEmailAddress(contactEmailAddress);
	}

	/**
	 * Sets the contact fax of this creative contact info add box.
	 *
	 * @param contactFax the contact fax of this creative contact info add box
	 */
	@Override
	public void setContactFax(String contactFax) {
		model.setContactFax(contactFax);
	}

	/**
	 * Sets the contact telephone of this creative contact info add box.
	 *
	 * @param contactTelephone the contact telephone of this creative contact info add box
	 */
	@Override
	public void setContactTelephone(String contactTelephone) {
		model.setContactTelephone(contactTelephone);
	}

	/**
	 * Sets the counter contact of this creative contact info add box.
	 *
	 * @param counterContact the counter contact of this creative contact info add box
	 */
	@Override
	public void setCounterContact(String counterContact) {
		model.setCounterContact(counterContact);
	}

	/**
	 * Sets the create date of this creative contact info add box.
	 *
	 * @param createDate the create date of this creative contact info add box
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the creative application ID of this creative contact info add box.
	 *
	 * @param CreativeApplicationId the creative application ID of this creative contact info add box
	 */
	@Override
	public void setCreativeApplicationId(long CreativeApplicationId) {
		model.setCreativeApplicationId(CreativeApplicationId);
	}

	/**
	 * Sets the creative contact box ID of this creative contact info add box.
	 *
	 * @param creativeContactBoxId the creative contact box ID of this creative contact info add box
	 */
	@Override
	public void setCreativeContactBoxId(long creativeContactBoxId) {
		model.setCreativeContactBoxId(creativeContactBoxId);
	}

	/**
	 * Sets the group ID of this creative contact info add box.
	 *
	 * @param groupId the group ID of this creative contact info add box
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this creative contact info add box.
	 *
	 * @param modifiedDate the modified date of this creative contact info add box
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this creative contact info add box.
	 *
	 * @param primaryKey the primary key of this creative contact info add box
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this creative contact info add box.
	 *
	 * @param userId the user ID of this creative contact info add box
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this creative contact info add box.
	 *
	 * @param userName the user name of this creative contact info add box
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this creative contact info add box.
	 *
	 * @param userUuid the user uuid of this creative contact info add box
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
	protected CreativeContactInfoAddBoxWrapper wrap(
		CreativeContactInfoAddBox creativeContactInfoAddBox) {

		return new CreativeContactInfoAddBoxWrapper(creativeContactInfoAddBox);
	}

}