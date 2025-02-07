/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AttractionWaterRequired}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionWaterRequired
 * @generated
 */
public class AttractionWaterRequiredWrapper
	extends BaseModelWrapper<AttractionWaterRequired>
	implements AttractionWaterRequired, ModelWrapper<AttractionWaterRequired> {

	public AttractionWaterRequiredWrapper(
		AttractionWaterRequired attractionWaterRequired) {

		super(attractionWaterRequired);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"attractionWaterRequiredId", getAttractionWaterRequiredId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("generalOperator", getGeneralOperator());
		attributes.put("waterCraft", getWaterCraft());
		attributes.put("waterSki", getWaterSki());
		attributes.put("sunfishSail", getSunfishSail());
		attributes.put("parasail", getParasail());
		attributes.put("scubaDiving", getScubaDiving());
		attributes.put("glassBoat", getGlassBoat());
		attributes.put("bananaBoat", getBananaBoat());
		attributes.put("jtbApplicationId", getJtbApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long attractionWaterRequiredId = (Long)attributes.get(
			"attractionWaterRequiredId");

		if (attractionWaterRequiredId != null) {
			setAttractionWaterRequiredId(attractionWaterRequiredId);
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

		String generalOperator = (String)attributes.get("generalOperator");

		if (generalOperator != null) {
			setGeneralOperator(generalOperator);
		}

		String waterCraft = (String)attributes.get("waterCraft");

		if (waterCraft != null) {
			setWaterCraft(waterCraft);
		}

		String waterSki = (String)attributes.get("waterSki");

		if (waterSki != null) {
			setWaterSki(waterSki);
		}

		String sunfishSail = (String)attributes.get("sunfishSail");

		if (sunfishSail != null) {
			setSunfishSail(sunfishSail);
		}

		String parasail = (String)attributes.get("parasail");

		if (parasail != null) {
			setParasail(parasail);
		}

		String scubaDiving = (String)attributes.get("scubaDiving");

		if (scubaDiving != null) {
			setScubaDiving(scubaDiving);
		}

		String glassBoat = (String)attributes.get("glassBoat");

		if (glassBoat != null) {
			setGlassBoat(glassBoat);
		}

		String bananaBoat = (String)attributes.get("bananaBoat");

		if (bananaBoat != null) {
			setBananaBoat(bananaBoat);
		}

		Long jtbApplicationId = (Long)attributes.get("jtbApplicationId");

		if (jtbApplicationId != null) {
			setJtbApplicationId(jtbApplicationId);
		}
	}

	@Override
	public AttractionWaterRequired cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the attraction water required ID of this attraction water required.
	 *
	 * @return the attraction water required ID of this attraction water required
	 */
	@Override
	public long getAttractionWaterRequiredId() {
		return model.getAttractionWaterRequiredId();
	}

	/**
	 * Returns the banana boat of this attraction water required.
	 *
	 * @return the banana boat of this attraction water required
	 */
	@Override
	public String getBananaBoat() {
		return model.getBananaBoat();
	}

	/**
	 * Returns the company ID of this attraction water required.
	 *
	 * @return the company ID of this attraction water required
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this attraction water required.
	 *
	 * @return the create date of this attraction water required
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the general operator of this attraction water required.
	 *
	 * @return the general operator of this attraction water required
	 */
	@Override
	public String getGeneralOperator() {
		return model.getGeneralOperator();
	}

	/**
	 * Returns the glass boat of this attraction water required.
	 *
	 * @return the glass boat of this attraction water required
	 */
	@Override
	public String getGlassBoat() {
		return model.getGlassBoat();
	}

	/**
	 * Returns the group ID of this attraction water required.
	 *
	 * @return the group ID of this attraction water required
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jtb application ID of this attraction water required.
	 *
	 * @return the jtb application ID of this attraction water required
	 */
	@Override
	public long getJtbApplicationId() {
		return model.getJtbApplicationId();
	}

	/**
	 * Returns the modified date of this attraction water required.
	 *
	 * @return the modified date of this attraction water required
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the parasail of this attraction water required.
	 *
	 * @return the parasail of this attraction water required
	 */
	@Override
	public String getParasail() {
		return model.getParasail();
	}

	/**
	 * Returns the primary key of this attraction water required.
	 *
	 * @return the primary key of this attraction water required
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the scuba diving of this attraction water required.
	 *
	 * @return the scuba diving of this attraction water required
	 */
	@Override
	public String getScubaDiving() {
		return model.getScubaDiving();
	}

	/**
	 * Returns the sunfish sail of this attraction water required.
	 *
	 * @return the sunfish sail of this attraction water required
	 */
	@Override
	public String getSunfishSail() {
		return model.getSunfishSail();
	}

	/**
	 * Returns the user ID of this attraction water required.
	 *
	 * @return the user ID of this attraction water required
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this attraction water required.
	 *
	 * @return the user name of this attraction water required
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this attraction water required.
	 *
	 * @return the user uuid of this attraction water required
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the water craft of this attraction water required.
	 *
	 * @return the water craft of this attraction water required
	 */
	@Override
	public String getWaterCraft() {
		return model.getWaterCraft();
	}

	/**
	 * Returns the water ski of this attraction water required.
	 *
	 * @return the water ski of this attraction water required
	 */
	@Override
	public String getWaterSki() {
		return model.getWaterSki();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the attraction water required ID of this attraction water required.
	 *
	 * @param attractionWaterRequiredId the attraction water required ID of this attraction water required
	 */
	@Override
	public void setAttractionWaterRequiredId(long attractionWaterRequiredId) {
		model.setAttractionWaterRequiredId(attractionWaterRequiredId);
	}

	/**
	 * Sets the banana boat of this attraction water required.
	 *
	 * @param bananaBoat the banana boat of this attraction water required
	 */
	@Override
	public void setBananaBoat(String bananaBoat) {
		model.setBananaBoat(bananaBoat);
	}

	/**
	 * Sets the company ID of this attraction water required.
	 *
	 * @param companyId the company ID of this attraction water required
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this attraction water required.
	 *
	 * @param createDate the create date of this attraction water required
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the general operator of this attraction water required.
	 *
	 * @param generalOperator the general operator of this attraction water required
	 */
	@Override
	public void setGeneralOperator(String generalOperator) {
		model.setGeneralOperator(generalOperator);
	}

	/**
	 * Sets the glass boat of this attraction water required.
	 *
	 * @param glassBoat the glass boat of this attraction water required
	 */
	@Override
	public void setGlassBoat(String glassBoat) {
		model.setGlassBoat(glassBoat);
	}

	/**
	 * Sets the group ID of this attraction water required.
	 *
	 * @param groupId the group ID of this attraction water required
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jtb application ID of this attraction water required.
	 *
	 * @param jtbApplicationId the jtb application ID of this attraction water required
	 */
	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		model.setJtbApplicationId(jtbApplicationId);
	}

	/**
	 * Sets the modified date of this attraction water required.
	 *
	 * @param modifiedDate the modified date of this attraction water required
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the parasail of this attraction water required.
	 *
	 * @param parasail the parasail of this attraction water required
	 */
	@Override
	public void setParasail(String parasail) {
		model.setParasail(parasail);
	}

	/**
	 * Sets the primary key of this attraction water required.
	 *
	 * @param primaryKey the primary key of this attraction water required
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the scuba diving of this attraction water required.
	 *
	 * @param scubaDiving the scuba diving of this attraction water required
	 */
	@Override
	public void setScubaDiving(String scubaDiving) {
		model.setScubaDiving(scubaDiving);
	}

	/**
	 * Sets the sunfish sail of this attraction water required.
	 *
	 * @param sunfishSail the sunfish sail of this attraction water required
	 */
	@Override
	public void setSunfishSail(String sunfishSail) {
		model.setSunfishSail(sunfishSail);
	}

	/**
	 * Sets the user ID of this attraction water required.
	 *
	 * @param userId the user ID of this attraction water required
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this attraction water required.
	 *
	 * @param userName the user name of this attraction water required
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this attraction water required.
	 *
	 * @param userUuid the user uuid of this attraction water required
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the water craft of this attraction water required.
	 *
	 * @param waterCraft the water craft of this attraction water required
	 */
	@Override
	public void setWaterCraft(String waterCraft) {
		model.setWaterCraft(waterCraft);
	}

	/**
	 * Sets the water ski of this attraction water required.
	 *
	 * @param waterSki the water ski of this attraction water required
	 */
	@Override
	public void setWaterSki(String waterSki) {
		model.setWaterSki(waterSki);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected AttractionWaterRequiredWrapper wrap(
		AttractionWaterRequired attractionWaterRequired) {

		return new AttractionWaterRequiredWrapper(attractionWaterRequired);
	}

}