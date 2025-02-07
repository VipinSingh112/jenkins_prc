/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismBonaAccommodationForm;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismBonaAccommodationForm in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismBonaAccommodationFormCacheModel
	implements CacheModel<TourismBonaAccommodationForm>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismBonaAccommodationFormCacheModel)) {
			return false;
		}

		TourismBonaAccommodationFormCacheModel
			tourismBonaAccommodationFormCacheModel =
				(TourismBonaAccommodationFormCacheModel)object;

		if (tourismBonaAFId ==
				tourismBonaAccommodationFormCacheModel.tourismBonaAFId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismBonaAFId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(55);

		sb.append("{tourismBonaAFId=");
		sb.append(tourismBonaAFId);
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
		sb.append(", bonaAccoDateOfApplication=");
		sb.append(bonaAccoDateOfApplication);
		sb.append(", bonaAccoTypeOfAccommodation=");
		sb.append(bonaAccoTypeOfAccommodation);
		sb.append(", bonaAccoPurposeOfIncentives=");
		sb.append(bonaAccoPurposeOfIncentives);
		sb.append(", bonaAccoOtherIncPurpose=");
		sb.append(bonaAccoOtherIncPurpose);
		sb.append(", bonaAccoNameOfProperty=");
		sb.append(bonaAccoNameOfProperty);
		sb.append(", bonaAccoNameOfOwner=");
		sb.append(bonaAccoNameOfOwner);
		sb.append(", bonaAccoLocation=");
		sb.append(bonaAccoLocation);
		sb.append(", bonaAccoCompanyNumber=");
		sb.append(bonaAccoCompanyNumber);
		sb.append(", bonaBusinessRegistrationNumber=");
		sb.append(bonaBusinessRegistrationNumber);
		sb.append(", bonaAccoDateOfRegistration=");
		sb.append(bonaAccoDateOfRegistration);
		sb.append(", bonaAccoOwnerTrnNumber=");
		sb.append(bonaAccoOwnerTrnNumber);
		sb.append(", bonaAccoTccNumber=");
		sb.append(bonaAccoTccNumber);
		sb.append(", bonaAccoExpiryDate=");
		sb.append(bonaAccoExpiryDate);
		sb.append(", bonaAccoNameOfOperator=");
		sb.append(bonaAccoNameOfOperator);
		sb.append(", bonaAccoOperatorTrnNumber=");
		sb.append(bonaAccoOperatorTrnNumber);
		sb.append(", bonaAccoOperatorTccNumber=");
		sb.append(bonaAccoOperatorTccNumber);
		sb.append(", bonaAccoOperatorExpiryDate=");
		sb.append(bonaAccoOperatorExpiryDate);
		sb.append(", bonaAccoContactPerson=");
		sb.append(bonaAccoContactPerson);
		sb.append(", bonaAccoPositionHeld=");
		sb.append(bonaAccoPositionHeld);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismBonaAccommodationForm toEntityModel() {
		TourismBonaAccommodationFormImpl tourismBonaAccommodationFormImpl =
			new TourismBonaAccommodationFormImpl();

		tourismBonaAccommodationFormImpl.setTourismBonaAFId(tourismBonaAFId);
		tourismBonaAccommodationFormImpl.setGroupId(groupId);
		tourismBonaAccommodationFormImpl.setCompanyId(companyId);
		tourismBonaAccommodationFormImpl.setUserId(userId);

		if (userName == null) {
			tourismBonaAccommodationFormImpl.setUserName("");
		}
		else {
			tourismBonaAccommodationFormImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismBonaAccommodationFormImpl.setCreateDate(null);
		}
		else {
			tourismBonaAccommodationFormImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismBonaAccommodationFormImpl.setModifiedDate(null);
		}
		else {
			tourismBonaAccommodationFormImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (bonaAccoDateOfApplication == Long.MIN_VALUE) {
			tourismBonaAccommodationFormImpl.setBonaAccoDateOfApplication(null);
		}
		else {
			tourismBonaAccommodationFormImpl.setBonaAccoDateOfApplication(
				new Date(bonaAccoDateOfApplication));
		}

		if (bonaAccoTypeOfAccommodation == null) {
			tourismBonaAccommodationFormImpl.setBonaAccoTypeOfAccommodation("");
		}
		else {
			tourismBonaAccommodationFormImpl.setBonaAccoTypeOfAccommodation(
				bonaAccoTypeOfAccommodation);
		}

		if (bonaAccoPurposeOfIncentives == null) {
			tourismBonaAccommodationFormImpl.setBonaAccoPurposeOfIncentives("");
		}
		else {
			tourismBonaAccommodationFormImpl.setBonaAccoPurposeOfIncentives(
				bonaAccoPurposeOfIncentives);
		}

		if (bonaAccoOtherIncPurpose == null) {
			tourismBonaAccommodationFormImpl.setBonaAccoOtherIncPurpose("");
		}
		else {
			tourismBonaAccommodationFormImpl.setBonaAccoOtherIncPurpose(
				bonaAccoOtherIncPurpose);
		}

		if (bonaAccoNameOfProperty == null) {
			tourismBonaAccommodationFormImpl.setBonaAccoNameOfProperty("");
		}
		else {
			tourismBonaAccommodationFormImpl.setBonaAccoNameOfProperty(
				bonaAccoNameOfProperty);
		}

		if (bonaAccoNameOfOwner == null) {
			tourismBonaAccommodationFormImpl.setBonaAccoNameOfOwner("");
		}
		else {
			tourismBonaAccommodationFormImpl.setBonaAccoNameOfOwner(
				bonaAccoNameOfOwner);
		}

		if (bonaAccoLocation == null) {
			tourismBonaAccommodationFormImpl.setBonaAccoLocation("");
		}
		else {
			tourismBonaAccommodationFormImpl.setBonaAccoLocation(
				bonaAccoLocation);
		}

		if (bonaAccoCompanyNumber == null) {
			tourismBonaAccommodationFormImpl.setBonaAccoCompanyNumber("");
		}
		else {
			tourismBonaAccommodationFormImpl.setBonaAccoCompanyNumber(
				bonaAccoCompanyNumber);
		}

		if (bonaBusinessRegistrationNumber == null) {
			tourismBonaAccommodationFormImpl.setBonaBusinessRegistrationNumber(
				"");
		}
		else {
			tourismBonaAccommodationFormImpl.setBonaBusinessRegistrationNumber(
				bonaBusinessRegistrationNumber);
		}

		if (bonaAccoDateOfRegistration == Long.MIN_VALUE) {
			tourismBonaAccommodationFormImpl.setBonaAccoDateOfRegistration(
				null);
		}
		else {
			tourismBonaAccommodationFormImpl.setBonaAccoDateOfRegistration(
				new Date(bonaAccoDateOfRegistration));
		}

		if (bonaAccoOwnerTrnNumber == null) {
			tourismBonaAccommodationFormImpl.setBonaAccoOwnerTrnNumber("");
		}
		else {
			tourismBonaAccommodationFormImpl.setBonaAccoOwnerTrnNumber(
				bonaAccoOwnerTrnNumber);
		}

		if (bonaAccoTccNumber == null) {
			tourismBonaAccommodationFormImpl.setBonaAccoTccNumber("");
		}
		else {
			tourismBonaAccommodationFormImpl.setBonaAccoTccNumber(
				bonaAccoTccNumber);
		}

		if (bonaAccoExpiryDate == Long.MIN_VALUE) {
			tourismBonaAccommodationFormImpl.setBonaAccoExpiryDate(null);
		}
		else {
			tourismBonaAccommodationFormImpl.setBonaAccoExpiryDate(
				new Date(bonaAccoExpiryDate));
		}

		if (bonaAccoNameOfOperator == null) {
			tourismBonaAccommodationFormImpl.setBonaAccoNameOfOperator("");
		}
		else {
			tourismBonaAccommodationFormImpl.setBonaAccoNameOfOperator(
				bonaAccoNameOfOperator);
		}

		if (bonaAccoOperatorTrnNumber == null) {
			tourismBonaAccommodationFormImpl.setBonaAccoOperatorTrnNumber("");
		}
		else {
			tourismBonaAccommodationFormImpl.setBonaAccoOperatorTrnNumber(
				bonaAccoOperatorTrnNumber);
		}

		if (bonaAccoOperatorTccNumber == null) {
			tourismBonaAccommodationFormImpl.setBonaAccoOperatorTccNumber("");
		}
		else {
			tourismBonaAccommodationFormImpl.setBonaAccoOperatorTccNumber(
				bonaAccoOperatorTccNumber);
		}

		if (bonaAccoOperatorExpiryDate == Long.MIN_VALUE) {
			tourismBonaAccommodationFormImpl.setBonaAccoOperatorExpiryDate(
				null);
		}
		else {
			tourismBonaAccommodationFormImpl.setBonaAccoOperatorExpiryDate(
				new Date(bonaAccoOperatorExpiryDate));
		}

		if (bonaAccoContactPerson == null) {
			tourismBonaAccommodationFormImpl.setBonaAccoContactPerson("");
		}
		else {
			tourismBonaAccommodationFormImpl.setBonaAccoContactPerson(
				bonaAccoContactPerson);
		}

		if (bonaAccoPositionHeld == null) {
			tourismBonaAccommodationFormImpl.setBonaAccoPositionHeld("");
		}
		else {
			tourismBonaAccommodationFormImpl.setBonaAccoPositionHeld(
				bonaAccoPositionHeld);
		}

		tourismBonaAccommodationFormImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismBonaAccommodationFormImpl.resetOriginalValues();

		return tourismBonaAccommodationFormImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismBonaAFId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		bonaAccoDateOfApplication = objectInput.readLong();
		bonaAccoTypeOfAccommodation = objectInput.readUTF();
		bonaAccoPurposeOfIncentives = objectInput.readUTF();
		bonaAccoOtherIncPurpose = objectInput.readUTF();
		bonaAccoNameOfProperty = objectInput.readUTF();
		bonaAccoNameOfOwner = objectInput.readUTF();
		bonaAccoLocation = objectInput.readUTF();
		bonaAccoCompanyNumber = objectInput.readUTF();
		bonaBusinessRegistrationNumber = objectInput.readUTF();
		bonaAccoDateOfRegistration = objectInput.readLong();
		bonaAccoOwnerTrnNumber = objectInput.readUTF();
		bonaAccoTccNumber = objectInput.readUTF();
		bonaAccoExpiryDate = objectInput.readLong();
		bonaAccoNameOfOperator = objectInput.readUTF();
		bonaAccoOperatorTrnNumber = objectInput.readUTF();
		bonaAccoOperatorTccNumber = objectInput.readUTF();
		bonaAccoOperatorExpiryDate = objectInput.readLong();
		bonaAccoContactPerson = objectInput.readUTF();
		bonaAccoPositionHeld = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismBonaAFId);

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
		objectOutput.writeLong(bonaAccoDateOfApplication);

		if (bonaAccoTypeOfAccommodation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAccoTypeOfAccommodation);
		}

		if (bonaAccoPurposeOfIncentives == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAccoPurposeOfIncentives);
		}

		if (bonaAccoOtherIncPurpose == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAccoOtherIncPurpose);
		}

		if (bonaAccoNameOfProperty == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAccoNameOfProperty);
		}

		if (bonaAccoNameOfOwner == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAccoNameOfOwner);
		}

		if (bonaAccoLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAccoLocation);
		}

		if (bonaAccoCompanyNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAccoCompanyNumber);
		}

		if (bonaBusinessRegistrationNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaBusinessRegistrationNumber);
		}

		objectOutput.writeLong(bonaAccoDateOfRegistration);

		if (bonaAccoOwnerTrnNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAccoOwnerTrnNumber);
		}

		if (bonaAccoTccNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAccoTccNumber);
		}

		objectOutput.writeLong(bonaAccoExpiryDate);

		if (bonaAccoNameOfOperator == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAccoNameOfOperator);
		}

		if (bonaAccoOperatorTrnNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAccoOperatorTrnNumber);
		}

		if (bonaAccoOperatorTccNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAccoOperatorTccNumber);
		}

		objectOutput.writeLong(bonaAccoOperatorExpiryDate);

		if (bonaAccoContactPerson == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAccoContactPerson);
		}

		if (bonaAccoPositionHeld == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAccoPositionHeld);
		}

		objectOutput.writeLong(tourismApplicationId);
	}

	public long tourismBonaAFId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long bonaAccoDateOfApplication;
	public String bonaAccoTypeOfAccommodation;
	public String bonaAccoPurposeOfIncentives;
	public String bonaAccoOtherIncPurpose;
	public String bonaAccoNameOfProperty;
	public String bonaAccoNameOfOwner;
	public String bonaAccoLocation;
	public String bonaAccoCompanyNumber;
	public String bonaBusinessRegistrationNumber;
	public long bonaAccoDateOfRegistration;
	public String bonaAccoOwnerTrnNumber;
	public String bonaAccoTccNumber;
	public long bonaAccoExpiryDate;
	public String bonaAccoNameOfOperator;
	public String bonaAccoOperatorTrnNumber;
	public String bonaAccoOperatorTccNumber;
	public long bonaAccoOperatorExpiryDate;
	public String bonaAccoContactPerson;
	public String bonaAccoPositionHeld;
	public long tourismApplicationId;

}