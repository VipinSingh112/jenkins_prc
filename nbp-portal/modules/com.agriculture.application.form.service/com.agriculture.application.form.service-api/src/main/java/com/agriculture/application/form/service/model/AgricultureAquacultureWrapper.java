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
 * This class is a wrapper for {@link AgricultureAquaculture}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureAquaculture
 * @generated
 */
public class AgricultureAquacultureWrapper
	extends BaseModelWrapper<AgricultureAquaculture>
	implements AgricultureAquaculture, ModelWrapper<AgricultureAquaculture> {

	public AgricultureAquacultureWrapper(
		AgricultureAquaculture agricultureAquaculture) {

		super(agricultureAquaculture);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"agricultureAquacultureId", getAgricultureAquacultureId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("aquacultureType", getAquacultureType());
		attributes.put("waterHectare", getWaterHectare());
		attributes.put("averageAnnualProduction", getAverageAnnualProduction());
		attributes.put("marketLocal", getMarketLocal());
		attributes.put("marketForeign", getMarketForeign());
		attributes.put("valueOfSale", getValueOfSale());
		attributes.put("aquacultureCounter", getAquacultureCounter());
		attributes.put(
			"agricultureApplicationId", getAgricultureApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long agricultureAquacultureId = (Long)attributes.get(
			"agricultureAquacultureId");

		if (agricultureAquacultureId != null) {
			setAgricultureAquacultureId(agricultureAquacultureId);
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

		String aquacultureType = (String)attributes.get("aquacultureType");

		if (aquacultureType != null) {
			setAquacultureType(aquacultureType);
		}

		String waterHectare = (String)attributes.get("waterHectare");

		if (waterHectare != null) {
			setWaterHectare(waterHectare);
		}

		String averageAnnualProduction = (String)attributes.get(
			"averageAnnualProduction");

		if (averageAnnualProduction != null) {
			setAverageAnnualProduction(averageAnnualProduction);
		}

		String marketLocal = (String)attributes.get("marketLocal");

		if (marketLocal != null) {
			setMarketLocal(marketLocal);
		}

		String marketForeign = (String)attributes.get("marketForeign");

		if (marketForeign != null) {
			setMarketForeign(marketForeign);
		}

		String valueOfSale = (String)attributes.get("valueOfSale");

		if (valueOfSale != null) {
			setValueOfSale(valueOfSale);
		}

		String aquacultureCounter = (String)attributes.get(
			"aquacultureCounter");

		if (aquacultureCounter != null) {
			setAquacultureCounter(aquacultureCounter);
		}

		Long agricultureApplicationId = (Long)attributes.get(
			"agricultureApplicationId");

		if (agricultureApplicationId != null) {
			setAgricultureApplicationId(agricultureApplicationId);
		}
	}

	@Override
	public AgricultureAquaculture cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the agriculture application ID of this agriculture aquaculture.
	 *
	 * @return the agriculture application ID of this agriculture aquaculture
	 */
	@Override
	public long getAgricultureApplicationId() {
		return model.getAgricultureApplicationId();
	}

	/**
	 * Returns the agriculture aquaculture ID of this agriculture aquaculture.
	 *
	 * @return the agriculture aquaculture ID of this agriculture aquaculture
	 */
	@Override
	public long getAgricultureAquacultureId() {
		return model.getAgricultureAquacultureId();
	}

	/**
	 * Returns the aquaculture counter of this agriculture aquaculture.
	 *
	 * @return the aquaculture counter of this agriculture aquaculture
	 */
	@Override
	public String getAquacultureCounter() {
		return model.getAquacultureCounter();
	}

	/**
	 * Returns the aquaculture type of this agriculture aquaculture.
	 *
	 * @return the aquaculture type of this agriculture aquaculture
	 */
	@Override
	public String getAquacultureType() {
		return model.getAquacultureType();
	}

	/**
	 * Returns the average annual production of this agriculture aquaculture.
	 *
	 * @return the average annual production of this agriculture aquaculture
	 */
	@Override
	public String getAverageAnnualProduction() {
		return model.getAverageAnnualProduction();
	}

	/**
	 * Returns the company ID of this agriculture aquaculture.
	 *
	 * @return the company ID of this agriculture aquaculture
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this agriculture aquaculture.
	 *
	 * @return the create date of this agriculture aquaculture
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this agriculture aquaculture.
	 *
	 * @return the group ID of this agriculture aquaculture
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the market foreign of this agriculture aquaculture.
	 *
	 * @return the market foreign of this agriculture aquaculture
	 */
	@Override
	public String getMarketForeign() {
		return model.getMarketForeign();
	}

	/**
	 * Returns the market local of this agriculture aquaculture.
	 *
	 * @return the market local of this agriculture aquaculture
	 */
	@Override
	public String getMarketLocal() {
		return model.getMarketLocal();
	}

	/**
	 * Returns the modified date of this agriculture aquaculture.
	 *
	 * @return the modified date of this agriculture aquaculture
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this agriculture aquaculture.
	 *
	 * @return the primary key of this agriculture aquaculture
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this agriculture aquaculture.
	 *
	 * @return the user ID of this agriculture aquaculture
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this agriculture aquaculture.
	 *
	 * @return the user name of this agriculture aquaculture
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this agriculture aquaculture.
	 *
	 * @return the user uuid of this agriculture aquaculture
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the value of sale of this agriculture aquaculture.
	 *
	 * @return the value of sale of this agriculture aquaculture
	 */
	@Override
	public String getValueOfSale() {
		return model.getValueOfSale();
	}

	/**
	 * Returns the water hectare of this agriculture aquaculture.
	 *
	 * @return the water hectare of this agriculture aquaculture
	 */
	@Override
	public String getWaterHectare() {
		return model.getWaterHectare();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the agriculture application ID of this agriculture aquaculture.
	 *
	 * @param agricultureApplicationId the agriculture application ID of this agriculture aquaculture
	 */
	@Override
	public void setAgricultureApplicationId(long agricultureApplicationId) {
		model.setAgricultureApplicationId(agricultureApplicationId);
	}

	/**
	 * Sets the agriculture aquaculture ID of this agriculture aquaculture.
	 *
	 * @param agricultureAquacultureId the agriculture aquaculture ID of this agriculture aquaculture
	 */
	@Override
	public void setAgricultureAquacultureId(long agricultureAquacultureId) {
		model.setAgricultureAquacultureId(agricultureAquacultureId);
	}

	/**
	 * Sets the aquaculture counter of this agriculture aquaculture.
	 *
	 * @param aquacultureCounter the aquaculture counter of this agriculture aquaculture
	 */
	@Override
	public void setAquacultureCounter(String aquacultureCounter) {
		model.setAquacultureCounter(aquacultureCounter);
	}

	/**
	 * Sets the aquaculture type of this agriculture aquaculture.
	 *
	 * @param aquacultureType the aquaculture type of this agriculture aquaculture
	 */
	@Override
	public void setAquacultureType(String aquacultureType) {
		model.setAquacultureType(aquacultureType);
	}

	/**
	 * Sets the average annual production of this agriculture aquaculture.
	 *
	 * @param averageAnnualProduction the average annual production of this agriculture aquaculture
	 */
	@Override
	public void setAverageAnnualProduction(String averageAnnualProduction) {
		model.setAverageAnnualProduction(averageAnnualProduction);
	}

	/**
	 * Sets the company ID of this agriculture aquaculture.
	 *
	 * @param companyId the company ID of this agriculture aquaculture
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this agriculture aquaculture.
	 *
	 * @param createDate the create date of this agriculture aquaculture
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this agriculture aquaculture.
	 *
	 * @param groupId the group ID of this agriculture aquaculture
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the market foreign of this agriculture aquaculture.
	 *
	 * @param marketForeign the market foreign of this agriculture aquaculture
	 */
	@Override
	public void setMarketForeign(String marketForeign) {
		model.setMarketForeign(marketForeign);
	}

	/**
	 * Sets the market local of this agriculture aquaculture.
	 *
	 * @param marketLocal the market local of this agriculture aquaculture
	 */
	@Override
	public void setMarketLocal(String marketLocal) {
		model.setMarketLocal(marketLocal);
	}

	/**
	 * Sets the modified date of this agriculture aquaculture.
	 *
	 * @param modifiedDate the modified date of this agriculture aquaculture
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this agriculture aquaculture.
	 *
	 * @param primaryKey the primary key of this agriculture aquaculture
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this agriculture aquaculture.
	 *
	 * @param userId the user ID of this agriculture aquaculture
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this agriculture aquaculture.
	 *
	 * @param userName the user name of this agriculture aquaculture
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this agriculture aquaculture.
	 *
	 * @param userUuid the user uuid of this agriculture aquaculture
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the value of sale of this agriculture aquaculture.
	 *
	 * @param valueOfSale the value of sale of this agriculture aquaculture
	 */
	@Override
	public void setValueOfSale(String valueOfSale) {
		model.setValueOfSale(valueOfSale);
	}

	/**
	 * Sets the water hectare of this agriculture aquaculture.
	 *
	 * @param waterHectare the water hectare of this agriculture aquaculture
	 */
	@Override
	public void setWaterHectare(String waterHectare) {
		model.setWaterHectare(waterHectare);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected AgricultureAquacultureWrapper wrap(
		AgricultureAquaculture agricultureAquaculture) {

		return new AgricultureAquacultureWrapper(agricultureAquaculture);
	}

}