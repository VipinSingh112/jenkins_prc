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
 * This class is a wrapper for {@link NcbjBusinessDetailAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjBusinessDetailAdd
 * @generated
 */
public class NcbjBusinessDetailAddWrapper
	extends BaseModelWrapper<NcbjBusinessDetailAdd>
	implements ModelWrapper<NcbjBusinessDetailAdd>, NcbjBusinessDetailAdd {

	public NcbjBusinessDetailAddWrapper(
		NcbjBusinessDetailAdd ncbjBusinessDetailAdd) {

		super(ncbjBusinessDetailAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ncbjBusinessDetailAddId", getNcbjBusinessDetailAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("numberAndTimeOfShift", getNumberAndTimeOfShift());
		attributes.put("typeOfProduct", getTypeOfProduct());
		attributes.put("businessAddress", getBusinessAddress());
		attributes.put("headOffices", getHeadOffices());
		attributes.put("noOfFullTimeEmployees", getNoOfFullTimeEmployees());
		attributes.put("noOfPartTimeEmployees", getNoOfPartTimeEmployees());
		attributes.put("noOfContractors", getNoOfContractors());
		attributes.put("noOfContractedWorkers", getNoOfContractedWorkers());
		attributes.put("counter", getCounter());
		attributes.put("ncbjApplicationId", getNcbjApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ncbjBusinessDetailAddId = (Long)attributes.get(
			"ncbjBusinessDetailAddId");

		if (ncbjBusinessDetailAddId != null) {
			setNcbjBusinessDetailAddId(ncbjBusinessDetailAddId);
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

		String numberAndTimeOfShift = (String)attributes.get(
			"numberAndTimeOfShift");

		if (numberAndTimeOfShift != null) {
			setNumberAndTimeOfShift(numberAndTimeOfShift);
		}

		String typeOfProduct = (String)attributes.get("typeOfProduct");

		if (typeOfProduct != null) {
			setTypeOfProduct(typeOfProduct);
		}

		String businessAddress = (String)attributes.get("businessAddress");

		if (businessAddress != null) {
			setBusinessAddress(businessAddress);
		}

		String headOffices = (String)attributes.get("headOffices");

		if (headOffices != null) {
			setHeadOffices(headOffices);
		}

		String noOfFullTimeEmployees = (String)attributes.get(
			"noOfFullTimeEmployees");

		if (noOfFullTimeEmployees != null) {
			setNoOfFullTimeEmployees(noOfFullTimeEmployees);
		}

		String noOfPartTimeEmployees = (String)attributes.get(
			"noOfPartTimeEmployees");

		if (noOfPartTimeEmployees != null) {
			setNoOfPartTimeEmployees(noOfPartTimeEmployees);
		}

		String noOfContractors = (String)attributes.get("noOfContractors");

		if (noOfContractors != null) {
			setNoOfContractors(noOfContractors);
		}

		String noOfContractedWorkers = (String)attributes.get(
			"noOfContractedWorkers");

		if (noOfContractedWorkers != null) {
			setNoOfContractedWorkers(noOfContractedWorkers);
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
	public NcbjBusinessDetailAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the business address of this ncbj business detail add.
	 *
	 * @return the business address of this ncbj business detail add
	 */
	@Override
	public String getBusinessAddress() {
		return model.getBusinessAddress();
	}

	/**
	 * Returns the company ID of this ncbj business detail add.
	 *
	 * @return the company ID of this ncbj business detail add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this ncbj business detail add.
	 *
	 * @return the counter of this ncbj business detail add
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this ncbj business detail add.
	 *
	 * @return the create date of this ncbj business detail add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this ncbj business detail add.
	 *
	 * @return the group ID of this ncbj business detail add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the head offices of this ncbj business detail add.
	 *
	 * @return the head offices of this ncbj business detail add
	 */
	@Override
	public String getHeadOffices() {
		return model.getHeadOffices();
	}

	/**
	 * Returns the modified date of this ncbj business detail add.
	 *
	 * @return the modified date of this ncbj business detail add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ncbj application ID of this ncbj business detail add.
	 *
	 * @return the ncbj application ID of this ncbj business detail add
	 */
	@Override
	public long getNcbjApplicationId() {
		return model.getNcbjApplicationId();
	}

	/**
	 * Returns the ncbj business detail add ID of this ncbj business detail add.
	 *
	 * @return the ncbj business detail add ID of this ncbj business detail add
	 */
	@Override
	public long getNcbjBusinessDetailAddId() {
		return model.getNcbjBusinessDetailAddId();
	}

	/**
	 * Returns the no of contracted workers of this ncbj business detail add.
	 *
	 * @return the no of contracted workers of this ncbj business detail add
	 */
	@Override
	public String getNoOfContractedWorkers() {
		return model.getNoOfContractedWorkers();
	}

	/**
	 * Returns the no of contractors of this ncbj business detail add.
	 *
	 * @return the no of contractors of this ncbj business detail add
	 */
	@Override
	public String getNoOfContractors() {
		return model.getNoOfContractors();
	}

	/**
	 * Returns the no of full time employees of this ncbj business detail add.
	 *
	 * @return the no of full time employees of this ncbj business detail add
	 */
	@Override
	public String getNoOfFullTimeEmployees() {
		return model.getNoOfFullTimeEmployees();
	}

	/**
	 * Returns the no of part time employees of this ncbj business detail add.
	 *
	 * @return the no of part time employees of this ncbj business detail add
	 */
	@Override
	public String getNoOfPartTimeEmployees() {
		return model.getNoOfPartTimeEmployees();
	}

	/**
	 * Returns the number and time of shift of this ncbj business detail add.
	 *
	 * @return the number and time of shift of this ncbj business detail add
	 */
	@Override
	public String getNumberAndTimeOfShift() {
		return model.getNumberAndTimeOfShift();
	}

	/**
	 * Returns the primary key of this ncbj business detail add.
	 *
	 * @return the primary key of this ncbj business detail add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the type of product of this ncbj business detail add.
	 *
	 * @return the type of product of this ncbj business detail add
	 */
	@Override
	public String getTypeOfProduct() {
		return model.getTypeOfProduct();
	}

	/**
	 * Returns the user ID of this ncbj business detail add.
	 *
	 * @return the user ID of this ncbj business detail add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ncbj business detail add.
	 *
	 * @return the user name of this ncbj business detail add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ncbj business detail add.
	 *
	 * @return the user uuid of this ncbj business detail add
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
	 * Sets the business address of this ncbj business detail add.
	 *
	 * @param businessAddress the business address of this ncbj business detail add
	 */
	@Override
	public void setBusinessAddress(String businessAddress) {
		model.setBusinessAddress(businessAddress);
	}

	/**
	 * Sets the company ID of this ncbj business detail add.
	 *
	 * @param companyId the company ID of this ncbj business detail add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this ncbj business detail add.
	 *
	 * @param counter the counter of this ncbj business detail add
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this ncbj business detail add.
	 *
	 * @param createDate the create date of this ncbj business detail add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this ncbj business detail add.
	 *
	 * @param groupId the group ID of this ncbj business detail add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the head offices of this ncbj business detail add.
	 *
	 * @param headOffices the head offices of this ncbj business detail add
	 */
	@Override
	public void setHeadOffices(String headOffices) {
		model.setHeadOffices(headOffices);
	}

	/**
	 * Sets the modified date of this ncbj business detail add.
	 *
	 * @param modifiedDate the modified date of this ncbj business detail add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ncbj application ID of this ncbj business detail add.
	 *
	 * @param ncbjApplicationId the ncbj application ID of this ncbj business detail add
	 */
	@Override
	public void setNcbjApplicationId(long ncbjApplicationId) {
		model.setNcbjApplicationId(ncbjApplicationId);
	}

	/**
	 * Sets the ncbj business detail add ID of this ncbj business detail add.
	 *
	 * @param ncbjBusinessDetailAddId the ncbj business detail add ID of this ncbj business detail add
	 */
	@Override
	public void setNcbjBusinessDetailAddId(long ncbjBusinessDetailAddId) {
		model.setNcbjBusinessDetailAddId(ncbjBusinessDetailAddId);
	}

	/**
	 * Sets the no of contracted workers of this ncbj business detail add.
	 *
	 * @param noOfContractedWorkers the no of contracted workers of this ncbj business detail add
	 */
	@Override
	public void setNoOfContractedWorkers(String noOfContractedWorkers) {
		model.setNoOfContractedWorkers(noOfContractedWorkers);
	}

	/**
	 * Sets the no of contractors of this ncbj business detail add.
	 *
	 * @param noOfContractors the no of contractors of this ncbj business detail add
	 */
	@Override
	public void setNoOfContractors(String noOfContractors) {
		model.setNoOfContractors(noOfContractors);
	}

	/**
	 * Sets the no of full time employees of this ncbj business detail add.
	 *
	 * @param noOfFullTimeEmployees the no of full time employees of this ncbj business detail add
	 */
	@Override
	public void setNoOfFullTimeEmployees(String noOfFullTimeEmployees) {
		model.setNoOfFullTimeEmployees(noOfFullTimeEmployees);
	}

	/**
	 * Sets the no of part time employees of this ncbj business detail add.
	 *
	 * @param noOfPartTimeEmployees the no of part time employees of this ncbj business detail add
	 */
	@Override
	public void setNoOfPartTimeEmployees(String noOfPartTimeEmployees) {
		model.setNoOfPartTimeEmployees(noOfPartTimeEmployees);
	}

	/**
	 * Sets the number and time of shift of this ncbj business detail add.
	 *
	 * @param numberAndTimeOfShift the number and time of shift of this ncbj business detail add
	 */
	@Override
	public void setNumberAndTimeOfShift(String numberAndTimeOfShift) {
		model.setNumberAndTimeOfShift(numberAndTimeOfShift);
	}

	/**
	 * Sets the primary key of this ncbj business detail add.
	 *
	 * @param primaryKey the primary key of this ncbj business detail add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the type of product of this ncbj business detail add.
	 *
	 * @param typeOfProduct the type of product of this ncbj business detail add
	 */
	@Override
	public void setTypeOfProduct(String typeOfProduct) {
		model.setTypeOfProduct(typeOfProduct);
	}

	/**
	 * Sets the user ID of this ncbj business detail add.
	 *
	 * @param userId the user ID of this ncbj business detail add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ncbj business detail add.
	 *
	 * @param userName the user name of this ncbj business detail add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ncbj business detail add.
	 *
	 * @param userUuid the user uuid of this ncbj business detail add
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
	protected NcbjBusinessDetailAddWrapper wrap(
		NcbjBusinessDetailAdd ncbjBusinessDetailAdd) {

		return new NcbjBusinessDetailAddWrapper(ncbjBusinessDetailAdd);
	}

}