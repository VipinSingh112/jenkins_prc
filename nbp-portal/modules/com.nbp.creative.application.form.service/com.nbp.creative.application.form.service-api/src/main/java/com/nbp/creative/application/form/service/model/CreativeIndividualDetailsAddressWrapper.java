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
 * This class is a wrapper for {@link CreativeIndividualDetailsAddress}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeIndividualDetailsAddress
 * @generated
 */
public class CreativeIndividualDetailsAddressWrapper
	extends BaseModelWrapper<CreativeIndividualDetailsAddress>
	implements CreativeIndividualDetailsAddress,
			   ModelWrapper<CreativeIndividualDetailsAddress> {

	public CreativeIndividualDetailsAddressWrapper(
		CreativeIndividualDetailsAddress creativeIndividualDetailsAddress) {

		super(creativeIndividualDetailsAddress);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"creativeIndiDetailsAddressId", getCreativeIndiDetailsAddressId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("streetAddress", getStreetAddress());
		attributes.put("streetAddressLineTwo", getStreetAddressLineTwo());
		attributes.put("CreativeApplicationId", getCreativeApplicationId());
		attributes.put(
			"creativeIndividualDetailsId", getCreativeIndividualDetailsId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long creativeIndiDetailsAddressId = (Long)attributes.get(
			"creativeIndiDetailsAddressId");

		if (creativeIndiDetailsAddressId != null) {
			setCreativeIndiDetailsAddressId(creativeIndiDetailsAddressId);
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

		String streetAddress = (String)attributes.get("streetAddress");

		if (streetAddress != null) {
			setStreetAddress(streetAddress);
		}

		String streetAddressLineTwo = (String)attributes.get(
			"streetAddressLineTwo");

		if (streetAddressLineTwo != null) {
			setStreetAddressLineTwo(streetAddressLineTwo);
		}

		Long CreativeApplicationId = (Long)attributes.get(
			"CreativeApplicationId");

		if (CreativeApplicationId != null) {
			setCreativeApplicationId(CreativeApplicationId);
		}

		Long creativeIndividualDetailsId = (Long)attributes.get(
			"creativeIndividualDetailsId");

		if (creativeIndividualDetailsId != null) {
			setCreativeIndividualDetailsId(creativeIndividualDetailsId);
		}
	}

	@Override
	public CreativeIndividualDetailsAddress cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this creative individual details address.
	 *
	 * @return the company ID of this creative individual details address
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this creative individual details address.
	 *
	 * @return the create date of this creative individual details address
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the creative application ID of this creative individual details address.
	 *
	 * @return the creative application ID of this creative individual details address
	 */
	@Override
	public long getCreativeApplicationId() {
		return model.getCreativeApplicationId();
	}

	/**
	 * Returns the creative indi details address ID of this creative individual details address.
	 *
	 * @return the creative indi details address ID of this creative individual details address
	 */
	@Override
	public long getCreativeIndiDetailsAddressId() {
		return model.getCreativeIndiDetailsAddressId();
	}

	/**
	 * Returns the creative individual details ID of this creative individual details address.
	 *
	 * @return the creative individual details ID of this creative individual details address
	 */
	@Override
	public long getCreativeIndividualDetailsId() {
		return model.getCreativeIndividualDetailsId();
	}

	/**
	 * Returns the group ID of this creative individual details address.
	 *
	 * @return the group ID of this creative individual details address
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this creative individual details address.
	 *
	 * @return the modified date of this creative individual details address
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this creative individual details address.
	 *
	 * @return the primary key of this creative individual details address
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the street address of this creative individual details address.
	 *
	 * @return the street address of this creative individual details address
	 */
	@Override
	public String getStreetAddress() {
		return model.getStreetAddress();
	}

	/**
	 * Returns the street address line two of this creative individual details address.
	 *
	 * @return the street address line two of this creative individual details address
	 */
	@Override
	public String getStreetAddressLineTwo() {
		return model.getStreetAddressLineTwo();
	}

	/**
	 * Returns the user ID of this creative individual details address.
	 *
	 * @return the user ID of this creative individual details address
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this creative individual details address.
	 *
	 * @return the user name of this creative individual details address
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this creative individual details address.
	 *
	 * @return the user uuid of this creative individual details address
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
	 * Sets the company ID of this creative individual details address.
	 *
	 * @param companyId the company ID of this creative individual details address
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this creative individual details address.
	 *
	 * @param createDate the create date of this creative individual details address
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the creative application ID of this creative individual details address.
	 *
	 * @param CreativeApplicationId the creative application ID of this creative individual details address
	 */
	@Override
	public void setCreativeApplicationId(long CreativeApplicationId) {
		model.setCreativeApplicationId(CreativeApplicationId);
	}

	/**
	 * Sets the creative indi details address ID of this creative individual details address.
	 *
	 * @param creativeIndiDetailsAddressId the creative indi details address ID of this creative individual details address
	 */
	@Override
	public void setCreativeIndiDetailsAddressId(
		long creativeIndiDetailsAddressId) {

		model.setCreativeIndiDetailsAddressId(creativeIndiDetailsAddressId);
	}

	/**
	 * Sets the creative individual details ID of this creative individual details address.
	 *
	 * @param creativeIndividualDetailsId the creative individual details ID of this creative individual details address
	 */
	@Override
	public void setCreativeIndividualDetailsId(
		long creativeIndividualDetailsId) {

		model.setCreativeIndividualDetailsId(creativeIndividualDetailsId);
	}

	/**
	 * Sets the group ID of this creative individual details address.
	 *
	 * @param groupId the group ID of this creative individual details address
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this creative individual details address.
	 *
	 * @param modifiedDate the modified date of this creative individual details address
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this creative individual details address.
	 *
	 * @param primaryKey the primary key of this creative individual details address
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the street address of this creative individual details address.
	 *
	 * @param streetAddress the street address of this creative individual details address
	 */
	@Override
	public void setStreetAddress(String streetAddress) {
		model.setStreetAddress(streetAddress);
	}

	/**
	 * Sets the street address line two of this creative individual details address.
	 *
	 * @param streetAddressLineTwo the street address line two of this creative individual details address
	 */
	@Override
	public void setStreetAddressLineTwo(String streetAddressLineTwo) {
		model.setStreetAddressLineTwo(streetAddressLineTwo);
	}

	/**
	 * Sets the user ID of this creative individual details address.
	 *
	 * @param userId the user ID of this creative individual details address
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this creative individual details address.
	 *
	 * @param userName the user name of this creative individual details address
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this creative individual details address.
	 *
	 * @param userUuid the user uuid of this creative individual details address
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
	protected CreativeIndividualDetailsAddressWrapper wrap(
		CreativeIndividualDetailsAddress creativeIndividualDetailsAddress) {

		return new CreativeIndividualDetailsAddressWrapper(
			creativeIndividualDetailsAddress);
	}

}