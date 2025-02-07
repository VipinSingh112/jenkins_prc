/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AddFdaScopeClient}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaScopeClient
 * @generated
 */
public class AddFdaScopeClientWrapper
	extends BaseModelWrapper<AddFdaScopeClient>
	implements AddFdaScopeClient, ModelWrapper<AddFdaScopeClient> {

	public AddFdaScopeClientWrapper(AddFdaScopeClient addFdaScopeClient) {
		super(addFdaScopeClient);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("addFdaScopeClientId", getAddFdaScopeClientId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("clientOrganization", getClientOrganization());
		attributes.put("foodProducts", getFoodProducts());
		attributes.put("fdaRegulations", getFdaRegulations());
		attributes.put("dateGranted", getDateGranted());
		attributes.put("janaacApplicationId", getJanaacApplicationId());
		attributes.put("counter", getCounter());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long addFdaScopeClientId = (Long)attributes.get("addFdaScopeClientId");

		if (addFdaScopeClientId != null) {
			setAddFdaScopeClientId(addFdaScopeClientId);
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

		String clientOrganization = (String)attributes.get(
			"clientOrganization");

		if (clientOrganization != null) {
			setClientOrganization(clientOrganization);
		}

		String foodProducts = (String)attributes.get("foodProducts");

		if (foodProducts != null) {
			setFoodProducts(foodProducts);
		}

		String fdaRegulations = (String)attributes.get("fdaRegulations");

		if (fdaRegulations != null) {
			setFdaRegulations(fdaRegulations);
		}

		Date dateGranted = (Date)attributes.get("dateGranted");

		if (dateGranted != null) {
			setDateGranted(dateGranted);
		}

		Long janaacApplicationId = (Long)attributes.get("janaacApplicationId");

		if (janaacApplicationId != null) {
			setJanaacApplicationId(janaacApplicationId);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}
	}

	@Override
	public AddFdaScopeClient cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the add fda scope client ID of this add fda scope client.
	 *
	 * @return the add fda scope client ID of this add fda scope client
	 */
	@Override
	public long getAddFdaScopeClientId() {
		return model.getAddFdaScopeClientId();
	}

	/**
	 * Returns the client organization of this add fda scope client.
	 *
	 * @return the client organization of this add fda scope client
	 */
	@Override
	public String getClientOrganization() {
		return model.getClientOrganization();
	}

	/**
	 * Returns the company ID of this add fda scope client.
	 *
	 * @return the company ID of this add fda scope client
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this add fda scope client.
	 *
	 * @return the counter of this add fda scope client
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this add fda scope client.
	 *
	 * @return the create date of this add fda scope client
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date granted of this add fda scope client.
	 *
	 * @return the date granted of this add fda scope client
	 */
	@Override
	public Date getDateGranted() {
		return model.getDateGranted();
	}

	/**
	 * Returns the fda regulations of this add fda scope client.
	 *
	 * @return the fda regulations of this add fda scope client
	 */
	@Override
	public String getFdaRegulations() {
		return model.getFdaRegulations();
	}

	/**
	 * Returns the food products of this add fda scope client.
	 *
	 * @return the food products of this add fda scope client
	 */
	@Override
	public String getFoodProducts() {
		return model.getFoodProducts();
	}

	/**
	 * Returns the group ID of this add fda scope client.
	 *
	 * @return the group ID of this add fda scope client
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this add fda scope client.
	 *
	 * @return the janaac application ID of this add fda scope client
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the modified date of this add fda scope client.
	 *
	 * @return the modified date of this add fda scope client
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this add fda scope client.
	 *
	 * @return the primary key of this add fda scope client
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this add fda scope client.
	 *
	 * @return the user ID of this add fda scope client
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this add fda scope client.
	 *
	 * @return the user name of this add fda scope client
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this add fda scope client.
	 *
	 * @return the user uuid of this add fda scope client
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
	 * Sets the add fda scope client ID of this add fda scope client.
	 *
	 * @param addFdaScopeClientId the add fda scope client ID of this add fda scope client
	 */
	@Override
	public void setAddFdaScopeClientId(long addFdaScopeClientId) {
		model.setAddFdaScopeClientId(addFdaScopeClientId);
	}

	/**
	 * Sets the client organization of this add fda scope client.
	 *
	 * @param clientOrganization the client organization of this add fda scope client
	 */
	@Override
	public void setClientOrganization(String clientOrganization) {
		model.setClientOrganization(clientOrganization);
	}

	/**
	 * Sets the company ID of this add fda scope client.
	 *
	 * @param companyId the company ID of this add fda scope client
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this add fda scope client.
	 *
	 * @param counter the counter of this add fda scope client
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this add fda scope client.
	 *
	 * @param createDate the create date of this add fda scope client
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date granted of this add fda scope client.
	 *
	 * @param dateGranted the date granted of this add fda scope client
	 */
	@Override
	public void setDateGranted(Date dateGranted) {
		model.setDateGranted(dateGranted);
	}

	/**
	 * Sets the fda regulations of this add fda scope client.
	 *
	 * @param fdaRegulations the fda regulations of this add fda scope client
	 */
	@Override
	public void setFdaRegulations(String fdaRegulations) {
		model.setFdaRegulations(fdaRegulations);
	}

	/**
	 * Sets the food products of this add fda scope client.
	 *
	 * @param foodProducts the food products of this add fda scope client
	 */
	@Override
	public void setFoodProducts(String foodProducts) {
		model.setFoodProducts(foodProducts);
	}

	/**
	 * Sets the group ID of this add fda scope client.
	 *
	 * @param groupId the group ID of this add fda scope client
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this add fda scope client.
	 *
	 * @param janaacApplicationId the janaac application ID of this add fda scope client
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the modified date of this add fda scope client.
	 *
	 * @param modifiedDate the modified date of this add fda scope client
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this add fda scope client.
	 *
	 * @param primaryKey the primary key of this add fda scope client
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this add fda scope client.
	 *
	 * @param userId the user ID of this add fda scope client
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this add fda scope client.
	 *
	 * @param userName the user name of this add fda scope client
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this add fda scope client.
	 *
	 * @param userUuid the user uuid of this add fda scope client
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
	protected AddFdaScopeClientWrapper wrap(
		AddFdaScopeClient addFdaScopeClient) {

		return new AddFdaScopeClientWrapper(addFdaScopeClient);
	}

}