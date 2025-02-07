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
 * This class is a wrapper for {@link SezOccupantPrincipleOfficer}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantPrincipleOfficer
 * @generated
 */
public class SezOccupantPrincipleOfficerWrapper
	extends BaseModelWrapper<SezOccupantPrincipleOfficer>
	implements ModelWrapper<SezOccupantPrincipleOfficer>,
			   SezOccupantPrincipleOfficer {

	public SezOccupantPrincipleOfficerWrapper(
		SezOccupantPrincipleOfficer sezOccupantPrincipleOfficer) {

		super(sezOccupantPrincipleOfficer);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sezOccPrincOffId", getSezOccPrincOffId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("position", getPosition());
		attributes.put("principlOfficerCounter", getPrinciplOfficerCounter());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezOccPrincOffId = (Long)attributes.get("sezOccPrincOffId");

		if (sezOccPrincOffId != null) {
			setSezOccPrincOffId(sezOccPrincOffId);
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

		String position = (String)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}

		String principlOfficerCounter = (String)attributes.get(
			"principlOfficerCounter");

		if (principlOfficerCounter != null) {
			setPrinciplOfficerCounter(principlOfficerCounter);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezOccupantPrincipleOfficer cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this sez occupant principle officer.
	 *
	 * @return the company ID of this sez occupant principle officer
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sez occupant principle officer.
	 *
	 * @return the create date of this sez occupant principle officer
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this sez occupant principle officer.
	 *
	 * @return the group ID of this sez occupant principle officer
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez occupant principle officer.
	 *
	 * @return the modified date of this sez occupant principle officer
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this sez occupant principle officer.
	 *
	 * @return the name of this sez occupant principle officer
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the position of this sez occupant principle officer.
	 *
	 * @return the position of this sez occupant principle officer
	 */
	@Override
	public String getPosition() {
		return model.getPosition();
	}

	/**
	 * Returns the primary key of this sez occupant principle officer.
	 *
	 * @return the primary key of this sez occupant principle officer
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the principl officer counter of this sez occupant principle officer.
	 *
	 * @return the principl officer counter of this sez occupant principle officer
	 */
	@Override
	public String getPrinciplOfficerCounter() {
		return model.getPrinciplOfficerCounter();
	}

	/**
	 * Returns the sez occ princ off ID of this sez occupant principle officer.
	 *
	 * @return the sez occ princ off ID of this sez occupant principle officer
	 */
	@Override
	public long getSezOccPrincOffId() {
		return model.getSezOccPrincOffId();
	}

	/**
	 * Returns the sez status application ID of this sez occupant principle officer.
	 *
	 * @return the sez status application ID of this sez occupant principle officer
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the user ID of this sez occupant principle officer.
	 *
	 * @return the user ID of this sez occupant principle officer
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez occupant principle officer.
	 *
	 * @return the user name of this sez occupant principle officer
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez occupant principle officer.
	 *
	 * @return the user uuid of this sez occupant principle officer
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
	 * Sets the company ID of this sez occupant principle officer.
	 *
	 * @param companyId the company ID of this sez occupant principle officer
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sez occupant principle officer.
	 *
	 * @param createDate the create date of this sez occupant principle officer
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this sez occupant principle officer.
	 *
	 * @param groupId the group ID of this sez occupant principle officer
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez occupant principle officer.
	 *
	 * @param modifiedDate the modified date of this sez occupant principle officer
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this sez occupant principle officer.
	 *
	 * @param name the name of this sez occupant principle officer
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the position of this sez occupant principle officer.
	 *
	 * @param position the position of this sez occupant principle officer
	 */
	@Override
	public void setPosition(String position) {
		model.setPosition(position);
	}

	/**
	 * Sets the primary key of this sez occupant principle officer.
	 *
	 * @param primaryKey the primary key of this sez occupant principle officer
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the principl officer counter of this sez occupant principle officer.
	 *
	 * @param principlOfficerCounter the principl officer counter of this sez occupant principle officer
	 */
	@Override
	public void setPrinciplOfficerCounter(String principlOfficerCounter) {
		model.setPrinciplOfficerCounter(principlOfficerCounter);
	}

	/**
	 * Sets the sez occ princ off ID of this sez occupant principle officer.
	 *
	 * @param sezOccPrincOffId the sez occ princ off ID of this sez occupant principle officer
	 */
	@Override
	public void setSezOccPrincOffId(long sezOccPrincOffId) {
		model.setSezOccPrincOffId(sezOccPrincOffId);
	}

	/**
	 * Sets the sez status application ID of this sez occupant principle officer.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez occupant principle officer
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the user ID of this sez occupant principle officer.
	 *
	 * @param userId the user ID of this sez occupant principle officer
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez occupant principle officer.
	 *
	 * @param userName the user name of this sez occupant principle officer
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez occupant principle officer.
	 *
	 * @param userUuid the user uuid of this sez occupant principle officer
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
	protected SezOccupantPrincipleOfficerWrapper wrap(
		SezOccupantPrincipleOfficer sezOccupantPrincipleOfficer) {

		return new SezOccupantPrincipleOfficerWrapper(
			sezOccupantPrincipleOfficer);
	}

}