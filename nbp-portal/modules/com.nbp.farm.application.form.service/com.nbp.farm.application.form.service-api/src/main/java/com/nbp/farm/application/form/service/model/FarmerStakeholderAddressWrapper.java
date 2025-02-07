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
 * This class is a wrapper for {@link FarmerStakeholderAddress}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerStakeholderAddress
 * @generated
 */
public class FarmerStakeholderAddressWrapper
	extends BaseModelWrapper<FarmerStakeholderAddress>
	implements FarmerStakeholderAddress,
			   ModelWrapper<FarmerStakeholderAddress> {

	public FarmerStakeholderAddressWrapper(
		FarmerStakeholderAddress farmerStakeholderAddress) {

		super(farmerStakeholderAddress);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"farmerStakeholderAddressId", getFarmerStakeholderAddressId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("addressType", getAddressType());
		attributes.put("streetName", getStreetName());
		attributes.put("district", getDistrict());
		attributes.put("postoffice", getPostoffice());
		attributes.put("parish", getParish());
		attributes.put("telephoneNumber", getTelephoneNumber());
		attributes.put("applicationNumber", getApplicationNumber());
		attributes.put("farmerApplicationId", getFarmerApplicationId());
		attributes.put("stakeholderAddressId", getStakeholderAddressId());
		attributes.put("farmerStakeholderInfoId", getFarmerStakeholderInfoId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long farmerStakeholderAddressId = (Long)attributes.get(
			"farmerStakeholderAddressId");

		if (farmerStakeholderAddressId != null) {
			setFarmerStakeholderAddressId(farmerStakeholderAddressId);
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

		String addressType = (String)attributes.get("addressType");

		if (addressType != null) {
			setAddressType(addressType);
		}

		String streetName = (String)attributes.get("streetName");

		if (streetName != null) {
			setStreetName(streetName);
		}

		String district = (String)attributes.get("district");

		if (district != null) {
			setDistrict(district);
		}

		String postoffice = (String)attributes.get("postoffice");

		if (postoffice != null) {
			setPostoffice(postoffice);
		}

		String parish = (String)attributes.get("parish");

		if (parish != null) {
			setParish(parish);
		}

		String telephoneNumber = (String)attributes.get("telephoneNumber");

		if (telephoneNumber != null) {
			setTelephoneNumber(telephoneNumber);
		}

		String applicationNumber = (String)attributes.get("applicationNumber");

		if (applicationNumber != null) {
			setApplicationNumber(applicationNumber);
		}

		Long farmerApplicationId = (Long)attributes.get("farmerApplicationId");

		if (farmerApplicationId != null) {
			setFarmerApplicationId(farmerApplicationId);
		}

		Long stakeholderAddressId = (Long)attributes.get(
			"stakeholderAddressId");

		if (stakeholderAddressId != null) {
			setStakeholderAddressId(stakeholderAddressId);
		}

		Long farmerStakeholderInfoId = (Long)attributes.get(
			"farmerStakeholderInfoId");

		if (farmerStakeholderInfoId != null) {
			setFarmerStakeholderInfoId(farmerStakeholderInfoId);
		}
	}

	@Override
	public FarmerStakeholderAddress cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address type of this farmer stakeholder address.
	 *
	 * @return the address type of this farmer stakeholder address
	 */
	@Override
	public String getAddressType() {
		return model.getAddressType();
	}

	/**
	 * Returns the application number of this farmer stakeholder address.
	 *
	 * @return the application number of this farmer stakeholder address
	 */
	@Override
	public String getApplicationNumber() {
		return model.getApplicationNumber();
	}

	/**
	 * Returns the company ID of this farmer stakeholder address.
	 *
	 * @return the company ID of this farmer stakeholder address
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this farmer stakeholder address.
	 *
	 * @return the create date of this farmer stakeholder address
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the district of this farmer stakeholder address.
	 *
	 * @return the district of this farmer stakeholder address
	 */
	@Override
	public String getDistrict() {
		return model.getDistrict();
	}

	/**
	 * Returns the farmer application ID of this farmer stakeholder address.
	 *
	 * @return the farmer application ID of this farmer stakeholder address
	 */
	@Override
	public long getFarmerApplicationId() {
		return model.getFarmerApplicationId();
	}

	/**
	 * Returns the farmer stakeholder address ID of this farmer stakeholder address.
	 *
	 * @return the farmer stakeholder address ID of this farmer stakeholder address
	 */
	@Override
	public long getFarmerStakeholderAddressId() {
		return model.getFarmerStakeholderAddressId();
	}

	/**
	 * Returns the farmer stakeholder info ID of this farmer stakeholder address.
	 *
	 * @return the farmer stakeholder info ID of this farmer stakeholder address
	 */
	@Override
	public long getFarmerStakeholderInfoId() {
		return model.getFarmerStakeholderInfoId();
	}

	/**
	 * Returns the group ID of this farmer stakeholder address.
	 *
	 * @return the group ID of this farmer stakeholder address
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this farmer stakeholder address.
	 *
	 * @return the modified date of this farmer stakeholder address
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the parish of this farmer stakeholder address.
	 *
	 * @return the parish of this farmer stakeholder address
	 */
	@Override
	public String getParish() {
		return model.getParish();
	}

	/**
	 * Returns the postoffice of this farmer stakeholder address.
	 *
	 * @return the postoffice of this farmer stakeholder address
	 */
	@Override
	public String getPostoffice() {
		return model.getPostoffice();
	}

	/**
	 * Returns the primary key of this farmer stakeholder address.
	 *
	 * @return the primary key of this farmer stakeholder address
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the stakeholder address ID of this farmer stakeholder address.
	 *
	 * @return the stakeholder address ID of this farmer stakeholder address
	 */
	@Override
	public long getStakeholderAddressId() {
		return model.getStakeholderAddressId();
	}

	/**
	 * Returns the street name of this farmer stakeholder address.
	 *
	 * @return the street name of this farmer stakeholder address
	 */
	@Override
	public String getStreetName() {
		return model.getStreetName();
	}

	/**
	 * Returns the telephone number of this farmer stakeholder address.
	 *
	 * @return the telephone number of this farmer stakeholder address
	 */
	@Override
	public String getTelephoneNumber() {
		return model.getTelephoneNumber();
	}

	/**
	 * Returns the user ID of this farmer stakeholder address.
	 *
	 * @return the user ID of this farmer stakeholder address
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this farmer stakeholder address.
	 *
	 * @return the user name of this farmer stakeholder address
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this farmer stakeholder address.
	 *
	 * @return the user uuid of this farmer stakeholder address
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
	 * Sets the address type of this farmer stakeholder address.
	 *
	 * @param addressType the address type of this farmer stakeholder address
	 */
	@Override
	public void setAddressType(String addressType) {
		model.setAddressType(addressType);
	}

	/**
	 * Sets the application number of this farmer stakeholder address.
	 *
	 * @param applicationNumber the application number of this farmer stakeholder address
	 */
	@Override
	public void setApplicationNumber(String applicationNumber) {
		model.setApplicationNumber(applicationNumber);
	}

	/**
	 * Sets the company ID of this farmer stakeholder address.
	 *
	 * @param companyId the company ID of this farmer stakeholder address
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this farmer stakeholder address.
	 *
	 * @param createDate the create date of this farmer stakeholder address
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the district of this farmer stakeholder address.
	 *
	 * @param district the district of this farmer stakeholder address
	 */
	@Override
	public void setDistrict(String district) {
		model.setDistrict(district);
	}

	/**
	 * Sets the farmer application ID of this farmer stakeholder address.
	 *
	 * @param farmerApplicationId the farmer application ID of this farmer stakeholder address
	 */
	@Override
	public void setFarmerApplicationId(long farmerApplicationId) {
		model.setFarmerApplicationId(farmerApplicationId);
	}

	/**
	 * Sets the farmer stakeholder address ID of this farmer stakeholder address.
	 *
	 * @param farmerStakeholderAddressId the farmer stakeholder address ID of this farmer stakeholder address
	 */
	@Override
	public void setFarmerStakeholderAddressId(long farmerStakeholderAddressId) {
		model.setFarmerStakeholderAddressId(farmerStakeholderAddressId);
	}

	/**
	 * Sets the farmer stakeholder info ID of this farmer stakeholder address.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID of this farmer stakeholder address
	 */
	@Override
	public void setFarmerStakeholderInfoId(long farmerStakeholderInfoId) {
		model.setFarmerStakeholderInfoId(farmerStakeholderInfoId);
	}

	/**
	 * Sets the group ID of this farmer stakeholder address.
	 *
	 * @param groupId the group ID of this farmer stakeholder address
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this farmer stakeholder address.
	 *
	 * @param modifiedDate the modified date of this farmer stakeholder address
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the parish of this farmer stakeholder address.
	 *
	 * @param parish the parish of this farmer stakeholder address
	 */
	@Override
	public void setParish(String parish) {
		model.setParish(parish);
	}

	/**
	 * Sets the postoffice of this farmer stakeholder address.
	 *
	 * @param postoffice the postoffice of this farmer stakeholder address
	 */
	@Override
	public void setPostoffice(String postoffice) {
		model.setPostoffice(postoffice);
	}

	/**
	 * Sets the primary key of this farmer stakeholder address.
	 *
	 * @param primaryKey the primary key of this farmer stakeholder address
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the stakeholder address ID of this farmer stakeholder address.
	 *
	 * @param stakeholderAddressId the stakeholder address ID of this farmer stakeholder address
	 */
	@Override
	public void setStakeholderAddressId(long stakeholderAddressId) {
		model.setStakeholderAddressId(stakeholderAddressId);
	}

	/**
	 * Sets the street name of this farmer stakeholder address.
	 *
	 * @param streetName the street name of this farmer stakeholder address
	 */
	@Override
	public void setStreetName(String streetName) {
		model.setStreetName(streetName);
	}

	/**
	 * Sets the telephone number of this farmer stakeholder address.
	 *
	 * @param telephoneNumber the telephone number of this farmer stakeholder address
	 */
	@Override
	public void setTelephoneNumber(String telephoneNumber) {
		model.setTelephoneNumber(telephoneNumber);
	}

	/**
	 * Sets the user ID of this farmer stakeholder address.
	 *
	 * @param userId the user ID of this farmer stakeholder address
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this farmer stakeholder address.
	 *
	 * @param userName the user name of this farmer stakeholder address
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this farmer stakeholder address.
	 *
	 * @param userUuid the user uuid of this farmer stakeholder address
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected FarmerStakeholderAddressWrapper wrap(
		FarmerStakeholderAddress farmerStakeholderAddress) {

		return new FarmerStakeholderAddressWrapper(farmerStakeholderAddress);
	}

}