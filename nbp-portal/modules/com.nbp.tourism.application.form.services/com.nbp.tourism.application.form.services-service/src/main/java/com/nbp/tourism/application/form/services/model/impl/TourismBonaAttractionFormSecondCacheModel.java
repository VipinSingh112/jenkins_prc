/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismBonaAttractionFormSecond;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismBonaAttractionFormSecond in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismBonaAttractionFormSecondCacheModel
	implements CacheModel<TourismBonaAttractionFormSecond>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismBonaAttractionFormSecondCacheModel)) {
			return false;
		}

		TourismBonaAttractionFormSecondCacheModel
			tourismBonaAttractionFormSecondCacheModel =
				(TourismBonaAttractionFormSecondCacheModel)object;

		if (tourismBonaAttractFormSecId ==
				tourismBonaAttractionFormSecondCacheModel.
					tourismBonaAttractFormSecId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismBonaAttractFormSecId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(55);

		sb.append("{tourismBonaAttractFormSecId=");
		sb.append(tourismBonaAttractFormSecId);
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
		sb.append(", bonaCapitalUSComponent=");
		sb.append(bonaCapitalUSComponent);
		sb.append(", bonaCapitalizationJEquivalent=");
		sb.append(bonaCapitalizationJEquivalent);
		sb.append(", bonaCapitalRateOfExchange=");
		sb.append(bonaCapitalRateOfExchange);
		sb.append(", bonaCapitalizationJComponent=");
		sb.append(bonaCapitalizationJComponent);
		sb.append(", bonaCapitalCapitalInvest=");
		sb.append(bonaCapitalCapitalInvest);
		sb.append(", bonaSourcesLoan =");
		sb.append(bonaSourcesLoan);
		sb.append(", bonaSourcesEquity=");
		sb.append(bonaSourcesEquity);
		sb.append(", bonaSourcesStateOfLoanFinanc=");
		sb.append(bonaSourcesStateOfLoanFinanc);
		sb.append(", bonaAnnualProjectedYearOne =");
		sb.append(bonaAnnualProjectedYearOne);
		sb.append(", bonaAnnualProjectedYearTwo=");
		sb.append(bonaAnnualProjectedYearTwo);
		sb.append(", bonaAnnualProjectedYearThree =");
		sb.append(bonaAnnualProjectedYearThree);
		sb.append(", bonaAnnualProjectedNumber=");
		sb.append(bonaAnnualProjectedNumber);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismBonaAttractionFormSecond toEntityModel() {
		TourismBonaAttractionFormSecondImpl
			tourismBonaAttractionFormSecondImpl =
				new TourismBonaAttractionFormSecondImpl();

		tourismBonaAttractionFormSecondImpl.setTourismBonaAttractFormSecId(
			tourismBonaAttractFormSecId);
		tourismBonaAttractionFormSecondImpl.setGroupId(groupId);
		tourismBonaAttractionFormSecondImpl.setCompanyId(companyId);
		tourismBonaAttractionFormSecondImpl.setUserId(userId);

		if (userName == null) {
			tourismBonaAttractionFormSecondImpl.setUserName("");
		}
		else {
			tourismBonaAttractionFormSecondImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismBonaAttractionFormSecondImpl.setCreateDate(null);
		}
		else {
			tourismBonaAttractionFormSecondImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismBonaAttractionFormSecondImpl.setModifiedDate(null);
		}
		else {
			tourismBonaAttractionFormSecondImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (bonaTargetMarketLocal == null) {
			tourismBonaAttractionFormSecondImpl.setBonaTargetMarketLocal("");
		}
		else {
			tourismBonaAttractionFormSecondImpl.setBonaTargetMarketLocal(
				bonaTargetMarketLocal);
		}

		if (bonaTargetMarketForeign == null) {
			tourismBonaAttractionFormSecondImpl.setBonaTargetMarketForeign("");
		}
		else {
			tourismBonaAttractionFormSecondImpl.setBonaTargetMarketForeign(
				bonaTargetMarketForeign);
		}

		if (bonaTargetMarketCountries == null) {
			tourismBonaAttractionFormSecondImpl.setBonaTargetMarketCountries(
				"");
		}
		else {
			tourismBonaAttractionFormSecondImpl.setBonaTargetMarketCountries(
				bonaTargetMarketCountries);
		}

		if (bonaOwnerCountryOfOrigin == null) {
			tourismBonaAttractionFormSecondImpl.setBonaOwnerCountryOfOrigin("");
		}
		else {
			tourismBonaAttractionFormSecondImpl.setBonaOwnerCountryOfOrigin(
				bonaOwnerCountryOfOrigin);
		}

		if (bonaOwnerJointVenture == null) {
			tourismBonaAttractionFormSecondImpl.setBonaOwnerJointVenture("");
		}
		else {
			tourismBonaAttractionFormSecondImpl.setBonaOwnerJointVenture(
				bonaOwnerJointVenture);
		}

		if (bonaOwnerLocal == null) {
			tourismBonaAttractionFormSecondImpl.setBonaOwnerLocal("");
		}
		else {
			tourismBonaAttractionFormSecondImpl.setBonaOwnerLocal(
				bonaOwnerLocal);
		}

		if (bonaOwnerForeign == null) {
			tourismBonaAttractionFormSecondImpl.setBonaOwnerForeign("");
		}
		else {
			tourismBonaAttractionFormSecondImpl.setBonaOwnerForeign(
				bonaOwnerForeign);
		}

		if (bonaCapitalUSComponent == null) {
			tourismBonaAttractionFormSecondImpl.setBonaCapitalUSComponent("");
		}
		else {
			tourismBonaAttractionFormSecondImpl.setBonaCapitalUSComponent(
				bonaCapitalUSComponent);
		}

		if (bonaCapitalizationJEquivalent == null) {
			tourismBonaAttractionFormSecondImpl.
				setBonaCapitalizationJEquivalent("");
		}
		else {
			tourismBonaAttractionFormSecondImpl.
				setBonaCapitalizationJEquivalent(bonaCapitalizationJEquivalent);
		}

		if (bonaCapitalRateOfExchange == null) {
			tourismBonaAttractionFormSecondImpl.setBonaCapitalRateOfExchange(
				"");
		}
		else {
			tourismBonaAttractionFormSecondImpl.setBonaCapitalRateOfExchange(
				bonaCapitalRateOfExchange);
		}

		if (bonaCapitalizationJComponent == null) {
			tourismBonaAttractionFormSecondImpl.setBonaCapitalizationJComponent(
				"");
		}
		else {
			tourismBonaAttractionFormSecondImpl.setBonaCapitalizationJComponent(
				bonaCapitalizationJComponent);
		}

		if (bonaCapitalCapitalInvest == null) {
			tourismBonaAttractionFormSecondImpl.setBonaCapitalCapitalInvest("");
		}
		else {
			tourismBonaAttractionFormSecondImpl.setBonaCapitalCapitalInvest(
				bonaCapitalCapitalInvest);
		}

		if (bonaSourcesLoan == null) {
			tourismBonaAttractionFormSecondImpl.setBonaSourcesLoan("");
		}
		else {
			tourismBonaAttractionFormSecondImpl.setBonaSourcesLoan(
				bonaSourcesLoan);
		}

		if (bonaSourcesEquity == null) {
			tourismBonaAttractionFormSecondImpl.setBonaSourcesEquity("");
		}
		else {
			tourismBonaAttractionFormSecondImpl.setBonaSourcesEquity(
				bonaSourcesEquity);
		}

		if (bonaSourcesStateOfLoanFinanc == null) {
			tourismBonaAttractionFormSecondImpl.setBonaSourcesStateOfLoanFinanc(
				"");
		}
		else {
			tourismBonaAttractionFormSecondImpl.setBonaSourcesStateOfLoanFinanc(
				bonaSourcesStateOfLoanFinanc);
		}

		if (bonaAnnualProjectedYearOne == null) {
			tourismBonaAttractionFormSecondImpl.setBonaAnnualProjectedYearOne(
				"");
		}
		else {
			tourismBonaAttractionFormSecondImpl.setBonaAnnualProjectedYearOne(
				bonaAnnualProjectedYearOne);
		}

		if (bonaAnnualProjectedYearTwo == null) {
			tourismBonaAttractionFormSecondImpl.setBonaAnnualProjectedYearTwo(
				"");
		}
		else {
			tourismBonaAttractionFormSecondImpl.setBonaAnnualProjectedYearTwo(
				bonaAnnualProjectedYearTwo);
		}

		if (bonaAnnualProjectedYearThree == null) {
			tourismBonaAttractionFormSecondImpl.setBonaAnnualProjectedYearThree(
				"");
		}
		else {
			tourismBonaAttractionFormSecondImpl.setBonaAnnualProjectedYearThree(
				bonaAnnualProjectedYearThree);
		}

		if (bonaAnnualProjectedNumber == null) {
			tourismBonaAttractionFormSecondImpl.setBonaAnnualProjectedNumber(
				"");
		}
		else {
			tourismBonaAttractionFormSecondImpl.setBonaAnnualProjectedNumber(
				bonaAnnualProjectedNumber);
		}

		tourismBonaAttractionFormSecondImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismBonaAttractionFormSecondImpl.resetOriginalValues();

		return tourismBonaAttractionFormSecondImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismBonaAttractFormSecId = objectInput.readLong();

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
		bonaCapitalUSComponent = objectInput.readUTF();
		bonaCapitalizationJEquivalent = objectInput.readUTF();
		bonaCapitalRateOfExchange = objectInput.readUTF();
		bonaCapitalizationJComponent = objectInput.readUTF();
		bonaCapitalCapitalInvest = objectInput.readUTF();
		bonaSourcesLoan = objectInput.readUTF();
		bonaSourcesEquity = objectInput.readUTF();
		bonaSourcesStateOfLoanFinanc = objectInput.readUTF();
		bonaAnnualProjectedYearOne = objectInput.readUTF();
		bonaAnnualProjectedYearTwo = objectInput.readUTF();
		bonaAnnualProjectedYearThree = objectInput.readUTF();
		bonaAnnualProjectedNumber = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismBonaAttractFormSecId);

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

		if (bonaCapitalUSComponent == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaCapitalUSComponent);
		}

		if (bonaCapitalizationJEquivalent == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaCapitalizationJEquivalent);
		}

		if (bonaCapitalRateOfExchange == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaCapitalRateOfExchange);
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

		if (bonaSourcesStateOfLoanFinanc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaSourcesStateOfLoanFinanc);
		}

		if (bonaAnnualProjectedYearOne == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAnnualProjectedYearOne);
		}

		if (bonaAnnualProjectedYearTwo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAnnualProjectedYearTwo);
		}

		if (bonaAnnualProjectedYearThree == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAnnualProjectedYearThree);
		}

		if (bonaAnnualProjectedNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAnnualProjectedNumber);
		}

		objectOutput.writeLong(tourismApplicationId);
	}

	public long tourismBonaAttractFormSecId;
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
	public String bonaCapitalUSComponent;
	public String bonaCapitalizationJEquivalent;
	public String bonaCapitalRateOfExchange;
	public String bonaCapitalizationJComponent;
	public String bonaCapitalCapitalInvest;
	public String bonaSourcesLoan;
	public String bonaSourcesEquity;
	public String bonaSourcesStateOfLoanFinanc;
	public String bonaAnnualProjectedYearOne;
	public String bonaAnnualProjectedYearTwo;
	public String bonaAnnualProjectedYearThree;
	public String bonaAnnualProjectedNumber;
	public long tourismApplicationId;

}