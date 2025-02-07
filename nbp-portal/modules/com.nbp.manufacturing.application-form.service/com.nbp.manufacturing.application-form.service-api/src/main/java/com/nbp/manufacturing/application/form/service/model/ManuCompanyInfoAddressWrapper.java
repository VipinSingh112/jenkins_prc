/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ManuCompanyInfoAddress}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuCompanyInfoAddress
 * @generated
 */
public class ManuCompanyInfoAddressWrapper
	extends BaseModelWrapper<ManuCompanyInfoAddress>
	implements ManuCompanyInfoAddress, ModelWrapper<ManuCompanyInfoAddress> {

	public ManuCompanyInfoAddressWrapper(
		ManuCompanyInfoAddress manuCompanyInfoAddress) {

		super(manuCompanyInfoAddress);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"manuCompanyInfoAddressId", getManuCompanyInfoAddressId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("factoryAddress", getFactoryAddress());
		attributes.put("telephoneNumber", getTelephoneNumber());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("companyWebsite", getCompanyWebsite());
		attributes.put("parish", getParish());
		attributes.put("counter", getCounter());
		attributes.put(
			"manufacturingApplicationId", getManufacturingApplicationId());
		attributes.put("manuCompanyInfoId", getManuCompanyInfoId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long manuCompanyInfoAddressId = (Long)attributes.get(
			"manuCompanyInfoAddressId");

		if (manuCompanyInfoAddressId != null) {
			setManuCompanyInfoAddressId(manuCompanyInfoAddressId);
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

		String factoryAddress = (String)attributes.get("factoryAddress");

		if (factoryAddress != null) {
			setFactoryAddress(factoryAddress);
		}

		String telephoneNumber = (String)attributes.get("telephoneNumber");

		if (telephoneNumber != null) {
			setTelephoneNumber(telephoneNumber);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		String companyWebsite = (String)attributes.get("companyWebsite");

		if (companyWebsite != null) {
			setCompanyWebsite(companyWebsite);
		}

		String parish = (String)attributes.get("parish");

		if (parish != null) {
			setParish(parish);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long manufacturingApplicationId = (Long)attributes.get(
			"manufacturingApplicationId");

		if (manufacturingApplicationId != null) {
			setManufacturingApplicationId(manufacturingApplicationId);
		}

		Long manuCompanyInfoId = (Long)attributes.get("manuCompanyInfoId");

		if (manuCompanyInfoId != null) {
			setManuCompanyInfoId(manuCompanyInfoId);
		}
	}

	@Override
	public ManuCompanyInfoAddress cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this manu company info address.
	 *
	 * @return the company ID of this manu company info address
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company website of this manu company info address.
	 *
	 * @return the company website of this manu company info address
	 */
	@Override
	public String getCompanyWebsite() {
		return model.getCompanyWebsite();
	}

	/**
	 * Returns the counter of this manu company info address.
	 *
	 * @return the counter of this manu company info address
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this manu company info address.
	 *
	 * @return the create date of this manu company info address
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email address of this manu company info address.
	 *
	 * @return the email address of this manu company info address
	 */
	@Override
	public String getEmailAddress() {
		return model.getEmailAddress();
	}

	/**
	 * Returns the factory address of this manu company info address.
	 *
	 * @return the factory address of this manu company info address
	 */
	@Override
	public String getFactoryAddress() {
		return model.getFactoryAddress();
	}

	/**
	 * Returns the group ID of this manu company info address.
	 *
	 * @return the group ID of this manu company info address
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the manu company info address ID of this manu company info address.
	 *
	 * @return the manu company info address ID of this manu company info address
	 */
	@Override
	public long getManuCompanyInfoAddressId() {
		return model.getManuCompanyInfoAddressId();
	}

	/**
	 * Returns the manu company info ID of this manu company info address.
	 *
	 * @return the manu company info ID of this manu company info address
	 */
	@Override
	public long getManuCompanyInfoId() {
		return model.getManuCompanyInfoId();
	}

	/**
	 * Returns the manufacturing application ID of this manu company info address.
	 *
	 * @return the manufacturing application ID of this manu company info address
	 */
	@Override
	public long getManufacturingApplicationId() {
		return model.getManufacturingApplicationId();
	}

	/**
	 * Returns the modified date of this manu company info address.
	 *
	 * @return the modified date of this manu company info address
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the parish of this manu company info address.
	 *
	 * @return the parish of this manu company info address
	 */
	@Override
	public String getParish() {
		return model.getParish();
	}

	/**
	 * Returns the primary key of this manu company info address.
	 *
	 * @return the primary key of this manu company info address
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the telephone number of this manu company info address.
	 *
	 * @return the telephone number of this manu company info address
	 */
	@Override
	public String getTelephoneNumber() {
		return model.getTelephoneNumber();
	}

	/**
	 * Returns the user ID of this manu company info address.
	 *
	 * @return the user ID of this manu company info address
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this manu company info address.
	 *
	 * @return the user name of this manu company info address
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this manu company info address.
	 *
	 * @return the user uuid of this manu company info address
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
	 * Sets the company ID of this manu company info address.
	 *
	 * @param companyId the company ID of this manu company info address
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company website of this manu company info address.
	 *
	 * @param companyWebsite the company website of this manu company info address
	 */
	@Override
	public void setCompanyWebsite(String companyWebsite) {
		model.setCompanyWebsite(companyWebsite);
	}

	/**
	 * Sets the counter of this manu company info address.
	 *
	 * @param counter the counter of this manu company info address
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this manu company info address.
	 *
	 * @param createDate the create date of this manu company info address
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email address of this manu company info address.
	 *
	 * @param emailAddress the email address of this manu company info address
	 */
	@Override
	public void setEmailAddress(String emailAddress) {
		model.setEmailAddress(emailAddress);
	}

	/**
	 * Sets the factory address of this manu company info address.
	 *
	 * @param factoryAddress the factory address of this manu company info address
	 */
	@Override
	public void setFactoryAddress(String factoryAddress) {
		model.setFactoryAddress(factoryAddress);
	}

	/**
	 * Sets the group ID of this manu company info address.
	 *
	 * @param groupId the group ID of this manu company info address
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the manu company info address ID of this manu company info address.
	 *
	 * @param manuCompanyInfoAddressId the manu company info address ID of this manu company info address
	 */
	@Override
	public void setManuCompanyInfoAddressId(long manuCompanyInfoAddressId) {
		model.setManuCompanyInfoAddressId(manuCompanyInfoAddressId);
	}

	/**
	 * Sets the manu company info ID of this manu company info address.
	 *
	 * @param manuCompanyInfoId the manu company info ID of this manu company info address
	 */
	@Override
	public void setManuCompanyInfoId(long manuCompanyInfoId) {
		model.setManuCompanyInfoId(manuCompanyInfoId);
	}

	/**
	 * Sets the manufacturing application ID of this manu company info address.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID of this manu company info address
	 */
	@Override
	public void setManufacturingApplicationId(long manufacturingApplicationId) {
		model.setManufacturingApplicationId(manufacturingApplicationId);
	}

	/**
	 * Sets the modified date of this manu company info address.
	 *
	 * @param modifiedDate the modified date of this manu company info address
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the parish of this manu company info address.
	 *
	 * @param parish the parish of this manu company info address
	 */
	@Override
	public void setParish(String parish) {
		model.setParish(parish);
	}

	/**
	 * Sets the primary key of this manu company info address.
	 *
	 * @param primaryKey the primary key of this manu company info address
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the telephone number of this manu company info address.
	 *
	 * @param telephoneNumber the telephone number of this manu company info address
	 */
	@Override
	public void setTelephoneNumber(String telephoneNumber) {
		model.setTelephoneNumber(telephoneNumber);
	}

	/**
	 * Sets the user ID of this manu company info address.
	 *
	 * @param userId the user ID of this manu company info address
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this manu company info address.
	 *
	 * @param userName the user name of this manu company info address
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this manu company info address.
	 *
	 * @param userUuid the user uuid of this manu company info address
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
	protected ManuCompanyInfoAddressWrapper wrap(
		ManuCompanyInfoAddress manuCompanyInfoAddress) {

		return new ManuCompanyInfoAddressWrapper(manuCompanyInfoAddress);
	}

}