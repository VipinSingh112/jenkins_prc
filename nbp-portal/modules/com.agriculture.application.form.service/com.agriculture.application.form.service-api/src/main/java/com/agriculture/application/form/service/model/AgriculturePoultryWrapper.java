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
 * This class is a wrapper for {@link AgriculturePoultry}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgriculturePoultry
 * @generated
 */
public class AgriculturePoultryWrapper
	extends BaseModelWrapper<AgriculturePoultry>
	implements AgriculturePoultry, ModelWrapper<AgriculturePoultry> {

	public AgriculturePoultryWrapper(AgriculturePoultry agriculturePoultry) {
		super(agriculturePoultry);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("agriculturePoultryId", getAgriculturePoultryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("poultryType", getPoultryType());
		attributes.put("numberOFBirdsByCategory", getNumberOFBirdsByCategory());
		attributes.put("averageAnnualProduction", getAverageAnnualProduction());
		attributes.put("poultryMarketLocal", getPoultryMarketLocal());
		attributes.put("poultryMarketForeign", getPoultryMarketForeign());
		attributes.put("valueOfSale", getValueOfSale());
		attributes.put("poultryCounter", getPoultryCounter());
		attributes.put(
			"agricultureApplicationId", getAgricultureApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long agriculturePoultryId = (Long)attributes.get(
			"agriculturePoultryId");

		if (agriculturePoultryId != null) {
			setAgriculturePoultryId(agriculturePoultryId);
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

		String poultryType = (String)attributes.get("poultryType");

		if (poultryType != null) {
			setPoultryType(poultryType);
		}

		String numberOFBirdsByCategory = (String)attributes.get(
			"numberOFBirdsByCategory");

		if (numberOFBirdsByCategory != null) {
			setNumberOFBirdsByCategory(numberOFBirdsByCategory);
		}

		String averageAnnualProduction = (String)attributes.get(
			"averageAnnualProduction");

		if (averageAnnualProduction != null) {
			setAverageAnnualProduction(averageAnnualProduction);
		}

		String poultryMarketLocal = (String)attributes.get(
			"poultryMarketLocal");

		if (poultryMarketLocal != null) {
			setPoultryMarketLocal(poultryMarketLocal);
		}

		String poultryMarketForeign = (String)attributes.get(
			"poultryMarketForeign");

		if (poultryMarketForeign != null) {
			setPoultryMarketForeign(poultryMarketForeign);
		}

		String valueOfSale = (String)attributes.get("valueOfSale");

		if (valueOfSale != null) {
			setValueOfSale(valueOfSale);
		}

		String poultryCounter = (String)attributes.get("poultryCounter");

		if (poultryCounter != null) {
			setPoultryCounter(poultryCounter);
		}

		Long agricultureApplicationId = (Long)attributes.get(
			"agricultureApplicationId");

		if (agricultureApplicationId != null) {
			setAgricultureApplicationId(agricultureApplicationId);
		}
	}

	@Override
	public AgriculturePoultry cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the agriculture application ID of this agriculture poultry.
	 *
	 * @return the agriculture application ID of this agriculture poultry
	 */
	@Override
	public long getAgricultureApplicationId() {
		return model.getAgricultureApplicationId();
	}

	/**
	 * Returns the agriculture poultry ID of this agriculture poultry.
	 *
	 * @return the agriculture poultry ID of this agriculture poultry
	 */
	@Override
	public long getAgriculturePoultryId() {
		return model.getAgriculturePoultryId();
	}

	/**
	 * Returns the average annual production of this agriculture poultry.
	 *
	 * @return the average annual production of this agriculture poultry
	 */
	@Override
	public String getAverageAnnualProduction() {
		return model.getAverageAnnualProduction();
	}

	/**
	 * Returns the company ID of this agriculture poultry.
	 *
	 * @return the company ID of this agriculture poultry
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this agriculture poultry.
	 *
	 * @return the create date of this agriculture poultry
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this agriculture poultry.
	 *
	 * @return the group ID of this agriculture poultry
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this agriculture poultry.
	 *
	 * @return the modified date of this agriculture poultry
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the number of birds by category of this agriculture poultry.
	 *
	 * @return the number of birds by category of this agriculture poultry
	 */
	@Override
	public String getNumberOFBirdsByCategory() {
		return model.getNumberOFBirdsByCategory();
	}

	/**
	 * Returns the poultry counter of this agriculture poultry.
	 *
	 * @return the poultry counter of this agriculture poultry
	 */
	@Override
	public String getPoultryCounter() {
		return model.getPoultryCounter();
	}

	/**
	 * Returns the poultry market foreign of this agriculture poultry.
	 *
	 * @return the poultry market foreign of this agriculture poultry
	 */
	@Override
	public String getPoultryMarketForeign() {
		return model.getPoultryMarketForeign();
	}

	/**
	 * Returns the poultry market local of this agriculture poultry.
	 *
	 * @return the poultry market local of this agriculture poultry
	 */
	@Override
	public String getPoultryMarketLocal() {
		return model.getPoultryMarketLocal();
	}

	/**
	 * Returns the poultry type of this agriculture poultry.
	 *
	 * @return the poultry type of this agriculture poultry
	 */
	@Override
	public String getPoultryType() {
		return model.getPoultryType();
	}

	/**
	 * Returns the primary key of this agriculture poultry.
	 *
	 * @return the primary key of this agriculture poultry
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this agriculture poultry.
	 *
	 * @return the user ID of this agriculture poultry
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this agriculture poultry.
	 *
	 * @return the user name of this agriculture poultry
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this agriculture poultry.
	 *
	 * @return the user uuid of this agriculture poultry
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the value of sale of this agriculture poultry.
	 *
	 * @return the value of sale of this agriculture poultry
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
	 * Sets the agriculture application ID of this agriculture poultry.
	 *
	 * @param agricultureApplicationId the agriculture application ID of this agriculture poultry
	 */
	@Override
	public void setAgricultureApplicationId(long agricultureApplicationId) {
		model.setAgricultureApplicationId(agricultureApplicationId);
	}

	/**
	 * Sets the agriculture poultry ID of this agriculture poultry.
	 *
	 * @param agriculturePoultryId the agriculture poultry ID of this agriculture poultry
	 */
	@Override
	public void setAgriculturePoultryId(long agriculturePoultryId) {
		model.setAgriculturePoultryId(agriculturePoultryId);
	}

	/**
	 * Sets the average annual production of this agriculture poultry.
	 *
	 * @param averageAnnualProduction the average annual production of this agriculture poultry
	 */
	@Override
	public void setAverageAnnualProduction(String averageAnnualProduction) {
		model.setAverageAnnualProduction(averageAnnualProduction);
	}

	/**
	 * Sets the company ID of this agriculture poultry.
	 *
	 * @param companyId the company ID of this agriculture poultry
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this agriculture poultry.
	 *
	 * @param createDate the create date of this agriculture poultry
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this agriculture poultry.
	 *
	 * @param groupId the group ID of this agriculture poultry
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this agriculture poultry.
	 *
	 * @param modifiedDate the modified date of this agriculture poultry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the number of birds by category of this agriculture poultry.
	 *
	 * @param numberOFBirdsByCategory the number of birds by category of this agriculture poultry
	 */
	@Override
	public void setNumberOFBirdsByCategory(String numberOFBirdsByCategory) {
		model.setNumberOFBirdsByCategory(numberOFBirdsByCategory);
	}

	/**
	 * Sets the poultry counter of this agriculture poultry.
	 *
	 * @param poultryCounter the poultry counter of this agriculture poultry
	 */
	@Override
	public void setPoultryCounter(String poultryCounter) {
		model.setPoultryCounter(poultryCounter);
	}

	/**
	 * Sets the poultry market foreign of this agriculture poultry.
	 *
	 * @param poultryMarketForeign the poultry market foreign of this agriculture poultry
	 */
	@Override
	public void setPoultryMarketForeign(String poultryMarketForeign) {
		model.setPoultryMarketForeign(poultryMarketForeign);
	}

	/**
	 * Sets the poultry market local of this agriculture poultry.
	 *
	 * @param poultryMarketLocal the poultry market local of this agriculture poultry
	 */
	@Override
	public void setPoultryMarketLocal(String poultryMarketLocal) {
		model.setPoultryMarketLocal(poultryMarketLocal);
	}

	/**
	 * Sets the poultry type of this agriculture poultry.
	 *
	 * @param poultryType the poultry type of this agriculture poultry
	 */
	@Override
	public void setPoultryType(String poultryType) {
		model.setPoultryType(poultryType);
	}

	/**
	 * Sets the primary key of this agriculture poultry.
	 *
	 * @param primaryKey the primary key of this agriculture poultry
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this agriculture poultry.
	 *
	 * @param userId the user ID of this agriculture poultry
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this agriculture poultry.
	 *
	 * @param userName the user name of this agriculture poultry
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this agriculture poultry.
	 *
	 * @param userUuid the user uuid of this agriculture poultry
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the value of sale of this agriculture poultry.
	 *
	 * @param valueOfSale the value of sale of this agriculture poultry
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
	protected AgriculturePoultryWrapper wrap(
		AgriculturePoultry agriculturePoultry) {

		return new AgriculturePoultryWrapper(agriculturePoultry);
	}

}