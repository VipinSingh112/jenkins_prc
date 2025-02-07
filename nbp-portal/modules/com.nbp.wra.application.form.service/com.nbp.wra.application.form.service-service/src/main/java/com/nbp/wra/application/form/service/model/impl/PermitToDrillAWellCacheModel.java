/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.wra.application.form.service.model.PermitToDrillAWell;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PermitToDrillAWell in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PermitToDrillAWellCacheModel
	implements CacheModel<PermitToDrillAWell>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PermitToDrillAWellCacheModel)) {
			return false;
		}

		PermitToDrillAWellCacheModel permitToDrillAWellCacheModel =
			(PermitToDrillAWellCacheModel)object;

		if (drillAWellApplicationId ==
				permitToDrillAWellCacheModel.drillAWellApplicationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, drillAWellApplicationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(67);

		sb.append("{drillAWellApplicationId=");
		sb.append(drillAWellApplicationId);
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
		sb.append(", permitDrillApplicationNum=");
		sb.append(permitDrillApplicationNum);
		sb.append(", permitDrillingApplicantName=");
		sb.append(permitDrillingApplicantName);
		sb.append(", permitDrillingMailingAddParish=");
		sb.append(permitDrillingMailingAddParish);
		sb.append(", permitDrillingMailingAddress=");
		sb.append(permitDrillingMailingAddress);
		sb.append(", permitDrillingEmailAddress=");
		sb.append(permitDrillingEmailAddress);
		sb.append(", permitDrillingOfficePhone=");
		sb.append(permitDrillingOfficePhone);
		sb.append(", permitDrillingMobilePhone=");
		sb.append(permitDrillingMobilePhone);
		sb.append(", wellDrillingHomePhone=");
		sb.append(wellDrillingHomePhone);
		sb.append(", permitDrillingWorkLocation=");
		sb.append(permitDrillingWorkLocation);
		sb.append(", permitDrillingLocation=");
		sb.append(permitDrillingLocation);
		sb.append(", permitDrillingNature=");
		sb.append(permitDrillingNature);
		sb.append(", permitDrillingContractorName=");
		sb.append(permitDrillingContractorName);
		sb.append(", permitDrillContractAddress=");
		sb.append(permitDrillContractAddress);
		sb.append(", permitDrillingContractorAdd=");
		sb.append(permitDrillingContractorAdd);
		sb.append(", permitDrillingPurpose=");
		sb.append(permitDrillingPurpose);
		sb.append(", permitDrillingBoreholeDepth=");
		sb.append(permitDrillingBoreholeDepth);
		sb.append(", permitDrillingDiameterBorehole=");
		sb.append(permitDrillingDiameterBorehole);
		sb.append(", permitDrillingMethod=");
		sb.append(permitDrillingMethod);
		sb.append(", permitDrillingConstMethod=");
		sb.append(permitDrillingConstMethod);
		sb.append(", permitDrillingSupplies=");
		sb.append(permitDrillingSupplies);
		sb.append(", permitDrillingTechnicalInfo=");
		sb.append(permitDrillingTechnicalInfo);
		sb.append(", permitDrillingCubic=");
		sb.append(permitDrillingCubic);
		sb.append(", permitDrillingAuthority=");
		sb.append(permitDrillingAuthority);
		sb.append(", applicantSignaturePermitBtn=");
		sb.append(applicantSignaturePermitBtn);
		sb.append(", permitDrillingSignDate=");
		sb.append(permitDrillingSignDate);
		sb.append(", wraApplicationId=");
		sb.append(wraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PermitToDrillAWell toEntityModel() {
		PermitToDrillAWellImpl permitToDrillAWellImpl =
			new PermitToDrillAWellImpl();

		permitToDrillAWellImpl.setDrillAWellApplicationId(
			drillAWellApplicationId);
		permitToDrillAWellImpl.setGroupId(groupId);
		permitToDrillAWellImpl.setCompanyId(companyId);
		permitToDrillAWellImpl.setUserId(userId);

		if (userName == null) {
			permitToDrillAWellImpl.setUserName("");
		}
		else {
			permitToDrillAWellImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			permitToDrillAWellImpl.setCreateDate(null);
		}
		else {
			permitToDrillAWellImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			permitToDrillAWellImpl.setModifiedDate(null);
		}
		else {
			permitToDrillAWellImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (permitDrillApplicationNum == null) {
			permitToDrillAWellImpl.setPermitDrillApplicationNum("");
		}
		else {
			permitToDrillAWellImpl.setPermitDrillApplicationNum(
				permitDrillApplicationNum);
		}

		if (permitDrillingApplicantName == null) {
			permitToDrillAWellImpl.setPermitDrillingApplicantName("");
		}
		else {
			permitToDrillAWellImpl.setPermitDrillingApplicantName(
				permitDrillingApplicantName);
		}

		if (permitDrillingMailingAddParish == null) {
			permitToDrillAWellImpl.setPermitDrillingMailingAddParish("");
		}
		else {
			permitToDrillAWellImpl.setPermitDrillingMailingAddParish(
				permitDrillingMailingAddParish);
		}

		if (permitDrillingMailingAddress == null) {
			permitToDrillAWellImpl.setPermitDrillingMailingAddress("");
		}
		else {
			permitToDrillAWellImpl.setPermitDrillingMailingAddress(
				permitDrillingMailingAddress);
		}

		if (permitDrillingEmailAddress == null) {
			permitToDrillAWellImpl.setPermitDrillingEmailAddress("");
		}
		else {
			permitToDrillAWellImpl.setPermitDrillingEmailAddress(
				permitDrillingEmailAddress);
		}

		if (permitDrillingOfficePhone == null) {
			permitToDrillAWellImpl.setPermitDrillingOfficePhone("");
		}
		else {
			permitToDrillAWellImpl.setPermitDrillingOfficePhone(
				permitDrillingOfficePhone);
		}

		if (permitDrillingMobilePhone == null) {
			permitToDrillAWellImpl.setPermitDrillingMobilePhone("");
		}
		else {
			permitToDrillAWellImpl.setPermitDrillingMobilePhone(
				permitDrillingMobilePhone);
		}

		if (wellDrillingHomePhone == null) {
			permitToDrillAWellImpl.setWellDrillingHomePhone("");
		}
		else {
			permitToDrillAWellImpl.setWellDrillingHomePhone(
				wellDrillingHomePhone);
		}

		if (permitDrillingWorkLocation == null) {
			permitToDrillAWellImpl.setPermitDrillingWorkLocation("");
		}
		else {
			permitToDrillAWellImpl.setPermitDrillingWorkLocation(
				permitDrillingWorkLocation);
		}

		if (permitDrillingLocation == null) {
			permitToDrillAWellImpl.setPermitDrillingLocation("");
		}
		else {
			permitToDrillAWellImpl.setPermitDrillingLocation(
				permitDrillingLocation);
		}

		if (permitDrillingNature == null) {
			permitToDrillAWellImpl.setPermitDrillingNature("");
		}
		else {
			permitToDrillAWellImpl.setPermitDrillingNature(
				permitDrillingNature);
		}

		if (permitDrillingContractorName == null) {
			permitToDrillAWellImpl.setPermitDrillingContractorName("");
		}
		else {
			permitToDrillAWellImpl.setPermitDrillingContractorName(
				permitDrillingContractorName);
		}

		if (permitDrillContractAddress == null) {
			permitToDrillAWellImpl.setPermitDrillContractAddress("");
		}
		else {
			permitToDrillAWellImpl.setPermitDrillContractAddress(
				permitDrillContractAddress);
		}

		if (permitDrillingContractorAdd == null) {
			permitToDrillAWellImpl.setPermitDrillingContractorAdd("");
		}
		else {
			permitToDrillAWellImpl.setPermitDrillingContractorAdd(
				permitDrillingContractorAdd);
		}

		if (permitDrillingPurpose == null) {
			permitToDrillAWellImpl.setPermitDrillingPurpose("");
		}
		else {
			permitToDrillAWellImpl.setPermitDrillingPurpose(
				permitDrillingPurpose);
		}

		if (permitDrillingBoreholeDepth == null) {
			permitToDrillAWellImpl.setPermitDrillingBoreholeDepth("");
		}
		else {
			permitToDrillAWellImpl.setPermitDrillingBoreholeDepth(
				permitDrillingBoreholeDepth);
		}

		if (permitDrillingDiameterBorehole == null) {
			permitToDrillAWellImpl.setPermitDrillingDiameterBorehole("");
		}
		else {
			permitToDrillAWellImpl.setPermitDrillingDiameterBorehole(
				permitDrillingDiameterBorehole);
		}

		if (permitDrillingMethod == null) {
			permitToDrillAWellImpl.setPermitDrillingMethod("");
		}
		else {
			permitToDrillAWellImpl.setPermitDrillingMethod(
				permitDrillingMethod);
		}

		if (permitDrillingConstMethod == null) {
			permitToDrillAWellImpl.setPermitDrillingConstMethod("");
		}
		else {
			permitToDrillAWellImpl.setPermitDrillingConstMethod(
				permitDrillingConstMethod);
		}

		if (permitDrillingSupplies == null) {
			permitToDrillAWellImpl.setPermitDrillingSupplies("");
		}
		else {
			permitToDrillAWellImpl.setPermitDrillingSupplies(
				permitDrillingSupplies);
		}

		if (permitDrillingTechnicalInfo == null) {
			permitToDrillAWellImpl.setPermitDrillingTechnicalInfo("");
		}
		else {
			permitToDrillAWellImpl.setPermitDrillingTechnicalInfo(
				permitDrillingTechnicalInfo);
		}

		if (permitDrillingCubic == null) {
			permitToDrillAWellImpl.setPermitDrillingCubic("");
		}
		else {
			permitToDrillAWellImpl.setPermitDrillingCubic(permitDrillingCubic);
		}

		if (permitDrillingAuthority == null) {
			permitToDrillAWellImpl.setPermitDrillingAuthority("");
		}
		else {
			permitToDrillAWellImpl.setPermitDrillingAuthority(
				permitDrillingAuthority);
		}

		if (applicantSignaturePermitBtn == null) {
			permitToDrillAWellImpl.setApplicantSignaturePermitBtn("");
		}
		else {
			permitToDrillAWellImpl.setApplicantSignaturePermitBtn(
				applicantSignaturePermitBtn);
		}

		if (permitDrillingSignDate == Long.MIN_VALUE) {
			permitToDrillAWellImpl.setPermitDrillingSignDate(null);
		}
		else {
			permitToDrillAWellImpl.setPermitDrillingSignDate(
				new Date(permitDrillingSignDate));
		}

		permitToDrillAWellImpl.setWraApplicationId(wraApplicationId);

		permitToDrillAWellImpl.resetOriginalValues();

		return permitToDrillAWellImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		drillAWellApplicationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		permitDrillApplicationNum = objectInput.readUTF();
		permitDrillingApplicantName = objectInput.readUTF();
		permitDrillingMailingAddParish = objectInput.readUTF();
		permitDrillingMailingAddress = objectInput.readUTF();
		permitDrillingEmailAddress = objectInput.readUTF();
		permitDrillingOfficePhone = objectInput.readUTF();
		permitDrillingMobilePhone = objectInput.readUTF();
		wellDrillingHomePhone = objectInput.readUTF();
		permitDrillingWorkLocation = objectInput.readUTF();
		permitDrillingLocation = objectInput.readUTF();
		permitDrillingNature = objectInput.readUTF();
		permitDrillingContractorName = objectInput.readUTF();
		permitDrillContractAddress = objectInput.readUTF();
		permitDrillingContractorAdd = objectInput.readUTF();
		permitDrillingPurpose = objectInput.readUTF();
		permitDrillingBoreholeDepth = objectInput.readUTF();
		permitDrillingDiameterBorehole = objectInput.readUTF();
		permitDrillingMethod = objectInput.readUTF();
		permitDrillingConstMethod = objectInput.readUTF();
		permitDrillingSupplies = objectInput.readUTF();
		permitDrillingTechnicalInfo = objectInput.readUTF();
		permitDrillingCubic = objectInput.readUTF();
		permitDrillingAuthority = objectInput.readUTF();
		applicantSignaturePermitBtn = objectInput.readUTF();
		permitDrillingSignDate = objectInput.readLong();

		wraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(drillAWellApplicationId);

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

		if (permitDrillApplicationNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillApplicationNum);
		}

		if (permitDrillingApplicantName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingApplicantName);
		}

		if (permitDrillingMailingAddParish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingMailingAddParish);
		}

		if (permitDrillingMailingAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingMailingAddress);
		}

		if (permitDrillingEmailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingEmailAddress);
		}

		if (permitDrillingOfficePhone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingOfficePhone);
		}

		if (permitDrillingMobilePhone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingMobilePhone);
		}

		if (wellDrillingHomePhone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(wellDrillingHomePhone);
		}

		if (permitDrillingWorkLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingWorkLocation);
		}

		if (permitDrillingLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingLocation);
		}

		if (permitDrillingNature == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingNature);
		}

		if (permitDrillingContractorName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingContractorName);
		}

		if (permitDrillContractAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillContractAddress);
		}

		if (permitDrillingContractorAdd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingContractorAdd);
		}

		if (permitDrillingPurpose == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingPurpose);
		}

		if (permitDrillingBoreholeDepth == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingBoreholeDepth);
		}

		if (permitDrillingDiameterBorehole == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingDiameterBorehole);
		}

		if (permitDrillingMethod == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingMethod);
		}

		if (permitDrillingConstMethod == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingConstMethod);
		}

		if (permitDrillingSupplies == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingSupplies);
		}

		if (permitDrillingTechnicalInfo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingTechnicalInfo);
		}

		if (permitDrillingCubic == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingCubic);
		}

		if (permitDrillingAuthority == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitDrillingAuthority);
		}

		if (applicantSignaturePermitBtn == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantSignaturePermitBtn);
		}

		objectOutput.writeLong(permitDrillingSignDate);

		objectOutput.writeLong(wraApplicationId);
	}

	public long drillAWellApplicationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String permitDrillApplicationNum;
	public String permitDrillingApplicantName;
	public String permitDrillingMailingAddParish;
	public String permitDrillingMailingAddress;
	public String permitDrillingEmailAddress;
	public String permitDrillingOfficePhone;
	public String permitDrillingMobilePhone;
	public String wellDrillingHomePhone;
	public String permitDrillingWorkLocation;
	public String permitDrillingLocation;
	public String permitDrillingNature;
	public String permitDrillingContractorName;
	public String permitDrillContractAddress;
	public String permitDrillingContractorAdd;
	public String permitDrillingPurpose;
	public String permitDrillingBoreholeDepth;
	public String permitDrillingDiameterBorehole;
	public String permitDrillingMethod;
	public String permitDrillingConstMethod;
	public String permitDrillingSupplies;
	public String permitDrillingTechnicalInfo;
	public String permitDrillingCubic;
	public String permitDrillingAuthority;
	public String applicantSignaturePermitBtn;
	public long permitDrillingSignDate;
	public long wraApplicationId;

}