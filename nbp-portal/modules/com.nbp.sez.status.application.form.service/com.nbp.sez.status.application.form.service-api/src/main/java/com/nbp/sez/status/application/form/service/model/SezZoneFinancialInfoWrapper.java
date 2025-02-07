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
 * This class is a wrapper for {@link SezZoneFinancialInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneFinancialInfo
 * @generated
 */
public class SezZoneFinancialInfoWrapper
	extends BaseModelWrapper<SezZoneFinancialInfo>
	implements ModelWrapper<SezZoneFinancialInfo>, SezZoneFinancialInfo {

	public SezZoneFinancialInfoWrapper(
		SezZoneFinancialInfo sezZoneFinancialInfo) {

		super(sezZoneFinancialInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sezZoneFinancialnfoId", getSezZoneFinancialnfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("buildingInfrastructure", getBuildingInfrastructure());
		attributes.put("equipmentInfrastructure", getEquipmentInfrastructure());
		attributes.put("machinesInfrastructure", getMachinesInfrastructure());
		attributes.put("totalInfrastructure", getTotalInfrastructure());
		attributes.put("financeSource", getFinanceSource());
		attributes.put("otherFinanceSource", getOtherFinanceSource());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezZoneFinancialnfoId = (Long)attributes.get(
			"sezZoneFinancialnfoId");

		if (sezZoneFinancialnfoId != null) {
			setSezZoneFinancialnfoId(sezZoneFinancialnfoId);
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

		String buildingInfrastructure = (String)attributes.get(
			"buildingInfrastructure");

		if (buildingInfrastructure != null) {
			setBuildingInfrastructure(buildingInfrastructure);
		}

		String equipmentInfrastructure = (String)attributes.get(
			"equipmentInfrastructure");

		if (equipmentInfrastructure != null) {
			setEquipmentInfrastructure(equipmentInfrastructure);
		}

		String machinesInfrastructure = (String)attributes.get(
			"machinesInfrastructure");

		if (machinesInfrastructure != null) {
			setMachinesInfrastructure(machinesInfrastructure);
		}

		String totalInfrastructure = (String)attributes.get(
			"totalInfrastructure");

		if (totalInfrastructure != null) {
			setTotalInfrastructure(totalInfrastructure);
		}

		String financeSource = (String)attributes.get("financeSource");

		if (financeSource != null) {
			setFinanceSource(financeSource);
		}

		String otherFinanceSource = (String)attributes.get(
			"otherFinanceSource");

		if (otherFinanceSource != null) {
			setOtherFinanceSource(otherFinanceSource);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezZoneFinancialInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the building infrastructure of this sez zone financial info.
	 *
	 * @return the building infrastructure of this sez zone financial info
	 */
	@Override
	public String getBuildingInfrastructure() {
		return model.getBuildingInfrastructure();
	}

	/**
	 * Returns the company ID of this sez zone financial info.
	 *
	 * @return the company ID of this sez zone financial info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sez zone financial info.
	 *
	 * @return the create date of this sez zone financial info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the equipment infrastructure of this sez zone financial info.
	 *
	 * @return the equipment infrastructure of this sez zone financial info
	 */
	@Override
	public String getEquipmentInfrastructure() {
		return model.getEquipmentInfrastructure();
	}

	/**
	 * Returns the finance source of this sez zone financial info.
	 *
	 * @return the finance source of this sez zone financial info
	 */
	@Override
	public String getFinanceSource() {
		return model.getFinanceSource();
	}

	/**
	 * Returns the group ID of this sez zone financial info.
	 *
	 * @return the group ID of this sez zone financial info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the machines infrastructure of this sez zone financial info.
	 *
	 * @return the machines infrastructure of this sez zone financial info
	 */
	@Override
	public String getMachinesInfrastructure() {
		return model.getMachinesInfrastructure();
	}

	/**
	 * Returns the modified date of this sez zone financial info.
	 *
	 * @return the modified date of this sez zone financial info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the other finance source of this sez zone financial info.
	 *
	 * @return the other finance source of this sez zone financial info
	 */
	@Override
	public String getOtherFinanceSource() {
		return model.getOtherFinanceSource();
	}

	/**
	 * Returns the primary key of this sez zone financial info.
	 *
	 * @return the primary key of this sez zone financial info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez status application ID of this sez zone financial info.
	 *
	 * @return the sez status application ID of this sez zone financial info
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the sez zone financialnfo ID of this sez zone financial info.
	 *
	 * @return the sez zone financialnfo ID of this sez zone financial info
	 */
	@Override
	public long getSezZoneFinancialnfoId() {
		return model.getSezZoneFinancialnfoId();
	}

	/**
	 * Returns the total infrastructure of this sez zone financial info.
	 *
	 * @return the total infrastructure of this sez zone financial info
	 */
	@Override
	public String getTotalInfrastructure() {
		return model.getTotalInfrastructure();
	}

	/**
	 * Returns the user ID of this sez zone financial info.
	 *
	 * @return the user ID of this sez zone financial info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez zone financial info.
	 *
	 * @return the user name of this sez zone financial info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez zone financial info.
	 *
	 * @return the user uuid of this sez zone financial info
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
	 * Sets the building infrastructure of this sez zone financial info.
	 *
	 * @param buildingInfrastructure the building infrastructure of this sez zone financial info
	 */
	@Override
	public void setBuildingInfrastructure(String buildingInfrastructure) {
		model.setBuildingInfrastructure(buildingInfrastructure);
	}

	/**
	 * Sets the company ID of this sez zone financial info.
	 *
	 * @param companyId the company ID of this sez zone financial info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sez zone financial info.
	 *
	 * @param createDate the create date of this sez zone financial info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the equipment infrastructure of this sez zone financial info.
	 *
	 * @param equipmentInfrastructure the equipment infrastructure of this sez zone financial info
	 */
	@Override
	public void setEquipmentInfrastructure(String equipmentInfrastructure) {
		model.setEquipmentInfrastructure(equipmentInfrastructure);
	}

	/**
	 * Sets the finance source of this sez zone financial info.
	 *
	 * @param financeSource the finance source of this sez zone financial info
	 */
	@Override
	public void setFinanceSource(String financeSource) {
		model.setFinanceSource(financeSource);
	}

	/**
	 * Sets the group ID of this sez zone financial info.
	 *
	 * @param groupId the group ID of this sez zone financial info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the machines infrastructure of this sez zone financial info.
	 *
	 * @param machinesInfrastructure the machines infrastructure of this sez zone financial info
	 */
	@Override
	public void setMachinesInfrastructure(String machinesInfrastructure) {
		model.setMachinesInfrastructure(machinesInfrastructure);
	}

	/**
	 * Sets the modified date of this sez zone financial info.
	 *
	 * @param modifiedDate the modified date of this sez zone financial info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the other finance source of this sez zone financial info.
	 *
	 * @param otherFinanceSource the other finance source of this sez zone financial info
	 */
	@Override
	public void setOtherFinanceSource(String otherFinanceSource) {
		model.setOtherFinanceSource(otherFinanceSource);
	}

	/**
	 * Sets the primary key of this sez zone financial info.
	 *
	 * @param primaryKey the primary key of this sez zone financial info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez status application ID of this sez zone financial info.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez zone financial info
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the sez zone financialnfo ID of this sez zone financial info.
	 *
	 * @param sezZoneFinancialnfoId the sez zone financialnfo ID of this sez zone financial info
	 */
	@Override
	public void setSezZoneFinancialnfoId(long sezZoneFinancialnfoId) {
		model.setSezZoneFinancialnfoId(sezZoneFinancialnfoId);
	}

	/**
	 * Sets the total infrastructure of this sez zone financial info.
	 *
	 * @param totalInfrastructure the total infrastructure of this sez zone financial info
	 */
	@Override
	public void setTotalInfrastructure(String totalInfrastructure) {
		model.setTotalInfrastructure(totalInfrastructure);
	}

	/**
	 * Sets the user ID of this sez zone financial info.
	 *
	 * @param userId the user ID of this sez zone financial info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez zone financial info.
	 *
	 * @param userName the user name of this sez zone financial info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez zone financial info.
	 *
	 * @param userUuid the user uuid of this sez zone financial info
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
	protected SezZoneFinancialInfoWrapper wrap(
		SezZoneFinancialInfo sezZoneFinancialInfo) {

		return new SezZoneFinancialInfoWrapper(sezZoneFinancialInfo);
	}

}