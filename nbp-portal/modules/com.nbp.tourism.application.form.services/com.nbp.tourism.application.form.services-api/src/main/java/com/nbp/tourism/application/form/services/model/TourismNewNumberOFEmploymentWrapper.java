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
 * This class is a wrapper for {@link TourismNewNumberOFEmployment}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewNumberOFEmployment
 * @generated
 */
public class TourismNewNumberOFEmploymentWrapper
	extends BaseModelWrapper<TourismNewNumberOFEmployment>
	implements ModelWrapper<TourismNewNumberOFEmployment>,
			   TourismNewNumberOFEmployment {

	public TourismNewNumberOFEmploymentWrapper(
		TourismNewNumberOFEmployment tourismNewNumberOFEmployment) {

		super(tourismNewNumberOFEmployment);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"tourismNewNumberOFEmploymentId",
			getTourismNewNumberOFEmploymentId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("permanentLocalMale", getPermanentLocalMale());
		attributes.put("permanentLocalFemale", getPermanentLocalFemale());
		attributes.put("permanentForeignMale", getPermanentForeignMale());
		attributes.put("permanentForeignFemale", getPermanentForeignFemale());
		attributes.put("temporaryLocalMale", getTemporaryLocalMale());
		attributes.put("temporaryLocalFemale", getTemporaryLocalFemale());
		attributes.put("temporaryForeignMale", getTemporaryForeignMale());
		attributes.put("temporaryForeignFemale", getTemporaryForeignFemale());
		attributes.put("totalLocalMale", getTotalLocalMale());
		attributes.put("totalLocalFemale", getTotalLocalFemale());
		attributes.put("totalForeignMale", getTotalForeignMale());
		attributes.put("totalForeignFemale", getTotalForeignFemale());
		attributes.put("salaryWages", getSalaryWages());
		attributes.put("estimatedExpenditure", getEstimatedExpenditure());
		attributes.put("otherExpenditure", getOtherExpenditure());
		attributes.put("perRoomInclusiveCost", getPerRoomInclusiveCost());
		attributes.put("perRoomExclusiveCost", getPerRoomExclusiveCost());
		attributes.put("staffPermanentLocalMale", getStaffPermanentLocalMale());
		attributes.put(
			"staffPermanentLocalFemale", getStaffPermanentLocalFemale());
		attributes.put(
			"staffPermanentForeignMale", getStaffPermanentForeignMale());
		attributes.put(
			"staffPermanentForeignFemale", getStaffPermanentForeignFemale());
		attributes.put("staffTemporaryLocalMale", getStaffTemporaryLocalMale());
		attributes.put(
			"staffTemporaryLocalFemale", getStaffTemporaryLocalFemale());
		attributes.put(
			"staffTemporaryForeignMale", getStaffTemporaryForeignMale());
		attributes.put(
			"staffTemporaryForeignFemale", getStaffTemporaryForeignFemale());
		attributes.put("staffTotalLocalMale", getStaffTotalLocalMale());
		attributes.put("staffTotalLocalFemale", getStaffTotalLocalFemale());
		attributes.put("staffTotalForeignMale", getStaffTotalForeignMale());
		attributes.put("staffTotalForeignFemale", getStaffTotalForeignFemale());
		attributes.put("salariesAndWages", getSalariesAndWages());
		attributes.put("expectedAnnualFunds", getExpectedAnnualFunds());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismNewNumberOFEmploymentId = (Long)attributes.get(
			"tourismNewNumberOFEmploymentId");

		if (tourismNewNumberOFEmploymentId != null) {
			setTourismNewNumberOFEmploymentId(tourismNewNumberOFEmploymentId);
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

		String permanentLocalMale = (String)attributes.get(
			"permanentLocalMale");

		if (permanentLocalMale != null) {
			setPermanentLocalMale(permanentLocalMale);
		}

		String permanentLocalFemale = (String)attributes.get(
			"permanentLocalFemale");

		if (permanentLocalFemale != null) {
			setPermanentLocalFemale(permanentLocalFemale);
		}

		String permanentForeignMale = (String)attributes.get(
			"permanentForeignMale");

		if (permanentForeignMale != null) {
			setPermanentForeignMale(permanentForeignMale);
		}

		String permanentForeignFemale = (String)attributes.get(
			"permanentForeignFemale");

		if (permanentForeignFemale != null) {
			setPermanentForeignFemale(permanentForeignFemale);
		}

		String temporaryLocalMale = (String)attributes.get(
			"temporaryLocalMale");

		if (temporaryLocalMale != null) {
			setTemporaryLocalMale(temporaryLocalMale);
		}

		String temporaryLocalFemale = (String)attributes.get(
			"temporaryLocalFemale");

		if (temporaryLocalFemale != null) {
			setTemporaryLocalFemale(temporaryLocalFemale);
		}

		String temporaryForeignMale = (String)attributes.get(
			"temporaryForeignMale");

		if (temporaryForeignMale != null) {
			setTemporaryForeignMale(temporaryForeignMale);
		}

		String temporaryForeignFemale = (String)attributes.get(
			"temporaryForeignFemale");

		if (temporaryForeignFemale != null) {
			setTemporaryForeignFemale(temporaryForeignFemale);
		}

		String totalLocalMale = (String)attributes.get("totalLocalMale");

		if (totalLocalMale != null) {
			setTotalLocalMale(totalLocalMale);
		}

		String totalLocalFemale = (String)attributes.get("totalLocalFemale");

		if (totalLocalFemale != null) {
			setTotalLocalFemale(totalLocalFemale);
		}

		String totalForeignMale = (String)attributes.get("totalForeignMale");

		if (totalForeignMale != null) {
			setTotalForeignMale(totalForeignMale);
		}

		String totalForeignFemale = (String)attributes.get(
			"totalForeignFemale");

		if (totalForeignFemale != null) {
			setTotalForeignFemale(totalForeignFemale);
		}

		String salaryWages = (String)attributes.get("salaryWages");

		if (salaryWages != null) {
			setSalaryWages(salaryWages);
		}

		String estimatedExpenditure = (String)attributes.get(
			"estimatedExpenditure");

		if (estimatedExpenditure != null) {
			setEstimatedExpenditure(estimatedExpenditure);
		}

		String otherExpenditure = (String)attributes.get("otherExpenditure");

		if (otherExpenditure != null) {
			setOtherExpenditure(otherExpenditure);
		}

		String perRoomInclusiveCost = (String)attributes.get(
			"perRoomInclusiveCost");

		if (perRoomInclusiveCost != null) {
			setPerRoomInclusiveCost(perRoomInclusiveCost);
		}

		String perRoomExclusiveCost = (String)attributes.get(
			"perRoomExclusiveCost");

		if (perRoomExclusiveCost != null) {
			setPerRoomExclusiveCost(perRoomExclusiveCost);
		}

		String staffPermanentLocalMale = (String)attributes.get(
			"staffPermanentLocalMale");

		if (staffPermanentLocalMale != null) {
			setStaffPermanentLocalMale(staffPermanentLocalMale);
		}

		String staffPermanentLocalFemale = (String)attributes.get(
			"staffPermanentLocalFemale");

		if (staffPermanentLocalFemale != null) {
			setStaffPermanentLocalFemale(staffPermanentLocalFemale);
		}

		String staffPermanentForeignMale = (String)attributes.get(
			"staffPermanentForeignMale");

		if (staffPermanentForeignMale != null) {
			setStaffPermanentForeignMale(staffPermanentForeignMale);
		}

		String staffPermanentForeignFemale = (String)attributes.get(
			"staffPermanentForeignFemale");

		if (staffPermanentForeignFemale != null) {
			setStaffPermanentForeignFemale(staffPermanentForeignFemale);
		}

		String staffTemporaryLocalMale = (String)attributes.get(
			"staffTemporaryLocalMale");

		if (staffTemporaryLocalMale != null) {
			setStaffTemporaryLocalMale(staffTemporaryLocalMale);
		}

		String staffTemporaryLocalFemale = (String)attributes.get(
			"staffTemporaryLocalFemale");

		if (staffTemporaryLocalFemale != null) {
			setStaffTemporaryLocalFemale(staffTemporaryLocalFemale);
		}

		String staffTemporaryForeignMale = (String)attributes.get(
			"staffTemporaryForeignMale");

		if (staffTemporaryForeignMale != null) {
			setStaffTemporaryForeignMale(staffTemporaryForeignMale);
		}

		String staffTemporaryForeignFemale = (String)attributes.get(
			"staffTemporaryForeignFemale");

		if (staffTemporaryForeignFemale != null) {
			setStaffTemporaryForeignFemale(staffTemporaryForeignFemale);
		}

		String staffTotalLocalMale = (String)attributes.get(
			"staffTotalLocalMale");

		if (staffTotalLocalMale != null) {
			setStaffTotalLocalMale(staffTotalLocalMale);
		}

		String staffTotalLocalFemale = (String)attributes.get(
			"staffTotalLocalFemale");

		if (staffTotalLocalFemale != null) {
			setStaffTotalLocalFemale(staffTotalLocalFemale);
		}

		String staffTotalForeignMale = (String)attributes.get(
			"staffTotalForeignMale");

		if (staffTotalForeignMale != null) {
			setStaffTotalForeignMale(staffTotalForeignMale);
		}

		String staffTotalForeignFemale = (String)attributes.get(
			"staffTotalForeignFemale");

		if (staffTotalForeignFemale != null) {
			setStaffTotalForeignFemale(staffTotalForeignFemale);
		}

		String salariesAndWages = (String)attributes.get("salariesAndWages");

		if (salariesAndWages != null) {
			setSalariesAndWages(salariesAndWages);
		}

		String expectedAnnualFunds = (String)attributes.get(
			"expectedAnnualFunds");

		if (expectedAnnualFunds != null) {
			setExpectedAnnualFunds(expectedAnnualFunds);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}
	}

	@Override
	public TourismNewNumberOFEmployment cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this tourism new number of employment.
	 *
	 * @return the company ID of this tourism new number of employment
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism new number of employment.
	 *
	 * @return the create date of this tourism new number of employment
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the estimated expenditure of this tourism new number of employment.
	 *
	 * @return the estimated expenditure of this tourism new number of employment
	 */
	@Override
	public String getEstimatedExpenditure() {
		return model.getEstimatedExpenditure();
	}

	/**
	 * Returns the expected annual funds of this tourism new number of employment.
	 *
	 * @return the expected annual funds of this tourism new number of employment
	 */
	@Override
	public String getExpectedAnnualFunds() {
		return model.getExpectedAnnualFunds();
	}

	/**
	 * Returns the group ID of this tourism new number of employment.
	 *
	 * @return the group ID of this tourism new number of employment
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism new number of employment.
	 *
	 * @return the modified date of this tourism new number of employment
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the other expenditure of this tourism new number of employment.
	 *
	 * @return the other expenditure of this tourism new number of employment
	 */
	@Override
	public String getOtherExpenditure() {
		return model.getOtherExpenditure();
	}

	/**
	 * Returns the permanent foreign female of this tourism new number of employment.
	 *
	 * @return the permanent foreign female of this tourism new number of employment
	 */
	@Override
	public String getPermanentForeignFemale() {
		return model.getPermanentForeignFemale();
	}

	/**
	 * Returns the permanent foreign male of this tourism new number of employment.
	 *
	 * @return the permanent foreign male of this tourism new number of employment
	 */
	@Override
	public String getPermanentForeignMale() {
		return model.getPermanentForeignMale();
	}

	/**
	 * Returns the permanent local female of this tourism new number of employment.
	 *
	 * @return the permanent local female of this tourism new number of employment
	 */
	@Override
	public String getPermanentLocalFemale() {
		return model.getPermanentLocalFemale();
	}

	/**
	 * Returns the permanent local male of this tourism new number of employment.
	 *
	 * @return the permanent local male of this tourism new number of employment
	 */
	@Override
	public String getPermanentLocalMale() {
		return model.getPermanentLocalMale();
	}

	/**
	 * Returns the per room exclusive cost of this tourism new number of employment.
	 *
	 * @return the per room exclusive cost of this tourism new number of employment
	 */
	@Override
	public String getPerRoomExclusiveCost() {
		return model.getPerRoomExclusiveCost();
	}

	/**
	 * Returns the per room inclusive cost of this tourism new number of employment.
	 *
	 * @return the per room inclusive cost of this tourism new number of employment
	 */
	@Override
	public String getPerRoomInclusiveCost() {
		return model.getPerRoomInclusiveCost();
	}

	/**
	 * Returns the primary key of this tourism new number of employment.
	 *
	 * @return the primary key of this tourism new number of employment
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the salaries and wages of this tourism new number of employment.
	 *
	 * @return the salaries and wages of this tourism new number of employment
	 */
	@Override
	public String getSalariesAndWages() {
		return model.getSalariesAndWages();
	}

	/**
	 * Returns the salary wages of this tourism new number of employment.
	 *
	 * @return the salary wages of this tourism new number of employment
	 */
	@Override
	public String getSalaryWages() {
		return model.getSalaryWages();
	}

	/**
	 * Returns the staff permanent foreign female of this tourism new number of employment.
	 *
	 * @return the staff permanent foreign female of this tourism new number of employment
	 */
	@Override
	public String getStaffPermanentForeignFemale() {
		return model.getStaffPermanentForeignFemale();
	}

	/**
	 * Returns the staff permanent foreign male of this tourism new number of employment.
	 *
	 * @return the staff permanent foreign male of this tourism new number of employment
	 */
	@Override
	public String getStaffPermanentForeignMale() {
		return model.getStaffPermanentForeignMale();
	}

	/**
	 * Returns the staff permanent local female of this tourism new number of employment.
	 *
	 * @return the staff permanent local female of this tourism new number of employment
	 */
	@Override
	public String getStaffPermanentLocalFemale() {
		return model.getStaffPermanentLocalFemale();
	}

	/**
	 * Returns the staff permanent local male of this tourism new number of employment.
	 *
	 * @return the staff permanent local male of this tourism new number of employment
	 */
	@Override
	public String getStaffPermanentLocalMale() {
		return model.getStaffPermanentLocalMale();
	}

	/**
	 * Returns the staff temporary foreign female of this tourism new number of employment.
	 *
	 * @return the staff temporary foreign female of this tourism new number of employment
	 */
	@Override
	public String getStaffTemporaryForeignFemale() {
		return model.getStaffTemporaryForeignFemale();
	}

	/**
	 * Returns the staff temporary foreign male of this tourism new number of employment.
	 *
	 * @return the staff temporary foreign male of this tourism new number of employment
	 */
	@Override
	public String getStaffTemporaryForeignMale() {
		return model.getStaffTemporaryForeignMale();
	}

	/**
	 * Returns the staff temporary local female of this tourism new number of employment.
	 *
	 * @return the staff temporary local female of this tourism new number of employment
	 */
	@Override
	public String getStaffTemporaryLocalFemale() {
		return model.getStaffTemporaryLocalFemale();
	}

	/**
	 * Returns the staff temporary local male of this tourism new number of employment.
	 *
	 * @return the staff temporary local male of this tourism new number of employment
	 */
	@Override
	public String getStaffTemporaryLocalMale() {
		return model.getStaffTemporaryLocalMale();
	}

	/**
	 * Returns the staff total foreign female of this tourism new number of employment.
	 *
	 * @return the staff total foreign female of this tourism new number of employment
	 */
	@Override
	public String getStaffTotalForeignFemale() {
		return model.getStaffTotalForeignFemale();
	}

	/**
	 * Returns the staff total foreign male of this tourism new number of employment.
	 *
	 * @return the staff total foreign male of this tourism new number of employment
	 */
	@Override
	public String getStaffTotalForeignMale() {
		return model.getStaffTotalForeignMale();
	}

	/**
	 * Returns the staff total local female of this tourism new number of employment.
	 *
	 * @return the staff total local female of this tourism new number of employment
	 */
	@Override
	public String getStaffTotalLocalFemale() {
		return model.getStaffTotalLocalFemale();
	}

	/**
	 * Returns the staff total local male of this tourism new number of employment.
	 *
	 * @return the staff total local male of this tourism new number of employment
	 */
	@Override
	public String getStaffTotalLocalMale() {
		return model.getStaffTotalLocalMale();
	}

	/**
	 * Returns the temporary foreign female of this tourism new number of employment.
	 *
	 * @return the temporary foreign female of this tourism new number of employment
	 */
	@Override
	public String getTemporaryForeignFemale() {
		return model.getTemporaryForeignFemale();
	}

	/**
	 * Returns the temporary foreign male of this tourism new number of employment.
	 *
	 * @return the temporary foreign male of this tourism new number of employment
	 */
	@Override
	public String getTemporaryForeignMale() {
		return model.getTemporaryForeignMale();
	}

	/**
	 * Returns the temporary local female of this tourism new number of employment.
	 *
	 * @return the temporary local female of this tourism new number of employment
	 */
	@Override
	public String getTemporaryLocalFemale() {
		return model.getTemporaryLocalFemale();
	}

	/**
	 * Returns the temporary local male of this tourism new number of employment.
	 *
	 * @return the temporary local male of this tourism new number of employment
	 */
	@Override
	public String getTemporaryLocalMale() {
		return model.getTemporaryLocalMale();
	}

	/**
	 * Returns the total foreign female of this tourism new number of employment.
	 *
	 * @return the total foreign female of this tourism new number of employment
	 */
	@Override
	public String getTotalForeignFemale() {
		return model.getTotalForeignFemale();
	}

	/**
	 * Returns the total foreign male of this tourism new number of employment.
	 *
	 * @return the total foreign male of this tourism new number of employment
	 */
	@Override
	public String getTotalForeignMale() {
		return model.getTotalForeignMale();
	}

	/**
	 * Returns the total local female of this tourism new number of employment.
	 *
	 * @return the total local female of this tourism new number of employment
	 */
	@Override
	public String getTotalLocalFemale() {
		return model.getTotalLocalFemale();
	}

	/**
	 * Returns the total local male of this tourism new number of employment.
	 *
	 * @return the total local male of this tourism new number of employment
	 */
	@Override
	public String getTotalLocalMale() {
		return model.getTotalLocalMale();
	}

	/**
	 * Returns the tourism application ID of this tourism new number of employment.
	 *
	 * @return the tourism application ID of this tourism new number of employment
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism new number of employment ID of this tourism new number of employment.
	 *
	 * @return the tourism new number of employment ID of this tourism new number of employment
	 */
	@Override
	public long getTourismNewNumberOFEmploymentId() {
		return model.getTourismNewNumberOFEmploymentId();
	}

	/**
	 * Returns the user ID of this tourism new number of employment.
	 *
	 * @return the user ID of this tourism new number of employment
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism new number of employment.
	 *
	 * @return the user name of this tourism new number of employment
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism new number of employment.
	 *
	 * @return the user uuid of this tourism new number of employment
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
	 * Sets the company ID of this tourism new number of employment.
	 *
	 * @param companyId the company ID of this tourism new number of employment
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism new number of employment.
	 *
	 * @param createDate the create date of this tourism new number of employment
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the estimated expenditure of this tourism new number of employment.
	 *
	 * @param estimatedExpenditure the estimated expenditure of this tourism new number of employment
	 */
	@Override
	public void setEstimatedExpenditure(String estimatedExpenditure) {
		model.setEstimatedExpenditure(estimatedExpenditure);
	}

	/**
	 * Sets the expected annual funds of this tourism new number of employment.
	 *
	 * @param expectedAnnualFunds the expected annual funds of this tourism new number of employment
	 */
	@Override
	public void setExpectedAnnualFunds(String expectedAnnualFunds) {
		model.setExpectedAnnualFunds(expectedAnnualFunds);
	}

	/**
	 * Sets the group ID of this tourism new number of employment.
	 *
	 * @param groupId the group ID of this tourism new number of employment
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism new number of employment.
	 *
	 * @param modifiedDate the modified date of this tourism new number of employment
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the other expenditure of this tourism new number of employment.
	 *
	 * @param otherExpenditure the other expenditure of this tourism new number of employment
	 */
	@Override
	public void setOtherExpenditure(String otherExpenditure) {
		model.setOtherExpenditure(otherExpenditure);
	}

	/**
	 * Sets the permanent foreign female of this tourism new number of employment.
	 *
	 * @param permanentForeignFemale the permanent foreign female of this tourism new number of employment
	 */
	@Override
	public void setPermanentForeignFemale(String permanentForeignFemale) {
		model.setPermanentForeignFemale(permanentForeignFemale);
	}

	/**
	 * Sets the permanent foreign male of this tourism new number of employment.
	 *
	 * @param permanentForeignMale the permanent foreign male of this tourism new number of employment
	 */
	@Override
	public void setPermanentForeignMale(String permanentForeignMale) {
		model.setPermanentForeignMale(permanentForeignMale);
	}

	/**
	 * Sets the permanent local female of this tourism new number of employment.
	 *
	 * @param permanentLocalFemale the permanent local female of this tourism new number of employment
	 */
	@Override
	public void setPermanentLocalFemale(String permanentLocalFemale) {
		model.setPermanentLocalFemale(permanentLocalFemale);
	}

	/**
	 * Sets the permanent local male of this tourism new number of employment.
	 *
	 * @param permanentLocalMale the permanent local male of this tourism new number of employment
	 */
	@Override
	public void setPermanentLocalMale(String permanentLocalMale) {
		model.setPermanentLocalMale(permanentLocalMale);
	}

	/**
	 * Sets the per room exclusive cost of this tourism new number of employment.
	 *
	 * @param perRoomExclusiveCost the per room exclusive cost of this tourism new number of employment
	 */
	@Override
	public void setPerRoomExclusiveCost(String perRoomExclusiveCost) {
		model.setPerRoomExclusiveCost(perRoomExclusiveCost);
	}

	/**
	 * Sets the per room inclusive cost of this tourism new number of employment.
	 *
	 * @param perRoomInclusiveCost the per room inclusive cost of this tourism new number of employment
	 */
	@Override
	public void setPerRoomInclusiveCost(String perRoomInclusiveCost) {
		model.setPerRoomInclusiveCost(perRoomInclusiveCost);
	}

	/**
	 * Sets the primary key of this tourism new number of employment.
	 *
	 * @param primaryKey the primary key of this tourism new number of employment
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the salaries and wages of this tourism new number of employment.
	 *
	 * @param salariesAndWages the salaries and wages of this tourism new number of employment
	 */
	@Override
	public void setSalariesAndWages(String salariesAndWages) {
		model.setSalariesAndWages(salariesAndWages);
	}

	/**
	 * Sets the salary wages of this tourism new number of employment.
	 *
	 * @param salaryWages the salary wages of this tourism new number of employment
	 */
	@Override
	public void setSalaryWages(String salaryWages) {
		model.setSalaryWages(salaryWages);
	}

	/**
	 * Sets the staff permanent foreign female of this tourism new number of employment.
	 *
	 * @param staffPermanentForeignFemale the staff permanent foreign female of this tourism new number of employment
	 */
	@Override
	public void setStaffPermanentForeignFemale(
		String staffPermanentForeignFemale) {

		model.setStaffPermanentForeignFemale(staffPermanentForeignFemale);
	}

	/**
	 * Sets the staff permanent foreign male of this tourism new number of employment.
	 *
	 * @param staffPermanentForeignMale the staff permanent foreign male of this tourism new number of employment
	 */
	@Override
	public void setStaffPermanentForeignMale(String staffPermanentForeignMale) {
		model.setStaffPermanentForeignMale(staffPermanentForeignMale);
	}

	/**
	 * Sets the staff permanent local female of this tourism new number of employment.
	 *
	 * @param staffPermanentLocalFemale the staff permanent local female of this tourism new number of employment
	 */
	@Override
	public void setStaffPermanentLocalFemale(String staffPermanentLocalFemale) {
		model.setStaffPermanentLocalFemale(staffPermanentLocalFemale);
	}

	/**
	 * Sets the staff permanent local male of this tourism new number of employment.
	 *
	 * @param staffPermanentLocalMale the staff permanent local male of this tourism new number of employment
	 */
	@Override
	public void setStaffPermanentLocalMale(String staffPermanentLocalMale) {
		model.setStaffPermanentLocalMale(staffPermanentLocalMale);
	}

	/**
	 * Sets the staff temporary foreign female of this tourism new number of employment.
	 *
	 * @param staffTemporaryForeignFemale the staff temporary foreign female of this tourism new number of employment
	 */
	@Override
	public void setStaffTemporaryForeignFemale(
		String staffTemporaryForeignFemale) {

		model.setStaffTemporaryForeignFemale(staffTemporaryForeignFemale);
	}

	/**
	 * Sets the staff temporary foreign male of this tourism new number of employment.
	 *
	 * @param staffTemporaryForeignMale the staff temporary foreign male of this tourism new number of employment
	 */
	@Override
	public void setStaffTemporaryForeignMale(String staffTemporaryForeignMale) {
		model.setStaffTemporaryForeignMale(staffTemporaryForeignMale);
	}

	/**
	 * Sets the staff temporary local female of this tourism new number of employment.
	 *
	 * @param staffTemporaryLocalFemale the staff temporary local female of this tourism new number of employment
	 */
	@Override
	public void setStaffTemporaryLocalFemale(String staffTemporaryLocalFemale) {
		model.setStaffTemporaryLocalFemale(staffTemporaryLocalFemale);
	}

	/**
	 * Sets the staff temporary local male of this tourism new number of employment.
	 *
	 * @param staffTemporaryLocalMale the staff temporary local male of this tourism new number of employment
	 */
	@Override
	public void setStaffTemporaryLocalMale(String staffTemporaryLocalMale) {
		model.setStaffTemporaryLocalMale(staffTemporaryLocalMale);
	}

	/**
	 * Sets the staff total foreign female of this tourism new number of employment.
	 *
	 * @param staffTotalForeignFemale the staff total foreign female of this tourism new number of employment
	 */
	@Override
	public void setStaffTotalForeignFemale(String staffTotalForeignFemale) {
		model.setStaffTotalForeignFemale(staffTotalForeignFemale);
	}

	/**
	 * Sets the staff total foreign male of this tourism new number of employment.
	 *
	 * @param staffTotalForeignMale the staff total foreign male of this tourism new number of employment
	 */
	@Override
	public void setStaffTotalForeignMale(String staffTotalForeignMale) {
		model.setStaffTotalForeignMale(staffTotalForeignMale);
	}

	/**
	 * Sets the staff total local female of this tourism new number of employment.
	 *
	 * @param staffTotalLocalFemale the staff total local female of this tourism new number of employment
	 */
	@Override
	public void setStaffTotalLocalFemale(String staffTotalLocalFemale) {
		model.setStaffTotalLocalFemale(staffTotalLocalFemale);
	}

	/**
	 * Sets the staff total local male of this tourism new number of employment.
	 *
	 * @param staffTotalLocalMale the staff total local male of this tourism new number of employment
	 */
	@Override
	public void setStaffTotalLocalMale(String staffTotalLocalMale) {
		model.setStaffTotalLocalMale(staffTotalLocalMale);
	}

	/**
	 * Sets the temporary foreign female of this tourism new number of employment.
	 *
	 * @param temporaryForeignFemale the temporary foreign female of this tourism new number of employment
	 */
	@Override
	public void setTemporaryForeignFemale(String temporaryForeignFemale) {
		model.setTemporaryForeignFemale(temporaryForeignFemale);
	}

	/**
	 * Sets the temporary foreign male of this tourism new number of employment.
	 *
	 * @param temporaryForeignMale the temporary foreign male of this tourism new number of employment
	 */
	@Override
	public void setTemporaryForeignMale(String temporaryForeignMale) {
		model.setTemporaryForeignMale(temporaryForeignMale);
	}

	/**
	 * Sets the temporary local female of this tourism new number of employment.
	 *
	 * @param temporaryLocalFemale the temporary local female of this tourism new number of employment
	 */
	@Override
	public void setTemporaryLocalFemale(String temporaryLocalFemale) {
		model.setTemporaryLocalFemale(temporaryLocalFemale);
	}

	/**
	 * Sets the temporary local male of this tourism new number of employment.
	 *
	 * @param temporaryLocalMale the temporary local male of this tourism new number of employment
	 */
	@Override
	public void setTemporaryLocalMale(String temporaryLocalMale) {
		model.setTemporaryLocalMale(temporaryLocalMale);
	}

	/**
	 * Sets the total foreign female of this tourism new number of employment.
	 *
	 * @param totalForeignFemale the total foreign female of this tourism new number of employment
	 */
	@Override
	public void setTotalForeignFemale(String totalForeignFemale) {
		model.setTotalForeignFemale(totalForeignFemale);
	}

	/**
	 * Sets the total foreign male of this tourism new number of employment.
	 *
	 * @param totalForeignMale the total foreign male of this tourism new number of employment
	 */
	@Override
	public void setTotalForeignMale(String totalForeignMale) {
		model.setTotalForeignMale(totalForeignMale);
	}

	/**
	 * Sets the total local female of this tourism new number of employment.
	 *
	 * @param totalLocalFemale the total local female of this tourism new number of employment
	 */
	@Override
	public void setTotalLocalFemale(String totalLocalFemale) {
		model.setTotalLocalFemale(totalLocalFemale);
	}

	/**
	 * Sets the total local male of this tourism new number of employment.
	 *
	 * @param totalLocalMale the total local male of this tourism new number of employment
	 */
	@Override
	public void setTotalLocalMale(String totalLocalMale) {
		model.setTotalLocalMale(totalLocalMale);
	}

	/**
	 * Sets the tourism application ID of this tourism new number of employment.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism new number of employment
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism new number of employment ID of this tourism new number of employment.
	 *
	 * @param tourismNewNumberOFEmploymentId the tourism new number of employment ID of this tourism new number of employment
	 */
	@Override
	public void setTourismNewNumberOFEmploymentId(
		long tourismNewNumberOFEmploymentId) {

		model.setTourismNewNumberOFEmploymentId(tourismNewNumberOFEmploymentId);
	}

	/**
	 * Sets the user ID of this tourism new number of employment.
	 *
	 * @param userId the user ID of this tourism new number of employment
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism new number of employment.
	 *
	 * @param userName the user name of this tourism new number of employment
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism new number of employment.
	 *
	 * @param userUuid the user uuid of this tourism new number of employment
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
	protected TourismNewNumberOFEmploymentWrapper wrap(
		TourismNewNumberOFEmployment tourismNewNumberOFEmployment) {

		return new TourismNewNumberOFEmploymentWrapper(
			tourismNewNumberOFEmployment);
	}

}