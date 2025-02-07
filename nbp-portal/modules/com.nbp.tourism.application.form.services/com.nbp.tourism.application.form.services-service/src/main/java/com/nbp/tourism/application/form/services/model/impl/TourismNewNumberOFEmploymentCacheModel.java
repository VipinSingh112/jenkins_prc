/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismNewNumberOFEmployment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismNewNumberOFEmployment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismNewNumberOFEmploymentCacheModel
	implements CacheModel<TourismNewNumberOFEmployment>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismNewNumberOFEmploymentCacheModel)) {
			return false;
		}

		TourismNewNumberOFEmploymentCacheModel
			tourismNewNumberOFEmploymentCacheModel =
				(TourismNewNumberOFEmploymentCacheModel)object;

		if (tourismNewNumberOFEmploymentId ==
				tourismNewNumberOFEmploymentCacheModel.
					tourismNewNumberOFEmploymentId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismNewNumberOFEmploymentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(79);

		sb.append("{tourismNewNumberOFEmploymentId=");
		sb.append(tourismNewNumberOFEmploymentId);
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
		sb.append(", permanentLocalMale=");
		sb.append(permanentLocalMale);
		sb.append(", permanentLocalFemale=");
		sb.append(permanentLocalFemale);
		sb.append(", permanentForeignMale=");
		sb.append(permanentForeignMale);
		sb.append(", permanentForeignFemale=");
		sb.append(permanentForeignFemale);
		sb.append(", temporaryLocalMale=");
		sb.append(temporaryLocalMale);
		sb.append(", temporaryLocalFemale=");
		sb.append(temporaryLocalFemale);
		sb.append(", temporaryForeignMale=");
		sb.append(temporaryForeignMale);
		sb.append(", temporaryForeignFemale=");
		sb.append(temporaryForeignFemale);
		sb.append(", totalLocalMale=");
		sb.append(totalLocalMale);
		sb.append(", totalLocalFemale=");
		sb.append(totalLocalFemale);
		sb.append(", totalForeignMale=");
		sb.append(totalForeignMale);
		sb.append(", totalForeignFemale=");
		sb.append(totalForeignFemale);
		sb.append(", salaryWages=");
		sb.append(salaryWages);
		sb.append(", estimatedExpenditure=");
		sb.append(estimatedExpenditure);
		sb.append(", otherExpenditure=");
		sb.append(otherExpenditure);
		sb.append(", perRoomInclusiveCost=");
		sb.append(perRoomInclusiveCost);
		sb.append(", perRoomExclusiveCost=");
		sb.append(perRoomExclusiveCost);
		sb.append(", staffPermanentLocalMale=");
		sb.append(staffPermanentLocalMale);
		sb.append(", staffPermanentLocalFemale=");
		sb.append(staffPermanentLocalFemale);
		sb.append(", staffPermanentForeignMale=");
		sb.append(staffPermanentForeignMale);
		sb.append(", staffPermanentForeignFemale=");
		sb.append(staffPermanentForeignFemale);
		sb.append(", staffTemporaryLocalMale=");
		sb.append(staffTemporaryLocalMale);
		sb.append(", staffTemporaryLocalFemale=");
		sb.append(staffTemporaryLocalFemale);
		sb.append(", staffTemporaryForeignMale=");
		sb.append(staffTemporaryForeignMale);
		sb.append(", staffTemporaryForeignFemale=");
		sb.append(staffTemporaryForeignFemale);
		sb.append(", staffTotalLocalMale=");
		sb.append(staffTotalLocalMale);
		sb.append(", staffTotalLocalFemale=");
		sb.append(staffTotalLocalFemale);
		sb.append(", staffTotalForeignMale=");
		sb.append(staffTotalForeignMale);
		sb.append(", staffTotalForeignFemale=");
		sb.append(staffTotalForeignFemale);
		sb.append(", salariesAndWages=");
		sb.append(salariesAndWages);
		sb.append(", expectedAnnualFunds=");
		sb.append(expectedAnnualFunds);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismNewNumberOFEmployment toEntityModel() {
		TourismNewNumberOFEmploymentImpl tourismNewNumberOFEmploymentImpl =
			new TourismNewNumberOFEmploymentImpl();

		tourismNewNumberOFEmploymentImpl.setTourismNewNumberOFEmploymentId(
			tourismNewNumberOFEmploymentId);
		tourismNewNumberOFEmploymentImpl.setGroupId(groupId);
		tourismNewNumberOFEmploymentImpl.setCompanyId(companyId);
		tourismNewNumberOFEmploymentImpl.setUserId(userId);

		if (userName == null) {
			tourismNewNumberOFEmploymentImpl.setUserName("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismNewNumberOFEmploymentImpl.setCreateDate(null);
		}
		else {
			tourismNewNumberOFEmploymentImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismNewNumberOFEmploymentImpl.setModifiedDate(null);
		}
		else {
			tourismNewNumberOFEmploymentImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (permanentLocalMale == null) {
			tourismNewNumberOFEmploymentImpl.setPermanentLocalMale("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setPermanentLocalMale(
				permanentLocalMale);
		}

		if (permanentLocalFemale == null) {
			tourismNewNumberOFEmploymentImpl.setPermanentLocalFemale("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setPermanentLocalFemale(
				permanentLocalFemale);
		}

		if (permanentForeignMale == null) {
			tourismNewNumberOFEmploymentImpl.setPermanentForeignMale("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setPermanentForeignMale(
				permanentForeignMale);
		}

		if (permanentForeignFemale == null) {
			tourismNewNumberOFEmploymentImpl.setPermanentForeignFemale("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setPermanentForeignFemale(
				permanentForeignFemale);
		}

		if (temporaryLocalMale == null) {
			tourismNewNumberOFEmploymentImpl.setTemporaryLocalMale("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setTemporaryLocalMale(
				temporaryLocalMale);
		}

		if (temporaryLocalFemale == null) {
			tourismNewNumberOFEmploymentImpl.setTemporaryLocalFemale("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setTemporaryLocalFemale(
				temporaryLocalFemale);
		}

		if (temporaryForeignMale == null) {
			tourismNewNumberOFEmploymentImpl.setTemporaryForeignMale("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setTemporaryForeignMale(
				temporaryForeignMale);
		}

		if (temporaryForeignFemale == null) {
			tourismNewNumberOFEmploymentImpl.setTemporaryForeignFemale("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setTemporaryForeignFemale(
				temporaryForeignFemale);
		}

		if (totalLocalMale == null) {
			tourismNewNumberOFEmploymentImpl.setTotalLocalMale("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setTotalLocalMale(totalLocalMale);
		}

		if (totalLocalFemale == null) {
			tourismNewNumberOFEmploymentImpl.setTotalLocalFemale("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setTotalLocalFemale(
				totalLocalFemale);
		}

		if (totalForeignMale == null) {
			tourismNewNumberOFEmploymentImpl.setTotalForeignMale("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setTotalForeignMale(
				totalForeignMale);
		}

		if (totalForeignFemale == null) {
			tourismNewNumberOFEmploymentImpl.setTotalForeignFemale("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setTotalForeignFemale(
				totalForeignFemale);
		}

		if (salaryWages == null) {
			tourismNewNumberOFEmploymentImpl.setSalaryWages("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setSalaryWages(salaryWages);
		}

		if (estimatedExpenditure == null) {
			tourismNewNumberOFEmploymentImpl.setEstimatedExpenditure("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setEstimatedExpenditure(
				estimatedExpenditure);
		}

		if (otherExpenditure == null) {
			tourismNewNumberOFEmploymentImpl.setOtherExpenditure("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setOtherExpenditure(
				otherExpenditure);
		}

		if (perRoomInclusiveCost == null) {
			tourismNewNumberOFEmploymentImpl.setPerRoomInclusiveCost("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setPerRoomInclusiveCost(
				perRoomInclusiveCost);
		}

		if (perRoomExclusiveCost == null) {
			tourismNewNumberOFEmploymentImpl.setPerRoomExclusiveCost("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setPerRoomExclusiveCost(
				perRoomExclusiveCost);
		}

		if (staffPermanentLocalMale == null) {
			tourismNewNumberOFEmploymentImpl.setStaffPermanentLocalMale("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setStaffPermanentLocalMale(
				staffPermanentLocalMale);
		}

		if (staffPermanentLocalFemale == null) {
			tourismNewNumberOFEmploymentImpl.setStaffPermanentLocalFemale("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setStaffPermanentLocalFemale(
				staffPermanentLocalFemale);
		}

		if (staffPermanentForeignMale == null) {
			tourismNewNumberOFEmploymentImpl.setStaffPermanentForeignMale("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setStaffPermanentForeignMale(
				staffPermanentForeignMale);
		}

		if (staffPermanentForeignFemale == null) {
			tourismNewNumberOFEmploymentImpl.setStaffPermanentForeignFemale("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setStaffPermanentForeignFemale(
				staffPermanentForeignFemale);
		}

		if (staffTemporaryLocalMale == null) {
			tourismNewNumberOFEmploymentImpl.setStaffTemporaryLocalMale("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setStaffTemporaryLocalMale(
				staffTemporaryLocalMale);
		}

		if (staffTemporaryLocalFemale == null) {
			tourismNewNumberOFEmploymentImpl.setStaffTemporaryLocalFemale("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setStaffTemporaryLocalFemale(
				staffTemporaryLocalFemale);
		}

		if (staffTemporaryForeignMale == null) {
			tourismNewNumberOFEmploymentImpl.setStaffTemporaryForeignMale("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setStaffTemporaryForeignMale(
				staffTemporaryForeignMale);
		}

		if (staffTemporaryForeignFemale == null) {
			tourismNewNumberOFEmploymentImpl.setStaffTemporaryForeignFemale("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setStaffTemporaryForeignFemale(
				staffTemporaryForeignFemale);
		}

		if (staffTotalLocalMale == null) {
			tourismNewNumberOFEmploymentImpl.setStaffTotalLocalMale("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setStaffTotalLocalMale(
				staffTotalLocalMale);
		}

		if (staffTotalLocalFemale == null) {
			tourismNewNumberOFEmploymentImpl.setStaffTotalLocalFemale("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setStaffTotalLocalFemale(
				staffTotalLocalFemale);
		}

		if (staffTotalForeignMale == null) {
			tourismNewNumberOFEmploymentImpl.setStaffTotalForeignMale("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setStaffTotalForeignMale(
				staffTotalForeignMale);
		}

		if (staffTotalForeignFemale == null) {
			tourismNewNumberOFEmploymentImpl.setStaffTotalForeignFemale("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setStaffTotalForeignFemale(
				staffTotalForeignFemale);
		}

		if (salariesAndWages == null) {
			tourismNewNumberOFEmploymentImpl.setSalariesAndWages("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setSalariesAndWages(
				salariesAndWages);
		}

		if (expectedAnnualFunds == null) {
			tourismNewNumberOFEmploymentImpl.setExpectedAnnualFunds("");
		}
		else {
			tourismNewNumberOFEmploymentImpl.setExpectedAnnualFunds(
				expectedAnnualFunds);
		}

		tourismNewNumberOFEmploymentImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismNewNumberOFEmploymentImpl.resetOriginalValues();

		return tourismNewNumberOFEmploymentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismNewNumberOFEmploymentId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		permanentLocalMale = objectInput.readUTF();
		permanentLocalFemale = objectInput.readUTF();
		permanentForeignMale = objectInput.readUTF();
		permanentForeignFemale = objectInput.readUTF();
		temporaryLocalMale = objectInput.readUTF();
		temporaryLocalFemale = objectInput.readUTF();
		temporaryForeignMale = objectInput.readUTF();
		temporaryForeignFemale = objectInput.readUTF();
		totalLocalMale = objectInput.readUTF();
		totalLocalFemale = objectInput.readUTF();
		totalForeignMale = objectInput.readUTF();
		totalForeignFemale = objectInput.readUTF();
		salaryWages = objectInput.readUTF();
		estimatedExpenditure = objectInput.readUTF();
		otherExpenditure = objectInput.readUTF();
		perRoomInclusiveCost = objectInput.readUTF();
		perRoomExclusiveCost = objectInput.readUTF();
		staffPermanentLocalMale = objectInput.readUTF();
		staffPermanentLocalFemale = objectInput.readUTF();
		staffPermanentForeignMale = objectInput.readUTF();
		staffPermanentForeignFemale = objectInput.readUTF();
		staffTemporaryLocalMale = objectInput.readUTF();
		staffTemporaryLocalFemale = objectInput.readUTF();
		staffTemporaryForeignMale = objectInput.readUTF();
		staffTemporaryForeignFemale = objectInput.readUTF();
		staffTotalLocalMale = objectInput.readUTF();
		staffTotalLocalFemale = objectInput.readUTF();
		staffTotalForeignMale = objectInput.readUTF();
		staffTotalForeignFemale = objectInput.readUTF();
		salariesAndWages = objectInput.readUTF();
		expectedAnnualFunds = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismNewNumberOFEmploymentId);

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

		if (permanentLocalMale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permanentLocalMale);
		}

		if (permanentLocalFemale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permanentLocalFemale);
		}

		if (permanentForeignMale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permanentForeignMale);
		}

		if (permanentForeignFemale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permanentForeignFemale);
		}

		if (temporaryLocalMale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(temporaryLocalMale);
		}

		if (temporaryLocalFemale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(temporaryLocalFemale);
		}

		if (temporaryForeignMale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(temporaryForeignMale);
		}

		if (temporaryForeignFemale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(temporaryForeignFemale);
		}

		if (totalLocalMale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(totalLocalMale);
		}

		if (totalLocalFemale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(totalLocalFemale);
		}

		if (totalForeignMale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(totalForeignMale);
		}

		if (totalForeignFemale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(totalForeignFemale);
		}

		if (salaryWages == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(salaryWages);
		}

		if (estimatedExpenditure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(estimatedExpenditure);
		}

		if (otherExpenditure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherExpenditure);
		}

		if (perRoomInclusiveCost == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(perRoomInclusiveCost);
		}

		if (perRoomExclusiveCost == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(perRoomExclusiveCost);
		}

		if (staffPermanentLocalMale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(staffPermanentLocalMale);
		}

		if (staffPermanentLocalFemale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(staffPermanentLocalFemale);
		}

		if (staffPermanentForeignMale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(staffPermanentForeignMale);
		}

		if (staffPermanentForeignFemale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(staffPermanentForeignFemale);
		}

		if (staffTemporaryLocalMale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(staffTemporaryLocalMale);
		}

		if (staffTemporaryLocalFemale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(staffTemporaryLocalFemale);
		}

		if (staffTemporaryForeignMale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(staffTemporaryForeignMale);
		}

		if (staffTemporaryForeignFemale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(staffTemporaryForeignFemale);
		}

		if (staffTotalLocalMale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(staffTotalLocalMale);
		}

		if (staffTotalLocalFemale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(staffTotalLocalFemale);
		}

		if (staffTotalForeignMale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(staffTotalForeignMale);
		}

		if (staffTotalForeignFemale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(staffTotalForeignFemale);
		}

		if (salariesAndWages == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(salariesAndWages);
		}

		if (expectedAnnualFunds == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expectedAnnualFunds);
		}

		objectOutput.writeLong(tourismApplicationId);
	}

	public long tourismNewNumberOFEmploymentId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String permanentLocalMale;
	public String permanentLocalFemale;
	public String permanentForeignMale;
	public String permanentForeignFemale;
	public String temporaryLocalMale;
	public String temporaryLocalFemale;
	public String temporaryForeignMale;
	public String temporaryForeignFemale;
	public String totalLocalMale;
	public String totalLocalFemale;
	public String totalForeignMale;
	public String totalForeignFemale;
	public String salaryWages;
	public String estimatedExpenditure;
	public String otherExpenditure;
	public String perRoomInclusiveCost;
	public String perRoomExclusiveCost;
	public String staffPermanentLocalMale;
	public String staffPermanentLocalFemale;
	public String staffPermanentForeignMale;
	public String staffPermanentForeignFemale;
	public String staffTemporaryLocalMale;
	public String staffTemporaryLocalFemale;
	public String staffTemporaryForeignMale;
	public String staffTemporaryForeignFemale;
	public String staffTotalLocalMale;
	public String staffTotalLocalFemale;
	public String staffTotalForeignMale;
	public String staffTotalForeignFemale;
	public String salariesAndWages;
	public String expectedAnnualFunds;
	public long tourismApplicationId;

}