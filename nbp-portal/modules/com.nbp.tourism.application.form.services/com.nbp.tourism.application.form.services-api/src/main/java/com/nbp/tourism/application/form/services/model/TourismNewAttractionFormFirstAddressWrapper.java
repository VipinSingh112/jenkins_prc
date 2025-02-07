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
 * This class is a wrapper for {@link TourismNewAttractionFormFirstAddress}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionFormFirstAddress
 * @generated
 */
public class TourismNewAttractionFormFirstAddressWrapper
	extends BaseModelWrapper<TourismNewAttractionFormFirstAddress>
	implements ModelWrapper<TourismNewAttractionFormFirstAddress>,
			   TourismNewAttractionFormFirstAddress {

	public TourismNewAttractionFormFirstAddressWrapper(
		TourismNewAttractionFormFirstAddress
			tourismNewAttractionFormFirstAddress) {

		super(tourismNewAttractionFormFirstAddress);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"tourismNewAttractionFormFAOOId",
			getTourismNewAttractionFormFAOOId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("addressType", getAddressType());
		attributes.put("attractionAddress", getAttractionAddress());
		attributes.put(
			"attractionTelephoneNumber", getAttractionTelephoneNumber());
		attributes.put("attractionFaxNumber", getAttractionFaxNumber());
		attributes.put("attractionEmail", getAttractionEmail());
		attributes.put("tourismApplicationId", getTourismApplicationId());
		attributes.put(
			"tourismNewAttractFormFirstId", getTourismNewAttractFormFirstId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismNewAttractionFormFAOOId = (Long)attributes.get(
			"tourismNewAttractionFormFAOOId");

		if (tourismNewAttractionFormFAOOId != null) {
			setTourismNewAttractionFormFAOOId(tourismNewAttractionFormFAOOId);
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

		String attractionAddress = (String)attributes.get("attractionAddress");

		if (attractionAddress != null) {
			setAttractionAddress(attractionAddress);
		}

		String attractionTelephoneNumber = (String)attributes.get(
			"attractionTelephoneNumber");

		if (attractionTelephoneNumber != null) {
			setAttractionTelephoneNumber(attractionTelephoneNumber);
		}

		String attractionFaxNumber = (String)attributes.get(
			"attractionFaxNumber");

		if (attractionFaxNumber != null) {
			setAttractionFaxNumber(attractionFaxNumber);
		}

		String attractionEmail = (String)attributes.get("attractionEmail");

		if (attractionEmail != null) {
			setAttractionEmail(attractionEmail);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}

		Long tourismNewAttractFormFirstId = (Long)attributes.get(
			"tourismNewAttractFormFirstId");

		if (tourismNewAttractFormFirstId != null) {
			setTourismNewAttractFormFirstId(tourismNewAttractFormFirstId);
		}
	}

	@Override
	public TourismNewAttractionFormFirstAddress cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address type of this tourism new attraction form first address.
	 *
	 * @return the address type of this tourism new attraction form first address
	 */
	@Override
	public String getAddressType() {
		return model.getAddressType();
	}

	/**
	 * Returns the attraction address of this tourism new attraction form first address.
	 *
	 * @return the attraction address of this tourism new attraction form first address
	 */
	@Override
	public String getAttractionAddress() {
		return model.getAttractionAddress();
	}

	/**
	 * Returns the attraction email of this tourism new attraction form first address.
	 *
	 * @return the attraction email of this tourism new attraction form first address
	 */
	@Override
	public String getAttractionEmail() {
		return model.getAttractionEmail();
	}

	/**
	 * Returns the attraction fax number of this tourism new attraction form first address.
	 *
	 * @return the attraction fax number of this tourism new attraction form first address
	 */
	@Override
	public String getAttractionFaxNumber() {
		return model.getAttractionFaxNumber();
	}

	/**
	 * Returns the attraction telephone number of this tourism new attraction form first address.
	 *
	 * @return the attraction telephone number of this tourism new attraction form first address
	 */
	@Override
	public String getAttractionTelephoneNumber() {
		return model.getAttractionTelephoneNumber();
	}

	/**
	 * Returns the company ID of this tourism new attraction form first address.
	 *
	 * @return the company ID of this tourism new attraction form first address
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism new attraction form first address.
	 *
	 * @return the create date of this tourism new attraction form first address
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this tourism new attraction form first address.
	 *
	 * @return the group ID of this tourism new attraction form first address
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism new attraction form first address.
	 *
	 * @return the modified date of this tourism new attraction form first address
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this tourism new attraction form first address.
	 *
	 * @return the primary key of this tourism new attraction form first address
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tourism application ID of this tourism new attraction form first address.
	 *
	 * @return the tourism application ID of this tourism new attraction form first address
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism new attract form first ID of this tourism new attraction form first address.
	 *
	 * @return the tourism new attract form first ID of this tourism new attraction form first address
	 */
	@Override
	public long getTourismNewAttractFormFirstId() {
		return model.getTourismNewAttractFormFirstId();
	}

	/**
	 * Returns the tourism new attraction form faoo ID of this tourism new attraction form first address.
	 *
	 * @return the tourism new attraction form faoo ID of this tourism new attraction form first address
	 */
	@Override
	public long getTourismNewAttractionFormFAOOId() {
		return model.getTourismNewAttractionFormFAOOId();
	}

	/**
	 * Returns the user ID of this tourism new attraction form first address.
	 *
	 * @return the user ID of this tourism new attraction form first address
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism new attraction form first address.
	 *
	 * @return the user name of this tourism new attraction form first address
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism new attraction form first address.
	 *
	 * @return the user uuid of this tourism new attraction form first address
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
	 * Sets the address type of this tourism new attraction form first address.
	 *
	 * @param addressType the address type of this tourism new attraction form first address
	 */
	@Override
	public void setAddressType(String addressType) {
		model.setAddressType(addressType);
	}

	/**
	 * Sets the attraction address of this tourism new attraction form first address.
	 *
	 * @param attractionAddress the attraction address of this tourism new attraction form first address
	 */
	@Override
	public void setAttractionAddress(String attractionAddress) {
		model.setAttractionAddress(attractionAddress);
	}

	/**
	 * Sets the attraction email of this tourism new attraction form first address.
	 *
	 * @param attractionEmail the attraction email of this tourism new attraction form first address
	 */
	@Override
	public void setAttractionEmail(String attractionEmail) {
		model.setAttractionEmail(attractionEmail);
	}

	/**
	 * Sets the attraction fax number of this tourism new attraction form first address.
	 *
	 * @param attractionFaxNumber the attraction fax number of this tourism new attraction form first address
	 */
	@Override
	public void setAttractionFaxNumber(String attractionFaxNumber) {
		model.setAttractionFaxNumber(attractionFaxNumber);
	}

	/**
	 * Sets the attraction telephone number of this tourism new attraction form first address.
	 *
	 * @param attractionTelephoneNumber the attraction telephone number of this tourism new attraction form first address
	 */
	@Override
	public void setAttractionTelephoneNumber(String attractionTelephoneNumber) {
		model.setAttractionTelephoneNumber(attractionTelephoneNumber);
	}

	/**
	 * Sets the company ID of this tourism new attraction form first address.
	 *
	 * @param companyId the company ID of this tourism new attraction form first address
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism new attraction form first address.
	 *
	 * @param createDate the create date of this tourism new attraction form first address
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this tourism new attraction form first address.
	 *
	 * @param groupId the group ID of this tourism new attraction form first address
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism new attraction form first address.
	 *
	 * @param modifiedDate the modified date of this tourism new attraction form first address
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this tourism new attraction form first address.
	 *
	 * @param primaryKey the primary key of this tourism new attraction form first address
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tourism application ID of this tourism new attraction form first address.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism new attraction form first address
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism new attract form first ID of this tourism new attraction form first address.
	 *
	 * @param tourismNewAttractFormFirstId the tourism new attract form first ID of this tourism new attraction form first address
	 */
	@Override
	public void setTourismNewAttractFormFirstId(
		long tourismNewAttractFormFirstId) {

		model.setTourismNewAttractFormFirstId(tourismNewAttractFormFirstId);
	}

	/**
	 * Sets the tourism new attraction form faoo ID of this tourism new attraction form first address.
	 *
	 * @param tourismNewAttractionFormFAOOId the tourism new attraction form faoo ID of this tourism new attraction form first address
	 */
	@Override
	public void setTourismNewAttractionFormFAOOId(
		long tourismNewAttractionFormFAOOId) {

		model.setTourismNewAttractionFormFAOOId(tourismNewAttractionFormFAOOId);
	}

	/**
	 * Sets the user ID of this tourism new attraction form first address.
	 *
	 * @param userId the user ID of this tourism new attraction form first address
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism new attraction form first address.
	 *
	 * @param userName the user name of this tourism new attraction form first address
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism new attraction form first address.
	 *
	 * @param userUuid the user uuid of this tourism new attraction form first address
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
	protected TourismNewAttractionFormFirstAddressWrapper wrap(
		TourismNewAttractionFormFirstAddress
			tourismNewAttractionFormFirstAddress) {

		return new TourismNewAttractionFormFirstAddressWrapper(
			tourismNewAttractionFormFirstAddress);
	}

}