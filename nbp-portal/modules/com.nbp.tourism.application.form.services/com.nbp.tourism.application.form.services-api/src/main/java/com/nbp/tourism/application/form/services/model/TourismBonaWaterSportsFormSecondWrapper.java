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
 * This class is a wrapper for {@link TourismBonaWaterSportsFormSecond}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaWaterSportsFormSecond
 * @generated
 */
public class TourismBonaWaterSportsFormSecondWrapper
	extends BaseModelWrapper<TourismBonaWaterSportsFormSecond>
	implements ModelWrapper<TourismBonaWaterSportsFormSecond>,
			   TourismBonaWaterSportsFormSecond {

	public TourismBonaWaterSportsFormSecondWrapper(
		TourismBonaWaterSportsFormSecond tourismBonaWaterSportsFormSecond) {

		super(tourismBonaWaterSportsFormSecond);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"tourismBonaWaterSportsFSecId", getTourismBonaWaterSportsFSecId());
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
		attributes.put(
			"bonaCapitalizationUSComponent",
			getBonaCapitalizationUSComponent());
		attributes.put(
			"bonaCapitalizationJEquivalent",
			getBonaCapitalizationJEquivalent());
		attributes.put(
			"bonaCapitalizationRateExchange",
			getBonaCapitalizationRateExchange());
		attributes.put(
			"bonaCapitalizationJComponent", getBonaCapitalizationJComponent());
		attributes.put(
			"bonaCapitalCapitalInvest", getBonaCapitalCapitalInvest());
		attributes.put("bonaSourcesLoan ", getBonaSourcesLoan());
		attributes.put("bonaSourcesEquity", getBonaSourcesEquity());
		attributes.put(
			"bonaSourcesStateOfFinanc", getBonaSourcesStateOfFinanc());
		attributes.put("bonaAnnualProjectedOne ", getBonaAnnualProjectedOne());
		attributes.put("bonaAnnualProjectedTwo", getBonaAnnualProjectedTwo());
		attributes.put(
			"bonaAnnualProjectedThree ", getBonaAnnualProjectedThree());
		attributes.put(
			"bonaAnnualProjectedNumber", getBonaAnnualProjectedNumber());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismBonaWaterSportsFSecId = (Long)attributes.get(
			"tourismBonaWaterSportsFSecId");

		if (tourismBonaWaterSportsFSecId != null) {
			setTourismBonaWaterSportsFSecId(tourismBonaWaterSportsFSecId);
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

		String bonaCapitalizationUSComponent = (String)attributes.get(
			"bonaCapitalizationUSComponent");

		if (bonaCapitalizationUSComponent != null) {
			setBonaCapitalizationUSComponent(bonaCapitalizationUSComponent);
		}

		String bonaCapitalizationJEquivalent = (String)attributes.get(
			"bonaCapitalizationJEquivalent");

		if (bonaCapitalizationJEquivalent != null) {
			setBonaCapitalizationJEquivalent(bonaCapitalizationJEquivalent);
		}

		String bonaCapitalizationRateExchange = (String)attributes.get(
			"bonaCapitalizationRateExchange");

		if (bonaCapitalizationRateExchange != null) {
			setBonaCapitalizationRateExchange(bonaCapitalizationRateExchange);
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

		String bonaSourcesStateOfFinanc = (String)attributes.get(
			"bonaSourcesStateOfFinanc");

		if (bonaSourcesStateOfFinanc != null) {
			setBonaSourcesStateOfFinanc(bonaSourcesStateOfFinanc);
		}

		String bonaAnnualProjectedOne = (String)attributes.get(
			"bonaAnnualProjectedOne ");

		if (bonaAnnualProjectedOne != null) {
			setBonaAnnualProjectedOne(bonaAnnualProjectedOne);
		}

		String bonaAnnualProjectedTwo = (String)attributes.get(
			"bonaAnnualProjectedTwo");

		if (bonaAnnualProjectedTwo != null) {
			setBonaAnnualProjectedTwo(bonaAnnualProjectedTwo);
		}

		String bonaAnnualProjectedThree = (String)attributes.get(
			"bonaAnnualProjectedThree ");

		if (bonaAnnualProjectedThree != null) {
			setBonaAnnualProjectedThree(bonaAnnualProjectedThree);
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
	public TourismBonaWaterSportsFormSecond cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the bona annual projected number of this tourism bona water sports form second.
	 *
	 * @return the bona annual projected number of this tourism bona water sports form second
	 */
	@Override
	public String getBonaAnnualProjectedNumber() {
		return model.getBonaAnnualProjectedNumber();
	}

	/**
	 * Returns the bona annual projected one of this tourism bona water sports form second.
	 *
	 * @return the bona annual projected one of this tourism bona water sports form second
	 */
	@Override
	public String getBonaAnnualProjectedOne() {
		return model.getBonaAnnualProjectedOne();
	}

	/**
	 * Returns the bona annual projected three of this tourism bona water sports form second.
	 *
	 * @return the bona annual projected three of this tourism bona water sports form second
	 */
	@Override
	public String getBonaAnnualProjectedThree() {
		return model.getBonaAnnualProjectedThree();
	}

	/**
	 * Returns the bona annual projected two of this tourism bona water sports form second.
	 *
	 * @return the bona annual projected two of this tourism bona water sports form second
	 */
	@Override
	public String getBonaAnnualProjectedTwo() {
		return model.getBonaAnnualProjectedTwo();
	}

	/**
	 * Returns the bona capital capital invest of this tourism bona water sports form second.
	 *
	 * @return the bona capital capital invest of this tourism bona water sports form second
	 */
	@Override
	public String getBonaCapitalCapitalInvest() {
		return model.getBonaCapitalCapitalInvest();
	}

	/**
	 * Returns the bona capitalization j component of this tourism bona water sports form second.
	 *
	 * @return the bona capitalization j component of this tourism bona water sports form second
	 */
	@Override
	public String getBonaCapitalizationJComponent() {
		return model.getBonaCapitalizationJComponent();
	}

	/**
	 * Returns the bona capitalization j equivalent of this tourism bona water sports form second.
	 *
	 * @return the bona capitalization j equivalent of this tourism bona water sports form second
	 */
	@Override
	public String getBonaCapitalizationJEquivalent() {
		return model.getBonaCapitalizationJEquivalent();
	}

	/**
	 * Returns the bona capitalization rate exchange of this tourism bona water sports form second.
	 *
	 * @return the bona capitalization rate exchange of this tourism bona water sports form second
	 */
	@Override
	public String getBonaCapitalizationRateExchange() {
		return model.getBonaCapitalizationRateExchange();
	}

	/**
	 * Returns the bona capitalization us component of this tourism bona water sports form second.
	 *
	 * @return the bona capitalization us component of this tourism bona water sports form second
	 */
	@Override
	public String getBonaCapitalizationUSComponent() {
		return model.getBonaCapitalizationUSComponent();
	}

	/**
	 * Returns the bona owner country of origin of this tourism bona water sports form second.
	 *
	 * @return the bona owner country of origin of this tourism bona water sports form second
	 */
	@Override
	public String getBonaOwnerCountryOfOrigin() {
		return model.getBonaOwnerCountryOfOrigin();
	}

	/**
	 * Returns the bona owner foreign of this tourism bona water sports form second.
	 *
	 * @return the bona owner foreign of this tourism bona water sports form second
	 */
	@Override
	public String getBonaOwnerForeign() {
		return model.getBonaOwnerForeign();
	}

	/**
	 * Returns the bona owner joint venture of this tourism bona water sports form second.
	 *
	 * @return the bona owner joint venture of this tourism bona water sports form second
	 */
	@Override
	public String getBonaOwnerJointVenture() {
		return model.getBonaOwnerJointVenture();
	}

	/**
	 * Returns the bona owner local of this tourism bona water sports form second.
	 *
	 * @return the bona owner local of this tourism bona water sports form second
	 */
	@Override
	public String getBonaOwnerLocal() {
		return model.getBonaOwnerLocal();
	}

	/**
	 * Returns the bona sources equity of this tourism bona water sports form second.
	 *
	 * @return the bona sources equity of this tourism bona water sports form second
	 */
	@Override
	public String getBonaSourcesEquity() {
		return model.getBonaSourcesEquity();
	}

	/**
	 * Returns the bona sources loan of this tourism bona water sports form second.
	 *
	 * @return the bona sources loan of this tourism bona water sports form second
	 */
	@Override
	public String getBonaSourcesLoan() {
		return model.getBonaSourcesLoan();
	}

	/**
	 * Returns the bona sources state of financ of this tourism bona water sports form second.
	 *
	 * @return the bona sources state of financ of this tourism bona water sports form second
	 */
	@Override
	public String getBonaSourcesStateOfFinanc() {
		return model.getBonaSourcesStateOfFinanc();
	}

	/**
	 * Returns the bona target market countries of this tourism bona water sports form second.
	 *
	 * @return the bona target market countries of this tourism bona water sports form second
	 */
	@Override
	public String getBonaTargetMarketCountries() {
		return model.getBonaTargetMarketCountries();
	}

	/**
	 * Returns the bona target market foreign of this tourism bona water sports form second.
	 *
	 * @return the bona target market foreign of this tourism bona water sports form second
	 */
	@Override
	public String getBonaTargetMarketForeign() {
		return model.getBonaTargetMarketForeign();
	}

	/**
	 * Returns the bona target market local of this tourism bona water sports form second.
	 *
	 * @return the bona target market local of this tourism bona water sports form second
	 */
	@Override
	public String getBonaTargetMarketLocal() {
		return model.getBonaTargetMarketLocal();
	}

	/**
	 * Returns the company ID of this tourism bona water sports form second.
	 *
	 * @return the company ID of this tourism bona water sports form second
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism bona water sports form second.
	 *
	 * @return the create date of this tourism bona water sports form second
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this tourism bona water sports form second.
	 *
	 * @return the group ID of this tourism bona water sports form second
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism bona water sports form second.
	 *
	 * @return the modified date of this tourism bona water sports form second
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this tourism bona water sports form second.
	 *
	 * @return the primary key of this tourism bona water sports form second
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tourism application ID of this tourism bona water sports form second.
	 *
	 * @return the tourism application ID of this tourism bona water sports form second
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism bona water sports f sec ID of this tourism bona water sports form second.
	 *
	 * @return the tourism bona water sports f sec ID of this tourism bona water sports form second
	 */
	@Override
	public long getTourismBonaWaterSportsFSecId() {
		return model.getTourismBonaWaterSportsFSecId();
	}

	/**
	 * Returns the user ID of this tourism bona water sports form second.
	 *
	 * @return the user ID of this tourism bona water sports form second
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism bona water sports form second.
	 *
	 * @return the user name of this tourism bona water sports form second
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism bona water sports form second.
	 *
	 * @return the user uuid of this tourism bona water sports form second
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
	 * Sets the bona annual projected number of this tourism bona water sports form second.
	 *
	 * @param bonaAnnualProjectedNumber the bona annual projected number of this tourism bona water sports form second
	 */
	@Override
	public void setBonaAnnualProjectedNumber(String bonaAnnualProjectedNumber) {
		model.setBonaAnnualProjectedNumber(bonaAnnualProjectedNumber);
	}

	/**
	 * Sets the bona annual projected one of this tourism bona water sports form second.
	 *
	 * @param bonaAnnualProjectedOne  the bona annual projected one of this tourism bona water sports form second
	 */
	@Override
	public void setBonaAnnualProjectedOne(String bonaAnnualProjectedOne) {
		model.setBonaAnnualProjectedOne(bonaAnnualProjectedOne);
	}

	/**
	 * Sets the bona annual projected three of this tourism bona water sports form second.
	 *
	 * @param bonaAnnualProjectedThree  the bona annual projected three of this tourism bona water sports form second
	 */
	@Override
	public void setBonaAnnualProjectedThree(String bonaAnnualProjectedThree) {
		model.setBonaAnnualProjectedThree(bonaAnnualProjectedThree);
	}

	/**
	 * Sets the bona annual projected two of this tourism bona water sports form second.
	 *
	 * @param bonaAnnualProjectedTwo the bona annual projected two of this tourism bona water sports form second
	 */
	@Override
	public void setBonaAnnualProjectedTwo(String bonaAnnualProjectedTwo) {
		model.setBonaAnnualProjectedTwo(bonaAnnualProjectedTwo);
	}

	/**
	 * Sets the bona capital capital invest of this tourism bona water sports form second.
	 *
	 * @param bonaCapitalCapitalInvest the bona capital capital invest of this tourism bona water sports form second
	 */
	@Override
	public void setBonaCapitalCapitalInvest(String bonaCapitalCapitalInvest) {
		model.setBonaCapitalCapitalInvest(bonaCapitalCapitalInvest);
	}

	/**
	 * Sets the bona capitalization j component of this tourism bona water sports form second.
	 *
	 * @param bonaCapitalizationJComponent the bona capitalization j component of this tourism bona water sports form second
	 */
	@Override
	public void setBonaCapitalizationJComponent(
		String bonaCapitalizationJComponent) {

		model.setBonaCapitalizationJComponent(bonaCapitalizationJComponent);
	}

	/**
	 * Sets the bona capitalization j equivalent of this tourism bona water sports form second.
	 *
	 * @param bonaCapitalizationJEquivalent the bona capitalization j equivalent of this tourism bona water sports form second
	 */
	@Override
	public void setBonaCapitalizationJEquivalent(
		String bonaCapitalizationJEquivalent) {

		model.setBonaCapitalizationJEquivalent(bonaCapitalizationJEquivalent);
	}

	/**
	 * Sets the bona capitalization rate exchange of this tourism bona water sports form second.
	 *
	 * @param bonaCapitalizationRateExchange the bona capitalization rate exchange of this tourism bona water sports form second
	 */
	@Override
	public void setBonaCapitalizationRateExchange(
		String bonaCapitalizationRateExchange) {

		model.setBonaCapitalizationRateExchange(bonaCapitalizationRateExchange);
	}

	/**
	 * Sets the bona capitalization us component of this tourism bona water sports form second.
	 *
	 * @param bonaCapitalizationUSComponent the bona capitalization us component of this tourism bona water sports form second
	 */
	@Override
	public void setBonaCapitalizationUSComponent(
		String bonaCapitalizationUSComponent) {

		model.setBonaCapitalizationUSComponent(bonaCapitalizationUSComponent);
	}

	/**
	 * Sets the bona owner country of origin of this tourism bona water sports form second.
	 *
	 * @param bonaOwnerCountryOfOrigin the bona owner country of origin of this tourism bona water sports form second
	 */
	@Override
	public void setBonaOwnerCountryOfOrigin(String bonaOwnerCountryOfOrigin) {
		model.setBonaOwnerCountryOfOrigin(bonaOwnerCountryOfOrigin);
	}

	/**
	 * Sets the bona owner foreign of this tourism bona water sports form second.
	 *
	 * @param bonaOwnerForeign the bona owner foreign of this tourism bona water sports form second
	 */
	@Override
	public void setBonaOwnerForeign(String bonaOwnerForeign) {
		model.setBonaOwnerForeign(bonaOwnerForeign);
	}

	/**
	 * Sets the bona owner joint venture of this tourism bona water sports form second.
	 *
	 * @param bonaOwnerJointVenture the bona owner joint venture of this tourism bona water sports form second
	 */
	@Override
	public void setBonaOwnerJointVenture(String bonaOwnerJointVenture) {
		model.setBonaOwnerJointVenture(bonaOwnerJointVenture);
	}

	/**
	 * Sets the bona owner local of this tourism bona water sports form second.
	 *
	 * @param bonaOwnerLocal the bona owner local of this tourism bona water sports form second
	 */
	@Override
	public void setBonaOwnerLocal(String bonaOwnerLocal) {
		model.setBonaOwnerLocal(bonaOwnerLocal);
	}

	/**
	 * Sets the bona sources equity of this tourism bona water sports form second.
	 *
	 * @param bonaSourcesEquity the bona sources equity of this tourism bona water sports form second
	 */
	@Override
	public void setBonaSourcesEquity(String bonaSourcesEquity) {
		model.setBonaSourcesEquity(bonaSourcesEquity);
	}

	/**
	 * Sets the bona sources loan of this tourism bona water sports form second.
	 *
	 * @param bonaSourcesLoan  the bona sources loan of this tourism bona water sports form second
	 */
	@Override
	public void setBonaSourcesLoan(String bonaSourcesLoan) {
		model.setBonaSourcesLoan(bonaSourcesLoan);
	}

	/**
	 * Sets the bona sources state of financ of this tourism bona water sports form second.
	 *
	 * @param bonaSourcesStateOfFinanc the bona sources state of financ of this tourism bona water sports form second
	 */
	@Override
	public void setBonaSourcesStateOfFinanc(String bonaSourcesStateOfFinanc) {
		model.setBonaSourcesStateOfFinanc(bonaSourcesStateOfFinanc);
	}

	/**
	 * Sets the bona target market countries of this tourism bona water sports form second.
	 *
	 * @param bonaTargetMarketCountries the bona target market countries of this tourism bona water sports form second
	 */
	@Override
	public void setBonaTargetMarketCountries(String bonaTargetMarketCountries) {
		model.setBonaTargetMarketCountries(bonaTargetMarketCountries);
	}

	/**
	 * Sets the bona target market foreign of this tourism bona water sports form second.
	 *
	 * @param bonaTargetMarketForeign the bona target market foreign of this tourism bona water sports form second
	 */
	@Override
	public void setBonaTargetMarketForeign(String bonaTargetMarketForeign) {
		model.setBonaTargetMarketForeign(bonaTargetMarketForeign);
	}

	/**
	 * Sets the bona target market local of this tourism bona water sports form second.
	 *
	 * @param bonaTargetMarketLocal the bona target market local of this tourism bona water sports form second
	 */
	@Override
	public void setBonaTargetMarketLocal(String bonaTargetMarketLocal) {
		model.setBonaTargetMarketLocal(bonaTargetMarketLocal);
	}

	/**
	 * Sets the company ID of this tourism bona water sports form second.
	 *
	 * @param companyId the company ID of this tourism bona water sports form second
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism bona water sports form second.
	 *
	 * @param createDate the create date of this tourism bona water sports form second
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this tourism bona water sports form second.
	 *
	 * @param groupId the group ID of this tourism bona water sports form second
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism bona water sports form second.
	 *
	 * @param modifiedDate the modified date of this tourism bona water sports form second
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this tourism bona water sports form second.
	 *
	 * @param primaryKey the primary key of this tourism bona water sports form second
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tourism application ID of this tourism bona water sports form second.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism bona water sports form second
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism bona water sports f sec ID of this tourism bona water sports form second.
	 *
	 * @param tourismBonaWaterSportsFSecId the tourism bona water sports f sec ID of this tourism bona water sports form second
	 */
	@Override
	public void setTourismBonaWaterSportsFSecId(
		long tourismBonaWaterSportsFSecId) {

		model.setTourismBonaWaterSportsFSecId(tourismBonaWaterSportsFSecId);
	}

	/**
	 * Sets the user ID of this tourism bona water sports form second.
	 *
	 * @param userId the user ID of this tourism bona water sports form second
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism bona water sports form second.
	 *
	 * @param userName the user name of this tourism bona water sports form second
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism bona water sports form second.
	 *
	 * @param userUuid the user uuid of this tourism bona water sports form second
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
	protected TourismBonaWaterSportsFormSecondWrapper wrap(
		TourismBonaWaterSportsFormSecond tourismBonaWaterSportsFormSecond) {

		return new TourismBonaWaterSportsFormSecondWrapper(
			tourismBonaWaterSportsFormSecond);
	}

}