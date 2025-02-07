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
 * This class is a wrapper for {@link TourismBonaWaterSportsFormFirst}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaWaterSportsFormFirst
 * @generated
 */
public class TourismBonaWaterSportsFormFirstWrapper
	extends BaseModelWrapper<TourismBonaWaterSportsFormFirst>
	implements ModelWrapper<TourismBonaWaterSportsFormFirst>,
			   TourismBonaWaterSportsFormFirst {

	public TourismBonaWaterSportsFormFirstWrapper(
		TourismBonaWaterSportsFormFirst tourismBonaWaterSportsFormFirst) {

		super(tourismBonaWaterSportsFormFirst);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"tourismBonaWaterSFFirstId", getTourismBonaWaterSFFirstId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("bonaWaterTypeOfAttract", getBonaWaterTypeOfAttract());
		attributes.put(
			"bonaWaterPurposeOfIncentives", getBonaWaterPurposeOfIncentives());
		attributes.put(
			"bonaWaterOtherIncPurpose", getBonaWaterOtherIncPurpose());
		attributes.put(
			"bonaNameOfWatersportsEntity", getBonaNameOfWatersportsEntity());
		attributes.put(
			"bonaWaterNameOfOwnerCompany", getBonaWaterNameOfOwnerCompany());
		attributes.put("bonaWaterLocation", getBonaWaterLocation());
		attributes.put("bonaWaterCompanyNo", getBonaWaterCompanyNo());
		attributes.put(
			"bonaWaterBusinessRegisNo", getBonaWaterBusinessRegisNo());
		attributes.put(
			"bonaWaterDateOfRegistration", getBonaWaterDateOfRegistration());
		attributes.put("bonaWaterOwnerTrnNo", getBonaWaterOwnerTrnNo());
		attributes.put("bonaWaterTccNo", getBonaWaterTccNo());
		attributes.put("bonaWaterExpiryDate", getBonaWaterExpiryDate());
		attributes.put("bonaWaterNameOfOperator", getBonaWaterNameOfOperator());
		attributes.put("bonaWaterOperatorTrnNo", getBonaWaterOperatorTrnNo());
		attributes.put("bonaWaterOperatorTccNo", getBonaWaterOperatorTccNo());
		attributes.put(
			"bonaWaterOperatorExpiryDate", getBonaWaterOperatorExpiryDate());
		attributes.put("bonaWaterContactPerson", getBonaWaterContactPerson());
		attributes.put("bonaWaterPositionHeld", getBonaWaterPositionHeld());
		attributes.put(
			"bonaWaterbriefdescription", getBonaWaterbriefdescription());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismBonaWaterSFFirstId = (Long)attributes.get(
			"tourismBonaWaterSFFirstId");

		if (tourismBonaWaterSFFirstId != null) {
			setTourismBonaWaterSFFirstId(tourismBonaWaterSFFirstId);
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

		String bonaWaterTypeOfAttract = (String)attributes.get(
			"bonaWaterTypeOfAttract");

		if (bonaWaterTypeOfAttract != null) {
			setBonaWaterTypeOfAttract(bonaWaterTypeOfAttract);
		}

		String bonaWaterPurposeOfIncentives = (String)attributes.get(
			"bonaWaterPurposeOfIncentives");

		if (bonaWaterPurposeOfIncentives != null) {
			setBonaWaterPurposeOfIncentives(bonaWaterPurposeOfIncentives);
		}

		String bonaWaterOtherIncPurpose = (String)attributes.get(
			"bonaWaterOtherIncPurpose");

		if (bonaWaterOtherIncPurpose != null) {
			setBonaWaterOtherIncPurpose(bonaWaterOtherIncPurpose);
		}

		String bonaNameOfWatersportsEntity = (String)attributes.get(
			"bonaNameOfWatersportsEntity");

		if (bonaNameOfWatersportsEntity != null) {
			setBonaNameOfWatersportsEntity(bonaNameOfWatersportsEntity);
		}

		String bonaWaterNameOfOwnerCompany = (String)attributes.get(
			"bonaWaterNameOfOwnerCompany");

		if (bonaWaterNameOfOwnerCompany != null) {
			setBonaWaterNameOfOwnerCompany(bonaWaterNameOfOwnerCompany);
		}

		String bonaWaterLocation = (String)attributes.get("bonaWaterLocation");

		if (bonaWaterLocation != null) {
			setBonaWaterLocation(bonaWaterLocation);
		}

		String bonaWaterCompanyNo = (String)attributes.get(
			"bonaWaterCompanyNo");

		if (bonaWaterCompanyNo != null) {
			setBonaWaterCompanyNo(bonaWaterCompanyNo);
		}

		String bonaWaterBusinessRegisNo = (String)attributes.get(
			"bonaWaterBusinessRegisNo");

		if (bonaWaterBusinessRegisNo != null) {
			setBonaWaterBusinessRegisNo(bonaWaterBusinessRegisNo);
		}

		Date bonaWaterDateOfRegistration = (Date)attributes.get(
			"bonaWaterDateOfRegistration");

		if (bonaWaterDateOfRegistration != null) {
			setBonaWaterDateOfRegistration(bonaWaterDateOfRegistration);
		}

		String bonaWaterOwnerTrnNo = (String)attributes.get(
			"bonaWaterOwnerTrnNo");

		if (bonaWaterOwnerTrnNo != null) {
			setBonaWaterOwnerTrnNo(bonaWaterOwnerTrnNo);
		}

		String bonaWaterTccNo = (String)attributes.get("bonaWaterTccNo");

		if (bonaWaterTccNo != null) {
			setBonaWaterTccNo(bonaWaterTccNo);
		}

		String bonaWaterExpiryDate = (String)attributes.get(
			"bonaWaterExpiryDate");

		if (bonaWaterExpiryDate != null) {
			setBonaWaterExpiryDate(bonaWaterExpiryDate);
		}

		String bonaWaterNameOfOperator = (String)attributes.get(
			"bonaWaterNameOfOperator");

		if (bonaWaterNameOfOperator != null) {
			setBonaWaterNameOfOperator(bonaWaterNameOfOperator);
		}

		String bonaWaterOperatorTrnNo = (String)attributes.get(
			"bonaWaterOperatorTrnNo");

		if (bonaWaterOperatorTrnNo != null) {
			setBonaWaterOperatorTrnNo(bonaWaterOperatorTrnNo);
		}

		String bonaWaterOperatorTccNo = (String)attributes.get(
			"bonaWaterOperatorTccNo");

		if (bonaWaterOperatorTccNo != null) {
			setBonaWaterOperatorTccNo(bonaWaterOperatorTccNo);
		}

		Date bonaWaterOperatorExpiryDate = (Date)attributes.get(
			"bonaWaterOperatorExpiryDate");

		if (bonaWaterOperatorExpiryDate != null) {
			setBonaWaterOperatorExpiryDate(bonaWaterOperatorExpiryDate);
		}

		String bonaWaterContactPerson = (String)attributes.get(
			"bonaWaterContactPerson");

		if (bonaWaterContactPerson != null) {
			setBonaWaterContactPerson(bonaWaterContactPerson);
		}

		String bonaWaterPositionHeld = (String)attributes.get(
			"bonaWaterPositionHeld");

		if (bonaWaterPositionHeld != null) {
			setBonaWaterPositionHeld(bonaWaterPositionHeld);
		}

		String bonaWaterbriefdescription = (String)attributes.get(
			"bonaWaterbriefdescription");

		if (bonaWaterbriefdescription != null) {
			setBonaWaterbriefdescription(bonaWaterbriefdescription);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}
	}

	@Override
	public TourismBonaWaterSportsFormFirst cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the bona name of watersports entity of this tourism bona water sports form first.
	 *
	 * @return the bona name of watersports entity of this tourism bona water sports form first
	 */
	@Override
	public String getBonaNameOfWatersportsEntity() {
		return model.getBonaNameOfWatersportsEntity();
	}

	/**
	 * Returns the bona waterbriefdescription of this tourism bona water sports form first.
	 *
	 * @return the bona waterbriefdescription of this tourism bona water sports form first
	 */
	@Override
	public String getBonaWaterbriefdescription() {
		return model.getBonaWaterbriefdescription();
	}

	/**
	 * Returns the bona water business regis no of this tourism bona water sports form first.
	 *
	 * @return the bona water business regis no of this tourism bona water sports form first
	 */
	@Override
	public String getBonaWaterBusinessRegisNo() {
		return model.getBonaWaterBusinessRegisNo();
	}

	/**
	 * Returns the bona water company no of this tourism bona water sports form first.
	 *
	 * @return the bona water company no of this tourism bona water sports form first
	 */
	@Override
	public String getBonaWaterCompanyNo() {
		return model.getBonaWaterCompanyNo();
	}

	/**
	 * Returns the bona water contact person of this tourism bona water sports form first.
	 *
	 * @return the bona water contact person of this tourism bona water sports form first
	 */
	@Override
	public String getBonaWaterContactPerson() {
		return model.getBonaWaterContactPerson();
	}

	/**
	 * Returns the bona water date of registration of this tourism bona water sports form first.
	 *
	 * @return the bona water date of registration of this tourism bona water sports form first
	 */
	@Override
	public Date getBonaWaterDateOfRegistration() {
		return model.getBonaWaterDateOfRegistration();
	}

	/**
	 * Returns the bona water expiry date of this tourism bona water sports form first.
	 *
	 * @return the bona water expiry date of this tourism bona water sports form first
	 */
	@Override
	public String getBonaWaterExpiryDate() {
		return model.getBonaWaterExpiryDate();
	}

	/**
	 * Returns the bona water location of this tourism bona water sports form first.
	 *
	 * @return the bona water location of this tourism bona water sports form first
	 */
	@Override
	public String getBonaWaterLocation() {
		return model.getBonaWaterLocation();
	}

	/**
	 * Returns the bona water name of operator of this tourism bona water sports form first.
	 *
	 * @return the bona water name of operator of this tourism bona water sports form first
	 */
	@Override
	public String getBonaWaterNameOfOperator() {
		return model.getBonaWaterNameOfOperator();
	}

	/**
	 * Returns the bona water name of owner company of this tourism bona water sports form first.
	 *
	 * @return the bona water name of owner company of this tourism bona water sports form first
	 */
	@Override
	public String getBonaWaterNameOfOwnerCompany() {
		return model.getBonaWaterNameOfOwnerCompany();
	}

	/**
	 * Returns the bona water operator expiry date of this tourism bona water sports form first.
	 *
	 * @return the bona water operator expiry date of this tourism bona water sports form first
	 */
	@Override
	public Date getBonaWaterOperatorExpiryDate() {
		return model.getBonaWaterOperatorExpiryDate();
	}

	/**
	 * Returns the bona water operator tcc no of this tourism bona water sports form first.
	 *
	 * @return the bona water operator tcc no of this tourism bona water sports form first
	 */
	@Override
	public String getBonaWaterOperatorTccNo() {
		return model.getBonaWaterOperatorTccNo();
	}

	/**
	 * Returns the bona water operator trn no of this tourism bona water sports form first.
	 *
	 * @return the bona water operator trn no of this tourism bona water sports form first
	 */
	@Override
	public String getBonaWaterOperatorTrnNo() {
		return model.getBonaWaterOperatorTrnNo();
	}

	/**
	 * Returns the bona water other inc purpose of this tourism bona water sports form first.
	 *
	 * @return the bona water other inc purpose of this tourism bona water sports form first
	 */
	@Override
	public String getBonaWaterOtherIncPurpose() {
		return model.getBonaWaterOtherIncPurpose();
	}

	/**
	 * Returns the bona water owner trn no of this tourism bona water sports form first.
	 *
	 * @return the bona water owner trn no of this tourism bona water sports form first
	 */
	@Override
	public String getBonaWaterOwnerTrnNo() {
		return model.getBonaWaterOwnerTrnNo();
	}

	/**
	 * Returns the bona water position held of this tourism bona water sports form first.
	 *
	 * @return the bona water position held of this tourism bona water sports form first
	 */
	@Override
	public String getBonaWaterPositionHeld() {
		return model.getBonaWaterPositionHeld();
	}

	/**
	 * Returns the bona water purpose of incentives of this tourism bona water sports form first.
	 *
	 * @return the bona water purpose of incentives of this tourism bona water sports form first
	 */
	@Override
	public String getBonaWaterPurposeOfIncentives() {
		return model.getBonaWaterPurposeOfIncentives();
	}

	/**
	 * Returns the bona water tcc no of this tourism bona water sports form first.
	 *
	 * @return the bona water tcc no of this tourism bona water sports form first
	 */
	@Override
	public String getBonaWaterTccNo() {
		return model.getBonaWaterTccNo();
	}

	/**
	 * Returns the bona water type of attract of this tourism bona water sports form first.
	 *
	 * @return the bona water type of attract of this tourism bona water sports form first
	 */
	@Override
	public String getBonaWaterTypeOfAttract() {
		return model.getBonaWaterTypeOfAttract();
	}

	/**
	 * Returns the company ID of this tourism bona water sports form first.
	 *
	 * @return the company ID of this tourism bona water sports form first
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism bona water sports form first.
	 *
	 * @return the create date of this tourism bona water sports form first
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this tourism bona water sports form first.
	 *
	 * @return the group ID of this tourism bona water sports form first
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism bona water sports form first.
	 *
	 * @return the modified date of this tourism bona water sports form first
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this tourism bona water sports form first.
	 *
	 * @return the primary key of this tourism bona water sports form first
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tourism application ID of this tourism bona water sports form first.
	 *
	 * @return the tourism application ID of this tourism bona water sports form first
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism bona water sf first ID of this tourism bona water sports form first.
	 *
	 * @return the tourism bona water sf first ID of this tourism bona water sports form first
	 */
	@Override
	public long getTourismBonaWaterSFFirstId() {
		return model.getTourismBonaWaterSFFirstId();
	}

	/**
	 * Returns the user ID of this tourism bona water sports form first.
	 *
	 * @return the user ID of this tourism bona water sports form first
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism bona water sports form first.
	 *
	 * @return the user name of this tourism bona water sports form first
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism bona water sports form first.
	 *
	 * @return the user uuid of this tourism bona water sports form first
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
	 * Sets the bona name of watersports entity of this tourism bona water sports form first.
	 *
	 * @param bonaNameOfWatersportsEntity the bona name of watersports entity of this tourism bona water sports form first
	 */
	@Override
	public void setBonaNameOfWatersportsEntity(
		String bonaNameOfWatersportsEntity) {

		model.setBonaNameOfWatersportsEntity(bonaNameOfWatersportsEntity);
	}

	/**
	 * Sets the bona waterbriefdescription of this tourism bona water sports form first.
	 *
	 * @param bonaWaterbriefdescription the bona waterbriefdescription of this tourism bona water sports form first
	 */
	@Override
	public void setBonaWaterbriefdescription(String bonaWaterbriefdescription) {
		model.setBonaWaterbriefdescription(bonaWaterbriefdescription);
	}

	/**
	 * Sets the bona water business regis no of this tourism bona water sports form first.
	 *
	 * @param bonaWaterBusinessRegisNo the bona water business regis no of this tourism bona water sports form first
	 */
	@Override
	public void setBonaWaterBusinessRegisNo(String bonaWaterBusinessRegisNo) {
		model.setBonaWaterBusinessRegisNo(bonaWaterBusinessRegisNo);
	}

	/**
	 * Sets the bona water company no of this tourism bona water sports form first.
	 *
	 * @param bonaWaterCompanyNo the bona water company no of this tourism bona water sports form first
	 */
	@Override
	public void setBonaWaterCompanyNo(String bonaWaterCompanyNo) {
		model.setBonaWaterCompanyNo(bonaWaterCompanyNo);
	}

	/**
	 * Sets the bona water contact person of this tourism bona water sports form first.
	 *
	 * @param bonaWaterContactPerson the bona water contact person of this tourism bona water sports form first
	 */
	@Override
	public void setBonaWaterContactPerson(String bonaWaterContactPerson) {
		model.setBonaWaterContactPerson(bonaWaterContactPerson);
	}

	/**
	 * Sets the bona water date of registration of this tourism bona water sports form first.
	 *
	 * @param bonaWaterDateOfRegistration the bona water date of registration of this tourism bona water sports form first
	 */
	@Override
	public void setBonaWaterDateOfRegistration(
		Date bonaWaterDateOfRegistration) {

		model.setBonaWaterDateOfRegistration(bonaWaterDateOfRegistration);
	}

	/**
	 * Sets the bona water expiry date of this tourism bona water sports form first.
	 *
	 * @param bonaWaterExpiryDate the bona water expiry date of this tourism bona water sports form first
	 */
	@Override
	public void setBonaWaterExpiryDate(String bonaWaterExpiryDate) {
		model.setBonaWaterExpiryDate(bonaWaterExpiryDate);
	}

	/**
	 * Sets the bona water location of this tourism bona water sports form first.
	 *
	 * @param bonaWaterLocation the bona water location of this tourism bona water sports form first
	 */
	@Override
	public void setBonaWaterLocation(String bonaWaterLocation) {
		model.setBonaWaterLocation(bonaWaterLocation);
	}

	/**
	 * Sets the bona water name of operator of this tourism bona water sports form first.
	 *
	 * @param bonaWaterNameOfOperator the bona water name of operator of this tourism bona water sports form first
	 */
	@Override
	public void setBonaWaterNameOfOperator(String bonaWaterNameOfOperator) {
		model.setBonaWaterNameOfOperator(bonaWaterNameOfOperator);
	}

	/**
	 * Sets the bona water name of owner company of this tourism bona water sports form first.
	 *
	 * @param bonaWaterNameOfOwnerCompany the bona water name of owner company of this tourism bona water sports form first
	 */
	@Override
	public void setBonaWaterNameOfOwnerCompany(
		String bonaWaterNameOfOwnerCompany) {

		model.setBonaWaterNameOfOwnerCompany(bonaWaterNameOfOwnerCompany);
	}

	/**
	 * Sets the bona water operator expiry date of this tourism bona water sports form first.
	 *
	 * @param bonaWaterOperatorExpiryDate the bona water operator expiry date of this tourism bona water sports form first
	 */
	@Override
	public void setBonaWaterOperatorExpiryDate(
		Date bonaWaterOperatorExpiryDate) {

		model.setBonaWaterOperatorExpiryDate(bonaWaterOperatorExpiryDate);
	}

	/**
	 * Sets the bona water operator tcc no of this tourism bona water sports form first.
	 *
	 * @param bonaWaterOperatorTccNo the bona water operator tcc no of this tourism bona water sports form first
	 */
	@Override
	public void setBonaWaterOperatorTccNo(String bonaWaterOperatorTccNo) {
		model.setBonaWaterOperatorTccNo(bonaWaterOperatorTccNo);
	}

	/**
	 * Sets the bona water operator trn no of this tourism bona water sports form first.
	 *
	 * @param bonaWaterOperatorTrnNo the bona water operator trn no of this tourism bona water sports form first
	 */
	@Override
	public void setBonaWaterOperatorTrnNo(String bonaWaterOperatorTrnNo) {
		model.setBonaWaterOperatorTrnNo(bonaWaterOperatorTrnNo);
	}

	/**
	 * Sets the bona water other inc purpose of this tourism bona water sports form first.
	 *
	 * @param bonaWaterOtherIncPurpose the bona water other inc purpose of this tourism bona water sports form first
	 */
	@Override
	public void setBonaWaterOtherIncPurpose(String bonaWaterOtherIncPurpose) {
		model.setBonaWaterOtherIncPurpose(bonaWaterOtherIncPurpose);
	}

	/**
	 * Sets the bona water owner trn no of this tourism bona water sports form first.
	 *
	 * @param bonaWaterOwnerTrnNo the bona water owner trn no of this tourism bona water sports form first
	 */
	@Override
	public void setBonaWaterOwnerTrnNo(String bonaWaterOwnerTrnNo) {
		model.setBonaWaterOwnerTrnNo(bonaWaterOwnerTrnNo);
	}

	/**
	 * Sets the bona water position held of this tourism bona water sports form first.
	 *
	 * @param bonaWaterPositionHeld the bona water position held of this tourism bona water sports form first
	 */
	@Override
	public void setBonaWaterPositionHeld(String bonaWaterPositionHeld) {
		model.setBonaWaterPositionHeld(bonaWaterPositionHeld);
	}

	/**
	 * Sets the bona water purpose of incentives of this tourism bona water sports form first.
	 *
	 * @param bonaWaterPurposeOfIncentives the bona water purpose of incentives of this tourism bona water sports form first
	 */
	@Override
	public void setBonaWaterPurposeOfIncentives(
		String bonaWaterPurposeOfIncentives) {

		model.setBonaWaterPurposeOfIncentives(bonaWaterPurposeOfIncentives);
	}

	/**
	 * Sets the bona water tcc no of this tourism bona water sports form first.
	 *
	 * @param bonaWaterTccNo the bona water tcc no of this tourism bona water sports form first
	 */
	@Override
	public void setBonaWaterTccNo(String bonaWaterTccNo) {
		model.setBonaWaterTccNo(bonaWaterTccNo);
	}

	/**
	 * Sets the bona water type of attract of this tourism bona water sports form first.
	 *
	 * @param bonaWaterTypeOfAttract the bona water type of attract of this tourism bona water sports form first
	 */
	@Override
	public void setBonaWaterTypeOfAttract(String bonaWaterTypeOfAttract) {
		model.setBonaWaterTypeOfAttract(bonaWaterTypeOfAttract);
	}

	/**
	 * Sets the company ID of this tourism bona water sports form first.
	 *
	 * @param companyId the company ID of this tourism bona water sports form first
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism bona water sports form first.
	 *
	 * @param createDate the create date of this tourism bona water sports form first
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this tourism bona water sports form first.
	 *
	 * @param groupId the group ID of this tourism bona water sports form first
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism bona water sports form first.
	 *
	 * @param modifiedDate the modified date of this tourism bona water sports form first
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this tourism bona water sports form first.
	 *
	 * @param primaryKey the primary key of this tourism bona water sports form first
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tourism application ID of this tourism bona water sports form first.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism bona water sports form first
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism bona water sf first ID of this tourism bona water sports form first.
	 *
	 * @param tourismBonaWaterSFFirstId the tourism bona water sf first ID of this tourism bona water sports form first
	 */
	@Override
	public void setTourismBonaWaterSFFirstId(long tourismBonaWaterSFFirstId) {
		model.setTourismBonaWaterSFFirstId(tourismBonaWaterSFFirstId);
	}

	/**
	 * Sets the user ID of this tourism bona water sports form first.
	 *
	 * @param userId the user ID of this tourism bona water sports form first
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism bona water sports form first.
	 *
	 * @param userName the user name of this tourism bona water sports form first
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism bona water sports form first.
	 *
	 * @param userUuid the user uuid of this tourism bona water sports form first
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
	protected TourismBonaWaterSportsFormFirstWrapper wrap(
		TourismBonaWaterSportsFormFirst tourismBonaWaterSportsFormFirst) {

		return new TourismBonaWaterSportsFormFirstWrapper(
			tourismBonaWaterSportsFormFirst);
	}

}