/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link GenerateEquipmentInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GenerateEquipmentInfo
 * @generated
 */
public class GenerateEquipmentInfoWrapper
	extends BaseModelWrapper<GenerateEquipmentInfo>
	implements GenerateEquipmentInfo, ModelWrapper<GenerateEquipmentInfo> {

	public GenerateEquipmentInfoWrapper(
		GenerateEquipmentInfo generateEquipmentInfo) {

		super(generateEquipmentInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("GenerateEquipmentInfoId", getGenerateEquipmentInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("manufacturerEquipment", getManufacturerEquipment());
		attributes.put("equipmentModel", getEquipmentModel());
		attributes.put("equipmentSerial", getEquipmentSerial());
		attributes.put("operatingPotential", getOperatingPotential());
		attributes.put("equipmentModels", getEquipmentModels());
		attributes.put("natureEquipment", getNatureEquipment());
		attributes.put("equipmentStatusDetail", getEquipmentStatusDetail());
		attributes.put("equipmentDate", getEquipmentDate());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long GenerateEquipmentInfoId = (Long)attributes.get(
			"GenerateEquipmentInfoId");

		if (GenerateEquipmentInfoId != null) {
			setGenerateEquipmentInfoId(GenerateEquipmentInfoId);
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

		String manufacturerEquipment = (String)attributes.get(
			"manufacturerEquipment");

		if (manufacturerEquipment != null) {
			setManufacturerEquipment(manufacturerEquipment);
		}

		String equipmentModel = (String)attributes.get("equipmentModel");

		if (equipmentModel != null) {
			setEquipmentModel(equipmentModel);
		}

		String equipmentSerial = (String)attributes.get("equipmentSerial");

		if (equipmentSerial != null) {
			setEquipmentSerial(equipmentSerial);
		}

		String operatingPotential = (String)attributes.get(
			"operatingPotential");

		if (operatingPotential != null) {
			setOperatingPotential(operatingPotential);
		}

		String equipmentModels = (String)attributes.get("equipmentModels");

		if (equipmentModels != null) {
			setEquipmentModels(equipmentModels);
		}

		String natureEquipment = (String)attributes.get("natureEquipment");

		if (natureEquipment != null) {
			setNatureEquipment(natureEquipment);
		}

		String equipmentStatusDetail = (String)attributes.get(
			"equipmentStatusDetail");

		if (equipmentStatusDetail != null) {
			setEquipmentStatusDetail(equipmentStatusDetail);
		}

		Date equipmentDate = (Date)attributes.get("equipmentDate");

		if (equipmentDate != null) {
			setEquipmentDate(equipmentDate);
		}

		Long hsraApplicationId = (Long)attributes.get("hsraApplicationId");

		if (hsraApplicationId != null) {
			setHsraApplicationId(hsraApplicationId);
		}
	}

	@Override
	public GenerateEquipmentInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this generate equipment info.
	 *
	 * @return the company ID of this generate equipment info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this generate equipment info.
	 *
	 * @return the create date of this generate equipment info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the equipment date of this generate equipment info.
	 *
	 * @return the equipment date of this generate equipment info
	 */
	@Override
	public Date getEquipmentDate() {
		return model.getEquipmentDate();
	}

	/**
	 * Returns the equipment model of this generate equipment info.
	 *
	 * @return the equipment model of this generate equipment info
	 */
	@Override
	public String getEquipmentModel() {
		return model.getEquipmentModel();
	}

	/**
	 * Returns the equipment models of this generate equipment info.
	 *
	 * @return the equipment models of this generate equipment info
	 */
	@Override
	public String getEquipmentModels() {
		return model.getEquipmentModels();
	}

	/**
	 * Returns the equipment serial of this generate equipment info.
	 *
	 * @return the equipment serial of this generate equipment info
	 */
	@Override
	public String getEquipmentSerial() {
		return model.getEquipmentSerial();
	}

	/**
	 * Returns the equipment status detail of this generate equipment info.
	 *
	 * @return the equipment status detail of this generate equipment info
	 */
	@Override
	public String getEquipmentStatusDetail() {
		return model.getEquipmentStatusDetail();
	}

	/**
	 * Returns the generate equipment info ID of this generate equipment info.
	 *
	 * @return the generate equipment info ID of this generate equipment info
	 */
	@Override
	public long getGenerateEquipmentInfoId() {
		return model.getGenerateEquipmentInfoId();
	}

	/**
	 * Returns the group ID of this generate equipment info.
	 *
	 * @return the group ID of this generate equipment info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application ID of this generate equipment info.
	 *
	 * @return the hsra application ID of this generate equipment info
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the manufacturer equipment of this generate equipment info.
	 *
	 * @return the manufacturer equipment of this generate equipment info
	 */
	@Override
	public String getManufacturerEquipment() {
		return model.getManufacturerEquipment();
	}

	/**
	 * Returns the modified date of this generate equipment info.
	 *
	 * @return the modified date of this generate equipment info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nature equipment of this generate equipment info.
	 *
	 * @return the nature equipment of this generate equipment info
	 */
	@Override
	public String getNatureEquipment() {
		return model.getNatureEquipment();
	}

	/**
	 * Returns the operating potential of this generate equipment info.
	 *
	 * @return the operating potential of this generate equipment info
	 */
	@Override
	public String getOperatingPotential() {
		return model.getOperatingPotential();
	}

	/**
	 * Returns the primary key of this generate equipment info.
	 *
	 * @return the primary key of this generate equipment info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this generate equipment info.
	 *
	 * @return the user ID of this generate equipment info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this generate equipment info.
	 *
	 * @return the user name of this generate equipment info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this generate equipment info.
	 *
	 * @return the user uuid of this generate equipment info
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
	 * Sets the company ID of this generate equipment info.
	 *
	 * @param companyId the company ID of this generate equipment info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this generate equipment info.
	 *
	 * @param createDate the create date of this generate equipment info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the equipment date of this generate equipment info.
	 *
	 * @param equipmentDate the equipment date of this generate equipment info
	 */
	@Override
	public void setEquipmentDate(Date equipmentDate) {
		model.setEquipmentDate(equipmentDate);
	}

	/**
	 * Sets the equipment model of this generate equipment info.
	 *
	 * @param equipmentModel the equipment model of this generate equipment info
	 */
	@Override
	public void setEquipmentModel(String equipmentModel) {
		model.setEquipmentModel(equipmentModel);
	}

	/**
	 * Sets the equipment models of this generate equipment info.
	 *
	 * @param equipmentModels the equipment models of this generate equipment info
	 */
	@Override
	public void setEquipmentModels(String equipmentModels) {
		model.setEquipmentModels(equipmentModels);
	}

	/**
	 * Sets the equipment serial of this generate equipment info.
	 *
	 * @param equipmentSerial the equipment serial of this generate equipment info
	 */
	@Override
	public void setEquipmentSerial(String equipmentSerial) {
		model.setEquipmentSerial(equipmentSerial);
	}

	/**
	 * Sets the equipment status detail of this generate equipment info.
	 *
	 * @param equipmentStatusDetail the equipment status detail of this generate equipment info
	 */
	@Override
	public void setEquipmentStatusDetail(String equipmentStatusDetail) {
		model.setEquipmentStatusDetail(equipmentStatusDetail);
	}

	/**
	 * Sets the generate equipment info ID of this generate equipment info.
	 *
	 * @param GenerateEquipmentInfoId the generate equipment info ID of this generate equipment info
	 */
	@Override
	public void setGenerateEquipmentInfoId(long GenerateEquipmentInfoId) {
		model.setGenerateEquipmentInfoId(GenerateEquipmentInfoId);
	}

	/**
	 * Sets the group ID of this generate equipment info.
	 *
	 * @param groupId the group ID of this generate equipment info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application ID of this generate equipment info.
	 *
	 * @param hsraApplicationId the hsra application ID of this generate equipment info
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the manufacturer equipment of this generate equipment info.
	 *
	 * @param manufacturerEquipment the manufacturer equipment of this generate equipment info
	 */
	@Override
	public void setManufacturerEquipment(String manufacturerEquipment) {
		model.setManufacturerEquipment(manufacturerEquipment);
	}

	/**
	 * Sets the modified date of this generate equipment info.
	 *
	 * @param modifiedDate the modified date of this generate equipment info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nature equipment of this generate equipment info.
	 *
	 * @param natureEquipment the nature equipment of this generate equipment info
	 */
	@Override
	public void setNatureEquipment(String natureEquipment) {
		model.setNatureEquipment(natureEquipment);
	}

	/**
	 * Sets the operating potential of this generate equipment info.
	 *
	 * @param operatingPotential the operating potential of this generate equipment info
	 */
	@Override
	public void setOperatingPotential(String operatingPotential) {
		model.setOperatingPotential(operatingPotential);
	}

	/**
	 * Sets the primary key of this generate equipment info.
	 *
	 * @param primaryKey the primary key of this generate equipment info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this generate equipment info.
	 *
	 * @param userId the user ID of this generate equipment info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this generate equipment info.
	 *
	 * @param userName the user name of this generate equipment info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this generate equipment info.
	 *
	 * @param userUuid the user uuid of this generate equipment info
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
	protected GenerateEquipmentInfoWrapper wrap(
		GenerateEquipmentInfo generateEquipmentInfo) {

		return new GenerateEquipmentInfoWrapper(generateEquipmentInfo);
	}

}