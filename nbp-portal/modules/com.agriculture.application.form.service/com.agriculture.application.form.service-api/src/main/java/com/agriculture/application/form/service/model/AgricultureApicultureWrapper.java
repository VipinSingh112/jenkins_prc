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
 * This class is a wrapper for {@link AgricultureApiculture}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureApiculture
 * @generated
 */
public class AgricultureApicultureWrapper
	extends BaseModelWrapper<AgricultureApiculture>
	implements AgricultureApiculture, ModelWrapper<AgricultureApiculture> {

	public AgricultureApicultureWrapper(
		AgricultureApiculture agricultureApiculture) {

		super(agricultureApiculture);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("agricultureApicultureId", getAgricultureApicultureId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("apicultureType", getApicultureType());
		attributes.put("numberOfColonies", getNumberOfColonies());
		attributes.put("averageAnnualProduction", getAverageAnnualProduction());
		attributes.put("marketLocal", getMarketLocal());
		attributes.put("marketForeign", getMarketForeign());
		attributes.put("valueOfSale", getValueOfSale());
		attributes.put("apicultureCounter", getApicultureCounter());
		attributes.put(
			"agricultureApplicationId", getAgricultureApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long agricultureApicultureId = (Long)attributes.get(
			"agricultureApicultureId");

		if (agricultureApicultureId != null) {
			setAgricultureApicultureId(agricultureApicultureId);
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

		String apicultureType = (String)attributes.get("apicultureType");

		if (apicultureType != null) {
			setApicultureType(apicultureType);
		}

		String numberOfColonies = (String)attributes.get("numberOfColonies");

		if (numberOfColonies != null) {
			setNumberOfColonies(numberOfColonies);
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

		String apicultureCounter = (String)attributes.get("apicultureCounter");

		if (apicultureCounter != null) {
			setApicultureCounter(apicultureCounter);
		}

		Long agricultureApplicationId = (Long)attributes.get(
			"agricultureApplicationId");

		if (agricultureApplicationId != null) {
			setAgricultureApplicationId(agricultureApplicationId);
		}
	}

	@Override
	public AgricultureApiculture cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the agriculture apiculture ID of this agriculture apiculture.
	 *
	 * @return the agriculture apiculture ID of this agriculture apiculture
	 */
	@Override
	public long getAgricultureApicultureId() {
		return model.getAgricultureApicultureId();
	}

	/**
	 * Returns the agriculture application ID of this agriculture apiculture.
	 *
	 * @return the agriculture application ID of this agriculture apiculture
	 */
	@Override
	public long getAgricultureApplicationId() {
		return model.getAgricultureApplicationId();
	}

	/**
	 * Returns the apiculture counter of this agriculture apiculture.
	 *
	 * @return the apiculture counter of this agriculture apiculture
	 */
	@Override
	public String getApicultureCounter() {
		return model.getApicultureCounter();
	}

	/**
	 * Returns the apiculture type of this agriculture apiculture.
	 *
	 * @return the apiculture type of this agriculture apiculture
	 */
	@Override
	public String getApicultureType() {
		return model.getApicultureType();
	}

	/**
	 * Returns the average annual production of this agriculture apiculture.
	 *
	 * @return the average annual production of this agriculture apiculture
	 */
	@Override
	public String getAverageAnnualProduction() {
		return model.getAverageAnnualProduction();
	}

	/**
	 * Returns the company ID of this agriculture apiculture.
	 *
	 * @return the company ID of this agriculture apiculture
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this agriculture apiculture.
	 *
	 * @return the create date of this agriculture apiculture
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this agriculture apiculture.
	 *
	 * @return the group ID of this agriculture apiculture
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the market foreign of this agriculture apiculture.
	 *
	 * @return the market foreign of this agriculture apiculture
	 */
	@Override
	public String getMarketForeign() {
		return model.getMarketForeign();
	}

	/**
	 * Returns the market local of this agriculture apiculture.
	 *
	 * @return the market local of this agriculture apiculture
	 */
	@Override
	public String getMarketLocal() {
		return model.getMarketLocal();
	}

	/**
	 * Returns the modified date of this agriculture apiculture.
	 *
	 * @return the modified date of this agriculture apiculture
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the number of colonies of this agriculture apiculture.
	 *
	 * @return the number of colonies of this agriculture apiculture
	 */
	@Override
	public String getNumberOfColonies() {
		return model.getNumberOfColonies();
	}

	/**
	 * Returns the primary key of this agriculture apiculture.
	 *
	 * @return the primary key of this agriculture apiculture
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this agriculture apiculture.
	 *
	 * @return the user ID of this agriculture apiculture
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this agriculture apiculture.
	 *
	 * @return the user name of this agriculture apiculture
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this agriculture apiculture.
	 *
	 * @return the user uuid of this agriculture apiculture
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the value of sale of this agriculture apiculture.
	 *
	 * @return the value of sale of this agriculture apiculture
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
	 * Sets the agriculture apiculture ID of this agriculture apiculture.
	 *
	 * @param agricultureApicultureId the agriculture apiculture ID of this agriculture apiculture
	 */
	@Override
	public void setAgricultureApicultureId(long agricultureApicultureId) {
		model.setAgricultureApicultureId(agricultureApicultureId);
	}

	/**
	 * Sets the agriculture application ID of this agriculture apiculture.
	 *
	 * @param agricultureApplicationId the agriculture application ID of this agriculture apiculture
	 */
	@Override
	public void setAgricultureApplicationId(long agricultureApplicationId) {
		model.setAgricultureApplicationId(agricultureApplicationId);
	}

	/**
	 * Sets the apiculture counter of this agriculture apiculture.
	 *
	 * @param apicultureCounter the apiculture counter of this agriculture apiculture
	 */
	@Override
	public void setApicultureCounter(String apicultureCounter) {
		model.setApicultureCounter(apicultureCounter);
	}

	/**
	 * Sets the apiculture type of this agriculture apiculture.
	 *
	 * @param apicultureType the apiculture type of this agriculture apiculture
	 */
	@Override
	public void setApicultureType(String apicultureType) {
		model.setApicultureType(apicultureType);
	}

	/**
	 * Sets the average annual production of this agriculture apiculture.
	 *
	 * @param averageAnnualProduction the average annual production of this agriculture apiculture
	 */
	@Override
	public void setAverageAnnualProduction(String averageAnnualProduction) {
		model.setAverageAnnualProduction(averageAnnualProduction);
	}

	/**
	 * Sets the company ID of this agriculture apiculture.
	 *
	 * @param companyId the company ID of this agriculture apiculture
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this agriculture apiculture.
	 *
	 * @param createDate the create date of this agriculture apiculture
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this agriculture apiculture.
	 *
	 * @param groupId the group ID of this agriculture apiculture
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the market foreign of this agriculture apiculture.
	 *
	 * @param marketForeign the market foreign of this agriculture apiculture
	 */
	@Override
	public void setMarketForeign(String marketForeign) {
		model.setMarketForeign(marketForeign);
	}

	/**
	 * Sets the market local of this agriculture apiculture.
	 *
	 * @param marketLocal the market local of this agriculture apiculture
	 */
	@Override
	public void setMarketLocal(String marketLocal) {
		model.setMarketLocal(marketLocal);
	}

	/**
	 * Sets the modified date of this agriculture apiculture.
	 *
	 * @param modifiedDate the modified date of this agriculture apiculture
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the number of colonies of this agriculture apiculture.
	 *
	 * @param numberOfColonies the number of colonies of this agriculture apiculture
	 */
	@Override
	public void setNumberOfColonies(String numberOfColonies) {
		model.setNumberOfColonies(numberOfColonies);
	}

	/**
	 * Sets the primary key of this agriculture apiculture.
	 *
	 * @param primaryKey the primary key of this agriculture apiculture
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this agriculture apiculture.
	 *
	 * @param userId the user ID of this agriculture apiculture
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this agriculture apiculture.
	 *
	 * @param userName the user name of this agriculture apiculture
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this agriculture apiculture.
	 *
	 * @param userUuid the user uuid of this agriculture apiculture
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the value of sale of this agriculture apiculture.
	 *
	 * @param valueOfSale the value of sale of this agriculture apiculture
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
	protected AgricultureApicultureWrapper wrap(
		AgricultureApiculture agricultureApiculture) {

		return new AgricultureApicultureWrapper(agricultureApiculture);
	}

}