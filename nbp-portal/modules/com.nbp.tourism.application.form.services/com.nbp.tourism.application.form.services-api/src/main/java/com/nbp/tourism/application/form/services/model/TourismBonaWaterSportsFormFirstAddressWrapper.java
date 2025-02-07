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
 * This class is a wrapper for {@link TourismBonaWaterSportsFormFirstAddress}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaWaterSportsFormFirstAddress
 * @generated
 */
public class TourismBonaWaterSportsFormFirstAddressWrapper
	extends BaseModelWrapper<TourismBonaWaterSportsFormFirstAddress>
	implements ModelWrapper<TourismBonaWaterSportsFormFirstAddress>,
			   TourismBonaWaterSportsFormFirstAddress {

	public TourismBonaWaterSportsFormFirstAddressWrapper(
		TourismBonaWaterSportsFormFirstAddress
			tourismBonaWaterSportsFormFirstAddress) {

		super(tourismBonaWaterSportsFormFirstAddress);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"tourismBonaWaterSportsFFAId", getTourismBonaWaterSportsFFAId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("addressType", getAddressType());
		attributes.put("bonaWaterAddress", getBonaWaterAddress());
		attributes.put("bonaWaterTeleNo", getBonaWaterTeleNo());
		attributes.put("bonaWaterFaxNo", getBonaWaterFaxNo());
		attributes.put("bonaWaterEmail", getBonaWaterEmail());
		attributes.put("tourismApplicationId", getTourismApplicationId());
		attributes.put(
			"tourismBonaWaterSFFirstId", getTourismBonaWaterSFFirstId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismBonaWaterSportsFFAId = (Long)attributes.get(
			"tourismBonaWaterSportsFFAId");

		if (tourismBonaWaterSportsFFAId != null) {
			setTourismBonaWaterSportsFFAId(tourismBonaWaterSportsFFAId);
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

		String bonaWaterAddress = (String)attributes.get("bonaWaterAddress");

		if (bonaWaterAddress != null) {
			setBonaWaterAddress(bonaWaterAddress);
		}

		String bonaWaterTeleNo = (String)attributes.get("bonaWaterTeleNo");

		if (bonaWaterTeleNo != null) {
			setBonaWaterTeleNo(bonaWaterTeleNo);
		}

		String bonaWaterFaxNo = (String)attributes.get("bonaWaterFaxNo");

		if (bonaWaterFaxNo != null) {
			setBonaWaterFaxNo(bonaWaterFaxNo);
		}

		String bonaWaterEmail = (String)attributes.get("bonaWaterEmail");

		if (bonaWaterEmail != null) {
			setBonaWaterEmail(bonaWaterEmail);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}

		Long tourismBonaWaterSFFirstId = (Long)attributes.get(
			"tourismBonaWaterSFFirstId");

		if (tourismBonaWaterSFFirstId != null) {
			setTourismBonaWaterSFFirstId(tourismBonaWaterSFFirstId);
		}
	}

	@Override
	public TourismBonaWaterSportsFormFirstAddress cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address type of this tourism bona water sports form first address.
	 *
	 * @return the address type of this tourism bona water sports form first address
	 */
	@Override
	public String getAddressType() {
		return model.getAddressType();
	}

	/**
	 * Returns the bona water address of this tourism bona water sports form first address.
	 *
	 * @return the bona water address of this tourism bona water sports form first address
	 */
	@Override
	public String getBonaWaterAddress() {
		return model.getBonaWaterAddress();
	}

	/**
	 * Returns the bona water email of this tourism bona water sports form first address.
	 *
	 * @return the bona water email of this tourism bona water sports form first address
	 */
	@Override
	public String getBonaWaterEmail() {
		return model.getBonaWaterEmail();
	}

	/**
	 * Returns the bona water fax no of this tourism bona water sports form first address.
	 *
	 * @return the bona water fax no of this tourism bona water sports form first address
	 */
	@Override
	public String getBonaWaterFaxNo() {
		return model.getBonaWaterFaxNo();
	}

	/**
	 * Returns the bona water tele no of this tourism bona water sports form first address.
	 *
	 * @return the bona water tele no of this tourism bona water sports form first address
	 */
	@Override
	public String getBonaWaterTeleNo() {
		return model.getBonaWaterTeleNo();
	}

	/**
	 * Returns the company ID of this tourism bona water sports form first address.
	 *
	 * @return the company ID of this tourism bona water sports form first address
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism bona water sports form first address.
	 *
	 * @return the create date of this tourism bona water sports form first address
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this tourism bona water sports form first address.
	 *
	 * @return the group ID of this tourism bona water sports form first address
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism bona water sports form first address.
	 *
	 * @return the modified date of this tourism bona water sports form first address
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this tourism bona water sports form first address.
	 *
	 * @return the primary key of this tourism bona water sports form first address
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tourism application ID of this tourism bona water sports form first address.
	 *
	 * @return the tourism application ID of this tourism bona water sports form first address
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism bona water sf first ID of this tourism bona water sports form first address.
	 *
	 * @return the tourism bona water sf first ID of this tourism bona water sports form first address
	 */
	@Override
	public long getTourismBonaWaterSFFirstId() {
		return model.getTourismBonaWaterSFFirstId();
	}

	/**
	 * Returns the tourism bona water sports ffa ID of this tourism bona water sports form first address.
	 *
	 * @return the tourism bona water sports ffa ID of this tourism bona water sports form first address
	 */
	@Override
	public long getTourismBonaWaterSportsFFAId() {
		return model.getTourismBonaWaterSportsFFAId();
	}

	/**
	 * Returns the user ID of this tourism bona water sports form first address.
	 *
	 * @return the user ID of this tourism bona water sports form first address
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism bona water sports form first address.
	 *
	 * @return the user name of this tourism bona water sports form first address
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism bona water sports form first address.
	 *
	 * @return the user uuid of this tourism bona water sports form first address
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
	 * Sets the address type of this tourism bona water sports form first address.
	 *
	 * @param addressType the address type of this tourism bona water sports form first address
	 */
	@Override
	public void setAddressType(String addressType) {
		model.setAddressType(addressType);
	}

	/**
	 * Sets the bona water address of this tourism bona water sports form first address.
	 *
	 * @param bonaWaterAddress the bona water address of this tourism bona water sports form first address
	 */
	@Override
	public void setBonaWaterAddress(String bonaWaterAddress) {
		model.setBonaWaterAddress(bonaWaterAddress);
	}

	/**
	 * Sets the bona water email of this tourism bona water sports form first address.
	 *
	 * @param bonaWaterEmail the bona water email of this tourism bona water sports form first address
	 */
	@Override
	public void setBonaWaterEmail(String bonaWaterEmail) {
		model.setBonaWaterEmail(bonaWaterEmail);
	}

	/**
	 * Sets the bona water fax no of this tourism bona water sports form first address.
	 *
	 * @param bonaWaterFaxNo the bona water fax no of this tourism bona water sports form first address
	 */
	@Override
	public void setBonaWaterFaxNo(String bonaWaterFaxNo) {
		model.setBonaWaterFaxNo(bonaWaterFaxNo);
	}

	/**
	 * Sets the bona water tele no of this tourism bona water sports form first address.
	 *
	 * @param bonaWaterTeleNo the bona water tele no of this tourism bona water sports form first address
	 */
	@Override
	public void setBonaWaterTeleNo(String bonaWaterTeleNo) {
		model.setBonaWaterTeleNo(bonaWaterTeleNo);
	}

	/**
	 * Sets the company ID of this tourism bona water sports form first address.
	 *
	 * @param companyId the company ID of this tourism bona water sports form first address
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism bona water sports form first address.
	 *
	 * @param createDate the create date of this tourism bona water sports form first address
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this tourism bona water sports form first address.
	 *
	 * @param groupId the group ID of this tourism bona water sports form first address
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism bona water sports form first address.
	 *
	 * @param modifiedDate the modified date of this tourism bona water sports form first address
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this tourism bona water sports form first address.
	 *
	 * @param primaryKey the primary key of this tourism bona water sports form first address
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tourism application ID of this tourism bona water sports form first address.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism bona water sports form first address
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism bona water sf first ID of this tourism bona water sports form first address.
	 *
	 * @param tourismBonaWaterSFFirstId the tourism bona water sf first ID of this tourism bona water sports form first address
	 */
	@Override
	public void setTourismBonaWaterSFFirstId(long tourismBonaWaterSFFirstId) {
		model.setTourismBonaWaterSFFirstId(tourismBonaWaterSFFirstId);
	}

	/**
	 * Sets the tourism bona water sports ffa ID of this tourism bona water sports form first address.
	 *
	 * @param tourismBonaWaterSportsFFAId the tourism bona water sports ffa ID of this tourism bona water sports form first address
	 */
	@Override
	public void setTourismBonaWaterSportsFFAId(
		long tourismBonaWaterSportsFFAId) {

		model.setTourismBonaWaterSportsFFAId(tourismBonaWaterSportsFFAId);
	}

	/**
	 * Sets the user ID of this tourism bona water sports form first address.
	 *
	 * @param userId the user ID of this tourism bona water sports form first address
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism bona water sports form first address.
	 *
	 * @param userName the user name of this tourism bona water sports form first address
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism bona water sports form first address.
	 *
	 * @param userUuid the user uuid of this tourism bona water sports form first address
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
	protected TourismBonaWaterSportsFormFirstAddressWrapper wrap(
		TourismBonaWaterSportsFormFirstAddress
			tourismBonaWaterSportsFormFirstAddress) {

		return new TourismBonaWaterSportsFormFirstAddressWrapper(
			tourismBonaWaterSportsFormFirstAddress);
	}

}