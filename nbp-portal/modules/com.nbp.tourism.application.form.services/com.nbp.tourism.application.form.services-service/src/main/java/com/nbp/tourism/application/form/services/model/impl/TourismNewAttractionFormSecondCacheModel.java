/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismNewAttractionFormSecond;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismNewAttractionFormSecond in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismNewAttractionFormSecondCacheModel
	implements CacheModel<TourismNewAttractionFormSecond>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismNewAttractionFormSecondCacheModel)) {
			return false;
		}

		TourismNewAttractionFormSecondCacheModel
			tourismNewAttractionFormSecondCacheModel =
				(TourismNewAttractionFormSecondCacheModel)object;

		if (tourismNewAttractionFormSecId ==
				tourismNewAttractionFormSecondCacheModel.
					tourismNewAttractionFormSecId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismNewAttractionFormSecId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(55);

		sb.append("{tourismNewAttractionFormSecId=");
		sb.append(tourismNewAttractionFormSecId);
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
		sb.append(", targetMarketLocal=");
		sb.append(targetMarketLocal);
		sb.append(", targetMarketForeign=");
		sb.append(targetMarketForeign);
		sb.append(", targetMarketCountries=");
		sb.append(targetMarketCountries);
		sb.append(", ownerCountryOfOrigin=");
		sb.append(ownerCountryOfOrigin);
		sb.append(", ownerJointVenture=");
		sb.append(ownerJointVenture);
		sb.append(", ownerLocal=");
		sb.append(ownerLocal);
		sb.append(", ownerForeign=");
		sb.append(ownerForeign);
		sb.append(", capitalizationUSComponent=");
		sb.append(capitalizationUSComponent);
		sb.append(", capitalizationJEquivalent=");
		sb.append(capitalizationJEquivalent);
		sb.append(", capitalizationRateOfExchange=");
		sb.append(capitalizationRateOfExchange);
		sb.append(", capitalizationJComponent=");
		sb.append(capitalizationJComponent);
		sb.append(", capitalizationCapitalInvest=");
		sb.append(capitalizationCapitalInvest);
		sb.append(", sourcesLoan =");
		sb.append(sourcesLoan);
		sb.append(", sourcesEquity=");
		sb.append(sourcesEquity);
		sb.append(", sourcesStateSourceOfLoanFinanc=");
		sb.append(sourcesStateSourceOfLoanFinanc);
		sb.append(", annualProjectedOne =");
		sb.append(annualProjectedOne);
		sb.append(", annualProjectedTwo=");
		sb.append(annualProjectedTwo);
		sb.append(", annualProjectedThree =");
		sb.append(annualProjectedThree);
		sb.append(", annualProjectedNumber=");
		sb.append(annualProjectedNumber);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismNewAttractionFormSecond toEntityModel() {
		TourismNewAttractionFormSecondImpl tourismNewAttractionFormSecondImpl =
			new TourismNewAttractionFormSecondImpl();

		tourismNewAttractionFormSecondImpl.setTourismNewAttractionFormSecId(
			tourismNewAttractionFormSecId);
		tourismNewAttractionFormSecondImpl.setGroupId(groupId);
		tourismNewAttractionFormSecondImpl.setCompanyId(companyId);
		tourismNewAttractionFormSecondImpl.setUserId(userId);

		if (userName == null) {
			tourismNewAttractionFormSecondImpl.setUserName("");
		}
		else {
			tourismNewAttractionFormSecondImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismNewAttractionFormSecondImpl.setCreateDate(null);
		}
		else {
			tourismNewAttractionFormSecondImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismNewAttractionFormSecondImpl.setModifiedDate(null);
		}
		else {
			tourismNewAttractionFormSecondImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (targetMarketLocal == null) {
			tourismNewAttractionFormSecondImpl.setTargetMarketLocal("");
		}
		else {
			tourismNewAttractionFormSecondImpl.setTargetMarketLocal(
				targetMarketLocal);
		}

		if (targetMarketForeign == null) {
			tourismNewAttractionFormSecondImpl.setTargetMarketForeign("");
		}
		else {
			tourismNewAttractionFormSecondImpl.setTargetMarketForeign(
				targetMarketForeign);
		}

		if (targetMarketCountries == null) {
			tourismNewAttractionFormSecondImpl.setTargetMarketCountries("");
		}
		else {
			tourismNewAttractionFormSecondImpl.setTargetMarketCountries(
				targetMarketCountries);
		}

		if (ownerCountryOfOrigin == null) {
			tourismNewAttractionFormSecondImpl.setOwnerCountryOfOrigin("");
		}
		else {
			tourismNewAttractionFormSecondImpl.setOwnerCountryOfOrigin(
				ownerCountryOfOrigin);
		}

		if (ownerJointVenture == null) {
			tourismNewAttractionFormSecondImpl.setOwnerJointVenture("");
		}
		else {
			tourismNewAttractionFormSecondImpl.setOwnerJointVenture(
				ownerJointVenture);
		}

		if (ownerLocal == null) {
			tourismNewAttractionFormSecondImpl.setOwnerLocal("");
		}
		else {
			tourismNewAttractionFormSecondImpl.setOwnerLocal(ownerLocal);
		}

		if (ownerForeign == null) {
			tourismNewAttractionFormSecondImpl.setOwnerForeign("");
		}
		else {
			tourismNewAttractionFormSecondImpl.setOwnerForeign(ownerForeign);
		}

		if (capitalizationUSComponent == null) {
			tourismNewAttractionFormSecondImpl.setCapitalizationUSComponent("");
		}
		else {
			tourismNewAttractionFormSecondImpl.setCapitalizationUSComponent(
				capitalizationUSComponent);
		}

		if (capitalizationJEquivalent == null) {
			tourismNewAttractionFormSecondImpl.setCapitalizationJEquivalent("");
		}
		else {
			tourismNewAttractionFormSecondImpl.setCapitalizationJEquivalent(
				capitalizationJEquivalent);
		}

		if (capitalizationRateOfExchange == null) {
			tourismNewAttractionFormSecondImpl.setCapitalizationRateOfExchange(
				"");
		}
		else {
			tourismNewAttractionFormSecondImpl.setCapitalizationRateOfExchange(
				capitalizationRateOfExchange);
		}

		if (capitalizationJComponent == null) {
			tourismNewAttractionFormSecondImpl.setCapitalizationJComponent("");
		}
		else {
			tourismNewAttractionFormSecondImpl.setCapitalizationJComponent(
				capitalizationJComponent);
		}

		if (capitalizationCapitalInvest == null) {
			tourismNewAttractionFormSecondImpl.setCapitalizationCapitalInvest(
				"");
		}
		else {
			tourismNewAttractionFormSecondImpl.setCapitalizationCapitalInvest(
				capitalizationCapitalInvest);
		}

		if (sourcesLoan == null) {
			tourismNewAttractionFormSecondImpl.setSourcesLoan("");
		}
		else {
			tourismNewAttractionFormSecondImpl.setSourcesLoan(sourcesLoan);
		}

		if (sourcesEquity == null) {
			tourismNewAttractionFormSecondImpl.setSourcesEquity("");
		}
		else {
			tourismNewAttractionFormSecondImpl.setSourcesEquity(sourcesEquity);
		}

		if (sourcesStateSourceOfLoanFinanc == null) {
			tourismNewAttractionFormSecondImpl.
				setSourcesStateSourceOfLoanFinanc("");
		}
		else {
			tourismNewAttractionFormSecondImpl.
				setSourcesStateSourceOfLoanFinanc(
					sourcesStateSourceOfLoanFinanc);
		}

		if (annualProjectedOne == null) {
			tourismNewAttractionFormSecondImpl.setAnnualProjectedOne("");
		}
		else {
			tourismNewAttractionFormSecondImpl.setAnnualProjectedOne(
				annualProjectedOne);
		}

		if (annualProjectedTwo == null) {
			tourismNewAttractionFormSecondImpl.setAnnualProjectedTwo("");
		}
		else {
			tourismNewAttractionFormSecondImpl.setAnnualProjectedTwo(
				annualProjectedTwo);
		}

		if (annualProjectedThree == null) {
			tourismNewAttractionFormSecondImpl.setAnnualProjectedThree("");
		}
		else {
			tourismNewAttractionFormSecondImpl.setAnnualProjectedThree(
				annualProjectedThree);
		}

		if (annualProjectedNumber == null) {
			tourismNewAttractionFormSecondImpl.setAnnualProjectedNumber("");
		}
		else {
			tourismNewAttractionFormSecondImpl.setAnnualProjectedNumber(
				annualProjectedNumber);
		}

		tourismNewAttractionFormSecondImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismNewAttractionFormSecondImpl.resetOriginalValues();

		return tourismNewAttractionFormSecondImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismNewAttractionFormSecId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		targetMarketLocal = objectInput.readUTF();
		targetMarketForeign = objectInput.readUTF();
		targetMarketCountries = objectInput.readUTF();
		ownerCountryOfOrigin = objectInput.readUTF();
		ownerJointVenture = objectInput.readUTF();
		ownerLocal = objectInput.readUTF();
		ownerForeign = objectInput.readUTF();
		capitalizationUSComponent = objectInput.readUTF();
		capitalizationJEquivalent = objectInput.readUTF();
		capitalizationRateOfExchange = objectInput.readUTF();
		capitalizationJComponent = objectInput.readUTF();
		capitalizationCapitalInvest = objectInput.readUTF();
		sourcesLoan = objectInput.readUTF();
		sourcesEquity = objectInput.readUTF();
		sourcesStateSourceOfLoanFinanc = objectInput.readUTF();
		annualProjectedOne = objectInput.readUTF();
		annualProjectedTwo = objectInput.readUTF();
		annualProjectedThree = objectInput.readUTF();
		annualProjectedNumber = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismNewAttractionFormSecId);

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

		if (targetMarketLocal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(targetMarketLocal);
		}

		if (targetMarketForeign == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(targetMarketForeign);
		}

		if (targetMarketCountries == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(targetMarketCountries);
		}

		if (ownerCountryOfOrigin == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ownerCountryOfOrigin);
		}

		if (ownerJointVenture == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ownerJointVenture);
		}

		if (ownerLocal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ownerLocal);
		}

		if (ownerForeign == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ownerForeign);
		}

		if (capitalizationUSComponent == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(capitalizationUSComponent);
		}

		if (capitalizationJEquivalent == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(capitalizationJEquivalent);
		}

		if (capitalizationRateOfExchange == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(capitalizationRateOfExchange);
		}

		if (capitalizationJComponent == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(capitalizationJComponent);
		}

		if (capitalizationCapitalInvest == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(capitalizationCapitalInvest);
		}

		if (sourcesLoan == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sourcesLoan);
		}

		if (sourcesEquity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sourcesEquity);
		}

		if (sourcesStateSourceOfLoanFinanc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sourcesStateSourceOfLoanFinanc);
		}

		if (annualProjectedOne == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(annualProjectedOne);
		}

		if (annualProjectedTwo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(annualProjectedTwo);
		}

		if (annualProjectedThree == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(annualProjectedThree);
		}

		if (annualProjectedNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(annualProjectedNumber);
		}

		objectOutput.writeLong(tourismApplicationId);
	}

	public long tourismNewAttractionFormSecId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String targetMarketLocal;
	public String targetMarketForeign;
	public String targetMarketCountries;
	public String ownerCountryOfOrigin;
	public String ownerJointVenture;
	public String ownerLocal;
	public String ownerForeign;
	public String capitalizationUSComponent;
	public String capitalizationJEquivalent;
	public String capitalizationRateOfExchange;
	public String capitalizationJComponent;
	public String capitalizationCapitalInvest;
	public String sourcesLoan;
	public String sourcesEquity;
	public String sourcesStateSourceOfLoanFinanc;
	public String annualProjectedOne;
	public String annualProjectedTwo;
	public String annualProjectedThree;
	public String annualProjectedNumber;
	public long tourismApplicationId;

}