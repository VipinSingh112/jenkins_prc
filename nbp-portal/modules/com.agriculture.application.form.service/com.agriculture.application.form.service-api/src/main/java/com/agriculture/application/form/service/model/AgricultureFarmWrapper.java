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
 * This class is a wrapper for {@link AgricultureFarm}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureFarm
 * @generated
 */
public class AgricultureFarmWrapper
	extends BaseModelWrapper<AgricultureFarm>
	implements AgricultureFarm, ModelWrapper<AgricultureFarm> {

	public AgricultureFarmWrapper(AgricultureFarm agricultureFarm) {
		super(agricultureFarm);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("agricultureFarmId", getAgricultureFarmId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("locationOfFarm", getLocationOfFarm());
		attributes.put("landTenure", getLandTenure());
		attributes.put("numberOfHectares", getNumberOfHectares());
		attributes.put("numberOfYears", getNumberOfYears());
		attributes.put("numberOfParcels", getNumberOfParcels());
		attributes.put("sizeOfParcel", getSizeOfParcel());
		attributes.put("topography", getTopography());
		attributes.put("numberOF", getNumberOF());
		attributes.put("farmCounter", getFarmCounter());
		attributes.put(
			"agricultureApplicationId", getAgricultureApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long agricultureFarmId = (Long)attributes.get("agricultureFarmId");

		if (agricultureFarmId != null) {
			setAgricultureFarmId(agricultureFarmId);
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

		String locationOfFarm = (String)attributes.get("locationOfFarm");

		if (locationOfFarm != null) {
			setLocationOfFarm(locationOfFarm);
		}

		String landTenure = (String)attributes.get("landTenure");

		if (landTenure != null) {
			setLandTenure(landTenure);
		}

		String numberOfHectares = (String)attributes.get("numberOfHectares");

		if (numberOfHectares != null) {
			setNumberOfHectares(numberOfHectares);
		}

		String numberOfYears = (String)attributes.get("numberOfYears");

		if (numberOfYears != null) {
			setNumberOfYears(numberOfYears);
		}

		String numberOfParcels = (String)attributes.get("numberOfParcels");

		if (numberOfParcels != null) {
			setNumberOfParcels(numberOfParcels);
		}

		String sizeOfParcel = (String)attributes.get("sizeOfParcel");

		if (sizeOfParcel != null) {
			setSizeOfParcel(sizeOfParcel);
		}

		String topography = (String)attributes.get("topography");

		if (topography != null) {
			setTopography(topography);
		}

		String numberOF = (String)attributes.get("numberOF");

		if (numberOF != null) {
			setNumberOF(numberOF);
		}

		String farmCounter = (String)attributes.get("farmCounter");

		if (farmCounter != null) {
			setFarmCounter(farmCounter);
		}

		Long agricultureApplicationId = (Long)attributes.get(
			"agricultureApplicationId");

		if (agricultureApplicationId != null) {
			setAgricultureApplicationId(agricultureApplicationId);
		}
	}

	@Override
	public AgricultureFarm cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the agriculture application ID of this agriculture farm.
	 *
	 * @return the agriculture application ID of this agriculture farm
	 */
	@Override
	public long getAgricultureApplicationId() {
		return model.getAgricultureApplicationId();
	}

	/**
	 * Returns the agriculture farm ID of this agriculture farm.
	 *
	 * @return the agriculture farm ID of this agriculture farm
	 */
	@Override
	public long getAgricultureFarmId() {
		return model.getAgricultureFarmId();
	}

	/**
	 * Returns the company ID of this agriculture farm.
	 *
	 * @return the company ID of this agriculture farm
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this agriculture farm.
	 *
	 * @return the create date of this agriculture farm
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the farm counter of this agriculture farm.
	 *
	 * @return the farm counter of this agriculture farm
	 */
	@Override
	public String getFarmCounter() {
		return model.getFarmCounter();
	}

	/**
	 * Returns the group ID of this agriculture farm.
	 *
	 * @return the group ID of this agriculture farm
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the land tenure of this agriculture farm.
	 *
	 * @return the land tenure of this agriculture farm
	 */
	@Override
	public String getLandTenure() {
		return model.getLandTenure();
	}

	/**
	 * Returns the location of farm of this agriculture farm.
	 *
	 * @return the location of farm of this agriculture farm
	 */
	@Override
	public String getLocationOfFarm() {
		return model.getLocationOfFarm();
	}

	/**
	 * Returns the modified date of this agriculture farm.
	 *
	 * @return the modified date of this agriculture farm
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the number of of this agriculture farm.
	 *
	 * @return the number of of this agriculture farm
	 */
	@Override
	public String getNumberOF() {
		return model.getNumberOF();
	}

	/**
	 * Returns the number of hectares of this agriculture farm.
	 *
	 * @return the number of hectares of this agriculture farm
	 */
	@Override
	public String getNumberOfHectares() {
		return model.getNumberOfHectares();
	}

	/**
	 * Returns the number of parcels of this agriculture farm.
	 *
	 * @return the number of parcels of this agriculture farm
	 */
	@Override
	public String getNumberOfParcels() {
		return model.getNumberOfParcels();
	}

	/**
	 * Returns the number of years of this agriculture farm.
	 *
	 * @return the number of years of this agriculture farm
	 */
	@Override
	public String getNumberOfYears() {
		return model.getNumberOfYears();
	}

	/**
	 * Returns the primary key of this agriculture farm.
	 *
	 * @return the primary key of this agriculture farm
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the size of parcel of this agriculture farm.
	 *
	 * @return the size of parcel of this agriculture farm
	 */
	@Override
	public String getSizeOfParcel() {
		return model.getSizeOfParcel();
	}

	/**
	 * Returns the topography of this agriculture farm.
	 *
	 * @return the topography of this agriculture farm
	 */
	@Override
	public String getTopography() {
		return model.getTopography();
	}

	/**
	 * Returns the user ID of this agriculture farm.
	 *
	 * @return the user ID of this agriculture farm
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this agriculture farm.
	 *
	 * @return the user name of this agriculture farm
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this agriculture farm.
	 *
	 * @return the user uuid of this agriculture farm
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
	 * Sets the agriculture application ID of this agriculture farm.
	 *
	 * @param agricultureApplicationId the agriculture application ID of this agriculture farm
	 */
	@Override
	public void setAgricultureApplicationId(long agricultureApplicationId) {
		model.setAgricultureApplicationId(agricultureApplicationId);
	}

	/**
	 * Sets the agriculture farm ID of this agriculture farm.
	 *
	 * @param agricultureFarmId the agriculture farm ID of this agriculture farm
	 */
	@Override
	public void setAgricultureFarmId(long agricultureFarmId) {
		model.setAgricultureFarmId(agricultureFarmId);
	}

	/**
	 * Sets the company ID of this agriculture farm.
	 *
	 * @param companyId the company ID of this agriculture farm
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this agriculture farm.
	 *
	 * @param createDate the create date of this agriculture farm
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the farm counter of this agriculture farm.
	 *
	 * @param farmCounter the farm counter of this agriculture farm
	 */
	@Override
	public void setFarmCounter(String farmCounter) {
		model.setFarmCounter(farmCounter);
	}

	/**
	 * Sets the group ID of this agriculture farm.
	 *
	 * @param groupId the group ID of this agriculture farm
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the land tenure of this agriculture farm.
	 *
	 * @param landTenure the land tenure of this agriculture farm
	 */
	@Override
	public void setLandTenure(String landTenure) {
		model.setLandTenure(landTenure);
	}

	/**
	 * Sets the location of farm of this agriculture farm.
	 *
	 * @param locationOfFarm the location of farm of this agriculture farm
	 */
	@Override
	public void setLocationOfFarm(String locationOfFarm) {
		model.setLocationOfFarm(locationOfFarm);
	}

	/**
	 * Sets the modified date of this agriculture farm.
	 *
	 * @param modifiedDate the modified date of this agriculture farm
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the number of of this agriculture farm.
	 *
	 * @param numberOF the number of of this agriculture farm
	 */
	@Override
	public void setNumberOF(String numberOF) {
		model.setNumberOF(numberOF);
	}

	/**
	 * Sets the number of hectares of this agriculture farm.
	 *
	 * @param numberOfHectares the number of hectares of this agriculture farm
	 */
	@Override
	public void setNumberOfHectares(String numberOfHectares) {
		model.setNumberOfHectares(numberOfHectares);
	}

	/**
	 * Sets the number of parcels of this agriculture farm.
	 *
	 * @param numberOfParcels the number of parcels of this agriculture farm
	 */
	@Override
	public void setNumberOfParcels(String numberOfParcels) {
		model.setNumberOfParcels(numberOfParcels);
	}

	/**
	 * Sets the number of years of this agriculture farm.
	 *
	 * @param numberOfYears the number of years of this agriculture farm
	 */
	@Override
	public void setNumberOfYears(String numberOfYears) {
		model.setNumberOfYears(numberOfYears);
	}

	/**
	 * Sets the primary key of this agriculture farm.
	 *
	 * @param primaryKey the primary key of this agriculture farm
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the size of parcel of this agriculture farm.
	 *
	 * @param sizeOfParcel the size of parcel of this agriculture farm
	 */
	@Override
	public void setSizeOfParcel(String sizeOfParcel) {
		model.setSizeOfParcel(sizeOfParcel);
	}

	/**
	 * Sets the topography of this agriculture farm.
	 *
	 * @param topography the topography of this agriculture farm
	 */
	@Override
	public void setTopography(String topography) {
		model.setTopography(topography);
	}

	/**
	 * Sets the user ID of this agriculture farm.
	 *
	 * @param userId the user ID of this agriculture farm
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this agriculture farm.
	 *
	 * @param userName the user name of this agriculture farm
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this agriculture farm.
	 *
	 * @param userUuid the user uuid of this agriculture farm
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
	protected AgricultureFarmWrapper wrap(AgricultureFarm agricultureFarm) {
		return new AgricultureFarmWrapper(agricultureFarm);
	}

}