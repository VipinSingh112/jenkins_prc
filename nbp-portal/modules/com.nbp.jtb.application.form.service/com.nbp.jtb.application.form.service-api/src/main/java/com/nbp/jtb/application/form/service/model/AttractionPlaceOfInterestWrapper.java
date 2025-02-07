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
 * This class is a wrapper for {@link AttractionPlaceOfInterest}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionPlaceOfInterest
 * @generated
 */
public class AttractionPlaceOfInterestWrapper
	extends BaseModelWrapper<AttractionPlaceOfInterest>
	implements AttractionPlaceOfInterest,
			   ModelWrapper<AttractionPlaceOfInterest> {

	public AttractionPlaceOfInterestWrapper(
		AttractionPlaceOfInterest attractionPlaceOfInterest) {

		super(attractionPlaceOfInterest);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"attractionPlaceOfInterestId", getAttractionPlaceOfInterestId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("placeOfInterest", getPlaceOfInterest());
		attributes.put("typeOfRole", getTypeOfRole());
		attributes.put("placeInterestOwnerName", getPlaceInterestOwnerName());
		attributes.put("nameOfInterestLocation", getNameOfInterestLocation());
		attributes.put("placeOfInterestLocation", getPlaceOfInterestLocation());
		attributes.put("placeOfInterestMailing", getPlaceOfInterestMailing());
		attributes.put(
			"placeOfInterestTelephone", getPlaceOfInterestTelephone());
		attributes.put("placeOfInterestEmail", getPlaceOfInterestEmail());
		attributes.put(
			"placeOfInterestEmployeesNo", getPlaceOfInterestEmployeesNo());
		attributes.put("placeOfInterestParish", getPlaceOfInterestParish());
		attributes.put(
			"placeOfInterestOwnerGenDec", getPlaceOfInterestOwnerGenDec());
		attributes.put(
			"placeOfInterestHotelLaws", getPlaceOfInterestHotelLaws());
		attributes.put("placeOfInterestDate", getPlaceOfInterestDate());
		attributes.put("placeOfInterestName", getPlaceOfInterestName());
		attributes.put(
			"placeOfInterestOperating", getPlaceOfInterestOperating());
		attributes.put(
			"placeOfInterestAcresLand", getPlaceOfInterestAcresLand());
		attributes.put("walkingTour", getWalkingTour());
		attributes.put("cemeteryTour", getCemeteryTour());
		attributes.put("gardenTour", getGardenTour());
		attributes.put("placeOfInterestRooms", getPlaceOfInterestRooms());
		attributes.put(
			"placeOfInterestTentSpace", getPlaceOfInterestTentSpace());
		attributes.put("placeOfInterestShowers", getPlaceOfInterestShowers());
		attributes.put("placeOfInterestSanitary", getPlaceOfInterestSanitary());
		attributes.put("placeOfInterestSignDate", getPlaceOfInterestSignDate());
		attributes.put("jtbApplicationId", getJtbApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long attractionPlaceOfInterestId = (Long)attributes.get(
			"attractionPlaceOfInterestId");

		if (attractionPlaceOfInterestId != null) {
			setAttractionPlaceOfInterestId(attractionPlaceOfInterestId);
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

		String placeOfInterest = (String)attributes.get("placeOfInterest");

		if (placeOfInterest != null) {
			setPlaceOfInterest(placeOfInterest);
		}

		String typeOfRole = (String)attributes.get("typeOfRole");

		if (typeOfRole != null) {
			setTypeOfRole(typeOfRole);
		}

		String placeInterestOwnerName = (String)attributes.get(
			"placeInterestOwnerName");

		if (placeInterestOwnerName != null) {
			setPlaceInterestOwnerName(placeInterestOwnerName);
		}

		String nameOfInterestLocation = (String)attributes.get(
			"nameOfInterestLocation");

		if (nameOfInterestLocation != null) {
			setNameOfInterestLocation(nameOfInterestLocation);
		}

		String placeOfInterestLocation = (String)attributes.get(
			"placeOfInterestLocation");

		if (placeOfInterestLocation != null) {
			setPlaceOfInterestLocation(placeOfInterestLocation);
		}

		String placeOfInterestMailing = (String)attributes.get(
			"placeOfInterestMailing");

		if (placeOfInterestMailing != null) {
			setPlaceOfInterestMailing(placeOfInterestMailing);
		}

		String placeOfInterestTelephone = (String)attributes.get(
			"placeOfInterestTelephone");

		if (placeOfInterestTelephone != null) {
			setPlaceOfInterestTelephone(placeOfInterestTelephone);
		}

		String placeOfInterestEmail = (String)attributes.get(
			"placeOfInterestEmail");

		if (placeOfInterestEmail != null) {
			setPlaceOfInterestEmail(placeOfInterestEmail);
		}

		String placeOfInterestEmployeesNo = (String)attributes.get(
			"placeOfInterestEmployeesNo");

		if (placeOfInterestEmployeesNo != null) {
			setPlaceOfInterestEmployeesNo(placeOfInterestEmployeesNo);
		}

		String placeOfInterestParish = (String)attributes.get(
			"placeOfInterestParish");

		if (placeOfInterestParish != null) {
			setPlaceOfInterestParish(placeOfInterestParish);
		}

		String placeOfInterestOwnerGenDec = (String)attributes.get(
			"placeOfInterestOwnerGenDec");

		if (placeOfInterestOwnerGenDec != null) {
			setPlaceOfInterestOwnerGenDec(placeOfInterestOwnerGenDec);
		}

		String placeOfInterestHotelLaws = (String)attributes.get(
			"placeOfInterestHotelLaws");

		if (placeOfInterestHotelLaws != null) {
			setPlaceOfInterestHotelLaws(placeOfInterestHotelLaws);
		}

		Date placeOfInterestDate = (Date)attributes.get("placeOfInterestDate");

		if (placeOfInterestDate != null) {
			setPlaceOfInterestDate(placeOfInterestDate);
		}

		String placeOfInterestName = (String)attributes.get(
			"placeOfInterestName");

		if (placeOfInterestName != null) {
			setPlaceOfInterestName(placeOfInterestName);
		}

		Date placeOfInterestOperating = (Date)attributes.get(
			"placeOfInterestOperating");

		if (placeOfInterestOperating != null) {
			setPlaceOfInterestOperating(placeOfInterestOperating);
		}

		String placeOfInterestAcresLand = (String)attributes.get(
			"placeOfInterestAcresLand");

		if (placeOfInterestAcresLand != null) {
			setPlaceOfInterestAcresLand(placeOfInterestAcresLand);
		}

		String walkingTour = (String)attributes.get("walkingTour");

		if (walkingTour != null) {
			setWalkingTour(walkingTour);
		}

		String cemeteryTour = (String)attributes.get("cemeteryTour");

		if (cemeteryTour != null) {
			setCemeteryTour(cemeteryTour);
		}

		String gardenTour = (String)attributes.get("gardenTour");

		if (gardenTour != null) {
			setGardenTour(gardenTour);
		}

		String placeOfInterestRooms = (String)attributes.get(
			"placeOfInterestRooms");

		if (placeOfInterestRooms != null) {
			setPlaceOfInterestRooms(placeOfInterestRooms);
		}

		String placeOfInterestTentSpace = (String)attributes.get(
			"placeOfInterestTentSpace");

		if (placeOfInterestTentSpace != null) {
			setPlaceOfInterestTentSpace(placeOfInterestTentSpace);
		}

		String placeOfInterestShowers = (String)attributes.get(
			"placeOfInterestShowers");

		if (placeOfInterestShowers != null) {
			setPlaceOfInterestShowers(placeOfInterestShowers);
		}

		String placeOfInterestSanitary = (String)attributes.get(
			"placeOfInterestSanitary");

		if (placeOfInterestSanitary != null) {
			setPlaceOfInterestSanitary(placeOfInterestSanitary);
		}

		Date placeOfInterestSignDate = (Date)attributes.get(
			"placeOfInterestSignDate");

		if (placeOfInterestSignDate != null) {
			setPlaceOfInterestSignDate(placeOfInterestSignDate);
		}

		Long jtbApplicationId = (Long)attributes.get("jtbApplicationId");

		if (jtbApplicationId != null) {
			setJtbApplicationId(jtbApplicationId);
		}
	}

	@Override
	public AttractionPlaceOfInterest cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the attraction place of interest ID of this attraction place of interest.
	 *
	 * @return the attraction place of interest ID of this attraction place of interest
	 */
	@Override
	public long getAttractionPlaceOfInterestId() {
		return model.getAttractionPlaceOfInterestId();
	}

	/**
	 * Returns the cemetery tour of this attraction place of interest.
	 *
	 * @return the cemetery tour of this attraction place of interest
	 */
	@Override
	public String getCemeteryTour() {
		return model.getCemeteryTour();
	}

	/**
	 * Returns the company ID of this attraction place of interest.
	 *
	 * @return the company ID of this attraction place of interest
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this attraction place of interest.
	 *
	 * @return the create date of this attraction place of interest
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the garden tour of this attraction place of interest.
	 *
	 * @return the garden tour of this attraction place of interest
	 */
	@Override
	public String getGardenTour() {
		return model.getGardenTour();
	}

	/**
	 * Returns the group ID of this attraction place of interest.
	 *
	 * @return the group ID of this attraction place of interest
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jtb application ID of this attraction place of interest.
	 *
	 * @return the jtb application ID of this attraction place of interest
	 */
	@Override
	public long getJtbApplicationId() {
		return model.getJtbApplicationId();
	}

	/**
	 * Returns the modified date of this attraction place of interest.
	 *
	 * @return the modified date of this attraction place of interest
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of interest location of this attraction place of interest.
	 *
	 * @return the name of interest location of this attraction place of interest
	 */
	@Override
	public String getNameOfInterestLocation() {
		return model.getNameOfInterestLocation();
	}

	/**
	 * Returns the place interest owner name of this attraction place of interest.
	 *
	 * @return the place interest owner name of this attraction place of interest
	 */
	@Override
	public String getPlaceInterestOwnerName() {
		return model.getPlaceInterestOwnerName();
	}

	/**
	 * Returns the place of interest of this attraction place of interest.
	 *
	 * @return the place of interest of this attraction place of interest
	 */
	@Override
	public String getPlaceOfInterest() {
		return model.getPlaceOfInterest();
	}

	/**
	 * Returns the place of interest acres land of this attraction place of interest.
	 *
	 * @return the place of interest acres land of this attraction place of interest
	 */
	@Override
	public String getPlaceOfInterestAcresLand() {
		return model.getPlaceOfInterestAcresLand();
	}

	/**
	 * Returns the place of interest date of this attraction place of interest.
	 *
	 * @return the place of interest date of this attraction place of interest
	 */
	@Override
	public Date getPlaceOfInterestDate() {
		return model.getPlaceOfInterestDate();
	}

	/**
	 * Returns the place of interest email of this attraction place of interest.
	 *
	 * @return the place of interest email of this attraction place of interest
	 */
	@Override
	public String getPlaceOfInterestEmail() {
		return model.getPlaceOfInterestEmail();
	}

	/**
	 * Returns the place of interest employees no of this attraction place of interest.
	 *
	 * @return the place of interest employees no of this attraction place of interest
	 */
	@Override
	public String getPlaceOfInterestEmployeesNo() {
		return model.getPlaceOfInterestEmployeesNo();
	}

	/**
	 * Returns the place of interest hotel laws of this attraction place of interest.
	 *
	 * @return the place of interest hotel laws of this attraction place of interest
	 */
	@Override
	public String getPlaceOfInterestHotelLaws() {
		return model.getPlaceOfInterestHotelLaws();
	}

	/**
	 * Returns the place of interest location of this attraction place of interest.
	 *
	 * @return the place of interest location of this attraction place of interest
	 */
	@Override
	public String getPlaceOfInterestLocation() {
		return model.getPlaceOfInterestLocation();
	}

	/**
	 * Returns the place of interest mailing of this attraction place of interest.
	 *
	 * @return the place of interest mailing of this attraction place of interest
	 */
	@Override
	public String getPlaceOfInterestMailing() {
		return model.getPlaceOfInterestMailing();
	}

	/**
	 * Returns the place of interest name of this attraction place of interest.
	 *
	 * @return the place of interest name of this attraction place of interest
	 */
	@Override
	public String getPlaceOfInterestName() {
		return model.getPlaceOfInterestName();
	}

	/**
	 * Returns the place of interest operating of this attraction place of interest.
	 *
	 * @return the place of interest operating of this attraction place of interest
	 */
	@Override
	public Date getPlaceOfInterestOperating() {
		return model.getPlaceOfInterestOperating();
	}

	/**
	 * Returns the place of interest owner gen dec of this attraction place of interest.
	 *
	 * @return the place of interest owner gen dec of this attraction place of interest
	 */
	@Override
	public String getPlaceOfInterestOwnerGenDec() {
		return model.getPlaceOfInterestOwnerGenDec();
	}

	/**
	 * Returns the place of interest parish of this attraction place of interest.
	 *
	 * @return the place of interest parish of this attraction place of interest
	 */
	@Override
	public String getPlaceOfInterestParish() {
		return model.getPlaceOfInterestParish();
	}

	/**
	 * Returns the place of interest rooms of this attraction place of interest.
	 *
	 * @return the place of interest rooms of this attraction place of interest
	 */
	@Override
	public String getPlaceOfInterestRooms() {
		return model.getPlaceOfInterestRooms();
	}

	/**
	 * Returns the place of interest sanitary of this attraction place of interest.
	 *
	 * @return the place of interest sanitary of this attraction place of interest
	 */
	@Override
	public String getPlaceOfInterestSanitary() {
		return model.getPlaceOfInterestSanitary();
	}

	/**
	 * Returns the place of interest showers of this attraction place of interest.
	 *
	 * @return the place of interest showers of this attraction place of interest
	 */
	@Override
	public String getPlaceOfInterestShowers() {
		return model.getPlaceOfInterestShowers();
	}

	/**
	 * Returns the place of interest sign date of this attraction place of interest.
	 *
	 * @return the place of interest sign date of this attraction place of interest
	 */
	@Override
	public Date getPlaceOfInterestSignDate() {
		return model.getPlaceOfInterestSignDate();
	}

	/**
	 * Returns the place of interest telephone of this attraction place of interest.
	 *
	 * @return the place of interest telephone of this attraction place of interest
	 */
	@Override
	public String getPlaceOfInterestTelephone() {
		return model.getPlaceOfInterestTelephone();
	}

	/**
	 * Returns the place of interest tent space of this attraction place of interest.
	 *
	 * @return the place of interest tent space of this attraction place of interest
	 */
	@Override
	public String getPlaceOfInterestTentSpace() {
		return model.getPlaceOfInterestTentSpace();
	}

	/**
	 * Returns the primary key of this attraction place of interest.
	 *
	 * @return the primary key of this attraction place of interest
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the type of role of this attraction place of interest.
	 *
	 * @return the type of role of this attraction place of interest
	 */
	@Override
	public String getTypeOfRole() {
		return model.getTypeOfRole();
	}

	/**
	 * Returns the user ID of this attraction place of interest.
	 *
	 * @return the user ID of this attraction place of interest
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this attraction place of interest.
	 *
	 * @return the user name of this attraction place of interest
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this attraction place of interest.
	 *
	 * @return the user uuid of this attraction place of interest
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the walking tour of this attraction place of interest.
	 *
	 * @return the walking tour of this attraction place of interest
	 */
	@Override
	public String getWalkingTour() {
		return model.getWalkingTour();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the attraction place of interest ID of this attraction place of interest.
	 *
	 * @param attractionPlaceOfInterestId the attraction place of interest ID of this attraction place of interest
	 */
	@Override
	public void setAttractionPlaceOfInterestId(
		long attractionPlaceOfInterestId) {

		model.setAttractionPlaceOfInterestId(attractionPlaceOfInterestId);
	}

	/**
	 * Sets the cemetery tour of this attraction place of interest.
	 *
	 * @param cemeteryTour the cemetery tour of this attraction place of interest
	 */
	@Override
	public void setCemeteryTour(String cemeteryTour) {
		model.setCemeteryTour(cemeteryTour);
	}

	/**
	 * Sets the company ID of this attraction place of interest.
	 *
	 * @param companyId the company ID of this attraction place of interest
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this attraction place of interest.
	 *
	 * @param createDate the create date of this attraction place of interest
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the garden tour of this attraction place of interest.
	 *
	 * @param gardenTour the garden tour of this attraction place of interest
	 */
	@Override
	public void setGardenTour(String gardenTour) {
		model.setGardenTour(gardenTour);
	}

	/**
	 * Sets the group ID of this attraction place of interest.
	 *
	 * @param groupId the group ID of this attraction place of interest
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jtb application ID of this attraction place of interest.
	 *
	 * @param jtbApplicationId the jtb application ID of this attraction place of interest
	 */
	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		model.setJtbApplicationId(jtbApplicationId);
	}

	/**
	 * Sets the modified date of this attraction place of interest.
	 *
	 * @param modifiedDate the modified date of this attraction place of interest
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of interest location of this attraction place of interest.
	 *
	 * @param nameOfInterestLocation the name of interest location of this attraction place of interest
	 */
	@Override
	public void setNameOfInterestLocation(String nameOfInterestLocation) {
		model.setNameOfInterestLocation(nameOfInterestLocation);
	}

	/**
	 * Sets the place interest owner name of this attraction place of interest.
	 *
	 * @param placeInterestOwnerName the place interest owner name of this attraction place of interest
	 */
	@Override
	public void setPlaceInterestOwnerName(String placeInterestOwnerName) {
		model.setPlaceInterestOwnerName(placeInterestOwnerName);
	}

	/**
	 * Sets the place of interest of this attraction place of interest.
	 *
	 * @param placeOfInterest the place of interest of this attraction place of interest
	 */
	@Override
	public void setPlaceOfInterest(String placeOfInterest) {
		model.setPlaceOfInterest(placeOfInterest);
	}

	/**
	 * Sets the place of interest acres land of this attraction place of interest.
	 *
	 * @param placeOfInterestAcresLand the place of interest acres land of this attraction place of interest
	 */
	@Override
	public void setPlaceOfInterestAcresLand(String placeOfInterestAcresLand) {
		model.setPlaceOfInterestAcresLand(placeOfInterestAcresLand);
	}

	/**
	 * Sets the place of interest date of this attraction place of interest.
	 *
	 * @param placeOfInterestDate the place of interest date of this attraction place of interest
	 */
	@Override
	public void setPlaceOfInterestDate(Date placeOfInterestDate) {
		model.setPlaceOfInterestDate(placeOfInterestDate);
	}

	/**
	 * Sets the place of interest email of this attraction place of interest.
	 *
	 * @param placeOfInterestEmail the place of interest email of this attraction place of interest
	 */
	@Override
	public void setPlaceOfInterestEmail(String placeOfInterestEmail) {
		model.setPlaceOfInterestEmail(placeOfInterestEmail);
	}

	/**
	 * Sets the place of interest employees no of this attraction place of interest.
	 *
	 * @param placeOfInterestEmployeesNo the place of interest employees no of this attraction place of interest
	 */
	@Override
	public void setPlaceOfInterestEmployeesNo(
		String placeOfInterestEmployeesNo) {

		model.setPlaceOfInterestEmployeesNo(placeOfInterestEmployeesNo);
	}

	/**
	 * Sets the place of interest hotel laws of this attraction place of interest.
	 *
	 * @param placeOfInterestHotelLaws the place of interest hotel laws of this attraction place of interest
	 */
	@Override
	public void setPlaceOfInterestHotelLaws(String placeOfInterestHotelLaws) {
		model.setPlaceOfInterestHotelLaws(placeOfInterestHotelLaws);
	}

	/**
	 * Sets the place of interest location of this attraction place of interest.
	 *
	 * @param placeOfInterestLocation the place of interest location of this attraction place of interest
	 */
	@Override
	public void setPlaceOfInterestLocation(String placeOfInterestLocation) {
		model.setPlaceOfInterestLocation(placeOfInterestLocation);
	}

	/**
	 * Sets the place of interest mailing of this attraction place of interest.
	 *
	 * @param placeOfInterestMailing the place of interest mailing of this attraction place of interest
	 */
	@Override
	public void setPlaceOfInterestMailing(String placeOfInterestMailing) {
		model.setPlaceOfInterestMailing(placeOfInterestMailing);
	}

	/**
	 * Sets the place of interest name of this attraction place of interest.
	 *
	 * @param placeOfInterestName the place of interest name of this attraction place of interest
	 */
	@Override
	public void setPlaceOfInterestName(String placeOfInterestName) {
		model.setPlaceOfInterestName(placeOfInterestName);
	}

	/**
	 * Sets the place of interest operating of this attraction place of interest.
	 *
	 * @param placeOfInterestOperating the place of interest operating of this attraction place of interest
	 */
	@Override
	public void setPlaceOfInterestOperating(Date placeOfInterestOperating) {
		model.setPlaceOfInterestOperating(placeOfInterestOperating);
	}

	/**
	 * Sets the place of interest owner gen dec of this attraction place of interest.
	 *
	 * @param placeOfInterestOwnerGenDec the place of interest owner gen dec of this attraction place of interest
	 */
	@Override
	public void setPlaceOfInterestOwnerGenDec(
		String placeOfInterestOwnerGenDec) {

		model.setPlaceOfInterestOwnerGenDec(placeOfInterestOwnerGenDec);
	}

	/**
	 * Sets the place of interest parish of this attraction place of interest.
	 *
	 * @param placeOfInterestParish the place of interest parish of this attraction place of interest
	 */
	@Override
	public void setPlaceOfInterestParish(String placeOfInterestParish) {
		model.setPlaceOfInterestParish(placeOfInterestParish);
	}

	/**
	 * Sets the place of interest rooms of this attraction place of interest.
	 *
	 * @param placeOfInterestRooms the place of interest rooms of this attraction place of interest
	 */
	@Override
	public void setPlaceOfInterestRooms(String placeOfInterestRooms) {
		model.setPlaceOfInterestRooms(placeOfInterestRooms);
	}

	/**
	 * Sets the place of interest sanitary of this attraction place of interest.
	 *
	 * @param placeOfInterestSanitary the place of interest sanitary of this attraction place of interest
	 */
	@Override
	public void setPlaceOfInterestSanitary(String placeOfInterestSanitary) {
		model.setPlaceOfInterestSanitary(placeOfInterestSanitary);
	}

	/**
	 * Sets the place of interest showers of this attraction place of interest.
	 *
	 * @param placeOfInterestShowers the place of interest showers of this attraction place of interest
	 */
	@Override
	public void setPlaceOfInterestShowers(String placeOfInterestShowers) {
		model.setPlaceOfInterestShowers(placeOfInterestShowers);
	}

	/**
	 * Sets the place of interest sign date of this attraction place of interest.
	 *
	 * @param placeOfInterestSignDate the place of interest sign date of this attraction place of interest
	 */
	@Override
	public void setPlaceOfInterestSignDate(Date placeOfInterestSignDate) {
		model.setPlaceOfInterestSignDate(placeOfInterestSignDate);
	}

	/**
	 * Sets the place of interest telephone of this attraction place of interest.
	 *
	 * @param placeOfInterestTelephone the place of interest telephone of this attraction place of interest
	 */
	@Override
	public void setPlaceOfInterestTelephone(String placeOfInterestTelephone) {
		model.setPlaceOfInterestTelephone(placeOfInterestTelephone);
	}

	/**
	 * Sets the place of interest tent space of this attraction place of interest.
	 *
	 * @param placeOfInterestTentSpace the place of interest tent space of this attraction place of interest
	 */
	@Override
	public void setPlaceOfInterestTentSpace(String placeOfInterestTentSpace) {
		model.setPlaceOfInterestTentSpace(placeOfInterestTentSpace);
	}

	/**
	 * Sets the primary key of this attraction place of interest.
	 *
	 * @param primaryKey the primary key of this attraction place of interest
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the type of role of this attraction place of interest.
	 *
	 * @param typeOfRole the type of role of this attraction place of interest
	 */
	@Override
	public void setTypeOfRole(String typeOfRole) {
		model.setTypeOfRole(typeOfRole);
	}

	/**
	 * Sets the user ID of this attraction place of interest.
	 *
	 * @param userId the user ID of this attraction place of interest
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this attraction place of interest.
	 *
	 * @param userName the user name of this attraction place of interest
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this attraction place of interest.
	 *
	 * @param userUuid the user uuid of this attraction place of interest
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the walking tour of this attraction place of interest.
	 *
	 * @param walkingTour the walking tour of this attraction place of interest
	 */
	@Override
	public void setWalkingTour(String walkingTour) {
		model.setWalkingTour(walkingTour);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected AttractionPlaceOfInterestWrapper wrap(
		AttractionPlaceOfInterest attractionPlaceOfInterest) {

		return new AttractionPlaceOfInterestWrapper(attractionPlaceOfInterest);
	}

}