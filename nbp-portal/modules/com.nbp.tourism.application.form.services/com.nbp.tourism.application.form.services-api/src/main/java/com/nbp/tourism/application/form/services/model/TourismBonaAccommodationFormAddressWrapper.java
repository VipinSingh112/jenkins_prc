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
 * This class is a wrapper for {@link TourismBonaAccommodationFormAddress}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccommodationFormAddress
 * @generated
 */
public class TourismBonaAccommodationFormAddressWrapper
	extends BaseModelWrapper<TourismBonaAccommodationFormAddress>
	implements ModelWrapper<TourismBonaAccommodationFormAddress>,
			   TourismBonaAccommodationFormAddress {

	public TourismBonaAccommodationFormAddressWrapper(
		TourismBonaAccommodationFormAddress
			tourismBonaAccommodationFormAddress) {

		super(tourismBonaAccommodationFormAddress);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"tourismBonaAccommodationFAOOId",
			getTourismBonaAccommodationFAOOId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("addressType", getAddressType());
		attributes.put("bonaAccoAddress", getBonaAccoAddress());
		attributes.put("bonaAccoTelephoneNumber", getBonaAccoTelephoneNumber());
		attributes.put("bonaAccoFaxNumber", getBonaAccoFaxNumber());
		attributes.put("bonaAccoEmail", getBonaAccoEmail());
		attributes.put("tourismApplicationId", getTourismApplicationId());
		attributes.put("tourismBonaAFId", getTourismBonaAFId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismBonaAccommodationFAOOId = (Long)attributes.get(
			"tourismBonaAccommodationFAOOId");

		if (tourismBonaAccommodationFAOOId != null) {
			setTourismBonaAccommodationFAOOId(tourismBonaAccommodationFAOOId);
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

		String bonaAccoAddress = (String)attributes.get("bonaAccoAddress");

		if (bonaAccoAddress != null) {
			setBonaAccoAddress(bonaAccoAddress);
		}

		String bonaAccoTelephoneNumber = (String)attributes.get(
			"bonaAccoTelephoneNumber");

		if (bonaAccoTelephoneNumber != null) {
			setBonaAccoTelephoneNumber(bonaAccoTelephoneNumber);
		}

		String bonaAccoFaxNumber = (String)attributes.get("bonaAccoFaxNumber");

		if (bonaAccoFaxNumber != null) {
			setBonaAccoFaxNumber(bonaAccoFaxNumber);
		}

		String bonaAccoEmail = (String)attributes.get("bonaAccoEmail");

		if (bonaAccoEmail != null) {
			setBonaAccoEmail(bonaAccoEmail);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}

		Long tourismBonaAFId = (Long)attributes.get("tourismBonaAFId");

		if (tourismBonaAFId != null) {
			setTourismBonaAFId(tourismBonaAFId);
		}
	}

	@Override
	public TourismBonaAccommodationFormAddress cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address type of this tourism bona accommodation form address.
	 *
	 * @return the address type of this tourism bona accommodation form address
	 */
	@Override
	public String getAddressType() {
		return model.getAddressType();
	}

	/**
	 * Returns the bona acco address of this tourism bona accommodation form address.
	 *
	 * @return the bona acco address of this tourism bona accommodation form address
	 */
	@Override
	public String getBonaAccoAddress() {
		return model.getBonaAccoAddress();
	}

	/**
	 * Returns the bona acco email of this tourism bona accommodation form address.
	 *
	 * @return the bona acco email of this tourism bona accommodation form address
	 */
	@Override
	public String getBonaAccoEmail() {
		return model.getBonaAccoEmail();
	}

	/**
	 * Returns the bona acco fax number of this tourism bona accommodation form address.
	 *
	 * @return the bona acco fax number of this tourism bona accommodation form address
	 */
	@Override
	public String getBonaAccoFaxNumber() {
		return model.getBonaAccoFaxNumber();
	}

	/**
	 * Returns the bona acco telephone number of this tourism bona accommodation form address.
	 *
	 * @return the bona acco telephone number of this tourism bona accommodation form address
	 */
	@Override
	public String getBonaAccoTelephoneNumber() {
		return model.getBonaAccoTelephoneNumber();
	}

	/**
	 * Returns the company ID of this tourism bona accommodation form address.
	 *
	 * @return the company ID of this tourism bona accommodation form address
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism bona accommodation form address.
	 *
	 * @return the create date of this tourism bona accommodation form address
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this tourism bona accommodation form address.
	 *
	 * @return the group ID of this tourism bona accommodation form address
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism bona accommodation form address.
	 *
	 * @return the modified date of this tourism bona accommodation form address
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this tourism bona accommodation form address.
	 *
	 * @return the primary key of this tourism bona accommodation form address
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tourism application ID of this tourism bona accommodation form address.
	 *
	 * @return the tourism application ID of this tourism bona accommodation form address
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism bona accommodation faoo ID of this tourism bona accommodation form address.
	 *
	 * @return the tourism bona accommodation faoo ID of this tourism bona accommodation form address
	 */
	@Override
	public long getTourismBonaAccommodationFAOOId() {
		return model.getTourismBonaAccommodationFAOOId();
	}

	/**
	 * Returns the tourism bona af ID of this tourism bona accommodation form address.
	 *
	 * @return the tourism bona af ID of this tourism bona accommodation form address
	 */
	@Override
	public long getTourismBonaAFId() {
		return model.getTourismBonaAFId();
	}

	/**
	 * Returns the user ID of this tourism bona accommodation form address.
	 *
	 * @return the user ID of this tourism bona accommodation form address
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism bona accommodation form address.
	 *
	 * @return the user name of this tourism bona accommodation form address
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism bona accommodation form address.
	 *
	 * @return the user uuid of this tourism bona accommodation form address
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
	 * Sets the address type of this tourism bona accommodation form address.
	 *
	 * @param addressType the address type of this tourism bona accommodation form address
	 */
	@Override
	public void setAddressType(String addressType) {
		model.setAddressType(addressType);
	}

	/**
	 * Sets the bona acco address of this tourism bona accommodation form address.
	 *
	 * @param bonaAccoAddress the bona acco address of this tourism bona accommodation form address
	 */
	@Override
	public void setBonaAccoAddress(String bonaAccoAddress) {
		model.setBonaAccoAddress(bonaAccoAddress);
	}

	/**
	 * Sets the bona acco email of this tourism bona accommodation form address.
	 *
	 * @param bonaAccoEmail the bona acco email of this tourism bona accommodation form address
	 */
	@Override
	public void setBonaAccoEmail(String bonaAccoEmail) {
		model.setBonaAccoEmail(bonaAccoEmail);
	}

	/**
	 * Sets the bona acco fax number of this tourism bona accommodation form address.
	 *
	 * @param bonaAccoFaxNumber the bona acco fax number of this tourism bona accommodation form address
	 */
	@Override
	public void setBonaAccoFaxNumber(String bonaAccoFaxNumber) {
		model.setBonaAccoFaxNumber(bonaAccoFaxNumber);
	}

	/**
	 * Sets the bona acco telephone number of this tourism bona accommodation form address.
	 *
	 * @param bonaAccoTelephoneNumber the bona acco telephone number of this tourism bona accommodation form address
	 */
	@Override
	public void setBonaAccoTelephoneNumber(String bonaAccoTelephoneNumber) {
		model.setBonaAccoTelephoneNumber(bonaAccoTelephoneNumber);
	}

	/**
	 * Sets the company ID of this tourism bona accommodation form address.
	 *
	 * @param companyId the company ID of this tourism bona accommodation form address
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism bona accommodation form address.
	 *
	 * @param createDate the create date of this tourism bona accommodation form address
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this tourism bona accommodation form address.
	 *
	 * @param groupId the group ID of this tourism bona accommodation form address
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism bona accommodation form address.
	 *
	 * @param modifiedDate the modified date of this tourism bona accommodation form address
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this tourism bona accommodation form address.
	 *
	 * @param primaryKey the primary key of this tourism bona accommodation form address
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tourism application ID of this tourism bona accommodation form address.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism bona accommodation form address
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism bona accommodation faoo ID of this tourism bona accommodation form address.
	 *
	 * @param tourismBonaAccommodationFAOOId the tourism bona accommodation faoo ID of this tourism bona accommodation form address
	 */
	@Override
	public void setTourismBonaAccommodationFAOOId(
		long tourismBonaAccommodationFAOOId) {

		model.setTourismBonaAccommodationFAOOId(tourismBonaAccommodationFAOOId);
	}

	/**
	 * Sets the tourism bona af ID of this tourism bona accommodation form address.
	 *
	 * @param tourismBonaAFId the tourism bona af ID of this tourism bona accommodation form address
	 */
	@Override
	public void setTourismBonaAFId(long tourismBonaAFId) {
		model.setTourismBonaAFId(tourismBonaAFId);
	}

	/**
	 * Sets the user ID of this tourism bona accommodation form address.
	 *
	 * @param userId the user ID of this tourism bona accommodation form address
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism bona accommodation form address.
	 *
	 * @param userName the user name of this tourism bona accommodation form address
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism bona accommodation form address.
	 *
	 * @param userUuid the user uuid of this tourism bona accommodation form address
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
	protected TourismBonaAccommodationFormAddressWrapper wrap(
		TourismBonaAccommodationFormAddress
			tourismBonaAccommodationFormAddress) {

		return new TourismBonaAccommodationFormAddressWrapper(
			tourismBonaAccommodationFormAddress);
	}

}