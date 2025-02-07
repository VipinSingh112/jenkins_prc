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
 * This class is a wrapper for {@link AgricultureCrop}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureCrop
 * @generated
 */
public class AgricultureCropWrapper
	extends BaseModelWrapper<AgricultureCrop>
	implements AgricultureCrop, ModelWrapper<AgricultureCrop> {

	public AgricultureCropWrapper(AgricultureCrop agricultureCrop) {
		super(agricultureCrop);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("agricultureCropId", getAgricultureCropId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("cropType", getCropType());
		attributes.put("cropHectare", getCropHectare());
		attributes.put("averageAnnualProduction", getAverageAnnualProduction());
		attributes.put("cropMarketLocal", getCropMarketLocal());
		attributes.put("cropMarketForeign", getCropMarketForeign());
		attributes.put("valueOfSale", getValueOfSale());
		attributes.put("cropCounter", getCropCounter());
		attributes.put(
			"agricultureApplicationId", getAgricultureApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long agricultureCropId = (Long)attributes.get("agricultureCropId");

		if (agricultureCropId != null) {
			setAgricultureCropId(agricultureCropId);
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

		String cropType = (String)attributes.get("cropType");

		if (cropType != null) {
			setCropType(cropType);
		}

		String cropHectare = (String)attributes.get("cropHectare");

		if (cropHectare != null) {
			setCropHectare(cropHectare);
		}

		String averageAnnualProduction = (String)attributes.get(
			"averageAnnualProduction");

		if (averageAnnualProduction != null) {
			setAverageAnnualProduction(averageAnnualProduction);
		}

		String cropMarketLocal = (String)attributes.get("cropMarketLocal");

		if (cropMarketLocal != null) {
			setCropMarketLocal(cropMarketLocal);
		}

		String cropMarketForeign = (String)attributes.get("cropMarketForeign");

		if (cropMarketForeign != null) {
			setCropMarketForeign(cropMarketForeign);
		}

		String valueOfSale = (String)attributes.get("valueOfSale");

		if (valueOfSale != null) {
			setValueOfSale(valueOfSale);
		}

		String cropCounter = (String)attributes.get("cropCounter");

		if (cropCounter != null) {
			setCropCounter(cropCounter);
		}

		Long agricultureApplicationId = (Long)attributes.get(
			"agricultureApplicationId");

		if (agricultureApplicationId != null) {
			setAgricultureApplicationId(agricultureApplicationId);
		}
	}

	@Override
	public AgricultureCrop cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the agriculture application ID of this agriculture crop.
	 *
	 * @return the agriculture application ID of this agriculture crop
	 */
	@Override
	public long getAgricultureApplicationId() {
		return model.getAgricultureApplicationId();
	}

	/**
	 * Returns the agriculture crop ID of this agriculture crop.
	 *
	 * @return the agriculture crop ID of this agriculture crop
	 */
	@Override
	public long getAgricultureCropId() {
		return model.getAgricultureCropId();
	}

	/**
	 * Returns the average annual production of this agriculture crop.
	 *
	 * @return the average annual production of this agriculture crop
	 */
	@Override
	public String getAverageAnnualProduction() {
		return model.getAverageAnnualProduction();
	}

	/**
	 * Returns the company ID of this agriculture crop.
	 *
	 * @return the company ID of this agriculture crop
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this agriculture crop.
	 *
	 * @return the create date of this agriculture crop
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the crop counter of this agriculture crop.
	 *
	 * @return the crop counter of this agriculture crop
	 */
	@Override
	public String getCropCounter() {
		return model.getCropCounter();
	}

	/**
	 * Returns the crop hectare of this agriculture crop.
	 *
	 * @return the crop hectare of this agriculture crop
	 */
	@Override
	public String getCropHectare() {
		return model.getCropHectare();
	}

	/**
	 * Returns the crop market foreign of this agriculture crop.
	 *
	 * @return the crop market foreign of this agriculture crop
	 */
	@Override
	public String getCropMarketForeign() {
		return model.getCropMarketForeign();
	}

	/**
	 * Returns the crop market local of this agriculture crop.
	 *
	 * @return the crop market local of this agriculture crop
	 */
	@Override
	public String getCropMarketLocal() {
		return model.getCropMarketLocal();
	}

	/**
	 * Returns the crop type of this agriculture crop.
	 *
	 * @return the crop type of this agriculture crop
	 */
	@Override
	public String getCropType() {
		return model.getCropType();
	}

	/**
	 * Returns the group ID of this agriculture crop.
	 *
	 * @return the group ID of this agriculture crop
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this agriculture crop.
	 *
	 * @return the modified date of this agriculture crop
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this agriculture crop.
	 *
	 * @return the primary key of this agriculture crop
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this agriculture crop.
	 *
	 * @return the user ID of this agriculture crop
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this agriculture crop.
	 *
	 * @return the user name of this agriculture crop
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this agriculture crop.
	 *
	 * @return the user uuid of this agriculture crop
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the value of sale of this agriculture crop.
	 *
	 * @return the value of sale of this agriculture crop
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
	 * Sets the agriculture application ID of this agriculture crop.
	 *
	 * @param agricultureApplicationId the agriculture application ID of this agriculture crop
	 */
	@Override
	public void setAgricultureApplicationId(long agricultureApplicationId) {
		model.setAgricultureApplicationId(agricultureApplicationId);
	}

	/**
	 * Sets the agriculture crop ID of this agriculture crop.
	 *
	 * @param agricultureCropId the agriculture crop ID of this agriculture crop
	 */
	@Override
	public void setAgricultureCropId(long agricultureCropId) {
		model.setAgricultureCropId(agricultureCropId);
	}

	/**
	 * Sets the average annual production of this agriculture crop.
	 *
	 * @param averageAnnualProduction the average annual production of this agriculture crop
	 */
	@Override
	public void setAverageAnnualProduction(String averageAnnualProduction) {
		model.setAverageAnnualProduction(averageAnnualProduction);
	}

	/**
	 * Sets the company ID of this agriculture crop.
	 *
	 * @param companyId the company ID of this agriculture crop
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this agriculture crop.
	 *
	 * @param createDate the create date of this agriculture crop
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the crop counter of this agriculture crop.
	 *
	 * @param cropCounter the crop counter of this agriculture crop
	 */
	@Override
	public void setCropCounter(String cropCounter) {
		model.setCropCounter(cropCounter);
	}

	/**
	 * Sets the crop hectare of this agriculture crop.
	 *
	 * @param cropHectare the crop hectare of this agriculture crop
	 */
	@Override
	public void setCropHectare(String cropHectare) {
		model.setCropHectare(cropHectare);
	}

	/**
	 * Sets the crop market foreign of this agriculture crop.
	 *
	 * @param cropMarketForeign the crop market foreign of this agriculture crop
	 */
	@Override
	public void setCropMarketForeign(String cropMarketForeign) {
		model.setCropMarketForeign(cropMarketForeign);
	}

	/**
	 * Sets the crop market local of this agriculture crop.
	 *
	 * @param cropMarketLocal the crop market local of this agriculture crop
	 */
	@Override
	public void setCropMarketLocal(String cropMarketLocal) {
		model.setCropMarketLocal(cropMarketLocal);
	}

	/**
	 * Sets the crop type of this agriculture crop.
	 *
	 * @param cropType the crop type of this agriculture crop
	 */
	@Override
	public void setCropType(String cropType) {
		model.setCropType(cropType);
	}

	/**
	 * Sets the group ID of this agriculture crop.
	 *
	 * @param groupId the group ID of this agriculture crop
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this agriculture crop.
	 *
	 * @param modifiedDate the modified date of this agriculture crop
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this agriculture crop.
	 *
	 * @param primaryKey the primary key of this agriculture crop
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this agriculture crop.
	 *
	 * @param userId the user ID of this agriculture crop
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this agriculture crop.
	 *
	 * @param userName the user name of this agriculture crop
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this agriculture crop.
	 *
	 * @param userUuid the user uuid of this agriculture crop
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the value of sale of this agriculture crop.
	 *
	 * @param valueOfSale the value of sale of this agriculture crop
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
	protected AgricultureCropWrapper wrap(AgricultureCrop agricultureCrop) {
		return new AgricultureCropWrapper(agricultureCrop);
	}

}