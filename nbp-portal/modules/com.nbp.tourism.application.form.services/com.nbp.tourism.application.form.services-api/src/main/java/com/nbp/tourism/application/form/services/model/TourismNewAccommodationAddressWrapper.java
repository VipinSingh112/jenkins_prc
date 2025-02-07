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
 * This class is a wrapper for {@link TourismNewAccommodationAddress}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccommodationAddress
 * @generated
 */
public class TourismNewAccommodationAddressWrapper
	extends BaseModelWrapper<TourismNewAccommodationAddress>
	implements ModelWrapper<TourismNewAccommodationAddress>,
			   TourismNewAccommodationAddress {

	public TourismNewAccommodationAddressWrapper(
		TourismNewAccommodationAddress tourismNewAccommodationAddress) {

		super(tourismNewAccommodationAddress);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"tourismNewAccommodationAOOId", getTourismNewAccommodationAOOId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("addressType", getAddressType());
		attributes.put("accoAddress", getAccoAddress());
		attributes.put("accoTelephoneNumber", getAccoTelephoneNumber());
		attributes.put("accoFaxNumber", getAccoFaxNumber());
		attributes.put("accoEmail", getAccoEmail());
		attributes.put("tourismApplicationId", getTourismApplicationId());
		attributes.put("tourismNewAccoFormId", getTourismNewAccoFormId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismNewAccommodationAOOId = (Long)attributes.get(
			"tourismNewAccommodationAOOId");

		if (tourismNewAccommodationAOOId != null) {
			setTourismNewAccommodationAOOId(tourismNewAccommodationAOOId);
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

		String accoAddress = (String)attributes.get("accoAddress");

		if (accoAddress != null) {
			setAccoAddress(accoAddress);
		}

		String accoTelephoneNumber = (String)attributes.get(
			"accoTelephoneNumber");

		if (accoTelephoneNumber != null) {
			setAccoTelephoneNumber(accoTelephoneNumber);
		}

		String accoFaxNumber = (String)attributes.get("accoFaxNumber");

		if (accoFaxNumber != null) {
			setAccoFaxNumber(accoFaxNumber);
		}

		String accoEmail = (String)attributes.get("accoEmail");

		if (accoEmail != null) {
			setAccoEmail(accoEmail);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}

		Long tourismNewAccoFormId = (Long)attributes.get(
			"tourismNewAccoFormId");

		if (tourismNewAccoFormId != null) {
			setTourismNewAccoFormId(tourismNewAccoFormId);
		}
	}

	@Override
	public TourismNewAccommodationAddress cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acco address of this tourism new accommodation address.
	 *
	 * @return the acco address of this tourism new accommodation address
	 */
	@Override
	public String getAccoAddress() {
		return model.getAccoAddress();
	}

	/**
	 * Returns the acco email of this tourism new accommodation address.
	 *
	 * @return the acco email of this tourism new accommodation address
	 */
	@Override
	public String getAccoEmail() {
		return model.getAccoEmail();
	}

	/**
	 * Returns the acco fax number of this tourism new accommodation address.
	 *
	 * @return the acco fax number of this tourism new accommodation address
	 */
	@Override
	public String getAccoFaxNumber() {
		return model.getAccoFaxNumber();
	}

	/**
	 * Returns the acco telephone number of this tourism new accommodation address.
	 *
	 * @return the acco telephone number of this tourism new accommodation address
	 */
	@Override
	public String getAccoTelephoneNumber() {
		return model.getAccoTelephoneNumber();
	}

	/**
	 * Returns the address type of this tourism new accommodation address.
	 *
	 * @return the address type of this tourism new accommodation address
	 */
	@Override
	public String getAddressType() {
		return model.getAddressType();
	}

	/**
	 * Returns the company ID of this tourism new accommodation address.
	 *
	 * @return the company ID of this tourism new accommodation address
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism new accommodation address.
	 *
	 * @return the create date of this tourism new accommodation address
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this tourism new accommodation address.
	 *
	 * @return the group ID of this tourism new accommodation address
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism new accommodation address.
	 *
	 * @return the modified date of this tourism new accommodation address
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this tourism new accommodation address.
	 *
	 * @return the primary key of this tourism new accommodation address
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tourism application ID of this tourism new accommodation address.
	 *
	 * @return the tourism application ID of this tourism new accommodation address
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism new acco form ID of this tourism new accommodation address.
	 *
	 * @return the tourism new acco form ID of this tourism new accommodation address
	 */
	@Override
	public long getTourismNewAccoFormId() {
		return model.getTourismNewAccoFormId();
	}

	/**
	 * Returns the tourism new accommodation aoo ID of this tourism new accommodation address.
	 *
	 * @return the tourism new accommodation aoo ID of this tourism new accommodation address
	 */
	@Override
	public long getTourismNewAccommodationAOOId() {
		return model.getTourismNewAccommodationAOOId();
	}

	/**
	 * Returns the user ID of this tourism new accommodation address.
	 *
	 * @return the user ID of this tourism new accommodation address
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism new accommodation address.
	 *
	 * @return the user name of this tourism new accommodation address
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism new accommodation address.
	 *
	 * @return the user uuid of this tourism new accommodation address
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
	 * Sets the acco address of this tourism new accommodation address.
	 *
	 * @param accoAddress the acco address of this tourism new accommodation address
	 */
	@Override
	public void setAccoAddress(String accoAddress) {
		model.setAccoAddress(accoAddress);
	}

	/**
	 * Sets the acco email of this tourism new accommodation address.
	 *
	 * @param accoEmail the acco email of this tourism new accommodation address
	 */
	@Override
	public void setAccoEmail(String accoEmail) {
		model.setAccoEmail(accoEmail);
	}

	/**
	 * Sets the acco fax number of this tourism new accommodation address.
	 *
	 * @param accoFaxNumber the acco fax number of this tourism new accommodation address
	 */
	@Override
	public void setAccoFaxNumber(String accoFaxNumber) {
		model.setAccoFaxNumber(accoFaxNumber);
	}

	/**
	 * Sets the acco telephone number of this tourism new accommodation address.
	 *
	 * @param accoTelephoneNumber the acco telephone number of this tourism new accommodation address
	 */
	@Override
	public void setAccoTelephoneNumber(String accoTelephoneNumber) {
		model.setAccoTelephoneNumber(accoTelephoneNumber);
	}

	/**
	 * Sets the address type of this tourism new accommodation address.
	 *
	 * @param addressType the address type of this tourism new accommodation address
	 */
	@Override
	public void setAddressType(String addressType) {
		model.setAddressType(addressType);
	}

	/**
	 * Sets the company ID of this tourism new accommodation address.
	 *
	 * @param companyId the company ID of this tourism new accommodation address
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism new accommodation address.
	 *
	 * @param createDate the create date of this tourism new accommodation address
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this tourism new accommodation address.
	 *
	 * @param groupId the group ID of this tourism new accommodation address
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism new accommodation address.
	 *
	 * @param modifiedDate the modified date of this tourism new accommodation address
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this tourism new accommodation address.
	 *
	 * @param primaryKey the primary key of this tourism new accommodation address
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tourism application ID of this tourism new accommodation address.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism new accommodation address
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism new acco form ID of this tourism new accommodation address.
	 *
	 * @param tourismNewAccoFormId the tourism new acco form ID of this tourism new accommodation address
	 */
	@Override
	public void setTourismNewAccoFormId(long tourismNewAccoFormId) {
		model.setTourismNewAccoFormId(tourismNewAccoFormId);
	}

	/**
	 * Sets the tourism new accommodation aoo ID of this tourism new accommodation address.
	 *
	 * @param tourismNewAccommodationAOOId the tourism new accommodation aoo ID of this tourism new accommodation address
	 */
	@Override
	public void setTourismNewAccommodationAOOId(
		long tourismNewAccommodationAOOId) {

		model.setTourismNewAccommodationAOOId(tourismNewAccommodationAOOId);
	}

	/**
	 * Sets the user ID of this tourism new accommodation address.
	 *
	 * @param userId the user ID of this tourism new accommodation address
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism new accommodation address.
	 *
	 * @param userName the user name of this tourism new accommodation address
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism new accommodation address.
	 *
	 * @param userUuid the user uuid of this tourism new accommodation address
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
	protected TourismNewAccommodationAddressWrapper wrap(
		TourismNewAccommodationAddress tourismNewAccommodationAddress) {

		return new TourismNewAccommodationAddressWrapper(
			tourismNewAccommodationAddress);
	}

}