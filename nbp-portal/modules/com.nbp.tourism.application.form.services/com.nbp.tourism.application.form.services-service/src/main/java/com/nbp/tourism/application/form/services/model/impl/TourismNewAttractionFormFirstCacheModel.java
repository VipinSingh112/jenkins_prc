/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismNewAttractionFormFirst;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismNewAttractionFormFirst in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismNewAttractionFormFirstCacheModel
	implements CacheModel<TourismNewAttractionFormFirst>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismNewAttractionFormFirstCacheModel)) {
			return false;
		}

		TourismNewAttractionFormFirstCacheModel
			tourismNewAttractionFormFirstCacheModel =
				(TourismNewAttractionFormFirstCacheModel)object;

		if (tourismNewAttractFormFirstId ==
				tourismNewAttractionFormFirstCacheModel.
					tourismNewAttractFormFirstId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismNewAttractFormFirstId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(55);

		sb.append("{tourismNewAttractFormFirstId=");
		sb.append(tourismNewAttractFormFirstId);
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
		sb.append(", attractionDateOfApplication=");
		sb.append(attractionDateOfApplication);
		sb.append(", typeOfAttrcation=");
		sb.append(typeOfAttrcation);
		sb.append(", attractionNameOfProperty=");
		sb.append(attractionNameOfProperty);
		sb.append(", attractionNameOfOwner=");
		sb.append(attractionNameOfOwner);
		sb.append(", attractionLocation=");
		sb.append(attractionLocation);
		sb.append(", attractionCompanyNumber=");
		sb.append(attractionCompanyNumber);
		sb.append(", attractionBusinessRegisNo=");
		sb.append(attractionBusinessRegisNo);
		sb.append(", attractionDateOfRegistration=");
		sb.append(attractionDateOfRegistration);
		sb.append(", attractionOwnerTrnNumber=");
		sb.append(attractionOwnerTrnNumber);
		sb.append(", attractionTccNumber=");
		sb.append(attractionTccNumber);
		sb.append(", attractionExpiryDate=");
		sb.append(attractionExpiryDate);
		sb.append(", attractionNameOfOperator=");
		sb.append(attractionNameOfOperator);
		sb.append(", attractionoperatorTrnNumber=");
		sb.append(attractionoperatorTrnNumber);
		sb.append(", attractionOperatorTccNumber=");
		sb.append(attractionOperatorTccNumber);
		sb.append(", attractOperatorExpiryDate=");
		sb.append(attractOperatorExpiryDate);
		sb.append(", attractionContactPerson=");
		sb.append(attractionContactPerson);
		sb.append(", attractionPositionHeld=");
		sb.append(attractionPositionHeld);
		sb.append(", attractionEntityId=");
		sb.append(attractionEntityId);
		sb.append(", attractionBriefdescription=");
		sb.append(attractionBriefdescription);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismNewAttractionFormFirst toEntityModel() {
		TourismNewAttractionFormFirstImpl tourismNewAttractionFormFirstImpl =
			new TourismNewAttractionFormFirstImpl();

		tourismNewAttractionFormFirstImpl.setTourismNewAttractFormFirstId(
			tourismNewAttractFormFirstId);
		tourismNewAttractionFormFirstImpl.setGroupId(groupId);
		tourismNewAttractionFormFirstImpl.setCompanyId(companyId);
		tourismNewAttractionFormFirstImpl.setUserId(userId);

		if (userName == null) {
			tourismNewAttractionFormFirstImpl.setUserName("");
		}
		else {
			tourismNewAttractionFormFirstImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismNewAttractionFormFirstImpl.setCreateDate(null);
		}
		else {
			tourismNewAttractionFormFirstImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismNewAttractionFormFirstImpl.setModifiedDate(null);
		}
		else {
			tourismNewAttractionFormFirstImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (attractionDateOfApplication == Long.MIN_VALUE) {
			tourismNewAttractionFormFirstImpl.setAttractionDateOfApplication(
				null);
		}
		else {
			tourismNewAttractionFormFirstImpl.setAttractionDateOfApplication(
				new Date(attractionDateOfApplication));
		}

		if (typeOfAttrcation == null) {
			tourismNewAttractionFormFirstImpl.setTypeOfAttrcation("");
		}
		else {
			tourismNewAttractionFormFirstImpl.setTypeOfAttrcation(
				typeOfAttrcation);
		}

		if (attractionNameOfProperty == null) {
			tourismNewAttractionFormFirstImpl.setAttractionNameOfProperty("");
		}
		else {
			tourismNewAttractionFormFirstImpl.setAttractionNameOfProperty(
				attractionNameOfProperty);
		}

		if (attractionNameOfOwner == null) {
			tourismNewAttractionFormFirstImpl.setAttractionNameOfOwner("");
		}
		else {
			tourismNewAttractionFormFirstImpl.setAttractionNameOfOwner(
				attractionNameOfOwner);
		}

		if (attractionLocation == null) {
			tourismNewAttractionFormFirstImpl.setAttractionLocation("");
		}
		else {
			tourismNewAttractionFormFirstImpl.setAttractionLocation(
				attractionLocation);
		}

		if (attractionCompanyNumber == null) {
			tourismNewAttractionFormFirstImpl.setAttractionCompanyNumber("");
		}
		else {
			tourismNewAttractionFormFirstImpl.setAttractionCompanyNumber(
				attractionCompanyNumber);
		}

		if (attractionBusinessRegisNo == null) {
			tourismNewAttractionFormFirstImpl.setAttractionBusinessRegisNo("");
		}
		else {
			tourismNewAttractionFormFirstImpl.setAttractionBusinessRegisNo(
				attractionBusinessRegisNo);
		}

		if (attractionDateOfRegistration == Long.MIN_VALUE) {
			tourismNewAttractionFormFirstImpl.setAttractionDateOfRegistration(
				null);
		}
		else {
			tourismNewAttractionFormFirstImpl.setAttractionDateOfRegistration(
				new Date(attractionDateOfRegistration));
		}

		if (attractionOwnerTrnNumber == null) {
			tourismNewAttractionFormFirstImpl.setAttractionOwnerTrnNumber("");
		}
		else {
			tourismNewAttractionFormFirstImpl.setAttractionOwnerTrnNumber(
				attractionOwnerTrnNumber);
		}

		if (attractionTccNumber == null) {
			tourismNewAttractionFormFirstImpl.setAttractionTccNumber("");
		}
		else {
			tourismNewAttractionFormFirstImpl.setAttractionTccNumber(
				attractionTccNumber);
		}

		if (attractionExpiryDate == Long.MIN_VALUE) {
			tourismNewAttractionFormFirstImpl.setAttractionExpiryDate(null);
		}
		else {
			tourismNewAttractionFormFirstImpl.setAttractionExpiryDate(
				new Date(attractionExpiryDate));
		}

		if (attractionNameOfOperator == null) {
			tourismNewAttractionFormFirstImpl.setAttractionNameOfOperator("");
		}
		else {
			tourismNewAttractionFormFirstImpl.setAttractionNameOfOperator(
				attractionNameOfOperator);
		}

		if (attractionoperatorTrnNumber == null) {
			tourismNewAttractionFormFirstImpl.setAttractionoperatorTrnNumber(
				"");
		}
		else {
			tourismNewAttractionFormFirstImpl.setAttractionoperatorTrnNumber(
				attractionoperatorTrnNumber);
		}

		if (attractionOperatorTccNumber == null) {
			tourismNewAttractionFormFirstImpl.setAttractionOperatorTccNumber(
				"");
		}
		else {
			tourismNewAttractionFormFirstImpl.setAttractionOperatorTccNumber(
				attractionOperatorTccNumber);
		}

		if (attractOperatorExpiryDate == Long.MIN_VALUE) {
			tourismNewAttractionFormFirstImpl.setAttractOperatorExpiryDate(
				null);
		}
		else {
			tourismNewAttractionFormFirstImpl.setAttractOperatorExpiryDate(
				new Date(attractOperatorExpiryDate));
		}

		if (attractionContactPerson == null) {
			tourismNewAttractionFormFirstImpl.setAttractionContactPerson("");
		}
		else {
			tourismNewAttractionFormFirstImpl.setAttractionContactPerson(
				attractionContactPerson);
		}

		if (attractionPositionHeld == null) {
			tourismNewAttractionFormFirstImpl.setAttractionPositionHeld("");
		}
		else {
			tourismNewAttractionFormFirstImpl.setAttractionPositionHeld(
				attractionPositionHeld);
		}

		if (attractionEntityId == null) {
			tourismNewAttractionFormFirstImpl.setAttractionEntityId("");
		}
		else {
			tourismNewAttractionFormFirstImpl.setAttractionEntityId(
				attractionEntityId);
		}

		if (attractionBriefdescription == null) {
			tourismNewAttractionFormFirstImpl.setAttractionBriefdescription("");
		}
		else {
			tourismNewAttractionFormFirstImpl.setAttractionBriefdescription(
				attractionBriefdescription);
		}

		tourismNewAttractionFormFirstImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismNewAttractionFormFirstImpl.resetOriginalValues();

		return tourismNewAttractionFormFirstImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismNewAttractFormFirstId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		attractionDateOfApplication = objectInput.readLong();
		typeOfAttrcation = objectInput.readUTF();
		attractionNameOfProperty = objectInput.readUTF();
		attractionNameOfOwner = objectInput.readUTF();
		attractionLocation = objectInput.readUTF();
		attractionCompanyNumber = objectInput.readUTF();
		attractionBusinessRegisNo = objectInput.readUTF();
		attractionDateOfRegistration = objectInput.readLong();
		attractionOwnerTrnNumber = objectInput.readUTF();
		attractionTccNumber = objectInput.readUTF();
		attractionExpiryDate = objectInput.readLong();
		attractionNameOfOperator = objectInput.readUTF();
		attractionoperatorTrnNumber = objectInput.readUTF();
		attractionOperatorTccNumber = objectInput.readUTF();
		attractOperatorExpiryDate = objectInput.readLong();
		attractionContactPerson = objectInput.readUTF();
		attractionPositionHeld = objectInput.readUTF();
		attractionEntityId = objectInput.readUTF();
		attractionBriefdescription = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismNewAttractFormFirstId);

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
		objectOutput.writeLong(attractionDateOfApplication);

		if (typeOfAttrcation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfAttrcation);
		}

		if (attractionNameOfProperty == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(attractionNameOfProperty);
		}

		if (attractionNameOfOwner == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(attractionNameOfOwner);
		}

		if (attractionLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(attractionLocation);
		}

		if (attractionCompanyNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(attractionCompanyNumber);
		}

		if (attractionBusinessRegisNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(attractionBusinessRegisNo);
		}

		objectOutput.writeLong(attractionDateOfRegistration);

		if (attractionOwnerTrnNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(attractionOwnerTrnNumber);
		}

		if (attractionTccNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(attractionTccNumber);
		}

		objectOutput.writeLong(attractionExpiryDate);

		if (attractionNameOfOperator == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(attractionNameOfOperator);
		}

		if (attractionoperatorTrnNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(attractionoperatorTrnNumber);
		}

		if (attractionOperatorTccNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(attractionOperatorTccNumber);
		}

		objectOutput.writeLong(attractOperatorExpiryDate);

		if (attractionContactPerson == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(attractionContactPerson);
		}

		if (attractionPositionHeld == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(attractionPositionHeld);
		}

		if (attractionEntityId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(attractionEntityId);
		}

		if (attractionBriefdescription == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(attractionBriefdescription);
		}

		objectOutput.writeLong(tourismApplicationId);
	}

	public long tourismNewAttractFormFirstId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long attractionDateOfApplication;
	public String typeOfAttrcation;
	public String attractionNameOfProperty;
	public String attractionNameOfOwner;
	public String attractionLocation;
	public String attractionCompanyNumber;
	public String attractionBusinessRegisNo;
	public long attractionDateOfRegistration;
	public String attractionOwnerTrnNumber;
	public String attractionTccNumber;
	public long attractionExpiryDate;
	public String attractionNameOfOperator;
	public String attractionoperatorTrnNumber;
	public String attractionOperatorTccNumber;
	public long attractOperatorExpiryDate;
	public String attractionContactPerson;
	public String attractionPositionHeld;
	public String attractionEntityId;
	public String attractionBriefdescription;
	public long tourismApplicationId;

}