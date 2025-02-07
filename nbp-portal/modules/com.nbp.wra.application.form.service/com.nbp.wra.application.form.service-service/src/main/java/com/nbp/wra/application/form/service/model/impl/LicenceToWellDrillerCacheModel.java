/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.wra.application.form.service.model.LicenceToWellDriller;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing LicenceToWellDriller in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LicenceToWellDrillerCacheModel
	implements CacheModel<LicenceToWellDriller>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof LicenceToWellDrillerCacheModel)) {
			return false;
		}

		LicenceToWellDrillerCacheModel licenceToWellDrillerCacheModel =
			(LicenceToWellDrillerCacheModel)object;

		if (licenceToWellDrillerId ==
				licenceToWellDrillerCacheModel.licenceToWellDrillerId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, licenceToWellDrillerId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{licenceToWellDrillerId=");
		sb.append(licenceToWellDrillerId);
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
		sb.append(", wellDrillingApplicationNo=");
		sb.append(wellDrillingApplicationNo);
		sb.append(", permitDrillingApplicantName=");
		sb.append(permitDrillingApplicantName);
		sb.append(", permitDrillingAddressParish=");
		sb.append(permitDrillingAddressParish);
		sb.append(", permitDrillingApplicantAddress=");
		sb.append(permitDrillingApplicantAddress);
		sb.append(", permitDrillingDOBDate=");
		sb.append(permitDrillingDOBDate);
		sb.append(", permitDrillingEducational=");
		sb.append(permitDrillingEducational);
		sb.append(", permitDrillingSpecificTraining=");
		sb.append(permitDrillingSpecificTraining);
		sb.append(", permitDrillingSpecificExp=");
		sb.append(permitDrillingSpecificExp);
		sb.append(", permitDrillingSelfEmployed=");
		sb.append(permitDrillingSelfEmployed);
		sb.append(", permitDrillingName=");
		sb.append(permitDrillingName);
		sb.append(", permitDrillingPresentEmployer=");
		sb.append(permitDrillingPresentEmployer);
		sb.append(", permitDrillingEmployerAddress=");
		sb.append(permitDrillingEmployerAddress);
		sb.append(", permitDrillingFirstRefName=");
		sb.append(permitDrillingFirstRefName);
		sb.append(", permitDrillingFirstRefAdd=");
		sb.append(permitDrillingFirstRefAdd);
		sb.append(", permitDrillingSecondRefName=");
		sb.append(permitDrillingSecondRefName);
		sb.append(", permitDrillingSecondRefAdd=");
		sb.append(permitDrillingSecondRefAdd);
		sb.append(", permitDrillingSignature=");
		sb.append(permitDrillingSignature);
		sb.append(", permitDrillingSignatureDate=");
		sb.append(permitDrillingSignatureDate);
		sb.append(", wraApplicationId=");
		sb.append(wraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LicenceToWellDriller toEntityModel() {
		LicenceToWellDrillerImpl licenceToWellDrillerImpl =
			new LicenceToWellDrillerImpl();

		licenceToWellDrillerImpl.setLicenceToWellDrillerId(
			licenceToWellDrillerId);
		licenceToWellDrillerImpl.setGroupId(groupId);
		licenceToWellDrillerImpl.setCompanyId(companyId);
		licenceToWellDrillerImpl.setUserId(userId);

		if (userName == null) {
			licenceToWellDrillerImpl.setUserName("");
		}
		else {
			licenceToWellDrillerImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			licenceToWellDrillerImpl.setCreateDate(null);
		}
		else {
			licenceToWellDrillerImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			licenceToWellDrillerImpl.setModifiedDate(null);
		}
		else {
			licenceToWellDrillerImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (wellDrillingApplicationNo == null) {
			licenceToWellDrillerImpl.setWellDrillingApplicationNo("");
		}
		else {
			licenceToWellDrillerImpl.setWellDrillingApplicationNo(
				wellDrillingApplicationNo);
		}

		if (permitDrillingApplicantName == null) {
			licenceToWellDrillerImpl.setPermitDrillingApplicantName("");
		}
		else {
			licenceToWellDrillerImpl.setPermitDrillingApplicantName(
				permitDrillingApplicantName);
		}

		if (permitDrillingAddressParish == null) {
			licenceToWellDrillerImpl.setPermitDrillingAddressParish("");
		}
		else {
			licenceToWellDrillerImpl.setPermitDrillingAddressParish(
				permitDrillingAddressParish);
		}

		if (permitDrillingApplicantAddress == null) {
			licenceToWellDrillerImpl.setPermitDrillingApplicantAddress("");
		}
		else {
			licenceToWellDrillerImpl.setPermitDrillingApplicantAddress(
				permitDrillingApplicantAddress);
		}

		if (permitDrillingDOBDate == Long.MIN_VALUE) {
			licenceToWellDrillerImpl.setPermitDrillingDOBDate(null);
		}
		else {
			licenceToWellDrillerImpl.setPermitDrillingDOBDate(
				new Date(permitDrillingDOBDate));
		}

		if (permitDrillingEducational == null) {
			licenceToWellDrillerImpl.setPermitDrillingEducational("");
		}
		else {
			licenceToWellDrillerImpl.setPermitDrillingEducational(
				permitDrillingEducational);
		}

		if (permitDrillingSpecificTraining == null) {
			licenceToWellDrillerImpl.setPermitDrillingSpecificTraining("");
		}
		else {
			licenceToWellDrillerImpl.setPermitDrillingSpecificTraining(
				permitDrillingSpecificTraining);
		}

		if (permitDrillingSpecificExp == null) {
			licenceToWellDrillerImpl.setPermitDrillingSpecificExp("");
		}
		else {
			licenceToWellDrillerImpl.setPermitDrillingSpecificExp(
				permitDrillingSpecificExp);
		}

		if (permitDrillingSelfEmployed == null) {
			licenceToWellDrillerImpl.setPermitDrillingSelfEmployed("");
		}
		else {
			licenceToWellDrillerImpl.setPermitDrillingSelfEmployed(
				permitDrillingSelfEmployed);
		}

		if (permitDrillingName == null) {
			licenceToWellDrillerImpl.setPermitDrillingName("");
		}
		else {
			licenceToWellDrillerImpl.setPermitDrillingName(permitDrillingName);
		}

		if (permitDrillingPresentEmployer == null) {
			licenceToWellDrillerImpl.setPermitDrillingPresentEmployer("");
		}
		else {
			licenceToWellDrillerImpl.setPermitDrillingPresentEmployer(
				permitDrillingPresentEmployer);
		}

		if (permitDrillingEmployerAddress == null) {
			licenceToWellDrillerImpl.setPermitDrillingEmployerAddress("");
		}
		else {
			licenceToWellDrillerImpl.setPermitDrillingEmployerAddress(
				permitDrillingEmployerAddress);
		}

		if (permitDrillingFirstRefName == null) {
			licenceToWellDrillerImpl.setPermitDrillingFirstRefName("");
		}
		else {
			licenceToWellDrillerImpl.setPermitDrillingFirstRefName(
				permitDrillingFirstRefName);
		}

		if (permitDrillingFirstRefAdd == null) {
			licenceToWellDrillerImpl.setPermitDrillingFirstRefAdd("");
		}
		else {
			licenceToWellDrillerImpl.setPermitDrillingFirstRefAdd(
				permitDrillingFirstRefAdd);
		}

		if (permitDrillingSecondRefName == null) {
			licenceToWellDrillerImpl.setPermitDrillingSecondRefName("");
		}
		else {
			licenceToWellDrillerImpl.setPermitDrillingSecondRefName(
				permitDrillingSecondRefName);
		}

		if (permitDrillingSecondRefAdd == null) {
			licenceToWellDrillerImpl.setPermitDrillingSecondRefAdd("");
		}
		else {
			licenceToWellDrillerImpl.setPermitDrillingSecondRefAdd(
				permitDrillingSecondRefAdd);
		}

		if (permitDrillingSignature == null) {
			licenceToWellDrillerImpl.setPermitDrillingSignature("");
		}
		else {
			licenceToWellDrillerImpl.setPermitDrillingSignature(
				permitDrillingSignature);
		}

		if (permitDrillingSignatureDate == Long.MIN_VALUE) {
			licenceToWellDrillerImpl.setPermitDrillingSignatureDate(null);
		}
		else {
			licenceToWellDrillerImpl.setPermitDrillingSignatureDate(
				new Date(permitDrillingSignatureDate));
		}

		licenceToWellDrillerImpl.setWraApplicationId(wraApplicationId);

		licenceToWellDrillerImpl.resetOriginalValues();

		return licenceToWellDrillerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		licenceToWellDrillerId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		wellDrillingApplicationNo = objectInput.readUTF();
		permitDrillingApplicantName = objectInput.readUTF();
		permitDrillingAddressParish = objectInput.readUTF();
		permitDrillingApplicantAddress = objectInput.readUTF();
		permitDrillingDOBDate = objectInput.readLong();
		permitDrillingEducational = objectInput.readUTF();
		permitDrillingSpecificTraining = objectInput.readUTF();
		permitDrillingSpecificExp = objectInput.readUTF();
		permitDrillingSelfEmployed = objectInput.readUTF();
		permitDrillingName = objectInput.readUTF();
		permitDrillingPresentEmployer = objectInput.readUTF();
		permitDrillingEmployerAddress = objectInput.readUTF();
		permitDrillingFirstRefName = objectInput.readUTF();
		permitDrillingFirstRefAdd = objectInput.readUTF();
		permitDrillingSecondRefName = objectInput.readUTF();
		permitDrillingSecondRefAdd = objectInput.readUTF();
		permitDrillingSignature = objectInput.readUTF();
		permitDrillingSignatureDate = objectInput.readLong();

		wraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(licenceToWellDrillerId);

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

		if (wellDrillingApplicationNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(wellDrillingApplicationNo);
		}

		if (permitDrillingApplicantName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingApplicantName);
		}

		if (permitDrillingAddressParish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingAddressParish);
		}

		if (permitDrillingApplicantAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingApplicantAddress);
		}

		objectOutput.writeLong(permitDrillingDOBDate);

		if (permitDrillingEducational == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingEducational);
		}

		if (permitDrillingSpecificTraining == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingSpecificTraining);
		}

		if (permitDrillingSpecificExp == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingSpecificExp);
		}

		if (permitDrillingSelfEmployed == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingSelfEmployed);
		}

		if (permitDrillingName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingName);
		}

		if (permitDrillingPresentEmployer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingPresentEmployer);
		}

		if (permitDrillingEmployerAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingEmployerAddress);
		}

		if (permitDrillingFirstRefName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingFirstRefName);
		}

		if (permitDrillingFirstRefAdd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingFirstRefAdd);
		}

		if (permitDrillingSecondRefName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingSecondRefName);
		}

		if (permitDrillingSecondRefAdd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingSecondRefAdd);
		}

		if (permitDrillingSignature == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingSignature);
		}

		objectOutput.writeLong(permitDrillingSignatureDate);

		objectOutput.writeLong(wraApplicationId);
	}

	public long licenceToWellDrillerId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String wellDrillingApplicationNo;
	public String permitDrillingApplicantName;
	public String permitDrillingAddressParish;
	public String permitDrillingApplicantAddress;
	public long permitDrillingDOBDate;
	public String permitDrillingEducational;
	public String permitDrillingSpecificTraining;
	public String permitDrillingSpecificExp;
	public String permitDrillingSelfEmployed;
	public String permitDrillingName;
	public String permitDrillingPresentEmployer;
	public String permitDrillingEmployerAddress;
	public String permitDrillingFirstRefName;
	public String permitDrillingFirstRefAdd;
	public String permitDrillingSecondRefName;
	public String permitDrillingSecondRefAdd;
	public String permitDrillingSignature;
	public long permitDrillingSignatureDate;
	public long wraApplicationId;

}