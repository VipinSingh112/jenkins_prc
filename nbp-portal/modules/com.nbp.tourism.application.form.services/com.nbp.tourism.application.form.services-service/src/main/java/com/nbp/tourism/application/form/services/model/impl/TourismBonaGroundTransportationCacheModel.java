/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransportation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismBonaGroundTransportation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismBonaGroundTransportationCacheModel
	implements CacheModel<TourismBonaGroundTransportation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismBonaGroundTransportationCacheModel)) {
			return false;
		}

		TourismBonaGroundTransportationCacheModel
			tourismBonaGroundTransportationCacheModel =
				(TourismBonaGroundTransportationCacheModel)object;

		if (tourismBonaGroundTransportId ==
				tourismBonaGroundTransportationCacheModel.
					tourismBonaGroundTransportId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismBonaGroundTransportId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{tourismBonaGroundTransportId=");
		sb.append(tourismBonaGroundTransportId);
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
		sb.append(", typeOfGroundTransportation=");
		sb.append(typeOfGroundTransportation);
		sb.append(", bonaGroundName=");
		sb.append(bonaGroundName);
		sb.append(", bonaGroundLandlineNo=");
		sb.append(bonaGroundLandlineNo);
		sb.append(", bonaGroundMobileNo=");
		sb.append(bonaGroundMobileNo);
		sb.append(", bonaGroundFaxNo=");
		sb.append(bonaGroundFaxNo);
		sb.append(", bonaGroundLicensedWith=");
		sb.append(bonaGroundLicensedWith);
		sb.append(", bonaGroundBoardExpiryDate=");
		sb.append(bonaGroundBoardExpiryDate);
		sb.append(", bonaGroundHaveYouBenefitBefore=");
		sb.append(bonaGroundHaveYouBenefitBefore);
		sb.append(", bonaGroundDateOfLastBenefit=");
		sb.append(bonaGroundDateOfLastBenefit);
		sb.append(", bonaGroundEntityType=");
		sb.append(bonaGroundEntityType);
		sb.append(", bonaGroundVehicleInfoMake=");
		sb.append(bonaGroundVehicleInfoMake);
		sb.append(", bonaGroundVehicleInfoModel=");
		sb.append(bonaGroundVehicleInfoModel);
		sb.append(", bonaGroundVehicleInfoYear=");
		sb.append(bonaGroundVehicleInfoYear);
		sb.append(", bonaGroundSeatingCapacity=");
		sb.append(bonaGroundSeatingCapacity);
		sb.append(", bonaGroundExistingFleetAmount=");
		sb.append(bonaGroundExistingFleetAmount);
		sb.append(", bonaGroundIndicateVehicleWill=");
		sb.append(bonaGroundIndicateVehicleWill);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismBonaGroundTransportation toEntityModel() {
		TourismBonaGroundTransportationImpl
			tourismBonaGroundTransportationImpl =
				new TourismBonaGroundTransportationImpl();

		tourismBonaGroundTransportationImpl.setTourismBonaGroundTransportId(
			tourismBonaGroundTransportId);
		tourismBonaGroundTransportationImpl.setGroupId(groupId);
		tourismBonaGroundTransportationImpl.setCompanyId(companyId);
		tourismBonaGroundTransportationImpl.setUserId(userId);

		if (userName == null) {
			tourismBonaGroundTransportationImpl.setUserName("");
		}
		else {
			tourismBonaGroundTransportationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismBonaGroundTransportationImpl.setCreateDate(null);
		}
		else {
			tourismBonaGroundTransportationImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismBonaGroundTransportationImpl.setModifiedDate(null);
		}
		else {
			tourismBonaGroundTransportationImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (typeOfGroundTransportation == null) {
			tourismBonaGroundTransportationImpl.setTypeOfGroundTransportation(
				"");
		}
		else {
			tourismBonaGroundTransportationImpl.setTypeOfGroundTransportation(
				typeOfGroundTransportation);
		}

		if (bonaGroundName == null) {
			tourismBonaGroundTransportationImpl.setBonaGroundName("");
		}
		else {
			tourismBonaGroundTransportationImpl.setBonaGroundName(
				bonaGroundName);
		}

		if (bonaGroundLandlineNo == null) {
			tourismBonaGroundTransportationImpl.setBonaGroundLandlineNo("");
		}
		else {
			tourismBonaGroundTransportationImpl.setBonaGroundLandlineNo(
				bonaGroundLandlineNo);
		}

		if (bonaGroundMobileNo == null) {
			tourismBonaGroundTransportationImpl.setBonaGroundMobileNo("");
		}
		else {
			tourismBonaGroundTransportationImpl.setBonaGroundMobileNo(
				bonaGroundMobileNo);
		}

		if (bonaGroundFaxNo == null) {
			tourismBonaGroundTransportationImpl.setBonaGroundFaxNo("");
		}
		else {
			tourismBonaGroundTransportationImpl.setBonaGroundFaxNo(
				bonaGroundFaxNo);
		}

		if (bonaGroundLicensedWith == null) {
			tourismBonaGroundTransportationImpl.setBonaGroundLicensedWith("");
		}
		else {
			tourismBonaGroundTransportationImpl.setBonaGroundLicensedWith(
				bonaGroundLicensedWith);
		}

		if (bonaGroundBoardExpiryDate == Long.MIN_VALUE) {
			tourismBonaGroundTransportationImpl.setBonaGroundBoardExpiryDate(
				null);
		}
		else {
			tourismBonaGroundTransportationImpl.setBonaGroundBoardExpiryDate(
				new Date(bonaGroundBoardExpiryDate));
		}

		if (bonaGroundHaveYouBenefitBefore == null) {
			tourismBonaGroundTransportationImpl.
				setBonaGroundHaveYouBenefitBefore("");
		}
		else {
			tourismBonaGroundTransportationImpl.
				setBonaGroundHaveYouBenefitBefore(
					bonaGroundHaveYouBenefitBefore);
		}

		if (bonaGroundDateOfLastBenefit == Long.MIN_VALUE) {
			tourismBonaGroundTransportationImpl.setBonaGroundDateOfLastBenefit(
				null);
		}
		else {
			tourismBonaGroundTransportationImpl.setBonaGroundDateOfLastBenefit(
				new Date(bonaGroundDateOfLastBenefit));
		}

		if (bonaGroundEntityType == null) {
			tourismBonaGroundTransportationImpl.setBonaGroundEntityType("");
		}
		else {
			tourismBonaGroundTransportationImpl.setBonaGroundEntityType(
				bonaGroundEntityType);
		}

		if (bonaGroundVehicleInfoMake == null) {
			tourismBonaGroundTransportationImpl.setBonaGroundVehicleInfoMake(
				"");
		}
		else {
			tourismBonaGroundTransportationImpl.setBonaGroundVehicleInfoMake(
				bonaGroundVehicleInfoMake);
		}

		if (bonaGroundVehicleInfoModel == null) {
			tourismBonaGroundTransportationImpl.setBonaGroundVehicleInfoModel(
				"");
		}
		else {
			tourismBonaGroundTransportationImpl.setBonaGroundVehicleInfoModel(
				bonaGroundVehicleInfoModel);
		}

		if (bonaGroundVehicleInfoYear == null) {
			tourismBonaGroundTransportationImpl.setBonaGroundVehicleInfoYear(
				"");
		}
		else {
			tourismBonaGroundTransportationImpl.setBonaGroundVehicleInfoYear(
				bonaGroundVehicleInfoYear);
		}

		if (bonaGroundSeatingCapacity == null) {
			tourismBonaGroundTransportationImpl.setBonaGroundSeatingCapacity(
				"");
		}
		else {
			tourismBonaGroundTransportationImpl.setBonaGroundSeatingCapacity(
				bonaGroundSeatingCapacity);
		}

		if (bonaGroundExistingFleetAmount == null) {
			tourismBonaGroundTransportationImpl.
				setBonaGroundExistingFleetAmount("");
		}
		else {
			tourismBonaGroundTransportationImpl.
				setBonaGroundExistingFleetAmount(bonaGroundExistingFleetAmount);
		}

		if (bonaGroundIndicateVehicleWill == null) {
			tourismBonaGroundTransportationImpl.
				setBonaGroundIndicateVehicleWill("");
		}
		else {
			tourismBonaGroundTransportationImpl.
				setBonaGroundIndicateVehicleWill(bonaGroundIndicateVehicleWill);
		}

		tourismBonaGroundTransportationImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismBonaGroundTransportationImpl.resetOriginalValues();

		return tourismBonaGroundTransportationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismBonaGroundTransportId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		typeOfGroundTransportation = objectInput.readUTF();
		bonaGroundName = objectInput.readUTF();
		bonaGroundLandlineNo = objectInput.readUTF();
		bonaGroundMobileNo = objectInput.readUTF();
		bonaGroundFaxNo = objectInput.readUTF();
		bonaGroundLicensedWith = objectInput.readUTF();
		bonaGroundBoardExpiryDate = objectInput.readLong();
		bonaGroundHaveYouBenefitBefore = objectInput.readUTF();
		bonaGroundDateOfLastBenefit = objectInput.readLong();
		bonaGroundEntityType = objectInput.readUTF();
		bonaGroundVehicleInfoMake = objectInput.readUTF();
		bonaGroundVehicleInfoModel = objectInput.readUTF();
		bonaGroundVehicleInfoYear = objectInput.readUTF();
		bonaGroundSeatingCapacity = objectInput.readUTF();
		bonaGroundExistingFleetAmount = objectInput.readUTF();
		bonaGroundIndicateVehicleWill = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismBonaGroundTransportId);

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

		if (typeOfGroundTransportation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfGroundTransportation);
		}

		if (bonaGroundName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundName);
		}

		if (bonaGroundLandlineNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundLandlineNo);
		}

		if (bonaGroundMobileNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundMobileNo);
		}

		if (bonaGroundFaxNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundFaxNo);
		}

		if (bonaGroundLicensedWith == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundLicensedWith);
		}

		objectOutput.writeLong(bonaGroundBoardExpiryDate);

		if (bonaGroundHaveYouBenefitBefore == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundHaveYouBenefitBefore);
		}

		objectOutput.writeLong(bonaGroundDateOfLastBenefit);

		if (bonaGroundEntityType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundEntityType);
		}

		if (bonaGroundVehicleInfoMake == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundVehicleInfoMake);
		}

		if (bonaGroundVehicleInfoModel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundVehicleInfoModel);
		}

		if (bonaGroundVehicleInfoYear == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundVehicleInfoYear);
		}

		if (bonaGroundSeatingCapacity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundSeatingCapacity);
		}

		if (bonaGroundExistingFleetAmount == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundExistingFleetAmount);
		}

		if (bonaGroundIndicateVehicleWill == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaGroundIndicateVehicleWill);
		}

		objectOutput.writeLong(tourismApplicationId);
	}

	public long tourismBonaGroundTransportId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String typeOfGroundTransportation;
	public String bonaGroundName;
	public String bonaGroundLandlineNo;
	public String bonaGroundMobileNo;
	public String bonaGroundFaxNo;
	public String bonaGroundLicensedWith;
	public long bonaGroundBoardExpiryDate;
	public String bonaGroundHaveYouBenefitBefore;
	public long bonaGroundDateOfLastBenefit;
	public String bonaGroundEntityType;
	public String bonaGroundVehicleInfoMake;
	public String bonaGroundVehicleInfoModel;
	public String bonaGroundVehicleInfoYear;
	public String bonaGroundSeatingCapacity;
	public String bonaGroundExistingFleetAmount;
	public String bonaGroundIndicateVehicleWill;
	public long tourismApplicationId;

}