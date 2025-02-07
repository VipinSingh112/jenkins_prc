/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.wra.application.form.service.model.LicenceToAbstractInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing LicenceToAbstractInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LicenceToAbstractInfoCacheModel
	implements CacheModel<LicenceToAbstractInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof LicenceToAbstractInfoCacheModel)) {
			return false;
		}

		LicenceToAbstractInfoCacheModel licenceToAbstractInfoCacheModel =
			(LicenceToAbstractInfoCacheModel)object;

		if (abstractLicenceId ==
				licenceToAbstractInfoCacheModel.abstractLicenceId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, abstractLicenceId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(75);

		sb.append("{abstractLicenceId=");
		sb.append(abstractLicenceId);
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
		sb.append(", applicationNum=");
		sb.append(applicationNum);
		sb.append(", nameOfApplicant=");
		sb.append(nameOfApplicant);
		sb.append(", parishApplicant=");
		sb.append(parishApplicant);
		sb.append(", mailingAddOfApplicant=");
		sb.append(mailingAddOfApplicant);
		sb.append(", emailOfApplicant=");
		sb.append(emailOfApplicant);
		sb.append(", officePhone=");
		sb.append(officePhone);
		sb.append(", mobilePhone=");
		sb.append(mobilePhone);
		sb.append(", homePhone=");
		sb.append(homePhone);
		sb.append(", locationOfProposedParish=");
		sb.append(locationOfProposedParish);
		sb.append(", locationOfProParishWork=");
		sb.append(locationOfProParishWork);
		sb.append(", nameOfContractor=");
		sb.append(nameOfContractor);
		sb.append(", parishContractor=");
		sb.append(parishContractor);
		sb.append(", addressOfContractor=");
		sb.append(addressOfContractor);
		sb.append(", sourceOfWater=");
		sb.append(sourceOfWater);
		sb.append(", purposeWaterUse=");
		sb.append(purposeWaterUse);
		sb.append(", areaAndCropType=");
		sb.append(areaAndCropType);
		sb.append(", systemOfIrrigation=");
		sb.append(systemOfIrrigation);
		sb.append(", meansOfDisposal=");
		sb.append(meansOfDisposal);
		sb.append(", estimateDepthOfBorewell=");
		sb.append(estimateDepthOfBorewell);
		sb.append(", diameterOfBorewell=");
		sb.append(diameterOfBorewell);
		sb.append(", artesianSupply=");
		sb.append(artesianSupply);
		sb.append(", geologicalStrait=");
		sb.append(geologicalStrait);
		sb.append(", methodOfAbstractingWater=");
		sb.append(methodOfAbstractingWater);
		sb.append(", maxDailyQuant=");
		sb.append(maxDailyQuant);
		sb.append(", typeOfAppratusProposed=");
		sb.append(typeOfAppratusProposed);
		sb.append(", otherInformation=");
		sb.append(otherInformation);
		sb.append(", requestToSupplyWater=");
		sb.append(requestToSupplyWater);
		sb.append(", authorityInformation=");
		sb.append(authorityInformation);
		sb.append(", dateOfSign=");
		sb.append(dateOfSign);
		sb.append(", wraApplicationId=");
		sb.append(wraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LicenceToAbstractInfo toEntityModel() {
		LicenceToAbstractInfoImpl licenceToAbstractInfoImpl =
			new LicenceToAbstractInfoImpl();

		licenceToAbstractInfoImpl.setAbstractLicenceId(abstractLicenceId);
		licenceToAbstractInfoImpl.setGroupId(groupId);
		licenceToAbstractInfoImpl.setCompanyId(companyId);
		licenceToAbstractInfoImpl.setUserId(userId);

		if (userName == null) {
			licenceToAbstractInfoImpl.setUserName("");
		}
		else {
			licenceToAbstractInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			licenceToAbstractInfoImpl.setCreateDate(null);
		}
		else {
			licenceToAbstractInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			licenceToAbstractInfoImpl.setModifiedDate(null);
		}
		else {
			licenceToAbstractInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (applicationNum == null) {
			licenceToAbstractInfoImpl.setApplicationNum("");
		}
		else {
			licenceToAbstractInfoImpl.setApplicationNum(applicationNum);
		}

		if (nameOfApplicant == null) {
			licenceToAbstractInfoImpl.setNameOfApplicant("");
		}
		else {
			licenceToAbstractInfoImpl.setNameOfApplicant(nameOfApplicant);
		}

		if (parishApplicant == null) {
			licenceToAbstractInfoImpl.setParishApplicant("");
		}
		else {
			licenceToAbstractInfoImpl.setParishApplicant(parishApplicant);
		}

		if (mailingAddOfApplicant == null) {
			licenceToAbstractInfoImpl.setMailingAddOfApplicant("");
		}
		else {
			licenceToAbstractInfoImpl.setMailingAddOfApplicant(
				mailingAddOfApplicant);
		}

		if (emailOfApplicant == null) {
			licenceToAbstractInfoImpl.setEmailOfApplicant("");
		}
		else {
			licenceToAbstractInfoImpl.setEmailOfApplicant(emailOfApplicant);
		}

		if (officePhone == null) {
			licenceToAbstractInfoImpl.setOfficePhone("");
		}
		else {
			licenceToAbstractInfoImpl.setOfficePhone(officePhone);
		}

		if (mobilePhone == null) {
			licenceToAbstractInfoImpl.setMobilePhone("");
		}
		else {
			licenceToAbstractInfoImpl.setMobilePhone(mobilePhone);
		}

		if (homePhone == null) {
			licenceToAbstractInfoImpl.setHomePhone("");
		}
		else {
			licenceToAbstractInfoImpl.setHomePhone(homePhone);
		}

		if (locationOfProposedParish == null) {
			licenceToAbstractInfoImpl.setLocationOfProposedParish("");
		}
		else {
			licenceToAbstractInfoImpl.setLocationOfProposedParish(
				locationOfProposedParish);
		}

		if (locationOfProParishWork == null) {
			licenceToAbstractInfoImpl.setLocationOfProParishWork("");
		}
		else {
			licenceToAbstractInfoImpl.setLocationOfProParishWork(
				locationOfProParishWork);
		}

		if (nameOfContractor == null) {
			licenceToAbstractInfoImpl.setNameOfContractor("");
		}
		else {
			licenceToAbstractInfoImpl.setNameOfContractor(nameOfContractor);
		}

		if (parishContractor == null) {
			licenceToAbstractInfoImpl.setParishContractor("");
		}
		else {
			licenceToAbstractInfoImpl.setParishContractor(parishContractor);
		}

		if (addressOfContractor == null) {
			licenceToAbstractInfoImpl.setAddressOfContractor("");
		}
		else {
			licenceToAbstractInfoImpl.setAddressOfContractor(
				addressOfContractor);
		}

		if (sourceOfWater == null) {
			licenceToAbstractInfoImpl.setSourceOfWater("");
		}
		else {
			licenceToAbstractInfoImpl.setSourceOfWater(sourceOfWater);
		}

		if (purposeWaterUse == null) {
			licenceToAbstractInfoImpl.setPurposeWaterUse("");
		}
		else {
			licenceToAbstractInfoImpl.setPurposeWaterUse(purposeWaterUse);
		}

		if (areaAndCropType == null) {
			licenceToAbstractInfoImpl.setAreaAndCropType("");
		}
		else {
			licenceToAbstractInfoImpl.setAreaAndCropType(areaAndCropType);
		}

		if (systemOfIrrigation == null) {
			licenceToAbstractInfoImpl.setSystemOfIrrigation("");
		}
		else {
			licenceToAbstractInfoImpl.setSystemOfIrrigation(systemOfIrrigation);
		}

		if (meansOfDisposal == null) {
			licenceToAbstractInfoImpl.setMeansOfDisposal("");
		}
		else {
			licenceToAbstractInfoImpl.setMeansOfDisposal(meansOfDisposal);
		}

		if (estimateDepthOfBorewell == null) {
			licenceToAbstractInfoImpl.setEstimateDepthOfBorewell("");
		}
		else {
			licenceToAbstractInfoImpl.setEstimateDepthOfBorewell(
				estimateDepthOfBorewell);
		}

		if (diameterOfBorewell == null) {
			licenceToAbstractInfoImpl.setDiameterOfBorewell("");
		}
		else {
			licenceToAbstractInfoImpl.setDiameterOfBorewell(diameterOfBorewell);
		}

		if (artesianSupply == null) {
			licenceToAbstractInfoImpl.setArtesianSupply("");
		}
		else {
			licenceToAbstractInfoImpl.setArtesianSupply(artesianSupply);
		}

		if (geologicalStrait == null) {
			licenceToAbstractInfoImpl.setGeologicalStrait("");
		}
		else {
			licenceToAbstractInfoImpl.setGeologicalStrait(geologicalStrait);
		}

		if (methodOfAbstractingWater == null) {
			licenceToAbstractInfoImpl.setMethodOfAbstractingWater("");
		}
		else {
			licenceToAbstractInfoImpl.setMethodOfAbstractingWater(
				methodOfAbstractingWater);
		}

		if (maxDailyQuant == null) {
			licenceToAbstractInfoImpl.setMaxDailyQuant("");
		}
		else {
			licenceToAbstractInfoImpl.setMaxDailyQuant(maxDailyQuant);
		}

		if (typeOfAppratusProposed == null) {
			licenceToAbstractInfoImpl.setTypeOfAppratusProposed("");
		}
		else {
			licenceToAbstractInfoImpl.setTypeOfAppratusProposed(
				typeOfAppratusProposed);
		}

		if (otherInformation == null) {
			licenceToAbstractInfoImpl.setOtherInformation("");
		}
		else {
			licenceToAbstractInfoImpl.setOtherInformation(otherInformation);
		}

		if (requestToSupplyWater == null) {
			licenceToAbstractInfoImpl.setRequestToSupplyWater("");
		}
		else {
			licenceToAbstractInfoImpl.setRequestToSupplyWater(
				requestToSupplyWater);
		}

		if (authorityInformation == null) {
			licenceToAbstractInfoImpl.setAuthorityInformation("");
		}
		else {
			licenceToAbstractInfoImpl.setAuthorityInformation(
				authorityInformation);
		}

		if (dateOfSign == Long.MIN_VALUE) {
			licenceToAbstractInfoImpl.setDateOfSign(null);
		}
		else {
			licenceToAbstractInfoImpl.setDateOfSign(new Date(dateOfSign));
		}

		licenceToAbstractInfoImpl.setWraApplicationId(wraApplicationId);

		licenceToAbstractInfoImpl.resetOriginalValues();

		return licenceToAbstractInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		abstractLicenceId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		applicationNum = objectInput.readUTF();
		nameOfApplicant = objectInput.readUTF();
		parishApplicant = objectInput.readUTF();
		mailingAddOfApplicant = objectInput.readUTF();
		emailOfApplicant = objectInput.readUTF();
		officePhone = objectInput.readUTF();
		mobilePhone = objectInput.readUTF();
		homePhone = objectInput.readUTF();
		locationOfProposedParish = objectInput.readUTF();
		locationOfProParishWork = objectInput.readUTF();
		nameOfContractor = objectInput.readUTF();
		parishContractor = objectInput.readUTF();
		addressOfContractor = objectInput.readUTF();
		sourceOfWater = objectInput.readUTF();
		purposeWaterUse = objectInput.readUTF();
		areaAndCropType = objectInput.readUTF();
		systemOfIrrigation = objectInput.readUTF();
		meansOfDisposal = objectInput.readUTF();
		estimateDepthOfBorewell = objectInput.readUTF();
		diameterOfBorewell = objectInput.readUTF();
		artesianSupply = objectInput.readUTF();
		geologicalStrait = objectInput.readUTF();
		methodOfAbstractingWater = objectInput.readUTF();
		maxDailyQuant = objectInput.readUTF();
		typeOfAppratusProposed = objectInput.readUTF();
		otherInformation = objectInput.readUTF();
		requestToSupplyWater = objectInput.readUTF();
		authorityInformation = objectInput.readUTF();
		dateOfSign = objectInput.readLong();

		wraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(abstractLicenceId);

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

		if (applicationNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicationNum);
		}

		if (nameOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfApplicant);
		}

		if (parishApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(parishApplicant);
		}

		if (mailingAddOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mailingAddOfApplicant);
		}

		if (emailOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailOfApplicant);
		}

		if (officePhone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(officePhone);
		}

		if (mobilePhone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mobilePhone);
		}

		if (homePhone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(homePhone);
		}

		if (locationOfProposedParish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(locationOfProposedParish);
		}

		if (locationOfProParishWork == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(locationOfProParishWork);
		}

		if (nameOfContractor == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfContractor);
		}

		if (parishContractor == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(parishContractor);
		}

		if (addressOfContractor == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(addressOfContractor);
		}

		if (sourceOfWater == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sourceOfWater);
		}

		if (purposeWaterUse == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(purposeWaterUse);
		}

		if (areaAndCropType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(areaAndCropType);
		}

		if (systemOfIrrigation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(systemOfIrrigation);
		}

		if (meansOfDisposal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(meansOfDisposal);
		}

		if (estimateDepthOfBorewell == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(estimateDepthOfBorewell);
		}

		if (diameterOfBorewell == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(diameterOfBorewell);
		}

		if (artesianSupply == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(artesianSupply);
		}

		if (geologicalStrait == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(geologicalStrait);
		}

		if (methodOfAbstractingWater == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(methodOfAbstractingWater);
		}

		if (maxDailyQuant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(maxDailyQuant);
		}

		if (typeOfAppratusProposed == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfAppratusProposed);
		}

		if (otherInformation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherInformation);
		}

		if (requestToSupplyWater == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(requestToSupplyWater);
		}

		if (authorityInformation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(authorityInformation);
		}

		objectOutput.writeLong(dateOfSign);

		objectOutput.writeLong(wraApplicationId);
	}

	public long abstractLicenceId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String applicationNum;
	public String nameOfApplicant;
	public String parishApplicant;
	public String mailingAddOfApplicant;
	public String emailOfApplicant;
	public String officePhone;
	public String mobilePhone;
	public String homePhone;
	public String locationOfProposedParish;
	public String locationOfProParishWork;
	public String nameOfContractor;
	public String parishContractor;
	public String addressOfContractor;
	public String sourceOfWater;
	public String purposeWaterUse;
	public String areaAndCropType;
	public String systemOfIrrigation;
	public String meansOfDisposal;
	public String estimateDepthOfBorewell;
	public String diameterOfBorewell;
	public String artesianSupply;
	public String geologicalStrait;
	public String methodOfAbstractingWater;
	public String maxDailyQuant;
	public String typeOfAppratusProposed;
	public String otherInformation;
	public String requestToSupplyWater;
	public String authorityInformation;
	public long dateOfSign;
	public long wraApplicationId;

}