/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CannabisApplicationCompanyInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationCompanyInfo
 * @generated
 */
public class CannabisApplicationCompanyInfoWrapper
	extends BaseModelWrapper<CannabisApplicationCompanyInfo>
	implements CannabisApplicationCompanyInfo,
			   ModelWrapper<CannabisApplicationCompanyInfo> {

	public CannabisApplicationCompanyInfoWrapper(
		CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo) {

		super(cannabisApplicationCompanyInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("companyInformationId", getCompanyInformationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("companyName", getCompanyName());
		attributes.put("trn", getTrn());
		attributes.put("typeOfCompany", getTypeOfCompany());
		attributes.put("otherCompanyType", getOtherCompanyType());
		attributes.put("registrationNumber", getRegistrationNumber());
		attributes.put("contactPhoneNumber", getContactPhoneNumber());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("status", getStatus());
		attributes.put("applicationNumber", getApplicationNumber());
		attributes.put("cannabisApplicationId", getCannabisApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long companyInformationId = (Long)attributes.get(
			"companyInformationId");

		if (companyInformationId != null) {
			setCompanyInformationId(companyInformationId);
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

		String companyName = (String)attributes.get("companyName");

		if (companyName != null) {
			setCompanyName(companyName);
		}

		String trn = (String)attributes.get("trn");

		if (trn != null) {
			setTrn(trn);
		}

		String typeOfCompany = (String)attributes.get("typeOfCompany");

		if (typeOfCompany != null) {
			setTypeOfCompany(typeOfCompany);
		}

		String otherCompanyType = (String)attributes.get("otherCompanyType");

		if (otherCompanyType != null) {
			setOtherCompanyType(otherCompanyType);
		}

		String registrationNumber = (String)attributes.get(
			"registrationNumber");

		if (registrationNumber != null) {
			setRegistrationNumber(registrationNumber);
		}

		String contactPhoneNumber = (String)attributes.get(
			"contactPhoneNumber");

		if (contactPhoneNumber != null) {
			setContactPhoneNumber(contactPhoneNumber);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String applicationNumber = (String)attributes.get("applicationNumber");

		if (applicationNumber != null) {
			setApplicationNumber(applicationNumber);
		}

		Long cannabisApplicationId = (Long)attributes.get(
			"cannabisApplicationId");

		if (cannabisApplicationId != null) {
			setCannabisApplicationId(cannabisApplicationId);
		}
	}

	@Override
	public CannabisApplicationCompanyInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the application number of this cannabis application company info.
	 *
	 * @return the application number of this cannabis application company info
	 */
	@Override
	public String getApplicationNumber() {
		return model.getApplicationNumber();
	}

	/**
	 * Returns the cannabis application ID of this cannabis application company info.
	 *
	 * @return the cannabis application ID of this cannabis application company info
	 */
	@Override
	public long getCannabisApplicationId() {
		return model.getCannabisApplicationId();
	}

	/**
	 * Returns the company ID of this cannabis application company info.
	 *
	 * @return the company ID of this cannabis application company info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company information ID of this cannabis application company info.
	 *
	 * @return the company information ID of this cannabis application company info
	 */
	@Override
	public long getCompanyInformationId() {
		return model.getCompanyInformationId();
	}

	/**
	 * Returns the company name of this cannabis application company info.
	 *
	 * @return the company name of this cannabis application company info
	 */
	@Override
	public String getCompanyName() {
		return model.getCompanyName();
	}

	/**
	 * Returns the contact phone number of this cannabis application company info.
	 *
	 * @return the contact phone number of this cannabis application company info
	 */
	@Override
	public String getContactPhoneNumber() {
		return model.getContactPhoneNumber();
	}

	/**
	 * Returns the create date of this cannabis application company info.
	 *
	 * @return the create date of this cannabis application company info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email address of this cannabis application company info.
	 *
	 * @return the email address of this cannabis application company info
	 */
	@Override
	public String getEmailAddress() {
		return model.getEmailAddress();
	}

	/**
	 * Returns the group ID of this cannabis application company info.
	 *
	 * @return the group ID of this cannabis application company info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this cannabis application company info.
	 *
	 * @return the modified date of this cannabis application company info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the other company type of this cannabis application company info.
	 *
	 * @return the other company type of this cannabis application company info
	 */
	@Override
	public String getOtherCompanyType() {
		return model.getOtherCompanyType();
	}

	/**
	 * Returns the primary key of this cannabis application company info.
	 *
	 * @return the primary key of this cannabis application company info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the registration number of this cannabis application company info.
	 *
	 * @return the registration number of this cannabis application company info
	 */
	@Override
	public String getRegistrationNumber() {
		return model.getRegistrationNumber();
	}

	/**
	 * Returns the status of this cannabis application company info.
	 *
	 * @return the status of this cannabis application company info
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the trn of this cannabis application company info.
	 *
	 * @return the trn of this cannabis application company info
	 */
	@Override
	public String getTrn() {
		return model.getTrn();
	}

	/**
	 * Returns the type of company of this cannabis application company info.
	 *
	 * @return the type of company of this cannabis application company info
	 */
	@Override
	public String getTypeOfCompany() {
		return model.getTypeOfCompany();
	}

	/**
	 * Returns the user ID of this cannabis application company info.
	 *
	 * @return the user ID of this cannabis application company info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this cannabis application company info.
	 *
	 * @return the user name of this cannabis application company info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this cannabis application company info.
	 *
	 * @return the user uuid of this cannabis application company info
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this cannabis application company info.
	 *
	 * @return the uuid of this cannabis application company info
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the application number of this cannabis application company info.
	 *
	 * @param applicationNumber the application number of this cannabis application company info
	 */
	@Override
	public void setApplicationNumber(String applicationNumber) {
		model.setApplicationNumber(applicationNumber);
	}

	/**
	 * Sets the cannabis application ID of this cannabis application company info.
	 *
	 * @param cannabisApplicationId the cannabis application ID of this cannabis application company info
	 */
	@Override
	public void setCannabisApplicationId(long cannabisApplicationId) {
		model.setCannabisApplicationId(cannabisApplicationId);
	}

	/**
	 * Sets the company ID of this cannabis application company info.
	 *
	 * @param companyId the company ID of this cannabis application company info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company information ID of this cannabis application company info.
	 *
	 * @param companyInformationId the company information ID of this cannabis application company info
	 */
	@Override
	public void setCompanyInformationId(long companyInformationId) {
		model.setCompanyInformationId(companyInformationId);
	}

	/**
	 * Sets the company name of this cannabis application company info.
	 *
	 * @param companyName the company name of this cannabis application company info
	 */
	@Override
	public void setCompanyName(String companyName) {
		model.setCompanyName(companyName);
	}

	/**
	 * Sets the contact phone number of this cannabis application company info.
	 *
	 * @param contactPhoneNumber the contact phone number of this cannabis application company info
	 */
	@Override
	public void setContactPhoneNumber(String contactPhoneNumber) {
		model.setContactPhoneNumber(contactPhoneNumber);
	}

	/**
	 * Sets the create date of this cannabis application company info.
	 *
	 * @param createDate the create date of this cannabis application company info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email address of this cannabis application company info.
	 *
	 * @param emailAddress the email address of this cannabis application company info
	 */
	@Override
	public void setEmailAddress(String emailAddress) {
		model.setEmailAddress(emailAddress);
	}

	/**
	 * Sets the group ID of this cannabis application company info.
	 *
	 * @param groupId the group ID of this cannabis application company info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this cannabis application company info.
	 *
	 * @param modifiedDate the modified date of this cannabis application company info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the other company type of this cannabis application company info.
	 *
	 * @param otherCompanyType the other company type of this cannabis application company info
	 */
	@Override
	public void setOtherCompanyType(String otherCompanyType) {
		model.setOtherCompanyType(otherCompanyType);
	}

	/**
	 * Sets the primary key of this cannabis application company info.
	 *
	 * @param primaryKey the primary key of this cannabis application company info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the registration number of this cannabis application company info.
	 *
	 * @param registrationNumber the registration number of this cannabis application company info
	 */
	@Override
	public void setRegistrationNumber(String registrationNumber) {
		model.setRegistrationNumber(registrationNumber);
	}

	/**
	 * Sets the status of this cannabis application company info.
	 *
	 * @param status the status of this cannabis application company info
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the trn of this cannabis application company info.
	 *
	 * @param trn the trn of this cannabis application company info
	 */
	@Override
	public void setTrn(String trn) {
		model.setTrn(trn);
	}

	/**
	 * Sets the type of company of this cannabis application company info.
	 *
	 * @param typeOfCompany the type of company of this cannabis application company info
	 */
	@Override
	public void setTypeOfCompany(String typeOfCompany) {
		model.setTypeOfCompany(typeOfCompany);
	}

	/**
	 * Sets the user ID of this cannabis application company info.
	 *
	 * @param userId the user ID of this cannabis application company info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this cannabis application company info.
	 *
	 * @param userName the user name of this cannabis application company info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this cannabis application company info.
	 *
	 * @param userUuid the user uuid of this cannabis application company info
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this cannabis application company info.
	 *
	 * @param uuid the uuid of this cannabis application company info
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected CannabisApplicationCompanyInfoWrapper wrap(
		CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo) {

		return new CannabisApplicationCompanyInfoWrapper(
			cannabisApplicationCompanyInfo);
	}

}