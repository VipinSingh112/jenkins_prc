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
 * This class is a wrapper for {@link TourismNewAttractionFormSecond}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionFormSecond
 * @generated
 */
public class TourismNewAttractionFormSecondWrapper
	extends BaseModelWrapper<TourismNewAttractionFormSecond>
	implements ModelWrapper<TourismNewAttractionFormSecond>,
			   TourismNewAttractionFormSecond {

	public TourismNewAttractionFormSecondWrapper(
		TourismNewAttractionFormSecond tourismNewAttractionFormSecond) {

		super(tourismNewAttractionFormSecond);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"tourismNewAttractionFormSecId",
			getTourismNewAttractionFormSecId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("targetMarketLocal", getTargetMarketLocal());
		attributes.put("targetMarketForeign", getTargetMarketForeign());
		attributes.put("targetMarketCountries", getTargetMarketCountries());
		attributes.put("ownerCountryOfOrigin", getOwnerCountryOfOrigin());
		attributes.put("ownerJointVenture", getOwnerJointVenture());
		attributes.put("ownerLocal", getOwnerLocal());
		attributes.put("ownerForeign", getOwnerForeign());
		attributes.put(
			"capitalizationUSComponent", getCapitalizationUSComponent());
		attributes.put(
			"capitalizationJEquivalent", getCapitalizationJEquivalent());
		attributes.put(
			"capitalizationRateOfExchange", getCapitalizationRateOfExchange());
		attributes.put(
			"capitalizationJComponent", getCapitalizationJComponent());
		attributes.put(
			"capitalizationCapitalInvest", getCapitalizationCapitalInvest());
		attributes.put("sourcesLoan ", getSourcesLoan());
		attributes.put("sourcesEquity", getSourcesEquity());
		attributes.put(
			"sourcesStateSourceOfLoanFinanc",
			getSourcesStateSourceOfLoanFinanc());
		attributes.put("annualProjectedOne ", getAnnualProjectedOne());
		attributes.put("annualProjectedTwo", getAnnualProjectedTwo());
		attributes.put("annualProjectedThree ", getAnnualProjectedThree());
		attributes.put("annualProjectedNumber", getAnnualProjectedNumber());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismNewAttractionFormSecId = (Long)attributes.get(
			"tourismNewAttractionFormSecId");

		if (tourismNewAttractionFormSecId != null) {
			setTourismNewAttractionFormSecId(tourismNewAttractionFormSecId);
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

		String targetMarketLocal = (String)attributes.get("targetMarketLocal");

		if (targetMarketLocal != null) {
			setTargetMarketLocal(targetMarketLocal);
		}

		String targetMarketForeign = (String)attributes.get(
			"targetMarketForeign");

		if (targetMarketForeign != null) {
			setTargetMarketForeign(targetMarketForeign);
		}

		String targetMarketCountries = (String)attributes.get(
			"targetMarketCountries");

		if (targetMarketCountries != null) {
			setTargetMarketCountries(targetMarketCountries);
		}

		String ownerCountryOfOrigin = (String)attributes.get(
			"ownerCountryOfOrigin");

		if (ownerCountryOfOrigin != null) {
			setOwnerCountryOfOrigin(ownerCountryOfOrigin);
		}

		String ownerJointVenture = (String)attributes.get("ownerJointVenture");

		if (ownerJointVenture != null) {
			setOwnerJointVenture(ownerJointVenture);
		}

		String ownerLocal = (String)attributes.get("ownerLocal");

		if (ownerLocal != null) {
			setOwnerLocal(ownerLocal);
		}

		String ownerForeign = (String)attributes.get("ownerForeign");

		if (ownerForeign != null) {
			setOwnerForeign(ownerForeign);
		}

		String capitalizationUSComponent = (String)attributes.get(
			"capitalizationUSComponent");

		if (capitalizationUSComponent != null) {
			setCapitalizationUSComponent(capitalizationUSComponent);
		}

		String capitalizationJEquivalent = (String)attributes.get(
			"capitalizationJEquivalent");

		if (capitalizationJEquivalent != null) {
			setCapitalizationJEquivalent(capitalizationJEquivalent);
		}

		String capitalizationRateOfExchange = (String)attributes.get(
			"capitalizationRateOfExchange");

		if (capitalizationRateOfExchange != null) {
			setCapitalizationRateOfExchange(capitalizationRateOfExchange);
		}

		String capitalizationJComponent = (String)attributes.get(
			"capitalizationJComponent");

		if (capitalizationJComponent != null) {
			setCapitalizationJComponent(capitalizationJComponent);
		}

		String capitalizationCapitalInvest = (String)attributes.get(
			"capitalizationCapitalInvest");

		if (capitalizationCapitalInvest != null) {
			setCapitalizationCapitalInvest(capitalizationCapitalInvest);
		}

		String sourcesLoan = (String)attributes.get("sourcesLoan ");

		if (sourcesLoan != null) {
			setSourcesLoan(sourcesLoan);
		}

		String sourcesEquity = (String)attributes.get("sourcesEquity");

		if (sourcesEquity != null) {
			setSourcesEquity(sourcesEquity);
		}

		String sourcesStateSourceOfLoanFinanc = (String)attributes.get(
			"sourcesStateSourceOfLoanFinanc");

		if (sourcesStateSourceOfLoanFinanc != null) {
			setSourcesStateSourceOfLoanFinanc(sourcesStateSourceOfLoanFinanc);
		}

		String annualProjectedOne = (String)attributes.get(
			"annualProjectedOne ");

		if (annualProjectedOne != null) {
			setAnnualProjectedOne(annualProjectedOne);
		}

		String annualProjectedTwo = (String)attributes.get(
			"annualProjectedTwo");

		if (annualProjectedTwo != null) {
			setAnnualProjectedTwo(annualProjectedTwo);
		}

		String annualProjectedThree = (String)attributes.get(
			"annualProjectedThree ");

		if (annualProjectedThree != null) {
			setAnnualProjectedThree(annualProjectedThree);
		}

		String annualProjectedNumber = (String)attributes.get(
			"annualProjectedNumber");

		if (annualProjectedNumber != null) {
			setAnnualProjectedNumber(annualProjectedNumber);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}
	}

	@Override
	public TourismNewAttractionFormSecond cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the annual projected number of this tourism new attraction form second.
	 *
	 * @return the annual projected number of this tourism new attraction form second
	 */
	@Override
	public String getAnnualProjectedNumber() {
		return model.getAnnualProjectedNumber();
	}

	/**
	 * Returns the annual projected one of this tourism new attraction form second.
	 *
	 * @return the annual projected one of this tourism new attraction form second
	 */
	@Override
	public String getAnnualProjectedOne() {
		return model.getAnnualProjectedOne();
	}

	/**
	 * Returns the annual projected three of this tourism new attraction form second.
	 *
	 * @return the annual projected three of this tourism new attraction form second
	 */
	@Override
	public String getAnnualProjectedThree() {
		return model.getAnnualProjectedThree();
	}

	/**
	 * Returns the annual projected two of this tourism new attraction form second.
	 *
	 * @return the annual projected two of this tourism new attraction form second
	 */
	@Override
	public String getAnnualProjectedTwo() {
		return model.getAnnualProjectedTwo();
	}

	/**
	 * Returns the capitalization capital invest of this tourism new attraction form second.
	 *
	 * @return the capitalization capital invest of this tourism new attraction form second
	 */
	@Override
	public String getCapitalizationCapitalInvest() {
		return model.getCapitalizationCapitalInvest();
	}

	/**
	 * Returns the capitalization j component of this tourism new attraction form second.
	 *
	 * @return the capitalization j component of this tourism new attraction form second
	 */
	@Override
	public String getCapitalizationJComponent() {
		return model.getCapitalizationJComponent();
	}

	/**
	 * Returns the capitalization j equivalent of this tourism new attraction form second.
	 *
	 * @return the capitalization j equivalent of this tourism new attraction form second
	 */
	@Override
	public String getCapitalizationJEquivalent() {
		return model.getCapitalizationJEquivalent();
	}

	/**
	 * Returns the capitalization rate of exchange of this tourism new attraction form second.
	 *
	 * @return the capitalization rate of exchange of this tourism new attraction form second
	 */
	@Override
	public String getCapitalizationRateOfExchange() {
		return model.getCapitalizationRateOfExchange();
	}

	/**
	 * Returns the capitalization us component of this tourism new attraction form second.
	 *
	 * @return the capitalization us component of this tourism new attraction form second
	 */
	@Override
	public String getCapitalizationUSComponent() {
		return model.getCapitalizationUSComponent();
	}

	/**
	 * Returns the company ID of this tourism new attraction form second.
	 *
	 * @return the company ID of this tourism new attraction form second
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism new attraction form second.
	 *
	 * @return the create date of this tourism new attraction form second
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this tourism new attraction form second.
	 *
	 * @return the group ID of this tourism new attraction form second
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism new attraction form second.
	 *
	 * @return the modified date of this tourism new attraction form second
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the owner country of origin of this tourism new attraction form second.
	 *
	 * @return the owner country of origin of this tourism new attraction form second
	 */
	@Override
	public String getOwnerCountryOfOrigin() {
		return model.getOwnerCountryOfOrigin();
	}

	/**
	 * Returns the owner foreign of this tourism new attraction form second.
	 *
	 * @return the owner foreign of this tourism new attraction form second
	 */
	@Override
	public String getOwnerForeign() {
		return model.getOwnerForeign();
	}

	/**
	 * Returns the owner joint venture of this tourism new attraction form second.
	 *
	 * @return the owner joint venture of this tourism new attraction form second
	 */
	@Override
	public String getOwnerJointVenture() {
		return model.getOwnerJointVenture();
	}

	/**
	 * Returns the owner local of this tourism new attraction form second.
	 *
	 * @return the owner local of this tourism new attraction form second
	 */
	@Override
	public String getOwnerLocal() {
		return model.getOwnerLocal();
	}

	/**
	 * Returns the primary key of this tourism new attraction form second.
	 *
	 * @return the primary key of this tourism new attraction form second
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sources equity of this tourism new attraction form second.
	 *
	 * @return the sources equity of this tourism new attraction form second
	 */
	@Override
	public String getSourcesEquity() {
		return model.getSourcesEquity();
	}

	/**
	 * Returns the sources loan of this tourism new attraction form second.
	 *
	 * @return the sources loan of this tourism new attraction form second
	 */
	@Override
	public String getSourcesLoan() {
		return model.getSourcesLoan();
	}

	/**
	 * Returns the sources state source of loan financ of this tourism new attraction form second.
	 *
	 * @return the sources state source of loan financ of this tourism new attraction form second
	 */
	@Override
	public String getSourcesStateSourceOfLoanFinanc() {
		return model.getSourcesStateSourceOfLoanFinanc();
	}

	/**
	 * Returns the target market countries of this tourism new attraction form second.
	 *
	 * @return the target market countries of this tourism new attraction form second
	 */
	@Override
	public String getTargetMarketCountries() {
		return model.getTargetMarketCountries();
	}

	/**
	 * Returns the target market foreign of this tourism new attraction form second.
	 *
	 * @return the target market foreign of this tourism new attraction form second
	 */
	@Override
	public String getTargetMarketForeign() {
		return model.getTargetMarketForeign();
	}

	/**
	 * Returns the target market local of this tourism new attraction form second.
	 *
	 * @return the target market local of this tourism new attraction form second
	 */
	@Override
	public String getTargetMarketLocal() {
		return model.getTargetMarketLocal();
	}

	/**
	 * Returns the tourism application ID of this tourism new attraction form second.
	 *
	 * @return the tourism application ID of this tourism new attraction form second
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism new attraction form sec ID of this tourism new attraction form second.
	 *
	 * @return the tourism new attraction form sec ID of this tourism new attraction form second
	 */
	@Override
	public long getTourismNewAttractionFormSecId() {
		return model.getTourismNewAttractionFormSecId();
	}

	/**
	 * Returns the user ID of this tourism new attraction form second.
	 *
	 * @return the user ID of this tourism new attraction form second
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism new attraction form second.
	 *
	 * @return the user name of this tourism new attraction form second
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism new attraction form second.
	 *
	 * @return the user uuid of this tourism new attraction form second
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
	 * Sets the annual projected number of this tourism new attraction form second.
	 *
	 * @param annualProjectedNumber the annual projected number of this tourism new attraction form second
	 */
	@Override
	public void setAnnualProjectedNumber(String annualProjectedNumber) {
		model.setAnnualProjectedNumber(annualProjectedNumber);
	}

	/**
	 * Sets the annual projected one of this tourism new attraction form second.
	 *
	 * @param annualProjectedOne  the annual projected one of this tourism new attraction form second
	 */
	@Override
	public void setAnnualProjectedOne(String annualProjectedOne) {
		model.setAnnualProjectedOne(annualProjectedOne);
	}

	/**
	 * Sets the annual projected three of this tourism new attraction form second.
	 *
	 * @param annualProjectedThree  the annual projected three of this tourism new attraction form second
	 */
	@Override
	public void setAnnualProjectedThree(String annualProjectedThree) {
		model.setAnnualProjectedThree(annualProjectedThree);
	}

	/**
	 * Sets the annual projected two of this tourism new attraction form second.
	 *
	 * @param annualProjectedTwo the annual projected two of this tourism new attraction form second
	 */
	@Override
	public void setAnnualProjectedTwo(String annualProjectedTwo) {
		model.setAnnualProjectedTwo(annualProjectedTwo);
	}

	/**
	 * Sets the capitalization capital invest of this tourism new attraction form second.
	 *
	 * @param capitalizationCapitalInvest the capitalization capital invest of this tourism new attraction form second
	 */
	@Override
	public void setCapitalizationCapitalInvest(
		String capitalizationCapitalInvest) {

		model.setCapitalizationCapitalInvest(capitalizationCapitalInvest);
	}

	/**
	 * Sets the capitalization j component of this tourism new attraction form second.
	 *
	 * @param capitalizationJComponent the capitalization j component of this tourism new attraction form second
	 */
	@Override
	public void setCapitalizationJComponent(String capitalizationJComponent) {
		model.setCapitalizationJComponent(capitalizationJComponent);
	}

	/**
	 * Sets the capitalization j equivalent of this tourism new attraction form second.
	 *
	 * @param capitalizationJEquivalent the capitalization j equivalent of this tourism new attraction form second
	 */
	@Override
	public void setCapitalizationJEquivalent(String capitalizationJEquivalent) {
		model.setCapitalizationJEquivalent(capitalizationJEquivalent);
	}

	/**
	 * Sets the capitalization rate of exchange of this tourism new attraction form second.
	 *
	 * @param capitalizationRateOfExchange the capitalization rate of exchange of this tourism new attraction form second
	 */
	@Override
	public void setCapitalizationRateOfExchange(
		String capitalizationRateOfExchange) {

		model.setCapitalizationRateOfExchange(capitalizationRateOfExchange);
	}

	/**
	 * Sets the capitalization us component of this tourism new attraction form second.
	 *
	 * @param capitalizationUSComponent the capitalization us component of this tourism new attraction form second
	 */
	@Override
	public void setCapitalizationUSComponent(String capitalizationUSComponent) {
		model.setCapitalizationUSComponent(capitalizationUSComponent);
	}

	/**
	 * Sets the company ID of this tourism new attraction form second.
	 *
	 * @param companyId the company ID of this tourism new attraction form second
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism new attraction form second.
	 *
	 * @param createDate the create date of this tourism new attraction form second
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this tourism new attraction form second.
	 *
	 * @param groupId the group ID of this tourism new attraction form second
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism new attraction form second.
	 *
	 * @param modifiedDate the modified date of this tourism new attraction form second
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the owner country of origin of this tourism new attraction form second.
	 *
	 * @param ownerCountryOfOrigin the owner country of origin of this tourism new attraction form second
	 */
	@Override
	public void setOwnerCountryOfOrigin(String ownerCountryOfOrigin) {
		model.setOwnerCountryOfOrigin(ownerCountryOfOrigin);
	}

	/**
	 * Sets the owner foreign of this tourism new attraction form second.
	 *
	 * @param ownerForeign the owner foreign of this tourism new attraction form second
	 */
	@Override
	public void setOwnerForeign(String ownerForeign) {
		model.setOwnerForeign(ownerForeign);
	}

	/**
	 * Sets the owner joint venture of this tourism new attraction form second.
	 *
	 * @param ownerJointVenture the owner joint venture of this tourism new attraction form second
	 */
	@Override
	public void setOwnerJointVenture(String ownerJointVenture) {
		model.setOwnerJointVenture(ownerJointVenture);
	}

	/**
	 * Sets the owner local of this tourism new attraction form second.
	 *
	 * @param ownerLocal the owner local of this tourism new attraction form second
	 */
	@Override
	public void setOwnerLocal(String ownerLocal) {
		model.setOwnerLocal(ownerLocal);
	}

	/**
	 * Sets the primary key of this tourism new attraction form second.
	 *
	 * @param primaryKey the primary key of this tourism new attraction form second
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sources equity of this tourism new attraction form second.
	 *
	 * @param sourcesEquity the sources equity of this tourism new attraction form second
	 */
	@Override
	public void setSourcesEquity(String sourcesEquity) {
		model.setSourcesEquity(sourcesEquity);
	}

	/**
	 * Sets the sources loan of this tourism new attraction form second.
	 *
	 * @param sourcesLoan  the sources loan of this tourism new attraction form second
	 */
	@Override
	public void setSourcesLoan(String sourcesLoan) {
		model.setSourcesLoan(sourcesLoan);
	}

	/**
	 * Sets the sources state source of loan financ of this tourism new attraction form second.
	 *
	 * @param sourcesStateSourceOfLoanFinanc the sources state source of loan financ of this tourism new attraction form second
	 */
	@Override
	public void setSourcesStateSourceOfLoanFinanc(
		String sourcesStateSourceOfLoanFinanc) {

		model.setSourcesStateSourceOfLoanFinanc(sourcesStateSourceOfLoanFinanc);
	}

	/**
	 * Sets the target market countries of this tourism new attraction form second.
	 *
	 * @param targetMarketCountries the target market countries of this tourism new attraction form second
	 */
	@Override
	public void setTargetMarketCountries(String targetMarketCountries) {
		model.setTargetMarketCountries(targetMarketCountries);
	}

	/**
	 * Sets the target market foreign of this tourism new attraction form second.
	 *
	 * @param targetMarketForeign the target market foreign of this tourism new attraction form second
	 */
	@Override
	public void setTargetMarketForeign(String targetMarketForeign) {
		model.setTargetMarketForeign(targetMarketForeign);
	}

	/**
	 * Sets the target market local of this tourism new attraction form second.
	 *
	 * @param targetMarketLocal the target market local of this tourism new attraction form second
	 */
	@Override
	public void setTargetMarketLocal(String targetMarketLocal) {
		model.setTargetMarketLocal(targetMarketLocal);
	}

	/**
	 * Sets the tourism application ID of this tourism new attraction form second.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism new attraction form second
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism new attraction form sec ID of this tourism new attraction form second.
	 *
	 * @param tourismNewAttractionFormSecId the tourism new attraction form sec ID of this tourism new attraction form second
	 */
	@Override
	public void setTourismNewAttractionFormSecId(
		long tourismNewAttractionFormSecId) {

		model.setTourismNewAttractionFormSecId(tourismNewAttractionFormSecId);
	}

	/**
	 * Sets the user ID of this tourism new attraction form second.
	 *
	 * @param userId the user ID of this tourism new attraction form second
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism new attraction form second.
	 *
	 * @param userName the user name of this tourism new attraction form second
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism new attraction form second.
	 *
	 * @param userUuid the user uuid of this tourism new attraction form second
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
	protected TourismNewAttractionFormSecondWrapper wrap(
		TourismNewAttractionFormSecond tourismNewAttractionFormSecond) {

		return new TourismNewAttractionFormSecondWrapper(
			tourismNewAttractionFormSecond);
	}

}