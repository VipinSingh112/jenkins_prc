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
 * This class is a wrapper for {@link TourismBonaAccommodationForm}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccommodationForm
 * @generated
 */
public class TourismBonaAccommodationFormWrapper
	extends BaseModelWrapper<TourismBonaAccommodationForm>
	implements ModelWrapper<TourismBonaAccommodationForm>,
			   TourismBonaAccommodationForm {

	public TourismBonaAccommodationFormWrapper(
		TourismBonaAccommodationForm tourismBonaAccommodationForm) {

		super(tourismBonaAccommodationForm);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tourismBonaAFId", getTourismBonaAFId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put(
			"bonaAccoDateOfApplication", getBonaAccoDateOfApplication());
		attributes.put(
			"bonaAccoTypeOfAccommodation", getBonaAccoTypeOfAccommodation());
		attributes.put(
			"bonaAccoPurposeOfIncentives", getBonaAccoPurposeOfIncentives());
		attributes.put("bonaAccoOtherIncPurpose", getBonaAccoOtherIncPurpose());
		attributes.put("bonaAccoNameOfProperty", getBonaAccoNameOfProperty());
		attributes.put("bonaAccoNameOfOwner", getBonaAccoNameOfOwner());
		attributes.put("bonaAccoLocation", getBonaAccoLocation());
		attributes.put("bonaAccoCompanyNumber", getBonaAccoCompanyNumber());
		attributes.put(
			"bonaBusinessRegistrationNumber",
			getBonaBusinessRegistrationNumber());
		attributes.put(
			"bonaAccoDateOfRegistration", getBonaAccoDateOfRegistration());
		attributes.put("bonaAccoOwnerTrnNumber", getBonaAccoOwnerTrnNumber());
		attributes.put("bonaAccoTccNumber", getBonaAccoTccNumber());
		attributes.put("bonaAccoExpiryDate", getBonaAccoExpiryDate());
		attributes.put("bonaAccoNameOfOperator", getBonaAccoNameOfOperator());
		attributes.put(
			"bonaAccoOperatorTrnNumber", getBonaAccoOperatorTrnNumber());
		attributes.put(
			"bonaAccoOperatorTccNumber", getBonaAccoOperatorTccNumber());
		attributes.put(
			"bonaAccoOperatorExpiryDate", getBonaAccoOperatorExpiryDate());
		attributes.put("bonaAccoContactPerson", getBonaAccoContactPerson());
		attributes.put("bonaAccoPositionHeld", getBonaAccoPositionHeld());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismBonaAFId = (Long)attributes.get("tourismBonaAFId");

		if (tourismBonaAFId != null) {
			setTourismBonaAFId(tourismBonaAFId);
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

		Date bonaAccoDateOfApplication = (Date)attributes.get(
			"bonaAccoDateOfApplication");

		if (bonaAccoDateOfApplication != null) {
			setBonaAccoDateOfApplication(bonaAccoDateOfApplication);
		}

		String bonaAccoTypeOfAccommodation = (String)attributes.get(
			"bonaAccoTypeOfAccommodation");

		if (bonaAccoTypeOfAccommodation != null) {
			setBonaAccoTypeOfAccommodation(bonaAccoTypeOfAccommodation);
		}

		String bonaAccoPurposeOfIncentives = (String)attributes.get(
			"bonaAccoPurposeOfIncentives");

		if (bonaAccoPurposeOfIncentives != null) {
			setBonaAccoPurposeOfIncentives(bonaAccoPurposeOfIncentives);
		}

		String bonaAccoOtherIncPurpose = (String)attributes.get(
			"bonaAccoOtherIncPurpose");

		if (bonaAccoOtherIncPurpose != null) {
			setBonaAccoOtherIncPurpose(bonaAccoOtherIncPurpose);
		}

		String bonaAccoNameOfProperty = (String)attributes.get(
			"bonaAccoNameOfProperty");

		if (bonaAccoNameOfProperty != null) {
			setBonaAccoNameOfProperty(bonaAccoNameOfProperty);
		}

		String bonaAccoNameOfOwner = (String)attributes.get(
			"bonaAccoNameOfOwner");

		if (bonaAccoNameOfOwner != null) {
			setBonaAccoNameOfOwner(bonaAccoNameOfOwner);
		}

		String bonaAccoLocation = (String)attributes.get("bonaAccoLocation");

		if (bonaAccoLocation != null) {
			setBonaAccoLocation(bonaAccoLocation);
		}

		String bonaAccoCompanyNumber = (String)attributes.get(
			"bonaAccoCompanyNumber");

		if (bonaAccoCompanyNumber != null) {
			setBonaAccoCompanyNumber(bonaAccoCompanyNumber);
		}

		String bonaBusinessRegistrationNumber = (String)attributes.get(
			"bonaBusinessRegistrationNumber");

		if (bonaBusinessRegistrationNumber != null) {
			setBonaBusinessRegistrationNumber(bonaBusinessRegistrationNumber);
		}

		Date bonaAccoDateOfRegistration = (Date)attributes.get(
			"bonaAccoDateOfRegistration");

		if (bonaAccoDateOfRegistration != null) {
			setBonaAccoDateOfRegistration(bonaAccoDateOfRegistration);
		}

		String bonaAccoOwnerTrnNumber = (String)attributes.get(
			"bonaAccoOwnerTrnNumber");

		if (bonaAccoOwnerTrnNumber != null) {
			setBonaAccoOwnerTrnNumber(bonaAccoOwnerTrnNumber);
		}

		String bonaAccoTccNumber = (String)attributes.get("bonaAccoTccNumber");

		if (bonaAccoTccNumber != null) {
			setBonaAccoTccNumber(bonaAccoTccNumber);
		}

		Date bonaAccoExpiryDate = (Date)attributes.get("bonaAccoExpiryDate");

		if (bonaAccoExpiryDate != null) {
			setBonaAccoExpiryDate(bonaAccoExpiryDate);
		}

		String bonaAccoNameOfOperator = (String)attributes.get(
			"bonaAccoNameOfOperator");

		if (bonaAccoNameOfOperator != null) {
			setBonaAccoNameOfOperator(bonaAccoNameOfOperator);
		}

		String bonaAccoOperatorTrnNumber = (String)attributes.get(
			"bonaAccoOperatorTrnNumber");

		if (bonaAccoOperatorTrnNumber != null) {
			setBonaAccoOperatorTrnNumber(bonaAccoOperatorTrnNumber);
		}

		String bonaAccoOperatorTccNumber = (String)attributes.get(
			"bonaAccoOperatorTccNumber");

		if (bonaAccoOperatorTccNumber != null) {
			setBonaAccoOperatorTccNumber(bonaAccoOperatorTccNumber);
		}

		Date bonaAccoOperatorExpiryDate = (Date)attributes.get(
			"bonaAccoOperatorExpiryDate");

		if (bonaAccoOperatorExpiryDate != null) {
			setBonaAccoOperatorExpiryDate(bonaAccoOperatorExpiryDate);
		}

		String bonaAccoContactPerson = (String)attributes.get(
			"bonaAccoContactPerson");

		if (bonaAccoContactPerson != null) {
			setBonaAccoContactPerson(bonaAccoContactPerson);
		}

		String bonaAccoPositionHeld = (String)attributes.get(
			"bonaAccoPositionHeld");

		if (bonaAccoPositionHeld != null) {
			setBonaAccoPositionHeld(bonaAccoPositionHeld);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}
	}

	@Override
	public TourismBonaAccommodationForm cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the bona acco company number of this tourism bona accommodation form.
	 *
	 * @return the bona acco company number of this tourism bona accommodation form
	 */
	@Override
	public String getBonaAccoCompanyNumber() {
		return model.getBonaAccoCompanyNumber();
	}

	/**
	 * Returns the bona acco contact person of this tourism bona accommodation form.
	 *
	 * @return the bona acco contact person of this tourism bona accommodation form
	 */
	@Override
	public String getBonaAccoContactPerson() {
		return model.getBonaAccoContactPerson();
	}

	/**
	 * Returns the bona acco date of application of this tourism bona accommodation form.
	 *
	 * @return the bona acco date of application of this tourism bona accommodation form
	 */
	@Override
	public Date getBonaAccoDateOfApplication() {
		return model.getBonaAccoDateOfApplication();
	}

	/**
	 * Returns the bona acco date of registration of this tourism bona accommodation form.
	 *
	 * @return the bona acco date of registration of this tourism bona accommodation form
	 */
	@Override
	public Date getBonaAccoDateOfRegistration() {
		return model.getBonaAccoDateOfRegistration();
	}

	/**
	 * Returns the bona acco expiry date of this tourism bona accommodation form.
	 *
	 * @return the bona acco expiry date of this tourism bona accommodation form
	 */
	@Override
	public Date getBonaAccoExpiryDate() {
		return model.getBonaAccoExpiryDate();
	}

	/**
	 * Returns the bona acco location of this tourism bona accommodation form.
	 *
	 * @return the bona acco location of this tourism bona accommodation form
	 */
	@Override
	public String getBonaAccoLocation() {
		return model.getBonaAccoLocation();
	}

	/**
	 * Returns the bona acco name of operator of this tourism bona accommodation form.
	 *
	 * @return the bona acco name of operator of this tourism bona accommodation form
	 */
	@Override
	public String getBonaAccoNameOfOperator() {
		return model.getBonaAccoNameOfOperator();
	}

	/**
	 * Returns the bona acco name of owner of this tourism bona accommodation form.
	 *
	 * @return the bona acco name of owner of this tourism bona accommodation form
	 */
	@Override
	public String getBonaAccoNameOfOwner() {
		return model.getBonaAccoNameOfOwner();
	}

	/**
	 * Returns the bona acco name of property of this tourism bona accommodation form.
	 *
	 * @return the bona acco name of property of this tourism bona accommodation form
	 */
	@Override
	public String getBonaAccoNameOfProperty() {
		return model.getBonaAccoNameOfProperty();
	}

	/**
	 * Returns the bona acco operator expiry date of this tourism bona accommodation form.
	 *
	 * @return the bona acco operator expiry date of this tourism bona accommodation form
	 */
	@Override
	public Date getBonaAccoOperatorExpiryDate() {
		return model.getBonaAccoOperatorExpiryDate();
	}

	/**
	 * Returns the bona acco operator tcc number of this tourism bona accommodation form.
	 *
	 * @return the bona acco operator tcc number of this tourism bona accommodation form
	 */
	@Override
	public String getBonaAccoOperatorTccNumber() {
		return model.getBonaAccoOperatorTccNumber();
	}

	/**
	 * Returns the bona acco operator trn number of this tourism bona accommodation form.
	 *
	 * @return the bona acco operator trn number of this tourism bona accommodation form
	 */
	@Override
	public String getBonaAccoOperatorTrnNumber() {
		return model.getBonaAccoOperatorTrnNumber();
	}

	/**
	 * Returns the bona acco other inc purpose of this tourism bona accommodation form.
	 *
	 * @return the bona acco other inc purpose of this tourism bona accommodation form
	 */
	@Override
	public String getBonaAccoOtherIncPurpose() {
		return model.getBonaAccoOtherIncPurpose();
	}

	/**
	 * Returns the bona acco owner trn number of this tourism bona accommodation form.
	 *
	 * @return the bona acco owner trn number of this tourism bona accommodation form
	 */
	@Override
	public String getBonaAccoOwnerTrnNumber() {
		return model.getBonaAccoOwnerTrnNumber();
	}

	/**
	 * Returns the bona acco position held of this tourism bona accommodation form.
	 *
	 * @return the bona acco position held of this tourism bona accommodation form
	 */
	@Override
	public String getBonaAccoPositionHeld() {
		return model.getBonaAccoPositionHeld();
	}

	/**
	 * Returns the bona acco purpose of incentives of this tourism bona accommodation form.
	 *
	 * @return the bona acco purpose of incentives of this tourism bona accommodation form
	 */
	@Override
	public String getBonaAccoPurposeOfIncentives() {
		return model.getBonaAccoPurposeOfIncentives();
	}

	/**
	 * Returns the bona acco tcc number of this tourism bona accommodation form.
	 *
	 * @return the bona acco tcc number of this tourism bona accommodation form
	 */
	@Override
	public String getBonaAccoTccNumber() {
		return model.getBonaAccoTccNumber();
	}

	/**
	 * Returns the bona acco type of accommodation of this tourism bona accommodation form.
	 *
	 * @return the bona acco type of accommodation of this tourism bona accommodation form
	 */
	@Override
	public String getBonaAccoTypeOfAccommodation() {
		return model.getBonaAccoTypeOfAccommodation();
	}

	/**
	 * Returns the bona business registration number of this tourism bona accommodation form.
	 *
	 * @return the bona business registration number of this tourism bona accommodation form
	 */
	@Override
	public String getBonaBusinessRegistrationNumber() {
		return model.getBonaBusinessRegistrationNumber();
	}

	/**
	 * Returns the company ID of this tourism bona accommodation form.
	 *
	 * @return the company ID of this tourism bona accommodation form
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism bona accommodation form.
	 *
	 * @return the create date of this tourism bona accommodation form
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this tourism bona accommodation form.
	 *
	 * @return the group ID of this tourism bona accommodation form
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism bona accommodation form.
	 *
	 * @return the modified date of this tourism bona accommodation form
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this tourism bona accommodation form.
	 *
	 * @return the primary key of this tourism bona accommodation form
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tourism application ID of this tourism bona accommodation form.
	 *
	 * @return the tourism application ID of this tourism bona accommodation form
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism bona af ID of this tourism bona accommodation form.
	 *
	 * @return the tourism bona af ID of this tourism bona accommodation form
	 */
	@Override
	public long getTourismBonaAFId() {
		return model.getTourismBonaAFId();
	}

	/**
	 * Returns the user ID of this tourism bona accommodation form.
	 *
	 * @return the user ID of this tourism bona accommodation form
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism bona accommodation form.
	 *
	 * @return the user name of this tourism bona accommodation form
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism bona accommodation form.
	 *
	 * @return the user uuid of this tourism bona accommodation form
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
	 * Sets the bona acco company number of this tourism bona accommodation form.
	 *
	 * @param bonaAccoCompanyNumber the bona acco company number of this tourism bona accommodation form
	 */
	@Override
	public void setBonaAccoCompanyNumber(String bonaAccoCompanyNumber) {
		model.setBonaAccoCompanyNumber(bonaAccoCompanyNumber);
	}

	/**
	 * Sets the bona acco contact person of this tourism bona accommodation form.
	 *
	 * @param bonaAccoContactPerson the bona acco contact person of this tourism bona accommodation form
	 */
	@Override
	public void setBonaAccoContactPerson(String bonaAccoContactPerson) {
		model.setBonaAccoContactPerson(bonaAccoContactPerson);
	}

	/**
	 * Sets the bona acco date of application of this tourism bona accommodation form.
	 *
	 * @param bonaAccoDateOfApplication the bona acco date of application of this tourism bona accommodation form
	 */
	@Override
	public void setBonaAccoDateOfApplication(Date bonaAccoDateOfApplication) {
		model.setBonaAccoDateOfApplication(bonaAccoDateOfApplication);
	}

	/**
	 * Sets the bona acco date of registration of this tourism bona accommodation form.
	 *
	 * @param bonaAccoDateOfRegistration the bona acco date of registration of this tourism bona accommodation form
	 */
	@Override
	public void setBonaAccoDateOfRegistration(Date bonaAccoDateOfRegistration) {
		model.setBonaAccoDateOfRegistration(bonaAccoDateOfRegistration);
	}

	/**
	 * Sets the bona acco expiry date of this tourism bona accommodation form.
	 *
	 * @param bonaAccoExpiryDate the bona acco expiry date of this tourism bona accommodation form
	 */
	@Override
	public void setBonaAccoExpiryDate(Date bonaAccoExpiryDate) {
		model.setBonaAccoExpiryDate(bonaAccoExpiryDate);
	}

	/**
	 * Sets the bona acco location of this tourism bona accommodation form.
	 *
	 * @param bonaAccoLocation the bona acco location of this tourism bona accommodation form
	 */
	@Override
	public void setBonaAccoLocation(String bonaAccoLocation) {
		model.setBonaAccoLocation(bonaAccoLocation);
	}

	/**
	 * Sets the bona acco name of operator of this tourism bona accommodation form.
	 *
	 * @param bonaAccoNameOfOperator the bona acco name of operator of this tourism bona accommodation form
	 */
	@Override
	public void setBonaAccoNameOfOperator(String bonaAccoNameOfOperator) {
		model.setBonaAccoNameOfOperator(bonaAccoNameOfOperator);
	}

	/**
	 * Sets the bona acco name of owner of this tourism bona accommodation form.
	 *
	 * @param bonaAccoNameOfOwner the bona acco name of owner of this tourism bona accommodation form
	 */
	@Override
	public void setBonaAccoNameOfOwner(String bonaAccoNameOfOwner) {
		model.setBonaAccoNameOfOwner(bonaAccoNameOfOwner);
	}

	/**
	 * Sets the bona acco name of property of this tourism bona accommodation form.
	 *
	 * @param bonaAccoNameOfProperty the bona acco name of property of this tourism bona accommodation form
	 */
	@Override
	public void setBonaAccoNameOfProperty(String bonaAccoNameOfProperty) {
		model.setBonaAccoNameOfProperty(bonaAccoNameOfProperty);
	}

	/**
	 * Sets the bona acco operator expiry date of this tourism bona accommodation form.
	 *
	 * @param bonaAccoOperatorExpiryDate the bona acco operator expiry date of this tourism bona accommodation form
	 */
	@Override
	public void setBonaAccoOperatorExpiryDate(Date bonaAccoOperatorExpiryDate) {
		model.setBonaAccoOperatorExpiryDate(bonaAccoOperatorExpiryDate);
	}

	/**
	 * Sets the bona acco operator tcc number of this tourism bona accommodation form.
	 *
	 * @param bonaAccoOperatorTccNumber the bona acco operator tcc number of this tourism bona accommodation form
	 */
	@Override
	public void setBonaAccoOperatorTccNumber(String bonaAccoOperatorTccNumber) {
		model.setBonaAccoOperatorTccNumber(bonaAccoOperatorTccNumber);
	}

	/**
	 * Sets the bona acco operator trn number of this tourism bona accommodation form.
	 *
	 * @param bonaAccoOperatorTrnNumber the bona acco operator trn number of this tourism bona accommodation form
	 */
	@Override
	public void setBonaAccoOperatorTrnNumber(String bonaAccoOperatorTrnNumber) {
		model.setBonaAccoOperatorTrnNumber(bonaAccoOperatorTrnNumber);
	}

	/**
	 * Sets the bona acco other inc purpose of this tourism bona accommodation form.
	 *
	 * @param bonaAccoOtherIncPurpose the bona acco other inc purpose of this tourism bona accommodation form
	 */
	@Override
	public void setBonaAccoOtherIncPurpose(String bonaAccoOtherIncPurpose) {
		model.setBonaAccoOtherIncPurpose(bonaAccoOtherIncPurpose);
	}

	/**
	 * Sets the bona acco owner trn number of this tourism bona accommodation form.
	 *
	 * @param bonaAccoOwnerTrnNumber the bona acco owner trn number of this tourism bona accommodation form
	 */
	@Override
	public void setBonaAccoOwnerTrnNumber(String bonaAccoOwnerTrnNumber) {
		model.setBonaAccoOwnerTrnNumber(bonaAccoOwnerTrnNumber);
	}

	/**
	 * Sets the bona acco position held of this tourism bona accommodation form.
	 *
	 * @param bonaAccoPositionHeld the bona acco position held of this tourism bona accommodation form
	 */
	@Override
	public void setBonaAccoPositionHeld(String bonaAccoPositionHeld) {
		model.setBonaAccoPositionHeld(bonaAccoPositionHeld);
	}

	/**
	 * Sets the bona acco purpose of incentives of this tourism bona accommodation form.
	 *
	 * @param bonaAccoPurposeOfIncentives the bona acco purpose of incentives of this tourism bona accommodation form
	 */
	@Override
	public void setBonaAccoPurposeOfIncentives(
		String bonaAccoPurposeOfIncentives) {

		model.setBonaAccoPurposeOfIncentives(bonaAccoPurposeOfIncentives);
	}

	/**
	 * Sets the bona acco tcc number of this tourism bona accommodation form.
	 *
	 * @param bonaAccoTccNumber the bona acco tcc number of this tourism bona accommodation form
	 */
	@Override
	public void setBonaAccoTccNumber(String bonaAccoTccNumber) {
		model.setBonaAccoTccNumber(bonaAccoTccNumber);
	}

	/**
	 * Sets the bona acco type of accommodation of this tourism bona accommodation form.
	 *
	 * @param bonaAccoTypeOfAccommodation the bona acco type of accommodation of this tourism bona accommodation form
	 */
	@Override
	public void setBonaAccoTypeOfAccommodation(
		String bonaAccoTypeOfAccommodation) {

		model.setBonaAccoTypeOfAccommodation(bonaAccoTypeOfAccommodation);
	}

	/**
	 * Sets the bona business registration number of this tourism bona accommodation form.
	 *
	 * @param bonaBusinessRegistrationNumber the bona business registration number of this tourism bona accommodation form
	 */
	@Override
	public void setBonaBusinessRegistrationNumber(
		String bonaBusinessRegistrationNumber) {

		model.setBonaBusinessRegistrationNumber(bonaBusinessRegistrationNumber);
	}

	/**
	 * Sets the company ID of this tourism bona accommodation form.
	 *
	 * @param companyId the company ID of this tourism bona accommodation form
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism bona accommodation form.
	 *
	 * @param createDate the create date of this tourism bona accommodation form
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this tourism bona accommodation form.
	 *
	 * @param groupId the group ID of this tourism bona accommodation form
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism bona accommodation form.
	 *
	 * @param modifiedDate the modified date of this tourism bona accommodation form
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this tourism bona accommodation form.
	 *
	 * @param primaryKey the primary key of this tourism bona accommodation form
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tourism application ID of this tourism bona accommodation form.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism bona accommodation form
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism bona af ID of this tourism bona accommodation form.
	 *
	 * @param tourismBonaAFId the tourism bona af ID of this tourism bona accommodation form
	 */
	@Override
	public void setTourismBonaAFId(long tourismBonaAFId) {
		model.setTourismBonaAFId(tourismBonaAFId);
	}

	/**
	 * Sets the user ID of this tourism bona accommodation form.
	 *
	 * @param userId the user ID of this tourism bona accommodation form
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism bona accommodation form.
	 *
	 * @param userName the user name of this tourism bona accommodation form
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism bona accommodation form.
	 *
	 * @param userUuid the user uuid of this tourism bona accommodation form
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
	protected TourismBonaAccommodationFormWrapper wrap(
		TourismBonaAccommodationForm tourismBonaAccommodationForm) {

		return new TourismBonaAccommodationFormWrapper(
			tourismBonaAccommodationForm);
	}

}