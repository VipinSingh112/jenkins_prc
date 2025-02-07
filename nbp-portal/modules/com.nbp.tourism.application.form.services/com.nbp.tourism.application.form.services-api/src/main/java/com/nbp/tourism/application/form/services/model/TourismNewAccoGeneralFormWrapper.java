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
 * This class is a wrapper for {@link TourismNewAccoGeneralForm}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccoGeneralForm
 * @generated
 */
public class TourismNewAccoGeneralFormWrapper
	extends BaseModelWrapper<TourismNewAccoGeneralForm>
	implements ModelWrapper<TourismNewAccoGeneralForm>,
			   TourismNewAccoGeneralForm {

	public TourismNewAccoGeneralFormWrapper(
		TourismNewAccoGeneralForm tourismNewAccoGeneralForm) {

		super(tourismNewAccoGeneralForm);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tourismNewAccoGenFormId", getTourismNewAccoGenFormId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("establishmentName", getEstablishmentName());
		attributes.put("accomadationRoom", getAccomadationRoom());
		attributes.put("facilityDetail", getFacilityDetail());
		attributes.put("hotelOperator", getHotelOperator());
		attributes.put("offeredAccomadation", getOfferedAccomadation());
		attributes.put("constructionDate", getConstructionDate());
		attributes.put("commenceDate", getCommenceDate());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismNewAccoGenFormId = (Long)attributes.get(
			"tourismNewAccoGenFormId");

		if (tourismNewAccoGenFormId != null) {
			setTourismNewAccoGenFormId(tourismNewAccoGenFormId);
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

		String accomadationRoom = (String)attributes.get("accomadationRoom");

		if (accomadationRoom != null) {
			setAccomadationRoom(accomadationRoom);
		}

		String facilityDetail = (String)attributes.get("facilityDetail");

		if (facilityDetail != null) {
			setFacilityDetail(facilityDetail);
		}

		String hotelOperator = (String)attributes.get("hotelOperator");

		if (hotelOperator != null) {
			setHotelOperator(hotelOperator);
		}

		String offeredAccomadation = (String)attributes.get(
			"offeredAccomadation");

		if (offeredAccomadation != null) {
			setOfferedAccomadation(offeredAccomadation);
		}

		Date constructionDate = (Date)attributes.get("constructionDate");

		if (constructionDate != null) {
			setConstructionDate(constructionDate);
		}

		Date commenceDate = (Date)attributes.get("commenceDate");

		if (commenceDate != null) {
			setCommenceDate(commenceDate);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}
	}

	@Override
	public TourismNewAccoGeneralForm cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the accomadation room of this tourism new acco general form.
	 *
	 * @return the accomadation room of this tourism new acco general form
	 */
	@Override
	public String getAccomadationRoom() {
		return model.getAccomadationRoom();
	}

	/**
	 * Returns the commence date of this tourism new acco general form.
	 *
	 * @return the commence date of this tourism new acco general form
	 */
	@Override
	public Date getCommenceDate() {
		return model.getCommenceDate();
	}

	/**
	 * Returns the company ID of this tourism new acco general form.
	 *
	 * @return the company ID of this tourism new acco general form
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the construction date of this tourism new acco general form.
	 *
	 * @return the construction date of this tourism new acco general form
	 */
	@Override
	public Date getConstructionDate() {
		return model.getConstructionDate();
	}

	/**
	 * Returns the create date of this tourism new acco general form.
	 *
	 * @return the create date of this tourism new acco general form
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the establishment name of this tourism new acco general form.
	 *
	 * @return the establishment name of this tourism new acco general form
	 */
	@Override
	public String getEstablishmentName() {
		return model.getEstablishmentName();
	}

	/**
	 * Returns the facility detail of this tourism new acco general form.
	 *
	 * @return the facility detail of this tourism new acco general form
	 */
	@Override
	public String getFacilityDetail() {
		return model.getFacilityDetail();
	}

	/**
	 * Returns the group ID of this tourism new acco general form.
	 *
	 * @return the group ID of this tourism new acco general form
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hotel operator of this tourism new acco general form.
	 *
	 * @return the hotel operator of this tourism new acco general form
	 */
	@Override
	public String getHotelOperator() {
		return model.getHotelOperator();
	}

	/**
	 * Returns the modified date of this tourism new acco general form.
	 *
	 * @return the modified date of this tourism new acco general form
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the offered accomadation of this tourism new acco general form.
	 *
	 * @return the offered accomadation of this tourism new acco general form
	 */
	@Override
	public String getOfferedAccomadation() {
		return model.getOfferedAccomadation();
	}

	/**
	 * Returns the primary key of this tourism new acco general form.
	 *
	 * @return the primary key of this tourism new acco general form
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tourism application ID of this tourism new acco general form.
	 *
	 * @return the tourism application ID of this tourism new acco general form
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism new acco gen form ID of this tourism new acco general form.
	 *
	 * @return the tourism new acco gen form ID of this tourism new acco general form
	 */
	@Override
	public long getTourismNewAccoGenFormId() {
		return model.getTourismNewAccoGenFormId();
	}

	/**
	 * Returns the user ID of this tourism new acco general form.
	 *
	 * @return the user ID of this tourism new acco general form
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism new acco general form.
	 *
	 * @return the user name of this tourism new acco general form
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism new acco general form.
	 *
	 * @return the user uuid of this tourism new acco general form
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
	 * Sets the accomadation room of this tourism new acco general form.
	 *
	 * @param accomadationRoom the accomadation room of this tourism new acco general form
	 */
	@Override
	public void setAccomadationRoom(String accomadationRoom) {
		model.setAccomadationRoom(accomadationRoom);
	}

	/**
	 * Sets the commence date of this tourism new acco general form.
	 *
	 * @param commenceDate the commence date of this tourism new acco general form
	 */
	@Override
	public void setCommenceDate(Date commenceDate) {
		model.setCommenceDate(commenceDate);
	}

	/**
	 * Sets the company ID of this tourism new acco general form.
	 *
	 * @param companyId the company ID of this tourism new acco general form
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the construction date of this tourism new acco general form.
	 *
	 * @param constructionDate the construction date of this tourism new acco general form
	 */
	@Override
	public void setConstructionDate(Date constructionDate) {
		model.setConstructionDate(constructionDate);
	}

	/**
	 * Sets the create date of this tourism new acco general form.
	 *
	 * @param createDate the create date of this tourism new acco general form
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the establishment name of this tourism new acco general form.
	 *
	 * @param establishmentName the establishment name of this tourism new acco general form
	 */
	@Override
	public void setEstablishmentName(String establishmentName) {
		model.setEstablishmentName(establishmentName);
	}

	/**
	 * Sets the facility detail of this tourism new acco general form.
	 *
	 * @param facilityDetail the facility detail of this tourism new acco general form
	 */
	@Override
	public void setFacilityDetail(String facilityDetail) {
		model.setFacilityDetail(facilityDetail);
	}

	/**
	 * Sets the group ID of this tourism new acco general form.
	 *
	 * @param groupId the group ID of this tourism new acco general form
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hotel operator of this tourism new acco general form.
	 *
	 * @param hotelOperator the hotel operator of this tourism new acco general form
	 */
	@Override
	public void setHotelOperator(String hotelOperator) {
		model.setHotelOperator(hotelOperator);
	}

	/**
	 * Sets the modified date of this tourism new acco general form.
	 *
	 * @param modifiedDate the modified date of this tourism new acco general form
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the offered accomadation of this tourism new acco general form.
	 *
	 * @param offeredAccomadation the offered accomadation of this tourism new acco general form
	 */
	@Override
	public void setOfferedAccomadation(String offeredAccomadation) {
		model.setOfferedAccomadation(offeredAccomadation);
	}

	/**
	 * Sets the primary key of this tourism new acco general form.
	 *
	 * @param primaryKey the primary key of this tourism new acco general form
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tourism application ID of this tourism new acco general form.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism new acco general form
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism new acco gen form ID of this tourism new acco general form.
	 *
	 * @param tourismNewAccoGenFormId the tourism new acco gen form ID of this tourism new acco general form
	 */
	@Override
	public void setTourismNewAccoGenFormId(long tourismNewAccoGenFormId) {
		model.setTourismNewAccoGenFormId(tourismNewAccoGenFormId);
	}

	/**
	 * Sets the user ID of this tourism new acco general form.
	 *
	 * @param userId the user ID of this tourism new acco general form
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism new acco general form.
	 *
	 * @param userName the user name of this tourism new acco general form
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism new acco general form.
	 *
	 * @param userUuid the user uuid of this tourism new acco general form
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
	protected TourismNewAccoGeneralFormWrapper wrap(
		TourismNewAccoGeneralForm tourismNewAccoGeneralForm) {

		return new TourismNewAccoGeneralFormWrapper(tourismNewAccoGeneralForm);
	}

}