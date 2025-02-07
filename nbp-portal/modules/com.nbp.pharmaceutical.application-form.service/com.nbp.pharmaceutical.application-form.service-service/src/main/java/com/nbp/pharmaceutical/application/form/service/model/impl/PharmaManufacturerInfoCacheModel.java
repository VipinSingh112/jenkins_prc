/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.pharmaceutical.application.form.service.model.PharmaManufacturerInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PharmaManufacturerInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PharmaManufacturerInfoCacheModel
	implements CacheModel<PharmaManufacturerInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PharmaManufacturerInfoCacheModel)) {
			return false;
		}

		PharmaManufacturerInfoCacheModel pharmaManufacturerInfoCacheModel =
			(PharmaManufacturerInfoCacheModel)object;

		if (pharmaManufacturerInfoId ==
				pharmaManufacturerInfoCacheModel.pharmaManufacturerInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, pharmaManufacturerInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(47);

		sb.append("{pharmaManufacturerInfoId=");
		sb.append(pharmaManufacturerInfoId);
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
		sb.append(", pharmaDrugManufacturerName=");
		sb.append(pharmaDrugManufacturerName);
		sb.append(", pharmaDrugManufacturerAdd=");
		sb.append(pharmaDrugManufacturerAdd);
		sb.append(", pharmaDrugDeisgnation=");
		sb.append(pharmaDrugDeisgnation);
		sb.append(", pharmaMarketAuthName=");
		sb.append(pharmaMarketAuthName);
		sb.append(", pharmaMarketAuthAddress=");
		sb.append(pharmaMarketAuthAddress);
		sb.append(", pharmaReguOfficerName=");
		sb.append(pharmaReguOfficerName);
		sb.append(", pharmaReguOfficerContact=");
		sb.append(pharmaReguOfficerContact);
		sb.append(", pharmaDrugApplicName=");
		sb.append(pharmaDrugApplicName);
		sb.append(", pharmaDrugApplicAddress=");
		sb.append(pharmaDrugApplicAddress);
		sb.append(", pharmaLocalReprName=");
		sb.append(pharmaLocalReprName);
		sb.append(", pharmaLocalReprContact=");
		sb.append(pharmaLocalReprContact);
		sb.append(", pharmaLocalReprAdd=");
		sb.append(pharmaLocalReprAdd);
		sb.append(", pharmaLocalDistName=");
		sb.append(pharmaLocalDistName);
		sb.append(", pharmaLocalDistAddress=");
		sb.append(pharmaLocalDistAddress);
		sb.append(", pharmaLocalDistContact=");
		sb.append(pharmaLocalDistContact);
		sb.append(", pharmaApplicationId=");
		sb.append(pharmaApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PharmaManufacturerInfo toEntityModel() {
		PharmaManufacturerInfoImpl pharmaManufacturerInfoImpl =
			new PharmaManufacturerInfoImpl();

		pharmaManufacturerInfoImpl.setPharmaManufacturerInfoId(
			pharmaManufacturerInfoId);
		pharmaManufacturerInfoImpl.setGroupId(groupId);
		pharmaManufacturerInfoImpl.setCompanyId(companyId);
		pharmaManufacturerInfoImpl.setUserId(userId);

		if (userName == null) {
			pharmaManufacturerInfoImpl.setUserName("");
		}
		else {
			pharmaManufacturerInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			pharmaManufacturerInfoImpl.setCreateDate(null);
		}
		else {
			pharmaManufacturerInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			pharmaManufacturerInfoImpl.setModifiedDate(null);
		}
		else {
			pharmaManufacturerInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (pharmaDrugManufacturerName == null) {
			pharmaManufacturerInfoImpl.setPharmaDrugManufacturerName("");
		}
		else {
			pharmaManufacturerInfoImpl.setPharmaDrugManufacturerName(
				pharmaDrugManufacturerName);
		}

		if (pharmaDrugManufacturerAdd == null) {
			pharmaManufacturerInfoImpl.setPharmaDrugManufacturerAdd("");
		}
		else {
			pharmaManufacturerInfoImpl.setPharmaDrugManufacturerAdd(
				pharmaDrugManufacturerAdd);
		}

		if (pharmaDrugDeisgnation == null) {
			pharmaManufacturerInfoImpl.setPharmaDrugDeisgnation("");
		}
		else {
			pharmaManufacturerInfoImpl.setPharmaDrugDeisgnation(
				pharmaDrugDeisgnation);
		}

		if (pharmaMarketAuthName == null) {
			pharmaManufacturerInfoImpl.setPharmaMarketAuthName("");
		}
		else {
			pharmaManufacturerInfoImpl.setPharmaMarketAuthName(
				pharmaMarketAuthName);
		}

		if (pharmaMarketAuthAddress == null) {
			pharmaManufacturerInfoImpl.setPharmaMarketAuthAddress("");
		}
		else {
			pharmaManufacturerInfoImpl.setPharmaMarketAuthAddress(
				pharmaMarketAuthAddress);
		}

		if (pharmaReguOfficerName == null) {
			pharmaManufacturerInfoImpl.setPharmaReguOfficerName("");
		}
		else {
			pharmaManufacturerInfoImpl.setPharmaReguOfficerName(
				pharmaReguOfficerName);
		}

		if (pharmaReguOfficerContact == null) {
			pharmaManufacturerInfoImpl.setPharmaReguOfficerContact("");
		}
		else {
			pharmaManufacturerInfoImpl.setPharmaReguOfficerContact(
				pharmaReguOfficerContact);
		}

		if (pharmaDrugApplicName == null) {
			pharmaManufacturerInfoImpl.setPharmaDrugApplicName("");
		}
		else {
			pharmaManufacturerInfoImpl.setPharmaDrugApplicName(
				pharmaDrugApplicName);
		}

		if (pharmaDrugApplicAddress == null) {
			pharmaManufacturerInfoImpl.setPharmaDrugApplicAddress("");
		}
		else {
			pharmaManufacturerInfoImpl.setPharmaDrugApplicAddress(
				pharmaDrugApplicAddress);
		}

		if (pharmaLocalReprName == null) {
			pharmaManufacturerInfoImpl.setPharmaLocalReprName("");
		}
		else {
			pharmaManufacturerInfoImpl.setPharmaLocalReprName(
				pharmaLocalReprName);
		}

		if (pharmaLocalReprContact == null) {
			pharmaManufacturerInfoImpl.setPharmaLocalReprContact("");
		}
		else {
			pharmaManufacturerInfoImpl.setPharmaLocalReprContact(
				pharmaLocalReprContact);
		}

		if (pharmaLocalReprAdd == null) {
			pharmaManufacturerInfoImpl.setPharmaLocalReprAdd("");
		}
		else {
			pharmaManufacturerInfoImpl.setPharmaLocalReprAdd(
				pharmaLocalReprAdd);
		}

		if (pharmaLocalDistName == null) {
			pharmaManufacturerInfoImpl.setPharmaLocalDistName("");
		}
		else {
			pharmaManufacturerInfoImpl.setPharmaLocalDistName(
				pharmaLocalDistName);
		}

		if (pharmaLocalDistAddress == null) {
			pharmaManufacturerInfoImpl.setPharmaLocalDistAddress("");
		}
		else {
			pharmaManufacturerInfoImpl.setPharmaLocalDistAddress(
				pharmaLocalDistAddress);
		}

		if (pharmaLocalDistContact == null) {
			pharmaManufacturerInfoImpl.setPharmaLocalDistContact("");
		}
		else {
			pharmaManufacturerInfoImpl.setPharmaLocalDistContact(
				pharmaLocalDistContact);
		}

		pharmaManufacturerInfoImpl.setPharmaApplicationId(pharmaApplicationId);

		pharmaManufacturerInfoImpl.resetOriginalValues();

		return pharmaManufacturerInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		pharmaManufacturerInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		pharmaDrugManufacturerName = objectInput.readUTF();
		pharmaDrugManufacturerAdd = objectInput.readUTF();
		pharmaDrugDeisgnation = objectInput.readUTF();
		pharmaMarketAuthName = objectInput.readUTF();
		pharmaMarketAuthAddress = objectInput.readUTF();
		pharmaReguOfficerName = objectInput.readUTF();
		pharmaReguOfficerContact = objectInput.readUTF();
		pharmaDrugApplicName = objectInput.readUTF();
		pharmaDrugApplicAddress = objectInput.readUTF();
		pharmaLocalReprName = objectInput.readUTF();
		pharmaLocalReprContact = objectInput.readUTF();
		pharmaLocalReprAdd = objectInput.readUTF();
		pharmaLocalDistName = objectInput.readUTF();
		pharmaLocalDistAddress = objectInput.readUTF();
		pharmaLocalDistContact = objectInput.readUTF();

		pharmaApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(pharmaManufacturerInfoId);

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

		if (pharmaDrugManufacturerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaDrugManufacturerName);
		}

		if (pharmaDrugManufacturerAdd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaDrugManufacturerAdd);
		}

		if (pharmaDrugDeisgnation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaDrugDeisgnation);
		}

		if (pharmaMarketAuthName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaMarketAuthName);
		}

		if (pharmaMarketAuthAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaMarketAuthAddress);
		}

		if (pharmaReguOfficerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaReguOfficerName);
		}

		if (pharmaReguOfficerContact == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaReguOfficerContact);
		}

		if (pharmaDrugApplicName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaDrugApplicName);
		}

		if (pharmaDrugApplicAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaDrugApplicAddress);
		}

		if (pharmaLocalReprName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaLocalReprName);
		}

		if (pharmaLocalReprContact == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaLocalReprContact);
		}

		if (pharmaLocalReprAdd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaLocalReprAdd);
		}

		if (pharmaLocalDistName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaLocalDistName);
		}

		if (pharmaLocalDistAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaLocalDistAddress);
		}

		if (pharmaLocalDistContact == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaLocalDistContact);
		}

		objectOutput.writeLong(pharmaApplicationId);
	}

	public long pharmaManufacturerInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String pharmaDrugManufacturerName;
	public String pharmaDrugManufacturerAdd;
	public String pharmaDrugDeisgnation;
	public String pharmaMarketAuthName;
	public String pharmaMarketAuthAddress;
	public String pharmaReguOfficerName;
	public String pharmaReguOfficerContact;
	public String pharmaDrugApplicName;
	public String pharmaDrugApplicAddress;
	public String pharmaLocalReprName;
	public String pharmaLocalReprContact;
	public String pharmaLocalReprAdd;
	public String pharmaLocalDistName;
	public String pharmaLocalDistAddress;
	public String pharmaLocalDistContact;
	public long pharmaApplicationId;

}