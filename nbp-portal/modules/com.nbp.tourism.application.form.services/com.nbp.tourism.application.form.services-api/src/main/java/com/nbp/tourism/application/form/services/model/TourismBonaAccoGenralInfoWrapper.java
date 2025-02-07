/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TourismBonaAccoGenralInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccoGenralInfo
 * @generated
 */
public class TourismBonaAccoGenralInfoWrapper
	extends BaseModelWrapper<TourismBonaAccoGenralInfo>
	implements ModelWrapper<TourismBonaAccoGenralInfo>,
			   TourismBonaAccoGenralInfo {

	public TourismBonaAccoGenralInfoWrapper(
		TourismBonaAccoGenralInfo tourismBonaAccoGenralInfo) {

		super(tourismBonaAccoGenralInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"tourismBonaAccoGenralInfoId", getTourismBonaAccoGenralInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("establishmentName", getEstablishmentName());
		attributes.put("establishmentNewName", getEstablishmentNewName());
		attributes.put("generalFacilityRoom", getGeneralFacilityRoom());
		attributes.put("existingFacilityRoom", getExistingFacilityRoom());
		attributes.put("offeredFacilityDetail", getOfferedFacilityDetail());
		attributes.put("plannedFacilityDetail", getPlannedFacilityDetail());
		attributes.put("accomodationToBeOffered", getAccomodationToBeOffered());
		attributes.put("constructionDate", getConstructionDate());
		attributes.put("expectedCommenceDate", getExpectedCommenceDate());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismBonaAccoGenralInfoId = (Long)attributes.get(
			"tourismBonaAccoGenralInfoId");

		if (tourismBonaAccoGenralInfoId != null) {
			setTourismBonaAccoGenralInfoId(tourismBonaAccoGenralInfoId);
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

		String establishmentName = (String)attributes.get("establishmentName");

		if (establishmentName != null) {
			setEstablishmentName(establishmentName);
		}

		String establishmentNewName = (String)attributes.get(
			"establishmentNewName");

		if (establishmentNewName != null) {
			setEstablishmentNewName(establishmentNewName);
		}

		String generalFacilityRoom = (String)attributes.get(
			"generalFacilityRoom");

		if (generalFacilityRoom != null) {
			setGeneralFacilityRoom(generalFacilityRoom);
		}

		String existingFacilityRoom = (String)attributes.get(
			"existingFacilityRoom");

		if (existingFacilityRoom != null) {
			setExistingFacilityRoom(existingFacilityRoom);
		}

		String offeredFacilityDetail = (String)attributes.get(
			"offeredFacilityDetail");

		if (offeredFacilityDetail != null) {
			setOfferedFacilityDetail(offeredFacilityDetail);
		}

		String plannedFacilityDetail = (String)attributes.get(
			"plannedFacilityDetail");

		if (plannedFacilityDetail != null) {
			setPlannedFacilityDetail(plannedFacilityDetail);
		}

		String accomodationToBeOffered = (String)attributes.get(
			"accomodationToBeOffered");

		if (accomodationToBeOffered != null) {
			setAccomodationToBeOffered(accomodationToBeOffered);
		}

		Date constructionDate = (Date)attributes.get("constructionDate");

		if (constructionDate != null) {
			setConstructionDate(constructionDate);
		}

		Date expectedCommenceDate = (Date)attributes.get(
			"expectedCommenceDate");

		if (expectedCommenceDate != null) {
			setExpectedCommenceDate(expectedCommenceDate);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}
	}

	@Override
	public TourismBonaAccoGenralInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the accomodation to be offered of this tourism bona acco genral info.
	 *
	 * @return the accomodation to be offered of this tourism bona acco genral info
	 */
	@Override
	public String getAccomodationToBeOffered() {
		return model.getAccomodationToBeOffered();
	}

	/**
	 * Returns the company ID of this tourism bona acco genral info.
	 *
	 * @return the company ID of this tourism bona acco genral info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the construction date of this tourism bona acco genral info.
	 *
	 * @return the construction date of this tourism bona acco genral info
	 */
	@Override
	public Date getConstructionDate() {
		return model.getConstructionDate();
	}

	/**
	 * Returns the create date of this tourism bona acco genral info.
	 *
	 * @return the create date of this tourism bona acco genral info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the establishment name of this tourism bona acco genral info.
	 *
	 * @return the establishment name of this tourism bona acco genral info
	 */
	@Override
	public String getEstablishmentName() {
		return model.getEstablishmentName();
	}

	/**
	 * Returns the establishment new name of this tourism bona acco genral info.
	 *
	 * @return the establishment new name of this tourism bona acco genral info
	 */
	@Override
	public String getEstablishmentNewName() {
		return model.getEstablishmentNewName();
	}

	/**
	 * Returns the existing facility room of this tourism bona acco genral info.
	 *
	 * @return the existing facility room of this tourism bona acco genral info
	 */
	@Override
	public String getExistingFacilityRoom() {
		return model.getExistingFacilityRoom();
	}

	/**
	 * Returns the expected commence date of this tourism bona acco genral info.
	 *
	 * @return the expected commence date of this tourism bona acco genral info
	 */
	@Override
	public Date getExpectedCommenceDate() {
		return model.getExpectedCommenceDate();
	}

	/**
	 * Returns the general facility room of this tourism bona acco genral info.
	 *
	 * @return the general facility room of this tourism bona acco genral info
	 */
	@Override
	public String getGeneralFacilityRoom() {
		return model.getGeneralFacilityRoom();
	}

	/**
	 * Returns the group ID of this tourism bona acco genral info.
	 *
	 * @return the group ID of this tourism bona acco genral info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism bona acco genral info.
	 *
	 * @return the modified date of this tourism bona acco genral info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the offered facility detail of this tourism bona acco genral info.
	 *
	 * @return the offered facility detail of this tourism bona acco genral info
	 */
	@Override
	public String getOfferedFacilityDetail() {
		return model.getOfferedFacilityDetail();
	}

	/**
	 * Returns the planned facility detail of this tourism bona acco genral info.
	 *
	 * @return the planned facility detail of this tourism bona acco genral info
	 */
	@Override
	public String getPlannedFacilityDetail() {
		return model.getPlannedFacilityDetail();
	}

	/**
	 * Returns the primary key of this tourism bona acco genral info.
	 *
	 * @return the primary key of this tourism bona acco genral info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tourism application ID of this tourism bona acco genral info.
	 *
	 * @return the tourism application ID of this tourism bona acco genral info
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism bona acco genral info ID of this tourism bona acco genral info.
	 *
	 * @return the tourism bona acco genral info ID of this tourism bona acco genral info
	 */
	@Override
	public long getTourismBonaAccoGenralInfoId() {
		return model.getTourismBonaAccoGenralInfoId();
	}

	/**
	 * Returns the user ID of this tourism bona acco genral info.
	 *
	 * @return the user ID of this tourism bona acco genral info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism bona acco genral info.
	 *
	 * @return the user name of this tourism bona acco genral info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism bona acco genral info.
	 *
	 * @return the user uuid of this tourism bona acco genral info
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
	 * Sets the accomodation to be offered of this tourism bona acco genral info.
	 *
	 * @param accomodationToBeOffered the accomodation to be offered of this tourism bona acco genral info
	 */
	@Override
	public void setAccomodationToBeOffered(String accomodationToBeOffered) {
		model.setAccomodationToBeOffered(accomodationToBeOffered);
	}

	/**
	 * Sets the company ID of this tourism bona acco genral info.
	 *
	 * @param companyId the company ID of this tourism bona acco genral info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the construction date of this tourism bona acco genral info.
	 *
	 * @param constructionDate the construction date of this tourism bona acco genral info
	 */
	@Override
	public void setConstructionDate(Date constructionDate) {
		model.setConstructionDate(constructionDate);
	}

	/**
	 * Sets the create date of this tourism bona acco genral info.
	 *
	 * @param createDate the create date of this tourism bona acco genral info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the establishment name of this tourism bona acco genral info.
	 *
	 * @param establishmentName the establishment name of this tourism bona acco genral info
	 */
	@Override
	public void setEstablishmentName(String establishmentName) {
		model.setEstablishmentName(establishmentName);
	}

	/**
	 * Sets the establishment new name of this tourism bona acco genral info.
	 *
	 * @param establishmentNewName the establishment new name of this tourism bona acco genral info
	 */
	@Override
	public void setEstablishmentNewName(String establishmentNewName) {
		model.setEstablishmentNewName(establishmentNewName);
	}

	/**
	 * Sets the existing facility room of this tourism bona acco genral info.
	 *
	 * @param existingFacilityRoom the existing facility room of this tourism bona acco genral info
	 */
	@Override
	public void setExistingFacilityRoom(String existingFacilityRoom) {
		model.setExistingFacilityRoom(existingFacilityRoom);
	}

	/**
	 * Sets the expected commence date of this tourism bona acco genral info.
	 *
	 * @param expectedCommenceDate the expected commence date of this tourism bona acco genral info
	 */
	@Override
	public void setExpectedCommenceDate(Date expectedCommenceDate) {
		model.setExpectedCommenceDate(expectedCommenceDate);
	}

	/**
	 * Sets the general facility room of this tourism bona acco genral info.
	 *
	 * @param generalFacilityRoom the general facility room of this tourism bona acco genral info
	 */
	@Override
	public void setGeneralFacilityRoom(String generalFacilityRoom) {
		model.setGeneralFacilityRoom(generalFacilityRoom);
	}

	/**
	 * Sets the group ID of this tourism bona acco genral info.
	 *
	 * @param groupId the group ID of this tourism bona acco genral info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism bona acco genral info.
	 *
	 * @param modifiedDate the modified date of this tourism bona acco genral info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the offered facility detail of this tourism bona acco genral info.
	 *
	 * @param offeredFacilityDetail the offered facility detail of this tourism bona acco genral info
	 */
	@Override
	public void setOfferedFacilityDetail(String offeredFacilityDetail) {
		model.setOfferedFacilityDetail(offeredFacilityDetail);
	}

	/**
	 * Sets the planned facility detail of this tourism bona acco genral info.
	 *
	 * @param plannedFacilityDetail the planned facility detail of this tourism bona acco genral info
	 */
	@Override
	public void setPlannedFacilityDetail(String plannedFacilityDetail) {
		model.setPlannedFacilityDetail(plannedFacilityDetail);
	}

	/**
	 * Sets the primary key of this tourism bona acco genral info.
	 *
	 * @param primaryKey the primary key of this tourism bona acco genral info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tourism application ID of this tourism bona acco genral info.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism bona acco genral info
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism bona acco genral info ID of this tourism bona acco genral info.
	 *
	 * @param tourismBonaAccoGenralInfoId the tourism bona acco genral info ID of this tourism bona acco genral info
	 */
	@Override
	public void setTourismBonaAccoGenralInfoId(
		long tourismBonaAccoGenralInfoId) {

		model.setTourismBonaAccoGenralInfoId(tourismBonaAccoGenralInfoId);
	}

	/**
	 * Sets the user ID of this tourism bona acco genral info.
	 *
	 * @param userId the user ID of this tourism bona acco genral info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism bona acco genral info.
	 *
	 * @param userName the user name of this tourism bona acco genral info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism bona acco genral info.
	 *
	 * @param userUuid the user uuid of this tourism bona acco genral info
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
	protected TourismBonaAccoGenralInfoWrapper wrap(
		TourismBonaAccoGenralInfo tourismBonaAccoGenralInfo) {

		return new TourismBonaAccoGenralInfoWrapper(tourismBonaAccoGenralInfo);
	}

}