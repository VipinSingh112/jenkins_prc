/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismBonaAttractionFormFirst;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismBonaAttractionFormFirst in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismBonaAttractionFormFirstCacheModel
	implements CacheModel<TourismBonaAttractionFormFirst>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismBonaAttractionFormFirstCacheModel)) {
			return false;
		}

		TourismBonaAttractionFormFirstCacheModel
			tourismBonaAttractionFormFirstCacheModel =
				(TourismBonaAttractionFormFirstCacheModel)object;

		if (tourismBonaAttractFormFirstId ==
				tourismBonaAttractionFormFirstCacheModel.
					tourismBonaAttractFormFirstId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismBonaAttractFormFirstId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(59);

		sb.append("{tourismBonaAttractFormFirstId=");
		sb.append(tourismBonaAttractFormFirstId);
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
		sb.append(", bonaAttractDateOfApplication=");
		sb.append(bonaAttractDateOfApplication);
		sb.append(", bonaTypeOfAttrcation=");
		sb.append(bonaTypeOfAttrcation);
		sb.append(", bonaAttractPurposeOfIncentives=");
		sb.append(bonaAttractPurposeOfIncentives);
		sb.append(", bonaAttractOtherIncPurpose=");
		sb.append(bonaAttractOtherIncPurpose);
		sb.append(", bonaAttractionNameOfProperty=");
		sb.append(bonaAttractionNameOfProperty);
		sb.append(", bonaAttractionNameOfOwner=");
		sb.append(bonaAttractionNameOfOwner);
		sb.append(", bonaAttractionLocation=");
		sb.append(bonaAttractionLocation);
		sb.append(", bonaAttractionCompanyNumber=");
		sb.append(bonaAttractionCompanyNumber);
		sb.append(", bonaAttractionBusinessRegisNo=");
		sb.append(bonaAttractionBusinessRegisNo);
		sb.append(", bonaAttractionDateOfRegis=");
		sb.append(bonaAttractionDateOfRegis);
		sb.append(", bonaAttractionOwnerTrnNumber=");
		sb.append(bonaAttractionOwnerTrnNumber);
		sb.append(", bonaAttractionTccNumber=");
		sb.append(bonaAttractionTccNumber);
		sb.append(", bonaAttractionExpiryDate=");
		sb.append(bonaAttractionExpiryDate);
		sb.append(", bonaAttractionNameOfOperator=");
		sb.append(bonaAttractionNameOfOperator);
		sb.append(", bonaAttractionoperatorTrnNo=");
		sb.append(bonaAttractionoperatorTrnNo);
		sb.append(", bonattractionOperatorTccNO=");
		sb.append(bonattractionOperatorTccNO);
		sb.append(", bonaAttractOperatorExpiryDate=");
		sb.append(bonaAttractOperatorExpiryDate);
		sb.append(", bonaAttractContactPerson=");
		sb.append(bonaAttractContactPerson);
		sb.append(", bonaAttractPositionHeld=");
		sb.append(bonaAttractPositionHeld);
		sb.append(", bonaAttractEntityId=");
		sb.append(bonaAttractEntityId);
		sb.append(", bonaAttractionBriefdescription=");
		sb.append(bonaAttractionBriefdescription);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismBonaAttractionFormFirst toEntityModel() {
		TourismBonaAttractionFormFirstImpl tourismBonaAttractionFormFirstImpl =
			new TourismBonaAttractionFormFirstImpl();

		tourismBonaAttractionFormFirstImpl.setTourismBonaAttractFormFirstId(
			tourismBonaAttractFormFirstId);
		tourismBonaAttractionFormFirstImpl.setGroupId(groupId);
		tourismBonaAttractionFormFirstImpl.setCompanyId(companyId);
		tourismBonaAttractionFormFirstImpl.setUserId(userId);

		if (userName == null) {
			tourismBonaAttractionFormFirstImpl.setUserName("");
		}
		else {
			tourismBonaAttractionFormFirstImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismBonaAttractionFormFirstImpl.setCreateDate(null);
		}
		else {
			tourismBonaAttractionFormFirstImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismBonaAttractionFormFirstImpl.setModifiedDate(null);
		}
		else {
			tourismBonaAttractionFormFirstImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (bonaAttractDateOfApplication == Long.MIN_VALUE) {
			tourismBonaAttractionFormFirstImpl.setBonaAttractDateOfApplication(
				null);
		}
		else {
			tourismBonaAttractionFormFirstImpl.setBonaAttractDateOfApplication(
				new Date(bonaAttractDateOfApplication));
		}

		if (bonaTypeOfAttrcation == null) {
			tourismBonaAttractionFormFirstImpl.setBonaTypeOfAttrcation("");
		}
		else {
			tourismBonaAttractionFormFirstImpl.setBonaTypeOfAttrcation(
				bonaTypeOfAttrcation);
		}

		if (bonaAttractPurposeOfIncentives == null) {
			tourismBonaAttractionFormFirstImpl.
				setBonaAttractPurposeOfIncentives("");
		}
		else {
			tourismBonaAttractionFormFirstImpl.
				setBonaAttractPurposeOfIncentives(
					bonaAttractPurposeOfIncentives);
		}

		if (bonaAttractOtherIncPurpose == null) {
			tourismBonaAttractionFormFirstImpl.setBonaAttractOtherIncPurpose(
				"");
		}
		else {
			tourismBonaAttractionFormFirstImpl.setBonaAttractOtherIncPurpose(
				bonaAttractOtherIncPurpose);
		}

		if (bonaAttractionNameOfProperty == null) {
			tourismBonaAttractionFormFirstImpl.setBonaAttractionNameOfProperty(
				"");
		}
		else {
			tourismBonaAttractionFormFirstImpl.setBonaAttractionNameOfProperty(
				bonaAttractionNameOfProperty);
		}

		if (bonaAttractionNameOfOwner == null) {
			tourismBonaAttractionFormFirstImpl.setBonaAttractionNameOfOwner("");
		}
		else {
			tourismBonaAttractionFormFirstImpl.setBonaAttractionNameOfOwner(
				bonaAttractionNameOfOwner);
		}

		if (bonaAttractionLocation == null) {
			tourismBonaAttractionFormFirstImpl.setBonaAttractionLocation("");
		}
		else {
			tourismBonaAttractionFormFirstImpl.setBonaAttractionLocation(
				bonaAttractionLocation);
		}

		if (bonaAttractionCompanyNumber == null) {
			tourismBonaAttractionFormFirstImpl.setBonaAttractionCompanyNumber(
				"");
		}
		else {
			tourismBonaAttractionFormFirstImpl.setBonaAttractionCompanyNumber(
				bonaAttractionCompanyNumber);
		}

		if (bonaAttractionBusinessRegisNo == null) {
			tourismBonaAttractionFormFirstImpl.setBonaAttractionBusinessRegisNo(
				"");
		}
		else {
			tourismBonaAttractionFormFirstImpl.setBonaAttractionBusinessRegisNo(
				bonaAttractionBusinessRegisNo);
		}

		if (bonaAttractionDateOfRegis == Long.MIN_VALUE) {
			tourismBonaAttractionFormFirstImpl.setBonaAttractionDateOfRegis(
				null);
		}
		else {
			tourismBonaAttractionFormFirstImpl.setBonaAttractionDateOfRegis(
				new Date(bonaAttractionDateOfRegis));
		}

		if (bonaAttractionOwnerTrnNumber == null) {
			tourismBonaAttractionFormFirstImpl.setBonaAttractionOwnerTrnNumber(
				"");
		}
		else {
			tourismBonaAttractionFormFirstImpl.setBonaAttractionOwnerTrnNumber(
				bonaAttractionOwnerTrnNumber);
		}

		if (bonaAttractionTccNumber == null) {
			tourismBonaAttractionFormFirstImpl.setBonaAttractionTccNumber("");
		}
		else {
			tourismBonaAttractionFormFirstImpl.setBonaAttractionTccNumber(
				bonaAttractionTccNumber);
		}

		if (bonaAttractionExpiryDate == Long.MIN_VALUE) {
			tourismBonaAttractionFormFirstImpl.setBonaAttractionExpiryDate(
				null);
		}
		else {
			tourismBonaAttractionFormFirstImpl.setBonaAttractionExpiryDate(
				new Date(bonaAttractionExpiryDate));
		}

		if (bonaAttractionNameOfOperator == null) {
			tourismBonaAttractionFormFirstImpl.setBonaAttractionNameOfOperator(
				"");
		}
		else {
			tourismBonaAttractionFormFirstImpl.setBonaAttractionNameOfOperator(
				bonaAttractionNameOfOperator);
		}

		if (bonaAttractionoperatorTrnNo == null) {
			tourismBonaAttractionFormFirstImpl.setBonaAttractionoperatorTrnNo(
				"");
		}
		else {
			tourismBonaAttractionFormFirstImpl.setBonaAttractionoperatorTrnNo(
				bonaAttractionoperatorTrnNo);
		}

		if (bonattractionOperatorTccNO == null) {
			tourismBonaAttractionFormFirstImpl.setBonattractionOperatorTccNO(
				"");
		}
		else {
			tourismBonaAttractionFormFirstImpl.setBonattractionOperatorTccNO(
				bonattractionOperatorTccNO);
		}

		if (bonaAttractOperatorExpiryDate == Long.MIN_VALUE) {
			tourismBonaAttractionFormFirstImpl.setBonaAttractOperatorExpiryDate(
				null);
		}
		else {
			tourismBonaAttractionFormFirstImpl.setBonaAttractOperatorExpiryDate(
				new Date(bonaAttractOperatorExpiryDate));
		}

		if (bonaAttractContactPerson == null) {
			tourismBonaAttractionFormFirstImpl.setBonaAttractContactPerson("");
		}
		else {
			tourismBonaAttractionFormFirstImpl.setBonaAttractContactPerson(
				bonaAttractContactPerson);
		}

		if (bonaAttractPositionHeld == null) {
			tourismBonaAttractionFormFirstImpl.setBonaAttractPositionHeld("");
		}
		else {
			tourismBonaAttractionFormFirstImpl.setBonaAttractPositionHeld(
				bonaAttractPositionHeld);
		}

		if (bonaAttractEntityId == null) {
			tourismBonaAttractionFormFirstImpl.setBonaAttractEntityId("");
		}
		else {
			tourismBonaAttractionFormFirstImpl.setBonaAttractEntityId(
				bonaAttractEntityId);
		}

		if (bonaAttractionBriefdescription == null) {
			tourismBonaAttractionFormFirstImpl.
				setBonaAttractionBriefdescription("");
		}
		else {
			tourismBonaAttractionFormFirstImpl.
				setBonaAttractionBriefdescription(
					bonaAttractionBriefdescription);
		}

		tourismBonaAttractionFormFirstImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismBonaAttractionFormFirstImpl.resetOriginalValues();

		return tourismBonaAttractionFormFirstImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismBonaAttractFormFirstId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		bonaAttractDateOfApplication = objectInput.readLong();
		bonaTypeOfAttrcation = objectInput.readUTF();
		bonaAttractPurposeOfIncentives = objectInput.readUTF();
		bonaAttractOtherIncPurpose = objectInput.readUTF();
		bonaAttractionNameOfProperty = objectInput.readUTF();
		bonaAttractionNameOfOwner = objectInput.readUTF();
		bonaAttractionLocation = objectInput.readUTF();
		bonaAttractionCompanyNumber = objectInput.readUTF();
		bonaAttractionBusinessRegisNo = objectInput.readUTF();
		bonaAttractionDateOfRegis = objectInput.readLong();
		bonaAttractionOwnerTrnNumber = objectInput.readUTF();
		bonaAttractionTccNumber = objectInput.readUTF();
		bonaAttractionExpiryDate = objectInput.readLong();
		bonaAttractionNameOfOperator = objectInput.readUTF();
		bonaAttractionoperatorTrnNo = objectInput.readUTF();
		bonattractionOperatorTccNO = objectInput.readUTF();
		bonaAttractOperatorExpiryDate = objectInput.readLong();
		bonaAttractContactPerson = objectInput.readUTF();
		bonaAttractPositionHeld = objectInput.readUTF();
		bonaAttractEntityId = objectInput.readUTF();
		bonaAttractionBriefdescription = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismBonaAttractFormFirstId);

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
		objectOutput.writeLong(bonaAttractDateOfApplication);

		if (bonaTypeOfAttrcation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaTypeOfAttrcation);
		}

		if (bonaAttractPurposeOfIncentives == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAttractPurposeOfIncentives);
		}

		if (bonaAttractOtherIncPurpose == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAttractOtherIncPurpose);
		}

		if (bonaAttractionNameOfProperty == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAttractionNameOfProperty);
		}

		if (bonaAttractionNameOfOwner == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAttractionNameOfOwner);
		}

		if (bonaAttractionLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAttractionLocation);
		}

		if (bonaAttractionCompanyNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAttractionCompanyNumber);
		}

		if (bonaAttractionBusinessRegisNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAttractionBusinessRegisNo);
		}

		objectOutput.writeLong(bonaAttractionDateOfRegis);

		if (bonaAttractionOwnerTrnNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAttractionOwnerTrnNumber);
		}

		if (bonaAttractionTccNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAttractionTccNumber);
		}

		objectOutput.writeLong(bonaAttractionExpiryDate);

		if (bonaAttractionNameOfOperator == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAttractionNameOfOperator);
		}

		if (bonaAttractionoperatorTrnNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAttractionoperatorTrnNo);
		}

		if (bonattractionOperatorTccNO == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonattractionOperatorTccNO);
		}

		objectOutput.writeLong(bonaAttractOperatorExpiryDate);

		if (bonaAttractContactPerson == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAttractContactPerson);
		}

		if (bonaAttractPositionHeld == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAttractPositionHeld);
		}

		if (bonaAttractEntityId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAttractEntityId);
		}

		if (bonaAttractionBriefdescription == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bonaAttractionBriefdescription);
		}

		objectOutput.writeLong(tourismApplicationId);
	}

	public long tourismBonaAttractFormFirstId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long bonaAttractDateOfApplication;
	public String bonaTypeOfAttrcation;
	public String bonaAttractPurposeOfIncentives;
	public String bonaAttractOtherIncPurpose;
	public String bonaAttractionNameOfProperty;
	public String bonaAttractionNameOfOwner;
	public String bonaAttractionLocation;
	public String bonaAttractionCompanyNumber;
	public String bonaAttractionBusinessRegisNo;
	public long bonaAttractionDateOfRegis;
	public String bonaAttractionOwnerTrnNumber;
	public String bonaAttractionTccNumber;
	public long bonaAttractionExpiryDate;
	public String bonaAttractionNameOfOperator;
	public String bonaAttractionoperatorTrnNo;
	public String bonattractionOperatorTccNO;
	public long bonaAttractOperatorExpiryDate;
	public String bonaAttractContactPerson;
	public String bonaAttractPositionHeld;
	public String bonaAttractEntityId;
	public String bonaAttractionBriefdescription;
	public long tourismApplicationId;

}