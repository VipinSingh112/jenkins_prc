/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.FitPropPersonalDetailInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FitPropPersonalDetailInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FitPropPersonalDetailInfoCacheModel
	implements CacheModel<FitPropPersonalDetailInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FitPropPersonalDetailInfoCacheModel)) {
			return false;
		}

		FitPropPersonalDetailInfoCacheModel
			fitPropPersonalDetailInfoCacheModel =
				(FitPropPersonalDetailInfoCacheModel)object;

		if (fitPropPersonalDetailInfoId ==
				fitPropPersonalDetailInfoCacheModel.
					fitPropPersonalDetailInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fitPropPersonalDetailInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(75);

		sb.append("{fitPropPersonalDetailInfoId=");
		sb.append(fitPropPersonalDetailInfoId);
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
		sb.append(", applicantFirstName=");
		sb.append(applicantFirstName);
		sb.append(", applicantMiddleName=");
		sb.append(applicantMiddleName);
		sb.append(", applicantSurname=");
		sb.append(applicantSurname);
		sb.append(", applicantFormerName=");
		sb.append(applicantFormerName);
		sb.append(", applicantAlias=");
		sb.append(applicantAlias);
		sb.append(", applicantStreetName=");
		sb.append(applicantStreetName);
		sb.append(", applicantStreetNo=");
		sb.append(applicantStreetNo);
		sb.append(", applicantPostalCode=");
		sb.append(applicantPostalCode);
		sb.append(", applicantCountry=");
		sb.append(applicantCountry);
		sb.append(", applicantTownName=");
		sb.append(applicantTownName);
		sb.append(", applicantCity=");
		sb.append(applicantCity);
		sb.append(", applicantParish=");
		sb.append(applicantParish);
		sb.append(", applicantTelephoneNum=");
		sb.append(applicantTelephoneNum);
		sb.append(", applicantEmailAdd=");
		sb.append(applicantEmailAdd);
		sb.append(", applicantDateBirth=");
		sb.append(applicantDateBirth);
		sb.append(", applicantPlaceOfBirthTown=");
		sb.append(applicantPlaceOfBirthTown);
		sb.append(", applicantPlaceOfBirthParish=");
		sb.append(applicantPlaceOfBirthParish);
		sb.append(", applicantPlaceOfBirthCountry=");
		sb.append(applicantPlaceOfBirthCountry);
		sb.append(", applicantNationality=");
		sb.append(applicantNationality);
		sb.append(", applicantNisNum=");
		sb.append(applicantNisNum);
		sb.append(", applicantSocialNum=");
		sb.append(applicantSocialNum);
		sb.append(", applicantNationalNum=");
		sb.append(applicantNationalNum);
		sb.append(", applicantRegistrationNum=");
		sb.append(applicantRegistrationNum);
		sb.append(", maritalStatusDetails=");
		sb.append(maritalStatusDetails);
		sb.append(", applicantRelationship=");
		sb.append(applicantRelationship);
		sb.append(", applicantSecTelephone=");
		sb.append(applicantSecTelephone);
		sb.append(", applicantSecMail=");
		sb.append(applicantSecMail);
		sb.append(", applicantSecAddress=");
		sb.append(applicantSecAddress);
		sb.append(", applicantSecAddressParish=");
		sb.append(applicantSecAddressParish);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FitPropPersonalDetailInfo toEntityModel() {
		FitPropPersonalDetailInfoImpl fitPropPersonalDetailInfoImpl =
			new FitPropPersonalDetailInfoImpl();

		fitPropPersonalDetailInfoImpl.setFitPropPersonalDetailInfoId(
			fitPropPersonalDetailInfoId);
		fitPropPersonalDetailInfoImpl.setGroupId(groupId);
		fitPropPersonalDetailInfoImpl.setCompanyId(companyId);
		fitPropPersonalDetailInfoImpl.setUserId(userId);

		if (userName == null) {
			fitPropPersonalDetailInfoImpl.setUserName("");
		}
		else {
			fitPropPersonalDetailInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			fitPropPersonalDetailInfoImpl.setCreateDate(null);
		}
		else {
			fitPropPersonalDetailInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			fitPropPersonalDetailInfoImpl.setModifiedDate(null);
		}
		else {
			fitPropPersonalDetailInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (applicantFirstName == null) {
			fitPropPersonalDetailInfoImpl.setApplicantFirstName("");
		}
		else {
			fitPropPersonalDetailInfoImpl.setApplicantFirstName(
				applicantFirstName);
		}

		if (applicantMiddleName == null) {
			fitPropPersonalDetailInfoImpl.setApplicantMiddleName("");
		}
		else {
			fitPropPersonalDetailInfoImpl.setApplicantMiddleName(
				applicantMiddleName);
		}

		if (applicantSurname == null) {
			fitPropPersonalDetailInfoImpl.setApplicantSurname("");
		}
		else {
			fitPropPersonalDetailInfoImpl.setApplicantSurname(applicantSurname);
		}

		if (applicantFormerName == null) {
			fitPropPersonalDetailInfoImpl.setApplicantFormerName("");
		}
		else {
			fitPropPersonalDetailInfoImpl.setApplicantFormerName(
				applicantFormerName);
		}

		if (applicantAlias == null) {
			fitPropPersonalDetailInfoImpl.setApplicantAlias("");
		}
		else {
			fitPropPersonalDetailInfoImpl.setApplicantAlias(applicantAlias);
		}

		if (applicantStreetName == null) {
			fitPropPersonalDetailInfoImpl.setApplicantStreetName("");
		}
		else {
			fitPropPersonalDetailInfoImpl.setApplicantStreetName(
				applicantStreetName);
		}

		if (applicantStreetNo == null) {
			fitPropPersonalDetailInfoImpl.setApplicantStreetNo("");
		}
		else {
			fitPropPersonalDetailInfoImpl.setApplicantStreetNo(
				applicantStreetNo);
		}

		if (applicantPostalCode == null) {
			fitPropPersonalDetailInfoImpl.setApplicantPostalCode("");
		}
		else {
			fitPropPersonalDetailInfoImpl.setApplicantPostalCode(
				applicantPostalCode);
		}

		if (applicantCountry == null) {
			fitPropPersonalDetailInfoImpl.setApplicantCountry("");
		}
		else {
			fitPropPersonalDetailInfoImpl.setApplicantCountry(applicantCountry);
		}

		if (applicantTownName == null) {
			fitPropPersonalDetailInfoImpl.setApplicantTownName("");
		}
		else {
			fitPropPersonalDetailInfoImpl.setApplicantTownName(
				applicantTownName);
		}

		if (applicantCity == null) {
			fitPropPersonalDetailInfoImpl.setApplicantCity("");
		}
		else {
			fitPropPersonalDetailInfoImpl.setApplicantCity(applicantCity);
		}

		if (applicantParish == null) {
			fitPropPersonalDetailInfoImpl.setApplicantParish("");
		}
		else {
			fitPropPersonalDetailInfoImpl.setApplicantParish(applicantParish);
		}

		if (applicantTelephoneNum == null) {
			fitPropPersonalDetailInfoImpl.setApplicantTelephoneNum("");
		}
		else {
			fitPropPersonalDetailInfoImpl.setApplicantTelephoneNum(
				applicantTelephoneNum);
		}

		if (applicantEmailAdd == null) {
			fitPropPersonalDetailInfoImpl.setApplicantEmailAdd("");
		}
		else {
			fitPropPersonalDetailInfoImpl.setApplicantEmailAdd(
				applicantEmailAdd);
		}

		if (applicantDateBirth == Long.MIN_VALUE) {
			fitPropPersonalDetailInfoImpl.setApplicantDateBirth(null);
		}
		else {
			fitPropPersonalDetailInfoImpl.setApplicantDateBirth(
				new Date(applicantDateBirth));
		}

		if (applicantPlaceOfBirthTown == null) {
			fitPropPersonalDetailInfoImpl.setApplicantPlaceOfBirthTown("");
		}
		else {
			fitPropPersonalDetailInfoImpl.setApplicantPlaceOfBirthTown(
				applicantPlaceOfBirthTown);
		}

		if (applicantPlaceOfBirthParish == null) {
			fitPropPersonalDetailInfoImpl.setApplicantPlaceOfBirthParish("");
		}
		else {
			fitPropPersonalDetailInfoImpl.setApplicantPlaceOfBirthParish(
				applicantPlaceOfBirthParish);
		}

		if (applicantPlaceOfBirthCountry == null) {
			fitPropPersonalDetailInfoImpl.setApplicantPlaceOfBirthCountry("");
		}
		else {
			fitPropPersonalDetailInfoImpl.setApplicantPlaceOfBirthCountry(
				applicantPlaceOfBirthCountry);
		}

		if (applicantNationality == null) {
			fitPropPersonalDetailInfoImpl.setApplicantNationality("");
		}
		else {
			fitPropPersonalDetailInfoImpl.setApplicantNationality(
				applicantNationality);
		}

		if (applicantNisNum == null) {
			fitPropPersonalDetailInfoImpl.setApplicantNisNum("");
		}
		else {
			fitPropPersonalDetailInfoImpl.setApplicantNisNum(applicantNisNum);
		}

		if (applicantSocialNum == null) {
			fitPropPersonalDetailInfoImpl.setApplicantSocialNum("");
		}
		else {
			fitPropPersonalDetailInfoImpl.setApplicantSocialNum(
				applicantSocialNum);
		}

		if (applicantNationalNum == null) {
			fitPropPersonalDetailInfoImpl.setApplicantNationalNum("");
		}
		else {
			fitPropPersonalDetailInfoImpl.setApplicantNationalNum(
				applicantNationalNum);
		}

		if (applicantRegistrationNum == null) {
			fitPropPersonalDetailInfoImpl.setApplicantRegistrationNum("");
		}
		else {
			fitPropPersonalDetailInfoImpl.setApplicantRegistrationNum(
				applicantRegistrationNum);
		}

		if (maritalStatusDetails == null) {
			fitPropPersonalDetailInfoImpl.setMaritalStatusDetails("");
		}
		else {
			fitPropPersonalDetailInfoImpl.setMaritalStatusDetails(
				maritalStatusDetails);
		}

		if (applicantRelationship == null) {
			fitPropPersonalDetailInfoImpl.setApplicantRelationship("");
		}
		else {
			fitPropPersonalDetailInfoImpl.setApplicantRelationship(
				applicantRelationship);
		}

		if (applicantSecTelephone == null) {
			fitPropPersonalDetailInfoImpl.setApplicantSecTelephone("");
		}
		else {
			fitPropPersonalDetailInfoImpl.setApplicantSecTelephone(
				applicantSecTelephone);
		}

		if (applicantSecMail == null) {
			fitPropPersonalDetailInfoImpl.setApplicantSecMail("");
		}
		else {
			fitPropPersonalDetailInfoImpl.setApplicantSecMail(applicantSecMail);
		}

		if (applicantSecAddress == null) {
			fitPropPersonalDetailInfoImpl.setApplicantSecAddress("");
		}
		else {
			fitPropPersonalDetailInfoImpl.setApplicantSecAddress(
				applicantSecAddress);
		}

		if (applicantSecAddressParish == null) {
			fitPropPersonalDetailInfoImpl.setApplicantSecAddressParish("");
		}
		else {
			fitPropPersonalDetailInfoImpl.setApplicantSecAddressParish(
				applicantSecAddressParish);
		}

		fitPropPersonalDetailInfoImpl.setHsraApplicationId(hsraApplicationId);

		fitPropPersonalDetailInfoImpl.resetOriginalValues();

		return fitPropPersonalDetailInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fitPropPersonalDetailInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		applicantFirstName = objectInput.readUTF();
		applicantMiddleName = objectInput.readUTF();
		applicantSurname = objectInput.readUTF();
		applicantFormerName = objectInput.readUTF();
		applicantAlias = objectInput.readUTF();
		applicantStreetName = objectInput.readUTF();
		applicantStreetNo = objectInput.readUTF();
		applicantPostalCode = objectInput.readUTF();
		applicantCountry = objectInput.readUTF();
		applicantTownName = objectInput.readUTF();
		applicantCity = objectInput.readUTF();
		applicantParish = objectInput.readUTF();
		applicantTelephoneNum = objectInput.readUTF();
		applicantEmailAdd = objectInput.readUTF();
		applicantDateBirth = objectInput.readLong();
		applicantPlaceOfBirthTown = objectInput.readUTF();
		applicantPlaceOfBirthParish = objectInput.readUTF();
		applicantPlaceOfBirthCountry = objectInput.readUTF();
		applicantNationality = objectInput.readUTF();
		applicantNisNum = objectInput.readUTF();
		applicantSocialNum = objectInput.readUTF();
		applicantNationalNum = objectInput.readUTF();
		applicantRegistrationNum = objectInput.readUTF();
		maritalStatusDetails = objectInput.readUTF();
		applicantRelationship = objectInput.readUTF();
		applicantSecTelephone = objectInput.readUTF();
		applicantSecMail = objectInput.readUTF();
		applicantSecAddress = objectInput.readUTF();
		applicantSecAddressParish = objectInput.readUTF();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(fitPropPersonalDetailInfoId);

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

		if (applicantFirstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantFirstName);
		}

		if (applicantMiddleName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantMiddleName);
		}

		if (applicantSurname == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantSurname);
		}

		if (applicantFormerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantFormerName);
		}

		if (applicantAlias == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantAlias);
		}

		if (applicantStreetName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantStreetName);
		}

		if (applicantStreetNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantStreetNo);
		}

		if (applicantPostalCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantPostalCode);
		}

		if (applicantCountry == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantCountry);
		}

		if (applicantTownName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantTownName);
		}

		if (applicantCity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantCity);
		}

		if (applicantParish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantParish);
		}

		if (applicantTelephoneNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantTelephoneNum);
		}

		if (applicantEmailAdd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantEmailAdd);
		}

		objectOutput.writeLong(applicantDateBirth);

		if (applicantPlaceOfBirthTown == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantPlaceOfBirthTown);
		}

		if (applicantPlaceOfBirthParish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantPlaceOfBirthParish);
		}

		if (applicantPlaceOfBirthCountry == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantPlaceOfBirthCountry);
		}

		if (applicantNationality == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantNationality);
		}

		if (applicantNisNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantNisNum);
		}

		if (applicantSocialNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantSocialNum);
		}

		if (applicantNationalNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantNationalNum);
		}

		if (applicantRegistrationNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantRegistrationNum);
		}

		if (maritalStatusDetails == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(maritalStatusDetails);
		}

		if (applicantRelationship == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantRelationship);
		}

		if (applicantSecTelephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantSecTelephone);
		}

		if (applicantSecMail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantSecMail);
		}

		if (applicantSecAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantSecAddress);
		}

		if (applicantSecAddressParish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantSecAddressParish);
		}

		objectOutput.writeLong(hsraApplicationId);
	}

	public long fitPropPersonalDetailInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String applicantFirstName;
	public String applicantMiddleName;
	public String applicantSurname;
	public String applicantFormerName;
	public String applicantAlias;
	public String applicantStreetName;
	public String applicantStreetNo;
	public String applicantPostalCode;
	public String applicantCountry;
	public String applicantTownName;
	public String applicantCity;
	public String applicantParish;
	public String applicantTelephoneNum;
	public String applicantEmailAdd;
	public long applicantDateBirth;
	public String applicantPlaceOfBirthTown;
	public String applicantPlaceOfBirthParish;
	public String applicantPlaceOfBirthCountry;
	public String applicantNationality;
	public String applicantNisNum;
	public String applicantSocialNum;
	public String applicantNationalNum;
	public String applicantRegistrationNum;
	public String maritalStatusDetails;
	public String applicantRelationship;
	public String applicantSecTelephone;
	public String applicantSecMail;
	public String applicantSecAddress;
	public String applicantSecAddressParish;
	public long hsraApplicationId;

}