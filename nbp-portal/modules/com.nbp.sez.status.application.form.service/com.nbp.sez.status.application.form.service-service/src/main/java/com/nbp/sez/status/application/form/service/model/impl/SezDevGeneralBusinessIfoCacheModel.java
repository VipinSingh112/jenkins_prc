/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezDevGeneralBusinessIfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezDevGeneralBusinessIfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezDevGeneralBusinessIfoCacheModel
	implements CacheModel<SezDevGeneralBusinessIfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezDevGeneralBusinessIfoCacheModel)) {
			return false;
		}

		SezDevGeneralBusinessIfoCacheModel sezDevGeneralBusinessIfoCacheModel =
			(SezDevGeneralBusinessIfoCacheModel)object;

		if (sezDevGeneralBusinessIfoId ==
				sezDevGeneralBusinessIfoCacheModel.sezDevGeneralBusinessIfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezDevGeneralBusinessIfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(75);

		sb.append("{sezDevGeneralBusinessIfoId=");
		sb.append(sezDevGeneralBusinessIfoId);
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
		sb.append(", applicationDate=");
		sb.append(applicationDate);
		sb.append(", applicantName=");
		sb.append(applicantName);
		sb.append(", companyName=");
		sb.append(companyName);
		sb.append(", buildingNum=");
		sb.append(buildingNum);
		sb.append(", townCity=");
		sb.append(townCity);
		sb.append(", Parish=");
		sb.append(Parish);
		sb.append(", country=");
		sb.append(country);
		sb.append(", telephoneNum=");
		sb.append(telephoneNum);
		sb.append(", faxNum=");
		sb.append(faxNum);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", website=");
		sb.append(website);
		sb.append(", headOfficeBuildingNum=");
		sb.append(headOfficeBuildingNum);
		sb.append(", headOfficeTown=");
		sb.append(headOfficeTown);
		sb.append(", headOfficeParish=");
		sb.append(headOfficeParish);
		sb.append(", authRepName=");
		sb.append(authRepName);
		sb.append(", authRepBuildingNum=");
		sb.append(authRepBuildingNum);
		sb.append(", authRepTown=");
		sb.append(authRepTown);
		sb.append(", authRepParish=");
		sb.append(authRepParish);
		sb.append(", authRepCountry=");
		sb.append(authRepCountry);
		sb.append(", authReptelephoneNum=");
		sb.append(authReptelephoneNum);
		sb.append(", authRepFaxNum=");
		sb.append(authRepFaxNum);
		sb.append(", autheEmailAddress=");
		sb.append(autheEmailAddress);
		sb.append(", joinVenture=");
		sb.append(joinVenture);
		sb.append(", existingJamicanCom=");
		sb.append(existingJamicanCom);
		sb.append(", articleOfIncorporation=");
		sb.append(articleOfIncorporation);
		sb.append(", pleaseSpecify=");
		sb.append(pleaseSpecify);
		sb.append(", companyClassified=");
		sb.append(companyClassified);
		sb.append(", taxRegisNum=");
		sb.append(taxRegisNum);
		sb.append(", genConsumptionNum=");
		sb.append(genConsumptionNum);
		sb.append(", taxComplianceCertificateNum=");
		sb.append(taxComplianceCertificateNum);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezDevGeneralBusinessIfo toEntityModel() {
		SezDevGeneralBusinessIfoImpl sezDevGeneralBusinessIfoImpl =
			new SezDevGeneralBusinessIfoImpl();

		sezDevGeneralBusinessIfoImpl.setSezDevGeneralBusinessIfoId(
			sezDevGeneralBusinessIfoId);
		sezDevGeneralBusinessIfoImpl.setGroupId(groupId);
		sezDevGeneralBusinessIfoImpl.setCompanyId(companyId);
		sezDevGeneralBusinessIfoImpl.setUserId(userId);

		if (userName == null) {
			sezDevGeneralBusinessIfoImpl.setUserName("");
		}
		else {
			sezDevGeneralBusinessIfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezDevGeneralBusinessIfoImpl.setCreateDate(null);
		}
		else {
			sezDevGeneralBusinessIfoImpl.setCreateDate(new Date(createDate));
		}

		if (applicationDate == Long.MIN_VALUE) {
			sezDevGeneralBusinessIfoImpl.setApplicationDate(null);
		}
		else {
			sezDevGeneralBusinessIfoImpl.setApplicationDate(
				new Date(applicationDate));
		}

		if (applicantName == null) {
			sezDevGeneralBusinessIfoImpl.setApplicantName("");
		}
		else {
			sezDevGeneralBusinessIfoImpl.setApplicantName(applicantName);
		}

		if (companyName == null) {
			sezDevGeneralBusinessIfoImpl.setCompanyName("");
		}
		else {
			sezDevGeneralBusinessIfoImpl.setCompanyName(companyName);
		}

		if (buildingNum == null) {
			sezDevGeneralBusinessIfoImpl.setBuildingNum("");
		}
		else {
			sezDevGeneralBusinessIfoImpl.setBuildingNum(buildingNum);
		}

		if (townCity == null) {
			sezDevGeneralBusinessIfoImpl.setTownCity("");
		}
		else {
			sezDevGeneralBusinessIfoImpl.setTownCity(townCity);
		}

		if (Parish == null) {
			sezDevGeneralBusinessIfoImpl.setParish("");
		}
		else {
			sezDevGeneralBusinessIfoImpl.setParish(Parish);
		}

		if (country == null) {
			sezDevGeneralBusinessIfoImpl.setCountry("");
		}
		else {
			sezDevGeneralBusinessIfoImpl.setCountry(country);
		}

		if (telephoneNum == null) {
			sezDevGeneralBusinessIfoImpl.setTelephoneNum("");
		}
		else {
			sezDevGeneralBusinessIfoImpl.setTelephoneNum(telephoneNum);
		}

		if (faxNum == null) {
			sezDevGeneralBusinessIfoImpl.setFaxNum("");
		}
		else {
			sezDevGeneralBusinessIfoImpl.setFaxNum(faxNum);
		}

		if (emailAddress == null) {
			sezDevGeneralBusinessIfoImpl.setEmailAddress("");
		}
		else {
			sezDevGeneralBusinessIfoImpl.setEmailAddress(emailAddress);
		}

		if (website == null) {
			sezDevGeneralBusinessIfoImpl.setWebsite("");
		}
		else {
			sezDevGeneralBusinessIfoImpl.setWebsite(website);
		}

		if (headOfficeBuildingNum == null) {
			sezDevGeneralBusinessIfoImpl.setHeadOfficeBuildingNum("");
		}
		else {
			sezDevGeneralBusinessIfoImpl.setHeadOfficeBuildingNum(
				headOfficeBuildingNum);
		}

		if (headOfficeTown == null) {
			sezDevGeneralBusinessIfoImpl.setHeadOfficeTown("");
		}
		else {
			sezDevGeneralBusinessIfoImpl.setHeadOfficeTown(headOfficeTown);
		}

		if (headOfficeParish == null) {
			sezDevGeneralBusinessIfoImpl.setHeadOfficeParish("");
		}
		else {
			sezDevGeneralBusinessIfoImpl.setHeadOfficeParish(headOfficeParish);
		}

		if (authRepName == null) {
			sezDevGeneralBusinessIfoImpl.setAuthRepName("");
		}
		else {
			sezDevGeneralBusinessIfoImpl.setAuthRepName(authRepName);
		}

		if (authRepBuildingNum == null) {
			sezDevGeneralBusinessIfoImpl.setAuthRepBuildingNum("");
		}
		else {
			sezDevGeneralBusinessIfoImpl.setAuthRepBuildingNum(
				authRepBuildingNum);
		}

		if (authRepTown == null) {
			sezDevGeneralBusinessIfoImpl.setAuthRepTown("");
		}
		else {
			sezDevGeneralBusinessIfoImpl.setAuthRepTown(authRepTown);
		}

		if (authRepParish == null) {
			sezDevGeneralBusinessIfoImpl.setAuthRepParish("");
		}
		else {
			sezDevGeneralBusinessIfoImpl.setAuthRepParish(authRepParish);
		}

		if (authRepCountry == null) {
			sezDevGeneralBusinessIfoImpl.setAuthRepCountry("");
		}
		else {
			sezDevGeneralBusinessIfoImpl.setAuthRepCountry(authRepCountry);
		}

		if (authReptelephoneNum == null) {
			sezDevGeneralBusinessIfoImpl.setAuthReptelephoneNum("");
		}
		else {
			sezDevGeneralBusinessIfoImpl.setAuthReptelephoneNum(
				authReptelephoneNum);
		}

		if (authRepFaxNum == null) {
			sezDevGeneralBusinessIfoImpl.setAuthRepFaxNum("");
		}
		else {
			sezDevGeneralBusinessIfoImpl.setAuthRepFaxNum(authRepFaxNum);
		}

		if (autheEmailAddress == null) {
			sezDevGeneralBusinessIfoImpl.setAutheEmailAddress("");
		}
		else {
			sezDevGeneralBusinessIfoImpl.setAutheEmailAddress(
				autheEmailAddress);
		}

		if (joinVenture == null) {
			sezDevGeneralBusinessIfoImpl.setJoinVenture("");
		}
		else {
			sezDevGeneralBusinessIfoImpl.setJoinVenture(joinVenture);
		}

		if (existingJamicanCom == null) {
			sezDevGeneralBusinessIfoImpl.setExistingJamicanCom("");
		}
		else {
			sezDevGeneralBusinessIfoImpl.setExistingJamicanCom(
				existingJamicanCom);
		}

		if (articleOfIncorporation == null) {
			sezDevGeneralBusinessIfoImpl.setArticleOfIncorporation("");
		}
		else {
			sezDevGeneralBusinessIfoImpl.setArticleOfIncorporation(
				articleOfIncorporation);
		}

		if (pleaseSpecify == null) {
			sezDevGeneralBusinessIfoImpl.setPleaseSpecify("");
		}
		else {
			sezDevGeneralBusinessIfoImpl.setPleaseSpecify(pleaseSpecify);
		}

		if (companyClassified == null) {
			sezDevGeneralBusinessIfoImpl.setCompanyClassified("");
		}
		else {
			sezDevGeneralBusinessIfoImpl.setCompanyClassified(
				companyClassified);
		}

		if (taxRegisNum == null) {
			sezDevGeneralBusinessIfoImpl.setTaxRegisNum("");
		}
		else {
			sezDevGeneralBusinessIfoImpl.setTaxRegisNum(taxRegisNum);
		}

		if (genConsumptionNum == null) {
			sezDevGeneralBusinessIfoImpl.setGenConsumptionNum("");
		}
		else {
			sezDevGeneralBusinessIfoImpl.setGenConsumptionNum(
				genConsumptionNum);
		}

		if (taxComplianceCertificateNum == null) {
			sezDevGeneralBusinessIfoImpl.setTaxComplianceCertificateNum("");
		}
		else {
			sezDevGeneralBusinessIfoImpl.setTaxComplianceCertificateNum(
				taxComplianceCertificateNum);
		}

		sezDevGeneralBusinessIfoImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezDevGeneralBusinessIfoImpl.resetOriginalValues();

		return sezDevGeneralBusinessIfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezDevGeneralBusinessIfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		applicationDate = objectInput.readLong();
		applicantName = objectInput.readUTF();
		companyName = objectInput.readUTF();
		buildingNum = objectInput.readUTF();
		townCity = objectInput.readUTF();
		Parish = objectInput.readUTF();
		country = objectInput.readUTF();
		telephoneNum = objectInput.readUTF();
		faxNum = objectInput.readUTF();
		emailAddress = objectInput.readUTF();
		website = objectInput.readUTF();
		headOfficeBuildingNum = objectInput.readUTF();
		headOfficeTown = objectInput.readUTF();
		headOfficeParish = objectInput.readUTF();
		authRepName = objectInput.readUTF();
		authRepBuildingNum = objectInput.readUTF();
		authRepTown = objectInput.readUTF();
		authRepParish = objectInput.readUTF();
		authRepCountry = objectInput.readUTF();
		authReptelephoneNum = objectInput.readUTF();
		authRepFaxNum = objectInput.readUTF();
		autheEmailAddress = objectInput.readUTF();
		joinVenture = objectInput.readUTF();
		existingJamicanCom = objectInput.readUTF();
		articleOfIncorporation = objectInput.readUTF();
		pleaseSpecify = objectInput.readUTF();
		companyClassified = objectInput.readUTF();
		taxRegisNum = objectInput.readUTF();
		genConsumptionNum = objectInput.readUTF();
		taxComplianceCertificateNum = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezDevGeneralBusinessIfoId);

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
		objectOutput.writeLong(applicationDate);

		if (applicantName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantName);
		}

		if (companyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyName);
		}

		if (buildingNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(buildingNum);
		}

		if (townCity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(townCity);
		}

		if (Parish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Parish);
		}

		if (country == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(country);
		}

		if (telephoneNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telephoneNum);
		}

		if (faxNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(faxNum);
		}

		if (emailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailAddress);
		}

		if (website == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(website);
		}

		if (headOfficeBuildingNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(headOfficeBuildingNum);
		}

		if (headOfficeTown == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(headOfficeTown);
		}

		if (headOfficeParish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(headOfficeParish);
		}

		if (authRepName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(authRepName);
		}

		if (authRepBuildingNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(authRepBuildingNum);
		}

		if (authRepTown == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(authRepTown);
		}

		if (authRepParish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(authRepParish);
		}

		if (authRepCountry == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(authRepCountry);
		}

		if (authReptelephoneNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(authReptelephoneNum);
		}

		if (authRepFaxNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(authRepFaxNum);
		}

		if (autheEmailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(autheEmailAddress);
		}

		if (joinVenture == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(joinVenture);
		}

		if (existingJamicanCom == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(existingJamicanCom);
		}

		if (articleOfIncorporation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(articleOfIncorporation);
		}

		if (pleaseSpecify == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pleaseSpecify);
		}

		if (companyClassified == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyClassified);
		}

		if (taxRegisNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(taxRegisNum);
		}

		if (genConsumptionNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(genConsumptionNum);
		}

		if (taxComplianceCertificateNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(taxComplianceCertificateNum);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezDevGeneralBusinessIfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long applicationDate;
	public String applicantName;
	public String companyName;
	public String buildingNum;
	public String townCity;
	public String Parish;
	public String country;
	public String telephoneNum;
	public String faxNum;
	public String emailAddress;
	public String website;
	public String headOfficeBuildingNum;
	public String headOfficeTown;
	public String headOfficeParish;
	public String authRepName;
	public String authRepBuildingNum;
	public String authRepTown;
	public String authRepParish;
	public String authRepCountry;
	public String authReptelephoneNum;
	public String authRepFaxNum;
	public String autheEmailAddress;
	public String joinVenture;
	public String existingJamicanCom;
	public String articleOfIncorporation;
	public String pleaseSpecify;
	public String companyClassified;
	public String taxRegisNum;
	public String genConsumptionNum;
	public String taxComplianceCertificateNum;
	public long sezStatusApplicationId;

}