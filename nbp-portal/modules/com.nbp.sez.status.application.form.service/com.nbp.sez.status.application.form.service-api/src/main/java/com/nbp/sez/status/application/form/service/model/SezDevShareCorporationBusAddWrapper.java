/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SezDevShareCorporationBusAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevShareCorporationBusAdd
 * @generated
 */
public class SezDevShareCorporationBusAddWrapper
	extends BaseModelWrapper<SezDevShareCorporationBusAdd>
	implements ModelWrapper<SezDevShareCorporationBusAdd>,
			   SezDevShareCorporationBusAdd {

	public SezDevShareCorporationBusAddWrapper(
		SezDevShareCorporationBusAdd sezDevShareCorporationBusAdd) {

		super(sezDevShareCorporationBusAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"sezDevCorporationBusinessAddId",
			getSezDevCorporationBusinessAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("company", getCompany());
		attributes.put("relationship", getRelationship());
		attributes.put("counter", getCounter());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezDevCorporationBusinessAddId = (Long)attributes.get(
			"sezDevCorporationBusinessAddId");

		if (sezDevCorporationBusinessAddId != null) {
			setSezDevCorporationBusinessAddId(sezDevCorporationBusinessAddId);
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String company = (String)attributes.get("company");

		if (company != null) {
			setCompany(company);
		}

		String relationship = (String)attributes.get("relationship");

		if (relationship != null) {
			setRelationship(relationship);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezDevShareCorporationBusAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company of this sez dev share corporation bus add.
	 *
	 * @return the company of this sez dev share corporation bus add
	 */
	@Override
	public String getCompany() {
		return model.getCompany();
	}

	/**
	 * Returns the company ID of this sez dev share corporation bus add.
	 *
	 * @return the company ID of this sez dev share corporation bus add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this sez dev share corporation bus add.
	 *
	 * @return the counter of this sez dev share corporation bus add
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this sez dev share corporation bus add.
	 *
	 * @return the create date of this sez dev share corporation bus add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this sez dev share corporation bus add.
	 *
	 * @return the group ID of this sez dev share corporation bus add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez dev share corporation bus add.
	 *
	 * @return the modified date of this sez dev share corporation bus add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this sez dev share corporation bus add.
	 *
	 * @return the name of this sez dev share corporation bus add
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this sez dev share corporation bus add.
	 *
	 * @return the primary key of this sez dev share corporation bus add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the relationship of this sez dev share corporation bus add.
	 *
	 * @return the relationship of this sez dev share corporation bus add
	 */
	@Override
	public String getRelationship() {
		return model.getRelationship();
	}

	/**
	 * Returns the sez dev corporation business add ID of this sez dev share corporation bus add.
	 *
	 * @return the sez dev corporation business add ID of this sez dev share corporation bus add
	 */
	@Override
	public long getSezDevCorporationBusinessAddId() {
		return model.getSezDevCorporationBusinessAddId();
	}

	/**
	 * Returns the sez status application ID of this sez dev share corporation bus add.
	 *
	 * @return the sez status application ID of this sez dev share corporation bus add
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the user ID of this sez dev share corporation bus add.
	 *
	 * @return the user ID of this sez dev share corporation bus add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez dev share corporation bus add.
	 *
	 * @return the user name of this sez dev share corporation bus add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez dev share corporation bus add.
	 *
	 * @return the user uuid of this sez dev share corporation bus add
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
	 * Sets the company of this sez dev share corporation bus add.
	 *
	 * @param company the company of this sez dev share corporation bus add
	 */
	@Override
	public void setCompany(String company) {
		model.setCompany(company);
	}

	/**
	 * Sets the company ID of this sez dev share corporation bus add.
	 *
	 * @param companyId the company ID of this sez dev share corporation bus add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this sez dev share corporation bus add.
	 *
	 * @param counter the counter of this sez dev share corporation bus add
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this sez dev share corporation bus add.
	 *
	 * @param createDate the create date of this sez dev share corporation bus add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this sez dev share corporation bus add.
	 *
	 * @param groupId the group ID of this sez dev share corporation bus add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez dev share corporation bus add.
	 *
	 * @param modifiedDate the modified date of this sez dev share corporation bus add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this sez dev share corporation bus add.
	 *
	 * @param name the name of this sez dev share corporation bus add
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this sez dev share corporation bus add.
	 *
	 * @param primaryKey the primary key of this sez dev share corporation bus add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the relationship of this sez dev share corporation bus add.
	 *
	 * @param relationship the relationship of this sez dev share corporation bus add
	 */
	@Override
	public void setRelationship(String relationship) {
		model.setRelationship(relationship);
	}

	/**
	 * Sets the sez dev corporation business add ID of this sez dev share corporation bus add.
	 *
	 * @param sezDevCorporationBusinessAddId the sez dev corporation business add ID of this sez dev share corporation bus add
	 */
	@Override
	public void setSezDevCorporationBusinessAddId(
		long sezDevCorporationBusinessAddId) {

		model.setSezDevCorporationBusinessAddId(sezDevCorporationBusinessAddId);
	}

	/**
	 * Sets the sez status application ID of this sez dev share corporation bus add.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez dev share corporation bus add
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the user ID of this sez dev share corporation bus add.
	 *
	 * @param userId the user ID of this sez dev share corporation bus add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez dev share corporation bus add.
	 *
	 * @param userName the user name of this sez dev share corporation bus add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez dev share corporation bus add.
	 *
	 * @param userUuid the user uuid of this sez dev share corporation bus add
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
	protected SezDevShareCorporationBusAddWrapper wrap(
		SezDevShareCorporationBusAdd sezDevShareCorporationBusAdd) {

		return new SezDevShareCorporationBusAddWrapper(
			sezDevShareCorporationBusAdd);
	}

}