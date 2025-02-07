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
 * This class is a wrapper for {@link AgricultureLivestock}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureLivestock
 * @generated
 */
public class AgricultureLivestockWrapper
	extends BaseModelWrapper<AgricultureLivestock>
	implements AgricultureLivestock, ModelWrapper<AgricultureLivestock> {

	public AgricultureLivestockWrapper(
		AgricultureLivestock agricultureLivestock) {

		super(agricultureLivestock);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("agricultureLivestockId", getAgricultureLivestockId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("livestockType", getLivestockType());
		attributes.put(
			"numberOFAnimalsByCategory", getNumberOFAnimalsByCategory());
		attributes.put("averageAnnualProduction", getAverageAnnualProduction());
		attributes.put("livestockMarketlocal", getLivestockMarketlocal());
		attributes.put("livestockMarketForeign", getLivestockMarketForeign());
		attributes.put("valueOfSale", getValueOfSale());
		attributes.put("Livestockcounter", getLivestockcounter());
		attributes.put(
			"agricultureApplicationId", getAgricultureApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long agricultureLivestockId = (Long)attributes.get(
			"agricultureLivestockId");

		if (agricultureLivestockId != null) {
			setAgricultureLivestockId(agricultureLivestockId);
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

		String livestockType = (String)attributes.get("livestockType");

		if (livestockType != null) {
			setLivestockType(livestockType);
		}

		String numberOFAnimalsByCategory = (String)attributes.get(
			"numberOFAnimalsByCategory");

		if (numberOFAnimalsByCategory != null) {
			setNumberOFAnimalsByCategory(numberOFAnimalsByCategory);
		}

		String averageAnnualProduction = (String)attributes.get(
			"averageAnnualProduction");

		if (averageAnnualProduction != null) {
			setAverageAnnualProduction(averageAnnualProduction);
		}

		String livestockMarketlocal = (String)attributes.get(
			"livestockMarketlocal");

		if (livestockMarketlocal != null) {
			setLivestockMarketlocal(livestockMarketlocal);
		}

		String livestockMarketForeign = (String)attributes.get(
			"livestockMarketForeign");

		if (livestockMarketForeign != null) {
			setLivestockMarketForeign(livestockMarketForeign);
		}

		String valueOfSale = (String)attributes.get("valueOfSale");

		if (valueOfSale != null) {
			setValueOfSale(valueOfSale);
		}

		String Livestockcounter = (String)attributes.get("Livestockcounter");

		if (Livestockcounter != null) {
			setLivestockcounter(Livestockcounter);
		}

		Long agricultureApplicationId = (Long)attributes.get(
			"agricultureApplicationId");

		if (agricultureApplicationId != null) {
			setAgricultureApplicationId(agricultureApplicationId);
		}
	}

	@Override
	public AgricultureLivestock cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the agriculture application ID of this agriculture livestock.
	 *
	 * @return the agriculture application ID of this agriculture livestock
	 */
	@Override
	public long getAgricultureApplicationId() {
		return model.getAgricultureApplicationId();
	}

	/**
	 * Returns the agriculture livestock ID of this agriculture livestock.
	 *
	 * @return the agriculture livestock ID of this agriculture livestock
	 */
	@Override
	public long getAgricultureLivestockId() {
		return model.getAgricultureLivestockId();
	}

	/**
	 * Returns the average annual production of this agriculture livestock.
	 *
	 * @return the average annual production of this agriculture livestock
	 */
	@Override
	public String getAverageAnnualProduction() {
		return model.getAverageAnnualProduction();
	}

	/**
	 * Returns the company ID of this agriculture livestock.
	 *
	 * @return the company ID of this agriculture livestock
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this agriculture livestock.
	 *
	 * @return the create date of this agriculture livestock
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this agriculture livestock.
	 *
	 * @return the group ID of this agriculture livestock
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the livestockcounter of this agriculture livestock.
	 *
	 * @return the livestockcounter of this agriculture livestock
	 */
	@Override
	public String getLivestockcounter() {
		return model.getLivestockcounter();
	}

	/**
	 * Returns the livestock market foreign of this agriculture livestock.
	 *
	 * @return the livestock market foreign of this agriculture livestock
	 */
	@Override
	public String getLivestockMarketForeign() {
		return model.getLivestockMarketForeign();
	}

	/**
	 * Returns the livestock marketlocal of this agriculture livestock.
	 *
	 * @return the livestock marketlocal of this agriculture livestock
	 */
	@Override
	public String getLivestockMarketlocal() {
		return model.getLivestockMarketlocal();
	}

	/**
	 * Returns the livestock type of this agriculture livestock.
	 *
	 * @return the livestock type of this agriculture livestock
	 */
	@Override
	public String getLivestockType() {
		return model.getLivestockType();
	}

	/**
	 * Returns the modified date of this agriculture livestock.
	 *
	 * @return the modified date of this agriculture livestock
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the number of animals by category of this agriculture livestock.
	 *
	 * @return the number of animals by category of this agriculture livestock
	 */
	@Override
	public String getNumberOFAnimalsByCategory() {
		return model.getNumberOFAnimalsByCategory();
	}

	/**
	 * Returns the primary key of this agriculture livestock.
	 *
	 * @return the primary key of this agriculture livestock
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this agriculture livestock.
	 *
	 * @return the user ID of this agriculture livestock
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this agriculture livestock.
	 *
	 * @return the user name of this agriculture livestock
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this agriculture livestock.
	 *
	 * @return the user uuid of this agriculture livestock
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the value of sale of this agriculture livestock.
	 *
	 * @return the value of sale of this agriculture livestock
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
	 * Sets the agriculture application ID of this agriculture livestock.
	 *
	 * @param agricultureApplicationId the agriculture application ID of this agriculture livestock
	 */
	@Override
	public void setAgricultureApplicationId(long agricultureApplicationId) {
		model.setAgricultureApplicationId(agricultureApplicationId);
	}

	/**
	 * Sets the agriculture livestock ID of this agriculture livestock.
	 *
	 * @param agricultureLivestockId the agriculture livestock ID of this agriculture livestock
	 */
	@Override
	public void setAgricultureLivestockId(long agricultureLivestockId) {
		model.setAgricultureLivestockId(agricultureLivestockId);
	}

	/**
	 * Sets the average annual production of this agriculture livestock.
	 *
	 * @param averageAnnualProduction the average annual production of this agriculture livestock
	 */
	@Override
	public void setAverageAnnualProduction(String averageAnnualProduction) {
		model.setAverageAnnualProduction(averageAnnualProduction);
	}

	/**
	 * Sets the company ID of this agriculture livestock.
	 *
	 * @param companyId the company ID of this agriculture livestock
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this agriculture livestock.
	 *
	 * @param createDate the create date of this agriculture livestock
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this agriculture livestock.
	 *
	 * @param groupId the group ID of this agriculture livestock
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the livestockcounter of this agriculture livestock.
	 *
	 * @param Livestockcounter the livestockcounter of this agriculture livestock
	 */
	@Override
	public void setLivestockcounter(String Livestockcounter) {
		model.setLivestockcounter(Livestockcounter);
	}

	/**
	 * Sets the livestock market foreign of this agriculture livestock.
	 *
	 * @param livestockMarketForeign the livestock market foreign of this agriculture livestock
	 */
	@Override
	public void setLivestockMarketForeign(String livestockMarketForeign) {
		model.setLivestockMarketForeign(livestockMarketForeign);
	}

	/**
	 * Sets the livestock marketlocal of this agriculture livestock.
	 *
	 * @param livestockMarketlocal the livestock marketlocal of this agriculture livestock
	 */
	@Override
	public void setLivestockMarketlocal(String livestockMarketlocal) {
		model.setLivestockMarketlocal(livestockMarketlocal);
	}

	/**
	 * Sets the livestock type of this agriculture livestock.
	 *
	 * @param livestockType the livestock type of this agriculture livestock
	 */
	@Override
	public void setLivestockType(String livestockType) {
		model.setLivestockType(livestockType);
	}

	/**
	 * Sets the modified date of this agriculture livestock.
	 *
	 * @param modifiedDate the modified date of this agriculture livestock
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the number of animals by category of this agriculture livestock.
	 *
	 * @param numberOFAnimalsByCategory the number of animals by category of this agriculture livestock
	 */
	@Override
	public void setNumberOFAnimalsByCategory(String numberOFAnimalsByCategory) {
		model.setNumberOFAnimalsByCategory(numberOFAnimalsByCategory);
	}

	/**
	 * Sets the primary key of this agriculture livestock.
	 *
	 * @param primaryKey the primary key of this agriculture livestock
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this agriculture livestock.
	 *
	 * @param userId the user ID of this agriculture livestock
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this agriculture livestock.
	 *
	 * @param userName the user name of this agriculture livestock
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this agriculture livestock.
	 *
	 * @param userUuid the user uuid of this agriculture livestock
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the value of sale of this agriculture livestock.
	 *
	 * @param valueOfSale the value of sale of this agriculture livestock
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
	protected AgricultureLivestockWrapper wrap(
		AgricultureLivestock agricultureLivestock) {

		return new AgricultureLivestockWrapper(agricultureLivestock);
	}

}