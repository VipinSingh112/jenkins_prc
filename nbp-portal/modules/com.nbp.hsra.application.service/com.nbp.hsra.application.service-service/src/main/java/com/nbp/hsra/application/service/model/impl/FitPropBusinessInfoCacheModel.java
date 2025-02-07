/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.FitPropBusinessInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FitPropBusinessInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FitPropBusinessInfoCacheModel
	implements CacheModel<FitPropBusinessInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FitPropBusinessInfoCacheModel)) {
			return false;
		}

		FitPropBusinessInfoCacheModel fitPropBusinessInfoCacheModel =
			(FitPropBusinessInfoCacheModel)object;

		if (fitPropBusinessInfoId ==
				fitPropBusinessInfoCacheModel.fitPropBusinessInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fitPropBusinessInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(59);

		sb.append("{fitPropBusinessInfoId=");
		sb.append(fitPropBusinessInfoId);
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
		sb.append(", companyType=");
		sb.append(companyType);
		sb.append(", applicantBusinessName=");
		sb.append(applicantBusinessName);
		sb.append(", applicantcomName=");
		sb.append(applicantcomName);
		sb.append(", applicantComAddress=");
		sb.append(applicantComAddress);
		sb.append(", applicantComAddressParish=");
		sb.append(applicantComAddressParish);
		sb.append(", applicantComNo=");
		sb.append(applicantComNo);
		sb.append(", applicantComEmail=");
		sb.append(applicantComEmail);
		sb.append(", applicantComTelephone=");
		sb.append(applicantComTelephone);
		sb.append(", applicantComTitle=");
		sb.append(applicantComTitle);
		sb.append(", materialTechnology=");
		sb.append(materialTechnology);
		sb.append(", relevantBox=");
		sb.append(relevantBox);
		sb.append(", corporateDirector=");
		sb.append(corporateDirector);
		sb.append(", facilitySources=");
		sb.append(facilitySources);
		sb.append(", criminalFraud=");
		sb.append(criminalFraud);
		sb.append(", professionalSubject=");
		sb.append(professionalSubject);
		sb.append(", employmentResign=");
		sb.append(employmentResign);
		sb.append(", mentallyIll=");
		sb.append(mentallyIll);
		sb.append(", bankruptAuthority=");
		sb.append(bankruptAuthority);
		sb.append(", circumstancesEvent=");
		sb.append(circumstancesEvent);
		sb.append(", partnershipHsra=");
		sb.append(partnershipHsra);
		sb.append(", facilityAssociated=");
		sb.append(facilityAssociated);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FitPropBusinessInfo toEntityModel() {
		FitPropBusinessInfoImpl fitPropBusinessInfoImpl =
			new FitPropBusinessInfoImpl();

		fitPropBusinessInfoImpl.setFitPropBusinessInfoId(fitPropBusinessInfoId);
		fitPropBusinessInfoImpl.setGroupId(groupId);
		fitPropBusinessInfoImpl.setCompanyId(companyId);
		fitPropBusinessInfoImpl.setUserId(userId);

		if (userName == null) {
			fitPropBusinessInfoImpl.setUserName("");
		}
		else {
			fitPropBusinessInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			fitPropBusinessInfoImpl.setCreateDate(null);
		}
		else {
			fitPropBusinessInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			fitPropBusinessInfoImpl.setModifiedDate(null);
		}
		else {
			fitPropBusinessInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (companyType == null) {
			fitPropBusinessInfoImpl.setCompanyType("");
		}
		else {
			fitPropBusinessInfoImpl.setCompanyType(companyType);
		}

		if (applicantBusinessName == null) {
			fitPropBusinessInfoImpl.setApplicantBusinessName("");
		}
		else {
			fitPropBusinessInfoImpl.setApplicantBusinessName(
				applicantBusinessName);
		}

		if (applicantcomName == null) {
			fitPropBusinessInfoImpl.setApplicantcomName("");
		}
		else {
			fitPropBusinessInfoImpl.setApplicantcomName(applicantcomName);
		}

		if (applicantComAddress == null) {
			fitPropBusinessInfoImpl.setApplicantComAddress("");
		}
		else {
			fitPropBusinessInfoImpl.setApplicantComAddress(applicantComAddress);
		}

		if (applicantComAddressParish == null) {
			fitPropBusinessInfoImpl.setApplicantComAddressParish("");
		}
		else {
			fitPropBusinessInfoImpl.setApplicantComAddressParish(
				applicantComAddressParish);
		}

		if (applicantComNo == null) {
			fitPropBusinessInfoImpl.setApplicantComNo("");
		}
		else {
			fitPropBusinessInfoImpl.setApplicantComNo(applicantComNo);
		}

		if (applicantComEmail == null) {
			fitPropBusinessInfoImpl.setApplicantComEmail("");
		}
		else {
			fitPropBusinessInfoImpl.setApplicantComEmail(applicantComEmail);
		}

		if (applicantComTelephone == null) {
			fitPropBusinessInfoImpl.setApplicantComTelephone("");
		}
		else {
			fitPropBusinessInfoImpl.setApplicantComTelephone(
				applicantComTelephone);
		}

		if (applicantComTitle == null) {
			fitPropBusinessInfoImpl.setApplicantComTitle("");
		}
		else {
			fitPropBusinessInfoImpl.setApplicantComTitle(applicantComTitle);
		}

		if (materialTechnology == null) {
			fitPropBusinessInfoImpl.setMaterialTechnology("");
		}
		else {
			fitPropBusinessInfoImpl.setMaterialTechnology(materialTechnology);
		}

		if (relevantBox == null) {
			fitPropBusinessInfoImpl.setRelevantBox("");
		}
		else {
			fitPropBusinessInfoImpl.setRelevantBox(relevantBox);
		}

		if (corporateDirector == null) {
			fitPropBusinessInfoImpl.setCorporateDirector("");
		}
		else {
			fitPropBusinessInfoImpl.setCorporateDirector(corporateDirector);
		}

		if (facilitySources == null) {
			fitPropBusinessInfoImpl.setFacilitySources("");
		}
		else {
			fitPropBusinessInfoImpl.setFacilitySources(facilitySources);
		}

		if (criminalFraud == null) {
			fitPropBusinessInfoImpl.setCriminalFraud("");
		}
		else {
			fitPropBusinessInfoImpl.setCriminalFraud(criminalFraud);
		}

		if (professionalSubject == null) {
			fitPropBusinessInfoImpl.setProfessionalSubject("");
		}
		else {
			fitPropBusinessInfoImpl.setProfessionalSubject(professionalSubject);
		}

		if (employmentResign == null) {
			fitPropBusinessInfoImpl.setEmploymentResign("");
		}
		else {
			fitPropBusinessInfoImpl.setEmploymentResign(employmentResign);
		}

		if (mentallyIll == null) {
			fitPropBusinessInfoImpl.setMentallyIll("");
		}
		else {
			fitPropBusinessInfoImpl.setMentallyIll(mentallyIll);
		}

		if (bankruptAuthority == null) {
			fitPropBusinessInfoImpl.setBankruptAuthority("");
		}
		else {
			fitPropBusinessInfoImpl.setBankruptAuthority(bankruptAuthority);
		}

		if (circumstancesEvent == null) {
			fitPropBusinessInfoImpl.setCircumstancesEvent("");
		}
		else {
			fitPropBusinessInfoImpl.setCircumstancesEvent(circumstancesEvent);
		}

		if (partnershipHsra == null) {
			fitPropBusinessInfoImpl.setPartnershipHsra("");
		}
		else {
			fitPropBusinessInfoImpl.setPartnershipHsra(partnershipHsra);
		}

		if (facilityAssociated == null) {
			fitPropBusinessInfoImpl.setFacilityAssociated("");
		}
		else {
			fitPropBusinessInfoImpl.setFacilityAssociated(facilityAssociated);
		}

		fitPropBusinessInfoImpl.setHsraApplicationId(hsraApplicationId);

		fitPropBusinessInfoImpl.resetOriginalValues();

		return fitPropBusinessInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fitPropBusinessInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		companyType = objectInput.readUTF();
		applicantBusinessName = objectInput.readUTF();
		applicantcomName = objectInput.readUTF();
		applicantComAddress = objectInput.readUTF();
		applicantComAddressParish = objectInput.readUTF();
		applicantComNo = objectInput.readUTF();
		applicantComEmail = objectInput.readUTF();
		applicantComTelephone = objectInput.readUTF();
		applicantComTitle = objectInput.readUTF();
		materialTechnology = objectInput.readUTF();
		relevantBox = objectInput.readUTF();
		corporateDirector = objectInput.readUTF();
		facilitySources = objectInput.readUTF();
		criminalFraud = objectInput.readUTF();
		professionalSubject = objectInput.readUTF();
		employmentResign = objectInput.readUTF();
		mentallyIll = objectInput.readUTF();
		bankruptAuthority = objectInput.readUTF();
		circumstancesEvent = objectInput.readUTF();
		partnershipHsra = objectInput.readUTF();
		facilityAssociated = objectInput.readUTF();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(fitPropBusinessInfoId);

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

		if (companyType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyType);
		}

		if (applicantBusinessName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantBusinessName);
		}

		if (applicantcomName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantcomName);
		}

		if (applicantComAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantComAddress);
		}

		if (applicantComAddressParish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantComAddressParish);
		}

		if (applicantComNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantComNo);
		}

		if (applicantComEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantComEmail);
		}

		if (applicantComTelephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantComTelephone);
		}

		if (applicantComTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantComTitle);
		}

		if (materialTechnology == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(materialTechnology);
		}

		if (relevantBox == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(relevantBox);
		}

		if (corporateDirector == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(corporateDirector);
		}

		if (facilitySources == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(facilitySources);
		}

		if (criminalFraud == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(criminalFraud);
		}

		if (professionalSubject == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(professionalSubject);
		}

		if (employmentResign == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(employmentResign);
		}

		if (mentallyIll == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mentallyIll);
		}

		if (bankruptAuthority == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bankruptAuthority);
		}

		if (circumstancesEvent == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(circumstancesEvent);
		}

		if (partnershipHsra == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(partnershipHsra);
		}

		if (facilityAssociated == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(facilityAssociated);
		}

		objectOutput.writeLong(hsraApplicationId);
	}

	public long fitPropBusinessInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String companyType;
	public String applicantBusinessName;
	public String applicantcomName;
	public String applicantComAddress;
	public String applicantComAddressParish;
	public String applicantComNo;
	public String applicantComEmail;
	public String applicantComTelephone;
	public String applicantComTitle;
	public String materialTechnology;
	public String relevantBox;
	public String corporateDirector;
	public String facilitySources;
	public String criminalFraud;
	public String professionalSubject;
	public String employmentResign;
	public String mentallyIll;
	public String bankruptAuthority;
	public String circumstancesEvent;
	public String partnershipHsra;
	public String facilityAssociated;
	public long hsraApplicationId;

}