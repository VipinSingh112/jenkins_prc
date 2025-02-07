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
 * This class is a wrapper for {@link TourismBonaGroundTransportation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransportation
 * @generated
 */
public class TourismBonaGroundTransportationWrapper
	extends BaseModelWrapper<TourismBonaGroundTransportation>
	implements ModelWrapper<TourismBonaGroundTransportation>,
			   TourismBonaGroundTransportation {

	public TourismBonaGroundTransportationWrapper(
		TourismBonaGroundTransportation tourismBonaGroundTransportation) {

		super(tourismBonaGroundTransportation);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"tourismBonaGroundTransportId", getTourismBonaGroundTransportId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put(
			"typeOfGroundTransportation", getTypeOfGroundTransportation());
		attributes.put("bonaGroundName", getBonaGroundName());
		attributes.put("bonaGroundLandlineNo", getBonaGroundLandlineNo());
		attributes.put("bonaGroundMobileNo", getBonaGroundMobileNo());
		attributes.put("bonaGroundFaxNo", getBonaGroundFaxNo());
		attributes.put("bonaGroundLicensedWith", getBonaGroundLicensedWith());
		attributes.put(
			"bonaGroundBoardExpiryDate", getBonaGroundBoardExpiryDate());
		attributes.put(
			"bonaGroundHaveYouBenefitBefore",
			getBonaGroundHaveYouBenefitBefore());
		attributes.put(
			"bonaGroundDateOfLastBenefit", getBonaGroundDateOfLastBenefit());
		attributes.put("bonaGroundEntityType", getBonaGroundEntityType());
		attributes.put(
			"bonaGroundVehicleInfoMake", getBonaGroundVehicleInfoMake());
		attributes.put(
			"bonaGroundVehicleInfoModel", getBonaGroundVehicleInfoModel());
		attributes.put(
			"bonaGroundVehicleInfoYear", getBonaGroundVehicleInfoYear());
		attributes.put(
			"bonaGroundSeatingCapacity", getBonaGroundSeatingCapacity());
		attributes.put(
			"bonaGroundExistingFleetAmount",
			getBonaGroundExistingFleetAmount());
		attributes.put(
			"bonaGroundIndicateVehicleWill",
			getBonaGroundIndicateVehicleWill());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismBonaGroundTransportId = (Long)attributes.get(
			"tourismBonaGroundTransportId");

		if (tourismBonaGroundTransportId != null) {
			setTourismBonaGroundTransportId(tourismBonaGroundTransportId);
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

		String typeOfGroundTransportation = (String)attributes.get(
			"typeOfGroundTransportation");

		if (typeOfGroundTransportation != null) {
			setTypeOfGroundTransportation(typeOfGroundTransportation);
		}

		String bonaGroundName = (String)attributes.get("bonaGroundName");

		if (bonaGroundName != null) {
			setBonaGroundName(bonaGroundName);
		}

		String bonaGroundLandlineNo = (String)attributes.get(
			"bonaGroundLandlineNo");

		if (bonaGroundLandlineNo != null) {
			setBonaGroundLandlineNo(bonaGroundLandlineNo);
		}

		String bonaGroundMobileNo = (String)attributes.get(
			"bonaGroundMobileNo");

		if (bonaGroundMobileNo != null) {
			setBonaGroundMobileNo(bonaGroundMobileNo);
		}

		String bonaGroundFaxNo = (String)attributes.get("bonaGroundFaxNo");

		if (bonaGroundFaxNo != null) {
			setBonaGroundFaxNo(bonaGroundFaxNo);
		}

		String bonaGroundLicensedWith = (String)attributes.get(
			"bonaGroundLicensedWith");

		if (bonaGroundLicensedWith != null) {
			setBonaGroundLicensedWith(bonaGroundLicensedWith);
		}

		Date bonaGroundBoardExpiryDate = (Date)attributes.get(
			"bonaGroundBoardExpiryDate");

		if (bonaGroundBoardExpiryDate != null) {
			setBonaGroundBoardExpiryDate(bonaGroundBoardExpiryDate);
		}

		String bonaGroundHaveYouBenefitBefore = (String)attributes.get(
			"bonaGroundHaveYouBenefitBefore");

		if (bonaGroundHaveYouBenefitBefore != null) {
			setBonaGroundHaveYouBenefitBefore(bonaGroundHaveYouBenefitBefore);
		}

		Date bonaGroundDateOfLastBenefit = (Date)attributes.get(
			"bonaGroundDateOfLastBenefit");

		if (bonaGroundDateOfLastBenefit != null) {
			setBonaGroundDateOfLastBenefit(bonaGroundDateOfLastBenefit);
		}

		String bonaGroundEntityType = (String)attributes.get(
			"bonaGroundEntityType");

		if (bonaGroundEntityType != null) {
			setBonaGroundEntityType(bonaGroundEntityType);
		}

		String bonaGroundVehicleInfoMake = (String)attributes.get(
			"bonaGroundVehicleInfoMake");

		if (bonaGroundVehicleInfoMake != null) {
			setBonaGroundVehicleInfoMake(bonaGroundVehicleInfoMake);
		}

		String bonaGroundVehicleInfoModel = (String)attributes.get(
			"bonaGroundVehicleInfoModel");

		if (bonaGroundVehicleInfoModel != null) {
			setBonaGroundVehicleInfoModel(bonaGroundVehicleInfoModel);
		}

		String bonaGroundVehicleInfoYear = (String)attributes.get(
			"bonaGroundVehicleInfoYear");

		if (bonaGroundVehicleInfoYear != null) {
			setBonaGroundVehicleInfoYear(bonaGroundVehicleInfoYear);
		}

		String bonaGroundSeatingCapacity = (String)attributes.get(
			"bonaGroundSeatingCapacity");

		if (bonaGroundSeatingCapacity != null) {
			setBonaGroundSeatingCapacity(bonaGroundSeatingCapacity);
		}

		String bonaGroundExistingFleetAmount = (String)attributes.get(
			"bonaGroundExistingFleetAmount");

		if (bonaGroundExistingFleetAmount != null) {
			setBonaGroundExistingFleetAmount(bonaGroundExistingFleetAmount);
		}

		String bonaGroundIndicateVehicleWill = (String)attributes.get(
			"bonaGroundIndicateVehicleWill");

		if (bonaGroundIndicateVehicleWill != null) {
			setBonaGroundIndicateVehicleWill(bonaGroundIndicateVehicleWill);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}
	}

	@Override
	public TourismBonaGroundTransportation cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the bona ground board expiry date of this tourism bona ground transportation.
	 *
	 * @return the bona ground board expiry date of this tourism bona ground transportation
	 */
	@Override
	public Date getBonaGroundBoardExpiryDate() {
		return model.getBonaGroundBoardExpiryDate();
	}

	/**
	 * Returns the bona ground date of last benefit of this tourism bona ground transportation.
	 *
	 * @return the bona ground date of last benefit of this tourism bona ground transportation
	 */
	@Override
	public Date getBonaGroundDateOfLastBenefit() {
		return model.getBonaGroundDateOfLastBenefit();
	}

	/**
	 * Returns the bona ground entity type of this tourism bona ground transportation.
	 *
	 * @return the bona ground entity type of this tourism bona ground transportation
	 */
	@Override
	public String getBonaGroundEntityType() {
		return model.getBonaGroundEntityType();
	}

	/**
	 * Returns the bona ground existing fleet amount of this tourism bona ground transportation.
	 *
	 * @return the bona ground existing fleet amount of this tourism bona ground transportation
	 */
	@Override
	public String getBonaGroundExistingFleetAmount() {
		return model.getBonaGroundExistingFleetAmount();
	}

	/**
	 * Returns the bona ground fax no of this tourism bona ground transportation.
	 *
	 * @return the bona ground fax no of this tourism bona ground transportation
	 */
	@Override
	public String getBonaGroundFaxNo() {
		return model.getBonaGroundFaxNo();
	}

	/**
	 * Returns the bona ground have you benefit before of this tourism bona ground transportation.
	 *
	 * @return the bona ground have you benefit before of this tourism bona ground transportation
	 */
	@Override
	public String getBonaGroundHaveYouBenefitBefore() {
		return model.getBonaGroundHaveYouBenefitBefore();
	}

	/**
	 * Returns the bona ground indicate vehicle will of this tourism bona ground transportation.
	 *
	 * @return the bona ground indicate vehicle will of this tourism bona ground transportation
	 */
	@Override
	public String getBonaGroundIndicateVehicleWill() {
		return model.getBonaGroundIndicateVehicleWill();
	}

	/**
	 * Returns the bona ground landline no of this tourism bona ground transportation.
	 *
	 * @return the bona ground landline no of this tourism bona ground transportation
	 */
	@Override
	public String getBonaGroundLandlineNo() {
		return model.getBonaGroundLandlineNo();
	}

	/**
	 * Returns the bona ground licensed with of this tourism bona ground transportation.
	 *
	 * @return the bona ground licensed with of this tourism bona ground transportation
	 */
	@Override
	public String getBonaGroundLicensedWith() {
		return model.getBonaGroundLicensedWith();
	}

	/**
	 * Returns the bona ground mobile no of this tourism bona ground transportation.
	 *
	 * @return the bona ground mobile no of this tourism bona ground transportation
	 */
	@Override
	public String getBonaGroundMobileNo() {
		return model.getBonaGroundMobileNo();
	}

	/**
	 * Returns the bona ground name of this tourism bona ground transportation.
	 *
	 * @return the bona ground name of this tourism bona ground transportation
	 */
	@Override
	public String getBonaGroundName() {
		return model.getBonaGroundName();
	}

	/**
	 * Returns the bona ground seating capacity of this tourism bona ground transportation.
	 *
	 * @return the bona ground seating capacity of this tourism bona ground transportation
	 */
	@Override
	public String getBonaGroundSeatingCapacity() {
		return model.getBonaGroundSeatingCapacity();
	}

	/**
	 * Returns the bona ground vehicle info make of this tourism bona ground transportation.
	 *
	 * @return the bona ground vehicle info make of this tourism bona ground transportation
	 */
	@Override
	public String getBonaGroundVehicleInfoMake() {
		return model.getBonaGroundVehicleInfoMake();
	}

	/**
	 * Returns the bona ground vehicle info model of this tourism bona ground transportation.
	 *
	 * @return the bona ground vehicle info model of this tourism bona ground transportation
	 */
	@Override
	public String getBonaGroundVehicleInfoModel() {
		return model.getBonaGroundVehicleInfoModel();
	}

	/**
	 * Returns the bona ground vehicle info year of this tourism bona ground transportation.
	 *
	 * @return the bona ground vehicle info year of this tourism bona ground transportation
	 */
	@Override
	public String getBonaGroundVehicleInfoYear() {
		return model.getBonaGroundVehicleInfoYear();
	}

	/**
	 * Returns the company ID of this tourism bona ground transportation.
	 *
	 * @return the company ID of this tourism bona ground transportation
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism bona ground transportation.
	 *
	 * @return the create date of this tourism bona ground transportation
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this tourism bona ground transportation.
	 *
	 * @return the group ID of this tourism bona ground transportation
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism bona ground transportation.
	 *
	 * @return the modified date of this tourism bona ground transportation
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this tourism bona ground transportation.
	 *
	 * @return the primary key of this tourism bona ground transportation
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tourism application ID of this tourism bona ground transportation.
	 *
	 * @return the tourism application ID of this tourism bona ground transportation
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism bona ground transport ID of this tourism bona ground transportation.
	 *
	 * @return the tourism bona ground transport ID of this tourism bona ground transportation
	 */
	@Override
	public long getTourismBonaGroundTransportId() {
		return model.getTourismBonaGroundTransportId();
	}

	/**
	 * Returns the type of ground transportation of this tourism bona ground transportation.
	 *
	 * @return the type of ground transportation of this tourism bona ground transportation
	 */
	@Override
	public String getTypeOfGroundTransportation() {
		return model.getTypeOfGroundTransportation();
	}

	/**
	 * Returns the user ID of this tourism bona ground transportation.
	 *
	 * @return the user ID of this tourism bona ground transportation
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism bona ground transportation.
	 *
	 * @return the user name of this tourism bona ground transportation
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism bona ground transportation.
	 *
	 * @return the user uuid of this tourism bona ground transportation
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
	 * Sets the bona ground board expiry date of this tourism bona ground transportation.
	 *
	 * @param bonaGroundBoardExpiryDate the bona ground board expiry date of this tourism bona ground transportation
	 */
	@Override
	public void setBonaGroundBoardExpiryDate(Date bonaGroundBoardExpiryDate) {
		model.setBonaGroundBoardExpiryDate(bonaGroundBoardExpiryDate);
	}

	/**
	 * Sets the bona ground date of last benefit of this tourism bona ground transportation.
	 *
	 * @param bonaGroundDateOfLastBenefit the bona ground date of last benefit of this tourism bona ground transportation
	 */
	@Override
	public void setBonaGroundDateOfLastBenefit(
		Date bonaGroundDateOfLastBenefit) {

		model.setBonaGroundDateOfLastBenefit(bonaGroundDateOfLastBenefit);
	}

	/**
	 * Sets the bona ground entity type of this tourism bona ground transportation.
	 *
	 * @param bonaGroundEntityType the bona ground entity type of this tourism bona ground transportation
	 */
	@Override
	public void setBonaGroundEntityType(String bonaGroundEntityType) {
		model.setBonaGroundEntityType(bonaGroundEntityType);
	}

	/**
	 * Sets the bona ground existing fleet amount of this tourism bona ground transportation.
	 *
	 * @param bonaGroundExistingFleetAmount the bona ground existing fleet amount of this tourism bona ground transportation
	 */
	@Override
	public void setBonaGroundExistingFleetAmount(
		String bonaGroundExistingFleetAmount) {

		model.setBonaGroundExistingFleetAmount(bonaGroundExistingFleetAmount);
	}

	/**
	 * Sets the bona ground fax no of this tourism bona ground transportation.
	 *
	 * @param bonaGroundFaxNo the bona ground fax no of this tourism bona ground transportation
	 */
	@Override
	public void setBonaGroundFaxNo(String bonaGroundFaxNo) {
		model.setBonaGroundFaxNo(bonaGroundFaxNo);
	}

	/**
	 * Sets the bona ground have you benefit before of this tourism bona ground transportation.
	 *
	 * @param bonaGroundHaveYouBenefitBefore the bona ground have you benefit before of this tourism bona ground transportation
	 */
	@Override
	public void setBonaGroundHaveYouBenefitBefore(
		String bonaGroundHaveYouBenefitBefore) {

		model.setBonaGroundHaveYouBenefitBefore(bonaGroundHaveYouBenefitBefore);
	}

	/**
	 * Sets the bona ground indicate vehicle will of this tourism bona ground transportation.
	 *
	 * @param bonaGroundIndicateVehicleWill the bona ground indicate vehicle will of this tourism bona ground transportation
	 */
	@Override
	public void setBonaGroundIndicateVehicleWill(
		String bonaGroundIndicateVehicleWill) {

		model.setBonaGroundIndicateVehicleWill(bonaGroundIndicateVehicleWill);
	}

	/**
	 * Sets the bona ground landline no of this tourism bona ground transportation.
	 *
	 * @param bonaGroundLandlineNo the bona ground landline no of this tourism bona ground transportation
	 */
	@Override
	public void setBonaGroundLandlineNo(String bonaGroundLandlineNo) {
		model.setBonaGroundLandlineNo(bonaGroundLandlineNo);
	}

	/**
	 * Sets the bona ground licensed with of this tourism bona ground transportation.
	 *
	 * @param bonaGroundLicensedWith the bona ground licensed with of this tourism bona ground transportation
	 */
	@Override
	public void setBonaGroundLicensedWith(String bonaGroundLicensedWith) {
		model.setBonaGroundLicensedWith(bonaGroundLicensedWith);
	}

	/**
	 * Sets the bona ground mobile no of this tourism bona ground transportation.
	 *
	 * @param bonaGroundMobileNo the bona ground mobile no of this tourism bona ground transportation
	 */
	@Override
	public void setBonaGroundMobileNo(String bonaGroundMobileNo) {
		model.setBonaGroundMobileNo(bonaGroundMobileNo);
	}

	/**
	 * Sets the bona ground name of this tourism bona ground transportation.
	 *
	 * @param bonaGroundName the bona ground name of this tourism bona ground transportation
	 */
	@Override
	public void setBonaGroundName(String bonaGroundName) {
		model.setBonaGroundName(bonaGroundName);
	}

	/**
	 * Sets the bona ground seating capacity of this tourism bona ground transportation.
	 *
	 * @param bonaGroundSeatingCapacity the bona ground seating capacity of this tourism bona ground transportation
	 */
	@Override
	public void setBonaGroundSeatingCapacity(String bonaGroundSeatingCapacity) {
		model.setBonaGroundSeatingCapacity(bonaGroundSeatingCapacity);
	}

	/**
	 * Sets the bona ground vehicle info make of this tourism bona ground transportation.
	 *
	 * @param bonaGroundVehicleInfoMake the bona ground vehicle info make of this tourism bona ground transportation
	 */
	@Override
	public void setBonaGroundVehicleInfoMake(String bonaGroundVehicleInfoMake) {
		model.setBonaGroundVehicleInfoMake(bonaGroundVehicleInfoMake);
	}

	/**
	 * Sets the bona ground vehicle info model of this tourism bona ground transportation.
	 *
	 * @param bonaGroundVehicleInfoModel the bona ground vehicle info model of this tourism bona ground transportation
	 */
	@Override
	public void setBonaGroundVehicleInfoModel(
		String bonaGroundVehicleInfoModel) {

		model.setBonaGroundVehicleInfoModel(bonaGroundVehicleInfoModel);
	}

	/**
	 * Sets the bona ground vehicle info year of this tourism bona ground transportation.
	 *
	 * @param bonaGroundVehicleInfoYear the bona ground vehicle info year of this tourism bona ground transportation
	 */
	@Override
	public void setBonaGroundVehicleInfoYear(String bonaGroundVehicleInfoYear) {
		model.setBonaGroundVehicleInfoYear(bonaGroundVehicleInfoYear);
	}

	/**
	 * Sets the company ID of this tourism bona ground transportation.
	 *
	 * @param companyId the company ID of this tourism bona ground transportation
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism bona ground transportation.
	 *
	 * @param createDate the create date of this tourism bona ground transportation
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this tourism bona ground transportation.
	 *
	 * @param groupId the group ID of this tourism bona ground transportation
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism bona ground transportation.
	 *
	 * @param modifiedDate the modified date of this tourism bona ground transportation
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this tourism bona ground transportation.
	 *
	 * @param primaryKey the primary key of this tourism bona ground transportation
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tourism application ID of this tourism bona ground transportation.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism bona ground transportation
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism bona ground transport ID of this tourism bona ground transportation.
	 *
	 * @param tourismBonaGroundTransportId the tourism bona ground transport ID of this tourism bona ground transportation
	 */
	@Override
	public void setTourismBonaGroundTransportId(
		long tourismBonaGroundTransportId) {

		model.setTourismBonaGroundTransportId(tourismBonaGroundTransportId);
	}

	/**
	 * Sets the type of ground transportation of this tourism bona ground transportation.
	 *
	 * @param typeOfGroundTransportation the type of ground transportation of this tourism bona ground transportation
	 */
	@Override
	public void setTypeOfGroundTransportation(
		String typeOfGroundTransportation) {

		model.setTypeOfGroundTransportation(typeOfGroundTransportation);
	}

	/**
	 * Sets the user ID of this tourism bona ground transportation.
	 *
	 * @param userId the user ID of this tourism bona ground transportation
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism bona ground transportation.
	 *
	 * @param userName the user name of this tourism bona ground transportation
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism bona ground transportation.
	 *
	 * @param userUuid the user uuid of this tourism bona ground transportation
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
	protected TourismBonaGroundTransportationWrapper wrap(
		TourismBonaGroundTransportation tourismBonaGroundTransportation) {

		return new TourismBonaGroundTransportationWrapper(
			tourismBonaGroundTransportation);
	}

}