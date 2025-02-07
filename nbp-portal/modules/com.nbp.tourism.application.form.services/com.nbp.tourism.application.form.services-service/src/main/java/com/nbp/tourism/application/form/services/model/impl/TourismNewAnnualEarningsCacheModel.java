/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismNewAnnualEarnings;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismNewAnnualEarnings in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismNewAnnualEarningsCacheModel
	implements CacheModel<TourismNewAnnualEarnings>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismNewAnnualEarningsCacheModel)) {
			return false;
		}

		TourismNewAnnualEarningsCacheModel tourismNewAnnualEarningsCacheModel =
			(TourismNewAnnualEarningsCacheModel)object;

		if (tourismNewAnnualEarningsId ==
				tourismNewAnnualEarningsCacheModel.tourismNewAnnualEarningsId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismNewAnnualEarningsId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{tourismNewAnnualEarningsId=");
		sb.append(tourismNewAnnualEarningsId);
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
		sb.append(", yearOne=");
		sb.append(yearOne);
		sb.append(", yearTwo=");
		sb.append(yearTwo);
		sb.append(", yearThree=");
		sb.append(yearThree);
		sb.append(", targetLocalPer=");
		sb.append(targetLocalPer);
		sb.append(", targetForeignPer=");
		sb.append(targetForeignPer);
		sb.append(", targetCountries=");
		sb.append(targetCountries);
		sb.append(", estimatedPer=");
		sb.append(estimatedPer);
		sb.append(", volume=");
		sb.append(volume);
		sb.append(", expenditure=");
		sb.append(expenditure);
		sb.append(", manufactureEstimatedPer=");
		sb.append(manufactureEstimatedPer);
		sb.append(", manufactureVolume=");
		sb.append(manufactureVolume);
		sb.append(", manufactureExpenditure=");
		sb.append(manufactureExpenditure);
		sb.append(", seafoodPer=");
		sb.append(seafoodPer);
		sb.append(", seafoodVolume=");
		sb.append(seafoodVolume);
		sb.append(", seafoodExpenditure=");
		sb.append(seafoodExpenditure);
		sb.append(", enterServices=");
		sb.append(enterServices);
		sb.append(", enterLocal=");
		sb.append(enterLocal);
		sb.append(", enterForeign=");
		sb.append(enterForeign);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismNewAnnualEarnings toEntityModel() {
		TourismNewAnnualEarningsImpl tourismNewAnnualEarningsImpl =
			new TourismNewAnnualEarningsImpl();

		tourismNewAnnualEarningsImpl.setTourismNewAnnualEarningsId(
			tourismNewAnnualEarningsId);
		tourismNewAnnualEarningsImpl.setGroupId(groupId);
		tourismNewAnnualEarningsImpl.setCompanyId(companyId);
		tourismNewAnnualEarningsImpl.setUserId(userId);

		if (userName == null) {
			tourismNewAnnualEarningsImpl.setUserName("");
		}
		else {
			tourismNewAnnualEarningsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismNewAnnualEarningsImpl.setCreateDate(null);
		}
		else {
			tourismNewAnnualEarningsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismNewAnnualEarningsImpl.setModifiedDate(null);
		}
		else {
			tourismNewAnnualEarningsImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (yearOne == null) {
			tourismNewAnnualEarningsImpl.setYearOne("");
		}
		else {
			tourismNewAnnualEarningsImpl.setYearOne(yearOne);
		}

		if (yearTwo == null) {
			tourismNewAnnualEarningsImpl.setYearTwo("");
		}
		else {
			tourismNewAnnualEarningsImpl.setYearTwo(yearTwo);
		}

		if (yearThree == null) {
			tourismNewAnnualEarningsImpl.setYearThree("");
		}
		else {
			tourismNewAnnualEarningsImpl.setYearThree(yearThree);
		}

		if (targetLocalPer == null) {
			tourismNewAnnualEarningsImpl.setTargetLocalPer("");
		}
		else {
			tourismNewAnnualEarningsImpl.setTargetLocalPer(targetLocalPer);
		}

		if (targetForeignPer == null) {
			tourismNewAnnualEarningsImpl.setTargetForeignPer("");
		}
		else {
			tourismNewAnnualEarningsImpl.setTargetForeignPer(targetForeignPer);
		}

		if (targetCountries == null) {
			tourismNewAnnualEarningsImpl.setTargetCountries("");
		}
		else {
			tourismNewAnnualEarningsImpl.setTargetCountries(targetCountries);
		}

		if (estimatedPer == null) {
			tourismNewAnnualEarningsImpl.setEstimatedPer("");
		}
		else {
			tourismNewAnnualEarningsImpl.setEstimatedPer(estimatedPer);
		}

		if (volume == null) {
			tourismNewAnnualEarningsImpl.setVolume("");
		}
		else {
			tourismNewAnnualEarningsImpl.setVolume(volume);
		}

		if (expenditure == null) {
			tourismNewAnnualEarningsImpl.setExpenditure("");
		}
		else {
			tourismNewAnnualEarningsImpl.setExpenditure(expenditure);
		}

		if (manufactureEstimatedPer == null) {
			tourismNewAnnualEarningsImpl.setManufactureEstimatedPer("");
		}
		else {
			tourismNewAnnualEarningsImpl.setManufactureEstimatedPer(
				manufactureEstimatedPer);
		}

		if (manufactureVolume == null) {
			tourismNewAnnualEarningsImpl.setManufactureVolume("");
		}
		else {
			tourismNewAnnualEarningsImpl.setManufactureVolume(
				manufactureVolume);
		}

		if (manufactureExpenditure == null) {
			tourismNewAnnualEarningsImpl.setManufactureExpenditure("");
		}
		else {
			tourismNewAnnualEarningsImpl.setManufactureExpenditure(
				manufactureExpenditure);
		}

		if (seafoodPer == null) {
			tourismNewAnnualEarningsImpl.setSeafoodPer("");
		}
		else {
			tourismNewAnnualEarningsImpl.setSeafoodPer(seafoodPer);
		}

		if (seafoodVolume == null) {
			tourismNewAnnualEarningsImpl.setSeafoodVolume("");
		}
		else {
			tourismNewAnnualEarningsImpl.setSeafoodVolume(seafoodVolume);
		}

		if (seafoodExpenditure == null) {
			tourismNewAnnualEarningsImpl.setSeafoodExpenditure("");
		}
		else {
			tourismNewAnnualEarningsImpl.setSeafoodExpenditure(
				seafoodExpenditure);
		}

		if (enterServices == null) {
			tourismNewAnnualEarningsImpl.setEnterServices("");
		}
		else {
			tourismNewAnnualEarningsImpl.setEnterServices(enterServices);
		}

		if (enterLocal == null) {
			tourismNewAnnualEarningsImpl.setEnterLocal("");
		}
		else {
			tourismNewAnnualEarningsImpl.setEnterLocal(enterLocal);
		}

		if (enterForeign == null) {
			tourismNewAnnualEarningsImpl.setEnterForeign("");
		}
		else {
			tourismNewAnnualEarningsImpl.setEnterForeign(enterForeign);
		}

		tourismNewAnnualEarningsImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismNewAnnualEarningsImpl.resetOriginalValues();

		return tourismNewAnnualEarningsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismNewAnnualEarningsId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		yearOne = objectInput.readUTF();
		yearTwo = objectInput.readUTF();
		yearThree = objectInput.readUTF();
		targetLocalPer = objectInput.readUTF();
		targetForeignPer = objectInput.readUTF();
		targetCountries = objectInput.readUTF();
		estimatedPer = objectInput.readUTF();
		volume = objectInput.readUTF();
		expenditure = objectInput.readUTF();
		manufactureEstimatedPer = objectInput.readUTF();
		manufactureVolume = objectInput.readUTF();
		manufactureExpenditure = objectInput.readUTF();
		seafoodPer = objectInput.readUTF();
		seafoodVolume = objectInput.readUTF();
		seafoodExpenditure = objectInput.readUTF();
		enterServices = objectInput.readUTF();
		enterLocal = objectInput.readUTF();
		enterForeign = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismNewAnnualEarningsId);

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

		if (yearOne == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(yearOne);
		}

		if (yearTwo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(yearTwo);
		}

		if (yearThree == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(yearThree);
		}

		if (targetLocalPer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(targetLocalPer);
		}

		if (targetForeignPer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(targetForeignPer);
		}

		if (targetCountries == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(targetCountries);
		}

		if (estimatedPer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(estimatedPer);
		}

		if (volume == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(volume);
		}

		if (expenditure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expenditure);
		}

		if (manufactureEstimatedPer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manufactureEstimatedPer);
		}

		if (manufactureVolume == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manufactureVolume);
		}

		if (manufactureExpenditure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manufactureExpenditure);
		}

		if (seafoodPer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(seafoodPer);
		}

		if (seafoodVolume == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(seafoodVolume);
		}

		if (seafoodExpenditure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(seafoodExpenditure);
		}

		if (enterServices == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(enterServices);
		}

		if (enterLocal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(enterLocal);
		}

		if (enterForeign == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(enterForeign);
		}

		objectOutput.writeLong(tourismApplicationId);
	}

	public long tourismNewAnnualEarningsId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String yearOne;
	public String yearTwo;
	public String yearThree;
	public String targetLocalPer;
	public String targetForeignPer;
	public String targetCountries;
	public String estimatedPer;
	public String volume;
	public String expenditure;
	public String manufactureEstimatedPer;
	public String manufactureVolume;
	public String manufactureExpenditure;
	public String seafoodPer;
	public String seafoodVolume;
	public String seafoodExpenditure;
	public String enterServices;
	public String enterLocal;
	public String enterForeign;
	public long tourismApplicationId;

}