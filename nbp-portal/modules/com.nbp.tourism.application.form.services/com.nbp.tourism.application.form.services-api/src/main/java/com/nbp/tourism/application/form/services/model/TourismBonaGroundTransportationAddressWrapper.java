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
 * This class is a wrapper for {@link TourismBonaGroundTransportationAddress}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransportationAddress
 * @generated
 */
public class TourismBonaGroundTransportationAddressWrapper
	extends BaseModelWrapper<TourismBonaGroundTransportationAddress>
	implements ModelWrapper<TourismBonaGroundTransportationAddress>,
			   TourismBonaGroundTransportationAddress {

	public TourismBonaGroundTransportationAddressWrapper(
		TourismBonaGroundTransportationAddress
			tourismBonaGroundTransportationAddress) {

		super(tourismBonaGroundTransportationAddress);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"tourismBonaGroundTransAddresId",
			getTourismBonaGroundTransAddresId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("addressType", getAddressType());
		attributes.put("bonaGroundAddress", getBonaGroundAddress());
		attributes.put("tourismApplicationId", getTourismApplicationId());
		attributes.put(
			"tourismBonaGroundTransportId", getTourismBonaGroundTransportId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismBonaGroundTransAddresId = (Long)attributes.get(
			"tourismBonaGroundTransAddresId");

		if (tourismBonaGroundTransAddresId != null) {
			setTourismBonaGroundTransAddresId(tourismBonaGroundTransAddresId);
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

		String bonaGroundAddress = (String)attributes.get("bonaGroundAddress");

		if (bonaGroundAddress != null) {
			setBonaGroundAddress(bonaGroundAddress);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}

		Long tourismBonaGroundTransportId = (Long)attributes.get(
			"tourismBonaGroundTransportId");

		if (tourismBonaGroundTransportId != null) {
			setTourismBonaGroundTransportId(tourismBonaGroundTransportId);
		}
	}

	@Override
	public TourismBonaGroundTransportationAddress cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address type of this tourism bona ground transportation address.
	 *
	 * @return the address type of this tourism bona ground transportation address
	 */
	@Override
	public String getAddressType() {
		return model.getAddressType();
	}

	/**
	 * Returns the bona ground address of this tourism bona ground transportation address.
	 *
	 * @return the bona ground address of this tourism bona ground transportation address
	 */
	@Override
	public String getBonaGroundAddress() {
		return model.getBonaGroundAddress();
	}

	/**
	 * Returns the company ID of this tourism bona ground transportation address.
	 *
	 * @return the company ID of this tourism bona ground transportation address
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism bona ground transportation address.
	 *
	 * @return the create date of this tourism bona ground transportation address
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this tourism bona ground transportation address.
	 *
	 * @return the group ID of this tourism bona ground transportation address
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism bona ground transportation address.
	 *
	 * @return the modified date of this tourism bona ground transportation address
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this tourism bona ground transportation address.
	 *
	 * @return the primary key of this tourism bona ground transportation address
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tourism application ID of this tourism bona ground transportation address.
	 *
	 * @return the tourism application ID of this tourism bona ground transportation address
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism bona ground trans addres ID of this tourism bona ground transportation address.
	 *
	 * @return the tourism bona ground trans addres ID of this tourism bona ground transportation address
	 */
	@Override
	public long getTourismBonaGroundTransAddresId() {
		return model.getTourismBonaGroundTransAddresId();
	}

	/**
	 * Returns the tourism bona ground transport ID of this tourism bona ground transportation address.
	 *
	 * @return the tourism bona ground transport ID of this tourism bona ground transportation address
	 */
	@Override
	public long getTourismBonaGroundTransportId() {
		return model.getTourismBonaGroundTransportId();
	}

	/**
	 * Returns the user ID of this tourism bona ground transportation address.
	 *
	 * @return the user ID of this tourism bona ground transportation address
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism bona ground transportation address.
	 *
	 * @return the user name of this tourism bona ground transportation address
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism bona ground transportation address.
	 *
	 * @return the user uuid of this tourism bona ground transportation address
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
	 * Sets the address type of this tourism bona ground transportation address.
	 *
	 * @param addressType the address type of this tourism bona ground transportation address
	 */
	@Override
	public void setAddressType(String addressType) {
		model.setAddressType(addressType);
	}

	/**
	 * Sets the bona ground address of this tourism bona ground transportation address.
	 *
	 * @param bonaGroundAddress the bona ground address of this tourism bona ground transportation address
	 */
	@Override
	public void setBonaGroundAddress(String bonaGroundAddress) {
		model.setBonaGroundAddress(bonaGroundAddress);
	}

	/**
	 * Sets the company ID of this tourism bona ground transportation address.
	 *
	 * @param companyId the company ID of this tourism bona ground transportation address
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism bona ground transportation address.
	 *
	 * @param createDate the create date of this tourism bona ground transportation address
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this tourism bona ground transportation address.
	 *
	 * @param groupId the group ID of this tourism bona ground transportation address
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism bona ground transportation address.
	 *
	 * @param modifiedDate the modified date of this tourism bona ground transportation address
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this tourism bona ground transportation address.
	 *
	 * @param primaryKey the primary key of this tourism bona ground transportation address
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tourism application ID of this tourism bona ground transportation address.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism bona ground transportation address
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism bona ground trans addres ID of this tourism bona ground transportation address.
	 *
	 * @param tourismBonaGroundTransAddresId the tourism bona ground trans addres ID of this tourism bona ground transportation address
	 */
	@Override
	public void setTourismBonaGroundTransAddresId(
		long tourismBonaGroundTransAddresId) {

		model.setTourismBonaGroundTransAddresId(tourismBonaGroundTransAddresId);
	}

	/**
	 * Sets the tourism bona ground transport ID of this tourism bona ground transportation address.
	 *
	 * @param tourismBonaGroundTransportId the tourism bona ground transport ID of this tourism bona ground transportation address
	 */
	@Override
	public void setTourismBonaGroundTransportId(
		long tourismBonaGroundTransportId) {

		model.setTourismBonaGroundTransportId(tourismBonaGroundTransportId);
	}

	/**
	 * Sets the user ID of this tourism bona ground transportation address.
	 *
	 * @param userId the user ID of this tourism bona ground transportation address
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism bona ground transportation address.
	 *
	 * @param userName the user name of this tourism bona ground transportation address
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism bona ground transportation address.
	 *
	 * @param userUuid the user uuid of this tourism bona ground transportation address
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
	protected TourismBonaGroundTransportationAddressWrapper wrap(
		TourismBonaGroundTransportationAddress
			tourismBonaGroundTransportationAddress) {

		return new TourismBonaGroundTransportationAddressWrapper(
			tourismBonaGroundTransportationAddress);
	}

}