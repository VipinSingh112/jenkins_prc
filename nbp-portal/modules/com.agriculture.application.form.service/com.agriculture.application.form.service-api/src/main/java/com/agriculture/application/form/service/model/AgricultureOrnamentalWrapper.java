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
 * This class is a wrapper for {@link AgricultureOrnamental}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureOrnamental
 * @generated
 */
public class AgricultureOrnamentalWrapper
	extends BaseModelWrapper<AgricultureOrnamental>
	implements AgricultureOrnamental, ModelWrapper<AgricultureOrnamental> {

	public AgricultureOrnamentalWrapper(
		AgricultureOrnamental agricultureOrnamental) {

		super(agricultureOrnamental);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("agricultureOrnamentalId", getAgricultureOrnamentalId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ornamentalType", getOrnamentalType());
		attributes.put("ornamentalProduceArea", getOrnamentalProduceArea());
		attributes.put("averageAnnualProduction", getAverageAnnualProduction());
		attributes.put("ornamentalMarketLocal", getOrnamentalMarketLocal());
		attributes.put("ornamentalMarketForeign", getOrnamentalMarketForeign());
		attributes.put("valueOfSale", getValueOfSale());
		attributes.put("ornamentalCounter", getOrnamentalCounter());
		attributes.put(
			"agricultureApplicationId", getAgricultureApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long agricultureOrnamentalId = (Long)attributes.get(
			"agricultureOrnamentalId");

		if (agricultureOrnamentalId != null) {
			setAgricultureOrnamentalId(agricultureOrnamentalId);
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

		String ornamentalType = (String)attributes.get("ornamentalType");

		if (ornamentalType != null) {
			setOrnamentalType(ornamentalType);
		}

		String ornamentalProduceArea = (String)attributes.get(
			"ornamentalProduceArea");

		if (ornamentalProduceArea != null) {
			setOrnamentalProduceArea(ornamentalProduceArea);
		}

		String averageAnnualProduction = (String)attributes.get(
			"averageAnnualProduction");

		if (averageAnnualProduction != null) {
			setAverageAnnualProduction(averageAnnualProduction);
		}

		String ornamentalMarketLocal = (String)attributes.get(
			"ornamentalMarketLocal");

		if (ornamentalMarketLocal != null) {
			setOrnamentalMarketLocal(ornamentalMarketLocal);
		}

		String ornamentalMarketForeign = (String)attributes.get(
			"ornamentalMarketForeign");

		if (ornamentalMarketForeign != null) {
			setOrnamentalMarketForeign(ornamentalMarketForeign);
		}

		String valueOfSale = (String)attributes.get("valueOfSale");

		if (valueOfSale != null) {
			setValueOfSale(valueOfSale);
		}

		String ornamentalCounter = (String)attributes.get("ornamentalCounter");

		if (ornamentalCounter != null) {
			setOrnamentalCounter(ornamentalCounter);
		}

		Long agricultureApplicationId = (Long)attributes.get(
			"agricultureApplicationId");

		if (agricultureApplicationId != null) {
			setAgricultureApplicationId(agricultureApplicationId);
		}
	}

	@Override
	public AgricultureOrnamental cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the agriculture application ID of this agriculture ornamental.
	 *
	 * @return the agriculture application ID of this agriculture ornamental
	 */
	@Override
	public long getAgricultureApplicationId() {
		return model.getAgricultureApplicationId();
	}

	/**
	 * Returns the agriculture ornamental ID of this agriculture ornamental.
	 *
	 * @return the agriculture ornamental ID of this agriculture ornamental
	 */
	@Override
	public long getAgricultureOrnamentalId() {
		return model.getAgricultureOrnamentalId();
	}

	/**
	 * Returns the average annual production of this agriculture ornamental.
	 *
	 * @return the average annual production of this agriculture ornamental
	 */
	@Override
	public String getAverageAnnualProduction() {
		return model.getAverageAnnualProduction();
	}

	/**
	 * Returns the company ID of this agriculture ornamental.
	 *
	 * @return the company ID of this agriculture ornamental
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this agriculture ornamental.
	 *
	 * @return the create date of this agriculture ornamental
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this agriculture ornamental.
	 *
	 * @return the group ID of this agriculture ornamental
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this agriculture ornamental.
	 *
	 * @return the modified date of this agriculture ornamental
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ornamental counter of this agriculture ornamental.
	 *
	 * @return the ornamental counter of this agriculture ornamental
	 */
	@Override
	public String getOrnamentalCounter() {
		return model.getOrnamentalCounter();
	}

	/**
	 * Returns the ornamental market foreign of this agriculture ornamental.
	 *
	 * @return the ornamental market foreign of this agriculture ornamental
	 */
	@Override
	public String getOrnamentalMarketForeign() {
		return model.getOrnamentalMarketForeign();
	}

	/**
	 * Returns the ornamental market local of this agriculture ornamental.
	 *
	 * @return the ornamental market local of this agriculture ornamental
	 */
	@Override
	public String getOrnamentalMarketLocal() {
		return model.getOrnamentalMarketLocal();
	}

	/**
	 * Returns the ornamental produce area of this agriculture ornamental.
	 *
	 * @return the ornamental produce area of this agriculture ornamental
	 */
	@Override
	public String getOrnamentalProduceArea() {
		return model.getOrnamentalProduceArea();
	}

	/**
	 * Returns the ornamental type of this agriculture ornamental.
	 *
	 * @return the ornamental type of this agriculture ornamental
	 */
	@Override
	public String getOrnamentalType() {
		return model.getOrnamentalType();
	}

	/**
	 * Returns the primary key of this agriculture ornamental.
	 *
	 * @return the primary key of this agriculture ornamental
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this agriculture ornamental.
	 *
	 * @return the user ID of this agriculture ornamental
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this agriculture ornamental.
	 *
	 * @return the user name of this agriculture ornamental
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this agriculture ornamental.
	 *
	 * @return the user uuid of this agriculture ornamental
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the value of sale of this agriculture ornamental.
	 *
	 * @return the value of sale of this agriculture ornamental
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
	 * Sets the agriculture application ID of this agriculture ornamental.
	 *
	 * @param agricultureApplicationId the agriculture application ID of this agriculture ornamental
	 */
	@Override
	public void setAgricultureApplicationId(long agricultureApplicationId) {
		model.setAgricultureApplicationId(agricultureApplicationId);
	}

	/**
	 * Sets the agriculture ornamental ID of this agriculture ornamental.
	 *
	 * @param agricultureOrnamentalId the agriculture ornamental ID of this agriculture ornamental
	 */
	@Override
	public void setAgricultureOrnamentalId(long agricultureOrnamentalId) {
		model.setAgricultureOrnamentalId(agricultureOrnamentalId);
	}

	/**
	 * Sets the average annual production of this agriculture ornamental.
	 *
	 * @param averageAnnualProduction the average annual production of this agriculture ornamental
	 */
	@Override
	public void setAverageAnnualProduction(String averageAnnualProduction) {
		model.setAverageAnnualProduction(averageAnnualProduction);
	}

	/**
	 * Sets the company ID of this agriculture ornamental.
	 *
	 * @param companyId the company ID of this agriculture ornamental
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this agriculture ornamental.
	 *
	 * @param createDate the create date of this agriculture ornamental
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this agriculture ornamental.
	 *
	 * @param groupId the group ID of this agriculture ornamental
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this agriculture ornamental.
	 *
	 * @param modifiedDate the modified date of this agriculture ornamental
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ornamental counter of this agriculture ornamental.
	 *
	 * @param ornamentalCounter the ornamental counter of this agriculture ornamental
	 */
	@Override
	public void setOrnamentalCounter(String ornamentalCounter) {
		model.setOrnamentalCounter(ornamentalCounter);
	}

	/**
	 * Sets the ornamental market foreign of this agriculture ornamental.
	 *
	 * @param ornamentalMarketForeign the ornamental market foreign of this agriculture ornamental
	 */
	@Override
	public void setOrnamentalMarketForeign(String ornamentalMarketForeign) {
		model.setOrnamentalMarketForeign(ornamentalMarketForeign);
	}

	/**
	 * Sets the ornamental market local of this agriculture ornamental.
	 *
	 * @param ornamentalMarketLocal the ornamental market local of this agriculture ornamental
	 */
	@Override
	public void setOrnamentalMarketLocal(String ornamentalMarketLocal) {
		model.setOrnamentalMarketLocal(ornamentalMarketLocal);
	}

	/**
	 * Sets the ornamental produce area of this agriculture ornamental.
	 *
	 * @param ornamentalProduceArea the ornamental produce area of this agriculture ornamental
	 */
	@Override
	public void setOrnamentalProduceArea(String ornamentalProduceArea) {
		model.setOrnamentalProduceArea(ornamentalProduceArea);
	}

	/**
	 * Sets the ornamental type of this agriculture ornamental.
	 *
	 * @param ornamentalType the ornamental type of this agriculture ornamental
	 */
	@Override
	public void setOrnamentalType(String ornamentalType) {
		model.setOrnamentalType(ornamentalType);
	}

	/**
	 * Sets the primary key of this agriculture ornamental.
	 *
	 * @param primaryKey the primary key of this agriculture ornamental
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this agriculture ornamental.
	 *
	 * @param userId the user ID of this agriculture ornamental
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this agriculture ornamental.
	 *
	 * @param userName the user name of this agriculture ornamental
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this agriculture ornamental.
	 *
	 * @param userUuid the user uuid of this agriculture ornamental
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the value of sale of this agriculture ornamental.
	 *
	 * @param valueOfSale the value of sale of this agriculture ornamental
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
	protected AgricultureOrnamentalWrapper wrap(
		AgricultureOrnamental agricultureOrnamental) {

		return new AgricultureOrnamentalWrapper(agricultureOrnamental);
	}

}