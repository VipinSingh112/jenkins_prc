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
 * This class is a wrapper for {@link SezOccupantLocationAddBox}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantLocationAddBox
 * @generated
 */
public class SezOccupantLocationAddBoxWrapper
	extends BaseModelWrapper<SezOccupantLocationAddBox>
	implements ModelWrapper<SezOccupantLocationAddBox>,
			   SezOccupantLocationAddBox {

	public SezOccupantLocationAddBoxWrapper(
		SezOccupantLocationAddBox sezOccupantLocationAddBox) {

		super(sezOccupantLocationAddBox);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sezOccLocationId", getSezOccLocationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("developerCodeLocation", getDeveloperCodeLocation());
		attributes.put("descTypeOfAct", getDescTypeOfAct());
		attributes.put("locationCounter", getLocationCounter());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezOccLocationId = (Long)attributes.get("sezOccLocationId");

		if (sezOccLocationId != null) {
			setSezOccLocationId(sezOccLocationId);
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

		String developerCodeLocation = (String)attributes.get(
			"developerCodeLocation");

		if (developerCodeLocation != null) {
			setDeveloperCodeLocation(developerCodeLocation);
		}

		String descTypeOfAct = (String)attributes.get("descTypeOfAct");

		if (descTypeOfAct != null) {
			setDescTypeOfAct(descTypeOfAct);
		}

		String locationCounter = (String)attributes.get("locationCounter");

		if (locationCounter != null) {
			setLocationCounter(locationCounter);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezOccupantLocationAddBox cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this sez occupant location add box.
	 *
	 * @return the company ID of this sez occupant location add box
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sez occupant location add box.
	 *
	 * @return the create date of this sez occupant location add box
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the desc type of act of this sez occupant location add box.
	 *
	 * @return the desc type of act of this sez occupant location add box
	 */
	@Override
	public String getDescTypeOfAct() {
		return model.getDescTypeOfAct();
	}

	/**
	 * Returns the developer code location of this sez occupant location add box.
	 *
	 * @return the developer code location of this sez occupant location add box
	 */
	@Override
	public String getDeveloperCodeLocation() {
		return model.getDeveloperCodeLocation();
	}

	/**
	 * Returns the group ID of this sez occupant location add box.
	 *
	 * @return the group ID of this sez occupant location add box
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the location counter of this sez occupant location add box.
	 *
	 * @return the location counter of this sez occupant location add box
	 */
	@Override
	public String getLocationCounter() {
		return model.getLocationCounter();
	}

	/**
	 * Returns the modified date of this sez occupant location add box.
	 *
	 * @return the modified date of this sez occupant location add box
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this sez occupant location add box.
	 *
	 * @return the primary key of this sez occupant location add box
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez occ location ID of this sez occupant location add box.
	 *
	 * @return the sez occ location ID of this sez occupant location add box
	 */
	@Override
	public long getSezOccLocationId() {
		return model.getSezOccLocationId();
	}

	/**
	 * Returns the sez status application ID of this sez occupant location add box.
	 *
	 * @return the sez status application ID of this sez occupant location add box
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the user ID of this sez occupant location add box.
	 *
	 * @return the user ID of this sez occupant location add box
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez occupant location add box.
	 *
	 * @return the user name of this sez occupant location add box
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez occupant location add box.
	 *
	 * @return the user uuid of this sez occupant location add box
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
	 * Sets the company ID of this sez occupant location add box.
	 *
	 * @param companyId the company ID of this sez occupant location add box
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sez occupant location add box.
	 *
	 * @param createDate the create date of this sez occupant location add box
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the desc type of act of this sez occupant location add box.
	 *
	 * @param descTypeOfAct the desc type of act of this sez occupant location add box
	 */
	@Override
	public void setDescTypeOfAct(String descTypeOfAct) {
		model.setDescTypeOfAct(descTypeOfAct);
	}

	/**
	 * Sets the developer code location of this sez occupant location add box.
	 *
	 * @param developerCodeLocation the developer code location of this sez occupant location add box
	 */
	@Override
	public void setDeveloperCodeLocation(String developerCodeLocation) {
		model.setDeveloperCodeLocation(developerCodeLocation);
	}

	/**
	 * Sets the group ID of this sez occupant location add box.
	 *
	 * @param groupId the group ID of this sez occupant location add box
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the location counter of this sez occupant location add box.
	 *
	 * @param locationCounter the location counter of this sez occupant location add box
	 */
	@Override
	public void setLocationCounter(String locationCounter) {
		model.setLocationCounter(locationCounter);
	}

	/**
	 * Sets the modified date of this sez occupant location add box.
	 *
	 * @param modifiedDate the modified date of this sez occupant location add box
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this sez occupant location add box.
	 *
	 * @param primaryKey the primary key of this sez occupant location add box
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez occ location ID of this sez occupant location add box.
	 *
	 * @param sezOccLocationId the sez occ location ID of this sez occupant location add box
	 */
	@Override
	public void setSezOccLocationId(long sezOccLocationId) {
		model.setSezOccLocationId(sezOccLocationId);
	}

	/**
	 * Sets the sez status application ID of this sez occupant location add box.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez occupant location add box
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the user ID of this sez occupant location add box.
	 *
	 * @param userId the user ID of this sez occupant location add box
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez occupant location add box.
	 *
	 * @param userName the user name of this sez occupant location add box
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez occupant location add box.
	 *
	 * @param userUuid the user uuid of this sez occupant location add box
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
	protected SezOccupantLocationAddBoxWrapper wrap(
		SezOccupantLocationAddBox sezOccupantLocationAddBox) {

		return new SezOccupantLocationAddBoxWrapper(sezOccupantLocationAddBox);
	}

}