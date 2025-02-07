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
 * This class is a wrapper for {@link TourismBonaAccoAssesment}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccoAssesment
 * @generated
 */
public class TourismBonaAccoAssesmentWrapper
	extends BaseModelWrapper<TourismBonaAccoAssesment>
	implements ModelWrapper<TourismBonaAccoAssesment>,
			   TourismBonaAccoAssesment {

	public TourismBonaAccoAssesmentWrapper(
		TourismBonaAccoAssesment tourismBonaAccoAssesment) {

		super(tourismBonaAccoAssesment);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"tourismBonaAccoAssesmentId", getTourismBonaAccoAssesmentId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("countryOrigin", getCountryOrigin());
		attributes.put("jointVenture", getJointVenture());
		attributes.put("localPer", getLocalPer());
		attributes.put("foreignPer", getForeignPer());
		attributes.put("capitalInvest", getCapitalInvest());
		attributes.put("sourceAttach", getSourceAttach());
		attributes.put("shareCapital", getShareCapital());
		attributes.put("loanCapital", getLoanCapital());
		attributes.put("other", getOther());
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
		attributes.put("staffPermanentLocalMale", getStaffPermanentLocalMale());
		attributes.put(
			"staffPermanentLocalFemale", getStaffPermanentLocalFemale());
		attributes.put("staffForeignLocalMale", getStaffForeignLocalMale());
		attributes.put("staffForeignLocalFemale", getStaffForeignLocalFemale());
		attributes.put("staffTemporaryLocalMale", getStaffTemporaryLocalMale());
		attributes.put(
			"staffTemporaryLocalFemale", getStaffTemporaryLocalFemale());
		attributes.put(
			"staffTemporaryForeignMale", getStaffTemporaryForeignMale());
		attributes.put(
			"staffTemporaryForeignFemale", getStaffTemporaryForeignFemale());
		attributes.put("staffTotalForeignMale", getStaffTotalForeignMale());
		attributes.put("staffTotalForeignFemale", getStaffTotalForeignFemale());
		attributes.put("staffTotalLocalMale", getStaffTotalLocalMale());
		attributes.put("staffTotalLocalFemale", getStaffTotalLocalFemale());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismBonaAccoAssesmentId = (Long)attributes.get(
			"tourismBonaAccoAssesmentId");

		if (tourismBonaAccoAssesmentId != null) {
			setTourismBonaAccoAssesmentId(tourismBonaAccoAssesmentId);
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

		String countryOrigin = (String)attributes.get("countryOrigin");

		if (countryOrigin != null) {
			setCountryOrigin(countryOrigin);
		}

		String jointVenture = (String)attributes.get("jointVenture");

		if (jointVenture != null) {
			setJointVenture(jointVenture);
		}

		String localPer = (String)attributes.get("localPer");

		if (localPer != null) {
			setLocalPer(localPer);
		}

		String foreignPer = (String)attributes.get("foreignPer");

		if (foreignPer != null) {
			setForeignPer(foreignPer);
		}

		String capitalInvest = (String)attributes.get("capitalInvest");

		if (capitalInvest != null) {
			setCapitalInvest(capitalInvest);
		}

		String sourceAttach = (String)attributes.get("sourceAttach");

		if (sourceAttach != null) {
			setSourceAttach(sourceAttach);
		}

		String shareCapital = (String)attributes.get("shareCapital");

		if (shareCapital != null) {
			setShareCapital(shareCapital);
		}

		String loanCapital = (String)attributes.get("loanCapital");

		if (loanCapital != null) {
			setLoanCapital(loanCapital);
		}

		String other = (String)attributes.get("other");

		if (other != null) {
			setOther(other);
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

		String staffForeignLocalMale = (String)attributes.get(
			"staffForeignLocalMale");

		if (staffForeignLocalMale != null) {
			setStaffForeignLocalMale(staffForeignLocalMale);
		}

		String staffForeignLocalFemale = (String)attributes.get(
			"staffForeignLocalFemale");

		if (staffForeignLocalFemale != null) {
			setStaffForeignLocalFemale(staffForeignLocalFemale);
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

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}
	}

	@Override
	public TourismBonaAccoAssesment cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the capital invest of this tourism bona acco assesment.
	 *
	 * @return the capital invest of this tourism bona acco assesment
	 */
	@Override
	public String getCapitalInvest() {
		return model.getCapitalInvest();
	}

	/**
	 * Returns the company ID of this tourism bona acco assesment.
	 *
	 * @return the company ID of this tourism bona acco assesment
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the country origin of this tourism bona acco assesment.
	 *
	 * @return the country origin of this tourism bona acco assesment
	 */
	@Override
	public String getCountryOrigin() {
		return model.getCountryOrigin();
	}

	/**
	 * Returns the create date of this tourism bona acco assesment.
	 *
	 * @return the create date of this tourism bona acco assesment
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the estimated expenditure of this tourism bona acco assesment.
	 *
	 * @return the estimated expenditure of this tourism bona acco assesment
	 */
	@Override
	public String getEstimatedExpenditure() {
		return model.getEstimatedExpenditure();
	}

	/**
	 * Returns the foreign per of this tourism bona acco assesment.
	 *
	 * @return the foreign per of this tourism bona acco assesment
	 */
	@Override
	public String getForeignPer() {
		return model.getForeignPer();
	}

	/**
	 * Returns the group ID of this tourism bona acco assesment.
	 *
	 * @return the group ID of this tourism bona acco assesment
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the joint venture of this tourism bona acco assesment.
	 *
	 * @return the joint venture of this tourism bona acco assesment
	 */
	@Override
	public String getJointVenture() {
		return model.getJointVenture();
	}

	/**
	 * Returns the loan capital of this tourism bona acco assesment.
	 *
	 * @return the loan capital of this tourism bona acco assesment
	 */
	@Override
	public String getLoanCapital() {
		return model.getLoanCapital();
	}

	/**
	 * Returns the local per of this tourism bona acco assesment.
	 *
	 * @return the local per of this tourism bona acco assesment
	 */
	@Override
	public String getLocalPer() {
		return model.getLocalPer();
	}

	/**
	 * Returns the modified date of this tourism bona acco assesment.
	 *
	 * @return the modified date of this tourism bona acco assesment
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the other of this tourism bona acco assesment.
	 *
	 * @return the other of this tourism bona acco assesment
	 */
	@Override
	public String getOther() {
		return model.getOther();
	}

	/**
	 * Returns the other expenditure of this tourism bona acco assesment.
	 *
	 * @return the other expenditure of this tourism bona acco assesment
	 */
	@Override
	public String getOtherExpenditure() {
		return model.getOtherExpenditure();
	}

	/**
	 * Returns the permanent foreign female of this tourism bona acco assesment.
	 *
	 * @return the permanent foreign female of this tourism bona acco assesment
	 */
	@Override
	public String getPermanentForeignFemale() {
		return model.getPermanentForeignFemale();
	}

	/**
	 * Returns the permanent foreign male of this tourism bona acco assesment.
	 *
	 * @return the permanent foreign male of this tourism bona acco assesment
	 */
	@Override
	public String getPermanentForeignMale() {
		return model.getPermanentForeignMale();
	}

	/**
	 * Returns the permanent local female of this tourism bona acco assesment.
	 *
	 * @return the permanent local female of this tourism bona acco assesment
	 */
	@Override
	public String getPermanentLocalFemale() {
		return model.getPermanentLocalFemale();
	}

	/**
	 * Returns the permanent local male of this tourism bona acco assesment.
	 *
	 * @return the permanent local male of this tourism bona acco assesment
	 */
	@Override
	public String getPermanentLocalMale() {
		return model.getPermanentLocalMale();
	}

	/**
	 * Returns the primary key of this tourism bona acco assesment.
	 *
	 * @return the primary key of this tourism bona acco assesment
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the salary wages of this tourism bona acco assesment.
	 *
	 * @return the salary wages of this tourism bona acco assesment
	 */
	@Override
	public String getSalaryWages() {
		return model.getSalaryWages();
	}

	/**
	 * Returns the share capital of this tourism bona acco assesment.
	 *
	 * @return the share capital of this tourism bona acco assesment
	 */
	@Override
	public String getShareCapital() {
		return model.getShareCapital();
	}

	/**
	 * Returns the source attach of this tourism bona acco assesment.
	 *
	 * @return the source attach of this tourism bona acco assesment
	 */
	@Override
	public String getSourceAttach() {
		return model.getSourceAttach();
	}

	/**
	 * Returns the staff foreign local female of this tourism bona acco assesment.
	 *
	 * @return the staff foreign local female of this tourism bona acco assesment
	 */
	@Override
	public String getStaffForeignLocalFemale() {
		return model.getStaffForeignLocalFemale();
	}

	/**
	 * Returns the staff foreign local male of this tourism bona acco assesment.
	 *
	 * @return the staff foreign local male of this tourism bona acco assesment
	 */
	@Override
	public String getStaffForeignLocalMale() {
		return model.getStaffForeignLocalMale();
	}

	/**
	 * Returns the staff permanent local female of this tourism bona acco assesment.
	 *
	 * @return the staff permanent local female of this tourism bona acco assesment
	 */
	@Override
	public String getStaffPermanentLocalFemale() {
		return model.getStaffPermanentLocalFemale();
	}

	/**
	 * Returns the staff permanent local male of this tourism bona acco assesment.
	 *
	 * @return the staff permanent local male of this tourism bona acco assesment
	 */
	@Override
	public String getStaffPermanentLocalMale() {
		return model.getStaffPermanentLocalMale();
	}

	/**
	 * Returns the staff temporary foreign female of this tourism bona acco assesment.
	 *
	 * @return the staff temporary foreign female of this tourism bona acco assesment
	 */
	@Override
	public String getStaffTemporaryForeignFemale() {
		return model.getStaffTemporaryForeignFemale();
	}

	/**
	 * Returns the staff temporary foreign male of this tourism bona acco assesment.
	 *
	 * @return the staff temporary foreign male of this tourism bona acco assesment
	 */
	@Override
	public String getStaffTemporaryForeignMale() {
		return model.getStaffTemporaryForeignMale();
	}

	/**
	 * Returns the staff temporary local female of this tourism bona acco assesment.
	 *
	 * @return the staff temporary local female of this tourism bona acco assesment
	 */
	@Override
	public String getStaffTemporaryLocalFemale() {
		return model.getStaffTemporaryLocalFemale();
	}

	/**
	 * Returns the staff temporary local male of this tourism bona acco assesment.
	 *
	 * @return the staff temporary local male of this tourism bona acco assesment
	 */
	@Override
	public String getStaffTemporaryLocalMale() {
		return model.getStaffTemporaryLocalMale();
	}

	/**
	 * Returns the staff total foreign female of this tourism bona acco assesment.
	 *
	 * @return the staff total foreign female of this tourism bona acco assesment
	 */
	@Override
	public String getStaffTotalForeignFemale() {
		return model.getStaffTotalForeignFemale();
	}

	/**
	 * Returns the staff total foreign male of this tourism bona acco assesment.
	 *
	 * @return the staff total foreign male of this tourism bona acco assesment
	 */
	@Override
	public String getStaffTotalForeignMale() {
		return model.getStaffTotalForeignMale();
	}

	/**
	 * Returns the staff total local female of this tourism bona acco assesment.
	 *
	 * @return the staff total local female of this tourism bona acco assesment
	 */
	@Override
	public String getStaffTotalLocalFemale() {
		return model.getStaffTotalLocalFemale();
	}

	/**
	 * Returns the staff total local male of this tourism bona acco assesment.
	 *
	 * @return the staff total local male of this tourism bona acco assesment
	 */
	@Override
	public String getStaffTotalLocalMale() {
		return model.getStaffTotalLocalMale();
	}

	/**
	 * Returns the temporary foreign female of this tourism bona acco assesment.
	 *
	 * @return the temporary foreign female of this tourism bona acco assesment
	 */
	@Override
	public String getTemporaryForeignFemale() {
		return model.getTemporaryForeignFemale();
	}

	/**
	 * Returns the temporary foreign male of this tourism bona acco assesment.
	 *
	 * @return the temporary foreign male of this tourism bona acco assesment
	 */
	@Override
	public String getTemporaryForeignMale() {
		return model.getTemporaryForeignMale();
	}

	/**
	 * Returns the temporary local female of this tourism bona acco assesment.
	 *
	 * @return the temporary local female of this tourism bona acco assesment
	 */
	@Override
	public String getTemporaryLocalFemale() {
		return model.getTemporaryLocalFemale();
	}

	/**
	 * Returns the temporary local male of this tourism bona acco assesment.
	 *
	 * @return the temporary local male of this tourism bona acco assesment
	 */
	@Override
	public String getTemporaryLocalMale() {
		return model.getTemporaryLocalMale();
	}

	/**
	 * Returns the total foreign female of this tourism bona acco assesment.
	 *
	 * @return the total foreign female of this tourism bona acco assesment
	 */
	@Override
	public String getTotalForeignFemale() {
		return model.getTotalForeignFemale();
	}

	/**
	 * Returns the total foreign male of this tourism bona acco assesment.
	 *
	 * @return the total foreign male of this tourism bona acco assesment
	 */
	@Override
	public String getTotalForeignMale() {
		return model.getTotalForeignMale();
	}

	/**
	 * Returns the total local female of this tourism bona acco assesment.
	 *
	 * @return the total local female of this tourism bona acco assesment
	 */
	@Override
	public String getTotalLocalFemale() {
		return model.getTotalLocalFemale();
	}

	/**
	 * Returns the total local male of this tourism bona acco assesment.
	 *
	 * @return the total local male of this tourism bona acco assesment
	 */
	@Override
	public String getTotalLocalMale() {
		return model.getTotalLocalMale();
	}

	/**
	 * Returns the tourism application ID of this tourism bona acco assesment.
	 *
	 * @return the tourism application ID of this tourism bona acco assesment
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism bona acco assesment ID of this tourism bona acco assesment.
	 *
	 * @return the tourism bona acco assesment ID of this tourism bona acco assesment
	 */
	@Override
	public long getTourismBonaAccoAssesmentId() {
		return model.getTourismBonaAccoAssesmentId();
	}

	/**
	 * Returns the user ID of this tourism bona acco assesment.
	 *
	 * @return the user ID of this tourism bona acco assesment
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism bona acco assesment.
	 *
	 * @return the user name of this tourism bona acco assesment
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism bona acco assesment.
	 *
	 * @return the user uuid of this tourism bona acco assesment
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
	 * Sets the capital invest of this tourism bona acco assesment.
	 *
	 * @param capitalInvest the capital invest of this tourism bona acco assesment
	 */
	@Override
	public void setCapitalInvest(String capitalInvest) {
		model.setCapitalInvest(capitalInvest);
	}

	/**
	 * Sets the company ID of this tourism bona acco assesment.
	 *
	 * @param companyId the company ID of this tourism bona acco assesment
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the country origin of this tourism bona acco assesment.
	 *
	 * @param countryOrigin the country origin of this tourism bona acco assesment
	 */
	@Override
	public void setCountryOrigin(String countryOrigin) {
		model.setCountryOrigin(countryOrigin);
	}

	/**
	 * Sets the create date of this tourism bona acco assesment.
	 *
	 * @param createDate the create date of this tourism bona acco assesment
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the estimated expenditure of this tourism bona acco assesment.
	 *
	 * @param estimatedExpenditure the estimated expenditure of this tourism bona acco assesment
	 */
	@Override
	public void setEstimatedExpenditure(String estimatedExpenditure) {
		model.setEstimatedExpenditure(estimatedExpenditure);
	}

	/**
	 * Sets the foreign per of this tourism bona acco assesment.
	 *
	 * @param foreignPer the foreign per of this tourism bona acco assesment
	 */
	@Override
	public void setForeignPer(String foreignPer) {
		model.setForeignPer(foreignPer);
	}

	/**
	 * Sets the group ID of this tourism bona acco assesment.
	 *
	 * @param groupId the group ID of this tourism bona acco assesment
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the joint venture of this tourism bona acco assesment.
	 *
	 * @param jointVenture the joint venture of this tourism bona acco assesment
	 */
	@Override
	public void setJointVenture(String jointVenture) {
		model.setJointVenture(jointVenture);
	}

	/**
	 * Sets the loan capital of this tourism bona acco assesment.
	 *
	 * @param loanCapital the loan capital of this tourism bona acco assesment
	 */
	@Override
	public void setLoanCapital(String loanCapital) {
		model.setLoanCapital(loanCapital);
	}

	/**
	 * Sets the local per of this tourism bona acco assesment.
	 *
	 * @param localPer the local per of this tourism bona acco assesment
	 */
	@Override
	public void setLocalPer(String localPer) {
		model.setLocalPer(localPer);
	}

	/**
	 * Sets the modified date of this tourism bona acco assesment.
	 *
	 * @param modifiedDate the modified date of this tourism bona acco assesment
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the other of this tourism bona acco assesment.
	 *
	 * @param other the other of this tourism bona acco assesment
	 */
	@Override
	public void setOther(String other) {
		model.setOther(other);
	}

	/**
	 * Sets the other expenditure of this tourism bona acco assesment.
	 *
	 * @param otherExpenditure the other expenditure of this tourism bona acco assesment
	 */
	@Override
	public void setOtherExpenditure(String otherExpenditure) {
		model.setOtherExpenditure(otherExpenditure);
	}

	/**
	 * Sets the permanent foreign female of this tourism bona acco assesment.
	 *
	 * @param permanentForeignFemale the permanent foreign female of this tourism bona acco assesment
	 */
	@Override
	public void setPermanentForeignFemale(String permanentForeignFemale) {
		model.setPermanentForeignFemale(permanentForeignFemale);
	}

	/**
	 * Sets the permanent foreign male of this tourism bona acco assesment.
	 *
	 * @param permanentForeignMale the permanent foreign male of this tourism bona acco assesment
	 */
	@Override
	public void setPermanentForeignMale(String permanentForeignMale) {
		model.setPermanentForeignMale(permanentForeignMale);
	}

	/**
	 * Sets the permanent local female of this tourism bona acco assesment.
	 *
	 * @param permanentLocalFemale the permanent local female of this tourism bona acco assesment
	 */
	@Override
	public void setPermanentLocalFemale(String permanentLocalFemale) {
		model.setPermanentLocalFemale(permanentLocalFemale);
	}

	/**
	 * Sets the permanent local male of this tourism bona acco assesment.
	 *
	 * @param permanentLocalMale the permanent local male of this tourism bona acco assesment
	 */
	@Override
	public void setPermanentLocalMale(String permanentLocalMale) {
		model.setPermanentLocalMale(permanentLocalMale);
	}

	/**
	 * Sets the primary key of this tourism bona acco assesment.
	 *
	 * @param primaryKey the primary key of this tourism bona acco assesment
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the salary wages of this tourism bona acco assesment.
	 *
	 * @param salaryWages the salary wages of this tourism bona acco assesment
	 */
	@Override
	public void setSalaryWages(String salaryWages) {
		model.setSalaryWages(salaryWages);
	}

	/**
	 * Sets the share capital of this tourism bona acco assesment.
	 *
	 * @param shareCapital the share capital of this tourism bona acco assesment
	 */
	@Override
	public void setShareCapital(String shareCapital) {
		model.setShareCapital(shareCapital);
	}

	/**
	 * Sets the source attach of this tourism bona acco assesment.
	 *
	 * @param sourceAttach the source attach of this tourism bona acco assesment
	 */
	@Override
	public void setSourceAttach(String sourceAttach) {
		model.setSourceAttach(sourceAttach);
	}

	/**
	 * Sets the staff foreign local female of this tourism bona acco assesment.
	 *
	 * @param staffForeignLocalFemale the staff foreign local female of this tourism bona acco assesment
	 */
	@Override
	public void setStaffForeignLocalFemale(String staffForeignLocalFemale) {
		model.setStaffForeignLocalFemale(staffForeignLocalFemale);
	}

	/**
	 * Sets the staff foreign local male of this tourism bona acco assesment.
	 *
	 * @param staffForeignLocalMale the staff foreign local male of this tourism bona acco assesment
	 */
	@Override
	public void setStaffForeignLocalMale(String staffForeignLocalMale) {
		model.setStaffForeignLocalMale(staffForeignLocalMale);
	}

	/**
	 * Sets the staff permanent local female of this tourism bona acco assesment.
	 *
	 * @param staffPermanentLocalFemale the staff permanent local female of this tourism bona acco assesment
	 */
	@Override
	public void setStaffPermanentLocalFemale(String staffPermanentLocalFemale) {
		model.setStaffPermanentLocalFemale(staffPermanentLocalFemale);
	}

	/**
	 * Sets the staff permanent local male of this tourism bona acco assesment.
	 *
	 * @param staffPermanentLocalMale the staff permanent local male of this tourism bona acco assesment
	 */
	@Override
	public void setStaffPermanentLocalMale(String staffPermanentLocalMale) {
		model.setStaffPermanentLocalMale(staffPermanentLocalMale);
	}

	/**
	 * Sets the staff temporary foreign female of this tourism bona acco assesment.
	 *
	 * @param staffTemporaryForeignFemale the staff temporary foreign female of this tourism bona acco assesment
	 */
	@Override
	public void setStaffTemporaryForeignFemale(
		String staffTemporaryForeignFemale) {

		model.setStaffTemporaryForeignFemale(staffTemporaryForeignFemale);
	}

	/**
	 * Sets the staff temporary foreign male of this tourism bona acco assesment.
	 *
	 * @param staffTemporaryForeignMale the staff temporary foreign male of this tourism bona acco assesment
	 */
	@Override
	public void setStaffTemporaryForeignMale(String staffTemporaryForeignMale) {
		model.setStaffTemporaryForeignMale(staffTemporaryForeignMale);
	}

	/**
	 * Sets the staff temporary local female of this tourism bona acco assesment.
	 *
	 * @param staffTemporaryLocalFemale the staff temporary local female of this tourism bona acco assesment
	 */
	@Override
	public void setStaffTemporaryLocalFemale(String staffTemporaryLocalFemale) {
		model.setStaffTemporaryLocalFemale(staffTemporaryLocalFemale);
	}

	/**
	 * Sets the staff temporary local male of this tourism bona acco assesment.
	 *
	 * @param staffTemporaryLocalMale the staff temporary local male of this tourism bona acco assesment
	 */
	@Override
	public void setStaffTemporaryLocalMale(String staffTemporaryLocalMale) {
		model.setStaffTemporaryLocalMale(staffTemporaryLocalMale);
	}

	/**
	 * Sets the staff total foreign female of this tourism bona acco assesment.
	 *
	 * @param staffTotalForeignFemale the staff total foreign female of this tourism bona acco assesment
	 */
	@Override
	public void setStaffTotalForeignFemale(String staffTotalForeignFemale) {
		model.setStaffTotalForeignFemale(staffTotalForeignFemale);
	}

	/**
	 * Sets the staff total foreign male of this tourism bona acco assesment.
	 *
	 * @param staffTotalForeignMale the staff total foreign male of this tourism bona acco assesment
	 */
	@Override
	public void setStaffTotalForeignMale(String staffTotalForeignMale) {
		model.setStaffTotalForeignMale(staffTotalForeignMale);
	}

	/**
	 * Sets the staff total local female of this tourism bona acco assesment.
	 *
	 * @param staffTotalLocalFemale the staff total local female of this tourism bona acco assesment
	 */
	@Override
	public void setStaffTotalLocalFemale(String staffTotalLocalFemale) {
		model.setStaffTotalLocalFemale(staffTotalLocalFemale);
	}

	/**
	 * Sets the staff total local male of this tourism bona acco assesment.
	 *
	 * @param staffTotalLocalMale the staff total local male of this tourism bona acco assesment
	 */
	@Override
	public void setStaffTotalLocalMale(String staffTotalLocalMale) {
		model.setStaffTotalLocalMale(staffTotalLocalMale);
	}

	/**
	 * Sets the temporary foreign female of this tourism bona acco assesment.
	 *
	 * @param temporaryForeignFemale the temporary foreign female of this tourism bona acco assesment
	 */
	@Override
	public void setTemporaryForeignFemale(String temporaryForeignFemale) {
		model.setTemporaryForeignFemale(temporaryForeignFemale);
	}

	/**
	 * Sets the temporary foreign male of this tourism bona acco assesment.
	 *
	 * @param temporaryForeignMale the temporary foreign male of this tourism bona acco assesment
	 */
	@Override
	public void setTemporaryForeignMale(String temporaryForeignMale) {
		model.setTemporaryForeignMale(temporaryForeignMale);
	}

	/**
	 * Sets the temporary local female of this tourism bona acco assesment.
	 *
	 * @param temporaryLocalFemale the temporary local female of this tourism bona acco assesment
	 */
	@Override
	public void setTemporaryLocalFemale(String temporaryLocalFemale) {
		model.setTemporaryLocalFemale(temporaryLocalFemale);
	}

	/**
	 * Sets the temporary local male of this tourism bona acco assesment.
	 *
	 * @param temporaryLocalMale the temporary local male of this tourism bona acco assesment
	 */
	@Override
	public void setTemporaryLocalMale(String temporaryLocalMale) {
		model.setTemporaryLocalMale(temporaryLocalMale);
	}

	/**
	 * Sets the total foreign female of this tourism bona acco assesment.
	 *
	 * @param totalForeignFemale the total foreign female of this tourism bona acco assesment
	 */
	@Override
	public void setTotalForeignFemale(String totalForeignFemale) {
		model.setTotalForeignFemale(totalForeignFemale);
	}

	/**
	 * Sets the total foreign male of this tourism bona acco assesment.
	 *
	 * @param totalForeignMale the total foreign male of this tourism bona acco assesment
	 */
	@Override
	public void setTotalForeignMale(String totalForeignMale) {
		model.setTotalForeignMale(totalForeignMale);
	}

	/**
	 * Sets the total local female of this tourism bona acco assesment.
	 *
	 * @param totalLocalFemale the total local female of this tourism bona acco assesment
	 */
	@Override
	public void setTotalLocalFemale(String totalLocalFemale) {
		model.setTotalLocalFemale(totalLocalFemale);
	}

	/**
	 * Sets the total local male of this tourism bona acco assesment.
	 *
	 * @param totalLocalMale the total local male of this tourism bona acco assesment
	 */
	@Override
	public void setTotalLocalMale(String totalLocalMale) {
		model.setTotalLocalMale(totalLocalMale);
	}

	/**
	 * Sets the tourism application ID of this tourism bona acco assesment.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism bona acco assesment
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism bona acco assesment ID of this tourism bona acco assesment.
	 *
	 * @param tourismBonaAccoAssesmentId the tourism bona acco assesment ID of this tourism bona acco assesment
	 */
	@Override
	public void setTourismBonaAccoAssesmentId(long tourismBonaAccoAssesmentId) {
		model.setTourismBonaAccoAssesmentId(tourismBonaAccoAssesmentId);
	}

	/**
	 * Sets the user ID of this tourism bona acco assesment.
	 *
	 * @param userId the user ID of this tourism bona acco assesment
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism bona acco assesment.
	 *
	 * @param userName the user name of this tourism bona acco assesment
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism bona acco assesment.
	 *
	 * @param userUuid the user uuid of this tourism bona acco assesment
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
	protected TourismBonaAccoAssesmentWrapper wrap(
		TourismBonaAccoAssesment tourismBonaAccoAssesment) {

		return new TourismBonaAccoAssesmentWrapper(tourismBonaAccoAssesment);
	}

}