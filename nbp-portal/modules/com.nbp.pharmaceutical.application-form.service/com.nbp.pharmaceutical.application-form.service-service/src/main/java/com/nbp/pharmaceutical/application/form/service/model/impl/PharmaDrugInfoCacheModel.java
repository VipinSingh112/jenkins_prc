/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.pharmaceutical.application.form.service.model.PharmaDrugInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PharmaDrugInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PharmaDrugInfoCacheModel
	implements CacheModel<PharmaDrugInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PharmaDrugInfoCacheModel)) {
			return false;
		}

		PharmaDrugInfoCacheModel pharmaDrugInfoCacheModel =
			(PharmaDrugInfoCacheModel)object;

		if (pharmaDrugInfoId == pharmaDrugInfoCacheModel.pharmaDrugInfoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, pharmaDrugInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{pharmaDrugInfoId=");
		sb.append(pharmaDrugInfoId);
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
		sb.append(", pharmaDrugBrandName=");
		sb.append(pharmaDrugBrandName);
		sb.append(", pharmaDrugDeisgnation=");
		sb.append(pharmaDrugDeisgnation);
		sb.append(", pharmaDosageForm=");
		sb.append(pharmaDosageForm);
		sb.append(", pharmaAdministrationRoute=");
		sb.append(pharmaAdministrationRoute);
		sb.append(", pharmaOriginDispensing=");
		sb.append(pharmaOriginDispensing);
		sb.append(", pharmaLicenseHolderName=");
		sb.append(pharmaLicenseHolderName);
		sb.append(", pharmaLicenseHolderAddress=");
		sb.append(pharmaLicenseHolderAddress);
		sb.append(", pharmaApplicationId=");
		sb.append(pharmaApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PharmaDrugInfo toEntityModel() {
		PharmaDrugInfoImpl pharmaDrugInfoImpl = new PharmaDrugInfoImpl();

		pharmaDrugInfoImpl.setPharmaDrugInfoId(pharmaDrugInfoId);
		pharmaDrugInfoImpl.setGroupId(groupId);
		pharmaDrugInfoImpl.setCompanyId(companyId);
		pharmaDrugInfoImpl.setUserId(userId);

		if (userName == null) {
			pharmaDrugInfoImpl.setUserName("");
		}
		else {
			pharmaDrugInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			pharmaDrugInfoImpl.setCreateDate(null);
		}
		else {
			pharmaDrugInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			pharmaDrugInfoImpl.setModifiedDate(null);
		}
		else {
			pharmaDrugInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (pharmaDrugBrandName == null) {
			pharmaDrugInfoImpl.setPharmaDrugBrandName("");
		}
		else {
			pharmaDrugInfoImpl.setPharmaDrugBrandName(pharmaDrugBrandName);
		}

		if (pharmaDrugDeisgnation == null) {
			pharmaDrugInfoImpl.setPharmaDrugDeisgnation("");
		}
		else {
			pharmaDrugInfoImpl.setPharmaDrugDeisgnation(pharmaDrugDeisgnation);
		}

		if (pharmaDosageForm == null) {
			pharmaDrugInfoImpl.setPharmaDosageForm("");
		}
		else {
			pharmaDrugInfoImpl.setPharmaDosageForm(pharmaDosageForm);
		}

		if (pharmaAdministrationRoute == null) {
			pharmaDrugInfoImpl.setPharmaAdministrationRoute("");
		}
		else {
			pharmaDrugInfoImpl.setPharmaAdministrationRoute(
				pharmaAdministrationRoute);
		}

		if (pharmaOriginDispensing == null) {
			pharmaDrugInfoImpl.setPharmaOriginDispensing("");
		}
		else {
			pharmaDrugInfoImpl.setPharmaOriginDispensing(
				pharmaOriginDispensing);
		}

		if (pharmaLicenseHolderName == null) {
			pharmaDrugInfoImpl.setPharmaLicenseHolderName("");
		}
		else {
			pharmaDrugInfoImpl.setPharmaLicenseHolderName(
				pharmaLicenseHolderName);
		}

		if (pharmaLicenseHolderAddress == null) {
			pharmaDrugInfoImpl.setPharmaLicenseHolderAddress("");
		}
		else {
			pharmaDrugInfoImpl.setPharmaLicenseHolderAddress(
				pharmaLicenseHolderAddress);
		}

		pharmaDrugInfoImpl.setPharmaApplicationId(pharmaApplicationId);

		pharmaDrugInfoImpl.resetOriginalValues();

		return pharmaDrugInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		pharmaDrugInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		pharmaDrugBrandName = objectInput.readUTF();
		pharmaDrugDeisgnation = objectInput.readUTF();
		pharmaDosageForm = objectInput.readUTF();
		pharmaAdministrationRoute = objectInput.readUTF();
		pharmaOriginDispensing = objectInput.readUTF();
		pharmaLicenseHolderName = objectInput.readUTF();
		pharmaLicenseHolderAddress = objectInput.readUTF();

		pharmaApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(pharmaDrugInfoId);

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

		if (pharmaDrugBrandName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaDrugBrandName);
		}

		if (pharmaDrugDeisgnation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaDrugDeisgnation);
		}

		if (pharmaDosageForm == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaDosageForm);
		}

		if (pharmaAdministrationRoute == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaAdministrationRoute);
		}

		if (pharmaOriginDispensing == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaOriginDispensing);
		}

		if (pharmaLicenseHolderName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaLicenseHolderName);
		}

		if (pharmaLicenseHolderAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaLicenseHolderAddress);
		}

		objectOutput.writeLong(pharmaApplicationId);
	}

	public long pharmaDrugInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String pharmaDrugBrandName;
	public String pharmaDrugDeisgnation;
	public String pharmaDosageForm;
	public String pharmaAdministrationRoute;
	public String pharmaOriginDispensing;
	public String pharmaLicenseHolderName;
	public String pharmaLicenseHolderAddress;
	public long pharmaApplicationId;

}