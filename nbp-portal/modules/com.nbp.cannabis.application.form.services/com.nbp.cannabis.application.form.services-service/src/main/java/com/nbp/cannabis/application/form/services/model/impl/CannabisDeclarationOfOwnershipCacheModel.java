/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.cannabis.application.form.services.model.CannabisDeclarationOfOwnership;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CannabisDeclarationOfOwnership in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CannabisDeclarationOfOwnershipCacheModel
	implements CacheModel<CannabisDeclarationOfOwnership>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CannabisDeclarationOfOwnershipCacheModel)) {
			return false;
		}

		CannabisDeclarationOfOwnershipCacheModel
			cannabisDeclarationOfOwnershipCacheModel =
				(CannabisDeclarationOfOwnershipCacheModel)object;

		if (cannabisDecOfOwnershipId ==
				cannabisDeclarationOfOwnershipCacheModel.
					cannabisDecOfOwnershipId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cannabisDecOfOwnershipId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(47);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", cannabisDecOfOwnershipId=");
		sb.append(cannabisDecOfOwnershipId);
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
		sb.append(", percentOfOwnership=");
		sb.append(percentOfOwnership);
		sb.append(", citizenship=");
		sb.append(citizenship);
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
		sb.append(", signature=");
		sb.append(signature);
		sb.append(", cannabisApplicationId=");
		sb.append(cannabisApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CannabisDeclarationOfOwnership toEntityModel() {
		CannabisDeclarationOfOwnershipImpl cannabisDeclarationOfOwnershipImpl =
			new CannabisDeclarationOfOwnershipImpl();

		if (uuid == null) {
			cannabisDeclarationOfOwnershipImpl.setUuid("");
		}
		else {
			cannabisDeclarationOfOwnershipImpl.setUuid(uuid);
		}

		cannabisDeclarationOfOwnershipImpl.setCannabisDecOfOwnershipId(
			cannabisDecOfOwnershipId);
		cannabisDeclarationOfOwnershipImpl.setGroupId(groupId);
		cannabisDeclarationOfOwnershipImpl.setCompanyId(companyId);
		cannabisDeclarationOfOwnershipImpl.setUserId(userId);

		if (userName == null) {
			cannabisDeclarationOfOwnershipImpl.setUserName("");
		}
		else {
			cannabisDeclarationOfOwnershipImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			cannabisDeclarationOfOwnershipImpl.setCreateDate(null);
		}
		else {
			cannabisDeclarationOfOwnershipImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cannabisDeclarationOfOwnershipImpl.setModifiedDate(null);
		}
		else {
			cannabisDeclarationOfOwnershipImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (firstName == null) {
			cannabisDeclarationOfOwnershipImpl.setFirstName("");
		}
		else {
			cannabisDeclarationOfOwnershipImpl.setFirstName(firstName);
		}

		if (middleName == null) {
			cannabisDeclarationOfOwnershipImpl.setMiddleName("");
		}
		else {
			cannabisDeclarationOfOwnershipImpl.setMiddleName(middleName);
		}

		if (surname == null) {
			cannabisDeclarationOfOwnershipImpl.setSurname("");
		}
		else {
			cannabisDeclarationOfOwnershipImpl.setSurname(surname);
		}

		if (position == null) {
			cannabisDeclarationOfOwnershipImpl.setPosition("");
		}
		else {
			cannabisDeclarationOfOwnershipImpl.setPosition(position);
		}

		if (percentOfOwnership == null) {
			cannabisDeclarationOfOwnershipImpl.setPercentOfOwnership("");
		}
		else {
			cannabisDeclarationOfOwnershipImpl.setPercentOfOwnership(
				percentOfOwnership);
		}

		if (citizenship == null) {
			cannabisDeclarationOfOwnershipImpl.setCitizenship("");
		}
		else {
			cannabisDeclarationOfOwnershipImpl.setCitizenship(citizenship);
		}

		if (trn == null) {
			cannabisDeclarationOfOwnershipImpl.setTrn("");
		}
		else {
			cannabisDeclarationOfOwnershipImpl.setTrn(trn);
		}

		if (dob == Long.MIN_VALUE) {
			cannabisDeclarationOfOwnershipImpl.setDob(null);
		}
		else {
			cannabisDeclarationOfOwnershipImpl.setDob(new Date(dob));
		}

		if (idNumber == null) {
			cannabisDeclarationOfOwnershipImpl.setIdNumber("");
		}
		else {
			cannabisDeclarationOfOwnershipImpl.setIdNumber(idNumber);
		}

		if (typeOfId == null) {
			cannabisDeclarationOfOwnershipImpl.setTypeOfId("");
		}
		else {
			cannabisDeclarationOfOwnershipImpl.setTypeOfId(typeOfId);
		}

		if (counter == null) {
			cannabisDeclarationOfOwnershipImpl.setCounter("");
		}
		else {
			cannabisDeclarationOfOwnershipImpl.setCounter(counter);
		}

		cannabisDeclarationOfOwnershipImpl.setOfficialPoliceRecordDocId(
			officialPoliceRecordDocId);
		cannabisDeclarationOfOwnershipImpl.setCertifiedCopyofIdDocId(
			certifiedCopyofIdDocId);

		if (signature == null) {
			cannabisDeclarationOfOwnershipImpl.setSignature("");
		}
		else {
			cannabisDeclarationOfOwnershipImpl.setSignature(signature);
		}

		cannabisDeclarationOfOwnershipImpl.setCannabisApplicationId(
			cannabisApplicationId);

		cannabisDeclarationOfOwnershipImpl.resetOriginalValues();

		return cannabisDeclarationOfOwnershipImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		cannabisDecOfOwnershipId = objectInput.readLong();

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
		percentOfOwnership = objectInput.readUTF();
		citizenship = objectInput.readUTF();
		trn = objectInput.readUTF();
		dob = objectInput.readLong();
		idNumber = objectInput.readUTF();
		typeOfId = objectInput.readUTF();
		counter = objectInput.readUTF();

		officialPoliceRecordDocId = objectInput.readLong();

		certifiedCopyofIdDocId = objectInput.readLong();
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

		objectOutput.writeLong(cannabisDecOfOwnershipId);

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

		if (percentOfOwnership == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(percentOfOwnership);
		}

		if (citizenship == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(citizenship);
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

		if (signature == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(signature);
		}

		objectOutput.writeLong(cannabisApplicationId);
	}

	public String uuid;
	public long cannabisDecOfOwnershipId;
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
	public String percentOfOwnership;
	public String citizenship;
	public String trn;
	public long dob;
	public String idNumber;
	public String typeOfId;
	public String counter;
	public long officialPoliceRecordDocId;
	public long certifiedCopyofIdDocId;
	public String signature;
	public long cannabisApplicationId;

}