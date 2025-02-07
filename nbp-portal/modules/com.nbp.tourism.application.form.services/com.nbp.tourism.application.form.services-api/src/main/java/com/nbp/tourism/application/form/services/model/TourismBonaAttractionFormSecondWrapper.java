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
 * This class is a wrapper for {@link TourismBonaAttractionFormSecond}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAttractionFormSecond
 * @generated
 */
public class TourismBonaAttractionFormSecondWrapper
	extends BaseModelWrapper<TourismBonaAttractionFormSecond>
	implements ModelWrapper<TourismBonaAttractionFormSecond>,
			   TourismBonaAttractionFormSecond {

	public TourismBonaAttractionFormSecondWrapper(
		TourismBonaAttractionFormSecond tourismBonaAttractionFormSecond) {

		super(tourismBonaAttractionFormSecond);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"tourismBonaAttractFormSecId", getTourismBonaAttractFormSecId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("bonaTargetMarketLocal", getBonaTargetMarketLocal());
		attributes.put("bonaTargetMarketForeign", getBonaTargetMarketForeign());
		attributes.put(
			"bonaTargetMarketCountries", getBonaTargetMarketCountries());
		attributes.put(
			"bonaOwnerCountryOfOrigin", getBonaOwnerCountryOfOrigin());
		attributes.put("bonaOwnerJointVenture", getBonaOwnerJointVenture());
		attributes.put("bonaOwnerLocal", getBonaOwnerLocal());
		attributes.put("bonaOwnerForeign", getBonaOwnerForeign());
		attributes.put("bonaCapitalUSComponent", getBonaCapitalUSComponent());
		attributes.put(
			"bonaCapitalizationJEquivalent",
			getBonaCapitalizationJEquivalent());
		attributes.put(
			"bonaCapitalRateOfExchange", getBonaCapitalRateOfExchange());
		attributes.put(
			"bonaCapitalizationJComponent", getBonaCapitalizationJComponent());
		attributes.put(
			"bonaCapitalCapitalInvest", getBonaCapitalCapitalInvest());
		attributes.put("bonaSourcesLoan ", getBonaSourcesLoan());
		attributes.put("bonaSourcesEquity", getBonaSourcesEquity());
		attributes.put(
			"bonaSourcesStateOfLoanFinanc", getBonaSourcesStateOfLoanFinanc());
		attributes.put(
			"bonaAnnualProjectedYearOne ", getBonaAnnualProjectedYearOne());
		attributes.put(
			"bonaAnnualProjectedYearTwo", getBonaAnnualProjectedYearTwo());
		attributes.put(
			"bonaAnnualProjectedYearThree ", getBonaAnnualProjectedYearThree());
		attributes.put(
			"bonaAnnualProjectedNumber", getBonaAnnualProjectedNumber());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismBonaAttractFormSecId = (Long)attributes.get(
			"tourismBonaAttractFormSecId");

		if (tourismBonaAttractFormSecId != null) {
			setTourismBonaAttractFormSecId(tourismBonaAttractFormSecId);
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

		String bonaTargetMarketLocal = (String)attributes.get(
			"bonaTargetMarketLocal");

		if (bonaTargetMarketLocal != null) {
			setBonaTargetMarketLocal(bonaTargetMarketLocal);
		}

		String bonaTargetMarketForeign = (String)attributes.get(
			"bonaTargetMarketForeign");

		if (bonaTargetMarketForeign != null) {
			setBonaTargetMarketForeign(bonaTargetMarketForeign);
		}

		String bonaTargetMarketCountries = (String)attributes.get(
			"bonaTargetMarketCountries");

		if (bonaTargetMarketCountries != null) {
			setBonaTargetMarketCountries(bonaTargetMarketCountries);
		}

		String bonaOwnerCountryOfOrigin = (String)attributes.get(
			"bonaOwnerCountryOfOrigin");

		if (bonaOwnerCountryOfOrigin != null) {
			setBonaOwnerCountryOfOrigin(bonaOwnerCountryOfOrigin);
		}

		String bonaOwnerJointVenture = (String)attributes.get(
			"bonaOwnerJointVenture");

		if (bonaOwnerJointVenture != null) {
			setBonaOwnerJointVenture(bonaOwnerJointVenture);
		}

		String bonaOwnerLocal = (String)attributes.get("bonaOwnerLocal");

		if (bonaOwnerLocal != null) {
			setBonaOwnerLocal(bonaOwnerLocal);
		}

		String bonaOwnerForeign = (String)attributes.get("bonaOwnerForeign");

		if (bonaOwnerForeign != null) {
			setBonaOwnerForeign(bonaOwnerForeign);
		}

		String bonaCapitalUSComponent = (String)attributes.get(
			"bonaCapitalUSComponent");

		if (bonaCapitalUSComponent != null) {
			setBonaCapitalUSComponent(bonaCapitalUSComponent);
		}

		String bonaCapitalizationJEquivalent = (String)attributes.get(
			"bonaCapitalizationJEquivalent");

		if (bonaCapitalizationJEquivalent != null) {
			setBonaCapitalizationJEquivalent(bonaCapitalizationJEquivalent);
		}

		String bonaCapitalRateOfExchange = (String)attributes.get(
			"bonaCapitalRateOfExchange");

		if (bonaCapitalRateOfExchange != null) {
			setBonaCapitalRateOfExchange(bonaCapitalRateOfExchange);
		}

		String bonaCapitalizationJComponent = (String)attributes.get(
			"bonaCapitalizationJComponent");

		if (bonaCapitalizationJComponent != null) {
			setBonaCapitalizationJComponent(bonaCapitalizationJComponent);
		}

		String bonaCapitalCapitalInvest = (String)attributes.get(
			"bonaCapitalCapitalInvest");

		if (bonaCapitalCapitalInvest != null) {
			setBonaCapitalCapitalInvest(bonaCapitalCapitalInvest);
		}

		String bonaSourcesLoan = (String)attributes.get("bonaSourcesLoan ");

		if (bonaSourcesLoan != null) {
			setBonaSourcesLoan(bonaSourcesLoan);
		}

		String bonaSourcesEquity = (String)attributes.get("bonaSourcesEquity");

		if (bonaSourcesEquity != null) {
			setBonaSourcesEquity(bonaSourcesEquity);
		}

		String bonaSourcesStateOfLoanFinanc = (String)attributes.get(
			"bonaSourcesStateOfLoanFinanc");

		if (bonaSourcesStateOfLoanFinanc != null) {
			setBonaSourcesStateOfLoanFinanc(bonaSourcesStateOfLoanFinanc);
		}

		String bonaAnnualProjectedYearOne = (String)attributes.get(
			"bonaAnnualProjectedYearOne ");

		if (bonaAnnualProjectedYearOne != null) {
			setBonaAnnualProjectedYearOne(bonaAnnualProjectedYearOne);
		}

		String bonaAnnualProjectedYearTwo = (String)attributes.get(
			"bonaAnnualProjectedYearTwo");

		if (bonaAnnualProjectedYearTwo != null) {
			setBonaAnnualProjectedYearTwo(bonaAnnualProjectedYearTwo);
		}

		String bonaAnnualProjectedYearThree = (String)attributes.get(
			"bonaAnnualProjectedYearThree ");

		if (bonaAnnualProjectedYearThree != null) {
			setBonaAnnualProjectedYearThree(bonaAnnualProjectedYearThree);
		}

		String bonaAnnualProjectedNumber = (String)attributes.get(
			"bonaAnnualProjectedNumber");

		if (bonaAnnualProjectedNumber != null) {
			setBonaAnnualProjectedNumber(bonaAnnualProjectedNumber);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}
	}

	@Override
	public TourismBonaAttractionFormSecond cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the bona annual projected number of this tourism bona attraction form second.
	 *
	 * @return the bona annual projected number of this tourism bona attraction form second
	 */
	@Override
	public String getBonaAnnualProjectedNumber() {
		return model.getBonaAnnualProjectedNumber();
	}

	/**
	 * Returns the bona annual projected year one of this tourism bona attraction form second.
	 *
	 * @return the bona annual projected year one of this tourism bona attraction form second
	 */
	@Override
	public String getBonaAnnualProjectedYearOne() {
		return model.getBonaAnnualProjectedYearOne();
	}

	/**
	 * Returns the bona annual projected year three of this tourism bona attraction form second.
	 *
	 * @return the bona annual projected year three of this tourism bona attraction form second
	 */
	@Override
	public String getBonaAnnualProjectedYearThree() {
		return model.getBonaAnnualProjectedYearThree();
	}

	/**
	 * Returns the bona annual projected year two of this tourism bona attraction form second.
	 *
	 * @return the bona annual projected year two of this tourism bona attraction form second
	 */
	@Override
	public String getBonaAnnualProjectedYearTwo() {
		return model.getBonaAnnualProjectedYearTwo();
	}

	/**
	 * Returns the bona capital capital invest of this tourism bona attraction form second.
	 *
	 * @return the bona capital capital invest of this tourism bona attraction form second
	 */
	@Override
	public String getBonaCapitalCapitalInvest() {
		return model.getBonaCapitalCapitalInvest();
	}

	/**
	 * Returns the bona capitalization j component of this tourism bona attraction form second.
	 *
	 * @return the bona capitalization j component of this tourism bona attraction form second
	 */
	@Override
	public String getBonaCapitalizationJComponent() {
		return model.getBonaCapitalizationJComponent();
	}

	/**
	 * Returns the bona capitalization j equivalent of this tourism bona attraction form second.
	 *
	 * @return the bona capitalization j equivalent of this tourism bona attraction form second
	 */
	@Override
	public String getBonaCapitalizationJEquivalent() {
		return model.getBonaCapitalizationJEquivalent();
	}

	/**
	 * Returns the bona capital rate of exchange of this tourism bona attraction form second.
	 *
	 * @return the bona capital rate of exchange of this tourism bona attraction form second
	 */
	@Override
	public String getBonaCapitalRateOfExchange() {
		return model.getBonaCapitalRateOfExchange();
	}

	/**
	 * Returns the bona capital us component of this tourism bona attraction form second.
	 *
	 * @return the bona capital us component of this tourism bona attraction form second
	 */
	@Override
	public String getBonaCapitalUSComponent() {
		return model.getBonaCapitalUSComponent();
	}

	/**
	 * Returns the bona owner country of origin of this tourism bona attraction form second.
	 *
	 * @return the bona owner country of origin of this tourism bona attraction form second
	 */
	@Override
	public String getBonaOwnerCountryOfOrigin() {
		return model.getBonaOwnerCountryOfOrigin();
	}

	/**
	 * Returns the bona owner foreign of this tourism bona attraction form second.
	 *
	 * @return the bona owner foreign of this tourism bona attraction form second
	 */
	@Override
	public String getBonaOwnerForeign() {
		return model.getBonaOwnerForeign();
	}

	/**
	 * Returns the bona owner joint venture of this tourism bona attraction form second.
	 *
	 * @return the bona owner joint venture of this tourism bona attraction form second
	 */
	@Override
	public String getBonaOwnerJointVenture() {
		return model.getBonaOwnerJointVenture();
	}

	/**
	 * Returns the bona owner local of this tourism bona attraction form second.
	 *
	 * @return the bona owner local of this tourism bona attraction form second
	 */
	@Override
	public String getBonaOwnerLocal() {
		return model.getBonaOwnerLocal();
	}

	/**
	 * Returns the bona sources equity of this tourism bona attraction form second.
	 *
	 * @return the bona sources equity of this tourism bona attraction form second
	 */
	@Override
	public String getBonaSourcesEquity() {
		return model.getBonaSourcesEquity();
	}

	/**
	 * Returns the bona sources loan of this tourism bona attraction form second.
	 *
	 * @return the bona sources loan of this tourism bona attraction form second
	 */
	@Override
	public String getBonaSourcesLoan() {
		return model.getBonaSourcesLoan();
	}

	/**
	 * Returns the bona sources state of loan financ of this tourism bona attraction form second.
	 *
	 * @return the bona sources state of loan financ of this tourism bona attraction form second
	 */
	@Override
	public String getBonaSourcesStateOfLoanFinanc() {
		return model.getBonaSourcesStateOfLoanFinanc();
	}

	/**
	 * Returns the bona target market countries of this tourism bona attraction form second.
	 *
	 * @return the bona target market countries of this tourism bona attraction form second
	 */
	@Override
	public String getBonaTargetMarketCountries() {
		return model.getBonaTargetMarketCountries();
	}

	/**
	 * Returns the bona target market foreign of this tourism bona attraction form second.
	 *
	 * @return the bona target market foreign of this tourism bona attraction form second
	 */
	@Override
	public String getBonaTargetMarketForeign() {
		return model.getBonaTargetMarketForeign();
	}

	/**
	 * Returns the bona target market local of this tourism bona attraction form second.
	 *
	 * @return the bona target market local of this tourism bona attraction form second
	 */
	@Override
	public String getBonaTargetMarketLocal() {
		return model.getBonaTargetMarketLocal();
	}

	/**
	 * Returns the company ID of this tourism bona attraction form second.
	 *
	 * @return the company ID of this tourism bona attraction form second
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism bona attraction form second.
	 *
	 * @return the create date of this tourism bona attraction form second
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this tourism bona attraction form second.
	 *
	 * @return the group ID of this tourism bona attraction form second
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism bona attraction form second.
	 *
	 * @return the modified date of this tourism bona attraction form second
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this tourism bona attraction form second.
	 *
	 * @return the primary key of this tourism bona attraction form second
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tourism application ID of this tourism bona attraction form second.
	 *
	 * @return the tourism application ID of this tourism bona attraction form second
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism bona attract form sec ID of this tourism bona attraction form second.
	 *
	 * @return the tourism bona attract form sec ID of this tourism bona attraction form second
	 */
	@Override
	public long getTourismBonaAttractFormSecId() {
		return model.getTourismBonaAttractFormSecId();
	}

	/**
	 * Returns the user ID of this tourism bona attraction form second.
	 *
	 * @return the user ID of this tourism bona attraction form second
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism bona attraction form second.
	 *
	 * @return the user name of this tourism bona attraction form second
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism bona attraction form second.
	 *
	 * @return the user uuid of this tourism bona attraction form second
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
	 * Sets the bona annual projected number of this tourism bona attraction form second.
	 *
	 * @param bonaAnnualProjectedNumber the bona annual projected number of this tourism bona attraction form second
	 */
	@Override
	public void setBonaAnnualProjectedNumber(String bonaAnnualProjectedNumber) {
		model.setBonaAnnualProjectedNumber(bonaAnnualProjectedNumber);
	}

	/**
	 * Sets the bona annual projected year one of this tourism bona attraction form second.
	 *
	 * @param bonaAnnualProjectedYearOne  the bona annual projected year one of this tourism bona attraction form second
	 */
	@Override
	public void setBonaAnnualProjectedYearOne(
		String bonaAnnualProjectedYearOne) {

		model.setBonaAnnualProjectedYearOne(bonaAnnualProjectedYearOne);
	}

	/**
	 * Sets the bona annual projected year three of this tourism bona attraction form second.
	 *
	 * @param bonaAnnualProjectedYearThree  the bona annual projected year three of this tourism bona attraction form second
	 */
	@Override
	public void setBonaAnnualProjectedYearThree(
		String bonaAnnualProjectedYearThree) {

		model.setBonaAnnualProjectedYearThree(bonaAnnualProjectedYearThree);
	}

	/**
	 * Sets the bona annual projected year two of this tourism bona attraction form second.
	 *
	 * @param bonaAnnualProjectedYearTwo the bona annual projected year two of this tourism bona attraction form second
	 */
	@Override
	public void setBonaAnnualProjectedYearTwo(
		String bonaAnnualProjectedYearTwo) {

		model.setBonaAnnualProjectedYearTwo(bonaAnnualProjectedYearTwo);
	}

	/**
	 * Sets the bona capital capital invest of this tourism bona attraction form second.
	 *
	 * @param bonaCapitalCapitalInvest the bona capital capital invest of this tourism bona attraction form second
	 */
	@Override
	public void setBonaCapitalCapitalInvest(String bonaCapitalCapitalInvest) {
		model.setBonaCapitalCapitalInvest(bonaCapitalCapitalInvest);
	}

	/**
	 * Sets the bona capitalization j component of this tourism bona attraction form second.
	 *
	 * @param bonaCapitalizationJComponent the bona capitalization j component of this tourism bona attraction form second
	 */
	@Override
	public void setBonaCapitalizationJComponent(
		String bonaCapitalizationJComponent) {

		model.setBonaCapitalizationJComponent(bonaCapitalizationJComponent);
	}

	/**
	 * Sets the bona capitalization j equivalent of this tourism bona attraction form second.
	 *
	 * @param bonaCapitalizationJEquivalent the bona capitalization j equivalent of this tourism bona attraction form second
	 */
	@Override
	public void setBonaCapitalizationJEquivalent(
		String bonaCapitalizationJEquivalent) {

		model.setBonaCapitalizationJEquivalent(bonaCapitalizationJEquivalent);
	}

	/**
	 * Sets the bona capital rate of exchange of this tourism bona attraction form second.
	 *
	 * @param bonaCapitalRateOfExchange the bona capital rate of exchange of this tourism bona attraction form second
	 */
	@Override
	public void setBonaCapitalRateOfExchange(String bonaCapitalRateOfExchange) {
		model.setBonaCapitalRateOfExchange(bonaCapitalRateOfExchange);
	}

	/**
	 * Sets the bona capital us component of this tourism bona attraction form second.
	 *
	 * @param bonaCapitalUSComponent the bona capital us component of this tourism bona attraction form second
	 */
	@Override
	public void setBonaCapitalUSComponent(String bonaCapitalUSComponent) {
		model.setBonaCapitalUSComponent(bonaCapitalUSComponent);
	}

	/**
	 * Sets the bona owner country of origin of this tourism bona attraction form second.
	 *
	 * @param bonaOwnerCountryOfOrigin the bona owner country of origin of this tourism bona attraction form second
	 */
	@Override
	public void setBonaOwnerCountryOfOrigin(String bonaOwnerCountryOfOrigin) {
		model.setBonaOwnerCountryOfOrigin(bonaOwnerCountryOfOrigin);
	}

	/**
	 * Sets the bona owner foreign of this tourism bona attraction form second.
	 *
	 * @param bonaOwnerForeign the bona owner foreign of this tourism bona attraction form second
	 */
	@Override
	public void setBonaOwnerForeign(String bonaOwnerForeign) {
		model.setBonaOwnerForeign(bonaOwnerForeign);
	}

	/**
	 * Sets the bona owner joint venture of this tourism bona attraction form second.
	 *
	 * @param bonaOwnerJointVenture the bona owner joint venture of this tourism bona attraction form second
	 */
	@Override
	public void setBonaOwnerJointVenture(String bonaOwnerJointVenture) {
		model.setBonaOwnerJointVenture(bonaOwnerJointVenture);
	}

	/**
	 * Sets the bona owner local of this tourism bona attraction form second.
	 *
	 * @param bonaOwnerLocal the bona owner local of this tourism bona attraction form second
	 */
	@Override
	public void setBonaOwnerLocal(String bonaOwnerLocal) {
		model.setBonaOwnerLocal(bonaOwnerLocal);
	}

	/**
	 * Sets the bona sources equity of this tourism bona attraction form second.
	 *
	 * @param bonaSourcesEquity the bona sources equity of this tourism bona attraction form second
	 */
	@Override
	public void setBonaSourcesEquity(String bonaSourcesEquity) {
		model.setBonaSourcesEquity(bonaSourcesEquity);
	}

	/**
	 * Sets the bona sources loan of this tourism bona attraction form second.
	 *
	 * @param bonaSourcesLoan  the bona sources loan of this tourism bona attraction form second
	 */
	@Override
	public void setBonaSourcesLoan(String bonaSourcesLoan) {
		model.setBonaSourcesLoan(bonaSourcesLoan);
	}

	/**
	 * Sets the bona sources state of loan financ of this tourism bona attraction form second.
	 *
	 * @param bonaSourcesStateOfLoanFinanc the bona sources state of loan financ of this tourism bona attraction form second
	 */
	@Override
	public void setBonaSourcesStateOfLoanFinanc(
		String bonaSourcesStateOfLoanFinanc) {

		model.setBonaSourcesStateOfLoanFinanc(bonaSourcesStateOfLoanFinanc);
	}

	/**
	 * Sets the bona target market countries of this tourism bona attraction form second.
	 *
	 * @param bonaTargetMarketCountries the bona target market countries of this tourism bona attraction form second
	 */
	@Override
	public void setBonaTargetMarketCountries(String bonaTargetMarketCountries) {
		model.setBonaTargetMarketCountries(bonaTargetMarketCountries);
	}

	/**
	 * Sets the bona target market foreign of this tourism bona attraction form second.
	 *
	 * @param bonaTargetMarketForeign the bona target market foreign of this tourism bona attraction form second
	 */
	@Override
	public void setBonaTargetMarketForeign(String bonaTargetMarketForeign) {
		model.setBonaTargetMarketForeign(bonaTargetMarketForeign);
	}

	/**
	 * Sets the bona target market local of this tourism bona attraction form second.
	 *
	 * @param bonaTargetMarketLocal the bona target market local of this tourism bona attraction form second
	 */
	@Override
	public void setBonaTargetMarketLocal(String bonaTargetMarketLocal) {
		model.setBonaTargetMarketLocal(bonaTargetMarketLocal);
	}

	/**
	 * Sets the company ID of this tourism bona attraction form second.
	 *
	 * @param companyId the company ID of this tourism bona attraction form second
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism bona attraction form second.
	 *
	 * @param createDate the create date of this tourism bona attraction form second
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this tourism bona attraction form second.
	 *
	 * @param groupId the group ID of this tourism bona attraction form second
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism bona attraction form second.
	 *
	 * @param modifiedDate the modified date of this tourism bona attraction form second
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this tourism bona attraction form second.
	 *
	 * @param primaryKey the primary key of this tourism bona attraction form second
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tourism application ID of this tourism bona attraction form second.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism bona attraction form second
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism bona attract form sec ID of this tourism bona attraction form second.
	 *
	 * @param tourismBonaAttractFormSecId the tourism bona attract form sec ID of this tourism bona attraction form second
	 */
	@Override
	public void setTourismBonaAttractFormSecId(
		long tourismBonaAttractFormSecId) {

		model.setTourismBonaAttractFormSecId(tourismBonaAttractFormSecId);
	}

	/**
	 * Sets the user ID of this tourism bona attraction form second.
	 *
	 * @param userId the user ID of this tourism bona attraction form second
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism bona attraction form second.
	 *
	 * @param userName the user name of this tourism bona attraction form second
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism bona attraction form second.
	 *
	 * @param userUuid the user uuid of this tourism bona attraction form second
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
	protected TourismBonaAttractionFormSecondWrapper wrap(
		TourismBonaAttractionFormSecond tourismBonaAttractionFormSecond) {

		return new TourismBonaAttractionFormSecondWrapper(
			tourismBonaAttractionFormSecond);
	}

}