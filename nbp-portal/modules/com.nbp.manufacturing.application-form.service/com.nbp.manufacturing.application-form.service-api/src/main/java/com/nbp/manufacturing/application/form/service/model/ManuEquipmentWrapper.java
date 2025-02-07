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
 * This class is a wrapper for {@link ManuEquipment}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuEquipment
 * @generated
 */
public class ManuEquipmentWrapper
	extends BaseModelWrapper<ManuEquipment>
	implements ManuEquipment, ModelWrapper<ManuEquipment> {

	public ManuEquipmentWrapper(ManuEquipment manuEquipment) {
		super(manuEquipment);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("manuEquipmentId", getManuEquipmentId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("equipmentImported", getEquipmentImported());
		attributes.put("land", getLand());
		attributes.put("equipment", getEquipment());
		attributes.put("building", getBuilding());
		attributes.put("Other", getOther());
		attributes.put("equipmentName", getEquipmentName());
		attributes.put("jamaicanDollor", getJamaicanDollor());
		attributes.put("capitalExpenditure", getCapitalExpenditure());
		attributes.put("nameOFPurpose", getNameOFPurpose());
		attributes.put("equipmentMaintained", getEquipmentMaintained());
		attributes.put("equipmentCreated", getEquipmentCreated());
		attributes.put("skilledEmp", getSkilledEmp());
		attributes.put("clericalEmp", getClericalEmp());
		attributes.put("otherEmp", getOtherEmp());
		attributes.put("totalEmp", getTotalEmp());
		attributes.put(
			"manufacturingApplicationId", getManufacturingApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long manuEquipmentId = (Long)attributes.get("manuEquipmentId");

		if (manuEquipmentId != null) {
			setManuEquipmentId(manuEquipmentId);
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

		String equipmentImported = (String)attributes.get("equipmentImported");

		if (equipmentImported != null) {
			setEquipmentImported(equipmentImported);
		}

		String land = (String)attributes.get("land");

		if (land != null) {
			setLand(land);
		}

		String equipment = (String)attributes.get("equipment");

		if (equipment != null) {
			setEquipment(equipment);
		}

		String building = (String)attributes.get("building");

		if (building != null) {
			setBuilding(building);
		}

		String Other = (String)attributes.get("Other");

		if (Other != null) {
			setOther(Other);
		}

		String equipmentName = (String)attributes.get("equipmentName");

		if (equipmentName != null) {
			setEquipmentName(equipmentName);
		}

		String jamaicanDollor = (String)attributes.get("jamaicanDollor");

		if (jamaicanDollor != null) {
			setJamaicanDollor(jamaicanDollor);
		}

		String capitalExpenditure = (String)attributes.get(
			"capitalExpenditure");

		if (capitalExpenditure != null) {
			setCapitalExpenditure(capitalExpenditure);
		}

		String nameOFPurpose = (String)attributes.get("nameOFPurpose");

		if (nameOFPurpose != null) {
			setNameOFPurpose(nameOFPurpose);
		}

		String equipmentMaintained = (String)attributes.get(
			"equipmentMaintained");

		if (equipmentMaintained != null) {
			setEquipmentMaintained(equipmentMaintained);
		}

		String equipmentCreated = (String)attributes.get("equipmentCreated");

		if (equipmentCreated != null) {
			setEquipmentCreated(equipmentCreated);
		}

		String skilledEmp = (String)attributes.get("skilledEmp");

		if (skilledEmp != null) {
			setSkilledEmp(skilledEmp);
		}

		String clericalEmp = (String)attributes.get("clericalEmp");

		if (clericalEmp != null) {
			setClericalEmp(clericalEmp);
		}

		String otherEmp = (String)attributes.get("otherEmp");

		if (otherEmp != null) {
			setOtherEmp(otherEmp);
		}

		String totalEmp = (String)attributes.get("totalEmp");

		if (totalEmp != null) {
			setTotalEmp(totalEmp);
		}

		Long manufacturingApplicationId = (Long)attributes.get(
			"manufacturingApplicationId");

		if (manufacturingApplicationId != null) {
			setManufacturingApplicationId(manufacturingApplicationId);
		}
	}

	@Override
	public ManuEquipment cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the building of this manu equipment.
	 *
	 * @return the building of this manu equipment
	 */
	@Override
	public String getBuilding() {
		return model.getBuilding();
	}

	/**
	 * Returns the capital expenditure of this manu equipment.
	 *
	 * @return the capital expenditure of this manu equipment
	 */
	@Override
	public String getCapitalExpenditure() {
		return model.getCapitalExpenditure();
	}

	/**
	 * Returns the clerical emp of this manu equipment.
	 *
	 * @return the clerical emp of this manu equipment
	 */
	@Override
	public String getClericalEmp() {
		return model.getClericalEmp();
	}

	/**
	 * Returns the company ID of this manu equipment.
	 *
	 * @return the company ID of this manu equipment
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this manu equipment.
	 *
	 * @return the create date of this manu equipment
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the equipment of this manu equipment.
	 *
	 * @return the equipment of this manu equipment
	 */
	@Override
	public String getEquipment() {
		return model.getEquipment();
	}

	/**
	 * Returns the equipment created of this manu equipment.
	 *
	 * @return the equipment created of this manu equipment
	 */
	@Override
	public String getEquipmentCreated() {
		return model.getEquipmentCreated();
	}

	/**
	 * Returns the equipment imported of this manu equipment.
	 *
	 * @return the equipment imported of this manu equipment
	 */
	@Override
	public String getEquipmentImported() {
		return model.getEquipmentImported();
	}

	/**
	 * Returns the equipment maintained of this manu equipment.
	 *
	 * @return the equipment maintained of this manu equipment
	 */
	@Override
	public String getEquipmentMaintained() {
		return model.getEquipmentMaintained();
	}

	/**
	 * Returns the equipment name of this manu equipment.
	 *
	 * @return the equipment name of this manu equipment
	 */
	@Override
	public String getEquipmentName() {
		return model.getEquipmentName();
	}

	/**
	 * Returns the group ID of this manu equipment.
	 *
	 * @return the group ID of this manu equipment
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jamaican dollor of this manu equipment.
	 *
	 * @return the jamaican dollor of this manu equipment
	 */
	@Override
	public String getJamaicanDollor() {
		return model.getJamaicanDollor();
	}

	/**
	 * Returns the land of this manu equipment.
	 *
	 * @return the land of this manu equipment
	 */
	@Override
	public String getLand() {
		return model.getLand();
	}

	/**
	 * Returns the manu equipment ID of this manu equipment.
	 *
	 * @return the manu equipment ID of this manu equipment
	 */
	@Override
	public long getManuEquipmentId() {
		return model.getManuEquipmentId();
	}

	/**
	 * Returns the manufacturing application ID of this manu equipment.
	 *
	 * @return the manufacturing application ID of this manu equipment
	 */
	@Override
	public long getManufacturingApplicationId() {
		return model.getManufacturingApplicationId();
	}

	/**
	 * Returns the modified date of this manu equipment.
	 *
	 * @return the modified date of this manu equipment
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of purpose of this manu equipment.
	 *
	 * @return the name of purpose of this manu equipment
	 */
	@Override
	public String getNameOFPurpose() {
		return model.getNameOFPurpose();
	}

	/**
	 * Returns the other of this manu equipment.
	 *
	 * @return the other of this manu equipment
	 */
	@Override
	public String getOther() {
		return model.getOther();
	}

	/**
	 * Returns the other emp of this manu equipment.
	 *
	 * @return the other emp of this manu equipment
	 */
	@Override
	public String getOtherEmp() {
		return model.getOtherEmp();
	}

	/**
	 * Returns the primary key of this manu equipment.
	 *
	 * @return the primary key of this manu equipment
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the skilled emp of this manu equipment.
	 *
	 * @return the skilled emp of this manu equipment
	 */
	@Override
	public String getSkilledEmp() {
		return model.getSkilledEmp();
	}

	/**
	 * Returns the total emp of this manu equipment.
	 *
	 * @return the total emp of this manu equipment
	 */
	@Override
	public String getTotalEmp() {
		return model.getTotalEmp();
	}

	/**
	 * Returns the user ID of this manu equipment.
	 *
	 * @return the user ID of this manu equipment
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this manu equipment.
	 *
	 * @return the user name of this manu equipment
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this manu equipment.
	 *
	 * @return the user uuid of this manu equipment
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
	 * Sets the building of this manu equipment.
	 *
	 * @param building the building of this manu equipment
	 */
	@Override
	public void setBuilding(String building) {
		model.setBuilding(building);
	}

	/**
	 * Sets the capital expenditure of this manu equipment.
	 *
	 * @param capitalExpenditure the capital expenditure of this manu equipment
	 */
	@Override
	public void setCapitalExpenditure(String capitalExpenditure) {
		model.setCapitalExpenditure(capitalExpenditure);
	}

	/**
	 * Sets the clerical emp of this manu equipment.
	 *
	 * @param clericalEmp the clerical emp of this manu equipment
	 */
	@Override
	public void setClericalEmp(String clericalEmp) {
		model.setClericalEmp(clericalEmp);
	}

	/**
	 * Sets the company ID of this manu equipment.
	 *
	 * @param companyId the company ID of this manu equipment
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this manu equipment.
	 *
	 * @param createDate the create date of this manu equipment
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the equipment of this manu equipment.
	 *
	 * @param equipment the equipment of this manu equipment
	 */
	@Override
	public void setEquipment(String equipment) {
		model.setEquipment(equipment);
	}

	/**
	 * Sets the equipment created of this manu equipment.
	 *
	 * @param equipmentCreated the equipment created of this manu equipment
	 */
	@Override
	public void setEquipmentCreated(String equipmentCreated) {
		model.setEquipmentCreated(equipmentCreated);
	}

	/**
	 * Sets the equipment imported of this manu equipment.
	 *
	 * @param equipmentImported the equipment imported of this manu equipment
	 */
	@Override
	public void setEquipmentImported(String equipmentImported) {
		model.setEquipmentImported(equipmentImported);
	}

	/**
	 * Sets the equipment maintained of this manu equipment.
	 *
	 * @param equipmentMaintained the equipment maintained of this manu equipment
	 */
	@Override
	public void setEquipmentMaintained(String equipmentMaintained) {
		model.setEquipmentMaintained(equipmentMaintained);
	}

	/**
	 * Sets the equipment name of this manu equipment.
	 *
	 * @param equipmentName the equipment name of this manu equipment
	 */
	@Override
	public void setEquipmentName(String equipmentName) {
		model.setEquipmentName(equipmentName);
	}

	/**
	 * Sets the group ID of this manu equipment.
	 *
	 * @param groupId the group ID of this manu equipment
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jamaican dollor of this manu equipment.
	 *
	 * @param jamaicanDollor the jamaican dollor of this manu equipment
	 */
	@Override
	public void setJamaicanDollor(String jamaicanDollor) {
		model.setJamaicanDollor(jamaicanDollor);
	}

	/**
	 * Sets the land of this manu equipment.
	 *
	 * @param land the land of this manu equipment
	 */
	@Override
	public void setLand(String land) {
		model.setLand(land);
	}

	/**
	 * Sets the manu equipment ID of this manu equipment.
	 *
	 * @param manuEquipmentId the manu equipment ID of this manu equipment
	 */
	@Override
	public void setManuEquipmentId(long manuEquipmentId) {
		model.setManuEquipmentId(manuEquipmentId);
	}

	/**
	 * Sets the manufacturing application ID of this manu equipment.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID of this manu equipment
	 */
	@Override
	public void setManufacturingApplicationId(long manufacturingApplicationId) {
		model.setManufacturingApplicationId(manufacturingApplicationId);
	}

	/**
	 * Sets the modified date of this manu equipment.
	 *
	 * @param modifiedDate the modified date of this manu equipment
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of purpose of this manu equipment.
	 *
	 * @param nameOFPurpose the name of purpose of this manu equipment
	 */
	@Override
	public void setNameOFPurpose(String nameOFPurpose) {
		model.setNameOFPurpose(nameOFPurpose);
	}

	/**
	 * Sets the other of this manu equipment.
	 *
	 * @param Other the other of this manu equipment
	 */
	@Override
	public void setOther(String Other) {
		model.setOther(Other);
	}

	/**
	 * Sets the other emp of this manu equipment.
	 *
	 * @param otherEmp the other emp of this manu equipment
	 */
	@Override
	public void setOtherEmp(String otherEmp) {
		model.setOtherEmp(otherEmp);
	}

	/**
	 * Sets the primary key of this manu equipment.
	 *
	 * @param primaryKey the primary key of this manu equipment
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the skilled emp of this manu equipment.
	 *
	 * @param skilledEmp the skilled emp of this manu equipment
	 */
	@Override
	public void setSkilledEmp(String skilledEmp) {
		model.setSkilledEmp(skilledEmp);
	}

	/**
	 * Sets the total emp of this manu equipment.
	 *
	 * @param totalEmp the total emp of this manu equipment
	 */
	@Override
	public void setTotalEmp(String totalEmp) {
		model.setTotalEmp(totalEmp);
	}

	/**
	 * Sets the user ID of this manu equipment.
	 *
	 * @param userId the user ID of this manu equipment
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this manu equipment.
	 *
	 * @param userName the user name of this manu equipment
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this manu equipment.
	 *
	 * @param userUuid the user uuid of this manu equipment
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
	protected ManuEquipmentWrapper wrap(ManuEquipment manuEquipment) {
		return new ManuEquipmentWrapper(manuEquipment);
	}

}