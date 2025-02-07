/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismNewAccommodationForm;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismNewAccommodationForm in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismNewAccommodationFormCacheModel
	implements CacheModel<TourismNewAccommodationForm>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismNewAccommodationFormCacheModel)) {
			return false;
		}

		TourismNewAccommodationFormCacheModel
			tourismNewAccommodationFormCacheModel =
				(TourismNewAccommodationFormCacheModel)object;

		if (tourismNewAccoFormId ==
				tourismNewAccommodationFormCacheModel.tourismNewAccoFormId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismNewAccoFormId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(51);

		sb.append("{tourismNewAccoFormId=");
		sb.append(tourismNewAccoFormId);
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
		sb.append(", accoDateOfApplication=");
		sb.append(accoDateOfApplication);
		sb.append(", accoTypeOfAccommodation=");
		sb.append(accoTypeOfAccommodation);
		sb.append(", accoNameOfProperty=");
		sb.append(accoNameOfProperty);
		sb.append(", accoNameOfOwner=");
		sb.append(accoNameOfOwner);
		sb.append(", accoLocation=");
		sb.append(accoLocation);
		sb.append(", accoCompanyNumber=");
		sb.append(accoCompanyNumber);
		sb.append(", accoBusinessRegistrationNumber=");
		sb.append(accoBusinessRegistrationNumber);
		sb.append(", accoDateOfRegistration=");
		sb.append(accoDateOfRegistration);
		sb.append(", accoOwnerTrnNumber=");
		sb.append(accoOwnerTrnNumber);
		sb.append(", accoTccNumber=");
		sb.append(accoTccNumber);
		sb.append(", accoExpiryDate=");
		sb.append(accoExpiryDate);
		sb.append(", accoNameOfOperator=");
		sb.append(accoNameOfOperator);
		sb.append(", accoOperatorTrnNumber=");
		sb.append(accoOperatorTrnNumber);
		sb.append(", accoOperatorTccNumber=");
		sb.append(accoOperatorTccNumber);
		sb.append(", accoOperatorExpiryDate=");
		sb.append(accoOperatorExpiryDate);
		sb.append(", accoContactPerson=");
		sb.append(accoContactPerson);
		sb.append(", accoPositionHeld=");
		sb.append(accoPositionHeld);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismNewAccommodationForm toEntityModel() {
		TourismNewAccommodationFormImpl tourismNewAccommodationFormImpl =
			new TourismNewAccommodationFormImpl();

		tourismNewAccommodationFormImpl.setTourismNewAccoFormId(
			tourismNewAccoFormId);
		tourismNewAccommodationFormImpl.setGroupId(groupId);
		tourismNewAccommodationFormImpl.setCompanyId(companyId);
		tourismNewAccommodationFormImpl.setUserId(userId);

		if (userName == null) {
			tourismNewAccommodationFormImpl.setUserName("");
		}
		else {
			tourismNewAccommodationFormImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismNewAccommodationFormImpl.setCreateDate(null);
		}
		else {
			tourismNewAccommodationFormImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismNewAccommodationFormImpl.setModifiedDate(null);
		}
		else {
			tourismNewAccommodationFormImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (accoDateOfApplication == Long.MIN_VALUE) {
			tourismNewAccommodationFormImpl.setAccoDateOfApplication(null);
		}
		else {
			tourismNewAccommodationFormImpl.setAccoDateOfApplication(
				new Date(accoDateOfApplication));
		}

		if (accoTypeOfAccommodation == null) {
			tourismNewAccommodationFormImpl.setAccoTypeOfAccommodation("");
		}
		else {
			tourismNewAccommodationFormImpl.setAccoTypeOfAccommodation(
				accoTypeOfAccommodation);
		}

		if (accoNameOfProperty == null) {
			tourismNewAccommodationFormImpl.setAccoNameOfProperty("");
		}
		else {
			tourismNewAccommodationFormImpl.setAccoNameOfProperty(
				accoNameOfProperty);
		}

		if (accoNameOfOwner == null) {
			tourismNewAccommodationFormImpl.setAccoNameOfOwner("");
		}
		else {
			tourismNewAccommodationFormImpl.setAccoNameOfOwner(accoNameOfOwner);
		}

		if (accoLocation == null) {
			tourismNewAccommodationFormImpl.setAccoLocation("");
		}
		else {
			tourismNewAccommodationFormImpl.setAccoLocation(accoLocation);
		}

		if (accoCompanyNumber == null) {
			tourismNewAccommodationFormImpl.setAccoCompanyNumber("");
		}
		else {
			tourismNewAccommodationFormImpl.setAccoCompanyNumber(
				accoCompanyNumber);
		}

		if (accoBusinessRegistrationNumber == null) {
			tourismNewAccommodationFormImpl.setAccoBusinessRegistrationNumber(
				"");
		}
		else {
			tourismNewAccommodationFormImpl.setAccoBusinessRegistrationNumber(
				accoBusinessRegistrationNumber);
		}

		if (accoDateOfRegistration == Long.MIN_VALUE) {
			tourismNewAccommodationFormImpl.setAccoDateOfRegistration(null);
		}
		else {
			tourismNewAccommodationFormImpl.setAccoDateOfRegistration(
				new Date(accoDateOfRegistration));
		}

		if (accoOwnerTrnNumber == null) {
			tourismNewAccommodationFormImpl.setAccoOwnerTrnNumber("");
		}
		else {
			tourismNewAccommodationFormImpl.setAccoOwnerTrnNumber(
				accoOwnerTrnNumber);
		}

		if (accoTccNumber == null) {
			tourismNewAccommodationFormImpl.setAccoTccNumber("");
		}
		else {
			tourismNewAccommodationFormImpl.setAccoTccNumber(accoTccNumber);
		}

		if (accoExpiryDate == Long.MIN_VALUE) {
			tourismNewAccommodationFormImpl.setAccoExpiryDate(null);
		}
		else {
			tourismNewAccommodationFormImpl.setAccoExpiryDate(
				new Date(accoExpiryDate));
		}

		if (accoNameOfOperator == null) {
			tourismNewAccommodationFormImpl.setAccoNameOfOperator("");
		}
		else {
			tourismNewAccommodationFormImpl.setAccoNameOfOperator(
				accoNameOfOperator);
		}

		if (accoOperatorTrnNumber == null) {
			tourismNewAccommodationFormImpl.setAccoOperatorTrnNumber("");
		}
		else {
			tourismNewAccommodationFormImpl.setAccoOperatorTrnNumber(
				accoOperatorTrnNumber);
		}

		if (accoOperatorTccNumber == null) {
			tourismNewAccommodationFormImpl.setAccoOperatorTccNumber("");
		}
		else {
			tourismNewAccommodationFormImpl.setAccoOperatorTccNumber(
				accoOperatorTccNumber);
		}

		if (accoOperatorExpiryDate == Long.MIN_VALUE) {
			tourismNewAccommodationFormImpl.setAccoOperatorExpiryDate(null);
		}
		else {
			tourismNewAccommodationFormImpl.setAccoOperatorExpiryDate(
				new Date(accoOperatorExpiryDate));
		}

		if (accoContactPerson == null) {
			tourismNewAccommodationFormImpl.setAccoContactPerson("");
		}
		else {
			tourismNewAccommodationFormImpl.setAccoContactPerson(
				accoContactPerson);
		}

		if (accoPositionHeld == null) {
			tourismNewAccommodationFormImpl.setAccoPositionHeld("");
		}
		else {
			tourismNewAccommodationFormImpl.setAccoPositionHeld(
				accoPositionHeld);
		}

		tourismNewAccommodationFormImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismNewAccommodationFormImpl.resetOriginalValues();

		return tourismNewAccommodationFormImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismNewAccoFormId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		accoDateOfApplication = objectInput.readLong();
		accoTypeOfAccommodation = objectInput.readUTF();
		accoNameOfProperty = objectInput.readUTF();
		accoNameOfOwner = objectInput.readUTF();
		accoLocation = objectInput.readUTF();
		accoCompanyNumber = objectInput.readUTF();
		accoBusinessRegistrationNumber = objectInput.readUTF();
		accoDateOfRegistration = objectInput.readLong();
		accoOwnerTrnNumber = objectInput.readUTF();
		accoTccNumber = objectInput.readUTF();
		accoExpiryDate = objectInput.readLong();
		accoNameOfOperator = objectInput.readUTF();
		accoOperatorTrnNumber = objectInput.readUTF();
		accoOperatorTccNumber = objectInput.readUTF();
		accoOperatorExpiryDate = objectInput.readLong();
		accoContactPerson = objectInput.readUTF();
		accoPositionHeld = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismNewAccoFormId);

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
		objectOutput.writeLong(accoDateOfApplication);

		if (accoTypeOfAccommodation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accoTypeOfAccommodation);
		}

		if (accoNameOfProperty == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accoNameOfProperty);
		}

		if (accoNameOfOwner == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accoNameOfOwner);
		}

		if (accoLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accoLocation);
		}

		if (accoCompanyNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accoCompanyNumber);
		}

		if (accoBusinessRegistrationNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accoBusinessRegistrationNumber);
		}

		objectOutput.writeLong(accoDateOfRegistration);

		if (accoOwnerTrnNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accoOwnerTrnNumber);
		}

		if (accoTccNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accoTccNumber);
		}

		objectOutput.writeLong(accoExpiryDate);

		if (accoNameOfOperator == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accoNameOfOperator);
		}

		if (accoOperatorTrnNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accoOperatorTrnNumber);
		}

		if (accoOperatorTccNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accoOperatorTccNumber);
		}

		objectOutput.writeLong(accoOperatorExpiryDate);

		if (accoContactPerson == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accoContactPerson);
		}

		if (accoPositionHeld == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accoPositionHeld);
		}

		objectOutput.writeLong(tourismApplicationId);
	}

	public long tourismNewAccoFormId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long accoDateOfApplication;
	public String accoTypeOfAccommodation;
	public String accoNameOfProperty;
	public String accoNameOfOwner;
	public String accoLocation;
	public String accoCompanyNumber;
	public String accoBusinessRegistrationNumber;
	public long accoDateOfRegistration;
	public String accoOwnerTrnNumber;
	public String accoTccNumber;
	public long accoExpiryDate;
	public String accoNameOfOperator;
	public String accoOperatorTrnNumber;
	public String accoOperatorTccNumber;
	public long accoOperatorExpiryDate;
	public String accoContactPerson;
	public String accoPositionHeld;
	public long tourismApplicationId;

}