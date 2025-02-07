/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CannabisConsentBySoleOwner}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConsentBySoleOwner
 * @generated
 */
public class CannabisConsentBySoleOwnerWrapper
	extends BaseModelWrapper<CannabisConsentBySoleOwner>
	implements CannabisConsentBySoleOwner,
			   ModelWrapper<CannabisConsentBySoleOwner> {

	public CannabisConsentBySoleOwnerWrapper(
		CannabisConsentBySoleOwner cannabisConsentBySoleOwner) {

		super(cannabisConsentBySoleOwner);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"cannabisConsentBySoleOwnerId", getCannabisConsentBySoleOwnerId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ownerName", getOwnerName());
		attributes.put("date", getDate());
		attributes.put("ownerPhone", getOwnerPhone());
		attributes.put("ownerAddress", getOwnerAddress());
		attributes.put("counter", getCounter());
		attributes.put("cannabisApplicationId", getCannabisApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cannabisConsentBySoleOwnerId = (Long)attributes.get(
			"cannabisConsentBySoleOwnerId");

		if (cannabisConsentBySoleOwnerId != null) {
			setCannabisConsentBySoleOwnerId(cannabisConsentBySoleOwnerId);
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

		String ownerName = (String)attributes.get("ownerName");

		if (ownerName != null) {
			setOwnerName(ownerName);
		}

		Date date = (Date)attributes.get("date");

		if (date != null) {
			setDate(date);
		}

		String ownerPhone = (String)attributes.get("ownerPhone");

		if (ownerPhone != null) {
			setOwnerPhone(ownerPhone);
		}

		String ownerAddress = (String)attributes.get("ownerAddress");

		if (ownerAddress != null) {
			setOwnerAddress(ownerAddress);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long cannabisApplicationId = (Long)attributes.get(
			"cannabisApplicationId");

		if (cannabisApplicationId != null) {
			setCannabisApplicationId(cannabisApplicationId);
		}
	}

	@Override
	public CannabisConsentBySoleOwner cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the cannabis application ID of this cannabis consent by sole owner.
	 *
	 * @return the cannabis application ID of this cannabis consent by sole owner
	 */
	@Override
	public long getCannabisApplicationId() {
		return model.getCannabisApplicationId();
	}

	/**
	 * Returns the cannabis consent by sole owner ID of this cannabis consent by sole owner.
	 *
	 * @return the cannabis consent by sole owner ID of this cannabis consent by sole owner
	 */
	@Override
	public long getCannabisConsentBySoleOwnerId() {
		return model.getCannabisConsentBySoleOwnerId();
	}

	/**
	 * Returns the company ID of this cannabis consent by sole owner.
	 *
	 * @return the company ID of this cannabis consent by sole owner
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this cannabis consent by sole owner.
	 *
	 * @return the counter of this cannabis consent by sole owner
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this cannabis consent by sole owner.
	 *
	 * @return the create date of this cannabis consent by sole owner
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of this cannabis consent by sole owner.
	 *
	 * @return the date of this cannabis consent by sole owner
	 */
	@Override
	public Date getDate() {
		return model.getDate();
	}

	/**
	 * Returns the group ID of this cannabis consent by sole owner.
	 *
	 * @return the group ID of this cannabis consent by sole owner
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this cannabis consent by sole owner.
	 *
	 * @return the modified date of this cannabis consent by sole owner
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the owner address of this cannabis consent by sole owner.
	 *
	 * @return the owner address of this cannabis consent by sole owner
	 */
	@Override
	public String getOwnerAddress() {
		return model.getOwnerAddress();
	}

	/**
	 * Returns the owner name of this cannabis consent by sole owner.
	 *
	 * @return the owner name of this cannabis consent by sole owner
	 */
	@Override
	public String getOwnerName() {
		return model.getOwnerName();
	}

	/**
	 * Returns the owner phone of this cannabis consent by sole owner.
	 *
	 * @return the owner phone of this cannabis consent by sole owner
	 */
	@Override
	public String getOwnerPhone() {
		return model.getOwnerPhone();
	}

	/**
	 * Returns the primary key of this cannabis consent by sole owner.
	 *
	 * @return the primary key of this cannabis consent by sole owner
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this cannabis consent by sole owner.
	 *
	 * @return the user ID of this cannabis consent by sole owner
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this cannabis consent by sole owner.
	 *
	 * @return the user name of this cannabis consent by sole owner
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this cannabis consent by sole owner.
	 *
	 * @return the user uuid of this cannabis consent by sole owner
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
	 * Sets the cannabis application ID of this cannabis consent by sole owner.
	 *
	 * @param cannabisApplicationId the cannabis application ID of this cannabis consent by sole owner
	 */
	@Override
	public void setCannabisApplicationId(long cannabisApplicationId) {
		model.setCannabisApplicationId(cannabisApplicationId);
	}

	/**
	 * Sets the cannabis consent by sole owner ID of this cannabis consent by sole owner.
	 *
	 * @param cannabisConsentBySoleOwnerId the cannabis consent by sole owner ID of this cannabis consent by sole owner
	 */
	@Override
	public void setCannabisConsentBySoleOwnerId(
		long cannabisConsentBySoleOwnerId) {

		model.setCannabisConsentBySoleOwnerId(cannabisConsentBySoleOwnerId);
	}

	/**
	 * Sets the company ID of this cannabis consent by sole owner.
	 *
	 * @param companyId the company ID of this cannabis consent by sole owner
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this cannabis consent by sole owner.
	 *
	 * @param counter the counter of this cannabis consent by sole owner
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this cannabis consent by sole owner.
	 *
	 * @param createDate the create date of this cannabis consent by sole owner
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of this cannabis consent by sole owner.
	 *
	 * @param date the date of this cannabis consent by sole owner
	 */
	@Override
	public void setDate(Date date) {
		model.setDate(date);
	}

	/**
	 * Sets the group ID of this cannabis consent by sole owner.
	 *
	 * @param groupId the group ID of this cannabis consent by sole owner
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this cannabis consent by sole owner.
	 *
	 * @param modifiedDate the modified date of this cannabis consent by sole owner
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the owner address of this cannabis consent by sole owner.
	 *
	 * @param ownerAddress the owner address of this cannabis consent by sole owner
	 */
	@Override
	public void setOwnerAddress(String ownerAddress) {
		model.setOwnerAddress(ownerAddress);
	}

	/**
	 * Sets the owner name of this cannabis consent by sole owner.
	 *
	 * @param ownerName the owner name of this cannabis consent by sole owner
	 */
	@Override
	public void setOwnerName(String ownerName) {
		model.setOwnerName(ownerName);
	}

	/**
	 * Sets the owner phone of this cannabis consent by sole owner.
	 *
	 * @param ownerPhone the owner phone of this cannabis consent by sole owner
	 */
	@Override
	public void setOwnerPhone(String ownerPhone) {
		model.setOwnerPhone(ownerPhone);
	}

	/**
	 * Sets the primary key of this cannabis consent by sole owner.
	 *
	 * @param primaryKey the primary key of this cannabis consent by sole owner
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this cannabis consent by sole owner.
	 *
	 * @param userId the user ID of this cannabis consent by sole owner
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this cannabis consent by sole owner.
	 *
	 * @param userName the user name of this cannabis consent by sole owner
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this cannabis consent by sole owner.
	 *
	 * @param userUuid the user uuid of this cannabis consent by sole owner
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
	protected CannabisConsentBySoleOwnerWrapper wrap(
		CannabisConsentBySoleOwner cannabisConsentBySoleOwner) {

		return new CannabisConsentBySoleOwnerWrapper(
			cannabisConsentBySoleOwner);
	}

}