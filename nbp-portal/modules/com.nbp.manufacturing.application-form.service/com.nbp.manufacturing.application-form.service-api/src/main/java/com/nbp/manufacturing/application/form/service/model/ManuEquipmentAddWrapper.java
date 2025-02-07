/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ManuEquipmentAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuEquipmentAdd
 * @generated
 */
public class ManuEquipmentAddWrapper
	extends BaseModelWrapper<ManuEquipmentAdd>
	implements ManuEquipmentAdd, ModelWrapper<ManuEquipmentAdd> {

	public ManuEquipmentAddWrapper(ManuEquipmentAdd manuEquipmentAdd) {
		super(manuEquipmentAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("manuEquipmentAddId", getManuEquipmentAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("equipmentName", getEquipmentName());
		attributes.put("jamaicanDollor", getJamaicanDollor());
		attributes.put("counter", getCounter());
		attributes.put(
			"manufacturingApplicationId", getManufacturingApplicationId());
		attributes.put("manuEquipmentId", getManuEquipmentId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long manuEquipmentAddId = (Long)attributes.get("manuEquipmentAddId");

		if (manuEquipmentAddId != null) {
			setManuEquipmentAddId(manuEquipmentAddId);
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

		String equipmentName = (String)attributes.get("equipmentName");

		if (equipmentName != null) {
			setEquipmentName(equipmentName);
		}

		String jamaicanDollor = (String)attributes.get("jamaicanDollor");

		if (jamaicanDollor != null) {
			setJamaicanDollor(jamaicanDollor);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long manufacturingApplicationId = (Long)attributes.get(
			"manufacturingApplicationId");

		if (manufacturingApplicationId != null) {
			setManufacturingApplicationId(manufacturingApplicationId);
		}

		Long manuEquipmentId = (Long)attributes.get("manuEquipmentId");

		if (manuEquipmentId != null) {
			setManuEquipmentId(manuEquipmentId);
		}
	}

	@Override
	public ManuEquipmentAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this manu equipment add.
	 *
	 * @return the company ID of this manu equipment add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this manu equipment add.
	 *
	 * @return the counter of this manu equipment add
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this manu equipment add.
	 *
	 * @return the create date of this manu equipment add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the equipment name of this manu equipment add.
	 *
	 * @return the equipment name of this manu equipment add
	 */
	@Override
	public String getEquipmentName() {
		return model.getEquipmentName();
	}

	/**
	 * Returns the group ID of this manu equipment add.
	 *
	 * @return the group ID of this manu equipment add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jamaican dollor of this manu equipment add.
	 *
	 * @return the jamaican dollor of this manu equipment add
	 */
	@Override
	public String getJamaicanDollor() {
		return model.getJamaicanDollor();
	}

	/**
	 * Returns the manu equipment add ID of this manu equipment add.
	 *
	 * @return the manu equipment add ID of this manu equipment add
	 */
	@Override
	public long getManuEquipmentAddId() {
		return model.getManuEquipmentAddId();
	}

	/**
	 * Returns the manu equipment ID of this manu equipment add.
	 *
	 * @return the manu equipment ID of this manu equipment add
	 */
	@Override
	public long getManuEquipmentId() {
		return model.getManuEquipmentId();
	}

	/**
	 * Returns the manufacturing application ID of this manu equipment add.
	 *
	 * @return the manufacturing application ID of this manu equipment add
	 */
	@Override
	public long getManufacturingApplicationId() {
		return model.getManufacturingApplicationId();
	}

	/**
	 * Returns the modified date of this manu equipment add.
	 *
	 * @return the modified date of this manu equipment add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this manu equipment add.
	 *
	 * @return the primary key of this manu equipment add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this manu equipment add.
	 *
	 * @return the user ID of this manu equipment add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this manu equipment add.
	 *
	 * @return the user name of this manu equipment add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this manu equipment add.
	 *
	 * @return the user uuid of this manu equipment add
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
	 * Sets the company ID of this manu equipment add.
	 *
	 * @param companyId the company ID of this manu equipment add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this manu equipment add.
	 *
	 * @param counter the counter of this manu equipment add
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this manu equipment add.
	 *
	 * @param createDate the create date of this manu equipment add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the equipment name of this manu equipment add.
	 *
	 * @param equipmentName the equipment name of this manu equipment add
	 */
	@Override
	public void setEquipmentName(String equipmentName) {
		model.setEquipmentName(equipmentName);
	}

	/**
	 * Sets the group ID of this manu equipment add.
	 *
	 * @param groupId the group ID of this manu equipment add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jamaican dollor of this manu equipment add.
	 *
	 * @param jamaicanDollor the jamaican dollor of this manu equipment add
	 */
	@Override
	public void setJamaicanDollor(String jamaicanDollor) {
		model.setJamaicanDollor(jamaicanDollor);
	}

	/**
	 * Sets the manu equipment add ID of this manu equipment add.
	 *
	 * @param manuEquipmentAddId the manu equipment add ID of this manu equipment add
	 */
	@Override
	public void setManuEquipmentAddId(long manuEquipmentAddId) {
		model.setManuEquipmentAddId(manuEquipmentAddId);
	}

	/**
	 * Sets the manu equipment ID of this manu equipment add.
	 *
	 * @param manuEquipmentId the manu equipment ID of this manu equipment add
	 */
	@Override
	public void setManuEquipmentId(long manuEquipmentId) {
		model.setManuEquipmentId(manuEquipmentId);
	}

	/**
	 * Sets the manufacturing application ID of this manu equipment add.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID of this manu equipment add
	 */
	@Override
	public void setManufacturingApplicationId(long manufacturingApplicationId) {
		model.setManufacturingApplicationId(manufacturingApplicationId);
	}

	/**
	 * Sets the modified date of this manu equipment add.
	 *
	 * @param modifiedDate the modified date of this manu equipment add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this manu equipment add.
	 *
	 * @param primaryKey the primary key of this manu equipment add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this manu equipment add.
	 *
	 * @param userId the user ID of this manu equipment add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this manu equipment add.
	 *
	 * @param userName the user name of this manu equipment add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this manu equipment add.
	 *
	 * @param userUuid the user uuid of this manu equipment add
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
	protected ManuEquipmentAddWrapper wrap(ManuEquipmentAdd manuEquipmentAdd) {
		return new ManuEquipmentAddWrapper(manuEquipmentAdd);
	}

}