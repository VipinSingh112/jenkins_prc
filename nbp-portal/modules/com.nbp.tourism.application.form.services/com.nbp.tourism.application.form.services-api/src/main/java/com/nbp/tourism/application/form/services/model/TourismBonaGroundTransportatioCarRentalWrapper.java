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
 * This class is a wrapper for {@link TourismBonaGroundTransportatioCarRental}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransportatioCarRental
 * @generated
 */
public class TourismBonaGroundTransportatioCarRentalWrapper
	extends BaseModelWrapper<TourismBonaGroundTransportatioCarRental>
	implements ModelWrapper<TourismBonaGroundTransportatioCarRental>,
			   TourismBonaGroundTransportatioCarRental {

	public TourismBonaGroundTransportatioCarRentalWrapper(
		TourismBonaGroundTransportatioCarRental
			tourismBonaGroundTransportatioCarRental) {

		super(tourismBonaGroundTransportatioCarRental);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"tourismBonaGroundTransportCRId",
			getTourismBonaGroundTransportCRId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put(
			"TypeOfGroundTransportation", getTypeOfGroundTransportation());
		attributes.put(
			"bonaGroundDateOfApplication", getBonaGroundDateOfApplication());
		attributes.put("bonaGroundNameOfCompany", getBonaGroundNameOfCompany());
		attributes.put("bonaGroundTradingName", getBonaGroundTradingName());
		attributes.put(
			"bonaGroundCompanyRegisNo", getBonaGroundCompanyRegisNo());
		attributes.put("bonaGroundTelephonNo", getBonaGroundTelephonNo());
		attributes.put("bonaGroundAddress", getBonaGroundAddress());
		attributes.put("bonaGroundEmailAddress", getBonaGroundEmailAddress());
		attributes.put("bonaGroundContactPerson", getBonaGroundContactPerson());
		attributes.put("bonaGroundEntityType", getBonaGroundEntityType());
		attributes.put("bonaGroundTccNo", getBonaGroundTccNo());
		attributes.put("bonaGroundExpiryDate", getBonaGroundExpiryDate());
		attributes.put("bonaGroundCopyAttached", getBonaGroundCopyAttached());
		attributes.put("bonaGroundJtbLicense", getBonaGroundJtbLicense());
		attributes.put("bonaGroundExpiryDateTwo", getBonaGroundExpiryDateTwo());
		attributes.put(
			"bonaGroundCopyAttachedTwo", getBonaGroundCopyAttachedTwo());
		attributes.put("bonaGroundTrnNo ", getBonaGroundTrnNo());
		attributes.put(
			"bonaGroundYearInBusiness", getBonaGroundYearInBusiness());
		attributes.put(
			"bonaGroundCopyOfRegAttached ", getBonaGroundCopyOfRegAttached());
		attributes.put(
			"bonaGroundExistingFleetAmount",
			getBonaGroundExistingFleetAmount());
		attributes.put("bonaGroundTotalVehicles", getBonaGroundTotalVehicles());
		attributes.put(
			"bonaGroundHowAdditionToFleet", getBonaGroundHowAdditionToFleet());
		attributes.put("bonaGroundReplacement", getBonaGroundReplacement());
		attributes.put("bonaGroundSummaryDealer", getBonaGroundSummaryDealer());
		attributes.put(
			"bonaGroundSummaryNumOfVechicle",
			getBonaGroundSummaryNumOfVechicle());
		attributes.put("bonaGroundSummarYear", getBonaGroundSummarYear());
		attributes.put("bonaGroundSummaryType", getBonaGroundSummaryType());
		attributes.put(
			"bonaGroundSummaryCCRating", getBonaGroundSummaryCCRating());
		attributes.put(
			"bonaGroundSummaryCommentary", getBonaGroundSummaryCommentary());
		attributes.put("bonaGroundDescription", getBonaGroundDescription());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismBonaGroundTransportCRId = (Long)attributes.get(
			"tourismBonaGroundTransportCRId");

		if (tourismBonaGroundTransportCRId != null) {
			setTourismBonaGroundTransportCRId(tourismBonaGroundTransportCRId);
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

		String TypeOfGroundTransportation = (String)attributes.get(
			"TypeOfGroundTransportation");

		if (TypeOfGroundTransportation != null) {
			setTypeOfGroundTransportation(TypeOfGroundTransportation);
		}

		Date bonaGroundDateOfApplication = (Date)attributes.get(
			"bonaGroundDateOfApplication");

		if (bonaGroundDateOfApplication != null) {
			setBonaGroundDateOfApplication(bonaGroundDateOfApplication);
		}

		String bonaGroundNameOfCompany = (String)attributes.get(
			"bonaGroundNameOfCompany");

		if (bonaGroundNameOfCompany != null) {
			setBonaGroundNameOfCompany(bonaGroundNameOfCompany);
		}

		String bonaGroundTradingName = (String)attributes.get(
			"bonaGroundTradingName");

		if (bonaGroundTradingName != null) {
			setBonaGroundTradingName(bonaGroundTradingName);
		}

		String bonaGroundCompanyRegisNo = (String)attributes.get(
			"bonaGroundCompanyRegisNo");

		if (bonaGroundCompanyRegisNo != null) {
			setBonaGroundCompanyRegisNo(bonaGroundCompanyRegisNo);
		}

		String bonaGroundTelephonNo = (String)attributes.get(
			"bonaGroundTelephonNo");

		if (bonaGroundTelephonNo != null) {
			setBonaGroundTelephonNo(bonaGroundTelephonNo);
		}

		String bonaGroundAddress = (String)attributes.get("bonaGroundAddress");

		if (bonaGroundAddress != null) {
			setBonaGroundAddress(bonaGroundAddress);
		}

		String bonaGroundEmailAddress = (String)attributes.get(
			"bonaGroundEmailAddress");

		if (bonaGroundEmailAddress != null) {
			setBonaGroundEmailAddress(bonaGroundEmailAddress);
		}

		String bonaGroundContactPerson = (String)attributes.get(
			"bonaGroundContactPerson");

		if (bonaGroundContactPerson != null) {
			setBonaGroundContactPerson(bonaGroundContactPerson);
		}

		String bonaGroundEntityType = (String)attributes.get(
			"bonaGroundEntityType");

		if (bonaGroundEntityType != null) {
			setBonaGroundEntityType(bonaGroundEntityType);
		}

		String bonaGroundTccNo = (String)attributes.get("bonaGroundTccNo");

		if (bonaGroundTccNo != null) {
			setBonaGroundTccNo(bonaGroundTccNo);
		}

		Date bonaGroundExpiryDate = (Date)attributes.get(
			"bonaGroundExpiryDate");

		if (bonaGroundExpiryDate != null) {
			setBonaGroundExpiryDate(bonaGroundExpiryDate);
		}

		String bonaGroundCopyAttached = (String)attributes.get(
			"bonaGroundCopyAttached");

		if (bonaGroundCopyAttached != null) {
			setBonaGroundCopyAttached(bonaGroundCopyAttached);
		}

		String bonaGroundJtbLicense = (String)attributes.get(
			"bonaGroundJtbLicense");

		if (bonaGroundJtbLicense != null) {
			setBonaGroundJtbLicense(bonaGroundJtbLicense);
		}

		Date bonaGroundExpiryDateTwo = (Date)attributes.get(
			"bonaGroundExpiryDateTwo");

		if (bonaGroundExpiryDateTwo != null) {
			setBonaGroundExpiryDateTwo(bonaGroundExpiryDateTwo);
		}

		String bonaGroundCopyAttachedTwo = (String)attributes.get(
			"bonaGroundCopyAttachedTwo");

		if (bonaGroundCopyAttachedTwo != null) {
			setBonaGroundCopyAttachedTwo(bonaGroundCopyAttachedTwo);
		}

		String bonaGroundTrnNo = (String)attributes.get("bonaGroundTrnNo ");

		if (bonaGroundTrnNo != null) {
			setBonaGroundTrnNo(bonaGroundTrnNo);
		}

		String bonaGroundYearInBusiness = (String)attributes.get(
			"bonaGroundYearInBusiness");

		if (bonaGroundYearInBusiness != null) {
			setBonaGroundYearInBusiness(bonaGroundYearInBusiness);
		}

		String bonaGroundCopyOfRegAttached = (String)attributes.get(
			"bonaGroundCopyOfRegAttached ");

		if (bonaGroundCopyOfRegAttached != null) {
			setBonaGroundCopyOfRegAttached(bonaGroundCopyOfRegAttached);
		}

		String bonaGroundExistingFleetAmount = (String)attributes.get(
			"bonaGroundExistingFleetAmount");

		if (bonaGroundExistingFleetAmount != null) {
			setBonaGroundExistingFleetAmount(bonaGroundExistingFleetAmount);
		}

		String bonaGroundTotalVehicles = (String)attributes.get(
			"bonaGroundTotalVehicles");

		if (bonaGroundTotalVehicles != null) {
			setBonaGroundTotalVehicles(bonaGroundTotalVehicles);
		}

		String bonaGroundHowAdditionToFleet = (String)attributes.get(
			"bonaGroundHowAdditionToFleet");

		if (bonaGroundHowAdditionToFleet != null) {
			setBonaGroundHowAdditionToFleet(bonaGroundHowAdditionToFleet);
		}

		String bonaGroundReplacement = (String)attributes.get(
			"bonaGroundReplacement");

		if (bonaGroundReplacement != null) {
			setBonaGroundReplacement(bonaGroundReplacement);
		}

		String bonaGroundSummaryDealer = (String)attributes.get(
			"bonaGroundSummaryDealer");

		if (bonaGroundSummaryDealer != null) {
			setBonaGroundSummaryDealer(bonaGroundSummaryDealer);
		}

		String bonaGroundSummaryNumOfVechicle = (String)attributes.get(
			"bonaGroundSummaryNumOfVechicle");

		if (bonaGroundSummaryNumOfVechicle != null) {
			setBonaGroundSummaryNumOfVechicle(bonaGroundSummaryNumOfVechicle);
		}

		String bonaGroundSummarYear = (String)attributes.get(
			"bonaGroundSummarYear");

		if (bonaGroundSummarYear != null) {
			setBonaGroundSummarYear(bonaGroundSummarYear);
		}

		String bonaGroundSummaryType = (String)attributes.get(
			"bonaGroundSummaryType");

		if (bonaGroundSummaryType != null) {
			setBonaGroundSummaryType(bonaGroundSummaryType);
		}

		String bonaGroundSummaryCCRating = (String)attributes.get(
			"bonaGroundSummaryCCRating");

		if (bonaGroundSummaryCCRating != null) {
			setBonaGroundSummaryCCRating(bonaGroundSummaryCCRating);
		}

		String bonaGroundSummaryCommentary = (String)attributes.get(
			"bonaGroundSummaryCommentary");

		if (bonaGroundSummaryCommentary != null) {
			setBonaGroundSummaryCommentary(bonaGroundSummaryCommentary);
		}

		String bonaGroundDescription = (String)attributes.get(
			"bonaGroundDescription");

		if (bonaGroundDescription != null) {
			setBonaGroundDescription(bonaGroundDescription);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}
	}

	@Override
	public TourismBonaGroundTransportatioCarRental cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the bona ground address of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground address of this tourism bona ground transportatio car rental
	 */
	@Override
	public String getBonaGroundAddress() {
		return model.getBonaGroundAddress();
	}

	/**
	 * Returns the bona ground company regis no of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground company regis no of this tourism bona ground transportatio car rental
	 */
	@Override
	public String getBonaGroundCompanyRegisNo() {
		return model.getBonaGroundCompanyRegisNo();
	}

	/**
	 * Returns the bona ground contact person of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground contact person of this tourism bona ground transportatio car rental
	 */
	@Override
	public String getBonaGroundContactPerson() {
		return model.getBonaGroundContactPerson();
	}

	/**
	 * Returns the bona ground copy attached of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground copy attached of this tourism bona ground transportatio car rental
	 */
	@Override
	public String getBonaGroundCopyAttached() {
		return model.getBonaGroundCopyAttached();
	}

	/**
	 * Returns the bona ground copy attached two of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground copy attached two of this tourism bona ground transportatio car rental
	 */
	@Override
	public String getBonaGroundCopyAttachedTwo() {
		return model.getBonaGroundCopyAttachedTwo();
	}

	/**
	 * Returns the bona ground copy of reg attached of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground copy of reg attached of this tourism bona ground transportatio car rental
	 */
	@Override
	public String getBonaGroundCopyOfRegAttached() {
		return model.getBonaGroundCopyOfRegAttached();
	}

	/**
	 * Returns the bona ground date of application of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground date of application of this tourism bona ground transportatio car rental
	 */
	@Override
	public Date getBonaGroundDateOfApplication() {
		return model.getBonaGroundDateOfApplication();
	}

	/**
	 * Returns the bona ground description of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground description of this tourism bona ground transportatio car rental
	 */
	@Override
	public String getBonaGroundDescription() {
		return model.getBonaGroundDescription();
	}

	/**
	 * Returns the bona ground email address of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground email address of this tourism bona ground transportatio car rental
	 */
	@Override
	public String getBonaGroundEmailAddress() {
		return model.getBonaGroundEmailAddress();
	}

	/**
	 * Returns the bona ground entity type of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground entity type of this tourism bona ground transportatio car rental
	 */
	@Override
	public String getBonaGroundEntityType() {
		return model.getBonaGroundEntityType();
	}

	/**
	 * Returns the bona ground existing fleet amount of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground existing fleet amount of this tourism bona ground transportatio car rental
	 */
	@Override
	public String getBonaGroundExistingFleetAmount() {
		return model.getBonaGroundExistingFleetAmount();
	}

	/**
	 * Returns the bona ground expiry date of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground expiry date of this tourism bona ground transportatio car rental
	 */
	@Override
	public Date getBonaGroundExpiryDate() {
		return model.getBonaGroundExpiryDate();
	}

	/**
	 * Returns the bona ground expiry date two of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground expiry date two of this tourism bona ground transportatio car rental
	 */
	@Override
	public Date getBonaGroundExpiryDateTwo() {
		return model.getBonaGroundExpiryDateTwo();
	}

	/**
	 * Returns the bona ground how addition to fleet of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground how addition to fleet of this tourism bona ground transportatio car rental
	 */
	@Override
	public String getBonaGroundHowAdditionToFleet() {
		return model.getBonaGroundHowAdditionToFleet();
	}

	/**
	 * Returns the bona ground jtb license of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground jtb license of this tourism bona ground transportatio car rental
	 */
	@Override
	public String getBonaGroundJtbLicense() {
		return model.getBonaGroundJtbLicense();
	}

	/**
	 * Returns the bona ground name of company of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground name of company of this tourism bona ground transportatio car rental
	 */
	@Override
	public String getBonaGroundNameOfCompany() {
		return model.getBonaGroundNameOfCompany();
	}

	/**
	 * Returns the bona ground replacement of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground replacement of this tourism bona ground transportatio car rental
	 */
	@Override
	public String getBonaGroundReplacement() {
		return model.getBonaGroundReplacement();
	}

	/**
	 * Returns the bona ground summary cc rating of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground summary cc rating of this tourism bona ground transportatio car rental
	 */
	@Override
	public String getBonaGroundSummaryCCRating() {
		return model.getBonaGroundSummaryCCRating();
	}

	/**
	 * Returns the bona ground summary commentary of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground summary commentary of this tourism bona ground transportatio car rental
	 */
	@Override
	public String getBonaGroundSummaryCommentary() {
		return model.getBonaGroundSummaryCommentary();
	}

	/**
	 * Returns the bona ground summary dealer of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground summary dealer of this tourism bona ground transportatio car rental
	 */
	@Override
	public String getBonaGroundSummaryDealer() {
		return model.getBonaGroundSummaryDealer();
	}

	/**
	 * Returns the bona ground summar year of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground summar year of this tourism bona ground transportatio car rental
	 */
	@Override
	public String getBonaGroundSummarYear() {
		return model.getBonaGroundSummarYear();
	}

	/**
	 * Returns the bona ground summary num of vechicle of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground summary num of vechicle of this tourism bona ground transportatio car rental
	 */
	@Override
	public String getBonaGroundSummaryNumOfVechicle() {
		return model.getBonaGroundSummaryNumOfVechicle();
	}

	/**
	 * Returns the bona ground summary type of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground summary type of this tourism bona ground transportatio car rental
	 */
	@Override
	public String getBonaGroundSummaryType() {
		return model.getBonaGroundSummaryType();
	}

	/**
	 * Returns the bona ground tcc no of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground tcc no of this tourism bona ground transportatio car rental
	 */
	@Override
	public String getBonaGroundTccNo() {
		return model.getBonaGroundTccNo();
	}

	/**
	 * Returns the bona ground telephon no of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground telephon no of this tourism bona ground transportatio car rental
	 */
	@Override
	public String getBonaGroundTelephonNo() {
		return model.getBonaGroundTelephonNo();
	}

	/**
	 * Returns the bona ground total vehicles of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground total vehicles of this tourism bona ground transportatio car rental
	 */
	@Override
	public String getBonaGroundTotalVehicles() {
		return model.getBonaGroundTotalVehicles();
	}

	/**
	 * Returns the bona ground trading name of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground trading name of this tourism bona ground transportatio car rental
	 */
	@Override
	public String getBonaGroundTradingName() {
		return model.getBonaGroundTradingName();
	}

	/**
	 * Returns the bona ground trn no of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground trn no of this tourism bona ground transportatio car rental
	 */
	@Override
	public String getBonaGroundTrnNo() {
		return model.getBonaGroundTrnNo();
	}

	/**
	 * Returns the bona ground year in business of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground year in business of this tourism bona ground transportatio car rental
	 */
	@Override
	public String getBonaGroundYearInBusiness() {
		return model.getBonaGroundYearInBusiness();
	}

	/**
	 * Returns the company ID of this tourism bona ground transportatio car rental.
	 *
	 * @return the company ID of this tourism bona ground transportatio car rental
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism bona ground transportatio car rental.
	 *
	 * @return the create date of this tourism bona ground transportatio car rental
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this tourism bona ground transportatio car rental.
	 *
	 * @return the group ID of this tourism bona ground transportatio car rental
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism bona ground transportatio car rental.
	 *
	 * @return the modified date of this tourism bona ground transportatio car rental
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this tourism bona ground transportatio car rental.
	 *
	 * @return the primary key of this tourism bona ground transportatio car rental
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tourism application ID of this tourism bona ground transportatio car rental.
	 *
	 * @return the tourism application ID of this tourism bona ground transportatio car rental
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism bona ground transport cr ID of this tourism bona ground transportatio car rental.
	 *
	 * @return the tourism bona ground transport cr ID of this tourism bona ground transportatio car rental
	 */
	@Override
	public long getTourismBonaGroundTransportCRId() {
		return model.getTourismBonaGroundTransportCRId();
	}

	/**
	 * Returns the type of ground transportation of this tourism bona ground transportatio car rental.
	 *
	 * @return the type of ground transportation of this tourism bona ground transportatio car rental
	 */
	@Override
	public String getTypeOfGroundTransportation() {
		return model.getTypeOfGroundTransportation();
	}

	/**
	 * Returns the user ID of this tourism bona ground transportatio car rental.
	 *
	 * @return the user ID of this tourism bona ground transportatio car rental
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism bona ground transportatio car rental.
	 *
	 * @return the user name of this tourism bona ground transportatio car rental
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism bona ground transportatio car rental.
	 *
	 * @return the user uuid of this tourism bona ground transportatio car rental
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
	 * Sets the bona ground address of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundAddress the bona ground address of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setBonaGroundAddress(String bonaGroundAddress) {
		model.setBonaGroundAddress(bonaGroundAddress);
	}

	/**
	 * Sets the bona ground company regis no of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundCompanyRegisNo the bona ground company regis no of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setBonaGroundCompanyRegisNo(String bonaGroundCompanyRegisNo) {
		model.setBonaGroundCompanyRegisNo(bonaGroundCompanyRegisNo);
	}

	/**
	 * Sets the bona ground contact person of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundContactPerson the bona ground contact person of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setBonaGroundContactPerson(String bonaGroundContactPerson) {
		model.setBonaGroundContactPerson(bonaGroundContactPerson);
	}

	/**
	 * Sets the bona ground copy attached of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundCopyAttached the bona ground copy attached of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setBonaGroundCopyAttached(String bonaGroundCopyAttached) {
		model.setBonaGroundCopyAttached(bonaGroundCopyAttached);
	}

	/**
	 * Sets the bona ground copy attached two of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundCopyAttachedTwo the bona ground copy attached two of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setBonaGroundCopyAttachedTwo(String bonaGroundCopyAttachedTwo) {
		model.setBonaGroundCopyAttachedTwo(bonaGroundCopyAttachedTwo);
	}

	/**
	 * Sets the bona ground copy of reg attached of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundCopyOfRegAttached  the bona ground copy of reg attached of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setBonaGroundCopyOfRegAttached(
		String bonaGroundCopyOfRegAttached) {

		model.setBonaGroundCopyOfRegAttached(bonaGroundCopyOfRegAttached);
	}

	/**
	 * Sets the bona ground date of application of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundDateOfApplication the bona ground date of application of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setBonaGroundDateOfApplication(
		Date bonaGroundDateOfApplication) {

		model.setBonaGroundDateOfApplication(bonaGroundDateOfApplication);
	}

	/**
	 * Sets the bona ground description of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundDescription the bona ground description of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setBonaGroundDescription(String bonaGroundDescription) {
		model.setBonaGroundDescription(bonaGroundDescription);
	}

	/**
	 * Sets the bona ground email address of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundEmailAddress the bona ground email address of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setBonaGroundEmailAddress(String bonaGroundEmailAddress) {
		model.setBonaGroundEmailAddress(bonaGroundEmailAddress);
	}

	/**
	 * Sets the bona ground entity type of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundEntityType the bona ground entity type of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setBonaGroundEntityType(String bonaGroundEntityType) {
		model.setBonaGroundEntityType(bonaGroundEntityType);
	}

	/**
	 * Sets the bona ground existing fleet amount of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundExistingFleetAmount the bona ground existing fleet amount of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setBonaGroundExistingFleetAmount(
		String bonaGroundExistingFleetAmount) {

		model.setBonaGroundExistingFleetAmount(bonaGroundExistingFleetAmount);
	}

	/**
	 * Sets the bona ground expiry date of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundExpiryDate the bona ground expiry date of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setBonaGroundExpiryDate(Date bonaGroundExpiryDate) {
		model.setBonaGroundExpiryDate(bonaGroundExpiryDate);
	}

	/**
	 * Sets the bona ground expiry date two of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundExpiryDateTwo the bona ground expiry date two of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setBonaGroundExpiryDateTwo(Date bonaGroundExpiryDateTwo) {
		model.setBonaGroundExpiryDateTwo(bonaGroundExpiryDateTwo);
	}

	/**
	 * Sets the bona ground how addition to fleet of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundHowAdditionToFleet the bona ground how addition to fleet of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setBonaGroundHowAdditionToFleet(
		String bonaGroundHowAdditionToFleet) {

		model.setBonaGroundHowAdditionToFleet(bonaGroundHowAdditionToFleet);
	}

	/**
	 * Sets the bona ground jtb license of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundJtbLicense the bona ground jtb license of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setBonaGroundJtbLicense(String bonaGroundJtbLicense) {
		model.setBonaGroundJtbLicense(bonaGroundJtbLicense);
	}

	/**
	 * Sets the bona ground name of company of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundNameOfCompany the bona ground name of company of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setBonaGroundNameOfCompany(String bonaGroundNameOfCompany) {
		model.setBonaGroundNameOfCompany(bonaGroundNameOfCompany);
	}

	/**
	 * Sets the bona ground replacement of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundReplacement the bona ground replacement of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setBonaGroundReplacement(String bonaGroundReplacement) {
		model.setBonaGroundReplacement(bonaGroundReplacement);
	}

	/**
	 * Sets the bona ground summary cc rating of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundSummaryCCRating the bona ground summary cc rating of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setBonaGroundSummaryCCRating(String bonaGroundSummaryCCRating) {
		model.setBonaGroundSummaryCCRating(bonaGroundSummaryCCRating);
	}

	/**
	 * Sets the bona ground summary commentary of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundSummaryCommentary the bona ground summary commentary of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setBonaGroundSummaryCommentary(
		String bonaGroundSummaryCommentary) {

		model.setBonaGroundSummaryCommentary(bonaGroundSummaryCommentary);
	}

	/**
	 * Sets the bona ground summary dealer of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundSummaryDealer the bona ground summary dealer of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setBonaGroundSummaryDealer(String bonaGroundSummaryDealer) {
		model.setBonaGroundSummaryDealer(bonaGroundSummaryDealer);
	}

	/**
	 * Sets the bona ground summar year of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundSummarYear the bona ground summar year of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setBonaGroundSummarYear(String bonaGroundSummarYear) {
		model.setBonaGroundSummarYear(bonaGroundSummarYear);
	}

	/**
	 * Sets the bona ground summary num of vechicle of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundSummaryNumOfVechicle the bona ground summary num of vechicle of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setBonaGroundSummaryNumOfVechicle(
		String bonaGroundSummaryNumOfVechicle) {

		model.setBonaGroundSummaryNumOfVechicle(bonaGroundSummaryNumOfVechicle);
	}

	/**
	 * Sets the bona ground summary type of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundSummaryType the bona ground summary type of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setBonaGroundSummaryType(String bonaGroundSummaryType) {
		model.setBonaGroundSummaryType(bonaGroundSummaryType);
	}

	/**
	 * Sets the bona ground tcc no of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundTccNo the bona ground tcc no of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setBonaGroundTccNo(String bonaGroundTccNo) {
		model.setBonaGroundTccNo(bonaGroundTccNo);
	}

	/**
	 * Sets the bona ground telephon no of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundTelephonNo the bona ground telephon no of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setBonaGroundTelephonNo(String bonaGroundTelephonNo) {
		model.setBonaGroundTelephonNo(bonaGroundTelephonNo);
	}

	/**
	 * Sets the bona ground total vehicles of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundTotalVehicles the bona ground total vehicles of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setBonaGroundTotalVehicles(String bonaGroundTotalVehicles) {
		model.setBonaGroundTotalVehicles(bonaGroundTotalVehicles);
	}

	/**
	 * Sets the bona ground trading name of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundTradingName the bona ground trading name of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setBonaGroundTradingName(String bonaGroundTradingName) {
		model.setBonaGroundTradingName(bonaGroundTradingName);
	}

	/**
	 * Sets the bona ground trn no of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundTrnNo  the bona ground trn no of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setBonaGroundTrnNo(String bonaGroundTrnNo) {
		model.setBonaGroundTrnNo(bonaGroundTrnNo);
	}

	/**
	 * Sets the bona ground year in business of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundYearInBusiness the bona ground year in business of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setBonaGroundYearInBusiness(String bonaGroundYearInBusiness) {
		model.setBonaGroundYearInBusiness(bonaGroundYearInBusiness);
	}

	/**
	 * Sets the company ID of this tourism bona ground transportatio car rental.
	 *
	 * @param companyId the company ID of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism bona ground transportatio car rental.
	 *
	 * @param createDate the create date of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this tourism bona ground transportatio car rental.
	 *
	 * @param groupId the group ID of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism bona ground transportatio car rental.
	 *
	 * @param modifiedDate the modified date of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this tourism bona ground transportatio car rental.
	 *
	 * @param primaryKey the primary key of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tourism application ID of this tourism bona ground transportatio car rental.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism bona ground transport cr ID of this tourism bona ground transportatio car rental.
	 *
	 * @param tourismBonaGroundTransportCRId the tourism bona ground transport cr ID of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setTourismBonaGroundTransportCRId(
		long tourismBonaGroundTransportCRId) {

		model.setTourismBonaGroundTransportCRId(tourismBonaGroundTransportCRId);
	}

	/**
	 * Sets the type of ground transportation of this tourism bona ground transportatio car rental.
	 *
	 * @param TypeOfGroundTransportation the type of ground transportation of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setTypeOfGroundTransportation(
		String TypeOfGroundTransportation) {

		model.setTypeOfGroundTransportation(TypeOfGroundTransportation);
	}

	/**
	 * Sets the user ID of this tourism bona ground transportatio car rental.
	 *
	 * @param userId the user ID of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism bona ground transportatio car rental.
	 *
	 * @param userName the user name of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism bona ground transportatio car rental.
	 *
	 * @param userUuid the user uuid of this tourism bona ground transportatio car rental
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
	protected TourismBonaGroundTransportatioCarRentalWrapper wrap(
		TourismBonaGroundTransportatioCarRental
			tourismBonaGroundTransportatioCarRental) {

		return new TourismBonaGroundTransportatioCarRentalWrapper(
			tourismBonaGroundTransportatioCarRental);
	}

}