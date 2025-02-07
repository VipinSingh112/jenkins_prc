/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link NcbjCompanyDetailAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjCompanyDetailAdd
 * @generated
 */
public class NcbjCompanyDetailAddWrapper
	extends BaseModelWrapper<NcbjCompanyDetailAdd>
	implements ModelWrapper<NcbjCompanyDetailAdd>, NcbjCompanyDetailAdd {

	public NcbjCompanyDetailAddWrapper(
		NcbjCompanyDetailAdd ncbjCompanyDetailAdd) {

		super(ncbjCompanyDetailAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ncbjCompanyDetailAddId", getNcbjCompanyDetailAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("headOfCompanyName", getHeadOfCompanyName());
		attributes.put("companyAddr", getCompanyAddr());
		attributes.put("jobTitle", getJobTitle());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("telephoneNumber", getTelephoneNumber());
		attributes.put("contactName", getContactName());
		attributes.put("contactNameJobTitle", getContactNameJobTitle());
		attributes.put("contactNameEmailAddress", getContactNameEmailAddress());
		attributes.put("contactNameTelephoneNum", getContactNameTelephoneNum());
		attributes.put("counter", getCounter());
		attributes.put("ncbjApplicationId", getNcbjApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ncbjCompanyDetailAddId = (Long)attributes.get(
			"ncbjCompanyDetailAddId");

		if (ncbjCompanyDetailAddId != null) {
			setNcbjCompanyDetailAddId(ncbjCompanyDetailAddId);
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

		String headOfCompanyName = (String)attributes.get("headOfCompanyName");

		if (headOfCompanyName != null) {
			setHeadOfCompanyName(headOfCompanyName);
		}

		String companyAddr = (String)attributes.get("companyAddr");

		if (companyAddr != null) {
			setCompanyAddr(companyAddr);
		}

		String jobTitle = (String)attributes.get("jobTitle");

		if (jobTitle != null) {
			setJobTitle(jobTitle);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		String telephoneNumber = (String)attributes.get("telephoneNumber");

		if (telephoneNumber != null) {
			setTelephoneNumber(telephoneNumber);
		}

		String contactName = (String)attributes.get("contactName");

		if (contactName != null) {
			setContactName(contactName);
		}

		String contactNameJobTitle = (String)attributes.get(
			"contactNameJobTitle");

		if (contactNameJobTitle != null) {
			setContactNameJobTitle(contactNameJobTitle);
		}

		String contactNameEmailAddress = (String)attributes.get(
			"contactNameEmailAddress");

		if (contactNameEmailAddress != null) {
			setContactNameEmailAddress(contactNameEmailAddress);
		}

		String contactNameTelephoneNum = (String)attributes.get(
			"contactNameTelephoneNum");

		if (contactNameTelephoneNum != null) {
			setContactNameTelephoneNum(contactNameTelephoneNum);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long ncbjApplicationId = (Long)attributes.get("ncbjApplicationId");

		if (ncbjApplicationId != null) {
			setNcbjApplicationId(ncbjApplicationId);
		}
	}

	@Override
	public NcbjCompanyDetailAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company addr of this ncbj company detail add.
	 *
	 * @return the company addr of this ncbj company detail add
	 */
	@Override
	public String getCompanyAddr() {
		return model.getCompanyAddr();
	}

	/**
	 * Returns the company ID of this ncbj company detail add.
	 *
	 * @return the company ID of this ncbj company detail add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the contact name of this ncbj company detail add.
	 *
	 * @return the contact name of this ncbj company detail add
	 */
	@Override
	public String getContactName() {
		return model.getContactName();
	}

	/**
	 * Returns the contact name email address of this ncbj company detail add.
	 *
	 * @return the contact name email address of this ncbj company detail add
	 */
	@Override
	public String getContactNameEmailAddress() {
		return model.getContactNameEmailAddress();
	}

	/**
	 * Returns the contact name job title of this ncbj company detail add.
	 *
	 * @return the contact name job title of this ncbj company detail add
	 */
	@Override
	public String getContactNameJobTitle() {
		return model.getContactNameJobTitle();
	}

	/**
	 * Returns the contact name telephone num of this ncbj company detail add.
	 *
	 * @return the contact name telephone num of this ncbj company detail add
	 */
	@Override
	public String getContactNameTelephoneNum() {
		return model.getContactNameTelephoneNum();
	}

	/**
	 * Returns the counter of this ncbj company detail add.
	 *
	 * @return the counter of this ncbj company detail add
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this ncbj company detail add.
	 *
	 * @return the create date of this ncbj company detail add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email address of this ncbj company detail add.
	 *
	 * @return the email address of this ncbj company detail add
	 */
	@Override
	public String getEmailAddress() {
		return model.getEmailAddress();
	}

	/**
	 * Returns the group ID of this ncbj company detail add.
	 *
	 * @return the group ID of this ncbj company detail add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the head of company name of this ncbj company detail add.
	 *
	 * @return the head of company name of this ncbj company detail add
	 */
	@Override
	public String getHeadOfCompanyName() {
		return model.getHeadOfCompanyName();
	}

	/**
	 * Returns the job title of this ncbj company detail add.
	 *
	 * @return the job title of this ncbj company detail add
	 */
	@Override
	public String getJobTitle() {
		return model.getJobTitle();
	}

	/**
	 * Returns the modified date of this ncbj company detail add.
	 *
	 * @return the modified date of this ncbj company detail add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ncbj application ID of this ncbj company detail add.
	 *
	 * @return the ncbj application ID of this ncbj company detail add
	 */
	@Override
	public long getNcbjApplicationId() {
		return model.getNcbjApplicationId();
	}

	/**
	 * Returns the ncbj company detail add ID of this ncbj company detail add.
	 *
	 * @return the ncbj company detail add ID of this ncbj company detail add
	 */
	@Override
	public long getNcbjCompanyDetailAddId() {
		return model.getNcbjCompanyDetailAddId();
	}

	/**
	 * Returns the primary key of this ncbj company detail add.
	 *
	 * @return the primary key of this ncbj company detail add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the telephone number of this ncbj company detail add.
	 *
	 * @return the telephone number of this ncbj company detail add
	 */
	@Override
	public String getTelephoneNumber() {
		return model.getTelephoneNumber();
	}

	/**
	 * Returns the user ID of this ncbj company detail add.
	 *
	 * @return the user ID of this ncbj company detail add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ncbj company detail add.
	 *
	 * @return the user name of this ncbj company detail add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ncbj company detail add.
	 *
	 * @return the user uuid of this ncbj company detail add
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
	 * Sets the company addr of this ncbj company detail add.
	 *
	 * @param companyAddr the company addr of this ncbj company detail add
	 */
	@Override
	public void setCompanyAddr(String companyAddr) {
		model.setCompanyAddr(companyAddr);
	}

	/**
	 * Sets the company ID of this ncbj company detail add.
	 *
	 * @param companyId the company ID of this ncbj company detail add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the contact name of this ncbj company detail add.
	 *
	 * @param contactName the contact name of this ncbj company detail add
	 */
	@Override
	public void setContactName(String contactName) {
		model.setContactName(contactName);
	}

	/**
	 * Sets the contact name email address of this ncbj company detail add.
	 *
	 * @param contactNameEmailAddress the contact name email address of this ncbj company detail add
	 */
	@Override
	public void setContactNameEmailAddress(String contactNameEmailAddress) {
		model.setContactNameEmailAddress(contactNameEmailAddress);
	}

	/**
	 * Sets the contact name job title of this ncbj company detail add.
	 *
	 * @param contactNameJobTitle the contact name job title of this ncbj company detail add
	 */
	@Override
	public void setContactNameJobTitle(String contactNameJobTitle) {
		model.setContactNameJobTitle(contactNameJobTitle);
	}

	/**
	 * Sets the contact name telephone num of this ncbj company detail add.
	 *
	 * @param contactNameTelephoneNum the contact name telephone num of this ncbj company detail add
	 */
	@Override
	public void setContactNameTelephoneNum(String contactNameTelephoneNum) {
		model.setContactNameTelephoneNum(contactNameTelephoneNum);
	}

	/**
	 * Sets the counter of this ncbj company detail add.
	 *
	 * @param counter the counter of this ncbj company detail add
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this ncbj company detail add.
	 *
	 * @param createDate the create date of this ncbj company detail add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email address of this ncbj company detail add.
	 *
	 * @param emailAddress the email address of this ncbj company detail add
	 */
	@Override
	public void setEmailAddress(String emailAddress) {
		model.setEmailAddress(emailAddress);
	}

	/**
	 * Sets the group ID of this ncbj company detail add.
	 *
	 * @param groupId the group ID of this ncbj company detail add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the head of company name of this ncbj company detail add.
	 *
	 * @param headOfCompanyName the head of company name of this ncbj company detail add
	 */
	@Override
	public void setHeadOfCompanyName(String headOfCompanyName) {
		model.setHeadOfCompanyName(headOfCompanyName);
	}

	/**
	 * Sets the job title of this ncbj company detail add.
	 *
	 * @param jobTitle the job title of this ncbj company detail add
	 */
	@Override
	public void setJobTitle(String jobTitle) {
		model.setJobTitle(jobTitle);
	}

	/**
	 * Sets the modified date of this ncbj company detail add.
	 *
	 * @param modifiedDate the modified date of this ncbj company detail add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ncbj application ID of this ncbj company detail add.
	 *
	 * @param ncbjApplicationId the ncbj application ID of this ncbj company detail add
	 */
	@Override
	public void setNcbjApplicationId(long ncbjApplicationId) {
		model.setNcbjApplicationId(ncbjApplicationId);
	}

	/**
	 * Sets the ncbj company detail add ID of this ncbj company detail add.
	 *
	 * @param ncbjCompanyDetailAddId the ncbj company detail add ID of this ncbj company detail add
	 */
	@Override
	public void setNcbjCompanyDetailAddId(long ncbjCompanyDetailAddId) {
		model.setNcbjCompanyDetailAddId(ncbjCompanyDetailAddId);
	}

	/**
	 * Sets the primary key of this ncbj company detail add.
	 *
	 * @param primaryKey the primary key of this ncbj company detail add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the telephone number of this ncbj company detail add.
	 *
	 * @param telephoneNumber the telephone number of this ncbj company detail add
	 */
	@Override
	public void setTelephoneNumber(String telephoneNumber) {
		model.setTelephoneNumber(telephoneNumber);
	}

	/**
	 * Sets the user ID of this ncbj company detail add.
	 *
	 * @param userId the user ID of this ncbj company detail add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ncbj company detail add.
	 *
	 * @param userName the user name of this ncbj company detail add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ncbj company detail add.
	 *
	 * @param userUuid the user uuid of this ncbj company detail add
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
	protected NcbjCompanyDetailAddWrapper wrap(
		NcbjCompanyDetailAdd ncbjCompanyDetailAdd) {

		return new NcbjCompanyDetailAddWrapper(ncbjCompanyDetailAdd);
	}

}