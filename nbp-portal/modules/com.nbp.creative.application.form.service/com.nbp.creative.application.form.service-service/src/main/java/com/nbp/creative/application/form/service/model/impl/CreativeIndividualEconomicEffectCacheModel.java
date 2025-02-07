/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.creative.application.form.service.model.CreativeIndividualEconomicEffect;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CreativeIndividualEconomicEffect in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CreativeIndividualEconomicEffectCacheModel
	implements CacheModel<CreativeIndividualEconomicEffect>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CreativeIndividualEconomicEffectCacheModel)) {
			return false;
		}

		CreativeIndividualEconomicEffectCacheModel
			creativeIndividualEconomicEffectCacheModel =
				(CreativeIndividualEconomicEffectCacheModel)object;

		if (creativeIndiEcoEffectId ==
				creativeIndividualEconomicEffectCacheModel.
					creativeIndiEcoEffectId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, creativeIndiEcoEffectId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(59);

		sb.append("{creativeIndiEcoEffectId=");
		sb.append(creativeIndiEcoEffectId);
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
		sb.append(", shareCapitalJmd=");
		sb.append(shareCapitalJmd);
		sb.append(", shareCapitalExchangeRate=");
		sb.append(shareCapitalExchangeRate);
		sb.append(", shareCapitalUsd=");
		sb.append(shareCapitalUsd);
		sb.append(", localCapitalJmd=");
		sb.append(localCapitalJmd);
		sb.append(", localCapitalExchangeRate=");
		sb.append(localCapitalExchangeRate);
		sb.append(", localCapitalUsd=");
		sb.append(localCapitalUsd);
		sb.append(", otherJmd=");
		sb.append(otherJmd);
		sb.append(", otherExchangeRate=");
		sb.append(otherExchangeRate);
		sb.append(", otherUsd=");
		sb.append(otherUsd);
		sb.append(", estimatedLocalExpenditure=");
		sb.append(estimatedLocalExpenditure);
		sb.append(", otherEstimatedLocal =");
		sb.append(otherEstimatedLocal);
		sb.append(", annualYearOne=");
		sb.append(annualYearOne);
		sb.append(", annualOneUsd=");
		sb.append(annualOneUsd);
		sb.append(", annualYearTwo=");
		sb.append(annualYearTwo);
		sb.append(", annualTwoUsd=");
		sb.append(annualTwoUsd);
		sb.append(", annualYearThree=");
		sb.append(annualYearThree);
		sb.append(", annualThreeUsd=");
		sb.append(annualThreeUsd);
		sb.append(", targetMarketLocal=");
		sb.append(targetMarketLocal);
		sb.append(", targetMarketForeign=");
		sb.append(targetMarketForeign);
		sb.append(", targetMarketCountries=");
		sb.append(targetMarketCountries);
		sb.append(", declareInformationProvide=");
		sb.append(declareInformationProvide);
		sb.append(", CreativeApplicationId=");
		sb.append(CreativeApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CreativeIndividualEconomicEffect toEntityModel() {
		CreativeIndividualEconomicEffectImpl
			creativeIndividualEconomicEffectImpl =
				new CreativeIndividualEconomicEffectImpl();

		creativeIndividualEconomicEffectImpl.setCreativeIndiEcoEffectId(
			creativeIndiEcoEffectId);
		creativeIndividualEconomicEffectImpl.setGroupId(groupId);
		creativeIndividualEconomicEffectImpl.setCompanyId(companyId);
		creativeIndividualEconomicEffectImpl.setUserId(userId);

		if (userName == null) {
			creativeIndividualEconomicEffectImpl.setUserName("");
		}
		else {
			creativeIndividualEconomicEffectImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			creativeIndividualEconomicEffectImpl.setCreateDate(null);
		}
		else {
			creativeIndividualEconomicEffectImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			creativeIndividualEconomicEffectImpl.setModifiedDate(null);
		}
		else {
			creativeIndividualEconomicEffectImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (shareCapitalJmd == null) {
			creativeIndividualEconomicEffectImpl.setShareCapitalJmd("");
		}
		else {
			creativeIndividualEconomicEffectImpl.setShareCapitalJmd(
				shareCapitalJmd);
		}

		if (shareCapitalExchangeRate == null) {
			creativeIndividualEconomicEffectImpl.setShareCapitalExchangeRate(
				"");
		}
		else {
			creativeIndividualEconomicEffectImpl.setShareCapitalExchangeRate(
				shareCapitalExchangeRate);
		}

		if (shareCapitalUsd == null) {
			creativeIndividualEconomicEffectImpl.setShareCapitalUsd("");
		}
		else {
			creativeIndividualEconomicEffectImpl.setShareCapitalUsd(
				shareCapitalUsd);
		}

		if (localCapitalJmd == null) {
			creativeIndividualEconomicEffectImpl.setLocalCapitalJmd("");
		}
		else {
			creativeIndividualEconomicEffectImpl.setLocalCapitalJmd(
				localCapitalJmd);
		}

		if (localCapitalExchangeRate == null) {
			creativeIndividualEconomicEffectImpl.setLocalCapitalExchangeRate(
				"");
		}
		else {
			creativeIndividualEconomicEffectImpl.setLocalCapitalExchangeRate(
				localCapitalExchangeRate);
		}

		if (localCapitalUsd == null) {
			creativeIndividualEconomicEffectImpl.setLocalCapitalUsd("");
		}
		else {
			creativeIndividualEconomicEffectImpl.setLocalCapitalUsd(
				localCapitalUsd);
		}

		if (otherJmd == null) {
			creativeIndividualEconomicEffectImpl.setOtherJmd("");
		}
		else {
			creativeIndividualEconomicEffectImpl.setOtherJmd(otherJmd);
		}

		if (otherExchangeRate == null) {
			creativeIndividualEconomicEffectImpl.setOtherExchangeRate("");
		}
		else {
			creativeIndividualEconomicEffectImpl.setOtherExchangeRate(
				otherExchangeRate);
		}

		if (otherUsd == null) {
			creativeIndividualEconomicEffectImpl.setOtherUsd("");
		}
		else {
			creativeIndividualEconomicEffectImpl.setOtherUsd(otherUsd);
		}

		if (estimatedLocalExpenditure == null) {
			creativeIndividualEconomicEffectImpl.setEstimatedLocalExpenditure(
				"");
		}
		else {
			creativeIndividualEconomicEffectImpl.setEstimatedLocalExpenditure(
				estimatedLocalExpenditure);
		}

		if (otherEstimatedLocal == null) {
			creativeIndividualEconomicEffectImpl.setOtherEstimatedLocal("");
		}
		else {
			creativeIndividualEconomicEffectImpl.setOtherEstimatedLocal(
				otherEstimatedLocal);
		}

		if (annualYearOne == null) {
			creativeIndividualEconomicEffectImpl.setAnnualYearOne("");
		}
		else {
			creativeIndividualEconomicEffectImpl.setAnnualYearOne(
				annualYearOne);
		}

		if (annualOneUsd == null) {
			creativeIndividualEconomicEffectImpl.setAnnualOneUsd("");
		}
		else {
			creativeIndividualEconomicEffectImpl.setAnnualOneUsd(annualOneUsd);
		}

		if (annualYearTwo == null) {
			creativeIndividualEconomicEffectImpl.setAnnualYearTwo("");
		}
		else {
			creativeIndividualEconomicEffectImpl.setAnnualYearTwo(
				annualYearTwo);
		}

		if (annualTwoUsd == null) {
			creativeIndividualEconomicEffectImpl.setAnnualTwoUsd("");
		}
		else {
			creativeIndividualEconomicEffectImpl.setAnnualTwoUsd(annualTwoUsd);
		}

		if (annualYearThree == null) {
			creativeIndividualEconomicEffectImpl.setAnnualYearThree("");
		}
		else {
			creativeIndividualEconomicEffectImpl.setAnnualYearThree(
				annualYearThree);
		}

		if (annualThreeUsd == null) {
			creativeIndividualEconomicEffectImpl.setAnnualThreeUsd("");
		}
		else {
			creativeIndividualEconomicEffectImpl.setAnnualThreeUsd(
				annualThreeUsd);
		}

		if (targetMarketLocal == null) {
			creativeIndividualEconomicEffectImpl.setTargetMarketLocal("");
		}
		else {
			creativeIndividualEconomicEffectImpl.setTargetMarketLocal(
				targetMarketLocal);
		}

		if (targetMarketForeign == null) {
			creativeIndividualEconomicEffectImpl.setTargetMarketForeign("");
		}
		else {
			creativeIndividualEconomicEffectImpl.setTargetMarketForeign(
				targetMarketForeign);
		}

		if (targetMarketCountries == null) {
			creativeIndividualEconomicEffectImpl.setTargetMarketCountries("");
		}
		else {
			creativeIndividualEconomicEffectImpl.setTargetMarketCountries(
				targetMarketCountries);
		}

		if (declareInformationProvide == null) {
			creativeIndividualEconomicEffectImpl.setDeclareInformationProvide(
				"");
		}
		else {
			creativeIndividualEconomicEffectImpl.setDeclareInformationProvide(
				declareInformationProvide);
		}

		creativeIndividualEconomicEffectImpl.setCreativeApplicationId(
			CreativeApplicationId);

		creativeIndividualEconomicEffectImpl.resetOriginalValues();

		return creativeIndividualEconomicEffectImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		creativeIndiEcoEffectId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		shareCapitalJmd = objectInput.readUTF();
		shareCapitalExchangeRate = objectInput.readUTF();
		shareCapitalUsd = objectInput.readUTF();
		localCapitalJmd = objectInput.readUTF();
		localCapitalExchangeRate = objectInput.readUTF();
		localCapitalUsd = objectInput.readUTF();
		otherJmd = objectInput.readUTF();
		otherExchangeRate = objectInput.readUTF();
		otherUsd = objectInput.readUTF();
		estimatedLocalExpenditure = objectInput.readUTF();
		otherEstimatedLocal = objectInput.readUTF();
		annualYearOne = objectInput.readUTF();
		annualOneUsd = objectInput.readUTF();
		annualYearTwo = objectInput.readUTF();
		annualTwoUsd = objectInput.readUTF();
		annualYearThree = objectInput.readUTF();
		annualThreeUsd = objectInput.readUTF();
		targetMarketLocal = objectInput.readUTF();
		targetMarketForeign = objectInput.readUTF();
		targetMarketCountries = objectInput.readUTF();
		declareInformationProvide = objectInput.readUTF();

		CreativeApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(creativeIndiEcoEffectId);

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

		if (shareCapitalJmd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(shareCapitalJmd);
		}

		if (shareCapitalExchangeRate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(shareCapitalExchangeRate);
		}

		if (shareCapitalUsd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(shareCapitalUsd);
		}

		if (localCapitalJmd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(localCapitalJmd);
		}

		if (localCapitalExchangeRate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(localCapitalExchangeRate);
		}

		if (localCapitalUsd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(localCapitalUsd);
		}

		if (otherJmd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherJmd);
		}

		if (otherExchangeRate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherExchangeRate);
		}

		if (otherUsd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherUsd);
		}

		if (estimatedLocalExpenditure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(estimatedLocalExpenditure);
		}

		if (otherEstimatedLocal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherEstimatedLocal);
		}

		if (annualYearOne == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(annualYearOne);
		}

		if (annualOneUsd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(annualOneUsd);
		}

		if (annualYearTwo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(annualYearTwo);
		}

		if (annualTwoUsd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(annualTwoUsd);
		}

		if (annualYearThree == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(annualYearThree);
		}

		if (annualThreeUsd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(annualThreeUsd);
		}

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

		if (declareInformationProvide == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(declareInformationProvide);
		}

		objectOutput.writeLong(CreativeApplicationId);
	}

	public long creativeIndiEcoEffectId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String shareCapitalJmd;
	public String shareCapitalExchangeRate;
	public String shareCapitalUsd;
	public String localCapitalJmd;
	public String localCapitalExchangeRate;
	public String localCapitalUsd;
	public String otherJmd;
	public String otherExchangeRate;
	public String otherUsd;
	public String estimatedLocalExpenditure;
	public String otherEstimatedLocal;
	public String annualYearOne;
	public String annualOneUsd;
	public String annualYearTwo;
	public String annualTwoUsd;
	public String annualYearThree;
	public String annualThreeUsd;
	public String targetMarketLocal;
	public String targetMarketForeign;
	public String targetMarketCountries;
	public String declareInformationProvide;
	public long CreativeApplicationId;

}