/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesSignInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MedicalFacilitiesSignInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MedicalFacilitiesSignInfoCacheModel
	implements CacheModel<MedicalFacilitiesSignInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MedicalFacilitiesSignInfoCacheModel)) {
			return false;
		}

		MedicalFacilitiesSignInfoCacheModel
			medicalFacilitiesSignInfoCacheModel =
				(MedicalFacilitiesSignInfoCacheModel)object;

		if (medicalFacilitiesSignInfoId ==
				medicalFacilitiesSignInfoCacheModel.
					medicalFacilitiesSignInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, medicalFacilitiesSignInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", medicalFacilitiesSignInfoId=");
		sb.append(medicalFacilitiesSignInfoId);
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
		sb.append(", number=");
		sb.append(number);
		sb.append(", particulars=");
		sb.append(particulars);
		sb.append(", chargedFees=");
		sb.append(chargedFees);
		sb.append(", addressOfOtherNHome=");
		sb.append(addressOfOtherNHome);
		sb.append(", enteredDate=");
		sb.append(enteredDate);
		sb.append(", medicalFacilitiesAppId=");
		sb.append(medicalFacilitiesAppId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MedicalFacilitiesSignInfo toEntityModel() {
		MedicalFacilitiesSignInfoImpl medicalFacilitiesSignInfoImpl =
			new MedicalFacilitiesSignInfoImpl();

		if (uuid == null) {
			medicalFacilitiesSignInfoImpl.setUuid("");
		}
		else {
			medicalFacilitiesSignInfoImpl.setUuid(uuid);
		}

		medicalFacilitiesSignInfoImpl.setMedicalFacilitiesSignInfoId(
			medicalFacilitiesSignInfoId);
		medicalFacilitiesSignInfoImpl.setGroupId(groupId);
		medicalFacilitiesSignInfoImpl.setCompanyId(companyId);
		medicalFacilitiesSignInfoImpl.setUserId(userId);

		if (userName == null) {
			medicalFacilitiesSignInfoImpl.setUserName("");
		}
		else {
			medicalFacilitiesSignInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			medicalFacilitiesSignInfoImpl.setCreateDate(null);
		}
		else {
			medicalFacilitiesSignInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			medicalFacilitiesSignInfoImpl.setModifiedDate(null);
		}
		else {
			medicalFacilitiesSignInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (number == null) {
			medicalFacilitiesSignInfoImpl.setNumber("");
		}
		else {
			medicalFacilitiesSignInfoImpl.setNumber(number);
		}

		if (particulars == null) {
			medicalFacilitiesSignInfoImpl.setParticulars("");
		}
		else {
			medicalFacilitiesSignInfoImpl.setParticulars(particulars);
		}

		if (chargedFees == null) {
			medicalFacilitiesSignInfoImpl.setChargedFees("");
		}
		else {
			medicalFacilitiesSignInfoImpl.setChargedFees(chargedFees);
		}

		if (addressOfOtherNHome == null) {
			medicalFacilitiesSignInfoImpl.setAddressOfOtherNHome("");
		}
		else {
			medicalFacilitiesSignInfoImpl.setAddressOfOtherNHome(
				addressOfOtherNHome);
		}

		if (enteredDate == Long.MIN_VALUE) {
			medicalFacilitiesSignInfoImpl.setEnteredDate(null);
		}
		else {
			medicalFacilitiesSignInfoImpl.setEnteredDate(new Date(enteredDate));
		}

		medicalFacilitiesSignInfoImpl.setMedicalFacilitiesAppId(
			medicalFacilitiesAppId);

		medicalFacilitiesSignInfoImpl.resetOriginalValues();

		return medicalFacilitiesSignInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		medicalFacilitiesSignInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		number = objectInput.readUTF();
		particulars = objectInput.readUTF();
		chargedFees = objectInput.readUTF();
		addressOfOtherNHome = objectInput.readUTF();
		enteredDate = objectInput.readLong();

		medicalFacilitiesAppId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(medicalFacilitiesSignInfoId);

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

		if (number == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(number);
		}

		if (particulars == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(particulars);
		}

		if (chargedFees == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(chargedFees);
		}

		if (addressOfOtherNHome == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(addressOfOtherNHome);
		}

		objectOutput.writeLong(enteredDate);

		objectOutput.writeLong(medicalFacilitiesAppId);
	}

	public String uuid;
	public long medicalFacilitiesSignInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String number;
	public String particulars;
	public String chargedFees;
	public String addressOfOtherNHome;
	public long enteredDate;
	public long medicalFacilitiesAppId;

}