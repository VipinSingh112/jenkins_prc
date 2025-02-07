/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FireBrigadeProEquipmentInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeProEquipmentInfo
 * @generated
 */
public class FireBrigadeProEquipmentInfoWrapper
	extends BaseModelWrapper<FireBrigadeProEquipmentInfo>
	implements FireBrigadeProEquipmentInfo,
			   ModelWrapper<FireBrigadeProEquipmentInfo> {

	public FireBrigadeProEquipmentInfoWrapper(
		FireBrigadeProEquipmentInfo fireBrigadeProEquipmentInfo) {

		super(fireBrigadeProEquipmentInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"fireBrigadeProEquipmentInfoId",
			getFireBrigadeProEquipmentInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("equipmentProtectionPre", getEquipmentProtectionPre());
		attributes.put("equipmentProtectionOne", getEquipmentProtectionOne());
		attributes.put("equipmentProtectionTwo", getEquipmentProtectionTwo());
		attributes.put(
			"equipmentProtectionThree", getEquipmentProtectionThree());
		attributes.put("equipmentProtectionFour", getEquipmentProtectionFour());
		attributes.put("equipmentProtectionFive", getEquipmentProtectionFive());
		attributes.put("equipmentProtectionSix", getEquipmentProtectionSix());
		attributes.put("otherEquipment", getOtherEquipment());
		attributes.put(
			"fireBrigadeApplicationId", getFireBrigadeApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long fireBrigadeProEquipmentInfoId = (Long)attributes.get(
			"fireBrigadeProEquipmentInfoId");

		if (fireBrigadeProEquipmentInfoId != null) {
			setFireBrigadeProEquipmentInfoId(fireBrigadeProEquipmentInfoId);
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

		String equipmentProtectionPre = (String)attributes.get(
			"equipmentProtectionPre");

		if (equipmentProtectionPre != null) {
			setEquipmentProtectionPre(equipmentProtectionPre);
		}

		String equipmentProtectionOne = (String)attributes.get(
			"equipmentProtectionOne");

		if (equipmentProtectionOne != null) {
			setEquipmentProtectionOne(equipmentProtectionOne);
		}

		String equipmentProtectionTwo = (String)attributes.get(
			"equipmentProtectionTwo");

		if (equipmentProtectionTwo != null) {
			setEquipmentProtectionTwo(equipmentProtectionTwo);
		}

		String equipmentProtectionThree = (String)attributes.get(
			"equipmentProtectionThree");

		if (equipmentProtectionThree != null) {
			setEquipmentProtectionThree(equipmentProtectionThree);
		}

		String equipmentProtectionFour = (String)attributes.get(
			"equipmentProtectionFour");

		if (equipmentProtectionFour != null) {
			setEquipmentProtectionFour(equipmentProtectionFour);
		}

		String equipmentProtectionFive = (String)attributes.get(
			"equipmentProtectionFive");

		if (equipmentProtectionFive != null) {
			setEquipmentProtectionFive(equipmentProtectionFive);
		}

		String equipmentProtectionSix = (String)attributes.get(
			"equipmentProtectionSix");

		if (equipmentProtectionSix != null) {
			setEquipmentProtectionSix(equipmentProtectionSix);
		}

		String otherEquipment = (String)attributes.get("otherEquipment");

		if (otherEquipment != null) {
			setOtherEquipment(otherEquipment);
		}

		Long fireBrigadeApplicationId = (Long)attributes.get(
			"fireBrigadeApplicationId");

		if (fireBrigadeApplicationId != null) {
			setFireBrigadeApplicationId(fireBrigadeApplicationId);
		}
	}

	@Override
	public FireBrigadeProEquipmentInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this fire brigade pro equipment info.
	 *
	 * @return the company ID of this fire brigade pro equipment info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this fire brigade pro equipment info.
	 *
	 * @return the create date of this fire brigade pro equipment info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the equipment protection five of this fire brigade pro equipment info.
	 *
	 * @return the equipment protection five of this fire brigade pro equipment info
	 */
	@Override
	public String getEquipmentProtectionFive() {
		return model.getEquipmentProtectionFive();
	}

	/**
	 * Returns the equipment protection four of this fire brigade pro equipment info.
	 *
	 * @return the equipment protection four of this fire brigade pro equipment info
	 */
	@Override
	public String getEquipmentProtectionFour() {
		return model.getEquipmentProtectionFour();
	}

	/**
	 * Returns the equipment protection one of this fire brigade pro equipment info.
	 *
	 * @return the equipment protection one of this fire brigade pro equipment info
	 */
	@Override
	public String getEquipmentProtectionOne() {
		return model.getEquipmentProtectionOne();
	}

	/**
	 * Returns the equipment protection pre of this fire brigade pro equipment info.
	 *
	 * @return the equipment protection pre of this fire brigade pro equipment info
	 */
	@Override
	public String getEquipmentProtectionPre() {
		return model.getEquipmentProtectionPre();
	}

	/**
	 * Returns the equipment protection six of this fire brigade pro equipment info.
	 *
	 * @return the equipment protection six of this fire brigade pro equipment info
	 */
	@Override
	public String getEquipmentProtectionSix() {
		return model.getEquipmentProtectionSix();
	}

	/**
	 * Returns the equipment protection three of this fire brigade pro equipment info.
	 *
	 * @return the equipment protection three of this fire brigade pro equipment info
	 */
	@Override
	public String getEquipmentProtectionThree() {
		return model.getEquipmentProtectionThree();
	}

	/**
	 * Returns the equipment protection two of this fire brigade pro equipment info.
	 *
	 * @return the equipment protection two of this fire brigade pro equipment info
	 */
	@Override
	public String getEquipmentProtectionTwo() {
		return model.getEquipmentProtectionTwo();
	}

	/**
	 * Returns the fire brigade application ID of this fire brigade pro equipment info.
	 *
	 * @return the fire brigade application ID of this fire brigade pro equipment info
	 */
	@Override
	public long getFireBrigadeApplicationId() {
		return model.getFireBrigadeApplicationId();
	}

	/**
	 * Returns the fire brigade pro equipment info ID of this fire brigade pro equipment info.
	 *
	 * @return the fire brigade pro equipment info ID of this fire brigade pro equipment info
	 */
	@Override
	public long getFireBrigadeProEquipmentInfoId() {
		return model.getFireBrigadeProEquipmentInfoId();
	}

	/**
	 * Returns the group ID of this fire brigade pro equipment info.
	 *
	 * @return the group ID of this fire brigade pro equipment info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this fire brigade pro equipment info.
	 *
	 * @return the modified date of this fire brigade pro equipment info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the other equipment of this fire brigade pro equipment info.
	 *
	 * @return the other equipment of this fire brigade pro equipment info
	 */
	@Override
	public String getOtherEquipment() {
		return model.getOtherEquipment();
	}

	/**
	 * Returns the primary key of this fire brigade pro equipment info.
	 *
	 * @return the primary key of this fire brigade pro equipment info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this fire brigade pro equipment info.
	 *
	 * @return the user ID of this fire brigade pro equipment info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this fire brigade pro equipment info.
	 *
	 * @return the user name of this fire brigade pro equipment info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this fire brigade pro equipment info.
	 *
	 * @return the user uuid of this fire brigade pro equipment info
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
	 * Sets the company ID of this fire brigade pro equipment info.
	 *
	 * @param companyId the company ID of this fire brigade pro equipment info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this fire brigade pro equipment info.
	 *
	 * @param createDate the create date of this fire brigade pro equipment info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the equipment protection five of this fire brigade pro equipment info.
	 *
	 * @param equipmentProtectionFive the equipment protection five of this fire brigade pro equipment info
	 */
	@Override
	public void setEquipmentProtectionFive(String equipmentProtectionFive) {
		model.setEquipmentProtectionFive(equipmentProtectionFive);
	}

	/**
	 * Sets the equipment protection four of this fire brigade pro equipment info.
	 *
	 * @param equipmentProtectionFour the equipment protection four of this fire brigade pro equipment info
	 */
	@Override
	public void setEquipmentProtectionFour(String equipmentProtectionFour) {
		model.setEquipmentProtectionFour(equipmentProtectionFour);
	}

	/**
	 * Sets the equipment protection one of this fire brigade pro equipment info.
	 *
	 * @param equipmentProtectionOne the equipment protection one of this fire brigade pro equipment info
	 */
	@Override
	public void setEquipmentProtectionOne(String equipmentProtectionOne) {
		model.setEquipmentProtectionOne(equipmentProtectionOne);
	}

	/**
	 * Sets the equipment protection pre of this fire brigade pro equipment info.
	 *
	 * @param equipmentProtectionPre the equipment protection pre of this fire brigade pro equipment info
	 */
	@Override
	public void setEquipmentProtectionPre(String equipmentProtectionPre) {
		model.setEquipmentProtectionPre(equipmentProtectionPre);
	}

	/**
	 * Sets the equipment protection six of this fire brigade pro equipment info.
	 *
	 * @param equipmentProtectionSix the equipment protection six of this fire brigade pro equipment info
	 */
	@Override
	public void setEquipmentProtectionSix(String equipmentProtectionSix) {
		model.setEquipmentProtectionSix(equipmentProtectionSix);
	}

	/**
	 * Sets the equipment protection three of this fire brigade pro equipment info.
	 *
	 * @param equipmentProtectionThree the equipment protection three of this fire brigade pro equipment info
	 */
	@Override
	public void setEquipmentProtectionThree(String equipmentProtectionThree) {
		model.setEquipmentProtectionThree(equipmentProtectionThree);
	}

	/**
	 * Sets the equipment protection two of this fire brigade pro equipment info.
	 *
	 * @param equipmentProtectionTwo the equipment protection two of this fire brigade pro equipment info
	 */
	@Override
	public void setEquipmentProtectionTwo(String equipmentProtectionTwo) {
		model.setEquipmentProtectionTwo(equipmentProtectionTwo);
	}

	/**
	 * Sets the fire brigade application ID of this fire brigade pro equipment info.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID of this fire brigade pro equipment info
	 */
	@Override
	public void setFireBrigadeApplicationId(long fireBrigadeApplicationId) {
		model.setFireBrigadeApplicationId(fireBrigadeApplicationId);
	}

	/**
	 * Sets the fire brigade pro equipment info ID of this fire brigade pro equipment info.
	 *
	 * @param fireBrigadeProEquipmentInfoId the fire brigade pro equipment info ID of this fire brigade pro equipment info
	 */
	@Override
	public void setFireBrigadeProEquipmentInfoId(
		long fireBrigadeProEquipmentInfoId) {

		model.setFireBrigadeProEquipmentInfoId(fireBrigadeProEquipmentInfoId);
	}

	/**
	 * Sets the group ID of this fire brigade pro equipment info.
	 *
	 * @param groupId the group ID of this fire brigade pro equipment info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this fire brigade pro equipment info.
	 *
	 * @param modifiedDate the modified date of this fire brigade pro equipment info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the other equipment of this fire brigade pro equipment info.
	 *
	 * @param otherEquipment the other equipment of this fire brigade pro equipment info
	 */
	@Override
	public void setOtherEquipment(String otherEquipment) {
		model.setOtherEquipment(otherEquipment);
	}

	/**
	 * Sets the primary key of this fire brigade pro equipment info.
	 *
	 * @param primaryKey the primary key of this fire brigade pro equipment info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this fire brigade pro equipment info.
	 *
	 * @param userId the user ID of this fire brigade pro equipment info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this fire brigade pro equipment info.
	 *
	 * @param userName the user name of this fire brigade pro equipment info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this fire brigade pro equipment info.
	 *
	 * @param userUuid the user uuid of this fire brigade pro equipment info
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
	protected FireBrigadeProEquipmentInfoWrapper wrap(
		FireBrigadeProEquipmentInfo fireBrigadeProEquipmentInfo) {

		return new FireBrigadeProEquipmentInfoWrapper(
			fireBrigadeProEquipmentInfo);
	}

}