/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.farm.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FarmerStakeholderInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerStakeholderInfo
 * @generated
 */
public class FarmerStakeholderInfoWrapper
	extends BaseModelWrapper<FarmerStakeholderInfo>
	implements FarmerStakeholderInfo, ModelWrapper<FarmerStakeholderInfo> {

	public FarmerStakeholderInfoWrapper(
		FarmerStakeholderInfo farmerStakeholderInfo) {

		super(farmerStakeholderInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("farmerStakeholderInfoId", getFarmerStakeholderInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("companyName", getCompanyName());
		attributes.put("firstName", getFirstName());
		attributes.put("middleName", getMiddleName());
		attributes.put("lastName", getLastName());
		attributes.put("alias", getAlias());
		attributes.put("residentialStreetName", getResidentialStreetName());
		attributes.put("residentialDistrict", getResidentialDistrict());
		attributes.put("residentialPostOffice", getResidentialPostOffice());
		attributes.put("residentialParish", getResidentialParish());
		attributes.put(
			"residentialtelephoneNumber", getResidentialtelephoneNumber());
		attributes.put("businessStreetName", getBusinessStreetName());
		attributes.put("businessDistrict", getBusinessDistrict());
		attributes.put("businessPostOffice", getBusinessPostOffice());
		attributes.put("businessParish", getBusinessParish());
		attributes.put("businessTelephoneNumber", getBusinessTelephoneNumber());
		attributes.put("identificationType", getIdentificationType());
		attributes.put("identificationNumber", getIdentificationNumber());
		attributes.put("gender", getGender());
		attributes.put("dateOfBirth", getDateOfBirth());
		attributes.put(
			"taxpayerRegistrationNumber", getTaxpayerRegistrationNumber());
		attributes.put("cellPhone", getCellPhone());
		attributes.put("fax", getFax());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("farmerApplicationId", getFarmerApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long farmerStakeholderInfoId = (Long)attributes.get(
			"farmerStakeholderInfoId");

		if (farmerStakeholderInfoId != null) {
			setFarmerStakeholderInfoId(farmerStakeholderInfoId);
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

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String middleName = (String)attributes.get("middleName");

		if (middleName != null) {
			setMiddleName(middleName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		String alias = (String)attributes.get("alias");

		if (alias != null) {
			setAlias(alias);
		}

		String residentialStreetName = (String)attributes.get(
			"residentialStreetName");

		if (residentialStreetName != null) {
			setResidentialStreetName(residentialStreetName);
		}

		String residentialDistrict = (String)attributes.get(
			"residentialDistrict");

		if (residentialDistrict != null) {
			setResidentialDistrict(residentialDistrict);
		}

		String residentialPostOffice = (String)attributes.get(
			"residentialPostOffice");

		if (residentialPostOffice != null) {
			setResidentialPostOffice(residentialPostOffice);
		}

		String residentialParish = (String)attributes.get("residentialParish");

		if (residentialParish != null) {
			setResidentialParish(residentialParish);
		}

		String residentialtelephoneNumber = (String)attributes.get(
			"residentialtelephoneNumber");

		if (residentialtelephoneNumber != null) {
			setResidentialtelephoneNumber(residentialtelephoneNumber);
		}

		String businessStreetName = (String)attributes.get(
			"businessStreetName");

		if (businessStreetName != null) {
			setBusinessStreetName(businessStreetName);
		}

		String businessDistrict = (String)attributes.get("businessDistrict");

		if (businessDistrict != null) {
			setBusinessDistrict(businessDistrict);
		}

		String businessPostOffice = (String)attributes.get(
			"businessPostOffice");

		if (businessPostOffice != null) {
			setBusinessPostOffice(businessPostOffice);
		}

		String businessParish = (String)attributes.get("businessParish");

		if (businessParish != null) {
			setBusinessParish(businessParish);
		}

		String businessTelephoneNumber = (String)attributes.get(
			"businessTelephoneNumber");

		if (businessTelephoneNumber != null) {
			setBusinessTelephoneNumber(businessTelephoneNumber);
		}

		String identificationType = (String)attributes.get(
			"identificationType");

		if (identificationType != null) {
			setIdentificationType(identificationType);
		}

		String identificationNumber = (String)attributes.get(
			"identificationNumber");

		if (identificationNumber != null) {
			setIdentificationNumber(identificationNumber);
		}

		String gender = (String)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		Date dateOfBirth = (Date)attributes.get("dateOfBirth");

		if (dateOfBirth != null) {
			setDateOfBirth(dateOfBirth);
		}

		String taxpayerRegistrationNumber = (String)attributes.get(
			"taxpayerRegistrationNumber");

		if (taxpayerRegistrationNumber != null) {
			setTaxpayerRegistrationNumber(taxpayerRegistrationNumber);
		}

		String cellPhone = (String)attributes.get("cellPhone");

		if (cellPhone != null) {
			setCellPhone(cellPhone);
		}

		String fax = (String)attributes.get("fax");

		if (fax != null) {
			setFax(fax);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		Long farmerApplicationId = (Long)attributes.get("farmerApplicationId");

		if (farmerApplicationId != null) {
			setFarmerApplicationId(farmerApplicationId);
		}
	}

	@Override
	public FarmerStakeholderInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the alias of this farmer stakeholder info.
	 *
	 * @return the alias of this farmer stakeholder info
	 */
	@Override
	public String getAlias() {
		return model.getAlias();
	}

	/**
	 * Returns the business district of this farmer stakeholder info.
	 *
	 * @return the business district of this farmer stakeholder info
	 */
	@Override
	public String getBusinessDistrict() {
		return model.getBusinessDistrict();
	}

	/**
	 * Returns the business parish of this farmer stakeholder info.
	 *
	 * @return the business parish of this farmer stakeholder info
	 */
	@Override
	public String getBusinessParish() {
		return model.getBusinessParish();
	}

	/**
	 * Returns the business post office of this farmer stakeholder info.
	 *
	 * @return the business post office of this farmer stakeholder info
	 */
	@Override
	public String getBusinessPostOffice() {
		return model.getBusinessPostOffice();
	}

	/**
	 * Returns the business street name of this farmer stakeholder info.
	 *
	 * @return the business street name of this farmer stakeholder info
	 */
	@Override
	public String getBusinessStreetName() {
		return model.getBusinessStreetName();
	}

	/**
	 * Returns the business telephone number of this farmer stakeholder info.
	 *
	 * @return the business telephone number of this farmer stakeholder info
	 */
	@Override
	public String getBusinessTelephoneNumber() {
		return model.getBusinessTelephoneNumber();
	}

	/**
	 * Returns the cell phone of this farmer stakeholder info.
	 *
	 * @return the cell phone of this farmer stakeholder info
	 */
	@Override
	public String getCellPhone() {
		return model.getCellPhone();
	}

	/**
	 * Returns the company ID of this farmer stakeholder info.
	 *
	 * @return the company ID of this farmer stakeholder info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company name of this farmer stakeholder info.
	 *
	 * @return the company name of this farmer stakeholder info
	 */
	@Override
	public String getCompanyName() {
		return model.getCompanyName();
	}

	/**
	 * Returns the create date of this farmer stakeholder info.
	 *
	 * @return the create date of this farmer stakeholder info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of birth of this farmer stakeholder info.
	 *
	 * @return the date of birth of this farmer stakeholder info
	 */
	@Override
	public Date getDateOfBirth() {
		return model.getDateOfBirth();
	}

	/**
	 * Returns the email address of this farmer stakeholder info.
	 *
	 * @return the email address of this farmer stakeholder info
	 */
	@Override
	public String getEmailAddress() {
		return model.getEmailAddress();
	}

	/**
	 * Returns the farmer application ID of this farmer stakeholder info.
	 *
	 * @return the farmer application ID of this farmer stakeholder info
	 */
	@Override
	public long getFarmerApplicationId() {
		return model.getFarmerApplicationId();
	}

	/**
	 * Returns the farmer stakeholder info ID of this farmer stakeholder info.
	 *
	 * @return the farmer stakeholder info ID of this farmer stakeholder info
	 */
	@Override
	public long getFarmerStakeholderInfoId() {
		return model.getFarmerStakeholderInfoId();
	}

	/**
	 * Returns the fax of this farmer stakeholder info.
	 *
	 * @return the fax of this farmer stakeholder info
	 */
	@Override
	public String getFax() {
		return model.getFax();
	}

	/**
	 * Returns the first name of this farmer stakeholder info.
	 *
	 * @return the first name of this farmer stakeholder info
	 */
	@Override
	public String getFirstName() {
		return model.getFirstName();
	}

	/**
	 * Returns the gender of this farmer stakeholder info.
	 *
	 * @return the gender of this farmer stakeholder info
	 */
	@Override
	public String getGender() {
		return model.getGender();
	}

	/**
	 * Returns the group ID of this farmer stakeholder info.
	 *
	 * @return the group ID of this farmer stakeholder info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the identification number of this farmer stakeholder info.
	 *
	 * @return the identification number of this farmer stakeholder info
	 */
	@Override
	public String getIdentificationNumber() {
		return model.getIdentificationNumber();
	}

	/**
	 * Returns the identification type of this farmer stakeholder info.
	 *
	 * @return the identification type of this farmer stakeholder info
	 */
	@Override
	public String getIdentificationType() {
		return model.getIdentificationType();
	}

	/**
	 * Returns the last name of this farmer stakeholder info.
	 *
	 * @return the last name of this farmer stakeholder info
	 */
	@Override
	public String getLastName() {
		return model.getLastName();
	}

	/**
	 * Returns the middle name of this farmer stakeholder info.
	 *
	 * @return the middle name of this farmer stakeholder info
	 */
	@Override
	public String getMiddleName() {
		return model.getMiddleName();
	}

	/**
	 * Returns the modified date of this farmer stakeholder info.
	 *
	 * @return the modified date of this farmer stakeholder info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this farmer stakeholder info.
	 *
	 * @return the primary key of this farmer stakeholder info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the residential district of this farmer stakeholder info.
	 *
	 * @return the residential district of this farmer stakeholder info
	 */
	@Override
	public String getResidentialDistrict() {
		return model.getResidentialDistrict();
	}

	/**
	 * Returns the residential parish of this farmer stakeholder info.
	 *
	 * @return the residential parish of this farmer stakeholder info
	 */
	@Override
	public String getResidentialParish() {
		return model.getResidentialParish();
	}

	/**
	 * Returns the residential post office of this farmer stakeholder info.
	 *
	 * @return the residential post office of this farmer stakeholder info
	 */
	@Override
	public String getResidentialPostOffice() {
		return model.getResidentialPostOffice();
	}

	/**
	 * Returns the residential street name of this farmer stakeholder info.
	 *
	 * @return the residential street name of this farmer stakeholder info
	 */
	@Override
	public String getResidentialStreetName() {
		return model.getResidentialStreetName();
	}

	/**
	 * Returns the residentialtelephone number of this farmer stakeholder info.
	 *
	 * @return the residentialtelephone number of this farmer stakeholder info
	 */
	@Override
	public String getResidentialtelephoneNumber() {
		return model.getResidentialtelephoneNumber();
	}

	/**
	 * Returns the taxpayer registration number of this farmer stakeholder info.
	 *
	 * @return the taxpayer registration number of this farmer stakeholder info
	 */
	@Override
	public String getTaxpayerRegistrationNumber() {
		return model.getTaxpayerRegistrationNumber();
	}

	/**
	 * Returns the user ID of this farmer stakeholder info.
	 *
	 * @return the user ID of this farmer stakeholder info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this farmer stakeholder info.
	 *
	 * @return the user name of this farmer stakeholder info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this farmer stakeholder info.
	 *
	 * @return the user uuid of this farmer stakeholder info
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
	 * Sets the alias of this farmer stakeholder info.
	 *
	 * @param alias the alias of this farmer stakeholder info
	 */
	@Override
	public void setAlias(String alias) {
		model.setAlias(alias);
	}

	/**
	 * Sets the business district of this farmer stakeholder info.
	 *
	 * @param businessDistrict the business district of this farmer stakeholder info
	 */
	@Override
	public void setBusinessDistrict(String businessDistrict) {
		model.setBusinessDistrict(businessDistrict);
	}

	/**
	 * Sets the business parish of this farmer stakeholder info.
	 *
	 * @param businessParish the business parish of this farmer stakeholder info
	 */
	@Override
	public void setBusinessParish(String businessParish) {
		model.setBusinessParish(businessParish);
	}

	/**
	 * Sets the business post office of this farmer stakeholder info.
	 *
	 * @param businessPostOffice the business post office of this farmer stakeholder info
	 */
	@Override
	public void setBusinessPostOffice(String businessPostOffice) {
		model.setBusinessPostOffice(businessPostOffice);
	}

	/**
	 * Sets the business street name of this farmer stakeholder info.
	 *
	 * @param businessStreetName the business street name of this farmer stakeholder info
	 */
	@Override
	public void setBusinessStreetName(String businessStreetName) {
		model.setBusinessStreetName(businessStreetName);
	}

	/**
	 * Sets the business telephone number of this farmer stakeholder info.
	 *
	 * @param businessTelephoneNumber the business telephone number of this farmer stakeholder info
	 */
	@Override
	public void setBusinessTelephoneNumber(String businessTelephoneNumber) {
		model.setBusinessTelephoneNumber(businessTelephoneNumber);
	}

	/**
	 * Sets the cell phone of this farmer stakeholder info.
	 *
	 * @param cellPhone the cell phone of this farmer stakeholder info
	 */
	@Override
	public void setCellPhone(String cellPhone) {
		model.setCellPhone(cellPhone);
	}

	/**
	 * Sets the company ID of this farmer stakeholder info.
	 *
	 * @param companyId the company ID of this farmer stakeholder info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company name of this farmer stakeholder info.
	 *
	 * @param companyName the company name of this farmer stakeholder info
	 */
	@Override
	public void setCompanyName(String companyName) {
		model.setCompanyName(companyName);
	}

	/**
	 * Sets the create date of this farmer stakeholder info.
	 *
	 * @param createDate the create date of this farmer stakeholder info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of birth of this farmer stakeholder info.
	 *
	 * @param dateOfBirth the date of birth of this farmer stakeholder info
	 */
	@Override
	public void setDateOfBirth(Date dateOfBirth) {
		model.setDateOfBirth(dateOfBirth);
	}

	/**
	 * Sets the email address of this farmer stakeholder info.
	 *
	 * @param emailAddress the email address of this farmer stakeholder info
	 */
	@Override
	public void setEmailAddress(String emailAddress) {
		model.setEmailAddress(emailAddress);
	}

	/**
	 * Sets the farmer application ID of this farmer stakeholder info.
	 *
	 * @param farmerApplicationId the farmer application ID of this farmer stakeholder info
	 */
	@Override
	public void setFarmerApplicationId(long farmerApplicationId) {
		model.setFarmerApplicationId(farmerApplicationId);
	}

	/**
	 * Sets the farmer stakeholder info ID of this farmer stakeholder info.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID of this farmer stakeholder info
	 */
	@Override
	public void setFarmerStakeholderInfoId(long farmerStakeholderInfoId) {
		model.setFarmerStakeholderInfoId(farmerStakeholderInfoId);
	}

	/**
	 * Sets the fax of this farmer stakeholder info.
	 *
	 * @param fax the fax of this farmer stakeholder info
	 */
	@Override
	public void setFax(String fax) {
		model.setFax(fax);
	}

	/**
	 * Sets the first name of this farmer stakeholder info.
	 *
	 * @param firstName the first name of this farmer stakeholder info
	 */
	@Override
	public void setFirstName(String firstName) {
		model.setFirstName(firstName);
	}

	/**
	 * Sets the gender of this farmer stakeholder info.
	 *
	 * @param gender the gender of this farmer stakeholder info
	 */
	@Override
	public void setGender(String gender) {
		model.setGender(gender);
	}

	/**
	 * Sets the group ID of this farmer stakeholder info.
	 *
	 * @param groupId the group ID of this farmer stakeholder info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the identification number of this farmer stakeholder info.
	 *
	 * @param identificationNumber the identification number of this farmer stakeholder info
	 */
	@Override
	public void setIdentificationNumber(String identificationNumber) {
		model.setIdentificationNumber(identificationNumber);
	}

	/**
	 * Sets the identification type of this farmer stakeholder info.
	 *
	 * @param identificationType the identification type of this farmer stakeholder info
	 */
	@Override
	public void setIdentificationType(String identificationType) {
		model.setIdentificationType(identificationType);
	}

	/**
	 * Sets the last name of this farmer stakeholder info.
	 *
	 * @param lastName the last name of this farmer stakeholder info
	 */
	@Override
	public void setLastName(String lastName) {
		model.setLastName(lastName);
	}

	/**
	 * Sets the middle name of this farmer stakeholder info.
	 *
	 * @param middleName the middle name of this farmer stakeholder info
	 */
	@Override
	public void setMiddleName(String middleName) {
		model.setMiddleName(middleName);
	}

	/**
	 * Sets the modified date of this farmer stakeholder info.
	 *
	 * @param modifiedDate the modified date of this farmer stakeholder info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this farmer stakeholder info.
	 *
	 * @param primaryKey the primary key of this farmer stakeholder info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the residential district of this farmer stakeholder info.
	 *
	 * @param residentialDistrict the residential district of this farmer stakeholder info
	 */
	@Override
	public void setResidentialDistrict(String residentialDistrict) {
		model.setResidentialDistrict(residentialDistrict);
	}

	/**
	 * Sets the residential parish of this farmer stakeholder info.
	 *
	 * @param residentialParish the residential parish of this farmer stakeholder info
	 */
	@Override
	public void setResidentialParish(String residentialParish) {
		model.setResidentialParish(residentialParish);
	}

	/**
	 * Sets the residential post office of this farmer stakeholder info.
	 *
	 * @param residentialPostOffice the residential post office of this farmer stakeholder info
	 */
	@Override
	public void setResidentialPostOffice(String residentialPostOffice) {
		model.setResidentialPostOffice(residentialPostOffice);
	}

	/**
	 * Sets the residential street name of this farmer stakeholder info.
	 *
	 * @param residentialStreetName the residential street name of this farmer stakeholder info
	 */
	@Override
	public void setResidentialStreetName(String residentialStreetName) {
		model.setResidentialStreetName(residentialStreetName);
	}

	/**
	 * Sets the residentialtelephone number of this farmer stakeholder info.
	 *
	 * @param residentialtelephoneNumber the residentialtelephone number of this farmer stakeholder info
	 */
	@Override
	public void setResidentialtelephoneNumber(
		String residentialtelephoneNumber) {

		model.setResidentialtelephoneNumber(residentialtelephoneNumber);
	}

	/**
	 * Sets the taxpayer registration number of this farmer stakeholder info.
	 *
	 * @param taxpayerRegistrationNumber the taxpayer registration number of this farmer stakeholder info
	 */
	@Override
	public void setTaxpayerRegistrationNumber(
		String taxpayerRegistrationNumber) {

		model.setTaxpayerRegistrationNumber(taxpayerRegistrationNumber);
	}

	/**
	 * Sets the user ID of this farmer stakeholder info.
	 *
	 * @param userId the user ID of this farmer stakeholder info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this farmer stakeholder info.
	 *
	 * @param userName the user name of this farmer stakeholder info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this farmer stakeholder info.
	 *
	 * @param userUuid the user uuid of this farmer stakeholder info
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected FarmerStakeholderInfoWrapper wrap(
		FarmerStakeholderInfo farmerStakeholderInfo) {

		return new FarmerStakeholderInfoWrapper(farmerStakeholderInfo);
	}

}