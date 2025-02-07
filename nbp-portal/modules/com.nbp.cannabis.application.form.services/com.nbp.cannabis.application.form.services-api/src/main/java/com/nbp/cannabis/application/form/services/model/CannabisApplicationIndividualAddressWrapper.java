/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CannabisApplicationIndividualAddress}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationIndividualAddress
 * @generated
 */
public class CannabisApplicationIndividualAddressWrapper
	extends BaseModelWrapper<CannabisApplicationIndividualAddress>
	implements CannabisApplicationIndividualAddress,
			   ModelWrapper<CannabisApplicationIndividualAddress> {

	public CannabisApplicationIndividualAddressWrapper(
		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress) {

		super(cannabisApplicationIndividualAddress);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("IndividualAddressId", getIndividualAddressId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("addressType", getAddressType());
		attributes.put("streetName", getStreetName());
		attributes.put("town", getTown());
		attributes.put("parish", getParish());
		attributes.put("applicationNumber", getApplicationNumber());
		attributes.put("cannabisApplicationId", getCannabisApplicationId());
		attributes.put("individualInformationId", getIndividualInformationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long IndividualAddressId = (Long)attributes.get("IndividualAddressId");

		if (IndividualAddressId != null) {
			setIndividualAddressId(IndividualAddressId);
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

		String town = (String)attributes.get("town");

		if (town != null) {
			setTown(town);
		}

		String parish = (String)attributes.get("parish");

		if (parish != null) {
			setParish(parish);
		}

		String applicationNumber = (String)attributes.get("applicationNumber");

		if (applicationNumber != null) {
			setApplicationNumber(applicationNumber);
		}

		Long cannabisApplicationId = (Long)attributes.get(
			"cannabisApplicationId");

		if (cannabisApplicationId != null) {
			setCannabisApplicationId(cannabisApplicationId);
		}

		Long individualInformationId = (Long)attributes.get(
			"individualInformationId");

		if (individualInformationId != null) {
			setIndividualInformationId(individualInformationId);
		}
	}

	@Override
	public CannabisApplicationIndividualAddress cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address type of this cannabis application individual address.
	 *
	 * @return the address type of this cannabis application individual address
	 */
	@Override
	public String getAddressType() {
		return model.getAddressType();
	}

	/**
	 * Returns the application number of this cannabis application individual address.
	 *
	 * @return the application number of this cannabis application individual address
	 */
	@Override
	public String getApplicationNumber() {
		return model.getApplicationNumber();
	}

	/**
	 * Returns the cannabis application ID of this cannabis application individual address.
	 *
	 * @return the cannabis application ID of this cannabis application individual address
	 */
	@Override
	public long getCannabisApplicationId() {
		return model.getCannabisApplicationId();
	}

	/**
	 * Returns the company ID of this cannabis application individual address.
	 *
	 * @return the company ID of this cannabis application individual address
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this cannabis application individual address.
	 *
	 * @return the create date of this cannabis application individual address
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this cannabis application individual address.
	 *
	 * @return the group ID of this cannabis application individual address
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the individual address ID of this cannabis application individual address.
	 *
	 * @return the individual address ID of this cannabis application individual address
	 */
	@Override
	public long getIndividualAddressId() {
		return model.getIndividualAddressId();
	}

	/**
	 * Returns the individual information ID of this cannabis application individual address.
	 *
	 * @return the individual information ID of this cannabis application individual address
	 */
	@Override
	public long getIndividualInformationId() {
		return model.getIndividualInformationId();
	}

	/**
	 * Returns the modified date of this cannabis application individual address.
	 *
	 * @return the modified date of this cannabis application individual address
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the parish of this cannabis application individual address.
	 *
	 * @return the parish of this cannabis application individual address
	 */
	@Override
	public String getParish() {
		return model.getParish();
	}

	/**
	 * Returns the primary key of this cannabis application individual address.
	 *
	 * @return the primary key of this cannabis application individual address
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the street name of this cannabis application individual address.
	 *
	 * @return the street name of this cannabis application individual address
	 */
	@Override
	public String getStreetName() {
		return model.getStreetName();
	}

	/**
	 * Returns the town of this cannabis application individual address.
	 *
	 * @return the town of this cannabis application individual address
	 */
	@Override
	public String getTown() {
		return model.getTown();
	}

	/**
	 * Returns the user ID of this cannabis application individual address.
	 *
	 * @return the user ID of this cannabis application individual address
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this cannabis application individual address.
	 *
	 * @return the user name of this cannabis application individual address
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this cannabis application individual address.
	 *
	 * @return the user uuid of this cannabis application individual address
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this cannabis application individual address.
	 *
	 * @return the uuid of this cannabis application individual address
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the address type of this cannabis application individual address.
	 *
	 * @param addressType the address type of this cannabis application individual address
	 */
	@Override
	public void setAddressType(String addressType) {
		model.setAddressType(addressType);
	}

	/**
	 * Sets the application number of this cannabis application individual address.
	 *
	 * @param applicationNumber the application number of this cannabis application individual address
	 */
	@Override
	public void setApplicationNumber(String applicationNumber) {
		model.setApplicationNumber(applicationNumber);
	}

	/**
	 * Sets the cannabis application ID of this cannabis application individual address.
	 *
	 * @param cannabisApplicationId the cannabis application ID of this cannabis application individual address
	 */
	@Override
	public void setCannabisApplicationId(long cannabisApplicationId) {
		model.setCannabisApplicationId(cannabisApplicationId);
	}

	/**
	 * Sets the company ID of this cannabis application individual address.
	 *
	 * @param companyId the company ID of this cannabis application individual address
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this cannabis application individual address.
	 *
	 * @param createDate the create date of this cannabis application individual address
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this cannabis application individual address.
	 *
	 * @param groupId the group ID of this cannabis application individual address
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the individual address ID of this cannabis application individual address.
	 *
	 * @param IndividualAddressId the individual address ID of this cannabis application individual address
	 */
	@Override
	public void setIndividualAddressId(long IndividualAddressId) {
		model.setIndividualAddressId(IndividualAddressId);
	}

	/**
	 * Sets the individual information ID of this cannabis application individual address.
	 *
	 * @param individualInformationId the individual information ID of this cannabis application individual address
	 */
	@Override
	public void setIndividualInformationId(long individualInformationId) {
		model.setIndividualInformationId(individualInformationId);
	}

	/**
	 * Sets the modified date of this cannabis application individual address.
	 *
	 * @param modifiedDate the modified date of this cannabis application individual address
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the parish of this cannabis application individual address.
	 *
	 * @param parish the parish of this cannabis application individual address
	 */
	@Override
	public void setParish(String parish) {
		model.setParish(parish);
	}

	/**
	 * Sets the primary key of this cannabis application individual address.
	 *
	 * @param primaryKey the primary key of this cannabis application individual address
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the street name of this cannabis application individual address.
	 *
	 * @param streetName the street name of this cannabis application individual address
	 */
	@Override
	public void setStreetName(String streetName) {
		model.setStreetName(streetName);
	}

	/**
	 * Sets the town of this cannabis application individual address.
	 *
	 * @param town the town of this cannabis application individual address
	 */
	@Override
	public void setTown(String town) {
		model.setTown(town);
	}

	/**
	 * Sets the user ID of this cannabis application individual address.
	 *
	 * @param userId the user ID of this cannabis application individual address
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this cannabis application individual address.
	 *
	 * @param userName the user name of this cannabis application individual address
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this cannabis application individual address.
	 *
	 * @param userUuid the user uuid of this cannabis application individual address
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this cannabis application individual address.
	 *
	 * @param uuid the uuid of this cannabis application individual address
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected CannabisApplicationIndividualAddressWrapper wrap(
		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress) {

		return new CannabisApplicationIndividualAddressWrapper(
			cannabisApplicationIndividualAddress);
	}

}