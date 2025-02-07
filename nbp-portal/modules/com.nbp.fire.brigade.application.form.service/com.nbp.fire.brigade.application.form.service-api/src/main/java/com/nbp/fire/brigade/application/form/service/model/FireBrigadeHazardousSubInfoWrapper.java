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
 * This class is a wrapper for {@link FireBrigadeHazardousSubInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeHazardousSubInfo
 * @generated
 */
public class FireBrigadeHazardousSubInfoWrapper
	extends BaseModelWrapper<FireBrigadeHazardousSubInfo>
	implements FireBrigadeHazardousSubInfo,
			   ModelWrapper<FireBrigadeHazardousSubInfo> {

	public FireBrigadeHazardousSubInfoWrapper(
		FireBrigadeHazardousSubInfo fireBrigadeHazardousSubInfo) {

		super(fireBrigadeHazardousSubInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"fireBrigadeHazardousSubInfoId",
			getFireBrigadeHazardousSubInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("lpgCylinder", getLpgCylinder());
		attributes.put("flammableGases", getFlammableGases());
		attributes.put(
			"flammableCombustibleLiquid", getFlammableCombustibleLiquid());
		attributes.put("chemicalsLiquid", getChemicalsLiquid());
		attributes.put("chemicalsPowder", getChemicalsPowder());
		attributes.put("explosives", getExplosives());
		attributes.put("otherHazardousSubstance", getOtherHazardousSubstance());
		attributes.put(
			"fireBrigadeApplicationId", getFireBrigadeApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long fireBrigadeHazardousSubInfoId = (Long)attributes.get(
			"fireBrigadeHazardousSubInfoId");

		if (fireBrigadeHazardousSubInfoId != null) {
			setFireBrigadeHazardousSubInfoId(fireBrigadeHazardousSubInfoId);
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

		String lpgCylinder = (String)attributes.get("lpgCylinder");

		if (lpgCylinder != null) {
			setLpgCylinder(lpgCylinder);
		}

		String flammableGases = (String)attributes.get("flammableGases");

		if (flammableGases != null) {
			setFlammableGases(flammableGases);
		}

		String flammableCombustibleLiquid = (String)attributes.get(
			"flammableCombustibleLiquid");

		if (flammableCombustibleLiquid != null) {
			setFlammableCombustibleLiquid(flammableCombustibleLiquid);
		}

		String chemicalsLiquid = (String)attributes.get("chemicalsLiquid");

		if (chemicalsLiquid != null) {
			setChemicalsLiquid(chemicalsLiquid);
		}

		String chemicalsPowder = (String)attributes.get("chemicalsPowder");

		if (chemicalsPowder != null) {
			setChemicalsPowder(chemicalsPowder);
		}

		String explosives = (String)attributes.get("explosives");

		if (explosives != null) {
			setExplosives(explosives);
		}

		String otherHazardousSubstance = (String)attributes.get(
			"otherHazardousSubstance");

		if (otherHazardousSubstance != null) {
			setOtherHazardousSubstance(otherHazardousSubstance);
		}

		Long fireBrigadeApplicationId = (Long)attributes.get(
			"fireBrigadeApplicationId");

		if (fireBrigadeApplicationId != null) {
			setFireBrigadeApplicationId(fireBrigadeApplicationId);
		}
	}

	@Override
	public FireBrigadeHazardousSubInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the chemicals liquid of this fire brigade hazardous sub info.
	 *
	 * @return the chemicals liquid of this fire brigade hazardous sub info
	 */
	@Override
	public String getChemicalsLiquid() {
		return model.getChemicalsLiquid();
	}

	/**
	 * Returns the chemicals powder of this fire brigade hazardous sub info.
	 *
	 * @return the chemicals powder of this fire brigade hazardous sub info
	 */
	@Override
	public String getChemicalsPowder() {
		return model.getChemicalsPowder();
	}

	/**
	 * Returns the company ID of this fire brigade hazardous sub info.
	 *
	 * @return the company ID of this fire brigade hazardous sub info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this fire brigade hazardous sub info.
	 *
	 * @return the create date of this fire brigade hazardous sub info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the explosives of this fire brigade hazardous sub info.
	 *
	 * @return the explosives of this fire brigade hazardous sub info
	 */
	@Override
	public String getExplosives() {
		return model.getExplosives();
	}

	/**
	 * Returns the fire brigade application ID of this fire brigade hazardous sub info.
	 *
	 * @return the fire brigade application ID of this fire brigade hazardous sub info
	 */
	@Override
	public long getFireBrigadeApplicationId() {
		return model.getFireBrigadeApplicationId();
	}

	/**
	 * Returns the fire brigade hazardous sub info ID of this fire brigade hazardous sub info.
	 *
	 * @return the fire brigade hazardous sub info ID of this fire brigade hazardous sub info
	 */
	@Override
	public long getFireBrigadeHazardousSubInfoId() {
		return model.getFireBrigadeHazardousSubInfoId();
	}

	/**
	 * Returns the flammable combustible liquid of this fire brigade hazardous sub info.
	 *
	 * @return the flammable combustible liquid of this fire brigade hazardous sub info
	 */
	@Override
	public String getFlammableCombustibleLiquid() {
		return model.getFlammableCombustibleLiquid();
	}

	/**
	 * Returns the flammable gases of this fire brigade hazardous sub info.
	 *
	 * @return the flammable gases of this fire brigade hazardous sub info
	 */
	@Override
	public String getFlammableGases() {
		return model.getFlammableGases();
	}

	/**
	 * Returns the group ID of this fire brigade hazardous sub info.
	 *
	 * @return the group ID of this fire brigade hazardous sub info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the lpg cylinder of this fire brigade hazardous sub info.
	 *
	 * @return the lpg cylinder of this fire brigade hazardous sub info
	 */
	@Override
	public String getLpgCylinder() {
		return model.getLpgCylinder();
	}

	/**
	 * Returns the modified date of this fire brigade hazardous sub info.
	 *
	 * @return the modified date of this fire brigade hazardous sub info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the other hazardous substance of this fire brigade hazardous sub info.
	 *
	 * @return the other hazardous substance of this fire brigade hazardous sub info
	 */
	@Override
	public String getOtherHazardousSubstance() {
		return model.getOtherHazardousSubstance();
	}

	/**
	 * Returns the primary key of this fire brigade hazardous sub info.
	 *
	 * @return the primary key of this fire brigade hazardous sub info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this fire brigade hazardous sub info.
	 *
	 * @return the user ID of this fire brigade hazardous sub info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this fire brigade hazardous sub info.
	 *
	 * @return the user name of this fire brigade hazardous sub info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this fire brigade hazardous sub info.
	 *
	 * @return the user uuid of this fire brigade hazardous sub info
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
	 * Sets the chemicals liquid of this fire brigade hazardous sub info.
	 *
	 * @param chemicalsLiquid the chemicals liquid of this fire brigade hazardous sub info
	 */
	@Override
	public void setChemicalsLiquid(String chemicalsLiquid) {
		model.setChemicalsLiquid(chemicalsLiquid);
	}

	/**
	 * Sets the chemicals powder of this fire brigade hazardous sub info.
	 *
	 * @param chemicalsPowder the chemicals powder of this fire brigade hazardous sub info
	 */
	@Override
	public void setChemicalsPowder(String chemicalsPowder) {
		model.setChemicalsPowder(chemicalsPowder);
	}

	/**
	 * Sets the company ID of this fire brigade hazardous sub info.
	 *
	 * @param companyId the company ID of this fire brigade hazardous sub info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this fire brigade hazardous sub info.
	 *
	 * @param createDate the create date of this fire brigade hazardous sub info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the explosives of this fire brigade hazardous sub info.
	 *
	 * @param explosives the explosives of this fire brigade hazardous sub info
	 */
	@Override
	public void setExplosives(String explosives) {
		model.setExplosives(explosives);
	}

	/**
	 * Sets the fire brigade application ID of this fire brigade hazardous sub info.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID of this fire brigade hazardous sub info
	 */
	@Override
	public void setFireBrigadeApplicationId(long fireBrigadeApplicationId) {
		model.setFireBrigadeApplicationId(fireBrigadeApplicationId);
	}

	/**
	 * Sets the fire brigade hazardous sub info ID of this fire brigade hazardous sub info.
	 *
	 * @param fireBrigadeHazardousSubInfoId the fire brigade hazardous sub info ID of this fire brigade hazardous sub info
	 */
	@Override
	public void setFireBrigadeHazardousSubInfoId(
		long fireBrigadeHazardousSubInfoId) {

		model.setFireBrigadeHazardousSubInfoId(fireBrigadeHazardousSubInfoId);
	}

	/**
	 * Sets the flammable combustible liquid of this fire brigade hazardous sub info.
	 *
	 * @param flammableCombustibleLiquid the flammable combustible liquid of this fire brigade hazardous sub info
	 */
	@Override
	public void setFlammableCombustibleLiquid(
		String flammableCombustibleLiquid) {

		model.setFlammableCombustibleLiquid(flammableCombustibleLiquid);
	}

	/**
	 * Sets the flammable gases of this fire brigade hazardous sub info.
	 *
	 * @param flammableGases the flammable gases of this fire brigade hazardous sub info
	 */
	@Override
	public void setFlammableGases(String flammableGases) {
		model.setFlammableGases(flammableGases);
	}

	/**
	 * Sets the group ID of this fire brigade hazardous sub info.
	 *
	 * @param groupId the group ID of this fire brigade hazardous sub info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the lpg cylinder of this fire brigade hazardous sub info.
	 *
	 * @param lpgCylinder the lpg cylinder of this fire brigade hazardous sub info
	 */
	@Override
	public void setLpgCylinder(String lpgCylinder) {
		model.setLpgCylinder(lpgCylinder);
	}

	/**
	 * Sets the modified date of this fire brigade hazardous sub info.
	 *
	 * @param modifiedDate the modified date of this fire brigade hazardous sub info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the other hazardous substance of this fire brigade hazardous sub info.
	 *
	 * @param otherHazardousSubstance the other hazardous substance of this fire brigade hazardous sub info
	 */
	@Override
	public void setOtherHazardousSubstance(String otherHazardousSubstance) {
		model.setOtherHazardousSubstance(otherHazardousSubstance);
	}

	/**
	 * Sets the primary key of this fire brigade hazardous sub info.
	 *
	 * @param primaryKey the primary key of this fire brigade hazardous sub info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this fire brigade hazardous sub info.
	 *
	 * @param userId the user ID of this fire brigade hazardous sub info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this fire brigade hazardous sub info.
	 *
	 * @param userName the user name of this fire brigade hazardous sub info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this fire brigade hazardous sub info.
	 *
	 * @param userUuid the user uuid of this fire brigade hazardous sub info
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
	protected FireBrigadeHazardousSubInfoWrapper wrap(
		FireBrigadeHazardousSubInfo fireBrigadeHazardousSubInfo) {

		return new FireBrigadeHazardousSubInfoWrapper(
			fireBrigadeHazardousSubInfo);
	}

}