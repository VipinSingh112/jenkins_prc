/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransportatioCarRental;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismBonaGroundTransportatioCarRental in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismBonaGroundTransportatioCarRentalCacheModel
	implements CacheModel<TourismBonaGroundTransportatioCarRental>,
			   Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof
				TourismBonaGroundTransportatioCarRentalCacheModel)) {

			return false;
		}

		TourismBonaGroundTransportatioCarRentalCacheModel
			tourismBonaGroundTransportatioCarRentalCacheModel =
				(TourismBonaGroundTransportatioCarRentalCacheModel)object;

		if (tourismBonaGroundTransportCRId ==
				tourismBonaGroundTransportatioCarRentalCacheModel.
					tourismBonaGroundTransportCRId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismBonaGroundTransportCRId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(77);

		sb.append("{tourismBonaGroundTransportCRId=");
		sb.append(tourismBonaGroundTransportCRId);
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
		sb.append(", TypeOfGroundTransportation=");
		sb.append(TypeOfGroundTransportation);
		sb.append(", bonaGroundDateOfApplication=");
		sb.append(bonaGroundDateOfApplication);
		sb.append(", bonaGroundNameOfCompany=");
		sb.append(bonaGroundNameOfCompany);
		sb.append(", bonaGroundTradingName=");
		sb.append(bonaGroundTradingName);
		sb.append(", bonaGroundCompanyRegisNo=");
		sb.append(bonaGroundCompanyRegisNo);
		sb.append(", bonaGroundTelephonNo=");
		sb.append(bonaGroundTelephonNo);
		sb.append(", bonaGroundAddress=");
		sb.append(bonaGroundAddress);
		sb.append(", bonaGroundEmailAddress=");
		sb.append(bonaGroundEmailAddress);
		sb.append(", bonaGroundContactPerson=");
		sb.append(bonaGroundContactPerson);
		sb.append(", bonaGroundEntityType=");
		sb.append(bonaGroundEntityType);
		sb.append(", bonaGroundTccNo=");
		sb.append(bonaGroundTccNo);
		sb.append(", bonaGroundExpiryDate=");
		sb.append(bonaGroundExpiryDate);
		sb.append(", bonaGroundCopyAttached=");
		sb.append(bonaGroundCopyAttached);
		sb.append(", bonaGroundJtbLicense=");
		sb.append(bonaGroundJtbLicense);
		sb.append(", bonaGroundExpiryDateTwo=");
		sb.append(bonaGroundExpiryDateTwo);
		sb.append(", bonaGroundCopyAttachedTwo=");
		sb.append(bonaGroundCopyAttachedTwo);
		sb.append(", bonaGroundTrnNo =");
		sb.append(bonaGroundTrnNo);
		sb.append(", bonaGroundYearInBusiness=");
		sb.append(bonaGroundYearInBusiness);
		sb.append(", bonaGroundCopyOfRegAttached =");
		sb.append(bonaGroundCopyOfRegAttached);
		sb.append(", bonaGroundExistingFleetAmount=");
		sb.append(bonaGroundExistingFleetAmount);
		sb.append(", bonaGroundTotalVehicles=");
		sb.append(bonaGroundTotalVehicles);
		sb.append(", bonaGroundHowAdditionToFleet=");
		sb.append(bonaGroundHowAdditionToFleet);
		sb.append(", bonaGroundReplacement=");
		sb.append(bonaGroundReplacement);
		sb.append(", bonaGroundSummaryDealer=");
		sb.append(bonaGroundSummaryDealer);
		sb.append(", bonaGroundSummaryNumOfVechicle=");
		sb.append(bonaGroundSummaryNumOfVechicle);
		sb.append(", bonaGroundSummarYear=");
		sb.append(bonaGroundSummarYear);
		sb.append(", bonaGroundSummaryType=");
		sb.append(bonaGroundSummaryType);
		sb.append(", bonaGroundSummaryCCRating=");
		sb.append(bonaGroundSummaryCCRating);
		sb.append(", bonaGroundSummaryCommentary=");
		sb.append(bonaGroundSummaryCommentary);
		sb.append(", bonaGroundDescription=");
		sb.append(bonaGroundDescription);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismBonaGroundTransportatioCarRental toEntityModel() {
		TourismBonaGroundTransportatioCarRentalImpl
			tourismBonaGroundTransportatioCarRentalImpl =
				new TourismBonaGroundTransportatioCarRentalImpl();

		tourismBonaGroundTransportatioCarRentalImpl.
			setTourismBonaGroundTransportCRId(tourismBonaGroundTransportCRId);
		tourismBonaGroundTransportatioCarRentalImpl.setGroupId(groupId);
		tourismBonaGroundTransportatioCarRentalImpl.setCompanyId(companyId);
		tourismBonaGroundTransportatioCarRentalImpl.setUserId(userId);

		if (userName == null) {
			tourismBonaGroundTransportatioCarRentalImpl.setUserName("");
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismBonaGroundTransportatioCarRentalImpl.setCreateDate(null);
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismBonaGroundTransportatioCarRentalImpl.setModifiedDate(null);
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (TypeOfGroundTransportation == null) {
			tourismBonaGroundTransportatioCarRentalImpl.
				setTypeOfGroundTransportation("");
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.
				setTypeOfGroundTransportation(TypeOfGroundTransportation);
		}

		if (bonaGroundDateOfApplication == Long.MIN_VALUE) {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundDateOfApplication(null);
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundDateOfApplication(
					new Date(bonaGroundDateOfApplication));
		}

		if (bonaGroundNameOfCompany == null) {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundNameOfCompany("");
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundNameOfCompany(bonaGroundNameOfCompany);
		}

		if (bonaGroundTradingName == null) {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundTradingName("");
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundTradingName(bonaGroundTradingName);
		}

		if (bonaGroundCompanyRegisNo == null) {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundCompanyRegisNo("");
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundCompanyRegisNo(bonaGroundCompanyRegisNo);
		}

		if (bonaGroundTelephonNo == null) {
			tourismBonaGroundTransportatioCarRentalImpl.setBonaGroundTelephonNo(
				"");
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.setBonaGroundTelephonNo(
				bonaGroundTelephonNo);
		}

		if (bonaGroundAddress == null) {
			tourismBonaGroundTransportatioCarRentalImpl.setBonaGroundAddress(
				"");
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.setBonaGroundAddress(
				bonaGroundAddress);
		}

		if (bonaGroundEmailAddress == null) {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundEmailAddress("");
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundEmailAddress(bonaGroundEmailAddress);
		}

		if (bonaGroundContactPerson == null) {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundContactPerson("");
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundContactPerson(bonaGroundContactPerson);
		}

		if (bonaGroundEntityType == null) {
			tourismBonaGroundTransportatioCarRentalImpl.setBonaGroundEntityType(
				"");
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.setBonaGroundEntityType(
				bonaGroundEntityType);
		}

		if (bonaGroundTccNo == null) {
			tourismBonaGroundTransportatioCarRentalImpl.setBonaGroundTccNo("");
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.setBonaGroundTccNo(
				bonaGroundTccNo);
		}

		if (bonaGroundExpiryDate == Long.MIN_VALUE) {
			tourismBonaGroundTransportatioCarRentalImpl.setBonaGroundExpiryDate(
				null);
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.setBonaGroundExpiryDate(
				new Date(bonaGroundExpiryDate));
		}

		if (bonaGroundCopyAttached == null) {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundCopyAttached("");
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundCopyAttached(bonaGroundCopyAttached);
		}

		if (bonaGroundJtbLicense == null) {
			tourismBonaGroundTransportatioCarRentalImpl.setBonaGroundJtbLicense(
				"");
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.setBonaGroundJtbLicense(
				bonaGroundJtbLicense);
		}

		if (bonaGroundExpiryDateTwo == Long.MIN_VALUE) {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundExpiryDateTwo(null);
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundExpiryDateTwo(new Date(bonaGroundExpiryDateTwo));
		}

		if (bonaGroundCopyAttachedTwo == null) {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundCopyAttachedTwo("");
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundCopyAttachedTwo(bonaGroundCopyAttachedTwo);
		}

		if (bonaGroundTrnNo == null) {
			tourismBonaGroundTransportatioCarRentalImpl.setBonaGroundTrnNo("");
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.setBonaGroundTrnNo(
				bonaGroundTrnNo);
		}

		if (bonaGroundYearInBusiness == null) {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundYearInBusiness("");
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundYearInBusiness(bonaGroundYearInBusiness);
		}

		if (bonaGroundCopyOfRegAttached == null) {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundCopyOfRegAttached("");
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundCopyOfRegAttached(bonaGroundCopyOfRegAttached);
		}

		if (bonaGroundExistingFleetAmount == null) {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundExistingFleetAmount("");
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundExistingFleetAmount(bonaGroundExistingFleetAmount);
		}

		if (bonaGroundTotalVehicles == null) {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundTotalVehicles("");
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundTotalVehicles(bonaGroundTotalVehicles);
		}

		if (bonaGroundHowAdditionToFleet == null) {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundHowAdditionToFleet("");
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundHowAdditionToFleet(bonaGroundHowAdditionToFleet);
		}

		if (bonaGroundReplacement == null) {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundReplacement("");
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundReplacement(bonaGroundReplacement);
		}

		if (bonaGroundSummaryDealer == null) {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundSummaryDealer("");
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundSummaryDealer(bonaGroundSummaryDealer);
		}

		if (bonaGroundSummaryNumOfVechicle == null) {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundSummaryNumOfVechicle("");
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundSummaryNumOfVechicle(
					bonaGroundSummaryNumOfVechicle);
		}

		if (bonaGroundSummarYear == null) {
			tourismBonaGroundTransportatioCarRentalImpl.setBonaGroundSummarYear(
				"");
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.setBonaGroundSummarYear(
				bonaGroundSummarYear);
		}

		if (bonaGroundSummaryType == null) {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundSummaryType("");
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundSummaryType(bonaGroundSummaryType);
		}

		if (bonaGroundSummaryCCRating == null) {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundSummaryCCRating("");
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundSummaryCCRating(bonaGroundSummaryCCRating);
		}

		if (bonaGroundSummaryCommentary == null) {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundSummaryCommentary("");
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundSummaryCommentary(bonaGroundSummaryCommentary);
		}

		if (bonaGroundDescription == null) {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundDescription("");
		}
		else {
			tourismBonaGroundTransportatioCarRentalImpl.
				setBonaGroundDescription(bonaGroundDescription);
		}

		tourismBonaGroundTransportatioCarRentalImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismBonaGroundTransportatioCarRentalImpl.resetOriginalValues();

		return tourismBonaGroundTransportatioCarRentalImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismBonaGroundTransportCRId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		TypeOfGroundTransportation = objectInput.readUTF();
		bonaGroundDateOfApplication = objectInput.readLong();
		bonaGroundNameOfCompany = objectInput.readUTF();
		bonaGroundTradingName = objectInput.readUTF();
		bonaGroundCompanyRegisNo = objectInput.readUTF();
		bonaGroundTelephonNo = objectInput.readUTF();
		bonaGroundAddress = objectInput.readUTF();
		bonaGroundEmailAddress = objectInput.readUTF();
		bonaGroundContactPerson = objectInput.readUTF();
		bonaGroundEntityType = objectInput.readUTF();
		bonaGroundTccNo = objectInput.readUTF();
		bonaGroundExpiryDate = objectInput.readLong();
		bonaGroundCopyAttached = objectInput.readUTF();
		bonaGroundJtbLicense = objectInput.readUTF();
		bonaGroundExpiryDateTwo = objectInput.readLong();
		bonaGroundCopyAttachedTwo = objectInput.readUTF();
		bonaGroundTrnNo = objectInput.readUTF();
		bonaGroundYearInBusiness = objectInput.readUTF();
		bonaGroundCopyOfRegAttached = objectInput.readUTF();
		bonaGroundExistingFleetAmount = objectInput.readUTF();
		bonaGroundTotalVehicles = objectInput.readUTF();
		bonaGroundHowAdditionToFleet = objectInput.readUTF();
		bonaGroundReplacement = objectInput.readUTF();
		bonaGroundSummaryDealer = objectInput.readUTF();
		bonaGroundSummaryNumOfVechicle = objectInput.readUTF();
		bonaGroundSummarYear = objectInput.readUTF();
		bonaGroundSummaryType = objectInput.readUTF();
		bonaGroundSummaryCCRating = objectInput.readUTF();
		bonaGroundSummaryCommentary = objectInput.readUTF();
		bonaGroundDescription = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismBonaGroundTransportCRId);

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

		if (TypeOfGroundTransportation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(TypeOfGroundTransportation);
		}

		objectOutput.writeLong(bonaGroundDateOfApplication);

		if (bonaGroundNameOfCompany == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundNameOfCompany);
		}

		if (bonaGroundTradingName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundTradingName);
		}

		if (bonaGroundCompanyRegisNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundCompanyRegisNo);
		}

		if (bonaGroundTelephonNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundTelephonNo);
		}

		if (bonaGroundAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundAddress);
		}

		if (bonaGroundEmailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundEmailAddress);
		}

		if (bonaGroundContactPerson == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundContactPerson);
		}

		if (bonaGroundEntityType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundEntityType);
		}

		if (bonaGroundTccNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundTccNo);
		}

		objectOutput.writeLong(bonaGroundExpiryDate);

		if (bonaGroundCopyAttached == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundCopyAttached);
		}

		if (bonaGroundJtbLicense == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundJtbLicense);
		}

		objectOutput.writeLong(bonaGroundExpiryDateTwo);

		if (bonaGroundCopyAttachedTwo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundCopyAttachedTwo);
		}

		if (bonaGroundTrnNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundTrnNo);
		}

		if (bonaGroundYearInBusiness == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundYearInBusiness);
		}

		if (bonaGroundCopyOfRegAttached == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundCopyOfRegAttached);
		}

		if (bonaGroundExistingFleetAmount == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundExistingFleetAmount);
		}

		if (bonaGroundTotalVehicles == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundTotalVehicles);
		}

		if (bonaGroundHowAdditionToFleet == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundHowAdditionToFleet);
		}

		if (bonaGroundReplacement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundReplacement);
		}

		if (bonaGroundSummaryDealer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundSummaryDealer);
		}

		if (bonaGroundSummaryNumOfVechicle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundSummaryNumOfVechicle);
		}

		if (bonaGroundSummarYear == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundSummarYear);
		}

		if (bonaGroundSummaryType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundSummaryType);
		}

		if (bonaGroundSummaryCCRating == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundSummaryCCRating);
		}

		if (bonaGroundSummaryCommentary == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundSummaryCommentary);
		}

		if (bonaGroundDescription == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundDescription);
		}

		objectOutput.writeLong(tourismApplicationId);
	}

	public long tourismBonaGroundTransportCRId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String TypeOfGroundTransportation;
	public long bonaGroundDateOfApplication;
	public String bonaGroundNameOfCompany;
	public String bonaGroundTradingName;
	public String bonaGroundCompanyRegisNo;
	public String bonaGroundTelephonNo;
	public String bonaGroundAddress;
	public String bonaGroundEmailAddress;
	public String bonaGroundContactPerson;
	public String bonaGroundEntityType;
	public String bonaGroundTccNo;
	public long bonaGroundExpiryDate;
	public String bonaGroundCopyAttached;
	public String bonaGroundJtbLicense;
	public long bonaGroundExpiryDateTwo;
	public String bonaGroundCopyAttachedTwo;
	public String bonaGroundTrnNo;
	public String bonaGroundYearInBusiness;
	public String bonaGroundCopyOfRegAttached;
	public String bonaGroundExistingFleetAmount;
	public String bonaGroundTotalVehicles;
	public String bonaGroundHowAdditionToFleet;
	public String bonaGroundReplacement;
	public String bonaGroundSummaryDealer;
	public String bonaGroundSummaryNumOfVechicle;
	public String bonaGroundSummarYear;
	public String bonaGroundSummaryType;
	public String bonaGroundSummaryCCRating;
	public String bonaGroundSummaryCommentary;
	public String bonaGroundDescription;
	public long tourismApplicationId;

}