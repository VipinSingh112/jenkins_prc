/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AgriultureForestry}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgriultureForestry
 * @generated
 */
public class AgriultureForestryWrapper
	extends BaseModelWrapper<AgriultureForestry>
	implements AgriultureForestry, ModelWrapper<AgriultureForestry> {

	public AgriultureForestryWrapper(AgriultureForestry agriultureForestry) {
		super(agriultureForestry);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("agriultureForestryId", getAgriultureForestryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("forestryType", getForestryType());
		attributes.put("forestryHectare", getForestryHectare());
		attributes.put("averageAnnulaProduction", getAverageAnnulaProduction());
		attributes.put("forestryMarketLocal", getForestryMarketLocal());
		attributes.put("forestryMarketForeign", getForestryMarketForeign());
		attributes.put("valueOfSale", getValueOfSale());
		attributes.put("forestryCounter", getForestryCounter());
		attributes.put(
			"agricultureApplicationId", getAgricultureApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long agriultureForestryId = (Long)attributes.get(
			"agriultureForestryId");

		if (agriultureForestryId != null) {
			setAgriultureForestryId(agriultureForestryId);
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

		String forestryType = (String)attributes.get("forestryType");

		if (forestryType != null) {
			setForestryType(forestryType);
		}

		String forestryHectare = (String)attributes.get("forestryHectare");

		if (forestryHectare != null) {
			setForestryHectare(forestryHectare);
		}

		String averageAnnulaProduction = (String)attributes.get(
			"averageAnnulaProduction");

		if (averageAnnulaProduction != null) {
			setAverageAnnulaProduction(averageAnnulaProduction);
		}

		String forestryMarketLocal = (String)attributes.get(
			"forestryMarketLocal");

		if (forestryMarketLocal != null) {
			setForestryMarketLocal(forestryMarketLocal);
		}

		String forestryMarketForeign = (String)attributes.get(
			"forestryMarketForeign");

		if (forestryMarketForeign != null) {
			setForestryMarketForeign(forestryMarketForeign);
		}

		String valueOfSale = (String)attributes.get("valueOfSale");

		if (valueOfSale != null) {
			setValueOfSale(valueOfSale);
		}

		String forestryCounter = (String)attributes.get("forestryCounter");

		if (forestryCounter != null) {
			setForestryCounter(forestryCounter);
		}

		Long agricultureApplicationId = (Long)attributes.get(
			"agricultureApplicationId");

		if (agricultureApplicationId != null) {
			setAgricultureApplicationId(agricultureApplicationId);
		}
	}

	@Override
	public AgriultureForestry cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the agriculture application ID of this agriulture forestry.
	 *
	 * @return the agriculture application ID of this agriulture forestry
	 */
	@Override
	public long getAgricultureApplicationId() {
		return model.getAgricultureApplicationId();
	}

	/**
	 * Returns the agriulture forestry ID of this agriulture forestry.
	 *
	 * @return the agriulture forestry ID of this agriulture forestry
	 */
	@Override
	public long getAgriultureForestryId() {
		return model.getAgriultureForestryId();
	}

	/**
	 * Returns the average annula production of this agriulture forestry.
	 *
	 * @return the average annula production of this agriulture forestry
	 */
	@Override
	public String getAverageAnnulaProduction() {
		return model.getAverageAnnulaProduction();
	}

	/**
	 * Returns the company ID of this agriulture forestry.
	 *
	 * @return the company ID of this agriulture forestry
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this agriulture forestry.
	 *
	 * @return the create date of this agriulture forestry
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the forestry counter of this agriulture forestry.
	 *
	 * @return the forestry counter of this agriulture forestry
	 */
	@Override
	public String getForestryCounter() {
		return model.getForestryCounter();
	}

	/**
	 * Returns the forestry hectare of this agriulture forestry.
	 *
	 * @return the forestry hectare of this agriulture forestry
	 */
	@Override
	public String getForestryHectare() {
		return model.getForestryHectare();
	}

	/**
	 * Returns the forestry market foreign of this agriulture forestry.
	 *
	 * @return the forestry market foreign of this agriulture forestry
	 */
	@Override
	public String getForestryMarketForeign() {
		return model.getForestryMarketForeign();
	}

	/**
	 * Returns the forestry market local of this agriulture forestry.
	 *
	 * @return the forestry market local of this agriulture forestry
	 */
	@Override
	public String getForestryMarketLocal() {
		return model.getForestryMarketLocal();
	}

	/**
	 * Returns the forestry type of this agriulture forestry.
	 *
	 * @return the forestry type of this agriulture forestry
	 */
	@Override
	public String getForestryType() {
		return model.getForestryType();
	}

	/**
	 * Returns the group ID of this agriulture forestry.
	 *
	 * @return the group ID of this agriulture forestry
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this agriulture forestry.
	 *
	 * @return the modified date of this agriulture forestry
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this agriulture forestry.
	 *
	 * @return the primary key of this agriulture forestry
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this agriulture forestry.
	 *
	 * @return the user ID of this agriulture forestry
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this agriulture forestry.
	 *
	 * @return the user name of this agriulture forestry
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this agriulture forestry.
	 *
	 * @return the user uuid of this agriulture forestry
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the value of sale of this agriulture forestry.
	 *
	 * @return the value of sale of this agriulture forestry
	 */
	@Override
	public String getValueOfSale() {
		return model.getValueOfSale();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the agriculture application ID of this agriulture forestry.
	 *
	 * @param agricultureApplicationId the agriculture application ID of this agriulture forestry
	 */
	@Override
	public void setAgricultureApplicationId(long agricultureApplicationId) {
		model.setAgricultureApplicationId(agricultureApplicationId);
	}

	/**
	 * Sets the agriulture forestry ID of this agriulture forestry.
	 *
	 * @param agriultureForestryId the agriulture forestry ID of this agriulture forestry
	 */
	@Override
	public void setAgriultureForestryId(long agriultureForestryId) {
		model.setAgriultureForestryId(agriultureForestryId);
	}

	/**
	 * Sets the average annula production of this agriulture forestry.
	 *
	 * @param averageAnnulaProduction the average annula production of this agriulture forestry
	 */
	@Override
	public void setAverageAnnulaProduction(String averageAnnulaProduction) {
		model.setAverageAnnulaProduction(averageAnnulaProduction);
	}

	/**
	 * Sets the company ID of this agriulture forestry.
	 *
	 * @param companyId the company ID of this agriulture forestry
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this agriulture forestry.
	 *
	 * @param createDate the create date of this agriulture forestry
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the forestry counter of this agriulture forestry.
	 *
	 * @param forestryCounter the forestry counter of this agriulture forestry
	 */
	@Override
	public void setForestryCounter(String forestryCounter) {
		model.setForestryCounter(forestryCounter);
	}

	/**
	 * Sets the forestry hectare of this agriulture forestry.
	 *
	 * @param forestryHectare the forestry hectare of this agriulture forestry
	 */
	@Override
	public void setForestryHectare(String forestryHectare) {
		model.setForestryHectare(forestryHectare);
	}

	/**
	 * Sets the forestry market foreign of this agriulture forestry.
	 *
	 * @param forestryMarketForeign the forestry market foreign of this agriulture forestry
	 */
	@Override
	public void setForestryMarketForeign(String forestryMarketForeign) {
		model.setForestryMarketForeign(forestryMarketForeign);
	}

	/**
	 * Sets the forestry market local of this agriulture forestry.
	 *
	 * @param forestryMarketLocal the forestry market local of this agriulture forestry
	 */
	@Override
	public void setForestryMarketLocal(String forestryMarketLocal) {
		model.setForestryMarketLocal(forestryMarketLocal);
	}

	/**
	 * Sets the forestry type of this agriulture forestry.
	 *
	 * @param forestryType the forestry type of this agriulture forestry
	 */
	@Override
	public void setForestryType(String forestryType) {
		model.setForestryType(forestryType);
	}

	/**
	 * Sets the group ID of this agriulture forestry.
	 *
	 * @param groupId the group ID of this agriulture forestry
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this agriulture forestry.
	 *
	 * @param modifiedDate the modified date of this agriulture forestry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this agriulture forestry.
	 *
	 * @param primaryKey the primary key of this agriulture forestry
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this agriulture forestry.
	 *
	 * @param userId the user ID of this agriulture forestry
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this agriulture forestry.
	 *
	 * @param userName the user name of this agriulture forestry
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this agriulture forestry.
	 *
	 * @param userUuid the user uuid of this agriulture forestry
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the value of sale of this agriulture forestry.
	 *
	 * @param valueOfSale the value of sale of this agriulture forestry
	 */
	@Override
	public void setValueOfSale(String valueOfSale) {
		model.setValueOfSale(valueOfSale);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected AgriultureForestryWrapper wrap(
		AgriultureForestry agriultureForestry) {

		return new AgriultureForestryWrapper(agriultureForestry);
	}

}