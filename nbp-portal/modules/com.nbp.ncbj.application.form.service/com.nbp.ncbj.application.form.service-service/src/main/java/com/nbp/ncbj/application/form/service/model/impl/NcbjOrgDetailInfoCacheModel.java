/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncbj.application.form.service.model.NcbjOrgDetailInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcbjOrgDetailInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcbjOrgDetailInfoCacheModel
	implements CacheModel<NcbjOrgDetailInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcbjOrgDetailInfoCacheModel)) {
			return false;
		}

		NcbjOrgDetailInfoCacheModel ncbjOrgDetailInfoCacheModel =
			(NcbjOrgDetailInfoCacheModel)object;

		if (ncbjOrgDetailInfoId ==
				ncbjOrgDetailInfoCacheModel.ncbjOrgDetailInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncbjOrgDetailInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(93);

		sb.append("{ncbjOrgDetailInfoId=");
		sb.append(ncbjOrgDetailInfoId);
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
		sb.append(", newCompanyName=");
		sb.append(newCompanyName);
		sb.append(", companyEmail=");
		sb.append(companyEmail);
		sb.append(", mailingAddress=");
		sb.append(mailingAddress);
		sb.append(", city=");
		sb.append(city);
		sb.append(", postalCode=");
		sb.append(postalCode);
		sb.append(", country=");
		sb.append(country);
		sb.append(", physicalAddress=");
		sb.append(physicalAddress);
		sb.append(", physicalCity=");
		sb.append(physicalCity);
		sb.append(", physicalPostalCode=");
		sb.append(physicalPostalCode);
		sb.append(", physicalCountry=");
		sb.append(physicalCountry);
		sb.append(", companyHead=");
		sb.append(companyHead);
		sb.append(", companyTitle=");
		sb.append(companyTitle);
		sb.append(", companyContact=");
		sb.append(companyContact);
		sb.append(", companyContactTitle=");
		sb.append(companyContactTitle);
		sb.append(", companyTelephone=");
		sb.append(companyTelephone);
		sb.append(", companyFax=");
		sb.append(companyFax);
		sb.append(", companyWebsite=");
		sb.append(companyWebsite);
		sb.append(", certificationScope=");
		sb.append(certificationScope);
		sb.append(", manageAccessToAuditDet=");
		sb.append(manageAccessToAuditDet);
		sb.append(", keyActivity=");
		sb.append(keyActivity);
		sb.append(", transferReason=");
		sb.append(transferReason);
		sb.append(", indicateStandard=");
		sb.append(indicateStandard);
		sb.append(", ceritificationBodyName=");
		sb.append(ceritificationBodyName);
		sb.append(", consultingFirm=");
		sb.append(consultingFirm);
		sb.append(", consultant=");
		sb.append(consultant);
		sb.append(", telephone=");
		sb.append(telephone);
		sb.append(", email=");
		sb.append(email);
		sb.append(", certificationScopeRadio=");
		sb.append(certificationScopeRadio);
		sb.append(", outsourceProcess=");
		sb.append(outsourceProcess);
		sb.append(", relevantRequirement=");
		sb.append(relevantRequirement);
		sb.append(", relevantRequirementList=");
		sb.append(relevantRequirementList);
		sb.append(", managementAccessToAudit=");
		sb.append(managementAccessToAudit);
		sb.append(", pleaseManageDetail=");
		sb.append(pleaseManageDetail);
		sb.append(", desiredCertification=");
		sb.append(desiredCertification);
		sb.append(", surveillanceSchedule=");
		sb.append(surveillanceSchedule);
		sb.append(", certifiedManagement=");
		sb.append(certifiedManagement);
		sb.append(", certifiedAccreditedCerti=");
		sb.append(certifiedAccreditedCerti);
		sb.append(", companyUsedConsulting=");
		sb.append(companyUsedConsulting);
		sb.append(", ncbjApplicationId=");
		sb.append(ncbjApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcbjOrgDetailInfo toEntityModel() {
		NcbjOrgDetailInfoImpl ncbjOrgDetailInfoImpl =
			new NcbjOrgDetailInfoImpl();

		ncbjOrgDetailInfoImpl.setNcbjOrgDetailInfoId(ncbjOrgDetailInfoId);
		ncbjOrgDetailInfoImpl.setGroupId(groupId);
		ncbjOrgDetailInfoImpl.setCompanyId(companyId);
		ncbjOrgDetailInfoImpl.setUserId(userId);

		if (userName == null) {
			ncbjOrgDetailInfoImpl.setUserName("");
		}
		else {
			ncbjOrgDetailInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncbjOrgDetailInfoImpl.setCreateDate(null);
		}
		else {
			ncbjOrgDetailInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncbjOrgDetailInfoImpl.setModifiedDate(null);
		}
		else {
			ncbjOrgDetailInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (newCompanyName == null) {
			ncbjOrgDetailInfoImpl.setNewCompanyName("");
		}
		else {
			ncbjOrgDetailInfoImpl.setNewCompanyName(newCompanyName);
		}

		if (companyEmail == null) {
			ncbjOrgDetailInfoImpl.setCompanyEmail("");
		}
		else {
			ncbjOrgDetailInfoImpl.setCompanyEmail(companyEmail);
		}

		if (mailingAddress == null) {
			ncbjOrgDetailInfoImpl.setMailingAddress("");
		}
		else {
			ncbjOrgDetailInfoImpl.setMailingAddress(mailingAddress);
		}

		if (city == null) {
			ncbjOrgDetailInfoImpl.setCity("");
		}
		else {
			ncbjOrgDetailInfoImpl.setCity(city);
		}

		if (postalCode == null) {
			ncbjOrgDetailInfoImpl.setPostalCode("");
		}
		else {
			ncbjOrgDetailInfoImpl.setPostalCode(postalCode);
		}

		if (country == null) {
			ncbjOrgDetailInfoImpl.setCountry("");
		}
		else {
			ncbjOrgDetailInfoImpl.setCountry(country);
		}

		if (physicalAddress == null) {
			ncbjOrgDetailInfoImpl.setPhysicalAddress("");
		}
		else {
			ncbjOrgDetailInfoImpl.setPhysicalAddress(physicalAddress);
		}

		if (physicalCity == null) {
			ncbjOrgDetailInfoImpl.setPhysicalCity("");
		}
		else {
			ncbjOrgDetailInfoImpl.setPhysicalCity(physicalCity);
		}

		if (physicalPostalCode == null) {
			ncbjOrgDetailInfoImpl.setPhysicalPostalCode("");
		}
		else {
			ncbjOrgDetailInfoImpl.setPhysicalPostalCode(physicalPostalCode);
		}

		if (physicalCountry == null) {
			ncbjOrgDetailInfoImpl.setPhysicalCountry("");
		}
		else {
			ncbjOrgDetailInfoImpl.setPhysicalCountry(physicalCountry);
		}

		if (companyHead == null) {
			ncbjOrgDetailInfoImpl.setCompanyHead("");
		}
		else {
			ncbjOrgDetailInfoImpl.setCompanyHead(companyHead);
		}

		if (companyTitle == null) {
			ncbjOrgDetailInfoImpl.setCompanyTitle("");
		}
		else {
			ncbjOrgDetailInfoImpl.setCompanyTitle(companyTitle);
		}

		if (companyContact == null) {
			ncbjOrgDetailInfoImpl.setCompanyContact("");
		}
		else {
			ncbjOrgDetailInfoImpl.setCompanyContact(companyContact);
		}

		if (companyContactTitle == null) {
			ncbjOrgDetailInfoImpl.setCompanyContactTitle("");
		}
		else {
			ncbjOrgDetailInfoImpl.setCompanyContactTitle(companyContactTitle);
		}

		if (companyTelephone == null) {
			ncbjOrgDetailInfoImpl.setCompanyTelephone("");
		}
		else {
			ncbjOrgDetailInfoImpl.setCompanyTelephone(companyTelephone);
		}

		if (companyFax == null) {
			ncbjOrgDetailInfoImpl.setCompanyFax("");
		}
		else {
			ncbjOrgDetailInfoImpl.setCompanyFax(companyFax);
		}

		if (companyWebsite == null) {
			ncbjOrgDetailInfoImpl.setCompanyWebsite("");
		}
		else {
			ncbjOrgDetailInfoImpl.setCompanyWebsite(companyWebsite);
		}

		if (certificationScope == null) {
			ncbjOrgDetailInfoImpl.setCertificationScope("");
		}
		else {
			ncbjOrgDetailInfoImpl.setCertificationScope(certificationScope);
		}

		if (manageAccessToAuditDet == null) {
			ncbjOrgDetailInfoImpl.setManageAccessToAuditDet("");
		}
		else {
			ncbjOrgDetailInfoImpl.setManageAccessToAuditDet(
				manageAccessToAuditDet);
		}

		if (keyActivity == null) {
			ncbjOrgDetailInfoImpl.setKeyActivity("");
		}
		else {
			ncbjOrgDetailInfoImpl.setKeyActivity(keyActivity);
		}

		if (transferReason == null) {
			ncbjOrgDetailInfoImpl.setTransferReason("");
		}
		else {
			ncbjOrgDetailInfoImpl.setTransferReason(transferReason);
		}

		if (indicateStandard == null) {
			ncbjOrgDetailInfoImpl.setIndicateStandard("");
		}
		else {
			ncbjOrgDetailInfoImpl.setIndicateStandard(indicateStandard);
		}

		if (ceritificationBodyName == null) {
			ncbjOrgDetailInfoImpl.setCeritificationBodyName("");
		}
		else {
			ncbjOrgDetailInfoImpl.setCeritificationBodyName(
				ceritificationBodyName);
		}

		if (consultingFirm == null) {
			ncbjOrgDetailInfoImpl.setConsultingFirm("");
		}
		else {
			ncbjOrgDetailInfoImpl.setConsultingFirm(consultingFirm);
		}

		if (consultant == null) {
			ncbjOrgDetailInfoImpl.setConsultant("");
		}
		else {
			ncbjOrgDetailInfoImpl.setConsultant(consultant);
		}

		if (telephone == null) {
			ncbjOrgDetailInfoImpl.setTelephone("");
		}
		else {
			ncbjOrgDetailInfoImpl.setTelephone(telephone);
		}

		if (email == null) {
			ncbjOrgDetailInfoImpl.setEmail("");
		}
		else {
			ncbjOrgDetailInfoImpl.setEmail(email);
		}

		if (certificationScopeRadio == null) {
			ncbjOrgDetailInfoImpl.setCertificationScopeRadio("");
		}
		else {
			ncbjOrgDetailInfoImpl.setCertificationScopeRadio(
				certificationScopeRadio);
		}

		if (outsourceProcess == null) {
			ncbjOrgDetailInfoImpl.setOutsourceProcess("");
		}
		else {
			ncbjOrgDetailInfoImpl.setOutsourceProcess(outsourceProcess);
		}

		if (relevantRequirement == null) {
			ncbjOrgDetailInfoImpl.setRelevantRequirement("");
		}
		else {
			ncbjOrgDetailInfoImpl.setRelevantRequirement(relevantRequirement);
		}

		if (relevantRequirementList == null) {
			ncbjOrgDetailInfoImpl.setRelevantRequirementList("");
		}
		else {
			ncbjOrgDetailInfoImpl.setRelevantRequirementList(
				relevantRequirementList);
		}

		if (managementAccessToAudit == null) {
			ncbjOrgDetailInfoImpl.setManagementAccessToAudit("");
		}
		else {
			ncbjOrgDetailInfoImpl.setManagementAccessToAudit(
				managementAccessToAudit);
		}

		if (pleaseManageDetail == null) {
			ncbjOrgDetailInfoImpl.setPleaseManageDetail("");
		}
		else {
			ncbjOrgDetailInfoImpl.setPleaseManageDetail(pleaseManageDetail);
		}

		if (desiredCertification == null) {
			ncbjOrgDetailInfoImpl.setDesiredCertification("");
		}
		else {
			ncbjOrgDetailInfoImpl.setDesiredCertification(desiredCertification);
		}

		if (surveillanceSchedule == null) {
			ncbjOrgDetailInfoImpl.setSurveillanceSchedule("");
		}
		else {
			ncbjOrgDetailInfoImpl.setSurveillanceSchedule(surveillanceSchedule);
		}

		if (certifiedManagement == null) {
			ncbjOrgDetailInfoImpl.setCertifiedManagement("");
		}
		else {
			ncbjOrgDetailInfoImpl.setCertifiedManagement(certifiedManagement);
		}

		if (certifiedAccreditedCerti == null) {
			ncbjOrgDetailInfoImpl.setCertifiedAccreditedCerti("");
		}
		else {
			ncbjOrgDetailInfoImpl.setCertifiedAccreditedCerti(
				certifiedAccreditedCerti);
		}

		if (companyUsedConsulting == null) {
			ncbjOrgDetailInfoImpl.setCompanyUsedConsulting("");
		}
		else {
			ncbjOrgDetailInfoImpl.setCompanyUsedConsulting(
				companyUsedConsulting);
		}

		ncbjOrgDetailInfoImpl.setNcbjApplicationId(ncbjApplicationId);

		ncbjOrgDetailInfoImpl.resetOriginalValues();

		return ncbjOrgDetailInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncbjOrgDetailInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		newCompanyName = objectInput.readUTF();
		companyEmail = objectInput.readUTF();
		mailingAddress = objectInput.readUTF();
		city = objectInput.readUTF();
		postalCode = objectInput.readUTF();
		country = objectInput.readUTF();
		physicalAddress = objectInput.readUTF();
		physicalCity = objectInput.readUTF();
		physicalPostalCode = objectInput.readUTF();
		physicalCountry = objectInput.readUTF();
		companyHead = objectInput.readUTF();
		companyTitle = objectInput.readUTF();
		companyContact = objectInput.readUTF();
		companyContactTitle = objectInput.readUTF();
		companyTelephone = objectInput.readUTF();
		companyFax = objectInput.readUTF();
		companyWebsite = objectInput.readUTF();
		certificationScope = objectInput.readUTF();
		manageAccessToAuditDet = objectInput.readUTF();
		keyActivity = objectInput.readUTF();
		transferReason = objectInput.readUTF();
		indicateStandard = objectInput.readUTF();
		ceritificationBodyName = objectInput.readUTF();
		consultingFirm = objectInput.readUTF();
		consultant = objectInput.readUTF();
		telephone = objectInput.readUTF();
		email = objectInput.readUTF();
		certificationScopeRadio = objectInput.readUTF();
		outsourceProcess = objectInput.readUTF();
		relevantRequirement = objectInput.readUTF();
		relevantRequirementList = objectInput.readUTF();
		managementAccessToAudit = objectInput.readUTF();
		pleaseManageDetail = objectInput.readUTF();
		desiredCertification = objectInput.readUTF();
		surveillanceSchedule = objectInput.readUTF();
		certifiedManagement = objectInput.readUTF();
		certifiedAccreditedCerti = objectInput.readUTF();
		companyUsedConsulting = objectInput.readUTF();

		ncbjApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ncbjOrgDetailInfoId);

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

		if (newCompanyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newCompanyName);
		}

		if (companyEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyEmail);
		}

		if (mailingAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mailingAddress);
		}

		if (city == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(city);
		}

		if (postalCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(postalCode);
		}

		if (country == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(country);
		}

		if (physicalAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(physicalAddress);
		}

		if (physicalCity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(physicalCity);
		}

		if (physicalPostalCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(physicalPostalCode);
		}

		if (physicalCountry == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(physicalCountry);
		}

		if (companyHead == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyHead);
		}

		if (companyTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyTitle);
		}

		if (companyContact == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyContact);
		}

		if (companyContactTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyContactTitle);
		}

		if (companyTelephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyTelephone);
		}

		if (companyFax == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyFax);
		}

		if (companyWebsite == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyWebsite);
		}

		if (certificationScope == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certificationScope);
		}

		if (manageAccessToAuditDet == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manageAccessToAuditDet);
		}

		if (keyActivity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(keyActivity);
		}

		if (transferReason == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(transferReason);
		}

		if (indicateStandard == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(indicateStandard);
		}

		if (ceritificationBodyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ceritificationBodyName);
		}

		if (consultingFirm == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(consultingFirm);
		}

		if (consultant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(consultant);
		}

		if (telephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telephone);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (certificationScopeRadio == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certificationScopeRadio);
		}

		if (outsourceProcess == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(outsourceProcess);
		}

		if (relevantRequirement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(relevantRequirement);
		}

		if (relevantRequirementList == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(relevantRequirementList);
		}

		if (managementAccessToAudit == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(managementAccessToAudit);
		}

		if (pleaseManageDetail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pleaseManageDetail);
		}

		if (desiredCertification == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(desiredCertification);
		}

		if (surveillanceSchedule == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(surveillanceSchedule);
		}

		if (certifiedManagement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certifiedManagement);
		}

		if (certifiedAccreditedCerti == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certifiedAccreditedCerti);
		}

		if (companyUsedConsulting == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyUsedConsulting);
		}

		objectOutput.writeLong(ncbjApplicationId);
	}

	public long ncbjOrgDetailInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String newCompanyName;
	public String companyEmail;
	public String mailingAddress;
	public String city;
	public String postalCode;
	public String country;
	public String physicalAddress;
	public String physicalCity;
	public String physicalPostalCode;
	public String physicalCountry;
	public String companyHead;
	public String companyTitle;
	public String companyContact;
	public String companyContactTitle;
	public String companyTelephone;
	public String companyFax;
	public String companyWebsite;
	public String certificationScope;
	public String manageAccessToAuditDet;
	public String keyActivity;
	public String transferReason;
	public String indicateStandard;
	public String ceritificationBodyName;
	public String consultingFirm;
	public String consultant;
	public String telephone;
	public String email;
	public String certificationScopeRadio;
	public String outsourceProcess;
	public String relevantRequirement;
	public String relevantRequirementList;
	public String managementAccessToAudit;
	public String pleaseManageDetail;
	public String desiredCertification;
	public String surveillanceSchedule;
	public String certifiedManagement;
	public String certifiedAccreditedCerti;
	public String companyUsedConsulting;
	public long ncbjApplicationId;

}