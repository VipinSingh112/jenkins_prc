/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TourismBonaAttractionFormFirstAddress}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAttractionFormFirstAddress
 * @generated
 */
public class TourismBonaAttractionFormFirstAddressWrapper
	extends BaseModelWrapper<TourismBonaAttractionFormFirstAddress>
	implements ModelWrapper<TourismBonaAttractionFormFirstAddress>,
			   TourismBonaAttractionFormFirstAddress {

	public TourismBonaAttractionFormFirstAddressWrapper(
		TourismBonaAttractionFormFirstAddress
			tourismBonaAttractionFormFirstAddress) {

		super(tourismBonaAttractionFormFirstAddress);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"tourismBonaAttractionFFAOOId", getTourismBonaAttractionFFAOOId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("addressType", getAddressType());
		attributes.put("bonaAttractAddress", getBonaAttractAddress());
		attributes.put(
			"bonaAttractionTelephoneNo", getBonaAttractionTelephoneNo());
		attributes.put("bonaAttractionFaxNumber", getBonaAttractionFaxNumber());
		attributes.put("bonaAttractionEmail", getBonaAttractionEmail());
		attributes.put("tourismApplicationId", getTourismApplicationId());
		attributes.put(
			"tourismBonaAttractFormFirstId",
			getTourismBonaAttractFormFirstId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismBonaAttractionFFAOOId = (Long)attributes.get(
			"tourismBonaAttractionFFAOOId");

		if (tourismBonaAttractionFFAOOId != null) {
			setTourismBonaAttractionFFAOOId(tourismBonaAttractionFFAOOId);
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

		String bonaAttractAddress = (String)attributes.get(
			"bonaAttractAddress");

		if (bonaAttractAddress != null) {
			setBonaAttractAddress(bonaAttractAddress);
		}

		String bonaAttractionTelephoneNo = (String)attributes.get(
			"bonaAttractionTelephoneNo");

		if (bonaAttractionTelephoneNo != null) {
			setBonaAttractionTelephoneNo(bonaAttractionTelephoneNo);
		}

		String bonaAttractionFaxNumber = (String)attributes.get(
			"bonaAttractionFaxNumber");

		if (bonaAttractionFaxNumber != null) {
			setBonaAttractionFaxNumber(bonaAttractionFaxNumber);
		}

		String bonaAttractionEmail = (String)attributes.get(
			"bonaAttractionEmail");

		if (bonaAttractionEmail != null) {
			setBonaAttractionEmail(bonaAttractionEmail);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}

		Long tourismBonaAttractFormFirstId = (Long)attributes.get(
			"tourismBonaAttractFormFirstId");

		if (tourismBonaAttractFormFirstId != null) {
			setTourismBonaAttractFormFirstId(tourismBonaAttractFormFirstId);
		}
	}

	@Override
	public TourismBonaAttractionFormFirstAddress cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address type of this tourism bona attraction form first address.
	 *
	 * @return the address type of this tourism bona attraction form first address
	 */
	@Override
	public String getAddressType() {
		return model.getAddressType();
	}

	/**
	 * Returns the bona attract address of this tourism bona attraction form first address.
	 *
	 * @return the bona attract address of this tourism bona attraction form first address
	 */
	@Override
	public String getBonaAttractAddress() {
		return model.getBonaAttractAddress();
	}

	/**
	 * Returns the bona attraction email of this tourism bona attraction form first address.
	 *
	 * @return the bona attraction email of this tourism bona attraction form first address
	 */
	@Override
	public String getBonaAttractionEmail() {
		return model.getBonaAttractionEmail();
	}

	/**
	 * Returns the bona attraction fax number of this tourism bona attraction form first address.
	 *
	 * @return the bona attraction fax number of this tourism bona attraction form first address
	 */
	@Override
	public String getBonaAttractionFaxNumber() {
		return model.getBonaAttractionFaxNumber();
	}

	/**
	 * Returns the bona attraction telephone no of this tourism bona attraction form first address.
	 *
	 * @return the bona attraction telephone no of this tourism bona attraction form first address
	 */
	@Override
	public String getBonaAttractionTelephoneNo() {
		return model.getBonaAttractionTelephoneNo();
	}

	/**
	 * Returns the company ID of this tourism bona attraction form first address.
	 *
	 * @return the company ID of this tourism bona attraction form first address
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism bona attraction form first address.
	 *
	 * @return the create date of this tourism bona attraction form first address
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this tourism bona attraction form first address.
	 *
	 * @return the group ID of this tourism bona attraction form first address
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism bona attraction form first address.
	 *
	 * @return the modified date of this tourism bona attraction form first address
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this tourism bona attraction form first address.
	 *
	 * @return the primary key of this tourism bona attraction form first address
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tourism application ID of this tourism bona attraction form first address.
	 *
	 * @return the tourism application ID of this tourism bona attraction form first address
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism bona attract form first ID of this tourism bona attraction form first address.
	 *
	 * @return the tourism bona attract form first ID of this tourism bona attraction form first address
	 */
	@Override
	public long getTourismBonaAttractFormFirstId() {
		return model.getTourismBonaAttractFormFirstId();
	}

	/**
	 * Returns the tourism bona attraction ffaoo ID of this tourism bona attraction form first address.
	 *
	 * @return the tourism bona attraction ffaoo ID of this tourism bona attraction form first address
	 */
	@Override
	public long getTourismBonaAttractionFFAOOId() {
		return model.getTourismBonaAttractionFFAOOId();
	}

	/**
	 * Returns the user ID of this tourism bona attraction form first address.
	 *
	 * @return the user ID of this tourism bona attraction form first address
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism bona attraction form first address.
	 *
	 * @return the user name of this tourism bona attraction form first address
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism bona attraction form first address.
	 *
	 * @return the user uuid of this tourism bona attraction form first address
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
	 * Sets the address type of this tourism bona attraction form first address.
	 *
	 * @param addressType the address type of this tourism bona attraction form first address
	 */
	@Override
	public void setAddressType(String addressType) {
		model.setAddressType(addressType);
	}

	/**
	 * Sets the bona attract address of this tourism bona attraction form first address.
	 *
	 * @param bonaAttractAddress the bona attract address of this tourism bona attraction form first address
	 */
	@Override
	public void setBonaAttractAddress(String bonaAttractAddress) {
		model.setBonaAttractAddress(bonaAttractAddress);
	}

	/**
	 * Sets the bona attraction email of this tourism bona attraction form first address.
	 *
	 * @param bonaAttractionEmail the bona attraction email of this tourism bona attraction form first address
	 */
	@Override
	public void setBonaAttractionEmail(String bonaAttractionEmail) {
		model.setBonaAttractionEmail(bonaAttractionEmail);
	}

	/**
	 * Sets the bona attraction fax number of this tourism bona attraction form first address.
	 *
	 * @param bonaAttractionFaxNumber the bona attraction fax number of this tourism bona attraction form first address
	 */
	@Override
	public void setBonaAttractionFaxNumber(String bonaAttractionFaxNumber) {
		model.setBonaAttractionFaxNumber(bonaAttractionFaxNumber);
	}

	/**
	 * Sets the bona attraction telephone no of this tourism bona attraction form first address.
	 *
	 * @param bonaAttractionTelephoneNo the bona attraction telephone no of this tourism bona attraction form first address
	 */
	@Override
	public void setBonaAttractionTelephoneNo(String bonaAttractionTelephoneNo) {
		model.setBonaAttractionTelephoneNo(bonaAttractionTelephoneNo);
	}

	/**
	 * Sets the company ID of this tourism bona attraction form first address.
	 *
	 * @param companyId the company ID of this tourism bona attraction form first address
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism bona attraction form first address.
	 *
	 * @param createDate the create date of this tourism bona attraction form first address
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this tourism bona attraction form first address.
	 *
	 * @param groupId the group ID of this tourism bona attraction form first address
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism bona attraction form first address.
	 *
	 * @param modifiedDate the modified date of this tourism bona attraction form first address
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this tourism bona attraction form first address.
	 *
	 * @param primaryKey the primary key of this tourism bona attraction form first address
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tourism application ID of this tourism bona attraction form first address.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism bona attraction form first address
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism bona attract form first ID of this tourism bona attraction form first address.
	 *
	 * @param tourismBonaAttractFormFirstId the tourism bona attract form first ID of this tourism bona attraction form first address
	 */
	@Override
	public void setTourismBonaAttractFormFirstId(
		long tourismBonaAttractFormFirstId) {

		model.setTourismBonaAttractFormFirstId(tourismBonaAttractFormFirstId);
	}

	/**
	 * Sets the tourism bona attraction ffaoo ID of this tourism bona attraction form first address.
	 *
	 * @param tourismBonaAttractionFFAOOId the tourism bona attraction ffaoo ID of this tourism bona attraction form first address
	 */
	@Override
	public void setTourismBonaAttractionFFAOOId(
		long tourismBonaAttractionFFAOOId) {

		model.setTourismBonaAttractionFFAOOId(tourismBonaAttractionFFAOOId);
	}

	/**
	 * Sets the user ID of this tourism bona attraction form first address.
	 *
	 * @param userId the user ID of this tourism bona attraction form first address
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism bona attraction form first address.
	 *
	 * @param userName the user name of this tourism bona attraction form first address
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism bona attraction form first address.
	 *
	 * @param userUuid the user uuid of this tourism bona attraction form first address
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
	protected TourismBonaAttractionFormFirstAddressWrapper wrap(
		TourismBonaAttractionFormFirstAddress
			tourismBonaAttractionFormFirstAddress) {

		return new TourismBonaAttractionFormFirstAddressWrapper(
			tourismBonaAttractionFormFirstAddress);
	}

}