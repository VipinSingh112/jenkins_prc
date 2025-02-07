/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismBonaWaterSportsFormFirst;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismBonaWaterSportsFormFirst in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismBonaWaterSportsFormFirstCacheModel
	implements CacheModel<TourismBonaWaterSportsFormFirst>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismBonaWaterSportsFormFirstCacheModel)) {
			return false;
		}

		TourismBonaWaterSportsFormFirstCacheModel
			tourismBonaWaterSportsFormFirstCacheModel =
				(TourismBonaWaterSportsFormFirstCacheModel)object;

		if (tourismBonaWaterSFFirstId ==
				tourismBonaWaterSportsFormFirstCacheModel.
					tourismBonaWaterSFFirstId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismBonaWaterSFFirstId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(55);

		sb.append("{tourismBonaWaterSFFirstId=");
		sb.append(tourismBonaWaterSFFirstId);
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
		sb.append(", bonaWaterTypeOfAttract=");
		sb.append(bonaWaterTypeOfAttract);
		sb.append(", bonaWaterPurposeOfIncentives=");
		sb.append(bonaWaterPurposeOfIncentives);
		sb.append(", bonaWaterOtherIncPurpose=");
		sb.append(bonaWaterOtherIncPurpose);
		sb.append(", bonaNameOfWatersportsEntity=");
		sb.append(bonaNameOfWatersportsEntity);
		sb.append(", bonaWaterNameOfOwnerCompany=");
		sb.append(bonaWaterNameOfOwnerCompany);
		sb.append(", bonaWaterLocation=");
		sb.append(bonaWaterLocation);
		sb.append(", bonaWaterCompanyNo=");
		sb.append(bonaWaterCompanyNo);
		sb.append(", bonaWaterBusinessRegisNo=");
		sb.append(bonaWaterBusinessRegisNo);
		sb.append(", bonaWaterDateOfRegistration=");
		sb.append(bonaWaterDateOfRegistration);
		sb.append(", bonaWaterOwnerTrnNo=");
		sb.append(bonaWaterOwnerTrnNo);
		sb.append(", bonaWaterTccNo=");
		sb.append(bonaWaterTccNo);
		sb.append(", bonaWaterExpiryDate=");
		sb.append(bonaWaterExpiryDate);
		sb.append(", bonaWaterNameOfOperator=");
		sb.append(bonaWaterNameOfOperator);
		sb.append(", bonaWaterOperatorTrnNo=");
		sb.append(bonaWaterOperatorTrnNo);
		sb.append(", bonaWaterOperatorTccNo=");
		sb.append(bonaWaterOperatorTccNo);
		sb.append(", bonaWaterOperatorExpiryDate=");
		sb.append(bonaWaterOperatorExpiryDate);
		sb.append(", bonaWaterContactPerson=");
		sb.append(bonaWaterContactPerson);
		sb.append(", bonaWaterPositionHeld=");
		sb.append(bonaWaterPositionHeld);
		sb.append(", bonaWaterbriefdescription=");
		sb.append(bonaWaterbriefdescription);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismBonaWaterSportsFormFirst toEntityModel() {
		TourismBonaWaterSportsFormFirstImpl
			tourismBonaWaterSportsFormFirstImpl =
				new TourismBonaWaterSportsFormFirstImpl();

		tourismBonaWaterSportsFormFirstImpl.setTourismBonaWaterSFFirstId(
			tourismBonaWaterSFFirstId);
		tourismBonaWaterSportsFormFirstImpl.setGroupId(groupId);
		tourismBonaWaterSportsFormFirstImpl.setCompanyId(companyId);
		tourismBonaWaterSportsFormFirstImpl.setUserId(userId);

		if (userName == null) {
			tourismBonaWaterSportsFormFirstImpl.setUserName("");
		}
		else {
			tourismBonaWaterSportsFormFirstImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismBonaWaterSportsFormFirstImpl.setCreateDate(null);
		}
		else {
			tourismBonaWaterSportsFormFirstImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismBonaWaterSportsFormFirstImpl.setModifiedDate(null);
		}
		else {
			tourismBonaWaterSportsFormFirstImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (bonaWaterTypeOfAttract == null) {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterTypeOfAttract("");
		}
		else {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterTypeOfAttract(
				bonaWaterTypeOfAttract);
		}

		if (bonaWaterPurposeOfIncentives == null) {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterPurposeOfIncentives(
				"");
		}
		else {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterPurposeOfIncentives(
				bonaWaterPurposeOfIncentives);
		}

		if (bonaWaterOtherIncPurpose == null) {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterOtherIncPurpose("");
		}
		else {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterOtherIncPurpose(
				bonaWaterOtherIncPurpose);
		}

		if (bonaNameOfWatersportsEntity == null) {
			tourismBonaWaterSportsFormFirstImpl.setBonaNameOfWatersportsEntity(
				"");
		}
		else {
			tourismBonaWaterSportsFormFirstImpl.setBonaNameOfWatersportsEntity(
				bonaNameOfWatersportsEntity);
		}

		if (bonaWaterNameOfOwnerCompany == null) {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterNameOfOwnerCompany(
				"");
		}
		else {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterNameOfOwnerCompany(
				bonaWaterNameOfOwnerCompany);
		}

		if (bonaWaterLocation == null) {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterLocation("");
		}
		else {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterLocation(
				bonaWaterLocation);
		}

		if (bonaWaterCompanyNo == null) {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterCompanyNo("");
		}
		else {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterCompanyNo(
				bonaWaterCompanyNo);
		}

		if (bonaWaterBusinessRegisNo == null) {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterBusinessRegisNo("");
		}
		else {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterBusinessRegisNo(
				bonaWaterBusinessRegisNo);
		}

		if (bonaWaterDateOfRegistration == Long.MIN_VALUE) {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterDateOfRegistration(
				null);
		}
		else {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterDateOfRegistration(
				new Date(bonaWaterDateOfRegistration));
		}

		if (bonaWaterOwnerTrnNo == null) {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterOwnerTrnNo("");
		}
		else {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterOwnerTrnNo(
				bonaWaterOwnerTrnNo);
		}

		if (bonaWaterTccNo == null) {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterTccNo("");
		}
		else {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterTccNo(
				bonaWaterTccNo);
		}

		if (bonaWaterExpiryDate == null) {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterExpiryDate("");
		}
		else {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterExpiryDate(
				bonaWaterExpiryDate);
		}

		if (bonaWaterNameOfOperator == null) {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterNameOfOperator("");
		}
		else {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterNameOfOperator(
				bonaWaterNameOfOperator);
		}

		if (bonaWaterOperatorTrnNo == null) {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterOperatorTrnNo("");
		}
		else {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterOperatorTrnNo(
				bonaWaterOperatorTrnNo);
		}

		if (bonaWaterOperatorTccNo == null) {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterOperatorTccNo("");
		}
		else {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterOperatorTccNo(
				bonaWaterOperatorTccNo);
		}

		if (bonaWaterOperatorExpiryDate == Long.MIN_VALUE) {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterOperatorExpiryDate(
				null);
		}
		else {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterOperatorExpiryDate(
				new Date(bonaWaterOperatorExpiryDate));
		}

		if (bonaWaterContactPerson == null) {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterContactPerson("");
		}
		else {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterContactPerson(
				bonaWaterContactPerson);
		}

		if (bonaWaterPositionHeld == null) {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterPositionHeld("");
		}
		else {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterPositionHeld(
				bonaWaterPositionHeld);
		}

		if (bonaWaterbriefdescription == null) {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterbriefdescription(
				"");
		}
		else {
			tourismBonaWaterSportsFormFirstImpl.setBonaWaterbriefdescription(
				bonaWaterbriefdescription);
		}

		tourismBonaWaterSportsFormFirstImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismBonaWaterSportsFormFirstImpl.resetOriginalValues();

		return tourismBonaWaterSportsFormFirstImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismBonaWaterSFFirstId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		bonaWaterTypeOfAttract = objectInput.readUTF();
		bonaWaterPurposeOfIncentives = objectInput.readUTF();
		bonaWaterOtherIncPurpose = objectInput.readUTF();
		bonaNameOfWatersportsEntity = objectInput.readUTF();
		bonaWaterNameOfOwnerCompany = objectInput.readUTF();
		bonaWaterLocation = objectInput.readUTF();
		bonaWaterCompanyNo = objectInput.readUTF();
		bonaWaterBusinessRegisNo = objectInput.readUTF();
		bonaWaterDateOfRegistration = objectInput.readLong();
		bonaWaterOwnerTrnNo = objectInput.readUTF();
		bonaWaterTccNo = objectInput.readUTF();
		bonaWaterExpiryDate = objectInput.readUTF();
		bonaWaterNameOfOperator = objectInput.readUTF();
		bonaWaterOperatorTrnNo = objectInput.readUTF();
		bonaWaterOperatorTccNo = objectInput.readUTF();
		bonaWaterOperatorExpiryDate = objectInput.readLong();
		bonaWaterContactPerson = objectInput.readUTF();
		bonaWaterPositionHeld = objectInput.readUTF();
		bonaWaterbriefdescription = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismBonaWaterSFFirstId);

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

		if (bonaWaterTypeOfAttract == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaWaterTypeOfAttract);
		}

		if (bonaWaterPurposeOfIncentives == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaWaterPurposeOfIncentives);
		}

		if (bonaWaterOtherIncPurpose == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaWaterOtherIncPurpose);
		}

		if (bonaNameOfWatersportsEntity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaNameOfWatersportsEntity);
		}

		if (bonaWaterNameOfOwnerCompany == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaWaterNameOfOwnerCompany);
		}

		if (bonaWaterLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaWaterLocation);
		}

		if (bonaWaterCompanyNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaWaterCompanyNo);
		}

		if (bonaWaterBusinessRegisNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaWaterBusinessRegisNo);
		}

		objectOutput.writeLong(bonaWaterDateOfRegistration);

		if (bonaWaterOwnerTrnNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaWaterOwnerTrnNo);
		}

		if (bonaWaterTccNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaWaterTccNo);
		}

		if (bonaWaterExpiryDate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaWaterExpiryDate);
		}

		if (bonaWaterNameOfOperator == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaWaterNameOfOperator);
		}

		if (bonaWaterOperatorTrnNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaWaterOperatorTrnNo);
		}

		if (bonaWaterOperatorTccNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaWaterOperatorTccNo);
		}

		objectOutput.writeLong(bonaWaterOperatorExpiryDate);

		if (bonaWaterContactPerson == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaWaterContactPerson);
		}

		if (bonaWaterPositionHeld == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaWaterPositionHeld);
		}

		if (bonaWaterbriefdescription == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaWaterbriefdescription);
		}

		objectOutput.writeLong(tourismApplicationId);
	}

	public long tourismBonaWaterSFFirstId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String bonaWaterTypeOfAttract;
	public String bonaWaterPurposeOfIncentives;
	public String bonaWaterOtherIncPurpose;
	public String bonaNameOfWatersportsEntity;
	public String bonaWaterNameOfOwnerCompany;
	public String bonaWaterLocation;
	public String bonaWaterCompanyNo;
	public String bonaWaterBusinessRegisNo;
	public long bonaWaterDateOfRegistration;
	public String bonaWaterOwnerTrnNo;
	public String bonaWaterTccNo;
	public String bonaWaterExpiryDate;
	public String bonaWaterNameOfOperator;
	public String bonaWaterOperatorTrnNo;
	public String bonaWaterOperatorTccNo;
	public long bonaWaterOperatorExpiryDate;
	public String bonaWaterContactPerson;
	public String bonaWaterPositionHeld;
	public String bonaWaterbriefdescription;
	public long tourismApplicationId;

}