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
 * This class is a wrapper for {@link NcbjSectionOneAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionOneAdd
 * @generated
 */
public class NcbjSectionOneAddWrapper
	extends BaseModelWrapper<NcbjSectionOneAdd>
	implements ModelWrapper<NcbjSectionOneAdd>, NcbjSectionOneAdd {

	public NcbjSectionOneAddWrapper(NcbjSectionOneAdd ncbjSectionOneAdd) {
		super(ncbjSectionOneAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ncbjSectionOneAddId", getNcbjSectionOneAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("headOfCompanyName", getHeadOfCompanyName());
		attributes.put("JobTitle", getJobTitle());
		attributes.put("eMeilAddress", getEMeilAddress());
		attributes.put("telephoneNumber", getTelephoneNumber());
		attributes.put("contactName", getContactName());
		attributes.put("contactNameJobTitle", getContactNameJobTitle());
		attributes.put("contactNameEmailAddress", getContactNameEmailAddress());
		attributes.put(
			"contactNameTelephoneNum ", getContactNameTelephoneNum());
		attributes.put("ncbjApplicationId", getNcbjApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ncbjSectionOneAddId = (Long)attributes.get("ncbjSectionOneAddId");

		if (ncbjSectionOneAddId != null) {
			setNcbjSectionOneAddId(ncbjSectionOneAddId);
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

		String JobTitle = (String)attributes.get("JobTitle");

		if (JobTitle != null) {
			setJobTitle(JobTitle);
		}

		Date eMeilAddress = (Date)attributes.get("eMeilAddress");

		if (eMeilAddress != null) {
			setEMeilAddress(eMeilAddress);
		}

		Date telephoneNumber = (Date)attributes.get("telephoneNumber");

		if (telephoneNumber != null) {
			setTelephoneNumber(telephoneNumber);
		}

		Date contactName = (Date)attributes.get("contactName");

		if (contactName != null) {
			setContactName(contactName);
		}

		Date contactNameJobTitle = (Date)attributes.get("contactNameJobTitle");

		if (contactNameJobTitle != null) {
			setContactNameJobTitle(contactNameJobTitle);
		}

		Date contactNameEmailAddress = (Date)attributes.get(
			"contactNameEmailAddress");

		if (contactNameEmailAddress != null) {
			setContactNameEmailAddress(contactNameEmailAddress);
		}

		Date contactNameTelephoneNum = (Date)attributes.get(
			"contactNameTelephoneNum ");

		if (contactNameTelephoneNum != null) {
			setContactNameTelephoneNum(contactNameTelephoneNum);
		}

		Long ncbjApplicationId = (Long)attributes.get("ncbjApplicationId");

		if (ncbjApplicationId != null) {
			setNcbjApplicationId(ncbjApplicationId);
		}
	}

	@Override
	public NcbjSectionOneAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this ncbj section one add.
	 *
	 * @return the company ID of this ncbj section one add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the contact name of this ncbj section one add.
	 *
	 * @return the contact name of this ncbj section one add
	 */
	@Override
	public Date getContactName() {
		return model.getContactName();
	}

	/**
	 * Returns the contact name email address of this ncbj section one add.
	 *
	 * @return the contact name email address of this ncbj section one add
	 */
	@Override
	public Date getContactNameEmailAddress() {
		return model.getContactNameEmailAddress();
	}

	/**
	 * Returns the contact name job title of this ncbj section one add.
	 *
	 * @return the contact name job title of this ncbj section one add
	 */
	@Override
	public Date getContactNameJobTitle() {
		return model.getContactNameJobTitle();
	}

	/**
	 * Returns the contact name telephone num of this ncbj section one add.
	 *
	 * @return the contact name telephone num of this ncbj section one add
	 */
	@Override
	public Date getContactNameTelephoneNum() {
		return model.getContactNameTelephoneNum();
	}

	/**
	 * Returns the create date of this ncbj section one add.
	 *
	 * @return the create date of this ncbj section one add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the e meil address of this ncbj section one add.
	 *
	 * @return the e meil address of this ncbj section one add
	 */
	@Override
	public Date getEMeilAddress() {
		return model.getEMeilAddress();
	}

	/**
	 * Returns the group ID of this ncbj section one add.
	 *
	 * @return the group ID of this ncbj section one add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the head of company name of this ncbj section one add.
	 *
	 * @return the head of company name of this ncbj section one add
	 */
	@Override
	public String getHeadOfCompanyName() {
		return model.getHeadOfCompanyName();
	}

	/**
	 * Returns the job title of this ncbj section one add.
	 *
	 * @return the job title of this ncbj section one add
	 */
	@Override
	public String getJobTitle() {
		return model.getJobTitle();
	}

	/**
	 * Returns the modified date of this ncbj section one add.
	 *
	 * @return the modified date of this ncbj section one add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ncbj application ID of this ncbj section one add.
	 *
	 * @return the ncbj application ID of this ncbj section one add
	 */
	@Override
	public long getNcbjApplicationId() {
		return model.getNcbjApplicationId();
	}

	/**
	 * Returns the ncbj section one add ID of this ncbj section one add.
	 *
	 * @return the ncbj section one add ID of this ncbj section one add
	 */
	@Override
	public long getNcbjSectionOneAddId() {
		return model.getNcbjSectionOneAddId();
	}

	/**
	 * Returns the primary key of this ncbj section one add.
	 *
	 * @return the primary key of this ncbj section one add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the telephone number of this ncbj section one add.
	 *
	 * @return the telephone number of this ncbj section one add
	 */
	@Override
	public Date getTelephoneNumber() {
		return model.getTelephoneNumber();
	}

	/**
	 * Returns the user ID of this ncbj section one add.
	 *
	 * @return the user ID of this ncbj section one add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ncbj section one add.
	 *
	 * @return the user name of this ncbj section one add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ncbj section one add.
	 *
	 * @return the user uuid of this ncbj section one add
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
	 * Sets the company ID of this ncbj section one add.
	 *
	 * @param companyId the company ID of this ncbj section one add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the contact name of this ncbj section one add.
	 *
	 * @param contactName the contact name of this ncbj section one add
	 */
	@Override
	public void setContactName(Date contactName) {
		model.setContactName(contactName);
	}

	/**
	 * Sets the contact name email address of this ncbj section one add.
	 *
	 * @param contactNameEmailAddress the contact name email address of this ncbj section one add
	 */
	@Override
	public void setContactNameEmailAddress(Date contactNameEmailAddress) {
		model.setContactNameEmailAddress(contactNameEmailAddress);
	}

	/**
	 * Sets the contact name job title of this ncbj section one add.
	 *
	 * @param contactNameJobTitle the contact name job title of this ncbj section one add
	 */
	@Override
	public void setContactNameJobTitle(Date contactNameJobTitle) {
		model.setContactNameJobTitle(contactNameJobTitle);
	}

	/**
	 * Sets the contact name telephone num of this ncbj section one add.
	 *
	 * @param contactNameTelephoneNum  the contact name telephone num of this ncbj section one add
	 */
	@Override
	public void setContactNameTelephoneNum(Date contactNameTelephoneNum) {
		model.setContactNameTelephoneNum(contactNameTelephoneNum);
	}

	/**
	 * Sets the create date of this ncbj section one add.
	 *
	 * @param createDate the create date of this ncbj section one add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the e meil address of this ncbj section one add.
	 *
	 * @param eMeilAddress the e meil address of this ncbj section one add
	 */
	@Override
	public void setEMeilAddress(Date eMeilAddress) {
		model.setEMeilAddress(eMeilAddress);
	}

	/**
	 * Sets the group ID of this ncbj section one add.
	 *
	 * @param groupId the group ID of this ncbj section one add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the head of company name of this ncbj section one add.
	 *
	 * @param headOfCompanyName the head of company name of this ncbj section one add
	 */
	@Override
	public void setHeadOfCompanyName(String headOfCompanyName) {
		model.setHeadOfCompanyName(headOfCompanyName);
	}

	/**
	 * Sets the job title of this ncbj section one add.
	 *
	 * @param JobTitle the job title of this ncbj section one add
	 */
	@Override
	public void setJobTitle(String JobTitle) {
		model.setJobTitle(JobTitle);
	}

	/**
	 * Sets the modified date of this ncbj section one add.
	 *
	 * @param modifiedDate the modified date of this ncbj section one add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ncbj application ID of this ncbj section one add.
	 *
	 * @param ncbjApplicationId the ncbj application ID of this ncbj section one add
	 */
	@Override
	public void setNcbjApplicationId(long ncbjApplicationId) {
		model.setNcbjApplicationId(ncbjApplicationId);
	}

	/**
	 * Sets the ncbj section one add ID of this ncbj section one add.
	 *
	 * @param ncbjSectionOneAddId the ncbj section one add ID of this ncbj section one add
	 */
	@Override
	public void setNcbjSectionOneAddId(long ncbjSectionOneAddId) {
		model.setNcbjSectionOneAddId(ncbjSectionOneAddId);
	}

	/**
	 * Sets the primary key of this ncbj section one add.
	 *
	 * @param primaryKey the primary key of this ncbj section one add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the telephone number of this ncbj section one add.
	 *
	 * @param telephoneNumber the telephone number of this ncbj section one add
	 */
	@Override
	public void setTelephoneNumber(Date telephoneNumber) {
		model.setTelephoneNumber(telephoneNumber);
	}

	/**
	 * Sets the user ID of this ncbj section one add.
	 *
	 * @param userId the user ID of this ncbj section one add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ncbj section one add.
	 *
	 * @param userName the user name of this ncbj section one add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ncbj section one add.
	 *
	 * @param userUuid the user uuid of this ncbj section one add
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
	protected NcbjSectionOneAddWrapper wrap(
		NcbjSectionOneAdd ncbjSectionOneAdd) {

		return new NcbjSectionOneAddWrapper(ncbjSectionOneAdd);
	}

}