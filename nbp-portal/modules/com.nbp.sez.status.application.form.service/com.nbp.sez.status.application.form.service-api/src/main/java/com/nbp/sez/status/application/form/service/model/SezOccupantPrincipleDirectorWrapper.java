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
 * This class is a wrapper for {@link SezOccupantPrincipleDirector}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantPrincipleDirector
 * @generated
 */
public class SezOccupantPrincipleDirectorWrapper
	extends BaseModelWrapper<SezOccupantPrincipleDirector>
	implements ModelWrapper<SezOccupantPrincipleDirector>,
			   SezOccupantPrincipleDirector {

	public SezOccupantPrincipleDirectorWrapper(
		SezOccupantPrincipleDirector sezOccupantPrincipleDirector) {

		super(sezOccupantPrincipleDirector);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sezOccPrincDirectId", getSezOccPrincDirectId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("occShareholderName", getOccShareholderName());
		attributes.put("occShareholderNation", getOccShareholderNation());
		attributes.put("occShareholderShares", getOccShareholderShares());
		attributes.put("occShareholderCounter", getOccShareholderCounter());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezOccPrincDirectId = (Long)attributes.get("sezOccPrincDirectId");

		if (sezOccPrincDirectId != null) {
			setSezOccPrincDirectId(sezOccPrincDirectId);
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

		String occShareholderName = (String)attributes.get(
			"occShareholderName");

		if (occShareholderName != null) {
			setOccShareholderName(occShareholderName);
		}

		String occShareholderNation = (String)attributes.get(
			"occShareholderNation");

		if (occShareholderNation != null) {
			setOccShareholderNation(occShareholderNation);
		}

		String occShareholderShares = (String)attributes.get(
			"occShareholderShares");

		if (occShareholderShares != null) {
			setOccShareholderShares(occShareholderShares);
		}

		String occShareholderCounter = (String)attributes.get(
			"occShareholderCounter");

		if (occShareholderCounter != null) {
			setOccShareholderCounter(occShareholderCounter);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezOccupantPrincipleDirector cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this sez occupant principle director.
	 *
	 * @return the company ID of this sez occupant principle director
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sez occupant principle director.
	 *
	 * @return the create date of this sez occupant principle director
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this sez occupant principle director.
	 *
	 * @return the group ID of this sez occupant principle director
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez occupant principle director.
	 *
	 * @return the modified date of this sez occupant principle director
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the occ shareholder counter of this sez occupant principle director.
	 *
	 * @return the occ shareholder counter of this sez occupant principle director
	 */
	@Override
	public String getOccShareholderCounter() {
		return model.getOccShareholderCounter();
	}

	/**
	 * Returns the occ shareholder name of this sez occupant principle director.
	 *
	 * @return the occ shareholder name of this sez occupant principle director
	 */
	@Override
	public String getOccShareholderName() {
		return model.getOccShareholderName();
	}

	/**
	 * Returns the occ shareholder nation of this sez occupant principle director.
	 *
	 * @return the occ shareholder nation of this sez occupant principle director
	 */
	@Override
	public String getOccShareholderNation() {
		return model.getOccShareholderNation();
	}

	/**
	 * Returns the occ shareholder shares of this sez occupant principle director.
	 *
	 * @return the occ shareholder shares of this sez occupant principle director
	 */
	@Override
	public String getOccShareholderShares() {
		return model.getOccShareholderShares();
	}

	/**
	 * Returns the primary key of this sez occupant principle director.
	 *
	 * @return the primary key of this sez occupant principle director
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez occ princ direct ID of this sez occupant principle director.
	 *
	 * @return the sez occ princ direct ID of this sez occupant principle director
	 */
	@Override
	public long getSezOccPrincDirectId() {
		return model.getSezOccPrincDirectId();
	}

	/**
	 * Returns the sez status application ID of this sez occupant principle director.
	 *
	 * @return the sez status application ID of this sez occupant principle director
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the user ID of this sez occupant principle director.
	 *
	 * @return the user ID of this sez occupant principle director
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez occupant principle director.
	 *
	 * @return the user name of this sez occupant principle director
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez occupant principle director.
	 *
	 * @return the user uuid of this sez occupant principle director
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
	 * Sets the company ID of this sez occupant principle director.
	 *
	 * @param companyId the company ID of this sez occupant principle director
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sez occupant principle director.
	 *
	 * @param createDate the create date of this sez occupant principle director
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this sez occupant principle director.
	 *
	 * @param groupId the group ID of this sez occupant principle director
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez occupant principle director.
	 *
	 * @param modifiedDate the modified date of this sez occupant principle director
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the occ shareholder counter of this sez occupant principle director.
	 *
	 * @param occShareholderCounter the occ shareholder counter of this sez occupant principle director
	 */
	@Override
	public void setOccShareholderCounter(String occShareholderCounter) {
		model.setOccShareholderCounter(occShareholderCounter);
	}

	/**
	 * Sets the occ shareholder name of this sez occupant principle director.
	 *
	 * @param occShareholderName the occ shareholder name of this sez occupant principle director
	 */
	@Override
	public void setOccShareholderName(String occShareholderName) {
		model.setOccShareholderName(occShareholderName);
	}

	/**
	 * Sets the occ shareholder nation of this sez occupant principle director.
	 *
	 * @param occShareholderNation the occ shareholder nation of this sez occupant principle director
	 */
	@Override
	public void setOccShareholderNation(String occShareholderNation) {
		model.setOccShareholderNation(occShareholderNation);
	}

	/**
	 * Sets the occ shareholder shares of this sez occupant principle director.
	 *
	 * @param occShareholderShares the occ shareholder shares of this sez occupant principle director
	 */
	@Override
	public void setOccShareholderShares(String occShareholderShares) {
		model.setOccShareholderShares(occShareholderShares);
	}

	/**
	 * Sets the primary key of this sez occupant principle director.
	 *
	 * @param primaryKey the primary key of this sez occupant principle director
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez occ princ direct ID of this sez occupant principle director.
	 *
	 * @param sezOccPrincDirectId the sez occ princ direct ID of this sez occupant principle director
	 */
	@Override
	public void setSezOccPrincDirectId(long sezOccPrincDirectId) {
		model.setSezOccPrincDirectId(sezOccPrincDirectId);
	}

	/**
	 * Sets the sez status application ID of this sez occupant principle director.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez occupant principle director
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the user ID of this sez occupant principle director.
	 *
	 * @param userId the user ID of this sez occupant principle director
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez occupant principle director.
	 *
	 * @param userName the user name of this sez occupant principle director
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez occupant principle director.
	 *
	 * @param userUuid the user uuid of this sez occupant principle director
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
	protected SezOccupantPrincipleDirectorWrapper wrap(
		SezOccupantPrincipleDirector sezOccupantPrincipleDirector) {

		return new SezOccupantPrincipleDirectorWrapper(
			sezOccupantPrincipleDirector);
	}

}