/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismBonaAccoAssesment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismBonaAccoAssesment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismBonaAccoAssesmentCacheModel
	implements CacheModel<TourismBonaAccoAssesment>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismBonaAccoAssesmentCacheModel)) {
			return false;
		}

		TourismBonaAccoAssesmentCacheModel tourismBonaAccoAssesmentCacheModel =
			(TourismBonaAccoAssesmentCacheModel)object;

		if (tourismBonaAccoAssesmentId ==
				tourismBonaAccoAssesmentCacheModel.tourismBonaAccoAssesmentId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismBonaAccoAssesmentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(89);

		sb.append("{tourismBonaAccoAssesmentId=");
		sb.append(tourismBonaAccoAssesmentId);
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
		sb.append(", countryOrigin=");
		sb.append(countryOrigin);
		sb.append(", jointVenture=");
		sb.append(jointVenture);
		sb.append(", localPer=");
		sb.append(localPer);
		sb.append(", foreignPer=");
		sb.append(foreignPer);
		sb.append(", capitalInvest=");
		sb.append(capitalInvest);
		sb.append(", sourceAttach=");
		sb.append(sourceAttach);
		sb.append(", shareCapital=");
		sb.append(shareCapital);
		sb.append(", loanCapital=");
		sb.append(loanCapital);
		sb.append(", other=");
		sb.append(other);
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
		sb.append(", staffPermanentLocalMale=");
		sb.append(staffPermanentLocalMale);
		sb.append(", staffPermanentLocalFemale=");
		sb.append(staffPermanentLocalFemale);
		sb.append(", staffForeignLocalMale=");
		sb.append(staffForeignLocalMale);
		sb.append(", staffForeignLocalFemale=");
		sb.append(staffForeignLocalFemale);
		sb.append(", staffTemporaryLocalMale=");
		sb.append(staffTemporaryLocalMale);
		sb.append(", staffTemporaryLocalFemale=");
		sb.append(staffTemporaryLocalFemale);
		sb.append(", staffTemporaryForeignMale=");
		sb.append(staffTemporaryForeignMale);
		sb.append(", staffTemporaryForeignFemale=");
		sb.append(staffTemporaryForeignFemale);
		sb.append(", staffTotalForeignMale=");
		sb.append(staffTotalForeignMale);
		sb.append(", staffTotalForeignFemale=");
		sb.append(staffTotalForeignFemale);
		sb.append(", staffTotalLocalMale=");
		sb.append(staffTotalLocalMale);
		sb.append(", staffTotalLocalFemale=");
		sb.append(staffTotalLocalFemale);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismBonaAccoAssesment toEntityModel() {
		TourismBonaAccoAssesmentImpl tourismBonaAccoAssesmentImpl =
			new TourismBonaAccoAssesmentImpl();

		tourismBonaAccoAssesmentImpl.setTourismBonaAccoAssesmentId(
			tourismBonaAccoAssesmentId);
		tourismBonaAccoAssesmentImpl.setGroupId(groupId);
		tourismBonaAccoAssesmentImpl.setCompanyId(companyId);
		tourismBonaAccoAssesmentImpl.setUserId(userId);

		if (userName == null) {
			tourismBonaAccoAssesmentImpl.setUserName("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismBonaAccoAssesmentImpl.setCreateDate(null);
		}
		else {
			tourismBonaAccoAssesmentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismBonaAccoAssesmentImpl.setModifiedDate(null);
		}
		else {
			tourismBonaAccoAssesmentImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (countryOrigin == null) {
			tourismBonaAccoAssesmentImpl.setCountryOrigin("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setCountryOrigin(countryOrigin);
		}

		if (jointVenture == null) {
			tourismBonaAccoAssesmentImpl.setJointVenture("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setJointVenture(jointVenture);
		}

		if (localPer == null) {
			tourismBonaAccoAssesmentImpl.setLocalPer("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setLocalPer(localPer);
		}

		if (foreignPer == null) {
			tourismBonaAccoAssesmentImpl.setForeignPer("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setForeignPer(foreignPer);
		}

		if (capitalInvest == null) {
			tourismBonaAccoAssesmentImpl.setCapitalInvest("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setCapitalInvest(capitalInvest);
		}

		if (sourceAttach == null) {
			tourismBonaAccoAssesmentImpl.setSourceAttach("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setSourceAttach(sourceAttach);
		}

		if (shareCapital == null) {
			tourismBonaAccoAssesmentImpl.setShareCapital("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setShareCapital(shareCapital);
		}

		if (loanCapital == null) {
			tourismBonaAccoAssesmentImpl.setLoanCapital("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setLoanCapital(loanCapital);
		}

		if (other == null) {
			tourismBonaAccoAssesmentImpl.setOther("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setOther(other);
		}

		if (permanentLocalMale == null) {
			tourismBonaAccoAssesmentImpl.setPermanentLocalMale("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setPermanentLocalMale(
				permanentLocalMale);
		}

		if (permanentLocalFemale == null) {
			tourismBonaAccoAssesmentImpl.setPermanentLocalFemale("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setPermanentLocalFemale(
				permanentLocalFemale);
		}

		if (permanentForeignMale == null) {
			tourismBonaAccoAssesmentImpl.setPermanentForeignMale("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setPermanentForeignMale(
				permanentForeignMale);
		}

		if (permanentForeignFemale == null) {
			tourismBonaAccoAssesmentImpl.setPermanentForeignFemale("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setPermanentForeignFemale(
				permanentForeignFemale);
		}

		if (temporaryLocalMale == null) {
			tourismBonaAccoAssesmentImpl.setTemporaryLocalMale("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setTemporaryLocalMale(
				temporaryLocalMale);
		}

		if (temporaryLocalFemale == null) {
			tourismBonaAccoAssesmentImpl.setTemporaryLocalFemale("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setTemporaryLocalFemale(
				temporaryLocalFemale);
		}

		if (temporaryForeignMale == null) {
			tourismBonaAccoAssesmentImpl.setTemporaryForeignMale("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setTemporaryForeignMale(
				temporaryForeignMale);
		}

		if (temporaryForeignFemale == null) {
			tourismBonaAccoAssesmentImpl.setTemporaryForeignFemale("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setTemporaryForeignFemale(
				temporaryForeignFemale);
		}

		if (totalLocalMale == null) {
			tourismBonaAccoAssesmentImpl.setTotalLocalMale("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setTotalLocalMale(totalLocalMale);
		}

		if (totalLocalFemale == null) {
			tourismBonaAccoAssesmentImpl.setTotalLocalFemale("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setTotalLocalFemale(totalLocalFemale);
		}

		if (totalForeignMale == null) {
			tourismBonaAccoAssesmentImpl.setTotalForeignMale("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setTotalForeignMale(totalForeignMale);
		}

		if (totalForeignFemale == null) {
			tourismBonaAccoAssesmentImpl.setTotalForeignFemale("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setTotalForeignFemale(
				totalForeignFemale);
		}

		if (salaryWages == null) {
			tourismBonaAccoAssesmentImpl.setSalaryWages("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setSalaryWages(salaryWages);
		}

		if (estimatedExpenditure == null) {
			tourismBonaAccoAssesmentImpl.setEstimatedExpenditure("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setEstimatedExpenditure(
				estimatedExpenditure);
		}

		if (otherExpenditure == null) {
			tourismBonaAccoAssesmentImpl.setOtherExpenditure("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setOtherExpenditure(otherExpenditure);
		}

		if (staffPermanentLocalMale == null) {
			tourismBonaAccoAssesmentImpl.setStaffPermanentLocalMale("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setStaffPermanentLocalMale(
				staffPermanentLocalMale);
		}

		if (staffPermanentLocalFemale == null) {
			tourismBonaAccoAssesmentImpl.setStaffPermanentLocalFemale("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setStaffPermanentLocalFemale(
				staffPermanentLocalFemale);
		}

		if (staffForeignLocalMale == null) {
			tourismBonaAccoAssesmentImpl.setStaffForeignLocalMale("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setStaffForeignLocalMale(
				staffForeignLocalMale);
		}

		if (staffForeignLocalFemale == null) {
			tourismBonaAccoAssesmentImpl.setStaffForeignLocalFemale("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setStaffForeignLocalFemale(
				staffForeignLocalFemale);
		}

		if (staffTemporaryLocalMale == null) {
			tourismBonaAccoAssesmentImpl.setStaffTemporaryLocalMale("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setStaffTemporaryLocalMale(
				staffTemporaryLocalMale);
		}

		if (staffTemporaryLocalFemale == null) {
			tourismBonaAccoAssesmentImpl.setStaffTemporaryLocalFemale("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setStaffTemporaryLocalFemale(
				staffTemporaryLocalFemale);
		}

		if (staffTemporaryForeignMale == null) {
			tourismBonaAccoAssesmentImpl.setStaffTemporaryForeignMale("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setStaffTemporaryForeignMale(
				staffTemporaryForeignMale);
		}

		if (staffTemporaryForeignFemale == null) {
			tourismBonaAccoAssesmentImpl.setStaffTemporaryForeignFemale("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setStaffTemporaryForeignFemale(
				staffTemporaryForeignFemale);
		}

		if (staffTotalForeignMale == null) {
			tourismBonaAccoAssesmentImpl.setStaffTotalForeignMale("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setStaffTotalForeignMale(
				staffTotalForeignMale);
		}

		if (staffTotalForeignFemale == null) {
			tourismBonaAccoAssesmentImpl.setStaffTotalForeignFemale("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setStaffTotalForeignFemale(
				staffTotalForeignFemale);
		}

		if (staffTotalLocalMale == null) {
			tourismBonaAccoAssesmentImpl.setStaffTotalLocalMale("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setStaffTotalLocalMale(
				staffTotalLocalMale);
		}

		if (staffTotalLocalFemale == null) {
			tourismBonaAccoAssesmentImpl.setStaffTotalLocalFemale("");
		}
		else {
			tourismBonaAccoAssesmentImpl.setStaffTotalLocalFemale(
				staffTotalLocalFemale);
		}

		tourismBonaAccoAssesmentImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismBonaAccoAssesmentImpl.resetOriginalValues();

		return tourismBonaAccoAssesmentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismBonaAccoAssesmentId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		countryOrigin = objectInput.readUTF();
		jointVenture = objectInput.readUTF();
		localPer = objectInput.readUTF();
		foreignPer = objectInput.readUTF();
		capitalInvest = objectInput.readUTF();
		sourceAttach = objectInput.readUTF();
		shareCapital = objectInput.readUTF();
		loanCapital = objectInput.readUTF();
		other = objectInput.readUTF();
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
		staffPermanentLocalMale = objectInput.readUTF();
		staffPermanentLocalFemale = objectInput.readUTF();
		staffForeignLocalMale = objectInput.readUTF();
		staffForeignLocalFemale = objectInput.readUTF();
		staffTemporaryLocalMale = objectInput.readUTF();
		staffTemporaryLocalFemale = objectInput.readUTF();
		staffTemporaryForeignMale = objectInput.readUTF();
		staffTemporaryForeignFemale = objectInput.readUTF();
		staffTotalForeignMale = objectInput.readUTF();
		staffTotalForeignFemale = objectInput.readUTF();
		staffTotalLocalMale = objectInput.readUTF();
		staffTotalLocalFemale = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismBonaAccoAssesmentId);

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

		if (countryOrigin == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(countryOrigin);
		}

		if (jointVenture == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(jointVenture);
		}

		if (localPer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(localPer);
		}

		if (foreignPer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(foreignPer);
		}

		if (capitalInvest == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(capitalInvest);
		}

		if (sourceAttach == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sourceAttach);
		}

		if (shareCapital == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(shareCapital);
		}

		if (loanCapital == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(loanCapital);
		}

		if (other == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(other);
		}

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

		if (staffForeignLocalMale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(staffForeignLocalMale);
		}

		if (staffForeignLocalFemale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(staffForeignLocalFemale);
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

		objectOutput.writeLong(tourismApplicationId);
	}

	public long tourismBonaAccoAssesmentId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String countryOrigin;
	public String jointVenture;
	public String localPer;
	public String foreignPer;
	public String capitalInvest;
	public String sourceAttach;
	public String shareCapital;
	public String loanCapital;
	public String other;
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
	public String staffPermanentLocalMale;
	public String staffPermanentLocalFemale;
	public String staffForeignLocalMale;
	public String staffForeignLocalFemale;
	public String staffTemporaryLocalMale;
	public String staffTemporaryLocalFemale;
	public String staffTemporaryForeignMale;
	public String staffTemporaryForeignFemale;
	public String staffTotalForeignMale;
	public String staffTotalForeignFemale;
	public String staffTotalLocalMale;
	public String staffTotalLocalFemale;
	public long tourismApplicationId;

}