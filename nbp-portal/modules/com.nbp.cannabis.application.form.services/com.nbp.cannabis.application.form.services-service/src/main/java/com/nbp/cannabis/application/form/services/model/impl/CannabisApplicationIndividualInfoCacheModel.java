/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.cannabis.application.form.services.model.CannabisApplicationIndividualInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CannabisApplicationIndividualInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CannabisApplicationIndividualInfoCacheModel
	implements CacheModel<CannabisApplicationIndividualInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CannabisApplicationIndividualInfoCacheModel)) {
			return false;
		}

		CannabisApplicationIndividualInfoCacheModel
			cannabisApplicationIndividualInfoCacheModel =
				(CannabisApplicationIndividualInfoCacheModel)object;

		if (individualInformationId ==
				cannabisApplicationIndividualInfoCacheModel.
					individualInformationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, individualInformationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(67);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", individualInformationId=");
		sb.append(individualInformationId);
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
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", middleName=");
		sb.append(middleName);
		sb.append(", otherName=");
		sb.append(otherName);
		sb.append(", maidenName=");
		sb.append(maidenName);
		sb.append(", motherMaidenName=");
		sb.append(motherMaidenName);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", maritalStatus=");
		sb.append(maritalStatus);
		sb.append(", dob=");
		sb.append(dob);
		sb.append(", placeOfBirth=");
		sb.append(placeOfBirth);
		sb.append(", nationality=");
		sb.append(nationality);
		sb.append(", durationInJamaika=");
		sb.append(durationInJamaika);
		sb.append(", trn=");
		sb.append(trn);
		sb.append(", currentOccupation=");
		sb.append(currentOccupation);
		sb.append(", drivingLincenseNo=");
		sb.append(drivingLincenseNo);
		sb.append(", passporNo=");
		sb.append(passporNo);
		sb.append(", nationalIdentityNo=");
		sb.append(nationalIdentityNo);
		sb.append(", contactHome=");
		sb.append(contactHome);
		sb.append(", contactWork=");
		sb.append(contactWork);
		sb.append(", contactMobile=");
		sb.append(contactMobile);
		sb.append(", email=");
		sb.append(email);
		sb.append(", identityNumber=");
		sb.append(identityNumber);
		sb.append(", status=");
		sb.append(status);
		sb.append(", applicationNumber=");
		sb.append(applicationNumber);
		sb.append(", cannabisApplicationId=");
		sb.append(cannabisApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CannabisApplicationIndividualInfo toEntityModel() {
		CannabisApplicationIndividualInfoImpl
			cannabisApplicationIndividualInfoImpl =
				new CannabisApplicationIndividualInfoImpl();

		if (uuid == null) {
			cannabisApplicationIndividualInfoImpl.setUuid("");
		}
		else {
			cannabisApplicationIndividualInfoImpl.setUuid(uuid);
		}

		cannabisApplicationIndividualInfoImpl.setIndividualInformationId(
			individualInformationId);
		cannabisApplicationIndividualInfoImpl.setGroupId(groupId);
		cannabisApplicationIndividualInfoImpl.setCompanyId(companyId);
		cannabisApplicationIndividualInfoImpl.setUserId(userId);

		if (userName == null) {
			cannabisApplicationIndividualInfoImpl.setUserName("");
		}
		else {
			cannabisApplicationIndividualInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			cannabisApplicationIndividualInfoImpl.setCreateDate(null);
		}
		else {
			cannabisApplicationIndividualInfoImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cannabisApplicationIndividualInfoImpl.setModifiedDate(null);
		}
		else {
			cannabisApplicationIndividualInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (firstName == null) {
			cannabisApplicationIndividualInfoImpl.setFirstName("");
		}
		else {
			cannabisApplicationIndividualInfoImpl.setFirstName(firstName);
		}

		if (lastName == null) {
			cannabisApplicationIndividualInfoImpl.setLastName("");
		}
		else {
			cannabisApplicationIndividualInfoImpl.setLastName(lastName);
		}

		if (middleName == null) {
			cannabisApplicationIndividualInfoImpl.setMiddleName("");
		}
		else {
			cannabisApplicationIndividualInfoImpl.setMiddleName(middleName);
		}

		if (otherName == null) {
			cannabisApplicationIndividualInfoImpl.setOtherName("");
		}
		else {
			cannabisApplicationIndividualInfoImpl.setOtherName(otherName);
		}

		if (maidenName == null) {
			cannabisApplicationIndividualInfoImpl.setMaidenName("");
		}
		else {
			cannabisApplicationIndividualInfoImpl.setMaidenName(maidenName);
		}

		if (motherMaidenName == null) {
			cannabisApplicationIndividualInfoImpl.setMotherMaidenName("");
		}
		else {
			cannabisApplicationIndividualInfoImpl.setMotherMaidenName(
				motherMaidenName);
		}

		if (gender == null) {
			cannabisApplicationIndividualInfoImpl.setGender("");
		}
		else {
			cannabisApplicationIndividualInfoImpl.setGender(gender);
		}

		if (maritalStatus == null) {
			cannabisApplicationIndividualInfoImpl.setMaritalStatus("");
		}
		else {
			cannabisApplicationIndividualInfoImpl.setMaritalStatus(
				maritalStatus);
		}

		if (dob == Long.MIN_VALUE) {
			cannabisApplicationIndividualInfoImpl.setDob(null);
		}
		else {
			cannabisApplicationIndividualInfoImpl.setDob(new Date(dob));
		}

		if (placeOfBirth == null) {
			cannabisApplicationIndividualInfoImpl.setPlaceOfBirth("");
		}
		else {
			cannabisApplicationIndividualInfoImpl.setPlaceOfBirth(placeOfBirth);
		}

		if (nationality == null) {
			cannabisApplicationIndividualInfoImpl.setNationality("");
		}
		else {
			cannabisApplicationIndividualInfoImpl.setNationality(nationality);
		}

		if (durationInJamaika == null) {
			cannabisApplicationIndividualInfoImpl.setDurationInJamaika("");
		}
		else {
			cannabisApplicationIndividualInfoImpl.setDurationInJamaika(
				durationInJamaika);
		}

		if (trn == null) {
			cannabisApplicationIndividualInfoImpl.setTrn("");
		}
		else {
			cannabisApplicationIndividualInfoImpl.setTrn(trn);
		}

		if (currentOccupation == null) {
			cannabisApplicationIndividualInfoImpl.setCurrentOccupation("");
		}
		else {
			cannabisApplicationIndividualInfoImpl.setCurrentOccupation(
				currentOccupation);
		}

		if (drivingLincenseNo == null) {
			cannabisApplicationIndividualInfoImpl.setDrivingLincenseNo("");
		}
		else {
			cannabisApplicationIndividualInfoImpl.setDrivingLincenseNo(
				drivingLincenseNo);
		}

		if (passporNo == null) {
			cannabisApplicationIndividualInfoImpl.setPassporNo("");
		}
		else {
			cannabisApplicationIndividualInfoImpl.setPassporNo(passporNo);
		}

		if (nationalIdentityNo == null) {
			cannabisApplicationIndividualInfoImpl.setNationalIdentityNo("");
		}
		else {
			cannabisApplicationIndividualInfoImpl.setNationalIdentityNo(
				nationalIdentityNo);
		}

		if (contactHome == null) {
			cannabisApplicationIndividualInfoImpl.setContactHome("");
		}
		else {
			cannabisApplicationIndividualInfoImpl.setContactHome(contactHome);
		}

		if (contactWork == null) {
			cannabisApplicationIndividualInfoImpl.setContactWork("");
		}
		else {
			cannabisApplicationIndividualInfoImpl.setContactWork(contactWork);
		}

		if (contactMobile == null) {
			cannabisApplicationIndividualInfoImpl.setContactMobile("");
		}
		else {
			cannabisApplicationIndividualInfoImpl.setContactMobile(
				contactMobile);
		}

		if (email == null) {
			cannabisApplicationIndividualInfoImpl.setEmail("");
		}
		else {
			cannabisApplicationIndividualInfoImpl.setEmail(email);
		}

		if (identityNumber == null) {
			cannabisApplicationIndividualInfoImpl.setIdentityNumber("");
		}
		else {
			cannabisApplicationIndividualInfoImpl.setIdentityNumber(
				identityNumber);
		}

		cannabisApplicationIndividualInfoImpl.setStatus(status);

		if (applicationNumber == null) {
			cannabisApplicationIndividualInfoImpl.setApplicationNumber("");
		}
		else {
			cannabisApplicationIndividualInfoImpl.setApplicationNumber(
				applicationNumber);
		}

		cannabisApplicationIndividualInfoImpl.setCannabisApplicationId(
			cannabisApplicationId);

		cannabisApplicationIndividualInfoImpl.resetOriginalValues();

		return cannabisApplicationIndividualInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		individualInformationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		firstName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		middleName = objectInput.readUTF();
		otherName = objectInput.readUTF();
		maidenName = objectInput.readUTF();
		motherMaidenName = objectInput.readUTF();
		gender = objectInput.readUTF();
		maritalStatus = objectInput.readUTF();
		dob = objectInput.readLong();
		placeOfBirth = objectInput.readUTF();
		nationality = objectInput.readUTF();
		durationInJamaika = objectInput.readUTF();
		trn = objectInput.readUTF();
		currentOccupation = objectInput.readUTF();
		drivingLincenseNo = objectInput.readUTF();
		passporNo = objectInput.readUTF();
		nationalIdentityNo = objectInput.readUTF();
		contactHome = objectInput.readUTF();
		contactWork = objectInput.readUTF();
		contactMobile = objectInput.readUTF();
		email = objectInput.readUTF();
		identityNumber = objectInput.readUTF();

		status = objectInput.readInt();
		applicationNumber = objectInput.readUTF();

		cannabisApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(individualInformationId);

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

		if (firstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (lastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		if (middleName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(middleName);
		}

		if (otherName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherName);
		}

		if (maidenName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(maidenName);
		}

		if (motherMaidenName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(motherMaidenName);
		}

		if (gender == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(gender);
		}

		if (maritalStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(maritalStatus);
		}

		objectOutput.writeLong(dob);

		if (placeOfBirth == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(placeOfBirth);
		}

		if (nationality == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nationality);
		}

		if (durationInJamaika == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(durationInJamaika);
		}

		if (trn == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(trn);
		}

		if (currentOccupation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(currentOccupation);
		}

		if (drivingLincenseNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(drivingLincenseNo);
		}

		if (passporNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(passporNo);
		}

		if (nationalIdentityNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nationalIdentityNo);
		}

		if (contactHome == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contactHome);
		}

		if (contactWork == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contactWork);
		}

		if (contactMobile == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contactMobile);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (identityNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(identityNumber);
		}

		objectOutput.writeInt(status);

		if (applicationNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicationNumber);
		}

		objectOutput.writeLong(cannabisApplicationId);
	}

	public String uuid;
	public long individualInformationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String firstName;
	public String lastName;
	public String middleName;
	public String otherName;
	public String maidenName;
	public String motherMaidenName;
	public String gender;
	public String maritalStatus;
	public long dob;
	public String placeOfBirth;
	public String nationality;
	public String durationInJamaika;
	public String trn;
	public String currentOccupation;
	public String drivingLincenseNo;
	public String passporNo;
	public String nationalIdentityNo;
	public String contactHome;
	public String contactWork;
	public String contactMobile;
	public String email;
	public String identityNumber;
	public int status;
	public String applicationNumber;
	public long cannabisApplicationId;

}