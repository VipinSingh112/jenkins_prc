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
 * This class is a wrapper for {@link SezOccupantInvestAndFinanceInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantInvestAndFinanceInfo
 * @generated
 */
public class SezOccupantInvestAndFinanceInfoWrapper
	extends BaseModelWrapper<SezOccupantInvestAndFinanceInfo>
	implements ModelWrapper<SezOccupantInvestAndFinanceInfo>,
			   SezOccupantInvestAndFinanceInfo {

	public SezOccupantInvestAndFinanceInfoWrapper(
		SezOccupantInvestAndFinanceInfo sezOccupantInvestAndFinanceInfo) {

		super(sezOccupantInvestAndFinanceInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sezOccInvestFinancId", getSezOccInvestFinancId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("occInfraBuilding", getOccInfraBuilding());
		attributes.put("occInfraEquipment", getOccInfraEquipment());
		attributes.put("occInfraMachines", getOccInfraMachines());
		attributes.put("occInfraTotal", getOccInfraTotal());
		attributes.put("occInfraFinanceSource", getOccInfraFinanceSource());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezOccInvestFinancId = (Long)attributes.get(
			"sezOccInvestFinancId");

		if (sezOccInvestFinancId != null) {
			setSezOccInvestFinancId(sezOccInvestFinancId);
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

		String occInfraBuilding = (String)attributes.get("occInfraBuilding");

		if (occInfraBuilding != null) {
			setOccInfraBuilding(occInfraBuilding);
		}

		String occInfraEquipment = (String)attributes.get("occInfraEquipment");

		if (occInfraEquipment != null) {
			setOccInfraEquipment(occInfraEquipment);
		}

		String occInfraMachines = (String)attributes.get("occInfraMachines");

		if (occInfraMachines != null) {
			setOccInfraMachines(occInfraMachines);
		}

		String occInfraTotal = (String)attributes.get("occInfraTotal");

		if (occInfraTotal != null) {
			setOccInfraTotal(occInfraTotal);
		}

		String occInfraFinanceSource = (String)attributes.get(
			"occInfraFinanceSource");

		if (occInfraFinanceSource != null) {
			setOccInfraFinanceSource(occInfraFinanceSource);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezOccupantInvestAndFinanceInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this sez occupant invest and finance info.
	 *
	 * @return the company ID of this sez occupant invest and finance info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sez occupant invest and finance info.
	 *
	 * @return the create date of this sez occupant invest and finance info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this sez occupant invest and finance info.
	 *
	 * @return the group ID of this sez occupant invest and finance info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez occupant invest and finance info.
	 *
	 * @return the modified date of this sez occupant invest and finance info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the occ infra building of this sez occupant invest and finance info.
	 *
	 * @return the occ infra building of this sez occupant invest and finance info
	 */
	@Override
	public String getOccInfraBuilding() {
		return model.getOccInfraBuilding();
	}

	/**
	 * Returns the occ infra equipment of this sez occupant invest and finance info.
	 *
	 * @return the occ infra equipment of this sez occupant invest and finance info
	 */
	@Override
	public String getOccInfraEquipment() {
		return model.getOccInfraEquipment();
	}

	/**
	 * Returns the occ infra finance source of this sez occupant invest and finance info.
	 *
	 * @return the occ infra finance source of this sez occupant invest and finance info
	 */
	@Override
	public String getOccInfraFinanceSource() {
		return model.getOccInfraFinanceSource();
	}

	/**
	 * Returns the occ infra machines of this sez occupant invest and finance info.
	 *
	 * @return the occ infra machines of this sez occupant invest and finance info
	 */
	@Override
	public String getOccInfraMachines() {
		return model.getOccInfraMachines();
	}

	/**
	 * Returns the occ infra total of this sez occupant invest and finance info.
	 *
	 * @return the occ infra total of this sez occupant invest and finance info
	 */
	@Override
	public String getOccInfraTotal() {
		return model.getOccInfraTotal();
	}

	/**
	 * Returns the primary key of this sez occupant invest and finance info.
	 *
	 * @return the primary key of this sez occupant invest and finance info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez occ invest financ ID of this sez occupant invest and finance info.
	 *
	 * @return the sez occ invest financ ID of this sez occupant invest and finance info
	 */
	@Override
	public long getSezOccInvestFinancId() {
		return model.getSezOccInvestFinancId();
	}

	/**
	 * Returns the sez status application ID of this sez occupant invest and finance info.
	 *
	 * @return the sez status application ID of this sez occupant invest and finance info
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the user ID of this sez occupant invest and finance info.
	 *
	 * @return the user ID of this sez occupant invest and finance info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez occupant invest and finance info.
	 *
	 * @return the user name of this sez occupant invest and finance info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez occupant invest and finance info.
	 *
	 * @return the user uuid of this sez occupant invest and finance info
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
	 * Sets the company ID of this sez occupant invest and finance info.
	 *
	 * @param companyId the company ID of this sez occupant invest and finance info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sez occupant invest and finance info.
	 *
	 * @param createDate the create date of this sez occupant invest and finance info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this sez occupant invest and finance info.
	 *
	 * @param groupId the group ID of this sez occupant invest and finance info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez occupant invest and finance info.
	 *
	 * @param modifiedDate the modified date of this sez occupant invest and finance info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the occ infra building of this sez occupant invest and finance info.
	 *
	 * @param occInfraBuilding the occ infra building of this sez occupant invest and finance info
	 */
	@Override
	public void setOccInfraBuilding(String occInfraBuilding) {
		model.setOccInfraBuilding(occInfraBuilding);
	}

	/**
	 * Sets the occ infra equipment of this sez occupant invest and finance info.
	 *
	 * @param occInfraEquipment the occ infra equipment of this sez occupant invest and finance info
	 */
	@Override
	public void setOccInfraEquipment(String occInfraEquipment) {
		model.setOccInfraEquipment(occInfraEquipment);
	}

	/**
	 * Sets the occ infra finance source of this sez occupant invest and finance info.
	 *
	 * @param occInfraFinanceSource the occ infra finance source of this sez occupant invest and finance info
	 */
	@Override
	public void setOccInfraFinanceSource(String occInfraFinanceSource) {
		model.setOccInfraFinanceSource(occInfraFinanceSource);
	}

	/**
	 * Sets the occ infra machines of this sez occupant invest and finance info.
	 *
	 * @param occInfraMachines the occ infra machines of this sez occupant invest and finance info
	 */
	@Override
	public void setOccInfraMachines(String occInfraMachines) {
		model.setOccInfraMachines(occInfraMachines);
	}

	/**
	 * Sets the occ infra total of this sez occupant invest and finance info.
	 *
	 * @param occInfraTotal the occ infra total of this sez occupant invest and finance info
	 */
	@Override
	public void setOccInfraTotal(String occInfraTotal) {
		model.setOccInfraTotal(occInfraTotal);
	}

	/**
	 * Sets the primary key of this sez occupant invest and finance info.
	 *
	 * @param primaryKey the primary key of this sez occupant invest and finance info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez occ invest financ ID of this sez occupant invest and finance info.
	 *
	 * @param sezOccInvestFinancId the sez occ invest financ ID of this sez occupant invest and finance info
	 */
	@Override
	public void setSezOccInvestFinancId(long sezOccInvestFinancId) {
		model.setSezOccInvestFinancId(sezOccInvestFinancId);
	}

	/**
	 * Sets the sez status application ID of this sez occupant invest and finance info.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez occupant invest and finance info
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the user ID of this sez occupant invest and finance info.
	 *
	 * @param userId the user ID of this sez occupant invest and finance info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez occupant invest and finance info.
	 *
	 * @param userName the user name of this sez occupant invest and finance info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez occupant invest and finance info.
	 *
	 * @param userUuid the user uuid of this sez occupant invest and finance info
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
	protected SezOccupantInvestAndFinanceInfoWrapper wrap(
		SezOccupantInvestAndFinanceInfo sezOccupantInvestAndFinanceInfo) {

		return new SezOccupantInvestAndFinanceInfoWrapper(
			sezOccupantInvestAndFinanceInfo);
	}

}