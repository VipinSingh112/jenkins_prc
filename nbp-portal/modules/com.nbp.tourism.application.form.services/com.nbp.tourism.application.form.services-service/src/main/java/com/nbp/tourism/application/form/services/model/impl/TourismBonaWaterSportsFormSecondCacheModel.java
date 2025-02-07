/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismBonaWaterSportsFormSecond;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismBonaWaterSportsFormSecond in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismBonaWaterSportsFormSecondCacheModel
	implements CacheModel<TourismBonaWaterSportsFormSecond>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismBonaWaterSportsFormSecondCacheModel)) {
			return false;
		}

		TourismBonaWaterSportsFormSecondCacheModel
			tourismBonaWaterSportsFormSecondCacheModel =
				(TourismBonaWaterSportsFormSecondCacheModel)object;

		if (tourismBonaWaterSportsFSecId ==
				tourismBonaWaterSportsFormSecondCacheModel.
					tourismBonaWaterSportsFSecId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismBonaWaterSportsFSecId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(55);

		sb.append("{tourismBonaWaterSportsFSecId=");
		sb.append(tourismBonaWaterSportsFSecId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", bonaTargetMarketLocal=");
		sb.append(bonaTargetMarketLocal);
		sb.append(", bonaTargetMarketForeign=");
		sb.append(bonaTargetMarketForeign);
		sb.append(", bonaTargetMarketCountries=");
		sb.append(bonaTargetMarketCountries);
		sb.append(", bonaOwnerCountryOfOrigin=");
		sb.append(bonaOwnerCountryOfOrigin);
		sb.append(", bonaOwnerJointVenture=");
		sb.append(bonaOwnerJointVenture);
		sb.append(", bonaOwnerLocal=");
		sb.append(bonaOwnerLocal);
		sb.append(", bonaOwnerForeign=");
		sb.append(bonaOwnerForeign);
		sb.append(", bonaCapitalizationUSComponent=");
		sb.append(bonaCapitalizationUSComponent);
		sb.append(", bonaCapitalizationJEquivalent=");
		sb.append(bonaCapitalizationJEquivalent);
		sb.append(", bonaCapitalizationRateExchange=");
		sb.append(bonaCapitalizationRateExchange);
		sb.append(", bonaCapitalizationJComponent=");
		sb.append(bonaCapitalizationJComponent);
		sb.append(", bonaCapitalCapitalInvest=");
		sb.append(bonaCapitalCapitalInvest);
		sb.append(", bonaSourcesLoan =");
		sb.append(bonaSourcesLoan);
		sb.append(", bonaSourcesEquity=");
		sb.append(bonaSourcesEquity);
		sb.append(", bonaSourcesStateOfFinanc=");
		sb.append(bonaSourcesStateOfFinanc);
		sb.append(", bonaAnnualProjectedOne =");
		sb.append(bonaAnnualProjectedOne);
		sb.append(", bonaAnnualProjectedTwo=");
		sb.append(bonaAnnualProjectedTwo);
		sb.append(", bonaAnnualProjectedThree =");
		sb.append(bonaAnnualProjectedThree);
		sb.append(", bonaAnnualProjectedNumber=");
		sb.append(bonaAnnualProjectedNumber);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismBonaWaterSportsFormSecond toEntityModel() {
		TourismBonaWaterSportsFormSecondImpl
			tourismBonaWaterSportsFormSecondImpl =
				new TourismBonaWaterSportsFormSecondImpl();

		tourismBonaWaterSportsFormSecondImpl.setTourismBonaWaterSportsFSecId(
			tourismBonaWaterSportsFSecId);
		tourismBonaWaterSportsFormSecondImpl.setGroupId(groupId);
		tourismBonaWaterSportsFormSecondImpl.setCompanyId(companyId);
		tourismBonaWaterSportsFormSecondImpl.setUserId(userId);

		if (userName == null) {
			tourismBonaWaterSportsFormSecondImpl.setUserName("");
		}
		else {
			tourismBonaWaterSportsFormSecondImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismBonaWaterSportsFormSecondImpl.setCreateDate(null);
		}
		else {
			tourismBonaWaterSportsFormSecondImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismBonaWaterSportsFormSecondImpl.setModifiedDate(null);
		}
		else {
			tourismBonaWaterSportsFormSecondImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (bonaTargetMarketLocal == null) {
			tourismBonaWaterSportsFormSecondImpl.setBonaTargetMarketLocal("");
		}
		else {
			tourismBonaWaterSportsFormSecondImpl.setBonaTargetMarketLocal(
				bonaTargetMarketLocal);
		}

		if (bonaTargetMarketForeign == null) {
			tourismBonaWaterSportsFormSecondImpl.setBonaTargetMarketForeign("");
		}
		else {
			tourismBonaWaterSportsFormSecondImpl.setBonaTargetMarketForeign(
				bonaTargetMarketForeign);
		}

		if (bonaTargetMarketCountries == null) {
			tourismBonaWaterSportsFormSecondImpl.setBonaTargetMarketCountries(
				"");
		}
		else {
			tourismBonaWaterSportsFormSecondImpl.setBonaTargetMarketCountries(
				bonaTargetMarketCountries);
		}

		if (bonaOwnerCountryOfOrigin == null) {
			tourismBonaWaterSportsFormSecondImpl.setBonaOwnerCountryOfOrigin(
				"");
		}
		else {
			tourismBonaWaterSportsFormSecondImpl.setBonaOwnerCountryOfOrigin(
				bonaOwnerCountryOfOrigin);
		}

		if (bonaOwnerJointVenture == null) {
			tourismBonaWaterSportsFormSecondImpl.setBonaOwnerJointVenture("");
		}
		else {
			tourismBonaWaterSportsFormSecondImpl.setBonaOwnerJointVenture(
				bonaOwnerJointVenture);
		}

		if (bonaOwnerLocal == null) {
			tourismBonaWaterSportsFormSecondImpl.setBonaOwnerLocal("");
		}
		else {
			tourismBonaWaterSportsFormSecondImpl.setBonaOwnerLocal(
				bonaOwnerLocal);
		}

		if (bonaOwnerForeign == null) {
			tourismBonaWaterSportsFormSecondImpl.setBonaOwnerForeign("");
		}
		else {
			tourismBonaWaterSportsFormSecondImpl.setBonaOwnerForeign(
				bonaOwnerForeign);
		}

		if (bonaCapitalizationUSComponent == null) {
			tourismBonaWaterSportsFormSecondImpl.
				setBonaCapitalizationUSComponent("");
		}
		else {
			tourismBonaWaterSportsFormSecondImpl.
				setBonaCapitalizationUSComponent(bonaCapitalizationUSComponent);
		}

		if (bonaCapitalizationJEquivalent == null) {
			tourismBonaWaterSportsFormSecondImpl.
				setBonaCapitalizationJEquivalent("");
		}
		else {
			tourismBonaWaterSportsFormSecondImpl.
				setBonaCapitalizationJEquivalent(bonaCapitalizationJEquivalent);
		}

		if (bonaCapitalizationRateExchange == null) {
			tourismBonaWaterSportsFormSecondImpl.
				setBonaCapitalizationRateExchange("");
		}
		else {
			tourismBonaWaterSportsFormSecondImpl.
				setBonaCapitalizationRateExchange(
					bonaCapitalizationRateExchange);
		}

		if (bonaCapitalizationJComponent == null) {
			tourismBonaWaterSportsFormSecondImpl.
				setBonaCapitalizationJComponent("");
		}
		else {
			tourismBonaWaterSportsFormSecondImpl.
				setBonaCapitalizationJComponent(bonaCapitalizationJComponent);
		}

		if (bonaCapitalCapitalInvest == null) {
			tourismBonaWaterSportsFormSecondImpl.setBonaCapitalCapitalInvest(
				"");
		}
		else {
			tourismBonaWaterSportsFormSecondImpl.setBonaCapitalCapitalInvest(
				bonaCapitalCapitalInvest);
		}

		if (bonaSourcesLoan == null) {
			tourismBonaWaterSportsFormSecondImpl.setBonaSourcesLoan("");
		}
		else {
			tourismBonaWaterSportsFormSecondImpl.setBonaSourcesLoan(
				bonaSourcesLoan);
		}

		if (bonaSourcesEquity == null) {
			tourismBonaWaterSportsFormSecondImpl.setBonaSourcesEquity("");
		}
		else {
			tourismBonaWaterSportsFormSecondImpl.setBonaSourcesEquity(
				bonaSourcesEquity);
		}

		if (bonaSourcesStateOfFinanc == null) {
			tourismBonaWaterSportsFormSecondImpl.setBonaSourcesStateOfFinanc(
				"");
		}
		else {
			tourismBonaWaterSportsFormSecondImpl.setBonaSourcesStateOfFinanc(
				bonaSourcesStateOfFinanc);
		}

		if (bonaAnnualProjectedOne == null) {
			tourismBonaWaterSportsFormSecondImpl.setBonaAnnualProjectedOne("");
		}
		else {
			tourismBonaWaterSportsFormSecondImpl.setBonaAnnualProjectedOne(
				bonaAnnualProjectedOne);
		}

		if (bonaAnnualProjectedTwo == null) {
			tourismBonaWaterSportsFormSecondImpl.setBonaAnnualProjectedTwo("");
		}
		else {
			tourismBonaWaterSportsFormSecondImpl.setBonaAnnualProjectedTwo(
				bonaAnnualProjectedTwo);
		}

		if (bonaAnnualProjectedThree == null) {
			tourismBonaWaterSportsFormSecondImpl.setBonaAnnualProjectedThree(
				"");
		}
		else {
			tourismBonaWaterSportsFormSecondImpl.setBonaAnnualProjectedThree(
				bonaAnnualProjectedThree);
		}

		if (bonaAnnualProjectedNumber == null) {
			tourismBonaWaterSportsFormSecondImpl.setBonaAnnualProjectedNumber(
				"");
		}
		else {
			tourismBonaWaterSportsFormSecondImpl.setBonaAnnualProjectedNumber(
				bonaAnnualProjectedNumber);
		}

		tourismBonaWaterSportsFormSecondImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismBonaWaterSportsFormSecondImpl.resetOriginalValues();

		return tourismBonaWaterSportsFormSecondImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismBonaWaterSportsFSecId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		bonaTargetMarketLocal = objectInput.readUTF();
		bonaTargetMarketForeign = objectInput.readUTF();
		bonaTargetMarketCountries = objectInput.readUTF();
		bonaOwnerCountryOfOrigin = objectInput.readUTF();
		bonaOwnerJointVenture = objectInput.readUTF();
		bonaOwnerLocal = objectInput.readUTF();
		bonaOwnerForeign = objectInput.readUTF();
		bonaCapitalizationUSComponent = objectInput.readUTF();
		bonaCapitalizationJEquivalent = objectInput.readUTF();
		bonaCapitalizationRateExchange = objectInput.readUTF();
		bonaCapitalizationJComponent = objectInput.readUTF();
		bonaCapitalCapitalInvest = objectInput.readUTF();
		bonaSourcesLoan = objectInput.readUTF();
		bonaSourcesEquity = objectInput.readUTF();
		bonaSourcesStateOfFinanc = objectInput.readUTF();
		bonaAnnualProjectedOne = objectInput.readUTF();
		bonaAnnualProjectedTwo = objectInput.readUTF();
		bonaAnnualProjectedThree = objectInput.readUTF();
		bonaAnnualProjectedNumber = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismBonaWaterSportsFSecId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (bonaTargetMarketLocal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaTargetMarketLocal);
		}

		if (bonaTargetMarketForeign == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaTargetMarketForeign);
		}

		if (bonaTargetMarketCountries == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaTargetMarketCountries);
		}

		if (bonaOwnerCountryOfOrigin == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaOwnerCountryOfOrigin);
		}

		if (bonaOwnerJointVenture == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaOwnerJointVenture);
		}

		if (bonaOwnerLocal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaOwnerLocal);
		}

		if (bonaOwnerForeign == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaOwnerForeign);
		}

		if (bonaCapitalizationUSComponent == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaCapitalizationUSComponent);
		}

		if (bonaCapitalizationJEquivalent == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaCapitalizationJEquivalent);
		}

		if (bonaCapitalizationRateExchange == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaCapitalizationRateExchange);
		}

		if (bonaCapitalizationJComponent == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaCapitalizationJComponent);
		}

		if (bonaCapitalCapitalInvest == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaCapitalCapitalInvest);
		}

		if (bonaSourcesLoan == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaSourcesLoan);
		}

		if (bonaSourcesEquity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaSourcesEquity);
		}

		if (bonaSourcesStateOfFinanc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaSourcesStateOfFinanc);
		}

		if (bonaAnnualProjectedOne == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAnnualProjectedOne);
		}

		if (bonaAnnualProjectedTwo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAnnualProjectedTwo);
		}

		if (bonaAnnualProjectedThree == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAnnualProjectedThree);
		}

		if (bonaAnnualProjectedNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAnnualProjectedNumber);
		}

		objectOutput.writeLong(tourismApplicationId);
	}

	public long tourismBonaWaterSportsFSecId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String bonaTargetMarketLocal;
	public String bonaTargetMarketForeign;
	public String bonaTargetMarketCountries;
	public String bonaOwnerCountryOfOrigin;
	public String bonaOwnerJointVenture;
	public String bonaOwnerLocal;
	public String bonaOwnerForeign;
	public String bonaCapitalizationUSComponent;
	public String bonaCapitalizationJEquivalent;
	public String bonaCapitalizationRateExchange;
	public String bonaCapitalizationJComponent;
	public String bonaCapitalCapitalInvest;
	public String bonaSourcesLoan;
	public String bonaSourcesEquity;
	public String bonaSourcesStateOfFinanc;
	public String bonaAnnualProjectedOne;
	public String bonaAnnualProjectedTwo;
	public String bonaAnnualProjectedThree;
	public String bonaAnnualProjectedNumber;
	public long tourismApplicationId;

}