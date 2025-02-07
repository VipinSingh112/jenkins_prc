/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CreativeIndividualEconomicEffect}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeIndividualEconomicEffect
 * @generated
 */
public class CreativeIndividualEconomicEffectWrapper
	extends BaseModelWrapper<CreativeIndividualEconomicEffect>
	implements CreativeIndividualEconomicEffect,
			   ModelWrapper<CreativeIndividualEconomicEffect> {

	public CreativeIndividualEconomicEffectWrapper(
		CreativeIndividualEconomicEffect creativeIndividualEconomicEffect) {

		super(creativeIndividualEconomicEffect);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("creativeIndiEcoEffectId", getCreativeIndiEcoEffectId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("shareCapitalJmd", getShareCapitalJmd());
		attributes.put(
			"shareCapitalExchangeRate", getShareCapitalExchangeRate());
		attributes.put("shareCapitalUsd", getShareCapitalUsd());
		attributes.put("localCapitalJmd", getLocalCapitalJmd());
		attributes.put(
			"localCapitalExchangeRate", getLocalCapitalExchangeRate());
		attributes.put("localCapitalUsd", getLocalCapitalUsd());
		attributes.put("otherJmd", getOtherJmd());
		attributes.put("otherExchangeRate", getOtherExchangeRate());
		attributes.put("otherUsd", getOtherUsd());
		attributes.put(
			"estimatedLocalExpenditure", getEstimatedLocalExpenditure());
		attributes.put("otherEstimatedLocal ", getOtherEstimatedLocal());
		attributes.put("annualYearOne", getAnnualYearOne());
		attributes.put("annualOneUsd", getAnnualOneUsd());
		attributes.put("annualYearTwo", getAnnualYearTwo());
		attributes.put("annualTwoUsd", getAnnualTwoUsd());
		attributes.put("annualYearThree", getAnnualYearThree());
		attributes.put("annualThreeUsd", getAnnualThreeUsd());
		attributes.put("targetMarketLocal", getTargetMarketLocal());
		attributes.put("targetMarketForeign", getTargetMarketForeign());
		attributes.put("targetMarketCountries", getTargetMarketCountries());
		attributes.put(
			"declareInformationProvide", getDeclareInformationProvide());
		attributes.put("CreativeApplicationId", getCreativeApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long creativeIndiEcoEffectId = (Long)attributes.get(
			"creativeIndiEcoEffectId");

		if (creativeIndiEcoEffectId != null) {
			setCreativeIndiEcoEffectId(creativeIndiEcoEffectId);
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

		String shareCapitalJmd = (String)attributes.get("shareCapitalJmd");

		if (shareCapitalJmd != null) {
			setShareCapitalJmd(shareCapitalJmd);
		}

		String shareCapitalExchangeRate = (String)attributes.get(
			"shareCapitalExchangeRate");

		if (shareCapitalExchangeRate != null) {
			setShareCapitalExchangeRate(shareCapitalExchangeRate);
		}

		String shareCapitalUsd = (String)attributes.get("shareCapitalUsd");

		if (shareCapitalUsd != null) {
			setShareCapitalUsd(shareCapitalUsd);
		}

		String localCapitalJmd = (String)attributes.get("localCapitalJmd");

		if (localCapitalJmd != null) {
			setLocalCapitalJmd(localCapitalJmd);
		}

		String localCapitalExchangeRate = (String)attributes.get(
			"localCapitalExchangeRate");

		if (localCapitalExchangeRate != null) {
			setLocalCapitalExchangeRate(localCapitalExchangeRate);
		}

		String localCapitalUsd = (String)attributes.get("localCapitalUsd");

		if (localCapitalUsd != null) {
			setLocalCapitalUsd(localCapitalUsd);
		}

		String otherJmd = (String)attributes.get("otherJmd");

		if (otherJmd != null) {
			setOtherJmd(otherJmd);
		}

		String otherExchangeRate = (String)attributes.get("otherExchangeRate");

		if (otherExchangeRate != null) {
			setOtherExchangeRate(otherExchangeRate);
		}

		String otherUsd = (String)attributes.get("otherUsd");

		if (otherUsd != null) {
			setOtherUsd(otherUsd);
		}

		String estimatedLocalExpenditure = (String)attributes.get(
			"estimatedLocalExpenditure");

		if (estimatedLocalExpenditure != null) {
			setEstimatedLocalExpenditure(estimatedLocalExpenditure);
		}

		String otherEstimatedLocal = (String)attributes.get(
			"otherEstimatedLocal ");

		if (otherEstimatedLocal != null) {
			setOtherEstimatedLocal(otherEstimatedLocal);
		}

		String annualYearOne = (String)attributes.get("annualYearOne");

		if (annualYearOne != null) {
			setAnnualYearOne(annualYearOne);
		}

		String annualOneUsd = (String)attributes.get("annualOneUsd");

		if (annualOneUsd != null) {
			setAnnualOneUsd(annualOneUsd);
		}

		String annualYearTwo = (String)attributes.get("annualYearTwo");

		if (annualYearTwo != null) {
			setAnnualYearTwo(annualYearTwo);
		}

		String annualTwoUsd = (String)attributes.get("annualTwoUsd");

		if (annualTwoUsd != null) {
			setAnnualTwoUsd(annualTwoUsd);
		}

		String annualYearThree = (String)attributes.get("annualYearThree");

		if (annualYearThree != null) {
			setAnnualYearThree(annualYearThree);
		}

		String annualThreeUsd = (String)attributes.get("annualThreeUsd");

		if (annualThreeUsd != null) {
			setAnnualThreeUsd(annualThreeUsd);
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

		String declareInformationProvide = (String)attributes.get(
			"declareInformationProvide");

		if (declareInformationProvide != null) {
			setDeclareInformationProvide(declareInformationProvide);
		}

		Long CreativeApplicationId = (Long)attributes.get(
			"CreativeApplicationId");

		if (CreativeApplicationId != null) {
			setCreativeApplicationId(CreativeApplicationId);
		}
	}

	@Override
	public CreativeIndividualEconomicEffect cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the annual one usd of this creative individual economic effect.
	 *
	 * @return the annual one usd of this creative individual economic effect
	 */
	@Override
	public String getAnnualOneUsd() {
		return model.getAnnualOneUsd();
	}

	/**
	 * Returns the annual three usd of this creative individual economic effect.
	 *
	 * @return the annual three usd of this creative individual economic effect
	 */
	@Override
	public String getAnnualThreeUsd() {
		return model.getAnnualThreeUsd();
	}

	/**
	 * Returns the annual two usd of this creative individual economic effect.
	 *
	 * @return the annual two usd of this creative individual economic effect
	 */
	@Override
	public String getAnnualTwoUsd() {
		return model.getAnnualTwoUsd();
	}

	/**
	 * Returns the annual year one of this creative individual economic effect.
	 *
	 * @return the annual year one of this creative individual economic effect
	 */
	@Override
	public String getAnnualYearOne() {
		return model.getAnnualYearOne();
	}

	/**
	 * Returns the annual year three of this creative individual economic effect.
	 *
	 * @return the annual year three of this creative individual economic effect
	 */
	@Override
	public String getAnnualYearThree() {
		return model.getAnnualYearThree();
	}

	/**
	 * Returns the annual year two of this creative individual economic effect.
	 *
	 * @return the annual year two of this creative individual economic effect
	 */
	@Override
	public String getAnnualYearTwo() {
		return model.getAnnualYearTwo();
	}

	/**
	 * Returns the company ID of this creative individual economic effect.
	 *
	 * @return the company ID of this creative individual economic effect
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this creative individual economic effect.
	 *
	 * @return the create date of this creative individual economic effect
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the creative application ID of this creative individual economic effect.
	 *
	 * @return the creative application ID of this creative individual economic effect
	 */
	@Override
	public long getCreativeApplicationId() {
		return model.getCreativeApplicationId();
	}

	/**
	 * Returns the creative indi eco effect ID of this creative individual economic effect.
	 *
	 * @return the creative indi eco effect ID of this creative individual economic effect
	 */
	@Override
	public long getCreativeIndiEcoEffectId() {
		return model.getCreativeIndiEcoEffectId();
	}

	/**
	 * Returns the declare information provide of this creative individual economic effect.
	 *
	 * @return the declare information provide of this creative individual economic effect
	 */
	@Override
	public String getDeclareInformationProvide() {
		return model.getDeclareInformationProvide();
	}

	/**
	 * Returns the estimated local expenditure of this creative individual economic effect.
	 *
	 * @return the estimated local expenditure of this creative individual economic effect
	 */
	@Override
	public String getEstimatedLocalExpenditure() {
		return model.getEstimatedLocalExpenditure();
	}

	/**
	 * Returns the group ID of this creative individual economic effect.
	 *
	 * @return the group ID of this creative individual economic effect
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the local capital exchange rate of this creative individual economic effect.
	 *
	 * @return the local capital exchange rate of this creative individual economic effect
	 */
	@Override
	public String getLocalCapitalExchangeRate() {
		return model.getLocalCapitalExchangeRate();
	}

	/**
	 * Returns the local capital jmd of this creative individual economic effect.
	 *
	 * @return the local capital jmd of this creative individual economic effect
	 */
	@Override
	public String getLocalCapitalJmd() {
		return model.getLocalCapitalJmd();
	}

	/**
	 * Returns the local capital usd of this creative individual economic effect.
	 *
	 * @return the local capital usd of this creative individual economic effect
	 */
	@Override
	public String getLocalCapitalUsd() {
		return model.getLocalCapitalUsd();
	}

	/**
	 * Returns the modified date of this creative individual economic effect.
	 *
	 * @return the modified date of this creative individual economic effect
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the other estimated local of this creative individual economic effect.
	 *
	 * @return the other estimated local of this creative individual economic effect
	 */
	@Override
	public String getOtherEstimatedLocal() {
		return model.getOtherEstimatedLocal();
	}

	/**
	 * Returns the other exchange rate of this creative individual economic effect.
	 *
	 * @return the other exchange rate of this creative individual economic effect
	 */
	@Override
	public String getOtherExchangeRate() {
		return model.getOtherExchangeRate();
	}

	/**
	 * Returns the other jmd of this creative individual economic effect.
	 *
	 * @return the other jmd of this creative individual economic effect
	 */
	@Override
	public String getOtherJmd() {
		return model.getOtherJmd();
	}

	/**
	 * Returns the other usd of this creative individual economic effect.
	 *
	 * @return the other usd of this creative individual economic effect
	 */
	@Override
	public String getOtherUsd() {
		return model.getOtherUsd();
	}

	/**
	 * Returns the primary key of this creative individual economic effect.
	 *
	 * @return the primary key of this creative individual economic effect
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the share capital exchange rate of this creative individual economic effect.
	 *
	 * @return the share capital exchange rate of this creative individual economic effect
	 */
	@Override
	public String getShareCapitalExchangeRate() {
		return model.getShareCapitalExchangeRate();
	}

	/**
	 * Returns the share capital jmd of this creative individual economic effect.
	 *
	 * @return the share capital jmd of this creative individual economic effect
	 */
	@Override
	public String getShareCapitalJmd() {
		return model.getShareCapitalJmd();
	}

	/**
	 * Returns the share capital usd of this creative individual economic effect.
	 *
	 * @return the share capital usd of this creative individual economic effect
	 */
	@Override
	public String getShareCapitalUsd() {
		return model.getShareCapitalUsd();
	}

	/**
	 * Returns the target market countries of this creative individual economic effect.
	 *
	 * @return the target market countries of this creative individual economic effect
	 */
	@Override
	public String getTargetMarketCountries() {
		return model.getTargetMarketCountries();
	}

	/**
	 * Returns the target market foreign of this creative individual economic effect.
	 *
	 * @return the target market foreign of this creative individual economic effect
	 */
	@Override
	public String getTargetMarketForeign() {
		return model.getTargetMarketForeign();
	}

	/**
	 * Returns the target market local of this creative individual economic effect.
	 *
	 * @return the target market local of this creative individual economic effect
	 */
	@Override
	public String getTargetMarketLocal() {
		return model.getTargetMarketLocal();
	}

	/**
	 * Returns the user ID of this creative individual economic effect.
	 *
	 * @return the user ID of this creative individual economic effect
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this creative individual economic effect.
	 *
	 * @return the user name of this creative individual economic effect
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this creative individual economic effect.
	 *
	 * @return the user uuid of this creative individual economic effect
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
	 * Sets the annual one usd of this creative individual economic effect.
	 *
	 * @param annualOneUsd the annual one usd of this creative individual economic effect
	 */
	@Override
	public void setAnnualOneUsd(String annualOneUsd) {
		model.setAnnualOneUsd(annualOneUsd);
	}

	/**
	 * Sets the annual three usd of this creative individual economic effect.
	 *
	 * @param annualThreeUsd the annual three usd of this creative individual economic effect
	 */
	@Override
	public void setAnnualThreeUsd(String annualThreeUsd) {
		model.setAnnualThreeUsd(annualThreeUsd);
	}

	/**
	 * Sets the annual two usd of this creative individual economic effect.
	 *
	 * @param annualTwoUsd the annual two usd of this creative individual economic effect
	 */
	@Override
	public void setAnnualTwoUsd(String annualTwoUsd) {
		model.setAnnualTwoUsd(annualTwoUsd);
	}

	/**
	 * Sets the annual year one of this creative individual economic effect.
	 *
	 * @param annualYearOne the annual year one of this creative individual economic effect
	 */
	@Override
	public void setAnnualYearOne(String annualYearOne) {
		model.setAnnualYearOne(annualYearOne);
	}

	/**
	 * Sets the annual year three of this creative individual economic effect.
	 *
	 * @param annualYearThree the annual year three of this creative individual economic effect
	 */
	@Override
	public void setAnnualYearThree(String annualYearThree) {
		model.setAnnualYearThree(annualYearThree);
	}

	/**
	 * Sets the annual year two of this creative individual economic effect.
	 *
	 * @param annualYearTwo the annual year two of this creative individual economic effect
	 */
	@Override
	public void setAnnualYearTwo(String annualYearTwo) {
		model.setAnnualYearTwo(annualYearTwo);
	}

	/**
	 * Sets the company ID of this creative individual economic effect.
	 *
	 * @param companyId the company ID of this creative individual economic effect
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this creative individual economic effect.
	 *
	 * @param createDate the create date of this creative individual economic effect
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the creative application ID of this creative individual economic effect.
	 *
	 * @param CreativeApplicationId the creative application ID of this creative individual economic effect
	 */
	@Override
	public void setCreativeApplicationId(long CreativeApplicationId) {
		model.setCreativeApplicationId(CreativeApplicationId);
	}

	/**
	 * Sets the creative indi eco effect ID of this creative individual economic effect.
	 *
	 * @param creativeIndiEcoEffectId the creative indi eco effect ID of this creative individual economic effect
	 */
	@Override
	public void setCreativeIndiEcoEffectId(long creativeIndiEcoEffectId) {
		model.setCreativeIndiEcoEffectId(creativeIndiEcoEffectId);
	}

	/**
	 * Sets the declare information provide of this creative individual economic effect.
	 *
	 * @param declareInformationProvide the declare information provide of this creative individual economic effect
	 */
	@Override
	public void setDeclareInformationProvide(String declareInformationProvide) {
		model.setDeclareInformationProvide(declareInformationProvide);
	}

	/**
	 * Sets the estimated local expenditure of this creative individual economic effect.
	 *
	 * @param estimatedLocalExpenditure the estimated local expenditure of this creative individual economic effect
	 */
	@Override
	public void setEstimatedLocalExpenditure(String estimatedLocalExpenditure) {
		model.setEstimatedLocalExpenditure(estimatedLocalExpenditure);
	}

	/**
	 * Sets the group ID of this creative individual economic effect.
	 *
	 * @param groupId the group ID of this creative individual economic effect
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the local capital exchange rate of this creative individual economic effect.
	 *
	 * @param localCapitalExchangeRate the local capital exchange rate of this creative individual economic effect
	 */
	@Override
	public void setLocalCapitalExchangeRate(String localCapitalExchangeRate) {
		model.setLocalCapitalExchangeRate(localCapitalExchangeRate);
	}

	/**
	 * Sets the local capital jmd of this creative individual economic effect.
	 *
	 * @param localCapitalJmd the local capital jmd of this creative individual economic effect
	 */
	@Override
	public void setLocalCapitalJmd(String localCapitalJmd) {
		model.setLocalCapitalJmd(localCapitalJmd);
	}

	/**
	 * Sets the local capital usd of this creative individual economic effect.
	 *
	 * @param localCapitalUsd the local capital usd of this creative individual economic effect
	 */
	@Override
	public void setLocalCapitalUsd(String localCapitalUsd) {
		model.setLocalCapitalUsd(localCapitalUsd);
	}

	/**
	 * Sets the modified date of this creative individual economic effect.
	 *
	 * @param modifiedDate the modified date of this creative individual economic effect
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the other estimated local of this creative individual economic effect.
	 *
	 * @param otherEstimatedLocal  the other estimated local of this creative individual economic effect
	 */
	@Override
	public void setOtherEstimatedLocal(String otherEstimatedLocal) {
		model.setOtherEstimatedLocal(otherEstimatedLocal);
	}

	/**
	 * Sets the other exchange rate of this creative individual economic effect.
	 *
	 * @param otherExchangeRate the other exchange rate of this creative individual economic effect
	 */
	@Override
	public void setOtherExchangeRate(String otherExchangeRate) {
		model.setOtherExchangeRate(otherExchangeRate);
	}

	/**
	 * Sets the other jmd of this creative individual economic effect.
	 *
	 * @param otherJmd the other jmd of this creative individual economic effect
	 */
	@Override
	public void setOtherJmd(String otherJmd) {
		model.setOtherJmd(otherJmd);
	}

	/**
	 * Sets the other usd of this creative individual economic effect.
	 *
	 * @param otherUsd the other usd of this creative individual economic effect
	 */
	@Override
	public void setOtherUsd(String otherUsd) {
		model.setOtherUsd(otherUsd);
	}

	/**
	 * Sets the primary key of this creative individual economic effect.
	 *
	 * @param primaryKey the primary key of this creative individual economic effect
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the share capital exchange rate of this creative individual economic effect.
	 *
	 * @param shareCapitalExchangeRate the share capital exchange rate of this creative individual economic effect
	 */
	@Override
	public void setShareCapitalExchangeRate(String shareCapitalExchangeRate) {
		model.setShareCapitalExchangeRate(shareCapitalExchangeRate);
	}

	/**
	 * Sets the share capital jmd of this creative individual economic effect.
	 *
	 * @param shareCapitalJmd the share capital jmd of this creative individual economic effect
	 */
	@Override
	public void setShareCapitalJmd(String shareCapitalJmd) {
		model.setShareCapitalJmd(shareCapitalJmd);
	}

	/**
	 * Sets the share capital usd of this creative individual economic effect.
	 *
	 * @param shareCapitalUsd the share capital usd of this creative individual economic effect
	 */
	@Override
	public void setShareCapitalUsd(String shareCapitalUsd) {
		model.setShareCapitalUsd(shareCapitalUsd);
	}

	/**
	 * Sets the target market countries of this creative individual economic effect.
	 *
	 * @param targetMarketCountries the target market countries of this creative individual economic effect
	 */
	@Override
	public void setTargetMarketCountries(String targetMarketCountries) {
		model.setTargetMarketCountries(targetMarketCountries);
	}

	/**
	 * Sets the target market foreign of this creative individual economic effect.
	 *
	 * @param targetMarketForeign the target market foreign of this creative individual economic effect
	 */
	@Override
	public void setTargetMarketForeign(String targetMarketForeign) {
		model.setTargetMarketForeign(targetMarketForeign);
	}

	/**
	 * Sets the target market local of this creative individual economic effect.
	 *
	 * @param targetMarketLocal the target market local of this creative individual economic effect
	 */
	@Override
	public void setTargetMarketLocal(String targetMarketLocal) {
		model.setTargetMarketLocal(targetMarketLocal);
	}

	/**
	 * Sets the user ID of this creative individual economic effect.
	 *
	 * @param userId the user ID of this creative individual economic effect
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this creative individual economic effect.
	 *
	 * @param userName the user name of this creative individual economic effect
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this creative individual economic effect.
	 *
	 * @param userUuid the user uuid of this creative individual economic effect
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
	protected CreativeIndividualEconomicEffectWrapper wrap(
		CreativeIndividualEconomicEffect creativeIndividualEconomicEffect) {

		return new CreativeIndividualEconomicEffectWrapper(
			creativeIndividualEconomicEffect);
	}

}