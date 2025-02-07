/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AgricultueFarmer}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultueFarmer
 * @generated
 */
public class AgricultueFarmerWrapper
	extends BaseModelWrapper<AgricultueFarmer>
	implements AgricultueFarmer, ModelWrapper<AgricultueFarmer> {

	public AgricultueFarmerWrapper(AgricultueFarmer agricultueFarmer) {
		super(agricultueFarmer);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("agricultueFarmerId", getAgricultueFarmerId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("farmerDetail", getFarmerDetail());
		attributes.put("nameOfApplicant", getNameOfApplicant());
		attributes.put("nameOfFarm", getNameOfFarm());
		attributes.put("nameOfProprietor", getNameOfProprietor());
		attributes.put("parishAddress", getParishAddress());
		attributes.put("localAddress", getLocalAddress());
		attributes.put(
			"taxpayerRegistrationNumber", getTaxpayerRegistrationNumber());
		attributes.put(
			"farmerRegistrationNumber", getFarmerRegistrationNumber());
		attributes.put("dateOfIncorporation", getDateOfIncorporation());
		attributes.put("telephoneNumber", getTelephoneNumber());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put(
			"agricultureApplicationId", getAgricultureApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long agricultueFarmerId = (Long)attributes.get("agricultueFarmerId");

		if (agricultueFarmerId != null) {
			setAgricultueFarmerId(agricultueFarmerId);
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

		String farmerDetail = (String)attributes.get("farmerDetail");

		if (farmerDetail != null) {
			setFarmerDetail(farmerDetail);
		}

		String nameOfApplicant = (String)attributes.get("nameOfApplicant");

		if (nameOfApplicant != null) {
			setNameOfApplicant(nameOfApplicant);
		}

		String nameOfFarm = (String)attributes.get("nameOfFarm");

		if (nameOfFarm != null) {
			setNameOfFarm(nameOfFarm);
		}

		String nameOfProprietor = (String)attributes.get("nameOfProprietor");

		if (nameOfProprietor != null) {
			setNameOfProprietor(nameOfProprietor);
		}

		String parishAddress = (String)attributes.get("parishAddress");

		if (parishAddress != null) {
			setParishAddress(parishAddress);
		}

		String localAddress = (String)attributes.get("localAddress");

		if (localAddress != null) {
			setLocalAddress(localAddress);
		}

		String taxpayerRegistrationNumber = (String)attributes.get(
			"taxpayerRegistrationNumber");

		if (taxpayerRegistrationNumber != null) {
			setTaxpayerRegistrationNumber(taxpayerRegistrationNumber);
		}

		String farmerRegistrationNumber = (String)attributes.get(
			"farmerRegistrationNumber");

		if (farmerRegistrationNumber != null) {
			setFarmerRegistrationNumber(farmerRegistrationNumber);
		}

		Date dateOfIncorporation = (Date)attributes.get("dateOfIncorporation");

		if (dateOfIncorporation != null) {
			setDateOfIncorporation(dateOfIncorporation);
		}

		String telephoneNumber = (String)attributes.get("telephoneNumber");

		if (telephoneNumber != null) {
			setTelephoneNumber(telephoneNumber);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		Long agricultureApplicationId = (Long)attributes.get(
			"agricultureApplicationId");

		if (agricultureApplicationId != null) {
			setAgricultureApplicationId(agricultureApplicationId);
		}
	}

	@Override
	public AgricultueFarmer cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the agricultue farmer ID of this agricultue farmer.
	 *
	 * @return the agricultue farmer ID of this agricultue farmer
	 */
	@Override
	public long getAgricultueFarmerId() {
		return model.getAgricultueFarmerId();
	}

	/**
	 * Returns the agriculture application ID of this agricultue farmer.
	 *
	 * @return the agriculture application ID of this agricultue farmer
	 */
	@Override
	public long getAgricultureApplicationId() {
		return model.getAgricultureApplicationId();
	}

	/**
	 * Returns the company ID of this agricultue farmer.
	 *
	 * @return the company ID of this agricultue farmer
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this agricultue farmer.
	 *
	 * @return the create date of this agricultue farmer
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of incorporation of this agricultue farmer.
	 *
	 * @return the date of incorporation of this agricultue farmer
	 */
	@Override
	public Date getDateOfIncorporation() {
		return model.getDateOfIncorporation();
	}

	/**
	 * Returns the email address of this agricultue farmer.
	 *
	 * @return the email address of this agricultue farmer
	 */
	@Override
	public String getEmailAddress() {
		return model.getEmailAddress();
	}

	/**
	 * Returns the farmer detail of this agricultue farmer.
	 *
	 * @return the farmer detail of this agricultue farmer
	 */
	@Override
	public String getFarmerDetail() {
		return model.getFarmerDetail();
	}

	/**
	 * Returns the farmer registration number of this agricultue farmer.
	 *
	 * @return the farmer registration number of this agricultue farmer
	 */
	@Override
	public String getFarmerRegistrationNumber() {
		return model.getFarmerRegistrationNumber();
	}

	/**
	 * Returns the group ID of this agricultue farmer.
	 *
	 * @return the group ID of this agricultue farmer
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the local address of this agricultue farmer.
	 *
	 * @return the local address of this agricultue farmer
	 */
	@Override
	public String getLocalAddress() {
		return model.getLocalAddress();
	}

	/**
	 * Returns the modified date of this agricultue farmer.
	 *
	 * @return the modified date of this agricultue farmer
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of applicant of this agricultue farmer.
	 *
	 * @return the name of applicant of this agricultue farmer
	 */
	@Override
	public String getNameOfApplicant() {
		return model.getNameOfApplicant();
	}

	/**
	 * Returns the name of farm of this agricultue farmer.
	 *
	 * @return the name of farm of this agricultue farmer
	 */
	@Override
	public String getNameOfFarm() {
		return model.getNameOfFarm();
	}

	/**
	 * Returns the name of proprietor of this agricultue farmer.
	 *
	 * @return the name of proprietor of this agricultue farmer
	 */
	@Override
	public String getNameOfProprietor() {
		return model.getNameOfProprietor();
	}

	/**
	 * Returns the parish address of this agricultue farmer.
	 *
	 * @return the parish address of this agricultue farmer
	 */
	@Override
	public String getParishAddress() {
		return model.getParishAddress();
	}

	/**
	 * Returns the primary key of this agricultue farmer.
	 *
	 * @return the primary key of this agricultue farmer
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the taxpayer registration number of this agricultue farmer.
	 *
	 * @return the taxpayer registration number of this agricultue farmer
	 */
	@Override
	public String getTaxpayerRegistrationNumber() {
		return model.getTaxpayerRegistrationNumber();
	}

	/**
	 * Returns the telephone number of this agricultue farmer.
	 *
	 * @return the telephone number of this agricultue farmer
	 */
	@Override
	public String getTelephoneNumber() {
		return model.getTelephoneNumber();
	}

	/**
	 * Returns the user ID of this agricultue farmer.
	 *
	 * @return the user ID of this agricultue farmer
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this agricultue farmer.
	 *
	 * @return the user name of this agricultue farmer
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this agricultue farmer.
	 *
	 * @return the user uuid of this agricultue farmer
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
	 * Sets the agricultue farmer ID of this agricultue farmer.
	 *
	 * @param agricultueFarmerId the agricultue farmer ID of this agricultue farmer
	 */
	@Override
	public void setAgricultueFarmerId(long agricultueFarmerId) {
		model.setAgricultueFarmerId(agricultueFarmerId);
	}

	/**
	 * Sets the agriculture application ID of this agricultue farmer.
	 *
	 * @param agricultureApplicationId the agriculture application ID of this agricultue farmer
	 */
	@Override
	public void setAgricultureApplicationId(long agricultureApplicationId) {
		model.setAgricultureApplicationId(agricultureApplicationId);
	}

	/**
	 * Sets the company ID of this agricultue farmer.
	 *
	 * @param companyId the company ID of this agricultue farmer
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this agricultue farmer.
	 *
	 * @param createDate the create date of this agricultue farmer
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of incorporation of this agricultue farmer.
	 *
	 * @param dateOfIncorporation the date of incorporation of this agricultue farmer
	 */
	@Override
	public void setDateOfIncorporation(Date dateOfIncorporation) {
		model.setDateOfIncorporation(dateOfIncorporation);
	}

	/**
	 * Sets the email address of this agricultue farmer.
	 *
	 * @param emailAddress the email address of this agricultue farmer
	 */
	@Override
	public void setEmailAddress(String emailAddress) {
		model.setEmailAddress(emailAddress);
	}

	/**
	 * Sets the farmer detail of this agricultue farmer.
	 *
	 * @param farmerDetail the farmer detail of this agricultue farmer
	 */
	@Override
	public void setFarmerDetail(String farmerDetail) {
		model.setFarmerDetail(farmerDetail);
	}

	/**
	 * Sets the farmer registration number of this agricultue farmer.
	 *
	 * @param farmerRegistrationNumber the farmer registration number of this agricultue farmer
	 */
	@Override
	public void setFarmerRegistrationNumber(String farmerRegistrationNumber) {
		model.setFarmerRegistrationNumber(farmerRegistrationNumber);
	}

	/**
	 * Sets the group ID of this agricultue farmer.
	 *
	 * @param groupId the group ID of this agricultue farmer
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the local address of this agricultue farmer.
	 *
	 * @param localAddress the local address of this agricultue farmer
	 */
	@Override
	public void setLocalAddress(String localAddress) {
		model.setLocalAddress(localAddress);
	}

	/**
	 * Sets the modified date of this agricultue farmer.
	 *
	 * @param modifiedDate the modified date of this agricultue farmer
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of applicant of this agricultue farmer.
	 *
	 * @param nameOfApplicant the name of applicant of this agricultue farmer
	 */
	@Override
	public void setNameOfApplicant(String nameOfApplicant) {
		model.setNameOfApplicant(nameOfApplicant);
	}

	/**
	 * Sets the name of farm of this agricultue farmer.
	 *
	 * @param nameOfFarm the name of farm of this agricultue farmer
	 */
	@Override
	public void setNameOfFarm(String nameOfFarm) {
		model.setNameOfFarm(nameOfFarm);
	}

	/**
	 * Sets the name of proprietor of this agricultue farmer.
	 *
	 * @param nameOfProprietor the name of proprietor of this agricultue farmer
	 */
	@Override
	public void setNameOfProprietor(String nameOfProprietor) {
		model.setNameOfProprietor(nameOfProprietor);
	}

	/**
	 * Sets the parish address of this agricultue farmer.
	 *
	 * @param parishAddress the parish address of this agricultue farmer
	 */
	@Override
	public void setParishAddress(String parishAddress) {
		model.setParishAddress(parishAddress);
	}

	/**
	 * Sets the primary key of this agricultue farmer.
	 *
	 * @param primaryKey the primary key of this agricultue farmer
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the taxpayer registration number of this agricultue farmer.
	 *
	 * @param taxpayerRegistrationNumber the taxpayer registration number of this agricultue farmer
	 */
	@Override
	public void setTaxpayerRegistrationNumber(
		String taxpayerRegistrationNumber) {

		model.setTaxpayerRegistrationNumber(taxpayerRegistrationNumber);
	}

	/**
	 * Sets the telephone number of this agricultue farmer.
	 *
	 * @param telephoneNumber the telephone number of this agricultue farmer
	 */
	@Override
	public void setTelephoneNumber(String telephoneNumber) {
		model.setTelephoneNumber(telephoneNumber);
	}

	/**
	 * Sets the user ID of this agricultue farmer.
	 *
	 * @param userId the user ID of this agricultue farmer
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this agricultue farmer.
	 *
	 * @param userName the user name of this agricultue farmer
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this agricultue farmer.
	 *
	 * @param userUuid the user uuid of this agricultue farmer
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
	protected AgricultueFarmerWrapper wrap(AgricultueFarmer agricultueFarmer) {
		return new AgricultueFarmerWrapper(agricultueFarmer);
	}

}