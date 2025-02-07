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
 * This class is a wrapper for {@link TourismBonaAttractionFormFirst}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAttractionFormFirst
 * @generated
 */
public class TourismBonaAttractionFormFirstWrapper
	extends BaseModelWrapper<TourismBonaAttractionFormFirst>
	implements ModelWrapper<TourismBonaAttractionFormFirst>,
			   TourismBonaAttractionFormFirst {

	public TourismBonaAttractionFormFirstWrapper(
		TourismBonaAttractionFormFirst tourismBonaAttractionFormFirst) {

		super(tourismBonaAttractionFormFirst);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"tourismBonaAttractFormFirstId",
			getTourismBonaAttractFormFirstId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put(
			"bonaAttractDateOfApplication", getBonaAttractDateOfApplication());
		attributes.put("bonaTypeOfAttrcation", getBonaTypeOfAttrcation());
		attributes.put(
			"bonaAttractPurposeOfIncentives",
			getBonaAttractPurposeOfIncentives());
		attributes.put(
			"bonaAttractOtherIncPurpose", getBonaAttractOtherIncPurpose());
		attributes.put(
			"bonaAttractionNameOfProperty", getBonaAttractionNameOfProperty());
		attributes.put(
			"bonaAttractionNameOfOwner", getBonaAttractionNameOfOwner());
		attributes.put("bonaAttractionLocation", getBonaAttractionLocation());
		attributes.put(
			"bonaAttractionCompanyNumber", getBonaAttractionCompanyNumber());
		attributes.put(
			"bonaAttractionBusinessRegisNo",
			getBonaAttractionBusinessRegisNo());
		attributes.put(
			"bonaAttractionDateOfRegis", getBonaAttractionDateOfRegis());
		attributes.put(
			"bonaAttractionOwnerTrnNumber", getBonaAttractionOwnerTrnNumber());
		attributes.put("bonaAttractionTccNumber", getBonaAttractionTccNumber());
		attributes.put(
			"bonaAttractionExpiryDate", getBonaAttractionExpiryDate());
		attributes.put(
			"bonaAttractionNameOfOperator", getBonaAttractionNameOfOperator());
		attributes.put(
			"bonaAttractionoperatorTrnNo", getBonaAttractionoperatorTrnNo());
		attributes.put(
			"bonattractionOperatorTccNO", getBonattractionOperatorTccNO());
		attributes.put(
			"bonaAttractOperatorExpiryDate",
			getBonaAttractOperatorExpiryDate());
		attributes.put(
			"bonaAttractContactPerson", getBonaAttractContactPerson());
		attributes.put("bonaAttractPositionHeld", getBonaAttractPositionHeld());
		attributes.put("bonaAttractEntityId", getBonaAttractEntityId());
		attributes.put(
			"bonaAttractionBriefdescription",
			getBonaAttractionBriefdescription());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismBonaAttractFormFirstId = (Long)attributes.get(
			"tourismBonaAttractFormFirstId");

		if (tourismBonaAttractFormFirstId != null) {
			setTourismBonaAttractFormFirstId(tourismBonaAttractFormFirstId);
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

		Date bonaAttractDateOfApplication = (Date)attributes.get(
			"bonaAttractDateOfApplication");

		if (bonaAttractDateOfApplication != null) {
			setBonaAttractDateOfApplication(bonaAttractDateOfApplication);
		}

		String bonaTypeOfAttrcation = (String)attributes.get(
			"bonaTypeOfAttrcation");

		if (bonaTypeOfAttrcation != null) {
			setBonaTypeOfAttrcation(bonaTypeOfAttrcation);
		}

		String bonaAttractPurposeOfIncentives = (String)attributes.get(
			"bonaAttractPurposeOfIncentives");

		if (bonaAttractPurposeOfIncentives != null) {
			setBonaAttractPurposeOfIncentives(bonaAttractPurposeOfIncentives);
		}

		String bonaAttractOtherIncPurpose = (String)attributes.get(
			"bonaAttractOtherIncPurpose");

		if (bonaAttractOtherIncPurpose != null) {
			setBonaAttractOtherIncPurpose(bonaAttractOtherIncPurpose);
		}

		String bonaAttractionNameOfProperty = (String)attributes.get(
			"bonaAttractionNameOfProperty");

		if (bonaAttractionNameOfProperty != null) {
			setBonaAttractionNameOfProperty(bonaAttractionNameOfProperty);
		}

		String bonaAttractionNameOfOwner = (String)attributes.get(
			"bonaAttractionNameOfOwner");

		if (bonaAttractionNameOfOwner != null) {
			setBonaAttractionNameOfOwner(bonaAttractionNameOfOwner);
		}

		String bonaAttractionLocation = (String)attributes.get(
			"bonaAttractionLocation");

		if (bonaAttractionLocation != null) {
			setBonaAttractionLocation(bonaAttractionLocation);
		}

		String bonaAttractionCompanyNumber = (String)attributes.get(
			"bonaAttractionCompanyNumber");

		if (bonaAttractionCompanyNumber != null) {
			setBonaAttractionCompanyNumber(bonaAttractionCompanyNumber);
		}

		String bonaAttractionBusinessRegisNo = (String)attributes.get(
			"bonaAttractionBusinessRegisNo");

		if (bonaAttractionBusinessRegisNo != null) {
			setBonaAttractionBusinessRegisNo(bonaAttractionBusinessRegisNo);
		}

		Date bonaAttractionDateOfRegis = (Date)attributes.get(
			"bonaAttractionDateOfRegis");

		if (bonaAttractionDateOfRegis != null) {
			setBonaAttractionDateOfRegis(bonaAttractionDateOfRegis);
		}

		String bonaAttractionOwnerTrnNumber = (String)attributes.get(
			"bonaAttractionOwnerTrnNumber");

		if (bonaAttractionOwnerTrnNumber != null) {
			setBonaAttractionOwnerTrnNumber(bonaAttractionOwnerTrnNumber);
		}

		String bonaAttractionTccNumber = (String)attributes.get(
			"bonaAttractionTccNumber");

		if (bonaAttractionTccNumber != null) {
			setBonaAttractionTccNumber(bonaAttractionTccNumber);
		}

		Date bonaAttractionExpiryDate = (Date)attributes.get(
			"bonaAttractionExpiryDate");

		if (bonaAttractionExpiryDate != null) {
			setBonaAttractionExpiryDate(bonaAttractionExpiryDate);
		}

		String bonaAttractionNameOfOperator = (String)attributes.get(
			"bonaAttractionNameOfOperator");

		if (bonaAttractionNameOfOperator != null) {
			setBonaAttractionNameOfOperator(bonaAttractionNameOfOperator);
		}

		String bonaAttractionoperatorTrnNo = (String)attributes.get(
			"bonaAttractionoperatorTrnNo");

		if (bonaAttractionoperatorTrnNo != null) {
			setBonaAttractionoperatorTrnNo(bonaAttractionoperatorTrnNo);
		}

		String bonattractionOperatorTccNO = (String)attributes.get(
			"bonattractionOperatorTccNO");

		if (bonattractionOperatorTccNO != null) {
			setBonattractionOperatorTccNO(bonattractionOperatorTccNO);
		}

		Date bonaAttractOperatorExpiryDate = (Date)attributes.get(
			"bonaAttractOperatorExpiryDate");

		if (bonaAttractOperatorExpiryDate != null) {
			setBonaAttractOperatorExpiryDate(bonaAttractOperatorExpiryDate);
		}

		String bonaAttractContactPerson = (String)attributes.get(
			"bonaAttractContactPerson");

		if (bonaAttractContactPerson != null) {
			setBonaAttractContactPerson(bonaAttractContactPerson);
		}

		String bonaAttractPositionHeld = (String)attributes.get(
			"bonaAttractPositionHeld");

		if (bonaAttractPositionHeld != null) {
			setBonaAttractPositionHeld(bonaAttractPositionHeld);
		}

		String bonaAttractEntityId = (String)attributes.get(
			"bonaAttractEntityId");

		if (bonaAttractEntityId != null) {
			setBonaAttractEntityId(bonaAttractEntityId);
		}

		String bonaAttractionBriefdescription = (String)attributes.get(
			"bonaAttractionBriefdescription");

		if (bonaAttractionBriefdescription != null) {
			setBonaAttractionBriefdescription(bonaAttractionBriefdescription);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}
	}

	@Override
	public TourismBonaAttractionFormFirst cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the bona attract contact person of this tourism bona attraction form first.
	 *
	 * @return the bona attract contact person of this tourism bona attraction form first
	 */
	@Override
	public String getBonaAttractContactPerson() {
		return model.getBonaAttractContactPerson();
	}

	/**
	 * Returns the bona attract date of application of this tourism bona attraction form first.
	 *
	 * @return the bona attract date of application of this tourism bona attraction form first
	 */
	@Override
	public Date getBonaAttractDateOfApplication() {
		return model.getBonaAttractDateOfApplication();
	}

	/**
	 * Returns the bona attract entity ID of this tourism bona attraction form first.
	 *
	 * @return the bona attract entity ID of this tourism bona attraction form first
	 */
	@Override
	public String getBonaAttractEntityId() {
		return model.getBonaAttractEntityId();
	}

	/**
	 * Returns the bona attraction briefdescription of this tourism bona attraction form first.
	 *
	 * @return the bona attraction briefdescription of this tourism bona attraction form first
	 */
	@Override
	public String getBonaAttractionBriefdescription() {
		return model.getBonaAttractionBriefdescription();
	}

	/**
	 * Returns the bona attraction business regis no of this tourism bona attraction form first.
	 *
	 * @return the bona attraction business regis no of this tourism bona attraction form first
	 */
	@Override
	public String getBonaAttractionBusinessRegisNo() {
		return model.getBonaAttractionBusinessRegisNo();
	}

	/**
	 * Returns the bona attraction company number of this tourism bona attraction form first.
	 *
	 * @return the bona attraction company number of this tourism bona attraction form first
	 */
	@Override
	public String getBonaAttractionCompanyNumber() {
		return model.getBonaAttractionCompanyNumber();
	}

	/**
	 * Returns the bona attraction date of regis of this tourism bona attraction form first.
	 *
	 * @return the bona attraction date of regis of this tourism bona attraction form first
	 */
	@Override
	public Date getBonaAttractionDateOfRegis() {
		return model.getBonaAttractionDateOfRegis();
	}

	/**
	 * Returns the bona attraction expiry date of this tourism bona attraction form first.
	 *
	 * @return the bona attraction expiry date of this tourism bona attraction form first
	 */
	@Override
	public Date getBonaAttractionExpiryDate() {
		return model.getBonaAttractionExpiryDate();
	}

	/**
	 * Returns the bona attraction location of this tourism bona attraction form first.
	 *
	 * @return the bona attraction location of this tourism bona attraction form first
	 */
	@Override
	public String getBonaAttractionLocation() {
		return model.getBonaAttractionLocation();
	}

	/**
	 * Returns the bona attraction name of operator of this tourism bona attraction form first.
	 *
	 * @return the bona attraction name of operator of this tourism bona attraction form first
	 */
	@Override
	public String getBonaAttractionNameOfOperator() {
		return model.getBonaAttractionNameOfOperator();
	}

	/**
	 * Returns the bona attraction name of owner of this tourism bona attraction form first.
	 *
	 * @return the bona attraction name of owner of this tourism bona attraction form first
	 */
	@Override
	public String getBonaAttractionNameOfOwner() {
		return model.getBonaAttractionNameOfOwner();
	}

	/**
	 * Returns the bona attraction name of property of this tourism bona attraction form first.
	 *
	 * @return the bona attraction name of property of this tourism bona attraction form first
	 */
	@Override
	public String getBonaAttractionNameOfProperty() {
		return model.getBonaAttractionNameOfProperty();
	}

	/**
	 * Returns the bona attractionoperator trn no of this tourism bona attraction form first.
	 *
	 * @return the bona attractionoperator trn no of this tourism bona attraction form first
	 */
	@Override
	public String getBonaAttractionoperatorTrnNo() {
		return model.getBonaAttractionoperatorTrnNo();
	}

	/**
	 * Returns the bona attraction owner trn number of this tourism bona attraction form first.
	 *
	 * @return the bona attraction owner trn number of this tourism bona attraction form first
	 */
	@Override
	public String getBonaAttractionOwnerTrnNumber() {
		return model.getBonaAttractionOwnerTrnNumber();
	}

	/**
	 * Returns the bona attraction tcc number of this tourism bona attraction form first.
	 *
	 * @return the bona attraction tcc number of this tourism bona attraction form first
	 */
	@Override
	public String getBonaAttractionTccNumber() {
		return model.getBonaAttractionTccNumber();
	}

	/**
	 * Returns the bona attract operator expiry date of this tourism bona attraction form first.
	 *
	 * @return the bona attract operator expiry date of this tourism bona attraction form first
	 */
	@Override
	public Date getBonaAttractOperatorExpiryDate() {
		return model.getBonaAttractOperatorExpiryDate();
	}

	/**
	 * Returns the bona attract other inc purpose of this tourism bona attraction form first.
	 *
	 * @return the bona attract other inc purpose of this tourism bona attraction form first
	 */
	@Override
	public String getBonaAttractOtherIncPurpose() {
		return model.getBonaAttractOtherIncPurpose();
	}

	/**
	 * Returns the bona attract position held of this tourism bona attraction form first.
	 *
	 * @return the bona attract position held of this tourism bona attraction form first
	 */
	@Override
	public String getBonaAttractPositionHeld() {
		return model.getBonaAttractPositionHeld();
	}

	/**
	 * Returns the bona attract purpose of incentives of this tourism bona attraction form first.
	 *
	 * @return the bona attract purpose of incentives of this tourism bona attraction form first
	 */
	@Override
	public String getBonaAttractPurposeOfIncentives() {
		return model.getBonaAttractPurposeOfIncentives();
	}

	/**
	 * Returns the bonattraction operator tcc no of this tourism bona attraction form first.
	 *
	 * @return the bonattraction operator tcc no of this tourism bona attraction form first
	 */
	@Override
	public String getBonattractionOperatorTccNO() {
		return model.getBonattractionOperatorTccNO();
	}

	/**
	 * Returns the bona type of attrcation of this tourism bona attraction form first.
	 *
	 * @return the bona type of attrcation of this tourism bona attraction form first
	 */
	@Override
	public String getBonaTypeOfAttrcation() {
		return model.getBonaTypeOfAttrcation();
	}

	/**
	 * Returns the company ID of this tourism bona attraction form first.
	 *
	 * @return the company ID of this tourism bona attraction form first
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism bona attraction form first.
	 *
	 * @return the create date of this tourism bona attraction form first
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this tourism bona attraction form first.
	 *
	 * @return the group ID of this tourism bona attraction form first
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism bona attraction form first.
	 *
	 * @return the modified date of this tourism bona attraction form first
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this tourism bona attraction form first.
	 *
	 * @return the primary key of this tourism bona attraction form first
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tourism application ID of this tourism bona attraction form first.
	 *
	 * @return the tourism application ID of this tourism bona attraction form first
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism bona attract form first ID of this tourism bona attraction form first.
	 *
	 * @return the tourism bona attract form first ID of this tourism bona attraction form first
	 */
	@Override
	public long getTourismBonaAttractFormFirstId() {
		return model.getTourismBonaAttractFormFirstId();
	}

	/**
	 * Returns the user ID of this tourism bona attraction form first.
	 *
	 * @return the user ID of this tourism bona attraction form first
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism bona attraction form first.
	 *
	 * @return the user name of this tourism bona attraction form first
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism bona attraction form first.
	 *
	 * @return the user uuid of this tourism bona attraction form first
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
	 * Sets the bona attract contact person of this tourism bona attraction form first.
	 *
	 * @param bonaAttractContactPerson the bona attract contact person of this tourism bona attraction form first
	 */
	@Override
	public void setBonaAttractContactPerson(String bonaAttractContactPerson) {
		model.setBonaAttractContactPerson(bonaAttractContactPerson);
	}

	/**
	 * Sets the bona attract date of application of this tourism bona attraction form first.
	 *
	 * @param bonaAttractDateOfApplication the bona attract date of application of this tourism bona attraction form first
	 */
	@Override
	public void setBonaAttractDateOfApplication(
		Date bonaAttractDateOfApplication) {

		model.setBonaAttractDateOfApplication(bonaAttractDateOfApplication);
	}

	/**
	 * Sets the bona attract entity ID of this tourism bona attraction form first.
	 *
	 * @param bonaAttractEntityId the bona attract entity ID of this tourism bona attraction form first
	 */
	@Override
	public void setBonaAttractEntityId(String bonaAttractEntityId) {
		model.setBonaAttractEntityId(bonaAttractEntityId);
	}

	/**
	 * Sets the bona attraction briefdescription of this tourism bona attraction form first.
	 *
	 * @param bonaAttractionBriefdescription the bona attraction briefdescription of this tourism bona attraction form first
	 */
	@Override
	public void setBonaAttractionBriefdescription(
		String bonaAttractionBriefdescription) {

		model.setBonaAttractionBriefdescription(bonaAttractionBriefdescription);
	}

	/**
	 * Sets the bona attraction business regis no of this tourism bona attraction form first.
	 *
	 * @param bonaAttractionBusinessRegisNo the bona attraction business regis no of this tourism bona attraction form first
	 */
	@Override
	public void setBonaAttractionBusinessRegisNo(
		String bonaAttractionBusinessRegisNo) {

		model.setBonaAttractionBusinessRegisNo(bonaAttractionBusinessRegisNo);
	}

	/**
	 * Sets the bona attraction company number of this tourism bona attraction form first.
	 *
	 * @param bonaAttractionCompanyNumber the bona attraction company number of this tourism bona attraction form first
	 */
	@Override
	public void setBonaAttractionCompanyNumber(
		String bonaAttractionCompanyNumber) {

		model.setBonaAttractionCompanyNumber(bonaAttractionCompanyNumber);
	}

	/**
	 * Sets the bona attraction date of regis of this tourism bona attraction form first.
	 *
	 * @param bonaAttractionDateOfRegis the bona attraction date of regis of this tourism bona attraction form first
	 */
	@Override
	public void setBonaAttractionDateOfRegis(Date bonaAttractionDateOfRegis) {
		model.setBonaAttractionDateOfRegis(bonaAttractionDateOfRegis);
	}

	/**
	 * Sets the bona attraction expiry date of this tourism bona attraction form first.
	 *
	 * @param bonaAttractionExpiryDate the bona attraction expiry date of this tourism bona attraction form first
	 */
	@Override
	public void setBonaAttractionExpiryDate(Date bonaAttractionExpiryDate) {
		model.setBonaAttractionExpiryDate(bonaAttractionExpiryDate);
	}

	/**
	 * Sets the bona attraction location of this tourism bona attraction form first.
	 *
	 * @param bonaAttractionLocation the bona attraction location of this tourism bona attraction form first
	 */
	@Override
	public void setBonaAttractionLocation(String bonaAttractionLocation) {
		model.setBonaAttractionLocation(bonaAttractionLocation);
	}

	/**
	 * Sets the bona attraction name of operator of this tourism bona attraction form first.
	 *
	 * @param bonaAttractionNameOfOperator the bona attraction name of operator of this tourism bona attraction form first
	 */
	@Override
	public void setBonaAttractionNameOfOperator(
		String bonaAttractionNameOfOperator) {

		model.setBonaAttractionNameOfOperator(bonaAttractionNameOfOperator);
	}

	/**
	 * Sets the bona attraction name of owner of this tourism bona attraction form first.
	 *
	 * @param bonaAttractionNameOfOwner the bona attraction name of owner of this tourism bona attraction form first
	 */
	@Override
	public void setBonaAttractionNameOfOwner(String bonaAttractionNameOfOwner) {
		model.setBonaAttractionNameOfOwner(bonaAttractionNameOfOwner);
	}

	/**
	 * Sets the bona attraction name of property of this tourism bona attraction form first.
	 *
	 * @param bonaAttractionNameOfProperty the bona attraction name of property of this tourism bona attraction form first
	 */
	@Override
	public void setBonaAttractionNameOfProperty(
		String bonaAttractionNameOfProperty) {

		model.setBonaAttractionNameOfProperty(bonaAttractionNameOfProperty);
	}

	/**
	 * Sets the bona attractionoperator trn no of this tourism bona attraction form first.
	 *
	 * @param bonaAttractionoperatorTrnNo the bona attractionoperator trn no of this tourism bona attraction form first
	 */
	@Override
	public void setBonaAttractionoperatorTrnNo(
		String bonaAttractionoperatorTrnNo) {

		model.setBonaAttractionoperatorTrnNo(bonaAttractionoperatorTrnNo);
	}

	/**
	 * Sets the bona attraction owner trn number of this tourism bona attraction form first.
	 *
	 * @param bonaAttractionOwnerTrnNumber the bona attraction owner trn number of this tourism bona attraction form first
	 */
	@Override
	public void setBonaAttractionOwnerTrnNumber(
		String bonaAttractionOwnerTrnNumber) {

		model.setBonaAttractionOwnerTrnNumber(bonaAttractionOwnerTrnNumber);
	}

	/**
	 * Sets the bona attraction tcc number of this tourism bona attraction form first.
	 *
	 * @param bonaAttractionTccNumber the bona attraction tcc number of this tourism bona attraction form first
	 */
	@Override
	public void setBonaAttractionTccNumber(String bonaAttractionTccNumber) {
		model.setBonaAttractionTccNumber(bonaAttractionTccNumber);
	}

	/**
	 * Sets the bona attract operator expiry date of this tourism bona attraction form first.
	 *
	 * @param bonaAttractOperatorExpiryDate the bona attract operator expiry date of this tourism bona attraction form first
	 */
	@Override
	public void setBonaAttractOperatorExpiryDate(
		Date bonaAttractOperatorExpiryDate) {

		model.setBonaAttractOperatorExpiryDate(bonaAttractOperatorExpiryDate);
	}

	/**
	 * Sets the bona attract other inc purpose of this tourism bona attraction form first.
	 *
	 * @param bonaAttractOtherIncPurpose the bona attract other inc purpose of this tourism bona attraction form first
	 */
	@Override
	public void setBonaAttractOtherIncPurpose(
		String bonaAttractOtherIncPurpose) {

		model.setBonaAttractOtherIncPurpose(bonaAttractOtherIncPurpose);
	}

	/**
	 * Sets the bona attract position held of this tourism bona attraction form first.
	 *
	 * @param bonaAttractPositionHeld the bona attract position held of this tourism bona attraction form first
	 */
	@Override
	public void setBonaAttractPositionHeld(String bonaAttractPositionHeld) {
		model.setBonaAttractPositionHeld(bonaAttractPositionHeld);
	}

	/**
	 * Sets the bona attract purpose of incentives of this tourism bona attraction form first.
	 *
	 * @param bonaAttractPurposeOfIncentives the bona attract purpose of incentives of this tourism bona attraction form first
	 */
	@Override
	public void setBonaAttractPurposeOfIncentives(
		String bonaAttractPurposeOfIncentives) {

		model.setBonaAttractPurposeOfIncentives(bonaAttractPurposeOfIncentives);
	}

	/**
	 * Sets the bonattraction operator tcc no of this tourism bona attraction form first.
	 *
	 * @param bonattractionOperatorTccNO the bonattraction operator tcc no of this tourism bona attraction form first
	 */
	@Override
	public void setBonattractionOperatorTccNO(
		String bonattractionOperatorTccNO) {

		model.setBonattractionOperatorTccNO(bonattractionOperatorTccNO);
	}

	/**
	 * Sets the bona type of attrcation of this tourism bona attraction form first.
	 *
	 * @param bonaTypeOfAttrcation the bona type of attrcation of this tourism bona attraction form first
	 */
	@Override
	public void setBonaTypeOfAttrcation(String bonaTypeOfAttrcation) {
		model.setBonaTypeOfAttrcation(bonaTypeOfAttrcation);
	}

	/**
	 * Sets the company ID of this tourism bona attraction form first.
	 *
	 * @param companyId the company ID of this tourism bona attraction form first
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism bona attraction form first.
	 *
	 * @param createDate the create date of this tourism bona attraction form first
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this tourism bona attraction form first.
	 *
	 * @param groupId the group ID of this tourism bona attraction form first
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism bona attraction form first.
	 *
	 * @param modifiedDate the modified date of this tourism bona attraction form first
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this tourism bona attraction form first.
	 *
	 * @param primaryKey the primary key of this tourism bona attraction form first
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tourism application ID of this tourism bona attraction form first.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism bona attraction form first
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism bona attract form first ID of this tourism bona attraction form first.
	 *
	 * @param tourismBonaAttractFormFirstId the tourism bona attract form first ID of this tourism bona attraction form first
	 */
	@Override
	public void setTourismBonaAttractFormFirstId(
		long tourismBonaAttractFormFirstId) {

		model.setTourismBonaAttractFormFirstId(tourismBonaAttractFormFirstId);
	}

	/**
	 * Sets the user ID of this tourism bona attraction form first.
	 *
	 * @param userId the user ID of this tourism bona attraction form first
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism bona attraction form first.
	 *
	 * @param userName the user name of this tourism bona attraction form first
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism bona attraction form first.
	 *
	 * @param userUuid the user uuid of this tourism bona attraction form first
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
	protected TourismBonaAttractionFormFirstWrapper wrap(
		TourismBonaAttractionFormFirst tourismBonaAttractionFormFirst) {

		return new TourismBonaAttractionFormFirstWrapper(
			tourismBonaAttractionFormFirst);
	}

}