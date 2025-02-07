/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.factories.registration.application.form.services.model.FactoriesStandardActInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FactoriesStandardActInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FactoriesStandardActInfoCacheModel
	implements CacheModel<FactoriesStandardActInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FactoriesStandardActInfoCacheModel)) {
			return false;
		}

		FactoriesStandardActInfoCacheModel factoriesStandardActInfoCacheModel =
			(FactoriesStandardActInfoCacheModel)object;

		if (factoriesStandardActId ==
				factoriesStandardActInfoCacheModel.factoriesStandardActId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, factoriesStandardActId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{factoriesStandardActId=");
		sb.append(factoriesStandardActId);
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
		sb.append(", standardsActEstablishmentName=");
		sb.append(standardsActEstablishmentName);
		sb.append(", standardsActAddParish=");
		sb.append(standardsActAddParish);
		sb.append(", standardsActAddress=");
		sb.append(standardsActAddress);
		sb.append(", standardsActTel=");
		sb.append(standardsActTel);
		sb.append(", standardsActWhatsAppNum=");
		sb.append(standardsActWhatsAppNum);
		sb.append(", standardsActEmail=");
		sb.append(standardsActEmail);
		sb.append(", standardsActFaxNum=");
		sb.append(standardsActFaxNum);
		sb.append(", standardsActOperatorName=");
		sb.append(standardsActOperatorName);
		sb.append(", standardsActOperatorAddress=");
		sb.append(standardsActOperatorAddress);
		sb.append(", standardsActParish=");
		sb.append(standardsActParish);
		sb.append(", standardsActOperatorTel=");
		sb.append(standardsActOperatorTel);
		sb.append(", standardActProductManufactured=");
		sb.append(standardActProductManufactured);
		sb.append(", standardActBrandManufactured=");
		sb.append(standardActBrandManufactured);
		sb.append(", standardsActProductSize=");
		sb.append(standardsActProductSize);
		sb.append(", standardsActLastDate=");
		sb.append(standardsActLastDate);
		sb.append(", standardsActPurpose=");
		sb.append(standardsActPurpose);
		sb.append(", standardsActDate=");
		sb.append(standardsActDate);
		sb.append(", establishmentBefore=");
		sb.append(establishmentBefore);
		sb.append(", factoriesApplicationId=");
		sb.append(factoriesApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FactoriesStandardActInfo toEntityModel() {
		FactoriesStandardActInfoImpl factoriesStandardActInfoImpl =
			new FactoriesStandardActInfoImpl();

		factoriesStandardActInfoImpl.setFactoriesStandardActId(
			factoriesStandardActId);
		factoriesStandardActInfoImpl.setGroupId(groupId);
		factoriesStandardActInfoImpl.setCompanyId(companyId);
		factoriesStandardActInfoImpl.setUserId(userId);

		if (userName == null) {
			factoriesStandardActInfoImpl.setUserName("");
		}
		else {
			factoriesStandardActInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			factoriesStandardActInfoImpl.setCreateDate(null);
		}
		else {
			factoriesStandardActInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			factoriesStandardActInfoImpl.setModifiedDate(null);
		}
		else {
			factoriesStandardActInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (standardsActEstablishmentName == null) {
			factoriesStandardActInfoImpl.setStandardsActEstablishmentName("");
		}
		else {
			factoriesStandardActInfoImpl.setStandardsActEstablishmentName(
				standardsActEstablishmentName);
		}

		if (standardsActAddParish == null) {
			factoriesStandardActInfoImpl.setStandardsActAddParish("");
		}
		else {
			factoriesStandardActInfoImpl.setStandardsActAddParish(
				standardsActAddParish);
		}

		if (standardsActAddress == null) {
			factoriesStandardActInfoImpl.setStandardsActAddress("");
		}
		else {
			factoriesStandardActInfoImpl.setStandardsActAddress(
				standardsActAddress);
		}

		if (standardsActTel == null) {
			factoriesStandardActInfoImpl.setStandardsActTel("");
		}
		else {
			factoriesStandardActInfoImpl.setStandardsActTel(standardsActTel);
		}

		if (standardsActWhatsAppNum == null) {
			factoriesStandardActInfoImpl.setStandardsActWhatsAppNum("");
		}
		else {
			factoriesStandardActInfoImpl.setStandardsActWhatsAppNum(
				standardsActWhatsAppNum);
		}

		if (standardsActEmail == null) {
			factoriesStandardActInfoImpl.setStandardsActEmail("");
		}
		else {
			factoriesStandardActInfoImpl.setStandardsActEmail(
				standardsActEmail);
		}

		if (standardsActFaxNum == null) {
			factoriesStandardActInfoImpl.setStandardsActFaxNum("");
		}
		else {
			factoriesStandardActInfoImpl.setStandardsActFaxNum(
				standardsActFaxNum);
		}

		if (standardsActOperatorName == null) {
			factoriesStandardActInfoImpl.setStandardsActOperatorName("");
		}
		else {
			factoriesStandardActInfoImpl.setStandardsActOperatorName(
				standardsActOperatorName);
		}

		if (standardsActOperatorAddress == null) {
			factoriesStandardActInfoImpl.setStandardsActOperatorAddress("");
		}
		else {
			factoriesStandardActInfoImpl.setStandardsActOperatorAddress(
				standardsActOperatorAddress);
		}

		if (standardsActParish == null) {
			factoriesStandardActInfoImpl.setStandardsActParish("");
		}
		else {
			factoriesStandardActInfoImpl.setStandardsActParish(
				standardsActParish);
		}

		if (standardsActOperatorTel == null) {
			factoriesStandardActInfoImpl.setStandardsActOperatorTel("");
		}
		else {
			factoriesStandardActInfoImpl.setStandardsActOperatorTel(
				standardsActOperatorTel);
		}

		if (standardActProductManufactured == null) {
			factoriesStandardActInfoImpl.setStandardActProductManufactured("");
		}
		else {
			factoriesStandardActInfoImpl.setStandardActProductManufactured(
				standardActProductManufactured);
		}

		if (standardActBrandManufactured == null) {
			factoriesStandardActInfoImpl.setStandardActBrandManufactured("");
		}
		else {
			factoriesStandardActInfoImpl.setStandardActBrandManufactured(
				standardActBrandManufactured);
		}

		if (standardsActProductSize == null) {
			factoriesStandardActInfoImpl.setStandardsActProductSize("");
		}
		else {
			factoriesStandardActInfoImpl.setStandardsActProductSize(
				standardsActProductSize);
		}

		if (standardsActLastDate == Long.MIN_VALUE) {
			factoriesStandardActInfoImpl.setStandardsActLastDate(null);
		}
		else {
			factoriesStandardActInfoImpl.setStandardsActLastDate(
				new Date(standardsActLastDate));
		}

		if (standardsActPurpose == null) {
			factoriesStandardActInfoImpl.setStandardsActPurpose("");
		}
		else {
			factoriesStandardActInfoImpl.setStandardsActPurpose(
				standardsActPurpose);
		}

		if (standardsActDate == Long.MIN_VALUE) {
			factoriesStandardActInfoImpl.setStandardsActDate(null);
		}
		else {
			factoriesStandardActInfoImpl.setStandardsActDate(
				new Date(standardsActDate));
		}

		if (establishmentBefore == null) {
			factoriesStandardActInfoImpl.setEstablishmentBefore("");
		}
		else {
			factoriesStandardActInfoImpl.setEstablishmentBefore(
				establishmentBefore);
		}

		factoriesStandardActInfoImpl.setFactoriesApplicationId(
			factoriesApplicationId);

		factoriesStandardActInfoImpl.resetOriginalValues();

		return factoriesStandardActInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		factoriesStandardActId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		standardsActEstablishmentName = objectInput.readUTF();
		standardsActAddParish = objectInput.readUTF();
		standardsActAddress = objectInput.readUTF();
		standardsActTel = objectInput.readUTF();
		standardsActWhatsAppNum = objectInput.readUTF();
		standardsActEmail = objectInput.readUTF();
		standardsActFaxNum = objectInput.readUTF();
		standardsActOperatorName = objectInput.readUTF();
		standardsActOperatorAddress = objectInput.readUTF();
		standardsActParish = objectInput.readUTF();
		standardsActOperatorTel = objectInput.readUTF();
		standardActProductManufactured = objectInput.readUTF();
		standardActBrandManufactured = objectInput.readUTF();
		standardsActProductSize = objectInput.readUTF();
		standardsActLastDate = objectInput.readLong();
		standardsActPurpose = objectInput.readUTF();
		standardsActDate = objectInput.readLong();
		establishmentBefore = objectInput.readUTF();

		factoriesApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(factoriesStandardActId);

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

		if (standardsActEstablishmentName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(standardsActEstablishmentName);
		}

		if (standardsActAddParish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(standardsActAddParish);
		}

		if (standardsActAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(standardsActAddress);
		}

		if (standardsActTel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(standardsActTel);
		}

		if (standardsActWhatsAppNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(standardsActWhatsAppNum);
		}

		if (standardsActEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(standardsActEmail);
		}

		if (standardsActFaxNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(standardsActFaxNum);
		}

		if (standardsActOperatorName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(standardsActOperatorName);
		}

		if (standardsActOperatorAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(standardsActOperatorAddress);
		}

		if (standardsActParish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(standardsActParish);
		}

		if (standardsActOperatorTel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(standardsActOperatorTel);
		}

		if (standardActProductManufactured == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(standardActProductManufactured);
		}

		if (standardActBrandManufactured == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(standardActBrandManufactured);
		}

		if (standardsActProductSize == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(standardsActProductSize);
		}

		objectOutput.writeLong(standardsActLastDate);

		if (standardsActPurpose == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(standardsActPurpose);
		}

		objectOutput.writeLong(standardsActDate);

		if (establishmentBefore == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(establishmentBefore);
		}

		objectOutput.writeLong(factoriesApplicationId);
	}

	public long factoriesStandardActId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String standardsActEstablishmentName;
	public String standardsActAddParish;
	public String standardsActAddress;
	public String standardsActTel;
	public String standardsActWhatsAppNum;
	public String standardsActEmail;
	public String standardsActFaxNum;
	public String standardsActOperatorName;
	public String standardsActOperatorAddress;
	public String standardsActParish;
	public String standardsActOperatorTel;
	public String standardActProductManufactured;
	public String standardActBrandManufactured;
	public String standardsActProductSize;
	public long standardsActLastDate;
	public String standardsActPurpose;
	public long standardsActDate;
	public String establishmentBefore;
	public long factoriesApplicationId;

}