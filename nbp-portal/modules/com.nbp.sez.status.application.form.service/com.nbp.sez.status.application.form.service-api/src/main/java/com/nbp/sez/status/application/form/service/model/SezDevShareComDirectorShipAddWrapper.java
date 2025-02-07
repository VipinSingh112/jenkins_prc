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
 * This class is a wrapper for {@link SezDevShareComDirectorShipAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevShareComDirectorShipAdd
 * @generated
 */
public class SezDevShareComDirectorShipAddWrapper
	extends BaseModelWrapper<SezDevShareComDirectorShipAdd>
	implements ModelWrapper<SezDevShareComDirectorShipAdd>,
			   SezDevShareComDirectorShipAdd {

	public SezDevShareComDirectorShipAddWrapper(
		SezDevShareComDirectorShipAdd sezDevShareComDirectorShipAdd) {

		super(sezDevShareComDirectorShipAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"sezDevSharComDirectorShipAddId",
			getSezDevSharComDirectorShipAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("company", getCompany());
		attributes.put("replationship", getReplationship());
		attributes.put("counter", getCounter());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezDevSharComDirectorShipAddId = (Long)attributes.get(
			"sezDevSharComDirectorShipAddId");

		if (sezDevSharComDirectorShipAddId != null) {
			setSezDevSharComDirectorShipAddId(sezDevSharComDirectorShipAddId);
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

		String replationship = (String)attributes.get("replationship");

		if (replationship != null) {
			setReplationship(replationship);
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
	public SezDevShareComDirectorShipAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company of this sez dev share com director ship add.
	 *
	 * @return the company of this sez dev share com director ship add
	 */
	@Override
	public String getCompany() {
		return model.getCompany();
	}

	/**
	 * Returns the company ID of this sez dev share com director ship add.
	 *
	 * @return the company ID of this sez dev share com director ship add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this sez dev share com director ship add.
	 *
	 * @return the counter of this sez dev share com director ship add
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this sez dev share com director ship add.
	 *
	 * @return the create date of this sez dev share com director ship add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this sez dev share com director ship add.
	 *
	 * @return the group ID of this sez dev share com director ship add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez dev share com director ship add.
	 *
	 * @return the modified date of this sez dev share com director ship add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this sez dev share com director ship add.
	 *
	 * @return the name of this sez dev share com director ship add
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this sez dev share com director ship add.
	 *
	 * @return the primary key of this sez dev share com director ship add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the replationship of this sez dev share com director ship add.
	 *
	 * @return the replationship of this sez dev share com director ship add
	 */
	@Override
	public String getReplationship() {
		return model.getReplationship();
	}

	/**
	 * Returns the sez dev shar com director ship add ID of this sez dev share com director ship add.
	 *
	 * @return the sez dev shar com director ship add ID of this sez dev share com director ship add
	 */
	@Override
	public long getSezDevSharComDirectorShipAddId() {
		return model.getSezDevSharComDirectorShipAddId();
	}

	/**
	 * Returns the sez status application ID of this sez dev share com director ship add.
	 *
	 * @return the sez status application ID of this sez dev share com director ship add
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the user ID of this sez dev share com director ship add.
	 *
	 * @return the user ID of this sez dev share com director ship add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez dev share com director ship add.
	 *
	 * @return the user name of this sez dev share com director ship add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez dev share com director ship add.
	 *
	 * @return the user uuid of this sez dev share com director ship add
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
	 * Sets the company of this sez dev share com director ship add.
	 *
	 * @param company the company of this sez dev share com director ship add
	 */
	@Override
	public void setCompany(String company) {
		model.setCompany(company);
	}

	/**
	 * Sets the company ID of this sez dev share com director ship add.
	 *
	 * @param companyId the company ID of this sez dev share com director ship add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this sez dev share com director ship add.
	 *
	 * @param counter the counter of this sez dev share com director ship add
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this sez dev share com director ship add.
	 *
	 * @param createDate the create date of this sez dev share com director ship add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this sez dev share com director ship add.
	 *
	 * @param groupId the group ID of this sez dev share com director ship add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez dev share com director ship add.
	 *
	 * @param modifiedDate the modified date of this sez dev share com director ship add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this sez dev share com director ship add.
	 *
	 * @param name the name of this sez dev share com director ship add
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this sez dev share com director ship add.
	 *
	 * @param primaryKey the primary key of this sez dev share com director ship add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the replationship of this sez dev share com director ship add.
	 *
	 * @param replationship the replationship of this sez dev share com director ship add
	 */
	@Override
	public void setReplationship(String replationship) {
		model.setReplationship(replationship);
	}

	/**
	 * Sets the sez dev shar com director ship add ID of this sez dev share com director ship add.
	 *
	 * @param sezDevSharComDirectorShipAddId the sez dev shar com director ship add ID of this sez dev share com director ship add
	 */
	@Override
	public void setSezDevSharComDirectorShipAddId(
		long sezDevSharComDirectorShipAddId) {

		model.setSezDevSharComDirectorShipAddId(sezDevSharComDirectorShipAddId);
	}

	/**
	 * Sets the sez status application ID of this sez dev share com director ship add.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez dev share com director ship add
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the user ID of this sez dev share com director ship add.
	 *
	 * @param userId the user ID of this sez dev share com director ship add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez dev share com director ship add.
	 *
	 * @param userName the user name of this sez dev share com director ship add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez dev share com director ship add.
	 *
	 * @param userUuid the user uuid of this sez dev share com director ship add
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
	protected SezDevShareComDirectorShipAddWrapper wrap(
		SezDevShareComDirectorShipAdd sezDevShareComDirectorShipAdd) {

		return new SezDevShareComDirectorShipAddWrapper(
			sezDevShareComDirectorShipAdd);
	}

}