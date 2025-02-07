/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.cannabis.application.form.services.model.CannabisOccupationaLicense;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CannabisOccupationaLicense in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CannabisOccupationaLicenseCacheModel
	implements CacheModel<CannabisOccupationaLicense>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CannabisOccupationaLicenseCacheModel)) {
			return false;
		}

		CannabisOccupationaLicenseCacheModel
			cannabisOccupationaLicenseCacheModel =
				(CannabisOccupationaLicenseCacheModel)object;

		if (cannabisOccupationaLicenseId ==
				cannabisOccupationaLicenseCacheModel.
					cannabisOccupationaLicenseId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cannabisOccupationaLicenseId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", cannabisOccupationaLicenseId=");
		sb.append(cannabisOccupationaLicenseId);
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
		sb.append(", middleName=");
		sb.append(middleName);
		sb.append(", surname=");
		sb.append(surname);
		sb.append(", position=");
		sb.append(position);
		sb.append(", management=");
		sb.append(management);
		sb.append(", director=");
		sb.append(director);
		sb.append(", trn=");
		sb.append(trn);
		sb.append(", dob=");
		sb.append(dob);
		sb.append(", idNumber=");
		sb.append(idNumber);
		sb.append(", typeOfId=");
		sb.append(typeOfId);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", officialPoliceRecordDocId=");
		sb.append(officialPoliceRecordDocId);
		sb.append(", certifiedCopyofIdDocId=");
		sb.append(certifiedCopyofIdDocId);
		sb.append(", photoOfEmployeeDocId=");
		sb.append(photoOfEmployeeDocId);
		sb.append(", signature=");
		sb.append(signature);
		sb.append(", cannabisApplicationId=");
		sb.append(cannabisApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CannabisOccupationaLicense toEntityModel() {
		CannabisOccupationaLicenseImpl cannabisOccupationaLicenseImpl =
			new CannabisOccupationaLicenseImpl();

		if (uuid == null) {
			cannabisOccupationaLicenseImpl.setUuid("");
		}
		else {
			cannabisOccupationaLicenseImpl.setUuid(uuid);
		}

		cannabisOccupationaLicenseImpl.setCannabisOccupationaLicenseId(
			cannabisOccupationaLicenseId);
		cannabisOccupationaLicenseImpl.setGroupId(groupId);
		cannabisOccupationaLicenseImpl.setCompanyId(companyId);
		cannabisOccupationaLicenseImpl.setUserId(userId);

		if (userName == null) {
			cannabisOccupationaLicenseImpl.setUserName("");
		}
		else {
			cannabisOccupationaLicenseImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			cannabisOccupationaLicenseImpl.setCreateDate(null);
		}
		else {
			cannabisOccupationaLicenseImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cannabisOccupationaLicenseImpl.setModifiedDate(null);
		}
		else {
			cannabisOccupationaLicenseImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (firstName == null) {
			cannabisOccupationaLicenseImpl.setFirstName("");
		}
		else {
			cannabisOccupationaLicenseImpl.setFirstName(firstName);
		}

		if (middleName == null) {
			cannabisOccupationaLicenseImpl.setMiddleName("");
		}
		else {
			cannabisOccupationaLicenseImpl.setMiddleName(middleName);
		}

		if (surname == null) {
			cannabisOccupationaLicenseImpl.setSurname("");
		}
		else {
			cannabisOccupationaLicenseImpl.setSurname(surname);
		}

		if (position == null) {
			cannabisOccupationaLicenseImpl.setPosition("");
		}
		else {
			cannabisOccupationaLicenseImpl.setPosition(position);
		}

		if (management == null) {
			cannabisOccupationaLicenseImpl.setManagement("");
		}
		else {
			cannabisOccupationaLicenseImpl.setManagement(management);
		}

		if (director == null) {
			cannabisOccupationaLicenseImpl.setDirector("");
		}
		else {
			cannabisOccupationaLicenseImpl.setDirector(director);
		}

		if (trn == null) {
			cannabisOccupationaLicenseImpl.setTrn("");
		}
		else {
			cannabisOccupationaLicenseImpl.setTrn(trn);
		}

		if (dob == Long.MIN_VALUE) {
			cannabisOccupationaLicenseImpl.setDob(null);
		}
		else {
			cannabisOccupationaLicenseImpl.setDob(new Date(dob));
		}

		if (idNumber == null) {
			cannabisOccupationaLicenseImpl.setIdNumber("");
		}
		else {
			cannabisOccupationaLicenseImpl.setIdNumber(idNumber);
		}

		if (typeOfId == null) {
			cannabisOccupationaLicenseImpl.setTypeOfId("");
		}
		else {
			cannabisOccupationaLicenseImpl.setTypeOfId(typeOfId);
		}

		if (counter == null) {
			cannabisOccupationaLicenseImpl.setCounter("");
		}
		else {
			cannabisOccupationaLicenseImpl.setCounter(counter);
		}

		cannabisOccupationaLicenseImpl.setOfficialPoliceRecordDocId(
			officialPoliceRecordDocId);
		cannabisOccupationaLicenseImpl.setCertifiedCopyofIdDocId(
			certifiedCopyofIdDocId);
		cannabisOccupationaLicenseImpl.setPhotoOfEmployeeDocId(
			photoOfEmployeeDocId);

		if (signature == null) {
			cannabisOccupationaLicenseImpl.setSignature("");
		}
		else {
			cannabisOccupationaLicenseImpl.setSignature(signature);
		}

		cannabisOccupationaLicenseImpl.setCannabisApplicationId(
			cannabisApplicationId);

		cannabisOccupationaLicenseImpl.resetOriginalValues();

		return cannabisOccupationaLicenseImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		cannabisOccupationaLicenseId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		firstName = objectInput.readUTF();
		middleName = objectInput.readUTF();
		surname = objectInput.readUTF();
		position = objectInput.readUTF();
		management = objectInput.readUTF();
		director = objectInput.readUTF();
		trn = objectInput.readUTF();
		dob = objectInput.readLong();
		idNumber = objectInput.readUTF();
		typeOfId = objectInput.readUTF();
		counter = objectInput.readUTF();

		officialPoliceRecordDocId = objectInput.readLong();

		certifiedCopyofIdDocId = objectInput.readLong();

		photoOfEmployeeDocId = objectInput.readLong();
		signature = objectInput.readUTF();

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

		objectOutput.writeLong(cannabisOccupationaLicenseId);

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

		if (middleName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(middleName);
		}

		if (surname == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(surname);
		}

		if (position == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(position);
		}

		if (management == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(management);
		}

		if (director == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(director);
		}

		if (trn == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(trn);
		}

		objectOutput.writeLong(dob);

		if (idNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(idNumber);
		}

		if (typeOfId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfId);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(officialPoliceRecordDocId);

		objectOutput.writeLong(certifiedCopyofIdDocId);

		objectOutput.writeLong(photoOfEmployeeDocId);

		if (signature == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(signature);
		}

		objectOutput.writeLong(cannabisApplicationId);
	}

	public String uuid;
	public long cannabisOccupationaLicenseId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String firstName;
	public String middleName;
	public String surname;
	public String position;
	public String management;
	public String director;
	public String trn;
	public long dob;
	public String idNumber;
	public String typeOfId;
	public String counter;
	public long officialPoliceRecordDocId;
	public long certifiedCopyofIdDocId;
	public long photoOfEmployeeDocId;
	public String signature;
	public long cannabisApplicationId;

}