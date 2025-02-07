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
 * This class is a wrapper for {@link TourismNewGroundTransportation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewGroundTransportation
 * @generated
 */
public class TourismNewGroundTransportationWrapper
	extends BaseModelWrapper<TourismNewGroundTransportation>
	implements ModelWrapper<TourismNewGroundTransportation>,
			   TourismNewGroundTransportation {

	public TourismNewGroundTransportationWrapper(
		TourismNewGroundTransportation tourismNewGroundTransportation) {

		super(tourismNewGroundTransportation);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("TourismNewGroundTransId", getTourismNewGroundTransId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put(
			"typeOfGroundTransportation", getTypeOfGroundTransportation());
		attributes.put("newGroundName", getNewGroundName());
		attributes.put("newGroundHomeAddress", getNewGroundHomeAddress());
		attributes.put(
			"newGroundBusinessAddress", getNewGroundBusinessAddress());
		attributes.put("newGroundLandlineNo", getNewGroundLandlineNo());
		attributes.put("newGroundMobileNo", getNewGroundMobileNo());
		attributes.put("newGroundFaxNo", getNewGroundFaxNo());
		attributes.put("newGroundLicensedWith", getNewGroundLicensedWith());
		attributes.put(
			"newGroundBoardExpiryDate", getNewGroundBoardExpiryDate());
		attributes.put(
			"newGroundHaveYouBenefitBefore",
			getNewGroundHaveYouBenefitBefore());
		attributes.put(
			"newGroundHaveBenefitDate", getNewGroundHaveBenefitDate());
		attributes.put("newGroundEntityType", getNewGroundEntityType());
		attributes.put(
			"newGroundVehicleInfoMake", getNewGroundVehicleInfoMake());
		attributes.put(
			"newGroundVehicleInfoModel", getNewGroundVehicleInfoModel());
		attributes.put(
			"newGroundVehicleInfoYear", getNewGroundVehicleInfoYear());
		attributes.put(
			"newGroundSeatingCapacity", getNewGroundSeatingCapacity());
		attributes.put(
			"newGroundExistingFleetAmount", getNewGroundExistingFleetAmount());
		attributes.put(
			"newGroundIndicateVehicleWill", getNewGroundIndicateVehicleWill());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long TourismNewGroundTransId = (Long)attributes.get(
			"TourismNewGroundTransId");

		if (TourismNewGroundTransId != null) {
			setTourismNewGroundTransId(TourismNewGroundTransId);
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

		String newGroundName = (String)attributes.get("newGroundName");

		if (newGroundName != null) {
			setNewGroundName(newGroundName);
		}

		String newGroundHomeAddress = (String)attributes.get(
			"newGroundHomeAddress");

		if (newGroundHomeAddress != null) {
			setNewGroundHomeAddress(newGroundHomeAddress);
		}

		String newGroundBusinessAddress = (String)attributes.get(
			"newGroundBusinessAddress");

		if (newGroundBusinessAddress != null) {
			setNewGroundBusinessAddress(newGroundBusinessAddress);
		}

		String newGroundLandlineNo = (String)attributes.get(
			"newGroundLandlineNo");

		if (newGroundLandlineNo != null) {
			setNewGroundLandlineNo(newGroundLandlineNo);
		}

		String newGroundMobileNo = (String)attributes.get("newGroundMobileNo");

		if (newGroundMobileNo != null) {
			setNewGroundMobileNo(newGroundMobileNo);
		}

		String newGroundFaxNo = (String)attributes.get("newGroundFaxNo");

		if (newGroundFaxNo != null) {
			setNewGroundFaxNo(newGroundFaxNo);
		}

		String newGroundLicensedWith = (String)attributes.get(
			"newGroundLicensedWith");

		if (newGroundLicensedWith != null) {
			setNewGroundLicensedWith(newGroundLicensedWith);
		}

		Date newGroundBoardExpiryDate = (Date)attributes.get(
			"newGroundBoardExpiryDate");

		if (newGroundBoardExpiryDate != null) {
			setNewGroundBoardExpiryDate(newGroundBoardExpiryDate);
		}

		String newGroundHaveYouBenefitBefore = (String)attributes.get(
			"newGroundHaveYouBenefitBefore");

		if (newGroundHaveYouBenefitBefore != null) {
			setNewGroundHaveYouBenefitBefore(newGroundHaveYouBenefitBefore);
		}

		Date newGroundHaveBenefitDate = (Date)attributes.get(
			"newGroundHaveBenefitDate");

		if (newGroundHaveBenefitDate != null) {
			setNewGroundHaveBenefitDate(newGroundHaveBenefitDate);
		}

		String newGroundEntityType = (String)attributes.get(
			"newGroundEntityType");

		if (newGroundEntityType != null) {
			setNewGroundEntityType(newGroundEntityType);
		}

		String newGroundVehicleInfoMake = (String)attributes.get(
			"newGroundVehicleInfoMake");

		if (newGroundVehicleInfoMake != null) {
			setNewGroundVehicleInfoMake(newGroundVehicleInfoMake);
		}

		String newGroundVehicleInfoModel = (String)attributes.get(
			"newGroundVehicleInfoModel");

		if (newGroundVehicleInfoModel != null) {
			setNewGroundVehicleInfoModel(newGroundVehicleInfoModel);
		}

		String newGroundVehicleInfoYear = (String)attributes.get(
			"newGroundVehicleInfoYear");

		if (newGroundVehicleInfoYear != null) {
			setNewGroundVehicleInfoYear(newGroundVehicleInfoYear);
		}

		String newGroundSeatingCapacity = (String)attributes.get(
			"newGroundSeatingCapacity");

		if (newGroundSeatingCapacity != null) {
			setNewGroundSeatingCapacity(newGroundSeatingCapacity);
		}

		String newGroundExistingFleetAmount = (String)attributes.get(
			"newGroundExistingFleetAmount");

		if (newGroundExistingFleetAmount != null) {
			setNewGroundExistingFleetAmount(newGroundExistingFleetAmount);
		}

		String newGroundIndicateVehicleWill = (String)attributes.get(
			"newGroundIndicateVehicleWill");

		if (newGroundIndicateVehicleWill != null) {
			setNewGroundIndicateVehicleWill(newGroundIndicateVehicleWill);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}
	}

	@Override
	public TourismNewGroundTransportation cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this tourism new ground transportation.
	 *
	 * @return the company ID of this tourism new ground transportation
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism new ground transportation.
	 *
	 * @return the create date of this tourism new ground transportation
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this tourism new ground transportation.
	 *
	 * @return the group ID of this tourism new ground transportation
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism new ground transportation.
	 *
	 * @return the modified date of this tourism new ground transportation
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the new ground board expiry date of this tourism new ground transportation.
	 *
	 * @return the new ground board expiry date of this tourism new ground transportation
	 */
	@Override
	public Date getNewGroundBoardExpiryDate() {
		return model.getNewGroundBoardExpiryDate();
	}

	/**
	 * Returns the new ground business address of this tourism new ground transportation.
	 *
	 * @return the new ground business address of this tourism new ground transportation
	 */
	@Override
	public String getNewGroundBusinessAddress() {
		return model.getNewGroundBusinessAddress();
	}

	/**
	 * Returns the new ground entity type of this tourism new ground transportation.
	 *
	 * @return the new ground entity type of this tourism new ground transportation
	 */
	@Override
	public String getNewGroundEntityType() {
		return model.getNewGroundEntityType();
	}

	/**
	 * Returns the new ground existing fleet amount of this tourism new ground transportation.
	 *
	 * @return the new ground existing fleet amount of this tourism new ground transportation
	 */
	@Override
	public String getNewGroundExistingFleetAmount() {
		return model.getNewGroundExistingFleetAmount();
	}

	/**
	 * Returns the new ground fax no of this tourism new ground transportation.
	 *
	 * @return the new ground fax no of this tourism new ground transportation
	 */
	@Override
	public String getNewGroundFaxNo() {
		return model.getNewGroundFaxNo();
	}

	/**
	 * Returns the new ground have benefit date of this tourism new ground transportation.
	 *
	 * @return the new ground have benefit date of this tourism new ground transportation
	 */
	@Override
	public Date getNewGroundHaveBenefitDate() {
		return model.getNewGroundHaveBenefitDate();
	}

	/**
	 * Returns the new ground have you benefit before of this tourism new ground transportation.
	 *
	 * @return the new ground have you benefit before of this tourism new ground transportation
	 */
	@Override
	public String getNewGroundHaveYouBenefitBefore() {
		return model.getNewGroundHaveYouBenefitBefore();
	}

	/**
	 * Returns the new ground home address of this tourism new ground transportation.
	 *
	 * @return the new ground home address of this tourism new ground transportation
	 */
	@Override
	public String getNewGroundHomeAddress() {
		return model.getNewGroundHomeAddress();
	}

	/**
	 * Returns the new ground indicate vehicle will of this tourism new ground transportation.
	 *
	 * @return the new ground indicate vehicle will of this tourism new ground transportation
	 */
	@Override
	public String getNewGroundIndicateVehicleWill() {
		return model.getNewGroundIndicateVehicleWill();
	}

	/**
	 * Returns the new ground landline no of this tourism new ground transportation.
	 *
	 * @return the new ground landline no of this tourism new ground transportation
	 */
	@Override
	public String getNewGroundLandlineNo() {
		return model.getNewGroundLandlineNo();
	}

	/**
	 * Returns the new ground licensed with of this tourism new ground transportation.
	 *
	 * @return the new ground licensed with of this tourism new ground transportation
	 */
	@Override
	public String getNewGroundLicensedWith() {
		return model.getNewGroundLicensedWith();
	}

	/**
	 * Returns the new ground mobile no of this tourism new ground transportation.
	 *
	 * @return the new ground mobile no of this tourism new ground transportation
	 */
	@Override
	public String getNewGroundMobileNo() {
		return model.getNewGroundMobileNo();
	}

	/**
	 * Returns the new ground name of this tourism new ground transportation.
	 *
	 * @return the new ground name of this tourism new ground transportation
	 */
	@Override
	public String getNewGroundName() {
		return model.getNewGroundName();
	}

	/**
	 * Returns the new ground seating capacity of this tourism new ground transportation.
	 *
	 * @return the new ground seating capacity of this tourism new ground transportation
	 */
	@Override
	public String getNewGroundSeatingCapacity() {
		return model.getNewGroundSeatingCapacity();
	}

	/**
	 * Returns the new ground vehicle info make of this tourism new ground transportation.
	 *
	 * @return the new ground vehicle info make of this tourism new ground transportation
	 */
	@Override
	public String getNewGroundVehicleInfoMake() {
		return model.getNewGroundVehicleInfoMake();
	}

	/**
	 * Returns the new ground vehicle info model of this tourism new ground transportation.
	 *
	 * @return the new ground vehicle info model of this tourism new ground transportation
	 */
	@Override
	public String getNewGroundVehicleInfoModel() {
		return model.getNewGroundVehicleInfoModel();
	}

	/**
	 * Returns the new ground vehicle info year of this tourism new ground transportation.
	 *
	 * @return the new ground vehicle info year of this tourism new ground transportation
	 */
	@Override
	public String getNewGroundVehicleInfoYear() {
		return model.getNewGroundVehicleInfoYear();
	}

	/**
	 * Returns the primary key of this tourism new ground transportation.
	 *
	 * @return the primary key of this tourism new ground transportation
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tourism application ID of this tourism new ground transportation.
	 *
	 * @return the tourism application ID of this tourism new ground transportation
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism new ground trans ID of this tourism new ground transportation.
	 *
	 * @return the tourism new ground trans ID of this tourism new ground transportation
	 */
	@Override
	public long getTourismNewGroundTransId() {
		return model.getTourismNewGroundTransId();
	}

	/**
	 * Returns the type of ground transportation of this tourism new ground transportation.
	 *
	 * @return the type of ground transportation of this tourism new ground transportation
	 */
	@Override
	public String getTypeOfGroundTransportation() {
		return model.getTypeOfGroundTransportation();
	}

	/**
	 * Returns the user ID of this tourism new ground transportation.
	 *
	 * @return the user ID of this tourism new ground transportation
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism new ground transportation.
	 *
	 * @return the user name of this tourism new ground transportation
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism new ground transportation.
	 *
	 * @return the user uuid of this tourism new ground transportation
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
	 * Sets the company ID of this tourism new ground transportation.
	 *
	 * @param companyId the company ID of this tourism new ground transportation
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism new ground transportation.
	 *
	 * @param createDate the create date of this tourism new ground transportation
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this tourism new ground transportation.
	 *
	 * @param groupId the group ID of this tourism new ground transportation
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism new ground transportation.
	 *
	 * @param modifiedDate the modified date of this tourism new ground transportation
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the new ground board expiry date of this tourism new ground transportation.
	 *
	 * @param newGroundBoardExpiryDate the new ground board expiry date of this tourism new ground transportation
	 */
	@Override
	public void setNewGroundBoardExpiryDate(Date newGroundBoardExpiryDate) {
		model.setNewGroundBoardExpiryDate(newGroundBoardExpiryDate);
	}

	/**
	 * Sets the new ground business address of this tourism new ground transportation.
	 *
	 * @param newGroundBusinessAddress the new ground business address of this tourism new ground transportation
	 */
	@Override
	public void setNewGroundBusinessAddress(String newGroundBusinessAddress) {
		model.setNewGroundBusinessAddress(newGroundBusinessAddress);
	}

	/**
	 * Sets the new ground entity type of this tourism new ground transportation.
	 *
	 * @param newGroundEntityType the new ground entity type of this tourism new ground transportation
	 */
	@Override
	public void setNewGroundEntityType(String newGroundEntityType) {
		model.setNewGroundEntityType(newGroundEntityType);
	}

	/**
	 * Sets the new ground existing fleet amount of this tourism new ground transportation.
	 *
	 * @param newGroundExistingFleetAmount the new ground existing fleet amount of this tourism new ground transportation
	 */
	@Override
	public void setNewGroundExistingFleetAmount(
		String newGroundExistingFleetAmount) {

		model.setNewGroundExistingFleetAmount(newGroundExistingFleetAmount);
	}

	/**
	 * Sets the new ground fax no of this tourism new ground transportation.
	 *
	 * @param newGroundFaxNo the new ground fax no of this tourism new ground transportation
	 */
	@Override
	public void setNewGroundFaxNo(String newGroundFaxNo) {
		model.setNewGroundFaxNo(newGroundFaxNo);
	}

	/**
	 * Sets the new ground have benefit date of this tourism new ground transportation.
	 *
	 * @param newGroundHaveBenefitDate the new ground have benefit date of this tourism new ground transportation
	 */
	@Override
	public void setNewGroundHaveBenefitDate(Date newGroundHaveBenefitDate) {
		model.setNewGroundHaveBenefitDate(newGroundHaveBenefitDate);
	}

	/**
	 * Sets the new ground have you benefit before of this tourism new ground transportation.
	 *
	 * @param newGroundHaveYouBenefitBefore the new ground have you benefit before of this tourism new ground transportation
	 */
	@Override
	public void setNewGroundHaveYouBenefitBefore(
		String newGroundHaveYouBenefitBefore) {

		model.setNewGroundHaveYouBenefitBefore(newGroundHaveYouBenefitBefore);
	}

	/**
	 * Sets the new ground home address of this tourism new ground transportation.
	 *
	 * @param newGroundHomeAddress the new ground home address of this tourism new ground transportation
	 */
	@Override
	public void setNewGroundHomeAddress(String newGroundHomeAddress) {
		model.setNewGroundHomeAddress(newGroundHomeAddress);
	}

	/**
	 * Sets the new ground indicate vehicle will of this tourism new ground transportation.
	 *
	 * @param newGroundIndicateVehicleWill the new ground indicate vehicle will of this tourism new ground transportation
	 */
	@Override
	public void setNewGroundIndicateVehicleWill(
		String newGroundIndicateVehicleWill) {

		model.setNewGroundIndicateVehicleWill(newGroundIndicateVehicleWill);
	}

	/**
	 * Sets the new ground landline no of this tourism new ground transportation.
	 *
	 * @param newGroundLandlineNo the new ground landline no of this tourism new ground transportation
	 */
	@Override
	public void setNewGroundLandlineNo(String newGroundLandlineNo) {
		model.setNewGroundLandlineNo(newGroundLandlineNo);
	}

	/**
	 * Sets the new ground licensed with of this tourism new ground transportation.
	 *
	 * @param newGroundLicensedWith the new ground licensed with of this tourism new ground transportation
	 */
	@Override
	public void setNewGroundLicensedWith(String newGroundLicensedWith) {
		model.setNewGroundLicensedWith(newGroundLicensedWith);
	}

	/**
	 * Sets the new ground mobile no of this tourism new ground transportation.
	 *
	 * @param newGroundMobileNo the new ground mobile no of this tourism new ground transportation
	 */
	@Override
	public void setNewGroundMobileNo(String newGroundMobileNo) {
		model.setNewGroundMobileNo(newGroundMobileNo);
	}

	/**
	 * Sets the new ground name of this tourism new ground transportation.
	 *
	 * @param newGroundName the new ground name of this tourism new ground transportation
	 */
	@Override
	public void setNewGroundName(String newGroundName) {
		model.setNewGroundName(newGroundName);
	}

	/**
	 * Sets the new ground seating capacity of this tourism new ground transportation.
	 *
	 * @param newGroundSeatingCapacity the new ground seating capacity of this tourism new ground transportation
	 */
	@Override
	public void setNewGroundSeatingCapacity(String newGroundSeatingCapacity) {
		model.setNewGroundSeatingCapacity(newGroundSeatingCapacity);
	}

	/**
	 * Sets the new ground vehicle info make of this tourism new ground transportation.
	 *
	 * @param newGroundVehicleInfoMake the new ground vehicle info make of this tourism new ground transportation
	 */
	@Override
	public void setNewGroundVehicleInfoMake(String newGroundVehicleInfoMake) {
		model.setNewGroundVehicleInfoMake(newGroundVehicleInfoMake);
	}

	/**
	 * Sets the new ground vehicle info model of this tourism new ground transportation.
	 *
	 * @param newGroundVehicleInfoModel the new ground vehicle info model of this tourism new ground transportation
	 */
	@Override
	public void setNewGroundVehicleInfoModel(String newGroundVehicleInfoModel) {
		model.setNewGroundVehicleInfoModel(newGroundVehicleInfoModel);
	}

	/**
	 * Sets the new ground vehicle info year of this tourism new ground transportation.
	 *
	 * @param newGroundVehicleInfoYear the new ground vehicle info year of this tourism new ground transportation
	 */
	@Override
	public void setNewGroundVehicleInfoYear(String newGroundVehicleInfoYear) {
		model.setNewGroundVehicleInfoYear(newGroundVehicleInfoYear);
	}

	/**
	 * Sets the primary key of this tourism new ground transportation.
	 *
	 * @param primaryKey the primary key of this tourism new ground transportation
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tourism application ID of this tourism new ground transportation.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism new ground transportation
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism new ground trans ID of this tourism new ground transportation.
	 *
	 * @param TourismNewGroundTransId the tourism new ground trans ID of this tourism new ground transportation
	 */
	@Override
	public void setTourismNewGroundTransId(long TourismNewGroundTransId) {
		model.setTourismNewGroundTransId(TourismNewGroundTransId);
	}

	/**
	 * Sets the type of ground transportation of this tourism new ground transportation.
	 *
	 * @param typeOfGroundTransportation the type of ground transportation of this tourism new ground transportation
	 */
	@Override
	public void setTypeOfGroundTransportation(
		String typeOfGroundTransportation) {

		model.setTypeOfGroundTransportation(typeOfGroundTransportation);
	}

	/**
	 * Sets the user ID of this tourism new ground transportation.
	 *
	 * @param userId the user ID of this tourism new ground transportation
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism new ground transportation.
	 *
	 * @param userName the user name of this tourism new ground transportation
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism new ground transportation.
	 *
	 * @param userUuid the user uuid of this tourism new ground transportation
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
	protected TourismNewGroundTransportationWrapper wrap(
		TourismNewGroundTransportation tourismNewGroundTransportation) {

		return new TourismNewGroundTransportationWrapper(
			tourismNewGroundTransportation);
	}

}