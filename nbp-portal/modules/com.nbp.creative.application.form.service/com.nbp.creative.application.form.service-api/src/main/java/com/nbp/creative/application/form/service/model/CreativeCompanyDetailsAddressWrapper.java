/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CreativeCompanyDetailsAddress}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyDetailsAddress
 * @generated
 */
public class CreativeCompanyDetailsAddressWrapper
	extends BaseModelWrapper<CreativeCompanyDetailsAddress>
	implements CreativeCompanyDetailsAddress,
			   ModelWrapper<CreativeCompanyDetailsAddress> {

	public CreativeCompanyDetailsAddressWrapper(
		CreativeCompanyDetailsAddress creativeCompanyDetailsAddress) {

		super(creativeCompanyDetailsAddress);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"creativeComDetailsAddressId", getCreativeComDetailsAddressId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("addressType", getAddressType());
		attributes.put("streetAddress", getStreetAddress());
		attributes.put("streetAddressLineTwo", getStreetAddressLineTwo());
		attributes.put("city", getCity());
		attributes.put("country", getCountry());
		attributes.put("CreativeApplicationId", getCreativeApplicationId());
		attributes.put(
			"creativeCompanyDetailsId", getCreativeCompanyDetailsId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long creativeComDetailsAddressId = (Long)attributes.get(
			"creativeComDetailsAddressId");

		if (creativeComDetailsAddressId != null) {
			setCreativeComDetailsAddressId(creativeComDetailsAddressId);
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

		String streetAddress = (String)attributes.get("streetAddress");

		if (streetAddress != null) {
			setStreetAddress(streetAddress);
		}

		String streetAddressLineTwo = (String)attributes.get(
			"streetAddressLineTwo");

		if (streetAddressLineTwo != null) {
			setStreetAddressLineTwo(streetAddressLineTwo);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String country = (String)attributes.get("country");

		if (country != null) {
			setCountry(country);
		}

		Long CreativeApplicationId = (Long)attributes.get(
			"CreativeApplicationId");

		if (CreativeApplicationId != null) {
			setCreativeApplicationId(CreativeApplicationId);
		}

		Long creativeCompanyDetailsId = (Long)attributes.get(
			"creativeCompanyDetailsId");

		if (creativeCompanyDetailsId != null) {
			setCreativeCompanyDetailsId(creativeCompanyDetailsId);
		}
	}

	@Override
	public CreativeCompanyDetailsAddress cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address type of this creative company details address.
	 *
	 * @return the address type of this creative company details address
	 */
	@Override
	public String getAddressType() {
		return model.getAddressType();
	}

	/**
	 * Returns the city of this creative company details address.
	 *
	 * @return the city of this creative company details address
	 */
	@Override
	public String getCity() {
		return model.getCity();
	}

	/**
	 * Returns the company ID of this creative company details address.
	 *
	 * @return the company ID of this creative company details address
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the country of this creative company details address.
	 *
	 * @return the country of this creative company details address
	 */
	@Override
	public String getCountry() {
		return model.getCountry();
	}

	/**
	 * Returns the create date of this creative company details address.
	 *
	 * @return the create date of this creative company details address
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the creative application ID of this creative company details address.
	 *
	 * @return the creative application ID of this creative company details address
	 */
	@Override
	public long getCreativeApplicationId() {
		return model.getCreativeApplicationId();
	}

	/**
	 * Returns the creative com details address ID of this creative company details address.
	 *
	 * @return the creative com details address ID of this creative company details address
	 */
	@Override
	public long getCreativeComDetailsAddressId() {
		return model.getCreativeComDetailsAddressId();
	}

	/**
	 * Returns the creative company details ID of this creative company details address.
	 *
	 * @return the creative company details ID of this creative company details address
	 */
	@Override
	public long getCreativeCompanyDetailsId() {
		return model.getCreativeCompanyDetailsId();
	}

	/**
	 * Returns the group ID of this creative company details address.
	 *
	 * @return the group ID of this creative company details address
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this creative company details address.
	 *
	 * @return the modified date of this creative company details address
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this creative company details address.
	 *
	 * @return the primary key of this creative company details address
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the street address of this creative company details address.
	 *
	 * @return the street address of this creative company details address
	 */
	@Override
	public String getStreetAddress() {
		return model.getStreetAddress();
	}

	/**
	 * Returns the street address line two of this creative company details address.
	 *
	 * @return the street address line two of this creative company details address
	 */
	@Override
	public String getStreetAddressLineTwo() {
		return model.getStreetAddressLineTwo();
	}

	/**
	 * Returns the user ID of this creative company details address.
	 *
	 * @return the user ID of this creative company details address
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this creative company details address.
	 *
	 * @return the user name of this creative company details address
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this creative company details address.
	 *
	 * @return the user uuid of this creative company details address
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
	 * Sets the address type of this creative company details address.
	 *
	 * @param addressType the address type of this creative company details address
	 */
	@Override
	public void setAddressType(String addressType) {
		model.setAddressType(addressType);
	}

	/**
	 * Sets the city of this creative company details address.
	 *
	 * @param city the city of this creative company details address
	 */
	@Override
	public void setCity(String city) {
		model.setCity(city);
	}

	/**
	 * Sets the company ID of this creative company details address.
	 *
	 * @param companyId the company ID of this creative company details address
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the country of this creative company details address.
	 *
	 * @param country the country of this creative company details address
	 */
	@Override
	public void setCountry(String country) {
		model.setCountry(country);
	}

	/**
	 * Sets the create date of this creative company details address.
	 *
	 * @param createDate the create date of this creative company details address
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the creative application ID of this creative company details address.
	 *
	 * @param CreativeApplicationId the creative application ID of this creative company details address
	 */
	@Override
	public void setCreativeApplicationId(long CreativeApplicationId) {
		model.setCreativeApplicationId(CreativeApplicationId);
	}

	/**
	 * Sets the creative com details address ID of this creative company details address.
	 *
	 * @param creativeComDetailsAddressId the creative com details address ID of this creative company details address
	 */
	@Override
	public void setCreativeComDetailsAddressId(
		long creativeComDetailsAddressId) {

		model.setCreativeComDetailsAddressId(creativeComDetailsAddressId);
	}

	/**
	 * Sets the creative company details ID of this creative company details address.
	 *
	 * @param creativeCompanyDetailsId the creative company details ID of this creative company details address
	 */
	@Override
	public void setCreativeCompanyDetailsId(long creativeCompanyDetailsId) {
		model.setCreativeCompanyDetailsId(creativeCompanyDetailsId);
	}

	/**
	 * Sets the group ID of this creative company details address.
	 *
	 * @param groupId the group ID of this creative company details address
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this creative company details address.
	 *
	 * @param modifiedDate the modified date of this creative company details address
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this creative company details address.
	 *
	 * @param primaryKey the primary key of this creative company details address
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the street address of this creative company details address.
	 *
	 * @param streetAddress the street address of this creative company details address
	 */
	@Override
	public void setStreetAddress(String streetAddress) {
		model.setStreetAddress(streetAddress);
	}

	/**
	 * Sets the street address line two of this creative company details address.
	 *
	 * @param streetAddressLineTwo the street address line two of this creative company details address
	 */
	@Override
	public void setStreetAddressLineTwo(String streetAddressLineTwo) {
		model.setStreetAddressLineTwo(streetAddressLineTwo);
	}

	/**
	 * Sets the user ID of this creative company details address.
	 *
	 * @param userId the user ID of this creative company details address
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this creative company details address.
	 *
	 * @param userName the user name of this creative company details address
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this creative company details address.
	 *
	 * @param userUuid the user uuid of this creative company details address
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
	protected CreativeCompanyDetailsAddressWrapper wrap(
		CreativeCompanyDetailsAddress creativeCompanyDetailsAddress) {

		return new CreativeCompanyDetailsAddressWrapper(
			creativeCompanyDetailsAddress);
	}

}